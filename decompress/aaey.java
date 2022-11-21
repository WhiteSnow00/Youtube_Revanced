import java.util.concurrent.ScheduledExecutorService;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaey implements abmd, ablw
{
    private final abmb a;
    private final aafa b;
    private final aaff c;
    private final afxk d;
    private final aacd e;
    private final aafz f;
    private final arzb g;
    private final abwe h;
    
    public aaey(final adhw adhw, final aafa b, final arzb g, final aacd e, final abwe h, final aafz f, final aaff c, final afxk d, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = adhw.e(d);
        this.b = b;
        this.c = c;
        this.g = g;
        this.d = d;
        this.e = e;
        this.h = h;
        this.f = f;
    }
    
    private final long l() {
        anhj anhj;
        if ((anhj = this.g.f().j) == null) {
            anhj = anhj.a;
        }
        if ((anhj.b & 0x80000) != 0x0) {
            return anhj.i;
        }
        return 1000L;
    }
    
    private static ListenableFuture m(final ListenableFuture listenableFuture, final int n) {
        return afvh.e(listenableFuture, aewf.a((afax)new fqv(n, 14)), (Executor)afwd.a);
    }
    
    private final ListenableFuture n(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abla abla) {
        return this.a.c(playbackStartDescriptor, s, n, abla);
    }
    
    private final boolean o(final PlaybackStartDescriptor playbackStartDescriptor) {
        final int z = playbackStartDescriptor.z();
        final boolean b = playbackStartDescriptor.s() || z == 5 || (z == 4 && this.h.i());
        final boolean s = playbackStartDescriptor.s();
        return !b && !s;
    }
    
    private final boolean p(final PlaybackStartDescriptor playbackStartDescriptor) {
        if (this.h.i()) {
            anhj anhj;
            if ((anhj = this.g.f().j) == null) {
                anhj = anhj.a;
            }
            if (anhj.h && this.f.b().a(playbackStartDescriptor)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Pair a(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abla abla, final boolean b) {
        if (playbackStartDescriptor.s() && playbackStartDescriptor.s()) {
            return new Pair((Object)this.b.a(playbackStartDescriptor), (Object)this.c.b(playbackStartDescriptor, true));
        }
        if (this.o(playbackStartDescriptor)) {
            final Pair a = this.a.a(playbackStartDescriptor, s, abla, b);
            return Pair.create((Object)this.i(playbackStartDescriptor, s, (ListenableFuture)a.first), (Object)this.j(playbackStartDescriptor, (ListenableFuture)a.second));
        }
        final aefs x = acjq.x(playbackStartDescriptor, abla, this.g, s, (afax)new fmw(this, b, 9), (afax)new zue(this, 13), b, this.d);
        return Pair.create((Object)x.ao(), (Object)x.an().d((afci)new xae(this, playbackStartDescriptor, abla, 6)));
    }
    
    @Override
    public final ListenableFuture b(final String s, final String s2, final PlaybackStartDescriptor playbackStartDescriptor, final abla abla, final boolean b) {
        return acjq.x(playbackStartDescriptor, abla, this.g, s2, (afax)new fmw(this, b, 8), (afax)new ikw(this, playbackStartDescriptor, abla, 9), b, this.d).ao();
    }
    
    @Override
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abla abla) {
        final int z = playbackStartDescriptor.z();
        if (!playbackStartDescriptor.s() && z != 5) {
            if (z == 4) {
                if (this.h.i()) {
                    return this.b.a(playbackStartDescriptor);
                }
            }
            else if (z == 3) {
                return aamn.L(s, m(this.n(playbackStartDescriptor, s, n, abla), 1), m(this.b.b(playbackStartDescriptor), 2), this.l(), afhk.w(dbm.class, NullPointerException.class, aaaw.class, aaaz.class, SQLiteException.class), this.d, this.e, (afbk)oqb.u, 2);
            }
            if (!this.p(playbackStartDescriptor)) {
                return this.n(playbackStartDescriptor, s, n, abla);
            }
            return aamn.L(s, m(this.n(playbackStartDescriptor, s, n, abla), 1), m(this.b.b(playbackStartDescriptor), 2), this.l(), afhk.w(dbm.class, NullPointerException.class, aaaw.class, aaaz.class, SQLiteException.class), this.d, this.e, (afbk)oqb.u, 2);
        }
        return this.b.b(playbackStartDescriptor);
    }
    
    @Override
    public final ListenableFuture d(final PlaybackStartDescriptor playbackStartDescriptor, final abla abla) {
        if (playbackStartDescriptor.s()) {
            return this.c.b(playbackStartDescriptor, true);
        }
        return this.j(playbackStartDescriptor, this.a.d(playbackStartDescriptor, abla));
    }
    
    @Override
    public final ListenableFuture e(final PlaybackStartDescriptor playbackStartDescriptor, final ablf ablf, final xbt xbt) {
        return null;
    }
    
    @Override
    public final ListenableFuture f(final PlaybackStartDescriptor playbackStartDescriptor, final anez anez, final xbt xbt) {
        if (playbackStartDescriptor.s()) {
            return this.b.a(playbackStartDescriptor);
        }
        return this.a.f(playbackStartDescriptor, anez, xbt);
    }
    
    @Override
    public final askp g(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abla abla) {
        if (playbackStartDescriptor.s() && playbackStartDescriptor.s()) {
            return askp.ad(ume.N(this.b.a(playbackStartDescriptor)).J((asmn)zjn.q).k(), ume.N(this.c.b(playbackStartDescriptor, true)).J((asmn)zjn.r).k()).k();
        }
        if (this.o(playbackStartDescriptor)) {
            return this.a.g(playbackStartDescriptor, s, abla).q((askt)new aaew(this, playbackStartDescriptor, s, 0)).k();
        }
        final aefs x = acjq.x(playbackStartDescriptor, abla, this.g, s, (afax)new zue(this, 11), (afax)new zue(this, 12), true, this.d);
        return askp.ad(ume.N(x.ao()).J((asmn)zjn.q).k(), ume.N((ListenableFuture)x.an().d((afci)new xae(this, playbackStartDescriptor, abla, 5))).J((asmn)zjn.r).k()).k();
    }
    
    public final ListenableFuture h(final abmv abmv, final boolean b) {
        final String c = abmv.c;
        final PlaybackStartDescriptor a = abmv.a;
        final abla b2 = abmv.b;
        final int z = a.z();
        if (a.s() || z == 5) {
            return this.b.a(a);
        }
        if (z == 4 && this.h.i()) {
            return this.b.a(a);
        }
        return this.i(a, c, this.a.b(a.k(), c, a, b2, b));
    }
    
    public final ListenableFuture i(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final ListenableFuture listenableFuture) {
        if (playbackStartDescriptor.z() != 3 && !this.p(playbackStartDescriptor)) {
            return listenableFuture;
        }
        return aamn.L(s, m(listenableFuture, 1), m(this.b.a(playbackStartDescriptor), 2), this.l(), afhk.w(dbm.class, NullPointerException.class, aaaw.class, aaaz.class, SQLiteException.class), this.d, this.e, (afbk)oqb.u, 2);
    }
    
    public final ListenableFuture j(final PlaybackStartDescriptor playbackStartDescriptor, final ListenableFuture listenableFuture) {
        Label_0074: {
            if (!playbackStartDescriptor.s()) {
                if (this.h.i()) {
                    amwj amwj;
                    if ((amwj = this.g.f().g) == null) {
                        amwj = amwj.a;
                    }
                    if (amwj.k && this.f.c().a(playbackStartDescriptor)) {
                        break Label_0074;
                    }
                }
                return listenableFuture;
            }
        }
        final ListenableFuture b = this.c.b(playbackStartDescriptor, false);
        amwj amwj2;
        if ((amwj2 = this.g.f().g) == null) {
            amwj2 = amwj.a;
        }
        long n;
        if ((amwj2.b & 0x2000000) != 0x0) {
            n = amwj2.l;
        }
        else {
            n = 1000L;
        }
        return aamn.L(null, listenableFuture, b, n, afhk.u(dbm.class, NullPointerException.class, SQLiteException.class), this.d, this.e, aafv.b, 3);
    }
    
    @Override
    public final void k(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final Executor executor, final abla abla) {
        if (this.o(playbackStartDescriptor)) {
            this.a.k(playbackStartDescriptor, s, executor, abla);
            return;
        }
        this.a.h(playbackStartDescriptor, s, executor, abla);
    }
}
