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
	 * Visit a parse tree produced by {@link PigLatinParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(PigLatinParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#listaDeclaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracion(PigLatinParser.ListaDeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#declararVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararVariable(PigLatinParser.DeclararVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PigLatinParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo(PigLatinParser.ArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#objeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto(PigLatinParser.ObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(PigLatinParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoPrimitivo(PigLatinParser.TipoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#tipoObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoObjeto(PigLatinParser.TipoObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#tipoEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEstructura(PigLatinParser.TipoEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#asignarVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVariable(PigLatinParser.AsignarVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#asignarVariablePrimitiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVariablePrimitiva(PigLatinParser.AsignarVariablePrimitivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#asignarVariableArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVariableArreglo(PigLatinParser.AsignarVariableArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valoresLlaves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValoresLlaves(PigLatinParser.ValoresLlavesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#asignarVariableObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVariableObjeto(PigLatinParser.AsignarVariableObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#instanciaObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanciaObjeto(PigLatinParser.InstanciaObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(PigLatinParser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#asignarAtributoObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarAtributoObjeto(PigLatinParser.AsignarAtributoObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#asignarVariableEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarVariableEstructura(PigLatinParser.AsignarVariableEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#declAsignVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAsignVariable(PigLatinParser.DeclAsignVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#declAsignPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAsignPrimitivo(PigLatinParser.DeclAsignPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#declAsignArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAsignArreglo(PigLatinParser.DeclAsignArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#tamanioArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTamanioArreglo(PigLatinParser.TamanioArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#declAsignObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAsignObjeto(PigLatinParser.DeclAsignObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#idAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAsignacion(PigLatinParser.IdAsignacionContext ctx);
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
	 * Visit a parse tree produced by {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PigLatinParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(PigLatinParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valorPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorPrimitivo(PigLatinParser.ValorPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valorNoPrimitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorNoPrimitivo(PigLatinParser.ValorNoPrimitivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valorVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorVariable(PigLatinParser.ValorVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valorPosicionArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorPosicionArreglo(PigLatinParser.ValorPosicionArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valorEstructura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorEstructura(PigLatinParser.ValorEstructuraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#valorObjeto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorObjeto(PigLatinParser.ValorObjetoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#accesoDatosVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoDatosVariables(PigLatinParser.AccesoDatosVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#accesoMiembro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoMiembro(PigLatinParser.AccesoMiembroContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#tipoIncremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoIncremento(PigLatinParser.TipoIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#defPrincipal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefPrincipal(PigLatinParser.DefPrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(PigLatinParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(PigLatinParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#sentenciaFuncionEspecial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaFuncionEspecial(PigLatinParser.SentenciaFuncionEspecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#funcionLeerTextoConsola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionLeerTextoConsola(PigLatinParser.FuncionLeerTextoConsolaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#leerSinGuardar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeerSinGuardar(PigLatinParser.LeerSinGuardarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#leerGuardar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeerGuardar(PigLatinParser.LeerGuardarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#funcionImprimirTexto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionImprimirTexto(PigLatinParser.FuncionImprimirTextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#imprimirTexto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirTexto(PigLatinParser.ImprimirTextoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#imprimirVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirVariable(PigLatinParser.ImprimirVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#sentenciaInstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaInstruccion(PigLatinParser.SentenciaInstruccionContext ctx);
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
	 * Visit a parse tree produced by {@link PigLatinParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(PigLatinParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#condicionalAliterSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalAliterSi(PigLatinParser.CondicionalAliterSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#condicionalAliter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalAliter(PigLatinParser.CondicionalAliterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#seccionInstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeccionInstruccion(PigLatinParser.SeccionInstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#sentenciaVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaVariable(PigLatinParser.SentenciaVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PigLatinParser#sentenciaCiclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaCiclo(PigLatinParser.SentenciaCicloContext ctx);
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
}