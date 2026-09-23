package com.mycompany.proyecto1olc2.y;

import org.antlr.v4.runtime.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class IndentationTokenSource implements TokenSource {

    private final TokenSource source;

    private final Queue<Token> tokensPendientes = new ArrayDeque<>();
    private final Deque<Integer> indentaciones = new ArrayDeque<>();

    private final int indentTokenType;
    private final int dedentTokenType;
    private final int tabTokenType;
    private final int saltoLineaTokenType;

    private boolean inicioLinea = true;
    private boolean eofProcesado = false;

    public IndentationTokenSource(TokenSource source, int indentTokenType, int dedentTokenType, int tabTokenType, int saltoLineaTokenType) {
        this.source = source;
        this.indentTokenType = indentTokenType;
        this.dedentTokenType = dedentTokenType;
        this.tabTokenType = tabTokenType;
        this.saltoLineaTokenType = saltoLineaTokenType;
        indentaciones.push(0);// El programa comienza con nivel de indentación 0
    }

    @Override
    public Token nextToken() {

        // Entregar tokens pendientes
        if (!tokensPendientes.isEmpty()) {
            return tokensPendientes.poll();
        }

        // Solicitar siguiente token al lexer
        Token token = source.nextToken();

        // EOF
        if (token.getType() == Token.EOF) {
            if (!eofProcesado) {
                eofProcesado = true;
                // Cerramos indentaciones abiertas
                while (indentaciones.size() > 1) {
                    indentaciones.pop();
                    tokensPendientes.add(crearToken(dedentTokenType, "<DEDENT>"));
                }
                tokensPendientes.add(token);
            }
            return tokensPendientes.poll();
        }

        // Salto de linea
        if (token.getType() == saltoLineaTokenType) {
            inicioLinea = true;
            return token;
        }

        // Inicio de una nueva linea
        if (inicioLinea) {
            return procesarInicioLinea(token);
        }
        return token;
    }

    private Token procesarInicioLinea(Token token) {
        int nivel = 0;
        Token tokenActual = token;

        // Contar los TAB al inicio de la línea
        while (tokenActual.getType() == tabTokenType) {
            nivel++;
            tokenActual = source.nextToken();
        }

        inicioLinea = false;
        int nivelAnterior = indentaciones.peek();

        // Aumento de indentación
        if (nivel > nivelAnterior) {
            indentaciones.push(nivel);
            tokensPendientes.add(crearToken(indentTokenType, "<INDENT>"));
        }
        else if (nivel < nivelAnterior) {// Disminución de indentación
            while (indentaciones.size() > 1 && nivel < indentaciones.peek()) {
                indentaciones.pop();
                tokensPendientes.add(crearToken(dedentTokenType, "<DEDENT>"));
            }

            // La indentación debe coincidir con un nivel existente
            if (nivel != indentaciones.peek()) {
                throw new RuntimeException("Error de indentación: nivel "+ nivel + " no válido.");
            }
        }

        // Guardar el token real de la línea
        tokensPendientes.add(tokenActual);
        return tokensPendientes.poll();
    }

    private Token crearToken(int tipo, String texto) {
        return new CommonToken(tipo, texto);
    }

    @Override
    public int getLine() {
        return source.getLine();
    }

    @Override
    public int getCharPositionInLine() {
        return source.getCharPositionInLine();
    }

    @Override
    public CharStream getInputStream() {
        return source.getInputStream();
    }

    @Override
    public String getSourceName() {
        return source.getSourceName();
    }

    @Override
    public void setTokenFactory(TokenFactory<?> factory) {
        source.setTokenFactory(factory);
    }

    @Override
    public TokenFactory<?> getTokenFactory() {
        return source.getTokenFactory();
    }
}