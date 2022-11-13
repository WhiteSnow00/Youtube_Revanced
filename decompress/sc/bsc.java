import android.os.Bundle;
import android.graphics.Point;
import android.media.MediaCodecInfo$VideoCapabilities;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecInfo$CodecProfileLevel;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaCrypto;
import java.util.Collection;
import java.util.List;
import android.util.Pair;
import android.os.SystemClock;
import android.os.Handler;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import android.content.Context;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public class bsc extends bmc
{
    private static final int[] e;
    private static boolean f;
    private static boolean q;
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private long E;
    private long F;
    private long G;
    private int H;
    private int I;
    private int J;
    private long K;
    private long L;
    private long M;
    private int N;
    private int O;
    private int P;
    private float Q;
    private azs R;
    private int S;
    private bsf T;
    private aetm U;
    private final dml V;
    public Surface d;
    private final Context r;
    private final bsl s;
    private final long t;
    private final int u;
    private final boolean v;
    private boolean w;
    private boolean x;
    private PlaceholderSurface y;
    private boolean z;
    
    static {
        e = new int[] { 1920, 1600, 1440, 1280, 960, 854, 640, 540, 480 };
    }
    
    public bsc(Context applicationContext, final blv blv, final bme bme, final long t, final Handler handler, final bso bso, final int u, final float n) {
        super(2, blv, bme, false, n);
        this.t = t;
        this.u = u;
        applicationContext = applicationContext.getApplicationContext();
        this.r = applicationContext;
        this.s = new bsl(applicationContext);
        this.V = new dml(handler, bso);
        this.v = "NVIDIA".equals(bax.c);
        this.F = -9223372036854775807L;
        this.O = -1;
        this.P = -1;
        this.Q = -1.0f;
        this.A = 1;
        this.S = 0;
        this.aI();
    }
    
    public bsc(final Context context, final bme bme, final long n, final Handler handler, final bso bso, final int n2) {
        this(context, blv.b, bme, n, handler, bso, n2, 30.0f);
    }
    
    private final void aH() {
        this.B = false;
        final int a = bax.a;
    }
    
    private final void aI() {
        this.R = null;
    }
    
    private final void aJ() {
        if (this.H > 0) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.V.N(this.H, elapsedRealtime - this.G);
            this.H = 0;
            this.G = elapsedRealtime;
        }
    }
    
    private final void aK() {
        final azs r = this.R;
        if (r != null) {
            this.V.S(r);
        }
    }
    
    private final void aL(final long n, final long n2, final ayg ayg) {
        final bsf t = this.T;
        if (t != null) {
            t.sW(n, n2, ayg, super.j);
        }
    }
    
    private final void aM() {
        final Surface d = this.d;
        final PlaceholderSurface y = this.y;
        if (d == y) {
            this.d = null;
        }
        y.release();
        this.y = null;
    }
    
    private final void aN() {
        long f;
        if (this.t > 0L) {
            f = SystemClock.elapsedRealtime() + this.t;
        }
        else {
            f = -9223372036854775807L;
        }
        this.F = f;
    }
    
    private static boolean aO(final long n) {
        return n < -30000L;
    }
    
    private final boolean aP(final blz blz) {
        final int a = bax.a;
        final boolean az = this.az(blz.a);
        boolean b = false;
        if (!az) {
            if (blz.f) {
                if (PlaceholderSurface.a()) {
                    return true;
                }
                b = b;
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    public static int au(final blz blz, final ayg ayg) {
        final int s = ayg.s;
        final int t = ayg.t;
        if (s == -1 || t == -1) {
            return -1;
        }
        String n = ayg.n;
        final boolean equals = "video/dolby-vision".equals(n);
        int n2 = 1;
        Label_0099: {
            if (equals) {
                final Pair a = bmk.a(ayg);
                if (a != null) {
                    final int intValue = (int)a.first;
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        n = "video/avc";
                        break Label_0099;
                    }
                }
                n = "video/hevc";
            }
        }
        Label_0281: {
            switch (n.hashCode()) {
                case 1599127257: {
                    if (n.equals("video/x-vnd.on2.vp9")) {
                        n2 = 6;
                        break Label_0281;
                    }
                    break;
                }
                case 1599127256: {
                    if (n.equals("video/x-vnd.on2.vp8")) {
                        n2 = 3;
                        break Label_0281;
                    }
                    break;
                }
                case 1331836730: {
                    if (n.equals("video/avc")) {
                        n2 = 5;
                        break Label_0281;
                    }
                    break;
                }
                case 1187890754: {
                    if (n.equals("video/mp4v-es")) {
                        break Label_0281;
                    }
                    break;
                }
                case -1662541442: {
                    if (n.equals("video/hevc")) {
                        n2 = 4;
                        break Label_0281;
                    }
                    break;
                }
                case -1662735862: {
                    if (n.equals("video/av01")) {
                        n2 = 2;
                        break Label_0281;
                    }
                    break;
                }
                case -1664118616: {
                    if (n.equals("video/3gpp")) {
                        n2 = 0;
                        break Label_0281;
                    }
                    break;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                return -1;
            }
            case 6: {
                return b(s * t, 4);
            }
            case 5: {
                if (!"BRAVIA 4K 2015".equals(bax.d)) {
                    if ("Amazon".equals(bax.c)) {
                        if ("KFSOWI".equals(bax.d)) {
                            return -1;
                        }
                        if ("AFTS".equals(bax.d) && blz.f) {
                            return -1;
                        }
                    }
                    return b(bax.c(s, 16) * bax.c(t, 16) * 256, 2);
                }
                return -1;
            }
            case 4: {
                return Math.max(2097152, b(s * t, 2));
            }
            case 0:
            case 1:
            case 2:
            case 3: {
                return b(s * t, 2);
            }
        }
    }
    
    protected static int av(final blz blz, final ayg ayg) {
        if (ayg.o != -1) {
            final int size = ayg.p.size();
            int i = 0;
            int n = 0;
            while (i < size) {
                n += ((byte[])ayg.p.get(i)).length;
                ++i;
            }
            return ayg.o + n;
        }
        return au(blz, ayg);
    }
    
    private static int b(final int n, final int n2) {
        return n * 3 / (n2 + n2);
    }
    
    private static List c(final Context context, final bme bme, final ayg ayg, final boolean b, final boolean b2) {
        final String n = ayg.n;
        if (n == null) {
            return (List)afeq.q();
        }
        final List a = bme.a(n, b, b2);
        final String c = bmk.c(ayg);
        if (c == null) {
            return (List)afeq.o((Collection)a);
        }
        final List a2 = bme.a(c, b, b2);
        final int a3 = bax.a;
        if ("video/dolby-vision".equals(ayg.n) && !a2.isEmpty() && !bsb.a(context)) {
            return (List)afeq.o((Collection)a2);
        }
        final afel d = afeq.d();
        d.j(a);
        d.j(a2);
        return (List)d.g();
    }
    
    protected void A() {
        this.H = 0;
        this.G = SystemClock.elapsedRealtime();
        this.L = SystemClock.elapsedRealtime() * 1000L;
        this.M = 0L;
        this.N = 0;
        final bsl s = this.s;
        s.d = true;
        s.b();
        if (s.b != null) {
            final bsk c = s.c;
            dk.d((Object)c);
            c.c.sendEmptyMessage(1);
            s.b.b(new pvh(s));
        }
        s.d(false);
    }
    
    protected final void B() {
        this.F = -9223372036854775807L;
        this.aJ();
        final int n = this.N;
        if (n != 0) {
            final dml v = this.V;
            final long m = this.M;
            final Object b = v.b;
            if (b != null) {
                ((Handler)b).post((Runnable)new bsm(v, m, n, 0, (byte[])null, (byte[])null, (byte[])null));
            }
            this.M = 0L;
            this.N = 0;
        }
        final bsl s = this.s;
        s.d = false;
        final bsh b2 = s.b;
        if (b2 != null) {
            b2.a();
            final bsk c = s.c;
            dk.d((Object)c);
            c.c.sendEmptyMessage(2);
        }
        s.a();
    }
    
    public final void H(final float g, final float n) {
        super.H(g, n);
        final bsl s = this.s;
        s.g = g;
        s.b();
        s.d(false);
    }
    
    public boolean T() {
        Label_0050: {
            if (super.T()) {
                if (!this.B) {
                    final PlaceholderSurface y = this.y;
                    if ((y == null || this.d != y) && super.h != null) {
                        break Label_0050;
                    }
                }
                this.F = -9223372036854775807L;
                return true;
            }
        }
        if (this.F == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.F) {
            return true;
        }
        this.F = -9223372036854775807L;
        return false;
    }
    
    protected bdz U(final blz blz, final ayg ayg, final ayg ayg2) {
        final bdz b = blz.b(ayg, ayg2);
        final int e = b.e;
        final int s = ayg2.s;
        final aetm u = this.U;
        int n = 0;
        Label_0061: {
            if (s <= u.c) {
                n = e;
                if (ayg2.t <= u.a) {
                    break Label_0061;
                }
            }
            n = (e | 0x100);
        }
        int n2 = n;
        if (av(blz, ayg2) > this.U.b) {
            n2 = (n | 0x40);
        }
        final String a = blz.a;
        int d;
        if (n2 != 0) {
            d = 0;
        }
        else {
            d = b.d;
            n2 = 0;
        }
        return new bdz(a, ayg, ayg2, d, n2);
    }
    
    protected final blu V(final blz blz, final ayg ayg, final MediaCrypto mediaCrypto, final float n) {
        final PlaceholderSurface y = this.y;
        if (y != null && y.a != blz.f) {
            this.aM();
        }
        final String c = blz.c;
        final aetm ag = this.aG(blz, ayg, ((bdx)this).N());
        this.U = ag;
        final boolean v = this.v;
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", c);
        mediaFormat.setInteger("width", ayg.s);
        mediaFormat.setInteger("height", ayg.t);
        dl.r(mediaFormat, ayg.p);
        final float u = ayg.u;
        if (u != -1.0f) {
            mediaFormat.setFloat("frame-rate", u);
        }
        dl.q(mediaFormat, "rotation-degrees", ayg.v);
        final aya z = ayg.z;
        if (z != null) {
            dl.q(mediaFormat, "color-transfer", z.c);
            dl.q(mediaFormat, "color-standard", z.a);
            dl.q(mediaFormat, "color-range", z.b);
            final byte[] d = z.d;
            if (d != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(d));
            }
        }
        if ("video/dolby-vision".equals(ayg.n)) {
            final Pair a = bmk.a(ayg);
            if (a != null) {
                dl.q(mediaFormat, "profile", (int)a.first);
            }
        }
        mediaFormat.setInteger("max-width", ag.c);
        mediaFormat.setInteger("max-height", ag.a);
        dl.q(mediaFormat, "max-input-size", ag.b);
        final int a2 = bax.a;
        mediaFormat.setInteger("priority", 0);
        if (n != -1.0f) {
            mediaFormat.setFloat("operating-rate", n);
        }
        if (v) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.d == null) {
            if (!this.aP(blz)) {
                throw new IllegalStateException();
            }
            if (this.y == null) {
                this.y = PlaceholderSurface.b(blz.f);
            }
            this.d = (Surface)this.y;
        }
        return blu.a(blz, mediaFormat, ayg, this.d, mediaCrypto);
    }
    
    protected final List W(final bme bme, final ayg ayg, final boolean b) {
        return bmk.e(c(this.r, bme, ayg, b, false), ayg);
    }
    
    protected final void X(final Exception ex) {
        bap.b("MediaCodecVideoRenderer", "Video codec error", (Throwable)ex);
        this.V.R(ex);
    }
    
    protected void Y(final String s, final blu blu, final long n, final long n2) {
        this.V.K(s, n, n2);
        this.w = this.az(s);
        final blz k = super.k;
        dk.d((Object)k);
        final int a = bax.a;
        boolean x;
        final boolean b = x = false;
        if (a >= 29) {
            x = b;
            if ("video/x-vnd.on2.vp9".equals(k.b)) {
                final MediaCodecInfo$CodecProfileLevel[] f = k.f();
                final int length = f.length;
                int n3 = 0;
                while (true) {
                    x = b;
                    if (n3 >= length) {
                        break;
                    }
                    if (f[n3].profile == 16384) {
                        x = true;
                        break;
                    }
                    ++n3;
                }
            }
        }
        this.x = x;
    }
    
    protected final void Z(final String s) {
        this.V.L(s);
    }
    
    protected boolean aA(final long n, final boolean b) {
        final int i = ((bdx)this).i(n);
        if (i == 0) {
            return false;
        }
        if (b) {
            final bdy o = this.o;
            o.d += i;
            o.f += this.J;
        }
        else {
            final bdy o2 = this.o;
            ++o2.j;
            this.ax(i, this.J);
        }
        this.at();
        return true;
    }
    
    protected boolean aB(final long n, final long n2, final boolean b) {
        return n < -500000L && !b;
    }
    
    protected boolean aC(final long n, final long n2, final boolean b) {
        return aO(n) && !b;
    }
    
    protected boolean aD(final long n, final long n2) {
        return aO(n) && n2 > 100000L;
    }
    
    protected final void aE(final blw blw, final int n, final long n2) {
        Label_0107: {
            int o;
            if ((o = this.O) == -1) {
                if (this.P == -1) {
                    break Label_0107;
                }
                o = -1;
            }
            final azs r = this.R;
            if (r == null || r.a != o || r.b != this.P || r.d != this.Q) {
                final azs r2 = new azs(o, this.P, this.Q);
                this.R = r2;
                this.V.S(r2);
            }
        }
        final int a = bax.a;
        blw.i(n, n2);
        this.L = SystemClock.elapsedRealtime() * 1000L;
        final bdy o2 = this.o;
        ++o2.e;
        this.I = 0;
        this.D = true;
        if (!this.B) {
            this.B = true;
            this.V.Q((Object)this.d);
            this.z = true;
        }
    }
    
    protected final void aF(final blw blw, final int n) {
        final int a = bax.a;
        blw.p(n);
        final bdy o = this.o;
        ++o.f;
    }
    
    protected aetm aG(final blz blz, final ayg ayg, final ayg[] array) {
        int s = ayg.s;
        final int t = ayg.t;
        int av = av(blz, ayg);
        final int length = array.length;
        if (length == 1) {
            int min;
            if ((min = av) != -1) {
                final int au = au(blz, ayg);
                min = av;
                if (au != -1) {
                    min = Math.min((int)(av * 1.5f), au);
                }
            }
            return new aetm(s, t, min, (byte[])null);
        }
        final int n = 0;
        int i = 0;
        int n2 = 0;
        int n3 = t;
        while (i < length) {
            ayg a;
            final ayg ayg2 = a = array[i];
            if (ayg.z != null) {
                a = ayg2;
                if (ayg2.z == null) {
                    final ayf b = ayg2.b();
                    b.w = ayg.z;
                    a = b.a();
                }
            }
            int max = s;
            int max2 = n3;
            int max3 = av;
            int n4 = n2;
            if (blz.b(ayg, a).d != 0) {
                final int s2 = a.s;
                n4 = (n2 | ((s2 == -1 || a.t == -1) ? 1 : 0));
                max = Math.max(s, s2);
                max2 = Math.max(n3, a.t);
                max3 = Math.max(av, av(blz, a));
            }
            ++i;
            s = max;
            n3 = max2;
            av = max3;
            n2 = n4;
        }
        int max4 = s;
        int max5 = n3;
        int max6 = av;
        if (n2 != 0) {
            final StringBuilder sb = new StringBuilder("Resolutions unknown. Codec max resolution: ");
            sb.append(s);
            sb.append("x");
            sb.append(n3);
            bap.c("MediaCodecVideoRenderer", sb.toString());
            int t2 = ayg.t;
            final int s3 = ayg.s;
            final boolean b2 = t2 > s3;
            int n5;
            if (b2) {
                n5 = t2;
            }
            else {
                n5 = s3;
            }
            if (b2) {
                t2 = s3;
            }
            final int[] e = bsc.e;
            int j = n;
            while (true) {
                while (j < 9) {
                    final float n6 = (float)n5;
                    final float n7 = (float)t2;
                    int n8 = e[j];
                    final float n9 = (float)n8;
                    if (n8 <= n5) {
                        break;
                    }
                    final int n10 = (int)(n9 * (n7 / n6));
                    if (n10 <= t2) {
                        break;
                    }
                    final int a2 = bax.a;
                    int n11;
                    if (!b2) {
                        n11 = n8;
                    }
                    else {
                        n11 = n10;
                    }
                    if (!b2) {
                        n8 = n10;
                    }
                    final MediaCodecInfo$CodecCapabilities d = blz.d;
                    Point a3 = null;
                    Label_0534: {
                        if (d != null) {
                            final MediaCodecInfo$VideoCapabilities videoCapabilities = d.getVideoCapabilities();
                            if (videoCapabilities != null) {
                                a3 = blz.a(videoCapabilities, n11, n8);
                                break Label_0534;
                            }
                        }
                        a3 = null;
                    }
                    if (blz.e(a3.x, a3.y, ayg.u)) {
                        max4 = s;
                        max5 = n3;
                        max6 = av;
                        if (a3 != null) {
                            max4 = Math.max(s, a3.x);
                            max5 = Math.max(n3, a3.y);
                            final ayf b3 = ayg.b();
                            b3.p = max4;
                            b3.q = max5;
                            max6 = Math.max(av, au(blz, b3.a()));
                            final StringBuilder sb2 = new StringBuilder("Codec max resolution adjusted to: ");
                            sb2.append(max4);
                            sb2.append("x");
                            sb2.append(max5);
                            bap.c("MediaCodecVideoRenderer", sb2.toString());
                            return new aetm(max4, max5, max6, (byte[])null);
                        }
                        return new aetm(max4, max5, max6, (byte[])null);
                    }
                    else {
                        ++j;
                    }
                }
                Point a3 = null;
                continue;
            }
        }
        return new aetm(max4, max5, max6, (byte[])null);
    }
    
    protected final void aa(final ayg ayg, final MediaFormat mediaFormat) {
        final blw h = super.h;
        if (h != null) {
            h.l(this.A);
        }
        dk.d((Object)mediaFormat);
        final boolean b = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer;
        if (b) {
            integer = mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left") + 1;
        }
        else {
            integer = mediaFormat.getInteger("width");
        }
        this.O = integer;
        int integer2;
        if (b) {
            integer2 = mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top") + 1;
        }
        else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.P = integer2;
        this.Q = ayg.w;
        final int a = bax.a;
        final int v = ayg.v;
        if (v == 90 || v == 270) {
            final int o = this.O;
            this.O = this.P;
            this.P = o;
            this.Q = 1.0f / this.Q;
        }
        final bsl s = this.s;
        s.f = ayg.u;
        final brz a2 = s.a;
        a2.a.d();
        a2.b.d();
        a2.c = false;
        a2.d = -9223372036854775807L;
        a2.e = 0;
        s.c();
    }
    
    protected final void ab() {
        this.aH();
    }
    
    protected void ac(final bdc bdc) {
        ++this.J;
        final int a = bax.a;
    }
    
    protected boolean ae(long nanoTime, final long n, final blw blw, final ByteBuffer byteBuffer, final int n2, int e, int n3, long b, final boolean b2, final boolean b3, final ayg ayg) {
        dk.d((Object)blw);
        if (this.E == -9223372036854775807L) {
            this.E = nanoTime;
        }
        if (b != this.K) {
            final bsl s = this.s;
            final long l = s.l;
            if (l != -1L) {
                s.n = l;
                s.o = s.m;
            }
            ++s.k;
            final brz a = s.a;
            final long d = b * 1000L;
            a.a.c(d);
            if (a.a.e()) {
                a.c = false;
            }
            else if (a.d != -9223372036854775807L) {
                Label_0209: {
                    if (a.c) {
                        final bry b4 = a.b;
                        final long a2 = b4.a;
                        if (a2 == 0L) {
                            break Label_0209;
                        }
                        if (!b4.c[bry.a(a2 - 1L)]) {
                            break Label_0209;
                        }
                    }
                    a.b.d();
                    a.b.c(a.d);
                }
                a.c = true;
                a.b.c(d);
            }
            if (a.c && a.b.e()) {
                final bry a3 = a.a;
                a.a = a.b;
                a.b = a3;
                a.c = false;
            }
            a.d = d;
            if (a.a.e()) {
                e = 0;
            }
            else {
                e = a.e + 1;
            }
            a.e = e;
            s.c();
            this.K = b;
        }
        final long p11 = super.p;
        final long n4 = b - p11;
        if (b2 && !b3) {
            this.aF(blw, n2);
        }
        else {
            final double n5 = super.g;
            if (((bdx)this).b == 2) {
                e = 1;
            }
            else {
                e = 0;
            }
            final long n6 = SystemClock.elapsedRealtime() * 1000L;
            final double n7 = (double)(b - nanoTime);
            Double.isNaN(n7);
            Double.isNaN(n5);
            final long n8 = b = (long)(n7 / n5);
            if (e != 0) {
                b = n8 - (n6 - n);
            }
            if (this.d != this.y) {
                final long i = this.L;
                Label_0521: {
                    Label_0518: {
                        if (!this.D) {
                            if (e == 0) {
                                if (!this.C) {
                                    break Label_0518;
                                }
                            }
                        }
                        else if (this.B) {
                            break Label_0518;
                        }
                        n3 = 1;
                        break Label_0521;
                    }
                    n3 = 0;
                }
                Label_0601: {
                    if (this.F == -9223372036854775807L && nanoTime >= p11) {
                        if (n3 == 0) {
                            if (e == 0) {
                                break Label_0601;
                            }
                            if (!this.aD(b, n6 - i)) {
                                break Label_0601;
                            }
                        }
                        nanoTime = System.nanoTime();
                        this.aL(n4, nanoTime, ayg);
                        e = bax.a;
                        this.aE(blw, n2, nanoTime);
                        this.ay(b);
                        return true;
                    }
                }
                if (e != 0) {
                    if (nanoTime != this.E) {
                        final long nanoTime2 = System.nanoTime();
                        final long n9 = b * 1000L + nanoTime2;
                        final bsl s2 = this.s;
                        if (s2.n != -1L && s2.a.a()) {
                            final brz a4 = s2.a;
                            if (a4.a()) {
                                b = a4.a.b();
                            }
                            else {
                                b = -9223372036854775807L;
                            }
                            b = s2.o + (long)(b * (s2.k - s2.n) / s2.g);
                            if (Math.abs(n9 - b) > 20000000L) {
                                s2.b();
                                b = n9;
                            }
                        }
                        else {
                            b = n9;
                        }
                        s2.l = s2.k;
                        s2.m = b;
                        final bsk c = s2.c;
                        long n10 = b;
                        if (c != null) {
                            if (s2.i == -9223372036854775807L) {
                                n10 = b;
                            }
                            else {
                                final long b5 = c.b;
                                if (b5 == -9223372036854775807L) {
                                    n10 = b;
                                }
                                else {
                                    final long j = s2.i;
                                    long n11 = b5 + (b - b5) / j * j;
                                    long n12;
                                    if (b <= n11) {
                                        n12 = n11 - j;
                                    }
                                    else {
                                        final long n13 = j + n11;
                                        n12 = n11;
                                        n11 = n13;
                                    }
                                    final long k = s2.j;
                                    if (n11 - b >= b - n12) {
                                        n11 = n12;
                                    }
                                    n10 = n11 - k;
                                }
                            }
                        }
                        b = (n10 - nanoTime2) / 1000L;
                        final boolean b6 = this.F != -9223372036854775807L;
                        if (this.aB(b, n, b3) && this.aA(nanoTime, b6)) {
                            return false;
                        }
                        if (this.aC(b, n, b3)) {
                            if (b6) {
                                this.aF(blw, n2);
                            }
                            else {
                                e = bax.a;
                                blw.p(n2);
                                this.ax(0, 1);
                            }
                            this.ay(b);
                            return true;
                        }
                        e = bax.a;
                        if (b < 50000L) {
                            this.aL(n4, n10, ayg);
                            this.aE(blw, n2, n10);
                            this.ay(b);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (!aO(b)) {
                return false;
            }
            this.aF(blw, n2);
            this.ay(b);
        }
        return true;
    }
    
    protected final bdz ah(final bxc bxc) {
        final bdz ah = super.ah(bxc);
        this.V.P(bxc.a, ah);
        return ah;
    }
    
    protected final blx ai(final Throwable t, final blz blz) {
        return new bsa(t, blz, this.d);
    }
    
    protected void aj(final bdc bdc) {
        if (!this.x) {
            return;
        }
        final ByteBuffer f = bdc.f;
        dk.d((Object)f);
        if (f.remaining() >= 7) {
            final byte value = f.get();
            final short short1 = f.getShort();
            final short short2 = f.getShort();
            final byte value2 = f.get();
            final byte value3 = f.get();
            f.position(0);
            if (value == -75 && short1 == 60 && short2 == 1 && value2 == 4 && (value3 == 0 || value3 == 1)) {
                final byte[] array = new byte[f.remaining()];
                f.get(array);
                f.position(0);
                final blw h = super.h;
                final Bundle bundle = new Bundle();
                bundle.putByteArray("hdr10-plus-info", array);
                h.k(bundle);
            }
        }
    }
    
    protected void al(final long n) {
        super.al(n);
        --this.J;
    }
    
    protected final void an() {
        super.an();
        this.J = 0;
    }
    
    protected boolean aq(final blz blz) {
        return this.d != null || this.aP(blz);
    }
    
    protected void aw(final blw blw, final Surface surface) {
        blw.j(surface);
    }
    
    protected final void ax(int u, final int n) {
        final bdy o = this.o;
        o.h += u;
        final int g = o.g;
        u += n;
        o.g = g + u;
        this.H += u;
        u += this.I;
        this.I = u;
        o.i = Math.max(u, o.i);
        u = this.u;
        if (u > 0 && this.H >= u) {
            this.aJ();
        }
    }
    
    protected final void ay(final long n) {
        final bdy o = this.o;
        o.k += n;
        ++o.l;
        this.M += n;
        ++this.N;
    }
    
    protected boolean az(String s) {
        final boolean startsWith = s.startsWith("OMX.google");
        final boolean b = false;
        if (startsWith) {
            return false;
        }
        monitorenter(bsc.class);
        try {
            if (!bsc.f) {
                final int a = bax.a;
                final int n = 28;
                final int n2 = -1;
                boolean q = false;
            Label_4787:
                while (true) {
                    Label_0313: {
                        if (a > 28) {
                            break Label_0313;
                        }
                        s = bax.b;
                        int n3 = 0;
                        Label_0255: {
                            switch (s.hashCode()) {
                                case 825323514: {
                                    if (s.equals("machuca")) {
                                        n3 = 5;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case 3415681: {
                                    if (s.equals("once")) {
                                        n3 = 6;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case -64886864: {
                                    if (s.equals("magnolia")) {
                                        n3 = 4;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case -760312546: {
                                    if (s.equals("aquaman")) {
                                        n3 = 0;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case -1012436106: {
                                    if (s.equals("oneday")) {
                                        n3 = 7;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case -1220066608: {
                                    if (s.equals("dangalUHD")) {
                                        n3 = 2;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case -1220081023: {
                                    if (s.equals("dangalFHD")) {
                                        n3 = 3;
                                        break Label_0255;
                                    }
                                    break;
                                }
                                case -1339091551: {
                                    if (s.equals("dangal")) {
                                        n3 = 1;
                                        break Label_0255;
                                    }
                                    break;
                                }
                            }
                            n3 = -1;
                        }
                        switch (n3) {
                            default: {
                                break Label_0313;
                            }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7: {
                                break;
                            }
                        }
                        q = true;
                        break Label_4787;
                    }
                    if (bax.a <= 27 && "HWEML".equals(bax.b)) {
                        continue;
                    }
                    s = bax.d;
                    int n4 = 0;
                    Label_0571: {
                        switch (s.hashCode()) {
                            case 2119412532: {
                                if (s.equals("AFTEUFF014")) {
                                    n4 = 5;
                                    break Label_0571;
                                }
                                break;
                            }
                            case 1798172390: {
                                if (s.equals("AFTSO001")) {
                                    n4 = 8;
                                    break Label_0571;
                                }
                                break;
                            }
                            case 1785421876: {
                                if (s.equals("AFTEU014")) {
                                    n4 = 4;
                                    break Label_0571;
                                }
                                break;
                            }
                            case 1785421873: {
                                if (s.equals("AFTEU011")) {
                                    n4 = 3;
                                    break Label_0571;
                                }
                                break;
                            }
                            case 2006371: {
                                if (s.equals("AFTR")) {
                                    n4 = 2;
                                    break Label_0571;
                                }
                                break;
                            }
                            case 2006367: {
                                if (s.equals("AFTN")) {
                                    n4 = 1;
                                    break Label_0571;
                                }
                                break;
                            }
                            case 2006354: {
                                if (s.equals("AFTA")) {
                                    n4 = 0;
                                    break Label_0571;
                                }
                                break;
                            }
                            case -321033677: {
                                if (s.equals("AFTKMST12")) {
                                    n4 = 7;
                                    break Label_0571;
                                }
                                break;
                            }
                            case -349662828: {
                                if (s.equals("AFTJMST12")) {
                                    n4 = 6;
                                    break Label_0571;
                                }
                                break;
                            }
                        }
                        n4 = -1;
                    }
                    switch (n4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8: {
                            continue;
                        }
                        default: {
                            q = b;
                            if (bax.a > 26) {
                                break;
                            }
                            final String b2 = bax.b;
                            int n5 = 0;
                            Label_4171: {
                                switch (b2.hashCode()) {
                                    case 2048855701: {
                                        if (b2.equals("HWWAS-H")) {
                                            n5 = 66;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2048319463: {
                                        if (b2.equals("HWVNS-H")) {
                                            n5 = 65;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2047252157: {
                                        if (b2.equals("ELUGA_Prim")) {
                                            n5 = 33;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2047190025: {
                                        if (b2.equals("ELUGA_Note")) {
                                            n5 = 32;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2033393791: {
                                        if (b2.equals("ASUS_X00AD_2")) {
                                            n5 = 14;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2030379515: {
                                        if (b2.equals("HWCAM-H")) {
                                            n5 = 64;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2029784656: {
                                        if (b2.equals("HWBLN-H")) {
                                            n5 = 63;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2019281702: {
                                        if (b2.equals("DM-01K")) {
                                            n5 = 29;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2006372676: {
                                        if (b2.equals("BRAVIA_ATV3_4K")) {
                                            n5 = 19;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1977196784: {
                                        if (b2.equals("Infinix-X572")) {
                                            n5 = 69;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1906253259: {
                                        if (b2.equals("PB2-670M")) {
                                            n5 = 100;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1865889110: {
                                        if (b2.equals("santoni")) {
                                            n5 = 117;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1709443163: {
                                        if (b2.equals("iball8735_9806")) {
                                            n5 = 68;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1691544261: {
                                        if (b2.equals("CPH1715")) {
                                            n5 = 24;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1691543273: {
                                        if (b2.equals("CPH1609")) {
                                            n5 = 23;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1522194893: {
                                        if (b2.equals("woods_f")) {
                                            n5 = 133;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1349174697: {
                                        if (b2.equals("htc_e56ml_dtul")) {
                                            n5 = 61;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1306947716: {
                                        if (b2.equals("EverStar_S")) {
                                            n5 = 35;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1280332038: {
                                        if (b2.equals("hwALE-H")) {
                                            n5 = 62;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1176899427: {
                                        if (b2.equals("itel_S41")) {
                                            n5 = 71;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1150207623: {
                                        if (b2.equals("LS-5017")) {
                                            n5 = 78;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1060579533: {
                                        if (b2.equals("panell_d")) {
                                            n5 = 96;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 958008161: {
                                        if (b2.equals("j2xlteins")) {
                                            n5 = 72;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 917340916: {
                                        if (b2.equals("A7000plus")) {
                                            n5 = 10;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 835649806: {
                                        if (b2.equals("manning")) {
                                            n5 = 81;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 794040393: {
                                        if (b2.equals("GIONEE_WBL7519")) {
                                            n5 = 59;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 794038622: {
                                        if (b2.equals("GIONEE_WBL7365")) {
                                            n5 = 58;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 793982701: {
                                        if (b2.equals("GIONEE_WBL5708")) {
                                            n5 = 57;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 507412548: {
                                        if (b2.equals("QM16XE_U")) {
                                            n5 = 114;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 407160593: {
                                        if (b2.equals("Pixi5-10_4G")) {
                                            n5 = 106;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 316246818: {
                                        if (b2.equals("TB3-850M")) {
                                            n5 = 125;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 316246811: {
                                        if (b2.equals("TB3-850F")) {
                                            n5 = 124;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 316215116: {
                                        if (b2.equals("TB3-730X")) {
                                            n5 = 123;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 316215098: {
                                        if (b2.equals("TB3-730F")) {
                                            n5 = 122;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 308517133: {
                                        if (b2.equals("A7020a48")) {
                                            n5 = 12;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 307593612: {
                                        if (b2.equals("A7010a48")) {
                                            n5 = 11;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 287431619: {
                                        if (b2.equals("griffin")) {
                                            n5 = 60;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 245388979: {
                                        if (b2.equals("marino_f")) {
                                            n5 = 82;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 182191441: {
                                        if (b2.equals("CPY83_I00")) {
                                            n5 = 25;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 165221241: {
                                        if (b2.equals("A2016a40")) {
                                            n5 = 8;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 102844228: {
                                        if (b2.equals("le_x6")) {
                                            n5 = 77;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 101370885: {
                                        if (b2.equals("l5460")) {
                                            n5 = 76;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 98715550: {
                                        if (b2.equals("i9031")) {
                                            n5 = 67;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 82882791: {
                                        if (b2.equals("X3_HK")) {
                                            n5 = 135;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 80963634: {
                                        if (b2.equals("V23GB")) {
                                            n5 = 128;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 76404911: {
                                        if (b2.equals("Q4310")) {
                                            n5 = 112;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 76404105: {
                                        if (b2.equals("Q4260")) {
                                            n5 = 110;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 76402249: {
                                        if (b2.equals("PRO7S")) {
                                            n5 = 108;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 66216390: {
                                        if (b2.equals("F3311")) {
                                            n5 = 48;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 66215433: {
                                        if (b2.equals("F3215")) {
                                            n5 = 47;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 66215431: {
                                        if (b2.equals("F3213")) {
                                            n5 = 46;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 66215429: {
                                        if (b2.equals("F3211")) {
                                            n5 = 45;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 66214473: {
                                        if (b2.equals("F3116")) {
                                            n5 = 44;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 66214470: {
                                        if (b2.equals("F3113")) {
                                            n5 = 43;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 66214468: {
                                        if (b2.equals("F3111")) {
                                            n5 = 42;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 65355429: {
                                        if (b2.equals("E5643")) {
                                            n5 = 30;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 61542055: {
                                        if (b2.equals("A1601")) {
                                            n5 = 7;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 55178625: {
                                        if (b2.equals("Aura_Note_2")) {
                                            n5 = 15;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 51350594: {
                                        if (b2.equals("602LV")) {
                                            n5 = 4;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 51349633: {
                                        if (b2.equals("601LV")) {
                                            n5 = 3;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 41325051: {
                                        if (b2.equals("MEIZU_M5")) {
                                            n5 = 83;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 3386211: {
                                        if (b2.equals("p212")) {
                                            n5 = 92;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 3351335: {
                                        if (b2.equals("mido")) {
                                            n5 = 85;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 3284551: {
                                        if (b2.equals("kate")) {
                                            n5 = 75;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 3154429: {
                                        if (b2.equals("fugu")) {
                                            n5 = 50;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2689555: {
                                        if (b2.equals("XE2X")) {
                                            n5 = 136;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2464648: {
                                        if (b2.equals("Q427")) {
                                            n5 = 111;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2463773: {
                                        if (b2.equals("Q350")) {
                                            n5 = 109;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2436959: {
                                        if (b2.equals("P681")) {
                                            n5 = 93;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2133184: {
                                        if (b2.equals("F04J")) {
                                            n5 = 41;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2133182: {
                                        if (b2.equals("F04H")) {
                                            n5 = 40;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2133151: {
                                        if (b2.equals("F03H")) {
                                            n5 = 39;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2133120: {
                                        if (b2.equals("F02H")) {
                                            n5 = 38;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2133091: {
                                        if (b2.equals("F01J")) {
                                            n5 = 37;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2133089: {
                                        if (b2.equals("F01H")) {
                                            n5 = 36;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1514185: {
                                        if (b2.equals("1714")) {
                                            n5 = 2;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1514184: {
                                        if (b2.equals("1713")) {
                                            n5 = 1;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 1513190: {
                                        if (b2.equals("1601")) {
                                            n5 = 0;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 101481: {
                                        if (b2.equals("flo")) {
                                            n5 = 49;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 99329: {
                                        if (b2.equals("deb")) {
                                            n5 = n;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 98848: {
                                        if (b2.equals("cv3")) {
                                            n5 = 27;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 98846: {
                                        if (b2.equals("cv1")) {
                                            n5 = 26;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 88274: {
                                        if (b2.equals("Z80")) {
                                            n5 = 139;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 80618: {
                                        if (b2.equals("QX1")) {
                                            n5 = 115;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 79305: {
                                        if (b2.equals("PLE")) {
                                            n5 = 107;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 78669: {
                                        if (b2.equals("P85")) {
                                            n5 = 94;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 76779: {
                                        if (b2.equals("MX6")) {
                                            n5 = 86;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 75739: {
                                        if (b2.equals("M5c")) {
                                            n5 = 80;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 75537: {
                                        if (b2.equals("M04")) {
                                            n5 = 79;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 73405: {
                                        if (b2.equals("JGZ")) {
                                            n5 = 73;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 3483: {
                                        if (b2.equals("mh")) {
                                            n5 = 84;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 3091: {
                                        if (b2.equals("b5")) {
                                            n5 = 16;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2719: {
                                        if (b2.equals("V5")) {
                                            n5 = 129;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2715: {
                                        if (b2.equals("V1")) {
                                            n5 = 127;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2564: {
                                        if (b2.equals("Q5")) {
                                            n5 = 113;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case 2126: {
                                        if (b2.equals("C1")) {
                                            n5 = 20;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -56598463: {
                                        if (b2.equals("woods_fn")) {
                                            n5 = 134;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -173639913: {
                                        if (b2.equals("ELUGA_A3_Pro")) {
                                            n5 = 31;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -277133239: {
                                        if (b2.equals("Z12_PRO")) {
                                            n5 = 138;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -282781963: {
                                        if (b2.equals("BLACK-1X")) {
                                            n5 = 17;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -290434366: {
                                        if (b2.equals("taido_row")) {
                                            n5 = 121;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -430914369: {
                                        if (b2.equals("Pixi4-7_3G")) {
                                            n5 = 105;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -521118391: {
                                        if (b2.equals("GIONEE_GBL7360")) {
                                            n5 = 53;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -575125681: {
                                        if (b2.equals("GiONEE_CBL7513")) {
                                            n5 = 51;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -782144577: {
                                        if (b2.equals("OnePlus5T")) {
                                            n5 = 91;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -788334647: {
                                        if (b2.equals("whyred")) {
                                            n5 = 132;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -794946968: {
                                        if (b2.equals("watson")) {
                                            n5 = 131;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -797483286: {
                                        if (b2.equals("SVP-DTV15")) {
                                            n5 = 119;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -821392978: {
                                        if (b2.equals("A7000-a")) {
                                            n5 = 9;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -842500323: {
                                        if (b2.equals("nicklaus_f")) {
                                            n5 = 88;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -879245230: {
                                        if (b2.equals("tcl_eu")) {
                                            n5 = 126;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -958336948: {
                                        if (b2.equals("ELUGA_Ray_X")) {
                                            n5 = 34;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -965403638: {
                                        if (b2.equals("s905x018")) {
                                            n5 = 120;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -993250458: {
                                        if (b2.equals("A10-70L")) {
                                            n5 = 6;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -993250464: {
                                        if (b2.equals("A10-70F")) {
                                            n5 = 5;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1052835013: {
                                        if (b2.equals("namath")) {
                                            n5 = 87;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1139198265: {
                                        if (b2.equals("Slate_Pro")) {
                                            n5 = 118;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1180384755: {
                                        if (b2.equals("iris60")) {
                                            n5 = 70;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1217592143: {
                                        if (b2.equals("BRAVIA_ATV2")) {
                                            n5 = 18;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1320080169: {
                                        if (b2.equals("GiONEE_GBL7319")) {
                                            n5 = 52;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1481772729: {
                                        if (b2.equals("panell_dt")) {
                                            n5 = 99;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1481772730: {
                                        if (b2.equals("panell_ds")) {
                                            n5 = 98;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1481772737: {
                                        if (b2.equals("panell_dl")) {
                                            n5 = 97;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1554255044: {
                                        if (b2.equals("vernee_M5")) {
                                            n5 = 130;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1600724499: {
                                        if (b2.equals("pacificrim")) {
                                            n5 = 95;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1615810839: {
                                        if (b2.equals("Phantom6")) {
                                            n5 = 104;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1680025915: {
                                        if (b2.equals("ComioS1")) {
                                            n5 = 21;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1696512866: {
                                        if (b2.equals("XT1663")) {
                                            n5 = 137;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1885099851: {
                                        if (b2.equals("RAIJIN")) {
                                            n5 = 116;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1931988508: {
                                        if (b2.equals("AquaPowerM")) {
                                            n5 = 13;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1936688065: {
                                        if (b2.equals("PGN611")) {
                                            n5 = 103;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1936688066: {
                                        if (b2.equals("PGN610")) {
                                            n5 = 102;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1936688988: {
                                        if (b2.equals("PGN528")) {
                                            n5 = 101;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1978990237: {
                                        if (b2.equals("NX573J")) {
                                            n5 = 90;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -1978993182: {
                                        if (b2.equals("NX541J")) {
                                            n5 = 89;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -2022874474: {
                                        if (b2.equals("CP8676_I02")) {
                                            n5 = 22;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -2097309513: {
                                        if (b2.equals("K50a40")) {
                                            n5 = 74;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -2144781160: {
                                        if (b2.equals("GIONEE_SWW1631")) {
                                            n5 = 56;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -2144781185: {
                                        if (b2.equals("GIONEE_SWW1627")) {
                                            n5 = 55;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                    case -2144781245: {
                                        if (b2.equals("GIONEE_SWW1609")) {
                                            n5 = 54;
                                            break Label_4171;
                                        }
                                        break;
                                    }
                                }
                                n5 = -1;
                            }
                            switch (n5) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 60:
                                case 61:
                                case 62:
                                case 63:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                case 68:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                case 89:
                                case 90:
                                case 91:
                                case 92:
                                case 93:
                                case 94:
                                case 95:
                                case 96:
                                case 97:
                                case 98:
                                case 99:
                                case 100:
                                case 101:
                                case 102:
                                case 103:
                                case 104:
                                case 105:
                                case 106:
                                case 107:
                                case 108:
                                case 109:
                                case 110:
                                case 111:
                                case 112:
                                case 113:
                                case 114:
                                case 115:
                                case 116:
                                case 117:
                                case 118:
                                case 119:
                                case 120:
                                case 121:
                                case 122:
                                case 123:
                                case 124:
                                case 125:
                                case 126:
                                case 127:
                                case 128:
                                case 129:
                                case 130:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                case 136:
                                case 137:
                                case 138:
                                case 139: {
                                    continue;
                                }
                                default: {
                                    int n6;
                                    if (s.hashCode() != -594534941) {
                                        n6 = n2;
                                    }
                                    else {
                                        n6 = n2;
                                        if (s.equals("JSN-L21")) {
                                            n6 = 0;
                                        }
                                    }
                                    if (n6 != 0) {
                                        q = b;
                                        break Label_4787;
                                    }
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                bsc.q = q;
                bsc.f = true;
            }
            monitorexit(bsc.class);
            return bsc.q;
        }
        finally {
            monitorexit(bsc.class);
            while (true) {}
        }
    }
    
    public final String d() {
        return "MediaCodecVideoRenderer";
    }
    
    protected float e(final float n, final ayg ayg, final ayg[] array) {
        int i = 0;
        float n2 = -1.0f;
        while (i < array.length) {
            final float u = array[i].u;
            float max = n2;
            if (u != -1.0f) {
                max = Math.max(n2, u);
            }
            ++i;
            n2 = max;
        }
        if (n2 == -1.0f) {
            return -1.0f;
        }
        return n2 * n;
    }
    
    protected final int f(final bme bme, final ayg ayg) {
        final boolean m = ayz.m(ayg.n);
        final int n = 0;
        if (!m) {
            return ber.b(0);
        }
        final boolean b = ayg.q != null;
        List list2;
        final List list = list2 = c(this.r, bme, ayg, b, (boolean)(0 != 0));
        if (b) {
            list2 = list;
            if (list.isEmpty()) {
                list2 = c(this.r, bme, ayg, false, false);
            }
        }
        if (list2.isEmpty()) {
            return ber.b(1);
        }
        if (!ar(ayg)) {
            return ber.b(2);
        }
        final blz blz = list2.get(0);
        boolean c = blz.c(ayg);
        blz blz3 = null;
        boolean b2 = false;
        Label_0200: {
            if (!c) {
                for (int i = 1; i < list2.size(); ++i) {
                    final blz blz2 = list2.get(i);
                    if (blz2.c(ayg)) {
                        blz3 = blz2;
                        b2 = false;
                        c = true;
                        break Label_0200;
                    }
                }
            }
            b2 = true;
            blz3 = blz;
        }
        int n2;
        if (!c) {
            n2 = 3;
        }
        else {
            n2 = 4;
        }
        int n3;
        if (!blz3.d(ayg)) {
            n3 = 8;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (!blz3.g) {
            n4 = 0;
        }
        else {
            n4 = 64;
        }
        int n5;
        if (!b2) {
            n5 = 0;
        }
        else {
            n5 = 128;
        }
        final int a = bax.a;
        int n6 = n5;
        if ("video/dolby-vision".equals(ayg.n)) {
            n6 = n5;
            if (!bsb.a(this.r)) {
                n6 = 256;
            }
        }
        int n7 = n;
        if (c) {
            final List c2 = c(this.r, bme, ayg, b, true);
            n7 = n;
            if (!c2.isEmpty()) {
                final blz blz4 = bmk.e(c2, ayg).get(0);
                n7 = n;
                if (blz4.c(ayg)) {
                    n7 = n;
                    if (blz4.d(ayg)) {
                        n7 = 32;
                    }
                }
            }
        }
        return ber.d(n2, n3, n7, n4, n6);
    }
    
    public void t(int s, final Object o) {
        if (s != 1) {
            if (s == 7) {
                this.T = (bsf)o;
                return;
            }
            if (s != 10) {
                if (s != 4) {
                    if (s == 5) {
                        final bsl s2 = this.s;
                        s = (int)o;
                        if (s2.h != s) {
                            s2.h = s;
                            s2.d(true);
                        }
                    }
                }
                else {
                    s = (int)o;
                    this.A = s;
                    final blw h = super.h;
                    if (h != null) {
                        h.l(s);
                    }
                }
            }
            else {
                s = (int)o;
                if (this.S != s) {
                    this.S = s;
                }
            }
        }
        else {
            final boolean b = o instanceof Surface;
            final Surface surface = null;
            Surface surface2;
            if (b) {
                surface2 = (Surface)o;
            }
            else {
                surface2 = null;
            }
            Object o2 = surface2;
            if (surface2 == null) {
                o2 = this.y;
                if (o2 == null) {
                    final blz k = super.k;
                    o2 = surface2;
                    if (k != null) {
                        o2 = surface2;
                        if (this.aP(k)) {
                            o2 = PlaceholderSurface.b(k.f);
                            this.y = (PlaceholderSurface)o2;
                        }
                    }
                }
            }
            if (this.d != o2) {
                this.d = (Surface)o2;
                final bsl s3 = this.s;
                Surface e = surface;
                if (!(o2 instanceof PlaceholderSurface)) {
                    e = (Surface)o2;
                }
                if (s3.e != e) {
                    s3.a();
                    s3.e = e;
                    s3.d(true);
                }
                this.z = false;
                final int b2 = ((bdx)this).b;
                final blw h2 = super.h;
                if (h2 != null) {
                    s = bax.a;
                    if (o2 != null && !this.w) {
                        this.aw(h2, (Surface)o2);
                    }
                    else {
                        this.am();
                        this.ak();
                    }
                }
                if (o2 == null || o2 == this.y) {
                    this.aI();
                    this.aH();
                    return;
                }
                this.aK();
                this.aH();
                if (b2 == 2) {
                    this.aN();
                }
            }
            else if (o2 != null && o2 != this.y) {
                this.aK();
                if (this.z) {
                    this.V.Q((Object)this.d);
                }
            }
        }
    }
    
    protected final void w() {
        this.aI();
        this.aH();
        this.z = false;
        try {
            super.w();
        }
        finally {
            this.V.M(this.o);
        }
    }
    
    protected void x(final boolean b, final boolean c) {
        super.x(b, c);
        ((bdx)this).O();
        dk.h(true);
        this.V.O(this.o);
        this.C = c;
        this.D = false;
    }
    
    protected void y(final long n, final boolean b) {
        super.y(n, b);
        this.aH();
        this.s.b();
        this.K = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.I = 0;
        if (b) {
            this.aN();
            return;
        }
        this.F = -9223372036854775807L;
    }
    
    protected final void z() {
        try {
            super.z();
            if (this.y != null) {
                this.aM();
            }
        }
        finally {
            if (this.y != null) {
                this.aM();
            }
        }
    }
}
