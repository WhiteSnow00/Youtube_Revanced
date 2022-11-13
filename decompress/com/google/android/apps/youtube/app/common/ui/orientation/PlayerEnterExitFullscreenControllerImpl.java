// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.orientation;

import android.content.res.Configuration;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import j$.util.Optional;
import android.app.Activity;

public final class PlayerEnterExitFullscreenControllerImpl implements ghp, fju, tpy, fxu, thl
{
    public final ghv a;
    public final liq b;
    public final fjv c;
    public boolean d;
    public int e;
    public trs f;
    private final Activity g;
    private final aun h;
    private final abty i;
    private final afvt j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final iuo n;
    private final Optional o;
    private final acql p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private afvr u;
    private xan v;
    private final hox w;
    private final skt x;
    private final pja y;
    private final jki z;
    
    public PlayerEnterExitFullscreenControllerImpl(final Activity g, final fxw fxw, final ghv a, final liq b, final fjv c, final abty i, final skt x, final tpz tpz, final jki z, final aun h, final msr msr, final afvt j, final hox w, final pja y, final vai vai, final lhm lhm, final iuo n, final Optional o, final acql p23, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.i = i;
        this.x = x;
        this.h = h;
        this.j = j;
        this.w = w;
        this.z = z;
        this.y = y;
        this.k = lhm.a;
        this.l = vai.cJ();
        this.m = vai.f(45379723L);
        this.n = n;
        this.o = o;
        this.p = p23;
        if (vai.cK()) {
            fxw.f(this);
            tpz.a((tpy)this);
            c.l(this);
            o.ifPresent((Consumer)new fvi(this, msr, 10, null, null));
            msr.Q((Callable)new exo(this, (ashi)w.b, 8));
            msr.Q((Callable)new exo(this, (ashi)z.b, 9));
        }
    }
    
    private final void r(final int n) {
        this.d = true;
        this.a.e(n);
    }
    
    private final void s() {
        final afvr u = this.u;
        if (u != null) {
            u.cancel(false);
        }
        final afvr e = this.j.e((Runnable)new ght(this, 1), 200L, TimeUnit.MILLISECONDS);
        this.u = e;
        teu.p(this.h, (ListenableFuture)e, (ttg)etg.k, (ttg)teu.b);
    }
    
    private final void t() {
        this.y.l(this.g.getResources().getConfiguration(), (Context)this.g);
    }
    
    private final boolean u(final fkr fkr) {
        return (!this.a.m(fkr) && this.a.d()) || this.f instanceof trv || this.p.isInMultiWindowMode();
    }
    
    public final thh g() {
        return thh.b;
    }
    
    public final void j(final Configuration configuration) {
        final boolean b = this.i.g() && this.d && !this.r;
        this.r = false;
        if (this.t) {
            if (this.x.a) {
                this.t();
            }
            return;
        }
        if (this.x.a) {
            return;
        }
        if (this.i.g() && this.c.j().c() && configuration.orientation == 1 && !this.q && !this.d) {
            this.q = true;
            this.r(12);
            return;
        }
        if ((this.c.j() == fkr.d || this.c.j() == fkr.g) && configuration.orientation == 2) {
            this.b.b();
        }
        else if (this.c.j().c() && !this.c.j().f() && configuration.orientation == 1 && (!this.i.g() || b)) {
            if (this.k) {
                this.b.d();
            }
            else {
                this.b.c();
            }
        }
        if (this.l && this.v != null) {
            this.n.a();
            this.v = null;
        }
    }
    
    @Override
    public final void k() {
        final fkr j = this.c.j();
        if (!j.c()) {
            if (j.a()) {
                if (this.l) {
                    this.v = this.n.b(3);
                }
                if (this.u(fkr.e)) {
                    this.b.b();
                    return;
                }
                int n;
                if (!this.m) {
                    n = 11;
                }
                else {
                    n = 6;
                }
                this.r(n);
            }
        }
    }
    
    @Override
    public final void l() {
        final fkr j = this.c.j();
        if (j != fkr.e && j != fkr.f) {
            return;
        }
        if (this.l) {
            this.v = this.n.b(2);
        }
        if (this.u(fkr.d)) {
            this.b.c();
            return;
        }
        this.r(12);
    }
    
    public final void lW(final aun aun) {
    }
    
    @Override
    public final void m() {
        this.r = true;
        int n;
        if (!this.m) {
            n = 11;
        }
        else {
            n = 6;
        }
        this.r(n);
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mW(final boolean b, final int n) {
        this.mx(b, n);
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void mx(final boolean b, final int n) {
        if (this.d && !this.x.a && !ger.g((Context)this.a.b) && n != 2) {
            if (!this.t) {
                if (this.q) {
                    if (n != 1 && n != 3) {
                        return;
                    }
                    this.b.c();
                }
                else {
                    this.s();
                }
            }
        }
    }
    
    public final void my(final aun aun) {
    }
    
    @Override
    public final void n(final fkr fkr) {
        if (fkr == fkr.d) {
            this.q = false;
        }
        if (this.s) {
            if (fkr == fkr.d) {
                this.t = false;
                if (!this.x.a) {
                    this.s();
                }
            }
            else if (fkr == fkr.b || fkr == fkr.c || (fkr == fkr.g && !this.t)) {
                this.t = true;
                if (!this.x.a) {
                    this.r(12);
                }
                this.t();
            }
        }
    }
    
    @Override
    public final void oK(final fkr fkr, final fkr fkr2) {
        fal.b((fju)this, fkr2);
    }
    
    public final void oS(final aun aun) {
        this.q(this.t);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
    }
    
    @Override
    public final void p() {
        this.r = true;
        this.r(12);
    }
    
    public final void q(final boolean s) {
        final boolean s2 = this.s;
        if (!s2 && s) {
            this.t = true;
            if (!this.x.a) {
                this.r(12);
            }
            this.t();
        }
        else if (s2 && !s) {
            this.t = false;
            if (!this.x.a) {
                this.s();
            }
        }
        this.s = s;
    }
}
