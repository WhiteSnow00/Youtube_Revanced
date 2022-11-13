import androidx.media3.common.Metadata;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class bxf extends bxe
{
    private int a;
    private boolean o;
    private buf p;
    private aevd q;
    private avu r;
    
    public bxf() {
    }
    
    protected final long a(final bas bas) {
        final byte[] a = bas.a;
        int n = 0;
        final byte b = a[0];
        if ((b & 0x1) != 0x1) {
            final aevd q = this.q;
            dk.e((Object)q);
            int a2;
            if (!((aghv[])q.c)[b >> 1 & 255 >>> 8 - q.a].a) {
                a2 = ((buf)q.d).e;
            }
            else {
                a2 = ((buf)q.d).f;
            }
            if (this.o) {
                n = (this.a + a2) / 4;
            }
            final int b2 = bas.b();
            final int n2 = bas.c + 4;
            if (b2 < n2) {
                bas.D(Arrays.copyOf(bas.a, n2));
            }
            else {
                bas.F(n2);
            }
            final long n3 = n;
            final byte[] a3 = bas.a;
            final int c = bas.c;
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
    
    protected final boolean c(final bas bas, long n, final bxc bxc) {
        if (this.q != null) {
            dk.d((Object)bxc.a);
            return false;
        }
        final buf p3 = this.p;
        aevd q = null;
        Label_1685: {
            if (p3 == null) {
                bhq.e(1, bas, false);
                bas.f();
                final int i = bas.i();
                final int f = bas.f();
                int e = bas.e();
                if (e <= 0) {
                    e = -1;
                }
                int e2 = bas.e();
                if (e2 <= 0) {
                    e2 = -1;
                }
                bas.e();
                final int j = bas.i();
                final int n2 = (int)Math.pow(2.0, j & 0xF);
                final int n3 = (int)Math.pow(2.0, (j & 0xF0) >> 4);
                bas.i();
                this.p = new buf(i, f, e, e2, n2, n3, Arrays.copyOf(bas.a, bas.c));
            }
            else {
                final avu r = this.r;
                if (r == null) {
                    this.r = bhq.h(bas, true, true);
                }
                else {
                    final int c = bas.c;
                    final byte[] array = new byte[c];
                    System.arraycopy(bas.a, 0, array, 0, c);
                    int a = p3.a;
                    bhq.e(5, bas, false);
                    int n4 = bas.i() + 1;
                    final bue bue = new bue(bas.a);
                    bue.b(bas.b * 8);
                    int k = 0;
                    avu avu = r;
                    while (k < n4) {
                        if (bue.a(24) != 5653314) {
                            final int a2 = bue.a;
                            final int b = bue.b;
                            final StringBuilder sb = new StringBuilder("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb.append(a2 * 8 + b);
                            throw aza.a(sb.toString(), (Throwable)null);
                        }
                        final int a3 = bue.a(16);
                        final int a4 = bue.a(24);
                        final long[] array2 = new long[a4];
                        final boolean c2 = bue.c();
                        n = 0L;
                        int n5;
                        avu avu2;
                        int n6;
                        if (!c2) {
                            final boolean c3 = bue.c();
                            for (int l = 0; l < a4; ++l) {
                                if (c3) {
                                    if (bue.c()) {
                                        array2[l] = bue.a(5) + 1;
                                    }
                                    else {
                                        array2[l] = 0L;
                                    }
                                }
                                else {
                                    array2[l] = bue.a(5) + 1;
                                }
                            }
                            n5 = n4;
                            avu2 = avu;
                            n6 = a;
                        }
                        else {
                            final int n7 = n4;
                            int n8 = bue.a(5) + 1;
                            int n9 = 0;
                            while (true) {
                                avu2 = avu;
                                n6 = a;
                                n5 = n7;
                                if (n9 >= a4) {
                                    break;
                                }
                                for (int a5 = bue.a(bhq.c(a4 - n9)), n10 = 0; n10 < a5 && n9 < a4; ++n9, ++n10) {
                                    array2[n9] = n8;
                                }
                                ++n8;
                            }
                        }
                        final int a6 = bue.a(4);
                        if (a6 > 2) {
                            final StringBuilder sb2 = new StringBuilder("lookup type greater than 2 not decodable: ");
                            sb2.append(a6);
                            throw aza.a(sb2.toString(), (Throwable)null);
                        }
                        Label_0633: {
                            int n11;
                            if ((n11 = a6) != 1) {
                                if (a6 != 2) {
                                    break Label_0633;
                                }
                                n11 = 2;
                            }
                            bue.b(32);
                            bue.b(32);
                            final int a7 = bue.a(4);
                            bue.b(1);
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
                            bue.b((int)((a7 + 1) * n));
                        }
                        ++k;
                        avu = avu2;
                        a = n6;
                        n4 = n5;
                    }
                    for (int a8 = bue.a(6), n14 = 0; n14 < a8 + 1; ++n14) {
                        if (bue.a(16) != 0) {
                            throw aza.a("placeholder of time domain transforms not zeroed out", (Throwable)null);
                        }
                    }
                    for (int a9 = bue.a(6), n15 = 0; n15 < a9 + 1; ++n15) {
                        final int a10 = bue.a(16);
                        if (a10 != 0) {
                            if (a10 != 1) {
                                final StringBuilder sb3 = new StringBuilder("floor type greater than 1 not decodable: ");
                                sb3.append(a10);
                                throw aza.a(sb3.toString(), (Throwable)null);
                            }
                            final int a11 = bue.a(5);
                            final int[] array3 = new int[a11];
                            int n16 = 0;
                            int n17 = -1;
                            while (n16 < a11) {
                                final int a12 = bue.a(4);
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
                                array4[n20] = bue.a(3) + 1;
                                final int a13 = bue.a(2);
                                if (a13 > 0) {
                                    bue.b(8);
                                }
                                for (int n21 = 0; n21 < 1 << a13; ++n21) {
                                    bue.b(8);
                                }
                            }
                            bue.b(2);
                            final int a14 = bue.a(4);
                            int n22 = 0;
                            int n23 = 0;
                            int n24 = 0;
                            while (n22 < a11) {
                                for (n23 += array4[array3[n22]]; n24 < n23; ++n24) {
                                    bue.b(a14);
                                }
                                ++n22;
                            }
                        }
                        else {
                            bue.b(8);
                            bue.b(16);
                            bue.b(16);
                            bue.b(6);
                            bue.b(8);
                            for (int a15 = bue.a(4), n25 = 0; n25 < a15 + 1; ++n25) {
                                bue.b(8);
                            }
                        }
                    }
                    for (int a16 = bue.a(6), n26 = 0; n26 < a16 + 1; ++n26) {
                        if (bue.a(16) > 2) {
                            throw aza.a("residueType greater than 2 is not decodable", (Throwable)null);
                        }
                        bue.b(24);
                        bue.b(24);
                        bue.b(24);
                        final int n27 = bue.a(6) + 1;
                        bue.b(8);
                        final int[] array5 = new int[n27];
                        for (int n28 = 0; n28 < n27; ++n28) {
                            final int a17 = bue.a(3);
                            int a18;
                            if (bue.c()) {
                                a18 = bue.a(5);
                            }
                            else {
                                a18 = 0;
                            }
                            array5[n28] = a18 * 8 + a17;
                        }
                        for (int n29 = 0; n29 < n27; ++n29) {
                            for (int n30 = 0; n30 < 8; ++n30) {
                                if ((array5[n29] & 1 << n30) != 0x0) {
                                    bue.b(8);
                                }
                            }
                        }
                    }
                    for (int a19 = bue.a(6), n31 = 0; n31 < a19 + 1; ++n31) {
                        final int a20 = bue.a(16);
                        if (a20 != 0) {
                            final StringBuilder sb4 = new StringBuilder("mapping type other than 0 not supported: ");
                            sb4.append(a20);
                            bap.a("VorbisUtil", sb4.toString());
                        }
                        else {
                            int n32;
                            if (bue.c()) {
                                n32 = bue.a(4) + 1;
                            }
                            else {
                                n32 = 1;
                            }
                            if (bue.c()) {
                                for (int a21 = bue.a(8), n33 = 0; n33 < a21 + 1; ++n33) {
                                    final int n34 = a - 1;
                                    bue.b(bhq.c(n34));
                                    bue.b(bhq.c(n34));
                                }
                            }
                            if (bue.a(2) != 0) {
                                throw aza.a("to reserved bits must be zero after mapping coupling steps", (Throwable)null);
                            }
                            if (n32 > 1) {
                                for (int n35 = 0; n35 < a; ++n35) {
                                    bue.b(4);
                                }
                            }
                            for (int n36 = 0; n36 < n32; ++n36) {
                                bue.b(8);
                                bue.b(8);
                                bue.b(8);
                            }
                        }
                    }
                    final int n37 = bue.a(6) + 1;
                    final aghv[] array6 = new aghv[n37];
                    for (int n38 = 0; n38 < n37; ++n38) {
                        final boolean c4 = bue.c();
                        bue.a(16);
                        bue.a(16);
                        bue.a(8);
                        array6[n38] = new aghv(c4);
                    }
                    if (bue.c()) {
                        q = new aevd(p3, avu, array, array6, bhq.c(n37 - 1), (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                        break Label_1685;
                    }
                    throw aza.a("framing bit after modes not set as expected", (Throwable)null);
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
        final buf buf = (buf)d;
        m.add(buf.g);
        m.add(q.b);
        final Metadata d2 = bhq.d((List)afeq.p((Object[])((avu)q.e).a));
        final ayf ayf = new ayf();
        ayf.k = "audio/vorbis";
        ayf.f = buf.d;
        ayf.g = buf.c;
        ayf.x = buf.a;
        ayf.y = buf.b;
        ayf.m = m;
        ayf.i = d2;
        bxc.a = ayf.a();
        return true;
    }
    
    protected final void g(final long h) {
        super.h = h;
        int e = 0;
        this.o = (h != 0L);
        final buf p = this.p;
        if (p != null) {
            e = p.e;
        }
        this.a = e;
    }
}
