/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juicio;

import ventanasjuicio.inicio;

/**
 *
 * @author 1gdaw09
 */
public class Juicio {

    private static inicio vi;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void visualizarVentanaAlta(){
        // Dejo por debajo la principal
         vi = new inicio();
         vi.setVisible(true);
    }
    
    public Juicio (){
    
}
}
