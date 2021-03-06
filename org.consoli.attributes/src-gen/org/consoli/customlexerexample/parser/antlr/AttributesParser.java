/*
* generated by Xtext
*/
package org.consoli.customlexerexample.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.consoli.customlexerexample.services.AttributesGrammarAccess;

public class AttributesParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AttributesGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.consoli.customlexerexample.parser.antlr.internal.InternalAttributesParser createParser(XtextTokenStream stream) {
		return new org.consoli.customlexerexample.parser.antlr.internal.InternalAttributesParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public AttributesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AttributesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
