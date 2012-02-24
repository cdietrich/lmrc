
package org.xtext.example.lmrc.entity;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EntityDslStandaloneSetup extends EntityDslStandaloneSetupGenerated{

	public static void doSetup() {
		new EntityDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

