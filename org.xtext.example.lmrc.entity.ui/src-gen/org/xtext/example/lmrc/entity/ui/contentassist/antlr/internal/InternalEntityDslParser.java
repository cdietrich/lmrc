package org.xtext.example.lmrc.entity.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.lmrc.entity.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g"; }


     
     	private EntityDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModule"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:60:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:61:1: ( ruleModule EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:62:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule61);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:69:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:73:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:74:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:74:1: ( ( rule__Module__Group__0 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:75:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:76:1: ( rule__Module__Group__0 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:76:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule94);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleEntity"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:88:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:89:1: ( ruleEntity EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:90:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity121);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:97:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:101:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:102:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:102:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:103:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:104:1: ( rule__Entity__Group__0 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:104:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity154);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:116:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:117:1: ( ruleAttribute EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:118:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute181);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:125:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:129:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:130:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:130:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:131:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:132:1: ( rule__Attribute__Group__0 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:132:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute214);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAbstractType"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:146:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:147:1: ( ruleAbstractType EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:148:1: ruleAbstractType EOF
            {
             before(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractType_in_entryRuleAbstractType243);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAbstractTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractType250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:155:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:159:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:160:1: ( ( rule__AbstractType__Alternatives ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:160:1: ( ( rule__AbstractType__Alternatives ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:161:1: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:162:1: ( rule__AbstractType__Alternatives )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:162:2: rule__AbstractType__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractType__Alternatives_in_ruleAbstractType276);
            rule__AbstractType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRuleBooleanType"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:174:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:175:1: ( ruleBooleanType EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:176:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType303);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:183:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:187:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:188:1: ( ( rule__BooleanType__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:188:1: ( ( rule__BooleanType__Group__0 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:189:1: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:190:1: ( rule__BooleanType__Group__0 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:190:2: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType336);
            rule__BooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleIntType"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:202:1: entryRuleIntType : ruleIntType EOF ;
    public final void entryRuleIntType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:203:1: ( ruleIntType EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:204:1: ruleIntType EOF
            {
             before(grammarAccess.getIntTypeRule()); 
            pushFollow(FOLLOW_ruleIntType_in_entryRuleIntType363);
            ruleIntType();

            state._fsp--;

             after(grammarAccess.getIntTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntType370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntType"


    // $ANTLR start "ruleIntType"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:211:1: ruleIntType : ( ( rule__IntType__Group__0 ) ) ;
    public final void ruleIntType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:215:2: ( ( ( rule__IntType__Group__0 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:216:1: ( ( rule__IntType__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:216:1: ( ( rule__IntType__Group__0 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:217:1: ( rule__IntType__Group__0 )
            {
             before(grammarAccess.getIntTypeAccess().getGroup()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:218:1: ( rule__IntType__Group__0 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:218:2: rule__IntType__Group__0
            {
            pushFollow(FOLLOW_rule__IntType__Group__0_in_ruleIntType396);
            rule__IntType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntType"


    // $ANTLR start "entryRuleStringType"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:230:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:231:1: ( ruleStringType EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:232:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType423);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:239:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:243:2: ( ( ( rule__StringType__Group__0 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:244:1: ( ( rule__StringType__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:244:1: ( ( rule__StringType__Group__0 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:245:1: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:246:1: ( rule__StringType__Group__0 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:246:2: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_rule__StringType__Group__0_in_ruleStringType456);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleEntityReference"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:258:1: entryRuleEntityReference : ruleEntityReference EOF ;
    public final void entryRuleEntityReference() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:259:1: ( ruleEntityReference EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:260:1: ruleEntityReference EOF
            {
             before(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference483);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityReference"


    // $ANTLR start "ruleEntityReference"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:267:1: ruleEntityReference : ( ( rule__EntityReference__RefAssignment ) ) ;
    public final void ruleEntityReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:271:2: ( ( ( rule__EntityReference__RefAssignment ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:272:1: ( ( rule__EntityReference__RefAssignment ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:272:1: ( ( rule__EntityReference__RefAssignment ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:273:1: ( rule__EntityReference__RefAssignment )
            {
             before(grammarAccess.getEntityReferenceAccess().getRefAssignment()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:274:1: ( rule__EntityReference__RefAssignment )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:274:2: rule__EntityReference__RefAssignment
            {
            pushFollow(FOLLOW_rule__EntityReference__RefAssignment_in_ruleEntityReference516);
            rule__EntityReference__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityReference"


    // $ANTLR start "entryRuleFQN"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:286:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:287:1: ( ruleFQN EOF )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:288:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN543);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:295:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:299:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:300:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:300:1: ( ( rule__FQN__Group__0 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:301:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:302:1: ( rule__FQN__Group__0 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:302:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN576);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "rule__AbstractType__Alternatives"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:315:1: rule__AbstractType__Alternatives : ( ( ruleBooleanType ) | ( ruleIntType ) | ( ruleStringType ) | ( ruleEntityReference ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:319:1: ( ( ruleBooleanType ) | ( ruleIntType ) | ( ruleStringType ) | ( ruleEntityReference ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:320:1: ( ruleBooleanType )
                    {
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:320:1: ( ruleBooleanType )
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:321:1: ruleBooleanType
                    {
                     before(grammarAccess.getAbstractTypeAccess().getBooleanTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanType_in_rule__AbstractType__Alternatives613);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getBooleanTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:326:6: ( ruleIntType )
                    {
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:326:6: ( ruleIntType )
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:327:1: ruleIntType
                    {
                     before(grammarAccess.getAbstractTypeAccess().getIntTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleIntType_in_rule__AbstractType__Alternatives630);
                    ruleIntType();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getIntTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:332:6: ( ruleStringType )
                    {
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:332:6: ( ruleStringType )
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:333:1: ruleStringType
                    {
                     before(grammarAccess.getAbstractTypeAccess().getStringTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleStringType_in_rule__AbstractType__Alternatives647);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getStringTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:338:6: ( ruleEntityReference )
                    {
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:338:6: ( ruleEntityReference )
                    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:339:1: ruleEntityReference
                    {
                     before(grammarAccess.getAbstractTypeAccess().getEntityReferenceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleEntityReference_in_rule__AbstractType__Alternatives664);
                    ruleEntityReference();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getEntityReferenceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractType__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:351:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:355:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:356:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0694);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0697);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:363:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:367:1: ( ( 'module' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:368:1: ( 'module' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:368:1: ( 'module' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:369:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Module__Group__0__Impl725); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:382:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:386:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:387:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1756);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1759);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:394:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:398:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:399:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:399:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:400:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:401:1: ( rule__Module__NameAssignment_1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:401:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl786);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:411:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:415:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:416:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2816);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2819);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:423:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:427:1: ( ( '{' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:428:1: ( '{' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:428:1: ( '{' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:429:1: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Module__Group__2__Impl847); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:442:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:446:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:447:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__3878);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__3881);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:454:1: rule__Module__Group__3__Impl : ( ( rule__Module__EntitiesAssignment_3 )* ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:458:1: ( ( ( rule__Module__EntitiesAssignment_3 )* ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:459:1: ( ( rule__Module__EntitiesAssignment_3 )* )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:459:1: ( ( rule__Module__EntitiesAssignment_3 )* )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:460:1: ( rule__Module__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getModuleAccess().getEntitiesAssignment_3()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:461:1: ( rule__Module__EntitiesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:461:2: rule__Module__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Module__EntitiesAssignment_3_in_rule__Module__Group__3__Impl908);
            	    rule__Module__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getEntitiesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:471:1: rule__Module__Group__4 : rule__Module__Group__4__Impl ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:475:1: ( rule__Module__Group__4__Impl )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:476:2: rule__Module__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__4939);
            rule__Module__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:482:1: rule__Module__Group__4__Impl : ( '}' ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:486:1: ( ( '}' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:487:1: ( '}' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:487:1: ( '}' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:488:1: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Module__Group__4__Impl967); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:511:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:515:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:516:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01008);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01011);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:523:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:527:1: ( ( 'entity' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:528:1: ( 'entity' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:528:1: ( 'entity' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:529:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__0__Impl1039); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:542:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:546:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:547:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11070);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11073);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:554:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:558:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:559:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:559:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:560:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:561:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:561:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1100);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:571:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:575:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:576:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21130);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21133);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:583:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:587:1: ( ( '{' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:588:1: ( '{' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:588:1: ( '{' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:589:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__2__Impl1161); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:602:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:606:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:607:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31192);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31195);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:614:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:618:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:619:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:619:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:620:1: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:621:1: ( rule__Entity__AttributesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:621:2: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl1222);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:631:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:635:1: ( rule__Entity__Group__4__Impl )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:636:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41253);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:642:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:646:1: ( ( '}' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:647:1: ( '}' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:647:1: ( '}' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:648:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__4__Impl1281); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:671:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:675:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:676:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01322);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01325);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:683:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:687:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:688:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:688:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:689:1: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:690:1: ( rule__Attribute__NameAssignment_0 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:690:2: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1352);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:700:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:704:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:705:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11382);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11385);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:712:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:716:1: ( ( ':' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:717:1: ( ':' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:717:1: ( ':' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:718:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Attribute__Group__1__Impl1413); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:731:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:735:1: ( rule__Attribute__Group__2__Impl )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:736:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21444);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:742:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:746:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:747:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:747:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:748:1: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:749:1: ( rule__Attribute__TypeAssignment_2 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:749:2: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl1471);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:765:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:769:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:770:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__0__Impl_in_rule__BooleanType__Group__01507);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__01510);
            rule__BooleanType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:777:1: rule__BooleanType__Group__0__Impl : ( () ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:781:1: ( ( () ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:782:1: ( () )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:782:1: ( () )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:783:1: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:784:1: ()
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:786:1: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:796:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:800:1: ( rule__BooleanType__Group__1__Impl )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:801:2: rule__BooleanType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BooleanType__Group__1__Impl_in_rule__BooleanType__Group__11568);
            rule__BooleanType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:807:1: rule__BooleanType__Group__1__Impl : ( 'boolean' ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:811:1: ( ( 'boolean' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:812:1: ( 'boolean' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:812:1: ( 'boolean' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:813:1: 'boolean'
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__BooleanType__Group__1__Impl1596); 
             after(grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1__Impl"


    // $ANTLR start "rule__IntType__Group__0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:830:1: rule__IntType__Group__0 : rule__IntType__Group__0__Impl rule__IntType__Group__1 ;
    public final void rule__IntType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:834:1: ( rule__IntType__Group__0__Impl rule__IntType__Group__1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:835:2: rule__IntType__Group__0__Impl rule__IntType__Group__1
            {
            pushFollow(FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__01631);
            rule__IntType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__01634);
            rule__IntType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__0"


    // $ANTLR start "rule__IntType__Group__0__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:842:1: rule__IntType__Group__0__Impl : ( () ) ;
    public final void rule__IntType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:846:1: ( ( () ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:847:1: ( () )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:847:1: ( () )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:848:1: ()
            {
             before(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:849:1: ()
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:851:1: 
            {
            }

             after(grammarAccess.getIntTypeAccess().getIntTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__0__Impl"


    // $ANTLR start "rule__IntType__Group__1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:861:1: rule__IntType__Group__1 : rule__IntType__Group__1__Impl ;
    public final void rule__IntType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:865:1: ( rule__IntType__Group__1__Impl )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:866:2: rule__IntType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__11692);
            rule__IntType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__1"


    // $ANTLR start "rule__IntType__Group__1__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:872:1: rule__IntType__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:876:1: ( ( 'int' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:877:1: ( 'int' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:877:1: ( 'int' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:878:1: 'int'
            {
             before(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__IntType__Group__1__Impl1720); 
             after(grammarAccess.getIntTypeAccess().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:895:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:899:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:900:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__01755);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__01758);
            rule__StringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:907:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:911:1: ( ( () ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:912:1: ( () )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:912:1: ( () )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:913:1: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:914:1: ()
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:916:1: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:926:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:930:1: ( rule__StringType__Group__1__Impl )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:931:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__11816);
            rule__StringType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:937:1: rule__StringType__Group__1__Impl : ( 'string' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:941:1: ( ( 'string' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:942:1: ( 'string' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:942:1: ( 'string' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:943:1: 'string'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__StringType__Group__1__Impl1844); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:960:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:964:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:965:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01879);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01882);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:972:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:976:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:977:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:977:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:978:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1909); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:989:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:993:1: ( rule__FQN__Group__1__Impl )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:994:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11938);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1000:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1004:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1005:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1005:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1006:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1007:1: ( rule__FQN__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1007:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1965);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1021:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1025:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1026:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02000);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02003);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1033:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1037:1: ( ( '.' ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1038:1: ( '.' )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1038:1: ( '.' )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1039:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__FQN__Group_1__0__Impl2031); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1052:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1056:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1057:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12062);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1063:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1067:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1068:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1068:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1069:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2089); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1085:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1089:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1090:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1090:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1091:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_12127); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__EntitiesAssignment_3"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1100:1: rule__Module__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__Module__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1104:1: ( ( ruleEntity ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1105:1: ( ruleEntity )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1105:1: ( ruleEntity )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1106:1: ruleEntity
            {
             before(grammarAccess.getModuleAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Module__EntitiesAssignment_32158);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getEntitiesEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__EntitiesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1115:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1119:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1120:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1120:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1121:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12189); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1130:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1134:1: ( ( ruleAttribute ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1135:1: ( ruleAttribute )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1135:1: ( ruleAttribute )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1136:1: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_32220);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1145:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1149:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1150:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1150:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1151:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02251); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1160:1: rule__Attribute__TypeAssignment_2 : ( ruleAbstractType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1164:1: ( ( ruleAbstractType ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1165:1: ( ruleAbstractType )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1165:1: ( ruleAbstractType )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1166:1: ruleAbstractType
            {
             before(grammarAccess.getAttributeAccess().getTypeAbstractTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractType_in_rule__Attribute__TypeAssignment_22282);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAbstractTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__EntityReference__RefAssignment"
    // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1175:1: rule__EntityReference__RefAssignment : ( ( ruleFQN ) ) ;
    public final void rule__EntityReference__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1179:1: ( ( ( ruleFQN ) ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1180:1: ( ( ruleFQN ) )
            {
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1180:1: ( ( ruleFQN ) )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1181:1: ( ruleFQN )
            {
             before(grammarAccess.getEntityReferenceAccess().getRefEntityCrossReference_0()); 
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1182:1: ( ruleFQN )
            // ../org.xtext.example.lmrc.entity.ui/src-gen/org/xtext/example/lmrc/entity/ui/contentassist/antlr/internal/InternalEntityDsl.g:1183:1: ruleFQN
            {
             before(grammarAccess.getEntityReferenceAccess().getRefEntityFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__EntityReference__RefAssignment2317);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getEntityReferenceAccess().getRefEntityFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getEntityReferenceAccess().getRefEntityCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityReference__RefAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_entryRuleAbstractType243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractType__Alternatives_in_ruleAbstractType276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0_in_ruleBooleanType336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_entryRuleIntType363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntType370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0_in_ruleIntType396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0_in_ruleStringType456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__RefAssignment_in_ruleEntityReference516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__AbstractType__Alternatives613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntType_in_rule__AbstractType__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rule__AbstractType__Alternatives647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_rule__AbstractType__Alternatives664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Module__Group__0__Impl725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1756 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2816 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Module__Group__2__Impl847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__3878 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__EntitiesAssignment_3_in_rule__Module__Group__3__Impl908 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Module__Group__4__Impl967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__0__Impl1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11070 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21130 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__2__Impl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31192 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__AttributesAssignment_3_in_rule__Entity__Group__3__Impl1222 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__4__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01322 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_in_rule__Attribute__Group__0__Impl1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11382 = new BitSet(new long[]{0x0000000000070010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Attribute__Group__1__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__21444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_2_in_rule__Attribute__Group__2__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__0__Impl_in_rule__BooleanType__Group__01507 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1_in_rule__BooleanType__Group__01510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Group__1__Impl_in_rule__BooleanType__Group__11568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BooleanType__Group__1__Impl1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__0__Impl_in_rule__IntType__Group__01631 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__IntType__Group__1_in_rule__IntType__Group__01634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntType__Group__1__Impl_in_rule__IntType__Group__11692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__IntType__Group__1__Impl1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__0__Impl_in_rule__StringType__Group__01755 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__StringType__Group__1_in_rule__StringType__Group__01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringType__Group__1__Impl_in_rule__StringType__Group__11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringType__Group__1__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01879 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1965 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__02000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__02003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FQN__Group_1__0__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_12127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Module__EntitiesAssignment_32158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Entity__AttributesAssignment_32220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_02251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractType_in_rule__Attribute__TypeAssignment_22282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__EntityReference__RefAssignment2317 = new BitSet(new long[]{0x0000000000000002L});

}