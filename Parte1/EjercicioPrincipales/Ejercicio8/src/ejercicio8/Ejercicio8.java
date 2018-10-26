/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Introcude la nota"));
        if (nota <= 10 && nota >= 0){
            if (nota < 5) {
                    JOptionPane.showMessageDialog(null, "Suspendido");
                } else 
                    JOptionPane.showMessageDialog(null, "Aprobado");               
        } else
        JOptionPane.showMessageDialog(null,"La nota introducida no es correcta");
        
    }

}
