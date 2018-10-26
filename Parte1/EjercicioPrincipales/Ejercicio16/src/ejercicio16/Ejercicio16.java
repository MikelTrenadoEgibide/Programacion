/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador= 0;
        int sumaEdades = 0;
        int edad;
        String respuesta;
        
        do{
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,"teclea una edad"));
            contador = contador + 1;
            sumaEdades= sumaEdades + edad;
            respuesta = JOptionPane.showInputDialog(null,"¿Quieres continuar?");
        }
        while(respuesta.equalsIgnoreCase("si"));  
        
        JOptionPane.showMessageDialog(null, sumaEdades / contador);
    
        }
}

