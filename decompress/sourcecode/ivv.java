import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivv implements abcc
{
    boolean a;
    final /* synthetic */ InteractiveInlineMutedControlsOverlay b;
    private long c;
    
    public ivv(final InteractiveInlineMutedControlsOverlay b) {
        this.b = b;
        this.a = false;
        this.c = -1L;
    }
    
    public final void h(final int n, final long c) {
        final ivs g = this.b.g;
        if (g == null) {
            return;
        }
        ((fon)g).c(c);
        final InteractiveInlineMutedControlsOverlay b = this.b;
        final abgj d = ((fon)b.g).d;
        if (n == 1) {
            if (gkt.aF(b.F)) {
                this.c = c;
                this.b.f.n().l((wxz)new wws(wya.c(112394)));
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
                if (gkt.aF(b.F)) {
                    final long c2 = this.c;
                    if (c2 >= 0L) {
                        final long abs = Math.abs(c - c2);
                        final agza builder = ((agzi)alfp.a).createBuilder();
                        builder.copyOnWrite();
                        final alfp alfp = (alfp)builder.instance;
                        alfp.b |= 0x1;
                        alfp.c = aesy.A(abs);
                        final alfp g2 = (alfp)builder.build();
                        final agza builder2 = ((agzi)alff.a).createBuilder();
                        builder2.copyOnWrite();
                        final alff alff = (alff)builder2.instance;
                        g2.getClass();
                        alff.G = g2;
                        alff.c |= 0x800000;
                        this.b.f.n().J(3, (wxz)new wws(wya.c(112394)), (alff)builder2.build());
                    }
                }
                final anbk a = anbl.a();
                final long c3 = this.c;
                ((agza)a).copyOnWrite();
                anbl.d((anbl)a.instance, (float)(c3 / 1000L));
                ((agza)a).copyOnWrite();
                anbl.e((anbl)a.instance, (float)(c / 1000L));
                final String n2 = this.b.n;
                if (n2 != null) {
                    ((agza)a).copyOnWrite();
                    anbl.c((anbl)a.instance, n2);
                }
                final aklo d2 = aklq.d();
                ((agza)d2).copyOnWrite();
                aklq.aS((aklq)d2.instance, (anbl)((agza)a).build());
                this.b.l.d((aklq)((agza)d2).build());
                final InteractiveInlineMutedControlsOverlay b2 = this.b;
                final gle c4 = b2.E.c;
                final String s = "";
                String i;
                if (c4 != null) {
                    i = c4.i();
                }
                else {
                    i = "";
                }
                if (i == null) {
                    i = s;
                }
                b2.h.a = i;
            }
            this.c = -1L;
            if (d != null && d.g() && this.a) {
                this.a = false;
                d.h(n, c);
            }
            ((fon)this.b.g).pt();
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
