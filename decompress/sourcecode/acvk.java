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

public final class acvk implements acvg
{
    public final tny a;
    public wyn b;
    public String c;
    public boolean d;
    public String e;
    public Set f;
    private final atjj g;
    private final vbq h;
    private final wyo i;
    private final oas j;
    private WebView k;
    private long l;
    private int m;
    private int n;
    private final uyi o;
    private final acko p;
    
    public acvk(final atjj g, final vbq h, final acko p8, final wyo i, final tny a, final uyi o, final oas j, final byte[] array) {
        this.g = g;
        this.h = h;
        this.p = p8;
        this.i = i;
        this.a = a;
        this.o = o;
        this.j = j;
        this.l = 0L;
        this.n = 1;
        this.c = "";
        this.m = 0;
        this.d = false;
        this.e = "";
        this.f = new HashSet();
    }
    
    private final void i() {
        final WebView k = this.k;
        if (k != null && k.getParent() != null) {
            ((ViewGroup)this.k.getParent()).removeView((View)this.k);
        }
    }
    
    private final WebView j(final Context context, final String c, final boolean b, final int n, final int n2, final String s, final int n3, final zkh zkh, final vax vax, final Map map, final LoadingFrameLayout loadingFrameLayout, final aioe aioe, final acvf acvf) {
        this.i();
        this.n = n3;
        this.l = this.j.d();
        this.h(2);
        this.b = this.i.b(alku.cb);
        this.k = new WebView(context);
        this.d = false;
        if (this.c.equals(c)) {
            ++this.m;
        }
        else {
            this.c = c;
            this.m = 1;
        }
        if (loadingFrameLayout != null) {
            loadingFrameLayout.e();
            loadingFrameLayout.c();
        }
        final vbp a = this.h.a(zkh);
        if (!s.isEmpty()) {
            final apsa b2 = aprz.d(s).b();
            final vdv c2 = a.c();
            c2.d((vdm)b2);
            c2.b().U();
        }
        final acuv webViewClient = new acuv(this.h.a(zkh), s, n);
        final AtomicReference<Boolean> atomicReference = new AtomicReference<Boolean>();
        atomicReference.set(false);
        webViewClient.a.add(new acvh(this, loadingFrameLayout, c, (AtomicReference)atomicReference, aioe, vax, acvf));
        this.k.setWebViewClient((WebViewClient)webViewClient);
        this.k.setWebChromeClient((WebChromeClient)new acuu(this.h.a(zkh), s, n2));
        this.k.setScrollBarStyle(33554432);
        this.k.setScrollbarFadingEnabled(false);
        if (this.o.l(45359121L).aG()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (cls.b("WEB_MESSAGE_LISTENER") && map != null && !map.isEmpty()) {
            final WebView k = this.k;
            final Uri parse = Uri.parse(c);
            final String scheme = parse.getScheme();
            final String host = parse.getHost();
            final StringBuilder sb = new StringBuilder();
            sb.append(scheme);
            sb.append("://");
            sb.append(host);
            cky.b(k, (Set)afdu.s((Object)sb.toString()), new acvj(map, vax));
        }
        final WebSettings settings = this.k.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setMixedContentMode(2);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.k.setDownloadListener((DownloadListener)new acvi(context));
        final wyn b3 = this.b;
        if (b && !c.isEmpty()) {
            final acux acux = (acux)this.g.a();
            final WebView i = this.k;
            i.getClass();
            acux.f(c, zkh, n3, b3, (trb)new zfo(i, 19));
        }
        else if (!c.isEmpty()) {
            this.k.loadUrl(c);
        }
        return this.k;
    }
    
    public final WebView a(final Context context, final apse apse, final zkh zkh, final vax vax, final LoadingFrameLayout loadingFrameLayout, final acvf acvf) {
        final int b = apse.b;
        String a;
        if (b == 1) {
            a = alhb.I((afms)apse.c).a;
        }
        else if (b == 14) {
            a = (String)apse.c;
        }
        else {
            a = "";
        }
        final boolean e = apse.e;
        int z = aqql.Z(apse.f);
        if (z == 0) {
            z = 1;
        }
        int z2 = aqql.Z(apse.g);
        if (z2 == 0) {
            z2 = 1;
        }
        final String d = apse.d;
        int x = aqql.X(apse.k);
        if (x == 0) {
            x = 1;
        }
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)apse.h);
        aioe aioe;
        if ((aioe = apse.j) == null) {
            aioe = aioe.a;
        }
        return this.j(context, a, e, z, z2, d, x, zkh, vax, unmodifiableMap, loadingFrameLayout, aioe, acvf);
    }
    
    public final void b() {
        final WebView k = this.k;
        if (k != null) {
            k.goBack();
        }
    }
    
    public final void c() {
        final WebView k = this.k;
        if (k != null) {
            k.goForward();
        }
    }
    
    public final void d(final String s, final vax vax, final List list) {
        if (this.k != null && this.c.equals(s) && --this.m <= 0) {
            if (!this.d) {
                final wyn b = this.b;
                if (b != null) {
                    b.c("gw_d");
                }
            }
            this.h(7);
            this.l = 0L;
            this.n = 1;
            this.d = false;
            this.i();
            this.k.destroy();
            this.k = null;
            this.c = "";
            this.m = 0;
            if (vax != null && list != null) {
                if (!list.isEmpty()) {
                    for (final apsf apsf : list) {
                        final Iterator<Object> iterator2 = ((List<Object>)apsf.c).iterator();
                        int n = 0;
                        while (iterator2.hasNext()) {
                            final String s2 = iterator2.next();
                            final Iterator iterator3 = this.f.iterator();
                            while (iterator3.hasNext()) {
                                if (((String)iterator3.next()).contains(s2)) {
                                    ++n;
                                    break;
                                }
                            }
                        }
                        final Iterator<Object> iterator4 = ((List<Object>)apsf.d).iterator();
                        boolean b2 = false;
                        while (iterator4.hasNext()) {
                            final String s3 = iterator4.next();
                            final Iterator iterator5 = this.f.iterator();
                            while (iterator5.hasNext()) {
                                if (((String)iterator5.next()).contains(s3)) {
                                    b2 = true;
                                    break;
                                }
                            }
                        }
                        if ((apsf.b & 0x1) != 0x0 && !b2 && n == apsf.c.size()) {
                            aioe aioe;
                            if ((aioe = apsf.e) == null) {
                                aioe = aioe.a;
                            }
                            vax.a(aioe);
                        }
                    }
                    this.e = "";
                    this.f = new HashSet();
                }
            }
        }
    }
    
    public final boolean e() {
        final WebView k = this.k;
        return k != null && k.canGoBack();
    }
    
    public final boolean f() {
        final WebView k = this.k;
        return k != null && k.canGoForward();
    }
    
    public final WebView g(final Context context, final String s, final boolean b, final zkh zkh, final vax vax, final LoadingFrameLayout loadingFrameLayout, final aioe aioe, final acvf acvf) {
        return this.j(context, s, b, 2, 3, "", 2, zkh, vax, null, loadingFrameLayout, aioe, acvf);
    }
    
    public final void h(final int n) {
        final agza builder = ((agzi)aprx.a).createBuilder();
        final boolean d = this.d;
        builder.copyOnWrite();
        final aprx aprx = (aprx)builder.instance;
        aprx.b |= 0x4;
        aprx.e = d;
        final int n2 = this.n;
        builder.copyOnWrite();
        final aprx aprx2 = (aprx)builder.instance;
        if (n2 != 0) {
            aprx2.d = n2 - 1;
            aprx2.b |= 0x2;
            if (!this.e.isEmpty()) {
                final String e = aexs.e(Uri.parse(this.e).getHost());
                builder.copyOnWrite();
                final aprx aprx3 = (aprx)builder.instance;
                aprx3.b |= 0x1;
                aprx3.c = e;
            }
            if (n == 7) {
                final long d2 = this.j.d();
                final long l = this.l;
                builder.copyOnWrite();
                final aprx aprx4 = (aprx)builder.instance;
                aprx4.b |= 0x8;
                aprx4.f = (int)((d2 - l) / 1000L);
            }
            final acko p = this.p;
            final wwc wwc = new wwc(n - 1, 32);
            final agza builder2 = ((agzi)ajrb.a).createBuilder();
            final aprx n3 = (aprx)builder.build();
            builder2.copyOnWrite();
            final ajrb ajrb = (ajrb)builder2.instance;
            n3.getClass();
            ajrb.n = n3;
            ajrb.b |= 0x200000;
            wwc.a = (ajrb)builder2.build();
            p.d(wwc, ajrw.F);
            return;
        }
        throw null;
    }
}
