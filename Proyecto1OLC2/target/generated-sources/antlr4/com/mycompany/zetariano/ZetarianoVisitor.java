// Generated from com/mycompany/zetariano/Zetariano.g4 by ANTLR 4.13.2
package com.mycompany.zetariano;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZetarianoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZetarianoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ZetarianoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#defClase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefClase(ZetarianoParser.DefClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#instruccionesClase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionesClase(ZetarianoParser.InstruccionesClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#crearVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrearVariable(ZetarianoParser.CrearVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#declararVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararVariable(ZetarianoParser.DeclararVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ZetarianoParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo(ZetarianoParser.ArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#dimensionArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionArreglo(ZetarianoParser.DimensionArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(ZetarianoParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#asignarVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVariable(ZetarianoParser.AsignarVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#asignarVariablePrimitiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVariablePrimitiva(ZetarianoParser.AsignarVariablePrimitivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#asignarVariableArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVariableArreglo(ZetarianoParser.AsignarVariableArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#asignarVaribaleObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVaribaleObjeto(ZetarianoParser.AsignarVaribaleObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#idAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAsignacion(ZetarianoParser.IdAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#valorArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorArreglo(ZetarianoParser.ValorArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#instanciaArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanciaArreglo(ZetarianoParser.InstanciaArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#tamanioArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTamanioArreglo(ZetarianoParser.TamanioArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#asignacionPosicionArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionPosicionArreglo(ZetarianoParser.AsignacionPosicionArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#tipoIncremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoIncremento(ZetarianoParser.TipoIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#declAsignVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAsignVariable(ZetarianoParser.DeclAsignVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#declAsignPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAsignPrimitivo(ZetarianoParser.DeclAsignPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#declAsignArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAsignArreglo(ZetarianoParser.DeclAsignArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#declAsignObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAsignObjeto(ZetarianoParser.DeclAsignObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#instanciarObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanciarObjeto(ZetarianoParser.InstanciarObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(ZetarianoParser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(ZetarianoParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#exprLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogica(ZetarianoParser.ExprLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#exprRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional(ZetarianoParser.ExprRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#exprAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAritmetica(ZetarianoParser.ExprAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(ZetarianoParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ZetarianoParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(ZetarianoParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#valorPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorPrimitivo(ZetarianoParser.ValorPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#valorPosicionArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorPosicionArreglo(ZetarianoParser.ValorPosicionArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#valorObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorObjeto(ZetarianoParser.ValorObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(ZetarianoParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoPrimitivo(ZetarianoParser.TipoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#tipoObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoObjeto(ZetarianoParser.TipoObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#valorDatoObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorDatoObjeto(ZetarianoParser.ValorDatoObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#accesoDatoObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoDatoObjeto(ZetarianoParser.AccesoDatoObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#accesoMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoMetodo(ZetarianoParser.AccesoMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#valorTernario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorTernario(ZetarianoParser.ValorTernarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(ZetarianoParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#datoTernario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatoTernario(ZetarianoParser.DatoTernarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(ZetarianoParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(ZetarianoParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(ZetarianoParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(ZetarianoParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#sentenciaFuncionEspecial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaFuncionEspecial(ZetarianoParser.SentenciaFuncionEspecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#imprimirConSaltoLinea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirConSaltoLinea(ZetarianoParser.ImprimirConSaltoLineaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#imprimiSinSaltoLinea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimiSinSaltoLinea(ZetarianoParser.ImprimiSinSaltoLineaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#leerEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeerEntrada(ZetarianoParser.LeerEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ZetarianoParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#sentenciaInstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaInstruccion(ZetarianoParser.SentenciaInstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#sentenciaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaIf(ZetarianoParser.SentenciaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#condicionalIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalIf(ZetarianoParser.CondicionalIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#condicionalElseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalElseIf(ZetarianoParser.CondicionalElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#condicionalElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalElse(ZetarianoParser.CondicionalElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#sentenciaSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaSwitch(ZetarianoParser.SentenciaSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#instruccionesSwitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionesSwitch(ZetarianoParser.InstruccionesSwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso(ZetarianoParser.CasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault(ZetarianoParser.DefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#sentenciaCiclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaCiclo(ZetarianoParser.SentenciaCicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#cicloFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloFor(ZetarianoParser.CicloForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#condicionalFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalFor(ZetarianoParser.CondicionalForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#seccionInstrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionInstrucciones(ZetarianoParser.SeccionInstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#sentenciaInterrupcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaInterrupcion(ZetarianoParser.SentenciaInterrupcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#cicloWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloWhile(ZetarianoParser.CicloWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#condicionalWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalWhile(ZetarianoParser.CondicionalWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#cicloDoWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloDoWhile(ZetarianoParser.CicloDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#instruccionesDoWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionesDoWhile(ZetarianoParser.InstruccionesDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#funcionSinRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionSinRetorno(ZetarianoParser.FuncionSinRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZetarianoParser#funcionConRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionConRetorno(ZetarianoParser.FuncionConRetornoContext ctx);
}