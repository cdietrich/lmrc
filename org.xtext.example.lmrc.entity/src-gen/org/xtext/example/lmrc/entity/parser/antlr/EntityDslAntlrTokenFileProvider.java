/*
* generated by Xtext
*/
package org.xtext.example.lmrc.entity.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EntityDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/xtext/example/lmrc/entity/parser/antlr/internal/InternalEntityDsl.tokens");
	}
}
