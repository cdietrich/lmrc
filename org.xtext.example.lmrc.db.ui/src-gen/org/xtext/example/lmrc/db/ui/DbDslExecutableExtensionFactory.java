/*
 * generated by Xtext
 */
package org.xtext.example.lmrc.db.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DbDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.xtext.example.lmrc.db.ui.internal.DbDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.xtext.example.lmrc.db.ui.internal.DbDslActivator.getInstance().getInjector("org.xtext.example.lmrc.db.DbDsl");
	}
	
}
