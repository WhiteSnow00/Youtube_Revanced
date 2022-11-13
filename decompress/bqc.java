import android.os.Message;
import java.util.List;
import android.os.Looper;
import android.os.Handler;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqc extends bdx implements Handler$Callback
{
    public long d;
    private final Handler e;
    private final bqb f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private ayg k;
    private bxj l;
    private bxl m;
    private bxm n;
    private bxm o;
    private int p;
    private long q;
    private long r;
    private final bxc s;
    
    public bqc(final bqb f, final Looper looper) {
        super(3);
        dk.d((Object)f);
        this.f = f;
        Handler d;
        if (looper == null) {
            d = null;
        }
        else {
            d = bax.D(looper, (Handler$Callback)this);
        }
        this.e = d;
        this.s = new bxc();
        this.d = -9223372036854775807L;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
    }
    
    private final void U(final azz azz) {
        ((beu)this.f).a.J.m(27, (bam)new bem((List)azz.a, 13));
        ((beu)this.f).a.J.m(27, (bam)new bem(azz, 16));
    }
    
    private final void V() {
        this.m = null;
        this.p = -1;
        final bxm n = this.n;
        if (n != null) {
            n.release();
            this.n = null;
        }
        final bxm o = this.o;
        if (o != null) {
            o.release();
            this.o = null;
        }
    }
    
    private final void W() {
        this.V();
        final bxj l = this.l;
        dk.d((Object)l);
        l.f();
        this.l = null;
        this.j = 0;
    }
    
    private final void X() {
        this.W();
        this.f();
    }
    
    private final void Y(final azz azz) {
        final Handler e = this.e;
        if (e != null) {
            e.obtainMessage(0, (Object)azz).sendToTarget();
            return;
        }
        this.U(azz);
    }
    
    private final void Z(final long n) {
        final boolean b = true;
        dk.h(n != -9223372036854775807L);
        dk.h(this.q != -9223372036854775807L && b);
    }
    
    private final long b() {
        if (this.p == -1) {
            return Long.MAX_VALUE;
        }
        dk.d((Object)this.n);
        if (this.p >= this.n.a()) {
            return Long.MAX_VALUE;
        }
        return this.n.c(this.p);
    }
    
    private final void c() {
        final afeq q = afeq.q();
        this.Z(this.r);
        this.Y(new azz((List)q));
    }
    
    private final void e(final bxk bxk) {
        bap.b("TextRenderer", "Subtitle decoding failed. streamFormat=".concat(String.valueOf(String.valueOf(this.k))), (Throwable)bxk);
        this.c();
        this.X();
    }
    
    private final void f() {
        int n = 1;
        this.i = true;
        final ayg k = this.k;
        dk.d((Object)k);
        final String n2 = k.n;
        if (n2 != null) {
            Label_0313: {
                switch (n2.hashCode()) {
                    case 1693976202: {
                        if (n2.equals("application/ttml+xml")) {
                            n = 3;
                            break Label_0313;
                        }
                        break;
                    }
                    case 1668750253: {
                        if (n2.equals("application/x-subrip")) {
                            n = 4;
                            break Label_0313;
                        }
                        break;
                    }
                    case 1566016562: {
                        if (n2.equals("application/cea-708")) {
                            n = 8;
                            break Label_0313;
                        }
                        break;
                    }
                    case 1566015601: {
                        if (n2.equals("application/cea-608")) {
                            n = 6;
                            break Label_0313;
                        }
                        break;
                    }
                    case 1201784583: {
                        if (n2.equals("text/x-exoplayer-cues")) {
                            n = 11;
                            break Label_0313;
                        }
                        break;
                    }
                    case 930165504: {
                        if (n2.equals("application/x-mp4-cea-608")) {
                            n = 7;
                            break Label_0313;
                        }
                        break;
                    }
                    case 822864842: {
                        if (n2.equals("text/x-ssa")) {
                            break Label_0313;
                        }
                        break;
                    }
                    case 691401887: {
                        if (n2.equals("application/x-quicktime-tx3g")) {
                            n = 5;
                            break Label_0313;
                        }
                        break;
                    }
                    case -1004728940: {
                        if (n2.equals("text/vtt")) {
                            n = 0;
                            break Label_0313;
                        }
                        break;
                    }
                    case -1026075066: {
                        if (n2.equals("application/x-mp4-vtt")) {
                            n = 2;
                            break Label_0313;
                        }
                        break;
                    }
                    case -1248334819: {
                        if (n2.equals("application/pgs")) {
                            n = 10;
                            break Label_0313;
                        }
                        break;
                    }
                    case -1351681404: {
                        if (n2.equals("application/dvbsubs")) {
                            n = 9;
                            break Label_0313;
                        }
                        break;
                    }
                }
                n = -1;
            }
            Object l = null;
            switch (n) {
                default: {
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(n2)));
                }
                case 11: {
                    l = new bqa();
                    break;
                }
                case 10: {
                    l = new bye();
                    break;
                }
                case 9: {
                    l = new bxx(k.p);
                    break;
                }
                case 8: {
                    l = new bxt(k.F, k.p);
                    break;
                }
                case 6:
                case 7: {
                    l = new bxp(n2, k.F);
                    break;
                }
                case 5: {
                    l = new byv(k.p);
                    break;
                }
                case 4: {
                    l = new byk();
                    break;
                }
                case 3: {
                    l = new byq();
                    break;
                }
                case 2: {
                    l = new byx();
                    break;
                }
                case 1: {
                    l = new byf(k.p);
                    break;
                }
                case 0: {
                    l = new bzf();
                    break;
                }
            }
            this.l = (bxj)l;
            return;
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: ".concat(String.valueOf(n2)));
    }
    
    protected final void C(final ayg[] array, final long n, final long q) {
        this.q = q;
        this.k = array[0];
        if (this.l != null) {
            this.j = 1;
            return;
        }
        this.f();
    }
    
    public final void R(final long r, long n) {
        this.r = r;
        if (super.c) {
            n = this.d;
            if (n != -9223372036854775807L && r >= n) {
                this.V();
                this.h = true;
            }
        }
        if (this.h) {
            return;
        }
        if (this.o == null) {
            final bxj l = this.l;
            dk.d((Object)l);
            l.t(r);
            try {
                final bxj i = this.l;
                dk.d((Object)i);
                this.o = (bxm)i.b();
            }
            catch (final bxk bxk) {
                this.e(bxk);
                return;
            }
        }
        if (super.b != 2) {
            return;
        }
        boolean b;
        if (this.n != null) {
            n = this.b();
            b = false;
            while (n <= r) {
                ++this.p;
                n = this.b();
                b = true;
            }
        }
        else {
            b = false;
        }
        final bxm o = this.o;
        Label_0382: {
            Label_0284: {
                if (o != null) {
                    if (((bcw)o).isEndOfStream()) {
                        if (b) {
                            break Label_0284;
                        }
                        if (this.b() != Long.MAX_VALUE) {
                            break Label_0382;
                        }
                        if (this.j == 2) {
                            this.X();
                            break Label_0382;
                        }
                        this.V();
                        this.h = true;
                        break Label_0382;
                    }
                    else if (o.timeUs <= r) {
                        final bxm n2 = this.n;
                        if (n2 != null) {
                            n2.release();
                        }
                        this.p = o.b(r);
                        this.n = o;
                        this.o = null;
                        break Label_0284;
                    }
                }
                if (!b) {
                    break Label_0382;
                }
            }
            dk.d((Object)this.n);
            final int b2 = this.n.b(r);
            if (b2 == 0) {
                n = this.n.timeUs;
            }
            else if (b2 == -1) {
                final bxm n3 = this.n;
                n = n3.c(n3.a() - 1);
            }
            else {
                n = this.n.c(b2 - 1);
            }
            this.Z(n);
            this.Y(new azz(this.n.d(r)));
        }
        if (this.j != 2) {
            try {
                while (!this.g) {
                    Object m;
                    if ((m = this.m) == null) {
                        final bxj j = this.l;
                        dk.d((Object)j);
                        m = j.a();
                        if (m == null) {
                            return;
                        }
                        this.m = (bxl)m;
                    }
                    if (this.j == 1) {
                        ((bcw)m).setFlags(4);
                        final bxj k = this.l;
                        dk.d((Object)k);
                        k.e(m);
                        this.m = null;
                        this.j = 2;
                        return;
                    }
                    final int p2 = this.P(this.s, (bdc)m, 0);
                    if (p2 == -4) {
                        if (((bcw)m).isEndOfStream()) {
                            this.g = true;
                            this.i = false;
                        }
                        else {
                            final ayg a = this.s.a;
                            if (a == null) {
                                return;
                            }
                            ((bxl)m).g = a.r;
                            ((bdc)m).c();
                            if (this.i &= (((bcw)m).isKeyFrame() ^ true)) {
                                continue;
                            }
                        }
                        final bxj l2 = this.l;
                        dk.d((Object)l2);
                        l2.e(m);
                        this.m = null;
                    }
                    else {
                        if (p2 == -3) {
                            break;
                        }
                        continue;
                    }
                }
            }
            catch (final bxk bxk2) {
                this.e(bxk2);
            }
        }
    }
    
    public final boolean S() {
        return this.h;
    }
    
    public final boolean T() {
        return true;
    }
    
    public final int a(final ayg ayg) {
        final String n = ayg.n;
        if (!"text/vtt".equals(n) && !"text/x-ssa".equals(n) && !"application/ttml+xml".equals(n) && !"application/x-mp4-vtt".equals(n) && !"application/x-subrip".equals(n) && !"application/x-quicktime-tx3g".equals(n) && !"application/cea-608".equals(n) && !"application/x-mp4-cea-608".equals(n) && !"application/cea-708".equals(n) && !"application/dvbsubs".equals(n) && !"application/pgs".equals(n) && !"text/x-exoplayer-cues".equals(n)) {
            int n2;
            if (ayz.l(ayg.n)) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            return ber.b(n2);
        }
        int n3;
        if (ayg.G == 0) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        return ber.b(n3);
    }
    
    public final String d() {
        return "TextRenderer";
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what == 0) {
            this.U((azz)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
    
    protected final void w() {
        this.k = null;
        this.d = -9223372036854775807L;
        this.c();
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.W();
    }
    
    protected final void y(final long r, final boolean b) {
        this.r = r;
        this.c();
        this.g = false;
        this.h = false;
        this.d = -9223372036854775807L;
        if (this.j != 0) {
            this.X();
            return;
        }
        this.V();
        final bxj l = this.l;
        dk.d((Object)l);
        l.d();
    }
}
