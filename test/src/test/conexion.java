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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daniel
 */
public class conexion {
    static Connection contacto = null;
    public static Connection getConexion(){
    String Archivo ="/home/pi/Cedula/configuracion.txt";    
    String servidor = LeerFichero.RetornaValor(Archivo,0);
    String puerto = LeerFichero.RetornaValor(Archivo,1);
    String dbname = LeerFichero.RetornaValor(Archivo,2);
    String usuario = LeerFichero.RetornaValor(Archivo,3);
    String clave = LeerFichero.RetornaValor(Archivo,4);
    String conPuerto = LeerFichero.RetornaValor(Archivo,5);
    
   // String url ="jdbc:sqlserver://192.168.0.2\\desarrollo:1433;databaseName=cab_lirquen;SelectMethod=cursor;SendStringParametersAsUnicode=false";
   String url = "";
   if (conPuerto.equals("S")){
     url ="jdbc:sqlserver://"+servidor+":"+puerto+";databaseName="+dbname+";SelectMethod=cursor;SendStringParametersAsUnicode=false";
  
   }else {
     url ="jdbc:sqlserver://"+servidor+";databaseName="+dbname+";SelectMethod=cursor;SendStringParametersAsUnicode=false";
    
   }
       
   
   try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         
        
    }catch (ClassNotFoundException e){
    
    JOptionPane.showMessageDialog(null, "Error driver","error",JOptionPane.ERROR_MESSAGE);
    }
    try{
       // contacto = DriverManager.getConnection(url,"user_mycab","sopcab09");
       contacto = DriverManager.getConnection(url,usuario,clave);
    }catch (SQLException e){
         JOptionPane.showMessageDialog(null, "Error driver","error",JOptionPane.ERROR_MESSAGE);
   
    }
        return contacto;
    }
    
    public static ResultSet Consulta(String consulta) throws SQLException{
       
        Connection con = getConexion();
        ResultSet respuesta;
        Statement declara;
        try{
            declara = con.createStatement();
             respuesta=declara.executeQuery(consulta);
              
                    }catch (SQLException e){
         JOptionPane.showMessageDialog(null, "Error Resulset","error",JOptionPane.ERROR_MESSAGE);
                return null;
    
        
        } 
        
         return respuesta;
           
        
    
    
    
    }
    public static void cierra(){
        try {
            contacto.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean query(String consulta){
        Connection con = getConexion();
        Statement declara;
        boolean resul;
        
        try{
            declara = con.createStatement();
            declara.execute(consulta);
            resul=true;
            
            
        }catch (SQLException e){
         JOptionPane.showMessageDialog(null, "Error Resulset","error",JOptionPane.ERROR_MESSAGE);
              resul=false;  
        }
        return resul;
    
    
    
    
    }


}