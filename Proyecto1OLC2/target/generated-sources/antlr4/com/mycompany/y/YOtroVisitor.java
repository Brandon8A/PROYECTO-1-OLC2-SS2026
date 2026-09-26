// Generated from com/mycompany/y/YOtro.g4 by ANTLR 4.13.2
package com.mycompany.y;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YOtroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YOtroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YOtroParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(YOtroParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link YOtroParser#defEstructuras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefEstructuras(YOtroParser.DefEstructurasContext ctx);
	/**
	 * Visit a parse tree produced by {@link YOtroParser#estructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura(YOtroParser.EstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link YOtroParser#variableEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableEstructura(YOtroParser.VariableEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link YOtroParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(YOtroParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link YOtroParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(YOtroParser.ObjetoContext ctx);
}