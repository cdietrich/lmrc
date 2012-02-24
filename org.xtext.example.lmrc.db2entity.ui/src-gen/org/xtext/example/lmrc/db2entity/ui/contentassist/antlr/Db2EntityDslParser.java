/*
* generated by Xtext
*/
package org.xtext.example.lmrc.db2entity.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.lmrc.db2entity.services.Db2EntityDslGrammarAccess;

public class Db2EntityDslParser extends AbstractContentAssistParser {
	
	@Inject
	private Db2EntityDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.lmrc.db2entity.ui.contentassist.antlr.internal.InternalDb2EntityDslParser createParser() {
		org.xtext.example.lmrc.db2entity.ui.contentassist.antlr.internal.InternalDb2EntityDslParser result = new org.xtext.example.lmrc.db2entity.ui.contentassist.antlr.internal.InternalDb2EntityDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractDataTypeAccess().getAlternatives(), "rule__AbstractDataType__Alternatives");
					put(grammarAccess.getEntityColumnMapperAccess().getGroup(), "rule__EntityColumnMapper__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getDatabaseAccess().getGroup(), "rule__Database__Group__0");
					put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
					put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
					put(grammarAccess.getCharTypeAccess().getGroup(), "rule__CharType__Group__0");
					put(grammarAccess.getNumberTypeAccess().getGroup(), "rule__NumberType__Group__0");
					put(grammarAccess.getEntityColumnMapperAccess().getEntityAssignment_2(), "rule__EntityColumnMapper__EntityAssignment_2");
					put(grammarAccess.getDatabaseAccess().getNameAssignment_1(), "rule__Database__NameAssignment_1");
					put(grammarAccess.getDatabaseAccess().getTablesAssignment_2(), "rule__Database__TablesAssignment_2");
					put(grammarAccess.getTableAccess().getNameAssignment_1(), "rule__Table__NameAssignment_1");
					put(grammarAccess.getTableAccess().getColumnsAssignment_2(), "rule__Table__ColumnsAssignment_2");
					put(grammarAccess.getColumnAccess().getTypeAssignment_0(), "rule__Column__TypeAssignment_0");
					put(grammarAccess.getColumnAccess().getNameAssignment_1(), "rule__Column__NameAssignment_1");
					put(grammarAccess.getColumnAccess().getMapperAssignment_2(), "rule__Column__MapperAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.lmrc.db2entity.ui.contentassist.antlr.internal.InternalDb2EntityDslParser typedParser = (org.xtext.example.lmrc.db2entity.ui.contentassist.antlr.internal.InternalDb2EntityDslParser) parser;
			typedParser.entryRuleRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public Db2EntityDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(Db2EntityDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
