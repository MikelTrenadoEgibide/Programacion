/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg4;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     try{
       String fechaString = JOptionPane.showInputDialog ("Teclea una fecha dd/MM/yyyy");
       SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
       Date fecha1 = formatter.parse(fechaString);
       String fechaString2 = JOptionPane.showInputDialog ("Teclea una fecha dd/MM/yyyy");
       Date fecha2 = formatter.parse(fechaString2);
       
       int dias = (int) ((fecha1.getTime()  - fecha2.getTime())  / 86400000);
       
       JOptionPane.showMessageDialog(null,"Hay " + dias + " días de diferencia");
      }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"No has introducido un valor correcto");
     }
    
}
}
