import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cma implements clz
{
    final WebViewProviderFactoryBoundaryInterface a;
    
    public cma(final WebViewProviderFactoryBoundaryInterface a) {
        this.a = a;
    }
    
    @Override
    public final WebViewProviderBoundaryInterface a(final WebView webView) {
        return (WebViewProviderBoundaryInterface)auig.a(WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }
    
    @Override
    public final WebkitToCompatConverterBoundaryInterface b() {
        return (WebkitToCompatConverterBoundaryInterface)auig.a(WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }
    
    @Override
    public final String[] c() {
        return this.a.getSupportedFeatures();
    }
}
