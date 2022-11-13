// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.xeno.effect.internal;

import com.google.research.xeno.effect.AssetDownloader$DownloadCallback;

class NativeAssetDownloadCallback implements AssetDownloader$DownloadCallback
{
    private final long a;
    
    public NativeAssetDownloadCallback(final long a) {
        this.a = a;
    }
    
    private native void nativeFulfillAssetDownload(final long p0, final String p1, final String p2);
    
    public final void onCompletion(final String s, final String s2) {
        this.nativeFulfillAssetDownload(this.a, s, s2);
    }
}
