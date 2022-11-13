// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class JSCommandResolver
{
    public abstract Status resolve(final byte[] p0);
    
    public abstract Status resolveAsync(final byte[] p0, final JSPromiseResolver p1);
}
