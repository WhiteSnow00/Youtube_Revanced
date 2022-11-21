// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.HashSet;

public abstract class ResourcePreloader
{
    public abstract Status ensureLoaded(final HashSet p0, final ProcessState p1, final ErrorPolicy p2, final Long p3);
    
    public abstract Status loadAll();
}
