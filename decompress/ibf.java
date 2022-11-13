import android.os.Looper;
import j$.time.Instant;
import com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.util.Objects;
import android.view.View$OnClickListener;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibf implements vcv, fcd, tgg
{
    public static final String a;
    public final xhv b;
    public final Context c;
    public final xhy d;
    public final oby e;
    public final xjz f;
    public final ScheduledExecutorService g;
    public final bu h;
    public final abpq i;
    public boolean j;
    public boolean k;
    public boolean l;
    public Optional m;
    private final tgd n;
    private final vcy o;
    private final cl p;
    private final cck r;
    private final gbu s;
    private final xnt t;
    private final hzn u;
    private final aeea v;
    
    static {
        a = ttr.a("MDX.MdxConnectNavigationCommand");
    }
    
    public ibf(final xhv b, final Context c, final xhy d, final oby e, final aeea v, final xjz f, final afvt g, final tgd n, final vcy o, final cl p23, final cck r, final bu h, final gbu s, final xnt t, final abpq i, final hzn u, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6, final byte[] array7) {
        this.j = false;
        this.k = false;
        this.l = false;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.v = v;
        this.f = f;
        this.g = (ScheduledExecutorService)g;
        this.n = n;
        this.o = o;
        this.p = p23;
        this.r = r;
        this.h = h;
        this.s = s;
        this.t = t;
        this.i = i;
        this.u = u;
        this.m = Optional.empty();
    }
    
    public static Optional b(final Optional optional) {
        if (optional.isPresent()) {
            amem amem;
            if ((amem = ((amfm)optional.get()).c) == null) {
                amem = amem.a;
            }
            if (amem.b == 1) {
                amem amem2;
                if ((amem2 = ((amfm)optional.get()).c) == null) {
                    amem2 = amem.a;
                }
                amen a;
                if (amem2.b == 1) {
                    a = (amen)amem2.c;
                }
                else {
                    a = amen.a;
                }
                return Optional.of((Object)a);
            }
        }
        return Optional.empty();
    }
    
    private final void i(final String s, final String s2) {
        final gbv d = gbx.d();
        d.k((CharSequence)s);
        ((acwc)d).m((CharSequence)aevy.c(s2), (View$OnClickListener)new ibb(this, 0));
        this.s.n((acwd)d.a());
    }
    
    public final void c(final ahab c, final boolean b, final Optional optional) {
        if (!this.m.isEmpty() && (((amfm)this.m.get()).b & 0x2) != 0x0 && !Objects.equals((Object)this.i.s(), (Object)((amfm)this.m.get()).d)) {
            final String d = ((amfm)this.m.get()).d;
            this.n.g((Object)this);
            final vcy o = this.o;
            final ahbb ahbb = (ahbb)((ahbh)aiqj.a).createBuilder();
            final ahbf watchEndpoint = WatchEndpointOuterClass.watchEndpoint;
            final ahaz builder = ((ahbh)apsk.a).createBuilder();
            builder.copyOnWrite();
            final apsk apsk = (apsk)builder.instance;
            d.getClass();
            apsk.b |= 0x1;
            apsk.d = d;
            ahbb.e((ahaq)watchEndpoint, (Object)builder.build());
            ((ahaz)ahbb).copyOnWrite();
            final aiqj aiqj = (aiqj)ahbb.instance;
            c.getClass();
            aiqj.b |= 0x1;
            aiqj.c = c;
            o.a((aiqj)((ahaz)ahbb).build());
            this.k = true;
            return;
        }
        this.d(b, optional);
    }
    
    public final void d(final boolean b, final Optional optional) {
        if (!b) {
            this.h();
            return;
        }
        if (this.t.g() != null) {
            return;
        }
        if (optional.isPresent()) {
            final cct cct = (cct)optional.get();
            if (this.m.isPresent() && (((amfm)this.m.get()).b & 0x2) != 0x0) {
                final xhv b2 = this.b;
                final xnd c = xne.c();
                c.g(((amfm)this.m.get()).d);
                b2.F(cct, c.a());
            }
            else {
                this.b.H(cct);
            }
            this.j = true;
            this.n.g((Object)this);
            return;
        }
        final cck r = this.r;
        final pvh av = new pvh(this);
        final xim xim = new xim();
        xim.aK(r);
        xim.av = av;
        ((bi)xim).r(this.p, xim.getClass().getCanonicalName());
        this.n.g((Object)this);
        this.j = true;
    }
    
    public final void f(final ibe ibe) {
        final bu h = this.h;
        final Optional b = b(this.m);
        ListenableFuture listenableFuture;
        if (b.isPresent()) {
            listenableFuture = aftq.e((ListenableFuture)this.u.a, (aezf)new etz(this, b, 9), (Executor)this.g);
        }
        else {
            listenableFuture = afwm.m((Object)Optional.empty());
        }
        teu.n((aun)h, listenableFuture, (ttg)new hui(ibe, 7), (ttg)new ifz(this, ibe, 1));
    }
    
    public final void g() {
        this.j = false;
        this.k = false;
        this.n.m((Object)this);
    }
    
    public final void h() {
        final Optional b = b(this.m);
        if (b.isPresent()) {
            final amen amen = (amen)b.get();
            this.i(this.h.getString(2132018471, new Object[] { ((amen)b.get()).c }), this.h.getString(2132018470));
        }
        else {
            this.i(this.h.getString(2132018473), this.h.getString(2132018472));
        }
        this.g();
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (!((ahbc)aiqj).ry((ahaq)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint)) {
            ttr.m(ibf.a, "MdxConnectNavigationEndpoint not filled");
            return;
        }
        final MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint = (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint)((ahbc)aiqj).rx((ahaq)MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint);
        if ((mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.b & 0x2) != 0x0) {
            amfm amfm;
            if ((amfm = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.c) == null) {
                amfm = amfm.a;
            }
            this.m = Optional.of((Object)amfm);
        }
        amej amej;
        if ((amej = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.d) == null) {
            amej = amej.a;
        }
        amet amet;
        if ((amet = amet.b(amej.b)) == null) {
            amet = amet.a;
        }
        final boolean l = amet == amet.d;
        this.l = l;
        if (l) {
            this.v.br();
            this.f.b((amfm)this.m.orElse((Object)null), "LR notification clicked.", amep.b);
        }
        final Instant ofEpochMilli = Instant.ofEpochMilli(this.e.c());
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.y((Object)this);
        }
        else {
            this.g.execute(new hvt(this, 8));
        }
        this.g.execute((Runnable)new gpd(this, aiqj, ofEpochMilli, 13));
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array2;
        if (n != -1) {
            final Class[] array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final aanw aanw = (aanw)o;
                if (!this.k) {
                    this.g();
                    array2 = array;
                }
                else {
                    if (aanw.a() != 5) {
                        array2 = array;
                        if (aanw.a() != 2) {
                            return array2;
                        }
                    }
                    this.g();
                    this.i.a();
                    if (this.l && this.m.isPresent()) {
                        this.f.b((amfm)this.m.get(), "LR notification navigated to watch page.", amep.c);
                    }
                    this.f((ibe)new ibd(this));
                    array2 = array;
                }
            }
            else {
                final xnu xnu = (xnu)o;
                if (!this.j) {
                    this.g();
                    array2 = array;
                }
                else {
                    final xnm a = xnu.a();
                    if (a != null && a.a() != 2) {
                        if (a.a() != 0) {
                            array2 = array;
                            if (a.a() != 1) {
                                return array2;
                            }
                        }
                        a.j().e();
                        if (this.l) {
                            final xjz f = this.f;
                            final amfm amfm = (amfm)this.m.orElse((Object)null);
                            String concat = "Connection started from LR notification";
                            if (amfm != null) {
                                concat = "Connection started from LR notification".concat(": videoId=".concat(String.valueOf(amfm.d)));
                            }
                            ttr.h(xjz.a, concat);
                            f.a(amep.e);
                        }
                        this.g();
                        array2 = array;
                    }
                    else {
                        this.h();
                        array2 = array;
                    }
                }
            }
        }
        else {
            array2 = new Class[] { xnu.class, aanw.class };
        }
        return array2;
    }
}
