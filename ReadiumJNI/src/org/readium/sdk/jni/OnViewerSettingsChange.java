package org.readium.sdk.jni;

/**
 * Interface to notify the listener when a viewer settings have been changed.
 */
public interface OnViewerSettingsChange {
	public void onViewerSettingsChange(ViewerSettings settings);
}