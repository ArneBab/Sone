/*
 * Sone - PostReplyBuilderFactory.java - Copyright © 2013 David Roden
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

package net.pterodactylus.sone.database;

import net.pterodactylus.sone.database.memory.MemoryDatabase;

import com.google.inject.ImplementedBy;

/**
 * Factory for {@link PostReplyBuilder}s.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
@ImplementedBy(MemoryDatabase.class)
public interface PostReplyBuilderFactory {

	/**
	 * Creates a new post reply builder.
	 *
	 * @return A new post reply builder
	 */
	public PostReplyBuilder newPostReplyBuilder();

}