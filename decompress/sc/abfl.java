import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abfl implements abfq, abon
{
    private final abfw a;
    private boolean c;
    private final aln d;
    
    public abfl(final abfw a, final aln d, final byte[] array, final byte[] array2) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
    }
    
    public final int A(final int n, final fqq fqq) {
        return this.a.A(n, fqq);
    }
    
    public final int B(final fqq fqq) {
        return this.a.B(fqq);
    }
    
    public final fqq C(final int n, final int n2) {
        return this.a.C(n, n2);
    }
    
    protected final fqq D(final abop abop) {
        final int n = this.n();
        final int a = this.a();
        final int b = this.b();
        final aboo e = abop.e;
        final aln d = this.d;
        final PlaybackStartDescriptor f = abop.f;
        fqq r;
        if (f != null) {
            r = d.r(f);
        }
        else {
            r = null;
        }
        final abfw a2 = this.a;
        int i = 0;
        final int j = a2.i(0);
        final int k = this.a.i(1);
        final aboo a3 = aboo.a;
        final int ordinal = e.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            if (r != null) {
                                final int[] b2 = abfw.b;
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
                        final abfw a5 = this.a;
                        if (a5.j() == j - 1 && k > 0) {
                            return a5.C(1, 0);
                        }
                        return null;
                    }
                }
                else {
                    final abfw a6 = this.a;
                    if (a6.j() == -1) {
                        return null;
                    }
                    if (n == 2) {
                        if (tpe.aP(a6.j(), 0, j)) {
                            final fqq c = a6.C(0, a6.j());
                            final PlaybackStartDescriptor a7 = c.a();
                            final ahaz builder = ((ahbh)a7.a).toBuilder();
                            builder.copyOnWrite();
                            final lrf lrf = (lrf)builder.instance;
                            lrf.b |= 0x100;
                            lrf.m = true;
                            a7.a = (lrf)builder.build();
                            return c;
                        }
                    }
                }
            }
            else {
                if (tpe.aP(b, 0, j)) {
                    return this.a.C(0, b);
                }
                return null;
            }
        }
        if (tpe.aP(a, 0, j)) {
            return this.a.C(0, a);
        }
        if (e == aboo.a && k > 0) {
            return this.a.C(1, 0);
        }
        return null;
    }
    
    @Override
    public final abjt E() {
        return abjt.a;
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
    
    @Override
    public PlaybackStartDescriptor c(final abop abop) {
        final fqq d = this.D(abop);
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
    
    public final void k(final abfs abfs) {
        this.a.k(abfs);
    }
    
    public final void l(final abfu abfu) {
        this.a.l(abfu);
    }
    
    public final void m(final abfv abfv) {
        this.a.m(abfv);
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
    
    @Override
    public final void s(final abop abop, final PlaybackStartDescriptor playbackStartDescriptor) {
        final fqq d = this.D(abop);
        if (d != null && abjr.g(d.a(), playbackStartDescriptor)) {
            this.B(d);
            return;
        }
        throw new IllegalStateException("Navigation committed to a video that is not expected bythe navigable queue");
    }
    
    @Override
    public final void t(final WatchNextResponseModel watchNextResponseModel) {
        this.c = (watchNextResponseModel != null);
        final abfw a = this.a;
        if (a instanceof abgk) {
            ((abgk)a).a(watchNextResponseModel);
        }
    }
    
    public final void u(final int n, final int n2, final int n3) {
        this.a.u(n, n2, 1);
    }
    
    public final void v(final abfs abfs) {
        this.a.v(abfs);
    }
    
    public final void w(final abfu abfu) {
        this.a.w(abfu);
    }
    
    public final void x(final abfv abfv) {
        this.a.x(abfv);
    }
    
    public final boolean y(final PlaybackStartDescriptor playbackStartDescriptor) {
        return this.a.y(playbackStartDescriptor);
    }
    
    @Override
    public final int z(final abop abop) {
        final fqq d = this.D(abop);
        if (abop.e == aboo.c && d == null && !this.c) {
            return 3;
        }
        return abop.a(d != null);
    }
}
