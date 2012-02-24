package org.xtext.example.lmrc.entityexpr.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.lmrc.entityexpr.services.EntityWithExprDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEntityWithExprDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "'import'", "'.'", "'*'", "'entity'", "':'", "'('", "','", "')'", "'='", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalEntityWithExprDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityWithExprDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityWithExprDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g"; }



     	private EntityWithExprDslGrammarAccess grammarAccess;
     	
        public InternalEntityWithExprDslParser(TokenStream input, EntityWithExprDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	}
       	
       	@Override
       	protected EntityWithExprDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModule"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:67:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:68:2: (iv_ruleModule= ruleModule EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:69:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); if (state.failed) return current;

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
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:76:1: ruleModule returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imports_0_0 = null;

        EObject lv_entities_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_entities_4_0= ruleEntity ) )* otherlv_5= '}'
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:80:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:81:1: (lv_imports_0_0= ruleImport )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:82:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModule131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModule144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:102:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:103:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:103:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:104:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getModuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleModule178); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:124:1: ( (lv_entities_4_0= ruleEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:125:1: (lv_entities_4_0= ruleEntity )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:125:1: (lv_entities_4_0= ruleEntity )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:126:3: lv_entities_4_0= ruleEntity
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getEntitiesEntityParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEntity_in_ruleModule199);
            	    lv_entities_4_0=ruleEntity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entities",
            	              		lv_entities_4_0, 
            	              		"Entity");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleModule212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:154:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:155:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:156:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport248);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport258); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:163:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:166:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:167:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:167:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:167:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:171:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:172:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:172:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:173:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport316);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:197:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:198:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:199:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard353);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard364); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:206:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:209:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:210:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:210:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )? )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:211:5: this_QualifiedName_0= ruleQualifiedName (kw= '.' kw= '*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard411);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:221:1: (kw= '.' kw= '*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:222:2: kw= '.' kw= '*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildCard430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQualifiedNameWithWildCard443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getAsteriskKeyword_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:241:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:242:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:243:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity485);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity495); if (state.failed) return current;

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
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:250:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_operations_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:253:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:254:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:254:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:254:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleEntity532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:258:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:259:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:259:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:260:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:280:1: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==18) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:281:1: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:281:1: (lv_attributes_3_0= ruleAttribute )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:282:3: lv_attributes_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity587);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:298:3: ( (lv_operations_4_0= ruleOperation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID||LA5_0==19||LA5_0==70) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:299:1: (lv_operations_4_0= ruleOperation )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:299:1: (lv_operations_4_0= ruleOperation )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:300:3: lv_operations_4_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getOperationsOperationParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOperation_in_ruleEntity609);
            	    lv_operations_4_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"operations",
            	              		lv_operations_4_0, 
            	              		"Operation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEntity622); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:328:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:329:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:330:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute658);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute668); if (state.failed) return current;

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
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:337:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:340:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:341:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:341:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:341:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:341:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:342:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:342:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:343:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAttribute727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:363:1: ( (lv_type_2_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:364:1: (lv_type_2_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:364:1: (lv_type_2_0= ruleJvmTypeReference )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:365:3: lv_type_2_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleAttribute748);
            lv_type_2_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:389:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:390:2: (iv_ruleOperation= ruleOperation EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:391:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation784);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation794); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:398:1: ruleOperation returns [EObject current=null] : ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:401:28: ( ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:402:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:402:1: ( ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:402:2: ( (lv_type_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleXBlockExpression ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:402:2: ( (lv_type_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:403:1: (lv_type_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:403:1: (lv_type_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:404:3: lv_type_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleOperation840);
            lv_type_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:420:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:421:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:421:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:422:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleOperation874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:442:1: ( ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==19||LA7_0==70) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:442:2: ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:442:2: ( (lv_parameters_3_0= ruleFullJvmFormalParameter ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:443:1: (lv_parameters_3_0= ruleFullJvmFormalParameter )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:443:1: (lv_parameters_3_0= ruleFullJvmFormalParameter )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:444:3: lv_parameters_3_0= ruleFullJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersFullJvmFormalParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation896);
                    lv_parameters_3_0=ruleFullJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"FullJvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:460:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:460:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleOperation909); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:464:1: ( (lv_parameters_5_0= ruleFullJvmFormalParameter ) )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:465:1: (lv_parameters_5_0= ruleFullJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:465:1: (lv_parameters_5_0= ruleFullJvmFormalParameter )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:466:3: lv_parameters_5_0= ruleFullJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersFullJvmFormalParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation930);
                    	    lv_parameters_5_0=ruleFullJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"FullJvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleOperation946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:486:1: ( (lv_body_7_0= ruleXBlockExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:487:1: (lv_body_7_0= ruleXBlockExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:487:1: (lv_body_7_0= ruleXBlockExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:488:3: lv_body_7_0= ruleXBlockExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getBodyXBlockExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_ruleOperation967);
            lv_body_7_0=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOperationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"XBlockExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:512:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:513:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:514:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression1003);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression1013); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:521:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:524:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:526:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression1059);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:542:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:543:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:544:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1093);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:551:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:554:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:555:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:555:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=RULE_ID && LA9_1<=RULE_STRING)||(LA9_1>=12 && LA9_1<=13)||(LA9_1>=15 && LA9_1<=16)||(LA9_1>=18 && LA9_1<=21)||(LA9_1>=23 && LA9_1<=44)||(LA9_1>=46 && LA9_1<=70)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==22) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_STRING)||LA9_0==12||LA9_0==19||LA9_0==32||(LA9_0>=35 && LA9_0<=36)||LA9_0==40||LA9_0==44||LA9_0==48||LA9_0==50||(LA9_0>=53 && LA9_0<=55)||LA9_0==58||(LA9_0>=60 && LA9_0<=67)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:555:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:555:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:555:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:555:3: ()
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:556:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:561:2: ( ( ruleValidID ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:562:1: ( ruleValidID )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:562:1: ( ruleValidID )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:563:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment1161);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1177);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:584:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:585:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:585:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:586:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1197);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:603:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:603:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:604:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1227);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        int LA8_1 = input.LA(2);

                        if ( (synpred1_InternalEntityWithExprDsl()) ) {
                            alt8=1;
                        }
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:617:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:617:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:617:7: ()
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:618:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:623:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:624:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:624:1: ( ruleOpMultiAssign )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:625:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1280);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:638:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:639:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:639:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:640:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1303);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:664:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:665:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:666:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1343);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1354); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:673:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:676:28: (kw= '=' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:678:2: kw= '='
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleOpSingleAssign1391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:691:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:692:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:693:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1431);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1442); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:700:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:703:28: (kw= '+=' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:705:2: kw= '+='
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleOpMultiAssign1479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:718:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:719:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:720:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1518);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1528); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:727:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:730:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:731:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:731:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:732:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1575);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred2_InternalEntityWithExprDsl()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:745:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:745:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:745:7: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:746:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:751:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:752:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:752:1: ( ruleOpOr )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:753:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1628);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:766:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:767:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:767:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:768:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1651);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:792:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:793:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:794:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1690);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1701); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:801:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:804:28: (kw= '||' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:806:2: kw= '||'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleOpOr1738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:819:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:820:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:821:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1777);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1787); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:828:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:831:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:832:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:832:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:833:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1834);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred3_InternalEntityWithExprDsl()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:846:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:846:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:846:7: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:847:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:852:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:853:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:853:1: ( ruleOpAnd )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:854:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1887);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:867:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:868:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:868:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:869:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1910);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:893:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:894:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:895:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1949);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1960); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:902:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:905:28: (kw= '&&' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:907:2: kw= '&&'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleOpAnd1997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:920:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:921:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:922:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2036);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression2046); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:929:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:932:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:933:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:933:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:934:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2093);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred4_InternalEntityWithExprDsl()) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==27) ) {
                    int LA12_3 = input.LA(2);

                    if ( (synpred4_InternalEntityWithExprDsl()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:947:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:947:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:947:7: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:948:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:953:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:954:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:954:1: ( ruleOpEquality )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:955:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2146);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:968:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:969:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:969:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:970:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2169);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:994:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:995:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:996:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2208);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2219); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1003:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1006:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1007:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1007:1: (kw= '==' | kw= '!=' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1008:2: kw= '=='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpEquality2257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1015:2: kw= '!='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpEquality2276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1028:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1029:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1030:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2316);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2326); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1037:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1040:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1041:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1041:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1042:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2373);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop14:
            do {
                int alt14=3;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred5_InternalEntityWithExprDsl()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 29:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred6_InternalEntityWithExprDsl()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 30:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred6_InternalEntityWithExprDsl()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 31:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (synpred6_InternalEntityWithExprDsl()) ) {
                        alt14=2;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA14_6 = input.LA(2);

                    if ( (synpred6_InternalEntityWithExprDsl()) ) {
                        alt14=2;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1052:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1052:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1052:6: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1053:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXRelationalExpression2409); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1062:3: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1063:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1063:1: ( ruleQualifiedName )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1064:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2434);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1083:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1083:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1083:7: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1084:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1089:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1090:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1090:1: ( ruleOpCompare )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1091:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2495);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1104:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1105:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1105:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1106:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2518);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1130:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1131:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1132:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2558);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2569); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1139:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1142:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1143:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1143:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 32:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1144:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpCompare2607); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1151:2: kw= '<='
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpCompare2626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1158:2: kw= '>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpCompare2645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1165:2: kw= '<'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpCompare2664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1178:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1179:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1180:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2704);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2714); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1187:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1190:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1191:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1191:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1192:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2761);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred7_InternalEntityWithExprDsl()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==34) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred7_InternalEntityWithExprDsl()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1205:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1205:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1205:7: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1206:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1211:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1212:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1212:1: ( ruleOpOther )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1213:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2814);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1226:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1227:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1227:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1228:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2837);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1252:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1253:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1254:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2876);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2887); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1261:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1264:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1265:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1265:1: (kw= '->' | kw= '..' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1266:2: kw= '->'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1273:2: kw= '..'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1286:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1287:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1288:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2984);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2994); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1295:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1298:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1299:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1299:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1300:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3041);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred8_InternalEntityWithExprDsl()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==36) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred8_InternalEntityWithExprDsl()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1313:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1313:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1313:7: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1314:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1319:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1320:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1320:1: ( ruleOpAdd )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1321:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3094);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1334:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1335:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1335:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1336:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3117);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1360:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1361:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1362:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3156);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3167); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1369:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1372:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1373:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1373:1: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1374:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd3205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1381:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAdd3224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1394:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1395:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1396:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3264);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3274); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1403:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1406:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1407:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1407:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1408:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3321);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred9_InternalEntityWithExprDsl()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred9_InternalEntityWithExprDsl()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred9_InternalEntityWithExprDsl()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred9_InternalEntityWithExprDsl()) ) {
                        alt20=1;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1421:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1421:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1421:7: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1422:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1427:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1428:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1428:1: ( ruleOpMulti )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1429:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3374);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1442:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1443:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1443:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1444:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3397);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1468:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1469:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1470:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3436);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3447); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1477:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1480:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1481:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1481:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt21=1;
                }
                break;
            case 37:
                {
                alt21=2;
                }
                break;
            case 38:
                {
                alt21=3;
                }
                break;
            case 39:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1482:2: kw= '*'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleOpMulti3485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1489:2: kw= '**'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1496:2: kw= '/'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1503:2: kw= '%'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1516:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1517:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1518:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3582);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3592); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1525:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1528:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1529:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1529:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=35 && LA22_0<=36)||LA22_0==40) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)||LA22_0==12||LA22_0==19||LA22_0==32||LA22_0==44||LA22_0==48||LA22_0==50||(LA22_0>=53 && LA22_0<=55)||LA22_0==58||(LA22_0>=60 && LA22_0<=67)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1529:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1529:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1529:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1529:3: ()
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1530:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1535:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1536:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1536:1: ( ruleOpUnary )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1537:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3650);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1550:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1551:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1551:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1552:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3671);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1570:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3700);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1586:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1587:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1588:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3736);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3747); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1595:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1598:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1599:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1599:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1600:2: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpUnary3785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1607:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1614:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3823); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1627:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1628:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1629:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3863);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3873); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1636:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1639:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1640:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1640:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1641:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3920);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred10_InternalEntityWithExprDsl()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1651:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1651:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1651:6: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1652:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXCastedExpression3955); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1661:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1662:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1662:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1663:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3978);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1687:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1688:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1689:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4016);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall4026); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1696:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1699:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1700:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1700:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1701:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4073);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop32:
            do {
                int alt32=3;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred11_InternalEntityWithExprDsl()) ) {
                        alt32=1;
                    }
                    else if ( (synpred12_InternalEntityWithExprDsl()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred12_InternalEntityWithExprDsl()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 43:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred12_InternalEntityWithExprDsl()) ) {
                        alt32=2;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1715:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1715:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1715:26: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1716:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall4122); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1725:1: ( ( ruleValidID ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1726:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1726:1: ( ruleValidID )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1727:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4145);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4161);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1748:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1749:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1749:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1750:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4183);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1783:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1783:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1783:8: ()
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1784:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1789:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 15:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1789:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleXMemberFeatureCall4269); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1794:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1794:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1795:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1795:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1796:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,42,FOLLOW_42_in_ruleXMemberFeatureCall4293); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1810:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1810:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1811:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1811:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1812:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4330); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1825:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==32) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1825:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleXMemberFeatureCall4359); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1829:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1830:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1830:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1831:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4380);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1847:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==20) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1847:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4393); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1851:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1852:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1852:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1853:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4414);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop26;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXMemberFeatureCall4428); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1873:3: ( ( ruleValidID ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1874:1: ( ruleValidID )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1874:1: ( ruleValidID )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1875:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4453);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1888:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1888:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1888:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1888:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1895:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1896:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,19,FOLLOW_19_in_ruleXMemberFeatureCall4487); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1926:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1927:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4572);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1944:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1944:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1944:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1944:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1945:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1945:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1946:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4600);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1962:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==20) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1962:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleXMemberFeatureCall4613); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1966:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1967:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1967:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1968:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4634);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop28;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleXMemberFeatureCall4651); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1988:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1988:4: ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1993:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1994:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4684);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2018:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2019:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2020:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4724);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4734); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2027:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2030:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2031:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2031:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt33=13;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt33=1;
                }
                break;
            case 12:
                {
                alt33=2;
                }
                break;
            case 50:
                {
                alt33=3;
                }
                break;
            case RULE_ID:
            case 32:
            case 58:
                {
                alt33=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 44:
            case 61:
            case 62:
            case 63:
            case 64:
                {
                alt33=5;
                }
                break;
            case 48:
                {
                alt33=6;
                }
                break;
            case 53:
                {
                alt33=7;
                }
                break;
            case 54:
                {
                alt33=8;
                }
                break;
            case 55:
                {
                alt33=9;
                }
                break;
            case 65:
                {
                alt33=10;
                }
                break;
            case 66:
                {
                alt33=11;
                }
                break;
            case 67:
                {
                alt33=12;
                }
                break;
            case 19:
                {
                alt33=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2032:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4781);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2042:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4808);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2052:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4835);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2062:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4862);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2072:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4889);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2082:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4916);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2092:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4943);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2102:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4970);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2112:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4997);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2122:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5024);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2132:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5051);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2142:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5078);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2152:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5105);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2168:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2169:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2170:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5140);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5150); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2177:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2180:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2181:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2181:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt34=1;
                }
                break;
            case 61:
            case 62:
                {
                alt34=2;
                }
                break;
            case RULE_INT:
                {
                alt34=3;
                }
                break;
            case 63:
                {
                alt34=4;
                }
                break;
            case RULE_STRING:
                {
                alt34=5;
                }
                break;
            case 64:
                {
                alt34=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2182:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5197);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2192:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5224);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2202:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5251);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2212:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5278);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2222:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5305);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2232:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5332);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2248:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2249:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2250:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5367);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5377); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2257:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2260:28: ( ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2261:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2261:1: ( () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2261:2: () otherlv_1= '[' ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2261:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2262:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2286:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2286:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2286:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ID||LA36_0==19||LA36_0==70) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2286:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2286:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2287:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2287:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2288:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5494);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2304:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==20) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2304:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleXClosure5507); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2308:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2309:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2309:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2310:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_2_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5528);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2326:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2327:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2327:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2328:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,45,FOLLOW_45_in_ruleXClosure5550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_2_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2341:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2342:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2342:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2343:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5587);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2371:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2372:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2373:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5635);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5645); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2380:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2383:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2384:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2384:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2384:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2384:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2385:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2390:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ID && LA39_0<=RULE_STRING)||LA39_0==12||LA39_0==19||LA39_0==32||(LA39_0>=35 && LA39_0<=36)||LA39_0==40||LA39_0==44||LA39_0==48||LA39_0==50||(LA39_0>=53 && LA39_0<=58)||(LA39_0>=60 && LA39_0<=67)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2390:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2390:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2391:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2391:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2392:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5701);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2408:2: (otherlv_2= ';' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==47) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2408:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXExpressionInClosure5714); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2420:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2421:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2422:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5754);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5764); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2429:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2432:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2433:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2433:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2433:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2433:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2433:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2449:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2449:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2449:7: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2450:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2455:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==19||LA41_0==70) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2455:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2455:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2456:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2456:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2457:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5872);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2473:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==20) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2473:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXShortClosure5885); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2477:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2478:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2478:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2479:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5906);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2495:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2496:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2496:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2497:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,45,FOLLOW_45_in_ruleXShortClosure5928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2510:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2511:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2511:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2512:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5964);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2536:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2537:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2538:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6000);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression6010); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2545:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2548:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2549:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2549:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2549:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXParenthesizedExpression6047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6069);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleXParenthesizedExpression6080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2574:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2575:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2576:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6116);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6126); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2583:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2586:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2587:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2587:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2587:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2587:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2588:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXIfExpression6184); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2601:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2602:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2602:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2603:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6205);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXIfExpression6217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2623:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2624:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2624:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2625:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6238);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2641:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==49) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred18_InternalEntityWithExprDsl()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2641:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2641:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2641:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleXIfExpression6259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2646:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2647:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2647:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2648:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6281);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2672:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2673:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2674:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6319);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6329); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2681:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2684:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2685:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2685:1: ( () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2685:2: () otherlv_1= 'switch' ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2685:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2686:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXSwitchExpression6375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2695:1: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==18) && (synpred19_InternalEntityWithExprDsl())) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2695:2: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2700:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2700:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2700:6: ( (lv_localVarName_2_0= ruleValidID ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2701:1: (lv_localVarName_2_0= ruleValidID )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2701:1: (lv_localVarName_2_0= ruleValidID )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2702:3: lv_localVarName_2_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6416);
                    lv_localVarName_2_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression6428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2722:4: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2723:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2723:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2724:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6452);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleXSwitchExpression6464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2744:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID||(LA44_0>=18 && LA44_0<=19)||LA44_0==52||LA44_0==70) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2745:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2745:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2746:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6485);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2762:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2762:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXSwitchExpression6499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleXSwitchExpression6511); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2770:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2771:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2771:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2772:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6532);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleXSwitchExpression6546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2800:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2801:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2802:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6582);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6592); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2809:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2812:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2813:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2813:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2813:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2813:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==19||LA46_0==70) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2814:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2814:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2815:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6638);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2831:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2831:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXCasePart6652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2835:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2836:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2836:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2837:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6673);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleXCasePart6687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2857:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2858:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2858:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2859:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6708);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2883:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2884:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2885:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6744);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6754); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2892:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2895:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2896:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2896:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2896:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2896:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2897:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXForLoopExpression6800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXForLoopExpression6812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2910:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2911:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2911:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2912:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6833);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleXForLoopExpression6845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2932:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2933:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2933:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2934:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6866);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXForLoopExpression6878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2954:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2955:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2955:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2956:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6899);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2980:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2981:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2982:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6935);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6945); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2989:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2992:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2993:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2993:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2993:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2993:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2994:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleXWhileExpression6991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXWhileExpression7003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3007:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3008:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3008:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3009:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7024);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXWhileExpression7036); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3029:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3030:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3030:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3031:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7057);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3055:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3056:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3057:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7093);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3064:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3067:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3068:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3068:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3068:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3068:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3069:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXDoWhileExpression7149); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3078:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3079:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3079:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3080:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7170);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleXDoWhileExpression7182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleXDoWhileExpression7194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3104:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3105:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3105:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3106:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7215);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleXDoWhileExpression7227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3134:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3135:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3136:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7263);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7273); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3143:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3146:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3147:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3147:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3147:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3147:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3148:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleXBlockExpression7319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3157:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)||LA49_0==12||LA49_0==19||LA49_0==32||(LA49_0>=35 && LA49_0<=36)||LA49_0==40||LA49_0==44||LA49_0==48||LA49_0==50||(LA49_0>=53 && LA49_0<=58)||(LA49_0>=60 && LA49_0<=67)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3157:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3157:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3158:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3158:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3159:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7341);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3175:2: (otherlv_3= ';' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==47) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3175:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleXBlockExpression7354); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleXBlockExpression7370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3191:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3192:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3193:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7406);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7416); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3200:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3203:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3204:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3204:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=56 && LA50_0<=57)) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||LA50_0==12||LA50_0==19||LA50_0==32||(LA50_0>=35 && LA50_0<=36)||LA50_0==40||LA50_0==44||LA50_0==48||LA50_0==50||(LA50_0>=53 && LA50_0<=55)||LA50_0==58||(LA50_0>=60 && LA50_0<=67)) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3205:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7463);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3215:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7490);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3231:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3232:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3233:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7525);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7535); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3240:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3243:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3244:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3244:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3244:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3244:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3245:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3250:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==56) ) {
                alt51=1;
            }
            else if ( (LA51_0==57) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3250:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3250:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3251:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3251:1: (lv_writeable_1_0= 'var' )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3252:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,56,FOLLOW_56_in_ruleXVariableDeclaration7588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3266:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleXVariableDeclaration7619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred20_InternalEntityWithExprDsl()) ) {
                    alt52=1;
                }
                else if ( (true) ) {
                    alt52=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA52_0==19) && (synpred20_InternalEntityWithExprDsl())) {
                alt52=1;
            }
            else if ( (LA52_0==70) && (synpred20_InternalEntityWithExprDsl())) {
                alt52=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3278:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3278:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3278:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3279:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3279:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3280:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7667);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3296:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3297:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3297:1: (lv_name_4_0= ruleValidID )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3298:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7688);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3315:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3315:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3316:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3316:1: (lv_name_5_0= ruleValidID )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3317:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7717);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3333:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==22) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3333:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleXVariableDeclaration7731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3337:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3338:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3338:1: (lv_right_7_0= ruleXExpression )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3339:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7752);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3363:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3364:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3365:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7790);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7800); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3372:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3375:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3376:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3376:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3376:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3376:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID||LA54_1==15||LA54_1==32||LA54_1==44) ) {
                    alt54=1;
                }
            }
            else if ( (LA54_0==19||LA54_0==70) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3377:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3377:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3378:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7846);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3394:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3395:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3395:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3396:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7868);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3420:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3421:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3422:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7904);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7914); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3429:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3432:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3433:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3433:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3433:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3433:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3434:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3434:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3435:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7960);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3451:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3452:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3452:1: (lv_name_1_0= ruleValidID )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3453:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7981);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3477:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3478:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3479:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8017);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8027); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3486:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3489:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3490:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3490:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3490:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3490:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3491:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3496:2: ( ( ruleStaticQualifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==59) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3497:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3497:1: ( ruleStaticQualifier )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3498:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8084);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3511:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==32) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3511:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleXFeatureCall8098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3515:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3516:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3516:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3517:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8119);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3533:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==20) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3533:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8132); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3537:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3538:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3538:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3539:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8153);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXFeatureCall8167); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3559:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3560:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3560:1: ( ruleIdOrSuper )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3561:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8192);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3574:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3574:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3574:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3574:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3581:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3582:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,19,FOLLOW_19_in_ruleXFeatureCall8226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt59=3;
                    alt59 = dfa59.predict(input);
                    switch (alt59) {
                        case 1 :
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3612:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3613:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8311);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3630:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3630:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3630:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3630:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3631:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3631:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3632:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8339);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3648:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop58:
                            do {
                                int alt58=2;
                                int LA58_0 = input.LA(1);

                                if ( (LA58_0==20) ) {
                                    alt58=1;
                                }


                                switch (alt58) {
                            	case 1 :
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3648:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXFeatureCall8352); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3652:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3653:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3653:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3654:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8373);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop58;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXFeatureCall8390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3674:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3674:4: ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3679:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3680:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8423);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3704:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3705:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3706:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8461);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8472); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3713:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3716:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3717:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3717:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID) ) {
                alt62=1;
            }
            else if ( (LA62_0==58) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3718:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8519);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3730:2: kw= 'super'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleIdOrSuper8543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3743:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3744:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3745:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8584);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8595); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3752:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3755:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3756:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3756:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    int LA63_2 = input.LA(2);

                    if ( (LA63_2==59) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3757:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8642);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,59,FOLLOW_59_in_ruleStaticQualifier8660); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3781:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3782:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3783:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8701);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8711); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3790:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3793:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3794:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3794:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3794:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3794:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3795:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXConstructorCall8757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3804:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3805:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3805:1: ( ruleQualifiedName )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3806:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8780);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3819:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==32) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3819:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleXConstructorCall8793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3823:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3824:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3824:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3825:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8814);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3841:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==20) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3841:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall8827); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3845:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3846:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3846:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3847:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8848);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleXConstructorCall8862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleXConstructorCall8876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt67=3;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3888:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3889:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8948);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3906:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3906:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3906:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3906:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3907:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3907:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3908:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall8976);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3924:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==20) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3924:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleXConstructorCall8989); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3928:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3929:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3929:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3930:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9010);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleXConstructorCall9027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3950:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3950:2: ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3955:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3956:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9058);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3980:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3981:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3982:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9095);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9105); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3989:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3992:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3993:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3993:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3993:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3993:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3994:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3999:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==61) ) {
                alt69=1;
            }
            else if ( (LA69_0==62) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3999:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXBooleanLiteral9152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4004:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4004:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4005:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4005:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4006:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,62,FOLLOW_62_in_ruleXBooleanLiteral9176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4027:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4028:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4029:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9226);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9236); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4036:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4039:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4040:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4040:1: ( () otherlv_1= 'null' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4040:2: () otherlv_1= 'null'
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4040:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4041:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXNullLiteral9282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4058:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4059:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4060:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9318);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral9328); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4067:1: ruleXIntLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4070:28: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4071:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4071:1: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4071:2: () ( (lv_value_1_0= RULE_INT ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4071:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4072:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4077:2: ( (lv_value_1_0= RULE_INT ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4078:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4078:1: (lv_value_1_0= RULE_INT )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4079:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral9379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXIntLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"INT");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4103:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4104:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4105:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9420);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9430); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4112:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4115:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4116:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4116:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4116:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4116:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4117:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4122:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4123:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4123:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4124:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4148:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4149:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4150:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9522);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9532); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4157:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4160:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4161:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4161:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4161:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4161:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4162:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleXTypeLiteral9578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleXTypeLiteral9590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4175:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4176:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4176:1: ( ruleQualifiedName )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4177:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9613);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXTypeLiteral9625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4202:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4203:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4204:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9661);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9671); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4211:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4214:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4215:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4215:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4215:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4215:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4216:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleXThrowExpression9717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4225:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4226:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4226:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4227:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9738);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4251:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4252:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4253:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9774);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9784); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4260:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4263:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4264:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4264:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4264:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4264:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4265:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXReturnExpression9830); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4274:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4274:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4279:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4280:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9861);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4304:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4305:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4306:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9898);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9908); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4313:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4316:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4317:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4317:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4317:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4317:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4318:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXTryCatchFinallyExpression9954); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4327:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4328:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4328:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4329:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9975);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4345:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==69) ) {
                alt73=1;
            }
            else if ( (LA73_0==68) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4345:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4345:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4345:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4345:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt71=0;
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==69) ) {
                            int LA71_2 = input.LA(2);

                            if ( (synpred27_InternalEntityWithExprDsl()) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4345:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4347:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4348:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10005);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt71 >= 1 ) break loop71;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(71, input);
                                throw eee;
                        }
                        cnt71++;
                    } while (true);

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4364:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==68) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred28_InternalEntityWithExprDsl()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4364:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4364:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4364:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression10027); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4369:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4370:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4370:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4371:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10049);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4388:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4388:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4388:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleXTryCatchFinallyExpression10071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4392:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4393:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4393:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4394:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10092);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4418:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4419:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4420:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10130);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10140); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4427:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4430:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4431:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4431:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4431:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4431:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4431:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleXCatchClause10185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleXCatchClause10198); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4440:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4441:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4441:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4442:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10219);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleXCatchClause10231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4462:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4463:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4463:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4464:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10252);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4488:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4489:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4490:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10289);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10300); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4497:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4500:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4501:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4501:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4502:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10347);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4512:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==15) ) {
                    int LA74_1 = input.LA(2);

                    if ( (LA74_1==RULE_ID) ) {
                        int LA74_3 = input.LA(3);

                        if ( (synpred30_InternalEntityWithExprDsl()) ) {
                            alt74=1;
                        }


                    }


                }


                switch (alt74) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4512:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4512:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4512:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedName10375); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10398);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4539:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4540:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4541:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10445);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10455); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4548:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4551:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4552:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4552:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==19||LA76_0==70) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4552:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4552:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4553:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10503);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4561:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==44) ) {
                            int LA75_2 = input.LA(2);

                            if ( (LA75_2==46) ) {
                                int LA75_3 = input.LA(3);

                                if ( (synpred31_InternalEntityWithExprDsl()) ) {
                                    alt75=1;
                                }


                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4561:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4564:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4564:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4564:6: ()
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4565:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleJvmTypeReference10541); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleJvmTypeReference10553); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4580:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10585);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4596:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4597:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4598:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10620);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10630); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4605:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4608:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4609:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4609:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4609:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4609:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==19) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4609:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXFunctionTypeRef10668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4613:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==RULE_ID||LA78_0==19||LA78_0==70) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4613:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4613:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4614:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4614:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4615:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10690);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4631:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop77:
                            do {
                                int alt77=2;
                                int LA77_0 = input.LA(1);

                                if ( (LA77_0==20) ) {
                                    alt77=1;
                                }


                                switch (alt77) {
                            	case 1 :
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4631:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXFunctionTypeRef10703); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4635:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4636:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4636:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4637:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10724);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop77;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXFunctionTypeRef10740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleXFunctionTypeRef10754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4661:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4662:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4662:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4663:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10775);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4687:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4688:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4689:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10811);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10821); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4696:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4699:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4700:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4700:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4700:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4700:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4701:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4701:1: ( ruleQualifiedName )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4702:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10869);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4715:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4715:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4715:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4715:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleJvmParameterizedTypeReference10890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4720:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4721:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4721:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4722:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10912);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4738:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==20) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4738:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleJvmParameterizedTypeReference10925); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4742:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4743:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4743:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4744:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10946);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleJvmParameterizedTypeReference10960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4772:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4773:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4774:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10998);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11008); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4781:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4784:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4785:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4785:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID||LA82_0==19||LA82_0==70) ) {
                alt82=1;
            }
            else if ( (LA82_0==71) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4786:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11055);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4796:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11082);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4812:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4813:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4814:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11117);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11127); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4821:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4824:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4825:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4825:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4825:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4825:2: ()
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4826:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleJvmWildcardTypeReference11173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4835:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==72) ) {
                alt83=1;
            }
            else if ( (LA83_0==58) ) {
                alt83=2;
            }
            switch (alt83) {
                case 1 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4835:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4835:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4836:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4836:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4837:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11195);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4854:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4854:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4855:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4855:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4856:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11222);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4880:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4881:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4882:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11260);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11270); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4889:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4892:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4893:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4893:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4893:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleJvmUpperBound11307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4897:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4898:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4898:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4899:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11328);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4923:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4924:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4925:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11364);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11374); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4932:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4935:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4936:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4936:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4936:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleJvmUpperBoundAnded11411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4940:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4941:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4941:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4942:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11432);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4966:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4967:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4968:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11468);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11478); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4975:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4978:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4979:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4979:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4979:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleJvmLowerBound11515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4983:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4984:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4984:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4985:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11536);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:5011:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:5012:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:5013:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11575);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11586); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:5020:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:5023:28: (this_ID_0= RULE_ID )
            // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:5024:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalEntityWithExprDsl
    public final void synpred1_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:612:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:613:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:613:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:614:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:614:1: ( ruleOpMultiAssign )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:615:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalEntityWithExprDsl1248);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalEntityWithExprDsl

    // $ANTLR start synpred2_InternalEntityWithExprDsl
    public final void synpred2_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:740:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:741:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:741:2: ( ( ruleOpOr ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:742:1: ( ruleOpOr )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:742:1: ( ruleOpOr )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:743:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalEntityWithExprDsl1596);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEntityWithExprDsl

    // $ANTLR start synpred3_InternalEntityWithExprDsl
    public final void synpred3_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:841:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:842:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:842:2: ( ( ruleOpAnd ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:843:1: ( ruleOpAnd )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:843:1: ( ruleOpAnd )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:844:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalEntityWithExprDsl1855);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalEntityWithExprDsl

    // $ANTLR start synpred4_InternalEntityWithExprDsl
    public final void synpred4_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:942:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:943:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:943:2: ( ( ruleOpEquality ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:944:1: ( ruleOpEquality )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:944:1: ( ruleOpEquality )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:945:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalEntityWithExprDsl2114);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalEntityWithExprDsl

    // $ANTLR start synpred5_InternalEntityWithExprDsl
    public final void synpred5_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:4: ( ( () 'instanceof' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:5: ( () 'instanceof' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:5: ( () 'instanceof' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:6: () 'instanceof'
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1050:6: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1051:1: 
        {
        }

        match(input,28,FOLLOW_28_in_synpred5_InternalEntityWithExprDsl2390); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalEntityWithExprDsl

    // $ANTLR start synpred6_InternalEntityWithExprDsl
    public final void synpred6_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1078:10: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1079:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1079:2: ( ( ruleOpCompare ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1080:1: ( ruleOpCompare )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1080:1: ( ruleOpCompare )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1081:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalEntityWithExprDsl2463);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalEntityWithExprDsl

    // $ANTLR start synpred7_InternalEntityWithExprDsl
    public final void synpred7_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1200:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1201:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1201:2: ( ( ruleOpOther ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1202:1: ( ruleOpOther )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1202:1: ( ruleOpOther )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1203:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalEntityWithExprDsl2782);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalEntityWithExprDsl

    // $ANTLR start synpred8_InternalEntityWithExprDsl
    public final void synpred8_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1308:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1309:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1309:2: ( ( ruleOpAdd ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1310:1: ( ruleOpAdd )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1310:1: ( ruleOpAdd )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1311:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred8_InternalEntityWithExprDsl3062);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalEntityWithExprDsl

    // $ANTLR start synpred9_InternalEntityWithExprDsl
    public final void synpred9_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1416:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1417:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1417:2: ( ( ruleOpMulti ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1418:1: ( ruleOpMulti )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1418:1: ( ruleOpMulti )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1419:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred9_InternalEntityWithExprDsl3342);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalEntityWithExprDsl

    // $ANTLR start synpred10_InternalEntityWithExprDsl
    public final void synpred10_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:3: ( ( () 'as' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:4: ( () 'as' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:4: ( () 'as' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:5: () 'as'
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1649:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1650:1: 
        {
        }

        match(input,41,FOLLOW_41_in_synpred10_InternalEntityWithExprDsl3936); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalEntityWithExprDsl

    // $ANTLR start synpred11_InternalEntityWithExprDsl
    public final void synpred11_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1709:6: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1710:1: 
        {
        }

        match(input,15,FOLLOW_15_in_synpred11_InternalEntityWithExprDsl4090); if (state.failed) return ;
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1711:1: ( ( ruleValidID ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1712:1: ( ruleValidID )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1712:1: ( ruleValidID )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1713:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred11_InternalEntityWithExprDsl4099);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred11_InternalEntityWithExprDsl4105);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalEntityWithExprDsl

    // $ANTLR start synpred12_InternalEntityWithExprDsl
    public final void synpred12_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1767:10: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1768:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1768:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt84=3;
        switch ( input.LA(1) ) {
        case 15:
            {
            alt84=1;
            }
            break;
        case 42:
            {
            alt84=2;
            }
            break;
        case 43:
            {
            alt84=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 84, 0, input);

            throw nvae;
        }

        switch (alt84) {
            case 1 :
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1768:4: '.'
                {
                match(input,15,FOLLOW_15_in_synpred12_InternalEntityWithExprDsl4208); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1770:6: ( ( '?.' ) )
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1770:6: ( ( '?.' ) )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1771:1: ( '?.' )
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1771:1: ( '?.' )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1772:2: '?.'
                {
                match(input,42,FOLLOW_42_in_synpred12_InternalEntityWithExprDsl4222); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1777:6: ( ( '*.' ) )
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1777:6: ( ( '*.' ) )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1778:1: ( '*.' )
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1778:1: ( '*.' )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1779:2: '*.'
                {
                match(input,43,FOLLOW_43_in_synpred12_InternalEntityWithExprDsl4242); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalEntityWithExprDsl

    // $ANTLR start synpred13_InternalEntityWithExprDsl
    public final void synpred13_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1888:4: ( ( '(' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1889:1: ( '(' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1889:1: ( '(' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1890:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred13_InternalEntityWithExprDsl4469); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalEntityWithExprDsl

    // $ANTLR start synpred14_InternalEntityWithExprDsl
    public final void synpred14_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1909:6: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1910:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1910:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID||LA86_0==19||LA86_0==70) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1910:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1910:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1911:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1911:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1912:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalEntityWithExprDsl4521);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1914:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==20) ) {
                        alt85=1;
                    }


                    switch (alt85) {
                	case 1 :
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1914:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred14_InternalEntityWithExprDsl4528); if (state.failed) return ;
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1915:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1916:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1916:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1917:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalEntityWithExprDsl4535);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop85;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1919:6: ( ( '|' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1920:1: ( '|' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1920:1: ( '|' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1921:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred14_InternalEntityWithExprDsl4549); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalEntityWithExprDsl

    // $ANTLR start synpred15_InternalEntityWithExprDsl
    public final void synpred15_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1988:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1989:1: ( ruleXClosure )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1989:1: ( ruleXClosure )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:1990:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred15_InternalEntityWithExprDsl4667);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalEntityWithExprDsl

    // $ANTLR start synpred16_InternalEntityWithExprDsl
    public final void synpred16_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:2: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:3: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:4: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==RULE_ID||LA88_0==19||LA88_0==70) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:5: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2271:5: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2272:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2272:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2273:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEntityWithExprDsl5440);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2275:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==20) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2275:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred16_InternalEntityWithExprDsl5447); if (state.failed) return ;
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2276:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2277:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2277:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2278:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEntityWithExprDsl5454);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2280:6: ( ( '|' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2281:1: ( '|' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2281:1: ( '|' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2282:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred16_InternalEntityWithExprDsl5468); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalEntityWithExprDsl

    // $ANTLR start synpred18_InternalEntityWithExprDsl
    public final void synpred18_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2641:4: ( 'else' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2641:6: 'else'
        {
        match(input,49,FOLLOW_49_in_synpred18_InternalEntityWithExprDsl6251); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalEntityWithExprDsl

    // $ANTLR start synpred19_InternalEntityWithExprDsl
    public final void synpred19_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2695:2: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2695:3: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2695:3: ( ( ( ruleValidID ) ) ':' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2695:4: ( ( ruleValidID ) ) ':'
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2695:4: ( ( ruleValidID ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2696:1: ( ruleValidID )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2696:1: ( ruleValidID )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:2697:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred19_InternalEntityWithExprDsl6391);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,18,FOLLOW_18_in_synpred19_InternalEntityWithExprDsl6397); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalEntityWithExprDsl

    // $ANTLR start synpred20_InternalEntityWithExprDsl
    public final void synpred20_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3270:6: ( ( ruleJvmTypeReference ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3271:1: ( ruleJvmTypeReference )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3271:1: ( ruleJvmTypeReference )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3272:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred20_InternalEntityWithExprDsl7637);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3274:2: ( ( ruleValidID ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3275:1: ( ruleValidID )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3275:1: ( ruleValidID )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3276:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred20_InternalEntityWithExprDsl7646);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalEntityWithExprDsl

    // $ANTLR start synpred21_InternalEntityWithExprDsl
    public final void synpred21_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3574:4: ( ( '(' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3575:1: ( '(' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3575:1: ( '(' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3576:2: '('
        {
        match(input,19,FOLLOW_19_in_synpred21_InternalEntityWithExprDsl8208); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalEntityWithExprDsl

    // $ANTLR start synpred22_InternalEntityWithExprDsl
    public final void synpred22_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3595:6: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3596:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3596:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==19||LA92_0==70) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3596:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3596:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3597:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3597:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3598:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalEntityWithExprDsl8260);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3600:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==20) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3600:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred22_InternalEntityWithExprDsl8267); if (state.failed) return ;
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3601:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3602:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3602:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3603:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalEntityWithExprDsl8274);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3605:6: ( ( '|' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3606:1: ( '|' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3606:1: ( '|' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3607:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred22_InternalEntityWithExprDsl8288); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalEntityWithExprDsl

    // $ANTLR start synpred23_InternalEntityWithExprDsl
    public final void synpred23_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3674:4: ( ( ruleXClosure ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3675:1: ( ruleXClosure )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3675:1: ( ruleXClosure )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3676:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred23_InternalEntityWithExprDsl8406);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalEntityWithExprDsl

    // $ANTLR start synpred24_InternalEntityWithExprDsl
    public final void synpred24_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3871:5: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3872:1: 
        {
        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3872:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==19||LA94_0==70) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3872:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3872:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3873:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3873:1: ( ruleJvmFormalParameter )
                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3874:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalEntityWithExprDsl8897);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3876:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==20) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3876:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,20,FOLLOW_20_in_synpred24_InternalEntityWithExprDsl8904); if (state.failed) return ;
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3877:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3878:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3878:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3879:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalEntityWithExprDsl8911);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3881:6: ( ( '|' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3882:1: ( '|' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3882:1: ( '|' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3883:2: '|'
        {
        match(input,45,FOLLOW_45_in_synpred24_InternalEntityWithExprDsl8925); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalEntityWithExprDsl

    // $ANTLR start synpred25_InternalEntityWithExprDsl
    public final void synpred25_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3950:2: ( ( ruleXClosure ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3951:1: ( ruleXClosure )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3951:1: ( ruleXClosure )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:3952:1: ruleXClosure
        {
        pushFollow(FOLLOW_ruleXClosure_in_synpred25_InternalEntityWithExprDsl9041);
        ruleXClosure();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred25_InternalEntityWithExprDsl

    // $ANTLR start synpred26_InternalEntityWithExprDsl
    public final void synpred26_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4274:2: ( ( ruleXExpression ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4275:1: ( ruleXExpression )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4275:1: ( ruleXExpression )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4276:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred26_InternalEntityWithExprDsl9844);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalEntityWithExprDsl

    // $ANTLR start synpred27_InternalEntityWithExprDsl
    public final void synpred27_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4345:5: ( 'catch' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4345:7: 'catch'
        {
        match(input,69,FOLLOW_69_in_synpred27_InternalEntityWithExprDsl9989); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalEntityWithExprDsl

    // $ANTLR start synpred28_InternalEntityWithExprDsl
    public final void synpred28_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4364:5: ( 'finally' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4364:7: 'finally'
        {
        match(input,68,FOLLOW_68_in_synpred28_InternalEntityWithExprDsl10019); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalEntityWithExprDsl

    // $ANTLR start synpred30_InternalEntityWithExprDsl
    public final void synpred30_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4512:3: ( '.' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4513:2: '.'
        {
        match(input,15,FOLLOW_15_in_synpred30_InternalEntityWithExprDsl10366); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalEntityWithExprDsl

    // $ANTLR start synpred31_InternalEntityWithExprDsl
    public final void synpred31_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4561:2: ( ( () '[' ']' ) )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4561:3: ( () '[' ']' )
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4561:3: ( () '[' ']' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4561:4: () '[' ']'
        {
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4561:4: ()
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4562:1: 
        {
        }

        match(input,44,FOLLOW_44_in_synpred31_InternalEntityWithExprDsl10518); if (state.failed) return ;
        match(input,46,FOLLOW_46_in_synpred31_InternalEntityWithExprDsl10522); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalEntityWithExprDsl

    // $ANTLR start synpred32_InternalEntityWithExprDsl
    public final void synpred32_InternalEntityWithExprDsl_fragment() throws RecognitionException {   
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4715:4: ( '<' )
        // ../org.xtext.example.lmrc.entityexpr/src-gen/org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.g:4715:6: '<'
        {
        match(input,32,FOLLOW_32_in_synpred32_InternalEntityWithExprDsl10882); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalEntityWithExprDsl

    // Delegated rules

    public final boolean synpred20_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalEntityWithExprDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalEntityWithExprDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA30_eotS =
        "\74\uffff";
    static final String DFA30_eofS =
        "\1\2\73\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA30_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA30_transitionS = {
            "\3\2\5\uffff\2\2\1\uffff\2\2\1\uffff\1\2\1\1\2\2\1\uffff\26"+
            "\2\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1888:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\34\uffff";
    static final String DFA29_eofS =
        "\34\uffff";
    static final String DFA29_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA29_maxS =
        "\1\106\2\0\31\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\2\5\5\uffff\1\5\6\uffff\1\2\1\uffff\1\33\12\uffff\1\5"+
            "\2\uffff\2\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1909:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==RULE_ID) ) {s = 1;}

                        else if ( (LA29_0==19) ) {s = 2;}

                        else if ( (LA29_0==70) && (synpred14_InternalEntityWithExprDsl())) {s = 3;}

                        else if ( (LA29_0==45) && (synpred14_InternalEntityWithExprDsl())) {s = 4;}

                        else if ( ((LA29_0>=RULE_INT && LA29_0<=RULE_STRING)||LA29_0==12||LA29_0==32||(LA29_0>=35 && LA29_0<=36)||LA29_0==40||LA29_0==44||LA29_0==48||LA29_0==50||(LA29_0>=53 && LA29_0<=55)||LA29_0==58||(LA29_0>=60 && LA29_0<=67)) ) {s = 5;}

                        else if ( (LA29_0==21) ) {s = 27;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalEntityWithExprDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalEntityWithExprDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\74\uffff";
    static final String DFA31_eofS =
        "\1\2\73\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA31_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\2\5\uffff\2\2\1\uffff\2\2\1\uffff\4\2\1\uffff\25\2\1\1\1"+
            "\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1988:3: ( ( ( ruleXClosure ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\36\uffff";
    static final String DFA37_eofS =
        "\36\uffff";
    static final String DFA37_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA37_maxS =
        "\1\106\2\0\33\uffff";
    static final String DFA37_acceptS =
        "\3\uffff\2\1\1\2\30\uffff";
    static final String DFA37_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\2\5\5\uffff\1\5\6\uffff\1\2\14\uffff\1\5\2\uffff\2\5\3"+
            "\uffff\1\5\3\uffff\1\5\1\4\1\5\1\uffff\1\5\1\uffff\1\5\2\uffff"+
            "\6\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2271:1: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_0==RULE_ID) ) {s = 1;}

                        else if ( (LA37_0==19) ) {s = 2;}

                        else if ( (LA37_0==70) && (synpred16_InternalEntityWithExprDsl())) {s = 3;}

                        else if ( (LA37_0==45) && (synpred16_InternalEntityWithExprDsl())) {s = 4;}

                        else if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_STRING)||LA37_0==12||LA37_0==32||(LA37_0>=35 && LA37_0<=36)||LA37_0==40||LA37_0==44||LA37_0==46||LA37_0==48||LA37_0==50||(LA37_0>=53 && LA37_0<=58)||(LA37_0>=60 && LA37_0<=67)) ) {s = 5;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEntityWithExprDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEntityWithExprDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\74\uffff";
    static final String DFA60_eofS =
        "\1\2\73\uffff";
    static final String DFA60_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA60_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA60_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA60_transitionS = {
            "\3\2\5\uffff\2\2\1\uffff\2\2\1\uffff\1\2\1\1\2\2\1\uffff\26"+
            "\2\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3574:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA59_eotS =
        "\34\uffff";
    static final String DFA59_eofS =
        "\34\uffff";
    static final String DFA59_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA59_maxS =
        "\1\106\2\0\31\uffff";
    static final String DFA59_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA59_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\1\2\5\5\uffff\1\5\6\uffff\1\2\1\uffff\1\33\12\uffff\1\5"+
            "\2\uffff\2\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "3595:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_0 = input.LA(1);

                         
                        int index59_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA59_0==RULE_ID) ) {s = 1;}

                        else if ( (LA59_0==19) ) {s = 2;}

                        else if ( (LA59_0==70) && (synpred22_InternalEntityWithExprDsl())) {s = 3;}

                        else if ( (LA59_0==45) && (synpred22_InternalEntityWithExprDsl())) {s = 4;}

                        else if ( ((LA59_0>=RULE_INT && LA59_0<=RULE_STRING)||LA59_0==12||LA59_0==32||(LA59_0>=35 && LA59_0<=36)||LA59_0==40||LA59_0==44||LA59_0==48||LA59_0==50||(LA59_0>=53 && LA59_0<=55)||LA59_0==58||(LA59_0>=60 && LA59_0<=67)) ) {s = 5;}

                        else if ( (LA59_0==21) ) {s = 27;}

                         
                        input.seek(index59_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEntityWithExprDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEntityWithExprDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\74\uffff";
    static final String DFA61_eofS =
        "\1\2\73\uffff";
    static final String DFA61_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA61_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA61_transitionS = {
            "\3\2\5\uffff\2\2\1\uffff\2\2\1\uffff\4\2\1\uffff\25\2\1\1\1"+
            "\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3674:3: ( ( ( ruleXClosure ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\34\uffff";
    static final String DFA67_eofS =
        "\34\uffff";
    static final String DFA67_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA67_maxS =
        "\1\106\2\0\31\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA67_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\2\5\5\uffff\1\5\6\uffff\1\2\1\uffff\1\33\12\uffff\1\5"+
            "\2\uffff\2\5\3\uffff\1\5\3\uffff\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\2\uffff\3\5\2\uffff\1\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3871:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==RULE_ID) ) {s = 1;}

                        else if ( (LA67_0==19) ) {s = 2;}

                        else if ( (LA67_0==70) && (synpred24_InternalEntityWithExprDsl())) {s = 3;}

                        else if ( (LA67_0==45) && (synpred24_InternalEntityWithExprDsl())) {s = 4;}

                        else if ( ((LA67_0>=RULE_INT && LA67_0<=RULE_STRING)||LA67_0==12||LA67_0==32||(LA67_0>=35 && LA67_0<=36)||LA67_0==40||LA67_0==44||LA67_0==48||LA67_0==50||(LA67_0>=53 && LA67_0<=55)||LA67_0==58||(LA67_0>=60 && LA67_0<=67)) ) {s = 5;}

                        else if ( (LA67_0==21) ) {s = 27;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_1 = input.LA(1);

                         
                        int index67_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalEntityWithExprDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_2 = input.LA(1);

                         
                        int index67_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalEntityWithExprDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index67_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\74\uffff";
    static final String DFA68_eofS =
        "\1\2\73\uffff";
    static final String DFA68_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA68_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA68_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA68_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA68_transitionS = {
            "\3\2\5\uffff\2\2\1\uffff\2\2\1\uffff\4\2\1\uffff\25\2\1\1\1"+
            "\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3950:1: ( ( ( ruleXClosure ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\74\uffff";
    static final String DFA70_eofS =
        "\1\31\73\uffff";
    static final String DFA70_minS =
        "\1\4\30\0\43\uffff";
    static final String DFA70_maxS =
        "\1\106\30\0\43\uffff";
    static final String DFA70_acceptS =
        "\31\uffff\1\2\41\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\43\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\15\1\17\5\uffff\1\6\1\31\1\uffff\2\31\1\uffff\1\31\1"+
            "\30\2\31\1\uffff\11\31\1\10\2\31\1\4\1\3\3\31\1\2\3\31\1\12"+
            "\1\uffff\2\31\1\21\1\31\1\7\2\31\1\22\1\23\1\24\2\31\1\11\1"+
            "\uffff\1\5\1\13\1\14\1\16\1\20\1\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "4274:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_3 = input.LA(1);

                         
                        int index70_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA70_4 = input.LA(1);

                         
                        int index70_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA70_5 = input.LA(1);

                         
                        int index70_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA70_8 = input.LA(1);

                         
                        int index70_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA70_9 = input.LA(1);

                         
                        int index70_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA70_11 = input.LA(1);

                         
                        int index70_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA70_12 = input.LA(1);

                         
                        int index70_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA70_13 = input.LA(1);

                         
                        int index70_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA70_14 = input.LA(1);

                         
                        int index70_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA70_15 = input.LA(1);

                         
                        int index70_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA70_16 = input.LA(1);

                         
                        int index70_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA70_17 = input.LA(1);

                         
                        int index70_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA70_18 = input.LA(1);

                         
                        int index70_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA70_19 = input.LA(1);

                         
                        int index70_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA70_20 = input.LA(1);

                         
                        int index70_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA70_21 = input.LA(1);

                         
                        int index70_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA70_22 = input.LA(1);

                         
                        int index70_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA70_23 = input.LA(1);

                         
                        int index70_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA70_24 = input.LA(1);

                         
                        int index70_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index70_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA81_eotS =
        "\74\uffff";
    static final String DFA81_eofS =
        "\1\2\73\uffff";
    static final String DFA81_minS =
        "\1\4\1\0\72\uffff";
    static final String DFA81_maxS =
        "\1\106\1\0\72\uffff";
    static final String DFA81_acceptS =
        "\2\uffff\1\2\70\uffff\1\1";
    static final String DFA81_specialS =
        "\1\uffff\1\0\72\uffff}>";
    static final String[] DFA81_transitionS = {
            "\3\2\5\uffff\2\2\1\uffff\2\2\1\uffff\4\2\1\uffff\11\2\1\1\14"+
            "\2\1\uffff\15\2\1\uffff\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "4715:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalEntityWithExprDsl()) ) {s = 59;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModule131 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11_in_ruleModule144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModule178 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleModule199 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleModule212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard411 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildCard430 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleQualifiedNameWithWildCard443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEntity532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity549 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity566 = new BitSet(new long[]{0x0000000000082010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity587 = new BitSet(new long[]{0x0000000000082010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleEntity609 = new BitSet(new long[]{0x0000000000082010L,0x0000000000000040L});
    public static final BitSet FOLLOW_13_in_ruleEntity622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute710 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttribute727 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleAttribute748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleOperation840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation857 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOperation874 = new BitSet(new long[]{0x0000000000280010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation896 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleOperation909 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleOperation930 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleOperation946 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleOperation967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment1161 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1177 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1227 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1280 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpSingleAssign1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpMultiAssign1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1575 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1628 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1651 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpOr1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1834 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1887 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1910 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpAnd1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression2036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2093 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2146 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2169 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpEquality2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpEquality2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2373 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_28_in_ruleXRelationalExpression2409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2434 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2495 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2518 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpCompare2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpCompare2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpCompare2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpCompare2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2761 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2814 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2837 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3041 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3094 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3117 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAdd3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3321 = new BitSet(new long[]{0x000000E000010002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3374 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3397 = new BitSet(new long[]{0x000000E000010002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpMulti3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3650 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpUnary3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3920 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleXCastedExpression3955 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3978 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall4016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall4073 = new BitSet(new long[]{0x00000C0000008002L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall4122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4145 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4161 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4183 = new BitSet(new long[]{0x00000C0000008002L});
    public static final BitSet FOLLOW_15_in_ruleXMemberFeatureCall4269 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_42_in_ruleXMemberFeatureCall4293 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4330 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_32_in_ruleXMemberFeatureCall4359 = new BitSet(new long[]{0x0000000000080010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4380 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4393 = new BitSet(new long[]{0x0000000000080010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4414 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_ruleXMemberFeatureCall4428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4453 = new BitSet(new long[]{0x00001C0000088002L});
    public static final BitSet FOLLOW_19_in_ruleXMemberFeatureCall4487 = new BitSet(new long[]{0xF4E5311900281070L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4572 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4600 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXMemberFeatureCall4613 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4634 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXMemberFeatureCall4651 = new BitSet(new long[]{0x00001C0000008002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4684 = new BitSet(new long[]{0x00000C0000008002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5423 = new BitSet(new long[]{0xF7E5711900081070L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5494 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_20_in_ruleXClosure5507 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5528 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_45_in_ruleXClosure5550 = new BitSet(new long[]{0xF7E5511900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5587 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5701 = new BitSet(new long[]{0xF7E5911900081072L,0x000000000000000FL});
    public static final BitSet FOLLOW_47_in_ruleXExpressionInClosure5714 = new BitSet(new long[]{0xF7E5111900081072L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5872 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_20_in_ruleXShortClosure5885 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5906 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_45_in_ruleXShortClosure5928 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression6000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXParenthesizedExpression6047 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression6069 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXParenthesizedExpression6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6116 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6172 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXIfExpression6184 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6205 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXIfExpression6217 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6238 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXIfExpression6259 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXSwitchExpression6375 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6416 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression6428 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6452 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleXSwitchExpression6464 = new BitSet(new long[]{0x00100000000C0010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6485 = new BitSet(new long[]{0x00180000000C2010L,0x0000000000000040L});
    public static final BitSet FOLLOW_51_in_ruleXSwitchExpression6499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXSwitchExpression6511 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6532 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXSwitchExpression6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6638 = new BitSet(new long[]{0x0010000000040000L});
    public static final BitSet FOLLOW_52_in_ruleXCasePart6652 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6673 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXCasePart6687 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXForLoopExpression6800 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXForLoopExpression6812 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6833 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXForLoopExpression6845 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6866 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXForLoopExpression6878 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXWhileExpression6991 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXWhileExpression7003 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7024 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXWhileExpression7036 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXDoWhileExpression7149 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7170 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleXDoWhileExpression7182 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXDoWhileExpression7194 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7215 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXDoWhileExpression7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleXBlockExpression7319 = new BitSet(new long[]{0xF7E5111900083070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7341 = new BitSet(new long[]{0xF7E5911900083070L,0x000000000000000FL});
    public static final BitSet FOLLOW_47_in_ruleXBlockExpression7354 = new BitSet(new long[]{0xF7E5111900083070L,0x000000000000000FL});
    public static final BitSet FOLLOW_13_in_ruleXBlockExpression7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXVariableDeclaration7588 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_57_in_ruleXVariableDeclaration7619 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7688 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7717 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleXVariableDeclaration7731 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter7981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8084 = new BitSet(new long[]{0x0400000100000010L});
    public static final BitSet FOLLOW_32_in_ruleXFeatureCall8098 = new BitSet(new long[]{0x0000000000080010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8119 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8132 = new BitSet(new long[]{0x0000000000080010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8153 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_ruleXFeatureCall8167 = new BitSet(new long[]{0x0400000100000010L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8192 = new BitSet(new long[]{0x0000100000080002L});
    public static final BitSet FOLLOW_19_in_ruleXFeatureCall8226 = new BitSet(new long[]{0xF4E5311900281070L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8311 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8339 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXFeatureCall8352 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8373 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXFeatureCall8390 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleIdOrSuper8543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8642 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleStaticQualifier8660 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXConstructorCall8757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8780 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_32_in_ruleXConstructorCall8793 = new BitSet(new long[]{0x0000000000080010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8814 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall8827 = new BitSet(new long[]{0x0000000000080010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8848 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_ruleXConstructorCall8862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXConstructorCall8876 = new BitSet(new long[]{0xF4E5311900281070L,0x000000000000004FL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall8948 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall8976 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXConstructorCall8989 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9010 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXConstructorCall9027 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXBooleanLiteral9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXBooleanLiteral9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXNullLiteral9282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral9318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXTypeLiteral9578 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXTypeLiteral9590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9613 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXTypeLiteral9625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXThrowExpression9717 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXReturnExpression9830 = new BitSet(new long[]{0xF4E5111900081072L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXTryCatchFinallyExpression9954 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression9975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10005 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression10027 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXTryCatchFinallyExpression10071 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXCatchClause10185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXCatchClause10198 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10219 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXCatchClause10231 = new BitSet(new long[]{0xF4E5111900081070L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10347 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedName10375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10398 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10503 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleJvmTypeReference10541 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleJvmTypeReference10553 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXFunctionTypeRef10668 = new BitSet(new long[]{0x0000000000280010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10690 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleXFunctionTypeRef10703 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10724 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleXFunctionTypeRef10740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleXFunctionTypeRef10754 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference10811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference10821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference10869 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleJvmParameterizedTypeReference10890 = new BitSet(new long[]{0x0000000000080010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10912 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_20_in_ruleJvmParameterizedTypeReference10925 = new BitSet(new long[]{0x0000000000080010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference10946 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_31_in_ruleJvmParameterizedTypeReference10960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference10998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleJvmWildcardTypeReference11173 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleJvmUpperBound11307 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleJvmUpperBoundAnded11411 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleJvmLowerBound11515 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalEntityWithExprDsl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalEntityWithExprDsl1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalEntityWithExprDsl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalEntityWithExprDsl2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred5_InternalEntityWithExprDsl2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalEntityWithExprDsl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalEntityWithExprDsl2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred8_InternalEntityWithExprDsl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred9_InternalEntityWithExprDsl3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred10_InternalEntityWithExprDsl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred11_InternalEntityWithExprDsl4090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred11_InternalEntityWithExprDsl4099 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred11_InternalEntityWithExprDsl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred12_InternalEntityWithExprDsl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalEntityWithExprDsl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred12_InternalEntityWithExprDsl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred13_InternalEntityWithExprDsl4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalEntityWithExprDsl4521 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_20_in_synpred14_InternalEntityWithExprDsl4528 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred14_InternalEntityWithExprDsl4535 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalEntityWithExprDsl4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred15_InternalEntityWithExprDsl4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEntityWithExprDsl5440 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_20_in_synpred16_InternalEntityWithExprDsl5447 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalEntityWithExprDsl5454 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_45_in_synpred16_InternalEntityWithExprDsl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred18_InternalEntityWithExprDsl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred19_InternalEntityWithExprDsl6391 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred19_InternalEntityWithExprDsl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred20_InternalEntityWithExprDsl7637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred20_InternalEntityWithExprDsl7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred21_InternalEntityWithExprDsl8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalEntityWithExprDsl8260 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_20_in_synpred22_InternalEntityWithExprDsl8267 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred22_InternalEntityWithExprDsl8274 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_45_in_synpred22_InternalEntityWithExprDsl8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred23_InternalEntityWithExprDsl8406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalEntityWithExprDsl8897 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_20_in_synpred24_InternalEntityWithExprDsl8904 = new BitSet(new long[]{0x0000000000080010L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred24_InternalEntityWithExprDsl8911 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_45_in_synpred24_InternalEntityWithExprDsl8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_synpred25_InternalEntityWithExprDsl9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred26_InternalEntityWithExprDsl9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_synpred27_InternalEntityWithExprDsl9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_synpred28_InternalEntityWithExprDsl10019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred30_InternalEntityWithExprDsl10366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred31_InternalEntityWithExprDsl10518 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_synpred31_InternalEntityWithExprDsl10522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred32_InternalEntityWithExprDsl10882 = new BitSet(new long[]{0x0000000000000002L});

}