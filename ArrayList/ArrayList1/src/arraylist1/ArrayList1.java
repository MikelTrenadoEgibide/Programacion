/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;
import java.util.Arrays;
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
    private static ArrayList <Float> lista = new ArrayList();
    
    public static void main(String[] args) {
        
        int respuesta;
        
        do{
           float valor = Float.parseFloat(JOptionPane.showInputDialog("Introduce tu valor: "));
           lista.add(valor);
           respuesta = JOptionPane.showConfirmDialog(null,"Quieres continuar?");
           if (respuesta == 2){
               System.exit(0);
           }
        }
        while(respuesta == 0);
        
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Que deseas realizar? : " + "\n" + "1- Visualizar el máximo y el mínimo" + "\n"+ "2- Solidcitar un número y buscarlo" + "\n" + "3- Solicitar un numero, buscarlo y eliminarlo" + "\n" + "4- Convertir el arrayList en un array" + "\n" + "5- Si no está vacio mostrar el número de elementos que contiene" + "\n" + "6- Insertar un nuevo elemento por el final" + "\n" + "7-Insertar un nuevo elemento en la posición que desees" + "\n" + "8- Borrar un elemento concreto" + "\n" + "9- calcular la suma y la media de los valores" + "\n" + "10- Finalizar"));
        
        switch(opcion){
            case 1:
                op1();
                break;
            case 2:
                op2();
                break;
            case 3:
                op3();
                break;
            case 4:
                op4();
                break;
            case 5:
                op5();
                break;
            case 6:
                op6();
                break;
            case 7:
                op7();
                break;
            case 8:
                op8();
                break;
            case 9:
                op9();
                break;
            case 10:
                op10();
                break;
        } 
        }
        while(opcion != 10);
    }
    
    public static void op1(){// CASO Nº1
           
            double maximo, minimo;
            maximo = minimo = lista.get(0);
            
            for(int x = 0; x < lista.size(); x++){
                if(lista.get(x) > maximo){
                   maximo = lista.get(x); 
            }
            else if(lista.get(x) < minimo){
                    minimo = lista.get(x);
            }
            }
            JOptionPane.showMessageDialog(null,"El numero minimo es: " + minimo + "\n" + "El numero maximo es: " + maximo);
    }
    
        
    public static void op2(){// CASO Nº2
        
            float busqueda = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numeor que deseas buscar: "));
            
            if(lista.contains(busqueda)){
                JOptionPane.showMessageDialog(null,"El numero se encentra");
            }
            else{
                JOptionPane.showMessageDialog(null,"El numero no se encuentra");
            }
    }
    
    public static void op3(){ //CASO nº3
        
            float busqueda = Float.parseFloat(JOptionPane.showInputDialog("Introduce el valor que deseas eliminar"));
            
            if(lista.remove(busqueda))
                JOptionPane.showMessageDialog(null,"El numero a sido borrado");
            else
                JOptionPane.showMessageDialog(null,"El numero que busacas no se encuentra en la lista");
    }
    
    public static void op4(){ // CASO nº4
        
        Double [] array; 
        array = lista.toArray(new Double[lista.size()]);
        JOptionPane.showMessageDialog(null,"Tu arrayList se ha transformado a un array: " + Arrays.toString(array));
    }
    
    public static void op5(){ // CASO nº5
        
        if(lista.isEmpty() == true){
            JOptionPane.showMessageDialog(null,"El arrayList esta vacio");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero de elementos de el arrayList es: " + lista.size());
        }
    }
    
    public static void op6(){ // CASO nº6
        
        float tamaño = lista.size();
        float numeroAñadir = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero que quieres añadir en la ultima posicion: "));
        lista.add((int) tamaño, numeroAñadir);
    }
    public static void op7(){// CASO Nº7
    
        if(opcion == 7){
            int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieres añadir el valor"));
            int valorIntrd = Integer.parseInt(JOptionPane.showInputDialog("Introdcue el valor que deseas añadir a la lista"));
        }
    }
    public static void op8(){ // CASO nº8
        
        float borrar = Float.parseFloat(JOptionPane.showInputDialog("Introduce la posicion que deseas borrar: "));
        lista.remove(borrar);
        
    }
    public static void op9(){ // CASO nº9
        
        for(int x = 0; x < lista.size();){
            
        }
    }
    public static void op10(){ // CASO nº10
        
        System.exit(0);
    }
    
}
