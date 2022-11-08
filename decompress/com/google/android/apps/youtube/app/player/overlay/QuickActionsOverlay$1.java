// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.player.overlay;

public class QuickActionsOverlay$1 implements tfh
{
    final /* synthetic */ ixd a;
    
    public QuickActionsOverlay$1(final ixd a) {
        this.a = a;
    }
    
    public final void oS(final aum aum) {
        final ixd a = this.a;
        if (!a.d) {
            return;
        }
        a.e.b();
        final asib e = a.e;
        final abns f = a.f;
        asic asic;
        if (((uyi)f.cd().h).bx()) {
            asic = f.R().am((asix)new iws(a, 8), (asix)iwn.f);
        }
        else {
            asic = f.Q().R().j(aajj.r(1)).am((asix)new iws(a, 8), (asix)iwn.g);
        }
        e.f(asic, ((asgt)f.q().a).j(aajj.r(1)).am((asix)new iws(a, 9), (asix)iwn.f));
        a.e.c(a.c.b().al((asix)new iws(a, 6)));
        a.e.c(a.g.A().al((asix)new iws(a, 7)));
    }
    
    public final void oW(final aum aum) {
        this.a.e.b();
    }
}
