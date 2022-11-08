// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.blocks.runtime;

public interface ReaderProxy
{
    void onStreamData(final byte[] p0);
    
    void onStreamError(final Throwable p0);
    
    void onStreamFinished();
}
