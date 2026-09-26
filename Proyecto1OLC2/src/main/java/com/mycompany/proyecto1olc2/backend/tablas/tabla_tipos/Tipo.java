package com.mycompany.proyecto1olc2.backend.tablas.tabla_tipos;

import java.util.ArrayList;
import java.util.List;

public class Tipo {
    private final int ID;
    private final String NOMBRE;
    private final List<AtributoTipo> atributos;

    public Tipo (int id, String nombre){
        this.ID = id;
        this.NOMBRE = nombre;
        this.atributos = new ArrayList<>();
    }

    public int getID(){
        return this.ID;
    }

    public String getNOMBRE(){
        return this.NOMBRE;
    }

    public List<AtributoTipo> getAtributos() {
        return atributos;
    }
    
    
    /**
     * Metodo que agrega un atributo a la lista de atributos de un Tipo de dato
     * @param nombre nombre del atributo
     * @param idTipo tipo de dato
     */
    public void agregarAtributo(String nombre, int idTipo) {
        atributos.add(new AtributoTipo(nombre, idTipo));
    }

    /**
     * Funcion que busca un atributo en 'atributos' que coincida con 'nombre'
     * @param nombre nombre del atributo que se desea buscar
     * @return retorna el atributo que estaba guardado en con el nombre 'nombre' de 'atributos'
     */
    public AtributoTipo buscarAtributo(String nombre) {
        for (AtributoTipo atributo : atributos) {
            if (atributo.getNombre().equals(nombre)) {
                return atributo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return ID + " | " + NOMBRE;
    }
}
