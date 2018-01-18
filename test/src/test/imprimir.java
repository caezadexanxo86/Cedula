/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class imprimir {
    private void Dibuja_Linea(PrintWriter ps) {
        try {
            ps.println("----------------------------------------");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
//para cortar el papel de mi ticketera
 private void cortar(PrintWriter ps) {
        try {
            char[] ESC_CUT_PAPER = new char[]{0x1B, 'm'};
            ps.write(ESC_CUT_PAPER);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    private void correr(int fin, PrintWriter pw) {
        try {
            int i = 0;
            for (i = 1; i <= fin; i++) {
                pw.println("");
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
    private void setFormato(double formato, PrintWriter pw) {
        try {
            char[] ESC_CUT_PAPER = new char[]{0x1B, '!', (char) formato};
            pw.write(ESC_CUT_PAPER);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
// para el color de mi ticketera
private void setRojo(PrintWriter pw) {
        try {
            char[] ESC_CUT_PAPER = new char[]{0x1B, 'r', 1};
            pw.write(ESC_CUT_PAPER);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
private void setNegro(PrintWriter pw) {
        try {
            char[] ESC_CUT_PAPER = new char[]{0x1B, 'r', 0};
            pw.write(ESC_CUT_PAPER);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

public  void impresion(String nombre,String rut,String movimiento,String fecha,String hora,String Empresa,String RutE,String hash)  {

    try {
        
    
FileWriter file = new FileWriter("/dev/usb/lp0");
                BufferedWriter buffer = new BufferedWriter(file);
                PrintWriter ps = new PrintWriter(buffer);
                setFormato(5, ps);
                ps.println("Nombre:" +nombre );
                ps.println("Rut:"+ rut );
                ps.println("Movimiento:"+ movimiento);
                ps.println("Fecha:"+fecha);
                ps.println("Hora:"+hora);
                ps.println("Empresa:"+Empresa);
                ps.println("Rut Emp:"+RutE);
                ps.println("Hash:"+hash);
                
                
                
                            correr(10, ps);
                cortar(ps);
                ps.close();
                
                } catch (IOException e) {
System.out.println(e);
}    
  

    } 
  }
 
    

