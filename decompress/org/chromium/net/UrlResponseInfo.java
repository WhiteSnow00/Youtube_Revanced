// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.util.List;
import java.util.Map;

public abstract class UrlResponseInfo
{
    public abstract Map getAllHeaders();
    
    public abstract List getAllHeadersAsList();
    
    public abstract int getHttpStatusCode();
    
    public abstract String getHttpStatusText();
    
    public abstract String getNegotiatedProtocol();
    
    public abstract String getProxyServer();
    
    public abstract long getReceivedByteCount();
    
    public abstract String getUrl();
    
    public abstract List getUrlChain();
    
    public abstract boolean wasCached();
}
