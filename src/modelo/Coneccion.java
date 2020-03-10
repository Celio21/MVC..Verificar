/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author USUARIO
 */
public class Coneccion {
   // Aqui solo va la coneccion 
//"com.mysql.jdbc.Driver";

    java.sql.Connection cn = null;
    java.sql.Connection conectar = null;

    public java.sql.Connection conexion() {
 try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estudiantes", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
           
                 
            

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }
        return null;

    }

   
}


   
    

