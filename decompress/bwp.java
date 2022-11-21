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

public class bwp implements btm
{
    private static final byte[] a;
    private static final ayh b;
    private int A;
    private int B;
    private boolean C;
    private btp D;
    private bug[] E;
    private bug[] F;
    private boolean G;
    private final dmo H;
    private final int c;
    private final List d;
    private final SparseArray e;
    private final bat f;
    private final bat g;
    private final bat h;
    private final byte[] i;
    private final bat j;
    private final bat k;
    private final ArrayDeque l;
    private final ArrayDeque m;
    private final bug n;
    private int o;
    private int p;
    private long q;
    private int r;
    private bat s;
    private long t;
    private int u;
    private long v;
    private long w;
    private long x;
    private bwo y;
    private int z;
    
    static {
        a = new byte[] { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
        final ayg ayg = new ayg();
        ayg.k = "application/x-emsg";
        b = ayg.a();
    }
    
    public bwp() {
        this(null);
    }
    
    public bwp(final int c, final List list, final bug n) {
        this.c = c;
        this.d = Collections.unmodifiableList((List<?>)list);
        this.n = n;
        this.H = new dmo((byte[])null, (byte[])null);
        this.k = new bat(16);
        this.f = new bat(bua.a);
        this.g = new bat(5);
        this.h = new bat();
        final byte[] i = new byte[16];
        this.i = i;
        this.j = new bat(i);
        this.l = new ArrayDeque();
        this.m = new ArrayDeque();
        this.e = new SparseArray();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        this.D = btp.t;
        this.E = new bug[0];
        this.F = new bug[0];
    }
    
    public bwp(final byte[] array) {
        this(0, Collections.emptyList(), null);
    }
    
    private static DrmInitData b(final List list) {
        final int size = list.size();
        int i = 0;
        List<DrmInitData$SchemeData> list2 = null;
        while (i < size) {
            final bwd bwd = list.get(i);
            List<DrmInitData$SchemeData> list3 = list2;
            if (bwd.d == 1886614376) {
                if ((list3 = list2) == null) {
                    list3 = new ArrayList<DrmInitData$SchemeData>();
                }
                final byte[] a = bwd.a.a;
                final UUID d = bhw.d(a);
                if (d == null) {
                    baq.c("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                }
                else {
                    ((ArrayList<DrmInitData$SchemeData>)list3).add(new DrmInitData$SchemeData(d, "video/mp4", a));
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
    
    private static void i(final bat bat, int n, final bwu bwu) {
        bat.G(n + 8);
        n = bwe.e(bat.d());
        if ((n & 0x1) != 0x0) {
            throw azb.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        final boolean b = (n & 0x2) != 0x0;
        final int l = bat.l();
        if (l == 0) {
            Arrays.fill(bwu.l, 0, bwu.e, false);
            return;
        }
        n = bwu.e;
        if (l == n) {
            Arrays.fill(bwu.l, 0, l, b);
            bwu.b(bat.a());
            final bat m = bwu.m;
            bat.B(m.a, 0, m.c);
            bwu.m.G(0);
            bwu.n = false;
            return;
        }
        final StringBuilder sb = new StringBuilder("Senc sample count ");
        sb.append(l);
        sb.append(" is different from fragment sample count");
        sb.append(n);
        throw azb.a(sb.toString(), null);
    }
    
    private final void j(final long n) {
        bwp bwp = this;
        while (!bwp.l.isEmpty() && ((bwc)bwp.l.peek()).a == n) {
            final bwc bwc = bwp.l.pop();
            final int d = bwc.d;
            if (d == 1836019574) {
                bad.g(true, "Unexpected moov box.");
                final DrmInitData b = b(bwc.b);
                final bwc a = bwc.a(1836475768);
                bad.b(a);
                final SparseArray sparseArray = new SparseArray();
                final int size = a.b.size();
                long n2 = -9223372036854775807L;
                for (int i = 0; i < size; ++i) {
                    final bwd bwd = a.b.get(i);
                    final int d2 = bwd.d;
                    if (d2 == 1953654136) {
                        final bat a2 = bwd.a;
                        a2.G(12);
                        final Pair create = Pair.create((Object)a2.d(), (Object)new bwm(a2.d() - 1, a2.d(), a2.d(), a2.d()));
                        sparseArray.put((int)create.first, (Object)create.second);
                    }
                    else if (d2 == 1835362404) {
                        final bat a3 = bwd.a;
                        a3.G(8);
                        if (bwe.f(a3.d()) == 0) {
                            n2 = a3.q();
                        }
                        else {
                            n2 = a3.r();
                        }
                    }
                }
                final List d3 = bwl.d(bwc, new btu(), n2, b, false, (afax)new bwn(bwp, 0));
                final int size2 = d3.size();
                if (bwp.e.size() == 0) {
                    for (int j = 0; j < size2; ++j) {
                        final bwv bwv = d3.get(j);
                        final mah h = bwv.h;
                        bwp.e.put(h.a, (Object)new bwo(bwp.D.q(j, h.b), bwv, l(sparseArray, h.a)));
                        bwp.w = Math.max(bwp.w, h.e);
                    }
                    bwp.D.r();
                }
                else {
                    bad.f(bwp.e.size() == size2);
                    for (int k = 0; k < size2; ++k) {
                        final bwv bwv2 = d3.get(k);
                        final mah h2 = bwv2.h;
                        ((bwo)bwp.e.get(h2.a)).c(bwv2, l(sparseArray, h2.a));
                    }
                }
            }
            else if (d == 1836019558) {
                final SparseArray e = bwp.e;
                int c = bwp.c;
                byte[] l = bwp.i;
                int size3 = bwc.c.size();
                int n3 = 0;
                bwc bwc2 = bwc;
                SparseArray sparseArray2 = e;
                while (n3 < size3) {
                    final bwc bwc3 = bwc2.c.get(n3);
                    int n15 = 0;
                    byte[] array5 = null;
                    int n34 = 0;
                    SparseArray sparseArray4 = null;
                    int n35 = 0;
                    Label_2960: {
                        if (bwc3.d == 1953653094) {
                            final bwd b2 = bwc3.b(1952868452);
                            bad.b(b2);
                            final bat a4 = b2.a;
                            a4.G(8);
                            final int e2 = bwe.e(a4.d());
                            bwo bwo = (bwo)sparseArray2.get(a4.d());
                            if (bwo == null) {
                                bwo = null;
                            }
                            else {
                                if ((e2 & 0x1) != 0x0) {
                                    final long r = a4.r();
                                    final bwu b3 = bwo.b;
                                    b3.b = r;
                                    b3.c = r;
                                }
                                final bwm e3 = bwo.e;
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
                                bwo.b.a = new bwm(a5, n4, n5, n6);
                            }
                            if (bwo != null) {
                                final bwu b4 = bwo.b;
                                final long o = b4.o;
                                final boolean p = b4.p;
                                bwo.d();
                                bwo.j = true;
                                final bwd b5 = bwc3.b(1952867444);
                                if (b5 != null && (c & 0x2) == 0x0) {
                                    final bat a6 = b5.a;
                                    a6.G(8);
                                    long o2;
                                    if (bwe.f(a6.d()) == 1) {
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
                                final List b6 = bwc3.b;
                                final int size4 = b6.size();
                                int n7 = 0;
                                int d4 = 0;
                                int e4 = 0;
                                while (n7 < size4) {
                                    final bwd bwd2 = b6.get(n7);
                                    int n8 = d4;
                                    int n9 = e4;
                                    if (bwd2.d == 1953658222) {
                                        final bat a7 = bwd2.a;
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
                                bwo.h = 0;
                                bwo.g = 0;
                                bwo.f = 0;
                                final bwu b7 = bwo.b;
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
                                final bwc bwc4 = bwc3;
                                n15 = n3;
                                final bwu bwu = b4;
                                while (true) {
                                    final long n16 = 0L;
                                    if (n12 >= size4) {
                                        break;
                                    }
                                    final bwd bwd3 = b6.get(n12);
                                    if (bwd3.d == 1953658222) {
                                        final bat a8 = bwd3.a;
                                        a8.G(8);
                                        final int e5 = bwe.e(a8.d());
                                        final mah h3 = bwo.d.h;
                                        final bwu b8 = bwo.b;
                                        final bwm a9 = b8.a;
                                        final int a10 = baz.a;
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
                                                    n21 = ((long[])baz.L(h3.i))[0];
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
                                            final long y = baz.y(d5 + o3 - n21, 1000000L, c2);
                                            i2[n23] = y;
                                            if (!b8.p) {
                                                i2[n23] = y + bwo.d.g;
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
                                final bwc bwc5 = bwc2;
                                final int n28 = c;
                                final byte[] array = l;
                                final mah h6 = bwo.d.h;
                                final bwm a11 = bwu.a;
                                bad.b(a11);
                                final mai b14 = h6.b(a11.a);
                                final bwd b15 = bwc4.b(1935763834);
                                if (b15 != null) {
                                    bad.b(b14);
                                    final bat a12 = b15.a;
                                    final int d6 = b14.d;
                                    a12.G(8);
                                    if ((bwe.e(a12.d()) & 0x1) == 0x1) {
                                        a12.H(8);
                                    }
                                    final int i3 = a12.i();
                                    final int l2 = a12.l();
                                    final int e6 = bwu.e;
                                    if (l2 > e6) {
                                        final StringBuilder sb = new StringBuilder("Saiz sample count ");
                                        sb.append(l2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(e6);
                                        throw azb.a(sb.toString(), null);
                                    }
                                    int n30;
                                    if (i3 == 0) {
                                        final boolean[] l3 = bwu.l;
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
                                        Arrays.fill(bwu.l, 0, l2, b16);
                                    }
                                    Arrays.fill(bwu.l, l2, bwu.e, false);
                                    if (n30 > 0) {
                                        bwu.b(n30);
                                    }
                                }
                                final bwd b17 = bwc4.b(1935763823);
                                if (b17 != null) {
                                    final bat a13 = b17.a;
                                    a13.G(8);
                                    final int d7 = a13.d();
                                    if ((bwe.e(d7) & 0x1) == 0x1) {
                                        a13.H(8);
                                    }
                                    final int l4 = a13.l();
                                    if (l4 != 1) {
                                        final StringBuilder sb2 = new StringBuilder("Unexpected saio entry count: ");
                                        sb2.append(l4);
                                        throw azb.a(sb2.toString(), null);
                                    }
                                    final int f2 = bwe.f(d7);
                                    final long c3 = bwu.c;
                                    long n31;
                                    if (f2 == 0) {
                                        n31 = a13.q();
                                    }
                                    else {
                                        n31 = a13.r();
                                    }
                                    bwu.c = c3 + n31;
                                }
                                final bwd b18 = bwc4.b(1936027235);
                                if (b18 != null) {
                                    i(b18.a, 0, bwu);
                                }
                                String b19;
                                if (b14 != null) {
                                    b19 = b14.b;
                                }
                                else {
                                    b19 = null;
                                }
                                bat bat = null;
                                bat bat2 = null;
                                bat bat3;
                                bat bat4;
                                for (int n32 = 0; n32 < bwc4.b.size(); ++n32, bat = bat3, bat2 = bat4) {
                                    final bwd bwd4 = bwc4.b.get(n32);
                                    final bat a14 = bwd4.a;
                                    final int d8 = bwd4.d;
                                    if (d8 == 1935828848) {
                                        a14.G(12);
                                        bat3 = bat;
                                        bat4 = bat2;
                                        if (a14.d() == 1936025959) {
                                            bat3 = a14;
                                            bat4 = bat2;
                                        }
                                    }
                                    else {
                                        bat3 = bat;
                                        bat4 = bat2;
                                        if (d8 == 1936158820) {
                                            a14.G(12);
                                            bat3 = bat;
                                            bat4 = bat2;
                                            if (a14.d() == 1936025959) {
                                                bat4 = a14;
                                                bat3 = bat;
                                            }
                                        }
                                    }
                                }
                                if (bat != null) {
                                    if (bat2 != null) {
                                        bat.G(8);
                                        final int f3 = bwe.f(bat.d());
                                        bat.H(4);
                                        if (f3 == 1) {
                                            bat.H(4);
                                        }
                                        if (bat.d() != 1) {
                                            throw azb.d("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        bat2.G(8);
                                        final int f4 = bwe.f(bat2.d());
                                        bat2.H(4);
                                        if (f4 == 1) {
                                            if (bat2.q() == 0L) {
                                                throw azb.d("Variable length description in sgpd found (unsupported)");
                                            }
                                        }
                                        else if (f4 >= 2) {
                                            bat2.H(4);
                                        }
                                        if (bat2.q() != 1L) {
                                            throw azb.d("Entry count in sgpd != 1 (unsupported).");
                                        }
                                        bat2.H(1);
                                        final int i5 = bat2.i();
                                        if (bat2.i() == 1) {
                                            final int i6 = bat2.i();
                                            final byte[] array2 = new byte[16];
                                            bat2.B(array2, 0, 16);
                                            byte[] array4;
                                            if (i6 == 0) {
                                                final int i7 = bat2.i();
                                                final byte[] array3 = new byte[i7];
                                                bat2.B(array3, 0, i7);
                                                array4 = array3;
                                            }
                                            else {
                                                array4 = null;
                                            }
                                            bwu.k = true;
                                            bwu.q = new mai(true, b19, i6, array2, (i5 & 0xF0) >> 4, i5 & 0xF, array4, (byte[])null);
                                        }
                                    }
                                }
                                for (int size5 = bwc4.b.size(), n33 = 0; n33 < size5; ++n33) {
                                    final bwd bwd5 = bwc4.b.get(n33);
                                    if (bwd5.d == 1970628964) {
                                        final bat a15 = bwd5.a;
                                        a15.G(8);
                                        a15.B(array, 0, 16);
                                        if (Arrays.equals(array, bwp.a)) {
                                            i(a15, 16, bwu);
                                        }
                                    }
                                }
                                array5 = array;
                                n34 = n10;
                                sparseArray4 = sparseArray3;
                                bwc2 = bwc5;
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
                final DrmInitData b20 = b(bwc2.b);
                if (b20 != null) {
                    for (int size6 = this.e.size(), n38 = 0; n38 < size6; ++n38) {
                        final bwo bwo2 = (bwo)this.e.valueAt(n38);
                        final mah h7 = bwo2.d.h;
                        final bwm a16 = bwo2.b.a;
                        final int a17 = baz.a;
                        final mai b21 = h7.b(a16.a);
                        String b22;
                        if (b21 != null) {
                            b22 = b21.b;
                        }
                        else {
                            b22 = null;
                        }
                        final DrmInitData b23 = b20.b(b22);
                        final ayg b24 = bwo2.d.h.f.b();
                        b24.n = b23;
                        bwo2.a.b(b24.a());
                    }
                }
                bwp = this;
                if (this.v == -9223372036854775807L) {
                    continue;
                }
                for (int size7 = this.e.size(), n39 = 0; n39 < size7; ++n39) {
                    final bwo bwo3 = (bwo)this.e.valueAt(n39);
                    final long v = this.v;
                    int f5 = bwo3.f;
                    while (true) {
                        final bwu b25 = bwo3.b;
                        if (f5 >= b25.e || b25.a(f5) >= v) {
                            break;
                        }
                        if (bwo3.b.j[f5]) {
                            bwo3.i = f5;
                        }
                        ++f5;
                    }
                }
                this.v = -9223372036854775807L;
                bwp = this;
            }
            else {
                final bwp bwp2 = bwp = bwp;
                if (bwp2.l.isEmpty()) {
                    continue;
                }
                ((bwc)bwp2.l.peek()).c(bwc);
                bwp = bwp2;
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
        throw azb.a(sb.toString(), null);
    }
    
    private static final bwm l(final SparseArray sparseArray, final int n) {
        if (sparseArray.size() == 1) {
            return (bwm)sparseArray.valueAt(0);
        }
        final bwm bwm = (bwm)sparseArray.get(n);
        bad.b(bwm);
        return bwm;
    }
    
    protected mah a(final mah mah) {
        return mah;
    }
    
    public final void d(final btp d) {
        this.D = d;
        this.c();
        final bug[] e = new bug[2];
        this.E = e;
        final bug n = this.n;
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
        final bug[] e2 = (bug[])baz.an(this.E, n5);
        this.E = e2;
        for (int length = e2.length, i = 0; i < length; ++i) {
            e2[i].b(bwp.b);
        }
        this.F = new bug[this.d.size()];
        for (int j = n2; j < this.F.length; ++j, ++n4) {
            final bug q = this.D.q(n4, 3);
            q.b((ayh)this.d.get(j));
            this.F[j] = q;
        }
    }
    
    public final void e() {
    }
    
    public final void f(final long n, final long v) {
        for (int size = this.e.size(), i = 0; i < size; ++i) {
            ((bwo)this.e.valueAt(i)).d();
        }
        this.m.clear();
        this.u = 0;
        this.v = v;
        this.l.clear();
        this.c();
    }
    
    public final boolean g(final btn btn) {
        return bwt.a(btn, true);
    }
    
    public final int h(final btn btn, final pbg pbg) {
        btn btn2 = btn;
        bwo y;
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
                        bwo bwo2;
                        long n3;
                        for (int i = 0; i < size; ++i, y = bwo2, n2 = n3) {
                            final bwo bwo = (bwo)e.valueAt(i);
                            if (!bwo.j) {
                                bwo2 = y;
                                n3 = n2;
                                if (bwo.f == bwo.d.a) {
                                    continue;
                                }
                            }
                            else if (bwo.h == bwo.b.d) {
                                bwo2 = y;
                                n3 = n2;
                                continue;
                            }
                            final long b = bwo.b();
                            bwo2 = y;
                            n3 = n2;
                            if (b < n2) {
                                bwo2 = bwo;
                                n3 = b;
                            }
                        }
                        if (y != null) {
                            int n4;
                            if ((n4 = (int)(y.b() - ((btg)btn2).c)) < 0) {
                                baq.c("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                n4 = 0;
                            }
                            btn2.m(n4);
                            this.y = y;
                            break;
                        }
                        final int n5 = (int)(this.t - ((btg)btn2).c);
                        if (n5 < 0) {
                            throw azb.a("Offset to end of mdat was negative.", null);
                        }
                        btn2.m(n5);
                        this.c();
                    }
                    else {
                        final int size2 = this.e.size();
                        bwo bwo3 = null;
                        long n6;
                        bwo bwo4;
                        for (int j = 0; j < size2; ++j, n = n6, bwo3 = bwo4) {
                            final bwu b2 = ((bwo)this.e.valueAt(j)).b;
                            n6 = n;
                            bwo4 = bwo3;
                            if (b2.n) {
                                final long c = b2.c;
                                n6 = n;
                                bwo4 = bwo3;
                                if (c < n) {
                                    bwo4 = (bwo)this.e.valueAt(j);
                                    n6 = c;
                                }
                            }
                        }
                        if (bwo3 == null) {
                            this.o = 3;
                        }
                        else {
                            final int n7 = (int)(n - ((btg)btn2).c);
                            if (n7 < 0) {
                                throw azb.a("Offset to encryption data was negative.", null);
                            }
                            btn2.m(n7);
                            final bwu b3 = bwo3.b;
                            final bat m = b3.m;
                            btn2.k(m.a, 0, m.c);
                            b3.m.G(0);
                            b3.n = false;
                        }
                    }
                }
                else {
                    final int n8 = (int)this.q - this.r;
                    final bat s = this.s;
                    btn btn3;
                    if (s != null) {
                        btn2.k(s.a, 8, n8);
                        final bwd bwd = new bwd(this.p, s);
                        final long c2 = ((btg)btn2).c;
                        if (!this.l.isEmpty()) {
                            this.l.peek().d(bwd);
                            btn3 = btn2;
                        }
                        else {
                            final int d = bwd.d;
                            Label_2337: {
                                if (d == 1936286840) {
                                    final bat a = bwd.a;
                                    a.G(8);
                                    final int f = bwe.f(a.d());
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
                                    long n11 = c2 + n10;
                                    final long y2 = baz.y(n9, 1000000L, q);
                                    a.H(2);
                                    final int k = a.m();
                                    final int[] array = new int[k];
                                    final long[] array2 = new long[k];
                                    final long[] array3 = new long[k];
                                    final long[] array4 = new long[k];
                                    long y3 = y2;
                                    for (int l = 0; l < k; ++l) {
                                        final int d2 = a.d();
                                        if ((d2 & Integer.MIN_VALUE) != 0x0) {
                                            throw azb.a("Unhandled indirect reference", null);
                                        }
                                        final long q2 = a.q();
                                        array[l] = (d2 & Integer.MAX_VALUE);
                                        array2[l] = n11;
                                        array4[l] = y3;
                                        n9 += q2;
                                        y3 = baz.y(n9, 1000000L, q);
                                        array3[l] = y3 - array4[l];
                                        a.H(4);
                                        n11 += array[l];
                                    }
                                    final Pair create = Pair.create((Object)y2, (Object)new bte(array, array2, array3, array4));
                                    this.x = (long)create.first;
                                    this.D.x((bud)create.second);
                                    this.G = true;
                                }
                                else if (d == 1701671783) {
                                    final bat a2 = bwd.a;
                                    if (this.E.length != 0) {
                                        a2.G(8);
                                        final int f2 = bwe.f(a2.d());
                                        long y4;
                                        long n12;
                                        String s2;
                                        String s3;
                                        long y6;
                                        long y7;
                                        if (f2 != 0) {
                                            if (f2 != 1) {
                                                final StringBuilder sb = new StringBuilder("Skipping unsupported emsg version: ");
                                                sb.append(f2);
                                                baq.c("FragmentedMp4Extractor", sb.toString());
                                                break Label_2337;
                                            }
                                            final long q3 = a2.q();
                                            y4 = baz.y(a2.r(), 1000000L, q3);
                                            final long y5 = baz.y(a2.q(), 1000L, q3);
                                            n12 = a2.q();
                                            s2 = a2.u();
                                            bad.b(s2);
                                            s3 = a2.u();
                                            bad.b(s3);
                                            y6 = -9223372036854775807L;
                                            y7 = y5;
                                        }
                                        else {
                                            s2 = a2.u();
                                            bad.b(s2);
                                            s3 = a2.u();
                                            bad.b(s3);
                                            final long q4 = a2.q();
                                            y6 = baz.y(a2.q(), 1000000L, q4);
                                            final long x = this.x;
                                            long n13;
                                            if (x != -9223372036854775807L) {
                                                n13 = x + y6;
                                            }
                                            else {
                                                n13 = -9223372036854775807L;
                                            }
                                            y7 = baz.y(a2.q(), 1000L, q4);
                                            n12 = a2.q();
                                            y4 = n13;
                                        }
                                        final byte[] array5 = new byte[a2.a()];
                                        a2.B(array5, 0, a2.a());
                                        final bat bat = new bat(this.H.F(new EventMessage(s2, s3, y7, n12, array5)));
                                        final int a3 = bat.a();
                                        for (final bug bug : this.E) {
                                            bat.G(0);
                                            bug.c(bat, a3);
                                        }
                                        if (y4 == -9223372036854775807L) {
                                            this.m.addLast(new lhu(y6, true, a3));
                                            this.u += a3;
                                        }
                                        else if (!this.m.isEmpty()) {
                                            this.m.addLast(new lhu(y4, false, a3));
                                            this.u += a3;
                                        }
                                        else {
                                            final bug[] e3 = this.E;
                                            for (int length2 = e3.length, n15 = 0; n15 < length2; ++n15) {
                                                e3[n15].e(y4, 1, a3, 0, (buf)null);
                                            }
                                        }
                                    }
                                }
                            }
                            btn3 = btn;
                        }
                    }
                    else {
                        btn2.m(n8);
                        btn3 = btn2;
                    }
                    this.j(((btg)btn3).c);
                    btn2 = btn3;
                }
            }
            else {
                if (this.r == 0) {
                    if (!btn2.p(this.k.a, 0, 8, true)) {
                        return -1;
                    }
                    this.r = 8;
                    this.k.G(0);
                    this.q = this.k.q();
                    this.p = this.k.d();
                }
                final long q5 = this.q;
                if (q5 == 1L) {
                    btn2.k(this.k.a, 8, 8);
                    this.r += 8;
                    this.q = this.k.r();
                }
                else if (q5 == 0L) {
                    final btg btg = (btg)btn2;
                    long n16;
                    if ((n16 = btg.b) == -1L) {
                        if (!this.l.isEmpty()) {
                            n16 = this.l.peek().a;
                        }
                        else {
                            n16 = -1L;
                        }
                    }
                    if (n16 != -1L) {
                        this.q = n16 - btg.c + this.r;
                    }
                }
                final long q6 = this.q;
                final long n17 = this.r;
                if (q6 < n17) {
                    throw azb.d("Atom size less than header length (unsupported).");
                }
                final btg btg2 = (btg)btn2;
                final long n18 = btg2.c - n17;
                final int p2 = this.p;
                if ((p2 == 1836019558 || p2 == 1835295092) && !this.G) {
                    this.D.x((bud)new buc(this.w, n18));
                    this.G = true;
                }
                if (this.p == 1836019558) {
                    for (int size3 = this.e.size(), n19 = 0; n19 < size3; ++n19) {
                        final bwu b4 = ((bwo)this.e.valueAt(n19)).b;
                        b4.c = n18;
                        b4.b = n18;
                    }
                }
                final int p3 = this.p;
                if (p3 == 1835295092) {
                    this.y = null;
                    this.t = n18 + this.q;
                    this.o = 2;
                }
                else if (p3 != 1836019574 && p3 != 1953653099 && p3 != 1835297121 && p3 != 1835626086 && p3 != 1937007212 && p3 != 1836019558 && p3 != 1953653094 && p3 != 1836475768 && p3 != 1701082227) {
                    if (p3 != 1751411826 && p3 != 1835296868 && p3 != 1836476516 && p3 != 1936286840 && p3 != 1937011556 && p3 != 1937011827 && p3 != 1668576371 && p3 != 1937011555 && p3 != 1937011578 && p3 != 1937013298 && p3 != 1937007471 && p3 != 1668232756 && p3 != 1937011571 && p3 != 1952867444 && p3 != 1952868452 && p3 != 1953196132 && p3 != 1953654136 && p3 != 1953658222 && p3 != 1886614376 && p3 != 1935763834 && p3 != 1935763823 && p3 != 1936027235 && p3 != 1970628964 && p3 != 1935828848 && p3 != 1936158820 && p3 != 1701606260 && p3 != 1835362404 && p3 != 1701671783) {
                        if (this.q > 2147483647L) {
                            throw azb.d("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.s = null;
                        this.o = 1;
                    }
                    else {
                        if (this.r != 8) {
                            throw azb.d("Leaf atom defines extended atom size (unsupported).");
                        }
                        final long q7 = this.q;
                        if (q7 > 2147483647L) {
                            throw azb.d("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        final bat s4 = new bat((int)q7);
                        System.arraycopy(this.k.a, 0, s4.a, 0, 8);
                        this.s = s4;
                        this.o = 1;
                    }
                }
                else {
                    final long c3 = btg2.c;
                    final long q8 = this.q;
                    final ArrayDeque l2 = this.l;
                    final long n20 = c3 + q8 - 8L;
                    l2.push(new bwc(p3, n20));
                    if (this.q == this.r) {
                        this.j(n20);
                    }
                    else {
                        this.c();
                    }
                }
            }
        }
        Label_0571: {
            if (this.o != 3) {
                break Label_0571;
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
                    btn2.m(8);
                }
                int a4;
                if ("audio/ac4".equals(y.d.h.f.n)) {
                    this.A = y.a(this.z, 7);
                    bsw.b(this.z, this.j);
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
                break Label_0571;
            }
            btn2.m(z);
            final mai f3 = y.f();
            if (f3 != null) {
                final bat m2 = y.b.m;
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
        final bwv d4 = y.d;
        final mah h = d4.h;
        final bug a5 = y.a;
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
                this.A += a5.a((ayc)btn2, z2 - a7, false);
            }
        }
        else {
            final byte[] a8 = this.g.a;
            a8[0] = 0;
            a8[2] = (a8[1] = 0);
            final int n21 = 4 - j2;
            while (this.A < this.z) {
                final int b5 = this.B;
                if (b5 == 0) {
                    btn2.k(a8, n21, j2 + 1);
                    this.g.G(0);
                    final int d5 = this.g.d();
                    if (d5 <= 0) {
                        throw azb.a("Invalid NAL length", null);
                    }
                    this.B = d5 - 1;
                    this.f.G(0);
                    a5.c(this.f, 4);
                    a5.c(this.g, 1);
                    this.C = (this.F.length > 0 && bua.e(h.f.n, a8[4]));
                    this.A += 5;
                    this.z += n21;
                }
                else {
                    int n22;
                    if (this.C) {
                        this.h.C(b5);
                        btn2.k(this.h.a, 0, this.B);
                        a5.c(this.h, this.B);
                        n22 = this.B;
                        final bat h2 = this.h;
                        final int b6 = bua.b(h2.a, h2.c);
                        this.h.G("video/hevc".equals(h.f.n) ? 1 : 0);
                        this.h.F(b6);
                        bmb.b(a6, this.h, this.F);
                    }
                    else {
                        n22 = a5.a((ayc)btn2, b5, false);
                    }
                    this.A += n22;
                    this.B -= n22;
                }
            }
        }
        int n23;
        if (!y.j) {
            n23 = y.d.f[y.f];
        }
        else if (y.b.j[y.f]) {
            n23 = 1;
        }
        else {
            n23 = 0;
        }
        if (y.f() != null) {
            n23 |= 0x40000000;
        }
        final mai f4 = y.f();
        buf c4;
        if (f4 != null) {
            c4 = f4.c;
        }
        else {
            c4 = null;
        }
        a5.e(a6, n23, this.z, 0, c4);
        while (!this.m.isEmpty()) {
            final lhu lhu = this.m.removeFirst();
            this.u -= lhu.c;
            long b7 = lhu.b;
            if (lhu.a) {
                b7 += a6;
            }
            final bug[] e4 = this.E;
            for (int length3 = e4.length, n24 = 0; n24 < length3; ++n24) {
                e4[n24].e(b7, 1, lhu.c, this.u, (buf)null);
            }
        }
        if (!y.e()) {
            this.y = null;
        }
        this.o = 3;
        return 0;
    }
}
