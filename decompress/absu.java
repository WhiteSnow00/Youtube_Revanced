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

public final class absu
{
    public long A;
    public boolean B;
    public final boolean C;
    public boolean D;
    public final boolean E;
    public ahcr F;
    public ahcr G;
    private final tkq H;
    private final wza I;
    private final ahbt J;
    private final boolean K;
    private apup L;
    private final ScheduledExecutorService M;
    private boolean N;
    private long O;
    public final twn a;
    public apvp b;
    public final Vss3ConfigModel c;
    public final oco d;
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
    public ablk x;
    public apvn y;
    public aaoe z;
    
    public absu(final ScheduledExecutorService scheduledExecutorService, final tkq tkq, final twn twn, final oco oco, final wza wza, final abkq abkq, final apup apup, final VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState) {
        this(scheduledExecutorService, tkq, wza, twn, oco, apup, videoStats3Client$VideoStats3ClientState.d, videoStats3Client$VideoStats3ClientState.c, videoStats3Client$VideoStats3ClientState.i, videoStats3Client$VideoStats3ClientState.b, videoStats3Client$VideoStats3ClientState.j, videoStats3Client$VideoStats3ClientState.k, videoStats3Client$VideoStats3ClientState.g, videoStats3Client$VideoStats3ClientState.h, videoStats3Client$VideoStats3ClientState.f, videoStats3Client$VideoStats3ClientState.l, videoStats3Client$VideoStats3ClientState.m, abkq.r, abkq.c(), videoStats3Client$VideoStats3ClientState.n, videoStats3Client$VideoStats3ClientState.o, videoStats3Client$VideoStats3ClientState.p, videoStats3Client$VideoStats3ClientState.w, videoStats3Client$VideoStats3ClientState.x, videoStats3Client$VideoStats3ClientState.q, videoStats3Client$VideoStats3ClientState.r, videoStats3Client$VideoStats3ClientState.s, videoStats3Client$VideoStats3ClientState.t, videoStats3Client$VideoStats3ClientState.u, videoStats3Client$VideoStats3ClientState.v);
        this.s = videoStats3Client$VideoStats3ClientState.e;
    }
    
    public absu(final ScheduledExecutorService m, final tkq h, final wza i, final twn a, final oco d, final apup l, final String o, final String p30, final float n, final long j, final String q, final Optional r, final int t, final long u, final boolean k, final boolean v, final boolean w, final ablk x, final aaoe z, final Vss3ConfigModel c, final boolean b, final long e, final ahcr g, final ahcr f, final apvp b2, final long f2, final boolean c2, final boolean d2, final apvn y, final boolean e2) {
        this.g = (Runnable)new abgl(this, 18);
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
                apvo apvo;
                if ((apvo = this.b.h) == null) {
                    apvo = apvo.a;
                }
                if (apvo.g > 0) {
                    apvo apvo2;
                    if ((apvo2 = this.b.h) == null) {
                        apvo2 = apvo.a;
                    }
                    return apvo2.g;
                }
            }
            if (this.b.isInitialized()) {
                apvn apvn;
                if ((apvn = apvn.b(this.b.k)) == null) {
                    apvn = apvn.a;
                }
                if (apvn == apvn.c) {
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
                tut.l(sb.toString());
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
            if (((apvo)this.G.instance).d) {
                return;
            }
            final apvp apvp = (apvp)this.F.instance;
            if ((apvp.b & 0x100) != 0x0) {
                apvn apvn;
                if ((apvn = apvn.b(apvp.k)) == null) {
                    apvn = apvn.a;
                }
                if (apvn == apvn.c) {
                    final ahcr g = this.G;
                    final int e = this.c.e;
                    g.copyOnWrite();
                    final apvo apvo = (apvo)g.instance;
                    apvo.b |= 0x20;
                    apvo.g = e;
                    return;
                }
                if (apvn == apvn.g || apvn == apvn.i) {
                    return;
                }
                final long o = this.O;
                if (o > 0L) {
                    final Vss3ConfigModel c = this.c;
                    final int c2 = c.c;
                    if (c2 > 0 && (int)l(n - o) < c.d) {
                        final ahcr g2 = this.G;
                        g2.copyOnWrite();
                        final apvo apvo2 = (apvo)g2.instance;
                        apvo2.b |= 0x20;
                        apvo2.g = c2;
                        return;
                    }
                    final ahcr g3 = this.G;
                    final int b = c.b;
                    g3.copyOnWrite();
                    final apvo apvo3 = (apvo)g3.instance;
                    apvo3.b |= 0x20;
                    apvo3.g = b;
                }
            }
        }
    }
    
