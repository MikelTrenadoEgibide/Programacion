/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer numero"));
        
        if (n1>n2 && n1>n3){
            JOptionPane.showMessageDialog (null,n1 + " es el más grande");
            if(n2>n3){
                JOptionPane.showMessageDialog (null,n2 + "es el más pequeño");
            }
            else{
                JOptionPane.showMessageDialog (null,n3 + " es el más pequeño");
            }
        
        }
        else if(n2>n3){
            JOptionPane.showMessageDialog(null,n2 + " es el más grande");
            if(n1>n3){
                JOptionPane.showMessageDialog(null,n1 + " es el más pequeño"); 
            }
            else{
                JOptionPane.showMessageDialog(null,n3 + " es el más pequeño");
            }   
        }
        else{
            JOptionPane.showMessageDialog(null,n3 +" es el más grade");
        }
        if(n1>n2){
            JOptionPane.showMessageDialog(null,n2 +" es el pequeño");
        }
        else{
            JOptionPane.showMessageDialog(null,n1 + "es el más pequeño");
        }
           
    }
    
}
