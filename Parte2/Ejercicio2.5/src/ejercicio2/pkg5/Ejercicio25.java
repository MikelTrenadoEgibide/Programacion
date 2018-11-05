/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.pkg5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
       /*String fechaString = JOptionPane.showInputDialog ("Teclea una fecha dd/MM/yyyy");
       SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
       Date fecha1 = formatter.parse(fechaString);
       Date fecha= formatter.parse(fecha.toString());*/
       String fechaString = JOptionPane.showInputDialog("Teclea una fecha dd/MM/yyyy");
       SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
       Date fecha = formatter.parse(fechaString);
       Calendar calendar = Calendar.getInstance ();
       calendar.setTime(fecha);
       calendar.add(Calendar.DATE, +100);
       
       JOptionPane.showMessageDialog(null,"fecha" + calendar.getTime());
       
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"El valor introducido es incorrecto");
        }
        }
    }
    

