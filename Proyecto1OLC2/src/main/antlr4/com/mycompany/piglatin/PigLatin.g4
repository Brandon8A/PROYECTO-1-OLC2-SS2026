grammar PigLatin;

//Gramatica
programa:   importaciones*
            defVariable?
            defPrincipal
            FINIS_PRINCIPAL';';

importaciones:  IMPORT path;

path:   (rutaCarpetas'.')*nombreArchivo;

rutaCarpetas:   ID;

nombreArchivo:  ID extensionArchivo;

extensionArchivo:   '.z'
                |   '.y'
                ;

//************************************************
//DEFINICION DE VARIBLES GLOBALES
//***********************************************
defVariable:    VARIABILES MAYOR_QUE variables;

variables:  listaDeclaracion*;

listaDeclaracion:   declararVariable
                |   asignarVariable
                |   declAsignVariable
                ;

declararVariable:   variable ';'
                |   arreglo ';'
                |   objeto ';'
                ;

variable:   ESTO ID ':' tipoDato;

arreglo:    SERIES ID tamanioArreglo ':' tipoDato;

objeto:     ESTO ID ':' tipoObjeto;

//dimensionArreglo:   '['']' ('['']')*;

tipoDato:   tipoPrimitivo
        |   tipoObjeto
        |   tipoEstructura
        ;

//TIPOS DE DATOS PRIMITIVO
tipoPrimitivo:      NUMERUS
             |      TEXTUM
             |      DECIMALIS
             |      LITTERA
             |      BOOL
             ;

tipoObjeto: ID;

tipoEstructura: ID;

asignarVariable:    asignarVariablePrimitiva';'
               |    asignarVariableArreglo ';'
               |    asignarVariableObjeto';'
               |    asignarVariableEstructura ';'
               ;

asignarVariablePrimitiva:   idAsignacion expresion
                        |   tipoIncremento
                        ;

asignarVariableArreglo:     idAsignacion valoresLlaves
                      |     ID tamanioArreglo ASIGNACION expresion
                      ;

valoresLlaves:       '{'expresion (',' expresion)*'}';

asignarVariableObjeto:      idAsignacion tipoObjeto
                     |      idAsignacion instanciaObjeto
                     |      asignarAtributoObjeto
                     ;

instanciaObjeto:    NOVUS tipoObjeto'(' argumento? ')';

argumento:          expresion (',' expresion)*;

//asignarAtributoObjeto:      accesoDatoVariable ASIGNACION expresion;
asignarAtributoObjeto:      accesoDatosVariables ASIGNACION expresion;

asignarVariableEstructura:      ESTO ID ':' tipoEstructura valoresLlaves;

declAsignVariable:      declAsignPrimitivo ';'
                 |      declAsignArreglo';'
                 |      declAsignObjeto';'
                 ;

declAsignPrimitivo:     ESTO ID ':' tipoPrimitivo expresion;

declAsignArreglo:       SERIES ID tamanioArreglo ':' tipoDato valoresLlaves;

tamanioArreglo:         '[' expresion ']' ('[' expresion ']')*;

declAsignObjeto:        ESTO ID ':' instanciaObjeto;

idAsignacion:   ID ASIGNACION;

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

termino:     termino (MULTIPLICACION | DIVISION) factor
       |     factor
       ;

factor:     NEGACION factor
      |     RESTA factor
      |     '(' expresion ')'
      |     valor
      ;

valor:      valorPrimitivo
     |      valorNoPrimitivo
     ;

valorPrimitivo:     ENTERO
              |     CADENA
              |     DECIMAL
              |     CARACTER
              |     VERUM
              |     FALSUS
              ;

valorNoPrimitivo:       valorVariable
                |       valorPosicionArreglo
                |       valorEstructura
                //|       valorDatoVariable
                |       valorObjeto
                |       accesoDatosVariables
                ;

valorVariable:  ID;

valorPosicionArreglo:   ID'[' expresion ']';

