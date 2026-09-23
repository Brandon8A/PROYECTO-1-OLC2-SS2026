grammar Zetariano;

//GRAMATICA
programa:   defClase;

defClase:   PUBLIC CLASS ID '{' instruccionesClase '}';

instruccionesClase:  crearVariable* constructor* funcion*;

crearVariable:      declararVariable
             |      asignarVariable
             |      declAsignVariable
             ;

declararVariable:   variable ';'
                |   arreglo ';'
                |   objeto ';'
                ;

variable:      tipoDato ID;

arreglo:        tipoDato dimensionArreglo+ ID;

dimensionArreglo:   '['']';

objeto:         tipoObjeto ID;

asignarVariable:        asignacion expresion ';'
               |        tipoIncremento ';'
               |        asignacion valorArreglo ';'
               |        asignacion ID ';'
               |        asignacion instanciarObjeto ';'
               ;

asignacion:        ID ASIGNACION;

valorArreglo:       '{'expresion (',' expresion)*'}';

tipoIncremento:         ID INCREMENTO
              |         ID DECREMENTO
              |         ID ASIGNACION_SUMA expresion
              |         ID ASIGNACION_RESTA expresion
              |         ID ASIGNACION_MULT expresion
              ;



declAsignVariable:      variable ASIGNACION expresion';'
                 |      arreglo ASIGNACION valorArreglo ';'
                 |      objeto ASIGNACION instanciarObjeto';'
                 ;

instanciarObjeto:       NEW tipoObjeto '(' argumento? ')';

argumento:          expresion (',' expresion)*;

expresion:      exprLogica
         ;

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

termino:     termino (MULTIPLICACION | DIVISION | MODULO) factor
       |     factor
       ;

factor:     NEGACION factor
      |     RESTA factor
      |     '(' expresion ')'
      |     valor
      ;

valor:      valorPrimitivo
     |      valorObjeto
     |      valorTernario
     ;

valorPrimitivo:     ENTERO
              |     CADENA
              |     DECIMAL
              |     CARACTER
              |     TRUE
              |     FALSE
              |     NULL
              ;

valorObjeto:    tipoObjeto;

tipoDato:       tipoPrimitivo
        |       tipoObjeto
        ;

tipoPrimitivo:      STRING
             |      INT
             |      CHAR
             |      BOOLEAN
             |      DOUBLE
             ;

tipoObjeto:     ID;

valorTernario:      condicional TERNARIO datoTernario;

condicional:        '(' expresion ')';

datoTernario:       expresion ':' expresion;









constructor:        PUBLIC tipoObjeto '(' parametro?')' '{' instrucciones* '}';

parametro:          variable (',' variable)*;

instrucciones:      crearVariable;









funcion:        funcionConRetorno
       |        funcionSinRetorno
       ;

funcionSinRetorno:  PUBLIC VOID ID '('parametro?')' '{' instrucciones* '}';

funcionConRetorno:  PUBLIC tipoDato ID '('parametro?')' '{' instrucciones* RETURN expresion ';''}';




//LEXER
PUBLIC:         'public';
CLASS:          'class';
STRING:         'String';
INT:            'int';
VOID:           'void';
RETURN:         'return';
BOOLEAN:        'boolean';
IF:             'if';
NULL:           'null';
DOUBLE:         'double';
CHAR:           'char';
TRUE:           'true';
FALSE:          'false';
NEW:            'new';
ELSE:           'else';
SWITCH:         'switch';
CASE:           'case';
DEFAULT:        'default';
BREAK:          'break';
FOR:            'for';
CONTINUE:       'continue';
WHILE:          'while';
DO:             'do';
PRINTLN:        'println';
PRINT:          'print';
READLN:         'readln';

//ASIGNACION
ASIGNACION:         '=';
ASIGNACION_SUMA:    '+=';
ASIGNACION_RESTA:   '-=';
ASIGNACION_MULT:    '*=';

//OPERACIONES
//ARITMETICOS
SUMA:               '+';
RESTA:              '-';
MULTIPLICACION:     '*';
DIVISION:           '/';
MODULO:             '%';

//RELACIONALES
IGUALDAD:           '==';
DESIGUALDAD:        '!=';
MENOR_QUE:          '<';
MAYOR_QUE:          '>';
MAYOR_IGUAL_QUE:    '>=';
MENOR_IGUAL_QUE:    '<=';
NEGACION:           '!';
TERNARIO:           '?';

//LOGICOS
AND:                '&&';
OR:                 '||';

//INCREMENTOS
INCREMENTO:         '++';
DECREMENTO:         '--';


//IDENTIFICADORES
ID:                 [a-zA-Z_] [a-zA-Z_0-9]*;

//NUMEROS
DECIMAL:            [0-9]+ '.' [0-9]+;
ENTERO:             [0-9]+;

//TEXTO
CARACTER:           '\'' . '\'';
CADENA:             '"' (~["\\] | '\\' .)* '"';

//ESPACIOS
ESPACIO:            [ \t\r\n]+ -> skip;

COMENTARIO_LINEA:   '//' ~[\r\n]* -> skip;
COMENTARIO_MULTILINEA: '/*' .*? '*/' -> skip;