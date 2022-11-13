// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.slimstatusbar;

import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class SlimStatusBarConnectivityController implements thl, irg, zmm, fju, tgg
{
    public final tjm a;
    public final fjv b;
    public final gkc c;
    public ViewGroup d;
    public ViewGroup e;
    public SlimStatusBar f;
    public SlimStatusBar g;
    public final tgd h;
    private final abpq i;
    private final zml j;
    private final zmf k;
    private final abpu l;
    private final LayoutInflater m;
    private boolean n;
    private boolean o;
    private asir p;
    private final riq q;
    
    public SlimStatusBarConnectivityController(final Context context, final tjm a, final skt skt, final fjv b, final abpq i, final gkc c, final zml j, final zmf k, final abpu l, final tgd h, final riq q, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.c = c;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = LayoutInflater.from(context);
        this.o = (skt.a ^ true);
        this.h = h;
        this.q = q;
        j.m((zmm)this);
    }
    
    private final ViewGroup s(final boolean b) {
        ViewGroup viewGroup;
        if (b) {
            viewGroup = this.e;
            viewGroup.getClass();
        }
        else {
            viewGroup = this.d;
            viewGroup.getClass();
        }
        return viewGroup;
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final SlimStatusBar j(final boolean b) {
        if (b) {
            if (this.g == null) {
                this.g = (SlimStatusBar)this.m.inflate(2131625452, this.e, false);
            }
            return this.g;
        }
        if (this.f == null) {
            this.f = (SlimStatusBar)this.m.inflate(2131625452, this.d, false);
        }
        return this.f;
    }
    
    public final void k() {
        this.j.n((zmm)this);
    }
    
    public final void l() {
        this.q();
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void m() {
        this.q();
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                final zmu zmu = (zmu)o;
                this.q();
            }
            else {
                final zms zms = (zms)o;
                this.q();
            }
        }
        else {
            array = new Class[] { zms.class, zmu.class };
        }
        return array;
    }
    
    public final void my(final aun aun) {
    }
    
    public final void n(final fkr fkr) {
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        final ViewGroup s = this.s(this.n);
        final ViewGroup s2 = this.s(fkr2.c());
        final rio a = this.q.a();
        String g;
        if (a == null) {
            g = null;
        }
        else {
            g = a.g;
        }
        if (!adkp.ae(s, s2)) {
            final gkc c = this.c;
            final boolean n = this.n;
            c.i = 0;
            if (n) {
                c.k();
                final ViewGroup f = c.f;
                f.getClass();
                final Runnable q = c.q;
                q.getClass();
                f.post(q);
            }
            else {
                c.j();
                final ViewGroup e = c.e;
                e.getClass();
                final Runnable m = c.m;
                m.getClass();
                e.post(m);
            }
        }
        this.n = fkr2.c();
        if (fkr.c() != fkr2.c()) {
            if (!fkr2.o()) {
                if (!this.o) {
                    final gkc c2 = this.c;
                    c2.i = 2;
                    c2.s(this.n, false, this.k.c().g(), g);
                    return;
                }
                if (!this.k.c().g() && g == null) {
                    return;
                }
                this.c.s(this.n, this.a.o(), this.k.c().g(), g);
            }
        }
    }
    
    public final void oS(final aun aun) {
        this.p = ((ashi)this.l.p().l).an((asjm)new ghy(this, 16), (asjm)fua.q);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        final asir p = this.p;
        if (p != null) {
            athz.f((AtomicReference)p);
        }
        this.p = null;
    }
    
    public final void p() {
        this.q();
    }
    
    public final void q() {
        final rio a = this.q.a();
        final gkc c = this.c;
        final boolean c2 = this.b.j().c();
        final boolean o = this.a.o();
        final boolean g = this.k.c().g();
        String g2;
        if (a == null) {
            g2 = null;
        }
        else {
            g2 = a.g;
        }
        c.s(c2, o, g, g2);
    }
    
    public final void r(final boolean b) {
        final boolean o = this.a.o();
        final boolean c = this.b.j().c();
        final rio a = this.q.a();
        String g;
        if (a == null) {
            g = null;
        }
        else {
            g = a.g;
        }
        if (o == this.o) {
            if (b) {
                if (!o) {
                    final gkc c2 = this.c;
                    final ViewGroup c3 = c2.c(c);
                    final SlimStatusBar d = c2.d(c);
                    if (!gkc.t(c3, d)) {
                        c2.o(false, c);
                    }
                    c2.i();
                    d.post((Runnable)new fsi(c2, d, 9));
                    return;
                }
            }
            else if (!o) {
                return;
            }
            if (this.k.c().g() || g != null) {
                this.q();
            }
            return;
        }
        if (o || !this.b.j().c() || !this.i.f()) {
            this.q();
        }
        this.o = o;
    }
}
