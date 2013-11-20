/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.core.di.context.tests;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.fx.core.di.ContextBoundValue;
import org.eclipse.fx.core.di.ContextValue;
import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.FrameworkUtil;

public class ContextBoundValueTestCase {
	public static class SimpleInject {
		@Inject
		@ContextValue(contextKey="simpleValue")
		public ContextBoundValue<String> value;
	}
	
	public static class ObservableInject {
		@Inject
		@ContextValue(contextKey="simpleValue")
		public ContextBoundValue<String> value;
		
		public IObservableValue observableValue;

		@Inject
		@Named("simpleValue")
		@Optional
		public String injectedValue;
		
		@PostConstruct
		void makeObservable() {
			observableValue = value.adaptTo(IObservableValue.class);
		}
	}
	
	public static class DirectObservableInject {
		@Inject
		@ContextValue(contextKey="simpleValue")
		public IObservableValue value;
	}
	
	public static class Target {
		@Inject
		@Named("simpleValue")
		@Optional
		public String injectedValue;
		 
	}
	
	@Test
	public void testSimpleInjection() {
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(FrameworkUtil.getBundle(getClass()).getBundleContext());
		SimpleInject simpleInject = ContextInjectionFactory.make(SimpleInject.class, serviceContext);
		Assert.assertNotNull(simpleInject.value);
	}
	
	@Test
	public void testSimpleObservable() {
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(FrameworkUtil.getBundle(getClass()).getBundleContext());
		ObservableInject obsInject = ContextInjectionFactory.make(ObservableInject.class, serviceContext);
		Assert.assertNotNull(obsInject.observableValue);
	}
	
	@Test
	public void observableSupportModify() {
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(FrameworkUtil.getBundle(getClass()).getBundleContext());
		serviceContext.declareModifiable("simpleValue");
		ObservableInject obsInject = ContextInjectionFactory.make(ObservableInject.class, serviceContext);
		Assert.assertNull(obsInject.injectedValue);
		
		{
			String uuid = UUID.randomUUID().toString();
			obsInject.observableValue.setValue(uuid);
			
			Assert.assertEquals(uuid,obsInject.injectedValue);
			Assert.assertEquals(uuid, obsInject.value.getValue());
		}
		
		final AtomicBoolean bool = new AtomicBoolean();
		final String uuid = UUID.randomUUID().toString();
		obsInject.observableValue.addValueChangeListener(new IValueChangeListener() {
			
			@Override
			public void handleValueChange(ValueChangeEvent event) {
				bool.set(uuid.equals(event.diff.getNewValue()));
			}
		});
		serviceContext.modify("simpleValue", uuid);
		Assert.assertTrue(bool.get());
	}
	
	@Test
	public void testContextModify() {
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(FrameworkUtil.getBundle(getClass()).getBundleContext());
		serviceContext.declareModifiable("simpleValue");
		
		Target t = ContextInjectionFactory.make(Target.class, serviceContext);
		
		IEclipseContext c = serviceContext.createChild();
		SimpleInject i = ContextInjectionFactory.make(SimpleInject.class, c);
		String uuid = UUID.randomUUID().toString();
		i.value.publish(uuid);
		
		Assert.assertEquals(uuid, t.injectedValue);
	}
	
	@Test
	public void testDirectObservable() {
		IEclipseContext serviceContext = EclipseContextFactory.getServiceContext(FrameworkUtil.getBundle(getClass()).getBundleContext());
		serviceContext.declareModifiable("simpleValue");
		Realm r = new Realm() {

			@Override
			public boolean isCurrent() {
				return true;
			}
			
		};
		serviceContext.set(Realm.class, r);
		DirectObservableInject directObservableInject = ContextInjectionFactory.make(DirectObservableInject.class, serviceContext);
		Assert.assertNotNull(directObservableInject.value);
		Assert.assertEquals(r, directObservableInject.value.getRealm());
	}
}
