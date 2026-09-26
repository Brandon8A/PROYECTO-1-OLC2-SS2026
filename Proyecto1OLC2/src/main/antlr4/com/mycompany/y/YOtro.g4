grammar YOtro;

//GRAMATICA

programa:   defEstructuras?;// defFunciones;

defEstructuras:     PORCENTAJE ESTRUCTURAS_SECCION SALTO_LINEA estructura*;

estructura:     ESTRUCTURA ID ':' SALTO_LINEA TAB variableEstructura+;

variableEstructura:     tipoDato;

tipoDato:       ENTERO
        |       FLOTANTE
        |       CADENA
        |       CARACTER
        |       objeto
        ;

objeto:     ID;

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
COMENTARIO_MULTILINEA:      '/*' .*? '*/' -> skip;

//ESPACIOS
TAB: '\t';
SALTO_LINEA:    '\r'? '\n';
ESPACIO:        ' ' -> skip;