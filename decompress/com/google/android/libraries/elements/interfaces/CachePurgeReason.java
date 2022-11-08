// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum CachePurgeReason
{
    CACHE_EXPIRED("CACHE_EXPIRED", 4), 
    CACHE_FULL("CACHE_FULL", 2), 
    CACHE_INVALID("CACHE_INVALID", 3), 
    MISSING_BYTES("MISSING_BYTES", 0), 
    MISSING_METADATA("MISSING_METADATA", 1);
    
    private CachePurgeReason(final String s, final int n) {
    }
}
