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

public final class acxm implements acxi
{
    public final tqd a;
    public xan b;
    public String c;
    public boolean d;
    public String e;
    public Set f;
    private final atke g;
    private final vdr h;
    private final xao i;
    private final oby j;
    private WebView k;
    private long l;
    private int m;
    private int n;
    private final vai o;
    private final acmr p;
    
    public acxm(final atke g, final vdr h, final acmr p8, final xao i, final tqd a, final vai o, final oby j, final byte[] array) {
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
    
    private final WebView j(final Context context, final String c, final boolean b, final int n, final int n2, String scheme, final int n3, final zme zme, final vcy vcy, final Map map, final LoadingFrameLayout loadingFrameLayout, final aiqj aiqj, final acxh acxh) {
        this.i();
        this.n = n3;
        this.l = this.j.d();
        this.h(2);
        this.b = this.i.b(almx.cb);
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
        final vdq a = this.h.a(zme);
        if (!scheme.isEmpty()) {
            final apuk b2 = apuj.d(scheme).b();
            final vfw c2 = a.c();
            c2.d((vfn)b2);
            c2.b().U();
        }
        final acwz webViewClient = new acwz(this.h.a(zme), scheme, n);
        final AtomicReference<Boolean> atomicReference = new AtomicReference<Boolean>();
        atomicReference.set(false);
        webViewClient.a.add(new acxj(this, loadingFrameLayout, c, (AtomicReference)atomicReference, aiqj, vcy, acxh));
        this.k.setWebViewClient((WebViewClient)webViewClient);
        this.k.setWebChromeClient((WebChromeClient)new acwy(this.h.a(zme), scheme, n2));
        this.k.setScrollBarStyle(33554432);
        this.k.setScrollbarFadingEnabled(false);
        if (this.o.l(45359121L).aM()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        if (clt.b("WEB_MESSAGE_LISTENER") && map != null && !map.isEmpty()) {
            final WebView k = this.k;
            final Uri parse = Uri.parse(c);
            scheme = parse.getScheme();
            final String host = parse.getHost();
            final StringBuilder sb = new StringBuilder();
            sb.append(scheme);
            sb.append("://");
            sb.append(host);
            ckz.b(k, (Set)afft.s((Object)sb.toString()), new acxl(map, vcy));
        }
        final WebSettings settings = this.k.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setMixedContentMode(2);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.k.setDownloadListener((DownloadListener)new acxk(context));
        final xan b3 = this.b;
        if (b && !c.isEmpty()) {
            final acxb acxb = (acxb)this.g.a();
            final WebView i = this.k;
            i.getClass();
            acxb.f(c, zme, n3, b3, (ttg)new zhf(i, 20));
        }
        else if (!c.isEmpty()) {
            this.k.loadUrl(c);
        }
        return this.k;
    }
    
    public final WebView a(final Context context, final apun apun, final zme zme, final vcy vcy, final LoadingFrameLayout loadingFrameLayout, final acxh acxh) {
        final int b = apun.b;
        String a;
        if (b == 1) {
            a = aeuz.e((afos)apun.c).a;
        }
        else if (b == 14) {
            a = (String)apun.c;
        }
        else {
            a = "";
        }
        final boolean e = apun.e;
        int aa = aqsx.aa(apun.f);
        if (aa == 0) {
            aa = 1;
        }
        int aa2 = aqsx.aa(apun.g);
        if (aa2 == 0) {
            aa2 = 1;
        }
        final String d = apun.d;
        int y = aqsx.Y(apun.k);
        if (y == 0) {
            y = 1;
        }
        final Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap((Map<?, ?>)apun.h);
        aiqj aiqj;
        if ((aiqj = apun.j) == null) {
            aiqj = aiqj.a;
        }
        return this.j(context, a, e, aa, aa2, d, y, zme, vcy, unmodifiableMap, loadingFrameLayout, aiqj, acxh);
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
    
    public final void d(final String s, final vcy vcy, final List list) {
        if (this.k != null && this.c.equals(s) && --this.m <= 0) {
            if (!this.d) {
                final xan b = this.b;
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
            if (vcy != null && list != null) {
                if (!list.isEmpty()) {
                    for (final apuo apuo : list) {
                        final Iterator<Object> iterator2 = ((List<Object>)apuo.c).iterator();
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
                        final Iterator<Object> iterator4 = ((List<Object>)apuo.d).iterator();
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
                        if ((apuo.b & 0x1) != 0x0 && !b2 && n == apuo.c.size()) {
                            aiqj aiqj;
                            if ((aiqj = apuo.e) == null) {
                                aiqj = aiqj.a;
                            }
                            vcy.a(aiqj);
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
    
    public final WebView g(final Context context, final String s, final boolean b, final zme zme, final vcy vcy, final LoadingFrameLayout loadingFrameLayout, final aiqj aiqj, final acxh acxh) {
        return this.j(context, s, b, 2, 3, "", 2, zme, vcy, null, loadingFrameLayout, aiqj, acxh);
    }
    
    public final void h(final int n) {
        final ahaz builder = ((ahbh)apug.a).createBuilder();
        final boolean d = this.d;
        builder.copyOnWrite();
        final apug apug = (apug)builder.instance;
        apug.b |= 0x4;
        apug.e = d;
        final int n2 = this.n;
        builder.copyOnWrite();
        final apug apug2 = (apug)builder.instance;
        if (n2 != 0) {
            apug2.d = n2 - 1;
            apug2.b |= 0x2;
            if (!this.e.isEmpty()) {
                final String e = aezr.e(Uri.parse(this.e).getHost());
                builder.copyOnWrite();
                final apug apug3 = (apug)builder.instance;
                apug3.b |= 0x1;
                apug3.c = e;
            }
            if (n == 7) {
                final long d2 = this.j.d();
                final long l = this.l;
                builder.copyOnWrite();
                final apug apug4 = (apug)builder.instance;
                apug4.b |= 0x8;
                apug4.f = (int)((d2 - l) / 1000L);
            }
            final acmr p = this.p;
            final wye wye = new wye(n - 1, 32);
            final ahaz builder2 = ((ahbh)ajtf.a).createBuilder();
            final apug n3 = (apug)builder.build();
            builder2.copyOnWrite();
            final ajtf ajtf = (ajtf)builder2.instance;
            n3.getClass();
            ajtf.n = n3;
            ajtf.b |= 0x200000;
            wye.a = (ajtf)builder2.build();
            p.d(wye, ajtz.F);
            return;
        }
        throw null;
    }
}
