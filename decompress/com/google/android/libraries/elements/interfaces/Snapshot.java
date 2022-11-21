// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.HashSet;

public abstract class Snapshot
{
    public abstract long byteSize();
    
    public abstract boolean contains(final String p0);
    
    public abstract boolean empty();
    
    public abstract boolean equals(final Snapshot p0);
    
    public abstract byte[] find(final String p0);
    
    public abstract byte[] findNoCopy(final String p0);
    
    public abstract HashSet keys();
    
    public abstract byte[] retrieveMetadata(final String p0);
    
    public abstract long size();
}
