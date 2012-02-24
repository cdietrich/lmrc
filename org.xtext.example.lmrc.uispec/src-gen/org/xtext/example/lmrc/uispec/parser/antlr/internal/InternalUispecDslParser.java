package org.xtext.example.lmrc.uispec.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.lmrc.uispec.services.UispecDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUispecDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'form'", "'uses'", "'.'", "'field'", "':'", "'->'", "'textfield'", "'('", "')'", "'checkbox'", "'combobox'", "','"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalUispecDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUispecDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUispecDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g"; }



     	private UispecDslGrammarAccess grammarAccess;
     	
        public InternalUispecDslParser(TokenStream input, UispecDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Form";	
       	}
       	
       	@Override
       	protected UispecDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleForm"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:67:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:68:2: (iv_ruleForm= ruleForm EOF )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:69:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_ruleForm_in_entryRuleForm75);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForm85); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:76:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_usedEntities_2_0= ruleEntityReference ) )* ( (lv_fields_3_0= ruleField ) )* ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_usedEntities_2_0 = null;

        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:79:28: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_usedEntities_2_0= ruleEntityReference ) )* ( (lv_fields_3_0= ruleField ) )* ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:80:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_usedEntities_2_0= ruleEntityReference ) )* ( (lv_fields_3_0= ruleField ) )* )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:80:1: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_usedEntities_2_0= ruleEntityReference ) )* ( (lv_fields_3_0= ruleField ) )* )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:80:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) ( (lv_usedEntities_2_0= ruleEntityReference ) )* ( (lv_fields_3_0= ruleField ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleForm122); 

                	newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
                
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForm139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:102:2: ( (lv_usedEntities_2_0= ruleEntityReference ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:103:1: (lv_usedEntities_2_0= ruleEntityReference )
            	    {
            	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:103:1: (lv_usedEntities_2_0= ruleEntityReference )
            	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:104:3: lv_usedEntities_2_0= ruleEntityReference
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormAccess().getUsedEntitiesEntityReferenceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntityReference_in_ruleForm165);
            	    lv_usedEntities_2_0=ruleEntityReference();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usedEntities",
            	            		lv_usedEntities_2_0, 
            	            		"EntityReference");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:120:3: ( (lv_fields_3_0= ruleField ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:121:1: (lv_fields_3_0= ruleField )
            	    {
            	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:121:1: (lv_fields_3_0= ruleField )
            	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:122:3: lv_fields_3_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFormAccess().getFieldsFieldParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleForm187);
            	    lv_fields_3_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFormRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"Field");
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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleEntityReference"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:146:1: entryRuleEntityReference returns [EObject current=null] : iv_ruleEntityReference= ruleEntityReference EOF ;
    public final EObject entryRuleEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReference = null;


        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:147:2: (iv_ruleEntityReference= ruleEntityReference EOF )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:148:2: iv_ruleEntityReference= ruleEntityReference EOF
            {
             newCompositeNode(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference224);
            iv_ruleEntityReference=ruleEntityReference();

            state._fsp--;

             current =iv_ruleEntityReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference234); 

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
    // $ANTLR end "entryRuleEntityReference"


    // $ANTLR start "ruleEntityReference"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:155:1: ruleEntityReference returns [EObject current=null] : (otherlv_0= 'uses' ( ( ruleFQN ) ) ) ;
    public final EObject ruleEntityReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:158:28: ( (otherlv_0= 'uses' ( ( ruleFQN ) ) ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:159:1: (otherlv_0= 'uses' ( ( ruleFQN ) ) )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:159:1: (otherlv_0= 'uses' ( ( ruleFQN ) ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:159:3: otherlv_0= 'uses' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleEntityReference271); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityReferenceAccess().getUsesKeyword_0());
                
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:163:1: ( ( ruleFQN ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:164:1: ( ruleFQN )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:164:1: ( ruleFQN )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:165:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityReferenceAccess().getEntityEntityCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleEntityReference294);
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
    // $ANTLR end "ruleEntityReference"


    // $ANTLR start "entryRuleFQN"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:186:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:187:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:188:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN331);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN342); 

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
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:195:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:198:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:199:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:199:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:199:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN382); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:206:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:207:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleFQN401); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN416); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleField"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:227:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:228:2: (iv_ruleField= ruleField EOF )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:229:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField463);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField473); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:236:1: ruleField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_widget_3_0= ruleWidget ) ) otherlv_4= '->' ( ( ruleFQN ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_widget_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:239:28: ( (otherlv_0= 'field' ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_widget_3_0= ruleWidget ) ) otherlv_4= '->' ( ( ruleFQN ) ) ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:240:1: (otherlv_0= 'field' ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_widget_3_0= ruleWidget ) ) otherlv_4= '->' ( ( ruleFQN ) ) )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:240:1: (otherlv_0= 'field' ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_widget_3_0= ruleWidget ) ) otherlv_4= '->' ( ( ruleFQN ) ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:240:3: otherlv_0= 'field' ( (lv_label_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_widget_3_0= ruleWidget ) ) otherlv_4= '->' ( ( ruleFQN ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleField510); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:244:1: ( (lv_label_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:245:1: (lv_label_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:245:1: (lv_label_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:246:3: lv_label_1_0= RULE_ID
            {
            lv_label_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField527); 

            			newLeafNode(lv_label_1_0, grammarAccess.getFieldAccess().getLabelIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleField544); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
                
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:266:1: ( (lv_widget_3_0= ruleWidget ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:267:1: (lv_widget_3_0= ruleWidget )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:267:1: (lv_widget_3_0= ruleWidget )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:268:3: lv_widget_3_0= ruleWidget
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getWidgetWidgetParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleWidget_in_ruleField565);
            lv_widget_3_0=ruleWidget();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"widget",
                    		lv_widget_3_0, 
                    		"Widget");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleField577); 

                	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:288:1: ( ( ruleFQN ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:289:1: ( ruleFQN )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:289:1: ( ruleFQN )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:290:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getAttributeAttributeCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleField600);
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleWidget"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:311:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:312:2: (iv_ruleWidget= ruleWidget EOF )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:313:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget636);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget646); 

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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:320:1: ruleWidget returns [EObject current=null] : (this_TextFieldWidget_0= ruleTextFieldWidget | this_CheckBoxWidget_1= ruleCheckBoxWidget | this_ComboWidget_2= ruleComboWidget ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        EObject this_TextFieldWidget_0 = null;

        EObject this_CheckBoxWidget_1 = null;

        EObject this_ComboWidget_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:323:28: ( (this_TextFieldWidget_0= ruleTextFieldWidget | this_CheckBoxWidget_1= ruleCheckBoxWidget | this_ComboWidget_2= ruleComboWidget ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:324:1: (this_TextFieldWidget_0= ruleTextFieldWidget | this_CheckBoxWidget_1= ruleCheckBoxWidget | this_ComboWidget_2= ruleComboWidget )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:324:1: (this_TextFieldWidget_0= ruleTextFieldWidget | this_CheckBoxWidget_1= ruleCheckBoxWidget | this_ComboWidget_2= ruleComboWidget )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:325:5: this_TextFieldWidget_0= ruleTextFieldWidget
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getTextFieldWidgetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTextFieldWidget_in_ruleWidget693);
                    this_TextFieldWidget_0=ruleTextFieldWidget();

                    state._fsp--;

                     
                            current = this_TextFieldWidget_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:335:5: this_CheckBoxWidget_1= ruleCheckBoxWidget
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getCheckBoxWidgetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCheckBoxWidget_in_ruleWidget720);
                    this_CheckBoxWidget_1=ruleCheckBoxWidget();

                    state._fsp--;

                     
                            current = this_CheckBoxWidget_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:345:5: this_ComboWidget_2= ruleComboWidget
                    {
                     
                            newCompositeNode(grammarAccess.getWidgetAccess().getComboWidgetParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleComboWidget_in_ruleWidget747);
                    this_ComboWidget_2=ruleComboWidget();

                    state._fsp--;

                     
                            current = this_ComboWidget_2; 
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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleTextFieldWidget"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:361:1: entryRuleTextFieldWidget returns [EObject current=null] : iv_ruleTextFieldWidget= ruleTextFieldWidget EOF ;
    public final EObject entryRuleTextFieldWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextFieldWidget = null;


        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:362:2: (iv_ruleTextFieldWidget= ruleTextFieldWidget EOF )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:363:2: iv_ruleTextFieldWidget= ruleTextFieldWidget EOF
            {
             newCompositeNode(grammarAccess.getTextFieldWidgetRule()); 
            pushFollow(FOLLOW_ruleTextFieldWidget_in_entryRuleTextFieldWidget782);
            iv_ruleTextFieldWidget=ruleTextFieldWidget();

            state._fsp--;

             current =iv_ruleTextFieldWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextFieldWidget792); 

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
    // $ANTLR end "entryRuleTextFieldWidget"


    // $ANTLR start "ruleTextFieldWidget"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:370:1: ruleTextFieldWidget returns [EObject current=null] : (otherlv_0= 'textfield' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleTextFieldWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:373:28: ( (otherlv_0= 'textfield' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:374:1: (otherlv_0= 'textfield' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:374:1: (otherlv_0= 'textfield' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:374:3: otherlv_0= 'textfield' otherlv_1= '(' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTextFieldWidget829); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldWidgetAccess().getTextfieldKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTextFieldWidget841); 

                	newLeafNode(otherlv_1, grammarAccess.getTextFieldWidgetAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:382:1: ( (lv_length_2_0= RULE_INT ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:383:1: (lv_length_2_0= RULE_INT )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:383:1: (lv_length_2_0= RULE_INT )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:384:3: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTextFieldWidget858); 

            			newLeafNode(lv_length_2_0, grammarAccess.getTextFieldWidgetAccess().getLengthINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextFieldWidgetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"length",
                    		lv_length_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTextFieldWidget875); 

                	newLeafNode(otherlv_3, grammarAccess.getTextFieldWidgetAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleTextFieldWidget"


    // $ANTLR start "entryRuleCheckBoxWidget"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:412:1: entryRuleCheckBoxWidget returns [EObject current=null] : iv_ruleCheckBoxWidget= ruleCheckBoxWidget EOF ;
    public final EObject entryRuleCheckBoxWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBoxWidget = null;


        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:413:2: (iv_ruleCheckBoxWidget= ruleCheckBoxWidget EOF )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:414:2: iv_ruleCheckBoxWidget= ruleCheckBoxWidget EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxWidgetRule()); 
            pushFollow(FOLLOW_ruleCheckBoxWidget_in_entryRuleCheckBoxWidget911);
            iv_ruleCheckBoxWidget=ruleCheckBoxWidget();

            state._fsp--;

             current =iv_ruleCheckBoxWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBoxWidget921); 

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
    // $ANTLR end "entryRuleCheckBoxWidget"


    // $ANTLR start "ruleCheckBoxWidget"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:421:1: ruleCheckBoxWidget returns [EObject current=null] : ( () otherlv_1= 'checkbox' ) ;
    public final EObject ruleCheckBoxWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:424:28: ( ( () otherlv_1= 'checkbox' ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:425:1: ( () otherlv_1= 'checkbox' )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:425:1: ( () otherlv_1= 'checkbox' )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:425:2: () otherlv_1= 'checkbox'
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:425:2: ()
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:426:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCheckBoxWidgetAccess().getCheckBoxWidgetAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCheckBoxWidget967); 

                	newLeafNode(otherlv_1, grammarAccess.getCheckBoxWidgetAccess().getCheckboxKeyword_1());
                

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
    // $ANTLR end "ruleCheckBoxWidget"


    // $ANTLR start "entryRuleComboWidget"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:443:1: entryRuleComboWidget returns [EObject current=null] : iv_ruleComboWidget= ruleComboWidget EOF ;
    public final EObject entryRuleComboWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboWidget = null;


        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:444:2: (iv_ruleComboWidget= ruleComboWidget EOF )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:445:2: iv_ruleComboWidget= ruleComboWidget EOF
            {
             newCompositeNode(grammarAccess.getComboWidgetRule()); 
            pushFollow(FOLLOW_ruleComboWidget_in_entryRuleComboWidget1003);
            iv_ruleComboWidget=ruleComboWidget();

            state._fsp--;

             current =iv_ruleComboWidget; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboWidget1013); 

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
    // $ANTLR end "entryRuleComboWidget"


    // $ANTLR start "ruleComboWidget"
    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:452:1: ruleComboWidget returns [EObject current=null] : ( () otherlv_1= 'combobox' otherlv_2= '(' ( ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleComboWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:455:28: ( ( () otherlv_1= 'combobox' otherlv_2= '(' ( ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* )? otherlv_6= ')' ) )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:456:1: ( () otherlv_1= 'combobox' otherlv_2= '(' ( ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* )? otherlv_6= ')' )
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:456:1: ( () otherlv_1= 'combobox' otherlv_2= '(' ( ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* )? otherlv_6= ')' )
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:456:2: () otherlv_1= 'combobox' otherlv_2= '(' ( ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* )? otherlv_6= ')'
            {
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:456:2: ()
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:457:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getComboWidgetAccess().getComboWidgetAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleComboWidget1059); 

                	newLeafNode(otherlv_1, grammarAccess.getComboWidgetAccess().getComboboxKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleComboWidget1071); 

                	newLeafNode(otherlv_2, grammarAccess.getComboWidgetAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:470:1: ( ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:470:2: ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
                    {
                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:470:2: ( (lv_values_3_0= RULE_ID ) )
                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:471:1: (lv_values_3_0= RULE_ID )
                    {
                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:471:1: (lv_values_3_0= RULE_ID )
                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:472:3: lv_values_3_0= RULE_ID
                    {
                    lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComboWidget1089); 

                    			newLeafNode(lv_values_3_0, grammarAccess.getComboWidgetAccess().getValuesIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComboWidgetRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"values",
                            		lv_values_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:488:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:488:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleComboWidget1107); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getComboWidgetAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:492:1: ( (lv_values_5_0= RULE_ID ) )
                    	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:493:1: (lv_values_5_0= RULE_ID )
                    	    {
                    	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:493:1: (lv_values_5_0= RULE_ID )
                    	    // ../org.xtext.example.lmrc.uispec/src-gen/org/xtext/example/lmrc/uispec/parser/antlr/internal/InternalUispecDsl.g:494:3: lv_values_5_0= RULE_ID
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComboWidget1124); 

                    	    			newLeafNode(lv_values_5_0, grammarAccess.getComboWidgetAccess().getValuesIDTerminalRuleCall_3_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getComboWidgetRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_5_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleComboWidget1145); 

                	newLeafNode(otherlv_6, grammarAccess.getComboWidgetAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleComboWidget"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleForm_in_entryRuleForm75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForm85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleForm122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForm139 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_ruleForm165 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_ruleField_in_ruleForm187 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEntityReference271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntityReference294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN382 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleFQN401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN416 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleField510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField527 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleField544 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_ruleWidget_in_ruleField565 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleField577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleField600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextFieldWidget_in_ruleWidget693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxWidget_in_ruleWidget720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboWidget_in_ruleWidget747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextFieldWidget_in_entryRuleTextFieldWidget782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextFieldWidget792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTextFieldWidget829 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTextFieldWidget841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTextFieldWidget858 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTextFieldWidget875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxWidget_in_entryRuleCheckBoxWidget911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBoxWidget921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCheckBoxWidget967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboWidget_in_entryRuleComboWidget1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboWidget1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleComboWidget1059 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleComboWidget1071 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComboWidget1089 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleComboWidget1107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComboWidget1124 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleComboWidget1145 = new BitSet(new long[]{0x0000000000000002L});

}