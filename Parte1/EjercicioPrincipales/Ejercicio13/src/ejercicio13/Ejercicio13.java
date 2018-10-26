
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
        static int contador=0;
        static int contadorChicos=0;
        static int contadorChicas=0;
    public static void main(String[] args) {
        
        while (contador !=30){
        double peso= Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte el peso"));
        int edad= Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte la edad"));
        String nombre= JOptionPane.showInputDialog(null,"Inserte el nombre");
        String sexo= JOptionPane.showInputDialog(null,"Inserte el sexo");
        double estatura= Double.parseDouble(JOptionPane.showInputDialog(null,"Inserte la estatura"));
        
        aptoNoapto(peso, sexo, estatura);
        
        contador = contador + 1;
        }
       
        
        JOptionPane.showMessageDialog(null,"contador chicos " + contadorChicos + "\n" +"contador chicas " + contadorChicas);
    }
    public static int aptoNoapto(double peso, String sexo, double estatura){
        if (sexo.equalsIgnoreCase("femenino")){
            if (estatura > 1.6 && peso > 60){
                contadorChicas= contadorChicas + 1;
            }
        return contadorChicas;    
        }else if(estatura >1.7 && peso > 70){
            contadorChicos= contadorChicos + 1;
        }
        
     return contadorChicos;
        }
}
