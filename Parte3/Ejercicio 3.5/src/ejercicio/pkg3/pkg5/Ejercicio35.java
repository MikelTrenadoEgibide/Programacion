/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nroGen = (int) (Math.random()*100-999);
        int contadorMuertos = 0;
        String numero;
        String numeroG;
        numeroG = String.valueOf(nroGen);
        
        do{
            int nroT = Integer.parseInt(JOptionPane.showInputDialog("Teclea tu numero de 3 cifras"));
            numero = String.valueOf(nroT);
            
            if(nroGen == nroT){
                JOptionPane.showMessageDialog(null,"Todos muertos");
                contadorMuertos = 3;
            }
            else{
                if (numero.charAt(0) == numeroG.charAt(0)){
                    contadorMuertos ++;    
                }
                if (numero.charAt(1) == numeroG.charAt(1)){
                    contadorMuertos ++;
                }
                if (numero.charAt(2) == numeroG.charAt(2)){
                    contadorMuertos ++;
                }
                
            }
            
        }
        while(contadorMuertos == 3);
        
        
    }
    
}
