import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abgs implements abgx, abpv
{
    private final abhd a;
    private boolean c;
    private final alo d;
    
    public abgs(final abhd a, final alo d, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public final int A(final int n, final fqs fqs) {
        return this.a.A(n, fqs);
    }
    
    public final int B(final fqs fqs) {
        return this.a.B(fqs);
    }
    
    public final fqs C(final int n, final int n2) {
        return this.a.C(n, n2);
    }
    
    protected final fqs D(final abpx abpx) {
        final int n = this.n();
        final int a = this.a();
        final int b = this.b();
        final abpw e = abpx.e;
        final alo d = this.d;
        final PlaybackStartDescriptor f = abpx.f;
        fqs r;
        if (f != null) {
            r = d.r(f);
        }
        else {
            r = null;
        }
        final abhd a2 = this.a;
        int i = 0;
        final int j = a2.i(0);
        final int k = this.a.i(1);
        final abpw a3 = abpw.a;
        final int ordinal = e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            if (r != null) {
                                final int[] b2 = abhd.b;
                                while (i < 2) {
                                    final int n2 = b2[i];
                                    final int a4 = this.a.A(n2, r);
                                    if (a4 != -1) {
                                        return this.a.C(n2, a4);
                                    }
                                    ++i;
                                }
                            }
                            return null;
                        }
                        if (ordinal != 5) {
                            return null;
                        }
                        return r;
                    }
                    else {
                        if (n == 1) {
                            return null;
                        }
                        final abhd a5 = this.a;
                        if (a5.j() == j - 1 && k > 0) {
                            return a5.C(1, 0);
                        }
                        return null;
                    }
                }
                else {
                    final abhd a6 = this.a;
                    if (a6.j() == -1) {
                        return null;
                    }
                    if (n == 2) {
                        if (tqf.aP(a6.j(), 0, j)) {
                            final fqs c = a6.C(0, a6.j());
                            final PlaybackStartDescriptor a7 = c.a();
                            final ahcr builder = ((ahcz)a7.a).toBuilder();
                            builder.copyOnWrite();
                            final lrt lrt = (lrt)builder.instance;
                            lrt.b |= 0x100;
                            lrt.m = true;
                            a7.a = (lrt)builder.build();
                            return c;
                        }
                    }
                }
            }
            else {
                if (tqf.aP(b, 0, j)) {
                    return this.a.C(0, b);
                }
                return null;
            }
        }
        if (tqf.aP(a, 0, j)) {
            return this.a.C(0, a);
        }
        if (e == abpw.a && k > 0) {
            return this.a.C(1, 0);
        }
        return null;
    }
    
    public final abla E() {
        return abla.a;
    }
    
    protected int a() {
        final int i = this.i(0);
        int n2;
        final int n = n2 = this.j() + 1;
        if (this.n() == 1) {
            n2 = n;
            if (i > 0) {
                n2 = n % i;
            }
        }
        return n2;
    }
    
    protected int b() {
        final int i = this.i(0);
        int n2;
        final int n = n2 = Math.max(this.j(), 0) - 1;
        if (this.n() == 1) {
            n2 = n;
            if (i > 0) {
                n2 = (n + i) % i;
            }
        }
        return n2;
    }
    
    public PlaybackStartDescriptor c(final abpx abpx) {
        final fqs d = this.D(abpx);
        if (d == null) {
            return null;
        }
        return d.a();
    }
    
    public final int i(final int n) {
        return this.a.i(n);
    }
    
    public final int j() {
        return this.a.j();
    }
    
    public final void k(final abgz abgz) {
        this.a.k(abgz);
    }
    
    public final void l(final abhb abhb) {
        this.a.l(abhb);
    }
    
    public final void m(final abhc abhc) {
        this.a.m(abhc);
    }
    
    public boolean p(final int n) {
        throw null;
    }
    
    public final void q() {
        this.a.q();
    }
    
    public final void r(final int n, final int n2, final int n3, final int n4) {
        this.a.r(n, n2, n3, n4);
    }
    
    public final void s(final abpx abpx, final PlaybackStartDescriptor playbackStartDescriptor) {
        final fqs d = this.D(abpx);
        if (d != null && abky.g(d.a(), playbackStartDescriptor)) {
            this.B(d);
            return;
        }
        throw new IllegalStateException("Navigation committed to a video that is not expected bythe navigable queue");
    }
    
    public final void t(final WatchNextResponseModel watchNextResponseModel) {
        this.c = (watchNextResponseModel != null);
        final abhd a = this.a;
        if (a instanceof abhq) {
            ((abhq)a).a(watchNextResponseModel);
        }
    }
    
    public final void u(final int n, final int n2, final int n3) {
        this.a.u(n, n2, 1);
    }
    
    public final void v(final abgz abgz) {
        this.a.v(abgz);
    }
    
    public final void w(final abhb abhb) {
        this.a.w(abhb);
    }
    
    public final void x(final abhc abhc) {
        this.a.x(abhc);
    }
    
    public final boolean y(final PlaybackStartDescriptor playbackStartDescriptor) {
        return this.a.y(playbackStartDescriptor);
    }
    
    public final int z(final abpx abpx) {
        final fqs d = this.D(abpx);
        if (abpx.e == abpw.c && d == null && !this.c) {
            return 3;
        }
        return abpx.a(d != null);
    }
}
