// Generated from com/mycompany/y/YOtro.g4 by ANTLR 4.13.2
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
public class YOtroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PORCENTAJE=2, ESTRUCTURAS_SECCION=3, ESTRUCTURA=4, ENTERO=5, CADENA=6, 
		FLOTANTE=7, CARACTER=8, FUNCIONES_SECCION=9, DEFINIR=10, RETORNAR=11, 
		SI=12, ENTONCES=13, SINO=14, CONTRARIO=15, ELEGIR=16, CASO=17, ROMPER=18, 
		SIEMPRE=19, PARA=20, CONTINUAR=21, MIENTRAS=22, HACER=23, IMPRIMIR=24, 
		LEER=25, TIPO_RETORNO=26, SUMA=27, RESTA=28, MULTIPLICACION=29, DIVISION=30, 
		IGUALDAD=31, DESIGUALDAD=32, MENOR_QUE=33, MAYOR_QUE=34, MAYOR_IGUAL_QUE=35, 
		MENOR_IGUAL_QUE=36, ASIGNACION=37, AND=38, OR=39, NEGACION=40, SUMA_ABREVIADA=41, 
		RESTA_ABREVIADA=42, ID=43, VALOR_DECIMAL=44, VALOR_ENTERO=45, VALOR_CARACTER=46, 
		VALOR_CADENA=47, COMENTARIO_LINEA=48, COMENTARIO_MULTILINEA=49, TAB=50, 
		SALTO_LINEA=51, ESPACIO=52;
	public static final int
		RULE_programa = 0, RULE_defEstructuras = 1, RULE_estructura = 2, RULE_variableEstructura = 3, 
		RULE_tipoDato = 4, RULE_objeto = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "defEstructuras", "estructura", "variableEstructura", "tipoDato", 
			"objeto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'%'", "'estructuras'", "'estructura'", "'entero'", "'cadena'", 
			"'flotante'", "'caracter'", "'funciones'", "'definir'", "'retornar'", 
			"'si'", "'entonces'", "'sino'", "'contrario'", "'elegir'", "'caso'", 
			"'romper'", "'siempre'", "'para'", "'continuar'", "'mientras'", "'hacer'", 
			"'imprimir'", "'leer'", "'->'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", 
			"'<'", "'>'", "'>='", "'<='", "'='", "'&&'", "'||'", "'!'", "'++'", "'--'", 
			null, null, null, null, null, null, null, "'\\t'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PORCENTAJE", "ESTRUCTURAS_SECCION", "ESTRUCTURA", "ENTERO", 
			"CADENA", "FLOTANTE", "CARACTER", "FUNCIONES_SECCION", "DEFINIR", "RETORNAR", 
			"SI", "ENTONCES", "SINO", "CONTRARIO", "ELEGIR", "CASO", "ROMPER", "SIEMPRE", 
			"PARA", "CONTINUAR", "MIENTRAS", "HACER", "IMPRIMIR", "LEER", "TIPO_RETORNO", 
			"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "IGUALDAD", "DESIGUALDAD", 
			"MENOR_QUE", "MAYOR_QUE", "MAYOR_IGUAL_QUE", "MENOR_IGUAL_QUE", "ASIGNACION", 
			"AND", "OR", "NEGACION", "SUMA_ABREVIADA", "RESTA_ABREVIADA", "ID", "VALOR_DECIMAL", 
			"VALOR_ENTERO", "VALOR_CARACTER", "VALOR_CADENA", "COMENTARIO_LINEA", 
			"COMENTARIO_MULTILINEA", "TAB", "SALTO_LINEA", "ESPACIO"
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
	public String getGrammarFileName() { return "YOtro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YOtroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public DefEstructurasContext defEstructuras() {
			return getRuleContext(DefEstructurasContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YOtroVisitor ) return ((YOtroVisitor<? extends T>)visitor).visitPrograma(this);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PORCENTAJE) {
				{
				setState(12);
				defEstructuras();
				}
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
	public static class DefEstructurasContext extends ParserRuleContext {
		public TerminalNode PORCENTAJE() { return getToken(YOtroParser.PORCENTAJE, 0); }
		public TerminalNode ESTRUCTURAS_SECCION() { return getToken(YOtroParser.ESTRUCTURAS_SECCION, 0); }
		public TerminalNode SALTO_LINEA() { return getToken(YOtroParser.SALTO_LINEA, 0); }
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
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).enterDefEstructuras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).exitDefEstructuras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YOtroVisitor ) return ((YOtroVisitor<? extends T>)visitor).visitDefEstructuras(this);
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
			setState(15);
			match(PORCENTAJE);
			setState(16);
			match(ESTRUCTURAS_SECCION);
			setState(17);
			match(SALTO_LINEA);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESTRUCTURA) {
				{
				{
				setState(18);
				estructura();
				}
				}
				setState(23);
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
		public TerminalNode ESTRUCTURA() { return getToken(YOtroParser.ESTRUCTURA, 0); }
		public TerminalNode ID() { return getToken(YOtroParser.ID, 0); }
		public TerminalNode SALTO_LINEA() { return getToken(YOtroParser.SALTO_LINEA, 0); }
		public TerminalNode TAB() { return getToken(YOtroParser.TAB, 0); }
		public List<VariableEstructuraContext> variableEstructura() {
			return getRuleContexts(VariableEstructuraContext.class);
		}
		public VariableEstructuraContext variableEstructura(int i) {
			return getRuleContext(VariableEstructuraContext.class,i);
		}
		public EstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).enterEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).exitEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YOtroVisitor ) return ((YOtroVisitor<? extends T>)visitor).visitEstructura(this);
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
			setState(24);
			match(ESTRUCTURA);
			setState(25);
			match(ID);
			setState(26);
			match(T__0);
			setState(27);
			match(SALTO_LINEA);
			setState(28);
			match(TAB);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				variableEstructura();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8796093022688L) != 0) );
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
	public static class VariableEstructuraContext extends ParserRuleContext {
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public VariableEstructuraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableEstructura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).enterVariableEstructura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).exitVariableEstructura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YOtroVisitor ) return ((YOtroVisitor<? extends T>)visitor).visitVariableEstructura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableEstructuraContext variableEstructura() throws RecognitionException {
		VariableEstructuraContext _localctx = new VariableEstructuraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableEstructura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
	public static class TipoDatoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(YOtroParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(YOtroParser.FLOTANTE, 0); }
		public TerminalNode CADENA() { return getToken(YOtroParser.CADENA, 0); }
		public TerminalNode CARACTER() { return getToken(YOtroParser.CARACTER, 0); }
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).enterTipoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).exitTipoDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YOtroVisitor ) return ((YOtroVisitor<? extends T>)visitor).visitTipoDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoDato);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ENTERO);
				}
				break;
			case FLOTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(FLOTANTE);
				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(CADENA);
				}
				break;
			case CARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(CARACTER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
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
		public TerminalNode ID() { return getToken(YOtroParser.ID, 0); }
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YOtroListener ) ((YOtroListener)listener).exitObjeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YOtroVisitor ) return ((YOtroVisitor<? extends T>)visitor).visitObjeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
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

	public static final String _serializedATN =
		"\u0004\u00014.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001\u0017"+
		"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002\f\u0002 \u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004*\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006"+
		"\u0000\u0002\u0004\u0006\b\n\u0000\u0000.\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000"+
		"\u0006\"\u0001\u0000\u0000\u0000\b)\u0001\u0000\u0000\u0000\n+\u0001\u0000"+
		"\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0001\u0000\u0000\u0000\u000e\u0001\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0005\u0002\u0000\u0000\u0010\u0011\u0005\u0003\u0000\u0000\u0011"+
		"\u0015\u00053\u0000\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0003"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0005\u0004\u0000\u0000\u0019\u001a\u0005+\u0000\u0000\u001a\u001b\u0005"+
		"\u0001\u0000\u0000\u001b\u001c\u00053\u0000\u0000\u001c\u001e\u00052\u0000"+
		"\u0000\u001d\u001f\u0003\u0006\u0003\u0000\u001e\u001d\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 "+
		"!\u0001\u0000\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0003\b\u0004"+
		"\u0000#\u0007\u0001\u0000\u0000\u0000$*\u0005\u0005\u0000\u0000%*\u0005"+
		"\u0007\u0000\u0000&*\u0005\u0006\u0000\u0000\'*\u0005\b\u0000\u0000(*"+
		"\u0003\n\u0005\u0000)$\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000"+
		")&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*\t\u0001\u0000\u0000\u0000+,\u0005+\u0000\u0000,\u000b\u0001\u0000"+
		"\u0000\u0000\u0004\r\u0015 )";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}