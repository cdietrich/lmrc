/*
* generated by Xtext
*/
grammar InternalDbDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.lmrc.db.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.lmrc.db.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.lmrc.db.services.DbDslGrammarAccess;

}

@parser::members {

 	private DbDslGrammarAccess grammarAccess;
 	
    public InternalDbDslParser(TokenStream input, DbDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Root";	
   	}
   	
   	@Override
   	protected DbDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	 iv_ruleRoot=ruleRoot 
	 { $current=$iv_ruleRoot.current; } 
	 EOF 
;

// Rule Root
ruleRoot returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getRootAccess().getDatabaseParserRuleCall()); 
    }
    this_Database_0=ruleDatabase
    { 
        $current = $this_Database_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleDatabase
entryRuleDatabase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDatabaseRule()); }
	 iv_ruleDatabase=ruleDatabase 
	 { $current=$iv_ruleDatabase.current; } 
	 EOF 
;

// Rule Database
ruleDatabase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='database' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getDatabaseKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDatabaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_2_0()); 
	    }
		lv_tables_2_0=ruleTable		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDatabaseRule());
	        }
       		add(
       			$current, 
       			"tables",
        		lv_tables_2_0, 
        		"Table");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	 iv_ruleTable=ruleTable 
	 { $current=$iv_ruleTable.current; } 
	 EOF 
;

// Rule Table
ruleTable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='table' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0()); 
	    }
		lv_columns_2_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTableRule());
	        }
       		add(
       			$current, 
       			"columns",
        		lv_columns_2_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	 iv_ruleColumn=ruleColumn 
	 { $current=$iv_ruleColumn.current; } 
	 EOF 
;

// Rule Column
ruleColumn returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getColumnAccess().getTypeAbstractDataTypeParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleAbstractDataType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getColumnRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"AbstractDataType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getColumnAccess().getMapperAbstractColumnMapperParserRuleCall_2_0()); 
	    }
		lv_mapper_2_0=ruleAbstractColumnMapper		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getColumnRule());
	        }
       		set(
       			$current, 
       			"mapper",
        		lv_mapper_2_0, 
        		"AbstractColumnMapper");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleAbstractColumnMapper
entryRuleAbstractColumnMapper returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractColumnMapperRule()); }
	 iv_ruleAbstractColumnMapper=ruleAbstractColumnMapper 
	 { $current=$iv_ruleAbstractColumnMapper.current; } 
	 EOF 
;

// Rule AbstractColumnMapper
ruleAbstractColumnMapper returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAbstractColumnMapperAccess().getAbstractColumnMapperAction_0(),
            $current);
    }
)	otherlv_1='something' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAbstractColumnMapperAccess().getSomethingKeyword_1());
    }
)
;





// Entry rule entryRuleAbstractDataType
entryRuleAbstractDataType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractDataTypeRule()); }
	 iv_ruleAbstractDataType=ruleAbstractDataType 
	 { $current=$iv_ruleAbstractDataType.current; } 
	 EOF 
;

// Rule AbstractDataType
ruleAbstractDataType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractDataTypeAccess().getCharTypeParserRuleCall_0()); 
    }
    this_CharType_0=ruleCharType
    { 
        $current = $this_CharType_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractDataTypeAccess().getNumberTypeParserRuleCall_1()); 
    }
    this_NumberType_1=ruleNumberType
    { 
        $current = $this_NumberType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleCharType
entryRuleCharType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCharTypeRule()); }
	 iv_ruleCharType=ruleCharType 
	 { $current=$iv_ruleCharType.current; } 
	 EOF 
;

// Rule CharType
ruleCharType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getCharTypeAccess().getCharTypeAction_0(),
            $current);
    }
)	otherlv_1='char' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCharTypeAccess().getCharKeyword_1());
    }
)
;





// Entry rule entryRuleNumberType
entryRuleNumberType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberTypeRule()); }
	 iv_ruleNumberType=ruleNumberType 
	 { $current=$iv_ruleNumberType.current; } 
	 EOF 
;

// Rule NumberType
ruleNumberType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNumberTypeAccess().getNumberTypeAction_0(),
            $current);
    }
)	otherlv_1='number' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getNumberTypeAccess().getNumberKeyword_1());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


