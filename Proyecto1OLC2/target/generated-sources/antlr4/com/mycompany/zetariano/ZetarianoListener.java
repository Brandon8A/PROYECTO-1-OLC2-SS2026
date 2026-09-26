// Generated from com/mycompany/zetariano/Zetariano.g4 by ANTLR 4.13.2
package com.mycompany.zetariano;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZetarianoParser}.
 */
public interface ZetarianoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ZetarianoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ZetarianoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#defClase}.
	 * @param ctx the parse tree
	 */
	void enterDefClase(ZetarianoParser.DefClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#defClase}.
	 * @param ctx the parse tree
	 */
	void exitDefClase(ZetarianoParser.DefClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#instruccionesClase}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionesClase(ZetarianoParser.InstruccionesClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#instruccionesClase}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionesClase(ZetarianoParser.InstruccionesClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#crearVariable}.
	 * @param ctx the parse tree
	 */
	void enterCrearVariable(ZetarianoParser.CrearVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#crearVariable}.
	 * @param ctx the parse tree
	 */
	void exitCrearVariable(ZetarianoParser.CrearVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#declararVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclararVariable(ZetarianoParser.DeclararVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#declararVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclararVariable(ZetarianoParser.DeclararVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ZetarianoParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ZetarianoParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(ZetarianoParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(ZetarianoParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#dimensionArreglo}.
	 * @param ctx the parse tree
	 */
	void enterDimensionArreglo(ZetarianoParser.DimensionArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#dimensionArreglo}.
	 * @param ctx the parse tree
	 */
	void exitDimensionArreglo(ZetarianoParser.DimensionArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(ZetarianoParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(ZetarianoParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#asignarVariable}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVariable(ZetarianoParser.AsignarVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#asignarVariable}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVariable(ZetarianoParser.AsignarVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#asignarVariablePrimitiva}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVariablePrimitiva(ZetarianoParser.AsignarVariablePrimitivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#asignarVariablePrimitiva}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVariablePrimitiva(ZetarianoParser.AsignarVariablePrimitivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#asignarVariableArreglo}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVariableArreglo(ZetarianoParser.AsignarVariableArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#asignarVariableArreglo}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVariableArreglo(ZetarianoParser.AsignarVariableArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#asignarVaribaleObjeto}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVaribaleObjeto(ZetarianoParser.AsignarVaribaleObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#asignarVaribaleObjeto}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVaribaleObjeto(ZetarianoParser.AsignarVaribaleObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#idAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterIdAsignacion(ZetarianoParser.IdAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#idAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitIdAsignacion(ZetarianoParser.IdAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#valorArreglo}.
	 * @param ctx the parse tree
	 */
	void enterValorArreglo(ZetarianoParser.ValorArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#valorArreglo}.
	 * @param ctx the parse tree
	 */
	void exitValorArreglo(ZetarianoParser.ValorArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#instanciaArreglo}.
	 * @param ctx the parse tree
	 */
	void enterInstanciaArreglo(ZetarianoParser.InstanciaArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#instanciaArreglo}.
	 * @param ctx the parse tree
	 */
	void exitInstanciaArreglo(ZetarianoParser.InstanciaArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#tamanioArreglo}.
	 * @param ctx the parse tree
	 */
	void enterTamanioArreglo(ZetarianoParser.TamanioArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#tamanioArreglo}.
	 * @param ctx the parse tree
	 */
	void exitTamanioArreglo(ZetarianoParser.TamanioArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#asignacionPosicionArreglo}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionPosicionArreglo(ZetarianoParser.AsignacionPosicionArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#asignacionPosicionArreglo}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionPosicionArreglo(ZetarianoParser.AsignacionPosicionArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#tipoIncremento}.
	 * @param ctx the parse tree
	 */
	void enterTipoIncremento(ZetarianoParser.TipoIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#tipoIncremento}.
	 * @param ctx the parse tree
	 */
	void exitTipoIncremento(ZetarianoParser.TipoIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#declAsignVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclAsignVariable(ZetarianoParser.DeclAsignVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#declAsignVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclAsignVariable(ZetarianoParser.DeclAsignVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#declAsignPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterDeclAsignPrimitivo(ZetarianoParser.DeclAsignPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#declAsignPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitDeclAsignPrimitivo(ZetarianoParser.DeclAsignPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#declAsignArreglo}.
	 * @param ctx the parse tree
	 */
	void enterDeclAsignArreglo(ZetarianoParser.DeclAsignArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#declAsignArreglo}.
	 * @param ctx the parse tree
	 */
	void exitDeclAsignArreglo(ZetarianoParser.DeclAsignArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#declAsignObjeto}.
	 * @param ctx the parse tree
	 */
	void enterDeclAsignObjeto(ZetarianoParser.DeclAsignObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#declAsignObjeto}.
	 * @param ctx the parse tree
	 */
	void exitDeclAsignObjeto(ZetarianoParser.DeclAsignObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#instanciarObjeto}.
	 * @param ctx the parse tree
	 */
	void enterInstanciarObjeto(ZetarianoParser.InstanciarObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#instanciarObjeto}.
	 * @param ctx the parse tree
	 */
	void exitInstanciarObjeto(ZetarianoParser.InstanciarObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(ZetarianoParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(ZetarianoParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ZetarianoParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ZetarianoParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#exprLogica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogica(ZetarianoParser.ExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#exprLogica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogica(ZetarianoParser.ExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(ZetarianoParser.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(ZetarianoParser.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#exprAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExprAritmetica(ZetarianoParser.ExprAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#exprAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExprAritmetica(ZetarianoParser.ExprAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(ZetarianoParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(ZetarianoParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ZetarianoParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ZetarianoParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(ZetarianoParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(ZetarianoParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#valorPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterValorPrimitivo(ZetarianoParser.ValorPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#valorPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitValorPrimitivo(ZetarianoParser.ValorPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#valorPosicionArreglo}.
	 * @param ctx the parse tree
	 */
	void enterValorPosicionArreglo(ZetarianoParser.ValorPosicionArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#valorPosicionArreglo}.
	 * @param ctx the parse tree
	 */
	void exitValorPosicionArreglo(ZetarianoParser.ValorPosicionArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#valorObjeto}.
	 * @param ctx the parse tree
	 */
	void enterValorObjeto(ZetarianoParser.ValorObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#valorObjeto}.
	 * @param ctx the parse tree
	 */
	void exitValorObjeto(ZetarianoParser.ValorObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(ZetarianoParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(ZetarianoParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterTipoPrimitivo(ZetarianoParser.TipoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitTipoPrimitivo(ZetarianoParser.TipoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#tipoObjeto}.
	 * @param ctx the parse tree
	 */
	void enterTipoObjeto(ZetarianoParser.TipoObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#tipoObjeto}.
	 * @param ctx the parse tree
	 */
	void exitTipoObjeto(ZetarianoParser.TipoObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#valorDatoObjeto}.
	 * @param ctx the parse tree
	 */
	void enterValorDatoObjeto(ZetarianoParser.ValorDatoObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#valorDatoObjeto}.
	 * @param ctx the parse tree
	 */
	void exitValorDatoObjeto(ZetarianoParser.ValorDatoObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#accesoDatoObjeto}.
	 * @param ctx the parse tree
	 */
	void enterAccesoDatoObjeto(ZetarianoParser.AccesoDatoObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#accesoDatoObjeto}.
	 * @param ctx the parse tree
	 */
	void exitAccesoDatoObjeto(ZetarianoParser.AccesoDatoObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#accesoMetodo}.
	 * @param ctx the parse tree
	 */
	void enterAccesoMetodo(ZetarianoParser.AccesoMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#accesoMetodo}.
	 * @param ctx the parse tree
	 */
	void exitAccesoMetodo(ZetarianoParser.AccesoMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#valorTernario}.
	 * @param ctx the parse tree
	 */
	void enterValorTernario(ZetarianoParser.ValorTernarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#valorTernario}.
	 * @param ctx the parse tree
	 */
	void exitValorTernario(ZetarianoParser.ValorTernarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(ZetarianoParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(ZetarianoParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#datoTernario}.
	 * @param ctx the parse tree
	 */
	void enterDatoTernario(ZetarianoParser.DatoTernarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#datoTernario}.
	 * @param ctx the parse tree
	 */
	void exitDatoTernario(ZetarianoParser.DatoTernarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(ZetarianoParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(ZetarianoParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(ZetarianoParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(ZetarianoParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(ZetarianoParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(ZetarianoParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ZetarianoParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ZetarianoParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#sentenciaFuncionEspecial}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaFuncionEspecial(ZetarianoParser.SentenciaFuncionEspecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#sentenciaFuncionEspecial}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaFuncionEspecial(ZetarianoParser.SentenciaFuncionEspecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#imprimirConSaltoLinea}.
	 * @param ctx the parse tree
	 */
	void enterImprimirConSaltoLinea(ZetarianoParser.ImprimirConSaltoLineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#imprimirConSaltoLinea}.
	 * @param ctx the parse tree
	 */
	void exitImprimirConSaltoLinea(ZetarianoParser.ImprimirConSaltoLineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#imprimiSinSaltoLinea}.
	 * @param ctx the parse tree
	 */
	void enterImprimiSinSaltoLinea(ZetarianoParser.ImprimiSinSaltoLineaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#imprimiSinSaltoLinea}.
	 * @param ctx the parse tree
	 */
	void exitImprimiSinSaltoLinea(ZetarianoParser.ImprimiSinSaltoLineaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#leerEntrada}.
	 * @param ctx the parse tree
	 */
	void enterLeerEntrada(ZetarianoParser.LeerEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#leerEntrada}.
	 * @param ctx the parse tree
	 */
	void exitLeerEntrada(ZetarianoParser.LeerEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(ZetarianoParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(ZetarianoParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#sentenciaInstruccion}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaInstruccion(ZetarianoParser.SentenciaInstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#sentenciaInstruccion}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaInstruccion(ZetarianoParser.SentenciaInstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIf(ZetarianoParser.SentenciaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIf(ZetarianoParser.SentenciaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#condicionalIf}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalIf(ZetarianoParser.CondicionalIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#condicionalIf}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalIf(ZetarianoParser.CondicionalIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#condicionalElseIf}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalElseIf(ZetarianoParser.CondicionalElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#condicionalElseIf}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalElseIf(ZetarianoParser.CondicionalElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#condicionalElse}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalElse(ZetarianoParser.CondicionalElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#condicionalElse}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalElse(ZetarianoParser.CondicionalElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#sentenciaSwitch}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaSwitch(ZetarianoParser.SentenciaSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#sentenciaSwitch}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaSwitch(ZetarianoParser.SentenciaSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#instruccionesSwitch}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionesSwitch(ZetarianoParser.InstruccionesSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#instruccionesSwitch}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionesSwitch(ZetarianoParser.InstruccionesSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#caso}.
	 * @param ctx the parse tree
	 */
	void enterCaso(ZetarianoParser.CasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#caso}.
	 * @param ctx the parse tree
	 */
	void exitCaso(ZetarianoParser.CasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#default}.
	 * @param ctx the parse tree
	 */
	void enterDefault(ZetarianoParser.DefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#default}.
	 * @param ctx the parse tree
	 */
	void exitDefault(ZetarianoParser.DefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#sentenciaCiclo}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaCiclo(ZetarianoParser.SentenciaCicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#sentenciaCiclo}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaCiclo(ZetarianoParser.SentenciaCicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void enterCicloFor(ZetarianoParser.CicloForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#cicloFor}.
	 * @param ctx the parse tree
	 */
	void exitCicloFor(ZetarianoParser.CicloForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#condicionalFor}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalFor(ZetarianoParser.CondicionalForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#condicionalFor}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalFor(ZetarianoParser.CondicionalForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#seccionInstrucciones}.
	 * @param ctx the parse tree
	 */
	void enterSeccionInstrucciones(ZetarianoParser.SeccionInstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#seccionInstrucciones}.
	 * @param ctx the parse tree
	 */
	void exitSeccionInstrucciones(ZetarianoParser.SeccionInstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#sentenciaInterrupcion}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaInterrupcion(ZetarianoParser.SentenciaInterrupcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#sentenciaInterrupcion}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaInterrupcion(ZetarianoParser.SentenciaInterrupcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void enterCicloWhile(ZetarianoParser.CicloWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#cicloWhile}.
	 * @param ctx the parse tree
	 */
	void exitCicloWhile(ZetarianoParser.CicloWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#condicionalWhile}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalWhile(ZetarianoParser.CondicionalWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#condicionalWhile}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalWhile(ZetarianoParser.CondicionalWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#cicloDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterCicloDoWhile(ZetarianoParser.CicloDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#cicloDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitCicloDoWhile(ZetarianoParser.CicloDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#instruccionesDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionesDoWhile(ZetarianoParser.InstruccionesDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#instruccionesDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionesDoWhile(ZetarianoParser.InstruccionesDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#funcionSinRetorno}.
	 * @param ctx the parse tree
	 */
	void enterFuncionSinRetorno(ZetarianoParser.FuncionSinRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#funcionSinRetorno}.
	 * @param ctx the parse tree
	 */
	void exitFuncionSinRetorno(ZetarianoParser.FuncionSinRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZetarianoParser#funcionConRetorno}.
	 * @param ctx the parse tree
	 */
	void enterFuncionConRetorno(ZetarianoParser.FuncionConRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZetarianoParser#funcionConRetorno}.
	 * @param ctx the parse tree
	 */
	void exitFuncionConRetorno(ZetarianoParser.FuncionConRetornoContext ctx);
}