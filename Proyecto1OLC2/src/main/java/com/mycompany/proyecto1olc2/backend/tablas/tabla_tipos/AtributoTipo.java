/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1olc2.backend.tablas.tabla_tipos;

/**
 *
 * @author brandon
 */
public class AtributoTipo {
    private final String nombre;
    private final int idTipo;

    public AtributoTipo(String nombre, int idTipo) {
        this.nombre = nombre;
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdTipo() {
        return idTipo;
    }

    @Override
    public String toString() {
        return nombre + " : tipo " + idTipo;
    }
}
