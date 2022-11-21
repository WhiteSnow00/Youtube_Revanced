// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import android.app.Activity;

public class NextPaddleMenuItemControllerImpl implements ith, tio
{
    public final ftq a;
    public final veh b;
    public final xab c;
    public itc d;
    public amis e;
    public boolean f;
    public boolean g;
    private final Activity h;
    private final abqz i;
    private final acqv j;
    private final askz k;
    private final abcl l;
    private asln m;
    private asln n;
    private boolean o;
    
    public NextPaddleMenuItemControllerImpl(final Activity h, final abqz i, final ftq a, final abcl l, final veh b, final acqv j, final askz k, final xab c) {
        h.getClass();
        this.h = h;
        i.getClass();
        this.i = i;
        this.a = a;
        b.getClass();
        this.b = b;
        j.getClass();
        this.j = j;
        k.getClass();
        this.k = k;
        a.a("menu_item_next_paddle", false);
        this.c = c;
        this.l = l;
    }
    
    public final itc a() {
        if (this.d == null) {
            this.d = new itc("", (ita)new isx(this, 7));
            this.l();
        }
        final itc d = this.d;
        if (d != null && ((actj)d).g) {
            this.c.D((xbe)new wzy(xbf.c(138460)));
        }
        final itc d2 = this.d;
        d2.getClass();
        return d2;
    }
    
    public final void b(final boolean b) {
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void j() {
        if (this.o) {
            this.o = false;
            final itc d = this.d;
            if (d != null && ((actj)d).g) {
                this.c.o((xbe)new wzy(xbf.c(138460)), (alji)null);
            }
        }
    }
    
    public final void k() {
        this.o = true;
        final itc d = this.d;
        if (d != null && ((actj)d).g) {
            this.c.t((xbe)new wzy(xbf.c(138460)), (alji)null);
        }
    }
    
    public final void l() {
        final amis e = this.e;
        final boolean b = false;
        if (e != null) {
            final CharSequence q = wbe.q(e);
            if (q != null) {
                final itc d = this.d;
                if (d != null) {
                    ((qlk)d).c = q.toString();
                }
            }
            final akfj o = wbe.o(e);
            int a;
            if (o == null) {
                a = 0;
            }
            else {
                final acqv j = this.j;
                akfi akfi;
                if ((akfi = akfi.b(o.c)) == null) {
                    akfi = akfi.a;
                }
                a = j.a(akfi);
            }
            if (a != 0) {
                final itc d2 = this.d;
                if (d2 != null) {
                    ((qlk)d2).e = tqf.k((Context)this.h, a, 2130970922);
                }
            }
        }
        final itc d3 = this.d;
        if (d3 != null) {
            final boolean g = ((actj)d3).g;
            int n = b ? 1 : 0;
            if (this.f) {
                n = (b ? 1 : 0);
                if (!this.g) {
                    n = (b ? 1 : 0);
                    if (this.e != null) {
                        n = 1;
                    }
                }
            }
            if ((g ? 1 : 0) == n) {
                return;
            }
            ((actj)d3).g((boolean)(n != 0));
            if (n != 0) {
                this.c.D((xbe)new wzy(xbf.c(138460)));
                if (this.o) {
                    this.c.t((xbe)new wzy(xbf.c(138460)), (alji)null);
                }
            }
        }
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oB(final boolean f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        final ftq a = this.a;
        boolean b = false;
        if (f) {
            b = b;
            if (!this.g) {
                b = true;
            }
        }
        a.a("menu_item_next_paddle", b);
        if (this.d != null) {
            this.l();
        }
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oP() {
        this.d = null;
    }
    
    public final boolean oQ() {
        return true;
    }
    
    public final String oR() {
        return "menu_item_next_paddle";
    }
    
    public final void oT(final aup aup) {
        asln m;
        if (((vbs)this.i.cg().g).bA()) {
            m = this.i.Q().an((asmi)new isd(this, 19), (asmi)isj.h);
        }
        else {
            m = this.i.P().R().P(this.k).an((asmi)new isd(this, 19), (asmi)isj.h);
        }
        this.m = m;
        this.n = this.l.a().an((asmi)new isd(this, 20), (asmi)isj.h);
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        final asln m = this.m;
        if (m != null) {
            atkw.f((AtomicReference)m);
            this.m = null;
        }
        final asln n = this.n;
        if (n != null) {
            atkw.f((AtomicReference)n);
            this.n = null;
        }
    }
    
    public final void rd(final abed abed) {
    }
}
