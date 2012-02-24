
package org.xtext.example.lmrc.uispec;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class UispecDslStandaloneSetup extends UispecDslStandaloneSetupGenerated{

	public static void doSetup() {
		new UispecDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

