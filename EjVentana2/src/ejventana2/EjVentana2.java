/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejventana2;

import Ventanas.ListadoPersonas;
import javax.swing.JFrame;

/**
 *
 * @author 1gdaw09
 */
public class EjVentana2 {

    public static JFrame personas=new JFrame();
    public static JFrame ListadoPersonas = new JFrame();
    
    public static void main(String[] args) {
        personas.setVisible(true);
        
        
        
    }
    public static void Salir(){
    personas.dispose();
    ListadoPersonas.setVisible(true);
    
}
    
}
