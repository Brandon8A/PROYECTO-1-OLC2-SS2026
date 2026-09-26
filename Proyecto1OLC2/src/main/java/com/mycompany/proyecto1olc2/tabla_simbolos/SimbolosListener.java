package com.mycompany.proyecto1olc2.tabla_simbolos;

import com.mycompany.piglatin.PigLatinBaseListener;
import com.mycompany.piglatin.PigLatinParser;
import com.mycompany.proyecto1olc2.utils.CategoriaSimbolo;

import java.util.ArrayList;
import java.util.List;

public class SimbolosListener extends PigLatinBaseListener {
    private final TablaSimbolos TABLA_SIMBOLOS;
    private final TablaTipos TABLA_TIPOS;
    private String ambitoActual;

    public SimbolosListener(){
        this.TABLA_SIMBOLOS = new TablaSimbolos();
        this.TABLA_TIPOS = new TablaTipos();
        this.ambitoActual = "Global";
    }

    /*
    variable:   ESTO ID ':' tipoDato;
     */
    @Override
    public void enterVariable(PigLatinParser.VariableContext ctx) {
        String idVariable = ctx.ID().getText();
        String tipoVariable = ctx.tipoDato().getText();

        int idTipo = this.TABLA_TIPOS.registrarTipo(tipoVariable);

        this.TABLA_SIMBOLOS.agregarSimbolo(idVariable, CategoriaSimbolo.VARIABLE, idTipo, null, ambitoActual, null, null, null, null);
    }

    /*
    arreglo:    SERIES ID tamanioArreglo ':' tipoDato;
     */
    @Override
    public void enterArreglo(PigLatinParser.ArregloContext ctx) {
        String idVariable = ctx.ID().getText();
        String tipoVariable = ctx.tipoDato().getText();

        int idTipoDato = this.TABLA_TIPOS.registrarTipo(tipoVariable);

        List<Integer> tamanios = obtenerTamanios(ctx.tamanioArreglo());

        int dimension = tamanios.size();

        int tamanioTotal = calcularTamanioTotal(tamanios);

        this.TABLA_SIMBOLOS.agregarSimbolo(
                idVariable,
                CategoriaSimbolo.ARREGLO,
                idTipoDato,
                null,
                ambitoActual,
                null,
                dimension,
                tamanios,
                tamanioTotal
        );
    }

    //Funcion que obtiene las dimensiones del arreglo
    private List<Integer> obtenerTamanios(PigLatinParser.TamanioArregloContext ctx){
        List<Integer> tamanios = new ArrayList<>();//Creando la lista de los tamanios que va a tener el arreglo
        for (PigLatinParser.ExpresionContext expresion : ctx.expresion()){//Recorrer "todas las dimensiones declaradas"
            String texto = expresion.getText();//Obteniendo tamaño
            try {
                int tamanio = Integer.parseInt(texto);//INtentar parsear a entero
                tamanios.add(tamanio);//agregar tamaño a la lista de tamaños que el arreglo va a tener
            } catch (NumberFormatException e) {//excepcion por que no se pudo parsear a entero
                System.out.println("No se pudo determinar el tamaño de la dimensión: " + texto);
                tamanios.add(0);//Establecer tamanio en cero por que todavia no se puede obtener valor entero
            }
        }
        return tamanios;//Retornar tamanios obtenidos y almacenados en tamanios
    }

    //Funcion que calcula el tamanio total del arreglo
    private int calcularTamanioTotal(List<Integer> tamanios){
        int total = 1;
        for (Integer tamanio: tamanios){//Recorrer el "tamaño de las dimensiones" del arreglo
            total *= tamanio;//Calculando tamanio total
        }
        return total;//Retorna total
    }

    /*
    declAsignPrimitivo:     ESTO ID ':' tipoPrimitivo expresion;
     */
    @Override
    public void enterDeclAsignPrimitivo(PigLatinParser.DeclAsignPrimitivoContext ctx) {
        String idVariable = ctx.ID().getText();//Obtenieno el ID de la variable
        String tipoVariable = ctx.tipoPrimitivo().getText();//Obteniendo el tipo de la variable

        //Registrar tipo de dato en la tabla de tipos
        int idTipo = this.TABLA_TIPOS.registrarTipo(tipoVariable);

        //Registrar simbolo en la tabla de simbolos
        this.TABLA_SIMBOLOS.agregarSimbolo(idVariable, CategoriaSimbolo.VARIABLE, idTipo, null, ambitoActual, null, null, null, null);
    }

    public TablaSimbolos getTABLA_SIMBOLOS() {
        return TABLA_SIMBOLOS;
    }

    public TablaTipos getTABLA_TIPOS() {
        return TABLA_TIPOS;
    }

    /*
    declAsignArreglo:       SERIES ID tamanioArreglo ':' tipoDato valoresLlaves;
     */
    @Override
    public void enterDeclAsignArreglo(PigLatinParser.DeclAsignArregloContext ctx) {
        String idVariable = ctx.ID().getText();
        String tipoVariable = ctx.tipoDato().getText();

        int idTipo = this.TABLA_TIPOS.registrarTipo(tipoVariable);

        List<Integer> tamanios = obtenerTamanios(ctx.tamanioArreglo());

        int dimensiones = tamanios.size();

        int tamanioTotal = calcularTamanioTotal(tamanios);

        this.TABLA_SIMBOLOS.agregarSimbolo(
                idVariable,
                CategoriaSimbolo.ARREGLO,
                idTipo,
                null,
                ambitoActual,
                null,
                dimensiones,
                tamanios,
                tamanioTotal
        );
    }
}
