/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador= 0;
        int nroImpar= 1;
        int resultado= 0;
        int nro;
        
        nro = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea el numero"));
        while (contador<nro){
            resultado = resultado +nroImpar;
            nroImpar = nroImpar + 2;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
    
}
