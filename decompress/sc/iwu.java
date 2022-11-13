import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwu implements abdw
{
    boolean a;
    final InteractiveInlineMutedControlsOverlay b;
    private long c;
    
    public iwu(final InteractiveInlineMutedControlsOverlay b) {
        this.b = b;
        this.a = false;
        this.c = -1L;
    }
    
    public final void h(final int n, final long c) {
        final iwr g = this.b.g;
        if (g == null) {
            return;
        }
        ((fos)g).c(c);
        final InteractiveInlineMutedControlsOverlay b = this.b;
        final abie d = ((fos)b.g).d;
        if (n == 1) {
            if (fbu.aX(b.F)) {
                this.c = c;
                this.b.f.pF().l((wzz)new wyt(xaa.c(112394)));
            }
            if (d != null && d.g()) {
                this.a = true;
                d.h(n, c);
            }
            this.b.m.h(n, c);
            return;
        }
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    return;
                }
            }
            else {
                if (fbu.aX(b.F)) {
                    final long c2 = this.c;
                    if (c2 >= 0L) {
                        final long abs = Math.abs(c - c2);
                        final ahaz builder = ((ahbh)alhs.a).createBuilder();
                        final int g2 = afwm.G(abs);
                        builder.copyOnWrite();
                        final alhs alhs = (alhs)builder.instance;
                        alhs.b |= 0x1;
                        alhs.c = g2;
                        final alhs g3 = (alhs)builder.build();
                        final ahaz builder2 = ((ahbh)alhi.a).createBuilder();
                        builder2.copyOnWrite();
                        final alhi alhi = (alhi)builder2.instance;
                        g3.getClass();
                        alhi.G = g3;
                        alhi.c |= 0x800000;
                        this.b.f.pF().J(3, (wzz)new wyt(xaa.c(112394)), (alhi)builder2.build());
                    }
                }
                final ando a = andp.a();
                final long n2 = this.c / 1000L;
                ((ahaz)a).copyOnWrite();
                andp.d((andp)a.instance, (float)n2);
                final long n3 = c / 1000L;
                ((ahaz)a).copyOnWrite();
                andp.e((andp)a.instance, (float)n3);
                final String n4 = this.b.n;
                if (n4 != null) {
                    ((ahaz)a).copyOnWrite();
                    andp.c((andp)a.instance, n4);
                }
                final aknr d2 = aknt.d();
                ((ahaz)d2).copyOnWrite();
                aknt.aT((aknt)d2.instance, (andp)((ahaz)a).build());
                this.b.l.d((aknt)((ahaz)d2).build());
                final InteractiveInlineMutedControlsOverlay b2 = this.b;
                final glm c3 = b2.E.c;
                final String s = "";
                String i;
                if (c3 != null) {
                    i = c3.i();
                }
                else {
                    i = "";
                }
                final kbm h = b2.h;
                if (i == null) {
                    i = s;
                }
                h.a = i;
            }
            this.c = -1L;
            if (d != null && d.g() && this.a) {
                this.a = false;
                d.h(n, c);
            }
            ((fos)this.b.g).p();
            this.b.k.h(c);
            this.b.m.h(n, c);
            return;
        }
        if (d != null && d.g() && this.a) {
            d.h(n, c);
            d.f(true);
        }
        this.b.m.h(n, c);
    }
}
