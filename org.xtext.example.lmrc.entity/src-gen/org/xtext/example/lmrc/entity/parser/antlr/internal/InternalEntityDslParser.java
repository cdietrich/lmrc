package org.xtext.example.lmrc.entity.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.lmrc.entity.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "'entity'", "':'", "'boolean'", "'int'", "'string'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
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


        public InternalEntityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g"; }



     	private EntityDslGrammarAccess grammarAccess;
     	
        public InternalEntityDslParser(TokenStream input, EntityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	}
       	
       	@Override
       	protected EntityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModule"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:67:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:68:2: (iv_ruleModule= ruleModule EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:69:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:76:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entities_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:79:28: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:80:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:80:1: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}' )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:80:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModule122); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
                
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModule156); 

                	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:106:1: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:107:1: (lv_entities_3_0= ruleEntity )
            	    {
            	    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:107:1: (lv_entities_3_0= ruleEntity )
            	    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:108:3: lv_entities_3_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModuleAccess().getEntitiesEntityParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModule177);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_3_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModule190); 

                	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:136:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:137:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:138:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity226);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity236); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:145:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:148:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:149:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:149:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:149:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEntity273); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:154:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:154:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity307); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:175:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:176:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:176:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:177:3: lv_attributes_3_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity328);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity341); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:205:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:206:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:207:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute377);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute387); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:214:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:217:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractType ) ) ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:218:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractType ) ) )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:218:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractType ) ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:218:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAbstractType ) )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:218:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:219:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:219:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:220:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute429); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleAttribute446); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:240:1: ( (lv_type_2_0= ruleAbstractType ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:241:1: (lv_type_2_0= ruleAbstractType )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:241:1: (lv_type_2_0= ruleAbstractType )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:242:3: lv_type_2_0= ruleAbstractType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAbstractTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractType_in_ruleAttribute467);
            lv_type_2_0=ruleAbstractType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"AbstractType");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAbstractType"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:268:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:269:2: (iv_ruleAbstractType= ruleAbstractType EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:270:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractType_in_entryRuleAbstractType505);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractType515); 

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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:277:1: ruleAbstractType returns [EObject current=null] : (this_BooleanType_0= ruleBooleanType | this_IntType_1= ruleIntType | this_StringType_2= ruleStringType | this_EntityReference_3= ruleEntityReference ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanType_0 = null;

        EObject this_IntType_1 = null;

        EObject this_StringType_2 = null;

        EObject this_EntityReference_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:280:28: ( (this_BooleanType_0= ruleBooleanType | this_IntType_1= ruleIntType | this_StringType_2= ruleStringType | this_EntityReference_3= ruleEntityReference ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:281:1: (this_BooleanType_0= ruleBooleanType | this_IntType_1= ruleIntType | this_StringType_2= ruleStringType | this_EntityReference_3= ruleEntityReference )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:281:1: (this_BooleanType_0= ruleBooleanType | this_IntType_1= ruleIntType | this_StringType_2= ruleStringType | this_EntityReference_3= ruleEntityReference )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:282:5: this_BooleanType_0= ruleBooleanType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTypeAccess().getBooleanTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanType_in_ruleAbstractType562);
                    this_BooleanType_0=ruleBooleanType();

                    state._fsp--;

                     
                            current = this_BooleanType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:292:5: this_IntType_1= ruleIntType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTypeAccess().getIntTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIntType_in_ruleAbstractType589);
                    this_IntType_1=ruleIntType();

                    state._fsp--;

                     
                            current = this_IntType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:302:5: this_StringType_2= ruleStringType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTypeAccess().getStringTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleStringType_in_ruleAbstractType616);
                    this_StringType_2=ruleStringType();

                    state._fsp--;

                     
                            current = this_StringType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:312:5: this_EntityReference_3= ruleEntityReference
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTypeAccess().getEntityReferenceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleEntityReference_in_ruleAbstractType643);
                    this_EntityReference_3=ruleEntityReference();

                    state._fsp--;

                     
                            current = this_EntityReference_3; 
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
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRuleBooleanType"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:328:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:329:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:330:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType678);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType688); 

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:337:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:340:28: ( ( () otherlv_1= 'boolean' ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:341:1: ( () otherlv_1= 'boolean' )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:341:1: ( () otherlv_1= 'boolean' )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:341:2: () otherlv_1= 'boolean'
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:341:2: ()
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:342:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleBooleanType734); 

                	newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
                

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleIntType"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:359:1: entryRuleIntType returns [EObject current=null] : iv_ruleIntType= ruleIntType EOF ;
    public final EObject entryRuleIntType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntType = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:360:2: (iv_ruleIntType= ruleIntType EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:361:2: iv_ruleIntType= ruleIntType EOF
            {
             newCompositeNode(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType770);
            iv_ruleIntType=ruleIntType();

            state._fsp--;

             current =iv_ruleIntType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType780); 

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
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:368:1: ruleIntType returns [EObject current=null] : ( () otherlv_1= 'int' ) ;
    public final EObject ruleIntType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:371:28: ( ( () otherlv_1= 'int' ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:372:1: ( () otherlv_1= 'int' )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:372:1: ( () otherlv_1= 'int' )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:372:2: () otherlv_1= 'int'
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:372:2: ()
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:373:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIntTypeAccess().getIntTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleIntType826); 

                	newLeafNode(otherlv_1, grammarAccess.getIntTypeAccess().getIntKeyword_1());
                

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
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleStringType"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:390:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:391:2: (iv_ruleStringType= ruleStringType EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:392:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType862);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType872); 

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:399:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:402:28: ( ( () otherlv_1= 'string' ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:403:1: ( () otherlv_1= 'string' )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:403:1: ( () otherlv_1= 'string' )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:403:2: () otherlv_1= 'string'
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:403:2: ()
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:404:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleStringType918); 

                	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
                

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleEntityReference"
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:421:1: entryRuleEntityReference returns [EObject current=null] : iv_ruleEntityReference= ruleEntityReference EOF ;
    public final EObject entryRuleEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityReference = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:422:2: (iv_ruleEntityReference= ruleEntityReference EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:423:2: iv_ruleEntityReference= ruleEntityReference EOF
            {
             newCompositeNode(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference954);
            iv_ruleEntityReference=ruleEntityReference();

            state._fsp--;

             current =iv_ruleEntityReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference964); 

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
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:430:1: ruleEntityReference returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleEntityReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:433:28: ( ( ( ruleFQN ) ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:434:1: ( ( ruleFQN ) )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:434:1: ( ( ruleFQN ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:435:1: ( ruleFQN )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:435:1: ( ruleFQN )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:436:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEntityReferenceAccess().getRefEntityCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleEntityReference1011);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:457:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:458:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:459:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1047);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1058); 

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
    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:466:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:469:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:470:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:470:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:470:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1098); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:477:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entity/src-gen/org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.g:478:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleFQN1117); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1132); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModule122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModule177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleModule190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEntity273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity307 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity328 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute429 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttribute446 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_ruleAbstractType_in_ruleAttribute467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_entryRuleAbstractType505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractType515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleAbstractType562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_ruleAbstractType589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_ruleAbstractType616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_ruleAbstractType643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBooleanType734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleIntType826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStringType918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntityReference1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1098 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFQN1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1132 = new BitSet(new long[]{0x0000000000080002L});

}