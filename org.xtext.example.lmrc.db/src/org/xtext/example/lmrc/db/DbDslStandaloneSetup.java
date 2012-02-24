
package org.xtext.example.lmrc.db;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DbDslStandaloneSetup extends DbDslStandaloneSetupGenerated{

	public static void doSetup() {
		new DbDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

