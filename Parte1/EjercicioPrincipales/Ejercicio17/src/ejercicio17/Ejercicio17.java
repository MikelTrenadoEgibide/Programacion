/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    static int contador= 0;
    static int maximo = -1;
    static String nombreMax ="";
    static int minimo = 11;
    static String nombreMin="";
    static int nota; 
    static String nombre;
    
   
    public static void main(String[] args) {
       
       do{
       nombre = JOptionPane.showInputDialog(null,"teclea el nombre de un alumno");
       nota =Integer.parseInt(JOptionPane.showInputDialog(null,"teclea la calificación"));
       MaxMin (nombre, nota);
       MaxMin2 (nombre, nota);
       contador = contador + 1;
       }
       while(contador < 3);
       JOptionPane.showMessageDialog(null, nombreMax + " es el alumno con la calificacion mas alta " + maximo + "\n" + nombreMin +" es el alumno con la calificación más baja " + minimo);
    }
   public static int MaxMin(String nombre, int nota){
       if (nota > maximo){
           maximo = nota;
           
       return maximo;
       
       }else if( nota < minimo){
               minimo = nota;
               
               }
        return minimo;
        
    
}
   public static String MaxMin2 (String nombre, int nota){
       if (nota > maximo){
           nombreMax = nombre;
           
       return nombreMax;
       
       }else if(nota < minimo){
           nombreMin= nombre;
           
       }return nombreMin;
    
   }
}
