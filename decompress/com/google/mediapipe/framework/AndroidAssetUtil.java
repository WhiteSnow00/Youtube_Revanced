// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

import android.content.Context;

public final class AndroidAssetUtil
{
    private AndroidAssetUtil() {
    }
    
    public static boolean a(final Context context) {
        synchronized (AndroidAssetUtil.class) {
            return nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
        }
    }
    
    private static native boolean nativeInitializeAssetManager(final Context p0, final String p1);
}
