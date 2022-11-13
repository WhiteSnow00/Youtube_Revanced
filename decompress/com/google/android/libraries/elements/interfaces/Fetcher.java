// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class Fetcher
{
    public abstract Status nextRequest(final FetchResultHandler p0);
    
    public abstract Status reloadRequest(final FetchResultHandler p0);
}
