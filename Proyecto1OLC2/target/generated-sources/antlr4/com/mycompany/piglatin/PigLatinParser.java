// Generated from com/mycompany/piglatin/PigLatin.g4 by ANTLR 4.13.2
package com.mycompany.piglatin;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PigLatinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, FINIS_PRINCIPAL=13, NUMERUS=14, TEXTUM=15, 
		DECIMALIS=16, LITTERA=17, ESTO=18, SERIES=19, VERUM=20, FALSUS=21, STRUCTURA=22, 
		SI=23, FINIS=24, ALITER=25, DUM=26, FACERE=27, PER=28, ACTIO=29, VARIABILES=30, 
		MUNERA=31, MAIOR=32, RATIO=33, REDDERE=34, NEGACION=35, BOOL=36, PERGE=37, 
		INTERRUMPE=38, NOVUS=39, IMPORT=40, SUMA=41, RESTA=42, MULTIPLICACION=43, 
		DIVISION=44, LEER_TEXTO=45, IMPRIMIR_TEXTO=46, IGUALDAD=47, DESIGUALDAD=48, 
		MENOR_QUE=49, MAYOR_QUE=50, MAYOR_IGUAL_QUE=51, MENOR_IGUAL_QUE=52, ASIGNACION=53, 
		AND=54, OR=55, SUMA_ABREVIADA=56, RESTA_ABREVIADA=57, ID=58, DECIMAL=59, 
		ENTERO=60, CARACTER=61, CADENA=62, ESPACIO=63, COMENTARIO_LINEA=64, COMENTARIO_MULTILINEA=65;
	public static final int
		RULE_programa = 0, RULE_importaciones = 1, RULE_path = 2, RULE_rutaCarpetas = 3, 
		RULE_nombreArchivo = 4, RULE_extensionArchivo = 5, RULE_defVariable = 6, 
		RULE_variables = 7, RULE_listaDeclaracion = 8, RULE_declararVariable = 9, 
		RULE_variable = 10, RULE_arreglo = 11, RULE_objeto = 12, RULE_tipoDato = 13, 
		RULE_tipoPrimitivo = 14, RULE_tipoObjeto = 15, RULE_tipoEstructura = 16, 
		RULE_asignarVariable = 17, RULE_asignarVariablePrimitiva = 18, RULE_asignarVariableArreglo = 19, 
		RULE_valoresLlaves = 20, RULE_asignarVariableObjeto = 21, RULE_instanciaObjeto = 22, 
		RULE_argumento = 23, RULE_asignarAtributoObjeto = 24, RULE_asignarVariableEstructura = 25, 
		RULE_declAsignVariable = 26, RULE_declAsignPrimitivo = 27, RULE_declAsignArreglo = 28, 
		RULE_tamanioArreglo = 29, RULE_declAsignObjeto = 30, RULE_idAsignacion = 31, 
		RULE_expresion = 32, RULE_exprLogica = 33, RULE_exprRelacional = 34, RULE_exprAritmetica = 35, 
		RULE_termino = 36, RULE_factor = 37, RULE_valor = 38, RULE_valorPrimitivo = 39, 
		RULE_valorNoPrimitivo = 40, RULE_valorVariable = 41, RULE_valorPosicionArreglo = 42, 
		RULE_valorEstructura = 43, RULE_valorObjeto = 44, RULE_accesoDatosVariables = 45, 
		RULE_accesoMiembro = 46, RULE_tipoIncremento = 47, RULE_defPrincipal = 48, 
		RULE_instruccion = 49, RULE_sentencia = 50, RULE_sentenciaFuncionEspecial = 51, 
		RULE_funcionLeerTextoConsola = 52, RULE_leerSinGuardar = 53, RULE_leerGuardar = 54, 
		RULE_funcionImprimirTexto = 55, RULE_imprimirTexto = 56, RULE_imprimirVariable = 57, 
		RULE_sentenciaInstruccion = 58, RULE_sentenciaSi = 59, RULE_condicionalSi = 60, 
		RULE_condicional = 61, RULE_condicionalAliterSi = 62, RULE_condicionalAliter = 63, 
		RULE_seccionInstruccion = 64, RULE_sentenciaVariable = 65, RULE_sentenciaCiclo = 66, 
		RULE_cicloDum = 67, RULE_condicionalDum = 68, RULE_cicloFacereDum = 69, 
		RULE_cicloPer = 70, RULE_condicionalPer = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "importaciones", "path", "rutaCarpetas", "nombreArchivo", 
			"extensionArchivo", "defVariable", "variables", "listaDeclaracion", "declararVariable", 
			"variable", "arreglo", "objeto", "tipoDato", "tipoPrimitivo", "tipoObjeto", 
			"tipoEstructura", "asignarVariable", "asignarVariablePrimitiva", "asignarVariableArreglo", 
			"valoresLlaves", "asignarVariableObjeto", "instanciaObjeto", "argumento", 
			"asignarAtributoObjeto", "asignarVariableEstructura", "declAsignVariable", 
			"declAsignPrimitivo", "declAsignArreglo", "tamanioArreglo", "declAsignObjeto", 
			"idAsignacion", "expresion", "exprLogica", "exprRelacional", "exprAritmetica", 
			"termino", "factor", "valor", "valorPrimitivo", "valorNoPrimitivo", "valorVariable", 
			"valorPosicionArreglo", "valorEstructura", "valorObjeto", "accesoDatosVariables", 
			"accesoMiembro", "tipoIncremento", "defPrincipal", "instruccion", "sentencia", 
			"sentenciaFuncionEspecial", "funcionLeerTextoConsola", "leerSinGuardar", 
			"leerGuardar", "funcionImprimirTexto", "imprimirTexto", "imprimirVariable", 
			"sentenciaInstruccion", "sentenciaSi", "condicionalSi", "condicional", 
			"condicionalAliterSi", "condicionalAliter", "seccionInstruccion", "sentenciaVariable", 
			"sentenciaCiclo", "cicloDum", "condicionalDum", "cicloFacereDum", "cicloPer", 
			"condicionalPer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'.z'", "'.y'", "':'", "'{'", "','", "'}'", "'('", 
			"')'", "'['", "']'", "'FINIS'", "'numerus'", "'textum'", "'decimalis'", 
			"'littera'", "'esto'", "'series'", "'verum'", "'falsus'", "'structura'", 
			"'si'", "'finis'", "'aliter'", "'dum'", "'facere'", "'per'", "'actio'", 
			"'VARIABILES'", "'MUNERA'", "'MAIOR'", "'ratio'", "'reddere'", "'non'", 
			"'bool'", "'perge'", "'interrumpe'", "'novus'", "'import'", "'+'", "'-'", 
			"'*'", "'/'", "'<<'", "'>>'", "'=='", "'!='", "'<'", "'>'", "'>='", "'<='", 
			"'='", "'&&'", "'||'", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "FINIS_PRINCIPAL", "NUMERUS", "TEXTUM", "DECIMALIS", "LITTERA", 
			"ESTO", "SERIES", "VERUM", "FALSUS", "STRUCTURA", "SI", "FINIS", "ALITER", 
			"DUM", "FACERE", "PER", "ACTIO", "VARIABILES", "MUNERA", "MAIOR", "RATIO", 
			"REDDERE", "NEGACION", "BOOL", "PERGE", "INTERRUMPE", "NOVUS", "IMPORT", 
			"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "LEER_TEXTO", "IMPRIMIR_TEXTO", 
			"IGUALDAD", "DESIGUALDAD", "MENOR_QUE", "MAYOR_QUE", "MAYOR_IGUAL_QUE", 
			"MENOR_IGUAL_QUE", "ASIGNACION", "AND", "OR", "SUMA_ABREVIADA", "RESTA_ABREVIADA", 
			"ID", "DECIMAL", "ENTERO", "CARACTER", "CADENA", "ESPACIO", "COMENTARIO_LINEA", 
			"COMENTARIO_MULTILINEA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PigLatin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PigLatinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DefPrincipalContext defPrincipal() {
			return getRuleContext(DefPrincipalContext.class,0);
		}
		public TerminalNode FINIS_PRINCIPAL() { return getToken(PigLatinParser.FINIS_PRINCIPAL, 0); }
		public List<ImportacionesContext> importaciones() {
			return getRuleContexts(ImportacionesContext.class);
		}
		public ImportacionesContext importaciones(int i) {
			return getRuleContext(ImportacionesContext.class,i);
		}
		public DefVariableContext defVariable() {
			return getRuleContext(DefVariableContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(144);
				importaciones();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABILES) {
				{
				setState(150);
				defVariable();
				}
			}

			setState(153);
			defPrincipal();
			setState(154);
			match(FINIS_PRINCIPAL);
			setState(155);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportacionesContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PigLatinParser.IMPORT, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ImportacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterImportaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitImportaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitImportaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportacionesContext importaciones() throws RecognitionException {
		ImportacionesContext _localctx = new ImportacionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IMPORT);
			setState(158);
			path();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathContext extends ParserRuleContext {
		public NombreArchivoContext nombreArchivo() {
			return getRuleContext(NombreArchivoContext.class,0);
		}
		public List<RutaCarpetasContext> rutaCarpetas() {
			return getRuleContexts(RutaCarpetasContext.class);
		}
		public RutaCarpetasContext rutaCarpetas(int i) {
			return getRuleContext(RutaCarpetasContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(160);
					rutaCarpetas();
					setState(161);
					match(T__1);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(168);
			nombreArchivo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RutaCarpetasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public RutaCarpetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rutaCarpetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterRutaCarpetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitRutaCarpetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitRutaCarpetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RutaCarpetasContext rutaCarpetas() throws RecognitionException {
		RutaCarpetasContext _localctx = new RutaCarpetasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rutaCarpetas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NombreArchivoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public ExtensionArchivoContext extensionArchivo() {
			return getRuleContext(ExtensionArchivoContext.class,0);
		}
		public NombreArchivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreArchivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterNombreArchivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitNombreArchivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitNombreArchivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreArchivoContext nombreArchivo() throws RecognitionException {
		NombreArchivoContext _localctx = new NombreArchivoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nombreArchivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(173);
			extensionArchivo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtensionArchivoContext extends ParserRuleContext {
		public ExtensionArchivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionArchivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterExtensionArchivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitExtensionArchivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitExtensionArchivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionArchivoContext extensionArchivo() throws RecognitionException {
		ExtensionArchivoContext _localctx = new ExtensionArchivoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extensionArchivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefVariableContext extends ParserRuleContext {
		public TerminalNode VARIABILES() { return getToken(PigLatinParser.VARIABILES, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(PigLatinParser.MAYOR_QUE, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public DefVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterDefVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitDefVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitDefVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefVariableContext defVariable() throws RecognitionException {
		DefVariableContext _localctx = new DefVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(VARIABILES);
			setState(178);
			match(MAYOR_QUE);
			setState(179);
			variables();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public List<ListaDeclaracionContext> listaDeclaracion() {
			return getRuleContexts(ListaDeclaracionContext.class);
		}
		public ListaDeclaracionContext listaDeclaracion(int i) {
			return getRuleContext(ListaDeclaracionContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376152498176L) != 0)) {
				{
				{
				setState(181);
				listaDeclaracion();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDeclaracionContext extends ParserRuleContext {
		public DeclararVariableContext declararVariable() {
			return getRuleContext(DeclararVariableContext.class,0);
		}
		public AsignarVariableContext asignarVariable() {
			return getRuleContext(AsignarVariableContext.class,0);
		}
		public DeclAsignVariableContext declAsignVariable() {
			return getRuleContext(DeclAsignVariableContext.class,0);
		}
		public ListaDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterListaDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitListaDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitListaDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracionContext listaDeclaracion() throws RecognitionException {
		ListaDeclaracionContext _localctx = new ListaDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaDeclaracion);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				declararVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				asignarVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				declAsignVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclararVariableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public DeclararVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterDeclararVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitDeclararVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitDeclararVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararVariableContext declararVariable() throws RecognitionException {
		DeclararVariableContext _localctx = new DeclararVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declararVariable);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				variable();
				setState(193);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				arreglo();
				setState(196);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				objeto();
				setState(199);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(PigLatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ESTO);
			setState(204);
			match(ID);
			setState(205);
			match(T__4);
			setState(206);
			tipoDato();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode SERIES() { return getToken(PigLatinParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TamanioArregloContext tamanioArreglo() {
			return getRuleContext(TamanioArregloContext.class,0);
		}
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(SERIES);
			setState(209);
			match(ID);
			setState(210);
			tamanioArreglo();
			setState(211);
			match(T__4);
			setState(212);
			tipoDato();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(PigLatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TipoObjetoContext tipoObjeto() {
			return getRuleContext(TipoObjetoContext.class,0);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ESTO);
			setState(215);
			match(ID);
			setState(216);
			match(T__4);
			setState(217);
			tipoObjeto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoDatoContext extends ParserRuleContext {
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public TipoObjetoContext tipoObjeto() {
			return getRuleContext(TipoObjetoContext.class,0);
		}
		public TipoEstructuraContext tipoEstructura() {
			return getRuleContext(TipoEstructuraContext.class,0);
		}
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterTipoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitTipoDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitTipoDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipoDato);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				tipoPrimitivo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				tipoObjeto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				tipoEstructura();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoPrimitivoContext extends ParserRuleContext {
		public TerminalNode NUMERUS() { return getToken(PigLatinParser.NUMERUS, 0); }
		public TerminalNode TEXTUM() { return getToken(PigLatinParser.TEXTUM, 0); }
		public TerminalNode DECIMALIS() { return getToken(PigLatinParser.DECIMALIS, 0); }
		public TerminalNode LITTERA() { return getToken(PigLatinParser.LITTERA, 0); }
		public TerminalNode BOOL() { return getToken(PigLatinParser.BOOL, 0); }
		public TipoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterTipoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitTipoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitTipoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoPrimitivoContext tipoPrimitivo() throws RecognitionException {
		TipoPrimitivoContext _localctx = new TipoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipoPrimitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719722496L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoObjetoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TipoObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoObjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterTipoObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitTipoObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitTipoObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoObjetoContext tipoObjeto() throws RecognitionException {
		TipoObjetoContext _localctx = new TipoObjetoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipoObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoEstructuraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TipoEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterTipoEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitTipoEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitTipoEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoEstructuraContext tipoEstructura() throws RecognitionException {
		TipoEstructuraContext _localctx = new TipoEstructuraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipoEstructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignarVariableContext extends ParserRuleContext {
		public AsignarVariablePrimitivaContext asignarVariablePrimitiva() {
			return getRuleContext(AsignarVariablePrimitivaContext.class,0);
		}
		public AsignarVariableArregloContext asignarVariableArreglo() {
			return getRuleContext(AsignarVariableArregloContext.class,0);
		}
		public AsignarVariableObjetoContext asignarVariableObjeto() {
			return getRuleContext(AsignarVariableObjetoContext.class,0);
		}
		public AsignarVariableEstructuraContext asignarVariableEstructura() {
			return getRuleContext(AsignarVariableEstructuraContext.class,0);
		}
		public AsignarVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignarVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterAsignarVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitAsignarVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitAsignarVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarVariableContext asignarVariable() throws RecognitionException {
		AsignarVariableContext _localctx = new AsignarVariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asignarVariable);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				asignarVariablePrimitiva();
				setState(231);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				asignarVariableArreglo();
				setState(234);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				asignarVariableObjeto();
				setState(237);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				asignarVariableEstructura();
				setState(240);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignarVariablePrimitivaContext extends ParserRuleContext {
		public IdAsignacionContext idAsignacion() {
			return getRuleContext(IdAsignacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TipoIncrementoContext tipoIncremento() {
			return getRuleContext(TipoIncrementoContext.class,0);
		}
		public AsignarVariablePrimitivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignarVariablePrimitiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterAsignarVariablePrimitiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitAsignarVariablePrimitiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitAsignarVariablePrimitiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarVariablePrimitivaContext asignarVariablePrimitiva() throws RecognitionException {
		AsignarVariablePrimitivaContext _localctx = new AsignarVariablePrimitivaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asignarVariablePrimitiva);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				idAsignacion();
				setState(245);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				tipoIncremento();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignarVariableArregloContext extends ParserRuleContext {
		public IdAsignacionContext idAsignacion() {
			return getRuleContext(IdAsignacionContext.class,0);
		}
		public ValoresLlavesContext valoresLlaves() {
			return getRuleContext(ValoresLlavesContext.class,0);
		}
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TamanioArregloContext tamanioArreglo() {
			return getRuleContext(TamanioArregloContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(PigLatinParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignarVariableArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignarVariableArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterAsignarVariableArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitAsignarVariableArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitAsignarVariableArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarVariableArregloContext asignarVariableArreglo() throws RecognitionException {
		AsignarVariableArregloContext _localctx = new AsignarVariableArregloContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_asignarVariableArreglo);
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				idAsignacion();
				setState(251);
				valoresLlaves();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(ID);
				setState(254);
				tamanioArreglo();
				setState(255);
				match(ASIGNACION);
				setState(256);
				expresion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValoresLlavesContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ValoresLlavesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valoresLlaves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterValoresLlaves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitValoresLlaves(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitValoresLlaves(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresLlavesContext valoresLlaves() throws RecognitionException {
		ValoresLlavesContext _localctx = new ValoresLlavesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valoresLlaves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__5);
			setState(261);
			expresion();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(262);
				match(T__6);
				setState(263);
				expresion();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignarVariableObjetoContext extends ParserRuleContext {
		public IdAsignacionContext idAsignacion() {
			return getRuleContext(IdAsignacionContext.class,0);
		}
		public TipoObjetoContext tipoObjeto() {
			return getRuleContext(TipoObjetoContext.class,0);
		}
		public InstanciaObjetoContext instanciaObjeto() {
			return getRuleContext(InstanciaObjetoContext.class,0);
		}
		public AsignarAtributoObjetoContext asignarAtributoObjeto() {
			return getRuleContext(AsignarAtributoObjetoContext.class,0);
		}
		public AsignarVariableObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignarVariableObjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterAsignarVariableObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitAsignarVariableObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitAsignarVariableObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarVariableObjetoContext asignarVariableObjeto() throws RecognitionException {
		AsignarVariableObjetoContext _localctx = new AsignarVariableObjetoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_asignarVariableObjeto);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				idAsignacion();
				setState(272);
				tipoObjeto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				idAsignacion();
				setState(275);
				instanciaObjeto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				asignarAtributoObjeto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanciaObjetoContext extends ParserRuleContext {
		public TerminalNode NOVUS() { return getToken(PigLatinParser.NOVUS, 0); }
		public TipoObjetoContext tipoObjeto() {
			return getRuleContext(TipoObjetoContext.class,0);
		}
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public InstanciaObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanciaObjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterInstanciaObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitInstanciaObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitInstanciaObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanciaObjetoContext instanciaObjeto() throws RecognitionException {
		InstanciaObjetoContext _localctx = new InstanciaObjetoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_instanciaObjeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(NOVUS);
			setState(281);
			tipoObjeto();
			setState(282);
			match(T__8);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8935146642868273728L) != 0)) {
				{
				setState(283);
				argumento();
				}
			}

			setState(286);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			expresion();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(289);
				match(T__6);
				setState(290);
				expresion();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignarAtributoObjetoContext extends ParserRuleContext {
		public AccesoDatosVariablesContext accesoDatosVariables() {
			return getRuleContext(AccesoDatosVariablesContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(PigLatinParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignarAtributoObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignarAtributoObjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterAsignarAtributoObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitAsignarAtributoObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitAsignarAtributoObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarAtributoObjetoContext asignarAtributoObjeto() throws RecognitionException {
		AsignarAtributoObjetoContext _localctx = new AsignarAtributoObjetoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_asignarAtributoObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			accesoDatosVariables();
			setState(297);
			match(ASIGNACION);
			setState(298);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignarVariableEstructuraContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(PigLatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TipoEstructuraContext tipoEstructura() {
			return getRuleContext(TipoEstructuraContext.class,0);
		}
		public ValoresLlavesContext valoresLlaves() {
			return getRuleContext(ValoresLlavesContext.class,0);
		}
		public AsignarVariableEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignarVariableEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterAsignarVariableEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitAsignarVariableEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitAsignarVariableEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarVariableEstructuraContext asignarVariableEstructura() throws RecognitionException {
		AsignarVariableEstructuraContext _localctx = new AsignarVariableEstructuraContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_asignarVariableEstructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(ESTO);
			setState(301);
			match(ID);
			setState(302);
			match(T__4);
			setState(303);
			tipoEstructura();
			setState(304);
			valoresLlaves();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclAsignVariableContext extends ParserRuleContext {
		public DeclAsignPrimitivoContext declAsignPrimitivo() {
			return getRuleContext(DeclAsignPrimitivoContext.class,0);
		}
		public DeclAsignArregloContext declAsignArreglo() {
			return getRuleContext(DeclAsignArregloContext.class,0);
		}
		public DeclAsignObjetoContext declAsignObjeto() {
			return getRuleContext(DeclAsignObjetoContext.class,0);
		}
		public DeclAsignVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declAsignVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterDeclAsignVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitDeclAsignVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitDeclAsignVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclAsignVariableContext declAsignVariable() throws RecognitionException {
		DeclAsignVariableContext _localctx = new DeclAsignVariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declAsignVariable);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				declAsignPrimitivo();
				setState(307);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				declAsignArreglo();
				setState(310);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				declAsignObjeto();
				setState(313);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclAsignPrimitivoContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(PigLatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TipoPrimitivoContext tipoPrimitivo() {
			return getRuleContext(TipoPrimitivoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclAsignPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declAsignPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterDeclAsignPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitDeclAsignPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitDeclAsignPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclAsignPrimitivoContext declAsignPrimitivo() throws RecognitionException {
		DeclAsignPrimitivoContext _localctx = new DeclAsignPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declAsignPrimitivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(ESTO);
			setState(318);
			match(ID);
			setState(319);
			match(T__4);
			setState(320);
			tipoPrimitivo();
			setState(321);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclAsignArregloContext extends ParserRuleContext {
		public TerminalNode SERIES() { return getToken(PigLatinParser.SERIES, 0); }
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TamanioArregloContext tamanioArreglo() {
			return getRuleContext(TamanioArregloContext.class,0);
		}
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public ValoresLlavesContext valoresLlaves() {
			return getRuleContext(ValoresLlavesContext.class,0);
		}
		public DeclAsignArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declAsignArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterDeclAsignArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitDeclAsignArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitDeclAsignArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclAsignArregloContext declAsignArreglo() throws RecognitionException {
		DeclAsignArregloContext _localctx = new DeclAsignArregloContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declAsignArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(SERIES);
			setState(324);
			match(ID);
			setState(325);
			tamanioArreglo();
			setState(326);
			match(T__4);
			setState(327);
			tipoDato();
			setState(328);
			valoresLlaves();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TamanioArregloContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TamanioArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamanioArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterTamanioArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitTamanioArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitTamanioArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TamanioArregloContext tamanioArreglo() throws RecognitionException {
		TamanioArregloContext _localctx = new TamanioArregloContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tamanioArreglo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__10);
			setState(331);
			expresion();
			setState(332);
			match(T__11);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					match(T__10);
					setState(334);
					expresion();
					setState(335);
					match(T__11);
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclAsignObjetoContext extends ParserRuleContext {
		public TerminalNode ESTO() { return getToken(PigLatinParser.ESTO, 0); }
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public InstanciaObjetoContext instanciaObjeto() {
			return getRuleContext(InstanciaObjetoContext.class,0);
		}
		public DeclAsignObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declAsignObjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterDeclAsignObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitDeclAsignObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitDeclAsignObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclAsignObjetoContext declAsignObjeto() throws RecognitionException {
		DeclAsignObjetoContext _localctx = new DeclAsignObjetoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declAsignObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(ESTO);
			setState(343);
			match(ID);
			setState(344);
			match(T__4);
			setState(345);
			instanciaObjeto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdAsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(PigLatinParser.ASIGNACION, 0); }
		public IdAsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idAsignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterIdAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitIdAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitIdAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdAsignacionContext idAsignacion() throws RecognitionException {
		IdAsignacionContext _localctx = new IdAsignacionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_idAsignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ID);
			setState(348);
			match(ASIGNACION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExprLogicaContext exprLogica() {
			return getRuleContext(ExprLogicaContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			exprLogica(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicaContext extends ParserRuleContext {
		public ExprRelacionalContext exprRelacional() {
			return getRuleContext(ExprRelacionalContext.class,0);
		}
		public List<ExprLogicaContext> exprLogica() {
			return getRuleContexts(ExprLogicaContext.class);
		}
		public ExprLogicaContext exprLogica(int i) {
			return getRuleContext(ExprLogicaContext.class,i);
		}
		public TerminalNode OR() { return getToken(PigLatinParser.OR, 0); }
		public TerminalNode AND() { return getToken(PigLatinParser.AND, 0); }
		public ExprLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterExprLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitExprLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLogicaContext exprLogica() throws RecognitionException {
		return exprLogica(0);
	}

	private ExprLogicaContext exprLogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprLogicaContext _localctx = new ExprLogicaContext(_ctx, _parentState);
		ExprLogicaContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_exprLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(353);
			exprRelacional(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprLogica);
						setState(355);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(356);
						match(OR);
						setState(357);
						exprLogica(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprLogica);
						setState(358);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(359);
						match(AND);
						setState(360);
						exprLogica(3);
						}
						break;
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelacionalContext extends ParserRuleContext {
		public ExprAritmeticaContext exprAritmetica() {
			return getRuleContext(ExprAritmeticaContext.class,0);
		}
		public ExprRelacionalContext exprRelacional() {
			return getRuleContext(ExprRelacionalContext.class,0);
		}
		public TerminalNode IGUALDAD() { return getToken(PigLatinParser.IGUALDAD, 0); }
		public TerminalNode DESIGUALDAD() { return getToken(PigLatinParser.DESIGUALDAD, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(PigLatinParser.MAYOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(PigLatinParser.MENOR_QUE, 0); }
		public TerminalNode MAYOR_IGUAL_QUE() { return getToken(PigLatinParser.MAYOR_IGUAL_QUE, 0); }
		public TerminalNode MENOR_IGUAL_QUE() { return getToken(PigLatinParser.MENOR_IGUAL_QUE, 0); }
		public ExprRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterExprRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitExprRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitExprRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelacionalContext exprRelacional() throws RecognitionException {
		return exprRelacional(0);
	}

	private ExprRelacionalContext exprRelacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprRelacionalContext _localctx = new ExprRelacionalContext(_ctx, _parentState);
		ExprRelacionalContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_exprRelacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(367);
			exprAritmetica(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(387);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(369);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(370);
						match(IGUALDAD);
						setState(371);
						exprAritmetica(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(372);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(373);
						match(DESIGUALDAD);
						setState(374);
						exprAritmetica(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(375);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(376);
						match(MAYOR_QUE);
						setState(377);
						exprAritmetica(0);
						}
						break;
					case 4:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(378);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(379);
						match(MENOR_QUE);
						setState(380);
						exprAritmetica(0);
						}
						break;
					case 5:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(381);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(382);
						match(MAYOR_IGUAL_QUE);
						setState(383);
						exprAritmetica(0);
						}
						break;
					case 6:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(384);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(385);
						match(MENOR_IGUAL_QUE);
						setState(386);
						exprAritmetica(0);
						}
						break;
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAritmeticaContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public ExprAritmeticaContext exprAritmetica() {
			return getRuleContext(ExprAritmeticaContext.class,0);
		}
		public TerminalNode SUMA() { return getToken(PigLatinParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(PigLatinParser.RESTA, 0); }
		public ExprAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterExprAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitExprAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAritmeticaContext exprAritmetica() throws RecognitionException {
		return exprAritmetica(0);
	}

	private ExprAritmeticaContext exprAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprAritmeticaContext _localctx = new ExprAritmeticaContext(_ctx, _parentState);
		ExprAritmeticaContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_exprAritmetica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(393);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprAritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprAritmetica);
					setState(395);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(396);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(397);
					termino(0);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode MULTIPLICACION() { return getToken(PigLatinParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(PigLatinParser.DIVISION, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		return termino(0);
	}

	private TerminoContext termino(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TerminoContext _localctx = new TerminoContext(_ctx, _parentState);
		TerminoContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_termino, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TerminoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termino);
					setState(406);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(407);
					_la = _input.LA(1);
					if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(408);
					factor();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NEGACION() { return getToken(PigLatinParser.NEGACION, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(PigLatinParser.RESTA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_factor);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGACION:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(NEGACION);
				setState(415);
				factor();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(RESTA);
				setState(417);
				factor();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(T__8);
				setState(419);
				expresion();
				setState(420);
				match(T__9);
				}
				break;
			case T__5:
			case VERUM:
			case FALSUS:
			case NOVUS:
			case ID:
			case DECIMAL:
			case ENTERO:
			case CARACTER:
			case CADENA:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public ValorPrimitivoContext valorPrimitivo() {
			return getRuleContext(ValorPrimitivoContext.class,0);
		}
		public ValorNoPrimitivoContext valorNoPrimitivo() {
			return getRuleContext(ValorNoPrimitivoContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_valor);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERUM:
			case FALSUS:
			case DECIMAL:
			case ENTERO:
			case CARACTER:
			case CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				valorPrimitivo();
				}
				break;
			case T__5:
			case NOVUS:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				valorNoPrimitivo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorPrimitivoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(PigLatinParser.ENTERO, 0); }
		public TerminalNode CADENA() { return getToken(PigLatinParser.CADENA, 0); }
		public TerminalNode DECIMAL() { return getToken(PigLatinParser.DECIMAL, 0); }
		public TerminalNode CARACTER() { return getToken(PigLatinParser.CARACTER, 0); }
		public TerminalNode VERUM() { return getToken(PigLatinParser.VERUM, 0); }
		public TerminalNode FALSUS() { return getToken(PigLatinParser.FALSUS, 0); }
		public ValorPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterValorPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitValorPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitValorPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorPrimitivoContext valorPrimitivo() throws RecognitionException {
		ValorPrimitivoContext _localctx = new ValorPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_valorPrimitivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8646911284554498048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorNoPrimitivoContext extends ParserRuleContext {
		public ValorVariableContext valorVariable() {
			return getRuleContext(ValorVariableContext.class,0);
		}
		public ValorPosicionArregloContext valorPosicionArreglo() {
			return getRuleContext(ValorPosicionArregloContext.class,0);
		}
		public ValorEstructuraContext valorEstructura() {
			return getRuleContext(ValorEstructuraContext.class,0);
		}
		public ValorObjetoContext valorObjeto() {
			return getRuleContext(ValorObjetoContext.class,0);
		}
		public AccesoDatosVariablesContext accesoDatosVariables() {
			return getRuleContext(AccesoDatosVariablesContext.class,0);
		}
		public ValorNoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorNoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterValorNoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitValorNoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitValorNoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorNoPrimitivoContext valorNoPrimitivo() throws RecognitionException {
		ValorNoPrimitivoContext _localctx = new ValorNoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_valorNoPrimitivo);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				valorVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				valorPosicionArreglo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				valorEstructura();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				valorObjeto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				accesoDatosVariables();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorVariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public ValorVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterValorVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitValorVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitValorVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorVariableContext valorVariable() throws RecognitionException {
		ValorVariableContext _localctx = new ValorVariableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_valorVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorPosicionArregloContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ValorPosicionArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorPosicionArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterValorPosicionArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitValorPosicionArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitValorPosicionArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorPosicionArregloContext valorPosicionArreglo() throws RecognitionException {
		ValorPosicionArregloContext _localctx = new ValorPosicionArregloContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_valorPosicionArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(ID);
			setState(441);
			match(T__10);
			setState(442);
			expresion();
			setState(443);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorEstructuraContext extends ParserRuleContext {
		public ValoresLlavesContext valoresLlaves() {
			return getRuleContext(ValoresLlavesContext.class,0);
		}
		public ValorEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterValorEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitValorEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitValorEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorEstructuraContext valorEstructura() throws RecognitionException {
		ValorEstructuraContext _localctx = new ValorEstructuraContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_valorEstructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			valoresLlaves();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValorObjetoContext extends ParserRuleContext {
		public InstanciaObjetoContext instanciaObjeto() {
			return getRuleContext(InstanciaObjetoContext.class,0);
		}
		public ValorObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorObjeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterValorObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitValorObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitValorObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorObjetoContext valorObjeto() throws RecognitionException {
		ValorObjetoContext _localctx = new ValorObjetoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_valorObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			instanciaObjeto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccesoDatosVariablesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public List<AccesoMiembroContext> accesoMiembro() {
			return getRuleContexts(AccesoMiembroContext.class);
		}
		public AccesoMiembroContext accesoMiembro(int i) {
			return getRuleContext(AccesoMiembroContext.class,i);
		}
		public AccesoDatosVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoDatosVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterAccesoDatosVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitAccesoDatosVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitAccesoDatosVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoDatosVariablesContext accesoDatosVariables() throws RecognitionException {
		AccesoDatosVariablesContext _localctx = new AccesoDatosVariablesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_accesoDatosVariables);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(ID);
			setState(451); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(450);
					accesoMiembro();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(453); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccesoMiembroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public TamanioArregloContext tamanioArreglo() {
			return getRuleContext(TamanioArregloContext.class,0);
		}
		public AccesoMiembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoMiembro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterAccesoMiembro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitAccesoMiembro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitAccesoMiembro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesoMiembroContext accesoMiembro() throws RecognitionException {
		AccesoMiembroContext _localctx = new AccesoMiembroContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_accesoMiembro);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(T__1);
				setState(456);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(T__1);
				setState(458);
				match(ID);
				setState(459);
				match(T__8);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8935146642868273728L) != 0)) {
					{
					setState(460);
					argumento();
					}
				}

				setState(463);
				match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				tamanioArreglo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoIncrementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TerminalNode SUMA_ABREVIADA() { return getToken(PigLatinParser.SUMA_ABREVIADA, 0); }
		public TerminalNode RESTA_ABREVIADA() { return getToken(PigLatinParser.RESTA_ABREVIADA, 0); }
		public TipoIncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoIncremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterTipoIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitTipoIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitTipoIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoIncrementoContext tipoIncremento() throws RecognitionException {
		TipoIncrementoContext _localctx = new TipoIncrementoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tipoIncremento);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(ID);
				setState(468);
				match(SUMA_ABREVIADA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(ID);
				setState(470);
				match(RESTA_ABREVIADA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefPrincipalContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(PigLatinParser.MAIOR, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(PigLatinParser.MAYOR_QUE, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public DefPrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defPrincipal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterDefPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitDefPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitDefPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefPrincipalContext defPrincipal() throws RecognitionException {
		DefPrincipalContext _localctx = new DefPrincipalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_defPrincipal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(MAIOR);
			setState(474);
			match(MAYOR_QUE);
			setState(475);
			instruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_instruccion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288335929746391040L) != 0)) {
				{
				{
				setState(477);
				sentencia();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public SentenciaFuncionEspecialContext sentenciaFuncionEspecial() {
			return getRuleContext(SentenciaFuncionEspecialContext.class,0);
		}
		public SentenciaInstruccionContext sentenciaInstruccion() {
			return getRuleContext(SentenciaInstruccionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_sentencia);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				sentenciaFuncionEspecial();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				sentenciaInstruccion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaFuncionEspecialContext extends ParserRuleContext {
		public FuncionLeerTextoConsolaContext funcionLeerTextoConsola() {
			return getRuleContext(FuncionLeerTextoConsolaContext.class,0);
		}
		public FuncionImprimirTextoContext funcionImprimirTexto() {
			return getRuleContext(FuncionImprimirTextoContext.class,0);
		}
		public SentenciaFuncionEspecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaFuncionEspecial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterSentenciaFuncionEspecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitSentenciaFuncionEspecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitSentenciaFuncionEspecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaFuncionEspecialContext sentenciaFuncionEspecial() throws RecognitionException {
		SentenciaFuncionEspecialContext _localctx = new SentenciaFuncionEspecialContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sentenciaFuncionEspecial);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEER_TEXTO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				funcionLeerTextoConsola();
				}
				break;
			case IMPRIMIR_TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				funcionImprimirTexto();
				setState(489);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionLeerTextoConsolaContext extends ParserRuleContext {
		public LeerSinGuardarContext leerSinGuardar() {
			return getRuleContext(LeerSinGuardarContext.class,0);
		}
		public LeerGuardarContext leerGuardar() {
			return getRuleContext(LeerGuardarContext.class,0);
		}
		public FuncionLeerTextoConsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionLeerTextoConsola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterFuncionLeerTextoConsola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitFuncionLeerTextoConsola(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitFuncionLeerTextoConsola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionLeerTextoConsolaContext funcionLeerTextoConsola() throws RecognitionException {
		FuncionLeerTextoConsolaContext _localctx = new FuncionLeerTextoConsolaContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_funcionLeerTextoConsola);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEER_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				leerSinGuardar();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				leerGuardar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeerSinGuardarContext extends ParserRuleContext {
		public TerminalNode LEER_TEXTO() { return getToken(PigLatinParser.LEER_TEXTO, 0); }
		public LeerSinGuardarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerSinGuardar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterLeerSinGuardar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitLeerSinGuardar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitLeerSinGuardar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerSinGuardarContext leerSinGuardar() throws RecognitionException {
		LeerSinGuardarContext _localctx = new LeerSinGuardarContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_leerSinGuardar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(LEER_TEXTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeerGuardarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PigLatinParser.ID, 0); }
		public TerminalNode LEER_TEXTO() { return getToken(PigLatinParser.LEER_TEXTO, 0); }
		public LeerGuardarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerGuardar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterLeerGuardar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitLeerGuardar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitLeerGuardar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeerGuardarContext leerGuardar() throws RecognitionException {
		LeerGuardarContext _localctx = new LeerGuardarContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_leerGuardar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(ID);
			setState(500);
			match(LEER_TEXTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionImprimirTextoContext extends ParserRuleContext {
		public ImprimirTextoContext imprimirTexto() {
			return getRuleContext(ImprimirTextoContext.class,0);
		}
		public ImprimirVariableContext imprimirVariable() {
			return getRuleContext(ImprimirVariableContext.class,0);
		}
		public FuncionImprimirTextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionImprimirTexto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterFuncionImprimirTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitFuncionImprimirTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitFuncionImprimirTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionImprimirTextoContext funcionImprimirTexto() throws RecognitionException {
		FuncionImprimirTextoContext _localctx = new FuncionImprimirTextoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_funcionImprimirTexto);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				imprimirTexto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				imprimirVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirTextoContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR_TEXTO() { return getToken(PigLatinParser.IMPRIMIR_TEXTO, 0); }
		public TerminalNode CADENA() { return getToken(PigLatinParser.CADENA, 0); }
		public ImprimirTextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirTexto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterImprimirTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitImprimirTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitImprimirTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirTextoContext imprimirTexto() throws RecognitionException {
		ImprimirTextoContext _localctx = new ImprimirTextoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_imprimirTexto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(IMPRIMIR_TEXTO);
			setState(507);
			match(CADENA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimirVariableContext extends ParserRuleContext {
		public List<TerminalNode> IMPRIMIR_TEXTO() { return getTokens(PigLatinParser.IMPRIMIR_TEXTO); }
		public TerminalNode IMPRIMIR_TEXTO(int i) {
			return getToken(PigLatinParser.IMPRIMIR_TEXTO, i);
		}
		public List<TerminalNode> ID() { return getTokens(PigLatinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PigLatinParser.ID, i);
		}
		public ImprimirVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterImprimirVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitImprimirVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitImprimirVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirVariableContext imprimirVariable() throws RecognitionException {
		ImprimirVariableContext _localctx = new ImprimirVariableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_imprimirVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(IMPRIMIR_TEXTO);
			setState(510);
			match(ID);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPRIMIR_TEXTO) {
				{
				{
				setState(511);
				match(IMPRIMIR_TEXTO);
				setState(512);
				match(ID);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaInstruccionContext extends ParserRuleContext {
		public SentenciaSiContext sentenciaSi() {
			return getRuleContext(SentenciaSiContext.class,0);
		}
		public SentenciaVariableContext sentenciaVariable() {
			return getRuleContext(SentenciaVariableContext.class,0);
		}
		public SentenciaCicloContext sentenciaCiclo() {
			return getRuleContext(SentenciaCicloContext.class,0);
		}
		public SentenciaInstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaInstruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterSentenciaInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitSentenciaInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitSentenciaInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaInstruccionContext sentenciaInstruccion() throws RecognitionException {
		SentenciaInstruccionContext _localctx = new SentenciaInstruccionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sentenciaInstruccion);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				sentenciaSi();
				}
				break;
			case ESTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				sentenciaVariable();
				}
				break;
			case DUM:
			case FACERE:
			case PER:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				sentenciaCiclo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaSiContext extends ParserRuleContext {
		public CondicionalSiContext condicionalSi() {
			return getRuleContext(CondicionalSiContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(PigLatinParser.FINIS, 0); }
		public List<CondicionalAliterSiContext> condicionalAliterSi() {
			return getRuleContexts(CondicionalAliterSiContext.class);
		}
		public CondicionalAliterSiContext condicionalAliterSi(int i) {
			return getRuleContext(CondicionalAliterSiContext.class,i);
		}
		public CondicionalAliterContext condicionalAliter() {
			return getRuleContext(CondicionalAliterContext.class,0);
		}
		public SentenciaSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterSentenciaSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitSentenciaSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitSentenciaSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaSiContext sentenciaSi() throws RecognitionException {
		SentenciaSiContext _localctx = new SentenciaSiContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_sentenciaSi);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			condicionalSi();
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					condicionalAliterSi();
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALITER) {
				{
				setState(530);
				condicionalAliter();
				}
			}

			setState(533);
			match(FINIS);
			setState(534);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalSiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PigLatinParser.SI, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public SeccionInstruccionContext seccionInstruccion() {
			return getRuleContext(SeccionInstruccionContext.class,0);
		}
		public CondicionalSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCondicionalSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCondicionalSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCondicionalSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalSiContext condicionalSi() throws RecognitionException {
		CondicionalSiContext _localctx = new CondicionalSiContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_condicionalSi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(SI);
			setState(537);
			condicional();
			setState(538);
			seccionInstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(T__8);
			setState(541);
			expresion();
			setState(542);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalAliterSiContext extends ParserRuleContext {
		public TerminalNode ALITER() { return getToken(PigLatinParser.ALITER, 0); }
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public SeccionInstruccionContext seccionInstruccion() {
			return getRuleContext(SeccionInstruccionContext.class,0);
		}
		public CondicionalAliterSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalAliterSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCondicionalAliterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCondicionalAliterSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCondicionalAliterSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalAliterSiContext condicionalAliterSi() throws RecognitionException {
		CondicionalAliterSiContext _localctx = new CondicionalAliterSiContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_condicionalAliterSi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(ALITER);
			setState(545);
			condicional();
			setState(546);
			seccionInstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalAliterContext extends ParserRuleContext {
		public TerminalNode ALITER() { return getToken(PigLatinParser.ALITER, 0); }
		public SeccionInstruccionContext seccionInstruccion() {
			return getRuleContext(SeccionInstruccionContext.class,0);
		}
		public CondicionalAliterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalAliter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCondicionalAliter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCondicionalAliter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCondicionalAliter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalAliterContext condicionalAliter() throws RecognitionException {
		CondicionalAliterContext _localctx = new CondicionalAliterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_condicionalAliter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(ALITER);
			setState(549);
			seccionInstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeccionInstruccionContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public SeccionInstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seccionInstruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterSeccionInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitSeccionInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitSeccionInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeccionInstruccionContext seccionInstruccion() throws RecognitionException {
		SeccionInstruccionContext _localctx = new SeccionInstruccionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_seccionInstruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(T__5);
			setState(552);
			instruccion();
			setState(553);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaVariableContext extends ParserRuleContext {
		public AsignarVariableContext asignarVariable() {
			return getRuleContext(AsignarVariableContext.class,0);
		}
		public SentenciaVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterSentenciaVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitSentenciaVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitSentenciaVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaVariableContext sentenciaVariable() throws RecognitionException {
		SentenciaVariableContext _localctx = new SentenciaVariableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sentenciaVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			asignarVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaCicloContext extends ParserRuleContext {
		public CicloDumContext cicloDum() {
			return getRuleContext(CicloDumContext.class,0);
		}
		public CicloFacereDumContext cicloFacereDum() {
			return getRuleContext(CicloFacereDumContext.class,0);
		}
		public CicloPerContext cicloPer() {
			return getRuleContext(CicloPerContext.class,0);
		}
		public SentenciaCicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaCiclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterSentenciaCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitSentenciaCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitSentenciaCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaCicloContext sentenciaCiclo() throws RecognitionException {
		SentenciaCicloContext _localctx = new SentenciaCicloContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_sentenciaCiclo);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				cicloDum();
				}
				break;
			case FACERE:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				cicloFacereDum();
				}
				break;
			case PER:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				cicloPer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CicloDumContext extends ParserRuleContext {
		public CondicionalDumContext condicionalDum() {
			return getRuleContext(CondicionalDumContext.class,0);
		}
		public SeccionInstruccionContext seccionInstruccion() {
			return getRuleContext(SeccionInstruccionContext.class,0);
		}
		public TerminalNode FINIS() { return getToken(PigLatinParser.FINIS, 0); }
		public CicloDumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloDum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCicloDum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCicloDum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCicloDum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloDumContext cicloDum() throws RecognitionException {
		CicloDumContext _localctx = new CicloDumContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cicloDum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			condicionalDum();
			setState(563);
			seccionInstruccion();
			setState(564);
			match(FINIS);
			setState(565);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalDumContext extends ParserRuleContext {
		public TerminalNode DUM() { return getToken(PigLatinParser.DUM, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionalDumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalDum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCondicionalDum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCondicionalDum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCondicionalDum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalDumContext condicionalDum() throws RecognitionException {
		CondicionalDumContext _localctx = new CondicionalDumContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_condicionalDum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(DUM);
			setState(568);
			match(T__8);
			setState(569);
			expresion();
			setState(570);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CicloFacereDumContext extends ParserRuleContext {
		public TerminalNode FACERE() { return getToken(PigLatinParser.FACERE, 0); }
		public SeccionInstruccionContext seccionInstruccion() {
			return getRuleContext(SeccionInstruccionContext.class,0);
		}
		public CondicionalDumContext condicionalDum() {
			return getRuleContext(CondicionalDumContext.class,0);
		}
		public CicloFacereDumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloFacereDum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCicloFacereDum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCicloFacereDum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCicloFacereDum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloFacereDumContext cicloFacereDum() throws RecognitionException {
		CicloFacereDumContext _localctx = new CicloFacereDumContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cicloFacereDum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(FACERE);
			setState(573);
			seccionInstruccion();
			setState(574);
			condicionalDum();
			setState(575);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CicloPerContext extends ParserRuleContext {
		public TerminalNode PER() { return getToken(PigLatinParser.PER, 0); }
		public CondicionalPerContext condicionalPer() {
			return getRuleContext(CondicionalPerContext.class,0);
		}
		public SeccionInstruccionContext seccionInstruccion() {
			return getRuleContext(SeccionInstruccionContext.class,0);
		}
		public CicloPerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicloPer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCicloPer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCicloPer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCicloPer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloPerContext cicloPer() throws RecognitionException {
		CicloPerContext _localctx = new CicloPerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cicloPer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(PER);
			setState(578);
			condicionalPer();
			setState(579);
			seccionInstruccion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalPerContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TipoIncrementoContext tipoIncremento() {
			return getRuleContext(TipoIncrementoContext.class,0);
		}
		public AsignarVariablePrimitivaContext asignarVariablePrimitiva() {
			return getRuleContext(AsignarVariablePrimitivaContext.class,0);
		}
		public DeclAsignPrimitivoContext declAsignPrimitivo() {
			return getRuleContext(DeclAsignPrimitivoContext.class,0);
		}
		public CondicionalPerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalPer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).enterCondicionalPer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PigLatinListener ) ((PigLatinListener)listener).exitCondicionalPer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PigLatinVisitor ) return ((PigLatinVisitor<? extends T>)visitor).visitCondicionalPer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalPerContext condicionalPer() throws RecognitionException {
		CondicionalPerContext _localctx = new CondicionalPerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_condicionalPer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__8);
			setState(584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(582);
				asignarVariablePrimitiva();
				}
				break;
			case ESTO:
				{
				setState(583);
				declAsignPrimitivo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(586);
			match(T__0);
			setState(587);
			expresion();
			setState(588);
			match(T__0);
			setState(589);
			tipoIncremento();
			setState(590);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return exprLogica_sempred((ExprLogicaContext)_localctx, predIndex);
		case 34:
			return exprRelacional_sempred((ExprRelacionalContext)_localctx, predIndex);
		case 35:
			return exprAritmetica_sempred((ExprAritmeticaContext)_localctx, predIndex);
		case 36:
			return termino_sempred((TerminoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprLogica_sempred(ExprLogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprRelacional_sempred(ExprRelacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprAritmetica_sempred(ExprAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termino_sempred(TerminoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u0251\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0001\u0000\u0005\u0000\u0092\b\u0000\n\u0000\f"+
		"\u0000\u0095\t\u0000\u0001\u0000\u0003\u0000\u0098\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00a4\b\u0002\n\u0002"+
		"\f\u0002\u00a7\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0005\u0007\u00b7\b\u0007"+
		"\n\u0007\f\u0007\u00ba\t\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00bf\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00ca\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00df\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00f3\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00f9\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0103\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0109\b\u0014\n"+
		"\u0014\f\u0014\u010c\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0117\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u011d\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0124\b\u0017\n\u0017\f\u0017\u0127\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u013c\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0152\b\u001d"+
		"\n\u001d\f\u001d\u0155\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u016a"+
		"\b!\n!\f!\u016d\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0184\b\"\n\"\f\"\u0187"+
		"\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u018f\b#\n#\f#\u0192"+
		"\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u019a\b$\n$\f$\u019d"+
		"\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u01a8\b%\u0001&\u0001&\u0003&\u01ac\b&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u01b5\b(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0004-\u01c4"+
		"\b-\u000b-\f-\u01c5\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01ce"+
		"\b.\u0001.\u0001.\u0003.\u01d2\b.\u0001/\u0001/\u0001/\u0001/\u0003/\u01d8"+
		"\b/\u00010\u00010\u00010\u00010\u00011\u00051\u01df\b1\n1\f1\u01e2\t1"+
		"\u00012\u00012\u00032\u01e6\b2\u00013\u00013\u00013\u00013\u00033\u01ec"+
		"\b3\u00014\u00014\u00034\u01f0\b4\u00015\u00015\u00016\u00016\u00016\u0001"+
		"7\u00017\u00037\u01f9\b7\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00059\u0202\b9\n9\f9\u0205\t9\u0001:\u0001:\u0001:\u0003:\u020a\b:"+
		"\u0001;\u0001;\u0005;\u020e\b;\n;\f;\u0211\t;\u0001;\u0003;\u0214\b;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001A\u0001A\u0001B\u0001B\u0001B\u0003B\u0231\bB\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0003G\u0249\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0000"+
		"\u0004BDFHH\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0000\u0005\u0001"+
		"\u0000\u0003\u0004\u0002\u0000\u000e\u0011$$\u0001\u0000)*\u0001\u0000"+
		"+,\u0002\u0000\u0014\u0015;>\u0243\u0000\u0093\u0001\u0000\u0000\u0000"+
		"\u0002\u009d\u0001\u0000\u0000\u0000\u0004\u00a5\u0001\u0000\u0000\u0000"+
		"\u0006\u00aa\u0001\u0000\u0000\u0000\b\u00ac\u0001\u0000\u0000\u0000\n"+
		"\u00af\u0001\u0000\u0000\u0000\f\u00b1\u0001\u0000\u0000\u0000\u000e\u00b8"+
		"\u0001\u0000\u0000\u0000\u0010\u00be\u0001\u0000\u0000\u0000\u0012\u00c9"+
		"\u0001\u0000\u0000\u0000\u0014\u00cb\u0001\u0000\u0000\u0000\u0016\u00d0"+
		"\u0001\u0000\u0000\u0000\u0018\u00d6\u0001\u0000\u0000\u0000\u001a\u00de"+
		"\u0001\u0000\u0000\u0000\u001c\u00e0\u0001\u0000\u0000\u0000\u001e\u00e2"+
		"\u0001\u0000\u0000\u0000 \u00e4\u0001\u0000\u0000\u0000\"\u00f2\u0001"+
		"\u0000\u0000\u0000$\u00f8\u0001\u0000\u0000\u0000&\u0102\u0001\u0000\u0000"+
		"\u0000(\u0104\u0001\u0000\u0000\u0000*\u0116\u0001\u0000\u0000\u0000,"+
		"\u0118\u0001\u0000\u0000\u0000.\u0120\u0001\u0000\u0000\u00000\u0128\u0001"+
		"\u0000\u0000\u00002\u012c\u0001\u0000\u0000\u00004\u013b\u0001\u0000\u0000"+
		"\u00006\u013d\u0001\u0000\u0000\u00008\u0143\u0001\u0000\u0000\u0000:"+
		"\u014a\u0001\u0000\u0000\u0000<\u0156\u0001\u0000\u0000\u0000>\u015b\u0001"+
		"\u0000\u0000\u0000@\u015e\u0001\u0000\u0000\u0000B\u0160\u0001\u0000\u0000"+
		"\u0000D\u016e\u0001\u0000\u0000\u0000F\u0188\u0001\u0000\u0000\u0000H"+
		"\u0193\u0001\u0000\u0000\u0000J\u01a7\u0001\u0000\u0000\u0000L\u01ab\u0001"+
		"\u0000\u0000\u0000N\u01ad\u0001\u0000\u0000\u0000P\u01b4\u0001\u0000\u0000"+
		"\u0000R\u01b6\u0001\u0000\u0000\u0000T\u01b8\u0001\u0000\u0000\u0000V"+
		"\u01bd\u0001\u0000\u0000\u0000X\u01bf\u0001\u0000\u0000\u0000Z\u01c1\u0001"+
		"\u0000\u0000\u0000\\\u01d1\u0001\u0000\u0000\u0000^\u01d7\u0001\u0000"+
		"\u0000\u0000`\u01d9\u0001\u0000\u0000\u0000b\u01e0\u0001\u0000\u0000\u0000"+
		"d\u01e5\u0001\u0000\u0000\u0000f\u01eb\u0001\u0000\u0000\u0000h\u01ef"+
		"\u0001\u0000\u0000\u0000j\u01f1\u0001\u0000\u0000\u0000l\u01f3\u0001\u0000"+
		"\u0000\u0000n\u01f8\u0001\u0000\u0000\u0000p\u01fa\u0001\u0000\u0000\u0000"+
		"r\u01fd\u0001\u0000\u0000\u0000t\u0209\u0001\u0000\u0000\u0000v\u020b"+
		"\u0001\u0000\u0000\u0000x\u0218\u0001\u0000\u0000\u0000z\u021c\u0001\u0000"+
		"\u0000\u0000|\u0220\u0001\u0000\u0000\u0000~\u0224\u0001\u0000\u0000\u0000"+
		"\u0080\u0227\u0001\u0000\u0000\u0000\u0082\u022b\u0001\u0000\u0000\u0000"+
		"\u0084\u0230\u0001\u0000\u0000\u0000\u0086\u0232\u0001\u0000\u0000\u0000"+
		"\u0088\u0237\u0001\u0000\u0000\u0000\u008a\u023c\u0001\u0000\u0000\u0000"+
		"\u008c\u0241\u0001\u0000\u0000\u0000\u008e\u0245\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0003\u0002\u0001\u0000\u0091\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0003\f\u0006\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0003`0\u0000\u009a\u009b\u0005"+
		"\r\u0000\u0000\u009b\u009c\u0005\u0001\u0000\u0000\u009c\u0001\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005(\u0000\u0000\u009e\u009f\u0003\u0004\u0002"+
		"\u0000\u009f\u0003\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u0006\u0003"+
		"\u0000\u00a1\u00a2\u0005\u0002\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0003\b\u0004\u0000\u00a9\u0005\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005:\u0000\u0000\u00ab\u0007\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005:\u0000\u0000\u00ad\u00ae\u0003\n\u0005\u0000\u00ae\t\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0007\u0000\u0000\u0000\u00b0\u000b\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\u001e\u0000\u0000\u00b2\u00b3\u0005"+
		"2\u0000\u0000\u00b3\u00b4\u0003\u000e\u0007\u0000\u00b4\r\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0003\u0010\b\u0000\u00b6\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u000f\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bf\u0003\u0012\t\u0000"+
		"\u00bc\u00bf\u0003\"\u0011\u0000\u00bd\u00bf\u00034\u001a\u0000\u00be"+
		"\u00bb\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u0011\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0003\u0014\n\u0000\u00c1\u00c2\u0005\u0001\u0000\u0000\u00c2\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0003\u0016\u000b\u0000\u00c4\u00c5"+
		"\u0005\u0001\u0000\u0000\u00c5\u00ca\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0003\u0018\f\u0000\u00c7\u00c8\u0005\u0001\u0000\u0000\u00c8\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c0\u0001\u0000\u0000\u0000\u00c9\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00ca\u0013\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005\u0012\u0000\u0000\u00cc\u00cd\u0005"+
		":\u0000\u0000\u00cd\u00ce\u0005\u0005\u0000\u0000\u00ce\u00cf\u0003\u001a"+
		"\r\u0000\u00cf\u0015\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0013\u0000"+
		"\u0000\u00d1\u00d2\u0005:\u0000\u0000\u00d2\u00d3\u0003:\u001d\u0000\u00d3"+
		"\u00d4\u0005\u0005\u0000\u0000\u00d4\u00d5\u0003\u001a\r\u0000\u00d5\u0017"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0012\u0000\u0000\u00d7\u00d8"+
		"\u0005:\u0000\u0000\u00d8\u00d9\u0005\u0005\u0000\u0000\u00d9\u00da\u0003"+
		"\u001e\u000f\u0000\u00da\u0019\u0001\u0000\u0000\u0000\u00db\u00df\u0003"+
		"\u001c\u000e\u0000\u00dc\u00df\u0003\u001e\u000f\u0000\u00dd\u00df\u0003"+
		" \u0010\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u001b\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0007\u0001\u0000\u0000\u00e1\u001d\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005:\u0000\u0000\u00e3\u001f\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005:\u0000\u0000\u00e5!\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0003$\u0012\u0000\u00e7\u00e8\u0005\u0001\u0000\u0000\u00e8\u00f3"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003&\u0013\u0000\u00ea\u00eb\u0005"+
		"\u0001\u0000\u0000\u00eb\u00f3\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003"+
		"*\u0015\u0000\u00ed\u00ee\u0005\u0001\u0000\u0000\u00ee\u00f3\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u00032\u0019\u0000\u00f0\u00f1\u0005\u0001\u0000"+
		"\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00e6\u0001\u0000\u0000"+
		"\u0000\u00f2\u00e9\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f3#\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u0003>\u001f\u0000\u00f5\u00f6\u0003@ \u0000\u00f6\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f9\u0003^/\u0000\u00f8\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9%\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0003>\u001f\u0000\u00fb\u00fc\u0003(\u0014\u0000\u00fc"+
		"\u0103\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005:\u0000\u0000\u00fe\u00ff"+
		"\u0003:\u001d\u0000\u00ff\u0100\u00055\u0000\u0000\u0100\u0101\u0003@"+
		" \u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00fa\u0001\u0000\u0000"+
		"\u0000\u0102\u00fd\u0001\u0000\u0000\u0000\u0103\'\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005\u0006\u0000\u0000\u0105\u010a\u0003@ \u0000\u0106\u0107"+
		"\u0005\u0007\u0000\u0000\u0107\u0109\u0003@ \u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010e\u0005\b\u0000"+
		"\u0000\u010e)\u0001\u0000\u0000\u0000\u010f\u0110\u0003>\u001f\u0000\u0110"+
		"\u0111\u0003\u001e\u000f\u0000\u0111\u0117\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0003>\u001f\u0000\u0113\u0114\u0003,\u0016\u0000\u0114\u0117\u0001"+
		"\u0000\u0000\u0000\u0115\u0117\u00030\u0018\u0000\u0116\u010f\u0001\u0000"+
		"\u0000\u0000\u0116\u0112\u0001\u0000\u0000\u0000\u0116\u0115\u0001\u0000"+
		"\u0000\u0000\u0117+\u0001\u0000\u0000\u0000\u0118\u0119\u0005\'\u0000"+
		"\u0000\u0119\u011a\u0003\u001e\u000f\u0000\u011a\u011c\u0005\t\u0000\u0000"+
		"\u011b\u011d\u0003.\u0017\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005\n\u0000\u0000\u011f-\u0001\u0000\u0000\u0000\u0120\u0125"+
		"\u0003@ \u0000\u0121\u0122\u0005\u0007\u0000\u0000\u0122\u0124\u0003@"+
		" \u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126/\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0003Z-\u0000\u0129\u012a\u00055\u0000\u0000\u012a\u012b"+
		"\u0003@ \u0000\u012b1\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0012"+
		"\u0000\u0000\u012d\u012e\u0005:\u0000\u0000\u012e\u012f\u0005\u0005\u0000"+
		"\u0000\u012f\u0130\u0003 \u0010\u0000\u0130\u0131\u0003(\u0014\u0000\u0131"+
		"3\u0001\u0000\u0000\u0000\u0132\u0133\u00036\u001b\u0000\u0133\u0134\u0005"+
		"\u0001\u0000\u0000\u0134\u013c\u0001\u0000\u0000\u0000\u0135\u0136\u0003"+
		"8\u001c\u0000\u0136\u0137\u0005\u0001\u0000\u0000\u0137\u013c\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0003<\u001e\u0000\u0139\u013a\u0005\u0001\u0000"+
		"\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0132\u0001\u0000\u0000"+
		"\u0000\u013b\u0135\u0001\u0000\u0000\u0000\u013b\u0138\u0001\u0000\u0000"+
		"\u0000\u013c5\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0012\u0000\u0000"+
		"\u013e\u013f\u0005:\u0000\u0000\u013f\u0140\u0005\u0005\u0000\u0000\u0140"+
		"\u0141\u0003\u001c\u000e\u0000\u0141\u0142\u0003@ \u0000\u01427\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005\u0013\u0000\u0000\u0144\u0145\u0005"+
		":\u0000\u0000\u0145\u0146\u0003:\u001d\u0000\u0146\u0147\u0005\u0005\u0000"+
		"\u0000\u0147\u0148\u0003\u001a\r\u0000\u0148\u0149\u0003(\u0014\u0000"+
		"\u01499\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u000b\u0000\u0000\u014b"+
		"\u014c\u0003@ \u0000\u014c\u0153\u0005\f\u0000\u0000\u014d\u014e\u0005"+
		"\u000b\u0000\u0000\u014e\u014f\u0003@ \u0000\u014f\u0150\u0005\f\u0000"+
		"\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154;\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u0012\u0000\u0000"+
		"\u0157\u0158\u0005:\u0000\u0000\u0158\u0159\u0005\u0005\u0000\u0000\u0159"+
		"\u015a\u0003,\u0016\u0000\u015a=\u0001\u0000\u0000\u0000\u015b\u015c\u0005"+
		":\u0000\u0000\u015c\u015d\u00055\u0000\u0000\u015d?\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0003B!\u0000\u015fA\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0006!\uffff\uffff\u0000\u0161\u0162\u0003D\"\u0000\u0162\u016b"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\n\u0003\u0000\u0000\u0164\u0165\u0005"+
		"7\u0000\u0000\u0165\u016a\u0003B!\u0004\u0166\u0167\n\u0002\u0000\u0000"+
		"\u0167\u0168\u00056\u0000\u0000\u0168\u016a\u0003B!\u0003\u0169\u0163"+
		"\u0001\u0000\u0000\u0000\u0169\u0166\u0001\u0000\u0000\u0000\u016a\u016d"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016cC\u0001\u0000\u0000\u0000\u016d\u016b\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0006\"\uffff\uffff\u0000\u016f\u0170\u0003"+
		"F#\u0000\u0170\u0185\u0001\u0000\u0000\u0000\u0171\u0172\n\u0007\u0000"+
		"\u0000\u0172\u0173\u0005/\u0000\u0000\u0173\u0184\u0003F#\u0000\u0174"+
		"\u0175\n\u0006\u0000\u0000\u0175\u0176\u00050\u0000\u0000\u0176\u0184"+
		"\u0003F#\u0000\u0177\u0178\n\u0005\u0000\u0000\u0178\u0179\u00052\u0000"+
		"\u0000\u0179\u0184\u0003F#\u0000\u017a\u017b\n\u0004\u0000\u0000\u017b"+
		"\u017c\u00051\u0000\u0000\u017c\u0184\u0003F#\u0000\u017d\u017e\n\u0003"+
		"\u0000\u0000\u017e\u017f\u00053\u0000\u0000\u017f\u0184\u0003F#\u0000"+
		"\u0180\u0181\n\u0002\u0000\u0000\u0181\u0182\u00054\u0000\u0000\u0182"+
		"\u0184\u0003F#\u0000\u0183\u0171\u0001\u0000\u0000\u0000\u0183\u0174\u0001"+
		"\u0000\u0000\u0000\u0183\u0177\u0001\u0000\u0000\u0000\u0183\u017a\u0001"+
		"\u0000\u0000\u0000\u0183\u017d\u0001\u0000\u0000\u0000\u0183\u0180\u0001"+
		"\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186E\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0006#\uffff"+
		"\uffff\u0000\u0189\u018a\u0003H$\u0000\u018a\u0190\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\n\u0002\u0000\u0000\u018c\u018d\u0007\u0002\u0000\u0000\u018d"+
		"\u018f\u0003H$\u0000\u018e\u018b\u0001\u0000\u0000\u0000\u018f\u0192\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191G\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0006$\uffff\uffff\u0000\u0194\u0195\u0003J%"+
		"\u0000\u0195\u019b\u0001\u0000\u0000\u0000\u0196\u0197\n\u0002\u0000\u0000"+
		"\u0197\u0198\u0007\u0003\u0000\u0000\u0198\u019a\u0003J%\u0000\u0199\u0196"+
		"\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019cI\u0001"+
		"\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u019f\u0005"+
		"#\u0000\u0000\u019f\u01a8\u0003J%\u0000\u01a0\u01a1\u0005*\u0000\u0000"+
		"\u01a1\u01a8\u0003J%\u0000\u01a2\u01a3\u0005\t\u0000\u0000\u01a3\u01a4"+
		"\u0003@ \u0000\u01a4\u01a5\u0005\n\u0000\u0000\u01a5\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0003L&\u0000\u01a7\u019e\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a0\u0001\u0000\u0000\u0000\u01a7\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8K\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ac\u0003N\'\u0000\u01aa\u01ac\u0003P(\u0000\u01ab\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01acM\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0007\u0004\u0000\u0000\u01aeO\u0001\u0000\u0000\u0000"+
		"\u01af\u01b5\u0003R)\u0000\u01b0\u01b5\u0003T*\u0000\u01b1\u01b5\u0003"+
		"V+\u0000\u01b2\u01b5\u0003X,\u0000\u01b3\u01b5\u0003Z-\u0000\u01b4\u01af"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b0\u0001\u0000\u0000\u0000\u01b4\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b5Q\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005"+
		":\u0000\u0000\u01b7S\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005:\u0000"+
		"\u0000\u01b9\u01ba\u0005\u000b\u0000\u0000\u01ba\u01bb\u0003@ \u0000\u01bb"+
		"\u01bc\u0005\f\u0000\u0000\u01bcU\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0003(\u0014\u0000\u01beW\u0001\u0000\u0000\u0000\u01bf\u01c0\u0003,"+
		"\u0016\u0000\u01c0Y\u0001\u0000\u0000\u0000\u01c1\u01c3\u0005:\u0000\u0000"+
		"\u01c2\u01c4\u0003\\.\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6[\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0005\u0002\u0000\u0000\u01c8\u01d2\u0005:\u0000\u0000\u01c9\u01ca\u0005"+
		"\u0002\u0000\u0000\u01ca\u01cb\u0005:\u0000\u0000\u01cb\u01cd\u0005\t"+
		"\u0000\u0000\u01cc\u01ce\u0003.\u0017\u0000\u01cd\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d2\u0005\n\u0000\u0000\u01d0\u01d2\u0003:\u001d\u0000"+
		"\u01d1\u01c7\u0001\u0000\u0000\u0000\u01d1\u01c9\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2]\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0005:\u0000\u0000\u01d4\u01d8\u00058\u0000\u0000\u01d5\u01d6\u0005"+
		":\u0000\u0000\u01d6\u01d8\u00059\u0000\u0000\u01d7\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8_\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005 \u0000\u0000\u01da\u01db\u00052\u0000\u0000\u01db\u01dc"+
		"\u0003b1\u0000\u01dca\u0001\u0000\u0000\u0000\u01dd\u01df\u0003d2\u0000"+
		"\u01de\u01dd\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e1c\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e6\u0003f3\u0000\u01e4\u01e6\u0003t:\u0000\u01e5\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6e\u0001\u0000\u0000"+
		"\u0000\u01e7\u01ec\u0003h4\u0000\u01e8\u01e9\u0003n7\u0000\u01e9\u01ea"+
		"\u0005\u0001\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000\u0000\u01eb\u01e7"+
		"\u0001\u0000\u0000\u0000\u01eb\u01e8\u0001\u0000\u0000\u0000\u01ecg\u0001"+
		"\u0000\u0000\u0000\u01ed\u01f0\u0003j5\u0000\u01ee\u01f0\u0003l6\u0000"+
		"\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f0i\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005-\u0000\u0000\u01f2k"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005:\u0000\u0000\u01f4\u01f5\u0005"+
		"-\u0000\u0000\u01f5m\u0001\u0000\u0000\u0000\u01f6\u01f9\u0003p8\u0000"+
		"\u01f7\u01f9\u0003r9\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9o\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005"+
		".\u0000\u0000\u01fb\u01fc\u0005>\u0000\u0000\u01fcq\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0005.\u0000\u0000\u01fe\u0203\u0005:\u0000\u0000\u01ff"+
		"\u0200\u0005.\u0000\u0000\u0200\u0202\u0005:\u0000\u0000\u0201\u01ff\u0001"+
		"\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204s\u0001\u0000"+
		"\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u020a\u0003v;\u0000"+
		"\u0207\u020a\u0003\u0082A\u0000\u0208\u020a\u0003\u0084B\u0000\u0209\u0206"+
		"\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u0208"+
		"\u0001\u0000\u0000\u0000\u020au\u0001\u0000\u0000\u0000\u020b\u020f\u0003"+
		"x<\u0000\u020c\u020e\u0003|>\u0000\u020d\u020c\u0001\u0000\u0000\u0000"+
		"\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000"+
		"\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000"+
		"\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0214\u0003~?\u0000\u0213\u0212"+
		"\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u0018\u0000\u0000\u0216\u0217"+
		"\u0005\u0001\u0000\u0000\u0217w\u0001\u0000\u0000\u0000\u0218\u0219\u0005"+
		"\u0017\u0000\u0000\u0219\u021a\u0003z=\u0000\u021a\u021b\u0003\u0080@"+
		"\u0000\u021by\u0001\u0000\u0000\u0000\u021c\u021d\u0005\t\u0000\u0000"+
		"\u021d\u021e\u0003@ \u0000\u021e\u021f\u0005\n\u0000\u0000\u021f{\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0005\u0019\u0000\u0000\u0221\u0222\u0003"+
		"z=\u0000\u0222\u0223\u0003\u0080@\u0000\u0223}\u0001\u0000\u0000\u0000"+
		"\u0224\u0225\u0005\u0019\u0000\u0000\u0225\u0226\u0003\u0080@\u0000\u0226"+
		"\u007f\u0001\u0000\u0000\u0000\u0227\u0228\u0005\u0006\u0000\u0000\u0228"+
		"\u0229\u0003b1\u0000\u0229\u022a\u0005\b\u0000\u0000\u022a\u0081\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0003\"\u0011\u0000\u022c\u0083\u0001\u0000"+
		"\u0000\u0000\u022d\u0231\u0003\u0086C\u0000\u022e\u0231\u0003\u008aE\u0000"+
		"\u022f\u0231\u0003\u008cF\u0000\u0230\u022d\u0001\u0000\u0000\u0000\u0230"+
		"\u022e\u0001\u0000\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0231"+
		"\u0085\u0001\u0000\u0000\u0000\u0232\u0233\u0003\u0088D\u0000\u0233\u0234"+
		"\u0003\u0080@\u0000\u0234\u0235\u0005\u0018\u0000\u0000\u0235\u0236\u0005"+
		"\u0001\u0000\u0000\u0236\u0087\u0001\u0000\u0000\u0000\u0237\u0238\u0005"+
		"\u001a\u0000\u0000\u0238\u0239\u0005\t\u0000\u0000\u0239\u023a\u0003@"+
		" \u0000\u023a\u023b\u0005\n\u0000\u0000\u023b\u0089\u0001\u0000\u0000"+
		"\u0000\u023c\u023d\u0005\u001b\u0000\u0000\u023d\u023e\u0003\u0080@\u0000"+
		"\u023e\u023f\u0003\u0088D\u0000\u023f\u0240\u0005\u0001\u0000\u0000\u0240"+
		"\u008b\u0001\u0000\u0000\u0000\u0241\u0242\u0005\u001c\u0000\u0000\u0242"+
		"\u0243\u0003\u008eG\u0000\u0243\u0244\u0003\u0080@\u0000\u0244\u008d\u0001"+
		"\u0000\u0000\u0000\u0245\u0248\u0005\t\u0000\u0000\u0246\u0249\u0003$"+
		"\u0012\u0000\u0247\u0249\u00036\u001b\u0000\u0248\u0246\u0001\u0000\u0000"+
		"\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0005\u0001\u0000\u0000\u024b\u024c\u0003@ \u0000\u024c"+
		"\u024d\u0005\u0001\u0000\u0000\u024d\u024e\u0003^/\u0000\u024e\u024f\u0005"+
		"\n\u0000\u0000\u024f\u008f\u0001\u0000\u0000\u0000(\u0093\u0097\u00a5"+
		"\u00b8\u00be\u00c9\u00de\u00f2\u00f8\u0102\u010a\u0116\u011c\u0125\u013b"+
		"\u0153\u0169\u016b\u0183\u0185\u0190\u019b\u01a7\u01ab\u01b4\u01c5\u01cd"+
		"\u01d1\u01d7\u01e0\u01e5\u01eb\u01ef\u01f8\u0203\u0209\u020f\u0213\u0230"+
		"\u0248";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}