import j$.util.Optional;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iyi implements abcc
{
    boolean a;
    final /* synthetic */ YouTubeControlsOverlay b;
    private long c;
    private int d;
    
    public iyi(final YouTubeControlsOverlay b) {
        this.b = b;
        this.a = false;
        this.c = -1L;
    }
    
    public final void h(final int n, final long c) {
        ((fon)this.b.n).c(c);
        final YouTubeControlsOverlay b = this.b;
        abgj abgj;
        if ((abgj = ((fon)b.n).d) == null) {
            b.F();
            abgj = ((fon)this.b.n).d;
        }
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4) {
                    if (gkt.aF(this.b.W)) {
                        this.c = c;
                        this.b.w.l((wxz)new wws(wya.c(112394)));
                    }
                    final YouTubeControlsOverlay b2 = this.b;
                    this.d = b2.H;
                    b2.C();
                    return;
                }
                if (gkt.aF(this.b.W)) {
                    final wwv w = this.b.w;
                    final wws wws = new wws(wya.c(112394));
                    final long c2 = this.c;
                    Optional optional;
                    if (n == 3) {
                        if (c2 < 0L) {
                            optional = Optional.empty();
                        }
                        else {
                            final agza builder = ((agzi)alfp.a).createBuilder();
                            builder.copyOnWrite();
                            final alfp alfp = (alfp)builder.instance;
                            alfp.b |= 0x1;
                            alfp.c = aesy.A(c - c2);
                            builder.copyOnWrite();
                            final alfp alfp2 = (alfp)builder.instance;
                            alfp2.b |= 0x2;
                            alfp2.d = false;
                            final alfp g = (alfp)builder.build();
                            final agza builder2 = ((agzi)alff.a).createBuilder();
                            builder2.copyOnWrite();
                            final alff alff = (alff)builder2.instance;
                            g.getClass();
                            alff.G = g;
                            alff.c |= 0x800000;
                            optional = Optional.of((Object)builder2.build());
                        }
                    }
                    else if (n == 4) {
                        final agza builder3 = ((agzi)alfp.a).createBuilder();
                        builder3.copyOnWrite();
                        final alfp alfp3 = (alfp)builder3.instance;
                        alfp3.b |= 0x2;
                        alfp3.d = true;
                        final alfp g2 = (alfp)builder3.build();
                        final agza builder4 = ((agzi)alff.a).createBuilder();
                        builder4.copyOnWrite();
                        final alff alff2 = (alff)builder4.instance;
                        g2.getClass();
                        alff2.G = g2;
                        alff2.c |= 0x800000;
                        optional = Optional.of((Object)builder4.build());
                    }
                    else {
                        optional = Optional.empty();
                    }
                    w.J(3, (wxz)wws, (alff)optional.orElse((Object)null));
                }
                this.b.b.j(false);
                this.b.x.a(false);
                ((fpb)this.b.n).o();
                if (this.d == 0) {
                    if (n == 3) {
                        this.b.oE();
                    }
                    else {
                        this.b.P(true);
                    }
                }
                else {
                    this.b.Q();
                }
                this.b.G();
                this.c = -1L;
                if (abgj != null && abgj.g() && this.a) {
                    this.a = false;
                    abgj.h(n, c);
                }
                ((fon)this.b.n).pt();
                if (n != 4) {
                    final YouTubeControlsOverlay b3 = this.b;
                    if (b3.f != null) {
                        if (gkt.L(b3.V)) {
                            final YouTubeControlsOverlay b4 = this.b;
                            final aazw f = b4.f;
                            final ivt d = b4.D;
                            final anwx a = d.a;
                            d.a = anwx.a;
                            f.s(c, a);
                            return;
                        }
                        this.b.f.r(c);
                    }
                }
            }
            else {
                this.b.Q();
                ((fpb)this.b.n).o();
                if (abgj != null && abgj.g() && this.a && !this.b.E.j()) {
                    abgj.h(n, c);
                    abgj.f(true);
                }
                final aazw f2 = this.b.f;
                if (f2 != null) {
                    f2.p(c);
                }
            }
        }
        else {
            this.b.x.a(true);
            this.b.b.j(true);
            this.b.Q();
            if (abgj != null && abgj.g() && !this.b.E.j()) {
                this.a = true;
                abgj.h(n, c);
            }
            final aazw f3 = this.b.f;
            if (f3 != null) {
                f3.q();
            }
        }
    }
}
