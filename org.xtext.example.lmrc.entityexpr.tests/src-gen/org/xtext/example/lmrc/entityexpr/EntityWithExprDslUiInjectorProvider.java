/*
* generated by Xtext
*/
package org.xtext.example.lmrc.entityexpr;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class EntityWithExprDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.lmrc.entityexpr.ui.internal.EntityWithExprDslActivator.getInstance().getInjector("org.xtext.example.lmrc.entityexpr.EntityWithExprDsl");
	}
	
}