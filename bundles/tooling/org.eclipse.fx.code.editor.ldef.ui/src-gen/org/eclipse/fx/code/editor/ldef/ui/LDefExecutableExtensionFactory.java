/*******************************************************************************
 * Copyright (c) 2022 BestSolution.at and others.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v.2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     BestSolution.at - initial API and implementation
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.eclipse.fx.code.editor.ldef.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.eclipse.fx.code.editor.ldef.ui.internal.LDefActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LDefExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LDefActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LDefActivator.getInstance().getInjector(LDefActivator.ORG_ECLIPSE_FX_CODE_EDITOR_LDEF_LDEF);
	}
	
}
