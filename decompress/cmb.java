import android.webkit.WebViewRenderProcess;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcessClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmb extends WebViewRenderProcessClient
{
    private final cld a;
    
    public cmb(final cld a) {
        this.a = a;
    }
    
    public final void onRenderProcessResponsive(final WebView webView, final WebViewRenderProcess webViewRenderProcess) {
        final cld a = this.a;
        cmc.g(webViewRenderProcess);
        a.a();
    }
    
    public final void onRenderProcessUnresponsive(final WebView webView, final WebViewRenderProcess webViewRenderProcess) {
        final cld a = this.a;
        cmc.g(webViewRenderProcess);
        a.b();
    }
}
