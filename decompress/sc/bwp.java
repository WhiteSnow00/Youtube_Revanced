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

public final class bwp implements btj, bua
{
    public btm a;
    private final bas b;
    private final bas c;
    private final bas d;
    private final bas e;
    private final ArrayDeque f;
    private final List g;
    private int h;
    private int i;
    private long j;
    private int k;
    private bas l;
    private int m;
    private int n;
    private int o;
    private int p;
    private long[][] q;
    private int r;
    private long s;
    private int t;
    private addr[] u;
    
    public bwp() {
        this(null);
    }
    
    public bwp(final byte[] array) {
        this.h = 0;
        new ArrayList();
        this.g = new ArrayList();
        this.e = new bas(16);
        this.f = new ArrayDeque();
        this.b = new bas(btx.a);
        this.c = new bas(4);
        this.d = new bas();
        this.m = -1;
        this.a = btm.t;
        this.u = new addr[0];
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
    
    private static int j(final bws bws, final long n) {
        final int a = bws.a(n);
        if (a == -1) {
            return bws.b(n);
        }
        return a;
    }
    
    private static long k(final bws bws, final long n, final long n2) {
        final int j = j(bws, n);
        if (j == -1) {
            return n2;
        }
        return Math.min(bws.b[j], n2);
    }
    
    private final void l() {
        this.h = 0;
        this.k = 0;
    }
    
    private final void m(final long n) {
        while (!this.f.isEmpty() && this.f.peek().a == n) {
            final bvz bvz = this.f.pop();
            if (bvz.d == 1836019574) {
                final ArrayList list = new ArrayList();
                final int t = this.t;
                final btr btr = new btr();
                final bwa b = bvz.b(1969517665);
                Metadata metadata;
                Metadata metadata2;
                if (b != null) {
                    final Pair a = bwi.a(b);
                    metadata = (Metadata)a.first;
                    metadata2 = (Metadata)a.second;
                    if (metadata != null) {
                        btr.b(metadata);
                    }
                }
                else {
                    metadata2 = null;
                    metadata = null;
                }
                final bvz a2 = bvz.a(1835365473);
                Metadata b2;
                if (a2 != null) {
                    b2 = bwi.b(a2);
                }
                else {
                    b2 = null;
                }
                final List d = bwi.d(bvz, btr, -9223372036854775807L, (DrmInitData)null, t == 1, (aezf)bwo.a);
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
                    final bws bws = d.get(n2);
                    if (bws.a != 0) {
                        final lzt h = bws.h;
                        long n4 = h.e;
                        if (n4 == -9223372036854775807L) {
                            n4 = bws.g;
                        }
                        max = Math.max(max, n4);
                        final addr addr = new addr(h, bws, this.a.q(n2, h.b), null);
                        int l;
                        if ("audio/true-hd".equals(h.f.n)) {
                            l = bws.d * 16;
                        }
                        else {
                            l = bws.d + 30;
                        }
                        final ayf b3 = h.f.b();
                        b3.l = l;
                        int b4;
                        if ((b4 = h.b) == 2) {
                            if (n4 > 0L) {
                                final int a3 = bws.a;
                                if (a3 > 1) {
                                    b3.r = a3 / (n4 / 1000000.0f);
                                }
                            }
                            b4 = 2;
                        }
                        final int b5 = bwn.b;
                        if (b4 == 1 && btr.a()) {
                            b3.A = btr.a;
                            b3.B = btr.b;
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
                        ((bud)addr.d).b(b3.a());
                        int size2;
                        if (h.b == 2) {
                            if ((size2 = r) == -1) {
                                size2 = list.size();
                            }
                        }
                        else {
                            size2 = r;
                        }
                        list.add(addr);
                        r = size2;
                    }
                    ++n2;
                }
                this.r = r;
                this.s = max;
                final addr[] u = (addr[])list.toArray(new addr[0]);
                this.u = u;
                final int length = u.length;
                final long[][] q = new long[length][];
                final int[] array = new int[length];
                final long[] array2 = new long[length];
                final boolean[] array3 = new boolean[length];
                for (int j = 0; j < u.length; ++j) {
                    q[j] = new long[((bws)u[j].c).a];
                    array2[j] = ((bws)u[j].c).e[0];
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
                    final bws bws2 = (bws)u[n9].c;
                    n6 += bws2.c[n13];
                    ++n13;
                    if ((array[n9] = n13) < array4.length) {
                        array2[n9] = bws2.e[n13];
                    }
                    else {
                        array3[n9] = true;
                        ++k;
                    }
                }
                this.q = q;
                this.a.r();
                this.a.x((bua)this);
                this.f.clear();
                this.h = 2;
            }
            else {
                if (this.f.isEmpty()) {
                    continue;
                }
                this.f.peek().c(bvz);
            }
        }
        if (this.h != 2) {
            this.l();
        }
    }
    
    public final long a() {
        return this.s;
    }
    
    public final bty b(long n) {
        final addr[] u = this.u;
        bty bty;
        if (u.length == 0) {
            final bub a = bub.a;
            bty = new bty(a, a);
        }
        else {
            final int r = this.r;
            final long n2 = -1L;
            long n3;
            long n6;
            long n7;
            if (r != -1) {
                final bws bws = (bws)u[r].c;
                final int j = j(bws, n);
                if (j == -1) {
                    final bub a2 = bub.a;
                    bty = new bty(a2, a2);
                    return bty;
                }
                n3 = bws.e[j];
                final long n4 = bws.b[j];
                long n5 = 0L;
                Label_0180: {
                    if (n3 < n && j < bws.a - 1) {
                        final int b = bws.b(n);
                        if (b != -1 && b != j) {
                            n5 = bws.e[b];
                            n = bws.b[b];
                            break Label_0180;
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
                final addr[] u2 = this.u;
                if (n9 >= u2.length) {
                    break;
                }
                long n10 = n;
                long k = n7;
                if (n9 != this.r) {
                    final bws bws2 = (bws)u2[n9].c;
                    k = k(bws2, n3, n7);
                    long i = n;
                    if (n6 != -9223372036854775807L) {
                        i = k(bws2, n6, n);
                    }
                    n10 = i;
                }
                ++n9;
                n = n10;
                n7 = k;
            }
            final bub bub = new bub(n3, n7);
            if (n6 == -9223372036854775807L) {
                bty = new bty(bub, bub);
            }
            else {
                bty = new bty(bub, new bub(n6, n));
            }
        }
        return bty;
    }
    
    public final boolean c() {
        return true;
    }
    
    public final void d(final btm a) {
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
        for (addr[] u = this.u; i < u.length; ++i) {
            final addr addr = u[i];
            final bws bws = (bws)addr.c;
            int a;
            if ((a = bws.a(n2)) == -1) {
                a = bws.b(n2);
            }
            addr.a = a;
            final Object e = addr.e;
            if (e != null) {
                ((lzh)e).c();
            }
        }
    }
    
    public final boolean g(final btk btk) {
        return bwq.a(btk, false);
    }
    
    public final int h(final btk btk, final paq paq) {
        while (true) {
            final int h = this.h;
            final int n = -1;
            if (h != 0) {
                if (h != 1) {
                    final long f = btk.f();
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
                            final addr[] u = this.u;
                            if (n5 >= u.length) {
                                break;
                            }
                            final addr addr = u[n5];
                            final int a = addr.a;
                            final bws bws = (bws)addr.c;
                            long n10;
                            long n11;
                            long n12;
                            int n13;
                            int n14;
                            if (a == bws.a) {
                                n10 = n2;
                                n11 = n3;
                                n12 = n4;
                                n13 = n8;
                                n14 = n9;
                            }
                            else {
                                final long n15 = bws.b[a];
                                final long n16 = ((long[][])bax.L((Object)this.q))[n5][a];
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
                    final addr addr2 = this.u[m];
                    final Object d = addr2.d;
                    final int a2 = addr2.a;
                    final bws bws2 = (bws)addr2.c;
                    final long a3 = bws2.b[a2];
                    final int n20 = bws2.c[a2];
                    final Object e = addr2.e;
                    final long n21 = a3 - f + this.n;
                    int n19;
                    if (n21 >= 0L && n21 < 262144L) {
                        long n22 = n21;
                        int n23 = n20;
                        if (((lzt)addr2.b).g == 1) {
                            n22 = n21 + 8L;
                            n23 = n20 - 8;
                        }
                        btk.m((int)n22);
                        final lzt lzt = (lzt)addr2.b;
                        final int j = lzt.j;
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
                                    btk.k(a4, n24, j);
                                    this.n += j;
                                    this.c.G(0);
                                    final int d2 = this.c.d();
                                    if (d2 < 0) {
                                        throw aza.a("Invalid NAL length", (Throwable)null);
                                    }
                                    this.p = d2;
                                    this.b.G(0);
                                    ((bud)d).c(this.b, 4);
                                    this.o += 4;
                                    n23 += n24;
                                }
                                else {
                                    final int a5 = ((bud)d).a((ayb)btk, p2, false);
                                    this.n += a5;
                                    this.o += a5;
                                    this.p -= a5;
                                }
                            }
                        }
                        else {
                            int n26;
                            if ("audio/ac4".equals(lzt.f.n)) {
                                if (this.o == 0) {
                                    bst.b(n23, this.d);
                                    ((bud)d).c(this.d, 7);
                                    this.o += 7;
                                }
                                n26 = n23 + 7;
                            }
                            else {
                                n26 = n23;
                                if (e != null) {
                                    ((lzh)e).e(btk);
                                    n26 = n23;
                                }
                            }
                            while (true) {
                                final int o = this.o;
                                if (o >= (n25 = n26)) {
                                    break;
                                }
                                final int a6 = ((bud)d).a((ayb)btk, n26 - o, false);
                                this.n += a6;
                                this.o += a6;
                                this.p -= a6;
                            }
                        }
                        final bws bws3 = (bws)addr2.c;
                        final long n27 = bws3.e[a2];
                        final int n28 = bws3.f[a2];
                        if (e != null) {
                            final lzh lzh = (lzh)e;
                            lzh.d((bud)d, n27, n28, n25, 0, (buc)null);
                            if (a2 + 1 == ((bws)addr2.c).a) {
                                lzh.b((bud)d, (buc)null);
                            }
                        }
                        else {
                            ((bud)d).e(n27, n28, n25, 0, (buc)null);
                        }
                        ++addr2.a;
                        this.m = -1;
                        this.n = 0;
                        this.o = 0;
                        this.p = 0;
                        n19 = 0;
                    }
                    else {
                        paq.a = a3;
                        n19 = 1;
                    }
                    return n19;
                }
                final long n29 = this.j - this.k;
                final long f2 = btk.f();
                final bas l = this.l;
                boolean b = false;
                Label_1215: {
                    if (l != null) {
                        btk.k(l.a, this.k, (int)n29);
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
                            this.f.peek().d(new bwa(this.i, l));
                        }
                    }
                    else {
                        if (n29 >= 262144L) {
                            paq.a = btk.f() + n29;
                            b = true;
                            break Label_1215;
                        }
                        btk.m((int)n29);
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
                    if (!btk.p(this.e.a, 0, 8, true)) {
                        return -1;
                    }
                    this.k = 8;
                    this.e.G(0);
                    this.j = this.e.q();
                    this.i = this.e.d();
                }
                final long k = this.j;
                if (k == 1L) {
                    btk.k(this.e.a, 8, 8);
                    this.k += 8;
                    this.j = this.e.r();
                }
                else if (k == 0L) {
                    long n30;
                    if ((n30 = btk.d()) == -1L) {
                        final bvz bvz = this.f.peek();
                        if (bvz != null) {
                            n30 = bvz.a;
                        }
                        else {
                            n30 = -1L;
                        }
                    }
                    if (n30 != -1L) {
                        this.j = n30 - btk.f() + this.k;
                    }
                }
                final long j2 = this.j;
                final int k2 = this.k;
                if (j2 < k2) {
                    throw aza.d("Atom size less than header length (unsupported).");
                }
                final int i2 = this.i;
                if (i2 != 1836019574 && i2 != 1953653099 && i2 != 1835297121 && i2 != 1835626086 && i2 != 1937007212 && i2 != 1701082227 && i2 != 1835365473) {
                    if (i2 != 1835296868 && i2 != 1836476516 && i2 != 1751411826 && i2 != 1937011556 && i2 != 1937011827 && i2 != 1937011571 && i2 != 1668576371 && i2 != 1701606260 && i2 != 1937011555 && i2 != 1937011578 && i2 != 1937013298 && i2 != 1937007471 && i2 != 1668232756 && i2 != 1953196132 && i2 != 1718909296 && i2 != 1969517665 && i2 != 1801812339 && i2 != 1768715124) {
                        btk.f();
                        this.l = null;
                        this.h = 1;
                    }
                    else {
                        dk.h(k2 == 8);
                        dk.h(this.j <= 2147483647L);
                        final bas l2 = new bas((int)this.j);
                        System.arraycopy(this.e.a, 0, l2.a, 0, 8);
                        this.l = l2;
                        this.h = 1;
                    }
                }
                else {
                    final long f3 = btk.f();
                    final long j3 = this.j;
                    final long n31 = this.k;
                    if (j3 != n31 && this.i == 1835365473) {
                        this.d.C(8);
                        btk.j(this.d.a, 0, 8);
                        bwi.c(this.d);
                        btk.m(this.d.b);
                        btk.l();
                    }
                    final long n32 = f3 + j3 - n31;
                    this.f.push(new bvz(this.i, n32));
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
