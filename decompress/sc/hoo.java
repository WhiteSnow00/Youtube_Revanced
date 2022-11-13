import j$.util.Optional;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hoo implements Runnable
{
    public final how a;
    public final int b;
    public final akqn c;
    public final long d;
    public final aiqj e;
    
    public hoo(final how a, final int b, final akqn c, final long d, final aiqj e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        final how a = this.a;
        final int b = this.b;
        final akqn c = this.c;
        final long d = this.d;
        final aiqj e = this.e;
        if (b != 0) {
            if (b != 1) {
                final hne d2 = a.d;
                if (e != null) {
                    if (c != null) {
                        final Optional f = d2.f(d);
                        if (!f.isEmpty()) {
                            final hnf hnf = (hnf)f.get();
                            if (hnf.f == null) {
                                hnf.c(c);
                                final hoc g = hnf.g;
                                if (g != null && g.J()) {
                                    final answ answ = (answ)d2.d.a();
                                    if (answ == null || !answ.B) {
                                        final hmb a2 = d2.a;
                                        final aiqj e2 = hnf.e;
                                        akxi akxi;
                                        if ((akxi = c.e) == null) {
                                            akxi = akxi.a;
                                        }
                                        a2.g(e2, akxi);
                                    }
                                    final String e3 = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)hnf.e).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).e;
                                    final boolean p = hko.p(hnf.b());
                                    final hri f2 = g.F();
                                    if (f2 != null) {
                                        f2.k(e3, c, d, p, hnf.c, hnf.b());
                                        f2.t().e();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if ((c.b & 0x10) != 0x0) {
                aiqj aiqj;
                if ((aiqj = c.g) == null) {
                    aiqj = aiqj.a;
                }
                a.bo(Optional.of((Object)aiqj));
            }
        }
        else if ((c.b & 0x8) != 0x0) {
            aiqj aiqj2;
            if ((aiqj2 = c.f) == null) {
                aiqj2 = aiqj.a;
            }
            a.bo(Optional.of((Object)aiqj2));
        }
    }
}
