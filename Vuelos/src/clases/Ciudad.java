/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw09
 */
public class Ciudad {
    private String codCiudad;
    private String nombre;
    private ArrayList <Vuelo> vuelo;

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vuelo> getVuelo() {
        return vuelo;
    }

    public void setVuelo(ArrayList<Vuelo> vuelo) {
        this.vuelo = vuelo;
    }
    public Ciudad(String codCiudad, String nombre, ArrayList<Vuelo> vuelo) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;
        this.vuelo = vuelo;
    }
    public void agregarNuevo(){
    }
    public Ciudad obtener(){
        return null;
    }
}
