import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import android.os.Looper;
import java.util.ArrayList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hrx implements zpf
{
    public final String a;
    public final long b;
    public final oby c;
    public final Executor d;
    public final xam e;
    public final abpu f;
    public final Map g;
    public final hrp h;
    public boolean i;
    public acc j;
    public volatile asjl k;
    public final hzn l;
    public final cyb m;
    @Deprecated
    private final afaq n;
    private final guv o;
    private final hsh p;
    private final Executor q;
    private final vlf r;
    private final zmf s;
    private final ListenableFuture t;
    private final abfc u;
    private final lkx v;
    private final aujg w;
    
    public hrx(final String a, final long b, final hzn l, final afaq n, final oby c, final guv o, final hsh p25, final Executor d, final Executor q, final xam e, final abpu f, final aujg w, final vlf r, final zmf s, final Map g, final lkx v, final abfc u, final hrp h, final cyb m, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        this.j = null;
        this.a = a;
        this.b = b;
        this.l = l;
        this.n = n;
        this.c = c;
        this.o = o;
        this.p = p25;
        this.d = d;
        this.q = q;
        this.e = e;
        this.f = f;
        this.w = w;
        this.r = r;
        this.s = s;
        this.g = g;
        this.v = v;
        this.u = u;
        this.m = m;
        this.h = h;
        this.t = sl.c((ace)new xp(this, 5));
    }
    
    public final void a(final dbj dbj) {
        if (this.i) {
            return;
        }
        final hzn l = this.l;
        final String a = this.a;
        final ArrayList i = l.l();
        for (int size = i.size(), j = 0; j < size; ++j) {
            ((hsa)i.get(j)).bI(a);
        }
    }
    
    final void d(long n, final aiqj aiqj, final agmc agmc, int c, final int n2, final int n3, final boolean b, final boolean b2, final boolean b3, final long n4) {
        if (Looper.getMainLooper().getThread().equals(Thread.currentThread())) {
            this.q.execute(aeun.h((Runnable)new hrr(this, n, aiqj, agmc, c, n2, n3, b, b2, b3, n4, null, null, null)));
            return;
        }
        final boolean b4 = b && !hko.t(aiqj);
        final answ answ = (answ)this.n.a();
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        final boolean a = hko.A(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint.e.isEmpty()) {
            this.f(n, aiqj, agmc, c, n2, n3, b4, b2, b3, n4);
            return;
        }
        if (!this.m.o(a)) {
            this.f(n, aiqj, agmc, c, n2, n3, b4, b2, b3, n4);
        }
        final xam e = this.e;
        almx almx;
        if (n3 != 0) {
            almx = almx.o;
        }
        else {
            almx = almx.n;
        }
        final xan c2 = e.c(almx);
        final hrw hrw = new hrw(this, a, n, aiqj, agmc, c, n2, n3, b4, b2, b3, n4, answ, reelWatchEndpointOuterClass$ReelWatchEndpoint, null, null, null);
        final abfc u = this.u;
        final PlaybackStartDescriptor f = hrz.f(agmc, aiqj);
        if (c != 0 && c != 2) {
            c = 12;
        }
        else {
            c = 11;
        }
        final abjw a2 = abjx.a();
        a2.c = c;
        final abjx a3 = a2.a();
        if (1 != n3) {
            n = 0L;
        }
        else {
            n = 2000L;
        }
        this.k = u.a(f, a3, (abfb)hrw, n, (zdj)null, c2);
    }
    
    public final void e(final agmc agmc) {
        if (this.i) {
            return;
        }
        final Object b = agmc.b;
        final answ answ = (answ)this.n.a();
        final int n = 0;
        final boolean b2 = answ != null && answ.h;
        int c;
        boolean g;
        boolean l;
        int n2;
        int n3;
        if (answ != null) {
            c = answ.c;
            final int d = answ.d;
            int ch;
            if ((ch = aqsx.ch(answ.e)) == 0) {
                ch = 1;
            }
            g = answ.g;
            l = answ.l;
            n2 = ch;
            n3 = d;
        }
        else {
            n2 = 4;
            g = false;
            n3 = 5;
            l = false;
            c = 3;
        }
        int n4;
        if (--n2 != 2 && n2 != 3) {
            n4 = 0;
        }
        else {
            n4 = 1;
        }
        final long d2 = this.c.d();
        if (n3 > 0) {
            final akqn akqn = (akqn)b;
            if ((akqn.b & 0x8) != 0x0) {
                final long b3 = this.b;
                aiqj aiqj;
                if ((aiqj = akqn.f) == null) {
                    aiqj = aiqj.a;
                }
                boolean b4 = false;
                Label_0257: {
                    if (g) {
                        ansi ansi;
                        if ((ansi = ansi.b(akqn.j)) == null) {
                            ansi = ansi.a;
                        }
                        if (ansi != ansi.c) {
                            b4 = true;
                            break Label_0257;
                        }
                    }
                    b4 = false;
                }
                this.g(b3, aiqj, agmc, 0, n3, n4, b4, false, b2, d2);
            }
        }
        if (c > 0) {
            final akqn akqn2 = (akqn)b;
            if ((akqn2.b & 0x10) != 0x0) {
                final long b5 = this.b;
                aiqj aiqj2;
                if ((aiqj2 = akqn2.g) == null) {
                    aiqj2 = aiqj.a;
                }
                this.g(b5, aiqj2, agmc, 1, c, 0, false, false, b2, d2);
            }
        }
        int n5 = n;
        if ((((akqn)b).b & 0x8) != 0x0) {
            n5 = 1;
        }
        final int n6 = n5 ^ 0x1;
        hrz.c(this.o, this.b, 2, (afva)new hru(this, agmc, n6 & n4, (boolean)((n6 & (l ? 1 : 0)) != 0x0), b2, null, null, null));
        hrz.c(this.o, this.b, 3, (afva)new pgd(this, agmc, b2, 1, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void f(final long n, final aiqj aiqj, final agmc agmc, final int n2, final int n3, final int n4, final boolean b, final boolean b2, final boolean b3, final long n5) {
        final answ answ = (answ)this.n.a();
        final hry hry = new hry(n, aiqj, agmc, n2, n3, n4, b, b2, b3, answ != null && answ.p, this.a, n5, this.c, this.d, this.e, this.f, this.p, this.l, this.n, this.w, this.r, this.s, this.v, this.h, this.m, null, null, null, null, null, null);
        this.g.put(n2, hry);
        final answ answ2 = (answ)this.n.a();
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)aiqj).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        this.p.c(aiqj, this.a, true, hrz.g(answ2, reelWatchEndpointOuterClass$ReelWatchEndpoint.e, this.m, hko.A(reelWatchEndpointOuterClass$ReelWatchEndpoint)), false, (zpf)hry);
    }
    
    public final void g(final long n, final aiqj a, final agmc agmc, final int n2, final int n3, final int n4, final boolean b, final boolean b2, final boolean b3, final long n5) {
        if (((vai)this.m.a).f(45376866L)) {
            this.d(n, a, agmc, n2, n3, n4, b, b2, b3, n5);
            return;
        }
        final answ answ = (answ)this.n.a();
        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)a).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        final boolean a2 = hko.A(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        final boolean b4 = b && !hko.t(a);
        if (!this.m.o(a2) || reelWatchEndpointOuterClass$ReelWatchEndpoint.e.isEmpty()) {
            this.f(n, a, agmc, n2, n3, n4, b4, b2, b3, n5);
        }
        if (!reelWatchEndpointOuterClass$ReelWatchEndpoint.e.isEmpty()) {
            if (b4 && hrz.h(answ, this.m, a2)) {
                afnd.n((Runnable)new hrs(this, agmc, a, reelWatchEndpointOuterClass$ReelWatchEndpoint, b3, b2, answ, a2, n2, n, n3, n4, n5, null, null, null), this.d);
                return;
            }
            final cyb m = this.m;
            if (answ != null && answ.G && m.n(a2)) {
                final abjp d = PlaybackStartDescriptor.d();
                d.a = a;
                d.g = true;
                final PlaybackStartDescriptor a3 = d.a();
                final lkx v = this.v;
                final String a4 = this.a;
                final ancs a5 = ancs.a;
                xan xan;
                if (((cyb)v.d).m()) {
                    final aiqj b5 = a3.b;
                    ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2;
                    if (b5 != null) {
                        reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)b5).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    }
                    else {
                        reelWatchEndpointOuterClass$ReelWatchEndpoint2 = null;
                    }
                    xan = ((hrp)v.c).a(reelWatchEndpointOuterClass$ReelWatchEndpoint2);
                }
                else {
                    xan = ((hrp)v.c).b(a4);
                }
                a3.g = true;
                teu.i(v.l(a3, a5, xan), (tet)new hrt(this, a, n2, a2, n, agmc, n3, n4, b4, b2, b3, n5, null, null, null));
            }
        }
    }
    
    public final /* bridge */ void mX(Object b) {
        final agmc agmc = (agmc)b;
        if (!this.i) {
            b = agmc.b;
            final answ answ = (answ)this.n.a();
            final akqn akqn = (akqn)b;
            if ((akqn.b & 0x4) != 0x0) {
                akxi akxi;
                if ((akxi = akqn.e) == null) {
                    akxi = akxi.a;
                }
                if ((akxi.c & 0x100) != 0x0) {
                    akxi akxi2;
                    if ((akxi2 = akqn.e) == null) {
                        akxi2 = akxi.a;
                    }
                    if (akxi2.m.size() > 0 || (answ != null && answ.s)) {
                        final vlf r = this.r;
                        final zme c = this.s.c();
                        akxi akxi3;
                        if ((akxi3 = akqn.e) == null) {
                            akxi3 = akxi.a;
                        }
                        ajvo ajvo;
                        if ((ajvo = akxi3.Q) == null) {
                            ajvo = ajvo.a;
                        }
                        akxi akxi4;
                        if ((akxi4 = akqn.e) == null) {
                            akxi4 = akxi.a;
                        }
                        akli akli;
                        if ((akli = akxi4.d) == null) {
                            akli = akli.a;
                        }
                        r.a(c, ajvo, akli);
                    }
                }
            }
            final hzn l = this.l;
            final long b2 = this.b;
            final boolean a = agmc.a;
            final ArrayList i = l.l();
            for (int size = i.size(), j = 0; j < size; ++j) {
                ((hsa)i.get(j)).bj(b2, akqn, a);
            }
            if (answ != null && answ.M) {
                teu.q(this.t, this.q, (tet)new exe(this, agmc, 16, (byte[])null, (byte[])null, (byte[])null));
                return;
            }
            this.e(agmc);
        }
    }
    
    public final void mY() {
    }
}
