/*
 * generated by Xtext
 */
package org.xtext.example.lmrc.entity.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntityDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.xtext.example.lmrc.entity.ui.internal.EntityDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.xtext.example.lmrc.entity.ui.internal.EntityDslActivator.getInstance().getInjector("org.xtext.example.lmrc.entity.EntityDsl");
	}
	
}
