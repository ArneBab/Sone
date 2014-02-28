/*
 * Sone - BookmarkAjaxPage.java - Copyright © 2011–2013 David Roden
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

package net.pterodactylus.sone.web.ajax;

import net.pterodactylus.sone.web.WebInterface;
import net.pterodactylus.sone.web.page.FreenetRequest;

/**
 * AJAX page that lets the user bookmark a post.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
public class BookmarkAjaxPage extends JsonPage {

	/**
	 * Creates a new bookmark AJAX page.
	 *
	 * @param webInterface
	 *            The Sone web interface
	 */
	public BookmarkAjaxPage(WebInterface webInterface) {
		super("bookmark.ajax", webInterface);
	}

	//
	// JSONPAGE METHODS
	//

	@Override
	protected JsonReturnObject createJsonObject(FreenetRequest request) {
		String id = request.getHttpRequest().getParam("post", null);
		if ((id == null) || (id.length() == 0)) {
			return createErrorJsonObject("invalid-post-id");
		}
		webInterface.getCore().bookmarkPost(id);
		return createSuccessJsonObject();
	}

	@Override
	protected boolean requiresLogin() {
		return false;
	}

}
