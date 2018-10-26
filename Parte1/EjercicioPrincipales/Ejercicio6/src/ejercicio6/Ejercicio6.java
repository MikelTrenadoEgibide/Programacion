/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import static java.lang.Math.PI;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio;
        double area;
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
        area = PI * radio * radio;
        JOptionPane.showMessageDialog(null,"El área de la circunferencia es " + area);
    }
    
}
