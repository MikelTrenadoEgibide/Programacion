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
public class Avion {
    private String aerolinea;
    private String cod_avion;
    private int num_asientos;
    private String compartimientos;
    private ArrayList<Vuelo> vuelos;

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCod_avion() {
        return cod_avion;
    }

    public void setCod_avion(String cod_avion) {
        this.cod_avion = cod_avion;
    }

    public int getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(int num_asientos) {
        this.num_asientos = num_asientos;
    }

    public String getCompartimientos() {
        return compartimientos;
    }

    public void setCompartimientos(String compartimientos) {
        this.compartimientos = compartimientos;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
    public Avion(String aerolinea, String cod_avion, int num_asientos, String compartimientos, ArrayList<Vuelo> vuelos) {
        this.aerolinea = aerolinea;
        this.cod_avion = cod_avion;
        this.num_asientos = num_asientos;
        this.compartimientos = compartimientos;
        this.vuelos = vuelos;
    }
    public void asignarVuelo(){
    }
    public void cancelarVuelo(){
    }
    public Avion obtener(){
        return null;
    }
}
