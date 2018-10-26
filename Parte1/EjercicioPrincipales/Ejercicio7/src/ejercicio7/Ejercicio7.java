/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cateto1;
        double cateto2;
        double hipotenusa;
        
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer cateto"));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo cateto"));
        hipotenusa = Math.sqrt (pow(cateto1,2)+pow(cateto2,2));
        JOptionPane.showMessageDialog(null,"La hipotenusa es "+ hipotenusa);
        
    } 
    
}
