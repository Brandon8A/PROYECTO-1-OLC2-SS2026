grammar Zetariano;

//GRAMATICA
programa:   defClase;

defClase:   PUBLIC CLASS ID '{' instruccionesClase '}';

instruccionesClase:  variable* constructor* funcion*;

variable:   declararVariable ';'
        |   asignacionVariable ';'
        ;

declararVariable:   tipoDato ID
                |   declararArreglo
                ;

asignacionVariable:     declararVariable ASIGNACION tipoAsignacion
                  |     ID ASIGNACION tipoAsignacion
                  |     asignacionIncremento tipoAsignacion
                  |     arreglo
                  |     asignacionTernario
                  |     objeto
                  ;

tipoDato:   STRING
        |   INT
        |   CHAR
        |   BOOLEAN
        |   DOUBLE
        |   tipoObjeto
        ;

tipoObjeto: ID;

tipoAsignacion:     expresion
              |     tipoObjeto
              |     instanciaObjeto
              |     accesoDatosObjeto
              |     posicionArreglo
              ;

instanciaObjeto:    NEW tipoObjeto'(' argumento ')';

expresion:      exprLogica
         |      ternario
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

factor:     NEGACION factor         # factorNegacion
      |     RESTA factor            # factorNegativo
      |     '(' expresion ')'       # factorParentesis
      |     valor                   # factorValor
      |     incremento              # factorIncremento
      |     ID                      # factorVariable
      |     posicionArreglo         # factorPosicionArreglo
      |     datosObjeto       # factorDatoObjeto
      |     accesoDatosObjeto   # factorAccesoDatosObjeto
      ;

valor:  ENTERO
     |  CADENA
     |  DECIMAL
     |  CARACTER
     |  TRUE
     |  FALSE
     |  NULL
     ;

incremento:     ID INCREMENTO
          |     ID DECREMENTO
          ;

asignacionIncremento:     ID ASIGNACION_SUMA
                    |     ID ASIGNACION_RESTA
                    |     ID ASIGNACION_MULT
                    ;

accesoDatosObjeto:     tipoObjeto '.' datosObjeto;

datosObjeto:      accesoAtributo
                 |      accesoFuncion
                 ;

accesoAtributo:   ID;

accesoFuncion:    ID '(' argumento? ')';

argumento:  expresion (',' expresion)*;

declararArreglo:    tipoDato dimensionArreglo+ ID;

instanciaArreglo:   declararArreglo ASIGNACION NEW tipoDato definirDimensionArreglo;

inicializarArreglo:     declararArreglo ASIGNACION dimensionValoresArreglo;

posicionArreglo:    ID '['expresion']';

asignacionPosicionArreglo:  posicionArreglo ASIGNACION expresion;

dimensionValoresArreglo:    '{' valoresArreglo '}' (',' '{' valoresArreglo '}')*;

valoresArreglo:     expresion (',' expresion)*;

dimensionArreglo:   '['']';

arreglo:    declararArreglo
       |    instanciaArreglo
       |    inicializarArreglo
       |    posicionArreglo
       |    asignacionPosicionArreglo
       ;

definirDimensionArreglo:    ('['ENTERO']')+;

objeto:     declararObjeto
      |     instanciarNuevoObjeto
      |     datosObjeto
      |     asignacionAtributoObjeto
      ;

instanciarNuevoObjeto:      declararObjeto instanciaObjeto;

declararObjeto:     tipoObjeto ID;

asignacionAtributoObjeto:   tipoObjeto '.' accesoAtributo;

asignacionTernario:     condicionalTernario TERNARIO valoresTernario;

ternario:       condicionalTernario TERNARIO exprAritmetica ':' exprAritmetica;

condicionalTernario:    exprLogica
                   |    '('exprLogica')'
                   ;

valoresTernario:    exprAritmetica ':' exprAritmetica;

constructor:        PUBLIC tipoObjeto '(' parametro*')' '{' instrucciones* '}';

parametro:      declararVariable (',' declararVariable)*;

instrucciones:      variable
             |      llamarFuncion ';'
             |      sentencia
             |      sentenciaReturn ';'
             |      sentenciaBreak ';'
             |      sentenciaContinue';'
             |      incremento ';'
             |      expresion
             ;

llamarFuncion:      accesoFuncion;

sentencia:      sentenciaFuncionEspecial
         |      sentenciaInstruccion
         ;

sentenciaFuncionEspecial:   imprimirConSaltoLinea
                        |   imprimiSinSaltoLinea
                        |   leerEntrada
                        ;

imprimirConSaltoLinea: PRINTLN'('expresion')'';';

imprimiSinSaltoLinea: PRINT'('expresion')'';';

leerEntrada:    READLN'('')';

sentenciaInstruccion:   sentenciaIf
                    |   variable
                    |   sentenciaSwitch
                    |   ciclos
                    ;

sentenciaIf:    condicionalIf condicionalElseIf* condicionalElse?;

condicionalIf:  IF'('expresion')' '{' instrucciones* '}'
             |  IF'('expresion')' instrucciones
             ;


condicionalElseIf:      ELSE IF'('expresion')' '{' instrucciones* '}'
                 |      ELSE IF'('expresion')'  instrucciones
                 ;

condicionalElse:    ELSE '{' instrucciones* '}'
               |    ELSE instrucciones
               ;

sentenciaSwitch:    SWITCH '(' ID ')' '{' instruccionesSwitch '}';

instruccionesSwitch:    caso+ default?;

caso:   CASE valor ':' instrucciones* (BREAK';')?;

default:    DEFAULT ':' instrucciones* BREAK';';

ciclos:     cicloFor
      |     cicloWhile
      |     cicloDoWhile
      ;

cicloFor:   condicionalFor instruccionesCiclos;

condicionalFor:     FOR'(' asignacionVariable? ';' expresion? ';' incremento')';

instruccionesCiclos:    '{' instrucciones '}';

cicloWhile:     condicionalWhile instruccionesCiclos;

condicionalWhile:   WHILE'(' expresion ')';

cicloDoWhile:       instruccionesDoWhile condicionalWhile';';

instruccionesDoWhile:   DO instruccionesCiclos;

sentenciaReturn:    RETURN;

sentenciaBreak:     BREAK;

sentenciaContinue:  CONTINUE;

funcion:    funcionConRetorno
       |    funcionSinRetorno
       ;

funcionSinRetorno:  PUBLIC VOID ID '('parametro*')' '{' instrucciones* '}';

funcionConRetorno:  PUBLIC tipoDato ID '('parametro*')' '{' instrucciones* RETURN expresion ';''}';




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