import android.webkit.WebResourceRequest;
import android.webkit.RenderProcessGoneDetail;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.Iterator;
import android.webkit.WebView;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import android.webkit.WebViewClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acym extends WebViewClient
{
    private static final String b = "acym";
    public final List a;
    private final vex c;
    private final xbt d;
    private final String e;
    private final String f;
    private boolean g;
    private final AtomicReference h;
    private final int i;
    private final int j;
    private final acoe k;
    
    public acym(final vex c, final xbt d, final acoe k, final String e, final String f, final int i, final int j, final byte[] array) {
        this.a = new ArrayList();
        this.c = c;
        this.d = d;
        this.k = k;
        this.e = e;
        this.f = f;
        this.i = i;
        this.j = j;
        this.g = false;
        (this.h = new AtomicReference()).set(false);
    }
    
    private final boolean a(final Uri uri, final Context context) {
        final String e = afbj.e(uri.getScheme());
        if (!this.g && (e.equals("http") || e.equals("https"))) {
            return false;
        }
        if (this.j == 3 && (e.equals("http") || e.equals("https"))) {
            return acza.d(uri, context);
        }
        return !e.equals("http") && !e.equals("https") && acza.d(uri, context);
    }
    
    private static final void b(final String s) {
        final zng a = zng.a;
        final znf y = znf.y;
        final String b = acym.b;
        final StringBuilder sb = new StringBuilder("GenericWebView::");
        sb.append(b);
        sb.append(s);
        znh.b(a, y, sb.toString());
    }
    
    public final void doUpdateVisitedHistory(final WebView webView, final String s, final boolean b) {
        super.doUpdateVisitedHistory(webView, s, b);
        acza.a(this.c, this.f, webView.canGoBack(), webView.canGoForward());
    }
    
    public final void onPageCommitVisible(final WebView webView, final String s) {
        super.onPageCommitVisible(webView, s);
        acza.b(this.c, this.f, afbj.e(webView.getTitle()));
        if (this.h.get()) {
            this.d.c("gw_fv");
        }
        for (final acyw acyw : this.a) {
            final String d = acyw.g.d;
            if (d != null && !d.isEmpty()) {
                final acyz g = acyw.g;
                g.e.add(g.d);
            }
            final LoadingFrameLayout a = acyw.a;
            if (a != null) {
                a.a();
            }
        }
    }
    
    public final void onPageFinished(final WebView webView, final String s) {
        super.onPageFinished(webView, s);
        acza.c(this.c, this.f, s, true);
        acza.b(this.c, this.f, afbj.e(webView.getTitle()));
        final boolean booleanValue = this.h.get();
        final Boolean value = false;
        if (booleanValue) {
            this.d.c("gw_ld");
            this.h.set(value);
            this.g = true;
            acza.e(this.k, 3, this.i, s, true);
        }
        else if (this.g) {
            acza.e(this.k, 5, this.i, s, true);
        }
        for (final acyw acyw : this.a) {
            final LoadingFrameLayout a = acyw.a;
            if (a != null) {
                a.a();
            }
            if (acyw.c.get()) {
                acyw.c.set(value);
                acyw.g.c = true;
            }
        }
    }
    
    public final void onPageStarted(final WebView webView, final String d, final Bitmap bitmap) {
        super.onPageStarted(webView, d, bitmap);
        final boolean equals = d.equals(this.e);
        final Boolean value = true;
        final Boolean value2 = false;
        if (equals) {
            this.h.set(value);
        }
        else {
            this.h.set(value2);
        }
        acza.c(this.c, this.f, d, false);
        for (final acyw acyw : this.a) {
            acyw.g.d = d;
            final LoadingFrameLayout a = acyw.a;
            if (a != null) {
                a.c();
            }
            if (d.equals(acyw.b)) {
                acyw.c.set(value);
            }
            else {
                acyw.c.set(value2);
            }
        }
    }
    
    public final boolean onRenderProcessGone(final WebView webView, final RenderProcessGoneDetail renderProcessGoneDetail) {
        if (!renderProcessGoneDetail.didCrash()) {
            acza.e(this.k, 11, this.i, afbj.e(webView.getUrl()), this.g);
            b(" WebView crashed due to out of memory on URL: ".concat(String.valueOf(webView.getUrl())));
        }
        else {
            acza.e(this.k, 6, this.i, afbj.e(webView.getUrl()), this.g);
            b(" WebView crashed due to internal error.");
        }
        for (final acyw acyw : this.a) {
            final aisc d = acyw.d;
            if (d != null) {
                acyw.e.a(d);
            }
            final acyz g = acyw.g;
            g.d(g.b, null, null);
            acyw.g.a.e((Throwable)new Exception("Generic WebView Crashed"));
            final acyu f = acyw.f;
            if (f != null) {
                f.a();
            }
        }
        return true;
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
        return this.a(webResourceRequest.getUrl(), webView.getContext());
    }
    
    public final boolean shouldOverrideUrlLoading(final WebView webView, final String s) {
        return s != null && this.a(Uri.parse(s), webView.getContext());
    }
}
