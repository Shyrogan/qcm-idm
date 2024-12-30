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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'true'", "'false'", "'Questionnaire'", "'{'", "'titre'", "'possede'", "'}'", "'retourArriere'", "','", "'Question'", "'intitule'", "'difficulte'", "'reponses'", "'questionSuivante'", "'etiquette'", "'-'", "'Reponse'", "'Etiquette'", "'categorie'", "'sousEtiquette'", "'melange'", "'reponseUnique'", "'valide'"
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
    public static final int T__34=34;
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


    // $ANTLR start "entryRuleString0"
    // InternalDSL.g:228:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalDSL.g:229:1: ( ruleString0 EOF )
            // InternalDSL.g:230:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalDSL.g:237:1: ruleString0 : ( 'String' ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:241:2: ( ( 'String' ) )
            // InternalDSL.g:242:2: ( 'String' )
            {
            // InternalDSL.g:242:2: ( 'String' )
            // InternalDSL.g:243:3: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword()); 

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDSL.g:252:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:256:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDSL.g:257:2: ( RULE_STRING )
                    {
                    // InternalDSL.g:257:2: ( RULE_STRING )
                    // InternalDSL.g:258:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:263:2: ( RULE_ID )
                    {
                    // InternalDSL.g:263:2: ( RULE_ID )
                    // InternalDSL.g:264:3: RULE_ID
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
    // InternalDSL.g:273:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:277:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:278:2: ( 'true' )
                    {
                    // InternalDSL.g:278:2: ( 'true' )
                    // InternalDSL.g:279:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDSL.g:284:2: ( 'false' )
                    {
                    // InternalDSL.g:284:2: ( 'false' )
                    // InternalDSL.g:285:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,13,FOLLOW_2); 
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
    // InternalDSL.g:294:1: rule__Questionnaire__Group__0 : rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 ;
    public final void rule__Questionnaire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:298:1: ( rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1 )
            // InternalDSL.g:299:2: rule__Questionnaire__Group__0__Impl rule__Questionnaire__Group__1
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
    // InternalDSL.g:306:1: rule__Questionnaire__Group__0__Impl : ( ( rule__Questionnaire__MelangeAssignment_0 )? ) ;
    public final void rule__Questionnaire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:310:1: ( ( ( rule__Questionnaire__MelangeAssignment_0 )? ) )
            // InternalDSL.g:311:1: ( ( rule__Questionnaire__MelangeAssignment_0 )? )
            {
            // InternalDSL.g:311:1: ( ( rule__Questionnaire__MelangeAssignment_0 )? )
            // InternalDSL.g:312:2: ( rule__Questionnaire__MelangeAssignment_0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeAssignment_0()); 
            // InternalDSL.g:313:2: ( rule__Questionnaire__MelangeAssignment_0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSL.g:313:3: rule__Questionnaire__MelangeAssignment_0
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
    // InternalDSL.g:321:1: rule__Questionnaire__Group__1 : rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 ;
    public final void rule__Questionnaire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:325:1: ( rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2 )
            // InternalDSL.g:326:2: rule__Questionnaire__Group__1__Impl rule__Questionnaire__Group__2
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
    // InternalDSL.g:333:1: rule__Questionnaire__Group__1__Impl : ( 'Questionnaire' ) ;
    public final void rule__Questionnaire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:337:1: ( ( 'Questionnaire' ) )
            // InternalDSL.g:338:1: ( 'Questionnaire' )
            {
            // InternalDSL.g:338:1: ( 'Questionnaire' )
            // InternalDSL.g:339:2: 'Questionnaire'
            {
             before(grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDSL.g:348:1: rule__Questionnaire__Group__2 : rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 ;
    public final void rule__Questionnaire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:352:1: ( rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3 )
            // InternalDSL.g:353:2: rule__Questionnaire__Group__2__Impl rule__Questionnaire__Group__3
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
    // InternalDSL.g:360:1: rule__Questionnaire__Group__2__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:364:1: ( ( '{' ) )
            // InternalDSL.g:365:1: ( '{' )
            {
            // InternalDSL.g:365:1: ( '{' )
            // InternalDSL.g:366:2: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:375:1: rule__Questionnaire__Group__3 : rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 ;
    public final void rule__Questionnaire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:379:1: ( rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4 )
            // InternalDSL.g:380:2: rule__Questionnaire__Group__3__Impl rule__Questionnaire__Group__4
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
    // InternalDSL.g:387:1: rule__Questionnaire__Group__3__Impl : ( 'titre' ) ;
    public final void rule__Questionnaire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:391:1: ( ( 'titre' ) )
            // InternalDSL.g:392:1: ( 'titre' )
            {
            // InternalDSL.g:392:1: ( 'titre' )
            // InternalDSL.g:393:2: 'titre'
            {
             before(grammarAccess.getQuestionnaireAccess().getTitreKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDSL.g:402:1: rule__Questionnaire__Group__4 : rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 ;
    public final void rule__Questionnaire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:406:1: ( rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5 )
            // InternalDSL.g:407:2: rule__Questionnaire__Group__4__Impl rule__Questionnaire__Group__5
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
    // InternalDSL.g:414:1: rule__Questionnaire__Group__4__Impl : ( ( rule__Questionnaire__TitreAssignment_4 ) ) ;
    public final void rule__Questionnaire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:418:1: ( ( ( rule__Questionnaire__TitreAssignment_4 ) ) )
            // InternalDSL.g:419:1: ( ( rule__Questionnaire__TitreAssignment_4 ) )
            {
            // InternalDSL.g:419:1: ( ( rule__Questionnaire__TitreAssignment_4 ) )
            // InternalDSL.g:420:2: ( rule__Questionnaire__TitreAssignment_4 )
            {
             before(grammarAccess.getQuestionnaireAccess().getTitreAssignment_4()); 
            // InternalDSL.g:421:2: ( rule__Questionnaire__TitreAssignment_4 )
            // InternalDSL.g:421:3: rule__Questionnaire__TitreAssignment_4
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
    // InternalDSL.g:429:1: rule__Questionnaire__Group__5 : rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 ;
    public final void rule__Questionnaire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:433:1: ( rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6 )
            // InternalDSL.g:434:2: rule__Questionnaire__Group__5__Impl rule__Questionnaire__Group__6
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
    // InternalDSL.g:441:1: rule__Questionnaire__Group__5__Impl : ( ( rule__Questionnaire__Group_5__0 )? ) ;
    public final void rule__Questionnaire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:445:1: ( ( ( rule__Questionnaire__Group_5__0 )? ) )
            // InternalDSL.g:446:1: ( ( rule__Questionnaire__Group_5__0 )? )
            {
            // InternalDSL.g:446:1: ( ( rule__Questionnaire__Group_5__0 )? )
            // InternalDSL.g:447:2: ( rule__Questionnaire__Group_5__0 )?
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_5()); 
            // InternalDSL.g:448:2: ( rule__Questionnaire__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:448:3: rule__Questionnaire__Group_5__0
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
    // InternalDSL.g:456:1: rule__Questionnaire__Group__6 : rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7 ;
    public final void rule__Questionnaire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:460:1: ( rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7 )
            // InternalDSL.g:461:2: rule__Questionnaire__Group__6__Impl rule__Questionnaire__Group__7
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
    // InternalDSL.g:468:1: rule__Questionnaire__Group__6__Impl : ( 'possede' ) ;
    public final void rule__Questionnaire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:472:1: ( ( 'possede' ) )
            // InternalDSL.g:473:1: ( 'possede' )
            {
            // InternalDSL.g:473:1: ( 'possede' )
            // InternalDSL.g:474:2: 'possede'
            {
             before(grammarAccess.getQuestionnaireAccess().getPossedeKeyword_6()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDSL.g:483:1: rule__Questionnaire__Group__7 : rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8 ;
    public final void rule__Questionnaire__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:487:1: ( rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8 )
            // InternalDSL.g:488:2: rule__Questionnaire__Group__7__Impl rule__Questionnaire__Group__8
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
    // InternalDSL.g:495:1: rule__Questionnaire__Group__7__Impl : ( '{' ) ;
    public final void rule__Questionnaire__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:499:1: ( ( '{' ) )
            // InternalDSL.g:500:1: ( '{' )
            {
            // InternalDSL.g:500:1: ( '{' )
            // InternalDSL.g:501:2: '{'
            {
             before(grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:510:1: rule__Questionnaire__Group__8 : rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9 ;
    public final void rule__Questionnaire__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:514:1: ( rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9 )
            // InternalDSL.g:515:2: rule__Questionnaire__Group__8__Impl rule__Questionnaire__Group__9
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
    // InternalDSL.g:522:1: rule__Questionnaire__Group__8__Impl : ( ( rule__Questionnaire__PossedeAssignment_8 ) ) ;
    public final void rule__Questionnaire__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:526:1: ( ( ( rule__Questionnaire__PossedeAssignment_8 ) ) )
            // InternalDSL.g:527:1: ( ( rule__Questionnaire__PossedeAssignment_8 ) )
            {
            // InternalDSL.g:527:1: ( ( rule__Questionnaire__PossedeAssignment_8 ) )
            // InternalDSL.g:528:2: ( rule__Questionnaire__PossedeAssignment_8 )
            {
             before(grammarAccess.getQuestionnaireAccess().getPossedeAssignment_8()); 
            // InternalDSL.g:529:2: ( rule__Questionnaire__PossedeAssignment_8 )
            // InternalDSL.g:529:3: rule__Questionnaire__PossedeAssignment_8
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
    // InternalDSL.g:537:1: rule__Questionnaire__Group__9 : rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10 ;
    public final void rule__Questionnaire__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:541:1: ( rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10 )
            // InternalDSL.g:542:2: rule__Questionnaire__Group__9__Impl rule__Questionnaire__Group__10
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
    // InternalDSL.g:549:1: rule__Questionnaire__Group__9__Impl : ( ( rule__Questionnaire__Group_9__0 )* ) ;
    public final void rule__Questionnaire__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:553:1: ( ( ( rule__Questionnaire__Group_9__0 )* ) )
            // InternalDSL.g:554:1: ( ( rule__Questionnaire__Group_9__0 )* )
            {
            // InternalDSL.g:554:1: ( ( rule__Questionnaire__Group_9__0 )* )
            // InternalDSL.g:555:2: ( rule__Questionnaire__Group_9__0 )*
            {
             before(grammarAccess.getQuestionnaireAccess().getGroup_9()); 
            // InternalDSL.g:556:2: ( rule__Questionnaire__Group_9__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDSL.g:556:3: rule__Questionnaire__Group_9__0
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
    // InternalDSL.g:564:1: rule__Questionnaire__Group__10 : rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11 ;
    public final void rule__Questionnaire__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:568:1: ( rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11 )
            // InternalDSL.g:569:2: rule__Questionnaire__Group__10__Impl rule__Questionnaire__Group__11
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
    // InternalDSL.g:576:1: rule__Questionnaire__Group__10__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:580:1: ( ( '}' ) )
            // InternalDSL.g:581:1: ( '}' )
            {
            // InternalDSL.g:581:1: ( '}' )
            // InternalDSL.g:582:2: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_10()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:591:1: rule__Questionnaire__Group__11 : rule__Questionnaire__Group__11__Impl ;
    public final void rule__Questionnaire__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:595:1: ( rule__Questionnaire__Group__11__Impl )
            // InternalDSL.g:596:2: rule__Questionnaire__Group__11__Impl
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
    // InternalDSL.g:602:1: rule__Questionnaire__Group__11__Impl : ( '}' ) ;
    public final void rule__Questionnaire__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:606:1: ( ( '}' ) )
            // InternalDSL.g:607:1: ( '}' )
            {
            // InternalDSL.g:607:1: ( '}' )
            // InternalDSL.g:608:2: '}'
            {
             before(grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:618:1: rule__Questionnaire__Group_5__0 : rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1 ;
    public final void rule__Questionnaire__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:622:1: ( rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1 )
            // InternalDSL.g:623:2: rule__Questionnaire__Group_5__0__Impl rule__Questionnaire__Group_5__1
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
    // InternalDSL.g:630:1: rule__Questionnaire__Group_5__0__Impl : ( 'retourArriere' ) ;
    public final void rule__Questionnaire__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:634:1: ( ( 'retourArriere' ) )
            // InternalDSL.g:635:1: ( 'retourArriere' )
            {
            // InternalDSL.g:635:1: ( 'retourArriere' )
            // InternalDSL.g:636:2: 'retourArriere'
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourArriereKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDSL.g:645:1: rule__Questionnaire__Group_5__1 : rule__Questionnaire__Group_5__1__Impl ;
    public final void rule__Questionnaire__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:649:1: ( rule__Questionnaire__Group_5__1__Impl )
            // InternalDSL.g:650:2: rule__Questionnaire__Group_5__1__Impl
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
    // InternalDSL.g:656:1: rule__Questionnaire__Group_5__1__Impl : ( ( rule__Questionnaire__RetourArriereAssignment_5_1 ) ) ;
    public final void rule__Questionnaire__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:660:1: ( ( ( rule__Questionnaire__RetourArriereAssignment_5_1 ) ) )
            // InternalDSL.g:661:1: ( ( rule__Questionnaire__RetourArriereAssignment_5_1 ) )
            {
            // InternalDSL.g:661:1: ( ( rule__Questionnaire__RetourArriereAssignment_5_1 ) )
            // InternalDSL.g:662:2: ( rule__Questionnaire__RetourArriereAssignment_5_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getRetourArriereAssignment_5_1()); 
            // InternalDSL.g:663:2: ( rule__Questionnaire__RetourArriereAssignment_5_1 )
            // InternalDSL.g:663:3: rule__Questionnaire__RetourArriereAssignment_5_1
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
    // InternalDSL.g:672:1: rule__Questionnaire__Group_9__0 : rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1 ;
    public final void rule__Questionnaire__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:676:1: ( rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1 )
            // InternalDSL.g:677:2: rule__Questionnaire__Group_9__0__Impl rule__Questionnaire__Group_9__1
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
    // InternalDSL.g:684:1: rule__Questionnaire__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Questionnaire__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:688:1: ( ( ',' ) )
            // InternalDSL.g:689:1: ( ',' )
            {
            // InternalDSL.g:689:1: ( ',' )
            // InternalDSL.g:690:2: ','
            {
             before(grammarAccess.getQuestionnaireAccess().getCommaKeyword_9_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:699:1: rule__Questionnaire__Group_9__1 : rule__Questionnaire__Group_9__1__Impl ;
    public final void rule__Questionnaire__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:703:1: ( rule__Questionnaire__Group_9__1__Impl )
            // InternalDSL.g:704:2: rule__Questionnaire__Group_9__1__Impl
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
    // InternalDSL.g:710:1: rule__Questionnaire__Group_9__1__Impl : ( ( rule__Questionnaire__PossedeAssignment_9_1 ) ) ;
    public final void rule__Questionnaire__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:714:1: ( ( ( rule__Questionnaire__PossedeAssignment_9_1 ) ) )
            // InternalDSL.g:715:1: ( ( rule__Questionnaire__PossedeAssignment_9_1 ) )
            {
            // InternalDSL.g:715:1: ( ( rule__Questionnaire__PossedeAssignment_9_1 ) )
            // InternalDSL.g:716:2: ( rule__Questionnaire__PossedeAssignment_9_1 )
            {
             before(grammarAccess.getQuestionnaireAccess().getPossedeAssignment_9_1()); 
            // InternalDSL.g:717:2: ( rule__Questionnaire__PossedeAssignment_9_1 )
            // InternalDSL.g:717:3: rule__Questionnaire__PossedeAssignment_9_1
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
    // InternalDSL.g:726:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:730:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalDSL.g:731:2: rule__Question__Group__0__Impl rule__Question__Group__1
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
    // InternalDSL.g:738:1: rule__Question__Group__0__Impl : ( ( rule__Question__ReponseUniqueAssignment_0 ) ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:742:1: ( ( ( rule__Question__ReponseUniqueAssignment_0 ) ) )
            // InternalDSL.g:743:1: ( ( rule__Question__ReponseUniqueAssignment_0 ) )
            {
            // InternalDSL.g:743:1: ( ( rule__Question__ReponseUniqueAssignment_0 ) )
            // InternalDSL.g:744:2: ( rule__Question__ReponseUniqueAssignment_0 )
            {
             before(grammarAccess.getQuestionAccess().getReponseUniqueAssignment_0()); 
            // InternalDSL.g:745:2: ( rule__Question__ReponseUniqueAssignment_0 )
            // InternalDSL.g:745:3: rule__Question__ReponseUniqueAssignment_0
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
    // InternalDSL.g:753:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:757:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalDSL.g:758:2: rule__Question__Group__1__Impl rule__Question__Group__2
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
    // InternalDSL.g:765:1: rule__Question__Group__1__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:769:1: ( ( 'Question' ) )
            // InternalDSL.g:770:1: ( 'Question' )
            {
            // InternalDSL.g:770:1: ( 'Question' )
            // InternalDSL.g:771:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDSL.g:780:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:784:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalDSL.g:785:2: rule__Question__Group__2__Impl rule__Question__Group__3
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
    // InternalDSL.g:792:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:796:1: ( ( '{' ) )
            // InternalDSL.g:797:1: ( '{' )
            {
            // InternalDSL.g:797:1: ( '{' )
            // InternalDSL.g:798:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:807:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:811:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalDSL.g:812:2: rule__Question__Group__3__Impl rule__Question__Group__4
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
    // InternalDSL.g:819:1: rule__Question__Group__3__Impl : ( 'intitule' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:823:1: ( ( 'intitule' ) )
            // InternalDSL.g:824:1: ( 'intitule' )
            {
            // InternalDSL.g:824:1: ( 'intitule' )
            // InternalDSL.g:825:2: 'intitule'
            {
             before(grammarAccess.getQuestionAccess().getIntituleKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSL.g:834:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:838:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalDSL.g:839:2: rule__Question__Group__4__Impl rule__Question__Group__5
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
    // InternalDSL.g:846:1: rule__Question__Group__4__Impl : ( ( rule__Question__IntituleAssignment_4 ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:850:1: ( ( ( rule__Question__IntituleAssignment_4 ) ) )
            // InternalDSL.g:851:1: ( ( rule__Question__IntituleAssignment_4 ) )
            {
            // InternalDSL.g:851:1: ( ( rule__Question__IntituleAssignment_4 ) )
            // InternalDSL.g:852:2: ( rule__Question__IntituleAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getIntituleAssignment_4()); 
            // InternalDSL.g:853:2: ( rule__Question__IntituleAssignment_4 )
            // InternalDSL.g:853:3: rule__Question__IntituleAssignment_4
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
    // InternalDSL.g:861:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:865:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // InternalDSL.g:866:2: rule__Question__Group__5__Impl rule__Question__Group__6
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
    // InternalDSL.g:873:1: rule__Question__Group__5__Impl : ( 'difficulte' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:877:1: ( ( 'difficulte' ) )
            // InternalDSL.g:878:1: ( 'difficulte' )
            {
            // InternalDSL.g:878:1: ( 'difficulte' )
            // InternalDSL.g:879:2: 'difficulte'
            {
             before(grammarAccess.getQuestionAccess().getDifficulteKeyword_5()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDSL.g:888:1: rule__Question__Group__6 : rule__Question__Group__6__Impl rule__Question__Group__7 ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:892:1: ( rule__Question__Group__6__Impl rule__Question__Group__7 )
            // InternalDSL.g:893:2: rule__Question__Group__6__Impl rule__Question__Group__7
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
    // InternalDSL.g:900:1: rule__Question__Group__6__Impl : ( ( rule__Question__DifficulteAssignment_6 ) ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:904:1: ( ( ( rule__Question__DifficulteAssignment_6 ) ) )
            // InternalDSL.g:905:1: ( ( rule__Question__DifficulteAssignment_6 ) )
            {
            // InternalDSL.g:905:1: ( ( rule__Question__DifficulteAssignment_6 ) )
            // InternalDSL.g:906:2: ( rule__Question__DifficulteAssignment_6 )
            {
             before(grammarAccess.getQuestionAccess().getDifficulteAssignment_6()); 
            // InternalDSL.g:907:2: ( rule__Question__DifficulteAssignment_6 )
            // InternalDSL.g:907:3: rule__Question__DifficulteAssignment_6
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
    // InternalDSL.g:915:1: rule__Question__Group__7 : rule__Question__Group__7__Impl rule__Question__Group__8 ;
    public final void rule__Question__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:919:1: ( rule__Question__Group__7__Impl rule__Question__Group__8 )
            // InternalDSL.g:920:2: rule__Question__Group__7__Impl rule__Question__Group__8
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
    // InternalDSL.g:927:1: rule__Question__Group__7__Impl : ( ( rule__Question__Group_7__0 )? ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:931:1: ( ( ( rule__Question__Group_7__0 )? ) )
            // InternalDSL.g:932:1: ( ( rule__Question__Group_7__0 )? )
            {
            // InternalDSL.g:932:1: ( ( rule__Question__Group_7__0 )? )
            // InternalDSL.g:933:2: ( rule__Question__Group_7__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_7()); 
            // InternalDSL.g:934:2: ( rule__Question__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:934:3: rule__Question__Group_7__0
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
    // InternalDSL.g:942:1: rule__Question__Group__8 : rule__Question__Group__8__Impl rule__Question__Group__9 ;
    public final void rule__Question__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:946:1: ( rule__Question__Group__8__Impl rule__Question__Group__9 )
            // InternalDSL.g:947:2: rule__Question__Group__8__Impl rule__Question__Group__9
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
    // InternalDSL.g:954:1: rule__Question__Group__8__Impl : ( 'reponses' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:958:1: ( ( 'reponses' ) )
            // InternalDSL.g:959:1: ( 'reponses' )
            {
            // InternalDSL.g:959:1: ( 'reponses' )
            // InternalDSL.g:960:2: 'reponses'
            {
             before(grammarAccess.getQuestionAccess().getReponsesKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDSL.g:969:1: rule__Question__Group__9 : rule__Question__Group__9__Impl rule__Question__Group__10 ;
    public final void rule__Question__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:973:1: ( rule__Question__Group__9__Impl rule__Question__Group__10 )
            // InternalDSL.g:974:2: rule__Question__Group__9__Impl rule__Question__Group__10
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
    // InternalDSL.g:981:1: rule__Question__Group__9__Impl : ( '{' ) ;
    public final void rule__Question__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:985:1: ( ( '{' ) )
            // InternalDSL.g:986:1: ( '{' )
            {
            // InternalDSL.g:986:1: ( '{' )
            // InternalDSL.g:987:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:996:1: rule__Question__Group__10 : rule__Question__Group__10__Impl rule__Question__Group__11 ;
    public final void rule__Question__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1000:1: ( rule__Question__Group__10__Impl rule__Question__Group__11 )
            // InternalDSL.g:1001:2: rule__Question__Group__10__Impl rule__Question__Group__11
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
    // InternalDSL.g:1008:1: rule__Question__Group__10__Impl : ( ( rule__Question__ReponsesAssignment_10 ) ) ;
    public final void rule__Question__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1012:1: ( ( ( rule__Question__ReponsesAssignment_10 ) ) )
            // InternalDSL.g:1013:1: ( ( rule__Question__ReponsesAssignment_10 ) )
            {
            // InternalDSL.g:1013:1: ( ( rule__Question__ReponsesAssignment_10 ) )
            // InternalDSL.g:1014:2: ( rule__Question__ReponsesAssignment_10 )
            {
             before(grammarAccess.getQuestionAccess().getReponsesAssignment_10()); 
            // InternalDSL.g:1015:2: ( rule__Question__ReponsesAssignment_10 )
            // InternalDSL.g:1015:3: rule__Question__ReponsesAssignment_10
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
    // InternalDSL.g:1023:1: rule__Question__Group__11 : rule__Question__Group__11__Impl rule__Question__Group__12 ;
    public final void rule__Question__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1027:1: ( rule__Question__Group__11__Impl rule__Question__Group__12 )
            // InternalDSL.g:1028:2: rule__Question__Group__11__Impl rule__Question__Group__12
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
    // InternalDSL.g:1035:1: rule__Question__Group__11__Impl : ( ( rule__Question__Group_11__0 )* ) ;
    public final void rule__Question__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1039:1: ( ( ( rule__Question__Group_11__0 )* ) )
            // InternalDSL.g:1040:1: ( ( rule__Question__Group_11__0 )* )
            {
            // InternalDSL.g:1040:1: ( ( rule__Question__Group_11__0 )* )
            // InternalDSL.g:1041:2: ( rule__Question__Group_11__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_11()); 
            // InternalDSL.g:1042:2: ( rule__Question__Group_11__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSL.g:1042:3: rule__Question__Group_11__0
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
    // InternalDSL.g:1050:1: rule__Question__Group__12 : rule__Question__Group__12__Impl rule__Question__Group__13 ;
    public final void rule__Question__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1054:1: ( rule__Question__Group__12__Impl rule__Question__Group__13 )
            // InternalDSL.g:1055:2: rule__Question__Group__12__Impl rule__Question__Group__13
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
    // InternalDSL.g:1062:1: rule__Question__Group__12__Impl : ( '}' ) ;
    public final void rule__Question__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1066:1: ( ( '}' ) )
            // InternalDSL.g:1067:1: ( '}' )
            {
            // InternalDSL.g:1067:1: ( '}' )
            // InternalDSL.g:1068:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1077:1: rule__Question__Group__13 : rule__Question__Group__13__Impl rule__Question__Group__14 ;
    public final void rule__Question__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1081:1: ( rule__Question__Group__13__Impl rule__Question__Group__14 )
            // InternalDSL.g:1082:2: rule__Question__Group__13__Impl rule__Question__Group__14
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
    // InternalDSL.g:1089:1: rule__Question__Group__13__Impl : ( ( rule__Question__Group_13__0 )? ) ;
    public final void rule__Question__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1093:1: ( ( ( rule__Question__Group_13__0 )? ) )
            // InternalDSL.g:1094:1: ( ( rule__Question__Group_13__0 )? )
            {
            // InternalDSL.g:1094:1: ( ( rule__Question__Group_13__0 )? )
            // InternalDSL.g:1095:2: ( rule__Question__Group_13__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_13()); 
            // InternalDSL.g:1096:2: ( rule__Question__Group_13__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSL.g:1096:3: rule__Question__Group_13__0
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
    // InternalDSL.g:1104:1: rule__Question__Group__14 : rule__Question__Group__14__Impl ;
    public final void rule__Question__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1108:1: ( rule__Question__Group__14__Impl )
            // InternalDSL.g:1109:2: rule__Question__Group__14__Impl
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
    // InternalDSL.g:1115:1: rule__Question__Group__14__Impl : ( '}' ) ;
    public final void rule__Question__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1119:1: ( ( '}' ) )
            // InternalDSL.g:1120:1: ( '}' )
            {
            // InternalDSL.g:1120:1: ( '}' )
            // InternalDSL.g:1121:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1131:1: rule__Question__Group_7__0 : rule__Question__Group_7__0__Impl rule__Question__Group_7__1 ;
    public final void rule__Question__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1135:1: ( rule__Question__Group_7__0__Impl rule__Question__Group_7__1 )
            // InternalDSL.g:1136:2: rule__Question__Group_7__0__Impl rule__Question__Group_7__1
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
    // InternalDSL.g:1143:1: rule__Question__Group_7__0__Impl : ( 'questionSuivante' ) ;
    public final void rule__Question__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1147:1: ( ( 'questionSuivante' ) )
            // InternalDSL.g:1148:1: ( 'questionSuivante' )
            {
            // InternalDSL.g:1148:1: ( 'questionSuivante' )
            // InternalDSL.g:1149:2: 'questionSuivante'
            {
             before(grammarAccess.getQuestionAccess().getQuestionSuivanteKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDSL.g:1158:1: rule__Question__Group_7__1 : rule__Question__Group_7__1__Impl ;
    public final void rule__Question__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1162:1: ( rule__Question__Group_7__1__Impl )
            // InternalDSL.g:1163:2: rule__Question__Group_7__1__Impl
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
    // InternalDSL.g:1169:1: rule__Question__Group_7__1__Impl : ( ( rule__Question__QuestionSuivanteAssignment_7_1 ) ) ;
    public final void rule__Question__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1173:1: ( ( ( rule__Question__QuestionSuivanteAssignment_7_1 ) ) )
            // InternalDSL.g:1174:1: ( ( rule__Question__QuestionSuivanteAssignment_7_1 ) )
            {
            // InternalDSL.g:1174:1: ( ( rule__Question__QuestionSuivanteAssignment_7_1 ) )
            // InternalDSL.g:1175:2: ( rule__Question__QuestionSuivanteAssignment_7_1 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionSuivanteAssignment_7_1()); 
            // InternalDSL.g:1176:2: ( rule__Question__QuestionSuivanteAssignment_7_1 )
            // InternalDSL.g:1176:3: rule__Question__QuestionSuivanteAssignment_7_1
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
    // InternalDSL.g:1185:1: rule__Question__Group_11__0 : rule__Question__Group_11__0__Impl rule__Question__Group_11__1 ;
    public final void rule__Question__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1189:1: ( rule__Question__Group_11__0__Impl rule__Question__Group_11__1 )
            // InternalDSL.g:1190:2: rule__Question__Group_11__0__Impl rule__Question__Group_11__1
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
    // InternalDSL.g:1197:1: rule__Question__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1201:1: ( ( ',' ) )
            // InternalDSL.g:1202:1: ( ',' )
            {
            // InternalDSL.g:1202:1: ( ',' )
            // InternalDSL.g:1203:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_11_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:1212:1: rule__Question__Group_11__1 : rule__Question__Group_11__1__Impl ;
    public final void rule__Question__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1216:1: ( rule__Question__Group_11__1__Impl )
            // InternalDSL.g:1217:2: rule__Question__Group_11__1__Impl
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
    // InternalDSL.g:1223:1: rule__Question__Group_11__1__Impl : ( ( rule__Question__ReponsesAssignment_11_1 ) ) ;
    public final void rule__Question__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1227:1: ( ( ( rule__Question__ReponsesAssignment_11_1 ) ) )
            // InternalDSL.g:1228:1: ( ( rule__Question__ReponsesAssignment_11_1 ) )
            {
            // InternalDSL.g:1228:1: ( ( rule__Question__ReponsesAssignment_11_1 ) )
            // InternalDSL.g:1229:2: ( rule__Question__ReponsesAssignment_11_1 )
            {
             before(grammarAccess.getQuestionAccess().getReponsesAssignment_11_1()); 
            // InternalDSL.g:1230:2: ( rule__Question__ReponsesAssignment_11_1 )
            // InternalDSL.g:1230:3: rule__Question__ReponsesAssignment_11_1
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
    // InternalDSL.g:1239:1: rule__Question__Group_13__0 : rule__Question__Group_13__0__Impl rule__Question__Group_13__1 ;
    public final void rule__Question__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1243:1: ( rule__Question__Group_13__0__Impl rule__Question__Group_13__1 )
            // InternalDSL.g:1244:2: rule__Question__Group_13__0__Impl rule__Question__Group_13__1
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
    // InternalDSL.g:1251:1: rule__Question__Group_13__0__Impl : ( 'etiquette' ) ;
    public final void rule__Question__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1255:1: ( ( 'etiquette' ) )
            // InternalDSL.g:1256:1: ( 'etiquette' )
            {
            // InternalDSL.g:1256:1: ( 'etiquette' )
            // InternalDSL.g:1257:2: 'etiquette'
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteKeyword_13_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:1266:1: rule__Question__Group_13__1 : rule__Question__Group_13__1__Impl rule__Question__Group_13__2 ;
    public final void rule__Question__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1270:1: ( rule__Question__Group_13__1__Impl rule__Question__Group_13__2 )
            // InternalDSL.g:1271:2: rule__Question__Group_13__1__Impl rule__Question__Group_13__2
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
    // InternalDSL.g:1278:1: rule__Question__Group_13__1__Impl : ( '{' ) ;
    public final void rule__Question__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1282:1: ( ( '{' ) )
            // InternalDSL.g:1283:1: ( '{' )
            {
            // InternalDSL.g:1283:1: ( '{' )
            // InternalDSL.g:1284:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:1293:1: rule__Question__Group_13__2 : rule__Question__Group_13__2__Impl rule__Question__Group_13__3 ;
    public final void rule__Question__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1297:1: ( rule__Question__Group_13__2__Impl rule__Question__Group_13__3 )
            // InternalDSL.g:1298:2: rule__Question__Group_13__2__Impl rule__Question__Group_13__3
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
    // InternalDSL.g:1305:1: rule__Question__Group_13__2__Impl : ( ( rule__Question__EtiquetteAssignment_13_2 ) ) ;
    public final void rule__Question__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1309:1: ( ( ( rule__Question__EtiquetteAssignment_13_2 ) ) )
            // InternalDSL.g:1310:1: ( ( rule__Question__EtiquetteAssignment_13_2 ) )
            {
            // InternalDSL.g:1310:1: ( ( rule__Question__EtiquetteAssignment_13_2 ) )
            // InternalDSL.g:1311:2: ( rule__Question__EtiquetteAssignment_13_2 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_13_2()); 
            // InternalDSL.g:1312:2: ( rule__Question__EtiquetteAssignment_13_2 )
            // InternalDSL.g:1312:3: rule__Question__EtiquetteAssignment_13_2
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
    // InternalDSL.g:1320:1: rule__Question__Group_13__3 : rule__Question__Group_13__3__Impl rule__Question__Group_13__4 ;
    public final void rule__Question__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1324:1: ( rule__Question__Group_13__3__Impl rule__Question__Group_13__4 )
            // InternalDSL.g:1325:2: rule__Question__Group_13__3__Impl rule__Question__Group_13__4
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
    // InternalDSL.g:1332:1: rule__Question__Group_13__3__Impl : ( ( rule__Question__Group_13_3__0 )* ) ;
    public final void rule__Question__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1336:1: ( ( ( rule__Question__Group_13_3__0 )* ) )
            // InternalDSL.g:1337:1: ( ( rule__Question__Group_13_3__0 )* )
            {
            // InternalDSL.g:1337:1: ( ( rule__Question__Group_13_3__0 )* )
            // InternalDSL.g:1338:2: ( rule__Question__Group_13_3__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_13_3()); 
            // InternalDSL.g:1339:2: ( rule__Question__Group_13_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSL.g:1339:3: rule__Question__Group_13_3__0
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
    // InternalDSL.g:1347:1: rule__Question__Group_13__4 : rule__Question__Group_13__4__Impl ;
    public final void rule__Question__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1351:1: ( rule__Question__Group_13__4__Impl )
            // InternalDSL.g:1352:2: rule__Question__Group_13__4__Impl
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
    // InternalDSL.g:1358:1: rule__Question__Group_13__4__Impl : ( '}' ) ;
    public final void rule__Question__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1362:1: ( ( '}' ) )
            // InternalDSL.g:1363:1: ( '}' )
            {
            // InternalDSL.g:1363:1: ( '}' )
            // InternalDSL.g:1364:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1374:1: rule__Question__Group_13_3__0 : rule__Question__Group_13_3__0__Impl rule__Question__Group_13_3__1 ;
    public final void rule__Question__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1378:1: ( rule__Question__Group_13_3__0__Impl rule__Question__Group_13_3__1 )
            // InternalDSL.g:1379:2: rule__Question__Group_13_3__0__Impl rule__Question__Group_13_3__1
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
    // InternalDSL.g:1386:1: rule__Question__Group_13_3__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1390:1: ( ( ',' ) )
            // InternalDSL.g:1391:1: ( ',' )
            {
            // InternalDSL.g:1391:1: ( ',' )
            // InternalDSL.g:1392:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_13_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDSL.g:1401:1: rule__Question__Group_13_3__1 : rule__Question__Group_13_3__1__Impl ;
    public final void rule__Question__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1405:1: ( rule__Question__Group_13_3__1__Impl )
            // InternalDSL.g:1406:2: rule__Question__Group_13_3__1__Impl
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
    // InternalDSL.g:1412:1: rule__Question__Group_13_3__1__Impl : ( ( rule__Question__EtiquetteAssignment_13_3_1 ) ) ;
    public final void rule__Question__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1416:1: ( ( ( rule__Question__EtiquetteAssignment_13_3_1 ) ) )
            // InternalDSL.g:1417:1: ( ( rule__Question__EtiquetteAssignment_13_3_1 ) )
            {
            // InternalDSL.g:1417:1: ( ( rule__Question__EtiquetteAssignment_13_3_1 ) )
            // InternalDSL.g:1418:2: ( rule__Question__EtiquetteAssignment_13_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_13_3_1()); 
            // InternalDSL.g:1419:2: ( rule__Question__EtiquetteAssignment_13_3_1 )
            // InternalDSL.g:1419:3: rule__Question__EtiquetteAssignment_13_3_1
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
    // InternalDSL.g:1428:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1432:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalDSL.g:1433:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
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
    // InternalDSL.g:1440:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1444:1: ( ( ( '-' )? ) )
            // InternalDSL.g:1445:1: ( ( '-' )? )
            {
            // InternalDSL.g:1445:1: ( ( '-' )? )
            // InternalDSL.g:1446:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalDSL.g:1447:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1447:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalDSL.g:1455:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1459:1: ( rule__ELong__Group__1__Impl )
            // InternalDSL.g:1460:2: rule__ELong__Group__1__Impl
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
    // InternalDSL.g:1466:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1470:1: ( ( RULE_INT ) )
            // InternalDSL.g:1471:1: ( RULE_INT )
            {
            // InternalDSL.g:1471:1: ( RULE_INT )
            // InternalDSL.g:1472:2: RULE_INT
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
    // InternalDSL.g:1482:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1486:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalDSL.g:1487:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
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
    // InternalDSL.g:1494:1: rule__Reponse__Group__0__Impl : ( ( rule__Reponse__ValideAssignment_0 )? ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1498:1: ( ( ( rule__Reponse__ValideAssignment_0 )? ) )
            // InternalDSL.g:1499:1: ( ( rule__Reponse__ValideAssignment_0 )? )
            {
            // InternalDSL.g:1499:1: ( ( rule__Reponse__ValideAssignment_0 )? )
            // InternalDSL.g:1500:2: ( rule__Reponse__ValideAssignment_0 )?
            {
             before(grammarAccess.getReponseAccess().getValideAssignment_0()); 
            // InternalDSL.g:1501:2: ( rule__Reponse__ValideAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1501:3: rule__Reponse__ValideAssignment_0
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
    // InternalDSL.g:1509:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1513:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalDSL.g:1514:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
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
    // InternalDSL.g:1521:1: rule__Reponse__Group__1__Impl : ( 'Reponse' ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1525:1: ( ( 'Reponse' ) )
            // InternalDSL.g:1526:1: ( 'Reponse' )
            {
            // InternalDSL.g:1526:1: ( 'Reponse' )
            // InternalDSL.g:1527:2: 'Reponse'
            {
             before(grammarAccess.getReponseAccess().getReponseKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:1536:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1540:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalDSL.g:1541:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
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
    // InternalDSL.g:1548:1: rule__Reponse__Group__2__Impl : ( '{' ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1552:1: ( ( '{' ) )
            // InternalDSL.g:1553:1: ( '{' )
            {
            // InternalDSL.g:1553:1: ( '{' )
            // InternalDSL.g:1554:2: '{'
            {
             before(grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:1563:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1567:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalDSL.g:1568:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
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
    // InternalDSL.g:1575:1: rule__Reponse__Group__3__Impl : ( 'intitule' ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1579:1: ( ( 'intitule' ) )
            // InternalDSL.g:1580:1: ( 'intitule' )
            {
            // InternalDSL.g:1580:1: ( 'intitule' )
            // InternalDSL.g:1581:2: 'intitule'
            {
             before(grammarAccess.getReponseAccess().getIntituleKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDSL.g:1590:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl rule__Reponse__Group__5 ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1594:1: ( rule__Reponse__Group__4__Impl rule__Reponse__Group__5 )
            // InternalDSL.g:1595:2: rule__Reponse__Group__4__Impl rule__Reponse__Group__5
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
    // InternalDSL.g:1602:1: rule__Reponse__Group__4__Impl : ( ( rule__Reponse__IntituleAssignment_4 ) ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1606:1: ( ( ( rule__Reponse__IntituleAssignment_4 ) ) )
            // InternalDSL.g:1607:1: ( ( rule__Reponse__IntituleAssignment_4 ) )
            {
            // InternalDSL.g:1607:1: ( ( rule__Reponse__IntituleAssignment_4 ) )
            // InternalDSL.g:1608:2: ( rule__Reponse__IntituleAssignment_4 )
            {
             before(grammarAccess.getReponseAccess().getIntituleAssignment_4()); 
            // InternalDSL.g:1609:2: ( rule__Reponse__IntituleAssignment_4 )
            // InternalDSL.g:1609:3: rule__Reponse__IntituleAssignment_4
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
    // InternalDSL.g:1617:1: rule__Reponse__Group__5 : rule__Reponse__Group__5__Impl ;
    public final void rule__Reponse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1621:1: ( rule__Reponse__Group__5__Impl )
            // InternalDSL.g:1622:2: rule__Reponse__Group__5__Impl
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
    // InternalDSL.g:1628:1: rule__Reponse__Group__5__Impl : ( '}' ) ;
    public final void rule__Reponse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1632:1: ( ( '}' ) )
            // InternalDSL.g:1633:1: ( '}' )
            {
            // InternalDSL.g:1633:1: ( '}' )
            // InternalDSL.g:1634:2: '}'
            {
             before(grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1644:1: rule__Etiquette__Group__0 : rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 ;
    public final void rule__Etiquette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1648:1: ( rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 )
            // InternalDSL.g:1649:2: rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1
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
    // InternalDSL.g:1656:1: rule__Etiquette__Group__0__Impl : ( 'Etiquette' ) ;
    public final void rule__Etiquette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1660:1: ( ( 'Etiquette' ) )
            // InternalDSL.g:1661:1: ( 'Etiquette' )
            {
            // InternalDSL.g:1661:1: ( 'Etiquette' )
            // InternalDSL.g:1662:2: 'Etiquette'
            {
             before(grammarAccess.getEtiquetteAccess().getEtiquetteKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:1671:1: rule__Etiquette__Group__1 : rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2 ;
    public final void rule__Etiquette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1675:1: ( rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2 )
            // InternalDSL.g:1676:2: rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2
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
    // InternalDSL.g:1683:1: rule__Etiquette__Group__1__Impl : ( '{' ) ;
    public final void rule__Etiquette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1687:1: ( ( '{' ) )
            // InternalDSL.g:1688:1: ( '{' )
            {
            // InternalDSL.g:1688:1: ( '{' )
            // InternalDSL.g:1689:2: '{'
            {
             before(grammarAccess.getEtiquetteAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDSL.g:1698:1: rule__Etiquette__Group__2 : rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3 ;
    public final void rule__Etiquette__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1702:1: ( rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3 )
            // InternalDSL.g:1703:2: rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalDSL.g:1710:1: rule__Etiquette__Group__2__Impl : ( 'categorie' ) ;
    public final void rule__Etiquette__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1714:1: ( ( 'categorie' ) )
            // InternalDSL.g:1715:1: ( 'categorie' )
            {
            // InternalDSL.g:1715:1: ( 'categorie' )
            // InternalDSL.g:1716:2: 'categorie'
            {
             before(grammarAccess.getEtiquetteAccess().getCategorieKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:1725:1: rule__Etiquette__Group__3 : rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4 ;
    public final void rule__Etiquette__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1729:1: ( rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4 )
            // InternalDSL.g:1730:2: rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:1737:1: rule__Etiquette__Group__3__Impl : ( ( rule__Etiquette__CategorieAssignment_3 ) ) ;
    public final void rule__Etiquette__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1741:1: ( ( ( rule__Etiquette__CategorieAssignment_3 ) ) )
            // InternalDSL.g:1742:1: ( ( rule__Etiquette__CategorieAssignment_3 ) )
            {
            // InternalDSL.g:1742:1: ( ( rule__Etiquette__CategorieAssignment_3 ) )
            // InternalDSL.g:1743:2: ( rule__Etiquette__CategorieAssignment_3 )
            {
             before(grammarAccess.getEtiquetteAccess().getCategorieAssignment_3()); 
            // InternalDSL.g:1744:2: ( rule__Etiquette__CategorieAssignment_3 )
            // InternalDSL.g:1744:3: rule__Etiquette__CategorieAssignment_3
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
    // InternalDSL.g:1752:1: rule__Etiquette__Group__4 : rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5 ;
    public final void rule__Etiquette__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1756:1: ( rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5 )
            // InternalDSL.g:1757:2: rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalDSL.g:1764:1: rule__Etiquette__Group__4__Impl : ( ( rule__Etiquette__Group_4__0 )? ) ;
    public final void rule__Etiquette__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1768:1: ( ( ( rule__Etiquette__Group_4__0 )? ) )
            // InternalDSL.g:1769:1: ( ( rule__Etiquette__Group_4__0 )? )
            {
            // InternalDSL.g:1769:1: ( ( rule__Etiquette__Group_4__0 )? )
            // InternalDSL.g:1770:2: ( rule__Etiquette__Group_4__0 )?
            {
             before(grammarAccess.getEtiquetteAccess().getGroup_4()); 
            // InternalDSL.g:1771:2: ( rule__Etiquette__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:1771:3: rule__Etiquette__Group_4__0
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
    // InternalDSL.g:1779:1: rule__Etiquette__Group__5 : rule__Etiquette__Group__5__Impl ;
    public final void rule__Etiquette__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1783:1: ( rule__Etiquette__Group__5__Impl )
            // InternalDSL.g:1784:2: rule__Etiquette__Group__5__Impl
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
    // InternalDSL.g:1790:1: rule__Etiquette__Group__5__Impl : ( '}' ) ;
    public final void rule__Etiquette__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1794:1: ( ( '}' ) )
            // InternalDSL.g:1795:1: ( '}' )
            {
            // InternalDSL.g:1795:1: ( '}' )
            // InternalDSL.g:1796:2: '}'
            {
             before(grammarAccess.getEtiquetteAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDSL.g:1806:1: rule__Etiquette__Group_4__0 : rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1 ;
    public final void rule__Etiquette__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1810:1: ( rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1 )
            // InternalDSL.g:1811:2: rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1
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
    // InternalDSL.g:1818:1: rule__Etiquette__Group_4__0__Impl : ( 'sousEtiquette' ) ;
    public final void rule__Etiquette__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1822:1: ( ( 'sousEtiquette' ) )
            // InternalDSL.g:1823:1: ( 'sousEtiquette' )
            {
            // InternalDSL.g:1823:1: ( 'sousEtiquette' )
            // InternalDSL.g:1824:2: 'sousEtiquette'
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:1833:1: rule__Etiquette__Group_4__1 : rule__Etiquette__Group_4__1__Impl ;
    public final void rule__Etiquette__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1837:1: ( rule__Etiquette__Group_4__1__Impl )
            // InternalDSL.g:1838:2: rule__Etiquette__Group_4__1__Impl
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
    // InternalDSL.g:1844:1: rule__Etiquette__Group_4__1__Impl : ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) ) ;
    public final void rule__Etiquette__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1848:1: ( ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) ) )
            // InternalDSL.g:1849:1: ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) )
            {
            // InternalDSL.g:1849:1: ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) )
            // InternalDSL.g:1850:2: ( rule__Etiquette__SousEtiquetteAssignment_4_1 )
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteAssignment_4_1()); 
            // InternalDSL.g:1851:2: ( rule__Etiquette__SousEtiquetteAssignment_4_1 )
            // InternalDSL.g:1851:3: rule__Etiquette__SousEtiquetteAssignment_4_1
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
    // InternalDSL.g:1860:1: rule__Questionnaire__MelangeAssignment_0 : ( ( 'melange' ) ) ;
    public final void rule__Questionnaire__MelangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1864:1: ( ( ( 'melange' ) ) )
            // InternalDSL.g:1865:2: ( ( 'melange' ) )
            {
            // InternalDSL.g:1865:2: ( ( 'melange' ) )
            // InternalDSL.g:1866:3: ( 'melange' )
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0()); 
            // InternalDSL.g:1867:3: ( 'melange' )
            // InternalDSL.g:1868:4: 'melange'
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:1879:1: rule__Questionnaire__TitreAssignment_4 : ( ruleEString ) ;
    public final void rule__Questionnaire__TitreAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1883:1: ( ( ruleEString ) )
            // InternalDSL.g:1884:2: ( ruleEString )
            {
            // InternalDSL.g:1884:2: ( ruleEString )
            // InternalDSL.g:1885:3: ruleEString
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
    // InternalDSL.g:1894:1: rule__Questionnaire__RetourArriereAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__Questionnaire__RetourArriereAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1898:1: ( ( ruleEBoolean ) )
            // InternalDSL.g:1899:2: ( ruleEBoolean )
            {
            // InternalDSL.g:1899:2: ( ruleEBoolean )
            // InternalDSL.g:1900:3: ruleEBoolean
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
    // InternalDSL.g:1909:1: rule__Questionnaire__PossedeAssignment_8 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__PossedeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1913:1: ( ( ruleQuestion ) )
            // InternalDSL.g:1914:2: ( ruleQuestion )
            {
            // InternalDSL.g:1914:2: ( ruleQuestion )
            // InternalDSL.g:1915:3: ruleQuestion
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
    // InternalDSL.g:1924:1: rule__Questionnaire__PossedeAssignment_9_1 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__PossedeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1928:1: ( ( ruleQuestion ) )
            // InternalDSL.g:1929:2: ( ruleQuestion )
            {
            // InternalDSL.g:1929:2: ( ruleQuestion )
            // InternalDSL.g:1930:3: ruleQuestion
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
    // InternalDSL.g:1939:1: rule__Question__ReponseUniqueAssignment_0 : ( ( 'reponseUnique' ) ) ;
    public final void rule__Question__ReponseUniqueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1943:1: ( ( ( 'reponseUnique' ) ) )
            // InternalDSL.g:1944:2: ( ( 'reponseUnique' ) )
            {
            // InternalDSL.g:1944:2: ( ( 'reponseUnique' ) )
            // InternalDSL.g:1945:3: ( 'reponseUnique' )
            {
             before(grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0()); 
            // InternalDSL.g:1946:3: ( 'reponseUnique' )
            // InternalDSL.g:1947:4: 'reponseUnique'
            {
             before(grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalDSL.g:1958:1: rule__Question__IntituleAssignment_4 : ( ruleEString ) ;
    public final void rule__Question__IntituleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1962:1: ( ( ruleEString ) )
            // InternalDSL.g:1963:2: ( ruleEString )
            {
            // InternalDSL.g:1963:2: ( ruleEString )
            // InternalDSL.g:1964:3: ruleEString
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
    // InternalDSL.g:1973:1: rule__Question__DifficulteAssignment_6 : ( ruleELong ) ;
    public final void rule__Question__DifficulteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1977:1: ( ( ruleELong ) )
            // InternalDSL.g:1978:2: ( ruleELong )
            {
            // InternalDSL.g:1978:2: ( ruleELong )
            // InternalDSL.g:1979:3: ruleELong
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
    // InternalDSL.g:1988:1: rule__Question__QuestionSuivanteAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Question__QuestionSuivanteAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1992:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:1993:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:1993:2: ( ( ruleEString ) )
            // InternalDSL.g:1994:3: ( ruleEString )
            {
             before(grammarAccess.getQuestionAccess().getQuestionSuivanteQuestionCrossReference_7_1_0()); 
            // InternalDSL.g:1995:3: ( ruleEString )
            // InternalDSL.g:1996:4: ruleEString
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
    // InternalDSL.g:2007:1: rule__Question__ReponsesAssignment_10 : ( ruleReponse ) ;
    public final void rule__Question__ReponsesAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2011:1: ( ( ruleReponse ) )
            // InternalDSL.g:2012:2: ( ruleReponse )
            {
            // InternalDSL.g:2012:2: ( ruleReponse )
            // InternalDSL.g:2013:3: ruleReponse
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
    // InternalDSL.g:2022:1: rule__Question__ReponsesAssignment_11_1 : ( ruleReponse ) ;
    public final void rule__Question__ReponsesAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2026:1: ( ( ruleReponse ) )
            // InternalDSL.g:2027:2: ( ruleReponse )
            {
            // InternalDSL.g:2027:2: ( ruleReponse )
            // InternalDSL.g:2028:3: ruleReponse
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
    // InternalDSL.g:2037:1: rule__Question__EtiquetteAssignment_13_2 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2041:1: ( ( ruleEtiquette ) )
            // InternalDSL.g:2042:2: ( ruleEtiquette )
            {
            // InternalDSL.g:2042:2: ( ruleEtiquette )
            // InternalDSL.g:2043:3: ruleEtiquette
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
    // InternalDSL.g:2052:1: rule__Question__EtiquetteAssignment_13_3_1 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2056:1: ( ( ruleEtiquette ) )
            // InternalDSL.g:2057:2: ( ruleEtiquette )
            {
            // InternalDSL.g:2057:2: ( ruleEtiquette )
            // InternalDSL.g:2058:3: ruleEtiquette
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
    // InternalDSL.g:2067:1: rule__Reponse__ValideAssignment_0 : ( ( 'valide' ) ) ;
    public final void rule__Reponse__ValideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2071:1: ( ( ( 'valide' ) ) )
            // InternalDSL.g:2072:2: ( ( 'valide' ) )
            {
            // InternalDSL.g:2072:2: ( ( 'valide' ) )
            // InternalDSL.g:2073:3: ( 'valide' )
            {
             before(grammarAccess.getReponseAccess().getValideValideKeyword_0_0()); 
            // InternalDSL.g:2074:3: ( 'valide' )
            // InternalDSL.g:2075:4: 'valide'
            {
             before(grammarAccess.getReponseAccess().getValideValideKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalDSL.g:2086:1: rule__Reponse__IntituleAssignment_4 : ( ruleEString ) ;
    public final void rule__Reponse__IntituleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2090:1: ( ( ruleEString ) )
            // InternalDSL.g:2091:2: ( ruleEString )
            {
            // InternalDSL.g:2091:2: ( ruleEString )
            // InternalDSL.g:2092:3: ruleEString
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
    // InternalDSL.g:2101:1: rule__Etiquette__CategorieAssignment_3 : ( ruleString0 ) ;
    public final void rule__Etiquette__CategorieAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2105:1: ( ( ruleString0 ) )
            // InternalDSL.g:2106:2: ( ruleString0 )
            {
            // InternalDSL.g:2106:2: ( ruleString0 )
            // InternalDSL.g:2107:3: ruleString0
            {
             before(grammarAccess.getEtiquetteAccess().getCategorieString0ParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getEtiquetteAccess().getCategorieString0ParserRuleCall_3_0()); 

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
    // InternalDSL.g:2116:1: rule__Etiquette__SousEtiquetteAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Etiquette__SousEtiquetteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:2120:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:2121:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:2121:2: ( ( ruleEString ) )
            // InternalDSL.g:2122:3: ( ruleEString )
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteEtiquetteCrossReference_4_1_0()); 
            // InternalDSL.g:2123:3: ( ruleEString )
            // InternalDSL.g:2124:4: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080040000L});

}