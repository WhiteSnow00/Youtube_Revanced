// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

public abstract class UploadDataSink
{
    public abstract void onReadError(final Exception p0);
    
    public abstract void onReadSucceeded(final boolean p0);
    
    public abstract void onRewindError(final Exception p0);
    
    public abstract void onRewindSucceeded();
}
