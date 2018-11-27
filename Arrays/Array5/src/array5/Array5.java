/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Array5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] arrayDinero = new double [14];
        
        arrayDinero [0] = 200;
        arrayDinero [1] = 100;
        arrayDinero [2] = 50;
        arrayDinero [3] = 20;
        arrayDinero [4] = 10;
        arrayDinero [5] = 5;
        arrayDinero [6] = 2;
        arrayDinero [7] = 1;
        arrayDinero [8] = 0.50;
        arrayDinero [9] = 0.20;
        arrayDinero [10] = 0.10;
        arrayDinero [11] = 0.05;
        arrayDinero [12] = 0.02;
        arrayDinero [13] = 0.01;
        
        double importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a pagar"));
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de pago"));
        
        double vuelta = pago - importe;
        
        JOptionPane.showMessageDialog(null,"La cantidad a devolver es de: " + vuelta);
        
        for(int x = 0 ; 0 < arrayDinero[x] ; x++){
            do{ vuelta = vuelta-arrayDinero[x];
                JOptionPane.showMessageDialog(null,"El dinero devuelto es: " + vuelta);
            }
            while(vuelta > arrayDinero[x]);
                
            
        }
        
        
    }
    
}
