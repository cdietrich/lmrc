package org.xtext.example.lmrc.db2entity.ui.contentassist.antlr.internal; 

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
import org.xtext.example.lmrc.db2entity.services.Db2EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDb2EntityDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g"; }


     
     	private Db2EntityDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Db2EntityDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleRoot"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:61:1: ( ruleRoot EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:62:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot61);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot68); 

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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:69:1: ruleRoot : ( ruleDatabase ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:73:2: ( ( ruleDatabase ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:74:1: ( ruleDatabase )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:74:1: ( ruleDatabase )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:75:1: ruleDatabase
            {
             before(grammarAccess.getRootAccess().getDatabaseParserRuleCall()); 
            pushFollow(FOLLOW_ruleDatabase_in_ruleRoot94);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getRootAccess().getDatabaseParserRuleCall()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleAbstractColumnMapper"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:88:1: entryRuleAbstractColumnMapper : ruleAbstractColumnMapper EOF ;
    public final void entryRuleAbstractColumnMapper() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:89:1: ( ruleAbstractColumnMapper EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:90:1: ruleAbstractColumnMapper EOF
            {
             before(grammarAccess.getAbstractColumnMapperRule()); 
            pushFollow(FOLLOW_ruleAbstractColumnMapper_in_entryRuleAbstractColumnMapper120);
            ruleAbstractColumnMapper();

            state._fsp--;

             after(grammarAccess.getAbstractColumnMapperRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractColumnMapper127); 

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
    // $ANTLR end "entryRuleAbstractColumnMapper"


    // $ANTLR start "ruleAbstractColumnMapper"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:97:1: ruleAbstractColumnMapper : ( ruleEntityColumnMapper ) ;
    public final void ruleAbstractColumnMapper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:101:2: ( ( ruleEntityColumnMapper ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:102:1: ( ruleEntityColumnMapper )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:102:1: ( ruleEntityColumnMapper )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:103:1: ruleEntityColumnMapper
            {
             before(grammarAccess.getAbstractColumnMapperAccess().getEntityColumnMapperParserRuleCall()); 
            pushFollow(FOLLOW_ruleEntityColumnMapper_in_ruleAbstractColumnMapper153);
            ruleEntityColumnMapper();

            state._fsp--;

             after(grammarAccess.getAbstractColumnMapperAccess().getEntityColumnMapperParserRuleCall()); 

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
    // $ANTLR end "ruleAbstractColumnMapper"


    // $ANTLR start "entryRuleEntityColumnMapper"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:116:1: entryRuleEntityColumnMapper : ruleEntityColumnMapper EOF ;
    public final void entryRuleEntityColumnMapper() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:117:1: ( ruleEntityColumnMapper EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:118:1: ruleEntityColumnMapper EOF
            {
             before(grammarAccess.getEntityColumnMapperRule()); 
            pushFollow(FOLLOW_ruleEntityColumnMapper_in_entryRuleEntityColumnMapper179);
            ruleEntityColumnMapper();

            state._fsp--;

             after(grammarAccess.getEntityColumnMapperRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityColumnMapper186); 

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
    // $ANTLR end "entryRuleEntityColumnMapper"


    // $ANTLR start "ruleEntityColumnMapper"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:125:1: ruleEntityColumnMapper : ( ( rule__EntityColumnMapper__Group__0 ) ) ;
    public final void ruleEntityColumnMapper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:129:2: ( ( ( rule__EntityColumnMapper__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:130:1: ( ( rule__EntityColumnMapper__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:130:1: ( ( rule__EntityColumnMapper__Group__0 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:131:1: ( rule__EntityColumnMapper__Group__0 )
            {
             before(grammarAccess.getEntityColumnMapperAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:132:1: ( rule__EntityColumnMapper__Group__0 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:132:2: rule__EntityColumnMapper__Group__0
            {
            pushFollow(FOLLOW_rule__EntityColumnMapper__Group__0_in_ruleEntityColumnMapper212);
            rule__EntityColumnMapper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityColumnMapperAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityColumnMapper"


    // $ANTLR start "entryRuleFQN"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:144:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:145:1: ( ruleFQN EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:146:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN239);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN246); 

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
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:153:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:157:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:158:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:158:1: ( ( rule__FQN__Group__0 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:159:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:160:1: ( rule__FQN__Group__0 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:160:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN272);
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


    // $ANTLR start "entryRuleDatabase"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:172:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:173:1: ( ruleDatabase EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:174:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase299);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase306); 

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
    // $ANTLR end "entryRuleDatabase"


    // $ANTLR start "ruleDatabase"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:181:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:185:2: ( ( ( rule__Database__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:186:1: ( ( rule__Database__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:186:1: ( ( rule__Database__Group__0 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:187:1: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:188:1: ( rule__Database__Group__0 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:188:2: rule__Database__Group__0
            {
            pushFollow(FOLLOW_rule__Database__Group__0_in_ruleDatabase332);
            rule__Database__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getGroup()); 

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
    // $ANTLR end "ruleDatabase"


    // $ANTLR start "entryRuleTable"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:200:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:201:1: ( ruleTable EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:202:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable359);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable366); 

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:209:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:213:2: ( ( ( rule__Table__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:214:1: ( ( rule__Table__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:214:1: ( ( rule__Table__Group__0 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:215:1: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:216:1: ( rule__Table__Group__0 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:216:2: rule__Table__Group__0
            {
            pushFollow(FOLLOW_rule__Table__Group__0_in_ruleTable392);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:228:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:229:1: ( ruleColumn EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:230:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn419);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn426); 

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:237:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:241:2: ( ( ( rule__Column__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:242:1: ( ( rule__Column__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:242:1: ( ( rule__Column__Group__0 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:243:1: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:244:1: ( rule__Column__Group__0 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:244:2: rule__Column__Group__0
            {
            pushFollow(FOLLOW_rule__Column__Group__0_in_ruleColumn452);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleAbstractDataType"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:256:1: entryRuleAbstractDataType : ruleAbstractDataType EOF ;
    public final void entryRuleAbstractDataType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:257:1: ( ruleAbstractDataType EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:258:1: ruleAbstractDataType EOF
            {
             before(grammarAccess.getAbstractDataTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractDataType_in_entryRuleAbstractDataType479);
            ruleAbstractDataType();

            state._fsp--;

             after(grammarAccess.getAbstractDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDataType486); 

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
    // $ANTLR end "entryRuleAbstractDataType"


    // $ANTLR start "ruleAbstractDataType"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:265:1: ruleAbstractDataType : ( ( rule__AbstractDataType__Alternatives ) ) ;
    public final void ruleAbstractDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:269:2: ( ( ( rule__AbstractDataType__Alternatives ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:270:1: ( ( rule__AbstractDataType__Alternatives ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:270:1: ( ( rule__AbstractDataType__Alternatives ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:271:1: ( rule__AbstractDataType__Alternatives )
            {
             before(grammarAccess.getAbstractDataTypeAccess().getAlternatives()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:272:1: ( rule__AbstractDataType__Alternatives )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:272:2: rule__AbstractDataType__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractDataType__Alternatives_in_ruleAbstractDataType512);
            rule__AbstractDataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractDataTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractDataType"


    // $ANTLR start "entryRuleCharType"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:284:1: entryRuleCharType : ruleCharType EOF ;
    public final void entryRuleCharType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:285:1: ( ruleCharType EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:286:1: ruleCharType EOF
            {
             before(grammarAccess.getCharTypeRule()); 
            pushFollow(FOLLOW_ruleCharType_in_entryRuleCharType539);
            ruleCharType();

            state._fsp--;

             after(grammarAccess.getCharTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharType546); 

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
    // $ANTLR end "entryRuleCharType"


    // $ANTLR start "ruleCharType"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:293:1: ruleCharType : ( ( rule__CharType__Group__0 ) ) ;
    public final void ruleCharType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:297:2: ( ( ( rule__CharType__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:298:1: ( ( rule__CharType__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:298:1: ( ( rule__CharType__Group__0 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:299:1: ( rule__CharType__Group__0 )
            {
             before(grammarAccess.getCharTypeAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:300:1: ( rule__CharType__Group__0 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:300:2: rule__CharType__Group__0
            {
            pushFollow(FOLLOW_rule__CharType__Group__0_in_ruleCharType572);
            rule__CharType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleCharType"


    // $ANTLR start "entryRuleNumberType"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:312:1: entryRuleNumberType : ruleNumberType EOF ;
    public final void entryRuleNumberType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:313:1: ( ruleNumberType EOF )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:314:1: ruleNumberType EOF
            {
             before(grammarAccess.getNumberTypeRule()); 
            pushFollow(FOLLOW_ruleNumberType_in_entryRuleNumberType599);
            ruleNumberType();

            state._fsp--;

             after(grammarAccess.getNumberTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberType606); 

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
    // $ANTLR end "entryRuleNumberType"


    // $ANTLR start "ruleNumberType"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:321:1: ruleNumberType : ( ( rule__NumberType__Group__0 ) ) ;
    public final void ruleNumberType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:325:2: ( ( ( rule__NumberType__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:326:1: ( ( rule__NumberType__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:326:1: ( ( rule__NumberType__Group__0 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:327:1: ( rule__NumberType__Group__0 )
            {
             before(grammarAccess.getNumberTypeAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:328:1: ( rule__NumberType__Group__0 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:328:2: rule__NumberType__Group__0
            {
            pushFollow(FOLLOW_rule__NumberType__Group__0_in_ruleNumberType632);
            rule__NumberType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberType"


    // $ANTLR start "rule__AbstractDataType__Alternatives"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:340:1: rule__AbstractDataType__Alternatives : ( ( ruleCharType ) | ( ruleNumberType ) );
    public final void rule__AbstractDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:344:1: ( ( ruleCharType ) | ( ruleNumberType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:345:1: ( ruleCharType )
                    {
                    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:345:1: ( ruleCharType )
                    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:346:1: ruleCharType
                    {
                     before(grammarAccess.getAbstractDataTypeAccess().getCharTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCharType_in_rule__AbstractDataType__Alternatives668);
                    ruleCharType();

                    state._fsp--;

                     after(grammarAccess.getAbstractDataTypeAccess().getCharTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:351:6: ( ruleNumberType )
                    {
                    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:351:6: ( ruleNumberType )
                    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:352:1: ruleNumberType
                    {
                     before(grammarAccess.getAbstractDataTypeAccess().getNumberTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberType_in_rule__AbstractDataType__Alternatives685);
                    ruleNumberType();

                    state._fsp--;

                     after(grammarAccess.getAbstractDataTypeAccess().getNumberTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractDataType__Alternatives"


    // $ANTLR start "rule__EntityColumnMapper__Group__0"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:364:1: rule__EntityColumnMapper__Group__0 : rule__EntityColumnMapper__Group__0__Impl rule__EntityColumnMapper__Group__1 ;
    public final void rule__EntityColumnMapper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:368:1: ( rule__EntityColumnMapper__Group__0__Impl rule__EntityColumnMapper__Group__1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:369:2: rule__EntityColumnMapper__Group__0__Impl rule__EntityColumnMapper__Group__1
            {
            pushFollow(FOLLOW_rule__EntityColumnMapper__Group__0__Impl_in_rule__EntityColumnMapper__Group__0715);
            rule__EntityColumnMapper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityColumnMapper__Group__1_in_rule__EntityColumnMapper__Group__0718);
            rule__EntityColumnMapper__Group__1();

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
    // $ANTLR end "rule__EntityColumnMapper__Group__0"


    // $ANTLR start "rule__EntityColumnMapper__Group__0__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:376:1: rule__EntityColumnMapper__Group__0__Impl : ( () ) ;
    public final void rule__EntityColumnMapper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:380:1: ( ( () ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:381:1: ( () )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:381:1: ( () )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:382:1: ()
            {
             before(grammarAccess.getEntityColumnMapperAccess().getEntityColumnMapperAction_0()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:383:1: ()
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:385:1: 
            {
            }

             after(grammarAccess.getEntityColumnMapperAccess().getEntityColumnMapperAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityColumnMapper__Group__0__Impl"


    // $ANTLR start "rule__EntityColumnMapper__Group__1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:395:1: rule__EntityColumnMapper__Group__1 : rule__EntityColumnMapper__Group__1__Impl rule__EntityColumnMapper__Group__2 ;
    public final void rule__EntityColumnMapper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:399:1: ( rule__EntityColumnMapper__Group__1__Impl rule__EntityColumnMapper__Group__2 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:400:2: rule__EntityColumnMapper__Group__1__Impl rule__EntityColumnMapper__Group__2
            {
            pushFollow(FOLLOW_rule__EntityColumnMapper__Group__1__Impl_in_rule__EntityColumnMapper__Group__1776);
            rule__EntityColumnMapper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityColumnMapper__Group__2_in_rule__EntityColumnMapper__Group__1779);
            rule__EntityColumnMapper__Group__2();

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
    // $ANTLR end "rule__EntityColumnMapper__Group__1"


    // $ANTLR start "rule__EntityColumnMapper__Group__1__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:407:1: rule__EntityColumnMapper__Group__1__Impl : ( '<-' ) ;
    public final void rule__EntityColumnMapper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:411:1: ( ( '<-' ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:412:1: ( '<-' )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:412:1: ( '<-' )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:413:1: '<-'
            {
             before(grammarAccess.getEntityColumnMapperAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__EntityColumnMapper__Group__1__Impl807); 
             after(grammarAccess.getEntityColumnMapperAccess().getLessThanSignHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__EntityColumnMapper__Group__1__Impl"


    // $ANTLR start "rule__EntityColumnMapper__Group__2"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:426:1: rule__EntityColumnMapper__Group__2 : rule__EntityColumnMapper__Group__2__Impl ;
    public final void rule__EntityColumnMapper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:430:1: ( rule__EntityColumnMapper__Group__2__Impl )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:431:2: rule__EntityColumnMapper__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EntityColumnMapper__Group__2__Impl_in_rule__EntityColumnMapper__Group__2838);
            rule__EntityColumnMapper__Group__2__Impl();

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
    // $ANTLR end "rule__EntityColumnMapper__Group__2"


    // $ANTLR start "rule__EntityColumnMapper__Group__2__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:437:1: rule__EntityColumnMapper__Group__2__Impl : ( ( rule__EntityColumnMapper__EntityAssignment_2 ) ) ;
    public final void rule__EntityColumnMapper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:441:1: ( ( ( rule__EntityColumnMapper__EntityAssignment_2 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:442:1: ( ( rule__EntityColumnMapper__EntityAssignment_2 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:442:1: ( ( rule__EntityColumnMapper__EntityAssignment_2 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:443:1: ( rule__EntityColumnMapper__EntityAssignment_2 )
            {
             before(grammarAccess.getEntityColumnMapperAccess().getEntityAssignment_2()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:444:1: ( rule__EntityColumnMapper__EntityAssignment_2 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:444:2: rule__EntityColumnMapper__EntityAssignment_2
            {
            pushFollow(FOLLOW_rule__EntityColumnMapper__EntityAssignment_2_in_rule__EntityColumnMapper__Group__2__Impl865);
            rule__EntityColumnMapper__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityColumnMapperAccess().getEntityAssignment_2()); 

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
    // $ANTLR end "rule__EntityColumnMapper__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:460:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:464:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:465:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0901);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0904);
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
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:472:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:476:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:477:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:477:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:478:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl931); 
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
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:489:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:493:1: ( rule__FQN__Group__1__Impl )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:494:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__1960);
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
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:500:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:504:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:505:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:505:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:506:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:507:1: ( rule__FQN__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:507:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl987);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:521:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:525:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:526:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01022);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01025);
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
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:533:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:537:1: ( ( '.' ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:538:1: ( '.' )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:538:1: ( '.' )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:539:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__FQN__Group_1__0__Impl1053); 
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
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:552:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:556:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:557:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11084);
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
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:563:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:567:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:568:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:568:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:569:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1111); 
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


    // $ANTLR start "rule__Database__Group__0"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:584:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:588:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:589:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__01144);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__01147);
            rule__Database__Group__1();

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
    // $ANTLR end "rule__Database__Group__0"


    // $ANTLR start "rule__Database__Group__0__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:596:1: rule__Database__Group__0__Impl : ( 'database' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:600:1: ( ( 'database' ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:601:1: ( 'database' )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:601:1: ( 'database' )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:602:1: 'database'
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Database__Group__0__Impl1175); 
             after(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 

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
    // $ANTLR end "rule__Database__Group__0__Impl"


    // $ANTLR start "rule__Database__Group__1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:615:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:619:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:620:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__11206);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__11209);
            rule__Database__Group__2();

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
    // $ANTLR end "rule__Database__Group__1"


    // $ANTLR start "rule__Database__Group__1__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:627:1: rule__Database__Group__1__Impl : ( ( rule__Database__NameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:631:1: ( ( ( rule__Database__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:632:1: ( ( rule__Database__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:632:1: ( ( rule__Database__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:633:1: ( rule__Database__NameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:634:1: ( rule__Database__NameAssignment_1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:634:2: rule__Database__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Database__NameAssignment_1_in_rule__Database__Group__1__Impl1236);
            rule__Database__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatabaseAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Database__Group__1__Impl"


    // $ANTLR start "rule__Database__Group__2"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:644:1: rule__Database__Group__2 : rule__Database__Group__2__Impl ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:648:1: ( rule__Database__Group__2__Impl )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:649:2: rule__Database__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__21266);
            rule__Database__Group__2__Impl();

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
    // $ANTLR end "rule__Database__Group__2"


    // $ANTLR start "rule__Database__Group__2__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:655:1: rule__Database__Group__2__Impl : ( ( rule__Database__TablesAssignment_2 )* ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:659:1: ( ( ( rule__Database__TablesAssignment_2 )* ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:660:1: ( ( rule__Database__TablesAssignment_2 )* )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:660:1: ( ( rule__Database__TablesAssignment_2 )* )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:661:1: ( rule__Database__TablesAssignment_2 )*
            {
             before(grammarAccess.getDatabaseAccess().getTablesAssignment_2()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:662:1: ( rule__Database__TablesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:662:2: rule__Database__TablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Database__TablesAssignment_2_in_rule__Database__Group__2__Impl1293);
            	    rule__Database__TablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDatabaseAccess().getTablesAssignment_2()); 

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
    // $ANTLR end "rule__Database__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:678:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:682:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:683:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__01330);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__1_in_rule__Table__Group__01333);
            rule__Table__Group__1();

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
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:690:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:694:1: ( ( 'table' ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:695:1: ( 'table' )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:695:1: ( 'table' )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:696:1: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Table__Group__0__Impl1361); 
             after(grammarAccess.getTableAccess().getTableKeyword_0()); 

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
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:709:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:713:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:714:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__11392);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__2_in_rule__Table__Group__11395);
            rule__Table__Group__2();

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
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:721:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:725:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:726:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:726:1: ( ( rule__Table__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:727:1: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:728:1: ( rule__Table__NameAssignment_1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:728:2: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl1422);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:738:1: rule__Table__Group__2 : rule__Table__Group__2__Impl ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:742:1: ( rule__Table__Group__2__Impl )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:743:2: rule__Table__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__21452);
            rule__Table__Group__2__Impl();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:749:1: rule__Table__Group__2__Impl : ( ( rule__Table__ColumnsAssignment_2 )* ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:753:1: ( ( ( rule__Table__ColumnsAssignment_2 )* ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:754:1: ( ( rule__Table__ColumnsAssignment_2 )* )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:754:1: ( ( rule__Table__ColumnsAssignment_2 )* )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:755:1: ( rule__Table__ColumnsAssignment_2 )*
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_2()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:756:1: ( rule__Table__ColumnsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:756:2: rule__Table__ColumnsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Table__ColumnsAssignment_2_in_rule__Table__Group__2__Impl1479);
            	    rule__Table__ColumnsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getColumnsAssignment_2()); 

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
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:772:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:776:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:777:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__01516);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__1_in_rule__Column__Group__01519);
            rule__Column__Group__1();

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
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:784:1: rule__Column__Group__0__Impl : ( ( rule__Column__TypeAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:788:1: ( ( ( rule__Column__TypeAssignment_0 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:789:1: ( ( rule__Column__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:789:1: ( ( rule__Column__TypeAssignment_0 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:790:1: ( rule__Column__TypeAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_0()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:791:1: ( rule__Column__TypeAssignment_0 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:791:2: rule__Column__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Column__TypeAssignment_0_in_rule__Column__Group__0__Impl1546);
            rule__Column__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:801:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:805:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:806:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11576);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__2_in_rule__Column__Group__11579);
            rule__Column__Group__2();

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
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:813:1: rule__Column__Group__1__Impl : ( ( rule__Column__NameAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:817:1: ( ( ( rule__Column__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:818:1: ( ( rule__Column__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:818:1: ( ( rule__Column__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:819:1: ( rule__Column__NameAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:820:1: ( rule__Column__NameAssignment_1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:820:2: rule__Column__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Column__NameAssignment_1_in_rule__Column__Group__1__Impl1606);
            rule__Column__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:830:1: rule__Column__Group__2 : rule__Column__Group__2__Impl ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:834:1: ( rule__Column__Group__2__Impl )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:835:2: rule__Column__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__21636);
            rule__Column__Group__2__Impl();

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
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:841:1: rule__Column__Group__2__Impl : ( ( rule__Column__MapperAssignment_2 )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:845:1: ( ( ( rule__Column__MapperAssignment_2 )? ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:846:1: ( ( rule__Column__MapperAssignment_2 )? )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:846:1: ( ( rule__Column__MapperAssignment_2 )? )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:847:1: ( rule__Column__MapperAssignment_2 )?
            {
             before(grammarAccess.getColumnAccess().getMapperAssignment_2()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:848:1: ( rule__Column__MapperAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:848:2: rule__Column__MapperAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Column__MapperAssignment_2_in_rule__Column__Group__2__Impl1663);
                    rule__Column__MapperAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getMapperAssignment_2()); 

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
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__CharType__Group__0"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:864:1: rule__CharType__Group__0 : rule__CharType__Group__0__Impl rule__CharType__Group__1 ;
    public final void rule__CharType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:868:1: ( rule__CharType__Group__0__Impl rule__CharType__Group__1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:869:2: rule__CharType__Group__0__Impl rule__CharType__Group__1
            {
            pushFollow(FOLLOW_rule__CharType__Group__0__Impl_in_rule__CharType__Group__01700);
            rule__CharType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharType__Group__1_in_rule__CharType__Group__01703);
            rule__CharType__Group__1();

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
    // $ANTLR end "rule__CharType__Group__0"


    // $ANTLR start "rule__CharType__Group__0__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:876:1: rule__CharType__Group__0__Impl : ( () ) ;
    public final void rule__CharType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:880:1: ( ( () ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:881:1: ( () )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:881:1: ( () )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:882:1: ()
            {
             before(grammarAccess.getCharTypeAccess().getCharTypeAction_0()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:883:1: ()
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:885:1: 
            {
            }

             after(grammarAccess.getCharTypeAccess().getCharTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharType__Group__0__Impl"


    // $ANTLR start "rule__CharType__Group__1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:895:1: rule__CharType__Group__1 : rule__CharType__Group__1__Impl ;
    public final void rule__CharType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:899:1: ( rule__CharType__Group__1__Impl )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:900:2: rule__CharType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CharType__Group__1__Impl_in_rule__CharType__Group__11761);
            rule__CharType__Group__1__Impl();

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
    // $ANTLR end "rule__CharType__Group__1"


    // $ANTLR start "rule__CharType__Group__1__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:906:1: rule__CharType__Group__1__Impl : ( 'char' ) ;
    public final void rule__CharType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:910:1: ( ( 'char' ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:911:1: ( 'char' )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:911:1: ( 'char' )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:912:1: 'char'
            {
             before(grammarAccess.getCharTypeAccess().getCharKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__CharType__Group__1__Impl1789); 
             after(grammarAccess.getCharTypeAccess().getCharKeyword_1()); 

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
    // $ANTLR end "rule__CharType__Group__1__Impl"


    // $ANTLR start "rule__NumberType__Group__0"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:929:1: rule__NumberType__Group__0 : rule__NumberType__Group__0__Impl rule__NumberType__Group__1 ;
    public final void rule__NumberType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:933:1: ( rule__NumberType__Group__0__Impl rule__NumberType__Group__1 )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:934:2: rule__NumberType__Group__0__Impl rule__NumberType__Group__1
            {
            pushFollow(FOLLOW_rule__NumberType__Group__0__Impl_in_rule__NumberType__Group__01824);
            rule__NumberType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberType__Group__1_in_rule__NumberType__Group__01827);
            rule__NumberType__Group__1();

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
    // $ANTLR end "rule__NumberType__Group__0"


    // $ANTLR start "rule__NumberType__Group__0__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:941:1: rule__NumberType__Group__0__Impl : ( () ) ;
    public final void rule__NumberType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:945:1: ( ( () ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:946:1: ( () )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:946:1: ( () )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:947:1: ()
            {
             before(grammarAccess.getNumberTypeAccess().getNumberTypeAction_0()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:948:1: ()
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:950:1: 
            {
            }

             after(grammarAccess.getNumberTypeAccess().getNumberTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberType__Group__0__Impl"


    // $ANTLR start "rule__NumberType__Group__1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:960:1: rule__NumberType__Group__1 : rule__NumberType__Group__1__Impl ;
    public final void rule__NumberType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:964:1: ( rule__NumberType__Group__1__Impl )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:965:2: rule__NumberType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberType__Group__1__Impl_in_rule__NumberType__Group__11885);
            rule__NumberType__Group__1__Impl();

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
    // $ANTLR end "rule__NumberType__Group__1"


    // $ANTLR start "rule__NumberType__Group__1__Impl"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:971:1: rule__NumberType__Group__1__Impl : ( 'number' ) ;
    public final void rule__NumberType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:975:1: ( ( 'number' ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:976:1: ( 'number' )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:976:1: ( 'number' )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:977:1: 'number'
            {
             before(grammarAccess.getNumberTypeAccess().getNumberKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__NumberType__Group__1__Impl1913); 
             after(grammarAccess.getNumberTypeAccess().getNumberKeyword_1()); 

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
    // $ANTLR end "rule__NumberType__Group__1__Impl"


    // $ANTLR start "rule__EntityColumnMapper__EntityAssignment_2"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:995:1: rule__EntityColumnMapper__EntityAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__EntityColumnMapper__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:999:1: ( ( ( ruleFQN ) ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1000:1: ( ( ruleFQN ) )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1000:1: ( ( ruleFQN ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1001:1: ( ruleFQN )
            {
             before(grammarAccess.getEntityColumnMapperAccess().getEntityAttributeCrossReference_2_0()); 
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1002:1: ( ruleFQN )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1003:1: ruleFQN
            {
             before(grammarAccess.getEntityColumnMapperAccess().getEntityAttributeFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__EntityColumnMapper__EntityAssignment_21957);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getEntityColumnMapperAccess().getEntityAttributeFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getEntityColumnMapperAccess().getEntityAttributeCrossReference_2_0()); 

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
    // $ANTLR end "rule__EntityColumnMapper__EntityAssignment_2"


    // $ANTLR start "rule__Database__NameAssignment_1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1014:1: rule__Database__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1018:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1019:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1019:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1020:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__NameAssignment_11992); 
             after(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Database__NameAssignment_1"


    // $ANTLR start "rule__Database__TablesAssignment_2"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1029:1: rule__Database__TablesAssignment_2 : ( ruleTable ) ;
    public final void rule__Database__TablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1033:1: ( ( ruleTable ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1034:1: ( ruleTable )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1034:1: ( ruleTable )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1035:1: ruleTable
            {
             before(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Database__TablesAssignment_22023);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Database__TablesAssignment_2"


    // $ANTLR start "rule__Table__NameAssignment_1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1044:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1048:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1049:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1049:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1050:1: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Table__NameAssignment_12054); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__ColumnsAssignment_2"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1059:1: rule__Table__ColumnsAssignment_2 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1063:1: ( ( ruleColumn ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1064:1: ( ruleColumn )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1064:1: ( ruleColumn )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1065:1: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_22085);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_2"


    // $ANTLR start "rule__Column__TypeAssignment_0"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1074:1: rule__Column__TypeAssignment_0 : ( ruleAbstractDataType ) ;
    public final void rule__Column__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1078:1: ( ( ruleAbstractDataType ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1079:1: ( ruleAbstractDataType )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1079:1: ( ruleAbstractDataType )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1080:1: ruleAbstractDataType
            {
             before(grammarAccess.getColumnAccess().getTypeAbstractDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAbstractDataType_in_rule__Column__TypeAssignment_02116);
            ruleAbstractDataType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeAbstractDataTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Column__TypeAssignment_0"


    // $ANTLR start "rule__Column__NameAssignment_1"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1089:1: rule__Column__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1093:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1094:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1094:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1095:1: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Column__NameAssignment_12147); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Column__NameAssignment_1"


    // $ANTLR start "rule__Column__MapperAssignment_2"
    // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1104:1: rule__Column__MapperAssignment_2 : ( ruleAbstractColumnMapper ) ;
    public final void rule__Column__MapperAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1108:1: ( ( ruleAbstractColumnMapper ) )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1109:1: ( ruleAbstractColumnMapper )
            {
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1109:1: ( ruleAbstractColumnMapper )
            // ../org.xtext.example.lmrc.db2entity.ui/src-gen/org/xtext/example/lmrc/db2entity/ui/contentassist/antlr/internal/InternalDb2EntityDsl.g:1110:1: ruleAbstractColumnMapper
            {
             before(grammarAccess.getColumnAccess().getMapperAbstractColumnMapperParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractColumnMapper_in_rule__Column__MapperAssignment_22178);
            ruleAbstractColumnMapper();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getMapperAbstractColumnMapperParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Column__MapperAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_ruleRoot94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractColumnMapper_in_entryRuleAbstractColumnMapper120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractColumnMapper127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityColumnMapper_in_ruleAbstractColumnMapper153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityColumnMapper_in_entryRuleEntityColumnMapper179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityColumnMapper186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityColumnMapper__Group__0_in_ruleEntityColumnMapper212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0_in_ruleDatabase332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0_in_ruleTable392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0_in_ruleColumn452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDataType_in_entryRuleAbstractDataType479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDataType486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractDataType__Alternatives_in_ruleAbstractDataType512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharType_in_entryRuleCharType539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharType546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharType__Group__0_in_ruleCharType572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_entryRuleNumberType599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberType606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberType__Group__0_in_ruleNumberType632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharType_in_rule__AbstractDataType__Alternatives668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_rule__AbstractDataType__Alternatives685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityColumnMapper__Group__0__Impl_in_rule__EntityColumnMapper__Group__0715 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__EntityColumnMapper__Group__1_in_rule__EntityColumnMapper__Group__0718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityColumnMapper__Group__1__Impl_in_rule__EntityColumnMapper__Group__1776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityColumnMapper__Group__2_in_rule__EntityColumnMapper__Group__1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EntityColumnMapper__Group__1__Impl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityColumnMapper__Group__2__Impl_in_rule__EntityColumnMapper__Group__2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityColumnMapper__EntityAssignment_2_in_rule__EntityColumnMapper__Group__2__Impl865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0901 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl987 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FQN__Group_1__0__Impl1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__01144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__01147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Database__Group__0__Impl1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__11206 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__11209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__NameAssignment_1_in_rule__Database__Group__1__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__21266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__TablesAssignment_2_in_rule__Database__Group__2__Impl1293 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__01330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__01333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Table__Group__0__Impl1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__11392 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__11395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__21452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_2_in_rule__Table__Group__2__Impl1479 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__01516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__01519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__TypeAssignment_0_in_rule__Column__Group__0__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11576 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__11579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__NameAssignment_1_in_rule__Column__Group__1__Impl1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__21636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__MapperAssignment_2_in_rule__Column__Group__2__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharType__Group__0__Impl_in_rule__CharType__Group__01700 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CharType__Group__1_in_rule__CharType__Group__01703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharType__Group__1__Impl_in_rule__CharType__Group__11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CharType__Group__1__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberType__Group__0__Impl_in_rule__NumberType__Group__01824 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__NumberType__Group__1_in_rule__NumberType__Group__01827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberType__Group__1__Impl_in_rule__NumberType__Group__11885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NumberType__Group__1__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__EntityColumnMapper__EntityAssignment_21957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__NameAssignment_11992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Database__TablesAssignment_22023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Table__NameAssignment_12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_22085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDataType_in_rule__Column__TypeAssignment_02116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Column__NameAssignment_12147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractColumnMapper_in_rule__Column__MapperAssignment_22178 = new BitSet(new long[]{0x0000000000000002L});

}