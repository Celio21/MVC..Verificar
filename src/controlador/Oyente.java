/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Consultas;
import modelo.Estudiante;
import vista.vista;

/**
 *
 * @author USUARIO
 */
public class Oyente implements ActionListener {

    private Consultas cons;
    private vista v;
    private Estudiante es;

    public Oyente(vista v, Estudiante es, Consultas cons) {
        this.cons = cons;
        this.v = v;
        this.es = es;
        this.v.BAgregar.addActionListener(this);
        this.v.BEliminar.addActionListener(this);
        this.v.Bverificar.addActionListener(this);
        this.v.BSalir.addActionListener(this);

    }

    public void Iniciar() {
        v.setTitle("Ventana Profe Mario");
        v.setLocationRelativeTo(null);
        v.txtId.setVisible(false);
        Inhabilitar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == v.BAgregar) {
            es.setCedula(v.TextCedula.getText());
            es.setNombre(v.TxtNombre.getText());
            es.setApellido(v.txtApellido.getText());
            es.setCiudadania(v.txtCiudadania.getText());
            es.setSexo(v.txtSexo.getText());
            es.setTelefono(v.txtTelefono.getText());
            es.setCorreo(v.txtCorreo.getText());

            if (cons.registrar(es)) {
                JOptionPane.showConfirmDialog(null, "Estudiante Agregado");
                limpiar();
            } else {
                JOptionPane.showConfirmDialog(null, "Algo anda mal");
                limpiar();
            }

        }

        if (e.getSource() == v.Bmodificar) {
            es.setId(Integer.parseInt(v.txtId.getText()));
            es.setCedula(v.TextCedula.getText());
            es.setNombre(v.TxtNombre.getText());
            es.setApellido(v.txtApellido.getText());
            es.setCiudadania(v.txtCiudadania.getText());
            es.setSexo(v.txtSexo.getText());
            es.setTelefono(v.txtTelefono.getText());
            es.setCorreo(v.txtCorreo.getText());

            if (cons.Modificar(es)) {
                JOptionPane.showConfirmDialog(null, "Estudiante Cambiado");
                limpiar();
            } else {
                JOptionPane.showConfirmDialog(null, "Algo anda mal");
                limpiar();
            }

        }
        if (e.getSource() == v.BEliminar) {
            es.setCedula(v.TextCedula.getText());

            if (cons.Eliminar(es)) {
                JOptionPane.showConfirmDialog(null, "Estudiante Eliminado");
                limpiar();
            } else {
                JOptionPane.showConfirmDialog(null, "Algo anda mal");
                limpiar();
            }

        }
        Inhabilitar();
        if (e.getSource() == v.Bverificar) {
            Inhabilitar();
            es.setCedula(v.TextCedula.getText());

            if (cons.Buscar(es)) {

                v.TextCedula.setText(String.valueOf(es.getCedula()));
                v.TxtNombre.setText(String.valueOf(es.getNombre()));
                v.txtApellido.setText(String.valueOf(es.getApellido()));
                v.txtCiudadania.setText(String.valueOf(es.getCiudadania()));
                v.txtSexo.setText(String.valueOf(es.getSexo()));
                v.txtTelefono.setText(String.valueOf(es.getTelefono()));
                v.txtDireccion.setText(String.valueOf(es.getDireccion()));
                v.txtCorreo.setText(String.valueOf(es.getCorreo()));

            } else {
                JOptionPane.showConfirmDialog(null, "No hay nada");
                limpiar();
                Habilitar();
            }

        }
    }

    public void limpiar() {
        v.txtId.setText(null);
        v.TextCedula.setText(null);
        v.TxtNombre.setText(null);
        v.txtApellido.setText(null);
        v.txtCiudadania.setText(null);
        v.txtSexo.setText(null);
        v.txtTelefono.setText(null);
        v.txtDireccion.setText(null);
        v.txtCorreo.setText(null);
    }

    public void Inhabilitar() {
        v.txtId.setEnabled(false);

        v.TxtNombre.setEnabled(false);
        v.txtApellido.setEnabled(false);
        v.txtCiudadania.setEnabled(false);
        v.txtSexo.setEnabled(false);
        v.txtTelefono.setEnabled(false);
        v.txtDireccion.setEnabled(false);
        v.txtCorreo.setEnabled(false);
        v.BAgregar.setEnabled(false);
        v.BEliminar.setEnabled(false);
        v.Bmodificar.setEnabled(false);

    }

    public void Habilitar() {
        v.txtId.setEnabled(true);

        v.TxtNombre.setEnabled(true);
        v.txtApellido.setEnabled(true);
        v.txtCiudadania.setEnabled(true);
        v.txtSexo.setEnabled(true);
        v.txtTelefono.setEnabled(true);
        v.txtDireccion.setEnabled(true);
        v.txtCorreo.setEnabled(true);
        v.BAgregar.setEnabled(true);
        v.BEliminar.setEnabled(true);
        v.Bmodificar.setEnabled(true);
    }
}
