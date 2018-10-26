/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double diagonal ;
        double diagonal2 ;
        double multiplicacion;
        
        diagonal = Double.parseDouble (JOptionPane.showInputDialog("teclea la primera diagonal"));
        diagonal2 = Double.parseDouble (JOptionPane.showInputDialog("teclea la segunda diagonal"));
        multiplicacion = diagonal * diagonal2 / 2;
        JOptionPane.showMessageDialog (null,"El área es " + multiplicacion);
    }
    
}

