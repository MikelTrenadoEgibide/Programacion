/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg1;

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
        
        int contador = 0;
        String mensaje;
        
        mensaje = JOptionPane.showInputDialog("Introduce tu mensaje");
        
        for( int letra = 0 ; letra < mensaje.length() ; letra ++){
            if( (mensaje.charAt(letra) == 'u') || (mensaje.charAt(letra) == 'a') || (mensaje.charAt(letra) == 'e') || (mensaje.charAt(letra) == 'i') || (mensaje.charAt(letra) == 'o')){
            contador ++;
            }
        } 
            JOptionPane.showMessageDialog (null,"la frase que has introducido teine " + contador + " vocales");
            
        }
    }
    

