import android.webkit.WebView;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

final class acyk extends WebViewClient
{
    final acyl a;
    
    public acyk(final acyl a) {
        this.a = a;
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        super.onPageFinished(webView, s);
        if (s.equals("about:blank")) {
            final ey a = this.a.a;
            if (a != null) {
                ((fz)a).dismiss();
            }
            return;
        }
        final ey a2 = this.a.a;
        if (a2 != null && !a2.isShowing()) {
            this.a.a.show();
        }
    }
}
