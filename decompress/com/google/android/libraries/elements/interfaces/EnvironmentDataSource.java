// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class EnvironmentDataSource
{
    public static final long INVALID_SUBSCRIPTION = -1L;
    
    public abstract byte[] getEnvironmentData();
    
    public abstract long subscribeToEnvironmentData(final EnvironmentDataObserver p0);
    
    public abstract void unsubscribeFromEnvironmentData(final long p0);
}
