/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.pkg1;

import static java.lang.Math.PI;
import javax.swing.JOptionPane;
import newpackage.circunferencia;

/**
 *
 * @author 1gdaw09
 */
public class Tema61 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int respuesta = Integer.parseInt(JOptionPane.showInputDialog("Introduce la operación a realizar: " + "\n" + "1- Calcular la longitud de una circunferencia " + "\n" + "2- Calcular el área de una circuferencia " + "\n" + "3- Calcular el volumen de una esfera "));
   
        if (respuesta == 1){
            
            circunferencia c1 = new circunferencia ();
            int circunferencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio de la circunferencia: "));
            
            JOptionPane.showMessageDialog(null, "La longitud de la circunferencia es de: " + (2 * PI * circunferencia));
        }
    }
    
}
