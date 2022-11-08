// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.util.Log;

public class ExternalSurface
{
    private static final String TAG = "ExternalSurface";
    private long nativeExternalSurface;
    
    @Override
    protected void finalize() {
        try {
            if (this.nativeExternalSurface != 0L) {
                Log.w(ExternalSurface.TAG, "ExternalSurface.shutdown() should be called to ensure resource cleanup");
                this.shutdown();
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public void shutdown() {
        throw null;
    }
}
