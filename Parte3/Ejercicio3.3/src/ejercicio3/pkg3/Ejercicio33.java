/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        int respuesta = 0;
        do{
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la operación que deseas" + "\n" + "1-Para sumar un numero" + "\n" + "2-Para restar un numero" + "\n" + "3-Para ver la tabla de multiplicar un numero" + "\n" + "4-Para ver el cociente y resto de una division" + "\n" + "5-Para salir"));
                if(respuesta == 1){
                    int n1suma = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu primer numero"));
                    int n2suma = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu segundo numero"));
                    int resSuma = n1suma + n2suma;
                    
                    JOptionPane.showMessageDialog(null,"La suma de los dos valores es: " + resSuma);
                }
                if(respuesta == 2){
                    int n1resta = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu primer numero"));
                    int n2resta = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu segundo numero"));
                    int resResta = n1resta + n2resta;
                    
                    JOptionPane.showMessageDialog (null, "La resta de los dos valores es: " + resResta);
                }
                if(respuesta == 3){
                    int nMultipl = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor del que quieres ver la tabla de multiplicación"));
                    String resultado = "";
                    
                    for(int x = 1 ; x < 10 ; x ++){
                    resultado = resultado + nMultipl + " x " + x + " = " + (nMultipl * x) + "\n";
                    }
                    
                    JOptionPane.showMessageDialog(null,"La tabla del " + nMultipl + "\n" + resultado);
                }
                if(respuesta == 4){
                    int n1division = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
                    int n2division = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
                    int resto = 0;
                    int result = 0;
                    
                    result = n1division/n2division;
                    resto = n1division%n2division;
                    
                    JOptionPane.showMessageDialog(null,"El cociente de la division es: " + result + "\n" + " El resto de la division es: " + resto);
                }
        }
        while (respuesta != 5);
    }
    
    catch (Exception e){
    JOptionPane.showMessageDialog(null,"El valor introducido no es correcto");
}
    }
}
