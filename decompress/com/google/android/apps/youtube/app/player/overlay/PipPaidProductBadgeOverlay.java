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

public class PipPaidProductBadgeOverlay implements fqm, abcs, tio
{
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    private final Context e;
    private final abqz f;
    private final Handler g;
    private final aslm h;
    private final Runnable i;
    private final oco j;
    private View k;
    private abcr l;
    private fku m;
    private boolean n;
    private long o;
    private final arzb p;
    
    public PipPaidProductBadgeOverlay(final Context e, final abqz f, final Handler g, final oco j, final arzb p7, final byte[] array, final byte[] array2) {
        this.m = fku.a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.j = j;
        this.p = p7;
        this.h = new aslm();
        this.i = (Runnable)new ipi(this, 14);
        this.d = 10000L;
    }
    
    private final void m() {
        if (this.mm()) {
            return;
        }
        final View inflate = LayoutInflater.from(this.e).inflate(2131625018, (ViewGroup)null);
        this.k = inflate;
        final abcr l = this.l;
        if (l != null) {
            l.d((abcs)this, inflate);
        }
        this.a = (inflate.getParent() != null);
        inflate.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new if(this, 6));
    }
    
    private final boolean n() {
        alzw alzw;
        if ((alzw = this.p.f().e) == null) {
            alzw = alzw.a;
        }
        return alzw.aI;
    }
    
    public final ViewGroup$LayoutParams a() {
        return new ViewGroup$LayoutParams(-1, -1);
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void j() {
        if (!this.n) {
            return;
        }
        this.g.removeCallbacks(this.i);
        this.d = Math.max(0L, this.d - (this.j.c() - this.o));
        tqf.v(this.k, false);
        this.n = false;
    }
    
    public final void k(final fku m) {
        if (this.m == m) {
            return;
        }
        this.m = m;
        if (!this.mm()) {
            this.l();
        }
    }
    
    public final void l() {
        if (!this.mm() && this.m.f() && this.n()) {
            this.m();
        }
        if (!this.mm()) {
            return;
        }
        if (this.a && !this.b && this.c) {
            if (!this.n && this.d > 0L) {
                if (this.n()) {
                    this.n = true;
                    this.o = this.j.c();
                    tqf.v(this.k, true);
                    this.g.postDelayed(this.i, this.d);
                }
            }
            return;
        }
        this.j();
    }
    
    public final void lW(final aup aup) {
    }
    
    public final View md() {
        this.m();
        final View k = this.k;
        k.getClass();
        return k;
    }
    
    public final void ml(final abcr l) {
        this.l = l;
    }
    
    public final boolean mm() {
        return this.k != null;
    }
    
    public final void mp(final aup aup) {
    }
    
    public final String mq() {
        return "player_overlay_pip_paid_product_badge";
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
    }
    
    public final void oT(final aup aup) {
        this.h.c(((aske)this.f.p().b).an((asmi)new ixu(this, 3), (asmi)ixz.a));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.h.b();
    }
    
    public final boolean ot(final fku fku) {
        return fku.f();
    }
}
