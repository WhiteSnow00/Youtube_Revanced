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

public final class bew extends axv implements bei
{
    public axt A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ayb E;
    public ayw F;
    public bfm G;
    public int H;
    public long I;
    public final adfr J;
    final aetc K;
    private final Context M;
    private final bfq[] N;
    private final bez O;
    private final CopyOnWriteArraySet P;
    private final boolean Q;
    private final bnv R;
    private final brd S;
    private final bac T;
    private final long U;
    private int V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;
    private float aa;
    private bse ab;
    private boolean ac;
    private boolean ad;
    private final gpd ae;
    private eg af;
    private agmd ag;
    private final qpt ah;
    final azc b;
    public final azg c;
    public final bra d;
    public final baj e;
    public final azj f;
    public final List g;
    public final bfz h;
    public final Looper i;
    public final bet j;
    public final beu k;
    public final bdv l;
    public final bfy m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public bfu r;
    public azc s;
    public ayw t;
    public Object u;
    public Surface v;
    public SurfaceHolder w;
    public bsp x;
    public boolean y;
    public int z;
    
    static {
        ayu.a("media3.exoplayer");
    }
    
    public bew(final beh beh) {
        this.ae = new gpd((byte[])null);
        try {
            Integer.toHexString(System.identityHashCode(this));
            final int a = baw.a;
            bao.f();
            this.M = beh.a.getApplicationContext();
            this.h = (bfz)beh.h.apply((Object)beh.b);
            this.ag = beh.s;
            this.A = beh.j;
            this.X = beh.k;
            this.B = false;
            this.U = beh.o;
            final bet j = new bet(this);
            this.j = j;
            this.k = new beu();
            final Handler handler = new Handler(beh.i);
            final bfq[] sf = ((bft)beh.c.a()).sF(handler, (bsn)j, (bhd)j, (bqa)j, (bmo)j);
            this.N = sf;
            dk.h(sf.length > 0);
            this.d = (bra)beh.e.a();
            this.R = (bnv)beh.d.a();
            this.S = (brd)beh.g.a();
            this.Q = beh.l;
            this.r = beh.m;
            this.W = false;
            final Looper i = beh.i;
            this.i = i;
            final bac b = beh.b;
            this.T = b;
            this.c = (azg)this;
            this.J = new adfr(i, b, (bam)new bep(this));
            this.P = new CopyOnWriteArraySet();
            this.g = new ArrayList();
            this.af = new eg();
            final int length = sf.length;
            this.K = new aetc(new bfs[length], new bqv[length], azq.a, (Object)null);
            this.f = new azj();
            final sin sin = new sin((char[])null, (byte[])null);
            for (int k = 0; k < 21; ++k) {
                sin.o((new int[] { 1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28 })[k]);
            }
            axr.d(29, this.d.j(), sin);
            final azc b2 = axr.b(sin);
            this.b = b2;
            final sin sin2 = new sin((char[])null, (byte[])null);
            axr.c(b2, sin2);
            sin2.o(4);
            sin2.o(10);
            this.s = axr.b(sin2);
            this.e = this.T.b(this.i, (Handler$Callback)null);
            final qpt ah = new qpt(this);
            this.ah = ah;
            this.G = bfm.g(this.K);
            this.h.X(this.c, this.i);
            bgz a2;
            if (baw.a < 31) {
                a2 = new bgz();
            }
            else {
                a2 = beq.a(this.M, this, beh.p);
            }
            this.O = new bez(this.N, this.d, this.K, (bfb)beh.f.a(), this.S, this.V, this.h, this.r, beh.r, beh.n, this.W, this.i, this.T, ah, a2, null, null, null, null, null, null, null);
            this.aa = 1.0f;
            this.V = 0;
            final ayw a3 = ayw.a;
            this.t = a3;
            this.F = a3;
            this.H = -1;
            this.z = baw.f(this.M);
            final int b3 = azy.b;
            this.C = true;
            this.s((aze)this.h);
            this.S.g(new Handler(this.i), (brc)this.h);
            this.J((bef)this.j);
            beh.a.getApplicationContext();
            new bds(handler);
            this.l = new bdv(beh.a, (bdu)this.j);
            bdv.b();
            final bfy m = new bfy(beh.a, handler, (bfw)this.j);
            (this.m = m).a(baw.n(this.A.c));
            final PowerManager powerManager = (PowerManager)beh.a.getApplicationContext().getSystemService("power");
            final WifiManager wifiManager = (WifiManager)beh.a.getApplicationContext().getSystemService("wifi");
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
    
    public static ayb S(final bfy bfy) {
        int streamMinVolume;
        if (baw.a >= 28) {
            streamMinVolume = bfy.c.getStreamMinVolume(bfy.e);
        }
        else {
            streamMinVolume = 0;
        }
        return new ayb(streamMinVolume, bfy.c.getStreamMaxVolume(bfy.e));
    }
    
    public static boolean ae(final bfm bfm) {
        return bfm.d == 3 && bfm.i && bfm.j == 0;
    }
    
    private final int ai() {
        if (this.G.a.p()) {
            return this.H;
        }
        final bfm g = this.G;
        return g.a.n(g.q.a, this.f).c;
    }
    
    private final long aj(final bfm bfm) {
        if (bfm.a.p()) {
            return baw.w(this.I);
        }
        if (bfm.q.a()) {
            return bfm.o;
        }
        return this.af(bfm.a, bfm.q, bfm.o);
    }
    
    private static long ak(final bfm bfm) {
        final azk azk = new azk();
        final azj azj = new azj();
        bfm.a.n(bfm.q.a, azj);
        final long b = bfm.b;
        long m;
        if (b == -9223372036854775807L) {
            m = bfm.a.o(azj.c, azk).m;
        }
        else {
            m = azj.e + b;
        }
        return m;
    }
    
    private final Pair al(final azl azl, final int h, long a) {
        if (azl.p()) {
            this.H = h;
            long i = a;
            if (a == -9223372036854775807L) {
                i = 0L;
            }
            this.I = i;
            return null;
        }
        int g;
        if (h == -1 || (g = h) >= azl.c()) {
            g = azl.g(false);
            a = azl.o(g, this.a).a();
        }
        return azl.k(this.a, this.f, g, baw.w(a));
    }
    
    private final bfm am(bfm f, final azl azl, final Pair pair) {
        dk.f(azl.p() || pair != null);
        final azl a = f.a;
        final bfm e = f.e(azl);
        if (azl.p()) {
            final ayx p3 = bfm.p;
            final long w = baw.w(this.I);
            f = e.h(p3, w, w, w, 0L, bpd.a, this.K, (List)afcr.q()).f(p3);
            f.m = f.o;
            return f;
        }
        final Object a2 = e.q.a;
        final int a3 = baw.a;
        final boolean b = a2.equals(pair.first) ^ true;
        ayx q;
        if (b) {
            q = new ayx(pair.first);
        }
        else {
            q = e.q;
        }
        final long longValue = (long)pair.second;
        long w2;
        final long n = w2 = baw.w(this.n());
        if (!a.p()) {
            w2 = n - a.n(a2, this.f).e;
        }
        bfm bfm;
        if (!b && longValue >= w2) {
            if (longValue == w2) {
                final int a4 = azl.a(e.r.a);
                if (a4 != -1) {
                    bfm = e;
                    if (azl.m(a4, this.f).c == azl.n(q.a, this.f).c) {
                        return bfm;
                    }
                }
                azl.n(q.a, this.f);
                long m;
                if (q.a()) {
                    m = this.f.e(q.b, q.c);
                }
                else {
                    m = this.f.d;
                }
                bfm = e.h(q, e.o, e.o, e.c, m - e.o, e.g, e.s, e.h).f(q);
                bfm.m = m;
            }
            else {
                dk.h(q.a() ^ true);
                final long max = Math.max(0L, e.n - (longValue - w2));
                long i = e.m;
                if (e.r.equals((Object)e.q)) {
                    i = longValue + max;
                }
                bfm = e.h(q, longValue, longValue, longValue, max, e.g, e.s, e.h);
                bfm.m = i;
            }
        }
        else {
            dk.h(q.a() ^ true);
            bpd bpd;
            if (b) {
                bpd = bpd.a;
            }
            else {
                bpd = e.g;
            }
            aetc aetc;
            if (b) {
                aetc = this.K;
            }
            else {
                aetc = e.s;
            }
            final ayx ayx = q;
            Object o;
            if (b) {
                o = afcr.q();
            }
            else {
                o = e.h;
            }
            bfm = e.h(ayx, longValue, longValue, longValue, 0L, bpd, aetc, (List)o).f(ayx);
            bfm.m = longValue;
        }
        return bfm;
    }
    
    private final void an() {
        final azc s = this.s;
        final azc j = baw.J(this.c, this.b);
        this.s = j;
        if (!j.equals((Object)s)) {
            this.J.j(13, (bal)new bel(this, 11));
        }
    }
    
    private final void ao(final bee bee) {
        final bfm g = this.G;
        final bfm f = g.f(g.q);
        f.m = f.o;
        f.n = 0L;
        bfm bfm2;
        final bfm bfm = bfm2 = f.d(1);
        if (bee != null) {
            bfm2 = bfm.b(bee);
        }
        ++this.n;
        this.O.a.e(6).r();
        this.ah(bfm2, 0, 1, false, bfm2.a.p() && !this.G.a.p(), 4, this.aj(bfm2), -1);
    }
    
    public final void A(final int v) {
        this.ad();
        if (this.V != v) {
            this.V = v;
            this.O.a.g(11, v, 0).r();
            this.J.j(8, (bal)new bgn(v, 1));
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
        a = baw.a(a, 0.0f, 1.0f);
        if (this.aa == a) {
            return;
        }
        this.aa = a;
        this.Y();
        this.J.m(22, (bal)new beo(a));
    }
    
    public final void D() {
        this.ad();
        this.ad();
        this.l.c(this.E());
        this.ao(null);
        final afcr q = afcr.q();
        final long o = this.G.o;
        new azy((List)q);
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
        for (int i = 0; i < ((afgh)list).c; ++i) {
            list2.add(this.R.a((ayt)list.get(i)));
        }
        this.ag(list2);
    }
    
    public final void H() {
        this.ad();
    }
    
    public final void I(final bgb bgb) {
        final bfz h = this.h;
        dk.d((Object)bgb);
        h.G(bgb);
    }
    
    public final void J(final bef bef) {
        this.P.add(bef);
    }
    
    public final void K(final bse bse) {
        this.ad();
        if (this.ab != bse) {
            return;
        }
        final bfp u = this.U((bfo)this.k);
        u.g(7);
        u.f((Object)null);
        u.e();
    }
    
    public final void L(final boolean b) {
        this.ad();
        this.O.a.g(24, (int)(b ? 1 : 0), 0).r();
        final Iterator iterator = this.P.iterator();
        while (iterator.hasNext()) {
            ((bef)iterator.next()).b();
        }
    }
    
    public final void M(final bnx bnx) {
        this.ad();
        final List<bnx> singletonList = Collections.singletonList(bnx);
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
    
    public final void O(final bfu bfu) {
        this.ad();
        bfu c = bfu;
        if (bfu == null) {
            c = bfu.c;
        }
        if (!this.r.equals((Object)c)) {
            this.r = c;
            this.O.a.f(5, (Object)c).r();
        }
    }
    
    public final void P(final bse ab) {
        this.ad();
        this.ab = ab;
        final bfp u = this.U((bfo)this.k);
        u.g(7);
        u.f((Object)ab);
        u.e();
    }
    
    public final void Q(final agmd ag) {
        this.ad();
        if (baw.aa((Object)this.ag, (Object)ag)) {
            return;
        }
        if (this.ad) {
            final agmd ag2 = this.ag;
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
    
    public final ayw T() {
        final azl q = this.q();
        if (q.p()) {
            return this.F;
        }
        final ayt c = q.o(this.j(), this.a).c;
        final ayv a = this.F.a();
        final ayw d = c.d;
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
    
    public final bfp U(final bfo bfo) {
        int ai = this.ai();
        final bez o = this.O;
        final azl a = this.G.a;
        if (ai == -1) {
            ai = 0;
        }
        return new bfp((bfn)o, bfo, a, ai, o.b);
    }
    
    public final void V(final int y, final int z) {
        if (y == this.Y && z == this.Z) {
            return;
        }
        this.Y = y;
        this.Z = z;
        this.J.m(24, (bal)new bej(y, z));
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
        final bfp u = this.U((bfo)this.k);
        u.g(10000);
        u.f((Object)null);
        u.e();
        throw null;
    }
    
    public final void X(final int n, final int n2, final Object o) {
        for (final bfq bfq : this.N) {
            if (bfq.h() == n) {
                final bfp u = this.U((bfo)bfq);
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
            final bfj bfj = new bfj((bnx)list.get(j), this.Q);
            list2.add(bfj);
            this.g.add(j, new bev(bfj.b, (azl)bfj.a.b));
        }
        this.af = this.af.w(list2.size());
        final bdr bdr = new bdr(this.g, this.af, null, null);
        if (!bdr.p() && g >= bdr.b) {
            throw new ayg();
        }
        if (b) {
            g = bdr.g(false);
            w = -9223372036854775807L;
        }
        else if (g == -1) {
            g = ai;
            w = o;
        }
        final bfm am = this.am(this.G, bdr, this.al(bdr, g, w));
        int d = am.d;
        if (g != -1 && (d = d) != 1) {
            final boolean p4 = bdr.p();
            final int n6 = d = 4;
            if (!p4) {
                if (g >= bdr.b) {
                    d = n6;
                }
                else {
                    d = 2;
                }
            }
        }
        final bfm d2 = am.d(d);
        final bez o2 = this.O;
        w = baw.w(w);
        o2.a.f(17, (Object)new bny((List)list2, this.af, g, w, (byte[])null, (byte[])null)).r();
        this.ah(d2, 0, 1, false, !this.G.q.a.equals(d2.q.a) && !this.G.a.p() && b2, 4, this.aj(d2), -1);
    }
    
    public final Looper a() {
        return this.O.b;
    }
    
    public final void aa(final Object u) {
        final ArrayList list = new ArrayList();
        final bfq[] n = this.N;
        final int length = n.length;
        final boolean b = false;
        final int n2 = 0;
        for (final bfq bfq : n) {
            if (bfq.h() == 2) {
                final bfp u2 = this.U((bfo)bfq);
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
                        ((bfp)iterator.next()).c(this.U);
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
            this.ao(bee.b((RuntimeException)new bfa(3), 1003));
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
        final bfm g = this.G;
        if ((g.i ? 1 : 0) == n && g.j == n6) {
            return;
        }
        ++this.n;
        final bfm a = g.a((boolean)(n != 0), n6);
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
        final String m = baw.M("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", new Object[] { Thread.currentThread().getName(), this.i.getThread().getName() });
        if (!this.C) {
            Throwable t;
            if (this.ac) {
                t = null;
            }
            else {
                t = new IllegalStateException();
            }
            bao.d("ExoPlayerImpl", m, t);
            this.ac = true;
            return;
        }
        throw new IllegalStateException(m);
    }
    
    public final long af(final azl azl, final ayx ayx, final long n) {
        azl.n(ayx.a, this.f);
        return n + this.f.e;
    }
    
    public final void ag(final List list) {
        this.ad();
        this.Z(list, -1, -9223372036854775807L, true);
    }
    
    public final void ah(final bfm g, int n, final int n2, final boolean b, final boolean b2, final int n3, long a, int n4) {
        final bfm g2 = this.G;
        this.G = g;
        final boolean equals = g2.a.equals((Object)g.a);
        final Boolean value = true;
        final boolean b3 = equals ^ true;
        final azl a2 = g2.a;
        final azl a3 = g.a;
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
        ayw t = this.t;
        ayt c;
        if (booleanValue) {
            if (!g.a.p()) {
                c = g.a.o(g.a.n(g.q.a, this.f).c, this.a).c;
            }
            else {
                c = null;
            }
            this.F = ayw.a;
        }
        else {
            c = null;
        }
        if (booleanValue || !adwd.ar(g2.h, (Object)g.h)) {
            final ayv a4 = this.F.a();
            final List h = g.h;
            for (int i = 0; i < ((afgh)h).c; ++i) {
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
            final agmd ag = this.ag;
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
            this.J.j(0, (bal)new bek(g, n, 1));
        }
        if (b2) {
            final azj azj = new azj();
            Object a5;
            Object b7;
            ayt c2;
            if (!g2.a.p()) {
                a5 = g2.q.a;
                g2.a.n(a5, azj);
                n4 = azj.c;
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
                        final ayx q = g2.q;
                        n6 = azj.e(q.b, q.c);
                        n7 = ak(g2);
                        break Label_0984;
                    }
                    if (g2.q.e != -1) {
                        n6 = ak(this.G);
                    }
                    else {
                        n6 = azj.d + azj.e;
                    }
                }
                else {
                    if (g2.q.a()) {
                        n6 = g2.o;
                        n7 = ak(g2);
                        break Label_0984;
                    }
                    n6 = azj.e + g2.o;
                }
                n7 = n6;
            }
            final long a6 = baw.A(n6);
            final ayx q2 = g2.q;
            final azf azf = new azf(b7, n4, c2, a5, n, a6, baw.A(n7), q2.b, q2.c);
            n4 = this.j();
            Object a7;
            Object b8;
            ayt c3;
            if (!this.G.a.p()) {
                final bfm g3 = this.G;
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
            final long a8 = baw.A(a);
            if (this.G.q.a()) {
                a = baw.A(ak(this.G));
            }
            else {
                a = a8;
            }
            final ayx q3 = this.G.q;
            this.J.j(11, (bal)new ben(n3, azf, new azf(b8, n4, c3, a7, n, a8, a, q3.b, q3.c)));
        }
        if (booleanValue) {
            this.J.j(1, (bal)new bek(c, intValue, 2));
        }
        if (g2.e != g.e) {
            this.J.j(10, (bal)new bel(g, 4));
            if (g.e != null) {
                this.J.j(10, (bal)new bel(g, 5));
            }
        }
        final aetc s = g2.s;
        final aetc s2 = g.s;
        if (s != s2) {
            this.d.m(s2.d);
            this.J.j(2, (bal)new bel(g, 6));
        }
        if (equals2 ^ true) {
            this.J.j(14, (bal)new bel(this.t, 7));
        }
        if (b6) {
            this.J.j(3, (bal)new bel(g, 8));
        }
        if (b5 || b4) {
            this.J.j(-1, (bal)new bel(g, 9));
        }
        if (b5) {
            this.J.j(4, (bal)new bel(g, 10));
        }
        if (b4) {
            this.J.j(5, (bal)new bek(g, n2, 0));
        }
        if (g2.j != g.j) {
            this.J.j(6, (bal)new bel(g, 1));
        }
        if (ae(g2) != ae(g)) {
            this.J.j(7, (bal)new bel(g, 0));
        }
        if (!g2.k.equals((Object)g.k)) {
            this.J.j(12, (bal)new bel(g, 2));
        }
        if (b) {
            this.J.j(-1, (bal)bem.a);
        }
        this.an();
        this.J.i();
        if (g2.l != g.l) {
            final Iterator iterator = this.P.iterator();
            while (iterator.hasNext()) {
                ((bef)iterator.next()).a(g.l);
            }
        }
    }
    
    public final bfp b(final bfo bfo) {
        this.ad();
        return this.U(bfo);
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
            final bfm g = this.G;
            g.a.n(g.q.a, this.f);
            final bfm g2 = this.G;
            long a;
            if (g2.b == -9223372036854775807L) {
                a = g2.a.o(this.j(), this.a).a();
            }
            else {
                a = this.f.f() + baw.A(this.G.b);
            }
            return a;
        }
        return this.o();
    }
    
    public final long o() {
        this.ad();
        return baw.A(this.aj(this.G));
    }
    
    public final long p() {
        this.ad();
        if (this.F()) {
            final bfm g = this.G;
            final ayx q = g.q;
            g.a.n(q.a, this.f);
            return baw.A(this.f.e(q.b, q.c));
        }
        final azl q2 = this.q();
        if (q2.p()) {
            return -9223372036854775807L;
        }
        return q2.o(this.j(), super.a).b();
    }
    
    public final azl q() {
        this.ad();
        return this.G.a;
    }
    
    public final azq r() {
        this.ad();
        return (azq)this.G.s.e;
    }
    
    public final void s(final aze aze) {
        final adfr j = this.J;
        dk.d((Object)aze);
        j.h((Object)aze);
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
        final bfm g = this.G;
        if (g.d != 1) {
            return;
        }
        final bfm b = g.b((bee)null);
        int n;
        if (!b.a.p()) {
            n = 2;
        }
        else {
            n = 4;
        }
        final bfm d = b.d(n);
        ++this.n;
        this.O.a.e(0).r();
        this.ah(d, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }
    
    public final void v() {
        Integer.toHexString(System.identityHashCode(this));
        final int a = baw.a;
        final int a2 = ayu.a;
        bao.f();
        this.ad();
        final bfy m = this.m;
        final bfx d = m.d;
        if (d != null) {
            try {
                m.a.unregisterReceiver((BroadcastReceiver)d);
            }
            catch (final RuntimeException ex) {
                bao.d("StreamVolumeManager", "Error unregistering stream volume receiver", (Throwable)ex);
            }
            m.d = null;
        }
        final bdv l = this.l;
        l.a = null;
        l.a();
        if (!this.O.e()) {
            this.J.m(10, (bal)bem.b);
        }
        this.J.k();
        ((bat)this.e).b.removeCallbacksAndMessages((Object)null);
        this.S.h((brc)this.h);
        final bfm d2 = this.G.d(1);
        this.G = d2;
        final bfm f = d2.f(d2.q);
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
            final agmd ag = this.ag;
            dk.d((Object)ag);
            ag.E(0);
            this.ad = false;
        }
        final int b = azy.b;
        this.D = true;
    }
    
    public final void w(final aze aze) {
        dk.d((Object)aze);
        this.J.l((Object)aze);
    }
    
    public final void x(final int n, long w) {
        this.ad();
        this.h.H();
        final azl a = this.G.a;
        if (n < 0 || (!a.p() && n >= a.c())) {
            throw new ayg();
        }
        final int n2 = this.n;
        int n3 = 1;
        this.n = n2 + 1;
        if (this.F()) {
            bao.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            final lzz lzz = new lzz(this.G);
            lzz.b(1);
            this.ah.aa(lzz);
            return;
        }
        if (this.k() != 1) {
            n3 = 2;
        }
        final int j = this.j();
        final bfm am = this.am(this.G.d(n3), a, this.al(a, n, w));
        final bez o = this.O;
        w = baw.w(w);
        o.a.f(3, (Object)new bey(a, n, w)).r();
        this.ah(am, 0, 1, true, true, 1, this.aj(am), j);
    }
    
    public final void y(final boolean b) {
        this.ad();
        final bdv l = this.l;
        this.k();
        final int c = l.c(b);
        this.ab(b, c, R(b, c));
    }
    
    public final void z(final azb azb) {
        this.ad();
        if (this.G.k.equals((Object)azb)) {
            return;
        }
        final bfm c = this.G.c(azb);
        ++this.n;
        this.O.a.f(4, (Object)azb).r();
        this.ah(c, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }
}
