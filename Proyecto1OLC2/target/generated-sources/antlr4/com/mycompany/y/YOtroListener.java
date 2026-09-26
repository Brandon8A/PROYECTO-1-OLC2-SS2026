// Generated from com/mycompany/y/YOtro.g4 by ANTLR 4.13.2
package com.mycompany.y;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YOtroParser}.
 */
public interface YOtroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YOtroParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(YOtroParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link YOtroParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(YOtroParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link YOtroParser#defEstructuras}.
	 * @param ctx the parse tree
	 */
	void enterDefEstructuras(YOtroParser.DefEstructurasContext ctx);
	/**
	 * Exit a parse tree produced by {@link YOtroParser#defEstructuras}.
	 * @param ctx the parse tree
	 */
	void exitDefEstructuras(YOtroParser.DefEstructurasContext ctx);
	/**
	 * Enter a parse tree produced by {@link YOtroParser#estructura}.
	 * @param ctx the parse tree
	 */
	void enterEstructura(YOtroParser.EstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link YOtroParser#estructura}.
	 * @param ctx the parse tree
	 */
	void exitEstructura(YOtroParser.EstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link YOtroParser#variableEstructura}.
	 * @param ctx the parse tree
	 */
	void enterVariableEstructura(YOtroParser.VariableEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link YOtroParser#variableEstructura}.
	 * @param ctx the parse tree
	 */
	void exitVariableEstructura(YOtroParser.VariableEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link YOtroParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(YOtroParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YOtroParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(YOtroParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link YOtroParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(YOtroParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link YOtroParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(YOtroParser.ObjetoContext ctx);
}