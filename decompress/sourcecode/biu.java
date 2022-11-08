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

public final class biu extends bmr
{
    private final bro A;
    private bbk B;
    private bcn C;
    private ayo D;
    private final Uri E;
    private long F;
    private final der G;
    private final bhu H;
    private final qpt I;
    public final brh a;
    public final bny b;
    public final Object c;
    public final Runnable d;
    public brn e;
    public IOException f;
    public Handler g;
    public Uri h;
    public bjg i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public long n;
    public int o;
    private final ayt s;
    private final bbj t;
    private final bkr u;
    private final long v;
    private final brp w;
    private final biq x;
    private final SparseArray y;
    private final Runnable z;
    
    static {
        ayu.a("media3.exoplayer.dash");
    }
    
    public biu(final ayt s, final bbj t, final brp w, final bhu h, final bkr u, final brh a, final long v, final byte[] array, final byte[] array2, final byte[] array3) {
        this.s = s;
        this.D = s.c;
        final ayp b = s.b;
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
        this.G = new der((byte[])null);
        this.b = this.C((ayx)null);
        this.c = new Object();
        this.y = new SparseArray();
        this.I = new qpt(this);
        this.n = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.x = new biq(this);
        this.A = (bro)new bir(this);
        this.z = (Runnable)new aur(this, 7);
        this.d = (Runnable)new aur(this, 8);
    }
    
    private static boolean G(final adff adff) {
        for (int i = 0; i < ((List)adff.d).size(); ++i) {
            final int b = ((List<bje>)adff.d).get(i).b;
            if (b == 1 || b == 2) {
                return true;
            }
        }
        return false;
    }
    
    private final void o(final brq brq, final bri bri, final int n) {
        this.e.h((brk)brq, bri, n);
        this.b.n(new bnn(brq.a, brq.b), brq.c, -1, (ayf)null, 0, (Object)null, -9223372036854775807L, -9223372036854775807L);
    }
    
    public final void b() {
        final brn e = this.e;
        final qpt qpt = new qpt(this);
        if (brv.b()) {
            qpt.Z();
            return;
        }
        brn brn;
        if ((brn = e) == null) {
            brn = new brn("SntpClient");
        }
        brn.h((brk)new bru(), (bri)new brt(qpt, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null), 1);
    }
    
