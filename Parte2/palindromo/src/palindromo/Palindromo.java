/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Introduce tu frase");
        int inicio = 0;
        int fin = frase.length()-1; 
        boolean error = false;
        
        while (inicio<=fin){
if(frase.charAt(inicio)==frase.charAt(fin)){
error=true;
}
else{
error=false;
}
inicio++;
fin = fin - 1;
}
if(error){
JOptionPane.showMessageDialog(null,"El texto es un palíndromo");
}
else{
JOptionPane.showMessageDialog(null,"El texto NO es un palíndromo");
}
    }
}
