import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import android.webkit.WebSettings;
import android.webkit.DownloadListener;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.util.concurrent.atomic.AtomicReference;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.Map;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import android.webkit.WebView;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyz implements acyv
{
    public final tre a;
    public String b;
    public boolean c;
    public String d;
    public Set e;
    private final atnb f;
    private final vey g;
    private final xbu h;
    private final oco i;
    private WebView j;
    private xbt k;
    private long l;
    private int m;
    private int n;
    private final vbs o;
    private final acoe p;
    
    public acyz(final atnb f, final vey g, final acoe p8, final xbu h, final tre a, final vbs o, final oco i, final byte[] array) {
        this.f = f;
        this.g = g;
        this.p = p8;
        this.h = h;
        this.a = a;
        this.o = o;
        this.i = i;
        this.l = 0L;
        this.n = 1;
        this.b = "";
        this.m = 0;
        this.c = false;
        this.d = "";
        this.e = new HashSet();
    }
    
    private final void h() {
        final WebView j = this.j;
        if (j != null && j.getParent() != null) {
            ((ViewGroup)this.j.getParent()).removeView((View)this.j);
        }
    }
    
    private final WebView i(final Context context, final String b, final boolean b2, final int n, final int n2, String scheme, final int n3, final znz znz, final veh veh, final Map map, final LoadingFrameLayout loadingFrameLayout, final aisc aisc, final acyu acyu) {
        final WebView j = this.j;
        if (j != null && j.getParent() != null) {
            acza.e(this.p, 9, n3, "", false);
            this.h();
        }
        this.n = n3;
        this.l = this.i.d();
        acza.e(this.p, 2, n3, "", false);
        this.k = this.h.b(alox.cd);
        this.j = new WebView(context);
        this.c = false;
        if (this.b.equals(b)) {
            ++this.m;
        }
        else {
            this.b = b;
            this.m = 1;
        }
        if (loadingFrameLayout != null) {
            loadingFrameLayout.e();
            loadingFrameLayout.c();
        }
        final vex a = this.g.a(znz);
        if (!scheme.isEmpty()) {
            final apww b3 = apwv.d(scheme).b();
            final vhe d = a.d();
            d.d((vgv)b3);
            d.b().U();
        }
        final acym webViewClient = new acym(this.g.a(znz), this.k, this.p, b, scheme, n3, n, null);
        final AtomicReference<Boolean> atomicReference = new AtomicReference<Boolean>();
        atomicReference.set(false);
        webViewClient.a.add(new acyw(this, loadingFrameLayout, b, atomicReference, aisc, veh, acyu));
        this.j.setWebViewClient((WebViewClient)webViewClient);
        this.j.setWebChromeClient((WebChromeClient)new acyl(this.g.a(znz), scheme, n2));
        this.j.setScrollBarStyle(33554432);
        this.j.setScrollbarFadingEnabled(false);
        if (this.o.l(45359121L).aM()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (clw.b("WEB_MESSAGE_LISTENER") && map != null && !map.isEmpty()) {
            final WebView i = this.j;
            final Uri parse = Uri.parse(b);
            scheme = parse.getScheme();
            final String host = parse.getHost();
            final StringBuilder sb = new StringBuilder();
            sb.append(scheme);
            sb.append("://");
            sb.append(host);
            clc.b(i, afhk.s(sb.toString()), new acyy(map, veh));
        }
        final WebSettings settings = this.j.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setMixedContentMode(2);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.j.setDownloadListener((DownloadListener)new acyx(context));
        final xbt k = this.k;
        if (b2 && !b.isEmpty()) {
            final acyo acyo = (acyo)this.f.a();
            final WebView l = this.j;
            l.getClass();
            acyo.f(b, znz, n3, k, (tui)new actp(l, 2));
        }
        else if (!b.isEmpty()) {
            this.j.loadUrl(b);
        }
        return this.j;
    }
    
    @Override
    public final WebView a(final Context context, final apwz apwz, final znz znz, final veh veh, final LoadingFrameLayout loadingFrameLayout, final acyu acyu) {
        final int b = apwz.b;
        String a;
        if (b == 1) {
            a = agsk.ad((afqi)apwz.c).a;
        }
        else if (b == 14) {
            a = (String)apwz.c;
        }
        else {
            a = "";
        }
        final boolean e = apwz.e;
        int s = aqvq.S(apwz.f);
        if (s == 0) {
            s = 1;
        }
        int s2 = aqvq.S(apwz.g);
        if (s2 == 0) {
            s2 = 1;
        }
        final String d = apwz.d;
        int q = aqvq.Q(apwz.k);
        if (q == 0) {
            q = 1;
        }
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)apwz.h);
        aisc aisc;
        if ((aisc = apwz.j) == null) {
            aisc = aisc.a;
        }
        return this.i(context, a, e, s, s2, d, q, znz, veh, unmodifiableMap, loadingFrameLayout, aisc, acyu);
    }
    
    @Override
    public final void b() {
        final WebView j = this.j;
        if (j != null) {
            j.goBack();
        }
    }
    
    @Override
    public final void c() {
        final WebView j = this.j;
        if (j != null) {
            j.goForward();
        }
    }
    
    @Override
    public final void d(final String s, final veh veh, final List list) {
        if (this.j != null && this.b.equals(s) && --this.m <= 0) {
            if (!this.c) {
                final xbt k = this.k;
                if (k != null) {
                    k.c("gw_d");
                }
            }
            acza.f(this.p, 7, this.n, this.d, this.c, (int)((this.i.d() - this.l) / 1000L));
            this.h();
            this.j.destroy();
            this.j = null;
            this.l = 0L;
            this.n = 1;
            this.c = false;
            this.b = "";
            this.m = 0;
            if (veh != null && list != null) {
                if (!list.isEmpty()) {
                    for (final apxa apxa : list) {
                        final Iterator<Object> iterator2 = ((List<Object>)apxa.c).iterator();
                        int n = 0;
                        while (iterator2.hasNext()) {
                            final String s2 = iterator2.next();
                            final Iterator iterator3 = this.e.iterator();
                            while (iterator3.hasNext()) {
                                if (((String)iterator3.next()).contains(s2)) {
                                    ++n;
                                    break;
                                }
                            }
                        }
                        final Iterator<Object> iterator4 = ((List<Object>)apxa.d).iterator();
                        boolean b = false;
                        while (iterator4.hasNext()) {
                            final String s3 = iterator4.next();
                            final Iterator iterator5 = this.e.iterator();
                            while (iterator5.hasNext()) {
                                if (((String)iterator5.next()).contains(s3)) {
                                    b = true;
                                    break;
                                }
                            }
                        }
                        if ((apxa.b & 0x1) != 0x0 && !b && n == apxa.c.size()) {
                            aisc aisc;
                            if ((aisc = apxa.e) == null) {
                                aisc = aisc.a;
                            }
                            veh.a(aisc);
                        }
                    }
                }
            }
            this.d = "";
            this.e = new HashSet();
        }
    }
    
    @Override
    public final boolean e() {
        final WebView j = this.j;
        return j != null && j.canGoBack();
    }
    
    @Override
    public final boolean f() {
        final WebView j = this.j;
        return j != null && j.canGoForward();
    }
    
    @Override
    public final WebView g(final Context context, final String s, final boolean b, final znz znz, final veh veh, final LoadingFrameLayout loadingFrameLayout, final aisc aisc, final acyu acyu) {
        return this.i(context, s, b, 2, 3, "", 2, znz, veh, null, loadingFrameLayout, aisc, acyu);
    }
}
