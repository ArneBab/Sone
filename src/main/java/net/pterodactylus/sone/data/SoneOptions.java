package net.pterodactylus.sone.data;

import static net.pterodactylus.sone.data.Sone.ShowCustomAvatars.NEVER;

import net.pterodactylus.sone.data.Sone.ShowCustomAvatars;

/**
 * All Sone-specific options.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
public interface SoneOptions {

	boolean isAutoFollow();
	void setAutoFollow(boolean autoFollow);

	boolean isSoneInsertNotificationEnabled();
	void setSoneInsertNotificationEnabled(boolean soneInsertNotificationEnabled);

	boolean isShowNewSoneNotifications();
	void setShowNewSoneNotifications(boolean showNewSoneNotifications);

	boolean isShowNewPostNotifications();
	void setShowNewPostNotifications(boolean showNewPostNotifications);

	boolean isShowNewReplyNotifications();
	void setShowNewReplyNotifications(boolean showNewReplyNotifications);

	ShowCustomAvatars getShowCustomAvatars();
	void setShowCustomAvatars(ShowCustomAvatars showCustomAvatars);

	/**
	 * {@link SoneOptions} implementation.
	 *
	 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
	 */
	public class DefaultSoneOptions implements SoneOptions {

		private boolean autoFollow = false;
		private boolean soneInsertNotificationsEnabled = false;
		private boolean showNewSoneNotifications = true;
		private boolean showNewPostNotifications = true;
		private boolean showNewReplyNotifications = true;
		private ShowCustomAvatars showCustomAvatars = NEVER;

		@Override
		public boolean isAutoFollow() {
			return autoFollow;
		}

		@Override
		public void setAutoFollow(boolean autoFollow) {
			this.autoFollow = autoFollow;
		}

		@Override
		public boolean isSoneInsertNotificationEnabled() {
			return soneInsertNotificationsEnabled;
		}

		@Override
		public void setSoneInsertNotificationEnabled(boolean soneInsertNotificationEnabled) {
			this.soneInsertNotificationsEnabled = soneInsertNotificationEnabled;
		}

		@Override
		public boolean isShowNewSoneNotifications() {
			return showNewSoneNotifications;
		}

		@Override
		public void setShowNewSoneNotifications(boolean showNewSoneNotifications) {
			this.showNewSoneNotifications = showNewSoneNotifications;
		}

		@Override
		public boolean isShowNewPostNotifications() {
			return showNewPostNotifications;
		}

		@Override
		public void setShowNewPostNotifications(boolean showNewPostNotifications) {
			this.showNewPostNotifications = showNewPostNotifications;
		}

		@Override
		public boolean isShowNewReplyNotifications() {
			return showNewReplyNotifications;
		}

		@Override
		public void setShowNewReplyNotifications(boolean showNewReplyNotifications) {
			this.showNewReplyNotifications = showNewReplyNotifications;
		}

		@Override
		public ShowCustomAvatars getShowCustomAvatars() {
			return showCustomAvatars;
		}

		@Override
		public void setShowCustomAvatars(ShowCustomAvatars showCustomAvatars) {
			this.showCustomAvatars = showCustomAvatars;
		}

	}

}
