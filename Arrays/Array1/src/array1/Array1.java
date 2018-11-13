/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float [] arrayNumeros = new float [10];
        float numeroMax = 0;
        float numeroMin = 10;
        
        for(int x = 0; x < arrayNumeros.length ; x++){
            
            JOptionPane.showInputDialog("Introduce tu valor " + x);
            
        if (arrayNumeros[x] > numeroMax){
            
            numeroMax = arrayNumeros[x];
        }
        if (arrayNumeros[x] < numeroMin){
            
            numeroMin = arrayNumeros[x];
        }
        }
        JOptionPane.showMessageDialog(null, "El valor maximo es: " + numeroMax + "\n" + "El valor minimo es: " + numeroMin);
        
        
        
    }
    
}
