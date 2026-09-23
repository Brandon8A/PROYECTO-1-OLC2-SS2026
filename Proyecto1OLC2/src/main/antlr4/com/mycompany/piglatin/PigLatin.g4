grammar PigLatin;

//Gramatica
programa:   importaciones*
            defVariable?
            defPrincipal
            FINIS_PRINCIPAL;

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
defVariable:    VARIABILES MAYOR_QUE listaDeclaracion;

listaDeclaracion:   declaracionVariable*;

declaracionVariable:    declaracionDato         # declaracionPrimitiva
                    |   declaracionArreglo      # declaracionParaArreglo
                    |   declaracionObjeto       # declaracionParaObjeto
                    |   asignacion              # asignacionVariable
                    ;

declaracionDato:   ESTO ID ':' tipoDato (expresion)? ';';

tipoDato:   datoPrimitivo
        |   objeto
        ;

//TIPOS DE DATOS PRIMITIVO
datoPrimitivo:      NUMERUS
             |      TEXTUM
             |      DECIMALIS
             |      LITTERA
             |      BOOL
             ;

//Tipo de dato Objeto
objeto:     ID;

expresion:      exprLogica
         |      exprEstructura
         |      exprAccesoDatosObjeto
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

factor:     NEGACION factor         # factorNegacion
      |     RESTA factor            # factorNegativo
      |     '(' expresion ')'       # factorParentesis
      |     valor                   # factorValor
      |     accesoArreglo           # factorArreglo
      |     llamarFuncion           # factorFuncion
      |     ID                      # factorVariable
      ;

valor:  ENTERO
     |  CADENA
     |  DECIMAL
     |  CARACTER
     |  VERUM
     |  FALSUS
     ;

exprEstructura:     '{' expresion (',' expresion)*'}';

exprAccesoDatosObjeto:     objeto '.' metodoObjeto;

metodoObjeto:       ID '(' argumentos? ')';

//AGREGAR ASIGNACION DE VALORES A LOS ARREGLOS
accesoArreglo:  ID '[' expresion ']';

llamarFuncion:      ID '(' argumentos? ')';

argumentos:     expresion (',' expresion)*;



declaracionArreglo:     SERIES ID '[' expresion ']' ':' tipoArreglo inicializacionArreglo? ';';

tipoArreglo:    tipoDato
            |   objeto
            ;

inicializacionArreglo:  '{' listaValores '}';

listaValores:   expresion (',' expresion)*;


asignacion:     ID ASIGNACION expresion ';'
          |     accesoArreglo ASIGNACION expresion ';'
          ;


declaracionObjeto: ESTO objeto ':' NOVUS metodoObjeto;

//********************************************
//FUNCION PRINCIPAL Y OBLIGATORIA
//********************************************
defPrincipal:   MAIOR MAYOR_QUE instrucciones;

instrucciones:      sentencia*;

sentencia:      sentenciaFuncionesEspeciales    # sentenciaFunEspeciales
         |      sentenciaInstrucciones          # sentenciaInstr
         ;

sentenciaFuncionesEspeciales:   leerConsola         # sentenciaLeerConsola
                            |   leerGuardar         # sentenciaLeerVariable
                            |   imprimir            # sentenciaImprimir
                            ;

leerConsola:    LEER_TEXTO;

leerGuardar:    ID LEER_TEXTO;

imprimir:       IMPRIMIR_TEXTO valorImprimir (IMPRIMIR_TEXTO valorImprimir)* ';';

valorImprimir:  retorno;


sentenciaInstrucciones:     sentenciaSi         # sentenciaCondicionalSi
                      |     asignacion          # sentenciaAsignacion
                      |     ciclos              # sentenciaCiclos
                      |     sentenciaPerge      # sentenciaContinuar
                      |     sentenciaInterrumpe # sentenciaBreak
                      ;


sentenciaSi:     condicionalSi  condicionalAliter* condicionalSiNo? FINIS ';';

condicionalSi:          SI '(' expresion ')' '{' instrucciones '}';

condicionalAliter:      ALITER '(' expresion ')' '{' instrucciones '}';

condicionalSiNo:        ALITER '{' instrucciones '}';


ciclos:     cicloDum        # cicloMientras
      |     cicloFacereDum  # cicloHacerMientras
      |     cicloPer        # cicloPara
      ;

cicloDum:   condicionalDum instruccionesCiclos FINIS ';';

condicionalDum:     DUM '(' expresion ')';

cicloFacereDum:   instruccionesFacere condicionalDum ';';

instruccionesFacere:    FACERE instruccionesCiclos;

cicloPer:   condicionalPer instruccionesCiclos;

condicionalPer:     PER '('ESTO ID ':' NUMERUS expresion ';' expresion ';' incremento ')';

instruccionesCiclos:    '{' instrucciones '}';

sentenciaPerge:     PERGE ';';

sentenciaInterrumpe:    INTERRUMPE ';';

retorno:    expresion
       |    llamarFuncion
       ;

incremento:     ID SUMA_ABREVIADA
          |     ID RESTA_ABREVIADA
          ;



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