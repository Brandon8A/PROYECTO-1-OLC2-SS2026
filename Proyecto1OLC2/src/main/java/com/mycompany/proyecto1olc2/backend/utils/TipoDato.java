package com.mycompany.proyecto1olc2.backend.utils;

public enum TipoDato {
    NUMERUS(5),
    DECIMALIS(4),
    TEXTUM(3),
    LITTERA(2),
    BOOL(1),
    VOID(0),
    DESCONOCIDO(-1);

    private final int JERARQUIA;

    TipoDato(int jerarquia){
        this.JERARQUIA = jerarquia;
    }

    public int getJerarquia() {
        return JERARQUIA;
    }

    //Devuelve el tipo de mayor jerarquia
    public static TipoDato mayor(TipoDato a, TipoDato b) {

        if (a == DESCONOCIDO || b == DESCONOCIDO) {
            return DESCONOCIDO;
        }

        return a.JERARQUIA >= b.JERARQUIA ? a : b;
    }

    public boolean esNumerico() {
        return this == NUMERUS
                || this == DECIMALIS
                || this == LITTERA;
    }

    public boolean esBooleano() {
        return this == BOOL;
    }

    public boolean esTextum() {
        return this == TEXTUM;
    }
}
