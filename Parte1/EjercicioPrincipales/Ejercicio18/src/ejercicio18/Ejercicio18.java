/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1= 1;
        int n2= 1;
        int n3= 0;
        int contador= 2;
        int nroFinal;
        String serie = n1+ " " + n2 + " ";
        
        nroFinal= Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuantos numeros de la serie de fibonacci quieres?"));
        while (contador<nroFinal){
            n3 = n1 + n2;
            contador= contador + 1;
            serie= serie + n3+ " ";
            n1 = n2;
            n2 = n3;
        }
        JOptionPane.showMessageDialog(null,serie);
    }
    
}
