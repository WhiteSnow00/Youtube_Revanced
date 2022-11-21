// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

public class QuickActionsOverlay$1 implements tio
{
    final iyk a;
    
    public QuickActionsOverlay$1(final iyk a) {
        this.a = a;
    }
    
    public final tik g() {
        return tik.b;
    }
    
    public final void lW(final aup aup) {
    }
    
    public final void mp(final aup aup) {
    }
    
    public final void mx(final aup aup) {
    }
    
    public final void oO(final aup aup) {
        if (this.a.h.da()) {
            this.a.a.c((acmh)null);
        }
    }
    
    public final void oT(final aup aup) {
        final iyk a = this.a;
        if (!a.d) {
            return;
        }
        a.e.b();
        final aslm e = a.e;
        final abqz f = a.f;
        asln asln;
        if (((vbs)f.cg().g).bA()) {
            asln = f.Q().an((asmi)new ixu(a, 10), (asmi)ixz.e);
        }
        else {
            asln = f.P().R().j(aana.q(1)).an((asmi)new ixu(a, 10), (asmi)ixz.f);
        }
        e.f(asln, ((aske)f.p().a).j(aana.q(1)).an((asmi)new ixu(a, 11), (asmi)ixz.e));
        a.e.c(a.c.b().am((asmi)new ixu(a, 8)));
        a.e.c(a.g.B().am((asmi)new ixu(a, 9)));
    }
    
    public final void oU() {
        tgj.d((tio)this);
    }
    
    public final void oX() {
        tgj.c((tio)this);
    }
    
    public final void oY(final aup aup) {
        this.a.e.b();
    }
}
