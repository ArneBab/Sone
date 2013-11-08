/*
 * Sone - SonePart.java - Copyright © 2011–2013 David Roden
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.pterodactylus.sone.text;

import static com.google.common.base.Objects.equal;
import static com.google.common.base.Objects.hashCode;
import static net.pterodactylus.sone.template.SoneAccessor.getNiceName;

import net.pterodactylus.sone.data.Sone;
import net.pterodactylus.sone.template.SoneAccessor;

import com.google.common.base.Objects;

/**
 * {@link Part} implementation that stores a reference to a {@link Sone}.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
public class SonePart implements Part {

	/** The referenced {@link Sone}. */
	private final Sone sone;

	/**
	 * Creates a new Sone part.
	 *
	 * @param sone
	 *            The referenced Sone
	 */
	public SonePart(Sone sone) {
		this.sone = sone;
	}

	//
	// ACCESSORS
	//

	/**
	 * Returns the referenced Sone.
	 *
	 * @return The referenced Sone
	 */
	public Sone getSone() {
		return sone;
	}

	//
	// PART METHODS
	//

	@Override
	public String getText() {
		return getNiceName(sone);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(sone);
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SonePart)) {
			return false;
		}
		SonePart sonePart = (SonePart) object;
		return equal(getSone(), sonePart.getSone());
	}

}
