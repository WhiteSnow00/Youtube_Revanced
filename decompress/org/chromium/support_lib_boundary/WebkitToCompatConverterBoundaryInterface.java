// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;

public interface WebkitToCompatConverterBoundaryInterface
{
    InvocationHandler convertCookieManager(final Object p0);
    
    Object convertSafeBrowsingResponse(final InvocationHandler p0);
    
    InvocationHandler convertSafeBrowsingResponse(final Object p0);
    
    Object convertServiceWorkerSettings(final InvocationHandler p0);
    
    InvocationHandler convertServiceWorkerSettings(final Object p0);
    
    InvocationHandler convertSettings(final WebSettings p0);
    
    Object convertWebMessagePort(final InvocationHandler p0);
    
    InvocationHandler convertWebMessagePort(final Object p0);
    
    Object convertWebResourceError(final InvocationHandler p0);
    
    InvocationHandler convertWebResourceError(final Object p0);
    
    InvocationHandler convertWebResourceRequest(final WebResourceRequest p0);
}
