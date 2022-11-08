import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ah
{
    private static int h = 1000;
    int a;
    public final ag b;
    public af[] c;
    public boolean[] d;
    public int e;
    public int f;
    public final cdn g;
    private int i;
    private int j;
    private int k;
    private ai[] l;
    private int m;
    private af[] n;
    
    public ah() {
        this.a = 0;
        this.b = new ag();
        this.i = 32;
        this.j = 32;
        this.c = null;
        this.d = new boolean[32];
        this.e = 1;
        this.f = 0;
        this.k = 32;
        this.l = new ai[ah.h];
        this.m = 0;
        this.n = new af[32];
        this.c = new af[32];
        this.r();
        this.g = new cdn(null, (byte[])null);
    }
    
    public static af b(final ah ah, ai d, final ai ai, final int n, final float n2, final ai ai2, final ai ai3, final int n3, final boolean b) {
        final af a = ah.a();
        a.d(d, ai, n, n2, ai2, ai3, n3);
        if (b) {
            d = ah.d();
            final ai d2 = ah.d();
            d.c = 4;
            d2.c = 4;
            a.c(d, d2);
        }
        return a;
    }
    
    public static af c(final ah ah, final ai ai, final ai ai2, final int n, final boolean b) {
        final af a = ah.a();
        a.h(ai, ai2, n);
        if (b) {
            ah.k(a, 1);
        }
        return a;
    }
    
    public static final int p(final Object o) {
        final ai f = ((aj)o).f;
        if (f != null) {
            return (int)(f.d + 0.5f);
        }
        return 0;
    }
    
    private final void q() {
        final int i = this.i;
        final int j = i + i;
        this.i = j;
        this.c = Arrays.copyOf(this.c, j);
        final cdn g = this.g;
        g.c = Arrays.copyOf((ai[])g.c, this.i);
        final int k = this.i;
        this.d = new boolean[k];
        this.j = k;
        this.k = k;
        this.b.a.clear();
    }
    
    private final void r() {
        int n = 0;
        while (true) {
            final af[] c = this.c;
            if (n >= c.length) {
                break;
            }
            final af af = c[n];
            if (af != null) {
                ((arcq)this.g.b).s((Object)af);
            }
            this.c[n] = null;
            ++n;
        }
    }
    
    private final ai s(int m) {
        ai ai = (ai)((arcq)this.g.a).r();
        if (ai == null) {
            ai = new ai(m);
        }
        else {
            ai.b();
            ai.h = m;
        }
        m = this.m;
        final int h = ah.h;
        if (m >= h) {
            m = (ah.h = h + h);
            this.l = Arrays.copyOf(this.l, m);
        }
        final ai[] l = this.l;
        m = this.m++;
        return l[m] = ai;
    }
    
    public final af a() {
        af af = (af)((arcq)this.g.b).r();
        if (af == null) {
            af = new af(this.g, null, null, null);
        }
        else {
            af.a = null;
            final ae d = af.d;
            d.e = -1;
            d.f = -1;
            d.g = false;
            d.a = 0;
            af.b = 0.0f;
            af.e = false;
        }
        return af;
    }
    
    public final ai d() {
        if (this.e + 1 >= this.j) {
            this.q();
        }
        final ai s = this.s(4);
        final int n = this.a + 1;
        this.a = n;
        ++this.e;
        s.a = n;
        return ((ai[])this.g.c)[n] = s;
    }
    
    public final ai e(final Object o) {
        if (o == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            this.q();
        }
        final aj aj = (aj)o;
        ai ai;
        if ((ai = aj.f) == null) {
            aj.e();
            ai = aj.f;
        }
        final int a = ai.a;
        if (a != -1) {
            if (a <= this.a && ((ai[])this.g.c)[a] != null) {
                return ai;
            }
            if (a != -1) {
                ai.b();
            }
        }
        final int n = this.a + 1;
        this.a = n;
        ++this.e;
        ai.a = n;
        ai.h = 1;
        ((ai[])this.g.c)[n] = ai;
        return ai;
    }
    
    public final ai f() {
        if (this.e + 1 >= this.j) {
            this.q();
        }
        final ai s = this.s(3);
        final int n = this.a + 1;
        this.a = n;
        ++this.e;
        s.a = n;
        return ((ai[])this.g.c)[n] = s;
    }
    
    public final void g(final af af) {
        if (this.f + 1 >= this.k || this.e + 1 >= this.j) {
            this.q();
        }
        final boolean e = af.e;
        final int n = 0;
        Label_0744: {
            if (!e) {
                if (this.f > 0) {
                    final ae d = af.d;
                    final af[] c = this.c;
                    int n2 = d.e;
                Label_0067:
                    while (true) {
                        for (int n3 = 0; n2 != -1 && n3 < d.a; n2 = d.c[n2], ++n3) {
                            final ai ai = ((ai[])d.h.c)[d.b[n2]];
                            if (ai.b != -1) {
                                final float n4 = d.d[n2];
                                d.c(ai);
                                final af af2 = c[ai.b];
                                if (!af2.e) {
                                    final ae d2 = af2.d;
                                    for (int e2 = d2.e, n5 = 0; e2 != -1 && n5 < d2.a; e2 = d2.c[e2], ++n5) {
                                        d.e(((ai[])d.h.c)[d2.b[e2]], d2.d[e2] * n4);
                                    }
                                }
                                af.b += af2.b * n4;
                                af2.a.a(af);
                                n2 = d.e;
                                continue Label_0067;
                            }
                        }
                        break;
                    }
                    if (af.d.a == 0) {
                        af.e = true;
                    }
                }
                final float b = af.b;
                if (b < 0.0f) {
                    af.b = -b;
                    final ae d3 = af.d;
                    for (int e3 = d3.e, n6 = 0; e3 != -1 && n6 < d3.a; e3 = d3.c[e3], ++n6) {
                        final float[] d4 = d3.d;
                        d4[e3] = -d4[e3];
                    }
                }
                final ae d5 = af.d;
                int e4 = d5.e;
                ai ai2 = null;
                ai ai3 = null;
                while (true) {
                    ai ai4;
                    ai ai5;
                    for (int n7 = 0; e4 != -1 && n7 < d5.a; e4 = d5.c[e4], ++n7, ai2 = ai4, ai3 = ai5) {
                        final float[] d6 = d5.d;
                        final float n8 = d6[e4];
                        float n9 = 0.0f;
                        Label_0508: {
                            if (n8 < 0.0f) {
                                n9 = n8;
                                if (n8 <= -0.001f) {
                                    break Label_0508;
                                }
                                d6[e4] = 0.0f;
                            }
                            else {
                                n9 = n8;
                                if (n8 >= 0.001f) {
                                    break Label_0508;
                                }
                                d6[e4] = 0.0f;
                            }
                            n9 = 0.0f;
                        }
                        ai4 = ai2;
                        ai5 = ai3;
                        if (n9 != 0.0f) {
                            final ai ai6 = ((ai[])d5.h.c)[d5.b[e4]];
                            if (ai6.h == 1) {
                                if (n9 < 0.0f) {
                                    ai2 = ai6;
                                    if (ai2 != null) {
                                        af.a(ai2);
                                    }
                                    if (af.d.a == 0) {
                                        af.e = true;
                                    }
                                    final ai a = af.a;
                                    if (a != null) {
                                        if (a.h == 1) {
                                            break Label_0744;
                                        }
                                        if (af.b >= 0.0f) {
                                            break Label_0744;
                                        }
                                    }
                                    return;
                                }
                                ai4 = ai2;
                                ai5 = ai3;
                                if (ai2 == null) {
                                    ai4 = ai6;
                                    ai5 = ai3;
                                }
                            }
                            else {
                                ai4 = ai2;
                                ai5 = ai3;
                                if (n9 < 0.0f) {
                                    if (ai3 != null) {
                                        ai4 = ai2;
                                        ai5 = ai3;
                                        if (ai6.c >= ai3.c) {
                                            continue;
                                        }
                                    }
                                    ai5 = ai6;
                                    ai4 = ai2;
                                }
                            }
                        }
                    }
                    if (ai2 != null) {
                        continue;
                    }
                    ai2 = ai3;
                    continue;
                }
            }
        }
        final af af3 = this.c[this.f];
        if (af3 != null) {
            ((arcq)this.g.b).s((Object)af3);
        }
        if (!af.e) {
            af.b();
        }
        final af[] c2 = this.c;
        final int f = this.f;
        c2[f] = af;
        final ai a2 = af.a;
        a2.b = f;
        this.f = f + 1;
        final int g = a2.g;
        if (g > 0) {
            af[] n10;
            while (true) {
                n10 = this.n;
                final int length = n10.length;
                if (length >= g) {
                    break;
                }
                this.n = new af[length + length];
            }
            int n11 = 0;
            int i;
            while (true) {
                i = n;
                if (n11 >= g) {
                    break;
                }
                n10[n11] = af.a.f[n11];
                ++n11;
            }
            while (i < g) {
                final af af4 = n10[i];
                if (af4 != af) {
                    af4.d.g(af4, af);
                    af4.b();
                }
                ++i;
            }
        }
    }
    
    public final void h(final ai a, final int n) {
        final int b = a.b;
        if (b == -1) {
            final af a2 = this.a();
            a2.a = a;
            final float n2 = (float)n;
            a.d = n2;
            a2.b = n2;
            a2.e = true;
            this.g(a2);
            return;
        }
        final af af = this.c[b];
        if (af.e) {
            af.b = (float)n;
            return;
        }
        final af a3 = this.a();
        a3.g(a, n);
        this.g(a3);
    }
    
    public final void i(final ai ai, final ai ai2, final int n, final int c) {
        final af a = this.a();
        final ai f = this.f();
        f.c = c;
        a.i(ai, ai2, f, n);
        this.g(a);
    }
    
    public final void j(final ai ai, final ai ai2, final int n, final int c) {
        final af a = this.a();
        final ai f = this.f();
        f.c = c;
        a.j(ai, ai2, f, n);
        this.g(a);
    }
    
    public final void k(final af af, final int n) {
        af.d.f(this.d(), (float)n);
    }
    
    public final void l() {
        int n = 0;
        cdn g;
        while (true) {
            g = this.g;
            final ai[] array = (ai[])g.c;
            if (n >= array.length) {
                break;
            }
            final ai ai = array[n];
            if (ai != null) {
                ai.b();
            }
            ++n;
        }
        final Object a = g.a;
        final ai[] l = this.l;
        final int m = this.m;
        final int length = l.length;
        int n2;
        if ((n2 = m) > length) {
            n2 = length;
        }
        for (final ai ai2 : l) {
            final arcq arcq = (arcq)a;
            final int b = arcq.b;
            if (b < 256) {
                ((Object[])arcq.a)[b] = ai2;
                arcq.b = b + 1;
            }
        }
        this.m = 0;
        Arrays.fill((Object[])this.g.c, null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int j = 0; j < this.f; ++j) {
            this.c[j].c = false;
        }
        this.r();
        this.f = 0;
    }
    
    public final void m(ai d, ai d2, final int n, final float n2, final ai ai, final ai ai2, final int n3) {
        final af a = this.a();
        a.d(d, d2, n, n2, ai, ai2, n3);
        d2 = this.d();
        d = this.d();
        d2.c = 4;
        d.c = 4;
        a.c(d2, d);
        this.g(a);
    }
    
    public final void n(ai d, ai d2, final int n, final int n2) {
        final af a = this.a();
        a.h(d, d2, n);
        d2 = this.d();
        d = this.d();
        d2.c = n2;
        d.c = n2;
        a.c(d2, d);
        this.g(a);
    }
    
    public final void o(final ag ag) {
    Label_0419:
        for (int i = 0; i < this.f; ++i) {
            final af af = this.c[i];
            if (af.a.h != 1 && af.b < 0.0f) {
                while (true) {
                    int j = 0;
                    int b = -1;
                    int n = -1;
                    int n2 = 0;
                    float n3 = Float.MAX_VALUE;
                    while (j < this.f) {
                        final af af2 = this.c[j];
                        int n4;
                        int n5;
                        int n6;
                        float n7;
                        if (af2.a.h == 1) {
                            n4 = b;
                            n5 = n;
                            n6 = n2;
                            n7 = n3;
                        }
                        else {
                            n4 = b;
                            n5 = n;
                            n6 = n2;
                            n7 = n3;
                            if (af2.b < 0.0f) {
                                int n8 = 1;
                                while (true) {
                                    n4 = b;
                                    n5 = n;
                                    n6 = n2;
                                    n7 = n3;
                                    if (n8 >= this.e) {
                                        break;
                                    }
                                    final ai ai = ((ai[])this.g.c)[n8];
                                    final float a = af2.d.a(ai);
                                    int n9;
                                    int n10;
                                    int n11;
                                    float n12;
                                    if (a <= 0.0f) {
                                        n9 = b;
                                        n10 = n;
                                        n11 = n2;
                                        n12 = n3;
                                    }
                                    else {
                                        int n13 = 0;
                                        while (true) {
                                            n9 = b;
                                            n10 = n;
                                            n11 = n2;
                                            n12 = n3;
                                            if (n13 >= 6) {
                                                break;
                                            }
                                            final float n14 = ai.e[n13] / a;
                                            int n15;
                                            if ((n14 < n3 && n13 == n2) || n13 > (n15 = n2)) {
                                                n3 = n14;
                                                b = j;
                                                n = n8;
                                                n15 = n13;
                                            }
                                            ++n13;
                                            n2 = n15;
                                        }
                                    }
                                    ++n8;
                                    b = n9;
                                    n = n10;
                                    n2 = n11;
                                    n3 = n12;
                                }
                            }
                        }
                        ++j;
                        b = n4;
                        n = n5;
                        n2 = n6;
                        n3 = n7;
                    }
                    if (b == -1) {
                        break Label_0419;
                    }
                    final af af3 = this.c[b];
                    af3.a.b = -1;
                    af3.a(((ai[])this.g.c)[n]);
                    af3.a.b = b;
                    for (int k = 0; k < this.f; ++k) {
                        this.c[k].k(af3);
                    }
                    ag.a(this);
                }
            }
            else {}
        }
        for (int l = 0; l < this.f; ++l) {
            final af af4 = this.c[l];
            if (af4.a.h != 1) {
                if (af4.b < 0.0f) {
                    break;
                }
            }
        }
    }
}
