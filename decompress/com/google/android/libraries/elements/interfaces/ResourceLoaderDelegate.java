// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class ResourceLoaderDelegate
{
    public abstract void onAttemptedToCacheResource(final String p0, final ValidationResult p1, final Status p2);
    
    public abstract void onMissingCacheDependency(final String p0);
    
    public abstract void onResourceCachePrepared(final String p0, final Status p1);
    
    public abstract void onResourceProcessed(final String p0, final ValidationResult p1, final Status p2);
    
    public abstract void onServingContextUpdated(final byte[] p0);
}
