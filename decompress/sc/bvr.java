import android.util.Pair;
import java.util.List;
import java.nio.ByteOrder;
import java.util.ArrayList;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.DrmInitData$SchemeData;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public class bvr implements btj
{
    public static final byte[] a;
    public static final UUID b;
    public static final Map c;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private final bas A;
    private final bas B;
    private final bas C;
    private final bas D;
    private final bas E;
    private final bas F;
    private ByteBuffer G;
    private long H;
    private long I;
    private boolean J;
    private int K;
    private boolean L;
    private long M;
    private long N;
    private boolean O;
    private int P;
    private long Q;
    private int R;
    private int S;
    private int[] T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private byte ae;
    private boolean af;
    private btm ag;
    private final lwi ah;
    public long d;
    public long e;
    public long f;
    public bvq g;
    public long h;
    public long i;
    public boolean j;
    public long k;
    public int l;
    public boolean m;
    public long n;
    public agnt o;
    public agnt p;
    private final bvs t;
    private final SparseArray u;
    private final boolean v;
    private final bas w;
    private final bas x;
    private final bas y;
    private final bas z;
    
    static {
        q = new byte[] { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
        a = bax.aj("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        r = new byte[] { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
        s = new byte[] { 87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10 };
        b = new UUID(72057594037932032L, -9223371306706625679L);
        final HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public bvr() {
        this(0);
    }
    
    public bvr(final int n) {
        final lwi ah = new lwi((byte[])null);
        this.d = -1L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.I = -9223372036854775807L;
        this.M = -1L;
        this.N = -1L;
        this.i = -9223372036854775807L;
        this.ah = ah;
        ah.g = new pvh(this);
        this.v = (0x1 == (n ^ 0x1));
        this.t = new bvs();
        this.u = new SparseArray();
        this.y = new bas(4);
        this.z = new bas(ByteBuffer.allocate(4).putInt(-1).array());
        this.A = new bas(4);
        this.w = new bas(btx.a);
        this.x = new bas(4);
        this.B = new bas();
        this.C = new bas();
        this.D = new bas(8);
        this.E = new bas();
        this.F = new bas();
        this.T = new int[1];
    }
    
    private final int n() {
        final int y = this.Y;
        this.t();
        return y;
    }
    
    private final int o(final btk btk, final bvq bvq, int n, final boolean b) {
        if ("S_TEXT/UTF8".equals(bvq.b)) {
            this.u(btk, bvr.q, n);
            return this.n();
        }
        if ("S_TEXT/ASS".equals(bvq.b)) {
            this.u(btk, bvr.r, n);
            return this.n();
        }
        if ("S_TEXT/WEBVTT".equals(bvq.b)) {
            this.u(btk, bvr.s, n);
            return this.n();
        }
        final bud w = bvq.W;
        final boolean aa = this.aa;
        final boolean b2 = true;
        if (!aa) {
            if (bvq.h) {
                this.W &= 0xBFFFFFFF;
                final boolean ab = this.ab;
                int n2 = 128;
                if (!ab) {
                    btk.k(this.y.a, 0, 1);
                    ++this.X;
                    final byte ae = this.y.a[0];
                    if ((ae & 0x80) == 0x80) {
                        throw aza.a("Extension bit is set in signal byte", (Throwable)null);
                    }
                    this.ae = ae;
                    this.ab = true;
                }
                final byte ae2 = this.ae;
                if ((ae2 & 0x1) == 0x1) {
                    final int n3 = ae2 & 0x2;
                    this.W |= 0x40000000;
                    if (!this.af) {
                        btk.k(this.D.a, 0, 8);
                        this.X += 8;
                        this.af = true;
                        final bas y = this.y;
                        final byte[] a = y.a;
                        if (n3 != 2) {
                            n2 = 0;
                        }
                        a[0] = (byte)(n2 | 0x8);
                        y.G(0);
                        w.d(this.y, 1, 1);
                        ++this.Y;
                        this.D.G(0);
                        w.d(this.D, 8, 1);
                        this.Y += 8;
                    }
                    if (n3 == 2) {
                        if (!this.ac) {
                            btk.k(this.y.a, 0, 1);
                            ++this.X;
                            this.y.G(0);
                            this.ad = this.y.i();
                            this.ac = true;
                        }
                        final int n4 = this.ad * 4;
                        this.y.C(n4);
                        btk.k(this.y.a, 0, n4);
                        this.X += n4;
                        final int n5 = (this.ad >> 1) + 1;
                        final int n6 = n5 * 6 + 2;
                        final ByteBuffer g = this.G;
                        if (g == null || g.capacity() < n6) {
                            this.G = ByteBuffer.allocate(n6);
                        }
                        this.G.position(0);
                        this.G.putShort((short)n5);
                        int n7 = 0;
                        int n8 = 0;
                        int ad;
                        while (true) {
                            ad = this.ad;
                            if (n7 >= ad) {
                                break;
                            }
                            final int l = this.y.l();
                            if (n7 % 2 == 0) {
                                this.G.putShort((short)(l - n8));
                            }
                            else {
                                this.G.putInt(l - n8);
                            }
                            ++n7;
                            n8 = l;
                        }
                        final int n9 = n - this.X - n8;
                        if ((ad & 0x1) == 0x1) {
                            this.G.putInt(n9);
                        }
                        else {
                            this.G.putShort((short)n9);
                            this.G.putInt(0);
                        }
                        this.E.E(this.G.array(), n6);
                        w.d(this.E, n6, 1);
                        this.Y += n6;
                    }
                }
            }
            else {
                final byte[] i = bvq.i;
                if (i != null) {
                    this.B.E(i, i.length);
                }
            }
            Label_0902: {
                if ("A_OPUS".equals(bvq.b)) {
                    if (!b) {
                        break Label_0902;
                    }
                }
                else if (bvq.f <= 0) {
                    break Label_0902;
                }
                this.W |= 0x10000000;
                this.F.C(0);
                final int n10 = this.B.c + n - this.X;
                this.y.C(4);
                final bas y2 = this.y;
                final byte[] a2 = y2.a;
                a2[0] = (byte)(n10 >> 24 & 0xFF);
                a2[1] = (byte)(n10 >> 16 & 0xFF);
                a2[2] = (byte)(n10 >> 8 & 0xFF);
                a2[3] = (byte)(n10 & 0xFF);
                w.d(y2, 4, 2);
                this.Y += 4;
            }
            this.aa = true;
        }
        n += this.B.c;
        if (!"V_MPEG4/ISO/AVC".equals(bvq.b) && !"V_MPEGH/ISO/HEVC".equals(bvq.b)) {
            if (bvq.Y != null) {
                dk.h(this.B.c == 0 && b2);
                bvq.Y.e(btk);
            }
            while (true) {
                final int x = this.X;
                if (x >= n) {
                    break;
                }
                final int p4 = this.p(btk, w, n - x);
                this.X += p4;
                this.Y += p4;
            }
        }
        else {
            final byte[] a3 = this.x.a;
            a3[0] = 0;
            a3[2] = (a3[1] = 0);
            final int x2 = bvq.X;
            final int n11 = 4 - x2;
            while (this.X < n) {
                final int z = this.Z;
                if (z == 0) {
                    final int min = Math.min(x2, this.B.a());
                    btk.k(a3, n11 + min, x2 - min);
                    if (min > 0) {
                        this.B.B(a3, n11, min);
                    }
                    this.X += x2;
                    this.x.G(0);
                    this.Z = this.x.l();
                    this.w.G(0);
                    w.c(this.w, 4);
                    this.Y += 4;
                }
                else {
                    final int p5 = this.p(btk, w, z);
                    this.X += p5;
                    this.Y += p5;
                    this.Z -= p5;
                }
            }
        }
        if ("A_VORBIS".equals(bvq.b)) {
            this.z.G(0);
            w.c(this.z, 4);
            this.Y += 4;
        }
        return this.n();
    }
    
    private final int p(final btk btk, final bud bud, int n) {
        final int a = this.B.a();
        if (a > 0) {
            n = Math.min(n, a);
            bud.c(this.B, n);
        }
        else {
            n = bud.a((ayb)btk, n, false);
        }
        return n;
    }
    
    private final void q() {
        dk.e((Object)this.ag);
    }
    
    private final void r(final bvq bvq, final long n, final int n2, int n3, final int n4) {
        final lzh y = bvq.Y;
        if (y != null) {
            y.d(bvq.W, n, n2, n3, n4, bvq.j);
        }
        else {
            if ("S_TEXT/UTF8".equals(bvq.b) || "S_TEXT/ASS".equals(bvq.b) || "S_TEXT/WEBVTT".equals(bvq.b)) {
                if (this.S > 1) {
                    bap.c("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                }
                else {
                    final long k = this.k;
                    if (k == -9223372036854775807L) {
                        bap.c("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    }
                    else {
                        final String b = bvq.b;
                        final byte[] a = this.C.a;
                        final int hashCode = b.hashCode();
                        int n5 = 0;
                        Label_0223: {
                            if (hashCode != 738597099) {
                                if (hashCode != 1045209816) {
                                    if (hashCode == 1422270023) {
                                        if (b.equals("S_TEXT/UTF8")) {
                                            n5 = 0;
                                            break Label_0223;
                                        }
                                    }
                                }
                                else if (b.equals("S_TEXT/WEBVTT")) {
                                    n5 = 2;
                                    break Label_0223;
                                }
                            }
                            else if (b.equals("S_TEXT/ASS")) {
                                n5 = 1;
                                break Label_0223;
                            }
                            n5 = -1;
                        }
                        byte[] array;
                        int n6;
                        if (n5 != 0) {
                            if (n5 != 1) {
                                if (n5 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                array = v(k, "%02d:%02d:%02d.%03d", 1000L);
                                n6 = 25;
                            }
                            else {
                                array = v(k, "%01d:%02d:%02d:%02d", 10000L);
                                n6 = 21;
                            }
                        }
                        else {
                            array = v(k, "%02d:%02d:%02d,%03d", 1000L);
                            n6 = 19;
                        }
                        System.arraycopy(array, 0, a, n6, array.length);
                        int b2 = this.C.b;
                        while (true) {
                            final bas c = this.C;
                            if (b2 >= c.c) {
                                break;
                            }
                            if (c.a[b2] == 0) {
                                c.F(b2);
                                break;
                            }
                            ++b2;
                        }
                        final bud w = bvq.W;
                        final bas c2 = this.C;
                        w.c(c2, c2.c);
                        n3 += this.C.c;
                    }
                }
            }
            int n7 = n3;
            if ((n2 & 0x10000000) != 0x0) {
                if (this.S > 1) {
                    this.F.C(0);
                    n7 = n3;
                }
                else {
                    final bas f = this.F;
                    final int c3 = f.c;
                    bvq.W.d(f, c3, 2);
                    n7 = n3 + c3;
                }
            }
            bvq.W.e(n, n2, n7, n4, bvq.j);
        }
        this.O = true;
    }
    
    private final void s(final btk btk, final int n) {
        final bas y = this.y;
        if (y.c >= n) {
            return;
        }
        if (y.b() < n) {
            final bas y2 = this.y;
            final int b = y2.b();
            y2.A(Math.max(b + b, n));
        }
        final bas y3 = this.y;
        final byte[] a = y3.a;
        final int c = y3.c;
        btk.k(a, c, n - c);
        this.y.F(n);
    }
    
    private final void t() {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = false;
        this.ac = false;
        this.ad = 0;
        this.ae = 0;
        this.af = false;
        this.B.C(0);
    }
    
    private final void u(final btk btk, final byte[] array, final int n) {
        final int length = array.length;
        final int n2 = length + n;
        if (this.C.b() < n2) {
            this.C.D(Arrays.copyOf(array, n2 + n));
        }
        else {
            System.arraycopy(array, 0, this.C.a, 0, length);
        }
        btk.k(this.C.a, length, n);
        this.C.G(0);
        this.C.F(n2);
    }
    
    private static byte[] v(long n, final String s, final long n2) {
        dk.f(n != -9223372036854775807L);
        final long n3 = n / 3600000000L;
        final Locale us = Locale.US;
        final int n4 = (int)n3;
        n -= n4 * 3600000000L;
        final int n5 = (int)(n / 60000000L);
        n -= n5 * 60000000L;
        final int n6 = (int)(n / 1000000L);
        return bax.aj(String.format(us, s, n4, n5, n6, (int)((n - n6 * 1000000L) / n2)));
    }
    
    private static int[] w(final int[] array, final int n) {
        if (array == null) {
            return new int[n];
        }
        final int length = array.length;
        if (length >= n) {
            return array;
        }
        return new int[Math.max(length + length, n)];
    }
    
    protected int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325: {
                return 5;
            }
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322: {
                return 4;
            }
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317: {
                return 1;
            }
            case 134:
            case 17026:
            case 21358:
            case 2274716: {
                return 3;
            }
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729: {
                return 2;
            }
        }
    }
    
    public final long b(final long n) {
        final long e = this.e;
        if (e != -9223372036854775807L) {
            return bax.y(n, e, 1000L);
        }
        throw aza.a("Can't scale timecode prior to timecodeScale being set.", (Throwable)null);
    }
    
    protected final bvq c(final int n) {
        this.j(n);
        return this.g;
    }
    
    public final void d(final btm ag) {
        this.ag = ag;
    }
    
    public final void e() {
    }
    
    public void f(final long n, final long n2) {
        this.i = -9223372036854775807L;
        int i = 0;
        this.P = 0;
        final lwi ah = this.ah;
        ah.b = 0;
        ((ArrayDeque)ah.e).clear();
        ((bvs)ah.f).d();
        this.t.d();
        this.t();
        while (i < this.u.size()) {
            final lzh y = ((bvq)this.u.valueAt(i)).Y;
            if (y != null) {
                y.c();
            }
            ++i;
        }
    }
    
    public final boolean g(final btk btk) {
        final aara aara = new aara(null, null);
        final long b = ((btd)btk).b;
        long n = 1024L;
        if (b != -1L) {
            if (b > 1024L) {
                n = n;
            }
            else {
                n = b;
            }
        }
        btk.j(((bas)aara.b).a, 0, 4);
        long q = ((bas)aara.b).q();
        aara.a = 4;
        while (q != 440786851L) {
            if (++aara.a == (int)n) {
                return false;
            }
            btk.j(((bas)aara.b).a, 0, 1);
            q = ((q << 8 & 0xFFFFFFFFFFFFFF00L) | (long)(((bas)aara.b).a[0] & 0xFF));
        }
        final long f = aara.f(btk);
        final long n2 = aara.a;
        if (f == Long.MIN_VALUE) {
            return false;
        }
        if (b != -1L) {
            if (n2 + f >= b) {
                return false;
            }
        }
        while (true) {
            final long n3 = aara.a;
            final long n4 = n2 + f;
            if (n3 < n4) {
                if (aara.f(btk) == Long.MIN_VALUE) {
                    return false;
                }
                final long f2 = aara.f(btk);
                if (f2 < 0L) {
                    return false;
                }
                if (f2 == 0L) {
                    continue;
                }
                final int n5 = (int)f2;
                btk.g(n5);
                aara.a += n5;
            }
            else {
                if (n3 == n4) {
                    return true;
                }
                return false;
            }
        }
    }
    
    public final int h(final btk btk, final paq paq) {
        this.O = false;
        while (!this.O) {
            lwi ah = this.ah;
            dk.e(ah.g);
            while (true) {
                final int n = 0;
                final ypi ypi = ((ArrayDeque)ah.e).peek();
                if (ypi != null && ((btd)btk).c >= ypi.a) {
                    ((bvr)((pvh)ah.g).a).k(((ypi)((ArrayDeque)ah.e).pop()).b);
                    break;
                }
                final int b = ah.b;
                Label_0420: {
                    if (b == 0) {
                        long c;
                        if ((c = ((bvs)ah.f).c(btk, true, false, 4)) == -2L) {
                            btk.l();
                            int a;
                            int n3;
                            while (true) {
                                btk.j(ah.a, 0, 4);
                                a = bvs.a((int)ah.a[0]);
                                if (a != -1 && a <= 4) {
                                    final int n2 = (int)bvs.b(ah.a, a, false);
                                    final Object a2 = ((pvh)ah.g).a;
                                    n3 = n2;
                                    if (n2 == 357149030 || (n3 = n2) == 524531317 || (n3 = n2) == 475249515) {
                                        break;
                                    }
                                    if (n2 == 374648427) {
                                        n3 = 374648427;
                                        break;
                                    }
                                }
                                btk.m(1);
                            }
                            btk.m(a);
                            c = n3;
                        }
                        if (c == -1L) {
                            for (int i = n; i < this.u.size(); ++i) {
                                final bvq bvq = (bvq)this.u.valueAt(i);
                                bvq.c();
                                final lzh y = bvq.Y;
                                if (y != null) {
                                    y.b(bvq.W, bvq.j);
                                }
                            }
                            return -1;
                        }
                        ah.c = (int)c;
                        ah.b = 1;
                    }
                    else if (b != 1) {
                        break Label_0420;
                    }
                    ah.d = ((bvs)ah.f).c(btk, false, true, 8);
                    ah.b = 2;
                }
                final Object g = ah.g;
                int c2 = ah.c;
                final pvh pvh = (pvh)g;
                final bvr bvr = (bvr)pvh.a;
                final int a3 = bvr.a(c2);
                if (a3 != 0) {
                    if (a3 == 1) {
                        final long c3 = ((btd)btk).c;
                        ((ArrayDeque<Object>)ah.e).push(new ypi(c2, ah.d + c3, (short[])null));
                        ((bvr)((pvh)ah.g).a).l(ah.c, c3, ah.d);
                        ah.b = 0;
                        break;
                    }
                    if (a3 != 2) {
                        if (a3 != 3) {
                            if (a3 == 4) {
                                final int n4 = (int)ah.d;
                                if (c2 != 161 && c2 != 163) {
                                    if (c2 != 165) {
                                        if (c2 != 16877) {
                                            if (c2 != 16981) {
                                                if (c2 != 18402) {
                                                    if (c2 != 21419) {
                                                        if (c2 != 25506) {
                                                            if (c2 != 30322) {
                                                                final StringBuilder sb = new StringBuilder("Unexpected id: ");
                                                                sb.append(c2);
                                                                throw aza.a(sb.toString(), (Throwable)null);
                                                            }
                                                            bvr.j(c2);
                                                            btk.k(bvr.g.v = new byte[n4], 0, n4);
                                                        }
                                                        else {
                                                            bvr.j(c2);
                                                            btk.k(bvr.g.k = new byte[n4], 0, n4);
                                                        }
                                                    }
                                                    else {
                                                        Arrays.fill(bvr.A.a, (byte)0);
                                                        btk.k(bvr.A.a, 4 - n4, n4);
                                                        bvr.A.G(0);
                                                        bvr.K = (int)bvr.A.q();
                                                    }
                                                }
                                                else {
                                                    final byte[] array = new byte[n4];
                                                    btk.k(array, 0, n4);
                                                    bvr.c(c2).j = new buc(1, array, 0, 0);
                                                }
                                            }
                                            else {
                                                bvr.j(c2);
                                                btk.k(bvr.g.i = new byte[n4], 0, n4);
                                            }
                                        }
                                        else {
                                            final bvq c4 = bvr.c(c2);
                                            final int g2 = c4.g;
                                            if (g2 != 1685485123 && g2 != 1685480259) {
                                                btk.m(n4);
                                            }
                                            else {
                                                btk.k(c4.N = new byte[n4], 0, n4);
                                            }
                                        }
                                    }
                                    else if (bvr.P == 2) {
                                        final bvq bvq2 = (bvq)bvr.u.get(bvr.U);
                                        if (bvr.l == 4 && "V_VP9".equals(bvq2.b)) {
                                            bvr.F.C(n4);
                                            btk.k(bvr.F.a, 0, n4);
                                        }
                                        else {
                                            btk.m(n4);
                                        }
                                    }
                                }
                                else {
                                    if (bvr.P == 0) {
                                        bvr.U = (int)bvr.t.c(btk, false, true, 8);
                                        bvr.V = bvr.t.a;
                                        bvr.k = -9223372036854775807L;
                                        bvr.P = 1;
                                        bvr.y.C(0);
                                    }
                                    final bvq bvq3 = (bvq)bvr.u.get(bvr.U);
                                    if (bvq3 == null) {
                                        btk.m(n4 - bvr.V);
                                        bvr.P = 0;
                                    }
                                    else {
                                        bvq3.c();
                                        if (bvr.P == 1) {
                                            bvr.s(btk, 3);
                                            final int n5 = (bvr.y.a[2] & 0x6) >> 1;
                                            if (n5 == 0) {
                                                bvr.S = 1;
                                                (bvr.T = w(bvr.T, 1))[0] = n4 - bvr.V - 3;
                                            }
                                            else {
                                                bvr.s(btk, 4);
                                                final int s = (bvr.y.a[3] & 0xFF) + 1;
                                                bvr.S = s;
                                                final int[] w = w(bvr.T, s);
                                                bvr.T = w;
                                                if (n5 == 2) {
                                                    final int v = bvr.V;
                                                    final int s2 = bvr.S;
                                                    Arrays.fill(w, 0, s2, (n4 - v - 4) / s2);
                                                }
                                                else if (n5 == 1) {
                                                    int n6 = 0;
                                                    int n7 = 0;
                                                    int n8 = 4;
                                                    int n9;
                                                    while (true) {
                                                        n9 = bvr.S - 1;
                                                        if (n6 >= n9) {
                                                            break;
                                                        }
                                                        bvr.T[n6] = 0;
                                                        int n10;
                                                        int n11;
                                                        do {
                                                            ++n8;
                                                            bvr.s(btk, n8);
                                                            n10 = (bvr.y.a[n8 - 1] & 0xFF);
                                                            final int[] t = bvr.T;
                                                            n11 = t[n6] + n10;
                                                            t[n6] = n11;
                                                        } while (n10 == 255);
                                                        n7 += n11;
                                                        ++n6;
                                                    }
                                                    bvr.T[n9] = n4 - bvr.V - n8 - n7;
                                                }
                                                else {
                                                    if (n5 != 3) {
                                                        throw aza.a("Unexpected lacing value: 2", (Throwable)null);
                                                    }
                                                    int n12 = 0;
                                                    int n13 = 0;
                                                    int n14 = 4;
                                                Label_1899:
                                                    while (true) {
                                                        final int n15 = bvr.S - 1;
                                                        if (n12 >= n15) {
                                                            bvr.T[n15] = n4 - bvr.V - n14 - n13;
                                                            break;
                                                        }
                                                        bvr.T[n12] = 0;
                                                        ++n14;
                                                        bvr.s(btk, n14);
                                                        final byte[] a4 = bvr.y.a;
                                                        final int n16 = n14 - 1;
                                                        if (a4[n16] != 0) {
                                                            int j = 0;
                                                            while (true) {
                                                                while (j < 8) {
                                                                    final int n17 = 1 << 7 - j;
                                                                    if ((bvr.y.a[n16] & n17) != 0x0) {
                                                                        final int n18 = n14 + j;
                                                                        bvr.s(btk, n18);
                                                                        long n19 = bvr.y.a[n16] & 0xFF & ~n17;
                                                                        for (int k = n16 + 1; k < n18; ++k) {
                                                                            n19 = (n19 << 8 | (long)(bvr.y.a[k] & 0xFF));
                                                                        }
                                                                        final lwi lwi = ah;
                                                                        long n20 = n19;
                                                                        n14 = n18;
                                                                        ah = lwi;
                                                                        if (n12 > 0) {
                                                                            n20 = n19 - ((1L << j * 7 + 6) - 1L);
                                                                            n14 = n18;
                                                                            ah = lwi;
                                                                        }
                                                                        if (n20 >= -2147483648L && n20 <= 2147483647L) {
                                                                            final int[] t2 = bvr.T;
                                                                            int n22;
                                                                            final int n21 = n22 = (int)n20;
                                                                            if (n12 != 0) {
                                                                                n22 = n21 + t2[n12 - 1];
                                                                            }
                                                                            t2[n12] = n22;
                                                                            n13 += n22;
                                                                            ++n12;
                                                                            continue Label_1899;
                                                                        }
                                                                        throw aza.a("EBML lacing sample size out of range.", (Throwable)null);
                                                                    }
                                                                    else {
                                                                        ++j;
                                                                    }
                                                                }
                                                                long n20 = 0L;
                                                                continue;
                                                            }
                                                        }
                                                        throw aza.a("No valid varint length mask found", (Throwable)null);
                                                    }
                                                }
                                            }
                                            final byte[] a5 = bvr.y.a;
                                            bvr.Q = bvr.i + bvr.b((a5[1] & 0xFF) | a5[0] << 8);
                                            int w2;
                                            if (bvq3.d != 2) {
                                                if (c2 == 163) {
                                                    if ((bvr.y.a[2] & 0x80) == 0x80) {
                                                        w2 = 1;
                                                    }
                                                    else {
                                                        w2 = 0;
                                                    }
                                                    c2 = 163;
                                                }
                                                else {
                                                    w2 = 0;
                                                }
                                            }
                                            else {
                                                w2 = 1;
                                            }
                                            bvr.W = w2;
                                            bvr.P = 2;
                                            bvr.R = 0;
                                        }
                                        if (c2 == 163) {
                                            while (true) {
                                                final int r = bvr.R;
                                                if (r >= bvr.S) {
                                                    break;
                                                }
                                                bvr.r(bvq3, bvr.Q + bvr.R * bvq3.e / 1000, bvr.W, bvr.o(btk, bvq3, bvr.T[r], false), 0);
                                                ++bvr.R;
                                            }
                                            bvr.P = 0;
                                        }
                                        else {
                                            while (true) {
                                                final int r2 = bvr.R;
                                                if (r2 >= bvr.S) {
                                                    break;
                                                }
                                                final int[] t3 = bvr.T;
                                                t3[r2] = bvr.o(btk, bvq3, t3[r2], true);
                                                ++bvr.R;
                                            }
                                        }
                                    }
                                }
                                ah.b = 0;
                                break;
                            }
                            final long d = ah.d;
                            if (d != 4L && d != 8L) {
                                final StringBuilder sb2 = new StringBuilder("Invalid float size: ");
                                sb2.append(d);
                                throw aza.a(sb2.toString(), (Throwable)null);
                            }
                            final int n23 = (int)d;
                            final long b2 = ah.b(btk, n23);
                            double longBitsToDouble;
                            if (n23 == 4) {
                                longBitsToDouble = Float.intBitsToFloat((int)b2);
                            }
                            else {
                                longBitsToDouble = Double.longBitsToDouble(b2);
                            }
                            final Object a6 = pvh.a;
                            Label_0957: {
                                if (c2 != 181) {
                                    if (c2 != 17545) {
                                        switch (c2) {
                                            default: {
                                                switch (c2) {
                                                    default: {
                                                        break Label_0957;
                                                    }
                                                    case 30325: {
                                                        ((bvr)a6).c(c2).u = (float)longBitsToDouble;
                                                        break Label_0957;
                                                    }
                                                    case 30324: {
                                                        ((bvr)a6).c(c2).t = (float)longBitsToDouble;
                                                        break Label_0957;
                                                    }
                                                    case 30323: {
                                                        ((bvr)a6).c(c2).s = (float)longBitsToDouble;
                                                        break Label_0957;
                                                    }
                                                }
                                                break;
                                            }
                                            case 21978: {
                                                ((bvr)a6).c(c2).M = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21977: {
                                                ((bvr)a6).c(c2).L = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21976: {
                                                ((bvr)a6).c(c2).K = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21975: {
                                                ((bvr)a6).c(c2).J = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21974: {
                                                ((bvr)a6).c(c2).I = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21973: {
                                                ((bvr)a6).c(c2).H = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21972: {
                                                ((bvr)a6).c(c2).G = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21971: {
                                                ((bvr)a6).c(c2).F = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21970: {
                                                ((bvr)a6).c(c2).E = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21969: {
                                                ((bvr)a6).c(c2).D = (float)longBitsToDouble;
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        ((bvr)a6).f = (long)longBitsToDouble;
                                    }
                                }
                                else {
                                    ((bvr)a6).c(c2).Q = (int)longBitsToDouble;
                                }
                            }
                            ah.b = 0;
                            break;
                        }
                        else {
                            final long d2 = ah.d;
                            if (d2 <= 2147483647L) {
                                int l = (int)d2;
                                String s3;
                                if (l == 0) {
                                    s3 = "";
                                }
                                else {
                                    final byte[] array2 = new byte[l];
                                    btk.k(array2, 0, l);
                                    while (l > 0) {
                                        final int n24 = l - 1;
                                        if (array2[n24] != 0) {
                                            break;
                                        }
                                        l = n24;
                                    }
                                    s3 = new String(array2, 0, l);
                                }
                                ((bvr)pvh.a).m(c2, s3);
                                ah.b = 0;
                                break;
                            }
                            final StringBuilder sb3 = new StringBuilder("String element size: ");
                            sb3.append(d2);
                            throw aza.a(sb3.toString(), (Throwable)null);
                        }
                    }
                    else {
                        final long d3 = ah.d;
                        if (d3 <= 8L) {
                            final long b3 = ah.b(btk, (int)d3);
                            final Object a7 = pvh.a;
                            Label_3060: {
                                if (c2 != 20529) {
                                    if (c2 != 20530) {
                                        switch (c2) {
                                            default: {
                                                switch (c2) {
                                                    case 21949: {
                                                        ((bvr)a7).c(c2).C = (int)b3;
                                                        break Label_3060;
                                                    }
                                                    case 21948: {
                                                        ((bvr)a7).c(c2).B = (int)b3;
                                                        break Label_3060;
                                                    }
                                                    case 21947: {
                                                        final bvr bvr2 = (bvr)a7;
                                                        bvr2.j(c2);
                                                        final bvq g3 = bvr2.g;
                                                        g3.x = true;
                                                        final int a8 = aya.a((int)b3);
                                                        if (a8 != -1) {
                                                            g3.y = a8;
                                                            break Label_3060;
                                                        }
                                                        break Label_3060;
                                                    }
                                                    case 21946: {
                                                        final bvr bvr3 = (bvr)a7;
                                                        bvr3.j(c2);
                                                        final int b4 = aya.b((int)b3);
                                                        if (b4 != -1) {
                                                            bvr3.g.z = b4;
                                                            break Label_3060;
                                                        }
                                                        break Label_3060;
                                                    }
                                                    case 21945: {
                                                        final bvr bvr4 = (bvr)a7;
                                                        bvr4.j(c2);
                                                        final int n25 = (int)b3;
                                                        if (n25 == 1) {
                                                            bvr4.g.A = 2;
                                                            break Label_3060;
                                                        }
                                                        if (n25 != 2) {
                                                            break Label_3060;
                                                        }
                                                        bvr4.g.A = 1;
                                                        break Label_3060;
                                                    }
                                                }
                                                break;
                                            }
                                            case 2807729: {
                                                ((bvr)a7).e = b3;
                                                break;
                                            }
                                            case 2352003: {
                                                ((bvr)a7).c(c2).e = (int)b3;
                                                break;
                                            }
                                            case 30321: {
                                                final bvr bvr5 = (bvr)a7;
                                                bvr5.j(c2);
                                                final int n26 = (int)b3;
                                                if (n26 == 0) {
                                                    bvr5.g.r = 0;
                                                    break;
                                                }
                                                if (n26 == 1) {
                                                    bvr5.g.r = 1;
                                                    break;
                                                }
                                                if (n26 == 2) {
                                                    bvr5.g.r = 2;
                                                    break;
                                                }
                                                if (n26 != 3) {
                                                    break;
                                                }
                                                bvr5.g.r = 3;
                                                break;
                                            }
                                            case 30114: {
                                                ((bvr)a7).n = b3;
                                                break;
                                            }
                                            case 25188: {
                                                ((bvr)a7).c(c2).P = (int)b3;
                                                break;
                                            }
                                            case 22203: {
                                                ((bvr)a7).c(c2).S = b3;
                                                break;
                                            }
                                            case 22186: {
                                                ((bvr)a7).c(c2).R = b3;
                                                break;
                                            }
                                            case 21998: {
                                                ((bvr)a7).c(c2).f = (int)b3;
                                                break;
                                            }
                                            case 21930: {
                                                ((bvr)a7).c(c2).T = (b3 == 1L);
                                                break;
                                            }
                                            case 21690: {
                                                ((bvr)a7).c(c2).p = (int)b3;
                                                break;
                                            }
                                            case 21682: {
                                                ((bvr)a7).c(c2).q = (int)b3;
                                                break;
                                            }
                                            case 21680: {
                                                ((bvr)a7).c(c2).o = (int)b3;
                                                break;
                                            }
                                            case 21432: {
                                                final int n27 = (int)b3;
                                                final bvr bvr6 = (bvr)a7;
                                                bvr6.j(c2);
                                                if (n27 == 0) {
                                                    bvr6.g.w = 0;
                                                    break;
                                                }
                                                if (n27 == 1) {
                                                    bvr6.g.w = 2;
                                                    break;
                                                }
                                                if (n27 == 3) {
                                                    bvr6.g.w = 1;
                                                    break;
                                                }
                                                if (n27 != 15) {
                                                    break;
                                                }
                                                bvr6.g.w = 3;
                                                break;
                                            }
                                            case 21420: {
                                                final bvr bvr7 = (bvr)a7;
                                                bvr7.h = b3 + bvr7.d;
                                                break;
                                            }
                                            case 18408: {
                                                if (b3 == 1L) {
                                                    break;
                                                }
                                                final StringBuilder sb4 = new StringBuilder("AESSettingsCipherMode ");
                                                sb4.append(b3);
                                                sb4.append(" not supported");
                                                throw aza.a(sb4.toString(), (Throwable)null);
                                            }
                                            case 18401: {
                                                if (b3 == 5L) {
                                                    break;
                                                }
                                                final StringBuilder sb5 = new StringBuilder("ContentEncAlgo ");
                                                sb5.append(b3);
                                                sb5.append(" not supported");
                                                throw aza.a(sb5.toString(), (Throwable)null);
                                            }
                                            case 17143: {
                                                if (b3 == 1L) {
                                                    break;
                                                }
                                                final StringBuilder sb6 = new StringBuilder("EBMLReadVersion ");
                                                sb6.append(b3);
                                                sb6.append(" not supported");
                                                throw aza.a(sb6.toString(), (Throwable)null);
                                            }
                                            case 17029: {
                                                if (b3 >= 1L && b3 <= 2L) {
                                                    break;
                                                }
                                                final StringBuilder sb7 = new StringBuilder("DocTypeReadVersion ");
                                                sb7.append(b3);
                                                sb7.append(" not supported");
                                                throw aza.a(sb7.toString(), (Throwable)null);
                                            }
                                            case 16980: {
                                                if (b3 == 3L) {
                                                    break;
                                                }
                                                final StringBuilder sb8 = new StringBuilder("ContentCompAlgo ");
                                                sb8.append(b3);
                                                sb8.append(" not supported");
                                                throw aza.a(sb8.toString(), (Throwable)null);
                                            }
                                            case 16871: {
                                                ((bvr)a7).c(c2).g = (int)b3;
                                                break;
                                            }
                                            case 251: {
                                                ((bvr)a7).m = true;
                                                break;
                                            }
                                            case 241: {
                                                final bvr bvr8 = (bvr)a7;
                                                if (!bvr8.j) {
                                                    bvr8.i(c2);
                                                    bvr8.p.p(b3);
                                                    bvr8.j = true;
                                                    break;
                                                }
                                                break;
                                            }
                                            case 238: {
                                                ((bvr)a7).l = (int)b3;
                                                break;
                                            }
                                            case 231: {
                                                final bvr bvr9 = (bvr)a7;
                                                bvr9.i = bvr9.b(b3);
                                                break;
                                            }
                                            case 215: {
                                                ((bvr)a7).c(c2).c = (int)b3;
                                                break;
                                            }
                                            case 186: {
                                                ((bvr)a7).c(c2).n = (int)b3;
                                                break;
                                            }
                                            case 179: {
                                                final bvr bvr10 = (bvr)a7;
                                                bvr10.i(c2);
                                                bvr10.o.p(bvr10.b(b3));
                                                break;
                                            }
                                            case 176: {
                                                ((bvr)a7).c(c2).m = (int)b3;
                                                break;
                                            }
                                            case 159: {
                                                ((bvr)a7).c(c2).O = (int)b3;
                                                break;
                                            }
                                            case 155: {
                                                final bvr bvr11 = (bvr)a7;
                                                bvr11.k = bvr11.b(b3);
                                                break;
                                            }
                                            case 136: {
                                                ((bvr)a7).c(c2).U = (b3 == 1L);
                                                break;
                                            }
                                            case 131: {
                                                ((bvr)a7).c(c2).d = (int)b3;
                                                break;
                                            }
                                        }
                                    }
                                    else if (b3 != 1L) {
                                        final StringBuilder sb9 = new StringBuilder("ContentEncodingScope ");
                                        sb9.append(b3);
                                        sb9.append(" not supported");
                                        throw aza.a(sb9.toString(), (Throwable)null);
                                    }
                                }
                                else if (b3 != 0L) {
                                    final StringBuilder sb10 = new StringBuilder("ContentEncodingOrder ");
                                    sb10.append(b3);
                                    sb10.append(" not supported");
                                    throw aza.a(sb10.toString(), (Throwable)null);
                                }
                            }
                            ah.b = 0;
                            break;
                        }
                        final StringBuilder sb11 = new StringBuilder("Invalid integer size: ");
                        sb11.append(d3);
                        throw aza.a(sb11.toString(), (Throwable)null);
                    }
                }
                else {
                    btk.m((int)ah.d);
                    ah.b = 0;
                }
            }
            final long c5 = ((btd)btk).c;
            if (!this.L) {
                if (!this.J) {
                    continue;
                }
                final long n28 = this.N;
                if (n28 != -1L) {
                    paq.a = n28;
                    this.N = -1L;
                    return 1;
                }
                continue;
                continue;
            }
            this.N = c5;
            paq.a = this.M;
            this.L = false;
            return 1;
        }
        return 0;
    }
    
    public final void i(final int n) {
        if (this.o != null && this.p != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Element ");
        sb.append(n);
        sb.append(" must be in a Cues");
        throw aza.a(sb.toString(), (Throwable)null);
    }
    
    public final void j(final int n) {
        if (this.g != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Element ");
        sb.append(n);
        sb.append(" must be in a TrackEntry");
        throw aza.a(sb.toString(), (Throwable)null);
    }
    
    protected void k(int i) {
        this.q();
        if (i != 160) {
            if (i != 174) {
                if (i == 19899) {
                    i = this.K;
                    if (i != -1) {
                        final long h = this.h;
                        if (h != -1L) {
                            if (i == 475249515) {
                                this.M = h;
                            }
                            return;
                        }
                    }
                    throw aza.a("Mandatory element SeekID or SeekPosition not found", (Throwable)null);
                }
                if (i != 25152) {
                    if (i != 28032) {
                        if (i != 357149030) {
                            if (i != 374648427) {
                                if (i == 475249515) {
                                    if (!this.J) {
                                        final btm ag = this.ag;
                                        final agnt o = this.o;
                                        final agnt p = this.p;
                                        Object o2 = null;
                                        Label_0411: {
                                            if (this.d != -1L && this.I != -9223372036854775807L && o != null) {
                                                final int a = o.a;
                                                if (a != 0 && p != null) {
                                                    if (p.a == a) {
                                                        final int[] array = new int[a];
                                                        final long[] array2 = new long[a];
                                                        final long[] array3 = new long[a];
                                                        final long[] array4 = new long[a];
                                                        for (i = 0; i < a; ++i) {
                                                            array4[i] = o.o(i);
                                                            array2[i] = this.d + p.o(i);
                                                        }
                                                        i = 0;
                                                        int n;
                                                        while (true) {
                                                            n = a - 1;
                                                            if (i >= n) {
                                                                break;
                                                            }
                                                            final int n2 = i + 1;
                                                            array[i] = (int)(array2[n2] - array2[i]);
                                                            array3[i] = array4[n2] - array4[i];
                                                            i = n2;
                                                        }
                                                        array[n] = (int)(this.d + this.H - array2[n]);
                                                        final long n3 = this.I - array4[n];
                                                        array3[n] = n3;
                                                        int[] copy = array;
                                                        long[] copy2 = array2;
                                                        long[] copy3 = array3;
                                                        long[] copy4 = array4;
                                                        if (n3 <= 0L) {
                                                            final StringBuilder sb = new StringBuilder("Discarding last cue point with unexpected duration: ");
                                                            sb.append(n3);
                                                            bap.c("MatroskaExtractor", sb.toString());
                                                            copy = Arrays.copyOf(array, n);
                                                            copy2 = Arrays.copyOf(array2, n);
                                                            copy3 = Arrays.copyOf(array3, n);
                                                            copy4 = Arrays.copyOf(array4, n);
                                                        }
                                                        o2 = new btb(copy, copy2, copy3, copy4);
                                                        break Label_0411;
                                                    }
                                                }
                                            }
                                            o2 = new btz(this.I);
                                        }
                                        ag.x((bua)o2);
                                        this.J = true;
                                    }
                                    this.o = null;
                                    this.p = null;
                                }
                            }
                            else {
                                if (this.u.size() != 0) {
                                    this.ag.r();
                                    return;
                                }
                                throw aza.a("No valid tracks were found", (Throwable)null);
                            }
                        }
                        else {
                            if (this.e == -9223372036854775807L) {
                                this.e = 1000000L;
                            }
                            final long f = this.f;
                            if (f != -9223372036854775807L) {
                                this.I = this.b(f);
                            }
                        }
                    }
                    else {
                        this.j(i);
                        final bvq g = this.g;
                        if (g.h) {
                            if (g.i != null) {
                                throw aza.a("Combining encryption and compression is not supported", (Throwable)null);
                            }
                        }
                    }
                }
                else {
                    this.j(i);
                    final bvq g2 = this.g;
                    if (g2.h) {
                        if (g2.j != null) {
                            g2.l = new DrmInitData(new DrmInitData$SchemeData[] { new DrmInitData$SchemeData(axz.a, "video/webm", this.g.j.b) });
                            return;
                        }
                        throw aza.a("Encrypted Track found but ContentEncKeyID was not found", (Throwable)null);
                    }
                }
                return;
            }
            final bvq g3 = this.g;
            dk.e((Object)g3);
            final String b = g3.b;
            if (b != null) {
                i = b.hashCode();
                final int n4 = 4;
                final int n5 = 3;
                Label_1540: {
                    switch (i) {
                        case 1951062397: {
                            if (b.equals("A_OPUS")) {
                                i = 11;
                                break Label_1540;
                            }
                            break;
                        }
                        case 1950789798: {
                            if (b.equals("A_FLAC")) {
                                i = 22;
                                break Label_1540;
                            }
                            break;
                        }
                        case 1950749482: {
                            if (b.equals("A_EAC3")) {
                                i = 17;
                                break Label_1540;
                            }
                            break;
                        }
                        case 1809237540: {
                            if (b.equals("V_MPEG2")) {
                                i = 3;
                                break Label_1540;
                            }
                            break;
                        }
                        case 1422270023: {
                            if (b.equals("S_TEXT/UTF8")) {
                                i = 27;
                                break Label_1540;
                            }
                            break;
                        }
                        case 1045209816: {
                            if (b.equals("S_TEXT/WEBVTT")) {
                                i = 29;
                                break Label_1540;
                            }
                            break;
                        }
                        case 855502857: {
                            if (b.equals("V_MPEGH/ISO/HEVC")) {
                                i = 8;
                                break Label_1540;
                            }
                            break;
                        }
                        case 738597099: {
                            if (b.equals("S_TEXT/ASS")) {
                                i = 28;
                                break Label_1540;
                            }
                            break;
                        }
                        case 725957860: {
                            if (b.equals("A_PCM/INT/LIT")) {
                                i = 24;
                                break Label_1540;
                            }
                            break;
                        }
                        case 725948237: {
                            if (b.equals("A_PCM/INT/BIG")) {
                                i = 25;
                                break Label_1540;
                            }
                            break;
                        }
                        case 635596514: {
                            if (b.equals("A_PCM/FLOAT/IEEE")) {
                                i = 26;
                                break Label_1540;
                            }
                            break;
                        }
                        case 542569478: {
                            if (b.equals("A_DTS/EXPRESS")) {
                                i = 20;
                                break Label_1540;
                            }
                            break;
                        }
                        case 444813526: {
                            if (b.equals("V_THEORA")) {
                                i = 10;
                                break Label_1540;
                            }
                            break;
                        }
                        case 99146302: {
                            if (b.equals("S_HDMV/PGS")) {
                                i = 31;
                                break Label_1540;
                            }
                            break;
                        }
                        case 82338134: {
                            if (b.equals("V_VP9")) {
                                i = 1;
                                break Label_1540;
                            }
                            break;
                        }
                        case 82338133: {
                            if (b.equals("V_VP8")) {
                                i = 0;
                                break Label_1540;
                            }
                            break;
                        }
                        case 82318131: {
                            if (b.equals("V_AV1")) {
                                i = 2;
                                break Label_1540;
                            }
                            break;
                        }
                        case 62927045: {
                            if (b.equals("A_DTS")) {
                                i = 19;
                                break Label_1540;
                            }
                            break;
                        }
                        case 62923603: {
                            if (b.equals("A_AC3")) {
                                i = 16;
                                break Label_1540;
                            }
                            break;
                        }
                        case 62923557: {
                            if (b.equals("A_AAC")) {
                                i = 13;
                                break Label_1540;
                            }
                            break;
                        }
                        case -356037306: {
                            if (b.equals("A_DTS/LOSSLESS")) {
                                i = 21;
                                break Label_1540;
                            }
                            break;
                        }
                        case -425012669: {
                            if (b.equals("S_VOBSUB")) {
                                i = 30;
                                break Label_1540;
                            }
                            break;
                        }
                        case -538363109: {
                            if (b.equals("V_MPEG4/ISO/AVC")) {
                                i = 7;
                                break Label_1540;
                            }
                            break;
                        }
                        case -538363189: {
                            if (b.equals("V_MPEG4/ISO/ASP")) {
                                i = 5;
                                break Label_1540;
                            }
                            break;
                        }
                        case -933872740: {
                            if (b.equals("S_DVBSUB")) {
                                i = 32;
                                break Label_1540;
                            }
                            break;
                        }
                        case -1373388978: {
                            if (b.equals("V_MS/VFW/FOURCC")) {
                                i = 9;
                                break Label_1540;
                            }
                            break;
                        }
                        case -1482641357: {
                            if (b.equals("A_MPEG/L3")) {
                                i = 15;
                                break Label_1540;
                            }
                            break;
                        }
                        case -1482641358: {
                            if (b.equals("A_MPEG/L2")) {
                                i = 14;
                                break Label_1540;
                            }
                            break;
                        }
                        case -1730367663: {
                            if (b.equals("A_VORBIS")) {
                                i = 12;
                                break Label_1540;
                            }
                            break;
                        }
                        case -1784763192: {
                            if (b.equals("A_TRUEHD")) {
                                i = 18;
                                break Label_1540;
                            }
                            break;
                        }
                        case -1985379776: {
                            if (b.equals("A_MS/ACM")) {
                                i = 23;
                                break Label_1540;
                            }
                            break;
                        }
                        case -2095575984: {
                            if (b.equals("V_MPEG4/ISO/SP")) {
                                i = 4;
                                break Label_1540;
                            }
                            break;
                        }
                        case -2095576542: {
                            if (b.equals("V_MPEG4/ISO/AP")) {
                                i = 6;
                                break Label_1540;
                            }
                            break;
                        }
                    }
                    i = -1;
                }
                switch (i) {
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
                    case 32: {
                        final btm ag2 = this.ag;
                        final int c = g3.c;
                        Label_2544: {
                            switch (b.hashCode()) {
                                case 1951062397: {
                                    if (b.equals("A_OPUS")) {
                                        i = 12;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 1950789798: {
                                    if (b.equals("A_FLAC")) {
                                        i = 22;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 1950749482: {
                                    if (b.equals("A_EAC3")) {
                                        i = 17;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 1809237540: {
                                    if (b.equals("V_MPEG2")) {
                                        i = 3;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 1422270023: {
                                    if (b.equals("S_TEXT/UTF8")) {
                                        i = 27;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 1045209816: {
                                    if (b.equals("S_TEXT/WEBVTT")) {
                                        i = 29;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 855502857: {
                                    if (b.equals("V_MPEGH/ISO/HEVC")) {
                                        i = 8;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 738597099: {
                                    if (b.equals("S_TEXT/ASS")) {
                                        i = 28;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 725957860: {
                                    if (b.equals("A_PCM/INT/LIT")) {
                                        i = 24;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 725948237: {
                                    if (b.equals("A_PCM/INT/BIG")) {
                                        i = 25;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 635596514: {
                                    if (b.equals("A_PCM/FLOAT/IEEE")) {
                                        i = 26;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 542569478: {
                                    if (b.equals("A_DTS/EXPRESS")) {
                                        i = 20;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 444813526: {
                                    if (b.equals("V_THEORA")) {
                                        i = 10;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 99146302: {
                                    if (b.equals("S_HDMV/PGS")) {
                                        i = 31;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 82338134: {
                                    if (b.equals("V_VP9")) {
                                        i = 1;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 82338133: {
                                    if (b.equals("V_VP8")) {
                                        i = 0;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 82318131: {
                                    if (b.equals("V_AV1")) {
                                        i = 2;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 62927045: {
                                    if (b.equals("A_DTS")) {
                                        i = 19;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 62923603: {
                                    if (b.equals("A_AC3")) {
                                        i = 16;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case 62923557: {
                                    if (b.equals("A_AAC")) {
                                        i = 13;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -356037306: {
                                    if (b.equals("A_DTS/LOSSLESS")) {
                                        i = 21;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -425012669: {
                                    if (b.equals("S_VOBSUB")) {
                                        i = 30;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -538363109: {
                                    if (b.equals("V_MPEG4/ISO/AVC")) {
                                        i = 7;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -538363189: {
                                    if (b.equals("V_MPEG4/ISO/ASP")) {
                                        i = 5;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -933872740: {
                                    if (b.equals("S_DVBSUB")) {
                                        i = 32;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -1373388978: {
                                    if (b.equals("V_MS/VFW/FOURCC")) {
                                        i = 9;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -1482641357: {
                                    if (b.equals("A_MPEG/L3")) {
                                        i = 15;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -1482641358: {
                                    if (b.equals("A_MPEG/L2")) {
                                        i = 14;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -1730367663: {
                                    if (b.equals("A_VORBIS")) {
                                        i = 11;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -1784763192: {
                                    if (b.equals("A_TRUEHD")) {
                                        i = 18;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -1985379776: {
                                    if (b.equals("A_MS/ACM")) {
                                        i = 23;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -2095575984: {
                                    if (b.equals("V_MPEG4/ISO/SP")) {
                                        i = 4;
                                        break Label_2544;
                                    }
                                    break;
                                }
                                case -2095576542: {
                                    if (b.equals("V_MPEG4/ISO/AP")) {
                                        i = 6;
                                        break Label_2544;
                                    }
                                    break;
                                }
                            }
                            i = -1;
                        }
                        String s = "audio/raw";
                        List<byte[]> m = null;
                        int l = 0;
                        String s4 = null;
                        Label_3651: {
                            Object c2 = null;
                            Label_3645: {
                                Object o3 = null;
                                String s2 = null;
                                Label_3632: {
                                    Label_3630: {
                                        String s3 = null;
                                        Label_3619: {
                                            String s5 = null;
                                            Label_3548: {
                                                String s6 = null;
                                                Label_3544: {
                                                    Label_3204: {
                                                        Label_3111: {
                                                            switch (i) {
                                                                default: {
                                                                    throw aza.a("Unrecognized codec identifier.", (Throwable)null);
                                                                }
                                                                case 32: {
                                                                    final byte[] array5 = new byte[4];
                                                                    System.arraycopy(g3.e(b), 0, array5, 0, 4);
                                                                    o3 = afeq.r((Object)array5);
                                                                    s2 = "application/dvbsubs";
                                                                    break Label_3630;
                                                                }
                                                                case 31: {
                                                                    s3 = "application/pgs";
                                                                    break Label_3619;
                                                                }
                                                                case 30: {
                                                                    o3 = afeq.r((Object)g3.e(b));
                                                                    s2 = "application/vobsub";
                                                                    break Label_3630;
                                                                }
                                                                case 29: {
                                                                    s3 = "text/vtt";
                                                                    break Label_3619;
                                                                }
                                                                case 28: {
                                                                    o3 = afeq.s((Object)bvr.a, (Object)g3.e(b));
                                                                    s2 = "text/x-ssa";
                                                                    break Label_3630;
                                                                }
                                                                case 27: {
                                                                    s3 = "application/x-subrip";
                                                                    break Label_3619;
                                                                }
                                                                case 26: {
                                                                    i = g3.P;
                                                                    if (i == 32) {
                                                                        i = n4;
                                                                        break;
                                                                    }
                                                                    final StringBuilder sb2 = new StringBuilder("Unsupported floating point PCM bit depth: ");
                                                                    sb2.append(i);
                                                                    sb2.append(". Setting mimeType to audio/x-unknown");
                                                                    bap.c("MatroskaExtractor", sb2.toString());
                                                                    break Label_3111;
                                                                }
                                                                case 25: {
                                                                    i = g3.P;
                                                                    if (i == 8) {
                                                                        m = null;
                                                                        l = -1;
                                                                        s4 = null;
                                                                        i = 3;
                                                                        break Label_3651;
                                                                    }
                                                                    if (i == 16) {
                                                                        i = 268435456;
                                                                        break;
                                                                    }
                                                                    final StringBuilder sb3 = new StringBuilder("Unsupported big endian PCM bit depth: ");
                                                                    sb3.append(i);
                                                                    sb3.append(". Setting mimeType to audio/x-unknown");
                                                                    bap.c("MatroskaExtractor", sb3.toString());
                                                                    break Label_3111;
                                                                }
                                                                case 24: {
                                                                    if ((i = bax.l(g3.P)) == 0) {
                                                                        i = g3.P;
                                                                        final StringBuilder sb4 = new StringBuilder("Unsupported little endian PCM bit depth: ");
                                                                        sb4.append(i);
                                                                        sb4.append(". Setting mimeType to audio/x-unknown");
                                                                        bap.c("MatroskaExtractor", sb4.toString());
                                                                        break Label_3111;
                                                                    }
                                                                    break;
                                                                }
                                                                case 23: {
                                                                    if (!bvq.d(new bas(g3.e(b)))) {
                                                                        bap.c("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                                        break Label_3111;
                                                                    }
                                                                    if ((i = bax.l(g3.P)) == 0) {
                                                                        i = g3.P;
                                                                        final StringBuilder sb5 = new StringBuilder("Unsupported PCM bit depth: ");
                                                                        sb5.append(i);
                                                                        sb5.append(". Setting mimeType to audio/x-unknown");
                                                                        bap.c("MatroskaExtractor", sb5.toString());
                                                                        break Label_3111;
                                                                    }
                                                                    break;
                                                                }
                                                                case 22: {
                                                                    o3 = Collections.singletonList(g3.e(b));
                                                                    s2 = "audio/flac";
                                                                    break Label_3630;
                                                                }
                                                                case 21: {
                                                                    s3 = "audio/vnd.dts.hd";
                                                                    break Label_3619;
                                                                }
                                                                case 19:
                                                                case 20: {
                                                                    s3 = "audio/vnd.dts";
                                                                    break Label_3619;
                                                                }
                                                                case 18: {
                                                                    g3.Y = new lzh();
                                                                    s3 = "audio/true-hd";
                                                                    break Label_3619;
                                                                }
                                                                case 17: {
                                                                    s3 = "audio/eac3";
                                                                    break Label_3619;
                                                                }
                                                                case 16: {
                                                                    s3 = "audio/ac3";
                                                                    break Label_3619;
                                                                }
                                                                case 15: {
                                                                    s2 = "audio/mpeg";
                                                                    break Label_3204;
                                                                }
                                                                case 14: {
                                                                    s2 = "audio/mpeg-L2";
                                                                    break Label_3204;
                                                                }
                                                                case 13: {
                                                                    m = Collections.singletonList(g3.e(b));
                                                                    final ikf a2 = bsr.a(g3.k);
                                                                    g3.Q = a2.b;
                                                                    g3.O = a2.a;
                                                                    c2 = a2.c;
                                                                    s5 = "audio/mp4a-latm";
                                                                    break Label_3548;
                                                                }
                                                                case 12: {
                                                                    o3 = new ArrayList<byte[]>(3);
                                                                    ((List<byte[]>)o3).add(g3.e(g3.b));
                                                                    ((List<byte[]>)o3).add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(g3.R).array());
                                                                    ((List<byte[]>)o3).add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(g3.S).array());
                                                                    i = 5760;
                                                                    s2 = "audio/opus";
                                                                    break Label_3632;
                                                                }
                                                                case 11: {
                                                                    o3 = bvq.b(g3.e(b));
                                                                    i = 8192;
                                                                    s2 = "audio/vorbis";
                                                                    break Label_3632;
                                                                }
                                                                case 10: {
                                                                    s3 = "video/x-unknown";
                                                                    break Label_3619;
                                                                }
                                                                case 9: {
                                                                    final Pair a3 = bvq.a(new bas(g3.e(b)));
                                                                    s2 = (String)a3.first;
                                                                    o3 = a3.second;
                                                                    break Label_3630;
                                                                }
                                                                case 8: {
                                                                    final bts a4 = bts.a(new bas(g3.e(b)));
                                                                    m = a4.a;
                                                                    g3.X = a4.b;
                                                                    s6 = a4.d;
                                                                    s5 = "video/hevc";
                                                                    break Label_3544;
                                                                }
                                                                case 7: {
                                                                    final bsu a5 = bsu.a(new bas(g3.e(b)));
                                                                    m = a5.a;
                                                                    g3.X = a5.b;
                                                                    s6 = a5.f;
                                                                    s5 = "video/avc";
                                                                    break Label_3544;
                                                                }
                                                                case 4:
                                                                case 5:
                                                                case 6: {
                                                                    final byte[] k = g3.k;
                                                                    if (k == null) {
                                                                        o3 = null;
                                                                    }
                                                                    else {
                                                                        o3 = Collections.singletonList(k);
                                                                    }
                                                                    s2 = "video/mp4v-es";
                                                                    break Label_3630;
                                                                }
                                                                case 3: {
                                                                    s3 = "video/mpeg2";
                                                                    break Label_3619;
                                                                }
                                                                case 2: {
                                                                    s3 = "video/av01";
                                                                    break Label_3619;
                                                                }
                                                                case 1: {
                                                                    s3 = "video/x-vnd.on2.vp9";
                                                                    break Label_3619;
                                                                }
                                                                case 0: {
                                                                    s3 = "video/x-vnd.on2.vp8";
                                                                    break Label_3619;
                                                                }
                                                            }
                                                            m = null;
                                                            l = -1;
                                                            s4 = null;
                                                            break Label_3651;
                                                        }
                                                        s3 = "audio/x-unknown";
                                                        break Label_3619;
                                                    }
                                                    o3 = null;
                                                    i = 4096;
                                                    break Label_3632;
                                                }
                                                c2 = s6;
                                            }
                                            l = -1;
                                            s = s5;
                                            break Label_3645;
                                        }
                                        final List<byte[]> list = null;
                                        s2 = s3;
                                        o3 = list;
                                    }
                                    i = -1;
                                }
                                c2 = null;
                                s = s2;
                                l = i;
                                m = (List<byte[]>)o3;
                            }
                            i = -1;
                            s4 = (String)c2;
                        }
                        final byte[] n6 = g3.N;
                        Object a6 = s4;
                        String j = s;
                        if (n6 != null) {
                            final bhv h2 = bhv.h(new bas(n6));
                            a6 = s4;
                            j = s;
                            if (h2 != null) {
                                a6 = h2.a;
                                j = "video/dolby-vision";
                            }
                        }
                        final boolean u = g3.U;
                        int n7;
                        if (!g3.T) {
                            n7 = 0;
                        }
                        else {
                            n7 = 2;
                        }
                        final ayf ayf = new ayf();
                        if (ayz.i(j)) {
                            ayf.x = g3.O;
                            ayf.y = g3.Q;
                            ayf.z = i;
                            i = 1;
                        }
                        else if (ayz.m(j)) {
                            if (g3.q == 0) {
                                if ((i = g3.o) == -1) {
                                    i = g3.m;
                                }
                                g3.o = i;
                                if ((i = g3.p) == -1) {
                                    i = g3.n;
                                }
                                g3.p = i;
                            }
                            final int o4 = g3.o;
                            float t = 0.0f;
                            Label_3914: {
                                if (o4 != -1) {
                                    final int p2 = g3.p;
                                    if (p2 != -1) {
                                        final int n8 = g3.n;
                                        i = g3.m;
                                        t = n8 * o4 / (float)(i * p2);
                                        break Label_3914;
                                    }
                                }
                                t = -1.0f;
                            }
                            aya w;
                            if (g3.x) {
                                byte[] array6;
                                if (g3.D != -1.0f && g3.E != -1.0f && g3.F != -1.0f && g3.G != -1.0f && g3.H != -1.0f && g3.I != -1.0f && g3.J != -1.0f && g3.K != -1.0f && g3.L != -1.0f && g3.M != -1.0f) {
                                    array6 = new byte[25];
                                    final ByteBuffer order = ByteBuffer.wrap(array6).order(ByteOrder.LITTLE_ENDIAN);
                                    order.put((byte)0);
                                    order.putShort((short)(g3.D * 50000.0f + 0.5f));
                                    order.putShort((short)(g3.E * 50000.0f + 0.5f));
                                    order.putShort((short)(g3.F * 50000.0f + 0.5f));
                                    order.putShort((short)(g3.G * 50000.0f + 0.5f));
                                    order.putShort((short)(g3.H * 50000.0f + 0.5f));
                                    order.putShort((short)(g3.I * 50000.0f + 0.5f));
                                    order.putShort((short)(g3.J * 50000.0f + 0.5f));
                                    order.putShort((short)(g3.K * 50000.0f + 0.5f));
                                    order.putShort((short)(g3.L + 0.5f));
                                    order.putShort((short)(g3.M + 0.5f));
                                    order.putShort((short)g3.B);
                                    order.putShort((short)g3.C);
                                }
                                else {
                                    array6 = null;
                                }
                                w = new aya(g3.y, g3.A, g3.z, array6);
                            }
                            else {
                                w = null;
                            }
                            final String a7 = g3.a;
                            Label_4388: {
                                if (a7 != null) {
                                    final Map c3 = bvr.c;
                                    if (c3.containsKey(a7)) {
                                        i = (int)c3.get(g3.a);
                                        break Label_4388;
                                    }
                                }
                                i = -1;
                            }
                            if (g3.r == 0 && Float.compare(g3.s, 0.0f) == 0 && Float.compare(g3.t, 0.0f) == 0) {
                                if (Float.compare(g3.u, 0.0f) == 0) {
                                    i = 0;
                                }
                                else if (Float.compare(g3.t, 90.0f) == 0) {
                                    i = 90;
                                }
                                else if (Float.compare(g3.t, -180.0f) != 0 && Float.compare(g3.t, 180.0f) != 0) {
                                    if (Float.compare(g3.t, -90.0f) == 0) {
                                        i = 270;
                                    }
                                }
                                else {
                                    i = 180;
                                }
                            }
                            ayf.p = g3.m;
                            ayf.q = g3.n;
                            ayf.t = t;
                            ayf.s = i;
                            ayf.u = g3.v;
                            ayf.v = g3.w;
                            ayf.w = w;
                            i = 2;
                        }
                        else {
                            i = n5;
                            if (!"application/x-subrip".equals(j)) {
                                i = n5;
                                if (!"text/x-ssa".equals(j)) {
                                    i = n5;
                                    if (!"text/vtt".equals(j)) {
                                        i = n5;
                                        if (!"application/vobsub".equals(j)) {
                                            i = n5;
                                            if (!"application/pgs".equals(j)) {
                                                if (!"application/dvbsubs".equals(j)) {
                                                    throw aza.a("Unexpected MIME type.", (Throwable)null);
                                                }
                                                i = n5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final String a8 = g3.a;
                        if (a8 != null && !bvr.c.containsKey(a8)) {
                            ayf.b = g3.a;
                        }
                        ayf.b(c);
                        ayf.k = j;
                        ayf.l = l;
                        ayf.c = g3.V;
                        ayf.d = ((u ? 1 : 0) | n7);
                        ayf.m = m;
                        ayf.h = (String)a6;
                        ayf.n = g3.l;
                        (g3.W = ag2.q(g3.c, i)).b(ayf.a());
                        this.u.put(g3.c, (Object)g3);
                        break;
                    }
                }
                this.g = null;
                return;
            }
            throw aza.a("CodecId is missing in TrackEntry element", (Throwable)null);
        }
        else {
            if (this.P != 2) {
                return;
            }
            final bvq bvq = (bvq)this.u.get(this.U);
            bvq.c();
            if (this.n > 0L && "A_OPUS".equals(bvq.b)) {
                this.F.D(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.n).array());
            }
            i = 0;
            for (int n9 = 0; n9 < this.S; ++n9) {
                i += this.T[n9];
            }
            int n10 = 0;
            int n11 = i;
            while (n10 < this.S) {
                final long q = this.Q;
                final long n12 = bvq.e * n10 / 1000;
                final int w2 = this.W;
                if (n10 == 0) {
                    i = w2;
                    if (!this.m) {
                        i = (w2 | 0x1);
                    }
                    n10 = 0;
                }
                else {
                    i = w2;
                }
                final int n13 = this.T[n10];
                n11 -= n13;
                this.r(bvq, n12 + q, i, n13, n11);
                ++n10;
            }
            this.P = 0;
        }
    }
    
    protected void l(final int n, final long d, final long h) {
        this.q();
        if (n == 160) {
            this.m = false;
            this.n = 0L;
            return;
        }
        if (n == 174) {
            this.g = new bvq();
            return;
        }
        if (n == 187) {
            this.j = false;
            return;
        }
        if (n == 19899) {
            this.K = -1;
            this.h = -1L;
            return;
        }
        if (n == 20533) {
            this.c(n).h = true;
            return;
        }
        if (n == 21968) {
            this.c(n).x = true;
            return;
        }
        if (n != 408125543) {
            if (n != 475249515) {
                if (n == 524531317) {
                    if (!this.J) {
                        if (this.v && this.M != -1L) {
                            this.L = true;
                            return;
                        }
                        this.ag.x((bua)new btz(this.I));
                        this.J = true;
                    }
                }
                return;
            }
            this.o = new agnt(null, (byte[])null);
            this.p = new agnt(null, (byte[])null);
        }
        else {
            final long d2 = this.d;
            if (d2 != -1L && d2 != d) {
                throw aza.a("Multiple Segment elements not supported", (Throwable)null);
            }
            this.d = d;
            this.H = h;
        }
    }
    
    protected void m(final int n, final String b) {
        if (n != 134) {
            if (n != 17026) {
                if (n == 21358) {
                    this.c(n).a = b;
                    return;
                }
                if (n == 2274716) {
                    this.c(n).V = b;
                }
            }
            else if (!"webm".equals(b)) {
                if (!"matroska".equals(b)) {
                    final StringBuilder sb = new StringBuilder("DocType ");
                    sb.append(b);
                    sb.append(" not supported");
                    throw aza.a(sb.toString(), (Throwable)null);
                }
            }
            return;
        }
        this.c(n).b = b;
    }
}
