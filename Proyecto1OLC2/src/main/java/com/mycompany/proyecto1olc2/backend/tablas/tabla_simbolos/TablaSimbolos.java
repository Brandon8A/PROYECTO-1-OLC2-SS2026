package com.mycompany.proyecto1olc2.backend.tablas.tabla_simbolos;

import com.mycompany.proyecto1olc2.backend.tablas.tabla_simbolos.Simbolo;
import com.mycompany.proyecto1olc2.backend.utils.CategoriaSimbolo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
    private final HashMap<Integer, Simbolo> SIMBOLOS;

    private int siguienteId;

    public TablaSimbolos(){
        SIMBOLOS = new HashMap<>();
        siguienteId = 0;
    }

    //Funcion que agrega un nuevo simbolo a SIMBOLOS, retorna el id del simbolo agregado
    public int agregarSimbolo(
            String nombre, 
            CategoriaSimbolo categoria, 
            int idTipo, 
            Integer numeroParametros, 
            String ambito, 
            Object valor, 
            Integer dimension, 
            List<Integer> tamaniosDimensiones, 
            Integer tamanoTotal,
            Integer direccion){
        int id = siguienteId++;//Creando nuevo ID
        Simbolo simboloNuevo = new Simbolo(
                id, 
                nombre, 
                categoria, 
                idTipo, 
                numeroParametros, 
                ambito, 
                valor, 
                dimension, 
                tamaniosDimensiones, 
                tamanoTotal,
                direccion);//Creando nuevo simbolo
        SIMBOLOS.put(id, simboloNuevo);//Agregando simbolo a SIMBOLOS
        return id;//retorna id del simbolo que se creo
    }

    //Funcion que busca un simbolo por medio del ID del simbolo en SIMBOLOS y retorna ese objeto SIMBOLO
    public Simbolo buscarSimboloPorId(int id){
        return SIMBOLOS.get(id);//Obteniendo y retornando simbolo
    }

    //Funcion que retorna la tabla de simbolos
    public Map<Integer, Simbolo> getSimbolos(){
        return this.SIMBOLOS;//Retorna la tabla
    }

    //Funcion que busca un simbolo en un ambito en especidfico
    public Simbolo buscarEnAmbito(String nombre, String ambito){
        for (Simbolo simbolo: this.SIMBOLOS.values()){//Recorre la tabla de simbolos
            if (simbolo.getNOMBRE().equals(nombre) && simbolo.getAMBITO().equals(ambito)){//Condicional para verificar si existe un simbolo en un ambito
                return simbolo;//retorna el simbolo encontrado
            }
        }
        return null;//Retorna nulo por que no encontro el simbolo en dicho ambito
    }

    //Funcion que indica si existe un simbolo en un ambito
    public boolean existeEnAmbito(String nombre, String ambito){
        return buscarEnAmbito(nombre, ambito) != null;//retorna true si el simbolo existe en el ambito, de lo contrario retorna false
    }
}
