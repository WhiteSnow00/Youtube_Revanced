// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import java.lang.reflect.InvocationHandler;

public interface WebViewProviderBoundaryInterface
{
    InvocationHandler addDocumentStartJavaScript(final String p0, final String[] p1);
    
    void addWebMessageListener(final String p0, final String[] p1, final InvocationHandler p2);
    
    InvocationHandler[] createWebMessageChannel();
    
    WebChromeClient getWebChromeClient();
    
    WebViewClient getWebViewClient();
    
    InvocationHandler getWebViewRenderer();
    
    InvocationHandler getWebViewRendererClient();
    
    void insertVisualStateCallback(final long p0, final InvocationHandler p1);
    
    void postMessageToMainFrame(final InvocationHandler p0, final Uri p1);
    
    void removeWebMessageListener(final String p0);
    
    void setWebViewRendererClient(final InvocationHandler p0);
}
