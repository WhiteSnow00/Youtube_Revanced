// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class JSFutureHandler
{
    public abstract Status onError(final String p0);
    
    public abstract Status onSuccess();
}
