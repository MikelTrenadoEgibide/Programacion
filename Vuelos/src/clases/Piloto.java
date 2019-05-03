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
public class Piloto {
    private String cod_piloto;
    private String nombre;
    private String apellido;
    private Integer num_licencia;
    private ArrayList<Vuelo> vuelos;

    public String getCod_piloto() {
        return cod_piloto;
    }

    public void setCod_piloto(String cod_piloto) {
        this.cod_piloto = cod_piloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNum_licencia() {
        return num_licencia;
    }

    public void setNum_licencia(Integer num_licencia) {
        this.num_licencia = num_licencia;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public Piloto(String cod_piloto, String nombre, String apellido, Integer num_licencia, ArrayList<Vuelo> vuelos) {
        this.cod_piloto = cod_piloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_licencia = num_licencia;
        this.vuelos = vuelos;
    }
    public void agregar_nuevo(){
    }
    public void asignar_vuelo(){
    }
    public void cancelar_vuelo(){
    }
    public void modificar(){
    }
    public Piloto buscar(){
        return null;
    }
}
