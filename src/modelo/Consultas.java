/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class Consultas extends Coneccion {

    public boolean registrar(Estudiante pro) {
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estudiantes", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into estudiantes values('"
                    + pro.getCedula()
                    + "','" + pro.getNombre()
                    + "','" + pro.getApellido()
                    + "','" + pro.getCiudadania()
                    + "','" + pro.getSexo()
                    + "','" + pro.getTelefono()
                    + "','" + pro.getDireccion()
                    + "','" + pro.getCorreo()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
        return false;

    }
     

    public boolean Modificar(Estudiante pro) {
       PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estudiantes", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int actualizar = sentencia.executeUpdate("UPDATE contacto SET nombres=?, apellidos=?, email=?, celular=?, direccion=?, ciudad=? "
                    + "WHERE Cedula=?"
                    + "','" + pro.getNombre()
                    + "','" + pro.getApellido()
                    + "','" + pro.getCiudadania()
                    + "','" + pro.getSexo()
                    + "','" + pro.getTelefono()
                    + "','" + pro.getDireccion()
                    + "','" + pro.getCorreo()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
        return false;

    }
    public boolean Eliminar(Estudiante pro) {
        PreparedStatement ps = null;
        Connection con = conexion();
        String sql = "DELETE FROM estudiantes WHERE Cedula=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());

            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }

        }

    
    }

    public boolean Buscar(Estudiante pro) {
       
            try {
         
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estudiantes", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("select¨*from  estudiantes where cedula=?('"
                    + pro.getCedula()
                    + "','");
            
           
              } catch (SQLException e) {
                System.err.println(e);
}
        return false;

    }
}