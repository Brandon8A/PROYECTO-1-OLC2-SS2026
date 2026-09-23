// Generated from com/mycompany/y/Y.g4 by ANTLR 4.13.2
package com.mycompany.y;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class YParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PORCENTAJE=7, ESTRUCTURAS_SECCION=8, 
		ESTRUCTURA=9, ENTERO=10, CADENA=11, FLOTANTE=12, CARACTER=13, FUNCIONES_SECCION=14, 
		DEFINIR=15, RETORNAR=16, SI=17, ENTONCES=18, SINO=19, CONTRARIO=20, ELEGIR=21, 
		CASO=22, ROMPER=23, SIEMPRE=24, PARA=25, CONTINUAR=26, MIENTRAS=27, HACER=28, 
		IMPRIMIR=29, LEER=30, TIPO_RETORNO=31, SUMA=32, RESTA=33, MULTIPLICACION=34, 
		DIVISION=35, IGUALDAD=36, DESIGUALDAD=37, MENOR_QUE=38, MAYOR_QUE=39, 
		MAYOR_IGUAL_QUE=40, MENOR_IGUAL_QUE=41, ASIGNACION=42, AND=43, OR=44, 
		NEGACION=45, SUMA_ABREVIADA=46, RESTA_ABREVIADA=47, ID=48, VALOR_DECIMAL=49, 
		VALOR_ENTERO=50, VALOR_CARACTER=51, VALOR_CADENA=52, COMENTARIO_LINEA=53, 
		COMENTARIO_MULTILINEA=54, TAB=55, SALTO_LINEA=56, ESPACIO=57, INDENT=58, 
		DEDENT=59;
	public static final int
		RULE_programa = 0, RULE_defEstructuras = 1, RULE_estructura = 2, RULE_atributo = 3, 
		RULE_tipoDatoId = 4, RULE_defDatoPrimitivo = 5, RULE_defArreglo = 6, RULE_tipoDato = 7, 
		RULE_objeto = 8, RULE_estructuraAnidada = 9, RULE_defFunciones = 10, RULE_tipoFuncion = 11, 
		RULE_funSinRetorno = 12, RULE_parametro = 13, RULE_instruccion = 14, RULE_declararVariable = 15, 
		RULE_declararDatoPrimitivo = 16, RULE_asignacionDatoPrimitivo = 17, RULE_expresion = 18, 
		RULE_exprLogica = 19, RULE_exprRelacional = 20, RULE_exprAritmetica = 21, 
		RULE_termino = 22, RULE_factor = 23, RULE_valor = 24, RULE_funConRetorno = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "defEstructuras", "estructura", "atributo", "tipoDatoId", 
			"defDatoPrimitivo", "defArreglo", "tipoDato", "objeto", "estructuraAnidada", 
			"defFunciones", "tipoFuncion", "funSinRetorno", "parametro", "instruccion", 
			"declararVariable", "declararDatoPrimitivo", "asignacionDatoPrimitivo", 
			"expresion", "exprLogica", "exprRelacional", "exprAritmetica", "termino", 
			"factor", "valor", "funConRetorno"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'['", "']'", "'('", "')'", "','", "'%'", "'estructuras'", 
			"'estructura'", "'entero'", "'cadena'", "'flotante'", "'caracter'", "'funciones'", 
			"'definir'", "'retornar'", "'si'", "'entonces'", "'sino'", "'contrario'", 
			"'elegir'", "'caso'", "'romper'", "'siempre'", "'para'", "'continuar'", 
			"'mientras'", "'hacer'", "'imprimir'", "'leer'", "'->'", "'+'", "'-'", 
			"'*'", "'/'", "'=='", "'!='", "'<'", "'>'", "'>='", "'<='", "'='", "'&&'", 
			"'||'", "'!'", "'++'", "'--'", null, null, null, null, null, null, null, 
			"'\\t'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PORCENTAJE", "ESTRUCTURAS_SECCION", 
			"ESTRUCTURA", "ENTERO", "CADENA", "FLOTANTE", "CARACTER", "FUNCIONES_SECCION", 
			"DEFINIR", "RETORNAR", "SI", "ENTONCES", "SINO", "CONTRARIO", "ELEGIR", 
			"CASO", "ROMPER", "SIEMPRE", "PARA", "CONTINUAR", "MIENTRAS", "HACER", 
			"IMPRIMIR", "LEER", "TIPO_RETORNO", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "IGUALDAD", "DESIGUALDAD", "MENOR_QUE", "MAYOR_QUE", "MAYOR_IGUAL_QUE", 
			"MENOR_IGUAL_QUE", "ASIGNACION", "AND", "OR", "NEGACION", "SUMA_ABREVIADA", 
			"RESTA_ABREVIADA", "ID", "VALOR_DECIMAL", "VALOR_ENTERO", "VALOR_CARACTER", 
			"VALOR_CADENA", "COMENTARIO_LINEA", "COMENTARIO_MULTILINEA", "TAB", "SALTO_LINEA", 
			"ESPACIO", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "Y.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DefFuncionesContext defFunciones() {
			return getRuleContext(DefFuncionesContext.class,0);
		}
		public DefEstructurasContext defEstructuras() {
			return getRuleContext(DefEstructurasContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(52);
				defEstructuras();
				}
				break;
			}
			setState(55);
			defFunciones();
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
	public static class DefEstructurasContext extends ParserRuleContext {
		public TerminalNode PORCENTAJE() { return getToken(YParser.PORCENTAJE, 0); }
		public TerminalNode ESTRUCTURAS_SECCION() { return getToken(YParser.ESTRUCTURAS_SECCION, 0); }
		public TerminalNode SALTO_LINEA() { return getToken(YParser.SALTO_LINEA, 0); }
		public List<EstructuraContext> estructura() {
			return getRuleContexts(EstructuraContext.class);
		}
		public EstructuraContext estructura(int i) {
			return getRuleContext(EstructuraContext.class,i);
		}
		public DefEstructurasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defEstructuras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterDefEstructuras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitDefEstructuras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitDefEstructuras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefEstructurasContext defEstructuras() throws RecognitionException {
		DefEstructurasContext _localctx = new DefEstructurasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defEstructuras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(PORCENTAJE);
			setState(58);
			match(ESTRUCTURAS_SECCION);
			setState(59);
			match(SALTO_LINEA);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA) {
				{
				{
				setState(60);
				estructura();
				}
				}
				setState(65);
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
	public static class EstructuraContext extends ParserRuleContext {
		public TerminalNode ESTRUCTURA() { return getToken(YParser.ESTRUCTURA, 0); }
		public TerminalNode ID() { return getToken(YParser.ID, 0); }
		public TerminalNode SALTO_LINEA() { return getToken(YParser.SALTO_LINEA, 0); }
		public TerminalNode INDENT() { return getToken(YParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(YParser.DEDENT, 0); }
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraContext estructura() throws RecognitionException {
		EstructuraContext _localctx = new EstructuraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_estructura);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ESTRUCTURA);
			setState(67);
			match(ID);
			setState(68);
			match(T__0);
			setState(69);
			match(SALTO_LINEA);
			setState(70);
			match(INDENT);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				atributo();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976726016L) != 0) );
			setState(76);
			match(DEDENT);
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
	public static class AtributoContext extends ParserRuleContext {
		public DefDatoPrimitivoContext defDatoPrimitivo() {
			return getRuleContext(DefDatoPrimitivoContext.class,0);
		}
		public DefArregloContext defArreglo() {
			return getRuleContext(DefArregloContext.class,0);
		}
		public EstructuraAnidadaContext estructuraAnidada() {
			return getRuleContext(EstructuraAnidadaContext.class,0);
		}
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atributo);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				defDatoPrimitivo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				defArreglo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				estructuraAnidada();
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
	public static class TipoDatoIdContext extends ParserRuleContext {
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode ID() { return getToken(YParser.ID, 0); }
		public TipoDatoIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDatoId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterTipoDatoId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitTipoDatoId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitTipoDatoId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoIdContext tipoDatoId() throws RecognitionException {
		TipoDatoIdContext _localctx = new TipoDatoIdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoDatoId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			tipoDato();
			setState(84);
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
	public static class DefDatoPrimitivoContext extends ParserRuleContext {
		public TipoDatoIdContext tipoDatoId() {
			return getRuleContext(TipoDatoIdContext.class,0);
		}
		public TerminalNode SALTO_LINEA() { return getToken(YParser.SALTO_LINEA, 0); }
		public DefDatoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defDatoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterDefDatoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitDefDatoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitDefDatoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefDatoPrimitivoContext defDatoPrimitivo() throws RecognitionException {
		DefDatoPrimitivoContext _localctx = new DefDatoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defDatoPrimitivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			tipoDatoId();
			setState(87);
			match(SALTO_LINEA);
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
	public static class DefArregloContext extends ParserRuleContext {
		public TipoDatoIdContext tipoDatoId() {
			return getRuleContext(TipoDatoIdContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SALTO_LINEA() { return getToken(YParser.SALTO_LINEA, 0); }
		public DefArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterDefArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitDefArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitDefArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefArregloContext defArreglo() throws RecognitionException {
		DefArregloContext _localctx = new DefArregloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defArreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			tipoDatoId();
			setState(90);
			match(T__1);
			setState(91);
			expresion();
			setState(92);
			match(T__2);
			setState(93);
			match(SALTO_LINEA);
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
		public TerminalNode ENTERO() { return getToken(YParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(YParser.FLOTANTE, 0); }
		public TerminalNode CADENA() { return getToken(YParser.CADENA, 0); }
		public TerminalNode CARACTER() { return getToken(YParser.CARACTER, 0); }
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterTipoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitTipoDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitTipoDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipoDato);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ENTERO);
				}
				break;
			case FLOTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(FLOTANTE);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(CADENA);
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(CARACTER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				objeto();
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
	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YParser.ID, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
	public static class EstructuraAnidadaContext extends ParserRuleContext {
		public TipoDatoIdContext tipoDatoId() {
			return getRuleContext(TipoDatoIdContext.class,0);
		}
		public EstructuraAnidadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuraAnidada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterEstructuraAnidada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitEstructuraAnidada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitEstructuraAnidada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructuraAnidadaContext estructuraAnidada() throws RecognitionException {
		EstructuraAnidadaContext _localctx = new EstructuraAnidadaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_estructuraAnidada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			tipoDatoId();
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
	public static class DefFuncionesContext extends ParserRuleContext {
		public TerminalNode PORCENTAJE() { return getToken(YParser.PORCENTAJE, 0); }
		public TerminalNode FUNCIONES_SECCION() { return getToken(YParser.FUNCIONES_SECCION, 0); }
		public TerminalNode SALTO_LINEA() { return getToken(YParser.SALTO_LINEA, 0); }
		public List<TipoFuncionContext> tipoFuncion() {
			return getRuleContexts(TipoFuncionContext.class);
		}
		public TipoFuncionContext tipoFuncion(int i) {
			return getRuleContext(TipoFuncionContext.class,i);
		}
		public DefFuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defFunciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterDefFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitDefFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitDefFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefFuncionesContext defFunciones() throws RecognitionException {
		DefFuncionesContext _localctx = new DefFuncionesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defFunciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(PORCENTAJE);
			setState(107);
			match(FUNCIONES_SECCION);
			setState(108);
			match(SALTO_LINEA);
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				tipoFuncion();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEFINIR );
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
	public static class TipoFuncionContext extends ParserRuleContext {
		public FunSinRetornoContext funSinRetorno() {
			return getRuleContext(FunSinRetornoContext.class,0);
		}
		public FunConRetornoContext funConRetorno() {
			return getRuleContext(FunConRetornoContext.class,0);
		}
		public TipoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterTipoFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitTipoFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitTipoFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoFuncionContext tipoFuncion() throws RecognitionException {
		TipoFuncionContext _localctx = new TipoFuncionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipoFuncion);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				funSinRetorno();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				funConRetorno();
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
	public static class FunSinRetornoContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(YParser.DEFINIR, 0); }
		public TerminalNode ID() { return getToken(YParser.ID, 0); }
		public TerminalNode SALTO_LINEA() { return getToken(YParser.SALTO_LINEA, 0); }
		public TerminalNode INDENT() { return getToken(YParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(YParser.DEDENT, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public FunSinRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funSinRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterFunSinRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitFunSinRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitFunSinRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunSinRetornoContext funSinRetorno() throws RecognitionException {
		FunSinRetornoContext _localctx = new FunSinRetornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funSinRetorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(DEFINIR);
			setState(119);
			match(ID);
			setState(120);
			match(T__3);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976726016L) != 0)) {
				{
				setState(121);
				parametro();
				}
			}

			setState(124);
			match(T__4);
			setState(125);
			match(T__0);
			setState(126);
			match(SALTO_LINEA);
			setState(127);
			match(INDENT);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8760917240069136L) != 0)) {
				{
				{
				setState(128);
				instruccion();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(DEDENT);
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
	public static class ParametroContext extends ParserRuleContext {
		public List<TipoDatoIdContext> tipoDatoId() {
			return getRuleContexts(TipoDatoIdContext.class);
		}
		public TipoDatoIdContext tipoDatoId(int i) {
			return getRuleContext(TipoDatoIdContext.class,i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			tipoDatoId();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(137);
				match(T__5);
				setState(138);
				tipoDatoId();
				}
				}
				setState(143);
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
	public static class InstruccionContext extends ParserRuleContext {
		public DeclararVariableContext declararVariable() {
			return getRuleContext(DeclararVariableContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instruccion);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				declararVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
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
	public static class DeclararVariableContext extends ParserRuleContext {
		public DeclararDatoPrimitivoContext declararDatoPrimitivo() {
			return getRuleContext(DeclararDatoPrimitivoContext.class,0);
		}
		public DeclararVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterDeclararVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitDeclararVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitDeclararVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararVariableContext declararVariable() throws RecognitionException {
		DeclararVariableContext _localctx = new DeclararVariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declararVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			declararDatoPrimitivo();
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
	public static class DeclararDatoPrimitivoContext extends ParserRuleContext {
		public TipoDatoIdContext tipoDatoId() {
			return getRuleContext(TipoDatoIdContext.class,0);
		}
		public AsignacionDatoPrimitivoContext asignacionDatoPrimitivo() {
			return getRuleContext(AsignacionDatoPrimitivoContext.class,0);
		}
		public DeclararDatoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declararDatoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterDeclararDatoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitDeclararDatoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitDeclararDatoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclararDatoPrimitivoContext declararDatoPrimitivo() throws RecognitionException {
		DeclararDatoPrimitivoContext _localctx = new DeclararDatoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declararDatoPrimitivo);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				tipoDatoId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				asignacionDatoPrimitivo();
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
	public static class AsignacionDatoPrimitivoContext extends ParserRuleContext {
		public TipoDatoIdContext tipoDatoId() {
			return getRuleContext(TipoDatoIdContext.class,0);
		}
		public TerminalNode ASIGNACION() { return getToken(YParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionDatoPrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionDatoPrimitivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterAsignacionDatoPrimitivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitAsignacionDatoPrimitivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitAsignacionDatoPrimitivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionDatoPrimitivoContext asignacionDatoPrimitivo() throws RecognitionException {
		AsignacionDatoPrimitivoContext _localctx = new AsignacionDatoPrimitivoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asignacionDatoPrimitivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			tipoDatoId();
			setState(155);
			match(ASIGNACION);
			setState(156);
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
			if ( listener instanceof YListener ) ((YListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		public TerminalNode OR() { return getToken(YParser.OR, 0); }
		public TerminalNode AND() { return getToken(YParser.AND, 0); }
		public ExprLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterExprLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitExprLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitExprLogica(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exprLogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			exprRelacional(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprLogica);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(OR);
						setState(165);
						exprLogica(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprLogicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprLogica);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(AND);
						setState(168);
						exprLogica(3);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode IGUALDAD() { return getToken(YParser.IGUALDAD, 0); }
		public TerminalNode DESIGUALDAD() { return getToken(YParser.DESIGUALDAD, 0); }
		public TerminalNode MAYOR_QUE() { return getToken(YParser.MAYOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(YParser.MENOR_QUE, 0); }
		public TerminalNode MAYOR_IGUAL_QUE() { return getToken(YParser.MAYOR_IGUAL_QUE, 0); }
		public TerminalNode MENOR_IGUAL_QUE() { return getToken(YParser.MENOR_IGUAL_QUE, 0); }
		public TerminalNode ASIGNACION() { return getToken(YParser.ASIGNACION, 0); }
		public ExprRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterExprRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitExprRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitExprRelacional(this);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exprRelacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(175);
			exprAritmetica(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						match(IGUALDAD);
						setState(179);
						exprAritmetica(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						match(DESIGUALDAD);
						setState(182);
						exprAritmetica(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						match(MAYOR_QUE);
						setState(185);
						exprAritmetica(0);
						}
						break;
					case 4:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						match(MENOR_QUE);
						setState(188);
						exprAritmetica(0);
						}
						break;
					case 5:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(189);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(190);
						match(MAYOR_IGUAL_QUE);
						setState(191);
						exprAritmetica(0);
						}
						break;
					case 6:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(192);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(193);
						match(MENOR_IGUAL_QUE);
						setState(194);
						exprAritmetica(0);
						}
						break;
					case 7:
						{
						_localctx = new ExprRelacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRelacional);
						setState(195);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(196);
						match(ASIGNACION);
						setState(197);
						exprAritmetica(0);
						}
						break;
					}
					} 
				}
				setState(202);
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
		public TerminalNode SUMA() { return getToken(YParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(YParser.RESTA, 0); }
		public ExprAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterExprAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitExprAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitExprAritmetica(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exprAritmetica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			termino(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprAritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprAritmetica);
					setState(206);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(207);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(208);
					termino(0);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public TerminalNode MULTIPLICACION() { return getToken(YParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(YParser.DIVISION, 0); }
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitTermino(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_termino, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TerminoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termino);
					setState(217);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(218);
					_la = _input.LA(1);
					if ( !(_la==MULTIPLICACION || _la==DIVISION) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(219);
					factor();
					}
					} 
				}
				setState(224);
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
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorVariableContext extends FactorContext {
		public TerminalNode ID() { return getToken(YParser.ID, 0); }
		public FactorVariableContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterFactorVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitFactorVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitFactorVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNegativoContext extends FactorContext {
		public TerminalNode RESTA() { return getToken(YParser.RESTA, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorNegativoContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterFactorNegativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitFactorNegativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitFactorNegativo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNegacionContext extends FactorContext {
		public TerminalNode NEGACION() { return getToken(YParser.NEGACION, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorNegacionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterFactorNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitFactorNegacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitFactorNegacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorParentesisContext extends FactorContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public FactorParentesisContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterFactorParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitFactorParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitFactorParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorValorContext extends FactorContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public FactorValorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterFactorValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitFactorValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitFactorValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGACION:
				_localctx = new FactorNegacionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(NEGACION);
				setState(226);
				factor();
				}
				break;
			case RESTA:
				_localctx = new FactorNegativoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(RESTA);
				setState(228);
				factor();
				}
				break;
			case T__3:
				_localctx = new FactorParentesisContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(T__3);
				setState(230);
				expresion();
				setState(231);
				match(T__4);
				}
				break;
			case VALOR_DECIMAL:
			case VALOR_ENTERO:
			case VALOR_CARACTER:
			case VALOR_CADENA:
				_localctx = new FactorValorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				valor();
				}
				break;
			case ID:
				_localctx = new FactorVariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(ID);
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
		public TerminalNode VALOR_ENTERO() { return getToken(YParser.VALOR_ENTERO, 0); }
		public TerminalNode VALOR_CADENA() { return getToken(YParser.VALOR_CADENA, 0); }
		public TerminalNode VALOR_DECIMAL() { return getToken(YParser.VALOR_DECIMAL, 0); }
		public TerminalNode VALOR_CARACTER() { return getToken(YParser.VALOR_CARACTER, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8444249301319680L) != 0)) ) {
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
	public static class FunConRetornoContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(YParser.DEFINIR, 0); }
		public TerminalNode ID() { return getToken(YParser.ID, 0); }
		public TerminalNode TIPO_RETORNO() { return getToken(YParser.TIPO_RETORNO, 0); }
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode SALTO_LINEA() { return getToken(YParser.SALTO_LINEA, 0); }
		public TerminalNode INDENT() { return getToken(YParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(YParser.DEDENT, 0); }
		public TerminalNode RETORNAR() { return getToken(YParser.RETORNAR, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public FunConRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funConRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).enterFunConRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YListener ) ((YListener)listener).exitFunConRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YVisitor ) return ((YVisitor<? extends T>)visitor).visitFunConRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunConRetornoContext funConRetorno() throws RecognitionException {
		FunConRetornoContext _localctx = new FunConRetornoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funConRetorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DEFINIR);
			setState(240);
			match(ID);
			setState(241);
			match(T__3);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976726016L) != 0)) {
				{
				setState(242);
				parametro();
				}
			}

			setState(245);
			match(T__4);
			setState(246);
			match(TIPO_RETORNO);
			setState(247);
			tipoDato();
			setState(248);
			match(T__0);
			setState(249);
			match(SALTO_LINEA);
			setState(250);
			match(INDENT);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8760917240053776L) != 0)) {
				{
				{
				setState(251);
				expresion();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(DEDENT);
			setState(258);
			match(RETORNAR);
			setState(259);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return exprLogica_sempred((ExprLogicaContext)_localctx, predIndex);
		case 20:
			return exprRelacional_sempred((ExprRelacionalContext)_localctx, predIndex);
		case 21:
			return exprAritmetica_sempred((ExprAritmeticaContext)_localctx, predIndex);
		case 22:
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
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprAritmetica_sempred(ExprAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termino_sempred(TerminoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0106\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0003\u00006\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		">\b\u0001\n\u0001\f\u0001A\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002I\b\u0002\u000b\u0002"+
		"\f\u0002J\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003R\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007e\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0004\no\b\n\u000b\n\f\np\u0001\u000b\u0001"+
		"\u000b\u0003\u000bu\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f{\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0082\b\f\n\f\f\f\u0085"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u008c\b\r\n\r\f\r"+
		"\u008f\t\r\u0001\u000e\u0001\u000e\u0003\u000e\u0093\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0099\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u00aa\b\u0013\n\u0013\f\u0013\u00ad"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00c7\b\u0014\n\u0014\f\u0014\u00ca\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u00d2\b\u0015\n\u0015\f\u0015\u00d5\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00dd\b\u0016\n"+
		"\u0016\f\u0016\u00e0\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00ec\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00f4\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u00fd\b\u0019\n\u0019\f\u0019\u0100\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0004&(*,\u001a\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02\u0000\u0003\u0001\u0000 !\u0001\u0000\"#\u0001\u000014\u010c"+
		"\u00005\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004B"+
		"\u0001\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\bS\u0001\u0000"+
		"\u0000\u0000\nV\u0001\u0000\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000e"+
		"d\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012h\u0001"+
		"\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016t\u0001\u0000\u0000"+
		"\u0000\u0018v\u0001\u0000\u0000\u0000\u001a\u0088\u0001\u0000\u0000\u0000"+
		"\u001c\u0092\u0001\u0000\u0000\u0000\u001e\u0094\u0001\u0000\u0000\u0000"+
		" \u0098\u0001\u0000\u0000\u0000\"\u009a\u0001\u0000\u0000\u0000$\u009e"+
		"\u0001\u0000\u0000\u0000&\u00a0\u0001\u0000\u0000\u0000(\u00ae\u0001\u0000"+
		"\u0000\u0000*\u00cb\u0001\u0000\u0000\u0000,\u00d6\u0001\u0000\u0000\u0000"+
		".\u00eb\u0001\u0000\u0000\u00000\u00ed\u0001\u0000\u0000\u00002\u00ef"+
		"\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0003\u0014"+
		"\n\u00008\u0001\u0001\u0000\u0000\u00009:\u0005\u0007\u0000\u0000:;\u0005"+
		"\b\u0000\u0000;?\u00058\u0000\u0000<>\u0003\u0004\u0002\u0000=<\u0001"+
		"\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000BC\u0005\t\u0000\u0000CD\u00050\u0000\u0000DE\u0005\u0001"+
		"\u0000\u0000EF\u00058\u0000\u0000FH\u0005:\u0000\u0000GI\u0003\u0006\u0003"+
		"\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005"+
		";\u0000\u0000M\u0005\u0001\u0000\u0000\u0000NR\u0003\n\u0005\u0000OR\u0003"+
		"\f\u0006\u0000PR\u0003\u0012\t\u0000QN\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\u0007\u0001\u0000\u0000"+
		"\u0000ST\u0003\u000e\u0007\u0000TU\u00050\u0000\u0000U\t\u0001\u0000\u0000"+
		"\u0000VW\u0003\b\u0004\u0000WX\u00058\u0000\u0000X\u000b\u0001\u0000\u0000"+
		"\u0000YZ\u0003\b\u0004\u0000Z[\u0005\u0002\u0000\u0000[\\\u0003$\u0012"+
		"\u0000\\]\u0005\u0003\u0000\u0000]^\u00058\u0000\u0000^\r\u0001\u0000"+
		"\u0000\u0000_e\u0005\n\u0000\u0000`e\u0005\f\u0000\u0000ae\u0005\u000b"+
		"\u0000\u0000be\u0005\r\u0000\u0000ce\u0003\u0010\b\u0000d_\u0001\u0000"+
		"\u0000\u0000d`\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u000f\u0001\u0000\u0000"+
		"\u0000fg\u00050\u0000\u0000g\u0011\u0001\u0000\u0000\u0000hi\u0003\b\u0004"+
		"\u0000i\u0013\u0001\u0000\u0000\u0000jk\u0005\u0007\u0000\u0000kl\u0005"+
		"\u000e\u0000\u0000ln\u00058\u0000\u0000mo\u0003\u0016\u000b\u0000nm\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"pq\u0001\u0000\u0000\u0000q\u0015\u0001\u0000\u0000\u0000ru\u0003\u0018"+
		"\f\u0000su\u00032\u0019\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000u\u0017\u0001\u0000\u0000\u0000vw\u0005\u000f\u0000\u0000"+
		"wx\u00050\u0000\u0000xz\u0005\u0004\u0000\u0000y{\u0003\u001a\r\u0000"+
		"zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0005\u0005\u0000\u0000}~\u0005\u0001\u0000\u0000~\u007f\u0005"+
		"8\u0000\u0000\u007f\u0083\u0005:\u0000\u0000\u0080\u0082\u0003\u001c\u000e"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005;\u0000\u0000\u0087\u0019\u0001\u0000\u0000\u0000"+
		"\u0088\u008d\u0003\b\u0004\u0000\u0089\u008a\u0005\u0006\u0000\u0000\u008a"+
		"\u008c\u0003\b\u0004\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u001b\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0003\u001e\u000f\u0000\u0091\u0093"+
		"\u0003$\u0012\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u001d\u0001\u0000\u0000\u0000\u0094\u0095\u0003"+
		" \u0010\u0000\u0095\u001f\u0001\u0000\u0000\u0000\u0096\u0099\u0003\b"+
		"\u0004\u0000\u0097\u0099\u0003\"\u0011\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099!\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0003\b\u0004\u0000\u009b\u009c\u0005*\u0000\u0000\u009c"+
		"\u009d\u0003$\u0012\u0000\u009d#\u0001\u0000\u0000\u0000\u009e\u009f\u0003"+
		"&\u0013\u0000\u009f%\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\u0013\uffff"+
		"\uffff\u0000\u00a1\u00a2\u0003(\u0014\u0000\u00a2\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\n\u0003\u0000\u0000\u00a4\u00a5\u0005,\u0000\u0000"+
		"\u00a5\u00aa\u0003&\u0013\u0004\u00a6\u00a7\n\u0002\u0000\u0000\u00a7"+
		"\u00a8\u0005+\u0000\u0000\u00a8\u00aa\u0003&\u0013\u0003\u00a9\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\'\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0006\u0014\uffff\uffff\u0000\u00af\u00b0\u0003"+
		"*\u0015\u0000\u00b0\u00c8\u0001\u0000\u0000\u0000\u00b1\u00b2\n\b\u0000"+
		"\u0000\u00b2\u00b3\u0005$\u0000\u0000\u00b3\u00c7\u0003*\u0015\u0000\u00b4"+
		"\u00b5\n\u0007\u0000\u0000\u00b5\u00b6\u0005%\u0000\u0000\u00b6\u00c7"+
		"\u0003*\u0015\u0000\u00b7\u00b8\n\u0006\u0000\u0000\u00b8\u00b9\u0005"+
		"\'\u0000\u0000\u00b9\u00c7\u0003*\u0015\u0000\u00ba\u00bb\n\u0005\u0000"+
		"\u0000\u00bb\u00bc\u0005&\u0000\u0000\u00bc\u00c7\u0003*\u0015\u0000\u00bd"+
		"\u00be\n\u0004\u0000\u0000\u00be\u00bf\u0005(\u0000\u0000\u00bf\u00c7"+
		"\u0003*\u0015\u0000\u00c0\u00c1\n\u0003\u0000\u0000\u00c1\u00c2\u0005"+
		")\u0000\u0000\u00c2\u00c7\u0003*\u0015\u0000\u00c3\u00c4\n\u0002\u0000"+
		"\u0000\u00c4\u00c5\u0005*\u0000\u0000\u00c5\u00c7\u0003*\u0015\u0000\u00c6"+
		"\u00b1\u0001\u0000\u0000\u0000\u00c6\u00b4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c6\u00ba\u0001\u0000\u0000\u0000\u00c6"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		")\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0006\u0015\uffff\uffff\u0000\u00cc\u00cd\u0003,\u0016\u0000\u00cd\u00d3"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\n\u0002\u0000\u0000\u00cf\u00d0\u0007"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0003,\u0016\u0000\u00d1\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4+\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\u0016\uffff"+
		"\uffff\u0000\u00d7\u00d8\u0003.\u0017\u0000\u00d8\u00de\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\n\u0002\u0000\u0000\u00da\u00db\u0007\u0001\u0000\u0000"+
		"\u00db\u00dd\u0003.\u0017\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000\u00dd"+
		"\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0001\u0000\u0000\u0000\u00df-\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005-\u0000\u0000\u00e2\u00ec\u0003"+
		".\u0017\u0000\u00e3\u00e4\u0005!\u0000\u0000\u00e4\u00ec\u0003.\u0017"+
		"\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7\u0003$\u0012\u0000"+
		"\u00e7\u00e8\u0005\u0005\u0000\u0000\u00e8\u00ec\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u00030\u0018\u0000\u00ea\u00ec\u00050\u0000\u0000\u00eb\u00e1"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e3\u0001\u0000\u0000\u0000\u00eb\u00e5"+
		"\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec/\u0001\u0000\u0000\u0000\u00ed\u00ee\u0007"+
		"\u0002\u0000\u0000\u00ee1\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u000f"+
		"\u0000\u0000\u00f0\u00f1\u00050\u0000\u0000\u00f1\u00f3\u0005\u0004\u0000"+
		"\u0000\u00f2\u00f4\u0003\u001a\r\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0005\u0005\u0000\u0000\u00f6\u00f7\u0005\u001f\u0000\u0000"+
		"\u00f7\u00f8\u0003\u000e\u0007\u0000\u00f8\u00f9\u0005\u0001\u0000\u0000"+
		"\u00f9\u00fa\u00058\u0000\u0000\u00fa\u00fe\u0005:\u0000\u0000\u00fb\u00fd"+
		"\u0003$\u0012\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005;\u0000\u0000\u0102\u0103\u0005\u0010"+
		"\u0000\u0000\u0103\u0104\u0003$\u0012\u0000\u01043\u0001\u0000\u0000\u0000"+
		"\u00155?JQdptz\u0083\u008d\u0092\u0098\u00a9\u00ab\u00c6\u00c8\u00d3\u00de"+
		"\u00eb\u00f3\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}