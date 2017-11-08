/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
//PASO 1 - IMPORTAR
import javax.swing.*;//Libreria grafica estandar multiplataforma
import  java.awt.*;//Libreria del Grafica del Sistema Operat
//PASO-8 IMPORTAR LA clase
 *
 * @author LAB08
 */
public class Graficas {

    /**
     * @param args the command line arguments
     *//LLAMADO A LA CLASE
    public static void main(String[] args) 
            {
        // TODO code application logic here
    
    JFrame miventana= new miventana();//Creamos objeto tipoJFrame
    miventana.setVisible(true);//Esta sentencia muesra la ventana
    miventana.setBounds(0,0,400,400);//Le asignamos tamaño a la ventana
    miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
