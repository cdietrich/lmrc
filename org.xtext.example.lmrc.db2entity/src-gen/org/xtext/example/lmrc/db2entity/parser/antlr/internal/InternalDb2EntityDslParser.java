package org.xtext.example.lmrc.db2entity.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.lmrc.db2entity.services.Db2EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDb2EntityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<-'", "'.'", "'database'", "'table'", "'char'", "'number'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
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


        public InternalDb2EntityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDb2EntityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDb2EntityDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g"; }



     	private Db2EntityDslGrammarAccess grammarAccess;
     	
        public InternalDb2EntityDslParser(TokenStream input, Db2EntityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected Db2EntityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:67:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:68:2: (iv_ruleRoot= ruleRoot EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:69:2: iv_ruleRoot= ruleRoot EOF
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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:76:1: ruleRoot returns [EObject current=null] : this_Database_0= ruleDatabase ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_Database_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:79:28: (this_Database_0= ruleDatabase )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:81:5: this_Database_0= ruleDatabase
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


    // $ANTLR start "entryRuleAbstractColumnMapper"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:97:1: entryRuleAbstractColumnMapper returns [EObject current=null] : iv_ruleAbstractColumnMapper= ruleAbstractColumnMapper EOF ;
    public final EObject entryRuleAbstractColumnMapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractColumnMapper = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:98:2: (iv_ruleAbstractColumnMapper= ruleAbstractColumnMapper EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:99:2: iv_ruleAbstractColumnMapper= ruleAbstractColumnMapper EOF
            {
             newCompositeNode(grammarAccess.getAbstractColumnMapperRule()); 
            pushFollow(FOLLOW_ruleAbstractColumnMapper_in_entryRuleAbstractColumnMapper165);
            iv_ruleAbstractColumnMapper=ruleAbstractColumnMapper();

            state._fsp--;

             current =iv_ruleAbstractColumnMapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractColumnMapper175); 

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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:106:1: ruleAbstractColumnMapper returns [EObject current=null] : this_EntityColumnMapper_0= ruleEntityColumnMapper ;
    public final EObject ruleAbstractColumnMapper() throws RecognitionException {
        EObject current = null;

        EObject this_EntityColumnMapper_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:109:28: (this_EntityColumnMapper_0= ruleEntityColumnMapper )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:111:5: this_EntityColumnMapper_0= ruleEntityColumnMapper
            {
             
                    newCompositeNode(grammarAccess.getAbstractColumnMapperAccess().getEntityColumnMapperParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleEntityColumnMapper_in_ruleAbstractColumnMapper221);
            this_EntityColumnMapper_0=ruleEntityColumnMapper();

            state._fsp--;

             
                    current = this_EntityColumnMapper_0; 
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
    // $ANTLR end "ruleAbstractColumnMapper"


    // $ANTLR start "entryRuleEntityColumnMapper"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:127:1: entryRuleEntityColumnMapper returns [EObject current=null] : iv_ruleEntityColumnMapper= ruleEntityColumnMapper EOF ;
    public final EObject entryRuleEntityColumnMapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityColumnMapper = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:128:2: (iv_ruleEntityColumnMapper= ruleEntityColumnMapper EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:129:2: iv_ruleEntityColumnMapper= ruleEntityColumnMapper EOF
            {
             newCompositeNode(grammarAccess.getEntityColumnMapperRule()); 
            pushFollow(FOLLOW_ruleEntityColumnMapper_in_entryRuleEntityColumnMapper255);
            iv_ruleEntityColumnMapper=ruleEntityColumnMapper();

            state._fsp--;

             current =iv_ruleEntityColumnMapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityColumnMapper265); 

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
    // $ANTLR end "entryRuleEntityColumnMapper"


    // $ANTLR start "ruleEntityColumnMapper"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:136:1: ruleEntityColumnMapper returns [EObject current=null] : ( () otherlv_1= '<-' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntityColumnMapper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:139:28: ( ( () otherlv_1= '<-' ( ( ruleFQN ) ) ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:140:1: ( () otherlv_1= '<-' ( ( ruleFQN ) ) )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:140:1: ( () otherlv_1= '<-' ( ( ruleFQN ) ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:140:2: () otherlv_1= '<-' ( ( ruleFQN ) )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:140:2: ()
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:141:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityColumnMapperAccess().getEntityColumnMapperAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleEntityColumnMapper311); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityColumnMapperAccess().getLessThanSignHyphenMinusKeyword_1());
                
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:150:1: ( ( ruleFQN ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:151:1: ( ruleFQN )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:151:1: ( ruleFQN )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:152:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityColumnMapperRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityColumnMapperAccess().getEntityAttributeCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleEntityColumnMapper334);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleEntityColumnMapper"


    // $ANTLR start "entryRuleFQN"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:173:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:174:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:175:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN371);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN382); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:182:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:185:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:186:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:186:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:186:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN422); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:193:1: (kw= '.' this_ID_2= RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:194:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleFQN441); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN456); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleDatabase"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:214:1: entryRuleDatabase returns [EObject current=null] : iv_ruleDatabase= ruleDatabase EOF ;
    public final EObject entryRuleDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatabase = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:215:2: (iv_ruleDatabase= ruleDatabase EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:216:2: iv_ruleDatabase= ruleDatabase EOF
            {
             newCompositeNode(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase503);
            iv_ruleDatabase=ruleDatabase();

            state._fsp--;

             current =iv_ruleDatabase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase513); 

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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:223:1: ruleDatabase returns [EObject current=null] : (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )* ) ;
    public final EObject ruleDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_tables_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:226:28: ( (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )* ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:227:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )* )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:227:1: (otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )* )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:227:3: otherlv_0= 'database' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tables_2_0= ruleTable ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDatabase550); 

                	newLeafNode(otherlv_0, grammarAccess.getDatabaseAccess().getDatabaseKeyword_0());
                
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:231:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:232:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:232:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:233:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatabase567); 

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

            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:249:2: ( (lv_tables_2_0= ruleTable ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:250:1: (lv_tables_2_0= ruleTable )
            	    {
            	    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:250:1: (lv_tables_2_0= ruleTable )
            	    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:251:3: lv_tables_2_0= ruleTable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTable_in_ruleDatabase593);
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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:275:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:276:2: (iv_ruleTable= ruleTable EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:277:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable630);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable640); 

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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:284:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )* ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_columns_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:287:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )* ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:288:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )* )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:288:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )* )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:288:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_ID ) ) ( (lv_columns_2_0= ruleColumn ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTable677); 

                	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:292:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:293:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:293:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:294:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTable694); 

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

            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:310:2: ( (lv_columns_2_0= ruleColumn ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:311:1: (lv_columns_2_0= ruleColumn )
            	    {
            	    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:311:1: (lv_columns_2_0= ruleColumn )
            	    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:312:3: lv_columns_2_0= ruleColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumn_in_ruleTable720);
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
            	    break loop3;
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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:336:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:337:2: (iv_ruleColumn= ruleColumn EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:338:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn757);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn767); 

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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:345:1: ruleColumn returns [EObject current=null] : ( ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;

        EObject lv_mapper_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:348:28: ( ( ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )? ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:349:1: ( ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )? )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:349:1: ( ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )? )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:349:2: ( (lv_type_0_0= ruleAbstractDataType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )?
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:349:2: ( (lv_type_0_0= ruleAbstractDataType ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:350:1: (lv_type_0_0= ruleAbstractDataType )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:350:1: (lv_type_0_0= ruleAbstractDataType )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:351:3: lv_type_0_0= ruleAbstractDataType
            {
             
            	        newCompositeNode(grammarAccess.getColumnAccess().getTypeAbstractDataTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDataType_in_ruleColumn813);
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

            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:367:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:368:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:368:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:369:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumn830); 

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

            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:385:2: ( (lv_mapper_2_0= ruleAbstractColumnMapper ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:386:1: (lv_mapper_2_0= ruleAbstractColumnMapper )
                    {
                    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:386:1: (lv_mapper_2_0= ruleAbstractColumnMapper )
                    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:387:3: lv_mapper_2_0= ruleAbstractColumnMapper
                    {
                     
                    	        newCompositeNode(grammarAccess.getColumnAccess().getMapperAbstractColumnMapperParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractColumnMapper_in_ruleColumn856);
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


    // $ANTLR start "entryRuleAbstractDataType"
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:411:1: entryRuleAbstractDataType returns [EObject current=null] : iv_ruleAbstractDataType= ruleAbstractDataType EOF ;
    public final EObject entryRuleAbstractDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDataType = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:412:2: (iv_ruleAbstractDataType= ruleAbstractDataType EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:413:2: iv_ruleAbstractDataType= ruleAbstractDataType EOF
            {
             newCompositeNode(grammarAccess.getAbstractDataTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractDataType_in_entryRuleAbstractDataType893);
            iv_ruleAbstractDataType=ruleAbstractDataType();

            state._fsp--;

             current =iv_ruleAbstractDataType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDataType903); 

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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:420:1: ruleAbstractDataType returns [EObject current=null] : (this_CharType_0= ruleCharType | this_NumberType_1= ruleNumberType ) ;
    public final EObject ruleAbstractDataType() throws RecognitionException {
        EObject current = null;

        EObject this_CharType_0 = null;

        EObject this_NumberType_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:423:28: ( (this_CharType_0= ruleCharType | this_NumberType_1= ruleNumberType ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:424:1: (this_CharType_0= ruleCharType | this_NumberType_1= ruleNumberType )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:424:1: (this_CharType_0= ruleCharType | this_NumberType_1= ruleNumberType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:425:5: this_CharType_0= ruleCharType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDataTypeAccess().getCharTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCharType_in_ruleAbstractDataType950);
                    this_CharType_0=ruleCharType();

                    state._fsp--;

                     
                            current = this_CharType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:435:5: this_NumberType_1= ruleNumberType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDataTypeAccess().getNumberTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNumberType_in_ruleAbstractDataType977);
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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:451:1: entryRuleCharType returns [EObject current=null] : iv_ruleCharType= ruleCharType EOF ;
    public final EObject entryRuleCharType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharType = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:452:2: (iv_ruleCharType= ruleCharType EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:453:2: iv_ruleCharType= ruleCharType EOF
            {
             newCompositeNode(grammarAccess.getCharTypeRule()); 
            pushFollow(FOLLOW_ruleCharType_in_entryRuleCharType1012);
            iv_ruleCharType=ruleCharType();

            state._fsp--;

             current =iv_ruleCharType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharType1022); 

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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:460:1: ruleCharType returns [EObject current=null] : ( () otherlv_1= 'char' ) ;
    public final EObject ruleCharType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:463:28: ( ( () otherlv_1= 'char' ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:464:1: ( () otherlv_1= 'char' )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:464:1: ( () otherlv_1= 'char' )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:464:2: () otherlv_1= 'char'
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:464:2: ()
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:465:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCharTypeAccess().getCharTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleCharType1068); 

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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:482:1: entryRuleNumberType returns [EObject current=null] : iv_ruleNumberType= ruleNumberType EOF ;
    public final EObject entryRuleNumberType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberType = null;


        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:483:2: (iv_ruleNumberType= ruleNumberType EOF )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:484:2: iv_ruleNumberType= ruleNumberType EOF
            {
             newCompositeNode(grammarAccess.getNumberTypeRule()); 
            pushFollow(FOLLOW_ruleNumberType_in_entryRuleNumberType1104);
            iv_ruleNumberType=ruleNumberType();

            state._fsp--;

             current =iv_ruleNumberType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberType1114); 

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
    // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:491:1: ruleNumberType returns [EObject current=null] : ( () otherlv_1= 'number' ) ;
    public final EObject ruleNumberType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:494:28: ( ( () otherlv_1= 'number' ) )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:495:1: ( () otherlv_1= 'number' )
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:495:1: ( () otherlv_1= 'number' )
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:495:2: () otherlv_1= 'number'
            {
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:495:2: ()
            // ../org.xtext.example.lmrc.db2entity/src-gen/org/xtext/example/lmrc/db2entity/parser/antlr/internal/InternalDb2EntityDsl.g:496:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNumberTypeAccess().getNumberTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleNumberType1160); 

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
    public static final BitSet FOLLOW_ruleAbstractColumnMapper_in_entryRuleAbstractColumnMapper165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractColumnMapper175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityColumnMapper_in_ruleAbstractColumnMapper221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityColumnMapper_in_entryRuleEntityColumnMapper255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityColumnMapper265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleEntityColumnMapper311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntityColumnMapper334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN422 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleFQN441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN456 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDatabase550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatabase567 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleTable_in_ruleDatabase593 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTable677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTable694 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleTable720 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDataType_in_ruleColumn813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumn830 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleAbstractColumnMapper_in_ruleColumn856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDataType_in_entryRuleAbstractDataType893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDataType903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharType_in_ruleAbstractDataType950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_ruleAbstractDataType977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharType_in_entryRuleCharType1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharType1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCharType1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_entryRuleNumberType1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberType1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNumberType1160 = new BitSet(new long[]{0x0000000000000002L});

}