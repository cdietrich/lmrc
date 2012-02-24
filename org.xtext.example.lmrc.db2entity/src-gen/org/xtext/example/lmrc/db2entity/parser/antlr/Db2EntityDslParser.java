/*
* generated by Xtext
*/
package org.xtext.example.lmrc.db2entity.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.lmrc.db2entity.services.Db2EntityDslGrammarAccess;

public class Db2EntityDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private Db2EntityDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.lmrc.db2entity.parser.antlr.internal.InternalDb2EntityDslParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.lmrc.db2entity.parser.antlr.internal.InternalDb2EntityDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Root";
	}
	
	public Db2EntityDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Db2EntityDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
