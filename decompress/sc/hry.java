import java.util.ArrayList;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModelImpl;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hry implements zpf, yfq
{
    private final lkx A;
    private final aujg B;
    public final boolean a;
    public final boolean b;
    public final xam c;
    public final abpu d;
    public final aiqj e;
    public final hrp f;
    public boolean g;
    public final agmc h;
    public final cyb i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private final boolean n;
    private final String o;
    private final long p;
    private final oby q;
    private final Executor r;
    private final hsh s;
    private final afaq t;
    private final vlf u;
    private final zmf v;
    private final long w;
    private yfp x;
    private hry y;
    private final hzn z;
    
    public hry(final long w, final aiqj e, final agmc h, final int j, final int k, final int l, final boolean m, final boolean a, final boolean b, final boolean n, final String o, final long p31, final oby q, final Executor r, final xam c, final abpu d, final hsh s, final hzn z, final afaq t, final aujg b2, final vlf u, final zmf v, final lkx a2, final hrp f, final cyb i, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5, final byte[] array6) {
        boolean b3 = true;
        adkp.H(true);
        if (k < l) {
            b3 = false;
        }
        adkp.H(b3);
        this.w = w;
        this.e = e;
        this.h = h;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.a = a;
        this.b = b;
        this.n = n;
        this.o = o;
        this.p = p31;
        this.q = q;
        this.r = r;
        this.c = c;
        this.d = d;
        this.s = s;
        this.z = z;
        this.t = t;
        this.B = b2;
        this.u = u;
        this.v = v;
        this.A = a2;
        this.f = f;
        this.i = i;
    }
    
    public final void a(final dbj dbj) {
    }
    
    public final void d() {
        this.g = true;
        final yfp x = this.x;
        if (x != null) {
            x.a();
            this.x = null;
        }
        final hry y = this.y;
        if (y != null) {
            y.d();
            this.y = null;
        }
    }
    
    public final void e() {
        this.x = null;
    }
    
    public final void f() {
        this.x = null;
    }
    
    public final void g(final FormatStreamModel formatStreamModel, final long n) {
    }
    
    public final void h() {
    }
    
    public final boolean i() {
        return !this.g;
    }
    
    public final void j() {
        this.x = null;
    }
    
    public final void k() {
    }
    
    public final /* bridge */ void mX(Object o) {
        final agmc agmc = (agmc)o;
        o = agmc.b;
        if (!this.g) {
            final answ answ = (answ)this.t.a();
            final akqn akqn = (akqn)o;
            final int b = akqn.b;
            final ahbc ahbc = null;
            Object o2;
            if ((b & 0x4) != 0x0) {
                akxi akxi;
                if ((akxi = akqn.e) == null) {
                    akxi = akxi.a;
                }
                o2 = new PlayerResponseModelImpl(akxi, this.p, (VideoStreamingData)agmc.c);
            }
            else {
                o2 = null;
            }
            akxi akxi2;
            if ((akxi2 = akqn.e) == null) {
                akxi2 = akxi.a;
            }
            if ((akxi2.c & 0x100) != 0x0) {
                akxi akxi3;
                if ((akxi3 = akqn.e) == null) {
                    akxi3 = akxi.a;
                }
                if (akxi3.m.size() > 0 || answ.s) {
                    final vlf u = this.u;
                    final zme c = this.v.c();
                    akxi akxi4;
                    if ((akxi4 = akqn.e) == null) {
                        akxi4 = akxi.a;
                    }
                    ajvo ajvo;
                    if ((ajvo = akxi4.Q) == null) {
                        ajvo = ajvo.a;
                    }
                    akxi akxi5;
                    if ((akxi5 = akqn.e) == null) {
                        akxi5 = akxi.a;
                    }
                    akli akli;
                    if ((akli = akxi5.d) == null) {
                        akli = akli.a;
                    }
                    u.a(c, ajvo, akli);
                }
            }
            if (this.m && o2 != null) {
                final boolean n = this.n;
                o = this.h.c;
                final Object c2 = agmc.c;
                if (n || (o != null && c2 != null)) {
                    afnd.n((Runnable)new hir(this, (PlayerResponseModel)o2, 9), this.r);
                }
            }
            final int j = this.j;
            if (j == 0 || j == 1) {
                final long d = this.q.d();
                Object o3;
                if (this.j == 0) {
                    o3 = ahbc;
                    if ((akqn.b & 0x8) != 0x0 && (o3 = akqn.f) == null) {
                        o3 = aiqj.a;
                    }
                }
                else {
                    o3 = ahbc;
                    if ((akqn.b & 0x10) != 0x0 && (o3 = akqn.g) == null) {
                        o3 = aiqj.a;
                    }
                }
                if (o3 != null) {
                    final int k = this.k;
                    if (k > 1) {
                        final long w = this.w;
                        final int i = this.j;
                        int l = this.l;
                        if (l > 0) {
                            --l;
                        }
                        else {
                            l = 0;
                        }
                        this.y = new hry(w, (aiqj)o3, agmc, i, k - 1, l, false, false, this.b, this.n, this.o, d, this.q, this.r, this.c, this.d, this.s, this.z, this.t, this.B, this.u, this.v, this.A, this.f, this.i, null, null, null, null, null, null);
                        final ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint)((ahbc)o3).rx((ahaq)ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                        this.s.c((aiqj)o3, this.o, true, hrz.g(answ, reelWatchEndpointOuterClass$ReelWatchEndpoint.e, this.i, hko.A(reelWatchEndpointOuterClass$ReelWatchEndpoint)), false, (zpf)this.y);
                    }
                }
            }
            if (this.l > 0 && o2 != null && (answ == null || !answ.L)) {
                aohv aohv;
                if ((aohv = ((PlayerResponseModel)o2).m().c.q) == null) {
                    aohv = aohv.a;
                }
                this.x = this.B.aA((PlayerResponseModel)o2, aohv.b, 2000L, (yfq)this);
            }
            final long w2 = this.w;
            final int m = this.j;
            long n3 = 0L;
            Label_0762: {
                long n2;
                if (m == 2) {
                    n2 = 1L;
                }
                else {
                    n3 = w2;
                    if (m != 3) {
                        break Label_0762;
                    }
                    n2 = -1L;
                }
                n3 = w2 + n2;
            }
            final hzn z = this.z;
            final aiqj e = this.e;
            final ArrayList l2 = z.l();
            for (int size = l2.size(), n4 = 0; n4 < size; ++n4) {
                ((hsa)l2.get(n4)).bl(n3, e, akqn, m);
            }
        }
    }
    
    public final void mY() {
    }
}
