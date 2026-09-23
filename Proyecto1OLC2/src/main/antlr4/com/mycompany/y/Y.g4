grammar Y;

tokens {
    INDENT,
    DEDENT
}

//GRAMATICA
programa:   defEstructuras? defFunciones;

defEstructuras:     PORCENTAJE ESTRUCTURAS_SECCION SALTO_LINEA estructura*;

estructura:     ESTRUCTURA ID ':' SALTO_LINEA INDENT atributo+ DEDENT;

atributo:       defDatoPrimitivo
        |       defArreglo
        |       estructuraAnidada
        ;

tipoDatoId:     tipoDato ID;

defDatoPrimitivo:  tipoDatoId SALTO_LINEA;

defArreglo:        tipoDatoId '[' expresion ']' SALTO_LINEA;

tipoDato:       ENTERO
        |       FLOTANTE
        |       CADENA
        |       CARACTER
        |       objeto
        ;

objeto:     ID;

estructuraAnidada:  tipoDatoId;

defFunciones:       PORCENTAJE FUNCIONES_SECCION SALTO_LINEA tipoFuncion+;

tipoFuncion:    funSinRetorno
           |    funConRetorno
           ;

funSinRetorno:  DEFINIR ID '(' parametro? ')' ':' SALTO_LINEA INDENT instruccion* DEDENT;

parametro:      tipoDatoId (',' tipoDatoId)*;

instruccion:    declararVariable
           |    expresion
           ;

declararVariable:   declararDatoPrimitivo
                ;

declararDatoPrimitivo:      tipoDatoId
                     |      asignacionDatoPrimitivo
                     ;

asignacionDatoPrimitivo:    tipoDatoId '=' expresion;

expresion:      exprLogica;

exprLogica:     exprLogica OR exprLogica
          |     exprLogica AND exprLogica
          |     exprRelacional
          ;

exprRelacional:     exprRelacional IGUALDAD exprAritmetica
              |     exprRelacional DESIGUALDAD exprAritmetica
              |     exprRelacional MAYOR_QUE exprAritmetica
              |     exprRelacional MENOR_QUE exprAritmetica
              |     exprRelacional MAYOR_IGUAL_QUE exprAritmetica
              |     exprRelacional MENOR_IGUAL_QUE exprAritmetica
              |     exprRelacional ASIGNACION exprAritmetica
              |     exprAritmetica
              ;

exprAritmetica:     exprAritmetica (SUMA | RESTA) termino
              |     termino
              ;

termino:     termino (MULTIPLICACION | DIVISION) factor
       |     factor
       ;

factor:     NEGACION factor         # factorNegacion
      |     RESTA factor            # factorNegativo
      |     '(' expresion ')'       # factorParentesis
      |     valor                   # factorValor
      |     ID                      # factorVariable
      ;

valor:  VALOR_ENTERO
     |  VALOR_CADENA
     |  VALOR_DECIMAL
     |  VALOR_CARACTER
     ;

funConRetorno:      DEFINIR ID '(' parametro? ')' TIPO_RETORNO tipoDato ':' SALTO_LINEA INDENT expresion* DEDENT RETORNAR expresion;




//LEXER
PORCENTAJE:                 '%';
ESTRUCTURAS_SECCION:        'estructuras';
ESTRUCTURA:                 'estructura';
ENTERO:                     'entero';
CADENA:                     'cadena';
FLOTANTE:                   'flotante';
CARACTER:                   'caracter';
FUNCIONES_SECCION:          'funciones';
DEFINIR:                    'definir';
RETORNAR:                   'retornar';
SI:                         'si';
ENTONCES:                   'entonces';
SINO:                       'sino';
CONTRARIO:                  'contrario';
ELEGIR:                     'elegir';
CASO:                       'caso';
ROMPER:                     'romper';
SIEMPRE:                    'siempre';
PARA:                       'para';
CONTINUAR:                  'continuar';
MIENTRAS:                   'mientras';
HACER:                      'hacer';
IMPRIMIR:                   'imprimir';
LEER:                       'leer';
TIPO_RETORNO:               '->';

//OPERACIONES
//ARITMETICOS
SUMA:               '+';
RESTA:              '-';
MULTIPLICACION:     '*';
DIVISION:           '/';

//RELACIONALES
IGUALDAD:           '==';
DESIGUALDAD:        '!=';
MENOR_QUE:          '<';
MAYOR_QUE:          '>';
MAYOR_IGUAL_QUE:    '>=';
MENOR_IGUAL_QUE:    '<=';
ASIGNACION:         '=';

//LOGICOS
AND:                '&&';
OR:                 '||';
NEGACION:           '!';

//ABREVIADAS
SUMA_ABREVIADA:     '++';
RESTA_ABREVIADA:    '--';

//IDENTIFICADORES
ID:                 [a-zA-Z_] [a-zA-Z_0-9]*;

//NUMEROS
VALOR_DECIMAL:            [0-9]+ '.' [0-9]+;
VALOR_ENTERO:             [0-9]+;

//TEXTO
VALOR_CARACTER:           '\'' . '\'';
VALOR_CADENA:             '"' (~["\\] | '\\' .)* '"';

//COMENTARIOS
COMENTARIO_LINEA:           '//' ~[\r\n]* -> skip;
COMENTARIO_MULTILINEA:      '##' .*? '##' -> skip;

//ESPACIOS
TAB: '\t';
SALTO_LINEA:    '\r'? '\n';
ESPACIO:        ' ' -> skip;