/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 *
 * @author daniel
 */
public class conexion {
    static Connection contacto = null;
    public static Connection getConexion(){
        
    
    String url ="jdbc:sqlserver://192.168.0.2\\desarrollo:1433;databaseName=cab_lirquen";
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         
        
    }catch (ClassNotFoundException e){
    
    JOptionPane.showMessageDialog(null, "Error driver","error",JOptionPane.ERROR_MESSAGE);
    }
    try{
        contacto = DriverManager.getConnection(url,"user_mycab","sopcab09");
    }catch (SQLException e){
         JOptionPane.showMessageDialog(null, "Error driver","error",JOptionPane.ERROR_MESSAGE);
   
    }
        return contacto;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta= declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
         JOptionPane.showMessageDialog(null, "Error Resulset","error",JOptionPane.ERROR_MESSAGE);
   
        }
        return null;
    
    
    
    
    }
    
    public static boolean query(String consulta){
        Connection con = getConexion();
        Statement declara;
        boolean resul;
        
        try{
            declara = con.createStatement();
            resul=declara.execute(consulta);
            
        }catch (SQLException e){
         JOptionPane.showMessageDialog(null, "Error Resulset","error",JOptionPane.ERROR_MESSAGE);
              resul=false;  
        }
        return resul;
    
    
    
    
    }


}