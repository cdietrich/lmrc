package org.xtext.example.lmrc.uispec.ui.contentassist.antlr.internal; 

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
import org.xtext.example.lmrc.uispec.services.UispecDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUispecDslParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g"; }


     
     	private UispecDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(UispecDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleForm"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:60:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:61:1: ( ruleForm EOF )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:62:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_ruleForm_in_entryRuleForm61);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForm68); 

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:69:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:73:2: ( ( ( rule__Form__Group__0 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:74:1: ( ( rule__Form__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:74:1: ( ( rule__Form__Group__0 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:75:1: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:76:1: ( rule__Form__Group__0 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:76:2: rule__Form__Group__0
            {
            pushFollow(FOLLOW_rule__Form__Group__0_in_ruleForm94);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleEntityReference"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:88:1: entryRuleEntityReference : ruleEntityReference EOF ;
    public final void entryRuleEntityReference() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:89:1: ( ruleEntityReference EOF )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:90:1: ruleEntityReference EOF
            {
             before(grammarAccess.getEntityReferenceRule()); 
            pushFollow(FOLLOW_ruleEntityReference_in_entryRuleEntityReference121);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getEntityReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityReference128); 

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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:97:1: ruleEntityReference : ( ( rule__EntityReference__Group__0 ) ) ;
    public final void ruleEntityReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:101:2: ( ( ( rule__EntityReference__Group__0 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:102:1: ( ( rule__EntityReference__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:102:1: ( ( rule__EntityReference__Group__0 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:103:1: ( rule__EntityReference__Group__0 )
            {
             before(grammarAccess.getEntityReferenceAccess().getGroup()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:104:1: ( rule__EntityReference__Group__0 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:104:2: rule__EntityReference__Group__0
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__0_in_ruleEntityReference154);
            rule__EntityReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getGroup()); 

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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:116:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:117:1: ( ruleFQN EOF )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:118:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN181);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN188); 

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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:125:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:129:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:130:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:130:1: ( ( rule__FQN__Group__0 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:131:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:132:1: ( rule__FQN__Group__0 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:132:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN214);
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


    // $ANTLR start "entryRuleField"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:144:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:145:1: ( ruleField EOF )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:146:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField241);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField248); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:153:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:157:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:158:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:158:1: ( ( rule__Field__Group__0 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:159:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:160:1: ( rule__Field__Group__0 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:160:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField274);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleWidget"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:172:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:173:1: ( ruleWidget EOF )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:174:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_ruleWidget_in_entryRuleWidget301);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidget308); 

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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:181:1: ruleWidget : ( ( rule__Widget__Alternatives ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:185:2: ( ( ( rule__Widget__Alternatives ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:186:1: ( ( rule__Widget__Alternatives ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:186:1: ( ( rule__Widget__Alternatives ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:187:1: ( rule__Widget__Alternatives )
            {
             before(grammarAccess.getWidgetAccess().getAlternatives()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:188:1: ( rule__Widget__Alternatives )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:188:2: rule__Widget__Alternatives
            {
            pushFollow(FOLLOW_rule__Widget__Alternatives_in_ruleWidget334);
            rule__Widget__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleTextFieldWidget"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:200:1: entryRuleTextFieldWidget : ruleTextFieldWidget EOF ;
    public final void entryRuleTextFieldWidget() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:201:1: ( ruleTextFieldWidget EOF )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:202:1: ruleTextFieldWidget EOF
            {
             before(grammarAccess.getTextFieldWidgetRule()); 
            pushFollow(FOLLOW_ruleTextFieldWidget_in_entryRuleTextFieldWidget361);
            ruleTextFieldWidget();

            state._fsp--;

             after(grammarAccess.getTextFieldWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextFieldWidget368); 

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
    // $ANTLR end "entryRuleTextFieldWidget"


    // $ANTLR start "ruleTextFieldWidget"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:209:1: ruleTextFieldWidget : ( ( rule__TextFieldWidget__Group__0 ) ) ;
    public final void ruleTextFieldWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:213:2: ( ( ( rule__TextFieldWidget__Group__0 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:214:1: ( ( rule__TextFieldWidget__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:214:1: ( ( rule__TextFieldWidget__Group__0 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:215:1: ( rule__TextFieldWidget__Group__0 )
            {
             before(grammarAccess.getTextFieldWidgetAccess().getGroup()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:216:1: ( rule__TextFieldWidget__Group__0 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:216:2: rule__TextFieldWidget__Group__0
            {
            pushFollow(FOLLOW_rule__TextFieldWidget__Group__0_in_ruleTextFieldWidget394);
            rule__TextFieldWidget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldWidgetAccess().getGroup()); 

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
    // $ANTLR end "ruleTextFieldWidget"


    // $ANTLR start "entryRuleCheckBoxWidget"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:228:1: entryRuleCheckBoxWidget : ruleCheckBoxWidget EOF ;
    public final void entryRuleCheckBoxWidget() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:229:1: ( ruleCheckBoxWidget EOF )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:230:1: ruleCheckBoxWidget EOF
            {
             before(grammarAccess.getCheckBoxWidgetRule()); 
            pushFollow(FOLLOW_ruleCheckBoxWidget_in_entryRuleCheckBoxWidget421);
            ruleCheckBoxWidget();

            state._fsp--;

             after(grammarAccess.getCheckBoxWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheckBoxWidget428); 

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
    // $ANTLR end "entryRuleCheckBoxWidget"


    // $ANTLR start "ruleCheckBoxWidget"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:237:1: ruleCheckBoxWidget : ( ( rule__CheckBoxWidget__Group__0 ) ) ;
    public final void ruleCheckBoxWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:241:2: ( ( ( rule__CheckBoxWidget__Group__0 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:242:1: ( ( rule__CheckBoxWidget__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:242:1: ( ( rule__CheckBoxWidget__Group__0 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:243:1: ( rule__CheckBoxWidget__Group__0 )
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getGroup()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:244:1: ( rule__CheckBoxWidget__Group__0 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:244:2: rule__CheckBoxWidget__Group__0
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__0_in_ruleCheckBoxWidget454);
            rule__CheckBoxWidget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxWidgetAccess().getGroup()); 

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
    // $ANTLR end "ruleCheckBoxWidget"


    // $ANTLR start "entryRuleComboWidget"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:256:1: entryRuleComboWidget : ruleComboWidget EOF ;
    public final void entryRuleComboWidget() throws RecognitionException {
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:257:1: ( ruleComboWidget EOF )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:258:1: ruleComboWidget EOF
            {
             before(grammarAccess.getComboWidgetRule()); 
            pushFollow(FOLLOW_ruleComboWidget_in_entryRuleComboWidget481);
            ruleComboWidget();

            state._fsp--;

             after(grammarAccess.getComboWidgetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComboWidget488); 

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
    // $ANTLR end "entryRuleComboWidget"


    // $ANTLR start "ruleComboWidget"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:265:1: ruleComboWidget : ( ( rule__ComboWidget__Group__0 ) ) ;
    public final void ruleComboWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:269:2: ( ( ( rule__ComboWidget__Group__0 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:270:1: ( ( rule__ComboWidget__Group__0 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:270:1: ( ( rule__ComboWidget__Group__0 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:271:1: ( rule__ComboWidget__Group__0 )
            {
             before(grammarAccess.getComboWidgetAccess().getGroup()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:272:1: ( rule__ComboWidget__Group__0 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:272:2: rule__ComboWidget__Group__0
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group__0_in_ruleComboWidget514);
            rule__ComboWidget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComboWidgetAccess().getGroup()); 

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
    // $ANTLR end "ruleComboWidget"


    // $ANTLR start "rule__Widget__Alternatives"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:284:1: rule__Widget__Alternatives : ( ( ruleTextFieldWidget ) | ( ruleCheckBoxWidget ) | ( ruleComboWidget ) );
    public final void rule__Widget__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:288:1: ( ( ruleTextFieldWidget ) | ( ruleCheckBoxWidget ) | ( ruleComboWidget ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:289:1: ( ruleTextFieldWidget )
                    {
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:289:1: ( ruleTextFieldWidget )
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:290:1: ruleTextFieldWidget
                    {
                     before(grammarAccess.getWidgetAccess().getTextFieldWidgetParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTextFieldWidget_in_rule__Widget__Alternatives550);
                    ruleTextFieldWidget();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getTextFieldWidgetParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:295:6: ( ruleCheckBoxWidget )
                    {
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:295:6: ( ruleCheckBoxWidget )
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:296:1: ruleCheckBoxWidget
                    {
                     before(grammarAccess.getWidgetAccess().getCheckBoxWidgetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCheckBoxWidget_in_rule__Widget__Alternatives567);
                    ruleCheckBoxWidget();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getCheckBoxWidgetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:301:6: ( ruleComboWidget )
                    {
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:301:6: ( ruleComboWidget )
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:302:1: ruleComboWidget
                    {
                     before(grammarAccess.getWidgetAccess().getComboWidgetParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleComboWidget_in_rule__Widget__Alternatives584);
                    ruleComboWidget();

                    state._fsp--;

                     after(grammarAccess.getWidgetAccess().getComboWidgetParserRuleCall_2()); 

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
    // $ANTLR end "rule__Widget__Alternatives"


    // $ANTLR start "rule__Form__Group__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:314:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:318:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:319:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__0614);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__1_in_rule__Form__Group__0617);
            rule__Form__Group__1();

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
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:326:1: rule__Form__Group__0__Impl : ( 'form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:330:1: ( ( 'form' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:331:1: ( 'form' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:331:1: ( 'form' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:332:1: 'form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Form__Group__0__Impl645); 
             after(grammarAccess.getFormAccess().getFormKeyword_0()); 

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
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:345:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:349:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:350:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__1676);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__2_in_rule__Form__Group__1679);
            rule__Form__Group__2();

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
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:357:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:361:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:362:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:362:1: ( ( rule__Form__NameAssignment_1 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:363:1: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:364:1: ( rule__Form__NameAssignment_1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:364:2: rule__Form__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Form__NameAssignment_1_in_rule__Form__Group__1__Impl706);
            rule__Form__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:374:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:378:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:379:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__2736);
            rule__Form__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Form__Group__3_in_rule__Form__Group__2739);
            rule__Form__Group__3();

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
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:386:1: rule__Form__Group__2__Impl : ( ( rule__Form__UsedEntitiesAssignment_2 )* ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:390:1: ( ( ( rule__Form__UsedEntitiesAssignment_2 )* ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:391:1: ( ( rule__Form__UsedEntitiesAssignment_2 )* )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:391:1: ( ( rule__Form__UsedEntitiesAssignment_2 )* )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:392:1: ( rule__Form__UsedEntitiesAssignment_2 )*
            {
             before(grammarAccess.getFormAccess().getUsedEntitiesAssignment_2()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:393:1: ( rule__Form__UsedEntitiesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:393:2: rule__Form__UsedEntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Form__UsedEntitiesAssignment_2_in_rule__Form__Group__2__Impl766);
            	    rule__Form__UsedEntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFormAccess().getUsedEntitiesAssignment_2()); 

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
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__3"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:403:1: rule__Form__Group__3 : rule__Form__Group__3__Impl ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:407:1: ( rule__Form__Group__3__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:408:2: rule__Form__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__3797);
            rule__Form__Group__3__Impl();

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
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:414:1: rule__Form__Group__3__Impl : ( ( rule__Form__FieldsAssignment_3 )* ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:418:1: ( ( ( rule__Form__FieldsAssignment_3 )* ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:419:1: ( ( rule__Form__FieldsAssignment_3 )* )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:419:1: ( ( rule__Form__FieldsAssignment_3 )* )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:420:1: ( rule__Form__FieldsAssignment_3 )*
            {
             before(grammarAccess.getFormAccess().getFieldsAssignment_3()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:421:1: ( rule__Form__FieldsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:421:2: rule__Form__FieldsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Form__FieldsAssignment_3_in_rule__Form__Group__3__Impl824);
            	    rule__Form__FieldsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getFormAccess().getFieldsAssignment_3()); 

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
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__EntityReference__Group__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:439:1: rule__EntityReference__Group__0 : rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 ;
    public final void rule__EntityReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:443:1: ( rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:444:2: rule__EntityReference__Group__0__Impl rule__EntityReference__Group__1
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__0863);
            rule__EntityReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__0866);
            rule__EntityReference__Group__1();

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
    // $ANTLR end "rule__EntityReference__Group__0"


    // $ANTLR start "rule__EntityReference__Group__0__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:451:1: rule__EntityReference__Group__0__Impl : ( 'uses' ) ;
    public final void rule__EntityReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:455:1: ( ( 'uses' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:456:1: ( 'uses' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:456:1: ( 'uses' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:457:1: 'uses'
            {
             before(grammarAccess.getEntityReferenceAccess().getUsesKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__EntityReference__Group__0__Impl894); 
             after(grammarAccess.getEntityReferenceAccess().getUsesKeyword_0()); 

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
    // $ANTLR end "rule__EntityReference__Group__0__Impl"


    // $ANTLR start "rule__EntityReference__Group__1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:470:1: rule__EntityReference__Group__1 : rule__EntityReference__Group__1__Impl ;
    public final void rule__EntityReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:474:1: ( rule__EntityReference__Group__1__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:475:2: rule__EntityReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__1925);
            rule__EntityReference__Group__1__Impl();

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
    // $ANTLR end "rule__EntityReference__Group__1"


    // $ANTLR start "rule__EntityReference__Group__1__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:481:1: rule__EntityReference__Group__1__Impl : ( ( rule__EntityReference__EntityAssignment_1 ) ) ;
    public final void rule__EntityReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:485:1: ( ( ( rule__EntityReference__EntityAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:486:1: ( ( rule__EntityReference__EntityAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:486:1: ( ( rule__EntityReference__EntityAssignment_1 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:487:1: ( rule__EntityReference__EntityAssignment_1 )
            {
             before(grammarAccess.getEntityReferenceAccess().getEntityAssignment_1()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:488:1: ( rule__EntityReference__EntityAssignment_1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:488:2: rule__EntityReference__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__EntityReference__EntityAssignment_1_in_rule__EntityReference__Group__1__Impl952);
            rule__EntityReference__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityReferenceAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__EntityReference__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:502:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:506:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:507:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0986);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0989);
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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:514:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:518:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:519:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:519:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:520:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1016); 
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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:531:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:535:1: ( rule__FQN__Group__1__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:536:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11045);
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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:542:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:546:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:547:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:547:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:548:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:549:1: ( rule__FQN__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:549:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1072);
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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:563:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:567:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:568:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01107);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01110);
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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:575:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:579:1: ( ( '.' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:580:1: ( '.' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:580:1: ( '.' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:581:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,13,FOLLOW_13_in_rule__FQN__Group_1__0__Impl1138); 
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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:594:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:598:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:599:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11169);
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
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:605:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:609:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:610:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:610:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:611:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1196); 
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


    // $ANTLR start "rule__Field__Group__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:626:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:630:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:631:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01229);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01232);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:638:1: rule__Field__Group__0__Impl : ( 'field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:642:1: ( ( 'field' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:643:1: ( 'field' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:643:1: ( 'field' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:644:1: 'field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Field__Group__0__Impl1260); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:657:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:661:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:662:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11291);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11294);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:669:1: rule__Field__Group__1__Impl : ( ( rule__Field__LabelAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:673:1: ( ( ( rule__Field__LabelAssignment_1 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:674:1: ( ( rule__Field__LabelAssignment_1 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:674:1: ( ( rule__Field__LabelAssignment_1 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:675:1: ( rule__Field__LabelAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getLabelAssignment_1()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:676:1: ( rule__Field__LabelAssignment_1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:676:2: rule__Field__LabelAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__LabelAssignment_1_in_rule__Field__Group__1__Impl1321);
            rule__Field__LabelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getLabelAssignment_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:686:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:690:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:691:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21351);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21354);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:698:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:702:1: ( ( ':' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:703:1: ( ':' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:703:1: ( ':' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:704:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group__2__Impl1382); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:717:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:721:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:722:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31413);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31416);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:729:1: rule__Field__Group__3__Impl : ( ( rule__Field__WidgetAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:733:1: ( ( ( rule__Field__WidgetAssignment_3 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:734:1: ( ( rule__Field__WidgetAssignment_3 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:734:1: ( ( rule__Field__WidgetAssignment_3 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:735:1: ( rule__Field__WidgetAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getWidgetAssignment_3()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:736:1: ( rule__Field__WidgetAssignment_3 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:736:2: rule__Field__WidgetAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__WidgetAssignment_3_in_rule__Field__Group__3__Impl1443);
            rule__Field__WidgetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getWidgetAssignment_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:746:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:750:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:751:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41473);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41476);
            rule__Field__Group__5();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:758:1: rule__Field__Group__4__Impl : ( '->' ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:762:1: ( ( '->' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:763:1: ( '->' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:763:1: ( '->' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:764:1: '->'
            {
             before(grammarAccess.getFieldAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Field__Group__4__Impl1504); 
             after(grammarAccess.getFieldAccess().getHyphenMinusGreaterThanSignKeyword_4()); 

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
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:777:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:781:1: ( rule__Field__Group__5__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:782:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51535);
            rule__Field__Group__5__Impl();

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
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:788:1: rule__Field__Group__5__Impl : ( ( rule__Field__AttributeAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:792:1: ( ( ( rule__Field__AttributeAssignment_5 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:793:1: ( ( rule__Field__AttributeAssignment_5 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:793:1: ( ( rule__Field__AttributeAssignment_5 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:794:1: ( rule__Field__AttributeAssignment_5 )
            {
             before(grammarAccess.getFieldAccess().getAttributeAssignment_5()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:795:1: ( rule__Field__AttributeAssignment_5 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:795:2: rule__Field__AttributeAssignment_5
            {
            pushFollow(FOLLOW_rule__Field__AttributeAssignment_5_in_rule__Field__Group__5__Impl1562);
            rule__Field__AttributeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAttributeAssignment_5()); 

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
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__TextFieldWidget__Group__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:817:1: rule__TextFieldWidget__Group__0 : rule__TextFieldWidget__Group__0__Impl rule__TextFieldWidget__Group__1 ;
    public final void rule__TextFieldWidget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:821:1: ( rule__TextFieldWidget__Group__0__Impl rule__TextFieldWidget__Group__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:822:2: rule__TextFieldWidget__Group__0__Impl rule__TextFieldWidget__Group__1
            {
            pushFollow(FOLLOW_rule__TextFieldWidget__Group__0__Impl_in_rule__TextFieldWidget__Group__01604);
            rule__TextFieldWidget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextFieldWidget__Group__1_in_rule__TextFieldWidget__Group__01607);
            rule__TextFieldWidget__Group__1();

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
    // $ANTLR end "rule__TextFieldWidget__Group__0"


    // $ANTLR start "rule__TextFieldWidget__Group__0__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:829:1: rule__TextFieldWidget__Group__0__Impl : ( 'textfield' ) ;
    public final void rule__TextFieldWidget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:833:1: ( ( 'textfield' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:834:1: ( 'textfield' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:834:1: ( 'textfield' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:835:1: 'textfield'
            {
             before(grammarAccess.getTextFieldWidgetAccess().getTextfieldKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__TextFieldWidget__Group__0__Impl1635); 
             after(grammarAccess.getTextFieldWidgetAccess().getTextfieldKeyword_0()); 

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
    // $ANTLR end "rule__TextFieldWidget__Group__0__Impl"


    // $ANTLR start "rule__TextFieldWidget__Group__1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:848:1: rule__TextFieldWidget__Group__1 : rule__TextFieldWidget__Group__1__Impl rule__TextFieldWidget__Group__2 ;
    public final void rule__TextFieldWidget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:852:1: ( rule__TextFieldWidget__Group__1__Impl rule__TextFieldWidget__Group__2 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:853:2: rule__TextFieldWidget__Group__1__Impl rule__TextFieldWidget__Group__2
            {
            pushFollow(FOLLOW_rule__TextFieldWidget__Group__1__Impl_in_rule__TextFieldWidget__Group__11666);
            rule__TextFieldWidget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextFieldWidget__Group__2_in_rule__TextFieldWidget__Group__11669);
            rule__TextFieldWidget__Group__2();

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
    // $ANTLR end "rule__TextFieldWidget__Group__1"


    // $ANTLR start "rule__TextFieldWidget__Group__1__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:860:1: rule__TextFieldWidget__Group__1__Impl : ( '(' ) ;
    public final void rule__TextFieldWidget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:864:1: ( ( '(' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:865:1: ( '(' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:865:1: ( '(' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:866:1: '('
            {
             before(grammarAccess.getTextFieldWidgetAccess().getLeftParenthesisKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__TextFieldWidget__Group__1__Impl1697); 
             after(grammarAccess.getTextFieldWidgetAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__TextFieldWidget__Group__1__Impl"


    // $ANTLR start "rule__TextFieldWidget__Group__2"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:879:1: rule__TextFieldWidget__Group__2 : rule__TextFieldWidget__Group__2__Impl rule__TextFieldWidget__Group__3 ;
    public final void rule__TextFieldWidget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:883:1: ( rule__TextFieldWidget__Group__2__Impl rule__TextFieldWidget__Group__3 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:884:2: rule__TextFieldWidget__Group__2__Impl rule__TextFieldWidget__Group__3
            {
            pushFollow(FOLLOW_rule__TextFieldWidget__Group__2__Impl_in_rule__TextFieldWidget__Group__21728);
            rule__TextFieldWidget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextFieldWidget__Group__3_in_rule__TextFieldWidget__Group__21731);
            rule__TextFieldWidget__Group__3();

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
    // $ANTLR end "rule__TextFieldWidget__Group__2"


    // $ANTLR start "rule__TextFieldWidget__Group__2__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:891:1: rule__TextFieldWidget__Group__2__Impl : ( ( rule__TextFieldWidget__LengthAssignment_2 ) ) ;
    public final void rule__TextFieldWidget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:895:1: ( ( ( rule__TextFieldWidget__LengthAssignment_2 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:896:1: ( ( rule__TextFieldWidget__LengthAssignment_2 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:896:1: ( ( rule__TextFieldWidget__LengthAssignment_2 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:897:1: ( rule__TextFieldWidget__LengthAssignment_2 )
            {
             before(grammarAccess.getTextFieldWidgetAccess().getLengthAssignment_2()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:898:1: ( rule__TextFieldWidget__LengthAssignment_2 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:898:2: rule__TextFieldWidget__LengthAssignment_2
            {
            pushFollow(FOLLOW_rule__TextFieldWidget__LengthAssignment_2_in_rule__TextFieldWidget__Group__2__Impl1758);
            rule__TextFieldWidget__LengthAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldWidgetAccess().getLengthAssignment_2()); 

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
    // $ANTLR end "rule__TextFieldWidget__Group__2__Impl"


    // $ANTLR start "rule__TextFieldWidget__Group__3"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:908:1: rule__TextFieldWidget__Group__3 : rule__TextFieldWidget__Group__3__Impl ;
    public final void rule__TextFieldWidget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:912:1: ( rule__TextFieldWidget__Group__3__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:913:2: rule__TextFieldWidget__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TextFieldWidget__Group__3__Impl_in_rule__TextFieldWidget__Group__31788);
            rule__TextFieldWidget__Group__3__Impl();

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
    // $ANTLR end "rule__TextFieldWidget__Group__3"


    // $ANTLR start "rule__TextFieldWidget__Group__3__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:919:1: rule__TextFieldWidget__Group__3__Impl : ( ')' ) ;
    public final void rule__TextFieldWidget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:923:1: ( ( ')' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:924:1: ( ')' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:924:1: ( ')' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:925:1: ')'
            {
             before(grammarAccess.getTextFieldWidgetAccess().getRightParenthesisKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__TextFieldWidget__Group__3__Impl1816); 
             after(grammarAccess.getTextFieldWidgetAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__TextFieldWidget__Group__3__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:946:1: rule__CheckBoxWidget__Group__0 : rule__CheckBoxWidget__Group__0__Impl rule__CheckBoxWidget__Group__1 ;
    public final void rule__CheckBoxWidget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:950:1: ( rule__CheckBoxWidget__Group__0__Impl rule__CheckBoxWidget__Group__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:951:2: rule__CheckBoxWidget__Group__0__Impl rule__CheckBoxWidget__Group__1
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__0__Impl_in_rule__CheckBoxWidget__Group__01855);
            rule__CheckBoxWidget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__1_in_rule__CheckBoxWidget__Group__01858);
            rule__CheckBoxWidget__Group__1();

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
    // $ANTLR end "rule__CheckBoxWidget__Group__0"


    // $ANTLR start "rule__CheckBoxWidget__Group__0__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:958:1: rule__CheckBoxWidget__Group__0__Impl : ( () ) ;
    public final void rule__CheckBoxWidget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:962:1: ( ( () ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:963:1: ( () )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:963:1: ( () )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:964:1: ()
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getCheckBoxWidgetAction_0()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:965:1: ()
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:967:1: 
            {
            }

             after(grammarAccess.getCheckBoxWidgetAccess().getCheckBoxWidgetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBoxWidget__Group__0__Impl"


    // $ANTLR start "rule__CheckBoxWidget__Group__1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:977:1: rule__CheckBoxWidget__Group__1 : rule__CheckBoxWidget__Group__1__Impl ;
    public final void rule__CheckBoxWidget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:981:1: ( rule__CheckBoxWidget__Group__1__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:982:2: rule__CheckBoxWidget__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CheckBoxWidget__Group__1__Impl_in_rule__CheckBoxWidget__Group__11916);
            rule__CheckBoxWidget__Group__1__Impl();

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
    // $ANTLR end "rule__CheckBoxWidget__Group__1"


    // $ANTLR start "rule__CheckBoxWidget__Group__1__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:988:1: rule__CheckBoxWidget__Group__1__Impl : ( 'checkbox' ) ;
    public final void rule__CheckBoxWidget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:992:1: ( ( 'checkbox' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:993:1: ( 'checkbox' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:993:1: ( 'checkbox' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:994:1: 'checkbox'
            {
             before(grammarAccess.getCheckBoxWidgetAccess().getCheckboxKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__CheckBoxWidget__Group__1__Impl1944); 
             after(grammarAccess.getCheckBoxWidgetAccess().getCheckboxKeyword_1()); 

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
    // $ANTLR end "rule__CheckBoxWidget__Group__1__Impl"


    // $ANTLR start "rule__ComboWidget__Group__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1011:1: rule__ComboWidget__Group__0 : rule__ComboWidget__Group__0__Impl rule__ComboWidget__Group__1 ;
    public final void rule__ComboWidget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1015:1: ( rule__ComboWidget__Group__0__Impl rule__ComboWidget__Group__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1016:2: rule__ComboWidget__Group__0__Impl rule__ComboWidget__Group__1
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group__0__Impl_in_rule__ComboWidget__Group__01979);
            rule__ComboWidget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboWidget__Group__1_in_rule__ComboWidget__Group__01982);
            rule__ComboWidget__Group__1();

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
    // $ANTLR end "rule__ComboWidget__Group__0"


    // $ANTLR start "rule__ComboWidget__Group__0__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1023:1: rule__ComboWidget__Group__0__Impl : ( () ) ;
    public final void rule__ComboWidget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1027:1: ( ( () ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1028:1: ( () )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1028:1: ( () )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1029:1: ()
            {
             before(grammarAccess.getComboWidgetAccess().getComboWidgetAction_0()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1030:1: ()
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1032:1: 
            {
            }

             after(grammarAccess.getComboWidgetAccess().getComboWidgetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboWidget__Group__0__Impl"


    // $ANTLR start "rule__ComboWidget__Group__1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1042:1: rule__ComboWidget__Group__1 : rule__ComboWidget__Group__1__Impl rule__ComboWidget__Group__2 ;
    public final void rule__ComboWidget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1046:1: ( rule__ComboWidget__Group__1__Impl rule__ComboWidget__Group__2 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1047:2: rule__ComboWidget__Group__1__Impl rule__ComboWidget__Group__2
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group__1__Impl_in_rule__ComboWidget__Group__12040);
            rule__ComboWidget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboWidget__Group__2_in_rule__ComboWidget__Group__12043);
            rule__ComboWidget__Group__2();

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
    // $ANTLR end "rule__ComboWidget__Group__1"


    // $ANTLR start "rule__ComboWidget__Group__1__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1054:1: rule__ComboWidget__Group__1__Impl : ( 'combobox' ) ;
    public final void rule__ComboWidget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1058:1: ( ( 'combobox' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1059:1: ( 'combobox' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1059:1: ( 'combobox' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1060:1: 'combobox'
            {
             before(grammarAccess.getComboWidgetAccess().getComboboxKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ComboWidget__Group__1__Impl2071); 
             after(grammarAccess.getComboWidgetAccess().getComboboxKeyword_1()); 

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
    // $ANTLR end "rule__ComboWidget__Group__1__Impl"


    // $ANTLR start "rule__ComboWidget__Group__2"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1073:1: rule__ComboWidget__Group__2 : rule__ComboWidget__Group__2__Impl rule__ComboWidget__Group__3 ;
    public final void rule__ComboWidget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1077:1: ( rule__ComboWidget__Group__2__Impl rule__ComboWidget__Group__3 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1078:2: rule__ComboWidget__Group__2__Impl rule__ComboWidget__Group__3
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group__2__Impl_in_rule__ComboWidget__Group__22102);
            rule__ComboWidget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboWidget__Group__3_in_rule__ComboWidget__Group__22105);
            rule__ComboWidget__Group__3();

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
    // $ANTLR end "rule__ComboWidget__Group__2"


    // $ANTLR start "rule__ComboWidget__Group__2__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1085:1: rule__ComboWidget__Group__2__Impl : ( '(' ) ;
    public final void rule__ComboWidget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1089:1: ( ( '(' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1090:1: ( '(' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1090:1: ( '(' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1091:1: '('
            {
             before(grammarAccess.getComboWidgetAccess().getLeftParenthesisKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__ComboWidget__Group__2__Impl2133); 
             after(grammarAccess.getComboWidgetAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ComboWidget__Group__2__Impl"


    // $ANTLR start "rule__ComboWidget__Group__3"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1104:1: rule__ComboWidget__Group__3 : rule__ComboWidget__Group__3__Impl rule__ComboWidget__Group__4 ;
    public final void rule__ComboWidget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1108:1: ( rule__ComboWidget__Group__3__Impl rule__ComboWidget__Group__4 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1109:2: rule__ComboWidget__Group__3__Impl rule__ComboWidget__Group__4
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group__3__Impl_in_rule__ComboWidget__Group__32164);
            rule__ComboWidget__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboWidget__Group__4_in_rule__ComboWidget__Group__32167);
            rule__ComboWidget__Group__4();

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
    // $ANTLR end "rule__ComboWidget__Group__3"


    // $ANTLR start "rule__ComboWidget__Group__3__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1116:1: rule__ComboWidget__Group__3__Impl : ( ( rule__ComboWidget__Group_3__0 )? ) ;
    public final void rule__ComboWidget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1120:1: ( ( ( rule__ComboWidget__Group_3__0 )? ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1121:1: ( ( rule__ComboWidget__Group_3__0 )? )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1121:1: ( ( rule__ComboWidget__Group_3__0 )? )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1122:1: ( rule__ComboWidget__Group_3__0 )?
            {
             before(grammarAccess.getComboWidgetAccess().getGroup_3()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1123:1: ( rule__ComboWidget__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1123:2: rule__ComboWidget__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ComboWidget__Group_3__0_in_rule__ComboWidget__Group__3__Impl2194);
                    rule__ComboWidget__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComboWidgetAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ComboWidget__Group__3__Impl"


    // $ANTLR start "rule__ComboWidget__Group__4"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1133:1: rule__ComboWidget__Group__4 : rule__ComboWidget__Group__4__Impl ;
    public final void rule__ComboWidget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1137:1: ( rule__ComboWidget__Group__4__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1138:2: rule__ComboWidget__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group__4__Impl_in_rule__ComboWidget__Group__42225);
            rule__ComboWidget__Group__4__Impl();

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
    // $ANTLR end "rule__ComboWidget__Group__4"


    // $ANTLR start "rule__ComboWidget__Group__4__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1144:1: rule__ComboWidget__Group__4__Impl : ( ')' ) ;
    public final void rule__ComboWidget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1148:1: ( ( ')' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1149:1: ( ')' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1149:1: ( ')' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1150:1: ')'
            {
             before(grammarAccess.getComboWidgetAccess().getRightParenthesisKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__ComboWidget__Group__4__Impl2253); 
             after(grammarAccess.getComboWidgetAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__ComboWidget__Group__4__Impl"


    // $ANTLR start "rule__ComboWidget__Group_3__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1173:1: rule__ComboWidget__Group_3__0 : rule__ComboWidget__Group_3__0__Impl rule__ComboWidget__Group_3__1 ;
    public final void rule__ComboWidget__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1177:1: ( rule__ComboWidget__Group_3__0__Impl rule__ComboWidget__Group_3__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1178:2: rule__ComboWidget__Group_3__0__Impl rule__ComboWidget__Group_3__1
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group_3__0__Impl_in_rule__ComboWidget__Group_3__02294);
            rule__ComboWidget__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboWidget__Group_3__1_in_rule__ComboWidget__Group_3__02297);
            rule__ComboWidget__Group_3__1();

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
    // $ANTLR end "rule__ComboWidget__Group_3__0"


    // $ANTLR start "rule__ComboWidget__Group_3__0__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1185:1: rule__ComboWidget__Group_3__0__Impl : ( ( rule__ComboWidget__ValuesAssignment_3_0 ) ) ;
    public final void rule__ComboWidget__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1189:1: ( ( ( rule__ComboWidget__ValuesAssignment_3_0 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1190:1: ( ( rule__ComboWidget__ValuesAssignment_3_0 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1190:1: ( ( rule__ComboWidget__ValuesAssignment_3_0 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1191:1: ( rule__ComboWidget__ValuesAssignment_3_0 )
            {
             before(grammarAccess.getComboWidgetAccess().getValuesAssignment_3_0()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1192:1: ( rule__ComboWidget__ValuesAssignment_3_0 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1192:2: rule__ComboWidget__ValuesAssignment_3_0
            {
            pushFollow(FOLLOW_rule__ComboWidget__ValuesAssignment_3_0_in_rule__ComboWidget__Group_3__0__Impl2324);
            rule__ComboWidget__ValuesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getComboWidgetAccess().getValuesAssignment_3_0()); 

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
    // $ANTLR end "rule__ComboWidget__Group_3__0__Impl"


    // $ANTLR start "rule__ComboWidget__Group_3__1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1202:1: rule__ComboWidget__Group_3__1 : rule__ComboWidget__Group_3__1__Impl ;
    public final void rule__ComboWidget__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1206:1: ( rule__ComboWidget__Group_3__1__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1207:2: rule__ComboWidget__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group_3__1__Impl_in_rule__ComboWidget__Group_3__12354);
            rule__ComboWidget__Group_3__1__Impl();

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
    // $ANTLR end "rule__ComboWidget__Group_3__1"


    // $ANTLR start "rule__ComboWidget__Group_3__1__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1213:1: rule__ComboWidget__Group_3__1__Impl : ( ( rule__ComboWidget__Group_3_1__0 )* ) ;
    public final void rule__ComboWidget__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1217:1: ( ( ( rule__ComboWidget__Group_3_1__0 )* ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1218:1: ( ( rule__ComboWidget__Group_3_1__0 )* )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1218:1: ( ( rule__ComboWidget__Group_3_1__0 )* )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1219:1: ( rule__ComboWidget__Group_3_1__0 )*
            {
             before(grammarAccess.getComboWidgetAccess().getGroup_3_1()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1220:1: ( rule__ComboWidget__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1220:2: rule__ComboWidget__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ComboWidget__Group_3_1__0_in_rule__ComboWidget__Group_3__1__Impl2381);
            	    rule__ComboWidget__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComboWidgetAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__ComboWidget__Group_3__1__Impl"


    // $ANTLR start "rule__ComboWidget__Group_3_1__0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1234:1: rule__ComboWidget__Group_3_1__0 : rule__ComboWidget__Group_3_1__0__Impl rule__ComboWidget__Group_3_1__1 ;
    public final void rule__ComboWidget__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1238:1: ( rule__ComboWidget__Group_3_1__0__Impl rule__ComboWidget__Group_3_1__1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1239:2: rule__ComboWidget__Group_3_1__0__Impl rule__ComboWidget__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group_3_1__0__Impl_in_rule__ComboWidget__Group_3_1__02416);
            rule__ComboWidget__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComboWidget__Group_3_1__1_in_rule__ComboWidget__Group_3_1__02419);
            rule__ComboWidget__Group_3_1__1();

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
    // $ANTLR end "rule__ComboWidget__Group_3_1__0"


    // $ANTLR start "rule__ComboWidget__Group_3_1__0__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1246:1: rule__ComboWidget__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ComboWidget__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1250:1: ( ( ',' ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1251:1: ( ',' )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1251:1: ( ',' )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1252:1: ','
            {
             before(grammarAccess.getComboWidgetAccess().getCommaKeyword_3_1_0()); 
            match(input,22,FOLLOW_22_in_rule__ComboWidget__Group_3_1__0__Impl2447); 
             after(grammarAccess.getComboWidgetAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__ComboWidget__Group_3_1__0__Impl"


    // $ANTLR start "rule__ComboWidget__Group_3_1__1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1265:1: rule__ComboWidget__Group_3_1__1 : rule__ComboWidget__Group_3_1__1__Impl ;
    public final void rule__ComboWidget__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1269:1: ( rule__ComboWidget__Group_3_1__1__Impl )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1270:2: rule__ComboWidget__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ComboWidget__Group_3_1__1__Impl_in_rule__ComboWidget__Group_3_1__12478);
            rule__ComboWidget__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__ComboWidget__Group_3_1__1"


    // $ANTLR start "rule__ComboWidget__Group_3_1__1__Impl"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1276:1: rule__ComboWidget__Group_3_1__1__Impl : ( ( rule__ComboWidget__ValuesAssignment_3_1_1 ) ) ;
    public final void rule__ComboWidget__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1280:1: ( ( ( rule__ComboWidget__ValuesAssignment_3_1_1 ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1281:1: ( ( rule__ComboWidget__ValuesAssignment_3_1_1 ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1281:1: ( ( rule__ComboWidget__ValuesAssignment_3_1_1 ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1282:1: ( rule__ComboWidget__ValuesAssignment_3_1_1 )
            {
             before(grammarAccess.getComboWidgetAccess().getValuesAssignment_3_1_1()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1283:1: ( rule__ComboWidget__ValuesAssignment_3_1_1 )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1283:2: rule__ComboWidget__ValuesAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__ComboWidget__ValuesAssignment_3_1_1_in_rule__ComboWidget__Group_3_1__1__Impl2505);
            rule__ComboWidget__ValuesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComboWidgetAccess().getValuesAssignment_3_1_1()); 

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
    // $ANTLR end "rule__ComboWidget__Group_3_1__1__Impl"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1298:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1302:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1303:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1303:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1304:1: RULE_ID
            {
             before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Form__NameAssignment_12544); 
             after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Form__NameAssignment_1"


    // $ANTLR start "rule__Form__UsedEntitiesAssignment_2"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1313:1: rule__Form__UsedEntitiesAssignment_2 : ( ruleEntityReference ) ;
    public final void rule__Form__UsedEntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1317:1: ( ( ruleEntityReference ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1318:1: ( ruleEntityReference )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1318:1: ( ruleEntityReference )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1319:1: ruleEntityReference
            {
             before(grammarAccess.getFormAccess().getUsedEntitiesEntityReferenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntityReference_in_rule__Form__UsedEntitiesAssignment_22575);
            ruleEntityReference();

            state._fsp--;

             after(grammarAccess.getFormAccess().getUsedEntitiesEntityReferenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Form__UsedEntitiesAssignment_2"


    // $ANTLR start "rule__Form__FieldsAssignment_3"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1328:1: rule__Form__FieldsAssignment_3 : ( ruleField ) ;
    public final void rule__Form__FieldsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1332:1: ( ( ruleField ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1333:1: ( ruleField )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1333:1: ( ruleField )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1334:1: ruleField
            {
             before(grammarAccess.getFormAccess().getFieldsFieldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Form__FieldsAssignment_32606);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFormAccess().getFieldsFieldParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Form__FieldsAssignment_3"


    // $ANTLR start "rule__EntityReference__EntityAssignment_1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1343:1: rule__EntityReference__EntityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__EntityReference__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1347:1: ( ( ( ruleFQN ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1348:1: ( ( ruleFQN ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1348:1: ( ( ruleFQN ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1349:1: ( ruleFQN )
            {
             before(grammarAccess.getEntityReferenceAccess().getEntityEntityCrossReference_1_0()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1350:1: ( ruleFQN )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1351:1: ruleFQN
            {
             before(grammarAccess.getEntityReferenceAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__EntityReference__EntityAssignment_12641);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getEntityReferenceAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityReferenceAccess().getEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__EntityReference__EntityAssignment_1"


    // $ANTLR start "rule__Field__LabelAssignment_1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1362:1: rule__Field__LabelAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1366:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1367:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1367:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1368:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getLabelIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__LabelAssignment_12676); 
             after(grammarAccess.getFieldAccess().getLabelIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Field__LabelAssignment_1"


    // $ANTLR start "rule__Field__WidgetAssignment_3"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1377:1: rule__Field__WidgetAssignment_3 : ( ruleWidget ) ;
    public final void rule__Field__WidgetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1381:1: ( ( ruleWidget ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1382:1: ( ruleWidget )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1382:1: ( ruleWidget )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1383:1: ruleWidget
            {
             before(grammarAccess.getFieldAccess().getWidgetWidgetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWidget_in_rule__Field__WidgetAssignment_32707);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getWidgetWidgetParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Field__WidgetAssignment_3"


    // $ANTLR start "rule__Field__AttributeAssignment_5"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1392:1: rule__Field__AttributeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__Field__AttributeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1396:1: ( ( ( ruleFQN ) ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1397:1: ( ( ruleFQN ) )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1397:1: ( ( ruleFQN ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1398:1: ( ruleFQN )
            {
             before(grammarAccess.getFieldAccess().getAttributeAttributeCrossReference_5_0()); 
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1399:1: ( ruleFQN )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1400:1: ruleFQN
            {
             before(grammarAccess.getFieldAccess().getAttributeAttributeFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Field__AttributeAssignment_52742);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getAttributeAttributeFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getAttributeAttributeCrossReference_5_0()); 

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
    // $ANTLR end "rule__Field__AttributeAssignment_5"


    // $ANTLR start "rule__TextFieldWidget__LengthAssignment_2"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1411:1: rule__TextFieldWidget__LengthAssignment_2 : ( RULE_INT ) ;
    public final void rule__TextFieldWidget__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1415:1: ( ( RULE_INT ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1416:1: ( RULE_INT )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1416:1: ( RULE_INT )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1417:1: RULE_INT
            {
             before(grammarAccess.getTextFieldWidgetAccess().getLengthINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TextFieldWidget__LengthAssignment_22777); 
             after(grammarAccess.getTextFieldWidgetAccess().getLengthINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TextFieldWidget__LengthAssignment_2"


    // $ANTLR start "rule__ComboWidget__ValuesAssignment_3_0"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1426:1: rule__ComboWidget__ValuesAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__ComboWidget__ValuesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1430:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1431:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1431:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1432:1: RULE_ID
            {
             before(grammarAccess.getComboWidgetAccess().getValuesIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComboWidget__ValuesAssignment_3_02808); 
             after(grammarAccess.getComboWidgetAccess().getValuesIDTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__ComboWidget__ValuesAssignment_3_0"


    // $ANTLR start "rule__ComboWidget__ValuesAssignment_3_1_1"
    // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1441:1: rule__ComboWidget__ValuesAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__ComboWidget__ValuesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1445:1: ( ( RULE_ID ) )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1446:1: ( RULE_ID )
            {
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1446:1: ( RULE_ID )
            // ../org.xtext.example.lmrc.uispec.ui/src-gen/org/xtext/example/lmrc/uispec/ui/contentassist/antlr/internal/InternalUispecDsl.g:1447:1: RULE_ID
            {
             before(grammarAccess.getComboWidgetAccess().getValuesIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ComboWidget__ValuesAssignment_3_1_12839); 
             after(grammarAccess.getComboWidgetAccess().getValuesIDTerminalRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__ComboWidget__ValuesAssignment_3_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleForm_in_entryRuleForm61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForm68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__0_in_ruleForm94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_entryRuleEntityReference121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityReference128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0_in_ruleEntityReference154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_entryRuleWidget301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidget308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Widget__Alternatives_in_ruleWidget334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextFieldWidget_in_entryRuleTextFieldWidget361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextFieldWidget368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__Group__0_in_ruleTextFieldWidget394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxWidget_in_entryRuleCheckBoxWidget421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheckBoxWidget428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__0_in_ruleCheckBoxWidget454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboWidget_in_entryRuleComboWidget481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComboWidget488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__0_in_ruleComboWidget514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextFieldWidget_in_rule__Widget__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheckBoxWidget_in_rule__Widget__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComboWidget_in_rule__Widget__Alternatives584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__0614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Form__Group__1_in_rule__Form__Group__0617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Form__Group__0__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__1676 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Form__Group__2_in_rule__Form__Group__1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__NameAssignment_1_in_rule__Form__Group__1__Impl706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__2736 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Form__Group__3_in_rule__Form__Group__2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__UsedEntitiesAssignment_2_in_rule__Form__Group__2__Impl766 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Form__FieldsAssignment_3_in_rule__Form__Group__3__Impl824 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__0__Impl_in_rule__EntityReference__Group__0863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1_in_rule__EntityReference__Group__0866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EntityReference__Group__0__Impl894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__Group__1__Impl_in_rule__EntityReference__Group__1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityReference__EntityAssignment_1_in_rule__EntityReference__Group__1__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__0986 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__0989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1072 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FQN__Group_1__0__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__01229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__01232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Field__Group__0__Impl1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__11291 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__11294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LabelAssignment_1_in_rule__Field__Group__1__Impl1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__21351 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__21354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group__2__Impl1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__31413 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__31416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__WidgetAssignment_3_in_rule__Field__Group__3__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__41473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__41476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Field__Group__4__Impl1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__51535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__AttributeAssignment_5_in_rule__Field__Group__5__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__Group__0__Impl_in_rule__TextFieldWidget__Group__01604 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__Group__1_in_rule__TextFieldWidget__Group__01607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TextFieldWidget__Group__0__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__Group__1__Impl_in_rule__TextFieldWidget__Group__11666 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__Group__2_in_rule__TextFieldWidget__Group__11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TextFieldWidget__Group__1__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__Group__2__Impl_in_rule__TextFieldWidget__Group__21728 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__Group__3_in_rule__TextFieldWidget__Group__21731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__LengthAssignment_2_in_rule__TextFieldWidget__Group__2__Impl1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextFieldWidget__Group__3__Impl_in_rule__TextFieldWidget__Group__31788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TextFieldWidget__Group__3__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__0__Impl_in_rule__CheckBoxWidget__Group__01855 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__1_in_rule__CheckBoxWidget__Group__01858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CheckBoxWidget__Group__1__Impl_in_rule__CheckBoxWidget__Group__11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CheckBoxWidget__Group__1__Impl1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__0__Impl_in_rule__ComboWidget__Group__01979 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__1_in_rule__ComboWidget__Group__01982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__1__Impl_in_rule__ComboWidget__Group__12040 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__2_in_rule__ComboWidget__Group__12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ComboWidget__Group__1__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__2__Impl_in_rule__ComboWidget__Group__22102 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__3_in_rule__ComboWidget__Group__22105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ComboWidget__Group__2__Impl2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__3__Impl_in_rule__ComboWidget__Group__32164 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__4_in_rule__ComboWidget__Group__32167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group_3__0_in_rule__ComboWidget__Group__3__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group__4__Impl_in_rule__ComboWidget__Group__42225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComboWidget__Group__4__Impl2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group_3__0__Impl_in_rule__ComboWidget__Group_3__02294 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group_3__1_in_rule__ComboWidget__Group_3__02297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__ValuesAssignment_3_0_in_rule__ComboWidget__Group_3__0__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group_3__1__Impl_in_rule__ComboWidget__Group_3__12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group_3_1__0_in_rule__ComboWidget__Group_3__1__Impl2381 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group_3_1__0__Impl_in_rule__ComboWidget__Group_3_1__02416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group_3_1__1_in_rule__ComboWidget__Group_3_1__02419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ComboWidget__Group_3_1__0__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__Group_3_1__1__Impl_in_rule__ComboWidget__Group_3_1__12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComboWidget__ValuesAssignment_3_1_1_in_rule__ComboWidget__Group_3_1__1__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Form__NameAssignment_12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityReference_in_rule__Form__UsedEntitiesAssignment_22575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Form__FieldsAssignment_32606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__EntityReference__EntityAssignment_12641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__LabelAssignment_12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidget_in_rule__Field__WidgetAssignment_32707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Field__AttributeAssignment_52742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TextFieldWidget__LengthAssignment_22777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComboWidget__ValuesAssignment_3_02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ComboWidget__ValuesAssignment_3_1_12839 = new BitSet(new long[]{0x0000000000000002L});

}