/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw09
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    
    /*static String visual = "";
    static String cobol = "";
    static String java = "";
    static String SQL = ""; */
   
    public static void main(String[] args) {
        
        /*try{*/
           /*do{*/
            String visual = JOptionPane.showInputDialog(null,"¿Es apto para visual?");
            String cobol = JOptionPane.showInputDialog(null,"¿Es apto para cobol?");
            String java = JOptionPane.showInputDialog(null,"¿Es apto para java?");
            String SQL = JOptionPane.showInputDialog(null,"¿Es apto para SQL?");
            
           /*}
           while( visual != "APTO" || visual != "NOAPTO" && cobol != "APTO" || cobol != "NOAPTO" && java != "APTO" || java != "NOAPTO" && SQL != "APTO" || SQL != "NOAPTO");
          /* throw new AptoNoAptoException(); */
            
        if( "APTO".equals(visual) && "APTO".equals(cobol) && "APTO".equals(java) && "APTO".equals(SQL)){
            JOptionPane.showMessageDialog(null,"El alumno es sobresaliente");
        }
        else if( "APTO".equals(cobol) && "APTO".equals(SQL) && ("APTO".equals(visual) || "APTO".equals(java))){
                JOptionPane.showMessageDialog(null,"El alumno es notable");
            }
            else if( "APTO".equals(cobol) && "APTO".equals(SQL) && "NOAPTO".equals(java) && "NOAPTO".equals(visual) ){
                JOptionPane.showMessageDialog(null,"El alumno es bueno");
            }    
            
            
            if( "NOAPTO".equals(SQL) && "APTO".equals(cobol) && ("APTO".equals(java) || "APTO".equals(visual))){
                JOptionPane.showMessageDialog(null,"El alumno es suficiente");
            }
            else{
                JOptionPane.showMessageDialog(null,"El alumno es insuficiente");
            }

    }
}
        /*{
            JOptionPane.showMessageDialog(null,"El alumno es insuficiente");
        }    
        
        }
}
    

        /*catch (AptoNoAptoException ex){
            JOptionPane.showMessageDialog(null,"EL valor introducido no es correcto, prueba con APTO o NOAPTO");*/
            
    
    
    

