/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ui.workbench.services.lifecycle.internal;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.fx.ui.workbench.services.ELifecycleService;
import org.eclipse.fx.ui.workbench.services.lifecycle.LifecycleAddon;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Implementation of a {@link ELifecycleService}
 */
@SuppressWarnings("restriction")
public class LifecycleServiceImpl implements ELifecycleService {

	@Inject
	private EModelService modelService;

	@Inject
	private MApplication app;

	@Inject
	private IContributionFactory factory;

	@Override
	public void registerLifecycleURI(MUIElement element, String lifecycleURI) {
		@SuppressWarnings("unchecked")
		Set<@NonNull Object> contributions = (Set<@NonNull Object>) element.getTransientData().get(LifecycleAddon.LIFECYCLE_TRANSIENT_KEY);
		if (contributions == null) {
			contributions = new HashSet<>();
			element.getTransientData().put(LifecycleAddon.LIFECYCLE_TRANSIENT_KEY, contributions);
		}

		Object object = this.factory.create(lifecycleURI, this.app.getContext());
		if (object != null) {
			contributions.add(object);
		}
	}

	@Override
	public boolean validateAnnotation(Class<? extends Annotation> annotationClass, MUIElement element, IEclipseContext context) {
		return validateLifecycleAnnotation(annotationClass, getContextForParent(element), context, element);
	}

	private static boolean validateLifecycleAnnotation(Class<? extends Annotation> clazz, IEclipseContext parentContext, IEclipseContext partContext, MUIElement part) {
		@SuppressWarnings("unchecked")
		Set<@NonNull Object> set = (Set<@NonNull Object>) part.getTransientData().get(LifecycleAddon.LIFECYCLE_TRANSIENT_KEY);
		if (set != null) {
			for (Object object : set) {
				Object invokeResult = ContextInjectionFactory.invoke(object, clazz, parentContext, partContext, Boolean.TRUE);
				if (invokeResult != null && invokeResult instanceof Boolean) {// supports
																				// void
																				// methods
					boolean res = ((Boolean) invokeResult).booleanValue();
					if (!res)
						return false;
				}
			}
		}
		return true;
	}

	private IEclipseContext getContextForParent(MUIElement element) {
		return this.modelService.getContainingContext(element);
	}

	@Override
	public void unregisterLifecycleContribution(MUIElement element, Object contribution) {
		@SuppressWarnings("unchecked")
		Set<@NonNull Object> objects = (Set<@NonNull Object>) element.getTransientData().get(LifecycleAddon.LIFECYCLE_TRANSIENT_KEY);
		if (objects != null)
			objects.remove(contribution);
	}

}