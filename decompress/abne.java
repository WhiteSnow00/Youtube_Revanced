import android.app.Activity;
import android.text.TextUtils;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

final class abne extends WebViewClient
{
    final String a;
    final abnf b;
    private boolean c;
    
    public abne(final abnf b, final String a) {
        this.b = b;
        this.a = a;
        this.c = false;
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        if (this.c) {
            return;
        }
        ttr.h("AgeVerification", "page finished:".concat(String.valueOf(s)));
        final Uri parse = Uri.parse(s);
        final Uri parse2 = Uri.parse(this.a);
        if (TextUtils.equals((CharSequence)parse.getAuthority(), (CharSequence)parse2.getAuthority()) && TextUtils.equals((CharSequence)parse.getHost(), (CharSequence)parse2.getHost()) && TextUtils.equals((CharSequence)parse.getPath(), (CharSequence)parse2.getPath())) {
            final abnf b = this.b;
            final Activity activity = (Activity)b.a.get();
            if (activity != null && !activity.isFinishing()) {
                b.d.show();
                return;
            }
            zlm.b(zll.a, zlk.j, "AgeVerificationDialog was attempted to be shown although the activity was destroyed.");
        }
    }
    
    public final void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
        final StringBuilder sb = new StringBuilder("webview OnReceivedError ");
        sb.append(s);
        sb.append(" ");
        sb.append(s2);
        ttr.h("AgeVerification", sb.toString());
        this.c = true;
        this.b.c();
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        if ("youtube://player/KavSuccess".equals(s)) {
            ttr.h("AgeVerification", "kav success");
            final abnf b = this.b;
            b.a();
            b.g.a();
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, s);
    }
}
