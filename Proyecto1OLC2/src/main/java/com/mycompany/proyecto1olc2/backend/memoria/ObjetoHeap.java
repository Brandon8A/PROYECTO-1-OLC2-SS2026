/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1olc2.backend.memoria;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brandon
 */
public class ObjetoHeap {
    private final int direccion;
    private final int idTipo;
    private final Map<String, Object> atributos;

    public ObjetoHeap(int direccion, int idTipo) {
        this.direccion = direccion;
        this.idTipo = idTipo;
        atributos = new HashMap();
    }

    public int getDireccion() {
        return direccion;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public Map<String, Object> getAtributos() {
        return atributos;
    }
    
    /**
     * Metodo que agrega un nuevo atributo
     * @param nombre nombre del atributo a agregar
     * @param valor valor del atributo a agregar
     */
    public void agregarAtributo(String nombre, Object valor){
        atributos.put(nombre, valor);
    }
    
    /**
     * Funcion que obtiene un atributo de 'atributos'
     * @param nombre nombre del con el que se encuentra registrado en 'atributos'
     * @return retorna el atributo encontrado
     */
    public Object obtenerAtributos(String nombre){
        return atributos.get(nombre);
    }
    
    /**
     * Metodo que agrega un nuevo valor 'atributo' a 'atributos'
     * @param nombre nombre del atributo nuevo
     * @param valor valor del atributo nuevo
     */
    public void asignarAtributo(String nombre, Object valor) {
        if (atributos.containsKey(nombre)) {
            atributos.put(nombre, valor);
        }
    }

    @Override
    public String toString() {

        return "Heap[" + direccion + "]"
                + " tipo=" + idTipo
                + " atributos=" + atributos;
    }
}
