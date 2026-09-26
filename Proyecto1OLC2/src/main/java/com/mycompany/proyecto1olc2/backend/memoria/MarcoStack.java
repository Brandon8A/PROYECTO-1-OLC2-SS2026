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
public class MarcoStack {
    private final String nombreAmbito;
    private final Map<String, Object> variables;

    public MarcoStack(String nombreAmbito) {
        this.nombreAmbito = nombreAmbito;
        this.variables = new HashMap<>();
    }

    public String getNombreAmbito() {
        return nombreAmbito;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }
    
    /**
     * Metodo que almacena variables en variables
     * @param nombre nombre de la variable
     * @param valor valor de la variable
     */
    public void guardar(String nombre, Object valor){
        variables.put(nombre, valor);
    }
    
    /**
     * Funcion que obtiene una variable por medio de su nombre
     * @param nombre nombre de la variable a obtener
     * @return retorna la variable obtenida con el registro nombre
     */
    public Object obtener(String nombre) {
        return variables.get(nombre);
    }
}
