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

public class bvu implements btm
{
    public static final byte[] a;
    public static final UUID b;
    public static final Map c;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private final bat A;
    private final bat B;
    private final bat C;
    private final bat D;
    private final bat E;
    private final bat F;
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
    private btp ag;
    private final lww ah;
    public long d;
    public long e;
    public long f;
    public bvt g;
    public long h;
    public long i;
    public boolean j;
    public long k;
    public int l;
    public boolean m;
    public long n;
    public agpl o;
    public agpl p;
    private final bvv t;
    private final SparseArray u;
    private final boolean v;
    private final bat w;
    private final bat x;
    private final bat y;
    private final bat z;
    
    static {
        q = new byte[] { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
        a = baz.aj("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
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
    
    public bvu() {
        this(0);
    }
    
    public bvu(final int n) {
        final lww ah = new lww((byte[])null);
        this.d = -1L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.I = -9223372036854775807L;
        this.M = -1L;
        this.N = -1L;
        this.i = -9223372036854775807L;
        this.ah = ah;
        ah.g = new oqz(this);
        this.v = (0x1 == (n ^ 0x1));
        this.t = new bvv();
        this.u = new SparseArray();
        this.y = new bat(4);
        this.z = new bat(ByteBuffer.allocate(4).putInt(-1).array());
        this.A = new bat(4);
        this.w = new bat(bua.a);
        this.x = new bat(4);
        this.B = new bat();
        this.C = new bat();
        this.D = new bat(8);
        this.E = new bat();
        this.F = new bat();
        this.T = new int[1];
    }
    
    private final int n() {
        final int y = this.Y;
        this.t();
        return y;
    }
    
    private final int o(final btn btn, final bvt bvt, int n, final boolean b) {
        if ("S_TEXT/UTF8".equals(bvt.b)) {
            this.u(btn, bvu.q, n);
            return this.n();
        }
        if ("S_TEXT/ASS".equals(bvt.b)) {
            this.u(btn, bvu.r, n);
            return this.n();
        }
        if ("S_TEXT/WEBVTT".equals(bvt.b)) {
            this.u(btn, bvu.s, n);
            return this.n();
        }
        final bug w = bvt.W;
        final boolean aa = this.aa;
        final boolean b2 = true;
        if (!aa) {
            if (bvt.h) {
                this.W &= 0xBFFFFFFF;
                final boolean ab = this.ab;
                int n2 = 128;
                if (!ab) {
                    btn.k(this.y.a, 0, 1);
                    ++this.X;
                    final byte ae = this.y.a[0];
                    if ((ae & 0x80) == 0x80) {
                        throw azb.a("Extension bit is set in signal byte", null);
                    }
                    this.ae = ae;
                    this.ab = true;
                }
                final byte ae2 = this.ae;
                if ((ae2 & 0x1) == 0x1) {
                    final int n3 = ae2 & 0x2;
                    this.W |= 0x40000000;
                    if (!this.af) {
                        btn.k(this.D.a, 0, 8);
                        this.X += 8;
                        this.af = true;
                        final bat y = this.y;
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
                            btn.k(this.y.a, 0, 1);
                            ++this.X;
                            this.y.G(0);
                            this.ad = this.y.i();
                            this.ac = true;
                        }
                        final int n4 = this.ad * 4;
                        this.y.C(n4);
                        btn.k(this.y.a, 0, n4);
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
                final byte[] i = bvt.i;
                if (i != null) {
                    this.B.E(i, i.length);
                }
            }
            Label_0902: {
                if ("A_OPUS".equals(bvt.b)) {
                    if (!b) {
                        break Label_0902;
                    }
                }
                else if (bvt.f <= 0) {
                    break Label_0902;
                }
                this.W |= 0x10000000;
                this.F.C(0);
                final int n10 = this.B.c + n - this.X;
                this.y.C(4);
                final bat y2 = this.y;
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
        if (!"V_MPEG4/ISO/AVC".equals(bvt.b) && !"V_MPEGH/ISO/HEVC".equals(bvt.b)) {
            if (bvt.Y != null) {
                bad.f(this.B.c == 0 && b2);
                bvt.Y.e(btn);
            }
            while (true) {
                final int x = this.X;
                if (x >= n) {
                    break;
                }
                final int p4 = this.p(btn, w, n - x);
                this.X += p4;
                this.Y += p4;
            }
        }
        else {
            final byte[] a3 = this.x.a;
            a3[0] = 0;
            a3[2] = (a3[1] = 0);
            final int x2 = bvt.X;
            final int n11 = 4 - x2;
            while (this.X < n) {
                final int z = this.Z;
                if (z == 0) {
                    final int min = Math.min(x2, this.B.a());
                    btn.k(a3, n11 + min, x2 - min);
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
                    final int p5 = this.p(btn, w, z);
                    this.X += p5;
                    this.Y += p5;
                    this.Z -= p5;
                }
            }
        }
        if ("A_VORBIS".equals(bvt.b)) {
            this.z.G(0);
            w.c(this.z, 4);
            this.Y += 4;
        }
        return this.n();
    }
    
    private final int p(final btn btn, final bug bug, int n) {
        final int a = this.B.a();
        if (a > 0) {
            n = Math.min(n, a);
            bug.c(this.B, n);
        }
        else {
            n = bug.a((ayc)btn, n, false);
        }
        return n;
    }
    
    private final void q() {
        bad.c(this.ag);
    }
    
    private final void r(final bvt bvt, final long n, final int n2, int n3, final int n4) {
        final lzv y = bvt.Y;
        if (y != null) {
            y.d(bvt.W, n, n2, n3, n4, bvt.j);
        }
        else {
            if ("S_TEXT/UTF8".equals(bvt.b) || "S_TEXT/ASS".equals(bvt.b) || "S_TEXT/WEBVTT".equals(bvt.b)) {
                if (this.S > 1) {
                    baq.c("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                }
                else {
                    final long k = this.k;
                    if (k == -9223372036854775807L) {
                        baq.c("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    }
                    else {
                        final String b = bvt.b;
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
                            final bat c = this.C;
                            if (b2 >= c.c) {
                                break;
                            }
                            if (c.a[b2] == 0) {
                                c.F(b2);
                                break;
                            }
                            ++b2;
                        }
                        final bug w = bvt.W;
                        final bat c2 = this.C;
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
                    final bat f = this.F;
                    final int c3 = f.c;
                    bvt.W.d(f, c3, 2);
                    n7 = n3 + c3;
                }
            }
            bvt.W.e(n, n2, n7, n4, bvt.j);
        }
        this.O = true;
    }
    
    private final void s(final btn btn, final int n) {
        final bat y = this.y;
        if (y.c >= n) {
            return;
        }
        if (y.b() < n) {
            final bat y2 = this.y;
            final int b = y2.b();
            y2.A(Math.max(b + b, n));
        }
        final bat y3 = this.y;
        final byte[] a = y3.a;
        final int c = y3.c;
        btn.k(a, c, n - c);
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
    
    private final void u(final btn btn, final byte[] array, final int n) {
        final int length = array.length;
        final int n2 = length + n;
        if (this.C.b() < n2) {
            this.C.D(Arrays.copyOf(array, n2 + n));
        }
        else {
            System.arraycopy(array, 0, this.C.a, 0, length);
        }
        btn.k(this.C.a, length, n);
        this.C.G(0);
        this.C.F(n2);
    }
    
    private static byte[] v(long n, final String s, final long n2) {
        bad.d(n != -9223372036854775807L);
        final long n3 = n / 3600000000L;
        final Locale us = Locale.US;
        final int n4 = (int)n3;
        n -= n4 * 3600000000L;
        final int n5 = (int)(n / 60000000L);
        n -= n5 * 60000000L;
        final int n6 = (int)(n / 1000000L);
        return baz.aj(String.format(us, s, n4, n5, n6, (int)((n - n6 * 1000000L) / n2)));
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
            return baz.y(n, e, 1000L);
        }
        throw azb.a("Can't scale timecode prior to timecodeScale being set.", null);
    }
    
    protected final bvt c(final int n) {
        this.j(n);
        return this.g;
    }
    
    public final void d(final btp ag) {
        this.ag = ag;
    }
    
    public final void e() {
    }
    
    public void f(final long n, final long n2) {
        this.i = -9223372036854775807L;
        int i = 0;
        this.P = 0;
        final lww ah = this.ah;
        ah.b = 0;
        ((ArrayDeque)ah.e).clear();
        ((bvv)ah.f).d();
        this.t.d();
        this.t();
        while (i < this.u.size()) {
            final lzv y = ((bvt)this.u.valueAt(i)).Y;
            if (y != null) {
                y.c();
            }
            ++i;
        }
    }
    
    public final boolean g(final btn btn) {
        final aasq aasq = new aasq(null, null);
        final long b = ((btg)btn).b;
        long n = 1024L;
        if (b != -1L) {
            if (b > 1024L) {
                n = n;
            }
            else {
                n = b;
            }
        }
        btn.j(((bat)aasq.b).a, 0, 4);
        long q = ((bat)aasq.b).q();
        aasq.a = 4;
        while (q != 440786851L) {
            if (++aasq.a == (int)n) {
                return false;
            }
            btn.j(((bat)aasq.b).a, 0, 1);
            q = ((q << 8 & 0xFFFFFFFFFFFFFF00L) | (long)(((bat)aasq.b).a[0] & 0xFF));
        }
        final long f = aasq.f(btn);
        final long n2 = aasq.a;
        if (f == Long.MIN_VALUE) {
            return false;
        }
        if (b != -1L) {
            if (n2 + f >= b) {
                return false;
            }
        }
        while (true) {
            final long n3 = aasq.a;
            final long n4 = n2 + f;
            if (n3 < n4) {
                if (aasq.f(btn) == Long.MIN_VALUE) {
                    return false;
                }
                final long f2 = aasq.f(btn);
                if (f2 < 0L) {
                    return false;
                }
                if (f2 == 0L) {
                    continue;
                }
                final int n5 = (int)f2;
                btn.g(n5);
                aasq.a += n5;
            }
            else {
                if (n3 == n4) {
                    return true;
                }
                return false;
            }
        }
    }
    
    public final int h(final btn btn, final pbg pbg) {
        this.O = false;
        while (!this.O) {
            lww ah = this.ah;
            bad.c(ah.g);
            while (true) {
                final int n = 0;
                final yrd yrd = ((ArrayDeque)ah.e).peek();
                if (yrd != null && ((btg)btn).c >= yrd.a) {
                    ((bvu)((oqz)ah.g).a).k(((yrd)((ArrayDeque)ah.e).pop()).b);
                    break;
                }
                final int b = ah.b;
                Label_0420: {
                    if (b == 0) {
                        long c;
                        if ((c = ((bvv)ah.f).c(btn, true, false, 4)) == -2L) {
                            btn.l();
                            int a;
                            int n3;
                            while (true) {
                                btn.j(ah.a, 0, 4);
                                a = bvv.a((int)ah.a[0]);
                                if (a != -1 && a <= 4) {
                                    final int n2 = (int)bvv.b(ah.a, a, false);
                                    final Object a2 = ((oqz)ah.g).a;
                                    n3 = n2;
                                    if (n2 == 357149030 || (n3 = n2) == 524531317 || (n3 = n2) == 475249515) {
                                        break;
                                    }
                                    if (n2 == 374648427) {
                                        n3 = 374648427;
                                        break;
                                    }
                                }
                                btn.m(1);
                            }
                            btn.m(a);
                            c = n3;
                        }
                        if (c == -1L) {
                            for (int i = n; i < this.u.size(); ++i) {
                                final bvt bvt = (bvt)this.u.valueAt(i);
                                bvt.c();
                                final lzv y = bvt.Y;
                                if (y != null) {
                                    y.b(bvt.W, bvt.j);
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
                    ah.d = ((bvv)ah.f).c(btn, false, true, 8);
                    ah.b = 2;
                }
                final Object g = ah.g;
                int c2 = ah.c;
                final oqz oqz = (oqz)g;
                final bvu bvu = (bvu)oqz.a;
                final int a3 = bvu.a(c2);
                if (a3 != 0) {
                    if (a3 == 1) {
                        final long c3 = ((btg)btn).c;
                        ((ArrayDeque<Object>)ah.e).push(new yrd(c2, ah.d + c3, (short[])null));
                        ((bvu)((oqz)ah.g).a).l(ah.c, c3, ah.d);
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
                                                                throw azb.a(sb.toString(), null);
                                                            }
                                                            bvu.j(c2);
                                                            btn.k(bvu.g.v = new byte[n4], 0, n4);
                                                        }
                                                        else {
                                                            bvu.j(c2);
                                                            btn.k(bvu.g.k = new byte[n4], 0, n4);
                                                        }
                                                    }
                                                    else {
                                                        Arrays.fill(bvu.A.a, (byte)0);
                                                        btn.k(bvu.A.a, 4 - n4, n4);
                                                        bvu.A.G(0);
                                                        bvu.K = (int)bvu.A.q();
                                                    }
                                                }
                                                else {
                                                    final byte[] array = new byte[n4];
                                                    btn.k(array, 0, n4);
                                                    bvu.c(c2).j = new buf(1, array, 0, 0);
                                                }
                                            }
                                            else {
                                                bvu.j(c2);
                                                btn.k(bvu.g.i = new byte[n4], 0, n4);
                                            }
                                        }
                                        else {
                                            final bvt c4 = bvu.c(c2);
                                            final int g2 = c4.g;
                                            if (g2 != 1685485123 && g2 != 1685480259) {
                                                btn.m(n4);
                                            }
                                            else {
                                                btn.k(c4.N = new byte[n4], 0, n4);
                                            }
                                        }
                                    }
                                    else if (bvu.P == 2) {
                                        final bvt bvt2 = (bvt)bvu.u.get(bvu.U);
                                        if (bvu.l == 4 && "V_VP9".equals(bvt2.b)) {
                                            bvu.F.C(n4);
                                            btn.k(bvu.F.a, 0, n4);
                                        }
                                        else {
                                            btn.m(n4);
                                        }
                                    }
                                }
                                else {
                                    if (bvu.P == 0) {
                                        bvu.U = (int)bvu.t.c(btn, false, true, 8);
                                        bvu.V = bvu.t.a;
                                        bvu.k = -9223372036854775807L;
                                        bvu.P = 1;
                                        bvu.y.C(0);
                                    }
                                    final bvt bvt3 = (bvt)bvu.u.get(bvu.U);
                                    if (bvt3 == null) {
                                        btn.m(n4 - bvu.V);
                                        bvu.P = 0;
                                    }
                                    else {
                                        bvt3.c();
                                        if (bvu.P == 1) {
                                            bvu.s(btn, 3);
                                            final int n5 = (bvu.y.a[2] & 0x6) >> 1;
                                            if (n5 == 0) {
                                                bvu.S = 1;
                                                (bvu.T = w(bvu.T, 1))[0] = n4 - bvu.V - 3;
                                            }
                                            else {
                                                bvu.s(btn, 4);
                                                final int s = (bvu.y.a[3] & 0xFF) + 1;
                                                bvu.S = s;
                                                final int[] w = w(bvu.T, s);
                                                bvu.T = w;
                                                if (n5 == 2) {
                                                    final int v = bvu.V;
                                                    final int s2 = bvu.S;
                                                    Arrays.fill(w, 0, s2, (n4 - v - 4) / s2);
                                                }
                                                else if (n5 == 1) {
                                                    int n6 = 0;
                                                    int n7 = 0;
                                                    int n8 = 4;
                                                    int n9;
                                                    while (true) {
                                                        n9 = bvu.S - 1;
                                                        if (n6 >= n9) {
                                                            break;
                                                        }
                                                        bvu.T[n6] = 0;
                                                        int n10;
                                                        int n11;
                                                        do {
                                                            ++n8;
                                                            bvu.s(btn, n8);
                                                            n10 = (bvu.y.a[n8 - 1] & 0xFF);
                                                            final int[] t = bvu.T;
                                                            n11 = t[n6] + n10;
                                                            t[n6] = n11;
                                                        } while (n10 == 255);
                                                        n7 += n11;
                                                        ++n6;
                                                    }
                                                    bvu.T[n9] = n4 - bvu.V - n8 - n7;
                                                }
                                                else {
                                                    if (n5 != 3) {
                                                        throw azb.a("Unexpected lacing value: 2", null);
                                                    }
                                                    int n12 = 0;
                                                    int n13 = 0;
                                                    int n14 = 4;
                                                Label_1899:
                                                    while (true) {
                                                        final int n15 = bvu.S - 1;
                                                        if (n12 >= n15) {
                                                            bvu.T[n15] = n4 - bvu.V - n14 - n13;
                                                            break;
                                                        }
                                                        bvu.T[n12] = 0;
                                                        ++n14;
                                                        bvu.s(btn, n14);
                                                        final byte[] a4 = bvu.y.a;
                                                        final int n16 = n14 - 1;
                                                        if (a4[n16] != 0) {
                                                            int j = 0;
                                                            while (true) {
                                                                while (j < 8) {
                                                                    final int n17 = 1 << 7 - j;
                                                                    if ((bvu.y.a[n16] & n17) != 0x0) {
                                                                        final int n18 = n14 + j;
                                                                        bvu.s(btn, n18);
                                                                        long n19 = bvu.y.a[n16] & 0xFF & ~n17;
                                                                        for (int k = n16 + 1; k < n18; ++k) {
                                                                            n19 = (n19 << 8 | (long)(bvu.y.a[k] & 0xFF));
                                                                        }
                                                                        final lww lww = ah;
                                                                        long n20 = n19;
                                                                        n14 = n18;
                                                                        ah = lww;
                                                                        if (n12 > 0) {
                                                                            n20 = n19 - ((1L << j * 7 + 6) - 1L);
                                                                            n14 = n18;
                                                                            ah = lww;
                                                                        }
                                                                        if (n20 >= -2147483648L && n20 <= 2147483647L) {
                                                                            final int[] t2 = bvu.T;
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
                                                                        throw azb.a("EBML lacing sample size out of range.", null);
                                                                    }
                                                                    else {
                                                                        ++j;
                                                                    }
                                                                }
                                                                long n20 = 0L;
                                                                continue;
                                                            }
                                                        }
                                                        throw azb.a("No valid varint length mask found", null);
                                                    }
                                                }
                                            }
                                            final byte[] a5 = bvu.y.a;
                                            bvu.Q = bvu.i + bvu.b((a5[1] & 0xFF) | a5[0] << 8);
                                            int w2;
                                            if (bvt3.d != 2) {
                                                if (c2 == 163) {
                                                    if ((bvu.y.a[2] & 0x80) == 0x80) {
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
                                            bvu.W = w2;
                                            bvu.P = 2;
                                            bvu.R = 0;
                                        }
                                        if (c2 == 163) {
                                            while (true) {
                                                final int r = bvu.R;
                                                if (r >= bvu.S) {
                                                    break;
                                                }
                                                bvu.r(bvt3, bvu.Q + bvu.R * bvt3.e / 1000, bvu.W, bvu.o(btn, bvt3, bvu.T[r], false), 0);
                                                ++bvu.R;
                                            }
                                            bvu.P = 0;
                                        }
                                        else {
                                            while (true) {
                                                final int r2 = bvu.R;
                                                if (r2 >= bvu.S) {
                                                    break;
                                                }
                                                final int[] t3 = bvu.T;
                                                t3[r2] = bvu.o(btn, bvt3, t3[r2], true);
                                                ++bvu.R;
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
                                throw azb.a(sb2.toString(), null);
                            }
                            final int n23 = (int)d;
                            final long b2 = ah.b(btn, n23);
                            double longBitsToDouble;
                            if (n23 == 4) {
                                longBitsToDouble = Float.intBitsToFloat((int)b2);
                            }
                            else {
                                longBitsToDouble = Double.longBitsToDouble(b2);
                            }
                            final Object a6 = oqz.a;
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
                                                        ((bvu)a6).c(c2).u = (float)longBitsToDouble;
                                                        break Label_0957;
                                                    }
                                                    case 30324: {
                                                        ((bvu)a6).c(c2).t = (float)longBitsToDouble;
                                                        break Label_0957;
                                                    }
                                                    case 30323: {
                                                        ((bvu)a6).c(c2).s = (float)longBitsToDouble;
                                                        break Label_0957;
                                                    }
                                                }
                                                break;
                                            }
                                            case 21978: {
                                                ((bvu)a6).c(c2).M = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21977: {
                                                ((bvu)a6).c(c2).L = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21976: {
                                                ((bvu)a6).c(c2).K = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21975: {
                                                ((bvu)a6).c(c2).J = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21974: {
                                                ((bvu)a6).c(c2).I = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21973: {
                                                ((bvu)a6).c(c2).H = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21972: {
                                                ((bvu)a6).c(c2).G = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21971: {
                                                ((bvu)a6).c(c2).F = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21970: {
                                                ((bvu)a6).c(c2).E = (float)longBitsToDouble;
                                                break;
                                            }
                                            case 21969: {
                                                ((bvu)a6).c(c2).D = (float)longBitsToDouble;
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        ((bvu)a6).f = (long)longBitsToDouble;
                                    }
                                }
                                else {
                                    ((bvu)a6).c(c2).Q = (int)longBitsToDouble;
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
                                    btn.k(array2, 0, l);
                                    while (l > 0) {
                                        final int n24 = l - 1;
                                        if (array2[n24] != 0) {
                                            break;
                                        }
                                        l = n24;
                                    }
                                    s3 = new String(array2, 0, l);
                                }
                                ((bvu)oqz.a).m(c2, s3);
                                ah.b = 0;
                                break;
                            }
                            final StringBuilder sb3 = new StringBuilder("String element size: ");
                            sb3.append(d2);
                            throw azb.a(sb3.toString(), null);
                        }
                    }
                    else {
                        final long d3 = ah.d;
                        if (d3 <= 8L) {
                            final long b3 = ah.b(btn, (int)d3);
                            final Object a7 = oqz.a;
                            Label_3060: {
                                if (c2 != 20529) {
                                    if (c2 != 20530) {
                                        switch (c2) {
                                            default: {
                                                switch (c2) {
                                                    case 21949: {
                                                        ((bvu)a7).c(c2).C = (int)b3;
                                                        break Label_3060;
                                                    }
                                                    case 21948: {
                                                        ((bvu)a7).c(c2).B = (int)b3;
                                                        break Label_3060;
                                                    }
                                                    case 21947: {
                                                        final bvu bvu2 = (bvu)a7;
                                                        bvu2.j(c2);
                                                        final bvt g3 = bvu2.g;
                                                        g3.x = true;
                                                        final int a8 = ayb.a((int)b3);
                                                        if (a8 != -1) {
                                                            g3.y = a8;
                                                            break Label_3060;
                                                        }
                                                        break Label_3060;
                                                    }
                                                    case 21946: {
                                                        final bvu bvu3 = (bvu)a7;
                                                        bvu3.j(c2);
                                                        final int b4 = ayb.b((int)b3);
                                                        if (b4 != -1) {
                                                            bvu3.g.z = b4;
                                                            break Label_3060;
                                                        }
                                                        break Label_3060;
                                                    }
                                                    case 21945: {
                                                        final bvu bvu4 = (bvu)a7;
                                                        bvu4.j(c2);
                                                        final int n25 = (int)b3;
                                                        if (n25 == 1) {
                                                            bvu4.g.A = 2;
                                                            break Label_3060;
                                                        }
                                                        if (n25 != 2) {
                                                            break Label_3060;
                                                        }
                                                        bvu4.g.A = 1;
                                                        break Label_3060;
                                                    }
                                                }
                                                break;
                                            }
                                            case 2807729: {
                                                ((bvu)a7).e = b3;
                                                break;
                                            }
                                            case 2352003: {
                                                ((bvu)a7).c(c2).e = (int)b3;
                                                break;
                                            }
                                            case 30321: {
                                                final bvu bvu5 = (bvu)a7;
                                                bvu5.j(c2);
                                                final int n26 = (int)b3;
                                                if (n26 == 0) {
                                                    bvu5.g.r = 0;
                                                    break;
                                                }
                                                if (n26 == 1) {
                                                    bvu5.g.r = 1;
                                                    break;
                                                }
                                                if (n26 == 2) {
                                                    bvu5.g.r = 2;
                                                    break;
                                                }
                                                if (n26 != 3) {
                                                    break;
                                                }
                                                bvu5.g.r = 3;
                                                break;
                                            }
                                            case 30114: {
                                                ((bvu)a7).n = b3;
                                                break;
                                            }
                                            case 25188: {
                                                ((bvu)a7).c(c2).P = (int)b3;
                                                break;
                                            }
                                            case 22203: {
                                                ((bvu)a7).c(c2).S = b3;
                                                break;
                                            }
                                            case 22186: {
                                                ((bvu)a7).c(c2).R = b3;
                                                break;
                                            }
                                            case 21998: {
                                                ((bvu)a7).c(c2).f = (int)b3;
                                                break;
                                            }
                                            case 21930: {
                                                ((bvu)a7).c(c2).T = (b3 == 1L);
                                                break;
                                            }
                                            case 21690: {
                                                ((bvu)a7).c(c2).p = (int)b3;
                                                break;
                                            }
                                            case 21682: {
                                                ((bvu)a7).c(c2).q = (int)b3;
                                                break;
                                            }
                                            case 21680: {
                                                ((bvu)a7).c(c2).o = (int)b3;
                                                break;
                                            }
                                            case 21432: {
                                                final int n27 = (int)b3;
                                                final bvu bvu6 = (bvu)a7;
                                                bvu6.j(c2);
                                                if (n27 == 0) {
                                                    bvu6.g.w = 0;
                                                    break;
                                                }
                                                if (n27 == 1) {
                                                    bvu6.g.w = 2;
                                                    break;
                                                }
                                                if (n27 == 3) {
                                                    bvu6.g.w = 1;
                                                    break;
                                                }
                                                if (n27 != 15) {
                                                    break;
                                                }
                                                bvu6.g.w = 3;
                                                break;
                                            }
                                            case 21420: {
                                                final bvu bvu7 = (bvu)a7;
                                                bvu7.h = b3 + bvu7.d;
                                                break;
                                            }
                                            case 18408: {
                                                if (b3 == 1L) {
                                                    break;
                                                }
                                                final StringBuilder sb4 = new StringBuilder("AESSettingsCipherMode ");
                                                sb4.append(b3);
                                                sb4.append(" not supported");
                                                throw azb.a(sb4.toString(), null);
                                            }
                                            case 18401: {
                                                if (b3 == 5L) {
                                                    break;
                                                }
                                                final StringBuilder sb5 = new StringBuilder("ContentEncAlgo ");
                                                sb5.append(b3);
                                                sb5.append(" not supported");
                                                throw azb.a(sb5.toString(), null);
                                            }
                                            case 17143: {
                                                if (b3 == 1L) {
                                                    break;
                                                }
                                                final StringBuilder sb6 = new StringBuilder("EBMLReadVersion ");
                                                sb6.append(b3);
                                                sb6.append(" not supported");
                                                throw azb.a(sb6.toString(), null);
                                            }
                                            case 17029: {
                                                if (b3 >= 1L && b3 <= 2L) {
                                                    break;
                                                }
                                                final StringBuilder sb7 = new StringBuilder("DocTypeReadVersion ");
                                                sb7.append(b3);
                                                sb7.append(" not supported");
                                                throw azb.a(sb7.toString(), null);
                                            }
                                            case 16980: {
                                                if (b3 == 3L) {
                                                    break;
                                                }
                                                final StringBuilder sb8 = new StringBuilder("ContentCompAlgo ");
                                                sb8.append(b3);
                                                sb8.append(" not supported");
                                                throw azb.a(sb8.toString(), null);
                                            }
                                            case 16871: {
                                                ((bvu)a7).c(c2).g = (int)b3;
                                                break;
                                            }
                                            case 251: {
                                                ((bvu)a7).m = true;
                                                break;
                                            }
                                            case 241: {
                                                final bvu bvu8 = (bvu)a7;
                                                if (!bvu8.j) {
                                                    bvu8.i(c2);
                                                    bvu8.p.p(b3);
                                                    bvu8.j = true;
                                                    break;
                                                }
                                                break;
                                            }
                                            case 238: {
                                                ((bvu)a7).l = (int)b3;
                                                break;
                                            }
                                            case 231: {
                                                final bvu bvu9 = (bvu)a7;
                                                bvu9.i = bvu9.b(b3);
                                                break;
                                            }
                                            case 215: {
                                                ((bvu)a7).c(c2).c = (int)b3;
                                                break;
                                            }
                                            case 186: {
                                                ((bvu)a7).c(c2).n = (int)b3;
                                                break;
                                            }
                                            case 179: {
                                                final bvu bvu10 = (bvu)a7;
                                                bvu10.i(c2);
                                                bvu10.o.p(bvu10.b(b3));
                                                break;
                                            }
                                            case 176: {
                                                ((bvu)a7).c(c2).m = (int)b3;
                                                break;
                                            }
                                            case 159: {
                                                ((bvu)a7).c(c2).O = (int)b3;
                                                break;
                                            }
                                            case 155: {
                                                final bvu bvu11 = (bvu)a7;
                                                bvu11.k = bvu11.b(b3);
                                                break;
                                            }
                                            case 136: {
                                                ((bvu)a7).c(c2).U = (b3 == 1L);
                                                break;
                                            }
                                            case 131: {
                                                ((bvu)a7).c(c2).d = (int)b3;
                                                break;
                                            }
                                        }
                                    }
                                    else if (b3 != 1L) {
                                        final StringBuilder sb9 = new StringBuilder("ContentEncodingScope ");
                                        sb9.append(b3);
                                        sb9.append(" not supported");
                                        throw azb.a(sb9.toString(), null);
                                    }
                                }
                                else if (b3 != 0L) {
                                    final StringBuilder sb10 = new StringBuilder("ContentEncodingOrder ");
                                    sb10.append(b3);
                                    sb10.append(" not supported");
                                    throw azb.a(sb10.toString(), null);
                                }
                            }
                            ah.b = 0;
                            break;
                        }
                        final StringBuilder sb11 = new StringBuilder("Invalid integer size: ");
                        sb11.append(d3);
                        throw azb.a(sb11.toString(), null);
                    }
                }
                else {
                    btn.m((int)ah.d);
                    ah.b = 0;
                }
            }
            final long c5 = ((btg)btn).c;
            if (!this.L) {
                if (!this.J) {
                    continue;
                }
                final long n28 = this.N;
                if (n28 != -1L) {
                    pbg.a = n28;
                    this.N = -1L;
                    return 1;
                }
                continue;
                continue;
            }
            this.N = c5;
            pbg.a = this.M;
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
        throw azb.a(sb.toString(), null);
    }
    
    public final void j(final int n) {
        if (this.g != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Element ");
        sb.append(n);
        sb.append(" must be in a TrackEntry");
        throw azb.a(sb.toString(), null);
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
                    throw azb.a("Mandatory element SeekID or SeekPosition not found", null);
                }
                if (i != 25152) {
                    if (i != 28032) {
                        if (i != 357149030) {
                            if (i != 374648427) {
                                if (i == 475249515) {
                                    if (!this.J) {
                                        final btp ag = this.ag;
                                        final agpl o = this.o;
                                        final agpl p = this.p;
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
                                                            baq.c("MatroskaExtractor", sb.toString());
                                                            copy = Arrays.copyOf(array, n);
                                                            copy2 = Arrays.copyOf(array2, n);
                                                            copy3 = Arrays.copyOf(array3, n);
                                                            copy4 = Arrays.copyOf(array4, n);
                                                        }
                                                        o2 = new bte(copy, copy2, copy3, copy4);
                                                        break Label_0411;
                                                    }
                                                }
                                            }
                                            o2 = new buc(this.I);
                                        }
                                        ag.x((bud)o2);
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
                                throw azb.a("No valid tracks were found", null);
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
                        final bvt g = this.g;
                        if (g.h) {
                            if (g.i != null) {
                                throw azb.a("Combining encryption and compression is not supported", null);
                            }
                        }
                    }
                }
                else {
                    this.j(i);
                    final bvt g2 = this.g;
                    if (g2.h) {
                        if (g2.j != null) {
                            g2.l = new DrmInitData(new DrmInitData$SchemeData[] { new DrmInitData$SchemeData(aya.a, "video/webm", this.g.j.b) });
                            return;
                        }
                        throw azb.a("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                }
                return;
            }
            final bvt g3 = this.g;
            bad.c(g3);
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
                        final btp ag2 = this.ag;
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
                            Object o4 = null;
                            Label_3645: {
                                List<byte[]> list = null;
                                String s2 = null;
                                Label_3632: {
                                    Label_3630: {
                                        String s3 = null;
                                        Label_3619: {
                                            Object o3 = null;
                                            String s5 = null;
                                            Label_3544: {
                                                Label_3204: {
                                                    Label_3111: {
                                                        switch (i) {
                                                            default: {
                                                                throw azb.a("Unrecognized codec identifier.", null);
                                                            }
                                                            case 32: {
                                                                final byte[] array5 = new byte[4];
                                                                System.arraycopy(g3.e(b), 0, array5, 0, 4);
                                                                list = afgh.r(array5);
                                                                s2 = "application/dvbsubs";
                                                                break Label_3630;
                                                            }
                                                            case 31: {
                                                                s3 = "application/pgs";
                                                                break Label_3619;
                                                            }
                                                            case 30: {
                                                                list = afgh.r(g3.e(b));
                                                                s2 = "application/vobsub";
                                                                break Label_3630;
                                                            }
                                                            case 29: {
                                                                s3 = "text/vtt";
                                                                break Label_3619;
                                                            }
                                                            case 28: {
                                                                list = afgh.s(bvu.a, g3.e(b));
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
                                                                baq.c("MatroskaExtractor", sb2.toString());
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
                                                                baq.c("MatroskaExtractor", sb3.toString());
                                                                break Label_3111;
                                                            }
                                                            case 24: {
                                                                if ((i = baz.l(g3.P)) == 0) {
                                                                    i = g3.P;
                                                                    final StringBuilder sb4 = new StringBuilder("Unsupported little endian PCM bit depth: ");
                                                                    sb4.append(i);
                                                                    sb4.append(". Setting mimeType to audio/x-unknown");
                                                                    baq.c("MatroskaExtractor", sb4.toString());
                                                                    break Label_3111;
                                                                }
                                                                break;
                                                            }
                                                            case 23: {
                                                                if (!bvt.d(new bat(g3.e(b)))) {
                                                                    baq.c("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                                    break Label_3111;
                                                                }
                                                                if ((i = baz.l(g3.P)) == 0) {
                                                                    i = g3.P;
                                                                    final StringBuilder sb5 = new StringBuilder("Unsupported PCM bit depth: ");
                                                                    sb5.append(i);
                                                                    sb5.append(". Setting mimeType to audio/x-unknown");
                                                                    baq.c("MatroskaExtractor", sb5.toString());
                                                                    break Label_3111;
                                                                }
                                                                break;
                                                            }
                                                            case 22: {
                                                                list = Collections.singletonList(g3.e(b));
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
                                                                g3.Y = new lzv();
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
                                                                final ikm a2 = bsu.a(g3.k);
                                                                g3.Q = a2.b;
                                                                g3.O = a2.a;
                                                                o3 = a2.c;
                                                                s5 = "audio/mp4a-latm";
                                                                break Label_3544;
                                                            }
                                                            case 12: {
                                                                list = new ArrayList<byte[]>(3);
                                                                list.add(g3.e(g3.b));
                                                                list.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(g3.R).array());
                                                                list.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(g3.S).array());
                                                                i = 5760;
                                                                s2 = "audio/opus";
                                                                break Label_3632;
                                                            }
                                                            case 11: {
                                                                list = bvt.b(g3.e(b));
                                                                i = 8192;
                                                                s2 = "audio/vorbis";
                                                                break Label_3632;
                                                            }
                                                            case 10: {
                                                                s3 = "video/x-unknown";
                                                                break Label_3619;
                                                            }
                                                            case 9: {
                                                                final Pair a3 = bvt.a(new bat(g3.e(b)));
                                                                s2 = (String)a3.first;
                                                                list = (List)a3.second;
                                                                break Label_3630;
                                                            }
                                                            case 8: {
                                                                final btv a4 = btv.a(new bat(g3.e(b)));
                                                                m = a4.a;
                                                                g3.X = a4.b;
                                                                o3 = a4.d;
                                                                s5 = "video/hevc";
                                                                break Label_3544;
                                                            }
                                                            case 7: {
                                                                final bsx a5 = bsx.a(new bat(g3.e(b)));
                                                                m = a5.a;
                                                                g3.X = a5.b;
                                                                o3 = a5.f;
                                                                s5 = "video/avc";
                                                                break Label_3544;
                                                            }
                                                            case 4:
                                                            case 5:
                                                            case 6: {
                                                                final byte[] k = g3.k;
                                                                if (k == null) {
                                                                    list = null;
                                                                }
                                                                else {
                                                                    list = Collections.singletonList(k);
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
                                                list = null;
                                                i = 4096;
                                                break Label_3632;
                                            }
                                            l = -1;
                                            o4 = o3;
                                            s = s5;
                                            break Label_3645;
                                        }
                                        final afgh afgh = null;
                                        s2 = s3;
                                        list = afgh;
                                    }
                                    i = -1;
                                }
                                o4 = null;
                                s = s2;
                                l = i;
                                m = list;
                            }
                            i = -1;
                            s4 = (String)o4;
                        }
                        final byte[] n6 = g3.N;
                        Object a6 = s4;
                        String j = s;
                        if (n6 != null) {
                            final bhy h2 = bhy.h(new bat(n6));
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
                        final ayg ayg = new ayg();
                        if (aza.i(j)) {
                            ayg.x = g3.O;
                            ayg.y = g3.Q;
                            ayg.z = i;
                            i = 1;
                        }
                        else if (aza.m(j)) {
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
                            final int o5 = g3.o;
                            float t = 0.0f;
                            Label_3914: {
                                if (o5 != -1) {
                                    final int p2 = g3.p;
                                    if (p2 != -1) {
                                        i = g3.n;
                                        t = i * o5 / (float)(g3.m * p2);
                                        break Label_3914;
                                    }
                                }
                                t = -1.0f;
                            }
                            ayb w;
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
                                w = new ayb(g3.y, g3.A, g3.z, array6);
                            }
                            else {
                                w = null;
                            }
                            final String a7 = g3.a;
                            Label_4388: {
                                if (a7 != null) {
                                    final Map c2 = bvu.c;
                                    if (c2.containsKey(a7)) {
                                        i = (int)c2.get(g3.a);
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
                            ayg.p = g3.m;
                            ayg.q = g3.n;
                            ayg.t = t;
                            ayg.s = i;
                            ayg.u = g3.v;
                            ayg.v = g3.w;
                            ayg.w = w;
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
                                                    throw azb.a("Unexpected MIME type.", null);
                                                }
                                                i = n5;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final String a8 = g3.a;
                        if (a8 != null && !bvu.c.containsKey(a8)) {
                            ayg.b = g3.a;
                        }
                        ayg.b(c);
                        ayg.k = j;
                        ayg.l = l;
                        ayg.c = g3.V;
                        ayg.d = ((u ? 1 : 0) | n7);
                        ayg.m = m;
                        ayg.h = (String)a6;
                        ayg.n = g3.l;
                        (g3.W = ag2.q(g3.c, i)).b(ayg.a());
                        this.u.put(g3.c, (Object)g3);
                        break;
                    }
                }
                this.g = null;
                return;
            }
            throw azb.a("CodecId is missing in TrackEntry element", null);
        }
        else {
            if (this.P != 2) {
                return;
            }
            final bvt bvt = (bvt)this.u.get(this.U);
            bvt.c();
            if (this.n > 0L && "A_OPUS".equals(bvt.b)) {
                this.F.D(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.n).array());
            }
            i = 0;
            for (int n8 = 0; n8 < this.S; ++n8) {
                i += this.T[n8];
            }
            int n9 = 0;
            int n10 = i;
            while (n9 < this.S) {
                final long q = this.Q;
                final long n11 = bvt.e * n9 / 1000;
                final int w2 = this.W;
                int n13;
                if (n9 == 0) {
                    i = w2;
                    if (!this.m) {
                        i = (w2 | 0x1);
                    }
                    final int n12 = 0;
                    n13 = i;
                    i = n12;
                }
                else {
                    i = n9;
                    n13 = w2;
                }
                final int n14 = this.T[i];
                n10 -= n14;
                this.r(bvt, n11 + q, n13, n14, n10);
                n9 = i + 1;
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
            this.g = new bvt();
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
                        this.ag.x((bud)new buc(this.I));
                        this.J = true;
                    }
                }
                return;
            }
            this.o = new agpl(null, (byte[])null);
            this.p = new agpl(null, (byte[])null);
        }
        else {
            final long d2 = this.d;
            if (d2 != -1L && d2 != d) {
                throw azb.a("Multiple Segment elements not supported", null);
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
                    throw azb.a(sb.toString(), null);
                }
            }
            return;
        }
        this.c(n).b = b;
    }
}
