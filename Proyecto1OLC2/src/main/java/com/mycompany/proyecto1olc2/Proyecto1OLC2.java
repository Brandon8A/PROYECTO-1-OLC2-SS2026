/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1olc2;

import com.mycompany.piglatin.PigLatinLexer;
import com.mycompany.piglatin.PigLatinParser;
import com.mycompany.proyecto1olc2.backend.tablas.tabla_simbolos.Simbolo;
import com.mycompany.proyecto1olc2.backend.tablas.SimbolosListener;
import com.mycompany.proyecto1olc2.backend.tablas.tabla_tipos.Tipo;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author brandon
 */
public class Proyecto1OLC2 {

    public static void main(String[] args) {
        String codigo = """
                VARIABILES >

                esto edad : numerus 20;
                esto precio : decimalis 20.5;
                esto nombre : textum "Brandon";
                esto apellido : bool;
                series misObjetos[10] : Persona;
                series bidimensional[2][3] : Cuadrado;
                series tridimensional[2][3][4] : Cubo;
                
                MAIOR>
                FINIS;
                """;

        //Creando lexer
        CharStream entrada = CharStreams.fromString(codigo);
        PigLatinLexer lexer = new PigLatinLexer(entrada);

        //Creando flujo de tokens
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        //Creando parser
        PigLatinParser parser = new PigLatinParser(tokenStream);

        //AST
        ParseTree tree = parser.programa();

        //Creando listener
        SimbolosListener listenerSimbolos = new SimbolosListener();

        //Recorrer el arbol
        ParseTreeWalker.DEFAULT.walk(listenerSimbolos, tree);

        System.out.println();
        System.out.println("==========================================");
        System.out.println("             TABLA DE TIPOS");
        System.out.println("==========================================");

        System.out.printf(
                "%-5s %-15s%n",
                "ID",
                "NOMBRE"
        );
        System.out.println("------------------------------------------");
        for (Tipo tipo : listenerSimbolos.getTABLA_TIPOS().getTipos().values()) {
            System.out.printf(
                    "%-5d %-15s%n",
                    tipo.getID(),
                    tipo.getNOMBRE()
            );
        }

        System.out.println();
        System.out.println("==========================================");
        System.out.println("           TABLA DE SÍMBOLOS");
        System.out.println("==========================================");

        System.out.printf(
                "%-5s %-15s %-12s %-8s %-15s %-12s %-15s %-15s %-12s %-15s%n",
                "ID",
                "NOMBRE",
                "CATEGORÍA",
                "TIPO",
                "# PARAM",
                "ÁMBITO",
                "VALOR",
                "DIMENSION",
                "TAMAÑO DIMEN",
                "TAMAÑO TOTAL"
        );

        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------------------"
        );

        for (Simbolo simbolo :
                listenerSimbolos.getTABLA_SIMBOLOS().getSimbolos().values()) {

            System.out.printf(
                    "%-5d %-15s %-12s %-8d %-15s %-12s %-15s %-15s %-12s %-15s%n",
                    simbolo.getID(),
                    simbolo.getNOMBRE(),
                    simbolo.getCATEGORIA(),
                    simbolo.getID_TIPO(),
                    simbolo.getNUMERO_PARAMETROS(),
                    simbolo.getAMBITO(),
                    simbolo.getVALOR(),
                    simbolo.getDIMENSION(),
                    simbolo.getTAMANIO_DIMENSION(),
                    simbolo.getTAMANIO_TOTAL()
            );
        }
    }
}
