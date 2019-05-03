/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepti;

/**
 *
 * @author 1gdaw09
 */
public class DatoObligatorio extends Exception{
    private int tipo;

    public DatoObligatorio(int tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String getMessage(){
        String mensaje="";
        switch(tipo)
        {
            case 1:
                mensaje = "El nombre es un dato obligatorio";
                break;
            case 2:
                mensaje = "Es obligatorio indicar los apellidos de la persona";
                break;
            case 3:
                mensaje = "Es obligatorio indicar el dni de la persona";
                break;
       }
       return mensaje;
    }
}
