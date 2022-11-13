// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class JSPromiseResolver
{
    public abstract void reject(final Status p0);
    
    public abstract void resolve();
}
