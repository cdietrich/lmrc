/*
* generated by Xtext
*/

package org.xtext.example.lmrc.db2entity.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.xtext.example.lmrc.db.services.DbDslGrammarAccess;

@Singleton
public class Db2EntityDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Root");
		private final RuleCall cDatabaseParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Root returns db::Root:
		//
		//	Database;
		public ParserRule getRule() { return rule; }

		//Database
		public RuleCall getDatabaseParserRuleCall() { return cDatabaseParserRuleCall; }
	}

	public class AbstractColumnMapperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractColumnMapper");
		private final RuleCall cEntityColumnMapperParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AbstractColumnMapper returns db::AbstractColumnMapper:
		//
		//	EntityColumnMapper;
		public ParserRule getRule() { return rule; }

		//EntityColumnMapper
		public RuleCall getEntityColumnMapperParserRuleCall() { return cEntityColumnMapperParserRuleCall; }
	}

	public class EntityColumnMapperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EntityColumnMapper");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEntityColumnMapperAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLessThanSignHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEntityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEntityAttributeCrossReference_2_0 = (CrossReference)cEntityAssignment_2.eContents().get(0);
		private final RuleCall cEntityAttributeFQNParserRuleCall_2_0_1 = (RuleCall)cEntityAttributeCrossReference_2_0.eContents().get(1);
		
		//EntityColumnMapper returns db::AbstractColumnMapper:
		//
		//	{EntityColumnMapper} "<-" entity=[entity::Attribute|FQN];
		public ParserRule getRule() { return rule; }

		//{EntityColumnMapper} "<-" entity=[entity::Attribute|FQN]
		public Group getGroup() { return cGroup; }

		//{EntityColumnMapper}
		public Action getEntityColumnMapperAction_0() { return cEntityColumnMapperAction_0; }

		//"<-"
		public Keyword getLessThanSignHyphenMinusKeyword_1() { return cLessThanSignHyphenMinusKeyword_1; }

		//entity=[entity::Attribute|FQN]
		public Assignment getEntityAssignment_2() { return cEntityAssignment_2; }

		//[entity::Attribute|FQN]
		public CrossReference getEntityAttributeCrossReference_2_0() { return cEntityAttributeCrossReference_2_0; }

		//FQN
		public RuleCall getEntityAttributeFQNParserRuleCall_2_0_1() { return cEntityAttributeFQNParserRuleCall_2_0_1; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private RootElements pRoot;
	private AbstractColumnMapperElements pAbstractColumnMapper;
	private EntityColumnMapperElements pEntityColumnMapper;
	private FQNElements pFQN;
	
	private final Grammar grammar;

	private DbDslGrammarAccess gaDbDsl;

	@Inject
	public Db2EntityDslGrammarAccess(GrammarProvider grammarProvider,
		DbDslGrammarAccess gaDbDsl) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaDbDsl = gaDbDsl;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.lmrc.db2entity.Db2EntityDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public DbDslGrammarAccess getDbDslGrammarAccess() {
		return gaDbDsl;
	}

	
	//Root returns db::Root:
	//
	//	Database;
	public RootElements getRootAccess() {
		return (pRoot != null) ? pRoot : (pRoot = new RootElements());
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}

	//AbstractColumnMapper returns db::AbstractColumnMapper:
	//
	//	EntityColumnMapper;
	public AbstractColumnMapperElements getAbstractColumnMapperAccess() {
		return (pAbstractColumnMapper != null) ? pAbstractColumnMapper : (pAbstractColumnMapper = new AbstractColumnMapperElements());
	}
	
	public ParserRule getAbstractColumnMapperRule() {
		return getAbstractColumnMapperAccess().getRule();
	}

	//EntityColumnMapper returns db::AbstractColumnMapper:
	//
	//	{EntityColumnMapper} "<-" entity=[entity::Attribute|FQN];
	public EntityColumnMapperElements getEntityColumnMapperAccess() {
		return (pEntityColumnMapper != null) ? pEntityColumnMapper : (pEntityColumnMapper = new EntityColumnMapperElements());
	}
	
	public ParserRule getEntityColumnMapperRule() {
		return getEntityColumnMapperAccess().getRule();
	}

	//FQN:
	//
	//	ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return (pFQN != null) ? pFQN : (pFQN = new FQNElements());
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//Database:
	//
	//	"database" name=ID tables+=Table*;
	public DbDslGrammarAccess.DatabaseElements getDatabaseAccess() {
		return gaDbDsl.getDatabaseAccess();
	}
	
	public ParserRule getDatabaseRule() {
		return getDatabaseAccess().getRule();
	}

	//Table:
	//
	//	"table" name=ID columns+=Column*;
	public DbDslGrammarAccess.TableElements getTableAccess() {
		return gaDbDsl.getTableAccess();
	}
	
	public ParserRule getTableRule() {
		return getTableAccess().getRule();
	}

	//Column:
	//
	//	type=AbstractDataType name=ID mapper=AbstractColumnMapper?;
	public DbDslGrammarAccess.ColumnElements getColumnAccess() {
		return gaDbDsl.getColumnAccess();
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}

	//AbstractDataType:
	//
	//	CharType | NumberType;
	public DbDslGrammarAccess.AbstractDataTypeElements getAbstractDataTypeAccess() {
		return gaDbDsl.getAbstractDataTypeAccess();
	}
	
	public ParserRule getAbstractDataTypeRule() {
		return getAbstractDataTypeAccess().getRule();
	}

	//CharType:
	//
	//	{CharType} "char";
	public DbDslGrammarAccess.CharTypeElements getCharTypeAccess() {
		return gaDbDsl.getCharTypeAccess();
	}
	
	public ParserRule getCharTypeRule() {
		return getCharTypeAccess().getRule();
	}

	//NumberType:
	//
	//	{NumberType} "number";
	public DbDslGrammarAccess.NumberTypeElements getNumberTypeAccess() {
		return gaDbDsl.getNumberTypeAccess();
	}
	
	public ParserRule getNumberTypeRule() {
		return getNumberTypeAccess().getRule();
	}

	//terminal ID:
	//
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaDbDsl.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaDbDsl.getINTRule();
	} 

	//terminal STRING:
	//
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaDbDsl.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaDbDsl.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaDbDsl.getSL_COMMENTRule();
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaDbDsl.getWSRule();
	} 

	//terminal ANY_OTHER:
	//
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaDbDsl.getANY_OTHERRule();
	} 
}
