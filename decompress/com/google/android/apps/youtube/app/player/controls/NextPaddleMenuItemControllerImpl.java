// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.controls;

import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import android.app.Activity;

public class NextPaddleMenuItemControllerImpl implements isy, thl
{
    public final ftk a;
    public final vcy b;
    public final wyw c;
    public ist d;
    public amgp e;
    public boolean f;
    public boolean g;
    private final Activity h;
    private final abpu i;
    private final acpk j;
    private final asid k;
    private final abbf l;
    private asir m;
    private asir n;
    private boolean o;
    
    public NextPaddleMenuItemControllerImpl(final Activity h, final abpu i, final ftk a, final abbf l, final vcy b, final acpk j, final asid k, final wyw c) {
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
    
    public final ist a() {
        if (this.d == null) {
            this.d = new ist("", new iso(this, 7));
            this.l();
        }
        final ist d = this.d;
        if (d != null && d.g) {
            this.c.D((wzz)new wyt(xaa.c(138460)));
        }
        final ist d2 = this.d;
        d2.getClass();
        return d2;
    }
    
    public final void b(final boolean b) {
    }
    
    public final thh g() {
        return thh.b;
    }
    
    @Override
    public final void j() {
        if (this.o) {
            this.o = false;
            final ist d = this.d;
            if (d != null && d.g) {
                this.c.o((wzz)new wyt(xaa.c(138460)), (alhi)null);
            }
        }
    }
    
    @Override
    public final void k() {
        this.o = true;
        final ist d = this.d;
        if (d != null && d.g) {
            this.c.t((wzz)new wyt(xaa.c(138460)), (alhi)null);
        }
    }
    
    public final void l() {
        final amgp e = this.e;
        final boolean b = false;
        if (e != null) {
            final CharSequence h = vyg.h(e);
            if (h != null) {
                final ist d = this.d;
                if (d != null) {
                    ((qkq)d).c = h.toString();
                }
            }
            final akdi f = vyg.f(e);
            int a;
            if (f == null) {
                a = 0;
            }
            else {
                final acpk j = this.j;
                akdh akdh;
                if ((akdh = akdh.b(f.c)) == null) {
                    akdh = akdh.a;
                }
                a = j.a(akdh);
            }
            if (a != 0) {
                final ist d2 = this.d;
                if (d2 != null) {
                    ((qkq)d2).e = tpe.k((Context)this.h, a, 2130970924);
                }
            }
        }
        final ist d3 = this.d;
        if (d3 != null) {
            final boolean g = d3.g;
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
            d3.g((boolean)(n != 0));
            if (n != 0) {
                this.c.D((wzz)new wyt(xaa.c(138460)));
                if (this.o) {
                    this.c.t((wzz)new wyt(xaa.c(138460)), (alhi)null);
                }
            }
        }
    }
    
    public final void lW(final aun aun) {
    }
    
    public final void mM(final aun aun) {
    }
    
    public final void mq(final aun aun) {
    }
    
    public final void my(final aun aun) {
    }
    
    public final void oD(final boolean f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        final ftk a = this.a;
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
    
    public final void oS(final aun aun) {
        asir m;
        if (((vai)this.i.ci().g).bx()) {
            m = this.i.Q().an((asjm)new irw(this, 17), (asjm)ise.g);
        }
        else {
            m = this.i.P().R().P(this.k).an((asjm)new irw(this, 17), (asjm)ise.g);
        }
        this.m = m;
        this.n = this.l.a().an((asjm)new irw(this, 18), (asjm)ise.g);
    }
    
    public final void oT() {
        tfg.c((thl)this);
    }
    
    public final void oW() {
        tfg.b((thl)this);
    }
    
    public final void oX(final aun aun) {
        final asir m = this.m;
        if (m != null) {
            athz.f((AtomicReference)m);
            this.m = null;
        }
        final asir n = this.n;
        if (n != null) {
            athz.f((AtomicReference)n);
            this.n = null;
        }
    }
    
    public final void re(final abcx abcx) {
    }
}
