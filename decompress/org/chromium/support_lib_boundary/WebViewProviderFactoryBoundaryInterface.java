// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import android.webkit.WebView;

public interface WebViewProviderFactoryBoundaryInterface
{
    InvocationHandler createWebView(final WebView p0);
    
    InvocationHandler getDropDataProvider();
    
    InvocationHandler getProxyController();
    
    InvocationHandler getServiceWorkerController();
    
    InvocationHandler getStatics();
    
    String[] getSupportedFeatures();
    
    InvocationHandler getTracingController();
    
    InvocationHandler getWebkitToCompatConverter();
    
    void setSupportLibraryVersion(final String p0);
}
