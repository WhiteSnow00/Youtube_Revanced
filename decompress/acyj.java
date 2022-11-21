import android.webkit.WebView;
import android.webkit.WebChromeClient;

// 
// Decompiled by Procyon v0.6.0
// 

final class acyj extends WebChromeClient
{
    final acyl a;
    
    public acyj(final acyl a) {
        this.a = a;
    }
    
    public final void onCloseWindow(final WebView webView) {
        super.onCloseWindow(webView);
        final ey a = this.a.a;
        if (a != null) {
            ((fz)a).dismiss();
        }
    }
}
