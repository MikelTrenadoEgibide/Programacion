/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author 1gdaw09
 */
public class Pelicula {
    private char[] año;

    public char[] getAño() {
        return año;
    }

    public void setAño(char[] año) {
        this.año = año;
    }
    private float duracion;
    private String tipo;


    public Pelicula(String titulo, char año, float duracion, String tipo) {
        
        this.duracion = duracion;
        this.tipo = tipo;
    }
  
    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
