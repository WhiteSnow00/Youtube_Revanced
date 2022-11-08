// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay.fullscreenengagement;

public class FullscreenEngagementViewPresenter implements abfu, tfh, fjk, jas
{
    public final jau a;
    public final abft b;
    private final int c;
    private final asib d;
    private final etu e;
    private final abns f;
    private ajts g;
    private boolean h;
    
    public FullscreenEngagementViewPresenter(final jau a, final abft b, final etu e, final abns f) {
        this.a = a;
        this.b = b;
        this.c = b.getContext().getResources().getDimensionPixelSize(2131166506);
        this.e = e;
        this.f = f;
        this.d = new asib();
    }
    
    private final void l() {
        final ajts g = this.g;
        boolean b = true;
        final boolean b2 = g != null && this.h;
        if (g != null && this.b.b.d()) {
            this.a.g(this.g);
            this.a.h(true, b2, true);
            return;
        }
        if (this.g == null) {
            this.a.g((ajts)null);
        }
        final jau a = this.a;
        if (this.g == null || this.b.b.e()) {
            b = false;
        }
        a.h(false, b2, b);
    }
    
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
    
    public final void d(final float n, final boolean b) {
    }
    
    public final void k(final ajts g, final boolean b) {
        if (aeda.v(g, this.g)) {
            return;
        }
        this.g = g;
        if (b) {
            final ajto b2 = jal.b(g);
            int c = 0;
            final boolean b3 = b2 != null && b2.b.size() > 0;
            final abft b4 = this.b;
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
    
    public final void oS(final aum aum) {
        this.d.b();
        final asib d = this.d;
        asic asic;
        if (((uyi)this.f.cd().h).bx()) {
            asic = this.f.R().am((asix)new iys(this, 19), (asix)iwn.o);
        }
        else {
            asic = this.f.Q().R().P(ashw.a()).am((asix)new iys(this, 19), (asix)iwn.o);
        }
        d.c(asic);
        this.e.a = (ets)this.a;
    }
    
    public final void oW(final aum aum) {
        this.d.b();
        this.e.a = null;
    }
    
    public final void qp(final elw elw) {
        this.k(null, false);
    }
}
