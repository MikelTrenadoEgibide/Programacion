/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double altura = 0;
            double base = 0;
            double multiplicacion;
    altura = Double.parseDouble(JOptionPane.showInputDialog("Teclea la altura"));
    base = Double.parseDouble (JOptionPane.showInputDialog("Teclea la base"));
    multiplicacion = altura * base;
    JOptionPane.showMessageDialog (null,multiplicacion);
    }
    
}
