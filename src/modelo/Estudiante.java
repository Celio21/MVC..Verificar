/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ISTLOJA_05
 */
public class Estudiante {
    private int id;
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Ciudadania;
     private String sexo;
      private String Telefono;
 private String Direccion;
 private String Correo;

    public Estudiante() {
    }

    public Estudiante(int id, String Cedula, String Nombre, String Apellido, String Ciudadania, String sexo, String Telefono, String Direccion, String Correo) {
        this.id = id;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Ciudadania = Ciudadania;
        this.sexo = sexo;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Correo = Correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCiudadania() {
        return Ciudadania;
    }

    public void setCiudadania(String Ciudadania) {
        this.Ciudadania = Ciudadania;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Ciudadania=" + Ciudadania + ", sexo=" + sexo + ", Telefono=" + Telefono + ", Direccion=" + Direccion + ", Correo=" + Correo + '}';
    }
 
}


  