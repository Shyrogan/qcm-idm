package qcm.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import qcm.dsl.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'melange'", "'Questionnaire'", "'{'", "'titre'", "'retourArriere'", "'possede'", "','", "'}'", "'true'", "'false'", "'reponseUnique'", "'Question'", "'intitule'", "'difficulte'", "'questionSuivante'", "'reponses'", "'etiquette'", "'-'", "'valide'", "'Reponse'", "'Etiquette'", "'categorie'", "'sousEtiquette'", "'String'"
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

        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Questionnaire";
       	}

       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuestionnaire"
    // InternalDSL.g:64:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // InternalDSL.g:64:54: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // InternalDSL.g:65:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // InternalDSL.g:71:1: ruleQuestionnaire returns [EObject current=null] : ( ( (lv_melange_0_0= 'melange' ) )? otherlv_1= 'Questionnaire' otherlv_2= '{' otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) (otherlv_5= 'retourArriere' ( (lv_retourArriere_6_0= ruleEBoolean ) ) )? otherlv_7= 'possede' otherlv_8= '{' ( (lv_possede_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_possede_11_0= ruleQuestion ) ) )* otherlv_12= '}' otherlv_13= '}' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token lv_melange_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_titre_4_0 = null;

        AntlrDatatypeRuleToken lv_retourArriere_6_0 = null;

        EObject lv_possede_9_0 = null;

        EObject lv_possede_11_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:77:2: ( ( ( (lv_melange_0_0= 'melange' ) )? otherlv_1= 'Questionnaire' otherlv_2= '{' otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) (otherlv_5= 'retourArriere' ( (lv_retourArriere_6_0= ruleEBoolean ) ) )? otherlv_7= 'possede' otherlv_8= '{' ( (lv_possede_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_possede_11_0= ruleQuestion ) ) )* otherlv_12= '}' otherlv_13= '}' ) )
            // InternalDSL.g:78:2: ( ( (lv_melange_0_0= 'melange' ) )? otherlv_1= 'Questionnaire' otherlv_2= '{' otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) (otherlv_5= 'retourArriere' ( (lv_retourArriere_6_0= ruleEBoolean ) ) )? otherlv_7= 'possede' otherlv_8= '{' ( (lv_possede_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_possede_11_0= ruleQuestion ) ) )* otherlv_12= '}' otherlv_13= '}' )
            {
            // InternalDSL.g:78:2: ( ( (lv_melange_0_0= 'melange' ) )? otherlv_1= 'Questionnaire' otherlv_2= '{' otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) (otherlv_5= 'retourArriere' ( (lv_retourArriere_6_0= ruleEBoolean ) ) )? otherlv_7= 'possede' otherlv_8= '{' ( (lv_possede_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_possede_11_0= ruleQuestion ) ) )* otherlv_12= '}' otherlv_13= '}' )
            // InternalDSL.g:79:3: ( (lv_melange_0_0= 'melange' ) )? otherlv_1= 'Questionnaire' otherlv_2= '{' otherlv_3= 'titre' ( (lv_titre_4_0= ruleEString ) ) (otherlv_5= 'retourArriere' ( (lv_retourArriere_6_0= ruleEBoolean ) ) )? otherlv_7= 'possede' otherlv_8= '{' ( (lv_possede_9_0= ruleQuestion ) ) (otherlv_10= ',' ( (lv_possede_11_0= ruleQuestion ) ) )* otherlv_12= '}' otherlv_13= '}'
            {
            // InternalDSL.g:79:3: ( (lv_melange_0_0= 'melange' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDSL.g:80:4: (lv_melange_0_0= 'melange' )
                    {
                    // InternalDSL.g:80:4: (lv_melange_0_0= 'melange' )
                    // InternalDSL.g:81:5: lv_melange_0_0= 'melange'
                    {
                    lv_melange_0_0=(Token)match(input,11,FOLLOW_3); 

                    					newLeafNode(lv_melange_0_0, grammarAccess.getQuestionnaireAccess().getMelangeMelangeKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionnaireRule());
                    					}
                    					setWithLastConsumed(current, "melange", lv_melange_0_0 != null, "melange");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getTitreKeyword_3());
            		
            // InternalDSL.g:105:3: ( (lv_titre_4_0= ruleEString ) )
            // InternalDSL.g:106:4: (lv_titre_4_0= ruleEString )
            {
            // InternalDSL.g:106:4: (lv_titre_4_0= ruleEString )
            // InternalDSL.g:107:5: lv_titre_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionnaireAccess().getTitreEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_titre_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            					}
            					set(
            						current,
            						"titre",
            						lv_titre_4_0,
            						"qcm.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:124:3: (otherlv_5= 'retourArriere' ( (lv_retourArriere_6_0= ruleEBoolean ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDSL.g:125:4: otherlv_5= 'retourArriere' ( (lv_retourArriere_6_0= ruleEBoolean ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionnaireAccess().getRetourArriereKeyword_5_0());
                    			
                    // InternalDSL.g:129:4: ( (lv_retourArriere_6_0= ruleEBoolean ) )
                    // InternalDSL.g:130:5: (lv_retourArriere_6_0= ruleEBoolean )
                    {
                    // InternalDSL.g:130:5: (lv_retourArriere_6_0= ruleEBoolean )
                    // InternalDSL.g:131:6: lv_retourArriere_6_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getRetourArriereEBooleanParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_retourArriere_6_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
                    						}
                    						set(
                    							current,
                    							"retourArriere",
                    							lv_retourArriere_6_0,
                    							"qcm.dsl.DSL.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestionnaireAccess().getPossedeKeyword_6());
            		
            otherlv_8=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getQuestionnaireAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalDSL.g:157:3: ( (lv_possede_9_0= ruleQuestion ) )
            // InternalDSL.g:158:4: (lv_possede_9_0= ruleQuestion )
            {
            // InternalDSL.g:158:4: (lv_possede_9_0= ruleQuestion )
            // InternalDSL.g:159:5: lv_possede_9_0= ruleQuestion
            {

            					newCompositeNode(grammarAccess.getQuestionnaireAccess().getPossedeQuestionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_possede_9_0=ruleQuestion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            					}
            					add(
            						current,
            						"possede",
            						lv_possede_9_0,
            						"qcm.dsl.DSL.Question");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:176:3: (otherlv_10= ',' ( (lv_possede_11_0= ruleQuestion ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDSL.g:177:4: otherlv_10= ',' ( (lv_possede_11_0= ruleQuestion ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_10, grammarAccess.getQuestionnaireAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalDSL.g:181:4: ( (lv_possede_11_0= ruleQuestion ) )
            	    // InternalDSL.g:182:5: (lv_possede_11_0= ruleQuestion )
            	    {
            	    // InternalDSL.g:182:5: (lv_possede_11_0= ruleQuestion )
            	    // InternalDSL.g:183:6: lv_possede_11_0= ruleQuestion
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionnaireAccess().getPossedeQuestionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_possede_11_0=ruleQuestion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    						}
            	    						add(
            	    							current,
            	    							"possede",
            	    							lv_possede_11_0,
            	    							"qcm.dsl.DSL.Question");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getQuestionnaireAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleEString"
    // InternalDSL.g:213:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDSL.g:213:47: (iv_ruleEString= ruleEString EOF )
            // InternalDSL.g:214:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDSL.g:220:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDSL.g:226:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDSL.g:227:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDSL.g:227:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSL.g:228:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:236:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalDSL.g:247:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDSL.g:247:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDSL.g:248:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalDSL.g:254:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDSL.g:260:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDSL.g:261:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDSL.g:261:2: (kw= 'true' | kw= 'false' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSL.g:262:3: kw= 'true'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDSL.g:268:3: kw= 'false'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleQuestion"
    // InternalDSL.g:277:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalDSL.g:277:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalDSL.g:278:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalDSL.g:284:1: ruleQuestion returns [EObject current=null] : ( ( (lv_reponseUnique_0_0= 'reponseUnique' ) ) otherlv_1= 'Question' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleELong ) ) (otherlv_7= 'questionSuivante' ( ( ruleEString ) ) )? otherlv_9= 'reponses' otherlv_10= '{' ( (lv_reponses_11_0= ruleReponse ) ) (otherlv_12= ',' ( (lv_reponses_13_0= ruleReponse ) ) )* otherlv_14= '}' (otherlv_15= 'etiquette' otherlv_16= '{' ( (lv_etiquette_17_0= ruleEtiquette ) ) (otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_reponseUnique_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_intitule_4_0 = null;

        AntlrDatatypeRuleToken lv_difficulte_6_0 = null;

        EObject lv_reponses_11_0 = null;

        EObject lv_reponses_13_0 = null;

        EObject lv_etiquette_17_0 = null;

        EObject lv_etiquette_19_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:290:2: ( ( ( (lv_reponseUnique_0_0= 'reponseUnique' ) ) otherlv_1= 'Question' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleELong ) ) (otherlv_7= 'questionSuivante' ( ( ruleEString ) ) )? otherlv_9= 'reponses' otherlv_10= '{' ( (lv_reponses_11_0= ruleReponse ) ) (otherlv_12= ',' ( (lv_reponses_13_0= ruleReponse ) ) )* otherlv_14= '}' (otherlv_15= 'etiquette' otherlv_16= '{' ( (lv_etiquette_17_0= ruleEtiquette ) ) (otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalDSL.g:291:2: ( ( (lv_reponseUnique_0_0= 'reponseUnique' ) ) otherlv_1= 'Question' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleELong ) ) (otherlv_7= 'questionSuivante' ( ( ruleEString ) ) )? otherlv_9= 'reponses' otherlv_10= '{' ( (lv_reponses_11_0= ruleReponse ) ) (otherlv_12= ',' ( (lv_reponses_13_0= ruleReponse ) ) )* otherlv_14= '}' (otherlv_15= 'etiquette' otherlv_16= '{' ( (lv_etiquette_17_0= ruleEtiquette ) ) (otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalDSL.g:291:2: ( ( (lv_reponseUnique_0_0= 'reponseUnique' ) ) otherlv_1= 'Question' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleELong ) ) (otherlv_7= 'questionSuivante' ( ( ruleEString ) ) )? otherlv_9= 'reponses' otherlv_10= '{' ( (lv_reponses_11_0= ruleReponse ) ) (otherlv_12= ',' ( (lv_reponses_13_0= ruleReponse ) ) )* otherlv_14= '}' (otherlv_15= 'etiquette' otherlv_16= '{' ( (lv_etiquette_17_0= ruleEtiquette ) ) (otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalDSL.g:292:3: ( (lv_reponseUnique_0_0= 'reponseUnique' ) ) otherlv_1= 'Question' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= 'difficulte' ( (lv_difficulte_6_0= ruleELong ) ) (otherlv_7= 'questionSuivante' ( ( ruleEString ) ) )? otherlv_9= 'reponses' otherlv_10= '{' ( (lv_reponses_11_0= ruleReponse ) ) (otherlv_12= ',' ( (lv_reponses_13_0= ruleReponse ) ) )* otherlv_14= '}' (otherlv_15= 'etiquette' otherlv_16= '{' ( (lv_etiquette_17_0= ruleEtiquette ) ) (otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalDSL.g:292:3: ( (lv_reponseUnique_0_0= 'reponseUnique' ) )
            // InternalDSL.g:293:4: (lv_reponseUnique_0_0= 'reponseUnique' )
            {
            // InternalDSL.g:293:4: (lv_reponseUnique_0_0= 'reponseUnique' )
            // InternalDSL.g:294:5: lv_reponseUnique_0_0= 'reponseUnique'
            {
            lv_reponseUnique_0_0=(Token)match(input,21,FOLLOW_13); 

            					newLeafNode(lv_reponseUnique_0_0, grammarAccess.getQuestionAccess().getReponseUniqueReponseUniqueKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(current, "reponseUnique", lv_reponseUnique_0_0 != null, "reponseUnique");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getQuestionKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getIntituleKeyword_3());
            		
            // InternalDSL.g:318:3: ( (lv_intitule_4_0= ruleEString ) )
            // InternalDSL.g:319:4: (lv_intitule_4_0= ruleEString )
            {
            // InternalDSL.g:319:4: (lv_intitule_4_0= ruleEString )
            // InternalDSL.g:320:5: lv_intitule_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getIntituleEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_intitule_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"intitule",
            						lv_intitule_4_0,
            						"qcm.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getDifficulteKeyword_5());
            		
            // InternalDSL.g:341:3: ( (lv_difficulte_6_0= ruleELong ) )
            // InternalDSL.g:342:4: (lv_difficulte_6_0= ruleELong )
            {
            // InternalDSL.g:342:4: (lv_difficulte_6_0= ruleELong )
            // InternalDSL.g:343:5: lv_difficulte_6_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getDifficulteELongParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_difficulte_6_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"difficulte",
            						lv_difficulte_6_0,
            						"qcm.dsl.DSL.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:360:3: (otherlv_7= 'questionSuivante' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDSL.g:361:4: otherlv_7= 'questionSuivante' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getQuestionSuivanteKeyword_7_0());
                    			
                    // InternalDSL.g:365:4: ( ( ruleEString ) )
                    // InternalDSL.g:366:5: ( ruleEString )
                    {
                    // InternalDSL.g:366:5: ( ruleEString )
                    // InternalDSL.g:367:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getQuestionAccess().getQuestionSuivanteQuestionCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getQuestionAccess().getReponsesKeyword_8());
            		
            otherlv_10=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalDSL.g:390:3: ( (lv_reponses_11_0= ruleReponse ) )
            // InternalDSL.g:391:4: (lv_reponses_11_0= ruleReponse )
            {
            // InternalDSL.g:391:4: (lv_reponses_11_0= ruleReponse )
            // InternalDSL.g:392:5: lv_reponses_11_0= ruleReponse
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_reponses_11_0=ruleReponse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					add(
            						current,
            						"reponses",
            						lv_reponses_11_0,
            						"qcm.dsl.DSL.Reponse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:409:3: (otherlv_12= ',' ( (lv_reponses_13_0= ruleReponse ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDSL.g:410:4: otherlv_12= ',' ( (lv_reponses_13_0= ruleReponse ) )
            	    {
            	    otherlv_12=(Token)match(input,17,FOLLOW_19); 

            	    				newLeafNode(otherlv_12, grammarAccess.getQuestionAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalDSL.g:414:4: ( (lv_reponses_13_0= ruleReponse ) )
            	    // InternalDSL.g:415:5: (lv_reponses_13_0= ruleReponse )
            	    {
            	    // InternalDSL.g:415:5: (lv_reponses_13_0= ruleReponse )
            	    // InternalDSL.g:416:6: lv_reponses_13_0= ruleReponse
            	    {

            	    						newCompositeNode(grammarAccess.getQuestionAccess().getReponsesReponseParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_reponses_13_0=ruleReponse();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"reponses",
            	    							lv_reponses_13_0,
            	    							"qcm.dsl.DSL.Reponse");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_14=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_14, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_12());
            		
            // InternalDSL.g:438:3: (otherlv_15= 'etiquette' otherlv_16= '{' ( (lv_etiquette_17_0= ruleEtiquette ) ) (otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) ) )* otherlv_20= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDSL.g:439:4: otherlv_15= 'etiquette' otherlv_16= '{' ( (lv_etiquette_17_0= ruleEtiquette ) ) (otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getQuestionAccess().getEtiquetteKeyword_13_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalDSL.g:447:4: ( (lv_etiquette_17_0= ruleEtiquette ) )
                    // InternalDSL.g:448:5: (lv_etiquette_17_0= ruleEtiquette )
                    {
                    // InternalDSL.g:448:5: (lv_etiquette_17_0= ruleEtiquette )
                    // InternalDSL.g:449:6: lv_etiquette_17_0= ruleEtiquette
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_etiquette_17_0=ruleEtiquette();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						add(
                    							current,
                    							"etiquette",
                    							lv_etiquette_17_0,
                    							"qcm.dsl.DSL.Etiquette");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDSL.g:466:4: (otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDSL.g:467:5: otherlv_18= ',' ( (lv_etiquette_19_0= ruleEtiquette ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_21); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getQuestionAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalDSL.g:471:5: ( (lv_etiquette_19_0= ruleEtiquette ) )
                    	    // InternalDSL.g:472:6: (lv_etiquette_19_0= ruleEtiquette )
                    	    {
                    	    // InternalDSL.g:472:6: (lv_etiquette_19_0= ruleEtiquette )
                    	    // InternalDSL.g:473:7: lv_etiquette_19_0= ruleEtiquette
                    	    {

                    	    							newCompositeNode(grammarAccess.getQuestionAccess().getEtiquetteEtiquetteParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_etiquette_19_0=ruleEtiquette();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQuestionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"etiquette",
                    	    								lv_etiquette_19_0,
                    	    								"qcm.dsl.DSL.Etiquette");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_13_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleELong"
    // InternalDSL.g:504:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalDSL.g:504:45: (iv_ruleELong= ruleELong EOF )
            // InternalDSL.g:505:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalDSL.g:511:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDSL.g:517:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDSL.g:518:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDSL.g:518:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDSL.g:519:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDSL.g:519:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDSL.g:520:4: kw= '-'
                    {
                    kw=(Token)match(input,28,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleReponse"
    // InternalDSL.g:537:1: entryRuleReponse returns [EObject current=null] : iv_ruleReponse= ruleReponse EOF ;
    public final EObject entryRuleReponse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReponse = null;


        try {
            // InternalDSL.g:537:48: (iv_ruleReponse= ruleReponse EOF )
            // InternalDSL.g:538:2: iv_ruleReponse= ruleReponse EOF
            {
             newCompositeNode(grammarAccess.getReponseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReponse=ruleReponse();

            state._fsp--;

             current =iv_ruleReponse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReponse"


    // $ANTLR start "ruleReponse"
    // InternalDSL.g:544:1: ruleReponse returns [EObject current=null] : ( ( (lv_valide_0_0= 'valide' ) )? otherlv_1= 'Reponse' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleReponse() throws RecognitionException {
        EObject current = null;

        Token lv_valide_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_intitule_4_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:550:2: ( ( ( (lv_valide_0_0= 'valide' ) )? otherlv_1= 'Reponse' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // InternalDSL.g:551:2: ( ( (lv_valide_0_0= 'valide' ) )? otherlv_1= 'Reponse' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // InternalDSL.g:551:2: ( ( (lv_valide_0_0= 'valide' ) )? otherlv_1= 'Reponse' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= '}' )
            // InternalDSL.g:552:3: ( (lv_valide_0_0= 'valide' ) )? otherlv_1= 'Reponse' otherlv_2= '{' otherlv_3= 'intitule' ( (lv_intitule_4_0= ruleEString ) ) otherlv_5= '}'
            {
            // InternalDSL.g:552:3: ( (lv_valide_0_0= 'valide' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSL.g:553:4: (lv_valide_0_0= 'valide' )
                    {
                    // InternalDSL.g:553:4: (lv_valide_0_0= 'valide' )
                    // InternalDSL.g:554:5: lv_valide_0_0= 'valide'
                    {
                    lv_valide_0_0=(Token)match(input,29,FOLLOW_23); 

                    					newLeafNode(lv_valide_0_0, grammarAccess.getReponseAccess().getValideValideKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReponseRule());
                    					}
                    					setWithLastConsumed(current, "valide", lv_valide_0_0 != null, "valide");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReponseAccess().getReponseKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getReponseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getReponseAccess().getIntituleKeyword_3());
            		
            // InternalDSL.g:578:3: ( (lv_intitule_4_0= ruleEString ) )
            // InternalDSL.g:579:4: (lv_intitule_4_0= ruleEString )
            {
            // InternalDSL.g:579:4: (lv_intitule_4_0= ruleEString )
            // InternalDSL.g:580:5: lv_intitule_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReponseAccess().getIntituleEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_intitule_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReponseRule());
            					}
            					set(
            						current,
            						"intitule",
            						lv_intitule_4_0,
            						"qcm.dsl.DSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReponseAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleReponse"


    // $ANTLR start "entryRuleEtiquette"
    // InternalDSL.g:605:1: entryRuleEtiquette returns [EObject current=null] : iv_ruleEtiquette= ruleEtiquette EOF ;
    public final EObject entryRuleEtiquette() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEtiquette = null;


        try {
            // InternalDSL.g:605:50: (iv_ruleEtiquette= ruleEtiquette EOF )
            // InternalDSL.g:606:2: iv_ruleEtiquette= ruleEtiquette EOF
            {
             newCompositeNode(grammarAccess.getEtiquetteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEtiquette=ruleEtiquette();

            state._fsp--;

             current =iv_ruleEtiquette; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEtiquette"


    // $ANTLR start "ruleEtiquette"
    // InternalDSL.g:612:1: ruleEtiquette returns [EObject current=null] : (otherlv_0= 'Etiquette' otherlv_1= '{' otherlv_2= 'categorie' ( (lv_categorie_3_0= ruleString0 ) ) (otherlv_4= 'sousEtiquette' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEtiquette() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_categorie_3_0 = null;



        	enterRule();

        try {
            // InternalDSL.g:618:2: ( (otherlv_0= 'Etiquette' otherlv_1= '{' otherlv_2= 'categorie' ( (lv_categorie_3_0= ruleString0 ) ) (otherlv_4= 'sousEtiquette' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalDSL.g:619:2: (otherlv_0= 'Etiquette' otherlv_1= '{' otherlv_2= 'categorie' ( (lv_categorie_3_0= ruleString0 ) ) (otherlv_4= 'sousEtiquette' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalDSL.g:619:2: (otherlv_0= 'Etiquette' otherlv_1= '{' otherlv_2= 'categorie' ( (lv_categorie_3_0= ruleString0 ) ) (otherlv_4= 'sousEtiquette' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalDSL.g:620:3: otherlv_0= 'Etiquette' otherlv_1= '{' otherlv_2= 'categorie' ( (lv_categorie_3_0= ruleString0 ) ) (otherlv_4= 'sousEtiquette' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEtiquetteAccess().getEtiquetteKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getEtiquetteAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getEtiquetteAccess().getCategorieKeyword_2());
            		
            // InternalDSL.g:632:3: ( (lv_categorie_3_0= ruleString0 ) )
            // InternalDSL.g:633:4: (lv_categorie_3_0= ruleString0 )
            {
            // InternalDSL.g:633:4: (lv_categorie_3_0= ruleString0 )
            // InternalDSL.g:634:5: lv_categorie_3_0= ruleString0
            {

            					newCompositeNode(grammarAccess.getEtiquetteAccess().getCategorieString0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_categorie_3_0=ruleString0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEtiquetteRule());
            					}
            					set(
            						current,
            						"categorie",
            						lv_categorie_3_0,
            						"qcm.dsl.DSL.String0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDSL.g:651:3: (otherlv_4= 'sousEtiquette' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSL.g:652:4: otherlv_4= 'sousEtiquette' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getEtiquetteAccess().getSousEtiquetteKeyword_4_0());
                    			
                    // InternalDSL.g:656:4: ( ( ruleEString ) )
                    // InternalDSL.g:657:5: ( ruleEString )
                    {
                    // InternalDSL.g:657:5: ( ruleEString )
                    // InternalDSL.g:658:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEtiquetteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEtiquetteAccess().getSousEtiquetteEtiquetteCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEtiquetteAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEtiquette"


    // $ANTLR start "entryRuleString0"
    // InternalDSL.g:681:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalDSL.g:681:47: (iv_ruleString0= ruleString0 EOF )
            // InternalDSL.g:682:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalDSL.g:688:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDSL.g:694:2: (kw= 'String' )
            // InternalDSL.g:695:2: kw= 'String'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getString0Access().getStringKeyword());
            	

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
    // $ANTLR end "ruleString0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200040000L});

}