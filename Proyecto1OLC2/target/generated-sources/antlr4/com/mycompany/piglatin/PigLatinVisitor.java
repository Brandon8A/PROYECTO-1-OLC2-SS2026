// Generated from com/mycompany/piglatin/PigLatin.g4 by ANTLR 4.13.2
package com.mycompany.piglatin;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PigLatinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PigLatinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PigLatinParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#importaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportaciones(PigLatinParser.ImportacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(PigLatinParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#rutaCarpetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRutaCarpetas(PigLatinParser.RutaCarpetasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#nombreArchivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreArchivo(PigLatinParser.NombreArchivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#extensionArchivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionArchivo(PigLatinParser.ExtensionArchivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#defVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefVariable(PigLatinParser.DefVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#listaDeclaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracion(PigLatinParser.ListaDeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionPrimitiva}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionPrimitiva(PigLatinParser.DeclaracionPrimitivaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionParaArreglo}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionParaArreglo(PigLatinParser.DeclaracionParaArregloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaracionParaObjeto}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionParaObjeto(PigLatinParser.DeclaracionParaObjetoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacionVariable}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionVariable(PigLatinParser.AsignacionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#declaracionDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionDato(PigLatinParser.DeclaracionDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(PigLatinParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#datoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatoPrimitivo(PigLatinParser.DatoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(PigLatinParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(PigLatinParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#exprLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogica(PigLatinParser.ExprLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#exprRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional(PigLatinParser.ExprRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#exprAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAritmetica(PigLatinParser.ExprAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(PigLatinParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorNegacion}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNegacion(PigLatinParser.FactorNegacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorNegativo}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorNegativo(PigLatinParser.FactorNegativoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorParentesis}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorParentesis(PigLatinParser.FactorParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorValor}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorValor(PigLatinParser.FactorValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorArreglo}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorArreglo(PigLatinParser.FactorArregloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorFuncion}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorFuncion(PigLatinParser.FactorFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorVariable}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorVariable(PigLatinParser.FactorVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(PigLatinParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#exprEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEstructura(PigLatinParser.ExprEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#exprAccesoDatosObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAccesoDatosObjeto(PigLatinParser.ExprAccesoDatosObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#metodoObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoObjeto(PigLatinParser.MetodoObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#accesoArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoArreglo(PigLatinParser.AccesoArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#llamarFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamarFuncion(PigLatinParser.LlamarFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(PigLatinParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#declaracionArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionArreglo(PigLatinParser.DeclaracionArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#tipoArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoArreglo(PigLatinParser.TipoArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#inicializacionArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacionArreglo(PigLatinParser.InicializacionArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#listaValores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaValores(PigLatinParser.ListaValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PigLatinParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#declaracionObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionObjeto(PigLatinParser.DeclaracionObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#defPrincipal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefPrincipal(PigLatinParser.DefPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(PigLatinParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaFunEspeciales}
	 * labeled alternative in {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaFunEspeciales(PigLatinParser.SentenciaFunEspecialesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaInstr}
	 * labeled alternative in {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaInstr(PigLatinParser.SentenciaInstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaLeerConsola}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaLeerConsola(PigLatinParser.SentenciaLeerConsolaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaLeerVariable}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaLeerVariable(PigLatinParser.SentenciaLeerVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaImprimir}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaImprimir(PigLatinParser.SentenciaImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#leerConsola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeerConsola(PigLatinParser.LeerConsolaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#leerGuardar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeerGuardar(PigLatinParser.LeerGuardarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(PigLatinParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valorImprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorImprimir(PigLatinParser.ValorImprimirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaCondicionalSi}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaCondicionalSi(PigLatinParser.SentenciaCondicionalSiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaAsignacion}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaAsignacion(PigLatinParser.SentenciaAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaCiclos}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaCiclos(PigLatinParser.SentenciaCiclosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaContinuar}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaContinuar(PigLatinParser.SentenciaContinuarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sentenciaBreak}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaBreak(PigLatinParser.SentenciaBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#sentenciaSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaSi(PigLatinParser.SentenciaSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#condicionalSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalSi(PigLatinParser.CondicionalSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#condicionalAliter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalAliter(PigLatinParser.CondicionalAliterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#condicionalSiNo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalSiNo(PigLatinParser.CondicionalSiNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cicloMientras}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloMientras(PigLatinParser.CicloMientrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cicloHacerMientras}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloHacerMientras(PigLatinParser.CicloHacerMientrasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cicloPara}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloPara(PigLatinParser.CicloParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#cicloDum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloDum(PigLatinParser.CicloDumContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#condicionalDum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalDum(PigLatinParser.CondicionalDumContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#cicloFacereDum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloFacereDum(PigLatinParser.CicloFacereDumContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#instruccionesFacere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionesFacere(PigLatinParser.InstruccionesFacereContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#cicloPer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCicloPer(PigLatinParser.CicloPerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#condicionalPer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalPer(PigLatinParser.CondicionalPerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#instruccionesCiclos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionesCiclos(PigLatinParser.InstruccionesCiclosContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#sentenciaPerge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaPerge(PigLatinParser.SentenciaPergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#sentenciaInterrumpe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaInterrumpe(PigLatinParser.SentenciaInterrumpeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(PigLatinParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(PigLatinParser.IncrementoContext ctx);
}