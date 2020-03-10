/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import controlador.Oyente;
import modelo.Consultas;
import modelo.Estudiante;
import vista.vista;

/**
 *
 * @author USUARIO
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante es = new Estudiante();
        Consultas cons = new Consultas();
        vista v= new vista();
        Oyente ofe = new Oyente(v, es, cons);
        ofe.Iniciar();
        v.setVisible(true);
    }
    
}
