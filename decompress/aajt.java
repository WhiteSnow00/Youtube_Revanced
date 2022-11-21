import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import android.view.View;
import android.util.Pair;
import java.util.Iterator;
import java.util.HashSet;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class aajt implements aakl
{
    private final zoa a;
    public final Activity b;
    public final tre c;
    public final aakm d;
    private final aafm e;
    private final zoo f;
    private final tkq g;
    private final aafz h;
    private final aakf i;
    private final tro j;
    private final aakn k;
    private final aaks l;
    private final Executor m;
    private final aadl n;
    private final aaec o;
    private final zct p;
    
    public aajt(final Activity b, final zoa a, final aadl n, final aafm e, final zoo f, final tre c, final tkq g, final aafz h, final aakm d, final aakf i, final tro j, final aakn k, final zct p19, final aaks l, final aaec o, final Executor m, final byte[] array, final byte[] array2, final byte[] array3) {
        b.getClass();
        this.b = b;
        n.getClass();
        this.n = n;
        e.getClass();
        this.e = e;
        f.getClass();
        this.f = f;
        a.getClass();
        this.a = a;
        c.getClass();
        this.c = c;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        d.getClass();
        this.d = d;
        i.getClass();
        this.i = i;
        this.j = j;
        this.k = k;
        this.p = p19;
        this.l = l;
        this.o = o;
        this.m = m;
    }
    
    private final aage v() {
        return this.n.a();
    }
    
    private final String w(String ex) {
        ex = (TimeoutException)this.o.d((String)ex);
        try {
            ex = (TimeoutException)((ListenableFuture)ex).get(30L, TimeUnit.SECONDS);
            if (ex != null) {
                ex = (TimeoutException)((ajlw)ex).c;
                return (String)ex;
            }
            return null;
        }
        catch (final TimeoutException ex) {}
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        tut.d("[Offline] Unable to retrieve the DrmErrorInfo.", (Throwable)ex);
        return null;
    }
    
    private final void x(final String s, final boolean b, final int n) {
        if (b) {
            twd.n(s);
            final afbh m = this.m(s);
            if (m.h()) {
                final aadc aadc = (aadc)m.c();
                final aajs aajs = new aajs(this, s, n);
                if (aadc.l == aacn.c || aadc.l == aacn.i) {
                    this.d.s(aajs);
                    return;
                }
                final String w = this.w(s);
                if (!afbj.f(w)) {
                    this.d.m(aajs, this.b.getResources().getString(2132018847), w);
                    return;
                }
                tfx.k(this.o.e(s), this.m, (tfv)new wnh(this, (aakp)aajs, 20), (tfw)new xqc(this, (aakp)aajs, 4));
            }
        }
        else {
            twd.n(s);
            if (this.m(s).h()) {
                this.p(s, n);
            }
        }
    }
    
    private final void y(final String s, String w, final aakk aakk, final boolean b, final int n) {
        if (!b) {
            this.g(s, w, aakk, n);
            return;
        }
        twd.n(w);
        final aadc aadc = (aadc)this.m(w).f();
        if (aadc != null && (!aadc.s() || !aadc.w()) && !aadc.x()) {
            return;
        }
        final aajn aajn = new aajn(this, s, w, aakk, n);
        w = this.w(w);
        if (!afbj.f(w)) {
            this.d.p(aajn, w);
            return;
        }
        this.d.o(aajn);
    }
    
    private final void z(final String s, final amzj amzj, final aakk aakk, final xab xab, final amvg amvg, final int n) {
        twd.n(s);
        final aadc aadc = (aadc)this.m(s).f();
        if (!this.g.o() && !this.j(s, aadc)) {
            this.j.b();
            return;
        }
        Label_0095: {
            if (aadc != null) {
                if (aadc.s()) {
                    if (aadc.w()) {
                        break Label_0095;
                    }
                }
                else if (!aadc.e) {
                    break Label_0095;
                }
                this.u(aakk, s, 1);
                return;
            }
        }
        if (amzj == null) {
            this.u(aakk, s, 2);
            return;
        }
        final boolean c = amzj.c;
        final aplb aplb = null;
        if (!c) {
            amzh amzh;
            if ((amzh = amzj.d) == null) {
                amzh = amzh.a;
            }
            Object o;
            if ((0x2 & amzh.b) != 0x0) {
                amzh amzh2;
                if ((amzh2 = amzj.d) == null) {
                    amzh2 = amzh.a;
                }
                if ((o = amzh2.d) == null) {
                    o = aplb.a;
                }
            }
            else {
                final amzh d = amzj.d;
                amzh a;
                if (d == null) {
                    a = amzh.a;
                }
                else {
                    a = d;
                }
                o = aplb;
                if ((0x1 & a.b) != 0x0) {
                    amzh a2;
                    if ((a2 = d) == null) {
                        a2 = amzh.a;
                    }
                    if ((o = a2.c) == null) {
                        o = ajhc.a;
                    }
                }
            }
            this.i(s, o, xab);
            return;
        }
        if (!this.a.t()) {
            this.f.b(this.b, (byte[])null, (zom)new aajr(this, s, amzj, aakk, xab, amvg, n));
            return;
        }
        this.b(s, amzj, aakk, xab, amvg, n);
    }
    
    protected int a() {
        return 0;
    }
    
    protected void b(final String s, final amzj amzj, final aakk aakk, final xab xab, final amvg amvg, final int n) {
        byte[] array;
        if ((amzj.b & 0x80) != 0x0) {
            array = amzj.i.I();
        }
        else {
            array = vby.b;
        }
        if (this.h.m(amzj, amvg)) {
            this.d.i(s, amzj, xab, new aajq(this, amzj, xab, s, array, aakk, n, 0));
            return;
        }
        final amze u = this.h.u();
        final aacw a = aacw.a;
        amvf amvf;
        if (amvg != null && (amvg.b & 0x2) != 0x0) {
            if ((amvf = amvf.b(amvg.d)) == null) {
                amvf = amvf.a;
            }
        }
        else {
            amvf = null;
        }
        aamn.t(amzj, xab, s, null, u, true, a, amvf);
        String e;
        if (amvg != null) {
            e = amvg.e;
        }
        else {
            e = null;
        }
        this.l(s, u, e, aacw.a, array, aakk, n);
    }
    
    @Override
    public void c(final String s, final boolean b) {
        this.x(s, b, this.a());
    }
    
    @Override
    public void d(final String s, final boolean b) {
        this.x(vht.i(s), b, vht.a(s));
    }
    
    @Override
    public void e(final aadb aadb, final boolean b) {
        if (b) {
            this.d.h((aakp)new ify(this, 7));
            return;
        }
        this.f();
    }
    
    public void f() {
        this.e.c(this.n.d());
    }
    
    protected void g(final String s, final String s2, final aakk aakk, int n) {
        if (this.g.o()) {
            if (!afbj.f(s) && !s.equals("PPSV")) {
                n = this.v().i().b(s, s2);
            }
            else {
                final afbh m = this.m(s2);
                final aakn k = this.k;
                final amze u = this.h.u();
                if (m.h()) {
                    final aadc aadc = (aadc)m.c();
                }
                final boolean h = m.h();
                boolean b = false;
                if (h) {
                    b = b;
                    if (((aadc)m.c()).x()) {
                        b = true;
                    }
                }
                n = k.e(s2, u, b, n);
            }
            final aacw a = aacw.a;
            this.u(aakk, s2, n);
            return;
        }
        this.j.b();
    }
    
    protected void h(final int n) {
        tqf.x((Context)this.b, n, 1);
    }
    
    protected void i(final String s, final Object o, final xab xab) {
        this.q(s, o, xab);
    }
    
    protected boolean j(final String s, final aadc aadc) {
        return aadc != null && aadc.q();
    }
    
    protected void k(final int n) {
        if (!this.g.o()) {
            this.j.b();
            return;
        }
        final HashSet set = new HashSet();
        for (final aacx aacx : this.v().l().l()) {
            if (set.add(aacx.f())) {
                final afbh m = this.m(aacx.f());
                if (!m.h()) {
                    return;
                }
                final aadc aadc = (aadc)m.c();
                if (!aadc.r()) {
                    continue;
                }
                this.k.e(aadc.a(), this.h.u(), false, n);
            }
        }
    }
    
    protected void l(final String s, final amze amze, final String s2, final aacw aacw, final byte[] array, final aakk aakk, final int n) {
        this.u(aakk, s, this.k.b(s, amze, s2, aacw, array, n));
    }
    
    public final afbh m(String h) {
        h = (TimeoutException)this.v().l().h((String)h);
        try {
            h = (TimeoutException)((ListenableFuture)h).get(30L, TimeUnit.SECONDS);
            return (afbh)h;
        }
        catch (final TimeoutException h) {}
        catch (final InterruptedException h) {}
        catch (final ExecutionException ex) {}
        tut.d("[Offline] Unable to retrieve the offlineVideoSnapshot.", (Throwable)h);
        return afag.a;
    }
    
    @Override
    public final void n(final String s, final String s2, final aakk aakk, final boolean b) {
        this.y(s, s2, aakk, b, this.a());
    }
    
    @Override
    public final void o(final String s, final amzj amzj, final aakk aakk, final xab xab, final amvg amvg) {
        this.z(s, amzj, aakk, xab, amvg, this.a());
    }
    
    public final void p(final String s, final int n) {
        this.k.c(s, n);
    }
    
    @Override
    public final void q(final String s, final Object o, final xab xab) {
        final int a = this.a();
        Pair pair;
        if (this.m(s).h()) {
            pair = new Pair((Object)this.b.getString(2132019498), (Object)new wud(this, s, a, 5));
        }
        else {
            pair = null;
        }
        this.i.a(o, xab, pair, null);
    }
    
    @Override
    public final void r() {
        this.d.n(new aajo(this));
    }
    
    @Override
    public final void s(final String s, final String s2) {
        this.y(s, vht.i(s2), null, true, vht.a(s2));
    }
    
    @Override
    public final void t(final String s, final amzj amzj, final xab xab, final amvg amvg) {
        this.z(vht.i(s), amzj, null, xab, amvg, vht.a(s));
    }
    
    public final void u(final aakk aakk, final String s, int n) {
        final int n2 = 0;
        int n3 = n;
        if (aakk != null) {
            final igd igd = (igd)aakk;
            n3 = n;
            if (s.equals(igd.i) && (n3 = n) == 0) {
                final ilo l = ((krj)igd.d).l;
                ((ikz)l).a();
                ((ikz)l).b.i();
                final OfflineArrowView b = ((ikz)l).b;
                b.k();
                tqf.v((View)b.e, false);
                tqf.v((View)b.g, true);
                ((ikz)l).b.setEnabled(false);
                ((ikz)l).b.setContentDescription((CharSequence)((ikz)l).a.getString(2132017309));
                n3 = 0;
            }
        }
        final aafz h = this.h;
        final tkq g = this.g;
        final zct p3 = this.p;
        final aaks i = this.l;
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    n = n2;
                }
                else {
                    n = 2132017466;
                }
            }
            else {
                n = 2132020133;
            }
        }
        else {
            final aqtt w = h.w();
            final aqtt c = aqtt.c;
            final int n4 = 2132017463;
            if (w == c && !g.r() && (!i.e() || !g.q())) {
                n = n4;
                if (i.e()) {
                    n = n4;
                    if (p3.j()) {
                        n = 2132017464;
                    }
                }
            }
            else if (w == aqtt.b && !g.r()) {
                n = n4;
            }
            else {
                n = 2132017462;
            }
        }
        if (n != 0) {
            this.h(n);
        }
    }
}
