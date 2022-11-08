import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aabf implements abjc, abix
{
    private final abja a;
    private final aabh b;
    private final aabm c;
    private final afts d;
    private final zym e;
    private final aacf f;
    private final aamd g;
    private final arud h;
    
    public aabf(final adeh adeh, final aabh b, final arud h, final zym e, final aamd g, final aacf f, final aabm c, final afts d, final byte[] array, final byte[] array2, final byte[] array3) {
        this.a = adeh.f((Executor)d);
        this.b = b;
        this.c = c;
        this.h = h;
        this.d = d;
        this.e = e;
        this.g = g;
        this.f = f;
    }
    
    private final long i() {
        ancy ancy;
        if ((ancy = this.h.f().j) == null) {
            ancy = ancy.a;
        }
        if ((ancy.b & 0x80000) != 0x0) {
            return ancy.i;
        }
        return 1000L;
    }
    
    private static ListenableFuture j(final ListenableFuture listenableFuture, final int n) {
        return afrp.e(listenableFuture, aesm.a((aexg)new fqk(n, 14)), (Executor)afsl.a);
    }
    
    private final ListenableFuture k(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abib abib) {
        return this.a.c(playbackStartDescriptor, s, n, abib);
    }
    
    private final ListenableFuture l(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final ListenableFuture listenableFuture) {
        if (playbackStartDescriptor.z() != 3 && !this.o(playbackStartDescriptor)) {
            return listenableFuture;
        }
        return aaiw.L(s, j(listenableFuture, 1), j(this.b.a(playbackStartDescriptor), 2), this.i(), afdu.w((Object)dbi.class, (Object)NullPointerException.class, (Object)zxd.class, (Object)zxg.class, (Object)SQLiteException.class), (ScheduledExecutorService)this.d, this.e, (aext)oof.u, 2);
    }
    
    private final ListenableFuture m(final PlaybackStartDescriptor playbackStartDescriptor, final ListenableFuture listenableFuture) {
        Label_0071: {
            if (!playbackStartDescriptor.s()) {
                if (this.g.c()) {
                    amrz amrz;
                    if ((amrz = this.h.f().g) == null) {
                        amrz = amrz.a;
                    }
                    if (amrz.k && this.f.c().a(playbackStartDescriptor)) {
                        break Label_0071;
                    }
                }
                return listenableFuture;
            }
        }
        final ListenableFuture b = this.c.b(playbackStartDescriptor, false);
        amrz amrz2;
        if ((amrz2 = this.h.f().g) == null) {
            amrz2 = amrz.a;
        }
        long n;
        if ((amrz2.b & 0x2000000) != 0x0) {
            n = amrz2.l;
        }
        else {
            n = 1000L;
        }
        return aaiw.L((String)null, listenableFuture, b, n, afdu.u((Object)dbi.class, (Object)NullPointerException.class, (Object)SQLiteException.class), (ScheduledExecutorService)this.d, this.e, (aext)aacc.b, 3);
    }
    
    private final boolean n(final PlaybackStartDescriptor playbackStartDescriptor) {
        final int z = playbackStartDescriptor.z();
        final boolean b = playbackStartDescriptor.s() || z == 5 || (z == 4 && this.g.c());
        final boolean s = playbackStartDescriptor.s();
        return !b && !s;
    }
    
    private final boolean o(final PlaybackStartDescriptor playbackStartDescriptor) {
        if (this.g.c()) {
            ancy ancy;
            if ((ancy = this.h.f().j) == null) {
                ancy = ancy.a;
            }
            if (ancy.h && this.f.b().a(playbackStartDescriptor)) {
                return true;
            }
        }
        return false;
    }
    
    public final Pair a(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final abib abib, final boolean b) {
        if (playbackStartDescriptor.s() && playbackStartDescriptor.s()) {
            return new Pair((Object)this.b.a(playbackStartDescriptor), (Object)this.c.b(playbackStartDescriptor, true));
        }
        if (this.n(playbackStartDescriptor)) {
            final Pair a = this.a.a(playbackStartDescriptor, s, abib, b);
            return Pair.create((Object)this.l(playbackStartDescriptor, s, (ListenableFuture)a.first), (Object)this.m(playbackStartDescriptor, (ListenableFuture)a.second));
        }
        final aeby j = abpn.j(playbackStartDescriptor, abib, this.h, s, (aexg)new fmn(this, b, 9), (aexg)new zqp(this, 11), b, (Executor)this.d);
        return Pair.create((Object)j.ay(), (Object)j.ax().d((aeyr)new wwy(this, playbackStartDescriptor, abib, 5)));
    }
    
    public final ListenableFuture b(final String s, final String s2, final PlaybackStartDescriptor playbackStartDescriptor, final abib abib, final boolean b) {
        return abpn.j(playbackStartDescriptor, abib, this.h, s2, (aexg)new fmn(this, b, 8), (aexg)new ijr(this, playbackStartDescriptor, abib, 9), b, (Executor)this.d).ay();
    }
    
    public final ListenableFuture c(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final int n, final abib abib) {
        final int z = playbackStartDescriptor.z();
        if (!playbackStartDescriptor.s() && z != 5) {
            if (z == 4) {
                if (this.g.c()) {
                    return this.b.a(playbackStartDescriptor);
                }
            }
            else if (z == 3) {
                return aaiw.L(s, j(this.k(playbackStartDescriptor, s, n, abib), 1), j(this.b.b(playbackStartDescriptor), 2), this.i(), afdu.w((Object)dbi.class, (Object)NullPointerException.class, (Object)zxd.class, (Object)zxg.class, (Object)SQLiteException.class), (ScheduledExecutorService)this.d, this.e, (aext)oof.u, 2);
            }
            if (!this.o(playbackStartDescriptor)) {
                return this.k(playbackStartDescriptor, s, n, abib);
            }
            return aaiw.L(s, j(this.k(playbackStartDescriptor, s, n, abib), 1), j(this.b.b(playbackStartDescriptor), 2), this.i(), afdu.w((Object)dbi.class, (Object)NullPointerException.class, (Object)zxd.class, (Object)zxg.class, (Object)SQLiteException.class), (ScheduledExecutorService)this.d, this.e, (aext)oof.u, 2);
        }
        return this.b.b(playbackStartDescriptor);
    }
    
    public final ListenableFuture d(final PlaybackStartDescriptor playbackStartDescriptor, final abib abib) {
        if (playbackStartDescriptor.s()) {
            return this.c.b(playbackStartDescriptor, true);
        }
        return this.m(playbackStartDescriptor, this.a.d(playbackStartDescriptor, abib));
    }
    
    public final ListenableFuture e(final PlaybackStartDescriptor playbackStartDescriptor, final abig abig, final wyn wyn) {
        return null;
    }
    
    public final ListenableFuture f(final PlaybackStartDescriptor playbackStartDescriptor, final anao anao, final wyn wyn) {
        if (playbackStartDescriptor.s()) {
            return this.b.a(playbackStartDescriptor);
        }
        return this.a.f(playbackStartDescriptor, anao, wyn);
    }
    
    public final ListenableFuture g(final abjq abjq, final boolean b) {
        final String c = abjq.c;
        final PlaybackStartDescriptor a = abjq.a;
        final abib b2 = abjq.b;
        final int z = a.z();
        if (a.s() || z == 5) {
            return this.b.a(a);
        }
        if (z == 4 && this.g.c()) {
            return this.b.a(a);
        }
        return this.l(a, c, this.a.b(a.k(), c, a, b2, b));
    }
    
    public final void h(final PlaybackStartDescriptor playbackStartDescriptor, final String s, final Executor executor, final abib abib) {
        if (this.n(playbackStartDescriptor)) {
            this.a.h(playbackStartDescriptor, s, executor, abib);
            return;
        }
        this.a.g(playbackStartDescriptor, s, executor, abib);
    }
}
