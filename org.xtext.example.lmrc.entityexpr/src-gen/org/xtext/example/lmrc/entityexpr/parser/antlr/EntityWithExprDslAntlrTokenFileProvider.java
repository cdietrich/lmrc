/*
* generated by Xtext
*/
package org.xtext.example.lmrc.entityexpr.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EntityWithExprDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/example/lmrc/entityexpr/parser/antlr/internal/InternalEntityWithExprDsl.tokens");
	}
}
