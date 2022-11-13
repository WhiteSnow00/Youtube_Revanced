// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.scrollselection;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.concurrent.atomic.AtomicReference;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import android.view.View;

public class DefaultScrollSelectionController implements gjl, thl, gjj
{
    private final atiw a;
    public gju b;
    protected View c;
    private final boolean d;
    private final float e;
    private final float f;
    private final float g;
    private final WeakHashMap h;
    private final WeakHashMap i;
    private boolean j;
    private WeakReference k;
    private WeakReference l;
    private asir m;
    private final gjr n;
    
    public DefaultScrollSelectionController(final vai vai, final vaf vaf) {
        this.a = ((atiw)atiy.aE()).aL();
        this.h = new WeakHashMap();
        this.i = new WeakHashMap();
        alxp alxp;
        if ((alxp = vaf.b().e) == null) {
            alxp = alxp.a;
        }
        final int g = alxp.g;
        final boolean b = true;
        final boolean b2 = (0x20000 & g) != 0x0 && (g & 0x40000) != 0x0;
        boolean d = b;
        if (!vai.f(45364727L)) {
            d = (b2 && b);
        }
        this.d = d;
        if (b2) {
            this.e = alxp.bI / 100.0f;
            this.g = alxp.bJ / 100.0f;
        }
        else {
            this.e = (float)vai.g(45364728L);
            this.g = (float)vai.g(45364928L);
        }
        this.f = (float)vai.g(45364927L);
        final gjn a = gjr.a();
        a.a = "ScrollVisibility";
        a.b(0.5f);
        a.b = Optional.of((Object)gjq.a().a());
        this.n = a.a();
    }
    
    private final View k() {
        final WeakReference l = this.l;
        if (l == null) {
            return null;
        }
        return (View)l.get();
    }
    
    private final gjk v() {
        final WeakReference k = this.k;
        if (k == null) {
            return null;
        }
        return (gjk)k.get();
    }
    
    private final void w() {
        this.q(null);
        this.k = null;
        this.l = null;
    }
    
    private final void x(final Optional optional, final Optional optional2, final boolean b, final boolean b2) {
        final WeakReference weakReference = this.i.get(optional.orElse((Object)null));
        gjk gjk;
        if (weakReference == null) {
            gjk = null;
        }
        else {
            gjk = (gjk)weakReference.get();
        }
        final gjk v = this.v();
        if (!b && gjk != null && gjk.b(v)) {
            return;
        }
        final asir m = this.m;
        if (m != null && !m.tA()) {
            asjv.b((AtomicReference)this.m);
        }
        ashc ashc2;
        final ashc ashc = ashc2 = ashc.f();
        if (v != null) {
            ashc2 = ashc;
            if (!v.b(gjk)) {
                final View k = this.k();
                final gju b3 = this.b;
                if (b3 != null && k != null) {
                    b3.c(k);
                }
                this.q(null);
                ashc2 = ashc.c((ashf)v.pW(0));
            }
        }
        ashc c = ashc2;
        if (gjk != null) {
            int n = 1;
            if (b2) {
                n = 2;
            }
            c = ashc2.c((ashf)gjk.pW(n).p((asjg)new fcj(this, optional, optional2, 4)));
        }
        this.m = c.r((asjm)new ghy(this, 15)).q((asjg)new esa(this, 12)).U();
        this.k = new WeakReference(gjk);
        this.l = new WeakReference((T)optional.orElse((Object)null));
    }
    
    public final thh g() {
        return thh.b;
    }
    
    protected gjr j(final gjm gjm) {
        if (gjm.k() == 1 && this.d) {
            final float f = this.f;
            if (f >= 0.0f && f < this.g) {
                final gjn a = gjr.a();
                a.a = "ScrollVisibility";
                a.b(this.e);
                a.c = Optional.of((Object)new gjo(this.f, this.g));
                return a.a();
            }
        }
        return this.n;
    }
    
    @Override
    public void l(final gjm gjm) {
        final asir m = this.m;
        if (m != null && !m.tA()) {
            asjv.b((AtomicReference)this.m);
        }
        final gjk v = this.v();
        if (v != null) {
            this.m = v.pW(0).U();
        }
        final View k = this.k();
        final gju b = this.b;
        if (b != null && k != null) {
            b.c(k);
        }
        this.w();
        if (gjm == null) {
            this.b = null;
            return;
        }
        if ((this.b = this.h.get(gjm)) == null) {
            final gju b2 = new gju(this.c, gjm, this.j(gjm));
            this.b = b2;
            this.h.put(gjm, b2);
        }
        gjm.n(this);
        gjm.l().post((Runnable)new ght(this, 12));
    }
    
    public final void lW(final aun aun) {
    }
    
    public final ashi m() {
        return ((ashi)this.a).p().R();
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    @Override
    public final void n(final View view, final gjk gjk) {
        this.i.put(view, new WeakReference(gjk));
        final gju b = this.b;
        if (b != null) {
            b.b.put(view, 0);
        }
    }
    
    @Override
    public final void o() {
        final gju b = this.b;
        if (b == null) {
            return;
        }
        final Optional b2 = b.b(true);
        this.x(b2.map((Function)ggb.s), b2.map((Function)ggb.t), true, false);
    }
    
    public final void oS(final aun aun) {
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        final asir m = this.m;
        if (m != null && !m.tA()) {
            asjv.b((AtomicReference)this.m);
        }
        this.w();
    }
    
    @Override
    public final void p(final View c) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.c = c;
    }
    
    public final void q(final Integer n) {
        this.a.tu((Object)Optional.ofNullable((Object)n).filter((Predicate)fqo.o));
    }
    
    public final void r(final acko acko, final Object o) {
        if (acko instanceof gjk) {
            this.n(acko.a(), (gjk)acko);
        }
    }
    
    @Override
    public final void s(final View view) {
        this.i.remove(view);
        final gju b = this.b;
        if (b != null) {
            b.b.remove(view);
        }
    }
    
    @Override
    public final void t() {
        final gju b = this.b;
        if (b == null) {
            return;
        }
        final Optional b2 = b.b(false);
        this.x(b2.map((Function)ggb.s), b2.map((Function)ggb.t), false, false);
    }
    
    @Override
    public final void u(final int n) {
        final gju b = this.b;
        if (b == null) {
            return;
        }
        while (true) {
            for (final View view : b.b.keySet()) {
                final int a = b.a(view);
                if (a >= 0 && a == n) {
                    final Optional optional = Optional.of((Object)view);
                    this.x(optional, Optional.of((Object)n), true, true);
                    return;
                }
            }
            final Optional optional = Optional.empty();
            continue;
        }
    }
}
