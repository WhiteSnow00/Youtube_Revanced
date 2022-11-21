import androidx.media3.common.Metadata;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bxi extends bxh
{
    private int a;
    private boolean o;
    private bui p;
    private aewv q;
    private avv r;
    
    public bxi() {
    }
    
    protected final long a(final bat bat) {
        final byte[] a = bat.a;
        int n = 0;
        final byte b = a[0];
        if ((b & 0x1) != 0x1) {
            final aewv q = this.q;
            bad.c(q);
            int a2;
            if (!((agjn[])q.c)[b >> 1 & 255 >>> 8 - q.a].a) {
                a2 = ((bui)q.d).e;
            }
            else {
                a2 = ((bui)q.d).f;
            }
            if (this.o) {
                n = (this.a + a2) / 4;
            }
            final int b2 = bat.b();
            final int n2 = bat.c + 4;
            if (b2 < n2) {
                bat.D(Arrays.copyOf(bat.a, n2));
            }
            else {
                bat.F(n2);
            }
            final long n3 = n;
            final byte[] a3 = bat.a;
            final int c = bat.c;
            a3[c - 4] = (byte)(n3 & 0xFFL);
            a3[c - 3] = (byte)(n3 >>> 8 & 0xFFL);
            a3[c - 2] = (byte)(n3 >>> 16 & 0xFFL);
            a3[c - 1] = (byte)(n3 >>> 24 & 0xFFL);
            this.o = true;
            this.a = a2;
            return n3;
        }
        return -1L;
    }
    
    protected final void b(final boolean b) {
        super.b(b);
        if (b) {
            this.q = null;
            this.p = null;
            this.r = null;
        }
        this.a = 0;
        this.o = false;
    }
    
    protected final boolean c(final bat bat, long n, final bxf bxf) {
        if (this.q != null) {
            bad.b(bxf.a);
            return false;
        }
        final bui p3 = this.p;
        aewv q = null;
        Label_1685: {
            if (p3 == null) {
                bhw.j(1, bat, false);
                bat.f();
                final int i = bat.i();
                final int f = bat.f();
                int e = bat.e();
                if (e <= 0) {
                    e = -1;
                }
                int e2 = bat.e();
                if (e2 <= 0) {
                    e2 = -1;
                }
                bat.e();
                final int j = bat.i();
                final int n2 = (int)Math.pow(2.0, j & 0xF);
                final int n3 = (int)Math.pow(2.0, (j & 0xF0) >> 4);
                bat.i();
                this.p = new bui(i, f, e, e2, n2, n3, Arrays.copyOf(bat.a, bat.c));
            }
            else {
                final avv r = this.r;
                if (r == null) {
                    this.r = bhw.k(bat, true, true);
                }
                else {
                    final int c = bat.c;
                    final byte[] array = new byte[c];
                    System.arraycopy(bat.a, 0, array, 0, c);
                    int a = p3.a;
                    bhw.j(5, bat, false);
                    int n4 = bat.i() + 1;
                    final buh buh = new buh(bat.a);
                    buh.b(bat.b * 8);
                    int k = 0;
                    avv avv = r;
                    while (k < n4) {
                        if (buh.a(24) != 5653314) {
                            final int a2 = buh.a;
                            final int b = buh.b;
                            final StringBuilder sb = new StringBuilder("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb.append(a2 * 8 + b);
                            throw azb.a(sb.toString(), null);
                        }
                        final int a3 = buh.a(16);
                        final int a4 = buh.a(24);
                        final long[] array2 = new long[a4];
                        final boolean c2 = buh.c();
                        n = 0L;
                        int n5;
                        avv avv2;
                        int n6;
                        if (!c2) {
                            final boolean c3 = buh.c();
                            for (int l = 0; l < a4; ++l) {
                                if (c3) {
                                    if (buh.c()) {
                                        array2[l] = buh.a(5) + 1;
                                    }
                                    else {
                                        array2[l] = 0L;
                                    }
                                }
                                else {
                                    array2[l] = buh.a(5) + 1;
                                }
                            }
                            n5 = n4;
                            avv2 = avv;
                            n6 = a;
                        }
                        else {
                            final int n7 = n4;
                            int n8 = buh.a(5) + 1;
                            int n9 = 0;
                            while (true) {
                                avv2 = avv;
                                n6 = a;
                                n5 = n7;
                                if (n9 >= a4) {
                                    break;
                                }
                                for (int a5 = buh.a(bhw.h(a4 - n9)), n10 = 0; n10 < a5 && n9 < a4; ++n9, ++n10) {
                                    array2[n9] = n8;
                                }
                                ++n8;
                            }
                        }
                        final int a6 = buh.a(4);
                        if (a6 > 2) {
                            final StringBuilder sb2 = new StringBuilder("lookup type greater than 2 not decodable: ");
                            sb2.append(a6);
                            throw azb.a(sb2.toString(), null);
                        }
                        Label_0633: {
                            int n11;
                            if ((n11 = a6) != 1) {
                                if (a6 != 2) {
                                    break Label_0633;
                                }
                                n11 = 2;
                            }
                            buh.b(32);
                            buh.b(32);
                            final int a7 = buh.a(4);
                            buh.b(1);
                            if (n11 == 1) {
                                if (a3 != 0) {
                                    n = a4;
                                    final double n12 = a3;
                                    final double n13 = (double)n;
                                    Double.isNaN(n12);
                                    n = (long)Math.floor(Math.pow(n13, 1.0 / n12));
                                }
                            }
                            else {
                                n = a4 * (long)a3;
                            }
                            buh.b((int)((a7 + 1) * n));
                        }
                        ++k;
                        avv = avv2;
                        a = n6;
                        n4 = n5;
                    }
                    for (int a8 = buh.a(6), n14 = 0; n14 < a8 + 1; ++n14) {
                        if (buh.a(16) != 0) {
                            throw azb.a("placeholder of time domain transforms not zeroed out", null);
                        }
                    }
                    for (int a9 = buh.a(6), n15 = 0; n15 < a9 + 1; ++n15) {
                        final int a10 = buh.a(16);
                        if (a10 != 0) {
                            if (a10 != 1) {
                                final StringBuilder sb3 = new StringBuilder("floor type greater than 1 not decodable: ");
                                sb3.append(a10);
                                throw azb.a(sb3.toString(), null);
                            }
                            final int a11 = buh.a(5);
                            final int[] array3 = new int[a11];
                            int n16 = 0;
                            int n17 = -1;
                            while (n16 < a11) {
                                final int a12 = buh.a(4);
                                int n18;
                                if ((array3[n16] = a12) > (n18 = n17)) {
                                    n18 = a12;
                                }
                                ++n16;
                                n17 = n18;
                            }
                            final int n19 = n17 + 1;
                            final int[] array4 = new int[n19];
                            for (int n20 = 0; n20 < n19; ++n20) {
                                array4[n20] = buh.a(3) + 1;
                                final int a13 = buh.a(2);
                                if (a13 > 0) {
                                    buh.b(8);
                                }
                                for (int n21 = 0; n21 < 1 << a13; ++n21) {
                                    buh.b(8);
                                }
                            }
                            buh.b(2);
                            final int a14 = buh.a(4);
                            int n22 = 0;
                            int n23 = 0;
                            int n24 = 0;
                            while (n22 < a11) {
                                for (n23 += array4[array3[n22]]; n24 < n23; ++n24) {
                                    buh.b(a14);
                                }
                                ++n22;
                            }
                        }
                        else {
                            buh.b(8);
                            buh.b(16);
                            buh.b(16);
                            buh.b(6);
                            buh.b(8);
                            for (int a15 = buh.a(4), n25 = 0; n25 < a15 + 1; ++n25) {
                                buh.b(8);
                            }
                        }
                    }
                    for (int a16 = buh.a(6), n26 = 0; n26 < a16 + 1; ++n26) {
                        if (buh.a(16) > 2) {
                            throw azb.a("residueType greater than 2 is not decodable", null);
                        }
                        buh.b(24);
                        buh.b(24);
                        buh.b(24);
                        final int n27 = buh.a(6) + 1;
                        buh.b(8);
                        final int[] array5 = new int[n27];
                        for (int n28 = 0; n28 < n27; ++n28) {
                            final int a17 = buh.a(3);
                            int a18;
                            if (buh.c()) {
                                a18 = buh.a(5);
                            }
                            else {
                                a18 = 0;
                            }
                            array5[n28] = a18 * 8 + a17;
                        }
                        for (int n29 = 0; n29 < n27; ++n29) {
                            for (int n30 = 0; n30 < 8; ++n30) {
                                if ((array5[n29] & 1 << n30) != 0x0) {
                                    buh.b(8);
                                }
                            }
                        }
                    }
                    for (int a19 = buh.a(6), n31 = 0; n31 < a19 + 1; ++n31) {
                        final int a20 = buh.a(16);
                        if (a20 != 0) {
                            final StringBuilder sb4 = new StringBuilder("mapping type other than 0 not supported: ");
                            sb4.append(a20);
                            baq.a("VorbisUtil", sb4.toString());
                        }
                        else {
                            int n32;
                            if (buh.c()) {
                                n32 = buh.a(4) + 1;
                            }
                            else {
                                n32 = 1;
                            }
                            if (buh.c()) {
                                for (int a21 = buh.a(8), n33 = 0; n33 < a21 + 1; ++n33) {
                                    final int n34 = a - 1;
                                    buh.b(bhw.h(n34));
                                    buh.b(bhw.h(n34));
                                }
                            }
                            if (buh.a(2) != 0) {
                                throw azb.a("to reserved bits must be zero after mapping coupling steps", null);
                            }
                            if (n32 > 1) {
                                for (int n35 = 0; n35 < a; ++n35) {
                                    buh.b(4);
                                }
                            }
                            for (int n36 = 0; n36 < n32; ++n36) {
                                buh.b(8);
                                buh.b(8);
                                buh.b(8);
                            }
                        }
                    }
                    final int n37 = buh.a(6) + 1;
                    final agjn[] array6 = new agjn[n37];
                    for (int n38 = 0; n38 < n37; ++n38) {
                        final boolean c4 = buh.c();
                        buh.a(16);
                        buh.a(16);
                        buh.a(8);
                        array6[n38] = new agjn(c4);
                    }
                    if (buh.c()) {
                        q = new aewv(p3, avv, array, array6, bhw.h(n37 - 1), null, null, null, null);
                        break Label_1685;
                    }
                    throw azb.a("framing bit after modes not set as expected", null);
                }
            }
            q = null;
        }
        this.q = q;
        if (q == null) {
            return true;
        }
        final Object d = q.d;
        final ArrayList<Object> m = new ArrayList<Object>();
        final bui bui = (bui)d;
        m.add(bui.g);
        m.add(q.b);
        final Metadata i2 = bhw.i((List)afgh.p((Object[])((avv)q.e).a));
        final ayg ayg = new ayg();
        ayg.k = "audio/vorbis";
        ayg.f = bui.d;
        ayg.g = bui.c;
        ayg.x = bui.a;
        ayg.y = bui.b;
        ayg.m = m;
        ayg.i = i2;
        bxf.a = ayg.a();
        return true;
    }
    
    protected final void g(final long h) {
        super.h = h;
        int e = 0;
        this.o = (h != 0L);
        final bui p = this.p;
        if (p != null) {
            e = p.e;
        }
        this.a = e;
    }
}
