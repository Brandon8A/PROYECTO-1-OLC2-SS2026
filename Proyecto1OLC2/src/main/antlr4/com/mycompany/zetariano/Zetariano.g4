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

asignarVariable:        asignarVariablePrimitiva ';'
               |        asignarVariableArreglo ';'
               |        asignarVaribaleObjeto ';'
               ;

asignarVariablePrimitiva:   idAsignacion expresion
                        |   tipoIncremento
                        ;

asignarVariableArreglo:     idAsignacion valorArreglo
                      |     idAsignacion instanciaArreglo
                      |     asignacionPosicionArreglo
                      ;

asignarVaribaleObjeto:      idAsignacion ID
                     |      idAsignacion instanciarObjeto
                     ;

idAsignacion:        ID ASIGNACION;

valorArreglo:       '{'expresion (',' expresion)*'}';

instanciaArreglo:      NEW tipoDato tamanioArreglo;

tamanioArreglo:         '[' expresion ']' ('[' expresion ']')*;

asignacionPosicionArreglo:      ID tamanioArreglo ASIGNACION expresion;

tipoIncremento:         ID INCREMENTO
              |         ID DECREMENTO
              |         ID ASIGNACION_SUMA expresion
              |         ID ASIGNACION_RESTA expresion
              |         ID ASIGNACION_MULT expresion
              ;



declAsignVariable:      declAsignPrimitivo';'
                 |      declAsignArreglo';'
                 |      declAsignObjeto';'
                 ;

declAsignPrimitivo:     variable ASIGNACION expresion;

declAsignArreglo:       arreglo ASIGNACION valorArreglo;

declAsignObjeto:        objeto ASIGNACION instanciarObjeto;

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
     |      valorPosicionArreglo
     |      valorObjeto
     |      valorDatoObjeto
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

valorPosicionArreglo:   ID'[' expresion ']';

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

valorDatoObjeto:    accesoDatoObjeto
               |    accesoMetodo
               ;

accesoDatoObjeto:     ID '.' ID;

accesoMetodo:       accesoDatoObjeto '(' argumento? ')';

valorTernario:      condicional TERNARIO datoTernario;

condicional:        '(' expresion ')';

datoTernario:       expresion ':' expresion;



constructor:        PUBLIC tipoObjeto '(' parametro?')' seccionInstrucciones;

parametro:          variable (',' variable)*;

instrucciones:      crearVariable
             |      sentencia
             ;

sentencia:      sentenciaFuncionEspecial
         |      sentenciaInstruccion
         |      sentenciaInterrupcion
         ;

sentenciaFuncionEspecial:   imprimirConSaltoLinea
                        |   imprimiSinSaltoLinea
                        |   leerEntrada
                        ;

imprimirConSaltoLinea: PRINTLN'('expresion')'';';

imprimiSinSaltoLinea: PRINT'('expresion')'';';

leerEntrada:    READLN'('')' ';';

funcion:        funcionConRetorno
       |        funcionSinRetorno
       ;

sentenciaInstruccion:   sentenciaIf
                    |   sentenciaSwitch
                    |   sentenciaCiclo
                    ;

sentenciaIf:    condicionalIf condicionalElseIf* condicionalElse?;

condicionalIf:  IF condicional seccionInstrucciones
             |  IF condicional instrucciones
             ;


condicionalElseIf:      ELSE IF condicional seccionInstrucciones
                 |      ELSE IF condicional instrucciones
                 ;

condicionalElse:    ELSE seccionInstrucciones
               |    ELSE instrucciones
               ;

sentenciaSwitch:    SWITCH '(' ID ')' '{' instruccionesSwitch '}';

instruccionesSwitch:    caso+ default?;

caso:   CASE valorPrimitivo ':' instrucciones* (BREAK';')?;

default:    DEFAULT ':' instrucciones* BREAK';';

sentenciaCiclo:     cicloFor
              |     cicloWhile
              |     cicloDoWhile
              ;

cicloFor:   condicionalFor seccionInstrucciones;

condicionalFor:     FOR'(' (asignarVariablePrimitiva | declAsignPrimitivo)? ';' expresion? ';' tipoIncremento?')';

seccionInstrucciones:    '{' instrucciones* '}';

sentenciaInterrupcion:      CONTINUE ';'
                     |      BREAK';'
                     |      RETURN ';'
                     ;

cicloWhile:     condicionalWhile seccionInstrucciones;

condicionalWhile:   WHILE condicional;

cicloDoWhile:       instruccionesDoWhile condicionalWhile';';

instruccionesDoWhile:   DO seccionInstrucciones;

funcionSinRetorno:  PUBLIC VOID ID '('parametro?')' seccionInstrucciones;

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