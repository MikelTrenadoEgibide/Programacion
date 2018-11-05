/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int resultado = 0;
       int horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el numero de horas trabajadas"));
       String estado = JOptionPane.showInputDialog(null,"Introduce el estado civil");
       String estudios = JOptionPane.showInputDialog(null,"Introduce el nivel de estudios");
       
       if(horas <= 40){
        resultado = horas * 10; 
    }else{
        resultado = (horas - 40)* 15 + 400;
       }
       
       
    }
    
}
