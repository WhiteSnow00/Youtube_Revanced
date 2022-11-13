// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;

public abstract class FetcherResolver
{
    public static FetcherResolver sharedResolver() {
        return FetcherResolver$CppProxy.sharedResolver();
    }
    
    public abstract StatusOr getFetcher(final int p0, final byte[] p1);
    
    public abstract void register(final int p0, final FetcherFactory p1);
}
