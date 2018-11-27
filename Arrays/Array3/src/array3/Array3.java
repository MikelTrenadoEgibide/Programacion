/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] arrayMes = new String [12];
        
        arrayMes [0] = "Enero";
        arrayMes [1] = "Febrero";
        arrayMes [2] = "Marzo";
        arrayMes [3] = "Abril";
        arrayMes [4] = "Mayo";
        arrayMes [5] = "Junio";
        arrayMes [6] = "Julio";
        arrayMes [7] = "Agosto";
        arrayMes [8] = "Septiembre";
        arrayMes [9] = "Octubre";
        arrayMes [10] = "Noviembre";
        arrayMes [11] = "Diciembre";
        
        String respuesta= "";
        for(int x= 0; x < arrayMes.length && respuesta == "Fin"; x++){
            respuesta = JOptionPane.showInputDialog("Introduce la cantidad de lluvia");
        
        for(String elemento: arrayMes)
             {
                   JOptionPane.showMessageDialog(null,elemento);        
             }
    }
    
}
}
