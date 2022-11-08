// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class CacheStrategyDelegate
{
    public abstract Status onCacheFull(final long p0, final long p1);
    
    public abstract Status onCacheInvalid(final String p0);
    
    public abstract Status onCachePurged(final CachePurgeReason p0);
    
    public abstract Status onErrorReadingResource(final String p0);
}
