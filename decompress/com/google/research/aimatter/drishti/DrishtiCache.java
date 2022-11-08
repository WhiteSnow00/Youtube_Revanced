// 
// Decompiled by Procyon v0.6.0
// 

package com.google.research.aimatter.drishti;

import java.util.concurrent.atomic.AtomicBoolean;

public class DrishtiCache
{
    public final long a;
    public final AtomicBoolean b;
    
    public DrishtiCache() {
        this.a = this.nativeCreateCache();
        this.b = new AtomicBoolean(true);
    }
    
    private native void nativeClearCache(final long p0);
    
    private native long nativeCreateCache();
    
    public native void nativeReleaseCache(final long p0);
}
