/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    private static int opcion;
    
    
    public static void main(String[] args) {
        ArrayList <Float> primer = new ArrayList();
        int respuesta;
        
        do{
           float valor = Float.parseFloat(JOptionPane.showInputDialog("Introduce tu valor: "));
           primer.add(valor);
           respuesta = JOptionPane.showConfirmDialog(null,"Quieres continuar?");
           if (respuesta == 2){
               System.exit(0);
           }
        }
        while(respuesta == 0);
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Que deseas realizar? : " + "\n" + "1- Visualizar el máximo y el mínimo" + "\n"+ "2- Solidcitar un número y buscarlo" + "\n" + "3- Solicitar un numero, buscarlo y eliminarlo" + "\n" + "4- Convertir el arrayList en un array" + "\n" + "5- Si no está vacio mostrar el número de elementos que contiene" + "\n" + "6- Insertar un nuevo elemento por el final" + "\n" + "7-Insertar un nuevo elemento en la posición que desees" + "\n" + "8- Borrar un elemento concreto" + "\n" + "9- calcular la suma y la media de los valores" + "\n" + "10- Finalizar"));
        
        // CASO Nº1
        if(opcion == 1){
            int minimo = 100;
            int maximo = 0;
            
            for(int x = 0; x < primer.size(); x++){
                if(x < minimo){
                   minimo = x; 
                }
                else if(x > maximo){
                    maximo = x;
                }
            }
            JOptionPane.showMessageDialog(null,"El numero minimo es: " + minimo + "\n" + "El numero maximo es: " + maximo);
        }
        
        // CASO Nº2
        
        if(opcion == 2){
            int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numeor que deseas buscar: "));
            int busq = 2;
            
            for(int x = 0; x < primer.size(); x++){
                if(busqueda == primer.size()){
                    busq = 0;
                }
                else{
                    busq = 1;
                }
            }
            if (busq == 0){
                JOptionPane.showMessageDialog(null,"El numero no se encuentra en la lista");
            }
            else{
                JOptionPane.showMessageDialog(null,"El numero se encuentra en la lista");
            }
        }
    }
    
}
