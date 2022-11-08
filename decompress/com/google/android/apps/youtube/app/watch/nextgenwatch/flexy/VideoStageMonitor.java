// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

public class VideoStageMonitor implements tfh, abcc
{
    private static final kxe b;
    public abim a;
    private final abns c;
    private final kxm d;
    private final abcd e;
    private final asib f;
    private boolean g;
    
    static {
        b = new kxe(2, 1.777f, 1.777f);
    }
    
    public VideoStageMonitor(final abns c, final kxm d, final abcd e) {
        this.a = abim.a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new asib();
    }
    
    public final void h(final int n, final long n2) {
        final boolean g = this.g;
        boolean g2;
        final boolean b = g2 = true;
        if (n != 1) {
            if (n == 2) {
                g2 = b;
            }
            else {
                g2 = false;
            }
        }
        if (g != (this.g = g2)) {
            this.j();
        }
    }
    
    public final void j() {
        if (aeda.v(this.a, abim.j)) {
            if (!this.g) {
                this.d.i((kxu)VideoStageMonitor.b);
            }
        }
        else if (this.a.d() && this.d.g(2) != null) {
            this.d.h(0, false);
        }
    }
    
    public final void oS(final aum aum) {
        this.f.b();
        this.f.c(((asgt)this.c.q().a).R().am((asix)new kxr(this, 3), (asix)kul.l));
        this.e.q((abcc)this);
    }
    
    public final void oW(final aum aum) {
        this.f.b();
        this.e.y((abcc)this);
    }
}