valorEstructura:    valoresLlaves;
/*
valorDatoVariable:    accesoDatoVariable
                 |    accesoMetodoVariable
                 ;

accesoDatoVariable:     ID '.' ID;

accesoMetodoVariable:   accesoDatoVariable '(' argumento? ')';
*/

valorObjeto:    instanciaObjeto;

accesoDatosVariables:   ID accesoMiembro+;

accesoMiembro:      '.' ID
             |      '.' ID '(' argumento? ')'
             |      tamanioArreglo
             ;

tipoIncremento:     ID SUMA_ABREVIADA
              |     ID RESTA_ABREVIADA
              ;







defPrincipal:   MAIOR MAYOR_QUE instruccion;

instruccion:    sentencia*;

sentencia:      sentenciaFuncionEspecial
         |      sentenciaInstruccion;

sentenciaFuncionEspecial:    funcionLeerTextoConsola
                        |    funcionImprimirTexto ';'
                        ;

funcionLeerTextoConsola:    leerSinGuardar
                       |    leerGuardar
                       ;

leerSinGuardar:     LEER_TEXTO;

leerGuardar:        ID LEER_TEXTO;

funcionImprimirTexto:   imprimirTexto
                    |   imprimirVariable
                    ;

imprimirTexto:      IMPRIMIR_TEXTO CADENA;

imprimirVariable:   IMPRIMIR_TEXTO ID (IMPRIMIR_TEXTO ID)*;

sentenciaInstruccion:   sentenciaSi
                    |   sentenciaVariable
                    |   sentenciaCiclo
                    ;

sentenciaSi:    condicionalSi condicionalAliterSi* condicionalAliter? FINIS ';';

condicionalSi:  SI condicional seccionInstruccion;

condicional:    '(' expresion ')';

condicionalAliterSi:    ALITER condicional seccionInstruccion;

condicionalAliter:      ALITER seccionInstruccion;

seccionInstruccion:     '{' instruccion '}';

sentenciaVariable:      asignarVariable;

sentenciaCiclo:     cicloDum
              |     cicloFacereDum
              |     cicloPer
              ;

cicloDum:       condicionalDum seccionInstruccion FINIS';';

condicionalDum:     DUM'(' expresion ')';

cicloFacereDum:     FACERE seccionInstruccion condicionalDum ';';

cicloPer:       PER condicionalPer seccionInstruccion;

condicionalPer:     '(' (asignarVariablePrimitiva | declAsignPrimitivo) ';' expresion ';' tipoIncremento ')';


//Lexer
//Palabras reservadas
FINIS_PRINCIPAL:    'FINIS';
NUMERUS:            'numerus';
TEXTUM:             'textum';
DECIMALIS:          'decimalis';
LITTERA:            'littera';
ESTO:               'esto';
SERIES:             'series';
VERUM:              'verum';
FALSUS:             'falsus';
STRUCTURA:          'structura';
SI:                 'si';
FINIS:              'finis';
ALITER:             'aliter';
DUM:                'dum';
FACERE:             'facere';
PER:                'per';
ACTIO:              'actio';
VARIABILES:         'VARIABILES';
MUNERA:             'MUNERA';
MAIOR:              'MAIOR';
RATIO:              'ratio';
REDDERE:            'reddere';
NEGACION:           'non';
BOOL:               'bool';
PERGE:              'perge';
INTERRUMPE:         'interrumpe';
NOVUS:              'novus';
IMPORT:             'import';


//OPERACIONES
//ARITMETICOS
SUMA:               '+';
RESTA:              '-';
MULTIPLICACION:     '*';
DIVISION:           '/';

//TEXTO EN CONSOLA
LEER_TEXTO:         '<<';
IMPRIMIR_TEXTO:     '>>';

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

//ABREVIADAS
SUMA_ABREVIADA:     '++';
RESTA_ABREVIADA:    '--';

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

COMENTARIO_MULTILINEA: '##' .*? '##' -> skip;