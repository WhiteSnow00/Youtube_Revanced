import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzy implements bzp
{
    private String a;
    private bud b;
    private bzx c;
    private boolean d;
    private final boolean[] e;
    private final cac f;
    private final cac g;
    private final cac h;
    private final cac i;
    private final cac j;
    private long k;
    private long l;
    private final bas m;
    private final dml n;
    
    public bzy(final dml n, final byte[] array, final byte[] array2) {
        this.n = n;
        this.e = new boolean[3];
        this.f = new cac(32);
        this.g = new cac(33);
        this.h = new cac(34);
        this.i = new cac(39);
        this.j = new cac(40);
        this.l = -9223372036854775807L;
        this.m = new bas();
    }
    
    private final void f(final byte[] array, final int n, final int n2) {
        final bzx c = this.c;
        if (c.e) {
            final int c2 = c.c;
            final int n3 = n + 2 - c2;
            if (n3 < n2) {
                c.f = ((array[n3] & 0x80) != 0x0);
                c.e = false;
            }
            else {
                c.c = c2 + (n2 - n);
            }
        }
        if (!this.d) {
            this.f.a(array, n, n2);
            this.g.a(array, n, n2);
            this.h.a(array, n, n2);
        }
        this.i.a(array, n, n2);
        this.j.a(array, n, n2);
    }
    
    public final void a(final bas bas) {
        dk.e((Object)this.b);
        final int a = bax.a;
        while (bas.a() > 0) {
            int i = bas.b;
            final int c = bas.c;
            final byte[] a2 = bas.a;
            this.k += bas.a();
            this.b.c(bas, bas.a());
            while (i < c) {
                final int a3 = btx.a(a2, i, c, this.e);
                if (a3 == c) {
                    this.f(a2, i, c);
                    return;
                }
                final int n = a3 + 3;
                final int n2 = a2[n] & 0x7E;
                final int n3 = a3 - i;
                if (n3 > 0) {
                    this.f(a2, i, a3);
                }
                final int n4 = c - a3;
                final long a4 = this.k - n4;
                int n5;
                if (n3 < 0) {
                    n5 = -n3;
                }
                else {
                    n5 = 0;
                }
                final long l = this.l;
                final bzx c2 = this.c;
                final boolean d = this.d;
                if (c2.i && c2.f) {
                    c2.l = c2.b;
                    c2.i = false;
                }
                else if (c2.g || c2.f) {
                    if (d && c2.h) {
                        c2.a((int)(a4 - c2.a) + n4);
                    }
                    c2.j = c2.a;
                    c2.k = c2.d;
                    c2.l = c2.b;
                    c2.h = true;
                }
                int n19 = 0;
                Label_1713: {
                    if (!this.d) {
                        this.f.d(n5);
                        this.g.d(n5);
                        this.h.d(n5);
                        final cac f = this.f;
                        if (f.a) {
                            final cac g = this.g;
                            if (g.a) {
                                final cac h = this.h;
                                if (h.a) {
                                    final bud b = this.b;
                                    final String a5 = this.a;
                                    final int c3 = f.c;
                                    final byte[] array = new byte[g.c + c3 + h.c];
                                    System.arraycopy(f.b, 0, array, 0, c3);
                                    System.arraycopy(g.b, 0, array, f.c, g.c);
                                    System.arraycopy(h.b, 0, array, f.c + g.c, h.c);
                                    final chs chs = new chs(g.b, 0, g.c);
                                    chs.j(44);
                                    final int f2 = chs.f(3);
                                    chs.i();
                                    final int f3 = chs.f(2);
                                    final boolean k = chs.k();
                                    final int f4 = chs.f(5);
                                    int j = 0;
                                    int n6 = 0;
                                    while (j < 32) {
                                        int n7 = n6;
                                        if (chs.k()) {
                                            n7 = (n6 | 1 << j);
                                        }
                                        ++j;
                                        n6 = n7;
                                    }
                                    final int[] array2 = new int[6];
                                    for (int n8 = 0; n8 < 6; ++n8) {
                                        array2[n8] = chs.f(8);
                                    }
                                    final int f5 = chs.f(8);
                                    int n9 = 0;
                                    int n10 = 0;
                                    while (n9 < f2) {
                                        int n11 = n10;
                                        if (chs.k()) {
                                            n11 = n10 + 89;
                                        }
                                        n10 = n11;
                                        if (chs.k()) {
                                            n10 = n11 + 8;
                                        }
                                        ++n9;
                                    }
                                    chs.j(n10);
                                    if (f2 > 0) {
                                        final int n12 = 8 - f2;
                                        chs.j(n12 + n12);
                                    }
                                    chs.g();
                                    int g2;
                                    if ((g2 = chs.g()) == 3) {
                                        chs.i();
                                        g2 = 3;
                                    }
                                    final int g3 = chs.g();
                                    final int g4 = chs.g();
                                    int p = g3;
                                    int n13 = g4;
                                    if (chs.k()) {
                                        final int g5 = chs.g();
                                        final int g6 = chs.g();
                                        final int g7 = chs.g();
                                        final int g8 = chs.g();
                                        int n14 = 0;
                                        int n16 = 0;
                                        Label_0843: {
                                            if ((n14 = g2) != 1) {
                                                if (g2 != 2) {
                                                    final int n15 = 1;
                                                    n14 = g2;
                                                    n16 = n15;
                                                    break Label_0843;
                                                }
                                                n14 = 2;
                                            }
                                            n16 = 2;
                                        }
                                        int n17;
                                        if (n14 == 1) {
                                            n17 = 2;
                                        }
                                        else {
                                            n17 = 1;
                                        }
                                        p = g3 - n16 * (g5 + g6);
                                        n13 = g4 - n17 * (g7 + g8);
                                    }
                                    chs.g();
                                    chs.g();
                                    final int g9 = chs.g();
                                    int n18;
                                    if (!chs.k()) {
                                        n18 = f2;
                                    }
                                    else {
                                        n18 = 0;
                                    }
                                    while (n18 <= f2) {
                                        chs.g();
                                        chs.g();
                                        chs.g();
                                        ++n18;
                                    }
                                    chs.g();
                                    chs.g();
                                    chs.g();
                                    chs.g();
                                    chs.g();
                                    chs.g();
                                    n19 = n2;
                                    if (chs.k()) {
                                        n19 = n2;
                                        if (chs.k()) {
                                            int n20 = 0;
                                            while (true) {
                                                n19 = n2;
                                                if (n20 >= 4) {
                                                    break;
                                                }
                                                int n23;
                                                for (int n21 = 0; n21 < 6; n21 += n23) {
                                                    if (!chs.k()) {
                                                        chs.g();
                                                    }
                                                    else {
                                                        final int min = Math.min(64, 1 << n20 + n20 + 4);
                                                        if (n20 > 1) {
                                                            chs.h();
                                                        }
                                                        for (int n22 = 0; n22 < min; ++n22) {
                                                            chs.h();
                                                        }
                                                    }
                                                    if (n20 == 3) {
                                                        n23 = 3;
                                                    }
                                                    else {
                                                        n23 = 1;
                                                    }
                                                }
                                                ++n20;
                                            }
                                        }
                                    }
                                    chs.j(2);
                                    if (chs.k()) {
                                        chs.j(8);
                                        chs.g();
                                        chs.g();
                                        chs.i();
                                    }
                                    final int g10 = chs.g();
                                    int n24 = 0;
                                    boolean m = false;
                                    int n25 = 0;
                                    while (n24 < g10) {
                                        if (n24 != 0) {
                                            m = chs.k();
                                        }
                                        if (m) {
                                            chs.i();
                                            chs.g();
                                            for (int n26 = 0; n26 <= n25; ++n26) {
                                                if (chs.k()) {
                                                    chs.i();
                                                }
                                            }
                                        }
                                        else {
                                            final int g11 = chs.g();
                                            final int g12 = chs.g();
                                            for (int n27 = 0; n27 < g11; ++n27) {
                                                chs.g();
                                                chs.i();
                                            }
                                            for (int n28 = 0; n28 < g12; ++n28) {
                                                chs.g();
                                                chs.i();
                                            }
                                            n25 = g11 + g12;
                                        }
                                        ++n24;
                                    }
                                    if (chs.k()) {
                                        for (int n29 = 0; n29 < chs.g(); ++n29) {
                                            chs.j(g9 + 5);
                                        }
                                    }
                                    chs.j(2);
                                    final boolean k2 = chs.k();
                                    float t;
                                    final float n30 = t = 1.0f;
                                    int q = n13;
                                    if (k2) {
                                        float n31 = n30;
                                        if (chs.k()) {
                                            final int f6 = chs.f(8);
                                            if (f6 == 255) {
                                                final int f7 = chs.f(16);
                                                final int f8 = chs.f(16);
                                                n31 = n30;
                                                if (f7 != 0) {
                                                    n31 = n30;
                                                    if (f8 != 0) {
                                                        n31 = f7 / (float)f8;
                                                    }
                                                }
                                            }
                                            else if (f6 < 17) {
                                                n31 = btx.b[f6];
                                            }
                                            else {
                                                final StringBuilder sb = new StringBuilder("Unexpected aspect_ratio_idc value: ");
                                                sb.append(f6);
                                                bap.c("H265Reader", sb.toString());
                                                n31 = n30;
                                            }
                                        }
                                        if (chs.k()) {
                                            chs.i();
                                        }
                                        if (chs.k()) {
                                            chs.j(4);
                                            if (chs.k()) {
                                                chs.j(24);
                                            }
                                        }
                                        if (chs.k()) {
                                            chs.g();
                                            chs.g();
                                        }
                                        chs.i();
                                        t = n31;
                                        q = n13;
                                        if (chs.k()) {
                                            q = n13 + n13;
                                            t = n31;
                                        }
                                    }
                                    final String c4 = bae.c(f3, k, f4, n6, array2, f5);
                                    final ayf ayf = new ayf();
                                    ayf.a = a5;
                                    ayf.k = "video/hevc";
                                    ayf.h = c4;
                                    ayf.p = p;
                                    ayf.q = q;
                                    ayf.t = t;
                                    ayf.m = Collections.singletonList(array);
                                    b.b(ayf.a());
                                    this.d = true;
                                    break Label_1713;
                                }
                            }
                        }
                    }
                    n19 = n2;
                }
                if (this.i.d(n5)) {
                    final cac i2 = this.i;
                    this.m.E(this.i.b, btx.b(i2.b, i2.c));
                    this.m.H(5);
                    this.n.D(l, this.m);
                }
                if (this.j.d(n5)) {
                    final cac j2 = this.j;
                    this.m.E(this.j.b, btx.b(j2.b, j2.c));
                    this.m.H(5);
                    this.n.D(l, this.m);
                }
                final int n32 = n19 >> 1;
                final long l2 = this.l;
                final bzx c5 = this.c;
                final boolean d2 = this.d;
                c5.f = false;
                c5.g = false;
                c5.d = l2;
                c5.c = 0;
                c5.a = a4;
                if (n32 >= 32) {
                    if (n32 != 40) {
                        if (c5.h && !c5.i) {
                            if (d2) {
                                c5.a(n4);
                            }
                            c5.h = false;
                        }
                        if (n32 <= 35 || n32 == 39) {
                            c5.g = (c5.i ^ true);
                            c5.i = true;
                        }
                    }
                }
                final boolean b2 = n32 >= 16 && n32 <= 21;
                c5.b = b2;
                c5.e = (b2 || n32 <= 9);
                if (!this.d) {
                    this.f.c(n32);
                    this.g.c(n32);
                    this.h.c(n32);
                }
                this.i.c(n32);
                this.j.c(n32);
                i = n;
            }
        }
    }
    
    public final void b(final btm btm, final cao cao) {
        cao.c();
        this.a = cao.b();
        this.b = btm.q(cao.a(), 2);
        this.c = new bzx(this.b);
        this.n.E(btm, cao);
    }
    
    public final void c() {
    }
    
    public final void d(final long l, final int n) {
        if (l != -9223372036854775807L) {
            this.l = l;
        }
    }
    
    public final void e() {
        this.k = 0L;
        this.l = -9223372036854775807L;
        btx.d(this.e);
        this.f.b();
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        final bzx c = this.c;
        if (c != null) {
            c.e = false;
            c.f = false;
            c.g = false;
            c.h = false;
            c.i = false;
        }
    }
}
