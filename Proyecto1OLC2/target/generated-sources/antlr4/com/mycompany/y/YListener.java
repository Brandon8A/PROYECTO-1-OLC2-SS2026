// Generated from com/mycompany/y/Y.g4 by ANTLR 4.13.2
package com.mycompany.y;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YParser}.
 */
public interface YListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(YParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(YParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#defEstructuras}.
	 * @param ctx the parse tree
	 */
	void enterDefEstructuras(YParser.DefEstructurasContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#defEstructuras}.
	 * @param ctx the parse tree
	 */
	void exitDefEstructuras(YParser.DefEstructurasContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(YParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(YParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#atributo}.
	 * @param ctx the parse tree
	 */
	void enterAtributo(YParser.AtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#atributo}.
	 * @param ctx the parse tree
	 */
	void exitAtributo(YParser.AtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#tipoDatoId}.
	 * @param ctx the parse tree
	 */
	void enterTipoDatoId(YParser.TipoDatoIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#tipoDatoId}.
	 * @param ctx the parse tree
	 */
	void exitTipoDatoId(YParser.TipoDatoIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#defDatoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterDefDatoPrimitivo(YParser.DefDatoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#defDatoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitDefDatoPrimitivo(YParser.DefDatoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#defArreglo}.
	 * @param ctx the parse tree
	 */
	void enterDefArreglo(YParser.DefArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#defArreglo}.
	 * @param ctx the parse tree
	 */
	void exitDefArreglo(YParser.DefArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(YParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(YParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(YParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(YParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#estructuraAnidada}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraAnidada(YParser.EstructuraAnidadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#estructuraAnidada}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraAnidada(YParser.EstructuraAnidadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#defFunciones}.
	 * @param ctx the parse tree
	 */
	void enterDefFunciones(YParser.DefFuncionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#defFunciones}.
	 * @param ctx the parse tree
	 */
	void exitDefFunciones(YParser.DefFuncionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#tipoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterTipoFuncion(YParser.TipoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#tipoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitTipoFuncion(YParser.TipoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#funSinRetorno}.
	 * @param ctx the parse tree
	 */
	void enterFunSinRetorno(YParser.FunSinRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#funSinRetorno}.
	 * @param ctx the parse tree
	 */
	void exitFunSinRetorno(YParser.FunSinRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(YParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(YParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(YParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(YParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#declararVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclararVariable(YParser.DeclararVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#declararVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclararVariable(YParser.DeclararVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#declararDatoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterDeclararDatoPrimitivo(YParser.DeclararDatoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#declararDatoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitDeclararDatoPrimitivo(YParser.DeclararDatoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#asignacionDatoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionDatoPrimitivo(YParser.AsignacionDatoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#asignacionDatoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionDatoPrimitivo(YParser.AsignacionDatoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(YParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(YParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#exprLogica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogica(YParser.ExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#exprLogica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogica(YParser.ExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(YParser.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(YParser.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#exprAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExprAritmetica(YParser.ExprAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#exprAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExprAritmetica(YParser.ExprAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(YParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(YParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorNegacion}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNegacion(YParser.FactorNegacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNegacion}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNegacion(YParser.FactorNegacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorNegativo}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNegativo(YParser.FactorNegativoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNegativo}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNegativo(YParser.FactorNegativoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorParentesis}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorParentesis(YParser.FactorParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorParentesis}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorParentesis(YParser.FactorParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorValor}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorValor(YParser.FactorValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorValor}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorValor(YParser.FactorValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorVariable}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorVariable(YParser.FactorVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorVariable}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorVariable(YParser.FactorVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(YParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(YParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link YParser#funConRetorno}.
	 * @param ctx the parse tree
	 */
	void enterFunConRetorno(YParser.FunConRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YParser#funConRetorno}.
	 * @param ctx the parse tree
	 */
	void exitFunConRetorno(YParser.FunConRetornoContext ctx);
}