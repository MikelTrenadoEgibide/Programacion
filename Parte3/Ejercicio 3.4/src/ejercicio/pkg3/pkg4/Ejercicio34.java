/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */

public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
         String nombre;
         int notaT = 0;
         int contadorAlum = 0;
         int notaFinal = 0;
        
        
         
         do{ 
            nombre = JOptionPane.showInputDialog("Introduce el nombre del alumno");
            for(int x = 0; x < 6; x ++){
                int nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota"));
                notaT += nota; 
            }
            JOptionPane.showMessageDialog(null,"La nota media de " + nombre + " es de " + notaT/6);
            contadorAlum ++;
            notaFinal = notaT + notaT;
        }
        while(nombre.equalsIgnoreCase("FIN"));
        if(nombre == "FIN"){
            JOptionPane.showMessageDialog(null,"La nota total de la clase es de: " + notaFinal/contadorAlum);
         
        }
    }
    
}
