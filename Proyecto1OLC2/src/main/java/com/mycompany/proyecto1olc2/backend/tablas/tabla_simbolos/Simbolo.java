package com.mycompany.proyecto1olc2.backend.tablas.tabla_simbolos;

import com.mycompany.proyecto1olc2.backend.utils.CategoriaSimbolo;

import java.util.List;

public class Simbolo {
    private final int ID;
    private final String NOMBRE;
    private final CategoriaSimbolo CATEGORIA;
    private final int ID_TIPO;
    private final Integer NUMERO_PARAMETROS;
    private final String AMBITO;
    private final Integer DIMENSION;
    private final List<Integer> TAMANIO_DIMENSION;
    private final Integer TAMANIO_TOTAL;
    
    private Object VALOR;
    private Integer direccionHeap;


    public Simbolo(
            int id, 
            String nombre, 
            CategoriaSimbolo categoria, 
            int idTipo, 
            Integer numeroParametros, 
            String ambito, 
            Object valor, 
            Integer dimension, 
            List<Integer> tamaniosDimensiones, 
            Integer tamanoTotal,
            Integer direccionHeap){
        this.ID = id;
        this.NOMBRE = nombre;
        this.CATEGORIA = categoria;
        this.ID_TIPO = idTipo;
        this.NUMERO_PARAMETROS = numeroParametros;
        this.AMBITO = ambito;
        this.VALOR = valor;
        this.DIMENSION = dimension;
        this.TAMANIO_DIMENSION = tamaniosDimensiones;
        this.TAMANIO_TOTAL = tamanoTotal;
        this.direccionHeap = direccionHeap;
    }

    public int getID() {
        return ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public CategoriaSimbolo getCATEGORIA() {
        return CATEGORIA;
    }

    public int getID_TIPO() {
        return ID_TIPO;
    }

    public Integer getNUMERO_PARAMETROS() {
        return NUMERO_PARAMETROS;
    }

    public String getAMBITO() {
        return AMBITO;
    }

    public Object getVALOR() {
        return VALOR;
    }

    public Integer getDIMENSION() {
        return DIMENSION;
    }

    public List<Integer> getTAMANIO_DIMENSION() {
        return TAMANIO_DIMENSION;
    }

    public Integer getTAMANIO_TOTAL() {
        return TAMANIO_TOTAL;
    }

    public Integer getDireccionHeap() {
        return direccionHeap;
    }

    public void setDireccionHeap(Integer direccionHeap) {
        this.direccionHeap = direccionHeap;
    }

    public void setVALOR(Object VALOR) {
        this.VALOR = VALOR;
    }

    
    
    @Override
    public String toString() {

        return ID + " | "
                + NOMBRE + " | "
                + CATEGORIA + " | "
                + ID_TIPO + " | "
                + NUMERO_PARAMETROS + " | "
                + AMBITO + " | "
                + VALOR + " | "
                + DIMENSION + " | "
                + TAMANIO_DIMENSION + " | "
                + TAMANIO_TOTAL;
    }
}
