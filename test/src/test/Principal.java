/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.image.MemoryImageSource;
/**
 *
 * @author pi
 */
   import java.awt.Color;
  
public class Principal extends javax.swing.JFrame {
public static final Color VERDE_OSCURO = new Color(0,153,0);
String hour ="" ;
String date = "";
String nombre ="";
String apellido = "";
String rut="";
String movimiento ="Entrada";
String ip = "192.168.0.2";        
String empresa = "Puerto Lirquen S.A";
String rutempresa = "96959030-1";
String id = "";
String reloj ="1";
java.util.Calendar calendario; 
int dia, mes, año, hora, minutos, segundos; 
private javax.swing.JLabel label;   
    public Principal() {
        initComponents();
        reloj();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalida = new javax.swing.JToggleButton();
        btnEntrada = new javax.swing.JToggleButton();
        btnColacion = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbleventosel = new javax.swing.JLabel();
        labelreloj = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Cerrarjtext = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 102, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                open(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalida.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSalida.setLabel("SALIDA");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 314, 320, 66));

        btnEntrada.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnEntrada.setLabel("ENTRADA");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 314, 320, 66));

        btnColacion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnColacion.setLabel("COLACION");
        btnColacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnColacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 413, 320, 66));

        jTextField1.setUI(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 420, 244, 51));

        jButton1.setLabel("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1312, 837, -1, 32));

        lbleventosel.setText("Evento");
        getContentPane().add(lbleventosel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 629, -1, -1));

        labelreloj.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 80)); // NOI18N
        labelreloj.setText("Reloj");
        getContentPane().add(labelreloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 12, 481, 280));

        lblMensaje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 728, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 497, 690, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 650, -1, -1));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 60));

        jButton3.setLabel("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Cerrarjtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 130, -1));

        jButton4.setLabel("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 260, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        // TODO add your handling code here:
       btnColacion.setSelected(false);
       btnSalida.setSelected(false);
       
       lbleventosel.setText("0");
       jTextField2.setText("");
       jTextField2.requestFocus();
        
        try{
            conexion.getConexion();
        }catch(Exception e){
            
        }finally{
            conexion.cierra();
        }
        
    
    }//GEN-LAST:event_btnEntradaActionPerformed
       String rutaux="";
       
       
    public static boolean validarRut(String rut) {
 
boolean validacion = false;
try {
rut =  rut.toUpperCase();
rut = rut.replace(".", "");
rut = rut.replace("-", "");
int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
 
char dv = rut.charAt(rut.length() - 1);
 
int m = 0, s = 1;
for (; rutAux != 0; rutAux /= 10) {
s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
}
if (dv == (char) (s != 0 ? s + 47 : 75)) {
validacion = true;
}
 
} catch (java.lang.NumberFormatException e) {
} catch (Exception e) {
}
return validacion;
}   
       
       
       
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
setDefaultCloseOperation(Principal.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnColacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColacionActionPerformed
       btnEntrada.setSelected(false);
       btnSalida.setSelected(false);
       lbleventosel.setText("5");
          jTextField2.setText("");
       
        jTextField2.requestFocus();

               // TODO add your handling code here:
    }//GEN-LAST:event_btnColacionActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
    btnEntrada.setSelected(false);
       btnColacion.setSelected(false);
       lbleventosel.setText("1");
          jTextField2.setText("");
       
            jTextField2.requestFocus();
        
       // TODO add your handling code here:
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void open(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_open
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        btnSalida.setSelected(true);
        jTextField2.requestFocus();
        lbleventosel.setText("1");
        jButton2.setVisible(false);
        
        try {
        conexion.getConexion();
            jLabel1.setText("Seleccione evento y acerque cédula de identidad");
        }catch(Exception e){
            jLabel1.setText("Error de Conexion");
        }
        
    }//GEN-LAST:event_open

                      

    
    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter

                if(evt.getKeyCode()==KeyEvent.VK_SPACE){
                   rutaux = jTextField1.getText();
              //      rutaux = rutaux.replace("'","");
                //    rutaux = rutaux.replace("/","");
                   // jLabel1.setText(rutaux);
                   
                   jLabel1.setText(jTextField1.getText());
                   
                   
                }
                
                        
                        
                        
                        

//        char e;

//
//        jTextField1.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,java.util.Collections.EMPTY_SET);
//
//        char letra;
//        letra = evt.getKeyChar();
//        letra = Character.toUpperCase(letra);
//        if (Character.isLetter(letra) && letra!='K') {
//            evt.consume();
//
//        }
//
//        if (validarRut(rutaux) && evt.getKeyCode()!=KeyEvent.VK_ENTER && rutaux.length()>5 ){
//            evt.consume();
//        }else{
//            if (Character.isDigit(letra)) {
//                rutaux=rutaux + evt.getKeyChar();
//                //  mensaje.setText(rutaux);
//
//            }
//
//        }
//
////        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
////            evt.consume();
////
////        }
//
//        if(evt.getKeyCode()==KeyEvent.VK_ENTER && validarRut(rutaux)){
//            // JOptionPane.showMessageDialog(null, "Retorno de carro");
//
//            jTextField1.setText(rutaux);
//            jLabel1.setText("Validando rut:" + rutaux);  
//            recupera_datos(rutaux);
//            jTextField1.setText("");
//            jTextField2.requestFocus();
//
//        }
//        //         if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
//            //                  JOptionPane.showMessageDialog(null, "enter","error",JOptionPane.INFORMATION_MESSAGE);
//
//            //                   recupera_datos();
//            //                 }

    }//GEN-LAST:event_Enter

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(Cerrarjtext.getText().equals("puerto2018")){
        System.exit(0);    
        }{
        Cerrarjtext.setText("");
        jPanel1.setVisible(false);
        }
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
                ResultSet respuesta;
        try{
       
        respuesta=conexion.Consulta("select db_rut,db_id,db_nombre,db_apellido from empleado where db_rut='161545864'");
        while(respuesta.next()){ 
    apellido  =respuesta.getString("db_apellido");
    jLabel1.setText(apellido);

//JOptionPane.showMessageDialog(null,apellido);

 }
     }catch(Exception e){
//     JOptionPane.showMessageDialog(null,e.getMessage());
         jLabel1.setText(e.getMessage());

     }

        
  }
    
 
    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           
            
            
            rutaux = jTextField2.getText();
            rutaux = rutaux.trim();
            
            if (rutaux.equals("7777777777")){
            imprimir imp = new imprimir();
            imp.impresion("TEST", "777777-7","SALIDA", "NORTE", "01-01-1800", empresa, rut, hour);
            }else {
            rutaux = rutaux.replace("'", "");
            rutaux = rutaux.replace("/", "");
           
            jLabel1.setText(rutaux);
            recupera_datos(rutaux);
                
            }
                     
            jTextField2.setText("");
            jTextField2.requestFocus();
            
        }
    }  
 private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
    }      
    
    public void recupera_datos(String rut2){
                ResultSet respuesta;
                String fecha1 = "";
                String fecha2 = "";
               String hora1 ="";
                String hash1= "";
                String hash2="";
                int contador = 0;
                String Mov2 = "";
                String consulta = "";
        try{
       
            consulta = "select db_rut,db_id,rtrim(db_nombre) as db_nombre ,rtrim(db_apellido) as db_apellido from empleado where db_rut like '%" +rut2+ "%'";
//         JOptionPane.showMessageDialog(null, consulta,"error",JOptionPane.ERROR_MESSAGE);
   
            rutaux = "";
            respuesta=conexion.Consulta("select db_rut,db_id,rtrim(db_nombre) as db_nombre ,rtrim(db_apellido) as db_apellido from empleado where db_rut like '%" +rut2+ "%'");
        
while(respuesta.next()){ 
            

apellido  =respuesta.getString("db_apellido");
nombre =  respuesta.getString("db_nombre") + " " + apellido ;
rut=respuesta.getString("db_rut"); 
id= respuesta.getString("db_id");
movimiento =lbleventosel.getText();

if (movimiento.equals("0")){
    Mov2 = "Entrada";
}
if (movimiento.equals("1")){
    Mov2 = "Salida";
}
if (movimiento.equals("5")){
    Mov2 = "Colacion";
}


hash1= ip + movimiento + date + hour;
hash2 = hash.getHash(hash1,"MD5");
 fecha1 = String.format("%02d%02d%02d", año,mes,dia);
 fecha2 = String.format("%02d/%02d/%02d", dia,mes,año);

 hora1 = String.format("%02d:%02d:%02d", hora, minutos, segundos); 

//JOptionPane.showMessageDialog(null,fecha1);
contador = contador +1;
}       
String insert = "Insert into marcasnew(Codigo,FechaMarca,HoraMarca,ES,Reloj,IpReloj,db_hash) values("+"'"+id+"','"+fecha1+"','"+hora1+"',"+movimiento+",'"+reloj+"','"+ip+"','"+hash2+"')";
//jTextArea1.setText(insert);

  
if (contador>0){
    

    if (conexion.query(insert)){
 // JOptionPane.showMessageDialog(null,"Registroc correcto");
//    try{
         jLabel1.setText("Imprimiendo Ticket");
        imprimir imp = new imprimir();
        imp.impresion(nombre,rut,Mov2,fecha2,hora1,empresa,rutempresa,hash2);
      
//                
//    }catch(Exception e){
//        jLabel1.setText(e.getMessage().toString());
//    }
//        
      jTextField1.setText("");

     jLabel1.setForeground(VERDE_OSCURO);
      jLabel1.setText(rut2 + " Registro Exitoso");
      
      jTextField2.requestFocus();
      
    // impresion(String nombre,String rut,String movimiento,String fecha,String hora,String Empresa,String RutE,String hash)  {
   

    } 
   
} else {
    jLabel1.setForeground(Color.RED);
    jLabel1.setText(rut2+ " No esta Registrado");
        
    }   
//    lbleventosel.setText(Integer.toString(contador));
    

//JOptionPane.showMessageDialog(null, "Nombre:"+ nombre + " Apellido:" + apellido + "<br> Rut:"+rut+"<br>id:"+id+" <br>fecha:"+date+" Hora:"+hou            
              
      
     
        
      
        }catch(Exception e){
        jLabel1.setText("ERROR");       
        }
        
    }
    private void reloj() { 
calendario = new java.util.GregorianCalendar(); 
segundos = calendario.get(Calendar.SECOND); 
javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() { 
@ Override 
public void actionPerformed(java.awt.event.ActionEvent ae) { 
java.util.Date actual = new java.util.Date(); 
calendario.setTime(actual); 
dia = calendario.get(Calendar.DAY_OF_MONTH); 
mes = (calendario.get(Calendar.MONTH) + 1); 
año = calendario.get(Calendar.YEAR); 
hora = calendario.get(Calendar.HOUR_OF_DAY); 
minutos = calendario.get(Calendar.MINUTE); 
segundos = calendario.get(Calendar.SECOND); 
 hour = String.format("%02d : %02d : %02d", hora, minutos, segundos); 
 date = String.format("%02d / %02d / %02d", dia, mes, año); 
labelreloj.setText("<html><center>" + hour + "<br><h1>" + date+"</h1>"); 
   } 
}); 
timer.start(); 
}
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       
                new Principal().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cerrarjtext;
    private javax.swing.JToggleButton btnColacion;
    private javax.swing.JToggleButton btnEntrada;
    private javax.swing.JToggleButton btnSalida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelreloj;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lbleventosel;
    // End of variables declaration//GEN-END:variables
}
