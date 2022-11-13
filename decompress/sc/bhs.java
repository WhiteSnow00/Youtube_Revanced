import androidx.media3.decoder.CryptoConfig;
import android.os.SystemClock;
import android.os.Handler;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bhs extends bdx implements bfd
{
    private int A;
    public final bhk d;
    public boolean e;
    public final eab f;
    private final bdc g;
    private bdy h;
    private ayg i;
    private int j;
    private int k;
    private boolean l;
    private bcz m;
    private bdc n;
    private SimpleDecoderOutputBuffer o;
    private bkm p;
    private bkm q;
    private int r;
    private boolean s;
    private boolean t;
    private long u;
    private boolean v;
    private boolean w;
    private boolean x;
    private long y;
    private final long[] z;
    
    public bhs() {
        this(null, null, new azv[0]);
    }
    
    public bhs(final Handler handler, final bhe bhe, final bhk d) {
        super(1);
        this.f = new eab(handler, bhe);
        (this.d = d).n((bhh)new bhr(this));
        this.g = bdc.a();
        this.r = 0;
        this.t = true;
        this.Y(-9223372036854775807L);
        this.z = new long[10];
    }
    
    public bhs(final Handler handler, final bhe bhe, final azv... array) {
        final tiz tiz = new tiz((byte[])null, (byte[])null);
        tiz.m((bhc)adkp.ac(null, bhc.a));
        tiz.d = new eg(array);
        this(handler, bhe, (bhk)tiz.l());
    }
    
    private final void V() {
        this.x = true;
        this.d.i();
    }
    
    private final void W() {
        this.n = null;
        this.o = null;
        this.r = 0;
        this.s = false;
        final bcz m = this.m;
        if (m != null) {
            final bdy h = this.h;
            ++h.b;
            m.f();
            this.f.o(this.m.c());
            this.m = null;
        }
        this.X(null);
    }
    
    private final void X(final bkm p) {
        bhu.b(this.p, p);
        this.p = p;
    }
    
    private final void Y(final long y) {
        this.y = y;
        if (y != -9223372036854775807L) {
            this.d.x();
        }
    }
    
    private final void Z(final bkm q) {
        bhu.b(this.q, q);
        this.q = q;
    }
    
    private final void aa() {
        long u = this.d.b(this.S());
        if (u != Long.MIN_VALUE) {
            if (!this.e) {
                u = Math.max(this.u, u);
            }
            this.u = u;
            this.e = false;
        }
    }
    
    private final void ab(final bxc bxc) {
        final ayg a = bxc.a;
        dk.d((Object)a);
        this.Z((bkm)bxc.b);
        final ayg i = this.i;
        this.i = a;
        this.j = a.D;
        this.k = a.E;
        final bcz m = this.m;
        if (m == null) {
            this.f();
            this.f.r(this.i, null);
            return;
        }
        bdz u;
        if (this.q != this.p) {
            u = new bdz(m.c(), i, a, 0, 128);
        }
        else {
            u = this.U(m.c(), i, a);
        }
        if (u.d == 0) {
            if (this.s) {
                this.r = 1;
            }
            else {
                this.W();
                this.f();
                this.t = true;
            }
        }
        this.f.r(this.i, u);
    }
    
    private final void f() {
        if (this.m != null) {
            return;
        }
        this.X(this.q);
        final bkm p = this.p;
        CryptoConfig cryptoConfig;
        if (p != null) {
            final CryptoConfig b = p.b();
            if ((cryptoConfig = b) == null) {
                if (p.c() == null) {
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
            final int a = bax.a;
            this.m = this.e(this.i, cryptoConfig);
            final long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f.n(this.m.c(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            final bdy h = this.h;
            ++h.a;
        }
        catch (final OutOfMemoryError outOfMemoryError) {
            throw this.l((Throwable)outOfMemoryError, this.i, 4001);
        }
        catch (final bda bda) {
            bap.b("DecoderAudioRenderer", "Audio codec error", (Throwable)bda);
            this.f.l((Exception)bda);
            throw this.l((Throwable)bda, this.i, 4001);
        }
    }
    
    protected void A() {
        this.d.h();
    }
    
    protected final void B() {
        this.aa();
        this.d.g();
    }
    
    protected final void C(final ayg[] array, long n, final long n2) {
        this.l = false;
        if (this.y == -9223372036854775807L) {
            this.Y(n2);
            return;
        }
        final int a = this.A;
        final long[] z = this.z;
        final int length = z.length;
        if (a == 10) {
            n = z[9];
            final StringBuilder sb = new StringBuilder("Too many stream changes, so dropping offset: ");
            sb.append(n);
            bap.c("DecoderAudioRenderer", sb.toString());
        }
        else {
            this.A = a + 1;
        }
        this.z[this.A - 1] = n2;
    }
    
    public final void R(final long n, final long n2) {
        if (this.x) {
            try {
                this.d.i();
                return;
            }
            catch (final bhj bhj) {
                throw this.m((Throwable)bhj, bhj.c, bhj.b, 5002);
            }
        }
        if (this.i == null) {
            final bxc q = this.Q();
            ((bcw)this.g).clear();
            final int p2 = this.P(q, this.g, 2);
            if (p2 != -5) {
                if (p2 == -4) {
                    dk.h(((bcw)this.g).isEndOfStream());
                    this.w = true;
                    try {
                        this.V();
                    }
                    catch (final bhj bhj2) {
                        throw this.l((Throwable)bhj2, (ayg)null, 5002);
                    }
                }
                return;
            }
            this.ab(q);
        }
        this.f();
        if (this.m != null) {
            try {
                final int a = bax.a;
                while (true) {
                    if (this.o == null) {
                        final SimpleDecoderOutputBuffer o = (SimpleDecoderOutputBuffer)this.m.b();
                        if ((this.o = o) == null) {
                            break;
                        }
                        final int skippedOutputBufferCount = o.skippedOutputBufferCount;
                        if (skippedOutputBufferCount > 0) {
                            final bdy h = this.h;
                            h.f += skippedOutputBufferCount;
                            this.d.f();
                        }
                        if (((bcw)this.o).isFirstSample()) {
                            this.d.f();
                            if (this.A != 0) {
                                this.Y(this.z[0]);
                                final int a2 = this.A - 1;
                                this.A = a2;
                                final long[] z = this.z;
                                System.arraycopy(z, 1, z, 0, a2);
                            }
                        }
                    }
                    if (((bcw)this.o).isEndOfStream()) {
                        if (this.r == 2) {
                            this.W();
                            this.f();
                            this.t = true;
                            break;
                        }
                        this.o.release();
                        this.o = null;
                        try {
                            this.V();
                            break;
                        }
                        catch (final bhj bhj3) {
                            throw this.m((Throwable)bhj3, bhj3.c, bhj3.b, 5002);
                        }
                    }
                    if (this.t) {
                        final ayf b = this.c(this.m).b();
                        b.A = this.j;
                        b.B = this.k;
                        this.d.y(b.a());
                        this.t = false;
                    }
                    final bhk d = this.d;
                    final SimpleDecoderOutputBuffer o2 = this.o;
                    if (!d.t(o2.data, o2.timeUs, 1)) {
                        break;
                    }
                    final bdy h2 = this.h;
                    ++h2.e;
                    this.o.release();
                    this.o = null;
                }
                while (true) {
                    final bcz m = this.m;
                    if (m == null || this.r == 2) {
                        break;
                    }
                    if (this.w) {
                        break;
                    }
                    Object n3;
                    if ((n3 = this.n) == null) {
                        n3 = m.a();
                        if ((this.n = (bdc)n3) == null) {
                            break;
                        }
                    }
                    if (this.r == 1) {
                        ((bcw)n3).setFlags(4);
                        this.m.e((Object)this.n);
                        this.n = null;
                        this.r = 2;
                        break;
                    }
                    final bxc q2 = this.Q();
                    final int p3 = this.P(q2, this.n, 0);
                    if (p3 != -5) {
                        if (p3 != -4) {
                            break;
                        }
                        if (((bcw)this.n).isEndOfStream()) {
                            this.w = true;
                            this.m.e((Object)this.n);
                            this.n = null;
                            break;
                        }
                        if (!this.l) {
                            this.l = true;
                            ((bcw)this.n).addFlag(134217728);
                        }
                        this.n.c();
                        final bdc n4 = this.n;
                        n4.a = this.i;
                        if (this.v && !((bcw)n4).isDecodeOnly()) {
                            if (Math.abs(n4.e - this.u) > 500000L) {
                                this.u = n4.e;
                            }
                            this.v = false;
                        }
                        this.m.e((Object)this.n);
                        this.s = true;
                        final bdy h3 = this.h;
                        ++h3.c;
                        this.n = null;
                    }
                    else {
                        this.ab(q2);
                    }
                }
                this.h.a();
            }
            catch (final bhj bhj4) {
                throw this.m((Throwable)bhj4, bhj4.c, bhj4.b, 5002);
            }
            catch (final bhg bhg) {
                throw this.m((Throwable)bhg, bhg.c, bhg.b, 5001);
            }
            catch (final bhf bhf) {
                throw this.l((Throwable)bhf, bhf.a, 5001);
            }
            catch (final bda bda) {
                bap.b("DecoderAudioRenderer", "Audio codec error", (Throwable)bda);
                this.f.l((Exception)bda);
                throw this.l((Throwable)bda, this.i, 4003);
            }
        }
    }
    
    public final boolean S() {
        return this.x && this.d.v();
    }
    
    public boolean T() {
        final boolean u = this.d.u();
        boolean b2;
        final boolean b = b2 = true;
        if (!u) {
            if (this.i != null) {
                b2 = b;
                if (!this.M()) {
                    if (this.o == null) {
                        return false;
                    }
                    b2 = b;
                }
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
    
    protected bdz U(final String s, final ayg ayg, final ayg ayg2) {
        return new bdz(s, ayg, ayg2, 0, 1);
    }
    
    public final int a(final ayg ayg) {
        if (!ayz.i(ayg.n)) {
            return ber.b(0);
        }
        final int b = this.b(ayg);
        if (b <= 2) {
            return ber.b(b);
        }
        final int a = bax.a;
        return ber.c(b, 8, 32);
    }
    
    protected abstract int b(final ayg p0);
    
    protected abstract ayg c(final bcz p0);
    
    protected abstract bcz e(final ayg p0, final CryptoConfig p1);
    
    public final long kH() {
        if (super.b == 2) {
            this.aa();
        }
        return this.u;
    }
    
    public final azc kI() {
        return this.d.c();
    }
    
    public final void kJ(final azc azc) {
        this.d.o(azc);
    }
    
    public final bfd n() {
        return (bfd)this;
    }
    
    public void t(int a, final Object o) {
        if (a == 2) {
            this.d.s((float)o);
            return;
        }
        if (a == 3) {
            this.d.k((axu)o);
            return;
        }
        if (a == 6) {
            this.d.m((axv)o);
            return;
        }
        if (a == 12) {
            a = bax.a;
            bhq.a(this.d, o);
            return;
        }
        if (a == 9) {
            this.d.r((boolean)o);
            return;
        }
        if (a != 10) {
            return;
        }
        this.d.l((int)o);
    }
    
    protected final void w() {
        this.i = null;
        this.t = true;
        this.Y(-9223372036854775807L);
        try {
            this.Z(null);
            this.W();
            this.d.j();
        }
        finally {
            this.f.p(this.h);
        }
    }
    
    protected void x(final boolean b, final boolean b2) {
        final bdy h = new bdy();
        this.h = h;
        this.f.q(h);
        this.O();
        this.d.d();
        this.d.p(this.p());
    }
    
    protected final void y(final long u, final boolean b) {
        this.d.e();
        this.u = u;
        this.v = true;
        this.e = true;
        this.w = false;
        this.x = false;
        if (this.m != null) {
            if (this.r != 0) {
                this.W();
                this.f();
                return;
            }
            this.n = null;
            final SimpleDecoderOutputBuffer o = this.o;
            if (o != null) {
                o.release();
                this.o = null;
            }
            this.m.d();
            this.s = false;
        }
    }
}
