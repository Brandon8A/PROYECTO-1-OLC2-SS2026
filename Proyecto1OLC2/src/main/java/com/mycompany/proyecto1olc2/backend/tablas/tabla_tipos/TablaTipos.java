package com.mycompany.proyecto1olc2.backend.tablas.tabla_tipos;

import com.mycompany.proyecto1olc2.backend.tablas.tabla_tipos.Tipo;
import java.util.HashMap;
import java.util.Map;

public class TablaTipos {
    private final HashMap<Integer, Tipo> TIPOS;
    private int siguienteID;

    //Constructor que instancia un hasmap para TIPOS
    public TablaTipos(){
        this.TIPOS = new HashMap<>();
        siguienteID = 0;
    }

    //Metodo que se encarga de guardar los tipos en TIPOS
    public int registrarTipo(String nombre){
        //Verificar si e tipo ya existe
        for (Tipo tipo: this.TIPOS.values()){
            if (tipo.getNOMBRE().equals(nombre)){//Condicional para saber si el nombre del "nuevo" tipo ya existe
                return tipo.getID();//Retorna el valor que ya se encuentra en la tabla TIPOS
            }
        }//Salida del for, quiere decir que el tipo no existe en la tabla TIPOS

        int id = this.siguienteID++;//"Creando" nuevo ID

        Tipo tipoNuevo = new Tipo(id, nombre);//Creando nuevo tipo de dato

        TIPOS.put(id, tipoNuevo);//Agregar tipo nuevo a TIPOS

        return id;//retorna el nuevo id "generado"
    }

    //Metodo que se encarga de buscar y devolver un tipo por medio de su id
    public Tipo buscarPorId(int id){
        return this.TIPOS.get(id);
    }
    
    /**
     * Funcion que se encarga de buscar un tipo de dato por su nombre 
     * @param nombreTipo bombre del tipo de dato que se desea buscar
     * @return retorna el tipo de dato encontrado si es que lo encuentra, de lo contrario retorn null
     */
    public Tipo buscarPorNombre(String nombreTipo){
        for (Tipo tipo : TIPOS.values()) {
            if (tipo.getNOMBRE().equals(nombreTipo)) {
                return tipo;
            }
        }
        return null;
    }

    //Funcion que devuelve la tabla con los tipos registrados en ella.
    public Map<Integer, Tipo> getTipos(){
        return this.TIPOS;
    }
}
