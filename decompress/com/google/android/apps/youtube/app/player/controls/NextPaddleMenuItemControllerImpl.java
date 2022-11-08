// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import android.app.Activity;

public class NextPaddleMenuItemControllerImpl implements isa, tfh
{
    public final ftc a;
    public final vax b;
    public final wwv c;
    public irv d;
    public amel e;
    public boolean f;
    public boolean g;
    private final Activity h;
    private final abns i;
    private final acng j;
    private final asho k;
    private final aazk l;
    private asic m;
    private asic n;
    private boolean o;
    
    public NextPaddleMenuItemControllerImpl(final Activity h, final abns i, final ftc a, final aazk l, final vax b, final acng j, final asho k, final wwv c) {
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
    
    public final irv a() {
        if (this.d == null) {
            this.d = new irv("", (irt)new irq(this, 7));
            this.l();
        }
        final irv d = this.d;
        if (d != null && d.g) {
            this.c.D((wxz)new wws(wya.c(138460)));
        }
        final irv d2 = this.d;
        d2.getClass();
        return d2;
    }
    
    public final void b(final boolean b) {
    }
    
    public final void j() {
        if (this.o) {
            this.o = false;
            final irv d = this.d;
            if (d != null && d.g) {
                this.c.o((wxz)new wws(wya.c(138460)), (alff)null);
            }
        }
    }
    
    public final void k() {
        this.o = true;
        final irv d = this.d;
        if (d != null && d.g) {
            this.c.t((wxz)new wws(wya.c(138460)), (alff)null);
        }
    }
    
    public final void l() {
        final amel e = this.e;
        final boolean b = false;
        if (e != null) {
            final CharSequence f = vwh.f(e);
            if (f != null) {
                final irv d = this.d;
                if (d != null) {
                    ((qjg)d).c = f.toString();
                }
            }
            final akbf d2 = vwh.d(e);
            int a;
            if (d2 == null) {
                a = 0;
            }
            else {
                final acng j = this.j;
                akbe akbe;
                if ((akbe = akbe.b(d2.c)) == null) {
                    akbe = akbe.a;
                }
                a = j.a(akbe);
            }
            if (a != 0) {
                final irv d3 = this.d;
                if (d3 != null) {
                    ((qjg)d3).e = tmy.k((Context)this.h, a, 2130970924);
                }
            }
        }
        final irv d4 = this.d;
        if (d4 != null) {
            final boolean g = d4.g;
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
            d4.g((boolean)(n != 0));
            if (n != 0) {
                this.c.D((wxz)new wws(wya.c(138460)));
                if (this.o) {
                    this.c.t((wxz)new wws(wya.c(138460)), (alff)null);
                }
            }
        }
    }
    
    public final void oD(final boolean f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        final ftc a = this.a;
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
    
    public final void oO() {
        this.d = null;
    }
    
    public final boolean oP() {
        return true;
    }
    
    public final String oQ() {
        return "menu_item_next_paddle";
    }
    
    public final void oS(final aum aum) {
        asic m;
        if (((uyi)this.i.cd().h).bx()) {
            m = this.i.R().am((asix)new iqv(this, 18), (asix)irb.h);
        }
        else {
            m = this.i.Q().R().P(this.k).am((asix)new iqv(this, 18), (asix)irb.h);
        }
        this.m = m;
        this.n = this.l.a().am((asix)new iqv(this, 19), (asix)irb.h);
    }
    
    public final void oW(final aum aum) {
        final asic m = this.m;
        if (m != null) {
            athh.f((AtomicReference)m);
            this.m = null;
        }
        final asic n = this.n;
        if (n != null) {
            athh.f((AtomicReference)n);
            this.n = null;
        }
    }
    
    public final void qY(final abbd abbd) {
    }
}
