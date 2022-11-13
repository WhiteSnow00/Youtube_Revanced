import android.content.Intent;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmq extends WebViewClient
{
    private final gms a;
    private final FrameLayout b;
    private final WebView c;
    
    public gmq(final gms a, final FrameLayout b, final WebView c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        this.a.b(webView, s);
        this.b.setVisibility(8);
        this.c.setVisibility(0);
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        final String string = webResourceRequest.getUrl().toString();
        if (URLUtil.isNetworkUrl(string) && !string.contains("https://www.twitter.com/share") && !string.contains("https://www.facebook.com/sharer/sharer.php")) {
            return false;
        }
        aeun.k(webView.getContext(), new Intent("android.intent.action.VIEW", webResourceRequest.getUrl()));
        return true;
    }
}
