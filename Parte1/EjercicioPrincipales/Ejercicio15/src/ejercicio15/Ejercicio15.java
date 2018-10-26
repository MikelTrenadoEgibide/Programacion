/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        double nota;
        String respuesta="";
       do{ 
        nota=Double.parseDouble(JOptionPane.showInputDialog(null,"teclea una nota"));
        if (nota >=6){
            contador = contador + 1;
           respuesta = (JOptionPane.showInputDialog(null,"¿Quieres continuar?"));
        }
       }
       while(respuesta.equalsIgnoreCase("si"));        
   
       JOptionPane.showMessageDialog(null,"el numero de aprobados " + contador);
       
    }
}
       
