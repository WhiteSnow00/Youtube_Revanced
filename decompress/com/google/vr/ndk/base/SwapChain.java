// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.util.Log;

public class SwapChain
{
    private static final String TAG = "SwapChain";
    private long nativeSwapChain;
    
    @Override
    protected void finalize() {
        try {
            if (this.nativeSwapChain != 0L) {
                Log.w(SwapChain.TAG, "SwapChain.shutdown() should be called to ensure resource cleanup");
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
