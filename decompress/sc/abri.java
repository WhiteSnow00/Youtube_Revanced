import java.util.function.Consumer;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.youtube.player.stats.VideoStats3Client$VideoStats3ClientState;
import j$.util.Optional;
import java.util.concurrent.ScheduledFuture;
import com.google.android.libraries.youtube.innertube.model.player.Vss3ConfigModel;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abri
{
    public long A;
    public boolean B;
    public final boolean C;
    public boolean D;
    public final boolean E;
    public ahaz F;
    public ahaz G;
    private final tjm H;
    private final wxx I;
    private final ahab J;
    private final boolean K;
    private apsd L;
    private final ScheduledExecutorService M;
    private boolean N;
    private long O;
    public final tvl a;
    public aptc b;
    public final Vss3ConfigModel c;
    public final oby d;
    public final long e;
    public long f;
    public final Runnable g;
    public ScheduledFuture h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public float n;
    public final String o;
    public final String p;
    public String q;
    public Optional r;
    public long s;
    public int t;
    public long u;
    public final boolean v;
    public final boolean w;
    public abkd x;
    public apta y;
    public aamh z;
    
    public abri(final ScheduledExecutorService scheduledExecutorService, final tjm tjm, final tvl tvl, final oby oby, final wxx wxx, final abjj abjj, final apsd apsd, final VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState) {
        this(scheduledExecutorService, tjm, wxx, tvl, oby, apsd, videoStats3Client$VideoStats3ClientState.d, videoStats3Client$VideoStats3ClientState.c, videoStats3Client$VideoStats3ClientState.i, videoStats3Client$VideoStats3ClientState.b, videoStats3Client$VideoStats3ClientState.j, videoStats3Client$VideoStats3ClientState.k, videoStats3Client$VideoStats3ClientState.g, videoStats3Client$VideoStats3ClientState.h, videoStats3Client$VideoStats3ClientState.f, videoStats3Client$VideoStats3ClientState.l, videoStats3Client$VideoStats3ClientState.m, abjj.r, abjj.c(), videoStats3Client$VideoStats3ClientState.n, videoStats3Client$VideoStats3ClientState.o, videoStats3Client$VideoStats3ClientState.p, videoStats3Client$VideoStats3ClientState.w, videoStats3Client$VideoStats3ClientState.x, videoStats3Client$VideoStats3ClientState.q, videoStats3Client$VideoStats3ClientState.r, videoStats3Client$VideoStats3ClientState.s, videoStats3Client$VideoStats3ClientState.t, videoStats3Client$VideoStats3ClientState.u, videoStats3Client$VideoStats3ClientState.v);
        this.s = videoStats3Client$VideoStats3ClientState.e;
    }
    
    public abri(final ScheduledExecutorService m, final tjm h, final wxx i, final tvl a, final oby d, final apsd l, final String o, final String p30, final float n, final long j, final String q, final Optional r, final int t, final long u, final boolean k, final boolean v, final boolean w, final abkd x, final aamh z, final Vss3ConfigModel c, final boolean b, final long e, final ahaz g, final ahaz f, final aptc b2, final long f2, final boolean c2, final boolean d2, final apta y, final boolean e2) {
        this.g = (Runnable)new abei(this, 19);
        this.h = null;
        this.M = m;
        this.H = h;
        this.I = i;
        this.a = a;
        this.d = d;
        this.L = l;
        this.o = o;
        this.p = p30;
        this.n = n;
        this.l = j;
        this.q = q;
        this.r = r;
        this.t = t;
        this.u = u;
        this.j = k;
        this.v = v;
        this.w = w;
        this.x = x;
        this.z = z;
        this.s = 0L;
        this.c = c;
        this.B = b;
        this.e = e;
        this.G = g;
        this.F = f;
        this.b = b2;
        this.f = f2;
        this.J = c.f;
        this.K = c.a;
        this.C = c2;
        this.D = d2;
        this.y = y;
        this.E = e2;
        a.a();
    }
    
    public static boolean j(final int n) {
        return n == 0;
    }
    
    private static float l(final long n) {
        final double n2 = (double)((n + 50L) / 100L * 100L);
        Double.isNaN(n2);
        return (float)(n2 / 1000.0);
    }
    
    private final int m(final long n) {
        synchronized (this) {
            if (this.b.isInitialized()) {
                aptb aptb;
                if ((aptb = this.b.h) == null) {
                    aptb = aptb.a;
                }
                if (aptb.g > 0) {
                    aptb aptb2;
                    if ((aptb2 = this.b.h) == null) {
                        aptb2 = aptb.a;
                    }
                    return aptb2.g;
                }
            }
            if (this.b.isInitialized()) {
                apta apta;
                if ((apta = apta.b(this.b.k)) == null) {
                    apta = apta.a;
                }
                if (apta == apta.c) {
                    final int e = this.c.e;
                    if (e > 0) {
                        return e;
                    }
                }
            }
            final long o = this.O;
            if (o > 0L) {
                final Vss3ConfigModel c = this.c;
                if ((int)l(n - o) < c.d) {
                    return c.c;
                }
            }
            return this.c.b;
        }
    }
    
    private final long n() {
        final long m = this.m;
        final long l = this.l;
        long i = m;
        if (m > l) {
            i = m;
            if (l != 0L) {
                final StringBuilder sb = new StringBuilder("Reported playback position ");
                sb.append(m);
                sb.append(" is greater than the duration of the video ");
                sb.append(l);
                ttr.l(sb.toString());
                i = this.l;
            }
        }
        return i;
    }
    
    private final void o() {
        synchronized (this) {
            final ScheduledFuture h = this.h;
            if (h != null) {
                h.cancel(true);
                this.h = null;
            }
        }
    }
    
    private final void p(final long n) {
        synchronized (this) {
            if (((aptb)this.G.instance).d) {
                return;
            }
            final aptc aptc = (aptc)this.F.instance;
            if ((aptc.b & 0x100) != 0x0) {
                apta apta;
                if ((apta = apta.b(aptc.k)) == null) {
                    apta = apta.a;
                }
                if (apta == apta.c) {
                    final ahaz g = this.G;
                    final int e = this.c.e;
                    g.copyOnWrite();
                    final aptb aptb = (aptb)g.instance;
                    aptb.b |= 0x20;
                    aptb.g = e;
                    return;
                }
                if (apta == apta.g || apta == apta.i) {
                    return;
                }
                final long o = this.O;
                if (o > 0L) {
                    final Vss3ConfigModel c = this.c;
                    final int c2 = c.c;
                    if (c2 > 0 && (int)l(n - o) < c.d) {
                        final ahaz g2 = this.G;
                        g2.copyOnWrite();
                        final aptb aptb2 = (aptb)g2.instance;
                        aptb2.b |= 0x20;
                        aptb2.g = c2;
                        return;
                    }
                    final ahaz g3 = this.G;
                    final int b = c.b;
                    g3.copyOnWrite();
                    final aptb aptb3 = (aptb)g3.instance;
                    aptb3.b |= 0x20;
                    aptb3.g = b;
                }
            }
        }
    }
    
    private final void q() {
        final ahaz g = this.G;
        final boolean k = this.K;
        g.copyOnWrite();
        final aptb aptb = (aptb)g.instance;
        final aptb a = aptb.a;
        aptb.b |= 0x40;
        aptb.h = k;
        final ahaz f = this.F;
        final String o = this.o;
        f.copyOnWrite();
        final aptc aptc = (aptc)f.instance;
        final aptc a2 = aptc.a;
        o.getClass();
        aptc.b |= 0x1;
        aptc.c = o;
        final String p = this.p;
        f.copyOnWrite();
        final aptc aptc2 = (aptc)f.instance;
        p.getClass();
        aptc2.b |= 0x2;
        aptc2.d = p;
        final aimb aimb = aimb.values()[this.H.a()];
        f.copyOnWrite();
        final aptc aptc3 = (aptc)f.instance;
        aptc3.m = aimb.o;
        aptc3.b |= 0x400;
        final float l = l(this.l);
        f.copyOnWrite();
        final aptc aptc4 = (aptc)f.instance;
        aptc4.b |= 0x10;
        aptc4.g = l;
        final int b = this.a.b;
        f.copyOnWrite();
        final aptc aptc5 = (aptc)f.instance;
        aptc5.b |= 0x1000;
        aptc5.o = b;
        final ahab j = this.J;
        f.copyOnWrite();
        final aptc aptc6 = (aptc)f.instance;
        j.getClass();
        aptc6.b |= 0x40;
        aptc6.i = j;
        if (this.x == abkd.b) {
            final ahaz f2 = this.F;
            f2.copyOnWrite();
            final aptc aptc7 = (aptc)f2.instance;
            aptc7.b |= 0x2000;
            aptc7.p = true;
        }
        if (this.j) {
            final ahaz f3 = this.F;
            f3.copyOnWrite();
            final aptc aptc8 = (aptc)f3.instance;
            aptc8.b |= 0x4000;
            aptc8.q = true;
        }
        if (this.z.e()) {
            final ahaz f4 = this.F;
            f4.copyOnWrite();
            final aptc aptc9 = (aptc)f4.instance;
            aptc9.b |= 0x8000;
            aptc9.r = true;
        }
        if (this.z.d().i != abjv.h.i) {
            final ahaz f5 = this.F;
            final int n = (new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 32 })[this.z.d().i];
            f5.copyOnWrite();
            final aptc aptc10 = (aptc)f5.instance;
            if (n == 0) {
                throw null;
            }
            aptc10.n = n - 1;
            aptc10.b |= 0x800;
        }
        final apsd i = this.L;
        if (i != null && (i.b & 0x1) != 0x0) {
            final ahaz f6 = this.F;
            final ahab a3 = ahab.A(i.c);
            f6.copyOnWrite();
            final aptc aptc11 = (aptc)f6.instance;
            aptc11.b |= 0x80;
            aptc11.j = a3;
        }
    }
    
    private final void r(final int n) {
        monitorenter(this);
        Label_0046: {
            if (n > 0) {
                break Label_0046;
            }
            try {
                final StringBuilder sb = new StringBuilder("ERROR: maxSegmentLengthMillis ");
                sb.append(n);
                sb.append(" <= 0 and cannot be scheduled");
                ttr.b(sb.toString());
                return;
                iftrue(Label_0089:)(this.h != null);
                Block_3: {
                    break Block_3;
                    Label_0089: {
                        return;
                    }
                }
                final ScheduledExecutorService m = this.M;
                final Runnable g = this.g;
                final long n2 = n;
                this.h = m.scheduleAtFixedRate(g, n2, n2, TimeUnit.MILLISECONDS);
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    private final void s(final long f) {
        synchronized (this) {
            this.f = f;
            final ahaz builder = aptc.a.createBuilder();
            final float l = l(this.n());
            builder.copyOnWrite();
            final aptc aptc = (aptc)builder.instance;
            aptc.b |= 0x4;
            aptc.e = l;
            this.F = builder;
            this.G = aptb.a.createBuilder();
            final aptc b = this.b;
            if ((b.b & 0x20) != 0x0) {
                final aptb h = b.h;
                aptb a;
                if (h == null) {
                    a = aptb.a;
                }
                else {
                    a = h;
                }
                if (a.g > 0) {
                    final ahaz g = this.G;
                    aptb a2;
                    if ((a2 = h) == null) {
                        a2 = aptb.a;
                    }
                    final int g2 = a2.g;
                    g.copyOnWrite();
                    final aptb aptb = (aptb)g.instance;
                    aptb.b |= 0x10;
                    aptb.f = g2;
                }
            }
            this.r(this.m(f) * 1000);
            this.y = apta.b;
            this.k = true;
            this.q();
        }
    }
    
    public final void a(final boolean b, long a) {
        synchronized (this) {
            if (this.D) {
                ttr.n("finishWatchTimeSegment called after client was already released.", (Throwable)new Exception());
                return;
            }
            final boolean k = this.k;
            if (!k && b) {
                this.q();
                final ahaz f = this.F;
                final float l = l(this.n());
                f.copyOnWrite();
                final aptc aptc = (aptc)f.instance;
                final aptc a2 = aptc.a;
                aptc.b |= 0x4;
                aptc.e = l;
                final ahaz g = this.G;
                g.copyOnWrite();
                final aptb aptb = (aptb)g.instance;
                final aptb a3 = aptb.a;
                aptb.b &= 0xFFFFFFDF;
                aptb.g = 0;
                g.copyOnWrite();
                final aptb aptb2 = (aptb)g.instance;
                aptb2.b &= 0xFFFFFFF7;
                aptb2.e = 0L;
            }
            else if (!k || this.B) {
                return;
            }
            if (((aptc)this.F.instance).e == -1.0f) {
                ttr.b("Attempting to finish a WatchTimeSegment with an unset start time");
                return;
            }
            final float i = l(this.n());
            final float e = ((aptc)this.F.instance).e;
            if ((this.s > 0L && i - e > 0.0f) || b) {
                final long f2 = this.f;
                if (f2 > 0L) {
                    final ahaz g2 = this.G;
                    g2.copyOnWrite();
                    final aptb aptb3 = (aptb)g2.instance;
                    final aptb a4 = aptb.a;
                    aptb3.b |= 0x8;
                    aptb3.e = a - f2;
                }
                final ahaz g3 = this.G;
                aptb aptb4;
                if ((aptb4 = this.b.h) == null) {
                    aptb4 = aptb.a;
                }
                final int c = aptb4.c;
                final boolean b2 = true;
                g3.copyOnWrite();
                final aptb aptb5 = (aptb)g3.instance;
                aptb5.b |= 0x1;
                aptb5.c = c + 1;
                final ahaz f3 = this.F;
                final float j = l(this.n());
                f3.copyOnWrite();
                final aptc aptc2 = (aptc)f3.instance;
                aptc2.b |= 0x8;
                aptc2.f = j;
                final float m = l(this.l);
                f3.copyOnWrite();
                final aptc aptc3 = (aptc)f3.instance;
                aptc3.b |= 0x10;
                aptc3.g = m;
                final apta y = this.y;
                f3.copyOnWrite();
                final aptc aptc4 = (aptc)f3.instance;
                aptc4.k = y.k;
                aptc4.b |= 0x100;
                if (b) {
                    final ahaz g4 = this.G;
                    g4.copyOnWrite();
                    final aptb aptb6 = (aptb)g4.instance;
                    aptb6.b |= 0x2;
                    aptb6.d = true;
                }
                this.p(a);
                final ahaz f4 = this.F;
                final aptb h = (aptb)this.G.build();
                f4.copyOnWrite();
                final aptc aptc5 = (aptc)f4.instance;
                h.getClass();
                aptc5.h = h;
                aptc5.b |= 0x20;
                if (this.w) {
                    a = this.A;
                    if (a > 0L) {
                        final ahaz f5 = this.F;
                        f5.copyOnWrite();
                        final aptc aptc6 = (aptc)f5.instance;
                        aptc6.b |= 0x10000;
                        aptc6.s = a * 1000L;
                    }
                }
                if (!TextUtils.equals((CharSequence)this.q, (CharSequence)"-")) {
                    final ahaz f6 = this.F;
                    final String q = this.q;
                    f6.copyOnWrite();
                    final aptc aptc7 = (aptc)f6.instance;
                    q.getClass();
                    aptc7.b |= 0x20000;
                    aptc7.t = q;
                }
                final float n = this.n;
                if (n != 1.0f) {
                    final ahaz f7 = this.F;
                    f7.copyOnWrite();
                    final aptc aptc8 = (aptc)f7.instance;
                    aptc8.b |= 0x200;
                    aptc8.l = n;
                }
                this.r.ifPresent((Consumer)new aaxy(this, 6));
                final apta y2 = this.y;
                boolean b3 = false;
                Label_0958: {
                    if (y2 == apta.f && ((aptb)this.G.instance).c <= 1) {
                        final int c2 = this.c.c;
                        if (c2 > 0) {
                            final aptc aptc9 = (aptc)this.F.instance;
                            if (aptc9.f >= c2 && aptc9.e <= 0.0f) {
                                b3 = true;
                                break Label_0958;
                            }
                        }
                    }
                    b3 = false;
                }
                int n2 = b2 ? 1 : 0;
                if (!b) {
                    if (this.E && y2 != apta.b) {
                        n2 = (b2 ? 1 : 0);
                    }
                    else {
                        n2 = 0;
                    }
                }
                if (!b3) {
                    if (n2 != 0) {
                        final wxx i2 = this.I;
                        final aknr d = aknt.d();
                        final aptc aptc10 = (aptc)this.F.build();
                        ((ahaz)d).copyOnWrite();
                        aknt.cc((aknt)d.instance, aptc10);
                        i2.k((aknt)((ahaz)d).build(), ajdp.e);
                    }
                    else {
                        final wxx i3 = this.I;
                        final aknr d2 = aknt.d();
                        final aptc aptc11 = (aptc)this.F.build();
                        ((ahaz)d2).copyOnWrite();
                        aknt.cc((aknt)d2.instance, aptc11);
                        i3.d((aknt)((ahaz)d2).build());
                    }
                }
                this.b = (aptc)this.F.build();
                this.f = -1L;
            }
            this.o();
            this.k = false;
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.B) {
                this.o();
                return;
            }
            this.a(false, this.d.d());
            this.i(this.d.d());
        }
    }
    
    public final void c() {
        synchronized (this) {
            this.i = false;
            this.y = apta.g;
            this.a(false, this.d.d());
            this.o();
        }
    }
    
    public final void d(final long m) {
        synchronized (this) {
            this.y = apta.f;
            this.a(false, this.d.d());
            this.m = m;
            this.i(this.d.d());
        }
    }
    
    public final void e(final long m) {
        synchronized (this) {
            if (this.i) {
                final StringBuilder sb = new StringBuilder("Warning: unexpected playback play ");
                sb.append(m);
                sb.append(" suppressed");
                ttr.m("VSS3ClientDebug", sb.toString());
                return;
            }
            final long d = this.d.d();
            this.i = true;
            if (!this.N) {
                this.N = true;
                this.O = d;
            }
            this.y = apta.b;
            this.m = m;
            this.i(d);
        }
    }
    
    public final void f() {
        synchronized (this) {
            if (this.i) {
                this.y = apta.i;
                this.a(false, this.d.d());
                this.i = false;
            }
        }
    }
    
    public final void g() {
        synchronized (this) {
            this.y = apta.i;
            this.a(false, this.d.d());
        }
    }
    
    public final void h() {
        synchronized (this) {
            if (this.D) {
                new Exception();
                return;
            }
            if (this.k) {
                new Exception();
                this.g();
            }
            this.D = true;
            this.a.b();
        }
    }
    
    public final void i(final long n) {
        synchronized (this) {
            if (this.i && !this.k) {
                this.s(n);
            }
        }
    }
    
    public final boolean k() {
        return this.u != -1L;
    }
}
