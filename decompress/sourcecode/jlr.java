import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

final class jlr extends WebViewClient
{
    final /* synthetic */ jlt a;
    
    public jlr(final jlt a) {
        this.a = a;
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        final jlt a = this.a;
        a.b = a.a.findViewById(2131430665);
        this.a.b.setVisibility(4);
    }
    
    public final void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
    }
    
    public final void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        this.a.s(3);
    }
    
    public final void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
        this.onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }
}
