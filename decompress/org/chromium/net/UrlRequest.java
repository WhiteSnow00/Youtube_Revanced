// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.nio.ByteBuffer;

public abstract class UrlRequest
{
    public abstract void cancel();
    
    public abstract void followRedirect();
    
    public abstract void getStatus(final UrlRequest$StatusListener p0);
    
    public abstract boolean isDone();
    
    public abstract void read(final ByteBuffer p0);
    
    public abstract void start();
}
