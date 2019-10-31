/*
 * Copyright 2019 FormDev Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.formdev.flatlaf.util;

import java.awt.Color;
import javax.swing.plaf.ColorUIResource;
import com.formdev.flatlaf.util.ColorFunctions.ColorFunction;

/**
 * A (red) color that acts as a placeholder in UI defaults.
 * The actual color is derived from another color,
 * which is modified by the given color functions.
 *
 * @author Karl Tauber
 */
public class DerivedColor
	extends ColorUIResource
{
	private final ColorFunction[] functions;

	public DerivedColor( ColorFunction... functions ) {
		super( Color.red );
		this.functions = functions;
	}

	public Color derive( Color baseColor ) {
		return ColorFunctions.applyFunctions( baseColor, functions );
	}
}
