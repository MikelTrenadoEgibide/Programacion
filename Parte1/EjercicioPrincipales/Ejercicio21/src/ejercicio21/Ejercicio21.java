/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nro;
        int divisor = 0;
        int resto= 0;
        
        nro = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea un número"));
        divisor = nro;
        
        do{
        divisor = divisor - 1;
        resto = nro % divisor;
        }
        while(resto !=0 && divisor > 2);
        if(resto == 0){
            JOptionPane.showMessageDialog(null,"El número tecleado NO es un número primo");
        }else{
            JOptionPane.showMessageDialog(null, "El número tecleado SI es primo");
        }
    }
    
}
