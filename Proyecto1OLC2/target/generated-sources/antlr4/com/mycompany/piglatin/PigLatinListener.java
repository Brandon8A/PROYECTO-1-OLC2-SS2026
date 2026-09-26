// Generated from com/mycompany/piglatin/PigLatin.g4 by ANTLR 4.13.2
package com.mycompany.piglatin;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PigLatinParser}.
 */
public interface PigLatinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PigLatinParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PigLatinParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#importaciones}.
	 * @param ctx the parse tree
	 */
	void enterImportaciones(PigLatinParser.ImportacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#importaciones}.
	 * @param ctx the parse tree
	 */
	void exitImportaciones(PigLatinParser.ImportacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(PigLatinParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(PigLatinParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#rutaCarpetas}.
	 * @param ctx the parse tree
	 */
	void enterRutaCarpetas(PigLatinParser.RutaCarpetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#rutaCarpetas}.
	 * @param ctx the parse tree
	 */
	void exitRutaCarpetas(PigLatinParser.RutaCarpetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#nombreArchivo}.
	 * @param ctx the parse tree
	 */
	void enterNombreArchivo(PigLatinParser.NombreArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#nombreArchivo}.
	 * @param ctx the parse tree
	 */
	void exitNombreArchivo(PigLatinParser.NombreArchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#extensionArchivo}.
	 * @param ctx the parse tree
	 */
	void enterExtensionArchivo(PigLatinParser.ExtensionArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#extensionArchivo}.
	 * @param ctx the parse tree
	 */
	void exitExtensionArchivo(PigLatinParser.ExtensionArchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#defVariable}.
	 * @param ctx the parse tree
	 */
	void enterDefVariable(PigLatinParser.DefVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#defVariable}.
	 * @param ctx the parse tree
	 */
	void exitDefVariable(PigLatinParser.DefVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(PigLatinParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(PigLatinParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#listaDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracion(PigLatinParser.ListaDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#listaDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracion(PigLatinParser.ListaDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#declararVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclararVariable(PigLatinParser.DeclararVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#declararVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclararVariable(PigLatinParser.DeclararVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PigLatinParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PigLatinParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(PigLatinParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(PigLatinParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#objeto}.
	 * @param ctx the parse tree
	 */
	void enterObjeto(PigLatinParser.ObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#objeto}.
	 * @param ctx the parse tree
	 */
	void exitObjeto(PigLatinParser.ObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(PigLatinParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(PigLatinParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterTipoPrimitivo(PigLatinParser.TipoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#tipoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitTipoPrimitivo(PigLatinParser.TipoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#tipoObjeto}.
	 * @param ctx the parse tree
	 */
	void enterTipoObjeto(PigLatinParser.TipoObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#tipoObjeto}.
	 * @param ctx the parse tree
	 */
	void exitTipoObjeto(PigLatinParser.TipoObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#tipoEstructura}.
	 * @param ctx the parse tree
	 */
	void enterTipoEstructura(PigLatinParser.TipoEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#tipoEstructura}.
	 * @param ctx the parse tree
	 */
	void exitTipoEstructura(PigLatinParser.TipoEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#asignarVariable}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVariable(PigLatinParser.AsignarVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#asignarVariable}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVariable(PigLatinParser.AsignarVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#asignarVariablePrimitiva}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVariablePrimitiva(PigLatinParser.AsignarVariablePrimitivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#asignarVariablePrimitiva}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVariablePrimitiva(PigLatinParser.AsignarVariablePrimitivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#asignarVariableArreglo}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVariableArreglo(PigLatinParser.AsignarVariableArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#asignarVariableArreglo}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVariableArreglo(PigLatinParser.AsignarVariableArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valoresLlaves}.
	 * @param ctx the parse tree
	 */
	void enterValoresLlaves(PigLatinParser.ValoresLlavesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valoresLlaves}.
	 * @param ctx the parse tree
	 */
	void exitValoresLlaves(PigLatinParser.ValoresLlavesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#asignarVariableObjeto}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVariableObjeto(PigLatinParser.AsignarVariableObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#asignarVariableObjeto}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVariableObjeto(PigLatinParser.AsignarVariableObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#instanciaObjeto}.
	 * @param ctx the parse tree
	 */
	void enterInstanciaObjeto(PigLatinParser.InstanciaObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#instanciaObjeto}.
	 * @param ctx the parse tree
	 */
	void exitInstanciaObjeto(PigLatinParser.InstanciaObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(PigLatinParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(PigLatinParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#asignarAtributoObjeto}.
	 * @param ctx the parse tree
	 */
	void enterAsignarAtributoObjeto(PigLatinParser.AsignarAtributoObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#asignarAtributoObjeto}.
	 * @param ctx the parse tree
	 */
	void exitAsignarAtributoObjeto(PigLatinParser.AsignarAtributoObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#asignarVariableEstructura}.
	 * @param ctx the parse tree
	 */
	void enterAsignarVariableEstructura(PigLatinParser.AsignarVariableEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#asignarVariableEstructura}.
	 * @param ctx the parse tree
	 */
	void exitAsignarVariableEstructura(PigLatinParser.AsignarVariableEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#declAsignVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclAsignVariable(PigLatinParser.DeclAsignVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#declAsignVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclAsignVariable(PigLatinParser.DeclAsignVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#declAsignPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterDeclAsignPrimitivo(PigLatinParser.DeclAsignPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#declAsignPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitDeclAsignPrimitivo(PigLatinParser.DeclAsignPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#declAsignArreglo}.
	 * @param ctx the parse tree
	 */
	void enterDeclAsignArreglo(PigLatinParser.DeclAsignArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#declAsignArreglo}.
	 * @param ctx the parse tree
	 */
	void exitDeclAsignArreglo(PigLatinParser.DeclAsignArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#tamanioArreglo}.
	 * @param ctx the parse tree
	 */
	void enterTamanioArreglo(PigLatinParser.TamanioArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#tamanioArreglo}.
	 * @param ctx the parse tree
	 */
	void exitTamanioArreglo(PigLatinParser.TamanioArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#declAsignObjeto}.
	 * @param ctx the parse tree
	 */
	void enterDeclAsignObjeto(PigLatinParser.DeclAsignObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#declAsignObjeto}.
	 * @param ctx the parse tree
	 */
	void exitDeclAsignObjeto(PigLatinParser.DeclAsignObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#idAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterIdAsignacion(PigLatinParser.IdAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#idAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitIdAsignacion(PigLatinParser.IdAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(PigLatinParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(PigLatinParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#exprLogica}.
	 * @param ctx the parse tree
	 */
	void enterExprLogica(PigLatinParser.ExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#exprLogica}.
	 * @param ctx the parse tree
	 */
	void exitExprLogica(PigLatinParser.ExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(PigLatinParser.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(PigLatinParser.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#exprAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExprAritmetica(PigLatinParser.ExprAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#exprAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExprAritmetica(PigLatinParser.ExprAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(PigLatinParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(PigLatinParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PigLatinParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PigLatinParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(PigLatinParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(PigLatinParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valorPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterValorPrimitivo(PigLatinParser.ValorPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valorPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitValorPrimitivo(PigLatinParser.ValorPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valorNoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterValorNoPrimitivo(PigLatinParser.ValorNoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valorNoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitValorNoPrimitivo(PigLatinParser.ValorNoPrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valorVariable}.
	 * @param ctx the parse tree
	 */
	void enterValorVariable(PigLatinParser.ValorVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valorVariable}.
	 * @param ctx the parse tree
	 */
	void exitValorVariable(PigLatinParser.ValorVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valorPosicionArreglo}.
	 * @param ctx the parse tree
	 */
	void enterValorPosicionArreglo(PigLatinParser.ValorPosicionArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valorPosicionArreglo}.
	 * @param ctx the parse tree
	 */
	void exitValorPosicionArreglo(PigLatinParser.ValorPosicionArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valorEstructura}.
	 * @param ctx the parse tree
	 */
	void enterValorEstructura(PigLatinParser.ValorEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valorEstructura}.
	 * @param ctx the parse tree
	 */
	void exitValorEstructura(PigLatinParser.ValorEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valorObjeto}.
	 * @param ctx the parse tree
	 */
	void enterValorObjeto(PigLatinParser.ValorObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valorObjeto}.
	 * @param ctx the parse tree
	 */
	void exitValorObjeto(PigLatinParser.ValorObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#accesoDatosVariables}.
	 * @param ctx the parse tree
	 */
	void enterAccesoDatosVariables(PigLatinParser.AccesoDatosVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#accesoDatosVariables}.
	 * @param ctx the parse tree
	 */
	void exitAccesoDatosVariables(PigLatinParser.AccesoDatosVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#accesoMiembro}.
	 * @param ctx the parse tree
	 */
	void enterAccesoMiembro(PigLatinParser.AccesoMiembroContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#accesoMiembro}.
	 * @param ctx the parse tree
	 */
	void exitAccesoMiembro(PigLatinParser.AccesoMiembroContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#tipoIncremento}.
	 * @param ctx the parse tree
	 */
	void enterTipoIncremento(PigLatinParser.TipoIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#tipoIncremento}.
	 * @param ctx the parse tree
	 */
	void exitTipoIncremento(PigLatinParser.TipoIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#defPrincipal}.
	 * @param ctx the parse tree
	 */
	void enterDefPrincipal(PigLatinParser.DefPrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#defPrincipal}.
	 * @param ctx the parse tree
	 */
	void exitDefPrincipal(PigLatinParser.DefPrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(PigLatinParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(PigLatinParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(PigLatinParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(PigLatinParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#sentenciaFuncionEspecial}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaFuncionEspecial(PigLatinParser.SentenciaFuncionEspecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#sentenciaFuncionEspecial}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaFuncionEspecial(PigLatinParser.SentenciaFuncionEspecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#funcionLeerTextoConsola}.
	 * @param ctx the parse tree
	 */
	void enterFuncionLeerTextoConsola(PigLatinParser.FuncionLeerTextoConsolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#funcionLeerTextoConsola}.
	 * @param ctx the parse tree
	 */
	void exitFuncionLeerTextoConsola(PigLatinParser.FuncionLeerTextoConsolaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#leerSinGuardar}.
	 * @param ctx the parse tree
	 */
	void enterLeerSinGuardar(PigLatinParser.LeerSinGuardarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#leerSinGuardar}.
	 * @param ctx the parse tree
	 */
	void exitLeerSinGuardar(PigLatinParser.LeerSinGuardarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#leerGuardar}.
	 * @param ctx the parse tree
	 */
	void enterLeerGuardar(PigLatinParser.LeerGuardarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#leerGuardar}.
	 * @param ctx the parse tree
	 */
	void exitLeerGuardar(PigLatinParser.LeerGuardarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#funcionImprimirTexto}.
	 * @param ctx the parse tree
	 */
	void enterFuncionImprimirTexto(PigLatinParser.FuncionImprimirTextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#funcionImprimirTexto}.
	 * @param ctx the parse tree
	 */
	void exitFuncionImprimirTexto(PigLatinParser.FuncionImprimirTextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#imprimirTexto}.
	 * @param ctx the parse tree
	 */
	void enterImprimirTexto(PigLatinParser.ImprimirTextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#imprimirTexto}.
	 * @param ctx the parse tree
	 */
	void exitImprimirTexto(PigLatinParser.ImprimirTextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#imprimirVariable}.
	 * @param ctx the parse tree
	 */
	void enterImprimirVariable(PigLatinParser.ImprimirVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#imprimirVariable}.
	 * @param ctx the parse tree
	 */
	void exitImprimirVariable(PigLatinParser.ImprimirVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#sentenciaInstruccion}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaInstruccion(PigLatinParser.SentenciaInstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#sentenciaInstruccion}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaInstruccion(PigLatinParser.SentenciaInstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#sentenciaSi}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaSi(PigLatinParser.SentenciaSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#sentenciaSi}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaSi(PigLatinParser.SentenciaSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#condicionalSi}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalSi(PigLatinParser.CondicionalSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#condicionalSi}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalSi(PigLatinParser.CondicionalSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(PigLatinParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(PigLatinParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#condicionalAliterSi}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalAliterSi(PigLatinParser.CondicionalAliterSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#condicionalAliterSi}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalAliterSi(PigLatinParser.CondicionalAliterSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#condicionalAliter}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalAliter(PigLatinParser.CondicionalAliterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#condicionalAliter}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalAliter(PigLatinParser.CondicionalAliterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#seccionInstruccion}.
	 * @param ctx the parse tree
	 */
	void enterSeccionInstruccion(PigLatinParser.SeccionInstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#seccionInstruccion}.
	 * @param ctx the parse tree
	 */
	void exitSeccionInstruccion(PigLatinParser.SeccionInstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#sentenciaVariable}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaVariable(PigLatinParser.SentenciaVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#sentenciaVariable}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaVariable(PigLatinParser.SentenciaVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#sentenciaCiclo}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaCiclo(PigLatinParser.SentenciaCicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#sentenciaCiclo}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaCiclo(PigLatinParser.SentenciaCicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#cicloDum}.
	 * @param ctx the parse tree
	 */
	void enterCicloDum(PigLatinParser.CicloDumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#cicloDum}.
	 * @param ctx the parse tree
	 */
	void exitCicloDum(PigLatinParser.CicloDumContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#condicionalDum}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalDum(PigLatinParser.CondicionalDumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#condicionalDum}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalDum(PigLatinParser.CondicionalDumContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#cicloFacereDum}.
	 * @param ctx the parse tree
	 */
	void enterCicloFacereDum(PigLatinParser.CicloFacereDumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#cicloFacereDum}.
	 * @param ctx the parse tree
	 */
	void exitCicloFacereDum(PigLatinParser.CicloFacereDumContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#cicloPer}.
	 * @param ctx the parse tree
	 */
	void enterCicloPer(PigLatinParser.CicloPerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#cicloPer}.
	 * @param ctx the parse tree
	 */
	void exitCicloPer(PigLatinParser.CicloPerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#condicionalPer}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalPer(PigLatinParser.CondicionalPerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#condicionalPer}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalPer(PigLatinParser.CondicionalPerContext ctx);
}