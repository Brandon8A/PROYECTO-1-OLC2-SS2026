/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1olc2.backend.memoria;

import com.mycompany.proyecto1olc2.backend.tablas.tabla_tipos.AtributoTipo;
import com.mycompany.proyecto1olc2.backend.tablas.tabla_tipos.Tipo;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author brandon
 */
public class TablaHeap {
    private final Map<Integer, ObjetoHeap> heap;
    private int siguienteDireccion;

    public TablaHeap() {
        this.heap = new HashMap<>();
        this.siguienteDireccion = 1000;
    }
    
    /**
     * Funcion que se encarga de ocupar un espacio en memoria para el objeto
     * @param tipo tipo de dato que se almacenará
     * @return retorna la direccion del heap en donde se encuentra el espacio reservado para el objeto
     */
    public int reservarHeap(Tipo tipo){
        int direccion = siguienteDireccion++;
        ObjetoHeap objetoHeap = new ObjetoHeap(direccion, tipo.getID());
        
        // Crear los atributos de la instancia
        for (AtributoTipo atributo : tipo.getAtributos()) {
            objetoHeap.agregarAtributo(atributo.getNombre(), null);
        }
        heap.put(direccion, objetoHeap);
        return direccion;
    }
    
    /**
     * Metodo encargado de obtener un objeto por medio de su direccion en memoria
     * @param direccion direccion en donde se encuentra el objeto
     * @return retorna el objeto que se encuentra en direccion
     */
    public ObjetoHeap obtenerObjeto(int direccion){
        return heap.get(direccion);
    }

    public Map<Integer, ObjetoHeap> getHeap() {
        return heap;
    }
    
    
}
