// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.nio.ByteBuffer;

public abstract class UrlRequest$Callback
{
    public void onCanceled(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
    }
    
    public abstract void onFailed(final UrlRequest p0, final UrlResponseInfo p1, final CronetException p2);
    
    public abstract void onReadCompleted(final UrlRequest p0, final UrlResponseInfo p1, final ByteBuffer p2);
    
    public abstract void onRedirectReceived(final UrlRequest p0, final UrlResponseInfo p1, final String p2);
    
    public abstract void onResponseStarted(final UrlRequest p0, final UrlResponseInfo p1);
    
    public abstract void onSucceeded(final UrlRequest p0, final UrlResponseInfo p1);
}
