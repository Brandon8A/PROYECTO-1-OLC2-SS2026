package com.mycompany.proyecto1olc2.backend.semantico;

import com.mycompany.piglatin.PigLatinBaseVisitor;
import com.mycompany.piglatin.PigLatinParser;
import com.mycompany.proyecto1olc2.backend.utils.TipoDato;

public class AnalisisSemanticoPigLatin extends PigLatinBaseVisitor<TipoDato> {

    @Override public TipoDato visitDeclAsignPrimitivo(PigLatinParser.DeclAsignPrimitivoContext ctx) {

        //Obteniendo el nombre de la variable declara-asignada
        String idVariable = ctx.ID().getText();

        //Obtener tipo de dato
        TipoDato tipoDatoDeclarado = obtenerTipo(ctx.tipoPrimitivo());

        //Analizar expresion
        TipoDato tipoExpresion = visit(ctx.expresion());

        System.out.println("Variable: " + idVariable);
        System.out.println("Tipo dato: " + tipoDatoDeclarado);
        System.out.println("Expresion o valor: " + tipoExpresion);


        return visitChildren(ctx);
    }

    private TipoDato obtenerTipo(PigLatinParser.TipoPrimitivoContext ctx){
        if (ctx.NUMERUS() != null){
            return TipoDato.NUMERUS;
        }
        return TipoDato.DESCONOCIDO;
    }
}
