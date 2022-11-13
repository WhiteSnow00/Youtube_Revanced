// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class DebuggerCallback
{
    public abstract void configureLiveUpdating(final byte[] p0);
    
    public abstract void connected();
    
    public abstract void deleteStoreEntry(final byte[] p0);
    
    public abstract void disconnected();
    
    public abstract void getStoreSnapshot();
    
    public abstract void highlightElements(final byte[] p0);
    
    public abstract void traverseViewHierarchy();
    
    public abstract void updateComponentModel(final byte[] p0);
    
    public abstract void updateStoreEntry(final byte[] p0);
}
