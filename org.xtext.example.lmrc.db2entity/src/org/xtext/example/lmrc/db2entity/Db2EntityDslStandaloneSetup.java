
package org.xtext.example.lmrc.db2entity;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Db2EntityDslStandaloneSetup extends Db2EntityDslStandaloneSetupGenerated{

	public static void doSetup() {
		new Db2EntityDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

