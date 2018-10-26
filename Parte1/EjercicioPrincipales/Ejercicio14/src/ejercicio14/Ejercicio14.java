/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador;
        int suma=0;
        int numero=0;
        
        for (contador = 0;contador !=6; contador ++){
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"teclea un número"));
        suma = suma + numero;
    }
        JOptionPane.showMessageDialog(null,"Suma " + suma);
    }
}
