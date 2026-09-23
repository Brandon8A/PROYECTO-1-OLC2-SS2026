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
	 * Enter a parse tree produced by the {@code declaracionPrimitiva}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionPrimitiva(PigLatinParser.DeclaracionPrimitivaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracionPrimitiva}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionPrimitiva(PigLatinParser.DeclaracionPrimitivaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracionParaArreglo}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionParaArreglo(PigLatinParser.DeclaracionParaArregloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracionParaArreglo}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionParaArreglo(PigLatinParser.DeclaracionParaArregloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracionParaObjeto}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionParaObjeto(PigLatinParser.DeclaracionParaObjetoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracionParaObjeto}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionParaObjeto(PigLatinParser.DeclaracionParaObjetoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asignacionVariable}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionVariable(PigLatinParser.AsignacionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asignacionVariable}
	 * labeled alternative in {@link PigLatinParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionVariable(PigLatinParser.AsignacionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#declaracionDato}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionDato(PigLatinParser.DeclaracionDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#declaracionDato}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionDato(PigLatinParser.DeclaracionDatoContext ctx);
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
	 * Enter a parse tree produced by {@link PigLatinParser#datoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void enterDatoPrimitivo(PigLatinParser.DatoPrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#datoPrimitivo}.
	 * @param ctx the parse tree
	 */
	void exitDatoPrimitivo(PigLatinParser.DatoPrimitivoContext ctx);
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
	 * Enter a parse tree produced by the {@code factorNegacion}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNegacion(PigLatinParser.FactorNegacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNegacion}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNegacion(PigLatinParser.FactorNegacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorNegativo}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorNegativo(PigLatinParser.FactorNegativoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorNegativo}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorNegativo(PigLatinParser.FactorNegativoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorParentesis}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorParentesis(PigLatinParser.FactorParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorParentesis}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorParentesis(PigLatinParser.FactorParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorValor}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorValor(PigLatinParser.FactorValorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorValor}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorValor(PigLatinParser.FactorValorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorArreglo}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorArreglo(PigLatinParser.FactorArregloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorArreglo}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorArreglo(PigLatinParser.FactorArregloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorFuncion}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorFuncion(PigLatinParser.FactorFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorFuncion}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorFuncion(PigLatinParser.FactorFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorVariable}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorVariable(PigLatinParser.FactorVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorVariable}
	 * labeled alternative in {@link PigLatinParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorVariable(PigLatinParser.FactorVariableContext ctx);
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
	 * Enter a parse tree produced by {@link PigLatinParser#exprEstructura}.
	 * @param ctx the parse tree
	 */
	void enterExprEstructura(PigLatinParser.ExprEstructuraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#exprEstructura}.
	 * @param ctx the parse tree
	 */
	void exitExprEstructura(PigLatinParser.ExprEstructuraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#exprAccesoDatosObjeto}.
	 * @param ctx the parse tree
	 */
	void enterExprAccesoDatosObjeto(PigLatinParser.ExprAccesoDatosObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#exprAccesoDatosObjeto}.
	 * @param ctx the parse tree
	 */
	void exitExprAccesoDatosObjeto(PigLatinParser.ExprAccesoDatosObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#metodoObjeto}.
	 * @param ctx the parse tree
	 */
	void enterMetodoObjeto(PigLatinParser.MetodoObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#metodoObjeto}.
	 * @param ctx the parse tree
	 */
	void exitMetodoObjeto(PigLatinParser.MetodoObjetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#accesoArreglo}.
	 * @param ctx the parse tree
	 */
	void enterAccesoArreglo(PigLatinParser.AccesoArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#accesoArreglo}.
	 * @param ctx the parse tree
	 */
	void exitAccesoArreglo(PigLatinParser.AccesoArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#llamarFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamarFuncion(PigLatinParser.LlamarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#llamarFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamarFuncion(PigLatinParser.LlamarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(PigLatinParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(PigLatinParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#declaracionArreglo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionArreglo(PigLatinParser.DeclaracionArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#declaracionArreglo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionArreglo(PigLatinParser.DeclaracionArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#tipoArreglo}.
	 * @param ctx the parse tree
	 */
	void enterTipoArreglo(PigLatinParser.TipoArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#tipoArreglo}.
	 * @param ctx the parse tree
	 */
	void exitTipoArreglo(PigLatinParser.TipoArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#inicializacionArreglo}.
	 * @param ctx the parse tree
	 */
	void enterInicializacionArreglo(PigLatinParser.InicializacionArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#inicializacionArreglo}.
	 * @param ctx the parse tree
	 */
	void exitInicializacionArreglo(PigLatinParser.InicializacionArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#listaValores}.
	 * @param ctx the parse tree
	 */
	void enterListaValores(PigLatinParser.ListaValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#listaValores}.
	 * @param ctx the parse tree
	 */
	void exitListaValores(PigLatinParser.ListaValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PigLatinParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PigLatinParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#declaracionObjeto}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionObjeto(PigLatinParser.DeclaracionObjetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#declaracionObjeto}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionObjeto(PigLatinParser.DeclaracionObjetoContext ctx);
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
	 * Enter a parse tree produced by {@link PigLatinParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(PigLatinParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(PigLatinParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaFunEspeciales}
	 * labeled alternative in {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaFunEspeciales(PigLatinParser.SentenciaFunEspecialesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaFunEspeciales}
	 * labeled alternative in {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaFunEspeciales(PigLatinParser.SentenciaFunEspecialesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaInstr}
	 * labeled alternative in {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaInstr(PigLatinParser.SentenciaInstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaInstr}
	 * labeled alternative in {@link PigLatinParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaInstr(PigLatinParser.SentenciaInstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaLeerConsola}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaLeerConsola(PigLatinParser.SentenciaLeerConsolaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaLeerConsola}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaLeerConsola(PigLatinParser.SentenciaLeerConsolaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaLeerVariable}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaLeerVariable(PigLatinParser.SentenciaLeerVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaLeerVariable}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaLeerVariable(PigLatinParser.SentenciaLeerVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaImprimir}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaImprimir(PigLatinParser.SentenciaImprimirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaImprimir}
	 * labeled alternative in {@link PigLatinParser#sentenciaFuncionesEspeciales}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaImprimir(PigLatinParser.SentenciaImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#leerConsola}.
	 * @param ctx the parse tree
	 */
	void enterLeerConsola(PigLatinParser.LeerConsolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#leerConsola}.
	 * @param ctx the parse tree
	 */
	void exitLeerConsola(PigLatinParser.LeerConsolaContext ctx);
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
	 * Enter a parse tree produced by {@link PigLatinParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(PigLatinParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(PigLatinParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#valorImprimir}.
	 * @param ctx the parse tree
	 */
	void enterValorImprimir(PigLatinParser.ValorImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#valorImprimir}.
	 * @param ctx the parse tree
	 */
	void exitValorImprimir(PigLatinParser.ValorImprimirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaCondicionalSi}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaCondicionalSi(PigLatinParser.SentenciaCondicionalSiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaCondicionalSi}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaCondicionalSi(PigLatinParser.SentenciaCondicionalSiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaAsignacion}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaAsignacion(PigLatinParser.SentenciaAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaAsignacion}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaAsignacion(PigLatinParser.SentenciaAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaCiclos}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaCiclos(PigLatinParser.SentenciaCiclosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaCiclos}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaCiclos(PigLatinParser.SentenciaCiclosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaContinuar}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaContinuar(PigLatinParser.SentenciaContinuarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaContinuar}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaContinuar(PigLatinParser.SentenciaContinuarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sentenciaBreak}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaBreak(PigLatinParser.SentenciaBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sentenciaBreak}
	 * labeled alternative in {@link PigLatinParser#sentenciaInstrucciones}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaBreak(PigLatinParser.SentenciaBreakContext ctx);
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
	 * Enter a parse tree produced by {@link PigLatinParser#condicionalSiNo}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalSiNo(PigLatinParser.CondicionalSiNoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#condicionalSiNo}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalSiNo(PigLatinParser.CondicionalSiNoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cicloMientras}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 */
	void enterCicloMientras(PigLatinParser.CicloMientrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cicloMientras}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 */
	void exitCicloMientras(PigLatinParser.CicloMientrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cicloHacerMientras}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 */
	void enterCicloHacerMientras(PigLatinParser.CicloHacerMientrasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cicloHacerMientras}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 */
	void exitCicloHacerMientras(PigLatinParser.CicloHacerMientrasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cicloPara}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 */
	void enterCicloPara(PigLatinParser.CicloParaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cicloPara}
	 * labeled alternative in {@link PigLatinParser#ciclos}.
	 * @param ctx the parse tree
	 */
	void exitCicloPara(PigLatinParser.CicloParaContext ctx);
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
	 * Enter a parse tree produced by {@link PigLatinParser#instruccionesFacere}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionesFacere(PigLatinParser.InstruccionesFacereContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#instruccionesFacere}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionesFacere(PigLatinParser.InstruccionesFacereContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#instruccionesCiclos}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionesCiclos(PigLatinParser.InstruccionesCiclosContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#instruccionesCiclos}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionesCiclos(PigLatinParser.InstruccionesCiclosContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#sentenciaPerge}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaPerge(PigLatinParser.SentenciaPergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#sentenciaPerge}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaPerge(PigLatinParser.SentenciaPergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#sentenciaInterrumpe}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaInterrumpe(PigLatinParser.SentenciaInterrumpeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#sentenciaInterrumpe}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaInterrumpe(PigLatinParser.SentenciaInterrumpeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(PigLatinParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(PigLatinParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PigLatinParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(PigLatinParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PigLatinParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(PigLatinParser.IncrementoContext ctx);
}