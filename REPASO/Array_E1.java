/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_e1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Array_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int[] ArrayNumeros = new int[10];
    
    
    for(int i = 0; i < ArrayNumeros.length; i++){
       ArrayNumeros[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce los numeros del Array")); 
    }
    
           
   int respuesta;
    
    do{
        
    respuesta = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la Opción a realizar" + "\n" + "1-Mostrar el contenido de las posiciones" + "\n" + "2-Mostrar el contenido de una posición concreta" + "\n" + "3- Modificar el contenido de una posición concreta" + "\n" + "4- Vaciar el contenido de una posición concreta" + "\n" + "5- Calcular la suma y la media de todos los números" + "\n" + "6- Ordenar los números de mayor a menor" + "\n" + "7- Salir del ejercicio"));
    
    switch(respuesta){
        
        case 1:
            
                String cadena = "";
                for(int i = 0; i < ArrayNumeros.length; i++) {

                        cadena += "Posicion" + " " + i + " " + "Contenido" + ArrayNumeros[i] + "\n";
                }
                
                JOptionPane.showMessageDialog(null,cadena);


                           //System.out.println(ArrayNumeros[i]);


        break;
        case 2:

                int buscar = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la posición que quires mostrar"));

                JOptionPane.showMessageDialog(null,"El numero de la posición" + buscar + " es" + ArrayNumeros[buscar - 1]);

        break;
        case 3:

                int modificar = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la posición que quieres modificar"));
                int modificacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique el numero por el que lo quieres sustituir"));

        break;
        case 4:
                
                int borrar = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la posición que deseas borrar"));
                
                ArrayNumeros[borrar -1] = 0;
            
            
        break;
        case 5:
                int suma = 0;

                for(int i = 0; i < ArrayNumeros.length; i++){
                    suma = suma + ArrayNumeros[i];
                }

                int media = suma /10;

                JOptionPane.showMessageDialog(null,"La suma de todos los numeros es de " + suma + "\n" + "La media de todos los numeros es de " + media);

        break;
        case 6:
                
                Arrays.sort(ArrayNumeros);
                
                String cadena1 = "";
                for(int i = ArrayNumeros.length -1; i >=0; i--) {

                        cadena1 += "Posicion" + " " + i + " " + "Contenido" + ArrayNumeros[i] + "\n";
                }
                
                JOptionPane.showMessageDialog(null,cadena1);
                
                
        break;
        
        case 7:  
        break;
    }
    }
    while(respuesta != 7);{
        System.exit(0);
    };
    }
    
}
