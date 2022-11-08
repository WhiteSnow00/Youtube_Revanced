// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

public final class DownAndOutController$LifecycleObserver implements tfh
{
    final /* synthetic */ lbb a;
    private final asib b;
    private final wod c;
    
    public DownAndOutController$LifecycleObserver(final lbb a) {
        this.a = a;
        this.b = new asib();
        this.c = new wod(a, 1);
    }
    
    public final void oS(final aum aum) {
        this.b.b();
        final asib b = this.b;
        asic asic;
        if (((uyi)this.a.e.cd().h).bx()) {
            asic = this.a.e.R().am((asix)new kzx(this.a, 5), (asix)kul.p);
        }
        else {
            asic = this.a.e.Q().R().P(ashw.a()).am((asix)new kzx(this.a, 6), (asix)kul.q);
        }
        b.c(asic);
        this.a.h.g((Object)this.c);
    }
    
    public final void oW(final aum aum) {
        this.b.b();
        this.a.h.m((Object)this.c);
    }
}
