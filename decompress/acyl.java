import android.net.Uri;
import android.webkit.WebView$WebViewTransport;
import android.view.View;
import android.webkit.WebViewClient;
import android.os.Message;
import android.webkit.WebView;
import android.webkit.WebChromeClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyl extends WebChromeClient
{
    protected ey a;
    private final vex b;
    private final String c;
    private final int d;
    
    public acyl(final vex b, final String c, final int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private final void a(final WebView webView, final Message message) {
        final ex ex = new ex(webView.getContext());
        final acyi webView2 = new acyi(webView.getContext());
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebChromeClient((WebChromeClient)new acyj(this));
        webView2.setWebViewClient((WebViewClient)new acyk(this));
        ex.p((View)webView2);
        ((WebView$WebViewTransport)message.obj).setWebView((WebView)webView2);
        message.sendToTarget();
        this.a = ex.b();
    }
    
    public final boolean onCreateWindow(final WebView webView, final boolean b, final boolean b2, final Message message) {
        if (!b2) {
            return false;
        }
        if (b) {
            this.a(webView, message);
            return true;
        }
        final String e = afbj.e(webView.getHitTestResult().getExtra());
        final int d = this.d;
        final int n = d - 1;
        if (d == 0) {
            throw null;
        }
        if (n == 1) {
            if (!e.isEmpty()) {
                webView.loadUrl(e);
            }
            return false;
        }
        if (n != 4) {
            if (!e.isEmpty()) {
                acza.d(Uri.parse(e), webView.getContext());
            }
            return false;
        }
        this.a(webView, message);
        return true;
    }
    
    public final void onReceivedTitle(final WebView webView, final String s) {
        super.onReceivedTitle(webView, s);
        acza.b(this.b, this.c, s);
    }
}
