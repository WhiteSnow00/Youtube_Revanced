// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.fullscreenengagement;

public class FullscreenEngagementViewPresenter implements abiw, tio, fjt, jca
{
    public final jcc a;
    public final abiv b;
    private final int c;
    private final aslm d;
    private final etz e;
    private final abqz f;
    private ajxu g;
    private boolean h;
    
    public FullscreenEngagementViewPresenter(final jcc a, final abiv b, final etz e, final abqz f) {
        this.a = a;
        this.b = b;
        this.c = b.getContext().getResources().getDimensionPixelSize(2131166507);
        this.e = e;
        this.f = f;
        this.d = new aslm();
    }
    
    private final void l() {
        final ajxu g = this.g;
        boolean b = true;
        final boolean b2 = g != null && this.h;
        if (g != null && this.b.b.d()) {
            this.a.g(this.g);
            this.a.h(true, b2, true);
            return;
        }
        if (this.g == null) {
            this.a.g((ajxu)null);
        }
        final jcc a = this.a;
        if (this.g == null || this.b.b.e()) {
            b = false;
        }
        a.h(false, b2, b);
    }
    
    @Override
    public final void b(final int n, final int n2, final int n3) {
        if (n == n2 && (this.h ? 1 : 0) == n3) {
            return;
        }
        boolean h = true;
        if (1 != n3) {
            h = false;
        }
        this.h = h;
        this.l();
    }
    
    @Override
    public final void d(final float n, final boolean b) {
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void k(final ajxu g, final boolean b) {
        if (aexq.c(g, this.g)) {
            return;
        }
        this.g = g;
        if (b) {
            final ajxq b2 = jbt.b(g);
            int c = 0;
            final boolean b3 = b2 != null && b2.b.size() > 0;
            final abiv b4 = this.b;
            if (b3) {
                c = this.c;
            }
            if (b4.f != c) {
                b4.f = c;
                b4.l();
            }
        }
        this.l();
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
        final jbz c = this.a.c;
        if (c != null) {
            final acsc g = c.g;
            if (g != null) {
                g.b(c.a);
            }
        }
    }
    
    public final void oT(final aup aup) {
        this.d.b();
        final aslm d = this.d;
        asln asln;
        if (((vbs)this.f.cg().g).bA()) {
            asln = this.f.Q().an((asmi)new jcf(this, 1), (asmi)ixz.n);
        }
        else {
            asln = this.f.P().R().P(aslh.a()).an((asmi)new jcf(this, 1), (asmi)ixz.n);
        }
        d.c(asln);
        this.e.a = (etx)this.a;
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.d.b();
        this.e.a = null;
    }
    
    public final void pe(final ema ema) {
        this.k(null, false);
    }
}
