
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Impresora
{
Font fuente = new Font("Dialog", Font.PLAIN, 12);
PrintJob pj;	
Graphics pagina;


/************************************************** ******************
*	A continuación el constructor de la clase. Aquí lo único que	*
*	hago es tomar un objeto de impresion. *
************************************************** ******************/
Impresora()
{
pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "iii", null);
}

/************************************************** ******************
*	A continuación el método "imprimir(String)", el encargado de *
*	colocar en el objeto gráfico la cadena que se le pasa como *
*	parámetro y se imprime. *
************************************************** ******************/
public void imprimir(String Cadena)
{
//LO COLOCO EN UN try/catch PORQUE PUEDEN CANCELAR LA IMPRESION
try
{
pagina = pj.getGraphics();
pagina.setFont(fuente);
pagina.setColor(Color.black);

pagina.drawString(Cadena, 60, 60);

pagina.dispose();
pj.end();
}catch(Exception e)
{
System.out.println("LA IMPRESION HA SIDO CANCELADA...");
}
}//FIN DEL PROCEDIMIENTO imprimir(String...)


}//FIN DE LA CLASE Impresora



