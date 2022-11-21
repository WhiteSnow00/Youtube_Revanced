// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.TreeSet;

public abstract class ResourceMetadataTracker
{
    public abstract void addMetadata(final ResourceMetadata p0);
    
    public abstract ResourceMetadata getResourceMetadata(final String p0);
    
    public abstract TreeSet getTransitiveDeps(final TreeSet p0);
}
