// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

public enum UserPrefs$RuntimeFeature
{
    GVR_BETA_FEATURE_DAYDREAM_6DOF_CONTROLLER("GVR_BETA_FEATURE_DAYDREAM_6DOF_CONTROLLER", 0, 1000, "com.google.vr.beta.daydream_6dof_controller", "Use6DofController"), 
    GVR_BETA_FEATURE_SEE_THROUGH("GVR_BETA_FEATURE_SEE_THROUGH", 1, 1001, "com.google.vr.beta.cameraSeeThrough", "EnableSeeThrough");
    
    public final int id;
    public final String prefKey;
    public final String tag;
    
    private UserPrefs$RuntimeFeature(final String s, final int n, final int id, final String tag, final String prefKey) {
        this.id = id;
        this.tag = tag;
        this.prefKey = prefKey;
    }
    
    public static UserPrefs$RuntimeFeature fromId(final int n) {
        for (final UserPrefs$RuntimeFeature userPrefs$RuntimeFeature : values()) {
            if (userPrefs$RuntimeFeature.id == n) {
                return userPrefs$RuntimeFeature;
            }
        }
        return null;
    }
    
    public static UserPrefs$RuntimeFeature[] fromIds(final int[] array) {
        int i = 0;
        if (array == null) {
            return new UserPrefs$RuntimeFeature[0];
        }
        final int length = array.length;
        final UserPrefs$RuntimeFeature[] array2 = new UserPrefs$RuntimeFeature[length];
        while (i < length) {
            array2[i] = fromId(array[i]);
            ++i;
        }
        return array2;
    }
}
