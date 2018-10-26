/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Indica el día de la semana en número"));
        switch (dia){
            case 1:
                JOptionPane.showMessageDialog(null,"Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Miércoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Sábado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error");
                break;
        }
    }
    
}
