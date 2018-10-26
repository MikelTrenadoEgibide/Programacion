/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int ultimoNro;
        int nro;
        int divisor;
        int resto;
        
        ultimoNro =Integer.parseInt(JOptionPane.showInputDialog(null,"teclea un numero"));
        nro = 1;
        do{
            if( nro < 4){
                JOptionPane.showMessageDialog(null,nro + " Si es un numero primo");
            }else{
                divisor = nro;
                do{
                    divisor = divisor - 1;
                    resto = nro % divisor;
                }while(resto !=0 && divisor > 2);
            if(resto == 0){
                JOptionPane.showMessageDialog(null, nro + " No es un numero primo");
            }else{
                JOptionPane.showMessageDialog(null,nro + " Si es un numero primo");
            }
         
            }nro = nro + 1;
        }while(nro <= ultimoNro);
        }
    }
    

