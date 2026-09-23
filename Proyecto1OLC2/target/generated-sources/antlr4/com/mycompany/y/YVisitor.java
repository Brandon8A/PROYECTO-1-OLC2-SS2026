// Generated from com/mycompany/y/Y.g4 by ANTLR 4.13.2
package com.mycompany.y;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(YParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#defEstructuras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefEstructuras(YParser.DefEstructurasContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(YParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#atributo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributo(YParser.AtributoContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#tipoDatoId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDatoId(YParser.TipoDatoIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#defDatoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefDatoPrimitivo(YParser.DefDatoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#defArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefArreglo(YParser.DefArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(YParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(YParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#estructuraAnidada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraAnidada(YParser.EstructuraAnidadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#defFunciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunciones(YParser.DefFuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#tipoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoFuncion(YParser.TipoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#funSinRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunSinRetorno(YParser.FunSinRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(YParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(YParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#declararVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararVariable(YParser.DeclararVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#declararDatoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararDatoPrimitivo(YParser.DeclararDatoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#asignacionDatoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionDatoPrimitivo(YParser.AsignacionDatoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(YParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#exprLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogica(YParser.ExprLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#exprRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional(YParser.ExprRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#exprAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAritmetica(YParser.ExprAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(YParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorNegacion}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNegacion(YParser.FactorNegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorNegativo}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNegativo(YParser.FactorNegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorParentesis}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorParentesis(YParser.FactorParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorValor}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorValor(YParser.FactorValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorVariable}
	 * labeled alternative in {@link YParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorVariable(YParser.FactorVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(YParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link YParser#funConRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunConRetorno(YParser.FunConRetornoContext ctx);
}