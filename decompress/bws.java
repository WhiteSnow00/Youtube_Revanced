import android.util.Pair;
import androidx.media3.extractor.metadata.mp4.MdtaMetadataEntry;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bws implements btm, bud
{
    public btp a;
    private final bat b;
    private final bat c;
    private final bat d;
    private final bat e;
    private final ArrayDeque f;
    private final List g;
    private int h;
    private int i;
    private long j;
    private int k;
    private bat l;
    private int m;
    private int n;
    private int o;
    private int p;
    private long[][] q;
    private int r;
    private long s;
    private int t;
    private adfd[] u;
    
    public bws() {
        this(null);
    }
    
    public bws(final byte[] array) {
        this.h = 0;
        new ArrayList();
        this.g = new ArrayList();
        this.e = new bat(16);
        this.f = new ArrayDeque();
        this.b = new bat(bua.a);
        this.c = new bat(4);
        this.d = new bat();
        this.m = -1;
        this.a = btp.t;
        this.u = new adfd[0];
    }
    
    private static int i(final int n) {
        if (n == 1751476579) {
            return 2;
        }
        if (n != 1903435808) {
            return 0;
        }
        return 1;
    }
    
    private static int j(final bwv bwv, final long n) {
        final int a = bwv.a(n);
        if (a == -1) {
            return bwv.b(n);
        }
        return a;
    }
    
    private static long k(final bwv bwv, final long n, final long n2) {
        final int j = j(bwv, n);
        if (j == -1) {
            return n2;
        }
        return Math.min(bwv.b[j], n2);
    }
    
    private final void l() {
        this.h = 0;
        this.k = 0;
    }
    
    private final void m(final long n) {
        while (!this.f.isEmpty() && this.f.peek().a == n) {
            final bwc bwc = this.f.pop();
            if (bwc.d == 1836019574) {
                final ArrayList list = new ArrayList();
                final int t = this.t;
                final btu btu = new btu();
                final bwd b = bwc.b(1969517665);
                Metadata metadata;
                Metadata metadata2;
                if (b != null) {
                    final Pair a = bwl.a(b);
                    metadata = (Metadata)a.first;
                    metadata2 = (Metadata)a.second;
                    if (metadata != null) {
                        btu.b(metadata);
                    }
                }
                else {
                    metadata2 = null;
                    metadata = null;
                }
                final bwc a2 = bwc.a(1835365473);
                Metadata b2;
                if (a2 != null) {
                    b2 = bwl.b(a2);
                }
                else {
                    b2 = null;
                }
                final List d = bwl.d(bwc, btu, -9223372036854775807L, (DrmInitData)null, t == 1, (afax)bwr.a);
                final int size = d.size();
                int n2 = 0;
                int r = -1;
                long max = -9223372036854775807L;
                long n3;
                while (true) {
                    n3 = 0L;
                    if (n2 >= size) {
                        break;
                    }
                    final bwv bwv = d.get(n2);
                    if (bwv.a != 0) {
                        final mah h = bwv.h;
                        long n4 = h.e;
                        if (n4 == -9223372036854775807L) {
                            n4 = bwv.g;
                        }
                        max = Math.max(max, n4);
                        final adfd adfd = new adfd(h, bwv, this.a.q(n2, h.b), (byte[])null);
                        int l;
                        if ("audio/true-hd".equals(h.f.n)) {
                            l = bwv.d * 16;
                        }
                        else {
                            l = bwv.d + 30;
                        }
                        final ayg b3 = h.f.b();
                        b3.l = l;
                        int b4;
                        if ((b4 = h.b) == 2) {
                            if (n4 > 0L) {
                                final int a3 = bwv.a;
                                if (a3 > 1) {
                                    b3.r = a3 / (n4 / 1000000.0f);
                                }
                            }
                            b4 = 2;
                        }
                        final int b5 = bwq.b;
                        if (b4 == 1 && btu.a()) {
                            b3.A = btu.a;
                            b3.B = btu.b;
                        }
                        final int b6 = h.b;
                        Metadata metadata3;
                        if (this.g.isEmpty()) {
                            metadata3 = null;
                        }
                        else {
                            metadata3 = new Metadata(this.g);
                        }
                        final Metadata metadata4 = new Metadata(new Metadata$Entry[0]);
                        Metadata d2;
                        if (b6 == 1) {
                            d2 = metadata4;
                            if (metadata != null) {
                                d2 = metadata;
                            }
                        }
                        else {
                            d2 = metadata4;
                            if (b6 == 2) {
                                d2 = metadata4;
                                if (b2 != null) {
                                    int n5 = 0;
                                    while (true) {
                                        d2 = metadata4;
                                        if (n5 >= b2.a()) {
                                            break;
                                        }
                                        final Metadata$Entry b7 = b2.b(n5);
                                        if (b7 instanceof MdtaMetadataEntry) {
                                            final MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry)b7;
                                            if ("com.android.capture.fps".equals(mdtaMetadataEntry.a)) {
                                                d2 = new Metadata(new Metadata$Entry[] { (Metadata$Entry)mdtaMetadataEntry });
                                                break;
                                            }
                                        }
                                        ++n5;
                                    }
                                }
                            }
                        }
                        for (int i = 0; i < 2; ++i) {
                            d2 = d2.d((new Metadata[] { metadata2, metadata3 })[i]);
                        }
                        if (d2.a() > 0) {
                            b3.i = d2;
                        }
                        ((bug)adfd.d).b(b3.a());
                        int size2;
                        if (h.b == 2) {
                            if ((size2 = r) == -1) {
                                size2 = list.size();
                            }
                        }
                        else {
                            size2 = r;
                        }
                        list.add(adfd);
                        r = size2;
                    }
                    ++n2;
                }
                this.r = r;
                this.s = max;
                final adfd[] u = (adfd[])list.toArray(new adfd[0]);
                this.u = u;
                final int length = u.length;
                final long[][] q = new long[length][];
                final int[] array = new int[length];
                final long[] array2 = new long[length];
                final boolean[] array3 = new boolean[length];
                for (int j = 0; j < u.length; ++j) {
                    q[j] = new long[((bwv)u[j].c).a];
                    array2[j] = ((bwv)u[j].c).e[0];
                }
                int k = 0;
                long n6 = n3;
                while (k < u.length) {
                    long n7 = Long.MAX_VALUE;
                    int n8 = 0;
                    int n9 = -1;
                    while (n8 < u.length) {
                        long n10 = n7;
                        int n11 = n9;
                        if (!array3[n8]) {
                            final long n12 = array2[n8];
                            n10 = n7;
                            n11 = n9;
                            if (n12 <= n7) {
                                n11 = n8;
                                n10 = n12;
                            }
                        }
                        ++n8;
                        n7 = n10;
                        n9 = n11;
                    }
                    int n13 = array[n9];
                    final long[] array4 = q[n9];
                    array4[n13] = n6;
                    final bwv bwv2 = (bwv)u[n9].c;
                    n6 += bwv2.c[n13];
                    ++n13;
                    if ((array[n9] = n13) < array4.length) {
                        array2[n9] = bwv2.e[n13];
                    }
                    else {
                        array3[n9] = true;
                        ++k;
                    }
                }
                this.q = q;
                this.a.r();
                this.a.x((bud)this);
                this.f.clear();
                this.h = 2;
            }
            else {
                if (this.f.isEmpty()) {
                    continue;
                }
                this.f.peek().c(bwc);
            }
        }
        if (this.h != 2) {
            this.l();
        }
    }
    
    public final long a() {
        return this.s;
    }
    
    public final bub b(long n) {
        final adfd[] u = this.u;
        bub bub;
        if (u.length == 0) {
            final bue a = bue.a;
            bub = new bub(a, a);
        }
        else {
            final int r = this.r;
            final long n2 = -1L;
            long n3;
            long n6;
            long n7;
            if (r != -1) {
                final bwv bwv = (bwv)u[r].c;
                final int j = j(bwv, n);
                if (j == -1) {
                    final bue a2 = bue.a;
                    bub = new bub(a2, a2);
                    return bub;
                }
                n3 = bwv.e[j];
                final long n4 = bwv.b[j];
                long n5 = 0L;
                Label_0179: {
                    if (n3 < n && j < bwv.a - 1) {
                        final int b = bwv.b(n);
                        if (b != -1 && b != j) {
                            n5 = bwv.e[b];
                            n = bwv.b[b];
                            break Label_0179;
                        }
                    }
                    n5 = -9223372036854775807L;
                    n = n2;
                }
                n6 = n5;
                n7 = n4;
            }
            else {
                n7 = Long.MAX_VALUE;
                final long n8 = -9223372036854775807L;
                n3 = n;
                n = n2;
                n6 = n8;
            }
            int n9 = 0;
            while (true) {
                final adfd[] u2 = this.u;
                if (n9 >= u2.length) {
                    break;
                }
                long n10 = n;
                long k = n7;
                if (n9 != this.r) {
                    final bwv bwv2 = (bwv)u2[n9].c;
                    k = k(bwv2, n3, n7);
                    long i = n;
                    if (n6 != -9223372036854775807L) {
                        i = k(bwv2, n6, n);
                    }
                    n10 = i;
                }
                ++n9;
                n = n10;
                n7 = k;
            }
            final bue bue = new bue(n3, n7);
            if (n6 == -9223372036854775807L) {
                bub = new bub(bue, bue);
            }
            else {
                bub = new bub(bue, new bue(n6, n));
            }
        }
        return bub;
    }
    
    public final boolean c() {
        return true;
    }
    
    public final void d(final btp a) {
        this.a = a;
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long n2) {
        this.f.clear();
        int i = 0;
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (n == 0L) {
            this.l();
            return;
        }
        for (adfd[] u = this.u; i < u.length; ++i) {
            final adfd adfd = u[i];
            final bwv bwv = (bwv)adfd.c;
            int a;
            if ((a = bwv.a(n2)) == -1) {
                a = bwv.b(n2);
            }
            adfd.a = a;
            final Object e = adfd.e;
            if (e != null) {
                ((lzv)e).c();
            }
        }
    }
    
    public final boolean g(final btn btn) {
        return bwt.a(btn, false);
    }
    
    public final int h(final btn btn, final pbg pbg) {
        while (true) {
            final int h = this.h;
            final int n = -1;
            if (h != 0) {
                if (h != 1) {
                    final long f = btn.f();
                    int m;
                    if ((m = this.m) == -1) {
                        long n2 = Long.MAX_VALUE;
                        long n4;
                        long n3 = n4 = Long.MAX_VALUE;
                        int n5 = 0;
                        int n6 = 1;
                        int n7 = -1;
                        int n8 = -1;
                        int n9 = 1;
                        while (true) {
                            final adfd[] u = this.u;
                            if (n5 >= u.length) {
                                break;
                            }
                            final adfd adfd = u[n5];
                            final int a = adfd.a;
                            final bwv bwv = (bwv)adfd.c;
                            long n10;
                            long n11;
                            long n12;
                            int n13;
                            int n14;
                            if (a == bwv.a) {
                                n10 = n2;
                                n11 = n3;
                                n12 = n4;
                                n13 = n8;
                                n14 = n9;
                            }
                            else {
                                final long n15 = bwv.b[a];
                                final long n16 = ((long[][])baz.L(this.q))[n5][a];
                                final long n17 = n15 - f;
                                int n18;
                                if (n17 >= 0L && n17 < 262144L) {
                                    n18 = 0;
                                }
                                else {
                                    n18 = 1;
                                }
                                Label_0246: {
                                    Label_0228: {
                                        if (n18 == 0) {
                                            if (n9 != 0) {
                                                break Label_0228;
                                            }
                                            n9 = 0;
                                        }
                                        if (n18 != n9 || n17 >= n4) {
                                            break Label_0246;
                                        }
                                    }
                                    n9 = n18;
                                    n8 = n5;
                                    n4 = n17;
                                    n3 = n16;
                                }
                                n10 = n2;
                                n11 = n3;
                                n12 = n4;
                                n13 = n8;
                                n14 = n9;
                                if (n16 < n2) {
                                    n7 = n5;
                                    n14 = n9;
                                    n13 = n8;
                                    n12 = n4;
                                    n11 = n3;
                                    n6 = n18;
                                    n10 = n16;
                                }
                            }
                            ++n5;
                            n2 = n10;
                            n3 = n11;
                            n4 = n12;
                            n8 = n13;
                            n9 = n14;
                        }
                        int i;
                        if (n2 != Long.MAX_VALUE && n6 != 0 && n3 >= n2 + 10485760L) {
                            i = n7;
                        }
                        else {
                            i = n8;
                        }
                        this.m = i;
                        m = i;
                        if (i == -1) {
                            return n;
                        }
                    }
                    final adfd adfd2 = this.u[m];
                    final Object d = adfd2.d;
                    final int a2 = adfd2.a;
                    final bwv bwv2 = (bwv)adfd2.c;
                    final long a3 = bwv2.b[a2];
                    final int n20 = bwv2.c[a2];
                    final Object e = adfd2.e;
                    final long n21 = a3 - f + this.n;
                    int n19;
                    if (n21 >= 0L && n21 < 262144L) {
                        long n22 = n21;
                        int n23 = n20;
                        if (((mah)adfd2.b).g == 1) {
                            n22 = n21 + 8L;
                            n23 = n20 - 8;
                        }
                        btn.m((int)n22);
                        final mah mah = (mah)adfd2.b;
                        final int j = mah.j;
                        int n25;
                        if (j != 0) {
                            final byte[] a4 = this.c.a;
                            a4[0] = 0;
                            a4[2] = (a4[1] = 0);
                            final int n24 = 4 - j;
                            while (true) {
                                n25 = n23;
                                if (this.o >= n23) {
                                    break;
                                }
                                final int p2 = this.p;
                                if (p2 == 0) {
                                    btn.k(a4, n24, j);
                                    this.n += j;
                                    this.c.G(0);
                                    final int d2 = this.c.d();
                                    if (d2 < 0) {
                                        throw azb.a("Invalid NAL length", null);
                                    }
                                    this.p = d2;
                                    this.b.G(0);
                                    ((bug)d).c(this.b, 4);
                                    this.o += 4;
                                    n23 += n24;
                                }
                                else {
                                    final int a5 = ((bug)d).a((ayc)btn, p2, false);
                                    this.n += a5;
                                    this.o += a5;
                                    this.p -= a5;
                                }
                            }
                        }
                        else {
                            int n26;
                            if ("audio/ac4".equals(mah.f.n)) {
                                if (this.o == 0) {
                                    bsw.b(n23, this.d);
                                    ((bug)d).c(this.d, 7);
                                    this.o += 7;
                                }
                                n26 = n23 + 7;
                            }
                            else {
                                n26 = n23;
                                if (e != null) {
                                    ((lzv)e).e(btn);
                                    n26 = n23;
                                }
                            }
                            while (true) {
                                final int o = this.o;
                                if (o >= (n25 = n26)) {
                                    break;
                                }
                                final int a6 = ((bug)d).a((ayc)btn, n26 - o, false);
                                this.n += a6;
                                this.o += a6;
                                this.p -= a6;
                            }
                        }
                        final bwv bwv3 = (bwv)adfd2.c;
                        final long n27 = bwv3.e[a2];
                        final int n28 = bwv3.f[a2];
                        if (e != null) {
                            final lzv lzv = (lzv)e;
                            lzv.d((bug)d, n27, n28, n25, 0, (buf)null);
                            if (a2 + 1 == ((bwv)adfd2.c).a) {
                                lzv.b((bug)d, (buf)null);
                            }
                        }
                        else {
                            ((bug)d).e(n27, n28, n25, 0, (buf)null);
                        }
                        ++adfd2.a;
                        this.m = -1;
                        this.n = 0;
                        this.o = 0;
                        this.p = 0;
                        n19 = 0;
                    }
                    else {
                        pbg.a = a3;
                        n19 = 1;
                    }
                    return n19;
                }
                final long n29 = this.j - this.k;
                final long f2 = btn.f();
                final bat l = this.l;
                boolean b = false;
                Label_1215: {
                    if (l != null) {
                        btn.k(l.a, this.k, (int)n29);
                        if (this.i == 1718909296) {
                            l.G(8);
                            int t = i(l.d());
                            Label_1130: {
                                if (t == 0) {
                                    l.H(4);
                                    while (l.a() > 0) {
                                        t = i(l.d());
                                        if (t != 0) {
                                            break Label_1130;
                                        }
                                    }
                                    t = 0;
                                }
                            }
                            this.t = t;
                        }
                        else if (!this.f.isEmpty()) {
                            this.f.peek().d(new bwd(this.i, l));
                        }
                    }
                    else {
                        if (n29 >= 262144L) {
                            pbg.a = btn.f() + n29;
                            b = true;
                            break Label_1215;
                        }
                        btn.m((int)n29);
                    }
                    b = false;
                }
                this.m(f2 + n29);
                if (b && this.h != 2) {
                    return 1;
                }
                continue;
            }
            else {
                if (this.k == 0) {
                    if (!btn.p(this.e.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    this.e.G(0);
                    this.j = this.e.q();
                    this.i = this.e.d();
                }
                final long k = this.j;
                if (k == 1L) {
                    btn.k(this.e.a, 8, 8);
                    this.k += 8;
                    this.j = this.e.r();
                }
                else if (k == 0L) {
                    long n30;
                    if ((n30 = btn.d()) == -1L) {
                        final bwc bwc = this.f.peek();
                        if (bwc != null) {
                            n30 = bwc.a;
                        }
                        else {
                            n30 = -1L;
                        }
                    }
                    if (n30 != -1L) {
                        this.j = n30 - btn.f() + this.k;
                    }
                }
                final long j2 = this.j;
                final int k2 = this.k;
                if (j2 < k2) {
                    throw azb.d("Atom size less than header length (unsupported).");
                }
                final int i2 = this.i;
                if (i2 != 1836019574 && i2 != 1953653099 && i2 != 1835297121 && i2 != 1835626086 && i2 != 1937007212 && i2 != 1701082227 && i2 != 1835365473) {
                    if (i2 != 1835296868 && i2 != 1836476516 && i2 != 1751411826 && i2 != 1937011556 && i2 != 1937011827 && i2 != 1937011571 && i2 != 1668576371 && i2 != 1701606260 && i2 != 1937011555 && i2 != 1937011578 && i2 != 1937013298 && i2 != 1937007471 && i2 != 1668232756 && i2 != 1953196132 && i2 != 1718909296 && i2 != 1969517665 && i2 != 1801812339 && i2 != 1768715124) {
                        btn.f();
                        this.l = null;
                        this.h = 1;
                    }
                    else {
                        bad.f(k2 == 8);
                        bad.f(this.j <= 2147483647L);
                        final bat l2 = new bat((int)this.j);
                        System.arraycopy(this.e.a, 0, l2.a, 0, 8);
                        this.l = l2;
                        this.h = 1;
                    }
                }
                else {
                    final long f3 = btn.f();
                    final long j3 = this.j;
                    final long n31 = this.k;
                    if (j3 != n31 && this.i == 1835365473) {
                        this.d.C(8);
                        btn.j(this.d.a, 0, 8);
                        bwl.c(this.d);
                        btn.m(this.d.b);
                        btn.l();
                    }
                    final long n32 = f3 + j3 - n31;
                    this.f.push(new bwc(this.i, n32));
                    if (this.j == this.k) {
                        this.m(n32);
                    }
                    else {
                        this.l();
                    }
                }
            }
        }
    }
}
