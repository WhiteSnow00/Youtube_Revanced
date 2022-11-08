// 
// Decompiled by Procyon v0.6.0
// 

package org.webrtc;

import android.content.Context;

public class ContextUtils
{
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;
    
    @Deprecated
    public static Context getApplicationContext() {
        return ContextUtils.applicationContext;
    }
    
    public static void initialize(final Context applicationContext) {
        if (applicationContext != null) {
            ContextUtils.applicationContext = applicationContext;
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }
}
