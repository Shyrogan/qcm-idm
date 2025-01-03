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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Questionnaire'", "'{'", "'titre'", "'possede'", "'}'", "'retourArriere'", "','", "'Question'", "'intitule'", "'difficulte'", "'reponses'", "'etiquette'", "'-'", "'Reponse'", "'Etiquette'", "'categorie'", "'sousEtiquette'", "'melange'", "'reponseUnique'", "'valide'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
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

            if ( (LA3_0==30) ) {
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
            pushFollow(FOLLOW_4);
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
    // InternalDSL.g:902:1: rule__Question__Group__7__Impl : ( 'reponses' ) ;
    public final void rule__Question__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:906:1: ( ( 'reponses' ) )
            // InternalDSL.g:907:1: ( 'reponses' )
            {
            // InternalDSL.g:907:1: ( 'reponses' )
            // InternalDSL.g:908:2: 'reponses'
            {
             before(grammarAccess.getQuestionAccess().getReponsesKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getReponsesKeyword_7()); 

            }


            }

        }
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
            pushFollow(FOLLOW_18);
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
    // InternalDSL.g:929:1: rule__Question__Group__8__Impl : ( '{' ) ;
    public final void rule__Question__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:933:1: ( ( '{' ) )
            // InternalDSL.g:934:1: ( '{' )
            {
            // InternalDSL.g:934:1: ( '{' )
            // InternalDSL.g:935:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
            pushFollow(FOLLOW_9);
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
    // InternalDSL.g:956:1: rule__Question__Group__9__Impl : ( ( rule__Question__ReponsesAssignment_9 ) ) ;
    public final void rule__Question__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:960:1: ( ( ( rule__Question__ReponsesAssignment_9 ) ) )
            // InternalDSL.g:961:1: ( ( rule__Question__ReponsesAssignment_9 ) )
            {
            // InternalDSL.g:961:1: ( ( rule__Question__ReponsesAssignment_9 ) )
            // InternalDSL.g:962:2: ( rule__Question__ReponsesAssignment_9 )
            {
             before(grammarAccess.getQuestionAccess().getReponsesAssignment_9()); 
            // InternalDSL.g:963:2: ( rule__Question__ReponsesAssignment_9 )
            // InternalDSL.g:963:3: rule__Question__ReponsesAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponsesAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponsesAssignment_9()); 

            }


            }

        }
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
    // InternalDSL.g:983:1: rule__Question__Group__10__Impl : ( ( rule__Question__Group_10__0 )* ) ;
    public final void rule__Question__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:987:1: ( ( ( rule__Question__Group_10__0 )* ) )
            // InternalDSL.g:988:1: ( ( rule__Question__Group_10__0 )* )
            {
            // InternalDSL.g:988:1: ( ( rule__Question__Group_10__0 )* )
            // InternalDSL.g:989:2: ( rule__Question__Group_10__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_10()); 
            // InternalDSL.g:990:2: ( rule__Question__Group_10__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSL.g:990:3: rule__Question__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Question__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_10()); 

            }


            }

        }
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
            pushFollow(FOLLOW_19);
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
    // InternalDSL.g:1010:1: rule__Question__Group__11__Impl : ( '}' ) ;
    public final void rule__Question__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1014:1: ( ( '}' ) )
            // InternalDSL.g:1015:1: ( '}' )
            {
            // InternalDSL.g:1015:1: ( '}' )
            // InternalDSL.g:1016:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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
    // InternalDSL.g:1037:1: rule__Question__Group__12__Impl : ( ( rule__Question__Group_12__0 )? ) ;
    public final void rule__Question__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1041:1: ( ( ( rule__Question__Group_12__0 )? ) )
            // InternalDSL.g:1042:1: ( ( rule__Question__Group_12__0 )? )
            {
            // InternalDSL.g:1042:1: ( ( rule__Question__Group_12__0 )? )
            // InternalDSL.g:1043:2: ( rule__Question__Group_12__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_12()); 
            // InternalDSL.g:1044:2: ( rule__Question__Group_12__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDSL.g:1044:3: rule__Question__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_12()); 

            }


            }

        }
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
    // InternalDSL.g:1052:1: rule__Question__Group__13 : rule__Question__Group__13__Impl ;
    public final void rule__Question__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1056:1: ( rule__Question__Group__13__Impl )
            // InternalDSL.g:1057:2: rule__Question__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__13__Impl();

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
    // InternalDSL.g:1063:1: rule__Question__Group__13__Impl : ( '}' ) ;
    public final void rule__Question__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1067:1: ( ( '}' ) )
            // InternalDSL.g:1068:1: ( '}' )
            {
            // InternalDSL.g:1068:1: ( '}' )
            // InternalDSL.g:1069:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Question__Group_10__0"
    // InternalDSL.g:1079:1: rule__Question__Group_10__0 : rule__Question__Group_10__0__Impl rule__Question__Group_10__1 ;
    public final void rule__Question__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1083:1: ( rule__Question__Group_10__0__Impl rule__Question__Group_10__1 )
            // InternalDSL.g:1084:2: rule__Question__Group_10__0__Impl rule__Question__Group_10__1
            {
            pushFollow(FOLLOW_18);
            rule__Question__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_10__1();

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
    // $ANTLR end "rule__Question__Group_10__0"


    // $ANTLR start "rule__Question__Group_10__0__Impl"
    // InternalDSL.g:1091:1: rule__Question__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1095:1: ( ( ',' ) )
            // InternalDSL.g:1096:1: ( ',' )
            {
            // InternalDSL.g:1096:1: ( ',' )
            // InternalDSL.g:1097:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_10_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_10__0__Impl"


    // $ANTLR start "rule__Question__Group_10__1"
    // InternalDSL.g:1106:1: rule__Question__Group_10__1 : rule__Question__Group_10__1__Impl ;
    public final void rule__Question__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1110:1: ( rule__Question__Group_10__1__Impl )
            // InternalDSL.g:1111:2: rule__Question__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_10__1__Impl();

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
    // $ANTLR end "rule__Question__Group_10__1"


    // $ANTLR start "rule__Question__Group_10__1__Impl"
    // InternalDSL.g:1117:1: rule__Question__Group_10__1__Impl : ( ( rule__Question__ReponsesAssignment_10_1 ) ) ;
    public final void rule__Question__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1121:1: ( ( ( rule__Question__ReponsesAssignment_10_1 ) ) )
            // InternalDSL.g:1122:1: ( ( rule__Question__ReponsesAssignment_10_1 ) )
            {
            // InternalDSL.g:1122:1: ( ( rule__Question__ReponsesAssignment_10_1 ) )
            // InternalDSL.g:1123:2: ( rule__Question__ReponsesAssignment_10_1 )
            {
             before(grammarAccess.getQuestionAccess().getReponsesAssignment_10_1()); 
            // InternalDSL.g:1124:2: ( rule__Question__ReponsesAssignment_10_1 )
            // InternalDSL.g:1124:3: rule__Question__ReponsesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__ReponsesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getReponsesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_10__1__Impl"


    // $ANTLR start "rule__Question__Group_12__0"
    // InternalDSL.g:1133:1: rule__Question__Group_12__0 : rule__Question__Group_12__0__Impl rule__Question__Group_12__1 ;
    public final void rule__Question__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1137:1: ( rule__Question__Group_12__0__Impl rule__Question__Group_12__1 )
            // InternalDSL.g:1138:2: rule__Question__Group_12__0__Impl rule__Question__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Question__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_12__1();

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
    // $ANTLR end "rule__Question__Group_12__0"


    // $ANTLR start "rule__Question__Group_12__0__Impl"
    // InternalDSL.g:1145:1: rule__Question__Group_12__0__Impl : ( 'etiquette' ) ;
    public final void rule__Question__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1149:1: ( ( 'etiquette' ) )
            // InternalDSL.g:1150:1: ( 'etiquette' )
            {
            // InternalDSL.g:1150:1: ( 'etiquette' )
            // InternalDSL.g:1151:2: 'etiquette'
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteKeyword_12_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getEtiquetteKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_12__0__Impl"


    // $ANTLR start "rule__Question__Group_12__1"
    // InternalDSL.g:1160:1: rule__Question__Group_12__1 : rule__Question__Group_12__1__Impl rule__Question__Group_12__2 ;
    public final void rule__Question__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1164:1: ( rule__Question__Group_12__1__Impl rule__Question__Group_12__2 )
            // InternalDSL.g:1165:2: rule__Question__Group_12__1__Impl rule__Question__Group_12__2
            {
            pushFollow(FOLLOW_20);
            rule__Question__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_12__2();

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
    // $ANTLR end "rule__Question__Group_12__1"


    // $ANTLR start "rule__Question__Group_12__1__Impl"
    // InternalDSL.g:1172:1: rule__Question__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Question__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1176:1: ( ( '{' ) )
            // InternalDSL.g:1177:1: ( '{' )
            {
            // InternalDSL.g:1177:1: ( '{' )
            // InternalDSL.g:1178:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_12__1__Impl"


    // $ANTLR start "rule__Question__Group_12__2"
    // InternalDSL.g:1187:1: rule__Question__Group_12__2 : rule__Question__Group_12__2__Impl rule__Question__Group_12__3 ;
    public final void rule__Question__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1191:1: ( rule__Question__Group_12__2__Impl rule__Question__Group_12__3 )
            // InternalDSL.g:1192:2: rule__Question__Group_12__2__Impl rule__Question__Group_12__3
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_12__3();

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
    // $ANTLR end "rule__Question__Group_12__2"


    // $ANTLR start "rule__Question__Group_12__2__Impl"
    // InternalDSL.g:1199:1: rule__Question__Group_12__2__Impl : ( ( rule__Question__EtiquetteAssignment_12_2 ) ) ;
    public final void rule__Question__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1203:1: ( ( ( rule__Question__EtiquetteAssignment_12_2 ) ) )
            // InternalDSL.g:1204:1: ( ( rule__Question__EtiquetteAssignment_12_2 ) )
            {
            // InternalDSL.g:1204:1: ( ( rule__Question__EtiquetteAssignment_12_2 ) )
            // InternalDSL.g:1205:2: ( rule__Question__EtiquetteAssignment_12_2 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_12_2()); 
            // InternalDSL.g:1206:2: ( rule__Question__EtiquetteAssignment_12_2 )
            // InternalDSL.g:1206:3: rule__Question__EtiquetteAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Question__EtiquetteAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_12__2__Impl"


    // $ANTLR start "rule__Question__Group_12__3"
    // InternalDSL.g:1214:1: rule__Question__Group_12__3 : rule__Question__Group_12__3__Impl rule__Question__Group_12__4 ;
    public final void rule__Question__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1218:1: ( rule__Question__Group_12__3__Impl rule__Question__Group_12__4 )
            // InternalDSL.g:1219:2: rule__Question__Group_12__3__Impl rule__Question__Group_12__4
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_12__4();

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
    // $ANTLR end "rule__Question__Group_12__3"


    // $ANTLR start "rule__Question__Group_12__3__Impl"
    // InternalDSL.g:1226:1: rule__Question__Group_12__3__Impl : ( ( rule__Question__Group_12_3__0 )* ) ;
    public final void rule__Question__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1230:1: ( ( ( rule__Question__Group_12_3__0 )* ) )
            // InternalDSL.g:1231:1: ( ( rule__Question__Group_12_3__0 )* )
            {
            // InternalDSL.g:1231:1: ( ( rule__Question__Group_12_3__0 )* )
            // InternalDSL.g:1232:2: ( rule__Question__Group_12_3__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_12_3()); 
            // InternalDSL.g:1233:2: ( rule__Question__Group_12_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDSL.g:1233:3: rule__Question__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Question__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_12__3__Impl"


    // $ANTLR start "rule__Question__Group_12__4"
    // InternalDSL.g:1241:1: rule__Question__Group_12__4 : rule__Question__Group_12__4__Impl ;
    public final void rule__Question__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1245:1: ( rule__Question__Group_12__4__Impl )
            // InternalDSL.g:1246:2: rule__Question__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_12__4__Impl();

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
    // $ANTLR end "rule__Question__Group_12__4"


    // $ANTLR start "rule__Question__Group_12__4__Impl"
    // InternalDSL.g:1252:1: rule__Question__Group_12__4__Impl : ( '}' ) ;
    public final void rule__Question__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1256:1: ( ( '}' ) )
            // InternalDSL.g:1257:1: ( '}' )
            {
            // InternalDSL.g:1257:1: ( '}' )
            // InternalDSL.g:1258:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_12_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_12__4__Impl"


    // $ANTLR start "rule__Question__Group_12_3__0"
    // InternalDSL.g:1268:1: rule__Question__Group_12_3__0 : rule__Question__Group_12_3__0__Impl rule__Question__Group_12_3__1 ;
    public final void rule__Question__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1272:1: ( rule__Question__Group_12_3__0__Impl rule__Question__Group_12_3__1 )
            // InternalDSL.g:1273:2: rule__Question__Group_12_3__0__Impl rule__Question__Group_12_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Question__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_12_3__1();

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
    // $ANTLR end "rule__Question__Group_12_3__0"


    // $ANTLR start "rule__Question__Group_12_3__0__Impl"
    // InternalDSL.g:1280:1: rule__Question__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__Question__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1284:1: ( ( ',' ) )
            // InternalDSL.g:1285:1: ( ',' )
            {
            // InternalDSL.g:1285:1: ( ',' )
            // InternalDSL.g:1286:2: ','
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_12_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_12_3__0__Impl"


    // $ANTLR start "rule__Question__Group_12_3__1"
    // InternalDSL.g:1295:1: rule__Question__Group_12_3__1 : rule__Question__Group_12_3__1__Impl ;
    public final void rule__Question__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1299:1: ( rule__Question__Group_12_3__1__Impl )
            // InternalDSL.g:1300:2: rule__Question__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__Question__Group_12_3__1"


    // $ANTLR start "rule__Question__Group_12_3__1__Impl"
    // InternalDSL.g:1306:1: rule__Question__Group_12_3__1__Impl : ( ( rule__Question__EtiquetteAssignment_12_3_1 ) ) ;
    public final void rule__Question__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1310:1: ( ( ( rule__Question__EtiquetteAssignment_12_3_1 ) ) )
            // InternalDSL.g:1311:1: ( ( rule__Question__EtiquetteAssignment_12_3_1 ) )
            {
            // InternalDSL.g:1311:1: ( ( rule__Question__EtiquetteAssignment_12_3_1 ) )
            // InternalDSL.g:1312:2: ( rule__Question__EtiquetteAssignment_12_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteAssignment_12_3_1()); 
            // InternalDSL.g:1313:2: ( rule__Question__EtiquetteAssignment_12_3_1 )
            // InternalDSL.g:1313:3: rule__Question__EtiquetteAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__EtiquetteAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getEtiquetteAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_12_3__1__Impl"


    // $ANTLR start "rule__ELong__Group__0"
    // InternalDSL.g:1322:1: rule__ELong__Group__0 : rule__ELong__Group__0__Impl rule__ELong__Group__1 ;
    public final void rule__ELong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1326:1: ( rule__ELong__Group__0__Impl rule__ELong__Group__1 )
            // InternalDSL.g:1327:2: rule__ELong__Group__0__Impl rule__ELong__Group__1
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
    // InternalDSL.g:1334:1: rule__ELong__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ELong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1338:1: ( ( ( '-' )? ) )
            // InternalDSL.g:1339:1: ( ( '-' )? )
            {
            // InternalDSL.g:1339:1: ( ( '-' )? )
            // InternalDSL.g:1340:2: ( '-' )?
            {
             before(grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
            // InternalDSL.g:1341:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:1341:3: '-'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalDSL.g:1349:1: rule__ELong__Group__1 : rule__ELong__Group__1__Impl ;
    public final void rule__ELong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1353:1: ( rule__ELong__Group__1__Impl )
            // InternalDSL.g:1354:2: rule__ELong__Group__1__Impl
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
    // InternalDSL.g:1360:1: rule__ELong__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ELong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1364:1: ( ( RULE_INT ) )
            // InternalDSL.g:1365:1: ( RULE_INT )
            {
            // InternalDSL.g:1365:1: ( RULE_INT )
            // InternalDSL.g:1366:2: RULE_INT
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
    // InternalDSL.g:1376:1: rule__Reponse__Group__0 : rule__Reponse__Group__0__Impl rule__Reponse__Group__1 ;
    public final void rule__Reponse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1380:1: ( rule__Reponse__Group__0__Impl rule__Reponse__Group__1 )
            // InternalDSL.g:1381:2: rule__Reponse__Group__0__Impl rule__Reponse__Group__1
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
    // InternalDSL.g:1388:1: rule__Reponse__Group__0__Impl : ( ( rule__Reponse__ValideAssignment_0 )? ) ;
    public final void rule__Reponse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1392:1: ( ( ( rule__Reponse__ValideAssignment_0 )? ) )
            // InternalDSL.g:1393:1: ( ( rule__Reponse__ValideAssignment_0 )? )
            {
            // InternalDSL.g:1393:1: ( ( rule__Reponse__ValideAssignment_0 )? )
            // InternalDSL.g:1394:2: ( rule__Reponse__ValideAssignment_0 )?
            {
             before(grammarAccess.getReponseAccess().getValideAssignment_0()); 
            // InternalDSL.g:1395:2: ( rule__Reponse__ValideAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:1395:3: rule__Reponse__ValideAssignment_0
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
    // InternalDSL.g:1403:1: rule__Reponse__Group__1 : rule__Reponse__Group__1__Impl rule__Reponse__Group__2 ;
    public final void rule__Reponse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1407:1: ( rule__Reponse__Group__1__Impl rule__Reponse__Group__2 )
            // InternalDSL.g:1408:2: rule__Reponse__Group__1__Impl rule__Reponse__Group__2
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
    // InternalDSL.g:1415:1: rule__Reponse__Group__1__Impl : ( 'Reponse' ) ;
    public final void rule__Reponse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1419:1: ( ( 'Reponse' ) )
            // InternalDSL.g:1420:1: ( 'Reponse' )
            {
            // InternalDSL.g:1420:1: ( 'Reponse' )
            // InternalDSL.g:1421:2: 'Reponse'
            {
             before(grammarAccess.getReponseAccess().getReponseKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDSL.g:1430:1: rule__Reponse__Group__2 : rule__Reponse__Group__2__Impl rule__Reponse__Group__3 ;
    public final void rule__Reponse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1434:1: ( rule__Reponse__Group__2__Impl rule__Reponse__Group__3 )
            // InternalDSL.g:1435:2: rule__Reponse__Group__2__Impl rule__Reponse__Group__3
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
    // InternalDSL.g:1442:1: rule__Reponse__Group__2__Impl : ( '{' ) ;
    public final void rule__Reponse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1446:1: ( ( '{' ) )
            // InternalDSL.g:1447:1: ( '{' )
            {
            // InternalDSL.g:1447:1: ( '{' )
            // InternalDSL.g:1448:2: '{'
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
    // InternalDSL.g:1457:1: rule__Reponse__Group__3 : rule__Reponse__Group__3__Impl rule__Reponse__Group__4 ;
    public final void rule__Reponse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1461:1: ( rule__Reponse__Group__3__Impl rule__Reponse__Group__4 )
            // InternalDSL.g:1462:2: rule__Reponse__Group__3__Impl rule__Reponse__Group__4
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
    // InternalDSL.g:1469:1: rule__Reponse__Group__3__Impl : ( 'intitule' ) ;
    public final void rule__Reponse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1473:1: ( ( 'intitule' ) )
            // InternalDSL.g:1474:1: ( 'intitule' )
            {
            // InternalDSL.g:1474:1: ( 'intitule' )
            // InternalDSL.g:1475:2: 'intitule'
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
    // InternalDSL.g:1484:1: rule__Reponse__Group__4 : rule__Reponse__Group__4__Impl rule__Reponse__Group__5 ;
    public final void rule__Reponse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1488:1: ( rule__Reponse__Group__4__Impl rule__Reponse__Group__5 )
            // InternalDSL.g:1489:2: rule__Reponse__Group__4__Impl rule__Reponse__Group__5
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
    // InternalDSL.g:1496:1: rule__Reponse__Group__4__Impl : ( ( rule__Reponse__IntituleAssignment_4 ) ) ;
    public final void rule__Reponse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1500:1: ( ( ( rule__Reponse__IntituleAssignment_4 ) ) )
            // InternalDSL.g:1501:1: ( ( rule__Reponse__IntituleAssignment_4 ) )
            {
            // InternalDSL.g:1501:1: ( ( rule__Reponse__IntituleAssignment_4 ) )
            // InternalDSL.g:1502:2: ( rule__Reponse__IntituleAssignment_4 )
            {
             before(grammarAccess.getReponseAccess().getIntituleAssignment_4()); 
            // InternalDSL.g:1503:2: ( rule__Reponse__IntituleAssignment_4 )
            // InternalDSL.g:1503:3: rule__Reponse__IntituleAssignment_4
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
    // InternalDSL.g:1511:1: rule__Reponse__Group__5 : rule__Reponse__Group__5__Impl ;
    public final void rule__Reponse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1515:1: ( rule__Reponse__Group__5__Impl )
            // InternalDSL.g:1516:2: rule__Reponse__Group__5__Impl
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
    // InternalDSL.g:1522:1: rule__Reponse__Group__5__Impl : ( '}' ) ;
    public final void rule__Reponse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1526:1: ( ( '}' ) )
            // InternalDSL.g:1527:1: ( '}' )
            {
            // InternalDSL.g:1527:1: ( '}' )
            // InternalDSL.g:1528:2: '}'
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
    // InternalDSL.g:1538:1: rule__Etiquette__Group__0 : rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 ;
    public final void rule__Etiquette__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1542:1: ( rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1 )
            // InternalDSL.g:1543:2: rule__Etiquette__Group__0__Impl rule__Etiquette__Group__1
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
    // InternalDSL.g:1550:1: rule__Etiquette__Group__0__Impl : ( 'Etiquette' ) ;
    public final void rule__Etiquette__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1554:1: ( ( 'Etiquette' ) )
            // InternalDSL.g:1555:1: ( 'Etiquette' )
            {
            // InternalDSL.g:1555:1: ( 'Etiquette' )
            // InternalDSL.g:1556:2: 'Etiquette'
            {
             before(grammarAccess.getEtiquetteAccess().getEtiquetteKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDSL.g:1565:1: rule__Etiquette__Group__1 : rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2 ;
    public final void rule__Etiquette__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1569:1: ( rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2 )
            // InternalDSL.g:1570:2: rule__Etiquette__Group__1__Impl rule__Etiquette__Group__2
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
    // InternalDSL.g:1577:1: rule__Etiquette__Group__1__Impl : ( '{' ) ;
    public final void rule__Etiquette__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1581:1: ( ( '{' ) )
            // InternalDSL.g:1582:1: ( '{' )
            {
            // InternalDSL.g:1582:1: ( '{' )
            // InternalDSL.g:1583:2: '{'
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
    // InternalDSL.g:1592:1: rule__Etiquette__Group__2 : rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3 ;
    public final void rule__Etiquette__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1596:1: ( rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3 )
            // InternalDSL.g:1597:2: rule__Etiquette__Group__2__Impl rule__Etiquette__Group__3
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
    // InternalDSL.g:1604:1: rule__Etiquette__Group__2__Impl : ( 'categorie' ) ;
    public final void rule__Etiquette__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1608:1: ( ( 'categorie' ) )
            // InternalDSL.g:1609:1: ( 'categorie' )
            {
            // InternalDSL.g:1609:1: ( 'categorie' )
            // InternalDSL.g:1610:2: 'categorie'
            {
             before(grammarAccess.getEtiquetteAccess().getCategorieKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDSL.g:1619:1: rule__Etiquette__Group__3 : rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4 ;
    public final void rule__Etiquette__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1623:1: ( rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4 )
            // InternalDSL.g:1624:2: rule__Etiquette__Group__3__Impl rule__Etiquette__Group__4
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
    // InternalDSL.g:1631:1: rule__Etiquette__Group__3__Impl : ( ( rule__Etiquette__CategorieAssignment_3 ) ) ;
    public final void rule__Etiquette__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1635:1: ( ( ( rule__Etiquette__CategorieAssignment_3 ) ) )
            // InternalDSL.g:1636:1: ( ( rule__Etiquette__CategorieAssignment_3 ) )
            {
            // InternalDSL.g:1636:1: ( ( rule__Etiquette__CategorieAssignment_3 ) )
            // InternalDSL.g:1637:2: ( rule__Etiquette__CategorieAssignment_3 )
            {
             before(grammarAccess.getEtiquetteAccess().getCategorieAssignment_3()); 
            // InternalDSL.g:1638:2: ( rule__Etiquette__CategorieAssignment_3 )
            // InternalDSL.g:1638:3: rule__Etiquette__CategorieAssignment_3
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
    // InternalDSL.g:1646:1: rule__Etiquette__Group__4 : rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5 ;
    public final void rule__Etiquette__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1650:1: ( rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5 )
            // InternalDSL.g:1651:2: rule__Etiquette__Group__4__Impl rule__Etiquette__Group__5
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
    // InternalDSL.g:1658:1: rule__Etiquette__Group__4__Impl : ( ( rule__Etiquette__Group_4__0 )? ) ;
    public final void rule__Etiquette__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1662:1: ( ( ( rule__Etiquette__Group_4__0 )? ) )
            // InternalDSL.g:1663:1: ( ( rule__Etiquette__Group_4__0 )? )
            {
            // InternalDSL.g:1663:1: ( ( rule__Etiquette__Group_4__0 )? )
            // InternalDSL.g:1664:2: ( rule__Etiquette__Group_4__0 )?
            {
             before(grammarAccess.getEtiquetteAccess().getGroup_4()); 
            // InternalDSL.g:1665:2: ( rule__Etiquette__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:1665:3: rule__Etiquette__Group_4__0
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
    // InternalDSL.g:1673:1: rule__Etiquette__Group__5 : rule__Etiquette__Group__5__Impl ;
    public final void rule__Etiquette__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1677:1: ( rule__Etiquette__Group__5__Impl )
            // InternalDSL.g:1678:2: rule__Etiquette__Group__5__Impl
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
    // InternalDSL.g:1684:1: rule__Etiquette__Group__5__Impl : ( '}' ) ;
    public final void rule__Etiquette__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1688:1: ( ( '}' ) )
            // InternalDSL.g:1689:1: ( '}' )
            {
            // InternalDSL.g:1689:1: ( '}' )
            // InternalDSL.g:1690:2: '}'
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
    // InternalDSL.g:1700:1: rule__Etiquette__Group_4__0 : rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1 ;
    public final void rule__Etiquette__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1704:1: ( rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1 )
            // InternalDSL.g:1705:2: rule__Etiquette__Group_4__0__Impl rule__Etiquette__Group_4__1
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
    // InternalDSL.g:1712:1: rule__Etiquette__Group_4__0__Impl : ( 'sousEtiquette' ) ;
    public final void rule__Etiquette__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1716:1: ( ( 'sousEtiquette' ) )
            // InternalDSL.g:1717:1: ( 'sousEtiquette' )
            {
            // InternalDSL.g:1717:1: ( 'sousEtiquette' )
            // InternalDSL.g:1718:2: 'sousEtiquette'
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalDSL.g:1727:1: rule__Etiquette__Group_4__1 : rule__Etiquette__Group_4__1__Impl ;
    public final void rule__Etiquette__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1731:1: ( rule__Etiquette__Group_4__1__Impl )
            // InternalDSL.g:1732:2: rule__Etiquette__Group_4__1__Impl
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
    // InternalDSL.g:1738:1: rule__Etiquette__Group_4__1__Impl : ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) ) ;
    public final void rule__Etiquette__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1742:1: ( ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) ) )
            // InternalDSL.g:1743:1: ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) )
            {
            // InternalDSL.g:1743:1: ( ( rule__Etiquette__SousEtiquetteAssignment_4_1 ) )
            // InternalDSL.g:1744:2: ( rule__Etiquette__SousEtiquetteAssignment_4_1 )
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteAssignment_4_1()); 
            // InternalDSL.g:1745:2: ( rule__Etiquette__SousEtiquetteAssignment_4_1 )
            // InternalDSL.g:1745:3: rule__Etiquette__SousEtiquetteAssignment_4_1
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
    // InternalDSL.g:1754:1: rule__Questionnaire__MelangeAssignment_0 : ( ( 'melange' ) ) ;
    public final void rule__Questionnaire__MelangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1758:1: ( ( ( 'melange' ) ) )
            // InternalDSL.g:1759:2: ( ( 'melange' ) )
            {
            // InternalDSL.g:1759:2: ( ( 'melange' ) )
            // InternalDSL.g:1760:3: ( 'melange' )
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0()); 
            // InternalDSL.g:1761:3: ( 'melange' )
            // InternalDSL.g:1762:4: 'melange'
            {
             before(grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalDSL.g:1773:1: rule__Questionnaire__TitreAssignment_4 : ( ruleEString ) ;
    public final void rule__Questionnaire__TitreAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1777:1: ( ( ruleEString ) )
            // InternalDSL.g:1778:2: ( ruleEString )
            {
            // InternalDSL.g:1778:2: ( ruleEString )
            // InternalDSL.g:1779:3: ruleEString
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
    // InternalDSL.g:1788:1: rule__Questionnaire__RetourArriereAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__Questionnaire__RetourArriereAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1792:1: ( ( ruleEBoolean ) )
            // InternalDSL.g:1793:2: ( ruleEBoolean )
            {
            // InternalDSL.g:1793:2: ( ruleEBoolean )
            // InternalDSL.g:1794:3: ruleEBoolean
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
    // InternalDSL.g:1803:1: rule__Questionnaire__PossedeAssignment_8 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__PossedeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1807:1: ( ( ruleQuestion ) )
            // InternalDSL.g:1808:2: ( ruleQuestion )
            {
            // InternalDSL.g:1808:2: ( ruleQuestion )
            // InternalDSL.g:1809:3: ruleQuestion
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
    // InternalDSL.g:1818:1: rule__Questionnaire__PossedeAssignment_9_1 : ( ruleQuestion ) ;
    public final void rule__Questionnaire__PossedeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1822:1: ( ( ruleQuestion ) )
            // InternalDSL.g:1823:2: ( ruleQuestion )
            {
            // InternalDSL.g:1823:2: ( ruleQuestion )
            // InternalDSL.g:1824:3: ruleQuestion
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
    // InternalDSL.g:1833:1: rule__Question__ReponseUniqueAssignment_0 : ( ( 'reponseUnique' ) ) ;
    public final void rule__Question__ReponseUniqueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1837:1: ( ( ( 'reponseUnique' ) ) )
            // InternalDSL.g:1838:2: ( ( 'reponseUnique' ) )
            {
            // InternalDSL.g:1838:2: ( ( 'reponseUnique' ) )
            // InternalDSL.g:1839:3: ( 'reponseUnique' )
            {
             before(grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0()); 
            // InternalDSL.g:1840:3: ( 'reponseUnique' )
            // InternalDSL.g:1841:4: 'reponseUnique'
            {
             before(grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalDSL.g:1852:1: rule__Question__IntituleAssignment_4 : ( ruleEString ) ;
    public final void rule__Question__IntituleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1856:1: ( ( ruleEString ) )
            // InternalDSL.g:1857:2: ( ruleEString )
            {
            // InternalDSL.g:1857:2: ( ruleEString )
            // InternalDSL.g:1858:3: ruleEString
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
    // InternalDSL.g:1867:1: rule__Question__DifficulteAssignment_6 : ( ruleELong ) ;
    public final void rule__Question__DifficulteAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1871:1: ( ( ruleELong ) )
            // InternalDSL.g:1872:2: ( ruleELong )
            {
            // InternalDSL.g:1872:2: ( ruleELong )
            // InternalDSL.g:1873:3: ruleELong
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


    // $ANTLR start "rule__Question__ReponsesAssignment_9"
    // InternalDSL.g:1882:1: rule__Question__ReponsesAssignment_9 : ( ruleReponse ) ;
    public final void rule__Question__ReponsesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1886:1: ( ( ruleReponse ) )
            // InternalDSL.g:1887:2: ( ruleReponse )
            {
            // InternalDSL.g:1887:2: ( ruleReponse )
            // InternalDSL.g:1888:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ReponsesAssignment_9"


    // $ANTLR start "rule__Question__ReponsesAssignment_10_1"
    // InternalDSL.g:1897:1: rule__Question__ReponsesAssignment_10_1 : ( ruleReponse ) ;
    public final void rule__Question__ReponsesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1901:1: ( ( ruleReponse ) )
            // InternalDSL.g:1902:2: ( ruleReponse )
            {
            // InternalDSL.g:1902:2: ( ruleReponse )
            // InternalDSL.g:1903:3: ruleReponse
            {
             before(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReponse();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ReponsesAssignment_10_1"


    // $ANTLR start "rule__Question__EtiquetteAssignment_12_2"
    // InternalDSL.g:1912:1: rule__Question__EtiquetteAssignment_12_2 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1916:1: ( ( ruleEtiquette ) )
            // InternalDSL.g:1917:2: ( ruleEtiquette )
            {
            // InternalDSL.g:1917:2: ( ruleEtiquette )
            // InternalDSL.g:1918:3: ruleEtiquette
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__EtiquetteAssignment_12_2"


    // $ANTLR start "rule__Question__EtiquetteAssignment_12_3_1"
    // InternalDSL.g:1927:1: rule__Question__EtiquetteAssignment_12_3_1 : ( ruleEtiquette ) ;
    public final void rule__Question__EtiquetteAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1931:1: ( ( ruleEtiquette ) )
            // InternalDSL.g:1932:2: ( ruleEtiquette )
            {
            // InternalDSL.g:1932:2: ( ruleEtiquette )
            // InternalDSL.g:1933:3: ruleEtiquette
            {
             before(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEtiquette();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__EtiquetteAssignment_12_3_1"


    // $ANTLR start "rule__Reponse__ValideAssignment_0"
    // InternalDSL.g:1942:1: rule__Reponse__ValideAssignment_0 : ( ( 'valide' ) ) ;
    public final void rule__Reponse__ValideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1946:1: ( ( ( 'valide' ) ) )
            // InternalDSL.g:1947:2: ( ( 'valide' ) )
            {
            // InternalDSL.g:1947:2: ( ( 'valide' ) )
            // InternalDSL.g:1948:3: ( 'valide' )
            {
             before(grammarAccess.getReponseAccess().getValideValideKeyword_0_0()); 
            // InternalDSL.g:1949:3: ( 'valide' )
            // InternalDSL.g:1950:4: 'valide'
            {
             before(grammarAccess.getReponseAccess().getValideValideKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDSL.g:1961:1: rule__Reponse__IntituleAssignment_4 : ( ruleEString ) ;
    public final void rule__Reponse__IntituleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1965:1: ( ( ruleEString ) )
            // InternalDSL.g:1966:2: ( ruleEString )
            {
            // InternalDSL.g:1966:2: ( ruleEString )
            // InternalDSL.g:1967:3: ruleEString
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
    // InternalDSL.g:1976:1: rule__Etiquette__CategorieAssignment_3 : ( ruleEString ) ;
    public final void rule__Etiquette__CategorieAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1980:1: ( ( ruleEString ) )
            // InternalDSL.g:1981:2: ( ruleEString )
            {
            // InternalDSL.g:1981:2: ( ruleEString )
            // InternalDSL.g:1982:3: ruleEString
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
    // InternalDSL.g:1991:1: rule__Etiquette__SousEtiquetteAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Etiquette__SousEtiquetteAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDSL.g:1995:1: ( ( ( ruleEString ) ) )
            // InternalDSL.g:1996:2: ( ( ruleEString ) )
            {
            // InternalDSL.g:1996:2: ( ( ruleEString ) )
            // InternalDSL.g:1997:3: ( ruleEString )
            {
             before(grammarAccess.getEtiquetteAccess().getSousEtiquetteEtiquetteCrossReference_4_1_0()); 
            // InternalDSL.g:1998:3: ( ruleEString )
            // InternalDSL.g:1999:4: ruleEString
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000104000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020020000L});

}