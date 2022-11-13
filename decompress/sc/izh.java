import j$.util.Optional;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izh implements abdw
{
    boolean a;
    final YouTubeControlsOverlay b;
    private long c;
    private int d;
    
    public izh(final YouTubeControlsOverlay b) {
        this.b = b;
        this.a = false;
        this.c = -1L;
    }
    
    public final void h(final int n, final long c) {
        ((fos)this.b.n).c(c);
        final YouTubeControlsOverlay b = this.b;
        abie abie;
        if ((abie = ((fos)b.n).d) == null) {
            b.F();
            abie = ((fos)this.b.n).d;
        }
        if (n != 1) {
            if (n != 2) {
                if (n != 3 && n != 4) {
                    if (fbu.aX(this.b.W)) {
                        this.c = c;
                        this.b.w.l((wzz)new wyt(xaa.c(112394)));
                    }
                    final YouTubeControlsOverlay b2 = this.b;
                    this.d = b2.H;
                    b2.C();
                    return;
                }
                if (fbu.aX(this.b.W)) {
                    final wyw w = this.b.w;
                    final wyt wyt = new wyt(xaa.c(112394));
                    final long c2 = this.c;
                    Optional optional;
                    if (n == 3) {
                        if (c2 < 0L) {
                            optional = Optional.empty();
                        }
                        else {
                            final ahaz builder = ((ahbh)alhs.a).createBuilder();
                            builder.copyOnWrite();
                            final alhs alhs = (alhs)builder.instance;
                            alhs.b |= 0x1;
                            alhs.c = afwm.G(c - c2);
                            builder.copyOnWrite();
                            final alhs alhs2 = (alhs)builder.instance;
                            alhs2.b |= 0x2;
                            alhs2.d = false;
                            final alhs g = (alhs)builder.build();
                            final ahaz builder2 = ((ahbh)alhi.a).createBuilder();
                            builder2.copyOnWrite();
                            final alhi alhi = (alhi)builder2.instance;
                            g.getClass();
                            alhi.G = g;
                            alhi.c |= 0x800000;
                            optional = Optional.of((Object)builder2.build());
                        }
                    }
                    else if (n == 4) {
                        final ahaz builder3 = ((ahbh)alhs.a).createBuilder();
                        builder3.copyOnWrite();
                        final alhs alhs3 = (alhs)builder3.instance;
                        alhs3.b |= 0x2;
                        alhs3.d = true;
                        final alhs g2 = (alhs)builder3.build();
                        final ahaz builder4 = ((ahbh)alhi.a).createBuilder();
                        builder4.copyOnWrite();
                        final alhi alhi2 = (alhi)builder4.instance;
                        g2.getClass();
                        alhi2.G = g2;
                        alhi2.c |= 0x800000;
                        optional = Optional.of((Object)builder4.build());
                    }
                    else {
                        optional = Optional.empty();
                    }
                    w.J(3, (wzz)wyt, (alhi)optional.orElse((Object)null));
                }
                this.b.b.j(false);
                this.b.x.a(false);
                ((fpg)this.b.n).q();
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
                if (abie != null && abie.g() && this.a) {
                    this.a = false;
                    abie.h(n, c);
                }
                ((fos)this.b.n).p();
                if (n != 4) {
                    final YouTubeControlsOverlay b3 = this.b;
                    if (b3.f != null) {
                        if (fbu.an(b3.V)) {
                            final YouTubeControlsOverlay b4 = this.b;
                            final abbr f = b4.f;
                            final iws d = b4.D;
                            final anza a = d.a;
                            d.a = anza.a;
                            f.s(c, a);
                            return;
                        }
                        this.b.f.r(c);
                    }
                }
            }
            else {
                this.b.Q();
                ((fpg)this.b.n).q();
                if (abie != null && abie.g() && this.a && !this.b.E.j()) {
                    abie.h(n, c);
                    abie.f(true);
                }
                final abbr f2 = this.b.f;
                if (f2 != null) {
                    f2.p(c);
                }
            }
        }
        else {
            this.b.x.a(true);
            this.b.b.j(true);
            this.b.Q();
            if (abie != null && abie.g() && !this.b.E.j()) {
                this.a = true;
                abie.h(n, c);
            }
            final abbr f3 = this.b.f;
            if (f3 != null) {
                f3.q();
            }
        }
    }
}
