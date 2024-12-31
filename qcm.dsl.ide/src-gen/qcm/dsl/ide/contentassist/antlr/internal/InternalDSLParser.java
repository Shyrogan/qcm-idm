package qcm.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import qcm.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Questionnaire'", "'{'", "'titre'", "'possede'", "'}'", "'retourArriere'", "','", "'Question'", "'intitule'", "'difficulte'", "'reponses'", "'questionSuivante'", "'etiquette'", "'-'", "'Reponse'", "'Etiquette'", "'categorie'", "'sousEtiquette'", "'melange'", "'reponseUnique'", "'valide'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDSL.g"; }


    	private DSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQuestionnaire"
    // InternalDSL.g:53:1: entryRuleQuestionnaire : ruleQuestionnaire EOF ;
    public final void entryRuleQuestionnaire() throws RecognitionException {
        try {
            // InternalDSL.g:54:1: ( ruleQuestionnaire EOF )
            // InternalDSL.g:55:1: ruleQuestionnaire EOF
            {
             before(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionnaire();

            state._fsp--;

             after(grammarAccess.getQuestionnaireRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // InternalDSL.g:62:1: ruleQuestionnaire : ( ( rule__Questionnaire__Group__0 ) ) ;
    public final void ruleQuestionnaire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:66:2: ( ( ( rule__Questionnaire__Group__0 ) ) )
            // InternalDSL.g:67:2: ( ( rule__Questionnaire__Group__0 ) )
            {
            // InternalDSL.g:67:2: ( ( rule__Questionnaire__Group__0 ) )
            // InternalDSL.g:68:3: ( rule__Questionnaire__Group__0 )
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup()); 
            // InternalDSL.g:69:3: ( rule__Questionnaire__Group__0 )
            // InternalDSL.g:69:4: rule__Questionnaire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDSL.g:79:1: ( ruleEString EOF )
            // InternalDSL.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSL.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDSL.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDSL.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalDSL.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDSL.g:94:3: ( rule__EString__Alternatives )
            // InternalDSL.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalDSL.g:103:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalDSL.g:104:1: ( ruleEBoolean EOF )
            // InternalDSL.g:105:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalDSL.g:112:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:116:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalDSL.g:117:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalDSL.g:117:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalDSL.g:118:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalDSL.g:119:3: ( rule__EBoolean__Alternatives )
            // InternalDSL.g:119:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleQuestion"
    // InternalDSL.g:128:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalDSL.g:129:1: ( ruleQuestion EOF )
            // InternalDSL.g:130:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalDSL.g:137:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:141:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalDSL.g:142:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalDSL.g:142:2: ( ( rule__Question__Group__0 ) )
            // InternalDSL.g:143:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalDSL.g:144:3: ( rule__Question__Group__0 )
            // InternalDSL.g:144:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleELong"
    // InternalDSL.g:153:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalDSL.g:154:1: ( ruleELong EOF )
            // InternalDSL.g:155:1: ruleELong EOF
            {
             before(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getELongRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalDSL.g:162:1: ruleELong : ( ( rule__ELong__Group__0 ) ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:166:2: ( ( ( rule__ELong__Group__0 ) ) )
            // InternalDSL.g:167:2: ( ( rule__ELong__Group__0 ) )
            {
            // InternalDSL.g:167:2: ( ( rule__ELong__Group__0 ) )
            // InternalDSL.g:168:3: ( rule__ELong__Group__0 )
            {
             before(grammarAccess.getELongAccess().getGroup()); 
            // InternalDSL.g:169:3: ( rule__ELong__Group__0 )
            // InternalDSL.g:169:4: rule__ELong__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ELong__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getELongAccess().getGroup()); 

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleReponse"
    // InternalDSL.g:178:1: entryRuleReponse : ruleReponse EOF ;
    public final void entryRuleReponse() throws RecognitionException {
        try {
            // InternalDSL.g:179:1: ( ruleReponse EOF )
            // InternalDSL.g:180:1: ruleReponse EOF
            {
             before(grammarAccess.getReponseRule()); 
            pushFollow(FOLLOW_1);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getReponseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReponse"


    // $ANTLR start "ruleReponse"
    // InternalDSL.g:187:1: ruleReponse : ( ( rule__Reponse__Group__0 ) ) ;
    public final void ruleReponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:191:2: ( ( ( rule__Reponse__Group__0 ) ) )
            // InternalDSL.g:192:2: ( ( rule__Reponse__Group__0 ) )
            {
            // InternalDSL.g:192:2: ( ( rule__Reponse__Group__0 ) )
            // InternalDSL.g:193:3: ( rule__Reponse__Group__0 )
            {
             before(grammarAccess.getReponseAccess().getGroup()); 
            // InternalDSL.g:194:3: ( rule__Reponse__Group__0 )
            // InternalDSL.g:194:4: rule__Reponse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getGroup()); 

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
    // $ANTLR end "ruleReponse"


    // $ANTLR start "entryRuleEtiquette"
    // InternalDSL.g:203:1: entryRuleEtiquette : ruleEtiquette EOF ;
    public final void entryRuleEtiquette() throws RecognitionException {
        try {
            // InternalDSL.g:204:1: ( ruleEtiquette EOF )
            // InternalDSL.g:205:1: ruleEtiquette EOF
            {
             before(grammarAccess.getEtiquetteRule()); 
            pushFollow(FOLLOW_1);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getEtiquetteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEtiquette"


    // $ANTLR start "ruleEtiquette"
    // InternalDSL.g:212:1: ruleEtiquette : ( ( rule__Etiquette__Group__0 ) ) ;
    public final void ruleEtiquette() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:216:2: ( ( ( rule__Etiquette__Group__0 ) ) )
            // InternalDSL.g:217:2: ( ( rule__Etiquette__Group__0 ) )
            {
            // InternalDSL.g:217:2: ( ( rule__Etiquette__Group__0 ) )
            // InternalDSL.g:218:3: ( rule__Etiquette__Group__0 )
            {
             before(grammarAccess.getEtiquetteAccess().getGroup()); 
            // InternalDSL.g:219:3: ( rule__Etiquette__Group__0 )
            // InternalDSL.g:219:4: rule__Etiquette__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEtiquetteAccess().getGroup()); 

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
    // $ANTLR end "ruleEtiquette"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDSL.g:227:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:231:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:232:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:232:2: ( RULE_STRING )
                    // InternalDSL.g:233:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:238:2: ( RULE_ID )
                    {
                    // InternalDSL.g:238:2: ( RULE_ID )
                    // InternalDSL.g:239:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalDSL.g:248:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:252:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:253:2: ( 'true' )
                    {
                    // InternalDSL.g:253:2: ( 'true' )
                    // InternalDSL.g:254:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:259:2: ( 'false' )
                    {
                    // InternalDSL.g:259:2: ( 'false' )
                    // InternalDSL.g:260:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Questionnaire__Group__0"
    // InternalDSL.g:269:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:273:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // InternalDSL.g:274:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Questionnaire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__1();

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
    // $ANTLR end "rule__Questionnaire__Group__0"


    // $ANTLR start "rule__Questionnaire__Group__0__Impl"
    // InternalDSL.g:281:1: rule__Questionnaire__Group__0__Impl : ( ( rule__Questionnaire__MelangeAssignment_0 )? ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:285:1: ( ( ( rule__Questionnaire__MelangeAssignment_0 )? ) )
            // InternalDSL.g:286:1: ( ( rule__Questionnaire__MelangeAssignment_0 )? )
            {
            // InternalDSL.g:286:1: ( ( rule__Questionnaire__MelangeAssignment_0 )? )
            // InternalDSL.g:287:2: ( rule__Questionnaire__MelangeAssignment_0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_0()); 
            // InternalDSL.g:288:2: ( rule__Questionnaire__MelangeAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:288:3: rule__Questionnaire__MelangeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Questionnaire__MelangeAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group__1"
    // InternalDSL.g:296:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:300:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // InternalDSL.g:301:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Questionnaire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__2();

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
    // $ANTLR end "rule__Questionnaire__Group__1"


    // $ANTLR start "rule__Questionnaire__Group__1__Impl"
    // InternalDSL.g:308:1: rule__Questionnaire__Group__1__Impl : ( 'Questionnaire' ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:312:1: ( ( 'Questionnaire' ) )
            // InternalDSL.g:313:1: ( 'Questionnaire' )
            {
            // InternalDSL.g:313:1: ( 'Questionnaire' )
            // InternalDSL.g:314:2: 'Questionnaire'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group__2"
    // InternalDSL.g:323:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:327:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // InternalDSL.g:328:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Questionnaire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__3();

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
    // $ANTLR end "rule__Questionnaire__Group__2"


    // $ANTLR start "rule__Questionnaire__Group__2__Impl"
    // InternalDSL.g:335:1: rule__Questionnaire__Group__2__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:339:1: ( ( '{' ) )
            // InternalDSL.g:340:1: ( '{' )
            {
            // InternalDSL.g:340:1: ( '{' )
            // InternalDSL.g:341:2: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Questionnaire__Group__2__Impl"


    // $ANTLR start "rule__Questionnaire__Group__3"
    // InternalDSL.g:350:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:354:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // InternalDSL.g:355:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Questionnaire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__4();

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
    // $ANTLR end "rule__Questionnaire__Group__3"


    // $ANTLR start "rule__Questionnaire__Group__3__Impl"
    // InternalDSL.g:362:1: rule__Questionnaire__Group__3__Impl : ( 'titre' ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:366:1: ( ( 'titre' ) )
            // InternalDSL.g:367:1: ( 'titre' )
            {
            // InternalDSL.g:367:1: ( 'titre' )
            // InternalDSL.g:368:2: 'titre'
            {
             before(grammarAccess.getQuestionnaireAccess().getTitreKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getTitreKeyword_3()); 

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
    // $ANTLR end "rule__Questionnaire__Group__3__Impl"


    // $ANTLR start "rule__Questionnaire__Group__4"
    // InternalDSL.g:377:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:381:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // InternalDSL.g:382:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Questionnaire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__5();

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
    // $ANTLR end "rule__Questionnaire__Group__4"


    // $ANTLR start "rule__Questionnaire__Group__4__Impl"
    // InternalDSL.g:389:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__TitreAssignment_4 ) ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:393:1: ( ( ( rule__Questionnaire__TitreAssignment_4 ) ) )
            // InternalDSL.g:394:1: ( ( rule__Questionnaire__TitreAssignment_4 ) )
            {
            // InternalDSL.g:394:1: ( ( rule__Questionnaire__TitreAssignment_4 ) )
            // InternalDSL.g:395:2: ( rule__Questionnaire__TitreAssignment_4 )
            {
             before(grammarAccess.getQuestionnaireAccess().getTitreAssignment_4()); 
            // InternalDSL.g:396:2: ( rule__Questionnaire__TitreAssignment_4 )
            // InternalDSL.g:396:3: rule__Questionnaire__TitreAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__TitreAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getTitreAssignment_4()); 

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
    // $ANTLR end "rule__Questionnaire__Group__4__Impl"


    // $ANTLR start "rule__Questionnaire__Group__5"
    // InternalDSL.g:404:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:408:1: ( rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 )
            // InternalDSL.g:409:2: rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Questionnaire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__6();

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
    // $ANTLR end "rule__Questionnaire__Group__5"


    // $ANTLR start "rule__Questionnaire__Group__5__Impl"
    // InternalDSL.g:416:1: rule__Questionnaire__Group__5__Impl : ( ( rule__Questionnaire__Group_5__0 )? ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:420:1: ( ( ( rule__Questionnaire__Group_5__0 )? ) )
            // InternalDSL.g:421:1: ( ( rule__Questionnaire__Group_5__0 )? )
            {
            // InternalDSL.g:421:1: ( ( rule__Questionnaire__Group_5__0 )? )
            // InternalDSL.g:422:2: ( rule__Questionnaire__Group_5__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_5()); 
            // InternalDSL.g:423:2: ( rule__Questionnaire__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:423:3: rule__Questionnaire__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Questionnaire__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionnaireAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Questionnaire__Group__5__Impl"


    // $ANTLR start "rule__Questionnaire__Group__6"
    // InternalDSL.g:431:1: rule__Questionnaire__Group__6 : rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7 ;
    public final void rule__Questionnaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:435:1: ( rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7 )
            // InternalDSL.g:436:2: rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Questionnaire__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__7();

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
    // $ANTLR end "rule__Questionnaire__Group__6"


    // $ANTLR start "rule__Questionnaire__Group__6__Impl"
    // InternalDSL.g:443:1: rule__Questionnaire__Group__6__Impl : ( 'possede' ) ;
    public final void rule__Questionnaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:447:1: ( ( 'possede' ) )
            // InternalDSL.g:448:1: ( 'possede' )
            {
            // InternalDSL.g:448:1: ( 'possede' )
            // InternalDSL.g:449:2: 'possede'
            {
             before(grammarAccess.getQuestionnaireAccess().getPossedeKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getPossedeKeyword_6()); 

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
    // $ANTLR end "rule__Questionnaire__Group__6__Impl"


    // $ANTLR start "rule__Questionnaire__Group__7"
    // InternalDSL.g:458:1: rule__Questionnaire__Group__7 : rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8 ;
    public final void rule__Questionnaire__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:462:1: ( rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8 )
            // InternalDSL.g:463:2: rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Questionnaire__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__8();

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
    // $ANTLR end "rule__Questionnaire__Group__7"


    // $ANTLR start "rule__Questionnaire__Group__7__Impl"
    // InternalDSL.g:470:1: rule__Questionnaire__Group__7__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:474:1: ( ( '{' ) )
            // InternalDSL.g:475:1: ( '{' )
            {
            // InternalDSL.g:475:1: ( '{' )
            // InternalDSL.g:476:2: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Questionnaire__Group__7__Impl"


    // $ANTLR start "rule__Questionnaire__Group__8"
    // InternalDSL.g:485:1: rule__Questionnaire__Group__8 : rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9 ;
    public final void rule__Questionnaire__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:489:1: ( rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9 )
            // InternalDSL.g:490:2: rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Questionnaire__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__9();

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
    // $ANTLR end "rule__Questionnaire__Group__8"


    // $ANTLR start "rule__Questionnaire__Group__8__Impl"
    // InternalDSL.g:497:1: rule__Questionnaire__Group__8__Impl : ( ( rule__Questionnaire__PossedeAssignment_8 ) ) ;
    public final void rule__Questionnaire__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:501:1: ( ( ( rule__Questionnaire__PossedeAssignment_8 ) ) )
            // InternalDSL.g:502:1: ( ( rule__Questionnaire__PossedeAssignment_8 ) )
            {
            // InternalDSL.g:502:1: ( ( rule__Questionnaire__PossedeAssignment_8 ) )
            // InternalDSL.g:503:2: ( rule__Questionnaire__PossedeAssignment_8 )
            {
             before(grammarAccess.getQuestionnaireAccess().getPossedeAssignment_8()); 
            // InternalDSL.g:504:2: ( rule__Questionnaire__PossedeAssignment_8 )
            // InternalDSL.g:504:3: rule__Questionnaire__PossedeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__PossedeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getPossedeAssignment_8()); 

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
    // $ANTLR end "rule__Questionnaire__Group__8__Impl"


    // $ANTLR start "rule__Questionnaire__Group__9"
    // InternalDSL.g:512:1: rule__Questionnaire__Group__9 : rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10 ;
    public final void rule__Questionnaire__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:516:1: ( rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10 )
            // InternalDSL.g:517:2: rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Questionnaire__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__10();

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
    // $ANTLR end "rule__Questionnaire__Group__9"


    // $ANTLR start "rule__Questionnaire__Group__9__Impl"
    // InternalDSL.g:524:1: rule__Questionnaire__Group__9__Impl : ( ( rule__Questionnaire__Group_9__0 )* ) ;
    public final void rule__Questionnaire__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:528:1: ( ( ( rule__Questionnaire__Group_9__0 )* ) )
            // InternalDSL.g:529:1: ( ( rule__Questionnaire__Group_9__0 )* )
            {
            // InternalDSL.g:529:1: ( ( rule__Questionnaire__Group_9__0 )* )
            // InternalDSL.g:530:2: ( rule__Questionnaire__Group_9__0 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_9()); 
            // InternalDSL.g:531:2: ( rule__Questionnaire__Group_9__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:531:3: rule__Questionnaire__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Questionnaire__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQuestionnaireAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Questionnaire__Group__9__Impl"


    // $ANTLR start "rule__Questionnaire__Group__10"
    // InternalDSL.g:539:1: rule__Questionnaire__Group__10 : rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11 ;
    public final void rule__Questionnaire__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:543:1: ( rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11 )
            // InternalDSL.g:544:2: rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Questionnaire__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__11();

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
    // $ANTLR end "rule__Questionnaire__Group__10"


    // $ANTLR start "rule__Questionnaire__Group__10__Impl"
    // InternalDSL.g:551:1: rule__Questionnaire__Group__10__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:555:1: ( ( '}' ) )
            // InternalDSL.g:556:1: ( '}' )
            {
            // InternalDSL.g:556:1: ( '}' )
            // InternalDSL.g:557:2: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Questionnaire__Group__10__Impl"


    // $ANTLR start "rule__Questionnaire__Group__11"
    // InternalDSL.g:566:1: rule__Questionnaire__Group__11 : rule__Questionnaire__Group__11__Impl ;
    public final void rule__Questionnaire__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:570:1: ( rule__Questionnaire__Group__11__Impl )
            // InternalDSL.g:571:2: rule__Questionnaire__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group__11__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group__11"


    // $ANTLR start "rule__Questionnaire__Group__11__Impl"
    // InternalDSL.g:577:1: rule__Questionnaire__Group__11__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:581:1: ( ( '}' ) )
            // InternalDSL.g:582:1: ( '}' )
            {
            // InternalDSL.g:582:1: ( '}' )
            // InternalDSL.g:583:2: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Questionnaire__Group__11__Impl"


    // $ANTLR start "rule__Questionnaire__Group_5__0"
    // InternalDSL.g:593:1: rule__Questionnaire__Group_5__0 : rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1 ;
    public final void rule__Questionnaire__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:597:1: ( rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1 )
            // InternalDSL.g:598:2: rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Questionnaire__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_5__1();

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
    // $ANTLR end "rule__Questionnaire__Group_5__0"


    // $ANTLR start "rule__Questionnaire__Group_5__0__Impl"
    // InternalDSL.g:605:1: rule__Questionnaire__Group_5__0__Impl : ( 'retourArriere' ) ;
    public final void rule__Questionnaire__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:609:1: ( ( 'retourArriere' ) )
            // InternalDSL.g:610:1: ( 'retourArriere' )
            {
            // InternalDSL.g:610:1: ( 'retourArriere' )
            // InternalDSL.g:611:2: 'retourArriere'
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourArriereKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getRetourArriereKeyword_5_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group_5__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_5__1"
    // InternalDSL.g:620:1: rule__Questionnaire__Group_5__1 : rule__Questionnaire__Group_5__1__Impl ;
    public final void rule__Questionnaire__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:624:1: ( rule__Questionnaire__Group_5__1__Impl )
            // InternalDSL.g:625:2: rule__Questionnaire__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_5__1__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group_5__1"


    // $ANTLR start "rule__Questionnaire__Group_5__1__Impl"
    // InternalDSL.g:631:1: rule__Questionnaire__Group_5__1__Impl : ( ( rule__Questionnaire__RetourArriereAssignment_5_1 ) ) ;
    public final void rule__Questionnaire__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:635:1: ( ( ( rule__Questionnaire__RetourArriereAssignment_5_1 ) ) )
            // InternalDSL.g:636:1: ( ( rule__Questionnaire__RetourArriereAssignment_5_1 ) )
            {
            // InternalDSL.g:636:1: ( ( rule__Questionnaire__RetourArriereAssignment_5_1 ) )
            // InternalDSL.g:637:2: ( rule__Questionnaire__RetourArriereAssignment_5_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourArriereAssignment_5_1()); 
            // InternalDSL.g:638:2: ( rule__Questionnaire__RetourArriereAssignment_5_1 )
            // InternalDSL.g:638:3: rule__Questionnaire__RetourArriereAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__RetourArriereAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getRetourArriereAssignment_5_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group_5__1__Impl"


    // $ANTLR start "rule__Questionnaire__Group_9__0"
    // InternalDSL.g:647:1: rule__Questionnaire__Group_9__0 : rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1 ;
    public final void rule__Questionnaire__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:651:1: ( rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1 )
            // InternalDSL.g:652:2: rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__Questionnaire__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_9__1();

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
    // $ANTLR end "rule__Questionnaire__Group_9__0"


    // $ANTLR start "rule__Questionnaire__Group_9__0__Impl"
    // InternalDSL.g:659:1: rule__Questionnaire__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Questionnaire__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:663:1: ( ( ',' ) )
            // InternalDSL.g:664:1: ( ',' )
            {
            // InternalDSL.g:664:1: ( ',' )
            // InternalDSL.g:665:2: ','
            {
             before(grammarAccess.getQuestionnaireAccess().getCommaKeyword_9_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Questionnaire__Group_9__0__Impl"


    // $ANTLR start "rule__Questionnaire__Group_9__1"
    // InternalDSL.g:674:1: rule__Questionnaire__Group_9__1 : rule__Questionnaire__Group_9__1__Impl ;
    public final void rule__Questionnaire__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:678:1: ( rule__Questionnaire__Group_9__1__Impl )
            // InternalDSL.g:679:2: rule__Questionnaire__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__Group_9__1__Impl();

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
    // $ANTLR end "rule__Questionnaire__Group_9__1"


    // $ANTLR start "rule__Questionnaire__Group_9__1__Impl"
    // InternalDSL.g:685:1: rule__Questionnaire__Group_9__1__Impl : ( ( rule__Questionnaire__PossedeAssignment_9_1 ) ) ;
    public final void rule__Questionnaire__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:689:1: ( ( ( rule__Questionnaire__PossedeAssignment_9_1 ) ) )
            // InternalDSL.g:690:1: ( ( rule__Questionnaire__PossedeAssignment_9_1 ) )
            {
            // InternalDSL.g:690:1: ( ( rule__Questionnaire__PossedeAssignment_9_1 ) )
            // InternalDSL.g:691:2: ( rule__Questionnaire__PossedeAssignment_9_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getPossedeAssignment_9_1()); 
            // InternalDSL.g:692:2: ( rule__Questionnaire__PossedeAssignment_9_1 )
            // InternalDSL.g:692:3: rule__Questionnaire__PossedeAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Questionnaire__PossedeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionnaireAccess().getPossedeAssignment_9_1()); 

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
    // $ANTLR end "rule__Questionnaire__Group_9__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalDSL.g:701:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:705:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalDSL.g:706:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalDSL.g:713:1: rule__Question__Group__0__Impl : ( ( rule__Question__ReponseUniqueAssignment_0 ) ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:717:1: ( ( ( rule__Question__ReponseUniqueAssignment_0 ) ) )
            // InternalDSL.g:718:1: ( ( rule__Question__ReponseUniqueAssignment_0 ) )
            {
            // InternalDSL.g:718:1: ( ( rule__Question__ReponseUniqueAssignment_0 ) )
            // InternalDSL.g:719:2: ( rule__Question__ReponseUniqueAssignment_0 )
            {
             before(grammarAccess.getQuestionAccess().getReponseUniqueAssignment_0()); 
            // InternalDSL.g:720:2: ( rule__Question__ReponseUniqueAssignment_0 )
            // InternalDSL.g:720:3: rule__Question__ReponseUniqueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponseUniqueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponseUniqueAssignment_0()); 

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
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalDSL.g:728:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:732:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalDSL.g:733:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalDSL.g:740:1: rule__Question__Group__1__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:744:1: ( ( 'Question' ) )
            // InternalDSL.g:745:1: ( 'Question' )
            {
            // InternalDSL.g:745:1: ( 'Question' )
            // InternalDSL.g:746:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_1()); 

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
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalDSL.g:755:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:759:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalDSL.g:760:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalDSL.g:767:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:771:1: ( ( '{' ) )
            // InternalDSL.g:772:1: ( '{' )
            {
            // InternalDSL.g:772:1: ( '{' )
            // InternalDSL.g:773:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalDSL.g:782:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:786:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalDSL.g:787:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalDSL.g:794:1: rule__Question__Group__3__Impl : ( 'intitule' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:798:1: ( ( 'intitule' ) )
            // InternalDSL.g:799:1: ( 'intitule' )
            {
            // InternalDSL.g:799:1: ( 'intitule' )
            // InternalDSL.g:800:2: 'intitule'
            {
             before(grammarAccess.getQuestionAccess().getIntituleKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getIntituleKeyword_3()); 

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
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalDSL.g:809:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:813:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalDSL.g:814:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__5();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalDSL.g:821:1: rule__Question__Group__4__Impl : ( ( rule__Question__IntituleAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:825:1: ( ( ( rule__Question__IntituleAssignment_4 ) ) )
            // InternalDSL.g:826:1: ( ( rule__Question__IntituleAssignment_4 ) )
            {
            // InternalDSL.g:826:1: ( ( rule__Question__IntituleAssignment_4 ) )
            // InternalDSL.g:827:2: ( rule__Question__IntituleAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getIntituleAssignment_4()); 
            // InternalDSL.g:828:2: ( rule__Question__IntituleAssignment_4 )
            // InternalDSL.g:828:3: rule__Question__IntituleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Question__IntituleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getIntituleAssignment_4()); 

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
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // InternalDSL.g:836:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:840:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // InternalDSL.g:841:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__6();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // InternalDSL.g:848:1: rule__Question__Group__5__Impl : ( 'difficulte' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:852:1: ( ( 'difficulte' ) )
            // InternalDSL.g:853:1: ( 'difficulte' )
            {
            // InternalDSL.g:853:1: ( 'difficulte' )
            // InternalDSL.g:854:2: 'difficulte'
            {
             before(grammarAccess.getQuestionAccess().getDifficulteKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getDifficulteKeyword_5()); 

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
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // InternalDSL.g:863:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:867:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // InternalDSL.g:868:2: rule__Question__Group__6__Impl rule__Question__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Question__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__7();

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
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // InternalDSL.g:875:1: rule__Question__Group__6__Impl : ( ( rule__Question__DifficulteAssignment_6 ) ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:879:1: ( ( ( rule__Question__DifficulteAssignment_6 ) ) )
            // InternalDSL.g:880:1: ( ( rule__Question__DifficulteAssignment_6 ) )
            {
            // InternalDSL.g:880:1: ( ( rule__Question__DifficulteAssignment_6 ) )
            // InternalDSL.g:881:2: ( rule__Question__DifficulteAssignment_6 )
            {
             before(grammarAccess.getQuestionAccess().getDifficulteAssignment_6()); 
            // InternalDSL.g:882:2: ( rule__Question__DifficulteAssignment_6 )
            // InternalDSL.g:882:3: rule__Question__DifficulteAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Question__DifficulteAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getDifficulteAssignment_6()); 

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
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Question__Group__7"
    // InternalDSL.g:890:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:894:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // InternalDSL.g:895:2: rule__Question__Group__7__Impl rule__Question__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Question__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__8();

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
    // $ANTLR end "rule__Question__Group__7"


    // $ANTLR start "rule__Question__Group__7__Impl"
    // InternalDSL.g:902:1: rule__Question__Group__7__Impl : ( ( rule__Question__Group_7__0 )? ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:906:1: ( ( ( rule__Question__Group_7__0 )? ) )
            // InternalDSL.g:907:1: ( ( rule__Question__Group_7__0 )? )
            {
            // InternalDSL.g:907:1: ( ( rule__Question__Group_7__0 )? )
            // InternalDSL.g:908:2: ( rule__Question__Group_7__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_7()); 
            // InternalDSL.g:909:2: ( rule__Question__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:909:3: rule__Question__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Question__Group__7__Impl"


    // $ANTLR start "rule__Question__Group__8"
    // InternalDSL.g:917:1: rule__Question__Group__8 : rule__Question__Group__8__Impl rule__Question__Group__9 ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:921:1: ( rule__Question__Group__8__Impl rule__Question__Group__9 )
            // InternalDSL.g:922:2: rule__Question__Group__8__Impl rule__Question__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Question__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__9();

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
    // $ANTLR end "rule__Question__Group__8"


    // $ANTLR start "rule__Question__Group__8__Impl"
    // InternalDSL.g:929:1: rule__Question__Group__8__Impl : ( 'reponses' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:933:1: ( ( 'reponses' ) )
            // InternalDSL.g:934:1: ( 'reponses' )
            {
            // InternalDSL.g:934:1: ( 'reponses' )
            // InternalDSL.g:935:2: 'reponses'
            {
             before(grammarAccess.getQuestionAccess().getReponsesKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getReponsesKeyword_8()); 

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
    // $ANTLR end "rule__Question__Group__8__Impl"


    // $ANTLR start "rule__Question__Group__9"
    // InternalDSL.g:944:1: rule__Question__Group__9 : rule__Question__Group__9__Impl rule__Question__Group__10 ;
    public final void rule__Question__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:948:1: ( rule__Question__Group__9__Impl rule__Question__Group__10 )
            // InternalDSL.g:949:2: rule__Question__Group__9__Impl rule__Question__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Question__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__10();

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
    // $ANTLR end "rule__Question__Group__9"


    // $ANTLR start "rule__Question__Group__9__Impl"
    // InternalDSL.g:956:1: rule__Question__Group__9__Impl : ( '{' ) ;
    public final void rule__Question__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:960:1: ( ( '{' ) )
            // InternalDSL.g:961:1: ( '{' )
            {
            // InternalDSL.g:961:1: ( '{' )
            // InternalDSL.g:962:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Question__Group__9__Impl"


    // $ANTLR start "rule__Question__Group__10"
    // InternalDSL.g:971:1: rule__Question__Group__10 : rule__Question__Group__10__Impl rule__Question__Group__11 ;
    public final void rule__Question__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:975:1: ( rule__Question__Group__10__Impl rule__Question__Group__11 )
            // InternalDSL.g:976:2: rule__Question__Group__10__Impl rule__Question__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__11();

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
    // $ANTLR end "rule__Question__Group__10"


    // $ANTLR start "rule__Question__Group__10__Impl"
    // InternalDSL.g:983:1: rule__Question__Group__10__Impl : ( ( rule__Question__ReponsesAssignment_10 ) ) ;
    public final void rule__Question__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:987:1: ( ( ( rule__Question__ReponsesAssignment_10 ) ) )
            // InternalDSL.g:988:1: ( ( rule__Question__ReponsesAssignment_10 ) )
            {
            // InternalDSL.g:988:1: ( ( rule__Question__ReponsesAssignment_10 ) )
            // InternalDSL.g:989:2: ( rule__Question__ReponsesAssignment_10 )
            {
             before(grammarAccess.getQuestionAccess().getReponsesAssignment_10()); 
            // InternalDSL.g:990:2: ( rule__Question__ReponsesAssignment_10 )
            // InternalDSL.g:990:3: rule__Question__ReponsesAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponsesAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponsesAssignment_10()); 

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
    // $ANTLR end "rule__Question__Group__10__Impl"


    // $ANTLR start "rule__Question__Group__11"
    // InternalDSL.g:998:1: rule__Question__Group__11 : rule__Question__Group__11__Impl rule__Question__Group__12 ;
    public final void rule__Question__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1002:1: ( rule__Question__Group__11__Impl rule__Question__Group__12 )
            // InternalDSL.g:1003:2: rule__Question__Group__11__Impl rule__Question__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__12();

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
    // $ANTLR end "rule__Question__Group__11"


    // $ANTLR start "rule__Question__Group__11__Impl"
    // InternalDSL.g:1010:1: rule__Question__Group__11__Impl : ( ( rule__Question__Group_11__0 )* ) ;
    public final void rule__Question__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1014:1: ( ( ( rule__Question__Group_11__0 )* ) )
            // InternalDSL.g:1015:1: ( ( rule__Question__Group_11__0 )* )
            {
            // InternalDSL.g:1015:1: ( ( rule__Question__Group_11__0 )* )
            // InternalDSL.g:1016:2: ( rule__Question__Group_11__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_11()); 
            // InternalDSL.g:1017:2: ( rule__Question__Group_11__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSL.g:1017:3: rule__Question__Group_11__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Question__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Question__Group__11__Impl"


    // $ANTLR start "rule__Question__Group__12"
    // InternalDSL.g:1025:1: rule__Question__Group__12 : rule__Question__Group__12__Impl rule__Question__Group__13 ;
    public final void rule__Question__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1029:1: ( rule__Question__Group__12__Impl rule__Question__Group__13 )
            // InternalDSL.g:1030:2: rule__Question__Group__12__Impl rule__Question__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__Question__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__13();

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
    // $ANTLR end "rule__Question__Group__12"


    // $ANTLR start "rule__Question__Group__12__Impl"
    // InternalDSL.g:1037:1: rule__Question__Group__12__Impl : ( '}' ) ;
    public final void rule__Question__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1041:1: ( ( '}' ) )
            // InternalDSL.g:1042:1: ( '}' )
            {
            // InternalDSL.g:1042:1: ( '}' )
            // InternalDSL.g:1043:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Question__Group__12__Impl"


    // $ANTLR start "rule__Question__Group__13"
    // InternalDSL.g:1052:1: rule__Question__Group__13 : rule__Question__Group__13__Impl rule__Question__Group__14 ;
    public final void rule__Question__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1056:1: ( rule__Question__Group__13__Impl rule__Question__Group__14 )
            // InternalDSL.g:1057:2: rule__Question__Group__13__Impl rule__Question__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Question__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__14();

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
    // $ANTLR end "rule__Question__Group__13"


    // $ANTLR start "rule__Question__Group__13__Impl"
    // InternalDSL.g:1064:1: rule__Question__Group__13__Impl : ( ( rule__Question__Group_13__0 )? ) ;
    public final void rule__Question__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1068:1: ( ( ( rule__Question__Group_13__0 )? ) )
            // InternalDSL.g:1069:1: ( ( rule__Question__Group_13__0 )? )
            {
            // InternalDSL.g:1069:1: ( ( rule__Question__Group_13__0 )? )
            // InternalDSL.g:1070:2: ( rule__Question__Group_13__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_13()); 
            // InternalDSL.g:1071:2: ( rule__Question__Group_13__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:1071:3: rule__Question__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Question__Group__13__Impl"


    // $ANTLR start "rule__Question__Group__14"
    // InternalDSL.g:1079:1: rule__Question__Group__14 : rule__Question__Group__14__Impl ;
    public final void rule__Question__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1083:1: ( rule__Question__Group__14__Impl )
            // InternalDSL.g:1084:2: rule__Question__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__14__Impl();

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
    // $ANTLR end "rule__Question__Group__14"


    // $ANTLR start "rule__Question__Group__14__Impl"
    // InternalDSL.g:1090:1: rule__Question__Group__14__Impl : ( '}' ) ;
    public final void rule__Question__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1094:1: ( ( '}' ) )
            // InternalDSL.g:1095:1: ( '}' )
            {
            // InternalDSL.g:1095:1: ( '}' )
            // InternalDSL.g:1096:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_14()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Question__Group__14__Impl"


    // $ANTLR start "rule__Question__Group_7__0"
    // InternalDSL.g:1106:1: rule__Question__Group_7__0 : rule__Question__Group_7__0__Impl rule__Question__Group_7__1 ;
    public final void rule__Question__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1110:1: ( rule__Question__Group_7__0__Impl rule__Question__Group_7__1 )
            // InternalDSL.g:1111:2: rule__Question__Group_7__0__Impl rule__Question__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_7__1();

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
    // $ANTLR end "rule__Question__Group_7__0"


    // $ANTLR start "rule__Question__Group_7__0__Impl"
    // InternalDSL.g:1118:1: rule__Question__Group_7__0__Impl : ( 'questionSuivante' ) ;
    public final void rule__Question__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1122:1: ( ( 'questionSuivante' ) )
            // InternalDSL.g:1123:1: ( 'questionSuivante' )
            {
            // InternalDSL.g:1123:1: ( 'questionSuivante' )
            // InternalDSL.g:1124:2: 'questionSuivante'
            {
             before(grammarAccess.getQuestionAccess().getQuestionSuivanteKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionSuivanteKeyword_7_0()); 

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
    // $ANTLR end "rule__Question__Group_7__0__Impl"


    // $ANTLR start "rule__Question__Group_7__1"
    // InternalDSL.g:1133:1: rule__Question__Group_7__1 : rule__Question__Group_7__1__Impl ;
    public final void rule__Question__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1137:1: ( rule__Question__Group_7__1__Impl )
            // InternalDSL.g:1138:2: rule__Question__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_7__1__Impl();

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
    // $ANTLR end "rule__Question__Group_7__1"


    // $ANTLR start "rule__Question__Group_7__1__Impl"
    // InternalDSL.g:1144:1: rule__Question__Group_7__1__Impl : ( ( rule__Question__QuestionSuivanteAssignment_7_1 ) ) ;
    public final void rule__Question__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1148:1: ( ( ( rule__Question__QuestionSuivanteAssignment_7_1 ) ) )
            // InternalDSL.g:1149:1: ( ( rule__Question__QuestionSuivanteAssignment_7_1 ) )
            {
            // InternalDSL.g:1149:1: ( ( rule__Question__QuestionSuivanteAssignment_7_1 ) )
            // InternalDSL.g:1150:2: ( rule__Question__QuestionSuivanteAssignment_7_1 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionSuivanteAssignment_7_1()); 
            // InternalDSL.g:1151:2: ( rule__Question__QuestionSuivanteAssignment_7_1 )
            // InternalDSL.g:1151:3: rule__Question__QuestionSuivanteAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionSuivanteAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionSuivanteAssignment_7_1()); 

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
    // $ANTLR end "rule__Question__Group_7__1__Impl"


    // $ANTLR start "rule__Question__Group_11__0"
    // InternalDSL.g:1160:1: rule__Question__Group_11__0 : rule__Question__Group_11__0__Impl rule__Question__Group_11__1 ;
    public final void rule__Question__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1164:1: ( rule__Question__Group_11__0__Impl rule__Question__Group_11__1 )
            // InternalDSL.g:1165:2: rule__Question__Group_11__0__Impl rule__Question__Group_11__1
            {
            pushFollow(FOLLOW_18);
            rule__Question__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_11__1();

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
    // $ANTLR end "rule__Question__Group_11__0"


    // $ANTLR start "rule__Question__Group_11__0__Impl"
    // InternalDSL.g:1172:1: rule__Question__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1176:1: ( ( ',' ) )
            // InternalDSL.g:1177:1: ( ',' )
            {
            // InternalDSL.g:1177:1: ( ',' )
            // InternalDSL.g:1178:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_11_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_11_0()); 

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
    // $ANTLR end "rule__Question__Group_11__0__Impl"


    // $ANTLR start "rule__Question__Group_11__1"
    // InternalDSL.g:1187:1: rule__Question__Group_11__1 : rule__Question__Group_11__1__Impl ;
    public final void rule__Question__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1191:1: ( rule__Question__Group_11__1__Impl )
            // InternalDSL.g:1192:2: rule__Question__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_11__1__Impl();

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
    // $ANTLR end "rule__Question__Group_11__1"


    // $ANTLR start "rule__Question__Group_11__1__Impl"
    // InternalDSL.g:1198:1: rule__Question__Group_11__1__Impl : ( ( rule__Question__ReponsesAssignment_11_1 ) ) ;
    public final void rule__Question__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1202:1: ( ( ( rule__Question__ReponsesAssignment_11_1 ) ) )
            // InternalDSL.g:1203:1: ( ( rule__Question__ReponsesAssignment_11_1 ) )
            {
            // InternalDSL.g:1203:1: ( ( rule__Question__ReponsesAssignment_11_1 ) )
            // InternalDSL.g:1204:2: ( rule__Question__ReponsesAssignment_11_1 )
            {
             before(grammarAccess.getQuestionAccess().getReponsesAssignment_11_1()); 
            // InternalDSL.g:1205:2: ( rule__Question__ReponsesAssignment_11_1 )
            // InternalDSL.g:1205:3: rule__Question__ReponsesAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponsesAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponsesAssignment_11_1()); 

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
    // $ANTLR end "rule__Question__Group_11__1__Impl"


    // $ANTLR start "rule__Question__Group_13__0"
    // InternalDSL.g:1214:1: rule__Question__Group_13__0 : rule__Question__Group_13__0__Impl rule__Question__Group_13__1 ;
    public final void rule__Question__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1218:1: ( rule__Question__Group_13__0__Impl rule__Question__Group_13__1 )
            // InternalDSL.g:1219:2: rule__Question__Group_13__0__Impl rule__Question__Group_13__1
            {
            pushFollow(FOLLOW_4);
            rule__Question__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_13__1();

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
    // $ANTLR end "rule__Question__Group_13__0"


    // $ANTLR start "rule__Question__Group_13__0__Impl"
    // InternalDSL.g:1226:1: rule__Question__Group_13__0__Impl : ( 'etiquette' ) ;
    public final void rule__Question__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1230:1: ( ( 'etiquette' ) )
            // InternalDSL.g:1231:1: ( 'etiquette' )
            {
            // InternalDSL.g:1231:1: ( 'etiquette' )
            // InternalDSL.g:1232:2: 'etiquette'
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteKeyword_13_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getEtiquetteKeyword_13_0()); 

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
    // $ANTLR end "rule__Question__Group_13__0__Impl"


    // $ANTLR start "rule__Question__Group_13__1"
    // InternalDSL.g:1241:1: rule__Question__Group_13__1 : rule__Question__Group_13__1__Impl rule__Question__Group_13__2 ;
    public final void rule__Question__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1245:1: ( rule__Question__Group_13__1__Impl rule__Question__Group_13__2 )
            // InternalDSL.g:1246:2: rule__Question__Group_13__1__Impl rule__Question__Group_13__2
            {
            pushFollow(FOLLOW_20);
            rule__Question__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_13__2();

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
    // $ANTLR end "rule__Question__Group_13__1"


    // $ANTLR start "rule__Question__Group_13__1__Impl"
    // InternalDSL.g:1253:1: rule__Question__Group_13__1__Impl : ( '{' ) ;
    public final void rule__Question__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1257:1: ( ( '{' ) )
            // InternalDSL.g:1258:1: ( '{' )
            {
            // InternalDSL.g:1258:1: ( '{' )
            // InternalDSL.g:1259:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_13_1()); 

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
    // $ANTLR end "rule__Question__Group_13__1__Impl"


    // $ANTLR start "rule__Question__Group_13__2"
    // InternalDSL.g:1268:1: rule__Question__Group_13__2 : rule__Question__Group_13__2__Impl rule__Question__Group_13__3 ;
    public final void rule__Question__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1272:1: ( rule__Question__Group_13__2__Impl rule__Question__Group_13__3 )
            // InternalDSL.g:1273:2: rule__Question__Group_13__2__Impl rule__Question__Group_13__3
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_13__3();

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
    // $ANTLR end "rule__Question__Group_13__2"


    // $ANTLR start "rule__Question__Group_13__2__Impl"
    // InternalDSL.g:1280:1: rule__Question__Group_13__2__Impl : ( ( rule__Question__EtiquetteAssignment_13_2 ) ) ;
    public final void rule__Question__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1284:1: ( ( ( rule__Question__EtiquetteAssignment_13_2 ) ) )
            // InternalDSL.g:1285:1: ( ( rule__Question__EtiquetteAssignment_13_2 ) )
            {
            // InternalDSL.g:1285:1: ( ( rule__Question__EtiquetteAssignment_13_2 ) )
            // InternalDSL.g:1286:2: ( rule__Question__EtiquetteAssignment_13_2 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_13_2()); 
            // InternalDSL.g:1287:2: ( rule__Question__EtiquetteAssignment_13_2 )
            // InternalDSL.g:1287:3: rule__Question__EtiquetteAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Question__EtiquetteAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_13_2()); 

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
    // $ANTLR end "rule__Question__Group_13__2__Impl"


    // $ANTLR start "rule__Question__Group_13__3"
    // InternalDSL.g:1295:1: rule__Question__Group_13__3 : rule__Question__Group_13__3__Impl rule__Question__Group_13__4 ;
    public final void rule__Question__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1299:1: ( rule__Question__Group_13__3__Impl rule__Question__Group_13__4 )
            // InternalDSL.g:1300:2: rule__Question__Group_13__3__Impl rule__Question__Group_13__4
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_13__4();

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
    // $ANTLR end "rule__Question__Group_13__3"


    // $ANTLR start "rule__Question__Group_13__3__Impl"
    // InternalDSL.g:1307:1: rule__Question__Group_13__3__Impl : ( ( rule__Question__Group_13_3__0 )* ) ;
    public final void rule__Question__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1311:1: ( ( ( rule__Question__Group_13_3__0 )* ) )
            // InternalDSL.g:1312:1: ( ( rule__Question__Group_13_3__0 )* )
            {
            // InternalDSL.g:1312:1: ( ( rule__Question__Group_13_3__0 )* )
            // InternalDSL.g:1313:2: ( rule__Question__Group_13_3__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_13_3()); 
            // InternalDSL.g:1314:2: ( rule__Question__Group_13_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:1314:3: rule__Question__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Question__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_13_3()); 

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
    // $ANTLR end "rule__Question__Group_13__3__Impl"


    // $ANTLR start "rule__Question__Group_13__4"
    // InternalDSL.g:1322:1: rule__Question__Group_13__4 : rule__Question__Group_13__4__Impl ;
    public final void rule__Question__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1326:1: ( rule__Question__Group_13__4__Impl )
            // InternalDSL.g:1327:2: rule__Question__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_13__4__Impl();

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
    // $ANTLR end "rule__Question__Group_13__4"


    // $ANTLR start "rule__Question__Group_13__4__Impl"
    // InternalDSL.g:1333:1: rule__Question__Group_13__4__Impl : ( '}' ) ;
    public final void rule__Question__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1337:1: ( ( '}' ) )
            // InternalDSL.g:1338:1: ( '}' )
            {
            // InternalDSL.g:1338:1: ( '}' )
            // InternalDSL.g:1339:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_13_4()); 

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
    // $ANTLR end "rule__Question__Group_13__4__Impl"


    // $ANTLR start "rule__Question__Group_13_3__0"
    // InternalDSL.g:1349:1: rule__Question__Group_13_3__0 : rule__Question__Group_13_3__0__Impl rule__Question__Group_13_3__1 ;
    public final void rule__Question__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1353:1: ( rule__Question__Group_13_3__0__Impl rule__Question__Group_13_3__1 )
            // InternalDSL.g:1354:2: rule__Question__Group_13_3__0__Impl rule__Question__Group_13_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Question__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_13_3__1();

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
    // $ANTLR end "rule__Question__Group_13_3__0"


    // $ANTLR start "rule__Question__Group_13_3__0__Impl"
    // InternalDSL.g:1361:1: rule__Question__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1365:1: ( ( ',' ) )
            // InternalDSL.g:1366:1: ( ',' )
            {
            // InternalDSL.g:1366:1: ( ',' )
            // InternalDSL.g:1367:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_13_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_13_3_0()); 

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
    // $ANTLR end "rule__Question__Group_13_3__0__Impl"


    // $ANTLR start "rule__Question__Group_13_3__1"
    // InternalDSL.g:1376:1: rule__Question__Group_13_3__1 : rule__Question__Group_13_3__1__Impl ;
    public final void rule__Question__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1380:1: ( rule__Question__Group_13_3__1__Impl )
            // InternalDSL.g:1381:2: rule__Question__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_13_3__1__Impl();

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
    // $ANTLR end "rule__Question__Group_13_3__1"


    // $ANTLR start "rule__Question__Group_13_3__1__Impl"
    // InternalDSL.g:1387:1: rule__Question__Group_13_3__1__Impl : ( ( rule__Question__EtiquetteAssignment_13_3_1 ) ) ;
    public final void rule__Question__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1391:1: ( ( ( rule__Question__EtiquetteAssignment_13_3_1 ) ) )
            // InternalDSL.g:1392:1: ( ( rule__Question__EtiquetteAssignment_13_3_1 ) )
            {
            // InternalDSL.g:1392:1: ( ( rule__Question__EtiquetteAssignment_13_3_1 ) )
            // InternalDSL.g:1393:2: ( rule__Question__EtiquetteAssignment_13_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_13_3_1()); 
            // InternalDSL.g:1394:2: ( rule__Question__EtiquetteAssignment_13_3_1 )
            // InternalDSL.g:1394:3: rule__Question__EtiquetteAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__EtiquetteAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_13_3_1()); 

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
    // $ANTLR end "rule__Question__Group_13_3__1__Impl"


    // $ANTLR start "rule__ELong__Group__0"
    // InternalDSL.g:1403:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1407:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalDSL.g:1408:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ELong__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ELong__Group__1();

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
    // $ANTLR end "rule__ELong__Group__0"


    // $ANTLR start "rule__ELong__Group__0__Impl"
    // InternalDSL.g:1415:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1419:1: ( ( ( '-' )? ) )
            // InternalDSL.g:1420:1: ( ( '-' )? )
            {
            // InternalDSL.g:1420:1: ( ( '-' )? )
            // InternalDSL.g:1421:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalDSL.g:1422:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1422:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__ELong__Group__0__Impl"


    // $ANTLR start "rule__ELong__Group__1"
    // InternalDSL.g:1430:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1434:1: ( rule__ELong__Group__1__Impl )
            // InternalDSL.g:1435:2: rule__ELong__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ELong__Group__1__Impl();

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
    // $ANTLR end "rule__ELong__Group__1"


    // $ANTLR start "rule__ELong__Group__1__Impl"
    // InternalDSL.g:1441:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1445:1: ( ( RULE_INT ) )
            // InternalDSL.g:1446:1: ( RULE_INT )
            {
            // InternalDSL.g:1446:1: ( RULE_INT )
            // InternalDSL.g:1447:2: RULE_INT
            {
             before(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ELong__Group__1__Impl"


    // $ANTLR start "rule__Reponse__Group__0"
    // InternalDSL.g:1457:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1461:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalDSL.g:1462:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Reponse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__1();

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
    // $ANTLR end "rule__Reponse__Group__0"


    // $ANTLR start "rule__Reponse__Group__0__Impl"
    // InternalDSL.g:1469:1: rule__Reponse__Group__0__Impl : ( ( rule__Reponse__ValideAssignment_0 )? ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1473:1: ( ( ( rule__Reponse__ValideAssignment_0 )? ) )
            // InternalDSL.g:1474:1: ( ( rule__Reponse__ValideAssignment_0 )? )
            {
            // InternalDSL.g:1474:1: ( ( rule__Reponse__ValideAssignment_0 )? )
            // InternalDSL.g:1475:2: ( rule__Reponse__ValideAssignment_0 )?
            {
             before(grammarAccess.getReponseAccess().getValideAssignment_0()); 
            // InternalDSL.g:1476:2: ( rule__Reponse__ValideAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1476:3: rule__Reponse__ValideAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reponse__ValideAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReponseAccess().getValideAssignment_0()); 

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
    // $ANTLR end "rule__Reponse__Group__0__Impl"


    // $ANTLR start "rule__Reponse__Group__1"
    // InternalDSL.g:1484:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1488:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalDSL.g:1489:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Reponse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__2();

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
    // $ANTLR end "rule__Reponse__Group__1"


    // $ANTLR start "rule__Reponse__Group__1__Impl"
    // InternalDSL.g:1496:1: rule__Reponse__Group__1__Impl : ( 'Reponse' ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1500:1: ( ( 'Reponse' ) )
            // InternalDSL.g:1501:1: ( 'Reponse' )
            {
            // InternalDSL.g:1501:1: ( 'Reponse' )
            // InternalDSL.g:1502:2: 'Reponse'
            {
             before(grammarAccess.getReponseAccess().getReponseKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getReponseKeyword_1()); 

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
    // $ANTLR end "rule__Reponse__Group__1__Impl"


    // $ANTLR start "rule__Reponse__Group__2"
    // InternalDSL.g:1511:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1515:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalDSL.g:1516:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Reponse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__3();

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
    // $ANTLR end "rule__Reponse__Group__2"


    // $ANTLR start "rule__Reponse__Group__2__Impl"
    // InternalDSL.g:1523:1: rule__Reponse__Group__2__Impl : ( '{' ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1527:1: ( ( '{' ) )
            // InternalDSL.g:1528:1: ( '{' )
            {
            // InternalDSL.g:1528:1: ( '{' )
            // InternalDSL.g:1529:2: '{'
            {
             before(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Reponse__Group__2__Impl"


    // $ANTLR start "rule__Reponse__Group__3"
    // InternalDSL.g:1538:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1542:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalDSL.g:1543:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Reponse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__4();

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
    // $ANTLR end "rule__Reponse__Group__3"


    // $ANTLR start "rule__Reponse__Group__3__Impl"
    // InternalDSL.g:1550:1: rule__Reponse__Group__3__Impl : ( 'intitule' ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1554:1: ( ( 'intitule' ) )
            // InternalDSL.g:1555:1: ( 'intitule' )
            {
            // InternalDSL.g:1555:1: ( 'intitule' )
            // InternalDSL.g:1556:2: 'intitule'
            {
             before(grammarAccess.getReponseAccess().getIntituleKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getIntituleKeyword_3()); 

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
    // $ANTLR end "rule__Reponse__Group__3__Impl"


    // $ANTLR start "rule__Reponse__Group__4"
    // InternalDSL.g:1565:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl rule__Reponse__Group__5 ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1569:1: ( rule__Reponse__Group__4__Impl rule__Reponse__Group__5 )
            // InternalDSL.g:1570:2: rule__Reponse__Group__4__Impl rule__Reponse__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Reponse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reponse__Group__5();

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
    // $ANTLR end "rule__Reponse__Group__4"


    // $ANTLR start "rule__Reponse__Group__4__Impl"
    // InternalDSL.g:1577:1: rule__Reponse__Group__4__Impl : ( ( rule__Reponse__IntituleAssignment_4 ) ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1581:1: ( ( ( rule__Reponse__IntituleAssignment_4 ) ) )
            // InternalDSL.g:1582:1: ( ( rule__Reponse__IntituleAssignment_4 ) )
            {
            // InternalDSL.g:1582:1: ( ( rule__Reponse__IntituleAssignment_4 ) )
            // InternalDSL.g:1583:2: ( rule__Reponse__IntituleAssignment_4 )
            {
             before(grammarAccess.getReponseAccess().getIntituleAssignment_4()); 
            // InternalDSL.g:1584:2: ( rule__Reponse__IntituleAssignment_4 )
            // InternalDSL.g:1584:3: rule__Reponse__IntituleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__IntituleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReponseAccess().getIntituleAssignment_4()); 

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
    // $ANTLR end "rule__Reponse__Group__4__Impl"


    // $ANTLR start "rule__Reponse__Group__5"
    // InternalDSL.g:1592:1: rule__Reponse__Group__5 : rule__Reponse__Group__5__Impl ;
    public final void rule__Reponse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1596:1: ( rule__Reponse__Group__5__Impl )
            // InternalDSL.g:1597:2: rule__Reponse__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reponse__Group__5__Impl();

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
    // $ANTLR end "rule__Reponse__Group__5"


    // $ANTLR start "rule__Reponse__Group__5__Impl"
    // InternalDSL.g:1603:1: rule__Reponse__Group__5__Impl : ( '}' ) ;
    public final void rule__Reponse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1607:1: ( ( '}' ) )
            // InternalDSL.g:1608:1: ( '}' )
            {
            // InternalDSL.g:1608:1: ( '}' )
            // InternalDSL.g:1609:2: '}'
            {
             before(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Reponse__Group__5__Impl"


    // $ANTLR start "rule__Etiquette__Group__0"
    // InternalDSL.g:1619:1: rule__Etiquette__Group__0 : rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 ;
    public final void rule__Etiquette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1623:1: ( rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 )
            // InternalDSL.g:1624:2: rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Etiquette__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__1();

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
    // $ANTLR end "rule__Etiquette__Group__0"


    // $ANTLR start "rule__Etiquette__Group__0__Impl"
    // InternalDSL.g:1631:1: rule__Etiquette__Group__0__Impl : ( 'Etiquette' ) ;
    public final void rule__Etiquette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1635:1: ( ( 'Etiquette' ) )
            // InternalDSL.g:1636:1: ( 'Etiquette' )
            {
            // InternalDSL.g:1636:1: ( 'Etiquette' )
            // InternalDSL.g:1637:2: 'Etiquette'
            {
             before(grammarAccess.getEtiquetteAccess().getEtiquetteKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getEtiquetteKeyword_0()); 

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
    // $ANTLR end "rule__Etiquette__Group__0__Impl"


    // $ANTLR start "rule__Etiquette__Group__1"
    // InternalDSL.g:1646:1: rule__Etiquette__Group__1 : rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2 ;
    public final void rule__Etiquette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1650:1: ( rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2 )
            // InternalDSL.g:1651:2: rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Etiquette__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__2();

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
    // $ANTLR end "rule__Etiquette__Group__1"


    // $ANTLR start "rule__Etiquette__Group__1__Impl"
    // InternalDSL.g:1658:1: rule__Etiquette__Group__1__Impl : ( '{' ) ;
    public final void rule__Etiquette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1662:1: ( ( '{' ) )
            // InternalDSL.g:1663:1: ( '{' )
            {
            // InternalDSL.g:1663:1: ( '{' )
            // InternalDSL.g:1664:2: '{'
            {
             before(grammarAccess.getEtiquetteAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Etiquette__Group__1__Impl"


    // $ANTLR start "rule__Etiquette__Group__2"
    // InternalDSL.g:1673:1: rule__Etiquette__Group__2 : rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3 ;
    public final void rule__Etiquette__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1677:1: ( rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3 )
            // InternalDSL.g:1678:2: rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Etiquette__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__3();

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
    // $ANTLR end "rule__Etiquette__Group__2"


    // $ANTLR start "rule__Etiquette__Group__2__Impl"
    // InternalDSL.g:1685:1: rule__Etiquette__Group__2__Impl : ( 'categorie' ) ;
    public final void rule__Etiquette__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1689:1: ( ( 'categorie' ) )
            // InternalDSL.g:1690:1: ( 'categorie' )
            {
            // InternalDSL.g:1690:1: ( 'categorie' )
            // InternalDSL.g:1691:2: 'categorie'
            {
             before(grammarAccess.getEtiquetteAccess().getCategorieKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getCategorieKeyword_2()); 

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
    // $ANTLR end "rule__Etiquette__Group__2__Impl"


    // $ANTLR start "rule__Etiquette__Group__3"
    // InternalDSL.g:1700:1: rule__Etiquette__Group__3 : rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4 ;
    public final void rule__Etiquette__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1704:1: ( rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4 )
            // InternalDSL.g:1705:2: rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Etiquette__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__4();

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
    // $ANTLR end "rule__Etiquette__Group__3"


    // $ANTLR start "rule__Etiquette__Group__3__Impl"
    // InternalDSL.g:1712:1: rule__Etiquette__Group__3__Impl : ( ( rule__Etiquette__CategorieAssignment_3 ) ) ;
    public final void rule__Etiquette__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1716:1: ( ( ( rule__Etiquette__CategorieAssignment_3 ) ) )
            // InternalDSL.g:1717:1: ( ( rule__Etiquette__CategorieAssignment_3 ) )
            {
            // InternalDSL.g:1717:1: ( ( rule__Etiquette__CategorieAssignment_3 ) )
            // InternalDSL.g:1718:2: ( rule__Etiquette__CategorieAssignment_3 )
            {
             before(grammarAccess.getEtiquetteAccess().getCategorieAssignment_3()); 
            // InternalDSL.g:1719:2: ( rule__Etiquette__CategorieAssignment_3 )
            // InternalDSL.g:1719:3: rule__Etiquette__CategorieAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__CategorieAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEtiquetteAccess().getCategorieAssignment_3()); 

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
    // $ANTLR end "rule__Etiquette__Group__3__Impl"


    // $ANTLR start "rule__Etiquette__Group__4"
    // InternalDSL.g:1727:1: rule__Etiquette__Group__4 : rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5 ;
    public final void rule__Etiquette__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1731:1: ( rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5 )
            // InternalDSL.g:1732:2: rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Etiquette__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__5();

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
    // $ANTLR end "rule__Etiquette__Group__4"


    // $ANTLR start "rule__Etiquette__Group__4__Impl"
    // InternalDSL.g:1739:1: rule__Etiquette__Group__4__Impl : ( ( rule__Etiquette__Group_4__0 )? ) ;
    public final void rule__Etiquette__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1743:1: ( ( ( rule__Etiquette__Group_4__0 )? ) )
            // InternalDSL.g:1744:1: ( ( rule__Etiquette__Group_4__0 )? )
            {
            // InternalDSL.g:1744:1: ( ( rule__Etiquette__Group_4__0 )? )
            // InternalDSL.g:1745:2: ( rule__Etiquette__Group_4__0 )?
            {
             before(grammarAccess.getEtiquetteAccess().getGroup_4()); 
            // InternalDSL.g:1746:2: ( rule__Etiquette__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1746:3: rule__Etiquette__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Etiquette__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEtiquetteAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Etiquette__Group__4__Impl"


    // $ANTLR start "rule__Etiquette__Group__5"
    // InternalDSL.g:1754:1: rule__Etiquette__Group__5 : rule__Etiquette__Group__5__Impl ;
    public final void rule__Etiquette__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1758:1: ( rule__Etiquette__Group__5__Impl )
            // InternalDSL.g:1759:2: rule__Etiquette__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__Group__5__Impl();

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
    // $ANTLR end "rule__Etiquette__Group__5"


    // $ANTLR start "rule__Etiquette__Group__5__Impl"
    // InternalDSL.g:1765:1: rule__Etiquette__Group__5__Impl : ( '}' ) ;
    public final void rule__Etiquette__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1769:1: ( ( '}' ) )
            // InternalDSL.g:1770:1: ( '}' )
            {
            // InternalDSL.g:1770:1: ( '}' )
            // InternalDSL.g:1771:2: '}'
            {
             before(grammarAccess.getEtiquetteAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Etiquette__Group__5__Impl"


    // $ANTLR start "rule__Etiquette__Group_4__0"
    // InternalDSL.g:1781:1: rule__Etiquette__Group_4__0 : rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1 ;
    public final void rule__Etiquette__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1785:1: ( rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1 )
            // InternalDSL.g:1786:2: rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Etiquette__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Etiquette__Group_4__1();

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
    // $ANTLR end "rule__Etiquette__Group_4__0"


    // $ANTLR start "rule__Etiquette__Group_4__0__Impl"
    // InternalDSL.g:1793:1: rule__Etiquette__Group_4__0__Impl : ( 'sousEtiquette' ) ;
    public final void rule__Etiquette__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1797:1: ( ( 'sousEtiquette' ) )
            // InternalDSL.g:1798:1: ( 'sousEtiquette' )
            {
            // InternalDSL.g:1798:1: ( 'sousEtiquette' )
            // InternalDSL.g:1799:2: 'sousEtiquette'
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEtiquetteAccess().getSousEtiquetteKeyword_4_0()); 

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
    // $ANTLR end "rule__Etiquette__Group_4__0__Impl"


    // $ANTLR start "rule__Etiquette__Group_4__1"
    // InternalDSL.g:1808:1: rule__Etiquette__Group_4__1 : rule__Etiquette__Group_4__1__Impl ;
    public final void rule__Etiquette__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1812:1: ( rule__Etiquette__Group_4__1__Impl )
            // InternalDSL.g:1813:2: rule__Etiquette__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__Group_4__1__Impl();

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
    // $ANTLR end "rule__Etiquette__Group_4__1"


    // $ANTLR start "rule__Etiquette__Group_4__1__Impl"
    // InternalDSL.g:1819:1: rule__Etiquette__Group_4__1__Impl : ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) ) ;
    public final void rule__Etiquette__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1823:1: ( ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) ) )
            // InternalDSL.g:1824:1: ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) )
            {
            // InternalDSL.g:1824:1: ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) )
            // InternalDSL.g:1825:2: ( rule__Etiquette__SousEtiquetteAssignment_4_1 )
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteAssignment_4_1()); 
            // InternalDSL.g:1826:2: ( rule__Etiquette__SousEtiquetteAssignment_4_1 )
            // InternalDSL.g:1826:3: rule__Etiquette__SousEtiquetteAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Etiquette__SousEtiquetteAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEtiquetteAccess().getSousEtiquetteAssignment_4_1()); 

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
    // $ANTLR end "rule__Etiquette__Group_4__1__Impl"


    // $ANTLR start "rule__Questionnaire__MelangeAssignment_0"
    // InternalDSL.g:1835:1: rule__Questionnaire__MelangeAssignment_0 : ( ( 'melange' ) ) ;
    public final void rule__Questionnaire__MelangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1839:1: ( ( ( 'melange' ) ) )
            // InternalDSL.g:1840:2: ( ( 'melange' ) )
            {
            // InternalDSL.g:1840:2: ( ( 'melange' ) )
            // InternalDSL.g:1841:3: ( 'melange' )
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0()); 
            // InternalDSL.g:1842:3: ( 'melange' )
            // InternalDSL.g:1843:4: 'melange'
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0()); 

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
    // $ANTLR end "rule__Questionnaire__MelangeAssignment_0"


    // $ANTLR start "rule__Questionnaire__TitreAssignment_4"
    // InternalDSL.g:1854:1: rule__Questionnaire__TitreAssignment_4 : ( ruleEString ) ;
    public final void rule__Questionnaire__TitreAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1858:1: ( ( ruleEString ) )
            // InternalDSL.g:1859:2: ( ruleEString )
            {
            // InternalDSL.g:1859:2: ( ruleEString )
            // InternalDSL.g:1860:3: ruleEString
            {
             before(grammarAccess.getQuestionnaireAccess().getTitreEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getTitreEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Questionnaire__TitreAssignment_4"


    // $ANTLR start "rule__Questionnaire__RetourArriereAssignment_5_1"
    // InternalDSL.g:1869:1: rule__Questionnaire__RetourArriereAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__Questionnaire__RetourArriereAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1873:1: ( ( ruleEBoolean ) )
            // InternalDSL.g:1874:2: ( ruleEBoolean )
            {
            // InternalDSL.g:1874:2: ( ruleEBoolean )
            // InternalDSL.g:1875:3: ruleEBoolean
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourArriereEBooleanParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getRetourArriereEBooleanParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__RetourArriereAssignment_5_1"


    // $ANTLR start "rule__Questionnaire__PossedeAssignment_8"
    // InternalDSL.g:1884:1: rule__Questionnaire__PossedeAssignment_8 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__PossedeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1888:1: ( ( ruleQuestion ) )
            // InternalDSL.g:1889:2: ( ruleQuestion )
            {
            // InternalDSL.g:1889:2: ( ruleQuestion )
            // InternalDSL.g:1890:3: ruleQuestion
            {
             before(grammarAccess.getQuestionnaireAccess().getPossedeQuestionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getPossedeQuestionParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Questionnaire__PossedeAssignment_8"


    // $ANTLR start "rule__Questionnaire__PossedeAssignment_9_1"
    // InternalDSL.g:1899:1: rule__Questionnaire__PossedeAssignment_9_1 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__PossedeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1903:1: ( ( ruleQuestion ) )
            // InternalDSL.g:1904:2: ( ruleQuestion )
            {
            // InternalDSL.g:1904:2: ( ruleQuestion )
            // InternalDSL.g:1905:3: ruleQuestion
            {
             before(grammarAccess.getQuestionnaireAccess().getPossedeQuestionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionnaireAccess().getPossedeQuestionParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Questionnaire__PossedeAssignment_9_1"


    // $ANTLR start "rule__Question__ReponseUniqueAssignment_0"
    // InternalDSL.g:1914:1: rule__Question__ReponseUniqueAssignment_0 : ( ( 'reponseUnique' ) ) ;
    public final void rule__Question__ReponseUniqueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1918:1: ( ( ( 'reponseUnique' ) ) )
            // InternalDSL.g:1919:2: ( ( 'reponseUnique' ) )
            {
            // InternalDSL.g:1919:2: ( ( 'reponseUnique' ) )
            // InternalDSL.g:1920:3: ( 'reponseUnique' )
            {
             before(grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0()); 
            // InternalDSL.g:1921:3: ( 'reponseUnique' )
            // InternalDSL.g:1922:4: 'reponseUnique'
            {
             before(grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0()); 

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
    // $ANTLR end "rule__Question__ReponseUniqueAssignment_0"


    // $ANTLR start "rule__Question__IntituleAssignment_4"
    // InternalDSL.g:1933:1: rule__Question__IntituleAssignment_4 : ( ruleEString ) ;
    public final void rule__Question__IntituleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1937:1: ( ( ruleEString ) )
            // InternalDSL.g:1938:2: ( ruleEString )
            {
            // InternalDSL.g:1938:2: ( ruleEString )
            // InternalDSL.g:1939:3: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getIntituleEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getIntituleEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Question__IntituleAssignment_4"


    // $ANTLR start "rule__Question__DifficulteAssignment_6"
    // InternalDSL.g:1948:1: rule__Question__DifficulteAssignment_6 : ( ruleELong ) ;
    public final void rule__Question__DifficulteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1952:1: ( ( ruleELong ) )
            // InternalDSL.g:1953:2: ( ruleELong )
            {
            // InternalDSL.g:1953:2: ( ruleELong )
            // InternalDSL.g:1954:3: ruleELong
            {
             before(grammarAccess.getQuestionAccess().getDifficulteELongParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getDifficulteELongParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Question__DifficulteAssignment_6"


    // $ANTLR start "rule__Question__QuestionSuivanteAssignment_7_1"
    // InternalDSL.g:1963:1: rule__Question__QuestionSuivanteAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Question__QuestionSuivanteAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1967:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:1968:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:1968:2: ( ( ruleEString ) )
            // InternalDSL.g:1969:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionAccess().getQuestionSuivanteQuestionCrossReference_7_1_0()); 
            // InternalDSL.g:1970:3: ( ruleEString )
            // InternalDSL.g:1971:4: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getQuestionSuivanteQuestionEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionSuivanteQuestionEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getQuestionAccess().getQuestionSuivanteQuestionCrossReference_7_1_0()); 

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
    // $ANTLR end "rule__Question__QuestionSuivanteAssignment_7_1"


    // $ANTLR start "rule__Question__ReponsesAssignment_10"
    // InternalDSL.g:1982:1: rule__Question__ReponsesAssignment_10 : ( ruleReponse ) ;
    public final void rule__Question__ReponsesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1986:1: ( ( ruleReponse ) )
            // InternalDSL.g:1987:2: ( ruleReponse )
            {
            // InternalDSL.g:1987:2: ( ruleReponse )
            // InternalDSL.g:1988:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Question__ReponsesAssignment_10"


    // $ANTLR start "rule__Question__ReponsesAssignment_11_1"
    // InternalDSL.g:1997:1: rule__Question__ReponsesAssignment_11_1 : ( ruleReponse ) ;
    public final void rule__Question__ReponsesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2001:1: ( ( ruleReponse ) )
            // InternalDSL.g:2002:2: ( ruleReponse )
            {
            // InternalDSL.g:2002:2: ( ruleReponse )
            // InternalDSL.g:2003:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Question__ReponsesAssignment_11_1"


    // $ANTLR start "rule__Question__EtiquetteAssignment_13_2"
    // InternalDSL.g:2012:1: rule__Question__EtiquetteAssignment_13_2 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2016:1: ( ( ruleEtiquette ) )
            // InternalDSL.g:2017:2: ( ruleEtiquette )
            {
            // InternalDSL.g:2017:2: ( ruleEtiquette )
            // InternalDSL.g:2018:3: ruleEtiquette
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_13_2_0()); 

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
    // $ANTLR end "rule__Question__EtiquetteAssignment_13_2"


    // $ANTLR start "rule__Question__EtiquetteAssignment_13_3_1"
    // InternalDSL.g:2027:1: rule__Question__EtiquetteAssignment_13_3_1 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2031:1: ( ( ruleEtiquette ) )
            // InternalDSL.g:2032:2: ( ruleEtiquette )
            {
            // InternalDSL.g:2032:2: ( ruleEtiquette )
            // InternalDSL.g:2033:3: ruleEtiquette
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_13_3_1_0()); 

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
    // $ANTLR end "rule__Question__EtiquetteAssignment_13_3_1"


    // $ANTLR start "rule__Reponse__ValideAssignment_0"
    // InternalDSL.g:2042:1: rule__Reponse__ValideAssignment_0 : ( ( 'valide' ) ) ;
    public final void rule__Reponse__ValideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2046:1: ( ( ( 'valide' ) ) )
            // InternalDSL.g:2047:2: ( ( 'valide' ) )
            {
            // InternalDSL.g:2047:2: ( ( 'valide' ) )
            // InternalDSL.g:2048:3: ( 'valide' )
            {
             before(grammarAccess.getReponseAccess().getValideValideKeyword_0_0()); 
            // InternalDSL.g:2049:3: ( 'valide' )
            // InternalDSL.g:2050:4: 'valide'
            {
             before(grammarAccess.getReponseAccess().getValideValideKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getReponseAccess().getValideValideKeyword_0_0()); 

            }

             after(grammarAccess.getReponseAccess().getValideValideKeyword_0_0()); 

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
    // $ANTLR end "rule__Reponse__ValideAssignment_0"


    // $ANTLR start "rule__Reponse__IntituleAssignment_4"
    // InternalDSL.g:2061:1: rule__Reponse__IntituleAssignment_4 : ( ruleEString ) ;
    public final void rule__Reponse__IntituleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2065:1: ( ( ruleEString ) )
            // InternalDSL.g:2066:2: ( ruleEString )
            {
            // InternalDSL.g:2066:2: ( ruleEString )
            // InternalDSL.g:2067:3: ruleEString
            {
             before(grammarAccess.getReponseAccess().getIntituleEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReponseAccess().getIntituleEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Reponse__IntituleAssignment_4"


    // $ANTLR start "rule__Etiquette__CategorieAssignment_3"
    // InternalDSL.g:2076:1: rule__Etiquette__CategorieAssignment_3 : ( ruleEString ) ;
    public final void rule__Etiquette__CategorieAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2080:1: ( ( ruleEString ) )
            // InternalDSL.g:2081:2: ( ruleEString )
            {
            // InternalDSL.g:2081:2: ( ruleEString )
            // InternalDSL.g:2082:3: ruleEString
            {
             before(grammarAccess.getEtiquetteAccess().getCategorieEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEtiquetteAccess().getCategorieEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Etiquette__CategorieAssignment_3"


    // $ANTLR start "rule__Etiquette__SousEtiquetteAssignment_4_1"
    // InternalDSL.g:2091:1: rule__Etiquette__SousEtiquetteAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Etiquette__SousEtiquetteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2095:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:2096:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:2096:2: ( ( ruleEString ) )
            // InternalDSL.g:2097:3: ( ruleEString )
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteEtiquetteCrossReference_4_1_0()); 
            // InternalDSL.g:2098:3: ( ruleEString )
            // InternalDSL.g:2099:4: ruleEString
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteEtiquetteEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEtiquetteAccess().getSousEtiquetteEtiquetteEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEtiquetteAccess().getSousEtiquetteEtiquetteCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Etiquette__SousEtiquetteAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040020000L});

}