    public final void d(final IOException ex) {
        bao.b("DashMediaSource", "Failed to resolve time offset.", (Throwable)ex);
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
                final bin bin = (bin)this.y.valueAt(i);
                final bjg j = this.i;
                final int g = key - this.o;
                bin.f = j;
                bin.g = g;
                final bjd b2 = bin.b;
                b2.f = false;
                b2.d = j;
                final Iterator iterator = b2.c.entrySet().iterator();
                while (iterator.hasNext()) {
                    if (((Map.Entry<Long, V>)iterator.next()).getKey() < b2.d.h) {
                        iterator.remove();
                    }
                }
                final bpp[] d = bin.d;
                if (d != null) {
                    for (int length = d.length, k = 0; k < length; ++k) {
                        ((bil)d[k].e).a(j, g);
                    }
                    bin.c.b((box)bin);
                }
                bin.h = (List)j.d(g).b;
                for (final bja bja : bin.e) {
                    for (final der der : bin.h) {
                        if (der.a().equals(bja.a.a())) {
                            final int a = j.a();
                            bja.f(der, j.d && g == a - 1);
                            break;
                        }
                    }
                }
            }
        }
        final adff d2 = this.i.d(0);
        final int n = this.i.a() - 1;
        final adff d3 = this.i.d(n);
        final long c = this.i.c(n);
        final long w = baw.w(baw.t(this.F));
        final long c2 = this.i.c(0);
        final long w2 = baw.w(d2.a);
        final boolean g2 = G(d2);
        long max = w2;
        for (int n2 = 0; n2 < ((List)d2.d).size(); ++n2) {
            final bje bje = ((List<bje>)d2.d).get(n2);
            final List c3 = bje.c;
            if ((g2 || bje.b != 3) && !c3.isEmpty()) {
                final biv m = c3.get(0).k();
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
        final adff adff = d2;
        final adff adff2 = d3;
        final long w3 = baw.w(adff2.a);
        final boolean g3 = G(adff2);
        long min = Long.MAX_VALUE;
        while (true) {
            for (int n3 = 0; n3 < ((List)adff2.d).size(); ++n3) {
                final bje bje2 = ((List<bje>)adff2.d).get(n3);
                final List c4 = bje2.c;
                if ((g3 || bje2.b != 3) && !c4.isEmpty()) {
                    final biv k2 = c4.get(0).k();
                    long n4;
                    if (k2 == null) {
                        n4 = w3 + c;
                    }
                    else {
                        final long n5 = c;
                        final long a2 = k2.a(n5, w);
                        if (a2 != 0L) {
                            final long n6 = k2.c(n5, w) + a2 - 1L;
                            min = Math.min(min, w3 + k2.h(n6) + k2.b(n6, n5));
                            continue;
                        }
                        n4 = w3;
                    }
                    boolean b3 = false;
                    Label_0906: {
                        Label_0904: {
                            if (this.i.d) {
                                for (int n7 = 0; n7 < ((List)adff2.d).size(); ++n7) {
                                    final biv k3 = ((List<bje>)adff2.d).get(n7).c.get(0).k();
                                    if (k3 == null) {
                                        break Label_0904;
                                    }
                                    if (k3.j()) {
                                        break Label_0904;
                                    }
                                }
                                b3 = true;
                                break Label_0906;
                            }
                        }
                        b3 = false;
                    }
                    long max2 = max;
                    if (b3) {
                        final long f = this.i.f;
                        max2 = max;
                        if (f != -9223372036854775807L) {
                            max2 = Math.max(max, n4 - baw.w(f));
                        }
                    }
                    final long n8 = n4 - max2;
                    final bjg i2 = this.i;
                    long n14;
                    long n15;
                    if (i2.d) {
                        dk.h(i2.a != -9223372036854775807L);
                        final bjg i3 = this.i;
                        final long n9 = w - baw.w(i3.a) - max2;
                        final long a3 = baw.A(n9);
                        final long c5 = this.s.c.c;
                        long n10 = 0L;
                        Label_1104: {
                            if (c5 != -9223372036854775807L) {
                                n10 = Math.min(a3, c5);
                            }
                            else {
                                final bjv j2 = i3.j;
                                if (j2 != null) {
                                    final long c6 = j2.c;
                                    if (c6 != -9223372036854775807L) {
                                        n10 = Math.min(a3, c6);
                                        break Label_1104;
                                    }
                                }
                                n10 = a3;
                            }
                        }
                        long a4;
                        final long n11 = a4 = baw.A(n9 - n8);
                        if (n11 < 0L) {
                            a4 = n11;
                            if (n10 > 0L) {
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
                            b5 = baw.r(b4, min2, a3);
                        }
                        else {
                            final bjv j3 = this.i.j;
                            b5 = min2;
                            if (j3 != null) {
                                final long b6 = j3.b;
                                b5 = min2;
                                if (b6 != -9223372036854775807L) {
                                    b5 = baw.r(b6, min2, a3);
                                }
                            }
                        }
                        long c8 = n10;
                        if (b5 > n10) {
                            c8 = b5;
                        }
                        long n12 = this.D.a;
                        Label_1362: {
                            if (n12 == -9223372036854775807L) {
                                final bjg i4 = this.i;
                                final bjv j4 = i4.j;
                                if (j4 != null) {
                                    n12 = j4.a;
                                    if (n12 != -9223372036854775807L) {
                                        break Label_1362;
                                    }
                                }
                                n12 = i4.g;
                                if (n12 == -9223372036854775807L) {
                                    n12 = this.v;
                                }
                            }
                        }
                        long n13 = n12;
                        if (n12 < b5) {
                            n13 = b5;
                        }
                        long r = n13;
                        if (n13 > c8) {
                            r = baw.r(baw.A(n9 - Math.min(5000000L, n8 / 2L)), b5, c8);
                        }
                        final ayo c9 = this.s.c;
                        float d4 = c9.d;
                        if (d4 == -3.4028235E38f) {
                            final bjv j5 = this.i.j;
                            if (j5 != null) {
                                d4 = j5.d;
                            }
                            else {
                                d4 = -3.4028235E38f;
                            }
                        }
                        float e2;
                        if ((e2 = c9.e) == -3.4028235E38f) {
                            final bjv j6 = this.i.j;
                            if (j6 != null) {
                                e2 = j6.e;
                            }
                            else {
                                e2 = -3.4028235E38f;
                            }
                        }
                        if (d4 == -3.4028235E38f && e2 == -3.4028235E38f) {
                            final bjv j7 = this.i.j;
                            if (j7 == null || j7.a == -9223372036854775807L) {
                                d4 = 1.0f;
                                e2 = 1.0f;
                            }
                        }
                        final ayn ayn = new ayn();
                        ayn.a = r;
                        ayn.b = b5;
                        ayn.c = c8;
                        ayn.d = d4;
                        ayn.e = e2;
                        this.D = ayn.a();
                        n14 = this.i.a + baw.A(max2);
                        n15 = n9 - baw.w(this.D.a);
                        final long min3 = Math.min(5000000L, n8 / 2L);
                        if (n15 < min3) {
                            n15 = min3;
                        }
                    }
                    else {
                        n14 = -9223372036854775807L;
                        n15 = 0L;
                    }
                    final long w4 = baw.w(adff.a);
                    final bjg i5 = this.i;
                    final long a5 = i5.a;
                    final long f2 = this.F;
                    final int o = this.o;
                    final ayt s = this.s;
                    ayo d5;
                    if (i5.d) {
                        d5 = this.D;
                    }
                    else {
                        d5 = null;
                    }
                    this.y((azl)new bio(a5, n14, f2, o, max2 - w4, n8, n15, i5, s, d5));
                    this.g.removeCallbacks(this.d);
                    if (b3) {
                        final Handler g4 = this.g;
                        final Runnable d6 = this.d;
                        final bjg i6 = this.i;
                        final long t = baw.t(this.F);
                        final int n16 = i6.a() - 1;
                        final adff d7 = i6.d(n16);
                        final long w5 = baw.w(d7.a);
                        final long c10 = i6.c(n16);
                        final long w6 = baw.w(t);
                        final long w7 = baw.w(i6.a);
                        long w8 = baw.w(5000L);
                        long n18;
                        for (int n17 = 0; n17 < ((List)d7.d).size(); ++n17, w8 = n18) {
                            final List c11 = ((List<bje>)d7.d).get(n17).c;
                            if (c11.isEmpty()) {
                                n18 = w8;
                            }
                            else {
                                final biv k4 = c11.get(0).k();
                                n18 = w8;
                                if (k4 != null) {
                                    final long n19 = w7 + w5 + k4.e(c10, w6) - w6;
                                    if (n19 >= w8 - 100000L) {
                                        n18 = w8;
                                        if (n19 <= w8) {
                                            continue;
                                        }
                                        n18 = w8;
                                        if (n19 >= w8 + 100000L) {
                                            continue;
                                        }
                                    }
                                    n18 = n19;
                                }
                            }
                        }
                        g4.postDelayed(d6, aesy.T(w8, 1000L, RoundingMode.CEILING));
                    }
                    if (this.j) {
                        this.l();
                        return;
                    }
                    if (b) {
                        final bjg i7 = this.i;
                        if (i7.d) {
                            final long e3 = i7.e;
                            if (e3 != -9223372036854775807L) {
                                long n20 = e3;
                                if (e3 == 0L) {
                                    n20 = 5000L;
                                }
                                this.k(Math.max(0L, this.k + n20 - SystemClock.elapsedRealtime()));
                            }
                        }
                    }
                    return;
                }
            }
            long n4 = min;
            continue;
        }
    }
    
    public final void j(final bjx bjx, final brp brp) {
        this.o(new brq(this.B, Uri.parse(bjx.b), 5, brp), (bri)new bis(this), 1);
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
            this.o(new brq(this.B, h, 4, this.w), (bri)this.x, this.a.a(4));
        }
    }
    
    final void n(final brq brq) {
        final long a = brq.a;
        final bbo b = brq.b;
        brq.d();
        final bnn bnn = new bnn(a, b, brq.c());
        final long a2 = brq.a;
        this.b.f(bnn, brq.c, -1, (ayf)null, 0, (Object)null, -9223372036854775807L, -9223372036854775807L);
    }
    
    public final ayt sJ() {
        return this.s;
    }
    
    public final void sK() {
        this.A.a();
    }
    
    protected final void sL(final bcn c) {
        this.C = c;
        this.u.c();
        this.u.e(Looper.myLooper(), this.q());
        this.B = this.t.a();
        this.e = new brn("DashMediaSource");
        this.g = baw.E();
        this.l();
    }
    
    public final void sM(final bnu bnu) {
        final bin bin = (bin)bnu;
        final bjd b = bin.b;
        b.g = true;
        b.b.removeCallbacksAndMessages((Object)null);
        final bpp[] d = bin.d;
        for (int length = d.length, i = 0; i < length; ++i) {
            d[i].i((bpo)bin);
        }
        bin.c = null;
        this.y.remove(bin.a);
    }
    
    protected final void sN() {
        this.j = false;
        this.B = null;
        final brn e = this.e;
        if (e != null) {
            e.e((brl)null);
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
        final der g2 = this.G;
        ((Map)g2.c).clear();
        ((Map)g2.b).clear();
        ((Map)g2.a).clear();
        this.u.d();
    }
    
    public final bnu sO(final ayx ayx, final bre bre, long f) {
        final int n = (int)ayx.a - this.o;
        final bny d = this.D(ayx, this.i.d(n).a);
        final trg f2 = this.F(ayx);
        final int o = this.o;
        final bjg i = this.i;
        final der g = this.G;
        final bhu h = this.H;
        final bcn c = this.C;
        final bkr u = this.u;
        final brh a = this.a;
        f = this.F;
        final bro a2 = this.A;
        final qpt j = this.I;
        this.q();
        final bin bin = new bin(o + n, i, g, n, h, c, u, f2, a, d, f, a2, bre, j, null, null, null, null, null, null, null, null);
        this.y.put(bin.a, (Object)bin);
        return (bnu)bin;
    }
}
