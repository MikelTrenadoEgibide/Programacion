/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3ventanas;

import Ventanas.Ventana;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio3ventanas {

   private static Ventana v;
  // private static ArrayList<DNI> listaPersonas;
   
    public static void main(String[] args) {
        
    //    listaPersonas = new ArrayList<DNI>();
        v = new Ventana();
        v.setVisible(true);
        
    }
    public static void salir(){
        System.exit(0);
    }
    
}
