import android.media.MediaFormat;
import androidx.media3.decoder.CryptoConfig;
import android.os.SystemClock;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.decoder.VideoDecoderOutputBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class brx extends bdx
{
    private long A;
    private boolean B;
    private boolean C;
    private boolean D;
    private azs E;
    private long F;
    private int G;
    private int H;
    private int I;
    private long J;
    private long K;
    private final dml L;
    protected bdy d;
    private final long e;
    private final int f;
    private final bav g;
    private final bdc h;
    private ayg i;
    private ayg j;
    private bcz k;
    private bdc l;
    private VideoDecoderOutputBuffer m;
    private int n;
    private Object o;
    private Surface p;
    private bse q;
    private bsf r;
    private bkm s;
    private bkm t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private long z;
    
    protected brx(final long e, final Handler handler, final bso bso, final int f) {
        super(2);
        this.e = e;
        this.f = f;
        this.A = -9223372036854775807L;
        this.ad();
        this.g = new bav();
        this.h = bdc.a();
        this.L = new dml(handler, bso);
        this.u = 0;
        this.n = -1;
    }
    
    public static boolean Z(final long n) {
        return n < -30000L;
    }
    
    private final void ac() {
        this.w = false;
    }
    
    private final void ad() {
        this.E = null;
    }
    
    private final void ae() {
        if (this.k != null) {
            return;
        }
        this.ah(this.t);
        final bkm s = this.s;
        CryptoConfig cryptoConfig;
        if (s != null) {
            final CryptoConfig b = s.b();
            if ((cryptoConfig = b) == null) {
                if (s.c() == null) {
                    return;
                }
                cryptoConfig = b;
            }
        }
        else {
            cryptoConfig = null;
        }
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.k = this.b(this.i, cryptoConfig);
            this.f(this.n);
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.L.K(this.k.c(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            final bdy d = this.d;
            ++d.a;
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            throw this.l((Throwable)outOfMemoryError, this.i, 4001);
        }
        catch (final bda bda) {
            bap.b("DecoderVideoRenderer", "Video codec error", (Throwable)bda);
            this.L.R((Exception)bda);
            throw this.l((Throwable)bda, this.i, 4001);
        }
    }
    
    private final void af() {
        if (this.G > 0) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.L.N(this.G, elapsedRealtime - this.F);
            this.G = 0;
            this.F = elapsedRealtime;
        }
    }
    
    private final void ag() {
        final azs e = this.E;
        if (e != null) {
            this.L.S(e);
        }
    }
    
    private final void ah(final bkm s) {
        bhu.b(this.s, s);
        this.s = s;
    }
    
    private final void ai() {
        long a;
        if (this.e > 0L) {
            a = SystemClock.elapsedRealtime() + this.e;
        }
        else {
            a = -9223372036854775807L;
        }
        this.A = a;
    }
    
    private final void aj(final bkm t) {
        bhu.b(this.t, t);
        this.t = t;
    }
    
    private final boolean ak() {
        return this.n != -1;
    }
    
    protected void A() {
        this.G = 0;
        this.F = SystemClock.elapsedRealtime();
        this.J = SystemClock.elapsedRealtime() * 1000L;
    }
    
    protected final void B() {
        this.A = -9223372036854775807L;
        this.af();
    }
    
    protected final void C(final ayg[] array, final long n, final long k) {
        this.K = k;
    }
    
    public final void R(final long z, final long n) {
        if (this.D) {
            return;
        }
        if (this.i == null) {
            final bxc q = this.Q();
            ((bcw)this.h).clear();
            final int p2 = this.P(q, this.h, 2);
            if (p2 != -5) {
                if (p2 == -4) {
                    dk.h(((bcw)this.h).isEndOfStream());
                    this.C = true;
                    this.D = true;
                }
                return;
            }
            this.ab(q);
        }
        this.ae();
        if (this.k != null) {
            try {
                final int a = bax.a;
                while (true) {
                    Object m;
                    if ((m = this.m) == null) {
                        m = this.k.b();
                        if ((this.m = (VideoDecoderOutputBuffer)m) == null) {
                            break;
                        }
                        final bdy d = this.d;
                        d.f += ((VideoDecoderOutputBuffer)m).skippedOutputBufferCount;
                        this.I -= ((VideoDecoderOutputBuffer)m).skippedOutputBufferCount;
                    }
                    if (((bcw)m).isEndOfStream()) {
                        if (this.u == 2) {
                            this.W();
                            this.ae();
                            break;
                        }
                        this.m.release();
                        this.m = null;
                        this.D = true;
                        break;
                    }
                    else {
                        if (this.z == -9223372036854775807L) {
                            this.z = z;
                        }
                        final VideoDecoderOutputBuffer i = this.m;
                        final long timeUs = i.timeUs;
                        final long n2 = timeUs - z;
                        Label_0300: {
                            if (!this.ak()) {
                                if (!Z(n2)) {
                                    break;
                                }
                                final bdy d2 = this.d;
                                ++d2.f;
                                i.release();
                            }
                            else {
                                final long n3 = timeUs - this.K;
                                final ayg j = (ayg)this.g.d(n3);
                                if (j != null) {
                                    this.j = j;
                                }
                                final long elapsedRealtime = SystemClock.elapsedRealtime();
                                final long k = this.J;
                                final int b = super.b;
                                if (!this.y) {
                                    if (b != 2 && !this.x) {
                                        break;
                                    }
                                }
                                else if (this.w) {
                                    if (b != 2) {
                                        break;
                                    }
                                    if (!Z(n2) || elapsedRealtime * 1000L - k <= 100000L) {
                                        if (z == this.z) {
                                            break;
                                        }
                                        if (n2 < -500000L) {
                                            final int l = this.i(z);
                                            if (l != 0) {
                                                final bdy d3 = this.d;
                                                ++d3.j;
                                                this.Y(l, this.I);
                                                this.V();
                                                break;
                                            }
                                        }
                                        if (this.aa(n2, n)) {
                                            this.U(this.m);
                                            break Label_0300;
                                        }
                                        if (n2 < 30000L) {
                                            this.X(this.m, n3, this.j);
                                            break Label_0300;
                                        }
                                        break;
                                    }
                                }
                                this.X(this.m, n3, this.j);
                            }
                        }
                        final long timeUs2 = this.m.timeUs;
                        --this.I;
                        this.m = null;
                    }
                }
                while (true) {
                    final bcz k2 = this.k;
                    if (k2 == null || this.u == 2) {
                        break;
                    }
                    if (this.C) {
                        break;
                    }
                    Object l2;
                    if ((l2 = this.l) == null) {
                        l2 = k2.a();
                        if ((this.l = (bdc)l2) == null) {
                            break;
                        }
                    }
                    if (this.u == 1) {
                        ((bcw)l2).setFlags(4);
                        this.k.e((Object)this.l);
                        this.l = null;
                        this.u = 2;
                        break;
                    }
                    final bxc q2 = this.Q();
                    final int p3 = this.P(q2, this.l, 0);
                    if (p3 != -5) {
                        if (p3 != -4) {
                            break;
                        }
                        if (((bcw)this.l).isEndOfStream()) {
                            this.C = true;
                            this.k.e((Object)this.l);
                            this.l = null;
                            break;
                        }
                        if (this.B) {
                            this.g.e(this.l.e, (Object)this.i);
                            this.B = false;
                        }
                        this.l.c();
                        final bdc l3 = this.l;
                        l3.a = this.i;
                        this.k.e((Object)l3);
                        ++this.I;
                        this.v = true;
                        final bdy d4 = this.d;
                        ++d4.c;
                        this.l = null;
                    }
                    else {
                        this.ab(q2);
                    }
                }
                this.d.a();
            }
            catch (final bda bda) {
                bap.b("DecoderVideoRenderer", "Video codec error", (Throwable)bda);
                this.L.R((Exception)bda);
                throw this.l((Throwable)bda, this.i, 4003);
            }
        }
    }
    
    public final boolean S() {
        return this.D;
    }
    
    public boolean T() {
        if (this.i != null && (this.M() || this.m != null) && (this.w || !this.ak())) {
            this.A = -9223372036854775807L;
            return true;
        }
        if (this.A == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.A) {
            return true;
        }
        this.A = -9223372036854775807L;
        return false;
    }
    
    protected final void U(final VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.Y(0, 1);
        videoDecoderOutputBuffer.release();
    }
    
    protected final void V() {
        this.I = 0;
        if (this.u != 0) {
            this.W();
            this.ae();
            return;
        }
        this.l = null;
        final VideoDecoderOutputBuffer m = this.m;
        if (m != null) {
            m.release();
            this.m = null;
        }
        this.k.d();
        this.v = false;
    }
    
    protected final void W() {
        this.l = null;
        this.m = null;
        this.u = 0;
        this.v = false;
        this.I = 0;
        final bcz k = this.k;
        if (k != null) {
            final bdy d = this.d;
            ++d.b;
            k.f();
            this.L.L(this.k.c());
            this.k = null;
        }
        this.ah(null);
    }
    
    protected void X(final VideoDecoderOutputBuffer videoDecoderOutputBuffer, final long n, final ayg ayg) {
        final bsf r = this.r;
        if (r != null) {
            r.sW(n, System.nanoTime(), ayg, (MediaFormat)null);
        }
        this.J = bax.w(SystemClock.elapsedRealtime() * 1000L);
        int n2 = 0;
        int n3 = 0;
        Label_0085: {
            int mode;
            if ((mode = videoDecoderOutputBuffer.mode) == 1) {
                if (this.p != null) {
                    n2 = 1;
                    n3 = 1;
                    break Label_0085;
                }
                mode = 1;
            }
            final int n4 = 0;
            n2 = mode;
            n3 = n4;
        }
        final boolean b = n2 == 0 && this.q != null;
        if (!b && n3 == 0) {
            this.U(videoDecoderOutputBuffer);
            return;
        }
        final int width = videoDecoderOutputBuffer.width;
        final int height = videoDecoderOutputBuffer.height;
        final azs e = this.E;
        if (e == null || e.a != width || e.b != height) {
            final azs e2 = new azs(width, height, 1.0f);
            this.E = e2;
            this.L.S(e2);
        }
        if (b) {
            this.q.sY(videoDecoderOutputBuffer);
        }
        else {
            this.e(videoDecoderOutputBuffer, this.p);
        }
        this.H = 0;
        final bdy d = this.d;
        ++d.e;
        this.y = true;
        if (!this.w) {
            this.w = true;
            this.L.Q(this.o);
        }
    }
    
    protected final void Y(int f, final int n) {
        final bdy d = this.d;
        d.h += f;
        final int g = d.g;
        f += n;
        d.g = g + f;
        this.G += f;
        f += this.H;
        this.H = f;
        d.i = Math.max(f, d.i);
        f = this.f;
        if (f > 0 && this.G >= f) {
            this.af();
        }
    }
    
    protected boolean aa(final long n, final long n2) {
        return Z(n);
    }
    
    protected final void ab(final bxc bxc) {
        this.B = true;
        final ayg a = bxc.a;
        dk.d((Object)a);
        this.aj((bkm)bxc.b);
        final ayg i = this.i;
        this.i = a;
        final bcz k = this.k;
        if (k == null) {
            this.ae();
            this.L.P(this.i, (bdz)null);
            return;
        }
        bdz c;
        if (this.t != this.s) {
            c = new bdz(k.c(), i, a, 0, 128);
        }
        else {
            c = this.c(k.c(), i, a);
        }
        if (c.d == 0) {
            if (this.v) {
                this.u = 1;
            }
            else {
                this.W();
                this.ae();
            }
        }
        this.L.P(this.i, c);
    }
    
    protected abstract bcz b(final ayg p0, final CryptoConfig p1);
    
    protected bdz c(final String s, final ayg ayg, final ayg ayg2) {
        throw null;
    }
    
    protected abstract void e(final VideoDecoderOutputBuffer p0, final Surface p1);
    
    protected abstract void f(final int p0);
    
    public void t(int n, Object o) {
        final int n2 = 1;
        if (n == 1) {
            if (o instanceof Surface) {
                this.p = (Surface)o;
                this.q = null;
                this.n = 1;
                n = n2;
            }
            else if (o instanceof bse) {
                this.p = null;
                this.q = (bse)o;
                n = 0;
                this.n = 0;
            }
            else {
                this.p = null;
                this.q = null;
                n = -1;
                this.n = -1;
                o = null;
            }
            if (this.o != o) {
                if ((this.o = o) == null) {
                    this.ad();
                    this.ac();
                    return;
                }
                if (this.k != null) {
                    this.f(n);
                }
                this.ag();
                this.ac();
                if (super.b == 2) {
                    this.ai();
                }
            }
            else if (o != null) {
                this.ag();
                if (this.w) {
                    this.L.Q(this.o);
                }
            }
        }
        else if (n == 7) {
            this.r = (bsf)o;
        }
    }
    
    protected final void w() {
        this.i = null;
        this.ad();
        this.ac();
        try {
            this.aj(null);
            this.W();
        }
        finally {
            this.L.M(this.d);
        }
    }
    
    protected final void x(final boolean b, final boolean x) {
        final bdy d = new bdy();
        this.d = d;
        this.L.O(d);
        this.x = x;
        this.y = false;
    }
    
    protected void y(final long n, final boolean b) {
        this.C = false;
        this.D = false;
        this.ac();
        this.z = -9223372036854775807L;
        this.H = 0;
        if (this.k != null) {
            this.V();
        }
        if (b) {
            this.ai();
        }
        else {
            this.A = -9223372036854775807L;
        }
        this.g.f();
    }
}
