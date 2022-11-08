// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

import android.view.ViewGroup$LayoutParams;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.os.Handler;
import android.content.Context;

public class PipPaidProductBadgeOverlay implements fqb, aazr, tfh
{
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    private final Context e;
    private final abns f;
    private final Handler g;
    private final asib h;
    private final Runnable i;
    private final oas j;
    private View k;
    private aazq l;
    private fkk m;
    private boolean n;
    private long o;
    private final arud p;
    
    public PipPaidProductBadgeOverlay(final Context e, final abns f, final Handler g, final oas j, final arud p7, final byte[] array, final byte[] array2) {
        this.m = fkk.a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.p = p7;
        this.h = new asib();
        this.i = (Runnable)new ihc(this, 17);
        this.d = 10000L;
    }
    
    private final void m() {
        if (this.mn()) {
            return;
        }
        final View inflate = LayoutInflater.from(this.e).inflate(2131625015, (ViewGroup)null);
        this.k = inflate;
        final aazq l = this.l;
        if (l != null) {
            l.d((aazr)this, inflate);
        }
        this.a = (inflate.getParent() != null);
        inflate.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new ie(this, 6));
    }
    
    private final boolean n() {
        alvs alvs;
        if ((alvs = this.p.f().e) == null) {
            alvs = alvs.a;
        }
        return alvs.aI;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    @Override
    public final void j(final fkk m) {
        if (this.m == m) {
            return;
        }
        this.m = m;
        if (!this.mn()) {
            this.l();
        }
    }
    
    public final void k() {
        if (!this.n) {
            return;
        }
        this.g.removeCallbacks(this.i);
        this.d = Math.max(0L, this.d - (this.j.c() - this.o));
        tmy.v(this.k, false);
        this.n = false;
    }
    
    public final void l() {
        if (!this.mn() && this.m.f() && this.n()) {
            this.m();
        }
        if (!this.mn()) {
            return;
        }
        if (this.a && !this.b && this.c) {
            if (!this.n && this.d > 0L) {
                if (this.n()) {
                    this.n = true;
                    this.o = this.j.c();
                    tmy.v(this.k, true);
                    this.g.postDelayed(this.i, this.d);
                }
            }
            return;
        }
        this.k();
    }
    
    public final View md() {
        this.m();
        final View k = this.k;
        k.getClass();
        return k;
    }
    
    public final void ml(final aazq l) {
        this.l = l;
    }
    
    public final boolean mn() {
        return this.k != null;
    }
    
    public final String mr() {
        return "player_overlay_pip_paid_product_badge";
    }
    
    public final void oS(final aum aum) {
        this.h.c(((asgt)this.f.q().b).am((asix)new iws(this, 0), (asix)iwn.c));
    }
    
    public final void oW(final aum aum) {
        this.h.b();
    }
    
    @Override
    public final boolean ow(final fkk fkk) {
        return fkk.f();
    }
}
