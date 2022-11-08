// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

public class UserPrefs
{
    private static final String TAG = "UserPrefs";
    private final long nativeUserPrefs;
    
    public UserPrefs(final long nativeUserPrefs) {
        this.nativeUserPrefs = nativeUserPrefs;
    }
    
    public boolean isFeatureEnabled(final UserPrefs$RuntimeFeature userPrefs$RuntimeFeature) {
        return GvrApi.nativeUserPrefsIsFeatureEnabled(this.nativeUserPrefs, userPrefs$RuntimeFeature.id);
    }
}
