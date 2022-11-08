import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class clw implements clv
{
    final WebViewProviderFactoryBoundaryInterface a;
    
    public clw(final WebViewProviderFactoryBoundaryInterface a) {
        this.a = a;
    }
    
    public final WebViewProviderBoundaryInterface a(final WebView webView) {
        return (WebViewProviderBoundaryInterface)auet.a(WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }
    
    public final WebkitToCompatConverterBoundaryInterface b() {
        return (WebkitToCompatConverterBoundaryInterface)auet.a(WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }
    
    public final String[] c() {
        return this.a.getSupportedFeatures();
    }
}
