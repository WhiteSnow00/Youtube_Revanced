import android.content.BroadcastReceiver;
import androidx.media3.common.Metadata;
import java.util.concurrent.TimeoutException;
import java.util.Collection;
import java.util.Random;
import android.view.SurfaceHolder$Callback;
import java.util.Collections;
import java.util.Iterator;
import android.util.Pair;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.os.Handler$Callback;
import java.util.ArrayList;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.Surface;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bex extends axw implements bej
{
    public static final int L = 0;
    public axu A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ayc E;
    public ayx F;
    public bfn G;
    public int H;
    public long I;
    public final adhu J;
    final aevd K;
    private final Context M;
    private final bfr[] N;
    private final bfa O;
    private final CopyOnWriteArraySet P;
    private final boolean Q;
    private final bnw R;
    private final bre S;
    private final bad T;
    private final long U;
    private int V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;
    private float aa;
    private bsf ab;
    private boolean ac;
    private boolean ad;
    private final gpj ae;
    private eg af;
    private agoe ag;
    private final pvh ah;
    final azd b;
    public final azh c;
    public final brb d;
    public final bak e;
    public final azk f;
    public final List g;
    public final bga h;
    public final Looper i;
    public final beu j;
    public final bev k;
    public final bdw l;
    public final bfz m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public bfv r;
    public azd s;
    public ayx t;
    public Object u;
    public Surface v;
    public SurfaceHolder w;
    public bsq x;
    public boolean y;
    public int z;
    
    static {
        ayv.a("media3.exoplayer");
    }
    
    public bex(final bei bei) {
        this.ae = new gpj((byte[])null);
        try {
            Integer.toHexString(System.identityHashCode(this));
            final int a = bax.a;
            bap.f();
            this.M = bei.a.getApplicationContext();
            this.h = (bga)bei.h.apply((Object)bei.b);
            this.ag = bei.s;
            this.A = bei.j;
            this.X = bei.k;
            this.B = false;
            this.U = bei.o;
            final beu j = new beu(this);
            this.j = j;
            this.k = new bev();
            final Handler handler = new Handler(bei.i);
            final bfr[] sl = ((bfu)bei.c.a()).sL(handler, (bso)j, (bhe)j, (bqb)j, (bmp)j);
            this.N = sl;
            dk.h(sl.length > 0);
            this.d = (brb)bei.e.a();
            this.R = (bnw)bei.d.a();
            this.S = (bre)bei.g.a();
            this.Q = bei.l;
            this.r = bei.m;
            this.W = false;
            final Looper i = bei.i;
            this.i = i;
            final bad b = bei.b;
            this.T = b;
            this.c = (azh)this;
            this.J = new adhu(i, b, (ban)new beq(this));
            this.P = new CopyOnWriteArraySet();
            this.g = new ArrayList();
            this.af = new eg();
            final int length = sl.length;
            this.K = new aevd(new bft[length], new bqw[length], azr.a, (Object)null);
            this.f = new azk();
            final skt skt = new skt((char[])null, (byte[])null);
            for (int k = 0; k < 21; ++k) {
                skt.o((new int[] { 1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28 })[k]);
            }
            axs.d(29, this.d.j(), skt);
            final azd b2 = axs.b(skt);
            this.b = b2;
            final skt skt2 = new skt((char[])null, (byte[])null);
            axs.c(b2, skt2);
            skt2.o(4);
            skt2.o(10);
            this.s = axs.b(skt2);
            this.e = this.T.b(this.i, (Handler$Callback)null);
            final pvh ah = new pvh(this);
            this.ah = ah;
            this.G = bfn.g(this.K);
            this.h.X(this.c, this.i);
            bha a2;
            if (bax.a < 31) {
                a2 = new bha();
            }
            else {
                a2 = ber.a(this.M, this, bei.p);
            }
            this.O = new bfa(this.N, this.d, this.K, (bfc)bei.f.a(), this.S, this.V, this.h, this.r, bei.r, bei.n, this.W, this.i, this.T, ah, a2, null, null, null, null, null, null, null);
            this.aa = 1.0f;
            this.V = 0;
            final ayx a3 = ayx.a;
            this.t = a3;
            this.F = a3;
            this.H = -1;
            this.z = bax.f(this.M);
            final int b3 = azz.b;
            this.C = true;
            this.s((azf)this.h);
            this.S.g(new Handler(this.i), (brd)this.h);
            this.J((beg)this.j);
            bei.a.getApplicationContext();
            new bdt(handler);
            this.l = new bdw(bei.a, (bdv)this.j);
            bdw.b();
            final bfz m = new bfz(bei.a, handler, (bfx)this.j);
            (this.m = m).a(bax.n(this.A.c));
            final PowerManager powerManager = (PowerManager)bei.a.getApplicationContext().getSystemService("power");
            final WifiManager wifiManager = (WifiManager)bei.a.getApplicationContext().getSystemService("wifi");
            this.E = S(m);
            this.d.h(this.A);
            this.X(1, 10, this.z);
            this.X(2, 10, this.z);
            this.X(1, 3, this.A);
            this.X(2, 4, this.X);
            this.X(2, 5, 0);
            this.X(1, 9, this.B);
            this.X(2, 7, this.k);
            this.X(6, 8, this.k);
            this.ae.e();
        }
        finally {
            this.ae.e();
            while (true) {}
        }
    }
    
    public static int R(final boolean b, final int n) {
        if (b && n != 1) {
            return 2;
        }
        return 1;
    }
    
    public static ayc S(final bfz bfz) {
        int streamMinVolume;
        if (bax.a >= 28) {
            streamMinVolume = bfz.c.getStreamMinVolume(bfz.e);
        }
        else {
            streamMinVolume = 0;
        }
        return new ayc(streamMinVolume, bfz.c.getStreamMaxVolume(bfz.e));
    }
    
    public static boolean ae(final bfn bfn) {
        return bfn.d == 3 && bfn.i && bfn.j == 0;
    }
    
    private final int ai() {
        if (this.G.a.p()) {
            return this.H;
        }
        final bfn g = this.G;
        return g.a.n(g.q.a, this.f).c;
    }
    
    private final long aj(final bfn bfn) {
        if (bfn.a.p()) {
            return bax.w(this.I);
        }
        if (bfn.q.a()) {
            return bfn.o;
        }
        return this.af(bfn.a, bfn.q, bfn.o);
    }
    
    private static long ak(final bfn bfn) {
        final azl azl = new azl();
        final azk azk = new azk();
        bfn.a.n(bfn.q.a, azk);
        final long b = bfn.b;
        long m;
        if (b == -9223372036854775807L) {
            m = bfn.a.o(azk.c, azl).m;
        }
        else {
            m = azk.e + b;
        }
        return m;
    }
    
    private final Pair al(final azm azm, final int h, long a) {
        if (azm.p()) {
            this.H = h;
            long i = a;
            if (a == -9223372036854775807L) {
                i = 0L;
            }
            this.I = i;
            return null;
        }
        int g;
        if (h == -1 || (g = h) >= azm.c()) {
            g = azm.g(false);
            a = azm.o(g, this.a).a();
        }
        return azm.k(this.a, this.f, g, bax.w(a));
    }
    
    private final bfn am(bfn bfn, final azm azm, final Pair pair) {
        dk.f(azm.p() || pair != null);
        final azm a = bfn.a;
        final bfn e = bfn.e(azm);
        if (azm.p()) {
            final ayy p3 = bfn.p;
            final long w = bax.w(this.I);
            bfn = e.h(p3, w, w, w, 0L, bpe.a, this.K, (List)afeq.q()).f(p3);
            bfn.m = bfn.o;
            return bfn;
        }
        final Object a2 = e.q.a;
        final int a3 = bax.a;
        final boolean b = a2.equals(pair.first) ^ true;
        ayy q;
        if (b) {
            q = new ayy(pair.first);
        }
        else {
            q = e.q;
        }
        final long longValue = (long)pair.second;
        long w2;
        final long n = w2 = bax.w(this.n());
        if (!a.p()) {
            w2 = n - a.n(a2, this.f).e;
        }
        if (!b && longValue >= w2) {
            if (longValue == w2) {
                final int a4 = azm.a(e.r.a);
                if (a4 != -1) {
                    bfn = e;
                    if (azm.m(a4, this.f).c == azm.n(q.a, this.f).c) {
                        return bfn;
                    }
                }
                azm.n(q.a, this.f);
                long m;
                if (q.a()) {
                    m = this.f.e(q.b, q.c);
                }
                else {
                    m = this.f.d;
                }
                bfn = e.h(q, e.o, e.o, e.c, m - e.o, e.g, e.s, e.h).f(q);
                bfn.m = m;
            }
            else {
                dk.h(q.a() ^ true);
                final long max = Math.max(0L, e.n - (longValue - w2));
                long i = e.m;
                if (e.r.equals((Object)e.q)) {
                    i = longValue + max;
                }
                bfn = e.h(q, longValue, longValue, longValue, max, e.g, e.s, e.h);
                bfn.m = i;
            }
        }
        else {
            dk.h(q.a() ^ true);
            bpe bpe;
            if (b) {
                bpe = bpe.a;
            }
            else {
                bpe = e.g;
            }
            aevd aevd;
            if (b) {
                aevd = this.K;
            }
            else {
                aevd = e.s;
            }
            Object o;
            if (b) {
                o = afeq.q();
            }
            else {
                o = e.h;
            }
            bfn = e.h(q, longValue, longValue, longValue, 0L, bpe, aevd, (List)o).f(q);
            bfn.m = longValue;
        }
        return bfn;
    }
    
    private final void an() {
        final azd s = this.s;
        final azd j = bax.J(this.c, this.b);
        this.s = j;
        if (!j.equals((Object)s)) {
            this.J.j(13, (bam)new bem(this, 11));
        }
    }
    
    private final void ao(final bef bef) {
        final bfn g = this.G;
        final bfn f = g.f(g.q);
        f.m = f.o;
        f.n = 0L;
        bfn bfn2;
        final bfn bfn = bfn2 = f.d(1);
        if (bef != null) {
            bfn2 = bfn.b(bef);
        }
        ++this.n;
        this.O.a.e(6).r();
        this.ah(bfn2, 0, 1, false, bfn2.a.p() && !this.G.a.p(), 4, this.aj(bfn2), -1);
    }
    
    public final void A(final int v) {
        this.ad();
        if (this.V != v) {
            this.V = v;
            this.O.a.g(11, v, 0).r();
            this.J.j(8, (bam)new bgo(v, 1));
            this.an();
            this.J.i();
        }
    }
    
    public final void B(final Surface surface) {
        this.ad();
        this.W();
        this.aa(surface);
        int n;
        if (surface == null) {
            n = 0;
        }
        else {
            n = -1;
        }
        this.V(n, n);
    }
    
    public final void C(float a) {
        this.ad();
        a = bax.a(a, 0.0f, 1.0f);
        if (this.aa == a) {
            return;
        }
        this.aa = a;
        this.Y();
        this.J.m(22, (bam)new bep(a));
    }
    
    public final void D() {
        this.ad();
        this.ad();
        this.l.c(this.E());
        this.ao(null);
        final afeq q = afeq.q();
        final long o = this.G.o;
        new azz((List)q);
    }
    
    public final boolean E() {
        this.ad();
        return this.G.i;
    }
    
    public final boolean F() {
        this.ad();
        return this.G.q.a();
    }
    
    public final void G(final List list) {
        this.ad();
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < ((afih)list).c; ++i) {
            list2.add(this.R.a(list.get(i)));
        }
        this.ag(list2);
    }
    
    public final void H() {
        this.ad();
    }
    
    public final void I(final bgc bgc) {
        final bga h = this.h;
        dk.d((Object)bgc);
        h.G(bgc);
    }
    
    public final void J(final beg beg) {
        this.P.add(beg);
    }
    
    public final void K(final bsf bsf) {
        this.ad();
        if (this.ab != bsf) {
            return;
        }
        final bfq u = this.U((bfp)this.k);
        u.g(7);
        u.f((Object)null);
        u.e();
    }
    
    public final void L(final boolean b) {
        this.ad();
        this.O.a.g(24, (int)(b ? 1 : 0), 0).r();
        final Iterator iterator = this.P.iterator();
        while (iterator.hasNext()) {
            ((beg)iterator.next()).b();
        }
    }
    
    public final void M(final bny bny) {
        this.ad();
        final List<bny> singletonList = Collections.singletonList(bny);
        this.ad();
        this.ag(singletonList);
    }
    
    public final void N(final boolean w) {
        this.ad();
        if (this.W == w) {
            return;
        }
        this.W = w;
        this.O.a.g(23, (int)(w ? 1 : 0), 0).r();
    }
    
    public final void O(final bfv bfv) {
        this.ad();
        bfv c = bfv;
        if (bfv == null) {
            c = bfv.c;
        }
        if (!this.r.equals((Object)c)) {
            this.r = c;
            this.O.a.f(5, (Object)c).r();
        }
    }
    
    public final void P(final bsf ab) {
        this.ad();
        this.ab = ab;
        final bfq u = this.U((bfp)this.k);
        u.g(7);
        u.f((Object)ab);
        u.e();
    }
    
    public final void Q(final agoe ag) {
        this.ad();
        if (bax.aa((Object)this.ag, (Object)ag)) {
            return;
        }
        if (this.ad) {
            final agoe ag2 = this.ag;
            dk.d((Object)ag2);
            ag2.E(0);
        }
        Label_0074: {
            if (ag != null) {
                this.ad();
                if (this.G.f) {
                    ag.B(0);
                    this.ad = true;
                    break Label_0074;
                }
            }
            this.ad = false;
        }
        this.ag = ag;
    }
    
    public final ayx T() {
        final azm q = this.q();
        if (q.p()) {
            return this.F;
        }
        final ayu c = q.o(this.j(), this.a).c;
        final ayw a = this.F.a();
        final ayx d = c.d;
        final CharSequence b = d.b;
        if (b != null) {
            a.a = b;
        }
        final CharSequence c2 = d.c;
        if (c2 != null) {
            a.b = c2;
        }
        final CharSequence d2 = d.d;
        if (d2 != null) {
            a.c = d2;
        }
        final CharSequence e = d.e;
        if (e != null) {
            a.d = e;
        }
        final CharSequence f = d.f;
        if (f != null) {
            a.e = f;
        }
        final byte[] g = d.g;
        if (g != null) {
            a.c(g, d.h);
        }
        final Integer i = d.i;
        if (i != null) {
            a.h = i;
        }
        final Integer j = d.j;
        if (j != null) {
            a.i = j;
        }
        final Integer k = d.k;
        if (k != null) {
            a.j = k;
        }
        final Integer l = d.l;
        if (l != null) {
            a.j = l;
        }
        final Integer m = d.m;
        if (m != null) {
            a.k = m;
        }
        final Integer n = d.n;
        if (n != null) {
            a.l = n;
        }
        final Integer o = d.o;
        if (o != null) {
            a.m = o;
        }
        final Integer p = d.p;
        if (p != null) {
            a.n = p;
        }
        final Integer q2 = d.q;
        if (q2 != null) {
            a.o = q2;
        }
        final CharSequence r = d.r;
        if (r != null) {
            a.p = r;
        }
        final CharSequence s = d.s;
        if (s != null) {
            a.q = s;
        }
        final CharSequence t = d.t;
        if (t != null) {
            a.r = t;
        }
        final CharSequence u = d.u;
        if (u != null) {
            a.s = u;
        }
        final CharSequence v = d.v;
        if (v != null) {
            a.t = v;
        }
        return a.a();
    }
    
    public final bfq U(final bfp bfp) {
        int ai = this.ai();
        final bfa o = this.O;
        final azm a = this.G.a;
        if (ai == -1) {
            ai = 0;
        }
        return new bfq((bfo)o, bfp, a, ai, o.b);
    }
    
    public final void V(final int y, final int z) {
        if (y == this.Y && z == this.Z) {
            return;
        }
        this.Y = y;
        this.Z = z;
        this.J.m(24, (bam)new bek(y, z));
    }
    
    public final void W() {
        if (this.x == null) {
            final SurfaceHolder w = this.w;
            if (w != null) {
                w.removeCallback((SurfaceHolder$Callback)this.j);
                this.w = null;
            }
            return;
        }
        final bfq u = this.U((bfp)this.k);
        u.g(10000);
        u.f((Object)null);
        u.e();
        throw null;
    }
    
    public final void X(final int n, final int n2, final Object o) {
        for (final bfr bfr : this.N) {
            if (bfr.h() == n) {
                final bfq u = this.U((bfp)bfr);
                u.g(n2);
                u.f(o);
                u.e();
            }
        }
    }
    
    public final void Y() {
        this.X(1, 2, this.aa * this.l.b);
    }
    
    public final void Z(final List list, int g, long w, final boolean b) {
        final int ai = this.ai();
        final long o = this.o();
        final int n = this.n;
        final boolean b2 = true;
        this.n = n + 1;
        if (!this.g.isEmpty()) {
            final int size = this.g.size();
            for (int i = size - 1; i >= 0; --i) {
                this.g.remove(i);
            }
            final eg af = this.af;
            final int[] array = new int[((int[])af.d).length - size];
            int n2 = 0;
            int n3 = 0;
            while (true) {
                final int[] array2 = (int[])af.d;
                if (n2 >= array2.length) {
                    break;
                }
                final int n4 = array2[n2];
                if (n4 >= 0 && n4 < size) {
                    ++n3;
                }
                else {
                    int n5;
                    if ((n5 = n4) >= 0) {
                        n5 = n4 - size;
                    }
                    array[n2 - n3] = n5;
                }
                ++n2;
            }
            this.af = new eg(array, new Random(((Random)af.b).nextLong()));
        }
        final ArrayList list2 = new ArrayList();
        for (int j = 0; j < list.size(); ++j) {
            final bfk bfk = new bfk((bny)list.get(j), this.Q);
            list2.add(bfk);
            this.g.add(j, new bew(bfk.b, (azm)bfk.a.b));
        }
        this.af = this.af.w(list2.size());
        final bds bds = new bds(this.g, this.af, null, null);
        if (!bds.p() && g >= bds.b) {
            throw new ayh();
        }
        if (b) {
            g = bds.g(false);
            w = -9223372036854775807L;
        }
        else if (g == -1) {
            g = ai;
            w = o;
        }
        final bfn am = this.am(this.G, bds, this.al(bds, g, w));
        int d = am.d;
        if (g != -1 && (d = d) != 1) {
            final boolean p4 = bds.p();
            final int n6 = d = 4;
            if (!p4) {
                if (g >= bds.b) {
                    d = n6;
                }
                else {
                    d = 2;
                }
            }
        }
        final bfn d2 = am.d(d);
        final bfa o2 = this.O;
        w = bax.w(w);
        o2.a.f(17, (Object)new bnz(list2, this.af, g, w, null, null)).r();
        this.ah(d2, 0, 1, false, !this.G.q.a.equals(d2.q.a) && !this.G.a.p() && b2, 4, this.aj(d2), -1);
    }
    
    public final Looper a() {
        return this.O.b;
    }
    
    public final void aa(final Object u) {
        final ArrayList list = new ArrayList();
        final bfr[] n = this.N;
        final int length = n.length;
        final boolean b = false;
        final int n2 = 0;
        for (final bfr bfr : n) {
            if (bfr.h() == 2) {
                final bfq u2 = this.U((bfp)bfr);
                u2.g(1);
                u2.f(u);
                u2.e();
                list.add(u2);
            }
        }
        final Object u3 = this.u;
        int n3 = b ? 1 : 0;
        if (u3 != null) {
            n3 = (b ? 1 : 0);
            if (u3 != u) {
                int n4;
                try {
                    final Iterator iterator = list.iterator();
                    while (true) {
                        n4 = n2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        ((bfq)iterator.next()).c(this.U);
                    }
                }
                catch (final TimeoutException ex) {
                    n4 = 1;
                }
                catch (final InterruptedException ex2) {
                    Thread.currentThread().interrupt();
                    n4 = n2;
                }
                final Object u4 = this.u;
                final Surface v = this.v;
                n3 = n4;
                if (u4 == v) {
                    v.release();
                    this.v = null;
                    n3 = n4;
                }
            }
        }
        this.u = u;
        if (n3 != 0) {
            this.ao(bef.b((RuntimeException)new bfb(3), 1003));
        }
    }
    
    public final void ab(final boolean b, int n, final int n2) {
        final int n3 = 0;
        int n4;
        if (b) {
            if (n != -1) {
                n4 = n;
                n = 1;
            }
            else {
                n = 0;
                n4 = -1;
            }
        }
        else {
            final int n5 = 0;
            n4 = n;
            n = n5;
        }
        int n6 = n3;
        if (n != 0) {
            n6 = n3;
            if (n4 != 1) {
                n6 = 1;
            }
        }
        final bfn g = this.G;
        if ((g.i ? 1 : 0) == n && g.j == n6) {
            return;
        }
        ++this.n;
        final bfn a = g.a((boolean)(n != 0), n6);
        this.O.a.g(1, n, n6).r();
        this.ah(a, 0, n2, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final void ac() {
        final int k = this.k();
        if (k != 2 && k != 3) {
            return;
        }
        this.ad();
        final boolean l = this.G.l;
        this.E();
        this.E();
    }
    
    public final void ad() {
        this.ae.b();
        if (Thread.currentThread() == this.i.getThread()) {
            return;
        }
        final String m = bax.M("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", new Object[] { Thread.currentThread().getName(), this.i.getThread().getName() });
        if (!this.C) {
            Throwable t;
            if (this.ac) {
                t = null;
            }
            else {
                t = new IllegalStateException();
            }
            bap.d("ExoPlayerImpl", m, t);
            this.ac = true;
            return;
        }
        throw new IllegalStateException(m);
    }
    
    public final long af(final azm azm, final ayy ayy, final long n) {
        azm.n(ayy.a, this.f);
        return n + this.f.e;
    }
    
    public final void ag(final List list) {
        this.ad();
        this.Z(list, -1, -9223372036854775807L, true);
    }
    
    public final void ah(final bfn g, int n, final int n2, final boolean b, final boolean b2, final int n3, long a, int n4) {
        final bfn g2 = this.G;
        this.G = g;
        final boolean equals = g2.a.equals((Object)g.a);
        final Boolean value = true;
        final boolean b3 = equals ^ true;
        final azm a2 = g2.a;
        final azm a3 = g.a;
        final boolean p8 = a3.p();
        final Integer value2 = -1;
        final Boolean value3 = false;
        Pair pair;
        if (p8 && a2.p()) {
            pair = new Pair((Object)value3, (Object)value2);
        }
        else if (a3.p() != a2.p()) {
            pair = new Pair((Object)value, (Object)3);
        }
        else if (!a2.o(a2.n(g2.q.a, this.f).c, this.a).b.equals(a3.o(a3.n(g.q.a, this.f).c, this.a).b)) {
            int n5;
            if (b2 && n3 == 0) {
                n5 = 1;
            }
            else if (b2 && n3 == 1) {
                n5 = 2;
            }
            else {
                if (!b3) {
                    throw new IllegalStateException();
                }
                n5 = 3;
            }
            pair = new Pair((Object)value, (Object)n5);
        }
        else if (b2 && n3 == 0 && g2.q.d < g.q.d) {
            pair = new Pair((Object)value, (Object)0);
        }
        else {
            pair = new Pair((Object)value3, (Object)value2);
        }
        final boolean booleanValue = (boolean)pair.first;
        final int intValue = (int)pair.second;
        ayx t = this.t;
        ayu c;
        if (booleanValue) {
            if (!g.a.p()) {
                c = g.a.o(g.a.n(g.q.a, this.f).c, this.a).c;
            }
            else {
                c = null;
            }
            this.F = ayx.a;
        }
        else {
            c = null;
        }
        if (booleanValue || !agpi.V(g2.h, g.h)) {
            final ayw a4 = this.F.a();
            final List h = g.h;
            for (int i = 0; i < ((afih)h).c; ++i) {
                final Metadata metadata = (Metadata)h.get(i);
                for (int j = 0; j < metadata.a(); ++j) {
                    metadata.b(j).b(a4);
                }
            }
            this.F = a4.a();
            t = this.T();
        }
        final boolean equals2 = t.equals((Object)this.t);
        this.t = t;
        final boolean b4 = g2.i != g.i;
        final boolean b5 = g2.d != g.d;
        if (b5 || b4) {
            this.ac();
        }
        final boolean f = g2.f;
        final boolean f2 = g.f;
        final boolean b6 = f != f2;
        if (b6) {
            final agoe ag = this.ag;
            if (ag != null) {
                if (f2) {
                    if (!this.ad) {
                        ag.B(0);
                        this.ad = true;
                    }
                }
                else if (this.ad) {
                    ag.E(0);
                    this.ad = false;
                }
            }
        }
        if (b3) {
            this.J.j(0, (bam)new bel(g, n, 1));
        }
        if (b2) {
            final azk azk = new azk();
            Object a5;
            Object b7;
            ayu c2;
            if (!g2.a.p()) {
                a5 = g2.q.a;
                g2.a.n(a5, azk);
                n4 = azk.c;
                n = g2.a.a(a5);
                b7 = g2.a.o(n4, this.a).b;
                c2 = this.a.c;
            }
            else {
                b7 = null;
                c2 = null;
                a5 = null;
                n = -1;
            }
            long n6 = 0L;
            long n7 = 0L;
            Label_0984: {
                if (n3 == 0) {
                    if (g2.q.a()) {
                        final ayy q = g2.q;
                        n6 = azk.e(q.b, q.c);
                        n7 = ak(g2);
                        break Label_0984;
                    }
                    if (g2.q.e != -1) {
                        n6 = ak(this.G);
                    }
                    else {
                        n6 = azk.d + azk.e;
                    }
                }
                else {
                    if (g2.q.a()) {
                        n6 = g2.o;
                        n7 = ak(g2);
                        break Label_0984;
                    }
                    n6 = azk.e + g2.o;
                }
                n7 = n6;
            }
            final int a6 = bax.a;
            final ayy q2 = g2.q;
            final azg azg = new azg(b7, n4, c2, a5, n, bax.A(n6), bax.A(n7), q2.b, q2.c);
            n4 = this.j();
            Object a7;
            Object b8;
            ayu c3;
            if (!this.G.a.p()) {
                final bfn g3 = this.G;
                a7 = g3.q.a;
                g3.a.n(a7, this.f);
                n = this.G.a.a(a7);
                b8 = this.G.a.o(n4, this.a).b;
                c3 = this.a.c;
            }
            else {
                b8 = null;
                c3 = null;
                a7 = null;
                n = -1;
            }
            final long a8 = bax.A(a);
            if (this.G.q.a()) {
                a = bax.A(ak(this.G));
            }
            else {
                a = a8;
            }
            final ayy q3 = this.G.q;
            this.J.j(11, (bam)new beo(n3, azg, new azg(b8, n4, c3, a7, n, a8, a, q3.b, q3.c)));
        }
        if (booleanValue) {
            this.J.j(1, (bam)new bel(c, intValue, 2));
        }
        if (g2.e != g.e) {
            this.J.j(10, (bam)new bem(g, 4));
            if (g.e != null) {
                this.J.j(10, (bam)new bem(g, 5));
            }
        }
        final aevd s = g2.s;
        final aevd s2 = g.s;
        if (s != s2) {
            this.d.m(s2.d);
            this.J.j(2, (bam)new bem(g, 6));
        }
        if (equals2 ^ true) {
            this.J.j(14, (bam)new bem(this.t, 7));
        }
        if (b6) {
            this.J.j(3, (bam)new bem(g, 8));
        }
        if (b5 || b4) {
            this.J.j(-1, (bam)new bem(g, 9));
        }
        if (b5) {
            this.J.j(4, (bam)new bem(g, 10));
        }
        if (b4) {
            this.J.j(5, (bam)new bel(g, n2, 0));
        }
        if (g2.j != g.j) {
            this.J.j(6, (bam)new bem(g, 1));
        }
        if (ae(g2) != ae(g)) {
            this.J.j(7, (bam)new bem(g, 0));
        }
        if (!g2.k.equals((Object)g.k)) {
            this.J.j(12, (bam)new bem(g, 2));
        }
        if (b) {
            this.J.j(-1, (bam)ben.a);
        }
        this.an();
        this.J.i();
        if (g2.l != g.l) {
            final Iterator iterator = this.P.iterator();
            while (iterator.hasNext()) {
                ((beg)iterator.next()).a(g.l);
            }
        }
    }
    
    public final bfq b(final bfp bfp) {
        this.ad();
        return this.U(bfp);
    }
    
    public final int h() {
        this.ad();
        if (this.F()) {
            return this.G.q.b;
        }
        return -1;
    }
    
    public final int i() {
        this.ad();
        if (this.F()) {
            return this.G.q.c;
        }
        return -1;
    }
    
    public final int j() {
        this.ad();
        int ai;
        if ((ai = this.ai()) == -1) {
            ai = 0;
        }
        return ai;
    }
    
    public final int k() {
        this.ad();
        return this.G.d;
    }
    
    public final int l() {
        this.ad();
        return this.G.j;
    }
    
    public final int m() {
        this.ad();
        return this.V;
    }
    
    public final long n() {
        this.ad();
        if (this.F()) {
            final bfn g = this.G;
            g.a.n(g.q.a, this.f);
            final bfn g2 = this.G;
            long a;
            if (g2.b == -9223372036854775807L) {
                a = g2.a.o(this.j(), this.a).a();
            }
            else {
                a = this.f.f() + bax.A(this.G.b);
            }
            return a;
        }
        return this.o();
    }
    
    public final long o() {
        this.ad();
        return bax.A(this.aj(this.G));
    }
    
    public final long p() {
        this.ad();
        if (this.F()) {
            final bfn g = this.G;
            final ayy q = g.q;
            g.a.n(q.a, this.f);
            return bax.A(this.f.e(q.b, q.c));
        }
        final azm q2 = this.q();
        if (q2.p()) {
            return -9223372036854775807L;
        }
        return q2.o(this.j(), super.a).b();
    }
    
    public final azm q() {
        this.ad();
        return this.G.a;
    }
    
    public final azr r() {
        this.ad();
        return (azr)this.G.s.e;
    }
    
    public final void s(final azf azf) {
        final adhu j = this.J;
        dk.d((Object)azf);
        j.h((Object)azf);
    }
    
    public final void t() {
        this.ad();
        this.W();
        this.aa(null);
        this.V(0, 0);
    }
    
    public final void u() {
        this.ad();
        final boolean e = this.E();
        final int c = this.l.c(e);
        this.ab(e, c, R(e, c));
        final bfn g = this.G;
        if (g.d != 1) {
            return;
        }
        final bfn b = g.b((bef)null);
        int n;
        if (!b.a.p()) {
            n = 2;
        }
        else {
            n = 4;
        }
        final bfn d = b.d(n);
        ++this.n;
        this.O.a.e(0).r();
        this.ah(d, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final void v() {
        Integer.toHexString(System.identityHashCode(this));
        final int a = bax.a;
        final int a2 = ayv.a;
        bap.f();
        this.ad();
        final bfz m = this.m;
        final bfy d = m.d;
        if (d != null) {
            try {
                m.a.unregisterReceiver((BroadcastReceiver)d);
            }
            catch (final RuntimeException ex) {
                bap.d("StreamVolumeManager", "Error unregistering stream volume receiver", (Throwable)ex);
            }
            m.d = null;
        }
        final bdw l = this.l;
        l.a = null;
        l.a();
        if (!this.O.e()) {
            this.J.m(10, (bam)ben.b);
        }
        this.J.k();
        ((bau)this.e).b.removeCallbacksAndMessages((Object)null);
        this.S.h((brd)this.h);
        final bfn d2 = this.G.d(1);
        this.G = d2;
        final bfn f = d2.f(d2.q);
        this.G = f;
        f.m = f.o;
        this.G.n = 0L;
        this.h.V();
        this.d.g();
        this.W();
        final Surface v = this.v;
        if (v != null) {
            v.release();
            this.v = null;
        }
        if (this.ad) {
            final agoe ag = this.ag;
            dk.d((Object)ag);
            ag.E(0);
            this.ad = false;
        }
        final int b = azz.b;
        this.D = true;
    }
    
    public final void w(final azf azf) {
        dk.d((Object)azf);
        this.J.l((Object)azf);
    }
    
    public final void x(final int n, long w) {
        this.ad();
        this.h.H();
        final azm a = this.G.a;
        if (n < 0 || (!a.p() && n >= a.c())) {
            throw new ayh();
        }
        final int n2 = this.n;
        int n3 = 1;
        this.n = n2 + 1;
        if (this.F()) {
            bap.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            final mbe mbe = new mbe(this.G);
            mbe.b(1);
            this.ah.aa(mbe);
            return;
        }
        if (this.k() != 1) {
            n3 = 2;
        }
        final int j = this.j();
        final bfn am = this.am(this.G.d(n3), a, this.al(a, n, w));
        final bfa o = this.O;
        w = bax.w(w);
        o.a.f(3, (Object)new bez(a, n, w)).r();
        this.ah(am, 0, 1, true, true, 1, this.aj(am), j);
    }
    
    public final void y(final boolean b) {
        this.ad();
        final bdw l = this.l;
        this.k();
        final int c = l.c(b);
        this.ab(b, c, R(b, c));
    }
    
    public final void z(final azc azc) {
        this.ad();
        if (this.G.k.equals((Object)azc)) {
            return;
        }
        final bfn c = this.G.c(azc);
        ++this.n;
        this.O.a.f(4, (Object)azc).r();
        this.ah(c, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }
}