    private final void q() {
        final ahcr g = this.G;
        final boolean k = this.K;
        g.copyOnWrite();
        final apvo apvo = (apvo)g.instance;
        final apvo a = apvo.a;
        apvo.b |= 0x40;
        apvo.h = k;
        final ahcr f = this.F;
        final String o = this.o;
        f.copyOnWrite();
        final apvp apvp = (apvp)f.instance;
        final apvp a2 = apvp.a;
        o.getClass();
        apvp.b |= 0x1;
        apvp.c = o;
        final String p = this.p;
        f.copyOnWrite();
        final apvp apvp2 = (apvp)f.instance;
        p.getClass();
        apvp2.b |= 0x2;
        apvp2.d = p;
        final ainu ainu = ainu.values()[this.H.a()];
        f.copyOnWrite();
        final apvp apvp3 = (apvp)f.instance;
        apvp3.m = ainu.o;
        apvp3.b |= 0x400;
        final float l = l(this.l);
        f.copyOnWrite();
        final apvp apvp4 = (apvp)f.instance;
        apvp4.b |= 0x10;
        apvp4.g = l;
        final int b = this.a.b;
        f.copyOnWrite();
        final apvp apvp5 = (apvp)f.instance;
        apvp5.b |= 0x1000;
        apvp5.o = b;
        final ahbt j = this.J;
        f.copyOnWrite();
        final apvp apvp6 = (apvp)f.instance;
        j.getClass();
        apvp6.b |= 0x40;
        apvp6.i = j;
        if (this.x == ablk.b) {
            final ahcr f2 = this.F;
            f2.copyOnWrite();
            final apvp apvp7 = (apvp)f2.instance;
            apvp7.b |= 0x2000;
            apvp7.p = true;
        }
        if (this.j) {
            final ahcr f3 = this.F;
            f3.copyOnWrite();
            final apvp apvp8 = (apvp)f3.instance;
            apvp8.b |= 0x4000;
            apvp8.q = true;
        }
        if (this.z.e()) {
            final ahcr f4 = this.F;
            f4.copyOnWrite();
            final apvp apvp9 = (apvp)f4.instance;
            apvp9.b |= 0x8000;
            apvp9.r = true;
        }
        if (this.z.d().i != ablc.h.i) {
            final ahcr f5 = this.F;
            final int n = (new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 32 })[this.z.d().i];
            f5.copyOnWrite();
            final apvp apvp10 = (apvp)f5.instance;
            if (n == 0) {
                throw null;
            }
            apvp10.n = n - 1;
            apvp10.b |= 0x800;
        }
        final apup i = this.L;
        if (i != null && (i.b & 0x1) != 0x0) {
            final ahcr f6 = this.F;
            final ahbt a3 = ahbt.A(i.c);
            f6.copyOnWrite();
            final apvp apvp11 = (apvp)f6.instance;
            apvp11.b |= 0x80;
            apvp11.j = a3;
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
                tut.b(sb.toString());
                return;
                iftrue(Label_0089:)(this.h != null);
                final ScheduledExecutorService m = this.M;
                final Runnable g = this.g;
                final long n2 = n;
                this.h = m.scheduleAtFixedRate(g, n2, n2, TimeUnit.MILLISECONDS);
                return;
                Label_0089:;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    private final void s(final long f) {
        synchronized (this) {
            this.f = f;
            final ahcr builder = apvp.a.createBuilder();
            final float l = l(this.n());
            builder.copyOnWrite();
            final apvp apvp = (apvp)builder.instance;
            apvp.b |= 0x4;
            apvp.e = l;
            this.F = builder;
            this.G = apvo.a.createBuilder();
            final apvp b = this.b;
            if ((b.b & 0x20) != 0x0) {
                final apvo h = b.h;
                apvo a;
                if (h == null) {
                    a = apvo.a;
                }
                else {
                    a = h;
                }
                if (a.g > 0) {
                    final ahcr g = this.G;
                    apvo a2;
                    if ((a2 = h) == null) {
                        a2 = apvo.a;
                    }
                    final int g2 = a2.g;
                    g.copyOnWrite();
                    final apvo apvo = (apvo)g.instance;
                    apvo.b |= 0x10;
                    apvo.f = g2;
                }
            }
            this.r(this.m(f) * 1000);
            this.y = apvn.b;
            this.k = true;
            this.q();
        }
    }
    
    public final void a(final boolean b, long a) {
        synchronized (this) {
            if (this.D) {
                tut.n("finishWatchTimeSegment called after client was already released.", (Throwable)new Exception());
                return;
            }
            final boolean k = this.k;
            if (!k && b) {
                this.q();
                final ahcr f = this.F;
                final float l = l(this.n());
                f.copyOnWrite();
                final apvp apvp = (apvp)f.instance;
                final apvp a2 = apvp.a;
                apvp.b |= 0x4;
                apvp.e = l;
                final ahcr g = this.G;
                g.copyOnWrite();
                final apvo apvo = (apvo)g.instance;
                final apvo a3 = apvo.a;
                apvo.b &= 0xFFFFFFDF;
                apvo.g = 0;
                g.copyOnWrite();
                final apvo apvo2 = (apvo)g.instance;
                apvo2.b &= 0xFFFFFFF7;
                apvo2.e = 0L;
            }
            else if (!k || this.B) {
                return;
            }
            if (((apvp)this.F.instance).e == -1.0f) {
                tut.b("Attempting to finish a WatchTimeSegment with an unset start time");
                return;
            }
            final float i = l(this.n());
            final float e = ((apvp)this.F.instance).e;
            if ((this.s > 0L && i - e > 0.0f) || b) {
                final long f2 = this.f;
                if (f2 > 0L) {
                    final ahcr g2 = this.G;
                    g2.copyOnWrite();
                    final apvo apvo3 = (apvo)g2.instance;
                    final apvo a4 = apvo.a;
                    apvo3.b |= 0x8;
                    apvo3.e = a - f2;
                }
                final ahcr g3 = this.G;
                apvo apvo4;
                if ((apvo4 = this.b.h) == null) {
                    apvo4 = apvo.a;
                }
                final int c = apvo4.c;
                final boolean b2 = true;
                g3.copyOnWrite();
                final apvo apvo5 = (apvo)g3.instance;
                apvo5.b |= 0x1;
                apvo5.c = c + 1;
                final ahcr f3 = this.F;
                final float j = l(this.n());
                f3.copyOnWrite();
                final apvp apvp2 = (apvp)f3.instance;
                apvp2.b |= 0x8;
                apvp2.f = j;
                final float m = l(this.l);
                f3.copyOnWrite();
                final apvp apvp3 = (apvp)f3.instance;
                apvp3.b |= 0x10;
                apvp3.g = m;
                final apvn y = this.y;
                f3.copyOnWrite();
                final apvp apvp4 = (apvp)f3.instance;
                apvp4.k = y.k;
                apvp4.b |= 0x100;
                if (b) {
                    final ahcr g4 = this.G;
                    g4.copyOnWrite();
                    final apvo apvo6 = (apvo)g4.instance;
                    apvo6.b |= 0x2;
                    apvo6.d = true;
                }
                this.p(a);
                final ahcr f4 = this.F;
                final apvo h = (apvo)this.G.build();
                f4.copyOnWrite();
                final apvp apvp5 = (apvp)f4.instance;
                h.getClass();
                apvp5.h = h;
                apvp5.b |= 0x20;
                if (this.w) {
                    a = this.A;
                    if (a > 0L) {
                        final ahcr f5 = this.F;
                        f5.copyOnWrite();
                        final apvp apvp6 = (apvp)f5.instance;
                        apvp6.b |= 0x10000;
                        apvp6.s = a * 1000L;
                    }
                }
                if (!TextUtils.equals((CharSequence)this.q, (CharSequence)"-")) {
                    final ahcr f6 = this.F;
                    final String q = this.q;
                    f6.copyOnWrite();
                    final apvp apvp7 = (apvp)f6.instance;
                    q.getClass();
                    apvp7.b |= 0x20000;
                    apvp7.t = q;
                }
                final float n = this.n;
                if (n != 1.0f) {
                    final ahcr f7 = this.F;
                    f7.copyOnWrite();
                    final apvp apvp8 = (apvp)f7.instance;
                    apvp8.b |= 0x200;
                    apvp8.l = n;
                }
                this.r.ifPresent((Consumer)new aaqr(this, 13));
                final apvn y2 = this.y;
                boolean b3 = false;
                Label_0958: {
                    if (y2 == apvn.f && ((apvo)this.G.instance).c <= 1) {
                        final int c2 = this.c.c;
                        if (c2 > 0) {
                            final apvp apvp9 = (apvp)this.F.instance;
                            if (apvp9.f >= c2 && apvp9.e <= 0.0f) {
                                b3 = true;
                                break Label_0958;
                            }
                        }
                    }
                    b3 = false;
                }
                int n2 = b2 ? 1 : 0;
                if (!b) {
                    if (this.E && y2 != apvn.b) {
                        n2 = (b2 ? 1 : 0);
                    }
                    else {
                        n2 = 0;
                    }
                }
                if (!b3) {
                    if (n2 != 0) {
                        final wza i2 = this.I;
                        final akps d = akpu.d();
                        final apvp apvp10 = (apvp)this.F.build();
                        ((ahcr)d).copyOnWrite();
                        akpu.cc((akpu)d.instance, apvp10);
                        i2.k((akpu)((ahcr)d).build(), ajfn.e);
                    }
                    else {
                        final wza i3 = this.I;
                        final akps d2 = akpu.d();
                        final apvp apvp11 = (apvp)this.F.build();
                        ((ahcr)d2).copyOnWrite();
                        akpu.cc((akpu)d2.instance, apvp11);
                        i3.d((akpu)((ahcr)d2).build());
                    }
                }
                this.b = (apvp)this.F.build();
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
            this.y = apvn.g;
            this.a(false, this.d.d());
            this.o();
        }
    }
    
    public final void d(final long m) {
        synchronized (this) {
            this.y = apvn.f;
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
                tut.m("VSS3ClientDebug", sb.toString());
                return;
            }
            final long d = this.d.d();
            this.i = true;
            if (!this.N) {
                this.N = true;
                this.O = d;
            }
            this.y = apvn.b;
            this.m = m;
            this.i(d);
        }
    }
    
    public final void f() {
        synchronized (this) {
            if (this.i) {
                this.y = apvn.i;
                this.a(false, this.d.d());
                this.i = false;
            }
        }
    }
    
    public final void g() {
        synchronized (this) {
            this.y = apvn.i;
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
