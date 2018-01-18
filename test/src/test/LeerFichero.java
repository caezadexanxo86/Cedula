/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author pi
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena_con="";
        String servidor = "";
        String puerto = "";
        String dbname = "";
        String usuario = "";
        String pass = "";
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int contador = 0;
        while((cadena = b.readLine())!=null) {
          if (contador == 0) {
              servidor = cadena;
          }
          if (contador == 1) {
              puerto = cadena;
          }
          if (contador == 2) {
              dbname = cadena;
          }
          if (contador == 3) {
              usuario = cadena;
          }
      
                    
          contador = contador+1;
        }
        b.close();
        
        cadena_con= servidor+":"+puerto+";"+"databaseName="+ dbname;
                
    }
      public static String RetornaValor(String archivo,int posicion) {
  
        String cadena;
        String resultado="";
        try {
            
        
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        int contador = 0;
        while((cadena = b.readLine())!=null) {
          if (contador == posicion) {
              resultado = cadena;
          }
            
                    
          contador = contador+1;
        }
        b.close();
        }catch(Exception e){
            
        }
        return resultado;        
    }

//    public static void main(String[] args) throws IOException {
//        muestraContenido("/home/mario/archivo.txt");
//    }
   
}