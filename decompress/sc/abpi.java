import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abpi implements abqb
{
    private aboh a;
    private final atke b;
    
    public abpi(final atke b) {
        this.b = b;
    }
    
    public final aboj a() {
        return (aboj)this.a;
    }
    
    public final void b() {
        final aboh a = this.a;
        if (a != null) {
            a.h();
            this.a = null;
        }
    }
    
    public final boolean c(final abpq abpq, final aezf aezf, final PlaybackStartDescriptor n, final abjt abjt) {
        if (this.a == null) {
            return false;
        }
        if (n.u() && (boolean)aezf.apply((Object)n)) {
            final aboh a = this.a;
            if (a != null) {
                a.a.k(n);
                if (((abok)this.b.a()).f(n, (aboj)this.a)) {
                    this.b();
                    this.g(n);
                    final aboh a2 = this.a;
                    if (a2 != null) {
                        ((aboj)a2).c();
                        ((aboj)a2).g();
                    }
                    else {
                        zlm.b(zll.b, zlk.j, "Initializing a PlaybackSequencer for playback continuation, but it does not exist");
                    }
                }
                final Object a3 = abpq.u.a;
                final ablh m = abpq.m;
                String u;
                if (a3 != null) {
                    u = ((abvb)a3).u();
                }
                else {
                    u = null;
                }
                final ablt c = abpq.o.c();
                tbi.f();
                n.getClass();
                if (((vai)m.t.g).f(45360673L)) {
                    m.p = null;
                }
                m.n = n;
                m.n(abkb.a);
                final ablg g = m.g;
                if (g != null) {
                    g.a(m.n, (WatchNextResponseModel)null, u);
                }
                ((aukf)m.r.d).tu((Object)new abit(n.i()));
                m.l(n, 1, u, c, abjt.a);
                return true;
            }
        }
        final aboh a4 = this.a;
        if (a4 == null) {
            return false;
        }
        final abop c2 = a4.a.c(n, abjt);
        if (c2 == null) {
            return false;
        }
        if (c2.e.equals((Object)aboo.e)) {
            final abjt g2 = c2.g;
            if (g2 != null) {
                final xan b = g2.b;
                if (b != null) {
                    final ahaz builder = ((ahbh)almj.a).createBuilder();
                    final ahaz builder2 = ((ahbh)alml.a).createBuilder();
                    final alnc e = alnc.e;
                    builder2.copyOnWrite();
                    final alml alml = (alml)builder2.instance;
                    alml.e = e.o;
                    alml.b |= 0x8;
                    builder.copyOnWrite();
                    final almj almj = (almj)builder.instance;
                    final alml l = (alml)builder2.build();
                    l.getClass();
                    almj.L = l;
                    almj.c |= 0x800000;
                    b.a((almj)builder.build());
                }
            }
        }
        final agmc i = this.i(c2);
        if (i == null) {
            return false;
        }
        abpq.t.r((PlaybackStartDescriptor)i.c, (abjt)i.b, i.a);
        return true;
    }
    
    public final boolean d(final abop abop) {
        final aboh a = this.a;
        return a != null && ((aboj)a).j(abop);
    }
    
    public final boolean e() {
        return this.a != null;
    }
    
    public final int f(final abop abop) {
        final aboh a = this.a;
        if (a == null) {
            return 1;
        }
        return ((aboj)a).l(abop);
    }
    
    public final void g(final PlaybackStartDescriptor playbackStartDescriptor) {
        this.b();
        this.a = (aboh)((abok)this.b.a()).b(playbackStartDescriptor);
    }
    
    public final void h(final PlaybackServiceState playbackServiceState) {
        this.a = (aboh)((abok)this.b.a()).c(playbackServiceState.d);
    }
    
    public final agmc i(final abop abop) {
        tbi.f();
        final aboh a = this.a;
        if (a == null) {
            return null;
        }
        a.b();
        final abiu g = abop.e.g;
        final boolean c = a.e.c();
        boolean b = true;
        if (!c) {
            final abiu b2 = abiu.b;
            final abiu c2 = abiu.c;
            final abiu d = abiu.d;
            final abiu e = abiu.e;
            for (int i = 0; i < 4; ++i) {
                if (g == (new abiu[] { b2, c2, d, e })[i]) {
                    ((aukf)a.d.i).tu((Object)new aamw());
                    break;
                }
            }
        }
        final abjt g2 = abop.g;
        if (g2 != null) {
            final xan b3 = g2.b;
            if (b3 != null) {
                b3.e();
            }
        }
        a.e(g);
        final PlaybackStartDescriptor f = abop.f;
        if (f != null) {
            a.i(f.i());
        }
        if (a.a.i() || abop.e == aboo.c) {
            b = false;
        }
        PlaybackStartDescriptor a2 = a.a.a(abop);
        if (a.j(abop) && a2 != null) {
            a.a.f(abop, a2);
            a2.n(abop.f);
        }
        else {
            String.valueOf(abop.e);
            String.valueOf(a.c.k);
            a2 = null;
        }
        if (a2 != null) {
            abjt abjt;
            if ((abjt = abop.g) == null) {
                abjt = a.a.b(abop);
            }
            return new agmc(a2, abjt, b);
        }
        return null;
    }
}
