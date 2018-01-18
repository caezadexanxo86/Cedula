/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.JFrame;
/**
 *
 * @author pi
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
   
        
  
   try {
          UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
//aluminium.AluminiumLookAndFeel  //hifi.HiFiLookAndFeel //noire.NoireLookAndFeel  //acryl.AcrylLookAndFeel //graphite.GraphiteLookAndFeel  //texture.TextureLookAndFeel //luna.LunaLookAndFeel //smart.SmartLookAndFeel //mint.MintLookAndFeel //mcwin.McWinLookAndFeel
          Principal v= new Principal();
    //        ventana v = new ventana();
           v.setLayout(null);
           
         
v.setExtendedState(6);
v.setCursor(v.getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));

v.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
v.setResizable(false);
v.setVisible(true);
   
   } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
           JOptionPane.showMessageDialog(null, "No Entra"); 
        }
//
//reloj r = new reloj();
//r.setVisible(true);
                
    }
    
}
