import android.os.Looper;
import java.util.List;
import java.util.Iterator;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.util.Map;
import android.util.SparseArray;
import android.os.Handler;
import java.io.IOException;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class biv extends bms
{
    private final brp A;
    private bbl B;
    private bco C;
    private ayp D;
    private final Uri E;
    private long F;
    private final des G;
    private final bhv H;
    private final pvh I;
    public final bri a;
    public final bnz b;
    public final Object c;
    public final Runnable d;
    public bro e;
    public IOException f;
    public Handler g;
    public Uri h;
    public bjh i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public long n;
    public int o;
    private final ayu s;
    private final bbk t;
    private final bks u;
    private final long v;
    private final brq w;
    private final bir x;
    private final SparseArray y;
    private final Runnable z;
    
    static {
        ayv.a("media3.exoplayer.dash");
    }
    
    public biv(final ayu s, final bbk t, final brq w, final bhv h, final bks u, final bri a, final long v, final byte[] array, final byte[] array2, final byte[] array3) {
        this.s = s;
        this.D = s.c;
        final ayq b = s.b;
        dk.d((Object)b);
        this.h = b.a;
        this.E = s.b.a;
        this.i = null;
        this.t = t;
        this.w = w;
        this.H = h;
        this.u = u;
        this.a = a;
        this.v = v;
        this.G = new des(null);
        this.b = this.C((ayy)null);
        this.c = new Object();
        this.y = new SparseArray();
        this.I = new pvh(this);
        this.n = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.x = new bir(this);
        this.A = (brp)new bis(this);
        this.z = (Runnable)new aus(this, 7);
        this.d = (Runnable)new aus(this, 8);
    }
    
    private static boolean G(final adhi adhi) {
        for (int i = 0; i < ((List)adhi.d).size(); ++i) {
            final int b = ((List<bjf>)adhi.d).get(i).b;
            if (b == 1 || b == 2) {
                return true;
            }
        }
        return false;
    }
    
    private final void o(final brr brr, final brj brj, final int n) {
        this.e.h((brl)brr, brj, n);
        this.b.n(new bno(brr.a, brr.b), brr.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
    
    public final void b() {
        final bro e = this.e;
        final pvh pvh = new pvh(this);
        if (brw.b()) {
            pvh.Z();
            return;
        }
        bro bro;
        if ((bro = e) == null) {
            bro = new bro("SntpClient");
        }
        bro.h((brl)new brv(), (brj)new bru(pvh, null, null, null, null, null), 1);
    }
    
    public final void d(final IOException ex) {
        bap.b("DashMediaSource", "Failed to resolve time offset.", (Throwable)ex);
        this.g(true);
    }
    
    public final void e(final long f) {
        this.F = f;
        this.g(true);
    }
    
    public final void g(final boolean b) {
        for (int i = 0; i < this.y.size(); ++i) {
            final int key = this.y.keyAt(i);
            if (key >= this.o) {
                final bio bio = (bio)this.y.valueAt(i);
                final bjh j = this.i;
                final int g = key - this.o;
                bio.f = j;
                bio.g = g;
                final bje b2 = bio.b;
                b2.f = false;
                b2.d = j;
                final Iterator iterator = b2.c.entrySet().iterator();
                while (iterator.hasNext()) {
                    if (((Map.Entry<Long, V>)iterator.next()).getKey() < b2.d.h) {
                        iterator.remove();
                    }
                }
                final bpq[] d = bio.d;
                if (d != null) {
                    for (int k = 0; k < d.length; ++k) {
                        ((bim)d[k].e).a(j, g);
                    }
                    bio.c.b((boy)bio);
                }
                bio.h = (List)j.d(g).b;
                for (final bjb bjb : bio.e) {
                    for (final des des : bio.h) {
                        if (des.a().equals(bjb.a.a())) {
                            final int a = j.a();
                            bjb.f(des, j.d && g == a - 1);
                            break;
                        }
                    }
                }
            }
        }
        final adhi d2 = this.i.d(0);
        final int n = this.i.a() - 1;
        final adhi d3 = this.i.d(n);
        final long c = this.i.c(n);
        final long w = bax.w(bax.t(this.F));
        final long c2 = this.i.c(0);
        final long w2 = bax.w(d2.a);
        final boolean g2 = G(d2);
        long max = w2;
        for (int n2 = 0; n2 < ((List)d2.d).size(); ++n2) {
            final bjf bjf = ((List<bjf>)d2.d).get(n2);
            final List c3 = bjf.c;
            if ((g2 || bjf.b != 3) && !c3.isEmpty()) {
                final biw m = c3.get(0).k();
                if (m != null) {
                    if (m.a(c2, w) != 0L) {
                        max = Math.max(max, m.h(m.c(c2, w)) + w2);
                        continue;
                    }
                }
                max = w2;
                break;
            }
        }
        final long w3 = bax.w(d3.a);
        final boolean g3 = G(d3);
        final long n3 = Long.MAX_VALUE;
        int n4 = 0;
        final long n5 = c;
        long min = n3;
        final long n6 = w;
        while (n4 < ((List)d3.d).size()) {
            final bjf bjf2 = ((List<bjf>)d3.d).get(n4);
            final List c4 = bjf2.c;
            Label_0828: {
                if ((g3 || bjf2.b != 3) && !c4.isEmpty()) {
                    final biw k2 = c4.get(0).k();
                    if (k2 == null) {
                        min = w3 + n5;
                    }
                    else {
                        final long a2 = k2.a(n5, n6);
                        if (a2 != 0L) {
                            final long n7 = k2.c(n5, n6) + a2 - 1L;
                            min = Math.min(min, w3 + k2.h(n7) + k2.b(n7, n5));
                            break Label_0828;
                        }
                        min = w3;
                    }
                    break;
                }
            }
            ++n4;
        }
        boolean b3 = false;
        Label_0927: {
            Label_0924: {
                if (this.i.d) {
                    for (int n8 = 0; n8 < ((List)d3.d).size(); ++n8) {
                        final biw k3 = ((List<bjf>)d3.d).get(n8).c.get(0).k();
                        if (k3 == null) {
                            break Label_0924;
                        }
                        if (k3.j()) {
                            break Label_0924;
                        }
                    }
                    b3 = true;
                    break Label_0927;
                }
            }
            b3 = false;
        }
        long max2 = max;
        if (b3) {
            final long f = this.i.f;
            max2 = max;
            if (f != -9223372036854775807L) {
                max2 = Math.max(max, min - bax.w(f));
            }
        }
        final long n9 = min - max2;
        final bjh i2 = this.i;
        long n15;
        long n16;
        if (i2.d) {
            dk.h(i2.a != -9223372036854775807L);
            final bjh i3 = this.i;
            final long n10 = n6 - bax.w(i3.a) - max2;
            final long c5 = this.s.c.c;
            final long a3 = bax.A(n10);
            long n11 = 0L;
            Label_1126: {
                if (c5 != -9223372036854775807L) {
                    n11 = Math.min(a3, c5);
                }
                else {
                    final bjw j2 = i3.j;
                    if (j2 != null) {
                        final long c6 = j2.c;
                        if (c6 != -9223372036854775807L) {
                            n11 = Math.min(a3, c6);
                            break Label_1126;
                        }
                    }
                    n11 = a3;
                }
            }
            long a4;
            final long n12 = a4 = bax.A(n10 - n9);
            if (n12 < 0L) {
                a4 = n12;
                if (n11 > 0L) {
                    a4 = 0L;
                }
            }
            final long c7 = this.i.c;
            long min2;
            if (c7 != -9223372036854775807L) {
                min2 = Math.min(a4 + c7, a3);
            }
            else {
                min2 = a4;
            }
            final long b4 = this.s.c.b;
            long b5;
            if (b4 != -9223372036854775807L) {
                b5 = bax.r(b4, min2, a3);
            }
            else {
                final bjw j3 = this.i.j;
                b5 = min2;
                if (j3 != null) {
                    final long b6 = j3.b;
                    b5 = min2;
                    if (b6 != -9223372036854775807L) {
                        b5 = bax.r(b6, min2, a3);
                    }
                }
            }
            long c8 = n11;
            if (b5 > n11) {
                c8 = b5;
            }
            long n13;
            if ((n13 = this.D.a) == -9223372036854775807L) {
                final bjh i4 = this.i;
                final bjw j4 = i4.j;
                if ((j4 == null || (n13 = j4.a) == -9223372036854775807L) && (n13 = i4.g) == -9223372036854775807L) {
                    n13 = this.v;
                }
            }
            long n14 = n13;
            if (n13 < b5) {
                n14 = b5;
            }
            long r = n14;
            if (n14 > c8) {
                r = bax.r(bax.A(n10 - Math.min(5000000L, n9 / 2L)), b5, c8);
            }
            final ayp c9 = this.s.c;
            float d4 = c9.d;
            if (d4 == -3.4028235E38f) {
                final bjw j5 = this.i.j;
                if (j5 != null) {
                    d4 = j5.d;
                }
                else {
                    d4 = -3.4028235E38f;
                }
            }
            float e2;
            if ((e2 = c9.e) == -3.4028235E38f) {
                final bjw j6 = this.i.j;
                if (j6 != null) {
                    e2 = j6.e;
                }
                else {
                    e2 = -3.4028235E38f;
                }
            }
            if (d4 == -3.4028235E38f && e2 == -3.4028235E38f) {
                final bjw j7 = this.i.j;
                if (j7 == null || j7.a == -9223372036854775807L) {
                    d4 = 1.0f;
                    e2 = 1.0f;
                }
            }
            final ayo ayo = new ayo();
            ayo.a = r;
            ayo.b = b5;
            ayo.c = c8;
            ayo.d = d4;
            ayo.e = e2;
            this.D = ayo.a();
            n15 = this.i.a + bax.A(max2);
            n16 = n10 - bax.w(this.D.a);
            final long min3 = Math.min(5000000L, n9 / 2L);
            if (n16 < min3) {
                n16 = min3;
            }
        }
        else {
            n15 = -9223372036854775807L;
            n16 = 0L;
        }
        final long w4 = bax.w(d2.a);
        final bjh i5 = this.i;
        final long a5 = i5.a;
        final long f2 = this.F;
        final int o = this.o;
        final ayu s = this.s;
        ayp d5;
        if (i5.d) {
            d5 = this.D;
        }
        else {
            d5 = null;
        }
        this.y((azm)new bip(a5, n15, f2, o, max2 - w4, n9, n16, i5, s, d5));
        this.g.removeCallbacks(this.d);
        if (b3) {
            final Handler g4 = this.g;
            final Runnable d6 = this.d;
            final bjh i6 = this.i;
            final long t = bax.t(this.F);
            final int n17 = i6.a() - 1;
            final adhi d7 = i6.d(n17);
            final long w5 = bax.w(d7.a);
            final long c10 = i6.c(n17);
            final long w6 = bax.w(t);
            final long w7 = bax.w(i6.a);
            long w8 = bax.w(5000L);
            long n19;
            for (int n18 = 0; n18 < ((List)d7.d).size(); ++n18, w8 = n19) {
                final List c11 = ((List<bjf>)d7.d).get(n18).c;
                if (!c11.isEmpty()) {
                    final biw k4 = c11.get(0).k();
                    n19 = w8;
                    if (k4 != null) {
                        final long n20 = w7 + w5 + k4.e(c10, w6) - w6;
                        if (n20 >= w8 - 100000L) {
                            n19 = w8;
                            if (n20 <= w8) {
                                continue;
                            }
                            n19 = w8;
                            if (n20 >= w8 + 100000L) {
                                continue;
                            }
                        }
                        n19 = n20;
                    }
                }
                else {
                    n19 = w8;
                }
            }
            g4.postDelayed(d6, aeuz.y(w8, 1000L, RoundingMode.CEILING));
        }
        if (this.j) {
            this.l();
            return;
        }
        if (b) {
            final bjh i7 = this.i;
            if (i7.d) {
                final long e3 = i7.e;
                if (e3 != -9223372036854775807L) {
                    long n21 = e3;
                    if (e3 == 0L) {
                        n21 = 5000L;
                    }
                    this.k(Math.max(0L, this.k + n21 - SystemClock.elapsedRealtime()));
                }
            }
        }
    }
    
    public final void j(final bjy bjy, final brq brq) {
        this.o(new brr(this.B, Uri.parse(bjy.b), 5, brq), (brj)new bit(this), 1);
    }
    
    public final void k(final long n) {
        this.g.postDelayed(this.z, n);
    }
    
    public final void l() {
        this.g.removeCallbacks(this.z);
        if (this.e.f()) {
            return;
        }
        if (this.e.g()) {
            this.j = true;
            return;
        }
        synchronized (this.c) {
            final Uri h = this.h;
            monitorexit(this.c);
            this.j = false;
            this.o(new brr(this.B, h, 4, this.w), (brj)this.x, this.a.a(4));
        }
    }
    
    final void n(final brr brr) {
        final long a = brr.a;
        final bbp b = brr.b;
        brr.d();
        final bno bno = new bno(a, b, brr.c());
        final long a2 = brr.a;
        this.b.f(bno, brr.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
    
    public final ayu sP() {
        return this.s;
    }
    
    public final void sQ() {
        this.A.a();
    }
    
    protected final void sR(final bco c) {
        this.C = c;
        this.u.c();
        this.u.e(Looper.myLooper(), this.q());
        this.B = this.t.a();
        this.e = new bro("DashMediaSource");
        this.g = bax.E();
        this.l();
    }
    
    public final void sS(final bnv bnv) {
        final bio bio = (bio)bnv;
        final bje b = bio.b;
        b.g = true;
        b.b.removeCallbacksAndMessages((Object)null);
        final bpq[] d = bio.d;
        for (int length = d.length, i = 0; i < length; ++i) {
            d[i].i((bpp)bio);
        }
        bio.c = null;
        this.y.remove(bio.a);
    }
    
    protected final void sT() {
        this.j = false;
        this.B = null;
        final bro e = this.e;
        if (e != null) {
            e.e((brm)null);
            this.e = null;
        }
        this.k = 0L;
        this.l = 0L;
        this.i = null;
        this.h = this.E;
        this.f = null;
        final Handler g = this.g;
        if (g != null) {
            g.removeCallbacksAndMessages((Object)null);
            this.g = null;
        }
        this.F = -9223372036854775807L;
        this.m = 0;
        this.n = -9223372036854775807L;
        this.o = 0;
        this.y.clear();
        final des g2 = this.G;
        ((Map)g2.c).clear();
        ((Map)g2.b).clear();
        ((Map)g2.a).clear();
        this.u.d();
    }
    
    public final bnv sU(final ayy ayy, final brf brf, long f) {
        final int n = (int)ayy.a - this.o;
        final bnz d = this.D(ayy, this.i.d(n).a);
        final ttl f2 = this.F(ayy);
        final int o = this.o;
        final bjh i = this.i;
        final des g = this.G;
        final bhv h = this.H;
        final bco c = this.C;
        final bks u = this.u;
        final bri a = this.a;
        f = this.F;
        final brp a2 = this.A;
        final pvh j = this.I;
        this.q();
        final bio bio = new bio(n + o, i, g, n, h, c, u, f2, a, d, f, a2, brf, j, null, null, null, null, null, null, null, null);
        this.y.put(bio.a, (Object)bio);
        return (bnv)bio;
    }
}
