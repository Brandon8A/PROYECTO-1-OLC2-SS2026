/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1olc2.backend.memoria;

import java.util.Stack;

/**
 *
 * @author brandon
 */
public class StackMemoria {
    private final Stack<MarcoStack> stack;

    public StackMemoria() {
        stack = new Stack<>();
    }
    
    /**
     * Metodo que guarda un nuevo marco
     * @param marco marco a guardar en el stack
     */
    public void push(MarcoStack marco) {
        stack.push(marco);
    }

    /**
     * Metodo que desapila un marco
     * @return retorna el ultimo marco
     */
    public MarcoStack pop() {
        return stack.pop();
    }

    /**
     * Consulta el valor del ultimo elemento
     * @return retorna el valor del ultimo elemento
     */
    public MarcoStack actual() {
        return stack.peek();
    }

    /**
     * Metodo que obtiene el stack
     * @return retorna el stack
     */
    public Stack<MarcoStack> getStack() {
        return stack;
    }
    
}
