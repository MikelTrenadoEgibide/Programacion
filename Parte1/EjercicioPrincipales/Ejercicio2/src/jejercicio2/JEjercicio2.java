/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class JEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int multiplicacion;
        
        String numeroUnos = javax.swing.JOptionPane.showInputDialog ("Introduce primer numero");
        numeroUno = Integer.parseInt (numeroUnos);
        String numeroDoss = javax.swing.JOptionPane.showInputDialog ("Introduce segundo numero");
        numeroDos = Integer.parseInt (numeroDoss);
        multiplicacion = numeroUno * numeroDos;
        JOptionPane.showMessageDialog(null, multiplicacion);
        
        
        
        
    }
    
}