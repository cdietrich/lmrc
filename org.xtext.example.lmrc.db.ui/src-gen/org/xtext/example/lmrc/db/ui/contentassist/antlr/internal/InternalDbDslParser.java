package org.xtext.example.lmrc.db.ui.contentassist.antlr.internal; 

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
import org.xtext.example.lmrc.db.services.DbDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g"; }


     
     	private DbDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DbDslGrammarAccess grammarAccess) {
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:60:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:61:1: ( ruleRoot EOF )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:62:1: ruleRoot EOF
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:69:1: ruleRoot : ( ruleDatabase ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:73:2: ( ( ruleDatabase ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:74:1: ( ruleDatabase )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:74:1: ( ruleDatabase )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:75:1: ruleDatabase
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


    // $ANTLR start "entryRuleDatabase"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:88:1: entryRuleDatabase : ruleDatabase EOF ;
    public final void entryRuleDatabase() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:89:1: ( ruleDatabase EOF )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:90:1: ruleDatabase EOF
            {
             before(grammarAccess.getDatabaseRule()); 
            pushFollow(FOLLOW_ruleDatabase_in_entryRuleDatabase120);
            ruleDatabase();

            state._fsp--;

             after(grammarAccess.getDatabaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatabase127); 

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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:97:1: ruleDatabase : ( ( rule__Database__Group__0 ) ) ;
    public final void ruleDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:101:2: ( ( ( rule__Database__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:102:1: ( ( rule__Database__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:102:1: ( ( rule__Database__Group__0 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:103:1: ( rule__Database__Group__0 )
            {
             before(grammarAccess.getDatabaseAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:104:1: ( rule__Database__Group__0 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:104:2: rule__Database__Group__0
            {
            pushFollow(FOLLOW_rule__Database__Group__0_in_ruleDatabase153);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:116:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:117:1: ( ruleTable EOF )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:118:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_ruleTable_in_entryRuleTable180);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTable187); 

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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:125:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:129:2: ( ( ( rule__Table__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:130:1: ( ( rule__Table__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:130:1: ( ( rule__Table__Group__0 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:131:1: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:132:1: ( rule__Table__Group__0 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:132:2: rule__Table__Group__0
            {
            pushFollow(FOLLOW_rule__Table__Group__0_in_ruleTable213);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:144:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:145:1: ( ruleColumn EOF )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:146:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn240);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn247); 

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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:153:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:157:2: ( ( ( rule__Column__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:158:1: ( ( rule__Column__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:158:1: ( ( rule__Column__Group__0 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:159:1: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:160:1: ( rule__Column__Group__0 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:160:2: rule__Column__Group__0
            {
            pushFollow(FOLLOW_rule__Column__Group__0_in_ruleColumn273);
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


    // $ANTLR start "entryRuleAbstractColumnMapper"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:172:1: entryRuleAbstractColumnMapper : ruleAbstractColumnMapper EOF ;
    public final void entryRuleAbstractColumnMapper() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:173:1: ( ruleAbstractColumnMapper EOF )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:174:1: ruleAbstractColumnMapper EOF
            {
             before(grammarAccess.getAbstractColumnMapperRule()); 
            pushFollow(FOLLOW_ruleAbstractColumnMapper_in_entryRuleAbstractColumnMapper300);
            ruleAbstractColumnMapper();

            state._fsp--;

             after(grammarAccess.getAbstractColumnMapperRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractColumnMapper307); 

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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:181:1: ruleAbstractColumnMapper : ( ( rule__AbstractColumnMapper__Group__0 ) ) ;
    public final void ruleAbstractColumnMapper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:185:2: ( ( ( rule__AbstractColumnMapper__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:186:1: ( ( rule__AbstractColumnMapper__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:186:1: ( ( rule__AbstractColumnMapper__Group__0 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:187:1: ( rule__AbstractColumnMapper__Group__0 )
            {
             before(grammarAccess.getAbstractColumnMapperAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:188:1: ( rule__AbstractColumnMapper__Group__0 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:188:2: rule__AbstractColumnMapper__Group__0
            {
            pushFollow(FOLLOW_rule__AbstractColumnMapper__Group__0_in_ruleAbstractColumnMapper333);
            rule__AbstractColumnMapper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractColumnMapperAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAbstractDataType"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:200:1: entryRuleAbstractDataType : ruleAbstractDataType EOF ;
    public final void entryRuleAbstractDataType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:201:1: ( ruleAbstractDataType EOF )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:202:1: ruleAbstractDataType EOF
            {
             before(grammarAccess.getAbstractDataTypeRule()); 
            pushFollow(FOLLOW_ruleAbstractDataType_in_entryRuleAbstractDataType360);
            ruleAbstractDataType();

            state._fsp--;

             after(grammarAccess.getAbstractDataTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDataType367); 

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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:209:1: ruleAbstractDataType : ( ( rule__AbstractDataType__Alternatives ) ) ;
    public final void ruleAbstractDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:213:2: ( ( ( rule__AbstractDataType__Alternatives ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:214:1: ( ( rule__AbstractDataType__Alternatives ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:214:1: ( ( rule__AbstractDataType__Alternatives ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:215:1: ( rule__AbstractDataType__Alternatives )
            {
             before(grammarAccess.getAbstractDataTypeAccess().getAlternatives()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:216:1: ( rule__AbstractDataType__Alternatives )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:216:2: rule__AbstractDataType__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractDataType__Alternatives_in_ruleAbstractDataType393);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:228:1: entryRuleCharType : ruleCharType EOF ;
    public final void entryRuleCharType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:229:1: ( ruleCharType EOF )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:230:1: ruleCharType EOF
            {
             before(grammarAccess.getCharTypeRule()); 
            pushFollow(FOLLOW_ruleCharType_in_entryRuleCharType420);
            ruleCharType();

            state._fsp--;

             after(grammarAccess.getCharTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharType427); 

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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:237:1: ruleCharType : ( ( rule__CharType__Group__0 ) ) ;
    public final void ruleCharType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:241:2: ( ( ( rule__CharType__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:242:1: ( ( rule__CharType__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:242:1: ( ( rule__CharType__Group__0 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:243:1: ( rule__CharType__Group__0 )
            {
             before(grammarAccess.getCharTypeAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:244:1: ( rule__CharType__Group__0 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:244:2: rule__CharType__Group__0
            {
            pushFollow(FOLLOW_rule__CharType__Group__0_in_ruleCharType453);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:256:1: entryRuleNumberType : ruleNumberType EOF ;
    public final void entryRuleNumberType() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:257:1: ( ruleNumberType EOF )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:258:1: ruleNumberType EOF
            {
             before(grammarAccess.getNumberTypeRule()); 
            pushFollow(FOLLOW_ruleNumberType_in_entryRuleNumberType480);
            ruleNumberType();

            state._fsp--;

             after(grammarAccess.getNumberTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberType487); 

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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:265:1: ruleNumberType : ( ( rule__NumberType__Group__0 ) ) ;
    public final void ruleNumberType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:269:2: ( ( ( rule__NumberType__Group__0 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:270:1: ( ( rule__NumberType__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:270:1: ( ( rule__NumberType__Group__0 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:271:1: ( rule__NumberType__Group__0 )
            {
             before(grammarAccess.getNumberTypeAccess().getGroup()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:272:1: ( rule__NumberType__Group__0 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:272:2: rule__NumberType__Group__0
            {
            pushFollow(FOLLOW_rule__NumberType__Group__0_in_ruleNumberType513);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:284:1: rule__AbstractDataType__Alternatives : ( ( ruleCharType ) | ( ruleNumberType ) );
    public final void rule__AbstractDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:288:1: ( ( ruleCharType ) | ( ruleNumberType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:289:1: ( ruleCharType )
                    {
                    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:289:1: ( ruleCharType )
                    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:290:1: ruleCharType
                    {
                     before(grammarAccess.getAbstractDataTypeAccess().getCharTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCharType_in_rule__AbstractDataType__Alternatives549);
                    ruleCharType();

                    state._fsp--;

                     after(grammarAccess.getAbstractDataTypeAccess().getCharTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:295:6: ( ruleNumberType )
                    {
                    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:295:6: ( ruleNumberType )
                    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:296:1: ruleNumberType
                    {
                     before(grammarAccess.getAbstractDataTypeAccess().getNumberTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNumberType_in_rule__AbstractDataType__Alternatives566);
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


    // $ANTLR start "rule__Database__Group__0"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:308:1: rule__Database__Group__0 : rule__Database__Group__0__Impl rule__Database__Group__1 ;
    public final void rule__Database__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:312:1: ( rule__Database__Group__0__Impl rule__Database__Group__1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:313:2: rule__Database__Group__0__Impl rule__Database__Group__1
            {
            pushFollow(FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__0596);
            rule__Database__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__1_in_rule__Database__Group__0599);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:320:1: rule__Database__Group__0__Impl : ( 'database' ) ;
    public final void rule__Database__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:324:1: ( ( 'database' ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:325:1: ( 'database' )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:325:1: ( 'database' )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:326:1: 'database'
            {
             before(grammarAccess.getDatabaseAccess().getDatabaseKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Database__Group__0__Impl627); 
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:339:1: rule__Database__Group__1 : rule__Database__Group__1__Impl rule__Database__Group__2 ;
    public final void rule__Database__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:343:1: ( rule__Database__Group__1__Impl rule__Database__Group__2 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:344:2: rule__Database__Group__1__Impl rule__Database__Group__2
            {
            pushFollow(FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__1658);
            rule__Database__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Database__Group__2_in_rule__Database__Group__1661);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:351:1: rule__Database__Group__1__Impl : ( ( rule__Database__NameAssignment_1 ) ) ;
    public final void rule__Database__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:355:1: ( ( ( rule__Database__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:356:1: ( ( rule__Database__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:356:1: ( ( rule__Database__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:357:1: ( rule__Database__NameAssignment_1 )
            {
             before(grammarAccess.getDatabaseAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:358:1: ( rule__Database__NameAssignment_1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:358:2: rule__Database__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Database__NameAssignment_1_in_rule__Database__Group__1__Impl688);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:368:1: rule__Database__Group__2 : rule__Database__Group__2__Impl ;
    public final void rule__Database__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:372:1: ( rule__Database__Group__2__Impl )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:373:2: rule__Database__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__2718);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:379:1: rule__Database__Group__2__Impl : ( ( rule__Database__TablesAssignment_2 )* ) ;
    public final void rule__Database__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:383:1: ( ( ( rule__Database__TablesAssignment_2 )* ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:384:1: ( ( rule__Database__TablesAssignment_2 )* )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:384:1: ( ( rule__Database__TablesAssignment_2 )* )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:385:1: ( rule__Database__TablesAssignment_2 )*
            {
             before(grammarAccess.getDatabaseAccess().getTablesAssignment_2()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:386:1: ( rule__Database__TablesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:386:2: rule__Database__TablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Database__TablesAssignment_2_in_rule__Database__Group__2__Impl745);
            	    rule__Database__TablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:402:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:406:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:407:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__0782);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__1_in_rule__Table__Group__0785);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:414:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:418:1: ( ( 'table' ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:419:1: ( 'table' )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:419:1: ( 'table' )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:420:1: 'table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Table__Group__0__Impl813); 
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:433:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:437:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:438:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__1844);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Table__Group__2_in_rule__Table__Group__1847);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:445:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:449:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:450:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:450:1: ( ( rule__Table__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:451:1: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:452:1: ( rule__Table__NameAssignment_1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:452:2: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl874);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:462:1: rule__Table__Group__2 : rule__Table__Group__2__Impl ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:466:1: ( rule__Table__Group__2__Impl )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:467:2: rule__Table__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__2904);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:473:1: rule__Table__Group__2__Impl : ( ( rule__Table__ColumnsAssignment_2 )* ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:477:1: ( ( ( rule__Table__ColumnsAssignment_2 )* ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:478:1: ( ( rule__Table__ColumnsAssignment_2 )* )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:478:1: ( ( rule__Table__ColumnsAssignment_2 )* )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:479:1: ( rule__Table__ColumnsAssignment_2 )*
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_2()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:480:1: ( rule__Table__ColumnsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:480:2: rule__Table__ColumnsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Table__ColumnsAssignment_2_in_rule__Table__Group__2__Impl931);
            	    rule__Table__ColumnsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:496:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:500:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:501:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__0968);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__1_in_rule__Column__Group__0971);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:508:1: rule__Column__Group__0__Impl : ( ( rule__Column__TypeAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:512:1: ( ( ( rule__Column__TypeAssignment_0 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:513:1: ( ( rule__Column__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:513:1: ( ( rule__Column__TypeAssignment_0 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:514:1: ( rule__Column__TypeAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_0()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:515:1: ( rule__Column__TypeAssignment_0 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:515:2: rule__Column__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Column__TypeAssignment_0_in_rule__Column__Group__0__Impl998);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:525:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:529:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:530:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11028);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__2_in_rule__Column__Group__11031);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:537:1: rule__Column__Group__1__Impl : ( ( rule__Column__NameAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:541:1: ( ( ( rule__Column__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:542:1: ( ( rule__Column__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:542:1: ( ( rule__Column__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:543:1: ( rule__Column__NameAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:544:1: ( rule__Column__NameAssignment_1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:544:2: rule__Column__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Column__NameAssignment_1_in_rule__Column__Group__1__Impl1058);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:554:1: rule__Column__Group__2 : rule__Column__Group__2__Impl ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:558:1: ( rule__Column__Group__2__Impl )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:559:2: rule__Column__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__21088);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:565:1: rule__Column__Group__2__Impl : ( ( rule__Column__MapperAssignment_2 )? ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:569:1: ( ( ( rule__Column__MapperAssignment_2 )? ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:570:1: ( ( rule__Column__MapperAssignment_2 )? )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:570:1: ( ( rule__Column__MapperAssignment_2 )? )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:571:1: ( rule__Column__MapperAssignment_2 )?
            {
             before(grammarAccess.getColumnAccess().getMapperAssignment_2()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:572:1: ( rule__Column__MapperAssignment_2 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:572:2: rule__Column__MapperAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Column__MapperAssignment_2_in_rule__Column__Group__2__Impl1115);
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


    // $ANTLR start "rule__AbstractColumnMapper__Group__0"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:588:1: rule__AbstractColumnMapper__Group__0 : rule__AbstractColumnMapper__Group__0__Impl rule__AbstractColumnMapper__Group__1 ;
    public final void rule__AbstractColumnMapper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:592:1: ( rule__AbstractColumnMapper__Group__0__Impl rule__AbstractColumnMapper__Group__1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:593:2: rule__AbstractColumnMapper__Group__0__Impl rule__AbstractColumnMapper__Group__1
            {
            pushFollow(FOLLOW_rule__AbstractColumnMapper__Group__0__Impl_in_rule__AbstractColumnMapper__Group__01152);
            rule__AbstractColumnMapper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AbstractColumnMapper__Group__1_in_rule__AbstractColumnMapper__Group__01155);
            rule__AbstractColumnMapper__Group__1();

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
    // $ANTLR end "rule__AbstractColumnMapper__Group__0"


    // $ANTLR start "rule__AbstractColumnMapper__Group__0__Impl"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:600:1: rule__AbstractColumnMapper__Group__0__Impl : ( () ) ;
    public final void rule__AbstractColumnMapper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:604:1: ( ( () ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:605:1: ( () )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:605:1: ( () )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:606:1: ()
            {
             before(grammarAccess.getAbstractColumnMapperAccess().getAbstractColumnMapperAction_0()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:607:1: ()
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:609:1: 
            {
            }

             after(grammarAccess.getAbstractColumnMapperAccess().getAbstractColumnMapperAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractColumnMapper__Group__0__Impl"


    // $ANTLR start "rule__AbstractColumnMapper__Group__1"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:619:1: rule__AbstractColumnMapper__Group__1 : rule__AbstractColumnMapper__Group__1__Impl ;
    public final void rule__AbstractColumnMapper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:623:1: ( rule__AbstractColumnMapper__Group__1__Impl )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:624:2: rule__AbstractColumnMapper__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractColumnMapper__Group__1__Impl_in_rule__AbstractColumnMapper__Group__11213);
            rule__AbstractColumnMapper__Group__1__Impl();

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
    // $ANTLR end "rule__AbstractColumnMapper__Group__1"


    // $ANTLR start "rule__AbstractColumnMapper__Group__1__Impl"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:630:1: rule__AbstractColumnMapper__Group__1__Impl : ( 'something' ) ;
    public final void rule__AbstractColumnMapper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:634:1: ( ( 'something' ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:635:1: ( 'something' )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:635:1: ( 'something' )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:636:1: 'something'
            {
             before(grammarAccess.getAbstractColumnMapperAccess().getSomethingKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__AbstractColumnMapper__Group__1__Impl1241); 
             after(grammarAccess.getAbstractColumnMapperAccess().getSomethingKeyword_1()); 

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
    // $ANTLR end "rule__AbstractColumnMapper__Group__1__Impl"


    // $ANTLR start "rule__CharType__Group__0"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:653:1: rule__CharType__Group__0 : rule__CharType__Group__0__Impl rule__CharType__Group__1 ;
    public final void rule__CharType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:657:1: ( rule__CharType__Group__0__Impl rule__CharType__Group__1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:658:2: rule__CharType__Group__0__Impl rule__CharType__Group__1
            {
            pushFollow(FOLLOW_rule__CharType__Group__0__Impl_in_rule__CharType__Group__01276);
            rule__CharType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CharType__Group__1_in_rule__CharType__Group__01279);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:665:1: rule__CharType__Group__0__Impl : ( () ) ;
    public final void rule__CharType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:669:1: ( ( () ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:670:1: ( () )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:670:1: ( () )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:671:1: ()
            {
             before(grammarAccess.getCharTypeAccess().getCharTypeAction_0()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:672:1: ()
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:674:1: 
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:684:1: rule__CharType__Group__1 : rule__CharType__Group__1__Impl ;
    public final void rule__CharType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:688:1: ( rule__CharType__Group__1__Impl )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:689:2: rule__CharType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CharType__Group__1__Impl_in_rule__CharType__Group__11337);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:695:1: rule__CharType__Group__1__Impl : ( 'char' ) ;
    public final void rule__CharType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:699:1: ( ( 'char' ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:700:1: ( 'char' )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:700:1: ( 'char' )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:701:1: 'char'
            {
             before(grammarAccess.getCharTypeAccess().getCharKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__CharType__Group__1__Impl1365); 
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:718:1: rule__NumberType__Group__0 : rule__NumberType__Group__0__Impl rule__NumberType__Group__1 ;
    public final void rule__NumberType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:722:1: ( rule__NumberType__Group__0__Impl rule__NumberType__Group__1 )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:723:2: rule__NumberType__Group__0__Impl rule__NumberType__Group__1
            {
            pushFollow(FOLLOW_rule__NumberType__Group__0__Impl_in_rule__NumberType__Group__01400);
            rule__NumberType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberType__Group__1_in_rule__NumberType__Group__01403);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:730:1: rule__NumberType__Group__0__Impl : ( () ) ;
    public final void rule__NumberType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:734:1: ( ( () ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:735:1: ( () )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:735:1: ( () )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:736:1: ()
            {
             before(grammarAccess.getNumberTypeAccess().getNumberTypeAction_0()); 
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:737:1: ()
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:739:1: 
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:749:1: rule__NumberType__Group__1 : rule__NumberType__Group__1__Impl ;
    public final void rule__NumberType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:753:1: ( rule__NumberType__Group__1__Impl )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:754:2: rule__NumberType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberType__Group__1__Impl_in_rule__NumberType__Group__11461);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:760:1: rule__NumberType__Group__1__Impl : ( 'number' ) ;
    public final void rule__NumberType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:764:1: ( ( 'number' ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:765:1: ( 'number' )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:765:1: ( 'number' )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:766:1: 'number'
            {
             before(grammarAccess.getNumberTypeAccess().getNumberKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__NumberType__Group__1__Impl1489); 
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


    // $ANTLR start "rule__Database__NameAssignment_1"
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:784:1: rule__Database__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Database__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:788:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:789:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:789:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:790:1: RULE_ID
            {
             before(grammarAccess.getDatabaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Database__NameAssignment_11529); 
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:799:1: rule__Database__TablesAssignment_2 : ( ruleTable ) ;
    public final void rule__Database__TablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:803:1: ( ( ruleTable ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:804:1: ( ruleTable )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:804:1: ( ruleTable )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:805:1: ruleTable
            {
             before(grammarAccess.getDatabaseAccess().getTablesTableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTable_in_rule__Database__TablesAssignment_21560);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:814:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:818:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:819:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:819:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:820:1: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Table__NameAssignment_11591); 
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:829:1: rule__Table__ColumnsAssignment_2 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:833:1: ( ( ruleColumn ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:834:1: ( ruleColumn )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:834:1: ( ruleColumn )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:835:1: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_21622);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:844:1: rule__Column__TypeAssignment_0 : ( ruleAbstractDataType ) ;
    public final void rule__Column__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:848:1: ( ( ruleAbstractDataType ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:849:1: ( ruleAbstractDataType )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:849:1: ( ruleAbstractDataType )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:850:1: ruleAbstractDataType
            {
             before(grammarAccess.getColumnAccess().getTypeAbstractDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAbstractDataType_in_rule__Column__TypeAssignment_01653);
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:859:1: rule__Column__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:863:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:864:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:864:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:865:1: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Column__NameAssignment_11684); 
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
    // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:874:1: rule__Column__MapperAssignment_2 : ( ruleAbstractColumnMapper ) ;
    public final void rule__Column__MapperAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:878:1: ( ( ruleAbstractColumnMapper ) )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:879:1: ( ruleAbstractColumnMapper )
            {
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:879:1: ( ruleAbstractColumnMapper )
            // ../org.xtext.example.lmrc.db.ui/src-gen/org/xtext/example/lmrc/db/ui/contentassist/antlr/internal/InternalDbDsl.g:880:1: ruleAbstractColumnMapper
            {
             before(grammarAccess.getColumnAccess().getMapperAbstractColumnMapperParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractColumnMapper_in_rule__Column__MapperAssignment_21715);
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
    public static final BitSet FOLLOW_ruleDatabase_in_entryRuleDatabase120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatabase127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0_in_ruleDatabase153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_entryRuleTable180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTable187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__0_in_ruleTable213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0_in_ruleColumn273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractColumnMapper_in_entryRuleAbstractColumnMapper300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractColumnMapper307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractColumnMapper__Group__0_in_ruleAbstractColumnMapper333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDataType_in_entryRuleAbstractDataType360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDataType367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractDataType__Alternatives_in_ruleAbstractDataType393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharType_in_entryRuleCharType420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharType427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharType__Group__0_in_ruleCharType453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_entryRuleNumberType480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberType487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberType__Group__0_in_ruleNumberType513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharType_in_rule__AbstractDataType__Alternatives549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberType_in_rule__AbstractDataType__Alternatives566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__0__Impl_in_rule__Database__Group__0596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Database__Group__1_in_rule__Database__Group__0599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Database__Group__0__Impl627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__1__Impl_in_rule__Database__Group__1658 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Database__Group__2_in_rule__Database__Group__1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__NameAssignment_1_in_rule__Database__Group__1__Impl688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__Group__2__Impl_in_rule__Database__Group__2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Database__TablesAssignment_2_in_rule__Database__Group__2__Impl745 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__0782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__0785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Table__Group__0__Impl813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__1844 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__NameAssignment_1_in_rule__Table__Group__1__Impl874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_2_in_rule__Table__Group__2__Impl931 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__0968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__0971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__TypeAssignment_0_in_rule__Column__Group__0__Impl998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11028 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__11031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__NameAssignment_1_in_rule__Column__Group__1__Impl1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__21088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__MapperAssignment_2_in_rule__Column__Group__2__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractColumnMapper__Group__0__Impl_in_rule__AbstractColumnMapper__Group__01152 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__AbstractColumnMapper__Group__1_in_rule__AbstractColumnMapper__Group__01155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractColumnMapper__Group__1__Impl_in_rule__AbstractColumnMapper__Group__11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AbstractColumnMapper__Group__1__Impl1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharType__Group__0__Impl_in_rule__CharType__Group__01276 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CharType__Group__1_in_rule__CharType__Group__01279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharType__Group__1__Impl_in_rule__CharType__Group__11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CharType__Group__1__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberType__Group__0__Impl_in_rule__NumberType__Group__01400 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__NumberType__Group__1_in_rule__NumberType__Group__01403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberType__Group__1__Impl_in_rule__NumberType__Group__11461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NumberType__Group__1__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Database__NameAssignment_11529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTable_in_rule__Database__TablesAssignment_21560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Table__NameAssignment_11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_21622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDataType_in_rule__Column__TypeAssignment_01653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Column__NameAssignment_11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractColumnMapper_in_rule__Column__MapperAssignment_21715 = new BitSet(new long[]{0x0000000000000002L});

}