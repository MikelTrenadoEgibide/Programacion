/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        int nroGenerado = (int) (Math.random()*100);
        int nro;
        
        nro = Integer.parseInt(JOptionPane.showInputDialog(null,"Teclea un numero"));
        do{
        if(nro != nroGenerado){
            if(nro<nroGenerado){
            nro=Integer.parseInt(JOptionPane.showInputDialog(null,"Inténtalo con un númeor más grande"));
            }else{
                nro=Integer.parseInt(JOptionPane.showInputDialog(null,"Inténtalo con un número más pequeño"));
                } 
        }else{
            JOptionPane.showMessageDialog(null,"Enhorabuena");
            nro=101 ;
        }
           
        }while(nro!=101);
    }
    
}
