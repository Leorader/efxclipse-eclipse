/*******************************************************************************
 * Copyright (c) 2013 __COMPANY/CONTRIBUTOR__ and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl<__EMAIL__> - initial API and implementation
 *******************************************************************************/
package org.eclipse.fx.ide.fxgraph;

/**
 * @author tomschindl
 *
 */
public class TestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String number = "1_000";
		System.err.println(number.matches("\\d[\\d|_]*"));
	}

}
