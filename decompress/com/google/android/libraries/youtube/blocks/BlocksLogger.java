// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.youtube.blocks;

public abstract class BlocksLogger
{
    public abstract boolean allowClientPerformanceSample();
    
    public abstract void logBindingError(final byte[] p0);
    
    public abstract void logSpan(final byte[] p0);
}
