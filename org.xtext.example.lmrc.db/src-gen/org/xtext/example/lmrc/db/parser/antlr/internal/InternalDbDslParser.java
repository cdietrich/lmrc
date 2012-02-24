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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database'", "'table'", "'something'", "'char'", "'number'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDbDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDbDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDbDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g"; }



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



    // $ANTLR start "entryRuleRoot"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:67:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:68:2: (iv_ruleRoot= ruleRoot EOF )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:69:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:76:1: ruleRoot returns [EObject current=null] : this_Database_0= ruleDatabase ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Database_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:79:28: (this_Database_0= ruleDatabase )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:81:5: this_Database_0= ruleDatabase
            {
             
                    newCompositeNode(grammarAccess.getRootAccess().getDatabaseParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleDatabase_in_ruleRoot131);
            this_Database_0=ruleDatabase();

            state._fsp--;

             
                    current = this_Database_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleDatabase"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:97:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:98:2: (iv_ruleDatabase= ruleDatabase EOF )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:99:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase165);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:106:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )* ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_tables_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:109:28: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )* ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:110:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )* )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:110:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )* )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:110:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDatabase212); 

                	newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getDatabaseKeyword_0());
                
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:114:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:115:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:115:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:116:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase229); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDatabaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:132:2: ( (lv_tables_2_0= ruleTable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:133:1: (lv_tables_2_0= ruleTable )
            	    {
            	    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:133:1: (lv_tables_2_0= ruleTable )
            	    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:134:3: lv_tables_2_0= ruleTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTable_in_ruleDatabase255);
            	    lv_tables_2_0=ruleTable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDatabaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tables",
            	            		lv_tables_2_0, 
            	            		"Table");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:158:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:159:2: (iv_ruleTable= ruleTable EOF )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:160:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable292);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:167:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )* ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_columns_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:170:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )* ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:171:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )* )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:171:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )* )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:171:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleTable339); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:175:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:176:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:176:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:177:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTable356); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:193:2: ( (lv_columns_2_0= ruleColumn ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:194:1: (lv_columns_2_0= ruleColumn )
            	    {
            	    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:194:1: (lv_columns_2_0= ruleColumn )
            	    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:195:3: lv_columns_2_0= ruleColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumn_in_ruleTable382);
            	    lv_columns_2_0=ruleColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"columns",
            	            		lv_columns_2_0, 
            	            		"Column");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:219:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:220:2: (iv_ruleColumn= ruleColumn EOF )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:221:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn419);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn429); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:228:1: ruleColumn returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_mapper_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:231:28: ( ( ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )? ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:232:1: ( ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )? )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:232:1: ( ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )? )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:232:2: ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )?
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:232:2: ( (lv_type_0_0= ruleAbstractDataType ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:233:1: (lv_type_0_0= ruleAbstractDataType )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:233:1: (lv_type_0_0= ruleAbstractDataType )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:234:3: lv_type_0_0= ruleAbstractDataType
            {
             
            	        newCompositeNode(grammarAccess.getColumnAccess().getTypeAbstractDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDataType_in_ruleColumn475);
            lv_type_0_0=ruleAbstractDataType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColumnRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"AbstractDataType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:250:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:251:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:251:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:252:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumn492); 

            			newLeafNode(lv_name_1_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:268:2: ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:269:1: (lv_mapper_2_0= ruleAbstractColumnMapper )
                    {
                    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:269:1: (lv_mapper_2_0= ruleAbstractColumnMapper )
                    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:270:3: lv_mapper_2_0= ruleAbstractColumnMapper
                    {
                     
                    	        newCompositeNode(grammarAccess.getColumnAccess().getMapperAbstractColumnMapperParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractColumnMapper_in_ruleColumn518);
                    lv_mapper_2_0=ruleAbstractColumnMapper();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getColumnRule());
                    	        }
                           		set(
                           			current, 
                           			"mapper",
                            		lv_mapper_2_0, 
                            		"AbstractColumnMapper");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleAbstractColumnMapper"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:294:1: entryRuleAbstractColumnMapper returns [EObject current=null] : iv_ruleAbstractColumnMapper= ruleAbstractColumnMapper EOF ;
    public final EObject entryRuleAbstractColumnMapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractColumnMapper = null;


        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:295:2: (iv_ruleAbstractColumnMapper= ruleAbstractColumnMapper EOF )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:296:2: iv_ruleAbstractColumnMapper= ruleAbstractColumnMapper EOF
            {
             newCompositeNode(grammarAccess.getAbstractColumnMapperRule()); 
            pushFollow(FOLLOW_ruleAbstractColumnMapper_in_entryRuleAbstractColumnMapper555);
            iv_ruleAbstractColumnMapper=ruleAbstractColumnMapper();

            state._fsp--;

             current =iv_ruleAbstractColumnMapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractColumnMapper565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractColumnMapper"


    // $ANTLR start "ruleAbstractColumnMapper"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:303:1: ruleAbstractColumnMapper returns [EObject current=null] : ( () otherlv_1= 'something' ) ;
    public final EObject ruleAbstractColumnMapper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:306:28: ( ( () otherlv_1= 'something' ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:307:1: ( () otherlv_1= 'something' )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:307:1: ( () otherlv_1= 'something' )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:307:2: () otherlv_1= 'something'
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:307:2: ()
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:308:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAbstractColumnMapperAccess().getAbstractColumnMapperAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAbstractColumnMapper611); 

                	newLeafNode(otherlv_1, grammarAccess.getAbstractColumnMapperAccess().getSomethingKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractColumnMapper"


    // $ANTLR start "entryRuleAbstractDataType"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:325:1: entryRuleAbstractDataType returns [EObject current=null] : iv_ruleAbstractDataType= ruleAbstractDataType EOF ;
    public final EObject entryRuleAbstractDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDataType = null;


        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:326:2: (iv_ruleAbstractDataType= ruleAbstractDataType EOF )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:327:2: iv_ruleAbstractDataType= ruleAbstractDataType EOF
            {
             newCompositeNode(grammarAccess.getAbstractDataTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractDataType_in_entryRuleAbstractDataType647);
            iv_ruleAbstractDataType=ruleAbstractDataType();

            state._fsp--;

             current =iv_ruleAbstractDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDataType657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractDataType"


    // $ANTLR start "ruleAbstractDataType"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:334:1: ruleAbstractDataType returns [EObject current=null] : (this_CharType_0= ruleCharType | this_NumberType_1= ruleNumberType ) ;
    public final EObject ruleAbstractDataType() throws RecognitionException {
        EObject current = null;

        EObject this_CharType_0 = null;

        EObject this_NumberType_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:337:28: ( (this_CharType_0= ruleCharType | this_NumberType_1= ruleNumberType ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:338:1: (this_CharType_0= ruleCharType | this_NumberType_1= ruleNumberType )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:338:1: (this_CharType_0= ruleCharType | this_NumberType_1= ruleNumberType )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:339:5: this_CharType_0= ruleCharType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDataTypeAccess().getCharTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCharType_in_ruleAbstractDataType704);
                    this_CharType_0=ruleCharType();

                    state._fsp--;

                     
                            current = this_CharType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:349:5: this_NumberType_1= ruleNumberType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDataTypeAccess().getNumberTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberType_in_ruleAbstractDataType731);
                    this_NumberType_1=ruleNumberType();

                    state._fsp--;

                     
                            current = this_NumberType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractDataType"


    // $ANTLR start "entryRuleCharType"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:365:1: entryRuleCharType returns [EObject current=null] : iv_ruleCharType= ruleCharType EOF ;
    public final EObject entryRuleCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharType = null;


        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:366:2: (iv_ruleCharType= ruleCharType EOF )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:367:2: iv_ruleCharType= ruleCharType EOF
            {
             newCompositeNode(grammarAccess.getCharTypeRule()); 
            pushFollow(FOLLOW_ruleCharType_in_entryRuleCharType766);
            iv_ruleCharType=ruleCharType();

            state._fsp--;

             current =iv_ruleCharType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharType776); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharType"


    // $ANTLR start "ruleCharType"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:374:1: ruleCharType returns [EObject current=null] : ( () otherlv_1= 'char' ) ;
    public final EObject ruleCharType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:377:28: ( ( () otherlv_1= 'char' ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:378:1: ( () otherlv_1= 'char' )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:378:1: ( () otherlv_1= 'char' )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:378:2: () otherlv_1= 'char'
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:378:2: ()
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:379:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharTypeAccess().getCharTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCharType822); 

                	newLeafNode(otherlv_1, grammarAccess.getCharTypeAccess().getCharKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharType"


    // $ANTLR start "entryRuleNumberType"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:396:1: entryRuleNumberType returns [EObject current=null] : iv_ruleNumberType= ruleNumberType EOF ;
    public final EObject entryRuleNumberType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberType = null;


        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:397:2: (iv_ruleNumberType= ruleNumberType EOF )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:398:2: iv_ruleNumberType= ruleNumberType EOF
            {
             newCompositeNode(grammarAccess.getNumberTypeRule()); 
            pushFollow(FOLLOW_ruleNumberType_in_entryRuleNumberType858);
            iv_ruleNumberType=ruleNumberType();

            state._fsp--;

             current =iv_ruleNumberType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberType868); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberType"


    // $ANTLR start "ruleNumberType"
    // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:405:1: ruleNumberType returns [EObject current=null] : ( () otherlv_1= 'number' ) ;
    public final EObject ruleNumberType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:408:28: ( ( () otherlv_1= 'number' ) )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:409:1: ( () otherlv_1= 'number' )
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:409:1: ( () otherlv_1= 'number' )
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:409:2: () otherlv_1= 'number'
            {
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:409:2: ()
            // ../org.xtext.example.lmrc.db/src-gen/org/xtext/example/lmrc/db/parser/antlr/internal/InternalDbDsl.g:410:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberTypeAccess().getNumberTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleNumberType914); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberTypeAccess().getNumberKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_ruleRoot131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDatabase212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase229 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleTable_in_ruleDatabase255 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTable339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTable356 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleTable382 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDataType_in_ruleColumn475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumn492 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleAbstractColumnMapper_in_ruleColumn518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractColumnMapper_in_entryRuleAbstractColumnMapper555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractColumnMapper565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleAbstractColumnMapper611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDataType_in_entryRuleAbstractDataType647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDataType657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharType_in_ruleAbstractDataType704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_ruleAbstractDataType731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharType_in_entryRuleCharType766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharType776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCharType822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_entryRuleNumberType858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberType868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleNumberType914 = new BitSet(new long[]{0x0000000000000002L});

}