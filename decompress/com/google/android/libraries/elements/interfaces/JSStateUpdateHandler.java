// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class JSStateUpdateHandler
{
    public abstract byte[] getModel();
    
    public abstract byte[] getState();
    
    public abstract void stateDidUpdate(final byte[] p0);
}
