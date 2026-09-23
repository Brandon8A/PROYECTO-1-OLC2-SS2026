/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1olc2;

import com.mycompany.proyecto1olc2.y.IndentationTokenSource;
import com.mycompany.y.YLexer;
import com.mycompany.y.YParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author brandon
 */
public class Proyecto1OLC2 {

    public static void main(String[] args) {
        String codigo = """
                %funciones\n
                definir funcionSinRetorno(entero miEntero):
                \tmiEntero = 90 * 10
                """;

        try {
            CharStream input = CharStreams.fromString(codigo);
            YLexer lexer = new YLexer(input);
            IndentationTokenSource identacion = new IndentationTokenSource(lexer, YParser.INDENT, YParser.DEDENT, YLexer.TAB, YLexer.SALTO_LINEA);
            CommonTokenStream tokens = new CommonTokenStream(identacion);
            YParser parser = new YParser(tokens);

            tokens.fill();

            for (Token token : tokens.getTokens()) {
                System.out.println(token.getType() + " -> " + token.getText());
            }

            parser.defFunciones();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
