import androidx.media3.extractor.metadata.emsg.EventMessage;
import android.util.Pair;
import java.util.Arrays;
import java.util.UUID;
import androidx.media3.common.DrmInitData$SchemeData;
import java.util.ArrayList;
import androidx.media3.common.DrmInitData;
import java.util.Collections;
import java.util.ArrayDeque;
import android.util.SparseArray;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class bwm implements btj
{
    private static final byte[] a;
    private static final ayg b;
    private int A;
    private int B;
    private boolean C;
    private btm D;
    private bud[] E;
    private bud[] F;
    private boolean G;
    private final dml H;
    private final int c;
    private final List d;
    private final SparseArray e;
    private final bas f;
    private final bas g;
    private final bas h;
    private final byte[] i;
    private final bas j;
    private final bas k;
    private final ArrayDeque l;
    private final ArrayDeque m;
    private final bud n;
    private int o;
    private int p;
    private long q;
    private int r;
    private bas s;
    private long t;
    private int u;
    private long v;
    private long w;
    private long x;
    private bwl y;
    private int z;
    
    static {
        a = new byte[] { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
        final ayf ayf = new ayf();
        ayf.k = "application/x-emsg";
        b = ayf.a();
    }
    
    public bwm() {
        this(null);
    }
    
    public bwm(final int c, final List list, final bud n) {
        this.c = c;
        this.d = Collections.unmodifiableList((List<?>)list);
        this.n = n;
        this.H = new dml((byte[])null, (byte[])null);
        this.k = new bas(16);
        this.f = new bas(btx.a);
        this.g = new bas(5);
        this.h = new bas();
        final byte[] i = new byte[16];
        this.i = i;
        this.j = new bas(i);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.e = new SparseArray();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.D = btm.t;
        this.E = new bud[0];
        this.F = new bud[0];
    }
    
    public bwm(final byte[] array) {
        this(0, Collections.emptyList(), null);
    }
    
    private static DrmInitData b(final List list) {
        final int size = list.size();
        int i = 0;
        List<DrmInitData$SchemeData> list2 = null;
        while (i < size) {
            final bwa bwa = list.get(i);
            List<DrmInitData$SchemeData> list3 = list2;
            if (bwa.d == 1886614376) {
                if ((list3 = list2) == null) {
                    list3 = new ArrayList<DrmInitData$SchemeData>();
                }
                final byte[] a = bwa.a.a;
                final UUID b = bym.b(a);
                if (b == null) {
                    bap.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList<DrmInitData$SchemeData>)list3).add(new DrmInitData$SchemeData(b, "video/mp4", a));
                }
            }
            ++i;
            list2 = list3;
        }
        if (list2 == null) {
            return null;
        }
        return new DrmInitData((List)list2);
    }
    
    private final void c() {
        this.o = 0;
        this.r = 0;
    }
    
    private static void i(final bas bas, int n, final bwr bwr) {
        bas.G(n + 8);
        n = bwb.e(bas.d());
        if ((n & 0x1) != 0x0) {
            throw aza.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        final boolean b = (n & 0x2) != 0x0;
        final int l = bas.l();
        if (l == 0) {
            Arrays.fill(bwr.l, 0, bwr.e, false);
            return;
        }
        n = bwr.e;
        if (l == n) {
            Arrays.fill(bwr.l, 0, l, b);
            bwr.b(bas.a());
            final bas m = bwr.m;
            bas.B(m.a, 0, m.c);
            bwr.m.G(0);
            bwr.n = false;
            return;
        }
        final StringBuilder sb = new StringBuilder("Senc sample count ");
        sb.append(l);
        sb.append(" is different from fragment sample count");
        sb.append(n);
        throw aza.a(sb.toString(), (Throwable)null);
    }
    
    private final void j(final long n) {
        bwm bwm = this;
        while (!bwm.l.isEmpty() && ((bvz)bwm.l.peek()).a == n) {
            final bvz bvz = bwm.l.pop();
            final int d = bvz.d;
            if (d == 1836019574) {
                dk.i(true, (Object)"Unexpected moov box.");
                final DrmInitData b = b(bvz.b);
                final bvz a = bvz.a(1836475768);
                dk.d((Object)a);
                final SparseArray sparseArray = new SparseArray();
                final int size = a.b.size();
                long n2 = -9223372036854775807L;
                for (int i = 0; i < size; ++i) {
                    final bwa bwa = a.b.get(i);
                    final int d2 = bwa.d;
                    if (d2 == 1953654136) {
                        final bas a2 = bwa.a;
                        a2.G(12);
                        final Pair create = Pair.create((Object)a2.d(), (Object)new bwj(a2.d() - 1, a2.d(), a2.d(), a2.d()));
                        sparseArray.put((int)create.first, (Object)create.second);
                    }
                    else if (d2 == 1835362404) {
                        final bas a3 = bwa.a;
                        a3.G(8);
                        if (bwb.f(a3.d()) == 0) {
                            n2 = a3.q();
                        }
                        else {
                            n2 = a3.r();
                        }
                    }
                }
                final List d3 = bwi.d(bvz, new btr(), n2, b, false, (aezf)new bwk(bwm, 0));
                final int size2 = d3.size();
                if (bwm.e.size() == 0) {
                    for (int j = 0; j < size2; ++j) {
                        final bws bws = d3.get(j);
                        final lzt h = bws.h;
                        bwm.e.put(h.a, (Object)new bwl(bwm.D.q(j, h.b), bws, l(sparseArray, h.a)));
                        bwm.w = Math.max(bwm.w, h.e);
                    }
                    bwm.D.r();
                }
                else {
                    dk.h(bwm.e.size() == size2);
                    for (int k = 0; k < size2; ++k) {
                        final bws bws2 = d3.get(k);
                        final lzt h2 = bws2.h;
                        ((bwl)bwm.e.get(h2.a)).c(bws2, l(sparseArray, h2.a));
                    }
                }
            }
            else if (d == 1836019558) {
                final SparseArray e = bwm.e;
                int c = bwm.c;
                byte[] l = bwm.i;
                int size3 = bvz.c.size();
                int n3 = 0;
                bvz bvz2 = bvz;
                SparseArray sparseArray2 = e;
                while (n3 < size3) {
                    final bvz bvz3 = bvz2.c.get(n3);
                    int n15 = 0;
                    byte[] array5 = null;
                    int n34 = 0;
                    SparseArray sparseArray4 = null;
                    int n35 = 0;
                    Label_2960: {
                        if (bvz3.d == 1953653094) {
                            final bwa b2 = bvz3.b(1952868452);
                            dk.d((Object)b2);
                            final bas a4 = b2.a;
                            a4.G(8);
                            final int e2 = bwb.e(a4.d());
                            bwl bwl = (bwl)sparseArray2.get(a4.d());
                            if (bwl == null) {
                                bwl = null;
                            }
                            else {
                                if ((e2 & 0x1) != 0x0) {
                                    final long r = a4.r();
                                    final bwr b3 = bwl.b;
                                    b3.b = r;
                                    b3.c = r;
                                }
                                final bwj e3 = bwl.e;
                                int a5;
                                if ((e2 & 0x2) != 0x0) {
                                    a5 = a4.d() - 1;
                                }
                                else {
                                    a5 = e3.a;
                                }
                                int n4;
                                if ((e2 & 0x8) != 0x0) {
                                    n4 = a4.d();
                                }
                                else {
                                    n4 = e3.b;
                                }
                                int n5;
                                if ((e2 & 0x10) != 0x0) {
                                    n5 = a4.d();
                                }
                                else {
                                    n5 = e3.c;
                                }
                                int n6;
                                if ((e2 & 0x20) != 0x0) {
                                    n6 = a4.d();
                                }
                                else {
                                    n6 = e3.d;
                                }
                                bwl.b.a = new bwj(a5, n4, n5, n6);
                            }
                            if (bwl != null) {
                                final bwr b4 = bwl.b;
                                final long o = b4.o;
                                final boolean p = b4.p;
                                bwl.d();
                                bwl.j = true;
                                final bwa b5 = bvz3.b(1952867444);
                                if (b5 != null && (c & 0x2) == 0x0) {
                                    final bas a6 = b5.a;
                                    a6.G(8);
                                    long o2;
                                    if (bwb.f(a6.d()) == 1) {
                                        o2 = a6.r();
                                    }
                                    else {
                                        o2 = a6.q();
                                    }
                                    b4.o = o2;
                                    b4.p = true;
                                }
                                else {
                                    b4.o = o;
                                    b4.p = p;
                                }
                                final List b6 = bvz3.b;
                                final int size4 = b6.size();
                                int n7 = 0;
                                int d4 = 0;
                                int e4 = 0;
                                while (n7 < size4) {
                                    final bwa bwa2 = b6.get(n7);
                                    int n8 = d4;
                                    int n9 = e4;
                                    if (bwa2.d == 1953658222) {
                                        final bas a7 = bwa2.a;
                                        a7.G(12);
                                        final int m = a7.l();
                                        n8 = d4;
                                        n9 = e4;
                                        if (m > 0) {
                                            n9 = e4 + m;
                                            n8 = d4 + 1;
                                        }
                                    }
                                    ++n7;
                                    d4 = n8;
                                    e4 = n9;
                                }
                                final SparseArray sparseArray3 = sparseArray2;
                                final int n10 = size3;
                                bwl.h = 0;
                                bwl.g = 0;
                                bwl.f = 0;
                                final bwr b7 = bwl.b;
                                b7.d = d4;
                                b7.e = e4;
                                if (b7.g.length < d4) {
                                    b7.f = new long[d4];
                                    b7.g = new int[d4];
                                }
                                if (b7.h.length < e4) {
                                    final int n11 = e4 * 125 / 100;
                                    b7.h = new int[n11];
                                    b7.i = new long[n11];
                                    b7.j = new boolean[n11];
                                    b7.l = new boolean[n11];
                                }
                                int n12 = 0;
                                int n13 = 0;
                                int n14 = 0;
                                final bvz bvz4 = bvz3;
                                n15 = n3;
                                final bwr bwr = b4;
                                while (true) {
                                    final long n16 = 0L;
                                    if (n12 >= size4) {
                                        break;
                                    }
                                    final bwa bwa3 = b6.get(n12);
                                    if (bwa3.d == 1953658222) {
                                        final bas a8 = bwa3.a;
                                        a8.G(8);
                                        final int e5 = bwb.e(a8.d());
                                        final lzt h3 = bwl.d.h;
                                        final bwr b8 = bwl.b;
                                        final bwj a9 = b8.a;
                                        final int a10 = bax.a;
                                        b8.g[n13] = a8.l();
                                        final long[] f = b8.f;
                                        final long b9 = b8.b;
                                        f[n13] = b9;
                                        if ((e5 & 0x1) != 0x0) {
                                            f[n13] = b9 + a8.d();
                                        }
                                        final boolean b10 = (e5 & 0x4) != 0x0;
                                        int n17 = a9.d;
                                        if (b10) {
                                            n17 = a8.d();
                                        }
                                        final int n18 = e5 & 0x100;
                                        final int n19 = e5 & 0x200;
                                        final int n20 = e5 & 0x400;
                                        final long[] h4 = h3.h;
                                        long n21;
                                        if (h4 != null) {
                                            n21 = n16;
                                            if (h4.length == 1) {
                                                n21 = n16;
                                                if (h4[0] == 0L) {
                                                    n21 = ((long[])bax.L((Object)h3.i))[0];
                                                }
                                            }
                                        }
                                        else {
                                            n21 = n16;
                                        }
                                        final int[] h5 = b8.h;
                                        final long[] i2 = b8.i;
                                        final boolean[] j2 = b8.j;
                                        final boolean b11 = h3.b == 2 && (c & 0x1) != 0x0;
                                        final int n22 = n14 + b8.g[n13];
                                        final long c2 = h3.c;
                                        long o3 = b8.o;
                                        int n23 = n14;
                                        n14 = n22;
                                        final boolean b12 = b10;
                                        while (n23 < n14) {
                                            int n24;
                                            if (n18 != 0) {
                                                n24 = a8.d();
                                            }
                                            else {
                                                n24 = a9.b;
                                            }
                                            k(n24);
                                            int n25;
                                            if (n19 != 0) {
                                                n25 = a8.d();
                                            }
                                            else {
                                                n25 = a9.c;
                                            }
                                            k(n25);
                                            int n26 = 0;
                                            Label_1738: {
                                                if (n20 != 0) {
                                                    n26 = a8.d();
                                                }
                                                else {
                                                    int n27;
                                                    if ((n27 = n23) == 0) {
                                                        if (b12) {
                                                            n26 = n17;
                                                            n23 = 0;
                                                            break Label_1738;
                                                        }
                                                        n27 = 0;
                                                    }
                                                    n26 = a9.d;
                                                    n23 = n27;
                                                }
                                            }
                                            int d5;
                                            if ((e5 & 0x800) != 0x0) {
                                                d5 = a8.d();
                                            }
                                            else {
                                                d5 = 0;
                                            }
                                            final long y = bax.y(d5 + o3 - n21, 1000000L, c2);
                                            i2[n23] = y;
                                            if (!b8.p) {
                                                i2[n23] = y + bwl.d.g;
                                            }
                                            h5[n23] = n25;
                                            boolean b13 = false;
                                            Label_1853: {
                                                if ((n26 >> 16 & 0x1) == 0x0) {
                                                    if (!b11) {
                                                        b13 = true;
                                                        break Label_1853;
                                                    }
                                                    if (n23 == 0) {
                                                        b13 = true;
                                                        n23 = 0;
                                                        break Label_1853;
                                                    }
                                                }
                                                b13 = false;
                                            }
                                            j2[n23] = b13;
                                            o3 += n24;
                                            ++n23;
                                        }
                                        b8.o = o3;
                                        ++n13;
                                    }
                                    ++n12;
                                }
                                final bvz bvz5 = bvz2;
                                final int n28 = c;
                                final byte[] array = l;
                                final lzt h6 = bwl.d.h;
                                final bwj a11 = bwr.a;
                                dk.d((Object)a11);
                                final lzu b14 = h6.b(a11.a);
                                final bwa b15 = bvz4.b(1935763834);
                                if (b15 != null) {
                                    dk.d((Object)b14);
                                    final bas a12 = b15.a;
                                    final int d6 = b14.d;
                                    a12.G(8);
                                    if ((bwb.e(a12.d()) & 0x1) == 0x1) {
                                        a12.H(8);
                                    }
                                    final int i3 = a12.i();
                                    final int l2 = a12.l();
                                    final int e6 = bwr.e;
                                    if (l2 > e6) {
                                        final StringBuilder sb = new StringBuilder("Saiz sample count ");
                                        sb.append(l2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(e6);
                                        throw aza.a(sb.toString(), (Throwable)null);
                                    }
                                    int n30;
                                    if (i3 == 0) {
                                        final boolean[] l3 = bwr.l;
                                        int n29 = 0;
                                        n30 = 0;
                                        while (n29 < l2) {
                                            final int i4 = a12.i();
                                            n30 += i4;
                                            l3[n29] = (i4 > d6);
                                            ++n29;
                                        }
                                    }
                                    else {
                                        final boolean b16 = i3 > d6;
                                        n30 = i3 * l2;
                                        Arrays.fill(bwr.l, 0, l2, b16);
                                    }
                                    Arrays.fill(bwr.l, l2, bwr.e, false);
                                    if (n30 > 0) {
                                        bwr.b(n30);
                                    }
                                }
                                final bwa b17 = bvz4.b(1935763823);
                                if (b17 != null) {
                                    final bas a13 = b17.a;
                                    a13.G(8);
                                    final int d7 = a13.d();
                                    if ((bwb.e(d7) & 0x1) == 0x1) {
                                        a13.H(8);
                                    }
                                    final int l4 = a13.l();
                                    if (l4 != 1) {
                                        final StringBuilder sb2 = new StringBuilder("Unexpected saio entry count: ");
                                        sb2.append(l4);
                                        throw aza.a(sb2.toString(), (Throwable)null);
                                    }
                                    final int f2 = bwb.f(d7);
                                    final long c3 = bwr.c;
                                    long n31;
                                    if (f2 == 0) {
                                        n31 = a13.q();
                                    }
                                    else {
                                        n31 = a13.r();
                                    }
                                    bwr.c = c3 + n31;
                                }
                                final bwa b18 = bvz4.b(1936027235);
                                if (b18 != null) {
                                    i(b18.a, 0, bwr);
                                }
                                String b19;
                                if (b14 != null) {
                                    b19 = b14.b;
                                }
                                else {
                                    b19 = null;
                                }
                                bas bas = null;
                                bas bas2 = null;
                                bas bas3;
                                bas bas4;
                                for (int n32 = 0; n32 < bvz4.b.size(); ++n32, bas = bas3, bas2 = bas4) {
                                    final bwa bwa4 = bvz4.b.get(n32);
                                    final bas a14 = bwa4.a;
                                    final int d8 = bwa4.d;
                                    if (d8 == 1935828848) {
                                        a14.G(12);
                                        bas3 = bas;
                                        bas4 = bas2;
                                        if (a14.d() == 1936025959) {
                                            bas3 = a14;
                                            bas4 = bas2;
                                        }
                                    }
                                    else {
                                        bas3 = bas;
                                        bas4 = bas2;
                                        if (d8 == 1936158820) {
                                            a14.G(12);
                                            bas3 = bas;
                                            bas4 = bas2;
                                            if (a14.d() == 1936025959) {
                                                bas4 = a14;
                                                bas3 = bas;
                                            }
                                        }
                                    }
                                }
                                if (bas != null) {
                                    if (bas2 != null) {
                                        bas.G(8);
                                        final int f3 = bwb.f(bas.d());
                                        bas.H(4);
                                        if (f3 == 1) {
                                            bas.H(4);
                                        }
                                        if (bas.d() != 1) {
                                            throw aza.d("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        bas2.G(8);
                                        final int f4 = bwb.f(bas2.d());
                                        bas2.H(4);
                                        if (f4 == 1) {
                                            if (bas2.q() == 0L) {
                                                throw aza.d("Variable length description in sgpd found (unsupported)");
                                            }
                                        }
                                        else if (f4 >= 2) {
                                            bas2.H(4);
                                        }
                                        if (bas2.q() != 1L) {
                                            throw aza.d("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        bas2.H(1);
                                        final int i5 = bas2.i();
                                        if (bas2.i() == 1) {
                                            final int i6 = bas2.i();
                                            final byte[] array2 = new byte[16];
                                            bas2.B(array2, 0, 16);
                                            byte[] array4;
                                            if (i6 == 0) {
                                                final int i7 = bas2.i();
                                                final byte[] array3 = new byte[i7];
                                                bas2.B(array3, 0, i7);
                                                array4 = array3;
                                            }
                                            else {
                                                array4 = null;
                                            }
                                            bwr.k = true;
                                            bwr.q = new lzu(true, b19, i6, array2, (i5 & 0xF0) >> 4, i5 & 0xF, array4, (byte[])null);
                                        }
                                    }
                                }
                                for (int size5 = bvz4.b.size(), n33 = 0; n33 < size5; ++n33) {
                                    final bwa bwa5 = bvz4.b.get(n33);
                                    if (bwa5.d == 1970628964) {
                                        final bas a15 = bwa5.a;
                                        a15.G(8);
                                        a15.B(array, 0, 16);
                                        if (Arrays.equals(array, bwm.a)) {
                                            i(a15, 16, bwr);
                                        }
                                    }
                                }
                                array5 = array;
                                n34 = n10;
                                sparseArray4 = sparseArray3;
                                bvz2 = bvz5;
                                n35 = n28;
                                break Label_2960;
                            }
                        }
                        final int n36 = c;
                        n34 = size3;
                        n15 = n3;
                        final byte[] array6 = l;
                        n35 = n36;
                        sparseArray4 = sparseArray2;
                        array5 = array6;
                    }
                    final int n37 = n15 + 1;
                    final byte[] array7 = array5;
                    size3 = n34;
                    sparseArray2 = sparseArray4;
                    c = n35;
                    l = array7;
                    n3 = n37;
                }
                final DrmInitData b20 = b(bvz2.b);
                if (b20 != null) {
                    for (int size6 = this.e.size(), n38 = 0; n38 < size6; ++n38) {
                        final bwl bwl2 = (bwl)this.e.valueAt(n38);
                        final lzt h7 = bwl2.d.h;
                        final bwj a16 = bwl2.b.a;
                        final int a17 = bax.a;
                        final lzu b21 = h7.b(a16.a);
                        String b22;
                        if (b21 != null) {
                            b22 = b21.b;
                        }
                        else {
                            b22 = null;
                        }
                        final DrmInitData b23 = b20.b(b22);
                        final ayf b24 = bwl2.d.h.f.b();
                        b24.n = b23;
                        bwl2.a.b(b24.a());
                    }
                }
                bwm = this;
                if (this.v == -9223372036854775807L) {
                    continue;
                }
                for (int size7 = this.e.size(), n39 = 0; n39 < size7; ++n39) {
                    final bwl bwl3 = (bwl)this.e.valueAt(n39);
                    final long v = this.v;
                    int f5 = bwl3.f;
                    while (true) {
                        final bwr b25 = bwl3.b;
                        if (f5 >= b25.e || b25.a(f5) >= v) {
                            break;
                        }
                        if (bwl3.b.j[f5]) {
                            bwl3.i = f5;
                        }
                        ++f5;
                    }
                }
                this.v = -9223372036854775807L;
                bwm = this;
            }
            else {
                final bwm bwm2 = bwm = bwm;
                if (bwm2.l.isEmpty()) {
                    continue;
                }
                ((bvz)bwm2.l.peek()).c(bvz);
                bwm = bwm2;
            }
        }
        this.c();
    }
    
    private static void k(final int n) {
        if (n >= 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Unexpected negative value: ");
        sb.append(n);
        throw aza.a(sb.toString(), (Throwable)null);
    }
    
    private static final bwj l(final SparseArray sparseArray, final int n) {
        if (sparseArray.size() == 1) {
            return (bwj)sparseArray.valueAt(0);
        }
        final bwj bwj = (bwj)sparseArray.get(n);
        dk.d((Object)bwj);
        return bwj;
    }
    
    protected lzt a(final lzt lzt) {
        return lzt;
    }
    
    public final void d(final btm d) {
        this.D = d;
        this.c();
        final bud[] e = new bud[2];
        this.E = e;
        final bud n = this.n;
        final int n2 = 0;
        int n3;
        if (n != null) {
            e[0] = n;
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final int c = this.c;
        int n4 = 100;
        int n5 = n3;
        if ((c & 0x4) != 0x0) {
            e[n3] = this.D.q(100, 5);
            n4 = 101;
            n5 = n3 + 1;
        }
        final bud[] e2 = (bud[])bax.an((Object[])this.E, n5);
        this.E = e2;
        for (int length = e2.length, i = 0; i < length; ++i) {
            e2[i].b(bwm.b);
        }
        this.F = new bud[this.d.size()];
        for (int j = n2; j < this.F.length; ++j, ++n4) {
            final bud q = this.D.q(n4, 3);
            q.b((ayg)this.d.get(j));
            this.F[j] = q;
        }
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long v) {
        for (int size = this.e.size(), i = 0; i < size; ++i) {
            ((bwl)this.e.valueAt(i)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = v;
        this.l.clear();
        this.c();
    }
    
    public final boolean g(final btk btk) {
        return bwq.a(btk, true);
    }
    
    public final int h(final btk btk, final paq paq) {
        btk btk2 = btk;
        bwl y;
        while (true) {
            final int o = this.o;
            if (o != 0) {
                if (o != 1) {
                    long n = Long.MAX_VALUE;
                    if (o != 2) {
                        if ((y = this.y) != null) {
                            break;
                        }
                        final SparseArray e = this.e;
                        final int size = e.size();
                        long n2 = Long.MAX_VALUE;
                        y = null;
                        bwl bwl2;
                        long n3;
                        for (int i = 0; i < size; ++i, y = bwl2, n2 = n3) {
                            final bwl bwl = (bwl)e.valueAt(i);
                            if (!bwl.j) {
                                bwl2 = y;
                                n3 = n2;
                                if (bwl.f == bwl.d.a) {
                                    continue;
                                }
                            }
                            else if (bwl.h == bwl.b.d) {
                                bwl2 = y;
                                n3 = n2;
                                continue;
                            }
                            final long b = bwl.b();
                            bwl2 = y;
                            n3 = n2;
                            if (b < n2) {
                                bwl2 = bwl;
                                n3 = b;
                            }
                        }
                        if (y != null) {
                            int n4;
                            if ((n4 = (int)(y.b() - ((btd)btk2).c)) < 0) {
                                bap.c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                n4 = 0;
                            }
                            btk2.m(n4);
                            this.y = y;
                            break;
                        }
                        final int n5 = (int)(this.t - ((btd)btk2).c);
                        if (n5 < 0) {
                            throw aza.a("Offset to end of mdat was negative.", (Throwable)null);
                        }
                        btk2.m(n5);
                        this.c();
                    }
                    else {
                        final int size2 = this.e.size();
                        bwl bwl3 = null;
                        long n6;
                        bwl bwl4;
                        for (int j = 0; j < size2; ++j, n = n6, bwl3 = bwl4) {
                            final bwr b2 = ((bwl)this.e.valueAt(j)).b;
                            n6 = n;
                            bwl4 = bwl3;
                            if (b2.n) {
                                final long c = b2.c;
                                n6 = n;
                                bwl4 = bwl3;
                                if (c < n) {
                                    bwl4 = (bwl)this.e.valueAt(j);
                                    n6 = c;
                                }
                            }
                        }
                        if (bwl3 == null) {
                            this.o = 3;
                        }
                        else {
                            final int n7 = (int)(n - ((btd)btk2).c);
                            if (n7 < 0) {
                                throw aza.a("Offset to encryption data was negative.", (Throwable)null);
                            }
                            btk2.m(n7);
                            final bwr b3 = bwl3.b;
                            final bas m = b3.m;
                            btk2.k(m.a, 0, m.c);
                            b3.m.G(0);
                            b3.n = false;
                        }
                    }
                }
                else {
                    final int n8 = (int)this.q - this.r;
                    final bas s = this.s;
                    btk btk3;
                    if (s != null) {
                        btk2.k(s.a, 8, n8);
                        final bwa bwa = new bwa(this.p, s);
                        final long c2 = ((btd)btk2).c;
                        if (!this.l.isEmpty()) {
                            this.l.peek().d(bwa);
                            btk3 = btk2;
                        }
                        else {
                            final int d = bwa.d;
                            Label_2353: {
                                if (d == 1936286840) {
                                    final bas a = bwa.a;
                                    a.G(8);
                                    final int f = bwb.f(a.d());
                                    a.H(4);
                                    final long q = a.q();
                                    long n9;
                                    long n10;
                                    if (f == 0) {
                                        n9 = a.q();
                                        n10 = a.q();
                                    }
                                    else {
                                        n9 = a.r();
                                        n10 = a.r();
                                    }
                                    final long n11 = c2 + n10;
                                    final long y2 = bax.y(n9, 1000000L, q);
                                    a.H(2);
                                    final int k = a.m();
                                    final int[] array = new int[k];
                                    final long[] array2 = new long[k];
                                    final long[] array3 = new long[k];
                                    final long[] array4 = new long[k];
                                    long y3 = y2;
                                    int l = 0;
                                    long n12 = n9;
                                    long n13 = n11;
                                    while (l < k) {
                                        final int d2 = a.d();
                                        if ((d2 & Integer.MIN_VALUE) != 0x0) {
                                            throw aza.a("Unhandled indirect reference", (Throwable)null);
                                        }
                                        final long q2 = a.q();
                                        array[l] = (d2 & Integer.MAX_VALUE);
                                        array2[l] = n13;
                                        array4[l] = y3;
                                        n12 += q2;
                                        y3 = bax.y(n12, 1000000L, q);
                                        array3[l] = y3 - array4[l];
                                        a.H(4);
                                        n13 += array[l];
                                        ++l;
                                    }
                                    final Pair create = Pair.create((Object)y2, (Object)new btb(array, array2, array3, array4));
                                    this.x = (long)create.first;
                                    this.D.x((bua)create.second);
                                    this.G = true;
                                }
                                else if (d == 1701671783) {
                                    final bas a2 = bwa.a;
                                    if (this.E.length != 0) {
                                        a2.G(8);
                                        final int f2 = bwb.f(a2.d());
                                        long y4;
                                        long n14;
                                        String s2;
                                        String s3;
                                        long y6;
                                        long n15;
                                        if (f2 != 0) {
                                            if (f2 != 1) {
                                                final StringBuilder sb = new StringBuilder("Skipping unsupported emsg version: ");
                                                sb.append(f2);
                                                bap.c("FragmentedMp4Extractor", sb.toString());
                                                break Label_2353;
                                            }
                                            final long q3 = a2.q();
                                            y4 = bax.y(a2.r(), 1000000L, q3);
                                            final long y5 = bax.y(a2.q(), 1000L, q3);
                                            n14 = a2.q();
                                            s2 = a2.u();
                                            dk.d((Object)s2);
                                            s3 = a2.u();
                                            dk.d((Object)s3);
                                            y6 = -9223372036854775807L;
                                            n15 = y5;
                                        }
                                        else {
                                            s2 = a2.u();
                                            dk.d((Object)s2);
                                            s3 = a2.u();
                                            dk.d((Object)s3);
                                            final long q4 = a2.q();
                                            y6 = bax.y(a2.q(), 1000000L, q4);
                                            final long x = this.x;
                                            long n16;
                                            if (x != -9223372036854775807L) {
                                                n16 = x + y6;
                                            }
                                            else {
                                                n16 = -9223372036854775807L;
                                            }
                                            final long y7 = bax.y(a2.q(), 1000L, q4);
                                            n14 = a2.q();
                                            n15 = y7;
                                            y4 = n16;
                                        }
                                        final byte[] array5 = new byte[a2.a()];
                                        a2.B(array5, 0, a2.a());
                                        final bas bas = new bas(this.H.F(new EventMessage(s2, s3, n15, n14, array5)));
                                        final int a3 = bas.a();
                                        for (final bud bud : this.E) {
                                            bas.G(0);
                                            bud.c(bas, a3);
                                        }
                                        if (y4 == -9223372036854775807L) {
                                            this.m.addLast(new lhm(y6, true, a3));
                                            this.u += a3;
                                        }
                                        else if (!this.m.isEmpty()) {
                                            this.m.addLast(new lhm(y4, false, a3));
                                            this.u += a3;
                                        }
                                        else {
                                            final bud[] e3 = this.E;
                                            for (int length2 = e3.length, n18 = 0; n18 < length2; ++n18) {
                                                e3[n18].e(y4, 1, a3, 0, (buc)null);
                                            }
                                        }
                                    }
                                }
                            }
                            btk3 = btk;
                        }
                    }
                    else {
                        btk2.m(n8);
                        btk3 = btk2;
                    }
                    this.j(((btd)btk3).c);
                    btk2 = btk3;
                }
            }
            else {
                if (this.r == 0) {
                    if (!btk2.p(this.k.a, 0, 8, true)) {
                        return -1;
                    }
                    this.r = 8;
                    this.k.G(0);
                    this.q = this.k.q();
                    this.p = this.k.d();
                }
                final long q5 = this.q;
                if (q5 == 1L) {
                    btk2.k(this.k.a, 8, 8);
                    this.r += 8;
                    this.q = this.k.r();
                }
                else if (q5 == 0L) {
                    final btd btd = (btd)btk2;
                    long n19;
                    if ((n19 = btd.b) == -1L) {
                        if (!this.l.isEmpty()) {
                            n19 = this.l.peek().a;
                        }
                        else {
                            n19 = -1L;
                        }
                    }
                    if (n19 != -1L) {
                        this.q = n19 - btd.c + this.r;
                    }
                }
                final long q6 = this.q;
                final long n20 = this.r;
                if (q6 < n20) {
                    throw aza.d("Atom size less than header length (unsupported).");
                }
                final btd btd2 = (btd)btk2;
                final long n21 = btd2.c - n20;
                final int p2 = this.p;
                if ((p2 == 1836019558 || p2 == 1835295092) && !this.G) {
                    this.D.x((bua)new btz(this.w, n21));
                    this.G = true;
                }
                if (this.p == 1836019558) {
                    for (int size3 = this.e.size(), n22 = 0; n22 < size3; ++n22) {
                        final bwr b4 = ((bwl)this.e.valueAt(n22)).b;
                        b4.c = n21;
                        b4.b = n21;
                    }
                }
                final int p3 = this.p;
                if (p3 == 1835295092) {
                    this.y = null;
                    this.t = n21 + this.q;
                    this.o = 2;
                }
                else if (p3 != 1836019574 && p3 != 1953653099 && p3 != 1835297121 && p3 != 1835626086 && p3 != 1937007212 && p3 != 1836019558 && p3 != 1953653094 && p3 != 1836475768 && p3 != 1701082227) {
                    if (p3 != 1751411826 && p3 != 1835296868 && p3 != 1836476516 && p3 != 1936286840 && p3 != 1937011556 && p3 != 1937011827 && p3 != 1668576371 && p3 != 1937011555 && p3 != 1937011578 && p3 != 1937013298 && p3 != 1937007471 && p3 != 1668232756 && p3 != 1937011571 && p3 != 1952867444 && p3 != 1952868452 && p3 != 1953196132 && p3 != 1953654136 && p3 != 1953658222 && p3 != 1886614376 && p3 != 1935763834 && p3 != 1935763823 && p3 != 1936027235 && p3 != 1970628964 && p3 != 1935828848 && p3 != 1936158820 && p3 != 1701606260 && p3 != 1835362404 && p3 != 1701671783) {
                        if (this.q > 2147483647L) {
                            throw aza.d("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.s = null;
                        this.o = 1;
                    }
                    else {
                        if (this.r != 8) {
                            throw aza.d("Leaf atom defines extended atom size (unsupported).");
                        }
                        final long q7 = this.q;
                        if (q7 > 2147483647L) {
                            throw aza.d("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        final bas s4 = new bas((int)q7);
                        System.arraycopy(this.k.a, 0, s4.a, 0, 8);
                        this.s = s4;
                        this.o = 1;
                    }
                }
                else {
                    final long c3 = btd2.c;
                    final long q8 = this.q;
                    final ArrayDeque l2 = this.l;
                    final long n23 = c3 + q8 - 8L;
                    l2.push(new bvz(p3, n23));
                    if (this.q == this.r) {
                        this.j(n23);
                    }
                    else {
                        this.c();
                    }
                }
            }
        }
        Label_0570: {
            if (this.o != 3) {
                break Label_0570;
            }
            int z;
            if (!y.j) {
                z = y.d.c[y.f];
            }
            else {
                z = y.b.h[y.f];
            }
            this.z = z;
            if (y.f >= y.i) {
                if (y.d.h.g == 1) {
                    this.z = z - 8;
                    btk2.m(8);
                }
                int a4;
                if ("audio/ac4".equals(y.d.h.f.n)) {
                    this.A = y.a(this.z, 7);
                    bst.b(this.z, this.j);
                    y.a.c(this.j, 7);
                    a4 = this.A + 7;
                    this.A = a4;
                }
                else {
                    a4 = y.a(this.z, 0);
                    this.A = a4;
                }
                this.z += a4;
                this.o = 4;
                this.B = 0;
                break Label_0570;
            }
            btk2.m(z);
            final lzu f3 = y.f();
            if (f3 != null) {
                final bas m2 = y.b.m;
                final int d3 = f3.d;
                if (d3 != 0) {
                    m2.H(d3);
                }
                if (y.b.c(y.f)) {
                    m2.H(m2.m() * 6);
                }
            }
            if (!y.e()) {
                this.y = null;
            }
            this.o = 3;
            return 0;
        }
        final bws d4 = y.d;
        final lzt h = d4.h;
        final bud a5 = y.a;
        long a6;
        if (!y.j) {
            a6 = d4.e[y.f];
        }
        else {
            a6 = y.b.a(y.f);
        }
        final int j2 = h.j;
        if (j2 == 0) {
            while (true) {
                final int a7 = this.A;
                final int z2 = this.z;
                if (a7 >= z2) {
                    break;
                }
                this.A += a5.a((ayb)btk2, z2 - a7, false);
            }
        }
        else {
            final byte[] a8 = this.g.a;
            a8[0] = 0;
            a8[2] = (a8[1] = 0);
            final int n24 = 4 - j2;
            while (this.A < this.z) {
                final int b5 = this.B;
                if (b5 == 0) {
                    btk2.k(a8, n24, j2 + 1);
                    this.g.G(0);
                    final int d5 = this.g.d();
                    if (d5 <= 0) {
                        throw aza.a("Invalid NAL length", (Throwable)null);
                    }
                    this.B = d5 - 1;
                    this.f.G(0);
                    a5.c(this.f, 4);
                    a5.c(this.g, 1);
                    this.C = (this.F.length > 0 && btx.e(h.f.n, a8[4]));
                    this.A += 5;
                    this.z += n24;
                }
                else {
                    int n25;
                    if (this.C) {
                        this.h.C(b5);
                        btk2.k(this.h.a, 0, this.B);
                        a5.c(this.h, this.B);
                        n25 = this.B;
                        final bas h2 = this.h;
                        final int b6 = btx.b(h2.a, h2.c);
                        this.h.G((int)("video/hevc".equals(h.f.n) ? 1 : 0));
                        this.h.F(b6);
                        blf.c(a6, this.h, this.F);
                    }
                    else {
                        n25 = a5.a((ayb)btk2, b5, false);
                    }
                    this.A += n25;
                    this.B -= n25;
                }
            }
        }
        int n26;
        if (!y.j) {
            n26 = y.d.f[y.f];
        }
        else if (y.b.j[y.f]) {
            n26 = 1;
        }
        else {
            n26 = 0;
        }
        if (y.f() != null) {
            n26 |= 0x40000000;
        }
        final lzu f4 = y.f();
        buc c4;
        if (f4 != null) {
            c4 = f4.c;
        }
        else {
            c4 = null;
        }
        a5.e(a6, n26, this.z, 0, c4);
        while (!this.m.isEmpty()) {
            final lhm lhm = this.m.removeFirst();
            this.u -= lhm.c;
            long b7 = lhm.b;
            if (lhm.a) {
                b7 += a6;
            }
            final bud[] e4 = this.E;
            for (int length3 = e4.length, n27 = 0; n27 < length3; ++n27) {
                e4[n27].e(b7, 1, lhm.c, this.u, (buc)null);
            }
        }
        if (!y.e()) {
            this.y = null;
        }
        this.o = 3;
        return 0;
    }
}
