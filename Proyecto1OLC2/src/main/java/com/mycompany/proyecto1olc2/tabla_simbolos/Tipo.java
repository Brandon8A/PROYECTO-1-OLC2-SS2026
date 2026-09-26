package com.mycompany.proyecto1olc2.tabla_simbolos;

public class Tipo {
    private final int ID;
    private final String NOMBRE;

    public Tipo (int id, String nombre){
        this.ID = id;
        this.NOMBRE = nombre;
    }

    public int getID(){
        return this.ID;
    }

    public String getNOMBRE(){
        return this.NOMBRE;
    }

    @Override
    public String toString() {
        return ID + " | " + NOMBRE;
    }
}
