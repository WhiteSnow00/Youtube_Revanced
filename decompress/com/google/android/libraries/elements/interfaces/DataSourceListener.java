// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;

public abstract class DataSourceListener
{
    public abstract Status onDataChanged();
    
    public abstract Status onError(final Status p0);
}
