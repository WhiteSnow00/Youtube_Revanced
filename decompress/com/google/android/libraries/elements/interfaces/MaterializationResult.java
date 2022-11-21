// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class MaterializationResult
{
    public abstract byte[] getCommandProtoBytes(final int p0);
    
    public abstract byte[] getElement();
    
    public abstract long size();
    
    @Override
    public abstract String toString();
}
