/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int nota;
      
      nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota"));
      if (nota >=0 && nota<=10){
          if (nota <5){
              if (nota < 4){
                  JOptionPane.showMessageDialog(null,"Deficiente");
              }
              else {
              JOptionPane.showMessageDialog(null,"Insuficiente");
              }
      }else{
          if (nota<7){
              if (nota<6){
               JOptionPane.showMessageDialog(null,"Suficiente");
              }  
              else{
               JOptionPane.showMessageDialog(null,"Bien");
              }
           }
          else if(nota<9){
               JOptionPane.showMessageDialog(null,"Notable");}
               else{
               JOptionPane.showMessageDialog(null,"sobresaliente");
           }
          
       }
          
      }
    else {
        JOptionPane.showMessageDialog(null,"Nota incorrecta");
      }
    }
    }
    
    
