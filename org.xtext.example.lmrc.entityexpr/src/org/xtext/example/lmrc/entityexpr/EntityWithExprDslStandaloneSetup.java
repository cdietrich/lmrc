
package org.xtext.example.lmrc.entityexpr;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EntityWithExprDslStandaloneSetup extends EntityWithExprDslStandaloneSetupGenerated{

	public static void doSetup() {
		new EntityWithExprDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

