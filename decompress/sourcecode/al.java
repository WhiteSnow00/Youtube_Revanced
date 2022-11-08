import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class al extends an
{
    protected final ah af;
    int ag;
    int ah;
    public int ai;
    public boolean aj;
    public boolean ak;
    private int am;
    private int an;
    private ak[] ao;
    private ak[] ap;
    private ak[] aq;
    private final boolean[] ar;
    private final ak[] as;
    private ixx at;
    
    public al() {
        this.af = new ah();
        this.am = 0;
        this.an = 0;
        this.ao = new ak[4];
        this.ap = new ak[4];
        this.aq = new ak[4];
        this.ai = 2;
        this.ar = new boolean[3];
        this.as = new ak[4];
        this.aj = false;
        this.ak = false;
    }
    
    private final int G(final ah ah, final ak[] array, final ak ak, int n, final boolean[] array2) {
        array2[0] = true;
        array2[1] = false;
        array[2] = (array[0] = null);
        array[3] = (array[1] = null);
        int n2 = 0;
        if (n == 0) {
            final aj b = ak.i.b;
            final boolean b2 = b == null || b.a == this;
            ak.ab = null;
            ak ak2;
            if (ak.K != 8) {
                ak2 = ak;
            }
            else {
                ak2 = null;
            }
            ak ab = ak;
            ak ak3 = null;
            ak ak4 = ak2;
            n = 0;
            ak ak5;
            ak ak6;
            while (true) {
                ak5 = ak2;
                ak6 = ak4;
                n2 = n;
                if (ab.k.b == null) {
                    break;
                }
                ab.ab = null;
                if (ab.K != 8) {
                    ak ak7;
                    if ((ak7 = ak2) == null) {
                        ak7 = ab;
                    }
                    if (ak4 != null && ak4 != ab) {
                        ak4.ab = ab;
                    }
                    ak4 = ab;
                    ak2 = ak7;
                }
                else {
                    final aj i = ab.i;
                    ah.n(i.f, i.b.f, 0, 5);
                    ah.n(ab.k.f, ab.i.f, 0, 5);
                }
                n2 = n;
                if (ab.K != 8) {
                    n2 = n;
                    if (ab.ad == 3) {
                        if (ab.ae == 3) {
                            array2[0] = false;
                        }
                        n2 = n;
                        if (ab.u <= 0.0f) {
                            array2[0] = false;
                            n2 = n + 1;
                            final ak[] ao = this.ao;
                            final int length = ao.length;
                            if (n2 >= length) {
                                this.ao = Arrays.copyOf(ao, length + length);
                            }
                            this.ao[n] = ab;
                        }
                    }
                }
                final ak a = ab.k.b.a;
                final aj b3 = a.i.b;
                if (b3 == null) {
                    ak5 = ak2;
                    ak6 = ak4;
                    break;
                }
                if (b3.a != ab) {
                    ak5 = ak2;
                    ak6 = ak4;
                    break;
                }
                if (a == ab) {
                    ak5 = ak2;
                    ak6 = ak4;
                    break;
                }
                ab = (ak3 = a);
                n = n2;
            }
            final aj b4 = ab.k.b;
            boolean x = b2;
            if (b4 != null) {
                x = b2;
                if (b4.a != this) {
                    x = false;
                }
            }
            if (ak.i.b == null || ak3.k.b == null) {
                array2[1] = true;
            }
            ak.X = x;
            ak3.ab = null;
            array[0] = ak;
            array[2] = ak5;
            array[1] = ak3;
            array[3] = ak6;
        }
        else {
            final aj b5 = ak.j.b;
            final boolean b6 = b5 == null || b5.a == this;
            ak.ac = null;
            ak ak8;
            if (ak.K != 8) {
                ak8 = ak;
            }
            else {
                ak8 = null;
            }
            ak ac = ak;
            ak ak9 = null;
            ak ak10 = ak8;
            n = 0;
            ak ak11 = null;
            ak ak12 = null;
            Label_0930: {
                while (true) {
                    ak11 = ak8;
                    ak12 = ak10;
                    n2 = n;
                    if (ac.l.b == null) {
                        break Label_0930;
                    }
                    ac.ac = null;
                    if (ac.K != 8) {
                        ak ak13;
                        if ((ak13 = ak8) == null) {
                            ak13 = ac;
                        }
                        if (ak10 != null && ak10 != ac) {
                            ak10.ac = ac;
                        }
                        ak10 = ac;
                        ak8 = ak13;
                    }
                    else {
                        final aj j = ac.j;
                        ah.n(j.f, j.b.f, 0, 5);
                        ah.n(ac.l.f, ac.j.f, 0, 5);
                    }
                    if (ac.K != 8 && ac.ae == 3) {
                        if (ac.ad == 3) {
                            array2[0] = false;
                        }
                        n2 = n;
                        if (ac.u <= 0.0f) {
                            array2[0] = false;
                            n2 = n + 1;
                            final ak[] ao2 = this.ao;
                            final int length2 = ao2.length;
                            if (n2 >= length2) {
                                this.ao = Arrays.copyOf(ao2, length2 + length2);
                            }
                            this.ao[n] = ac;
                        }
                    }
                    else {
                        n2 = n;
                    }
                    final ak a2 = ac.l.b.a;
                    final aj b7 = a2.j.b;
                    if (b7 == null) {
                        break;
                    }
                    if (b7.a != ac) {
                        break;
                    }
                    if (a2 == ac) {
                        break;
                    }
                    ac = (ak9 = a2);
                    n = n2;
                }
                ak11 = ak8;
                ak12 = ak10;
            }
            final aj b8 = ac.l.b;
            boolean y = b6;
            if (b8 != null) {
                y = b6;
                if (b8.a != this) {
                    y = false;
                }
            }
            if (ak.j.b == null || ak9.l.b == null) {
                array2[1] = true;
            }
            ak.Y = y;
            ak9.ac = null;
            array[0] = ak;
            array[2] = ak11;
            array[1] = ak9;
            array[3] = ak12;
        }
        return n2;
    }
    
    private final void H(final ah ah) {
        int n = 0;
        while (true) {
            boolean b = false;
            if (n >= this.am) {
                break;
            }
            final ak ak = this.aq[n];
            final int g = this.G(ah, this.as, ak, 0, this.ar);
            ak ak2 = this.as[2];
            Label_0059: {
                if (ak2 != null) {
                    final boolean[] ar = this.ar;
                    if (ar[1]) {
                        int b2 = ak.b();
                        while (ak2 != null) {
                            ah.h(ak2.i.f, b2);
                            final ak ab = ak2.ab;
                            b2 += ak2.i.a() + ak2.h() + ak2.k.a();
                            ak2 = ab;
                        }
                    }
                    else {
                        final int v = ak.V;
                        final boolean b3 = v == 0;
                        final boolean b4 = v == 2;
                        final int ad = this.ad;
                        final int ai = this.ai;
                        float n2 = 0.0f;
                        if ((ai == 2 || ai == 8) && ar[0] && ak.X && !b4 && ad != 2 && v == 0) {
                            ak ak3 = ak;
                            ak ak4 = null;
                            int n3 = 0;
                            float n4 = 0.0f;
                            int n5 = 0;
                            while (ak3 != null) {
                                if (ak3.K != 8) {
                                    ++n3;
                                    if (ak3.ad != 3) {
                                        final int h = ak3.h();
                                        final aj i = ak3.i;
                                        int a;
                                        if (i.b != null) {
                                            a = i.a();
                                        }
                                        else {
                                            a = 0;
                                        }
                                        final aj k = ak3.k;
                                        int a2;
                                        if (k.b != null) {
                                            a2 = k.a();
                                        }
                                        else {
                                            a2 = 0;
                                        }
                                        n5 = n5 + h + a + a2;
                                    }
                                    else {
                                        n4 += ak3.Z;
                                    }
                                }
                                final aj b5 = ak3.k.b;
                                ak a3;
                                if (b5 != null) {
                                    a3 = b5.a;
                                }
                                else {
                                    a3 = null;
                                }
                                ak ak5 = a3;
                                Label_0438: {
                                    if (a3 != null) {
                                        final aj b6 = a3.i.b;
                                        if (b6 != null) {
                                            ak5 = a3;
                                            if (b6.a == ak3) {
                                                break Label_0438;
                                            }
                                        }
                                        ak5 = null;
                                    }
                                }
                                ak4 = ak3;
                                ak3 = ak5;
                            }
                            int g2;
                            if (ak4 != null) {
                                final aj b7 = ak4.k.b;
                                int w;
                                if (b7 != null) {
                                    w = b7.a.w;
                                }
                                else {
                                    w = 0;
                                }
                                g2 = w;
                                if (b7 != null) {
                                    g2 = w;
                                    if (b7.a == this) {
                                        g2 = this.g();
                                    }
                                }
                            }
                            else {
                                g2 = 0;
                            }
                            final float n6 = g2 - (float)n5;
                            float n7 = n6 / (n3 + 1);
                            float n8;
                            ak ak6;
                            if (g == 0) {
                                n8 = n7;
                                ak6 = ak;
                            }
                            else {
                                n8 = n6 / g;
                                n7 = 0.0f;
                                ak6 = ak;
                            }
                            while (ak6 != null) {
                                final aj j = ak6.i;
                                int a4;
                                if (j.b != null) {
                                    a4 = j.a();
                                }
                                else {
                                    a4 = 0;
                                }
                                final aj l = ak6.k;
                                int a5;
                                if (l.b != null) {
                                    a5 = l.a();
                                }
                                else {
                                    a5 = 0;
                                }
                                if (ak6.K != 8) {
                                    final float n9 = (float)a4;
                                    final float n10 = n7 + n9;
                                    ah.h(ak6.i.f, (int)(n10 + 0.5f));
                                    float n11 = 0.0f;
                                    Label_0735: {
                                        float n12;
                                        if (ak6.ad == 3) {
                                            if (n4 != 0.0f) {
                                                n11 = n10 + (ak6.Z * n6 / n4 - n9 - a5);
                                                break Label_0735;
                                            }
                                            n12 = n8 - n9 - a5;
                                        }
                                        else {
                                            n12 = (float)ak6.h();
                                        }
                                        n11 = n10 + n12;
                                    }
                                    ah.h(ak6.k.f, (int)(n11 + 0.5f));
                                    float n13 = n11;
                                    if (g == 0) {
                                        n13 = n11 + n8;
                                    }
                                    n7 = n13 + a5;
                                }
                                else {
                                    final int n14 = (int)(n7 - n8 / 2.0f + 0.5f);
                                    ah.h(ak6.i.f, n14);
                                    ah.h(ak6.k.f, n14);
                                }
                                final aj b8 = ak6.k.b;
                                ak a6;
                                if (b8 != null) {
                                    a6 = b8.a;
                                }
                                else {
                                    a6 = null;
                                }
                                if (a6 != null) {
                                    final aj b9 = a6.i.b;
                                    if (b9 != null && b9.a != ak6) {
                                        a6 = null;
                                    }
                                }
                                if ((ak6 = a6) == this) {
                                    ak6 = null;
                                }
                            }
                        }
                        else {
                            ak a7;
                            ak ak8;
                            ak ak7;
                            ak ak9;
                            if (g != 0) {
                                if (b4) {
                                    a7 = ak2;
                                    ak7 = (ak8 = null);
                                    ak9 = ak;
                                }
                                else {
                                    ak ak10 = null;
                                    while (ak2 != null) {
                                        if (ak2.ad != 3) {
                                            int a8 = ak2.i.a();
                                            if (ak10 != null) {
                                                a8 += ak10.k.a();
                                            }
                                            final aj m = ak2.i;
                                            final aj b10 = m.b;
                                            int n15;
                                            if (b10.a.ad == 3) {
                                                n15 = 2;
                                            }
                                            else {
                                                n15 = 3;
                                            }
                                            ah.i(m.f, b10.f, a8, n15);
                                            final int a9 = ak2.k.a();
                                            final aj i2 = ak2.k.b.a.i;
                                            final aj b11 = i2.b;
                                            int n16 = a9;
                                            if (b11 != null) {
                                                n16 = a9;
                                                if (b11.a == ak2) {
                                                    n16 = a9 + i2.a();
                                                }
                                            }
                                            final aj k2 = ak2.k;
                                            final aj b12 = k2.b;
                                            int n17;
                                            if (b12.a.ad == 3) {
                                                n17 = 2;
                                            }
                                            else {
                                                n17 = 3;
                                            }
                                            ah.j(k2.f, b12.f, -n16, n17);
                                        }
                                        else {
                                            n2 += ak2.Z;
                                            final aj k3 = ak2.k;
                                            int a10;
                                            if (k3.b != null) {
                                                a10 = k3.a();
                                                if (ak2 != this.as[3]) {
                                                    a10 += ak2.k.b.a.i.a();
                                                }
                                            }
                                            else {
                                                a10 = 0;
                                            }
                                            ah.i(ak2.k.f, ak2.i.f, 0, 1);
                                            final aj k4 = ak2.k;
                                            ah.j(k4.f, k4.b.f, -a10, 1);
                                        }
                                        final ak ab2 = ak2.ab;
                                        ak10 = ak2;
                                        ak2 = ab2;
                                    }
                                    if (g == 1) {
                                        final ak ak11 = this.ao[0];
                                        final int a11 = ak11.i.a();
                                        final aj b13 = ak11.i.b;
                                        int n18 = a11;
                                        if (b13 != null) {
                                            n18 = a11 + b13.a();
                                        }
                                        final int a12 = ak11.k.a();
                                        final aj b14 = ak11.k.b;
                                        int n19 = a12;
                                        if (b14 != null) {
                                            n19 = a12 + b14.a();
                                        }
                                        ai ai2 = ak.k.b.f;
                                        final ak[] as = this.as;
                                        if (ak11 == as[3]) {
                                            ai2 = as[1].k.b.f;
                                        }
                                        if (ak11.c == 1) {
                                            final aj i3 = ak.i;
                                            ah.i(i3.f, i3.b.f, n18, 1);
                                            ah.j(ak.k.f, ai2, -n19, 1);
                                            ah.n(ak.k.f, ak.i.f, ak.h(), 2);
                                            break Label_0059;
                                        }
                                        final aj i4 = ak11.i;
                                        ah.n(i4.f, i4.b.f, n18, 1);
                                        ah.n(ak11.k.f, ai2, -n19, 1);
                                        break Label_0059;
                                    }
                                    else {
                                        int n20 = 0;
                                        final int n21 = g;
                                        while (true) {
                                            final int n22 = n21 - 1;
                                            if (n20 >= n22) {
                                                break Label_0059;
                                            }
                                            final ak[] ao = this.ao;
                                            final ak ak12 = ao[n20];
                                            final int n23 = n20 + 1;
                                            final ak ak13 = ao[n23];
                                            final aj i5 = ak12.i;
                                            final ai f = i5.f;
                                            final ai f2 = ak12.k.f;
                                            final ai f3 = ak13.i.f;
                                            ai ai3 = ak13.k.f;
                                            final ak[] as2 = this.as;
                                            if (ak13 == as2[3]) {
                                                ai3 = as2[1].k.f;
                                            }
                                            final int a13 = i5.a();
                                            final aj b15 = ak12.i.b;
                                            int n24 = a13;
                                            if (b15 != null) {
                                                final aj k5 = b15.a.k;
                                                final aj b16 = k5.b;
                                                n24 = a13;
                                                if (b16 != null) {
                                                    n24 = a13;
                                                    if (b16.a == ak12) {
                                                        n24 = a13 + k5.a();
                                                    }
                                                }
                                            }
                                            ah.i(f, ak12.i.b.f, n24, 2);
                                            int a14;
                                            final int n25 = a14 = ak12.k.a();
                                            if (ak12.k.b != null) {
                                                final ak ab3 = ak12.ab;
                                                a14 = n25;
                                                if (ab3 != null) {
                                                    final aj i6 = ab3.i;
                                                    int a15;
                                                    if (i6.b != null) {
                                                        a15 = i6.a();
                                                    }
                                                    else {
                                                        a15 = 0;
                                                    }
                                                    a14 = n25 + a15;
                                                }
                                            }
                                            ah.j(f2, ak12.k.b.f, -a14, 2);
                                            if (n23 == n22) {
                                                final int a16 = ak13.i.a();
                                                final aj b17 = ak13.i.b;
                                                int n26 = a16;
                                                if (b17 != null) {
                                                    final aj k6 = b17.a.k;
                                                    final aj b18 = k6.b;
                                                    n26 = a16;
                                                    if (b18 != null) {
                                                        n26 = a16;
                                                        if (b18.a == ak13) {
                                                            n26 = a16 + k6.a();
                                                        }
                                                    }
                                                }
                                                ah.i(f3, ak13.i.b.f, n26, 2);
                                                aj aj = ak13.k;
                                                final ak[] as3 = this.as;
                                                if (ak13 == as3[3]) {
                                                    aj = as3[1].k;
                                                }
                                                final int a17 = aj.a();
                                                final aj b19 = aj.b;
                                                int n27 = a17;
                                                if (b19 != null) {
                                                    final aj i7 = b19.a.i;
                                                    final aj b20 = i7.b;
                                                    n27 = a17;
                                                    if (b20 != null) {
                                                        n27 = a17;
                                                        if (b20.a == ak13) {
                                                            n27 = a17 + i7.a();
                                                        }
                                                    }
                                                }
                                                ah.j(ai3, aj.b.f, -n27, 2);
                                            }
                                            final int f4 = ak.f;
                                            if (f4 > 0) {
                                                ah.j(f2, f, f4, 2);
                                            }
                                            final af a18 = ah.a();
                                            a18.f(ak12.Z, n2, ak13.Z, f, ak12.i.a(), f2, ak12.k.a(), f3, ak13.i.a(), ai3, ak13.k.a());
                                            ah.g(a18);
                                            n20 = n23;
                                        }
                                    }
                                }
                            }
                            else {
                                a7 = ak2;
                                ak7 = (ak8 = null);
                                b = false;
                                ak9 = ak;
                            }
                            while (true) {
                                final ak ak14 = a7;
                                if (ak14 == null) {
                                    break;
                                }
                                final ak ab4 = ak14.ab;
                                if (ab4 == null) {
                                    ak7 = this.as[1];
                                    b = true;
                                }
                                Label_2604: {
                                    ak ak15 = null;
                                    Label_2600: {
                                        if (b4) {
                                            final aj i8 = ak14.i;
                                            int a19 = i8.a();
                                            if (ak8 != null) {
                                                a19 += ak8.k.a();
                                            }
                                            int n28;
                                            if (ak2 != ak14) {
                                                n28 = 3;
                                            }
                                            else {
                                                n28 = 1;
                                            }
                                            ah.i(i8.f, i8.b.f, a19, n28);
                                            if (ak14.ad == 3) {
                                                final aj k7 = ak14.k;
                                                if (ak14.c == 1) {
                                                    ah.n(k7.f, i8.f, Math.max(ak14.e, ak14.h()), 3);
                                                }
                                                else {
                                                    ah.i(i8.f, i8.b.f, i8.c, 3);
                                                    ah.j(k7.f, i8.f, ak14.e, 3);
                                                }
                                            }
                                        }
                                        else if (!b3 && b && ak8 != null) {
                                            final aj k8 = ak14.k;
                                            if (k8.b == null) {
                                                ah.h(k8.f, ak14.b() + ak14.y);
                                            }
                                            else {
                                                ah.n(ak14.k.f, ak7.k.b.f, -k8.a(), 5);
                                            }
                                        }
                                        else if (!b3 && !b && ak8 == null) {
                                            final aj i9 = ak14.i;
                                            if (i9.b == null) {
                                                ah.h(i9.f, ak14.b());
                                            }
                                            else {
                                                ah.n(ak14.i.f, ak9.i.b.f, i9.a(), 5);
                                            }
                                        }
                                        else {
                                            final aj i10 = ak14.i;
                                            final aj k9 = ak14.k;
                                            final int a20 = i10.a();
                                            final int a21 = k9.a();
                                            ah.i(i10.f, i10.b.f, a20, 1);
                                            ah.j(k9.f, k9.b.f, -a21, 1);
                                            final aj b21 = i10.b;
                                            ai ai4;
                                            if (b21 != null) {
                                                ai4 = b21.f;
                                            }
                                            else {
                                                ai4 = null;
                                            }
                                            ai ai5 = null;
                                            Label_2741: {
                                                if (ak8 == null) {
                                                    final aj b22 = ak9.i.b;
                                                    if (b22 == null) {
                                                        ai5 = null;
                                                        break Label_2741;
                                                    }
                                                    ai4 = b22.f;
                                                }
                                                ai5 = ai4;
                                            }
                                            a7 = ab4;
                                            if (ab4 == null) {
                                                final aj b23 = ak7.k.b;
                                                if (b23 != null) {
                                                    a7 = b23.a;
                                                }
                                                else {
                                                    a7 = null;
                                                }
                                            }
                                            if ((ak15 = a7) == null) {
                                                break Label_2600;
                                            }
                                            ai ai6 = a7.i.f;
                                            if (b) {
                                                final aj b24 = ak7.k.b;
                                                if (b24 != null) {
                                                    ai6 = b24.f;
                                                }
                                                else {
                                                    ai6 = null;
                                                }
                                            }
                                            ak15 = a7;
                                            if (ai5 == null) {
                                                break Label_2600;
                                            }
                                            ak15 = a7;
                                            if (ai6 != null) {
                                                ah.m(i10.f, ai5, a20, 0.5f, ai6, k9.f, a21);
                                                break Label_2604;
                                            }
                                            break Label_2600;
                                        }
                                        ak15 = ab4;
                                    }
                                    a7 = ak15;
                                }
                                if (b) {
                                    a7 = null;
                                }
                                ak8 = ak14;
                            }
                            final int n29 = n = n;
                            if (b4) {
                                final aj i11 = ak2.i;
                                final aj k10 = ak7.k;
                                final int a22 = i11.a();
                                final int a23 = k10.a();
                                final aj b25 = ak9.i.b;
                                ai f5;
                                if (b25 != null) {
                                    f5 = b25.f;
                                }
                                else {
                                    f5 = null;
                                }
                                final aj b26 = ak7.k.b;
                                ai f6;
                                if (b26 != null) {
                                    f6 = b26.f;
                                }
                                else {
                                    f6 = null;
                                }
                                n = n29;
                                if (f5 != null) {
                                    n = n29;
                                    if (f6 != null) {
                                        ah.j(k10.f, f6, -a23, 1);
                                        ah.m(i11.f, f5, a22, ak9.H, f6, k10.f, a23);
                                        n = n29;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ++n;
        }
    }
    
    private final void I(final ah ah) {
        int n = 0;
        while (true) {
            boolean b = false;
            if (n >= this.an) {
                break;
            }
            final ak ak = this.ap[n];
            final int g = this.G(ah, this.as, ak, 1, this.ar);
            ak ak2 = this.as[2];
            int n30 = 0;
            Label_3123: {
                Label_0059: {
                    if (ak2 != null) {
                        final boolean[] ar = this.ar;
                        if (ar[1]) {
                            int c = ak.c();
                            while (ak2 != null) {
                                ah.h(ak2.j.f, c);
                                final ak ac = ak2.ac;
                                c += ak2.j.a() + ak2.d() + ak2.l.a();
                                ak2 = ac;
                            }
                        }
                        else {
                            final int w = ak.W;
                            final boolean b2 = w == 0;
                            final boolean b3 = w == 2;
                            final int ae = this.ae;
                            final int ai = this.ai;
                            float n2 = 0.0f;
                            if ((ai == 2 || ai == 8) && ar[0] && ak.Y && !b3 && ae != 2 && w == 0) {
                                ak ak3 = ak;
                                ak ak4 = null;
                                int n3 = 0;
                                float n4 = 0.0f;
                                int n5 = 0;
                                while (ak3 != null) {
                                    if (ak3.K != 8) {
                                        ++n3;
                                        if (ak3.ae != 3) {
                                            final int d = ak3.d();
                                            final aj j = ak3.j;
                                            int a;
                                            if (j.b != null) {
                                                a = j.a();
                                            }
                                            else {
                                                a = 0;
                                            }
                                            final aj l = ak3.l;
                                            int a2;
                                            if (l.b != null) {
                                                a2 = l.a();
                                            }
                                            else {
                                                a2 = 0;
                                            }
                                            n5 = n5 + d + a + a2;
                                        }
                                        else {
                                            n4 += ak3.aa;
                                        }
                                    }
                                    final aj b4 = ak3.l.b;
                                    ak a3;
                                    if (b4 != null) {
                                        a3 = b4.a;
                                    }
                                    else {
                                        a3 = null;
                                    }
                                    ak ak5 = a3;
                                    Label_0440: {
                                        if (a3 != null) {
                                            final aj b5 = a3.j.b;
                                            if (b5 != null) {
                                                ak5 = a3;
                                                if (b5.a == ak3) {
                                                    break Label_0440;
                                                }
                                            }
                                            ak5 = null;
                                        }
                                    }
                                    ak4 = ak3;
                                    ak3 = ak5;
                                }
                                int a4;
                                if (ak4 != null) {
                                    final aj b6 = ak4.l.b;
                                    int w2;
                                    if (b6 != null) {
                                        w2 = b6.a.w;
                                    }
                                    else {
                                        w2 = 0;
                                    }
                                    a4 = w2;
                                    if (b6 != null) {
                                        a4 = w2;
                                        if (b6.a == this) {
                                            a4 = this.a();
                                        }
                                    }
                                }
                                else {
                                    a4 = 0;
                                }
                                final float n6 = a4 - (float)n5;
                                float n7 = n6 / (n3 + 1);
                                float n8;
                                ak ak6;
                                if (g == 0) {
                                    n8 = n7;
                                    ak6 = ak;
                                }
                                else {
                                    n8 = n6 / g;
                                    n7 = 0.0f;
                                    ak6 = ak;
                                }
                                while (ak6 != null) {
                                    final aj i = ak6.j;
                                    int a5;
                                    if (i.b != null) {
                                        a5 = i.a();
                                    }
                                    else {
                                        a5 = 0;
                                    }
                                    final aj k = ak6.l;
                                    int a6;
                                    if (k.b != null) {
                                        a6 = k.a();
                                    }
                                    else {
                                        a6 = 0;
                                    }
                                    if (ak6.K != 8) {
                                        final float n9 = (float)a5;
                                        final float n10 = n7 + n9;
                                        ah.h(ak6.j.f, (int)(n10 + 0.5f));
                                        float n11 = 0.0f;
                                        Label_0737: {
                                            float n12;
                                            if (ak6.ae == 3) {
                                                if (n4 != 0.0f) {
                                                    n11 = n10 + (ak6.aa * n6 / n4 - n9 - a6);
                                                    break Label_0737;
                                                }
                                                n12 = n8 - n9 - a6;
                                            }
                                            else {
                                                n12 = (float)ak6.d();
                                            }
                                            n11 = n10 + n12;
                                        }
                                        ah.h(ak6.l.f, (int)(n11 + 0.5f));
                                        float n13 = n11;
                                        if (g == 0) {
                                            n13 = n11 + n8;
                                        }
                                        n7 = n13 + a6;
                                    }
                                    else {
                                        final int n14 = (int)(n7 - n8 / 2.0f + 0.5f);
                                        ah.h(ak6.j.f, n14);
                                        ah.h(ak6.l.f, n14);
                                    }
                                    final aj b7 = ak6.l.b;
                                    ak a7;
                                    if (b7 != null) {
                                        a7 = b7.a;
                                    }
                                    else {
                                        a7 = null;
                                    }
                                    if (a7 != null) {
                                        final aj b8 = a7.j.b;
                                        if (b8 != null && b8.a != ak6) {
                                            a7 = null;
                                        }
                                    }
                                    if ((ak6 = a7) == this) {
                                        ak6 = null;
                                    }
                                }
                            }
                            else {
                                ak a8;
                                ak ak8;
                                ak ak7;
                                ak ak9;
                                if (g != 0) {
                                    if (b3) {
                                        a8 = ak2;
                                        ak7 = (ak8 = null);
                                        ak9 = ak;
                                    }
                                    else {
                                        ak ak10 = null;
                                        while (ak2 != null) {
                                            if (ak2.ae != 3) {
                                                int a9 = ak2.j.a();
                                                if (ak10 != null) {
                                                    a9 += ak10.l.a();
                                                }
                                                final aj m = ak2.j;
                                                final aj b9 = m.b;
                                                int n15;
                                                if (b9.a.ae == 3) {
                                                    n15 = 2;
                                                }
                                                else {
                                                    n15 = 3;
                                                }
                                                ah.i(m.f, b9.f, a9, n15);
                                                final int a10 = ak2.l.a();
                                                final aj j2 = ak2.l.b.a.j;
                                                final aj b10 = j2.b;
                                                int n16 = a10;
                                                if (b10 != null) {
                                                    n16 = a10;
                                                    if (b10.a == ak2) {
                                                        n16 = a10 + j2.a();
                                                    }
                                                }
                                                final aj l2 = ak2.l;
                                                final aj b11 = l2.b;
                                                int n17;
                                                if (b11.a.ae == 3) {
                                                    n17 = 2;
                                                }
                                                else {
                                                    n17 = 3;
                                                }
                                                ah.j(l2.f, b11.f, -n16, n17);
                                            }
                                            else {
                                                n2 += ak2.aa;
                                                final aj l3 = ak2.l;
                                                int a11;
                                                if (l3.b != null) {
                                                    a11 = l3.a();
                                                    if (ak2 != this.as[3]) {
                                                        a11 += ak2.l.b.a.j.a();
                                                    }
                                                }
                                                else {
                                                    a11 = 0;
                                                }
                                                ah.i(ak2.l.f, ak2.j.f, 0, 1);
                                                final aj l4 = ak2.l;
                                                ah.j(l4.f, l4.b.f, -a11, 1);
                                            }
                                            final ak ac2 = ak2.ac;
                                            ak10 = ak2;
                                            ak2 = ac2;
                                        }
                                        if (g == 1) {
                                            final ak ak11 = this.ao[0];
                                            final int a12 = ak11.j.a();
                                            final aj b12 = ak11.j.b;
                                            int n18 = a12;
                                            if (b12 != null) {
                                                n18 = a12 + b12.a();
                                            }
                                            final int a13 = ak11.l.a();
                                            final aj b13 = ak11.l.b;
                                            int n19 = a13;
                                            if (b13 != null) {
                                                n19 = a13 + b13.a();
                                            }
                                            ai ai2 = ak.l.b.f;
                                            final ak[] as = this.as;
                                            if (ak11 == as[3]) {
                                                ai2 = as[1].l.b.f;
                                            }
                                            if (ak11.d == 1) {
                                                final aj j3 = ak.j;
                                                ah.i(j3.f, j3.b.f, n18, 1);
                                                ah.j(ak.l.f, ai2, -n19, 1);
                                                ah.n(ak.l.f, ak.j.f, ak.d(), 2);
                                                break Label_0059;
                                            }
                                            final aj j4 = ak11.j;
                                            ah.n(j4.f, j4.b.f, n18, 1);
                                            ah.n(ak11.l.f, ai2, -n19, 1);
                                            break Label_0059;
                                        }
                                        else {
                                            int n20 = 0;
                                            final int n21 = g;
                                            while (true) {
                                                final int n22 = n21 - 1;
                                                if (n20 >= n22) {
                                                    break Label_0059;
                                                }
                                                final ak[] ao = this.ao;
                                                final ak ak12 = ao[n20];
                                                final int n23 = n20 + 1;
                                                final ak ak13 = ao[n23];
                                                final aj j5 = ak12.j;
                                                final ai f = j5.f;
                                                final ai f2 = ak12.l.f;
                                                final ai f3 = ak13.j.f;
                                                ai ai3 = ak13.l.f;
                                                final ak[] as2 = this.as;
                                                if (ak13 == as2[3]) {
                                                    ai3 = as2[1].l.f;
                                                }
                                                final int a14 = j5.a();
                                                final aj b14 = ak12.j.b;
                                                int n24 = a14;
                                                if (b14 != null) {
                                                    final aj l5 = b14.a.l;
                                                    final aj b15 = l5.b;
                                                    n24 = a14;
                                                    if (b15 != null) {
                                                        n24 = a14;
                                                        if (b15.a == ak12) {
                                                            n24 = a14 + l5.a();
                                                        }
                                                    }
                                                }
                                                ah.i(f, ak12.j.b.f, n24, 2);
                                                int a15;
                                                final int n25 = a15 = ak12.l.a();
                                                if (ak12.l.b != null) {
                                                    final ak ac3 = ak12.ac;
                                                    a15 = n25;
                                                    if (ac3 != null) {
                                                        final aj j6 = ac3.j;
                                                        int a16;
                                                        if (j6.b != null) {
                                                            a16 = j6.a();
                                                        }
                                                        else {
                                                            a16 = 0;
                                                        }
                                                        a15 = n25 + a16;
                                                    }
                                                }
                                                ah.j(f2, ak12.l.b.f, -a15, 2);
                                                if (n23 == n22) {
                                                    final int a17 = ak13.j.a();
                                                    final aj b16 = ak13.j.b;
                                                    int n26 = a17;
                                                    if (b16 != null) {
                                                        final aj l6 = b16.a.l;
                                                        final aj b17 = l6.b;
                                                        n26 = a17;
                                                        if (b17 != null) {
                                                            n26 = a17;
                                                            if (b17.a == ak13) {
                                                                n26 = a17 + l6.a();
                                                            }
                                                        }
                                                    }
                                                    ah.i(f3, ak13.j.b.f, n26, 2);
                                                    aj aj = ak13.l;
                                                    final ak[] as3 = this.as;
                                                    if (ak13 == as3[3]) {
                                                        aj = as3[1].l;
                                                    }
                                                    final int a18 = aj.a();
                                                    final aj b18 = aj.b;
                                                    int n27 = a18;
                                                    if (b18 != null) {
                                                        final aj j7 = b18.a.j;
                                                        final aj b19 = j7.b;
                                                        n27 = a18;
                                                        if (b19 != null) {
                                                            n27 = a18;
                                                            if (b19.a == ak13) {
                                                                n27 = a18 + j7.a();
                                                            }
                                                        }
                                                    }
                                                    ah.j(ai3, aj.b.f, -n27, 2);
                                                }
                                                final int h = ak.h;
                                                if (h > 0) {
                                                    ah.j(f2, f, h, 2);
                                                }
                                                final af a19 = ah.a();
                                                a19.f(ak12.aa, n2, ak13.aa, f, ak12.j.a(), f2, ak12.l.a(), f3, ak13.j.a(), ai3, ak13.l.a());
                                                ah.g(a19);
                                                n20 = n23;
                                            }
                                        }
                                    }
                                }
                                else {
                                    a8 = ak2;
                                    ak7 = (ak8 = null);
                                    b = false;
                                    ak9 = ak;
                                }
                                while (true) {
                                    final ak ak14 = a8;
                                    if (ak14 == null) {
                                        break;
                                    }
                                    final ak ac4 = ak14.ac;
                                    if (ac4 == null) {
                                        ak7 = this.as[1];
                                        b = true;
                                    }
                                    Label_2689: {
                                        ak ak15 = null;
                                        Label_2685: {
                                            if (b3) {
                                                final aj j8 = ak14.j;
                                                int a20;
                                                final int n28 = a20 = j8.a();
                                                if (ak8 != null) {
                                                    a20 = n28 + ak8.l.a();
                                                }
                                                int n29;
                                                if (ak2 != ak14) {
                                                    n29 = 3;
                                                }
                                                else {
                                                    n29 = 1;
                                                }
                                                final aj b20 = j8.b;
                                                ai ai4;
                                                ai ai5;
                                                if (b20 != null) {
                                                    ai4 = j8.f;
                                                    ai5 = b20.f;
                                                }
                                                else {
                                                    final aj m2 = ak14.m;
                                                    final aj b21 = m2.b;
                                                    if (b21 != null) {
                                                        ai4 = m2.f;
                                                        ai5 = b21.f;
                                                        a20 -= j8.a();
                                                    }
                                                    else {
                                                        ai5 = (ai4 = null);
                                                    }
                                                }
                                                if (ai4 != null && ai5 != null) {
                                                    ah.i(ai4, ai5, a20, n29);
                                                }
                                                if (ak14.ae == 3) {
                                                    final aj l7 = ak14.l;
                                                    if (ak14.d == 1) {
                                                        ah.n(l7.f, j8.f, Math.max(ak14.g, ak14.d()), 3);
                                                    }
                                                    else {
                                                        ah.i(j8.f, j8.b.f, j8.c, 3);
                                                        ah.j(l7.f, j8.f, ak14.g, 3);
                                                    }
                                                }
                                            }
                                            else if (!b2 && b && ak8 != null) {
                                                final aj l8 = ak14.l;
                                                if (l8.b == null) {
                                                    ah.h(l8.f, ak14.c() + ak14.z);
                                                }
                                                else {
                                                    ah.n(ak14.l.f, ak7.l.b.f, -l8.a(), 5);
                                                }
                                            }
                                            else if (!b2 && !b && ak8 == null) {
                                                final aj j9 = ak14.j;
                                                if (j9.b == null) {
                                                    ah.h(j9.f, ak14.c());
                                                }
                                                else {
                                                    ah.n(ak14.j.f, ak9.j.b.f, j9.a(), 5);
                                                }
                                            }
                                            else {
                                                final aj j10 = ak14.j;
                                                final aj l9 = ak14.l;
                                                final int a21 = j10.a();
                                                final int a22 = l9.a();
                                                ah.i(j10.f, j10.b.f, a21, 1);
                                                ah.j(l9.f, l9.b.f, -a22, 1);
                                                final aj b22 = j10.b;
                                                ai ai6;
                                                if (b22 != null) {
                                                    ai6 = b22.f;
                                                }
                                                else {
                                                    ai6 = null;
                                                }
                                                ai ai7 = null;
                                                Label_2826: {
                                                    if (ak8 == null) {
                                                        final aj b23 = ak9.j.b;
                                                        if (b23 == null) {
                                                            ai7 = null;
                                                            break Label_2826;
                                                        }
                                                        ai6 = b23.f;
                                                    }
                                                    ai7 = ai6;
                                                }
                                                a8 = ac4;
                                                if (ac4 == null) {
                                                    final aj b24 = ak7.l.b;
                                                    if (b24 != null) {
                                                        a8 = b24.a;
                                                    }
                                                    else {
                                                        a8 = null;
                                                    }
                                                }
                                                if ((ak15 = a8) == null) {
                                                    break Label_2685;
                                                }
                                                ai ai8 = a8.j.f;
                                                if (b) {
                                                    final aj b25 = ak7.l.b;
                                                    if (b25 != null) {
                                                        ai8 = b25.f;
                                                    }
                                                    else {
                                                        ai8 = null;
                                                    }
                                                }
                                                ak15 = a8;
                                                if (ai7 == null) {
                                                    break Label_2685;
                                                }
                                                ak15 = a8;
                                                if (ai8 != null) {
                                                    ah.m(j10.f, ai7, a21, 0.5f, ai8, l9.f, a22);
                                                    break Label_2689;
                                                }
                                                break Label_2685;
                                            }
                                            ak15 = ac4;
                                        }
                                        a8 = ak15;
                                    }
                                    if (b) {
                                        a8 = null;
                                    }
                                    ak8 = ak14;
                                }
                                n30 = n;
                                if (!b3) {
                                    break Label_3123;
                                }
                                final aj j11 = ak2.j;
                                final aj l10 = ak7.l;
                                final int a23 = j11.a();
                                final int a24 = l10.a();
                                final aj b26 = ak9.j.b;
                                ai f4;
                                if (b26 != null) {
                                    f4 = b26.f;
                                }
                                else {
                                    f4 = null;
                                }
                                final aj b27 = ak7.l.b;
                                ai f5;
                                if (b27 != null) {
                                    f5 = b27.f;
                                }
                                else {
                                    f5 = null;
                                }
                                n30 = n;
                                if (f4 == null) {
                                    break Label_3123;
                                }
                                n30 = n;
                                if (f5 != null) {
                                    ah.j(l10.f, f5, -a24, 1);
                                    ah.m(j11.f, f4, a23, ak9.I, f5, l10.f, a24);
                                    n30 = n;
                                }
                                break Label_3123;
                            }
                        }
                    }
                }
                n30 = n;
            }
            n = n30 + 1;
        }
    }
    
    final void A(ak a, int n) {
        final int n2 = 0;
        final int n3 = 0;
        ak ak = a;
        if (n != 0) {
            while (true) {
                final aj j = ak.j;
                final aj b = j.b;
                n = n2;
                if (b == null) {
                    break;
                }
                a = b.a;
                final aj b2 = a.l.b;
                n = n2;
                if (b2 == null) {
                    break;
                }
                n = n2;
                if (b2 != j) {
                    break;
                }
                n = n2;
                if (a == ak) {
                    break;
                }
                ak = a;
            }
            int an;
            while (true) {
                an = this.an;
                if (n >= an) {
                    break;
                }
                if (this.ap[n] == ak) {
                    return;
                }
                ++n;
            }
            final ak[] ap = this.ap;
            n = ap.length;
            if (an + 1 >= n) {
                this.ap = Arrays.copyOf(ap, n + n);
            }
            final ak[] ap2 = this.ap;
            n = this.an;
            ap2[n] = ak;
            this.an = n + 1;
            return;
        }
        while (true) {
            final aj i = a.i;
            final aj b3 = i.b;
            n = n3;
            if (b3 == null) {
                break;
            }
            final ak a2 = b3.a;
            final aj b4 = a2.k.b;
            n = n3;
            if (b4 == null) {
                break;
            }
            n = n3;
            if (b4 != i) {
                break;
            }
            n = n3;
            if (a2 == a) {
                break;
            }
            a = a2;
        }
        while (true) {
            final int am = this.am;
            if (n >= am) {
                final ak[] aq = this.aq;
                n = aq.length;
                if (am + 1 >= n) {
                    this.aq = Arrays.copyOf(aq, n + n);
                }
                final ak[] aq2 = this.aq;
                n = this.am;
                aq2[n] = a;
                this.am = n + 1;
                return;
            }
            if (this.aq[n] == a) {
                break;
            }
            ++n;
        }
    }
    
    public final void B(final ak ak, final boolean[] array) {
        final int ad = ak.ad;
        final int n = 0;
        final boolean b = false;
        final int n2 = 0;
        if (ad == 3 && ak.ae == 3 && ak.u > 0.0f) {
            array[0] = false;
            return;
        }
        final int f = ak.f();
        if (ak.ad == 3 && ak.ae != 3 && ak.u > 0.0f) {
            array[0] = false;
            return;
        }
        ak.T = true;
        int ag = 0;
        int n3 = 0;
        if (ak instanceof am) {
            final am am = (am)ak;
            Label_0154: {
                if (am.ai == 1) {
                    ag = am.ag;
                    if (ag == -1) {
                        final int ah = am.ah;
                        ag = n2;
                        if (ah != -1) {
                            ag = n;
                            n3 = ah;
                            break Label_0154;
                        }
                    }
                    n3 = 0;
                }
                else {
                    n3 = (ag = f);
                }
            }
        }
        else if (!ak.k.c() && !ak.i.c()) {
            final int n4 = f + ak.w;
            n3 = f;
            ag = n4;
        }
        else {
            final aj k = ak.k;
            final aj b2 = k.b;
            Label_0267: {
                if (b2 != null) {
                    final aj b3 = ak.i.b;
                    if (b3 != null) {
                        if (b2 != b3) {
                            final ak a = b2.a;
                            if (a != b3.a) {
                                break Label_0267;
                            }
                            if (a == ak.r) {
                                break Label_0267;
                            }
                        }
                        array[0] = false;
                        return;
                    }
                }
            }
            ak ak2 = null;
            int n6;
            ak ak3;
            if (b2 != null) {
                final ak a2 = b2.a;
                final int n5 = n6 = k.a() + f;
                ak3 = a2;
                if (!a2.s()) {
                    n6 = n5;
                    ak3 = a2;
                    if (!a2.T) {
                        this.B(a2, array);
                        n6 = n5;
                        ak3 = a2;
                    }
                }
            }
            else {
                n6 = f;
                ak3 = null;
            }
            final aj i = ak.i;
            final aj b4 = i.b;
            int n7 = f;
            if (b4 != null) {
                final ak a3 = b4.a;
                final int n8 = n7 = f + i.a();
                ak2 = a3;
                if (!a3.s()) {
                    n7 = n8;
                    ak2 = a3;
                    if (!a3.T) {
                        this.B(a3, array);
                        ak2 = a3;
                        n7 = n8;
                    }
                }
            }
            int n9 = n6;
            Label_0610: {
                if (ak.k.b != null) {
                    n9 = n6;
                    if (!ak3.s()) {
                        final int g = ak.k.b.g;
                        int n11 = 0;
                        Label_0506: {
                            int n10;
                            if (g == 4) {
                                n10 = ak3.N - ak3.f();
                            }
                            else {
                                n11 = n6;
                                if (g != 2) {
                                    break Label_0506;
                                }
                                n10 = ak3.N;
                            }
                            n11 = n6 + n10;
                        }
                        final boolean q = ak3.Q || (ak3.i.b != null && ak3.k.b != null && ak3.ad != 3);
                        ak.Q = q;
                        n9 = n11;
                        if (q) {
                            final aj b5 = ak3.i.b;
                            if (b5 != null) {
                                n9 = n11;
                                if (b5.a == ak) {
                                    break Label_0610;
                                }
                            }
                            n9 = n11 + (n11 - ak3.N);
                        }
                    }
                }
            }
            int n12 = n7;
            int n14 = 0;
            Label_0817: {
                Label_0813: {
                    if (ak.i.b != null) {
                        n12 = n7;
                        if (!ak2.s()) {
                            final int g2 = ak.i.b.g;
                            int n13 = 0;
                            Label_0697: {
                                int m;
                                if (g2 == 2) {
                                    m = ak2.M - ak2.f();
                                }
                                else {
                                    n13 = n7;
                                    if (g2 != 4) {
                                        break Label_0697;
                                    }
                                    m = ak2.M;
                                }
                                n13 = n7 + m;
                            }
                            boolean p2 = false;
                            Label_0751: {
                                if (!ak2.P) {
                                    p2 = b;
                                    if (ak2.i.b == null) {
                                        break Label_0751;
                                    }
                                    p2 = b;
                                    if (ak2.k.b == null) {
                                        break Label_0751;
                                    }
                                    p2 = b;
                                    if (ak2.ad == 3) {
                                        break Label_0751;
                                    }
                                }
                                p2 = true;
                            }
                            ak.P = p2;
                            n12 = n13;
                            if (p2) {
                                final aj b6 = ak2.k.b;
                                if (b6 != null) {
                                    if (b6.a == ak) {
                                        n12 = n13;
                                        break Label_0813;
                                    }
                                }
                                n14 = n13 + (n13 - ak2.M);
                                break Label_0817;
                            }
                        }
                    }
                }
                n14 = n12;
            }
            final int n15 = n9;
            ag = n14;
            n3 = n15;
        }
        int n16 = n3;
        int j = ag;
        if (ak.K == 8) {
            final int s = ak.s;
            j = ag - s;
            n16 = n3 - s;
        }
        ak.M = j;
        ak.N = n16;
    }
    
    public final void C(final ak ak, final boolean[] array) {
        final int ae = ak.ae;
        final int n = 0;
        final boolean b = false;
        int n2 = 0;
        if (ae == 3 && ak.ad != 3 && ak.u > 0.0f) {
            array[0] = false;
            return;
        }
        int n3 = ak.e();
        ak.U = true;
        int n4 = 0;
        Label_0955: {
            if (ak instanceof am) {
                final am am = (am)ak;
                if (am.ai == 0) {
                    n3 = am.ag;
                    if (n3 != -1) {
                        n2 = n;
                    }
                    else {
                        final int ah = am.ah;
                        if (ah != -1) {
                            n2 = ah;
                        }
                        n3 = 0;
                    }
                }
                else {
                    n2 = n3;
                }
                n4 = n3;
                n3 = n2;
            }
            else {
                final aj m = ak.m;
                if (m.b == null && ak.j.b == null && ak.l.b == null) {
                    n4 = ak.x + n3;
                }
                else {
                    final aj b2 = ak.l.b;
                    Label_0234: {
                        if (b2 != null) {
                            final aj b3 = ak.j.b;
                            if (b3 != null) {
                                if (b2 != b3) {
                                    final ak a = b2.a;
                                    if (a != b3.a) {
                                        break Label_0234;
                                    }
                                    if (a == ak.r) {
                                        break Label_0234;
                                    }
                                }
                                array[0] = false;
                                return;
                            }
                        }
                    }
                    if (m.c()) {
                        final ak a2 = ak.m.b.a;
                        if (!a2.U) {
                            this.C(a2, array);
                        }
                        final int max = Math.max(a2.L - a2.t + n3, n3);
                        int max2 = Math.max(a2.O - a2.t + n3, n3);
                        int l = max;
                        if (ak.K == 8) {
                            final int t = ak.t;
                            l = max - t;
                            max2 -= t;
                        }
                        ak.L = l;
                        ak.O = max2;
                        return;
                    }
                    final boolean c = ak.j.c();
                    ak a3 = null;
                    int n6;
                    ak ak2;
                    if (c) {
                        final aj j = ak.j;
                        final ak a4 = j.b.a;
                        final int n5 = n6 = j.a() + n3;
                        ak2 = a4;
                        if (!a4.s()) {
                            n6 = n5;
                            ak2 = a4;
                            if (!a4.U) {
                                this.C(a4, array);
                                n6 = n5;
                                ak2 = a4;
                            }
                        }
                    }
                    else {
                        n6 = n3;
                        ak2 = null;
                    }
                    int n7 = n3;
                    if (ak.l.c()) {
                        final aj i = ak.l;
                        a3 = i.b.a;
                        n7 = n3 + i.a();
                        if (!a3.s() && !a3.U) {
                            this.C(a3, array);
                        }
                    }
                    int n8 = n6;
                    Label_0718: {
                        if (ak.j.b != null) {
                            n8 = n6;
                            if (!ak2.s()) {
                                final int g = ak.j.b.g;
                                int n9 = 0;
                                Label_0595: {
                                    int k;
                                    if (g == 3) {
                                        k = ak2.L - ak2.e();
                                    }
                                    else {
                                        n9 = n6;
                                        if (g != 5) {
                                            break Label_0595;
                                        }
                                        k = ak2.L;
                                    }
                                    n9 = n6 + k;
                                }
                                boolean r = false;
                                Label_0666: {
                                    Label_0663: {
                                        if (!ak2.R) {
                                            final aj b4 = ak2.j.b;
                                            if (b4 != null && b4.a != ak) {
                                                final aj b5 = ak2.l.b;
                                                if (b5 != null && b5.a != ak && ak2.ae != 3) {
                                                    break Label_0663;
                                                }
                                            }
                                            r = false;
                                            break Label_0666;
                                        }
                                    }
                                    r = true;
                                }
                                ak.R = r;
                                n8 = n9;
                                if (r) {
                                    final aj b6 = ak2.l.b;
                                    if (b6 != null) {
                                        n8 = n9;
                                        if (b6.a == ak) {
                                            break Label_0718;
                                        }
                                    }
                                    n8 = n9 + (n9 - ak2.L);
                                }
                            }
                        }
                    }
                    n3 = n7;
                    n4 = n8;
                    if (ak.l.b != null) {
                        n3 = n7;
                        n4 = n8;
                        if (!a3.s()) {
                            final int g2 = ak.l.b.g;
                            int n10 = 0;
                            Label_0805: {
                                int o;
                                if (g2 == 5) {
                                    o = a3.O - a3.e();
                                }
                                else {
                                    n10 = n7;
                                    if (g2 != 3) {
                                        break Label_0805;
                                    }
                                    o = a3.O;
                                }
                                n10 = n7 + o;
                            }
                            boolean s = false;
                            Label_0887: {
                                if (!a3.S) {
                                    final aj b7 = a3.j.b;
                                    s = b;
                                    if (b7 == null) {
                                        break Label_0887;
                                    }
                                    s = b;
                                    if (b7.a == ak) {
                                        break Label_0887;
                                    }
                                    final aj b8 = a3.l.b;
                                    s = b;
                                    if (b8 == null) {
                                        break Label_0887;
                                    }
                                    s = b;
                                    if (b8.a == ak) {
                                        break Label_0887;
                                    }
                                    s = b;
                                    if (a3.ae == 3) {
                                        break Label_0887;
                                    }
                                }
                                s = true;
                            }
                            ak.S = s;
                            n3 = n10;
                            n4 = n8;
                            if (s) {
                                final aj b9 = a3.j.b;
                                if (b9 != null) {
                                    if (b9.a == ak) {
                                        n3 = n10;
                                        n4 = n8;
                                        break Label_0955;
                                    }
                                }
                                n3 = n10 + (n10 - a3.O);
                                n4 = n8;
                            }
                        }
                    }
                }
            }
        }
        int o2 = n3;
        int l2 = n4;
        if (ak.K == 8) {
            final int t2 = ak.t;
            l2 = n4 - t2;
            o2 = n3 - t2;
        }
        ak.L = l2;
        ak.O = o2;
    }
    
    @Override
    public final void D() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        al.w:I
        //     4: istore_1       
        //     5: aload_0        
        //     6: getfield        al.x:I
        //     9: istore_2       
        //    10: iconst_0       
        //    11: aload_0        
        //    12: invokevirtual   ak.h:()I
        //    15: invokestatic    java/lang/Math.max:(II)I
        //    18: istore_3       
        //    19: iconst_0       
        //    20: aload_0        
        //    21: invokevirtual   ak.d:()I
        //    24: invokestatic    java/lang/Math.max:(II)I
        //    27: istore          4
        //    29: aload_0        
        //    30: iconst_0       
        //    31: putfield        al.aj:Z
        //    34: aload_0        
        //    35: iconst_0       
        //    36: putfield        al.ak:Z
        //    39: aload_0        
        //    40: getfield        al.r:Lak;
        //    43: ifnull          324
        //    46: aload_0        
        //    47: getfield        al.at:Lixx;
        //    50: ifnonnull       65
        //    53: aload_0        
        //    54: new             Lixx;
        //    57: dup            
        //    58: aload_0        
        //    59: invokespecial   ixx.<init>:(Lak;)V
        //    62: putfield        al.at:Lixx;
        //    65: aload_0        
        //    66: getfield        al.at:Lixx;
        //    69: astore          5
        //    71: aload           5
        //    73: aload_0        
        //    74: getfield        ak.w:I
        //    77: putfield        ixx.c:I
        //    80: aload           5
        //    82: aload_0        
        //    83: getfield        ak.x:I
        //    86: putfield        ixx.d:I
        //    89: aload           5
        //    91: aload_0        
        //    92: invokevirtual   ak.h:()I
        //    95: putfield        ixx.a:I
        //    98: aload           5
        //   100: aload_0        
        //   101: invokevirtual   ak.d:()I
        //   104: putfield        ixx.b:I
        //   107: aload           5
        //   109: getfield        ixx.e:Ljava/lang/Object;
        //   112: checkcast       Ljava/util/ArrayList;
        //   115: invokevirtual   java/util/ArrayList.size:()I
        //   118: istore          6
        //   120: iconst_0       
        //   121: istore          7
        //   123: iload           7
        //   125: iload           6
        //   127: if_icmpge       260
        //   130: aload           5
        //   132: getfield        ixx.e:Ljava/lang/Object;
        //   135: checkcast       Ljava/util/ArrayList;
        //   138: iload           7
        //   140: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   143: checkcast       Laeud;
        //   146: astore          8
        //   148: aload           8
        //   150: aload_0        
        //   151: aload           8
        //   153: getfield        aeud.e:Ljava/lang/Object;
        //   156: checkcast       Laj;
        //   159: getfield        aj.g:I
        //   162: invokevirtual   ak.t:(I)Laj;
        //   165: putfield        aeud.e:Ljava/lang/Object;
        //   168: aload           8
        //   170: getfield        aeud.e:Ljava/lang/Object;
        //   173: astore          9
        //   175: aload           9
        //   177: ifnull          230
        //   180: aload           9
        //   182: checkcast       Laj;
        //   185: astore          9
        //   187: aload           8
        //   189: aload           9
        //   191: getfield        aj.b:Laj;
        //   194: putfield        aeud.d:Ljava/lang/Object;
        //   197: aload           8
        //   199: aload           9
        //   201: invokevirtual   aj.a:()I
        //   204: putfield        aeud.b:I
        //   207: aload           8
        //   209: aload           9
        //   211: getfield        aj.h:I
        //   214: putfield        aeud.a:I
        //   217: aload           8
        //   219: aload           9
        //   221: getfield        aj.e:I
        //   224: putfield        aeud.c:I
        //   227: goto            254
        //   230: aload           8
        //   232: aconst_null    
        //   233: putfield        aeud.d:Ljava/lang/Object;
        //   236: aload           8
        //   238: iconst_0       
        //   239: putfield        aeud.b:I
        //   242: aload           8
        //   244: iconst_2       
        //   245: putfield        aeud.a:I
        //   248: aload           8
        //   250: iconst_0       
        //   251: putfield        aeud.c:I
        //   254: iinc            7, 1
        //   257: goto            123
        //   260: aload_0        
        //   261: iconst_0       
        //   262: putfield        ak.w:I
        //   265: aload_0        
        //   266: iconst_0       
        //   267: putfield        ak.x:I
        //   270: aload_0        
        //   271: getfield        ak.q:Ljava/util/ArrayList;
        //   274: invokevirtual   java/util/ArrayList.size:()I
        //   277: istore          6
        //   279: iconst_0       
        //   280: istore          7
        //   282: iload           7
        //   284: iload           6
        //   286: if_icmpge       310
        //   289: aload_0        
        //   290: getfield        ak.q:Ljava/util/ArrayList;
        //   293: iload           7
        //   295: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   298: checkcast       Laj;
        //   301: invokevirtual   aj.b:()V
        //   304: iinc            7, 1
        //   307: goto            282
        //   310: aload_0        
        //   311: aload_0        
        //   312: getfield        al.af:Lah;
        //   315: getfield        ah.g:Lcdn;
        //   318: invokevirtual   ak.z:(Lcdn;)V
        //   321: goto            334
        //   324: aload_0        
        //   325: iconst_0       
        //   326: putfield        al.w:I
        //   329: aload_0        
        //   330: iconst_0       
        //   331: putfield        al.x:I
        //   334: aload_0        
        //   335: getfield        al.ae:I
        //   338: istore          10
        //   340: aload_0        
        //   341: getfield        al.ad:I
        //   344: istore          6
        //   346: aload_0        
        //   347: getfield        al.ai:I
        //   350: iconst_2       
        //   351: if_icmpne       1028
        //   354: iload           6
        //   356: istore          7
        //   358: iload           10
        //   360: iconst_2       
        //   361: if_icmpeq       389
        //   364: iload           6
        //   366: iconst_2       
        //   367: if_icmpne       376
        //   370: iconst_2       
        //   371: istore          7
        //   373: goto            389
        //   376: iconst_0       
        //   377: istore          11
        //   379: iload           6
        //   381: istore          12
        //   383: iload_2        
        //   384: istore          13
        //   386: goto            1042
        //   389: aload_0        
        //   390: getfield        al.al:Ljava/util/ArrayList;
        //   393: astore          8
        //   395: aload_0        
        //   396: getfield        al.ar:[Z
        //   399: astore          5
        //   401: aload           8
        //   403: invokevirtual   java/util/ArrayList.size:()I
        //   406: istore          12
        //   408: aload           5
        //   410: iconst_0       
        //   411: iconst_1       
        //   412: bastore        
        //   413: iconst_0       
        //   414: istore          14
        //   416: iconst_0       
        //   417: istore          15
        //   419: iconst_0       
        //   420: istore          16
        //   422: iconst_0       
        //   423: istore          17
        //   425: iconst_0       
        //   426: istore          18
        //   428: iconst_0       
        //   429: istore          19
        //   431: iconst_0       
        //   432: istore          20
        //   434: iload           17
        //   436: iload           12
        //   438: if_icmpge       744
        //   441: aload           8
        //   443: iload           17
        //   445: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   448: checkcast       Lak;
        //   451: astore          9
        //   453: aload           9
        //   455: invokevirtual   ak.s:()Z
        //   458: ifeq            464
        //   461: goto            738
        //   464: aload           9
        //   466: getfield        ak.T:Z
        //   469: ifne            480
        //   472: aload_0        
        //   473: aload           9
        //   475: aload           5
        //   477: invokevirtual   al.B:(Lak;[Z)V
        //   480: aload           9
        //   482: getfield        ak.U:Z
        //   485: ifne            496
        //   488: aload_0        
        //   489: aload           9
        //   491: aload           5
        //   493: invokevirtual   al.C:(Lak;[Z)V
        //   496: aload           5
        //   498: iconst_0       
        //   499: baload         
        //   500: ifne            506
        //   503: goto            862
        //   506: aload           9
        //   508: getfield        ak.M:I
        //   511: istore          21
        //   513: aload           9
        //   515: getfield        ak.N:I
        //   518: istore          6
        //   520: aload           9
        //   522: invokevirtual   ak.h:()I
        //   525: istore          22
        //   527: aload           9
        //   529: getfield        ak.L:I
        //   532: istore          23
        //   534: aload           9
        //   536: getfield        ak.O:I
        //   539: istore          13
        //   541: aload           9
        //   543: invokevirtual   ak.d:()I
        //   546: istore          24
        //   548: aload           9
        //   550: getfield        ak.ad:I
        //   553: iconst_4       
        //   554: if_icmpne       585
        //   557: aload           9
        //   559: invokevirtual   ak.h:()I
        //   562: aload           9
        //   564: getfield        ak.i:Laj;
        //   567: getfield        aj.c:I
        //   570: iadd           
        //   571: aload           9
        //   573: getfield        ak.k:Laj;
        //   576: getfield        aj.c:I
        //   579: iadd           
        //   580: istore          6
        //   582: goto            595
        //   585: iload           21
        //   587: iload           6
        //   589: iadd           
        //   590: iload           22
        //   592: isub           
        //   593: istore          6
        //   595: aload           9
        //   597: getfield        ak.ae:I
        //   600: iconst_4       
        //   601: if_icmpne       632
        //   604: aload           9
        //   606: invokevirtual   ak.d:()I
        //   609: aload           9
        //   611: getfield        ak.j:Laj;
        //   614: getfield        aj.c:I
        //   617: iadd           
        //   618: aload           9
        //   620: getfield        ak.l:Laj;
        //   623: getfield        aj.c:I
        //   626: iadd           
        //   627: istore          24
        //   629: goto            642
        //   632: iload           23
        //   634: iload           13
        //   636: iadd           
        //   637: iload           24
        //   639: isub           
        //   640: istore          24
        //   642: aload           9
        //   644: getfield        ak.K:I
        //   647: istore          13
        //   649: iload           13
        //   651: bipush          8
        //   653: if_icmpne       659
        //   656: iconst_0       
        //   657: istore          24
        //   659: iload           13
        //   661: bipush          8
        //   663: if_icmpne       672
        //   666: iconst_0       
        //   667: istore          6
        //   669: goto            672
        //   672: iload           14
        //   674: aload           9
        //   676: getfield        ak.M:I
        //   679: invokestatic    java/lang/Math.max:(II)I
        //   682: istore          14
        //   684: iload           16
        //   686: aload           9
        //   688: getfield        ak.N:I
        //   691: invokestatic    java/lang/Math.max:(II)I
        //   694: istore          16
        //   696: iload           19
        //   698: aload           9
        //   700: getfield        ak.O:I
        //   703: invokestatic    java/lang/Math.max:(II)I
        //   706: istore          19
        //   708: iload           18
        //   710: aload           9
        //   712: getfield        ak.L:I
        //   715: invokestatic    java/lang/Math.max:(II)I
        //   718: istore          18
        //   720: iload           15
        //   722: iload           6
        //   724: invokestatic    java/lang/Math.max:(II)I
        //   727: istore          15
        //   729: iload           20
        //   731: iload           24
        //   733: invokestatic    java/lang/Math.max:(II)I
        //   736: istore          20
        //   738: iinc            17, 1
        //   741: goto            434
        //   744: iload           14
        //   746: iload           16
        //   748: invokestatic    java/lang/Math.max:(II)I
        //   751: istore          6
        //   753: aload_0        
        //   754: aload_0        
        //   755: getfield        al.D:I
        //   758: iload           6
        //   760: iload           15
        //   762: invokestatic    java/lang/Math.max:(II)I
        //   765: invokestatic    java/lang/Math.max:(II)I
        //   768: putfield        al.ag:I
        //   771: iload           18
        //   773: iload           19
        //   775: invokestatic    java/lang/Math.max:(II)I
        //   778: istore          6
        //   780: aload_0        
        //   781: aload_0        
        //   782: getfield        al.E:I
        //   785: iload           6
        //   787: iload           20
        //   789: invokestatic    java/lang/Math.max:(II)I
        //   792: invokestatic    java/lang/Math.max:(II)I
        //   795: putfield        al.ah:I
        //   798: iconst_0       
        //   799: istore          6
        //   801: iload           6
        //   803: iload           12
        //   805: if_icmpge       862
        //   808: aload           8
        //   810: iload           6
        //   812: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   815: checkcast       Lak;
        //   818: astore          5
        //   820: aload           5
        //   822: iconst_0       
        //   823: putfield        ak.T:Z
        //   826: aload           5
        //   828: iconst_0       
        //   829: putfield        ak.U:Z
        //   832: aload           5
        //   834: iconst_0       
        //   835: putfield        ak.P:Z
        //   838: aload           5
        //   840: iconst_0       
        //   841: putfield        ak.Q:Z
        //   844: aload           5
        //   846: iconst_0       
        //   847: putfield        ak.R:Z
        //   850: aload           5
        //   852: iconst_0       
        //   853: putfield        ak.S:Z
        //   856: iinc            6, 1
        //   859: goto            801
        //   862: aload_0        
        //   863: getfield        al.ar:[Z
        //   866: iconst_0       
        //   867: baload         
        //   868: istore          25
        //   870: iload           25
        //   872: istore          11
        //   874: iload_3        
        //   875: ifle            911
        //   878: iload           25
        //   880: istore          11
        //   882: iload           4
        //   884: ifle            911
        //   887: aload_0        
        //   888: getfield        al.ag:I
        //   891: iload_3        
        //   892: if_icmpgt       908
        //   895: iload           25
        //   897: istore          11
        //   899: aload_0        
        //   900: getfield        al.ah:I
        //   903: iload           4
        //   905: if_icmple       911
        //   908: iconst_0       
        //   909: istore          11
        //   911: iload           11
        //   913: ifeq            1025
        //   916: aload_0        
        //   917: getfield        al.ad:I
        //   920: iconst_2       
        //   921: if_icmpne       969
        //   924: aload_0        
        //   925: iconst_1       
        //   926: putfield        al.ad:I
        //   929: iload_3        
        //   930: ifle            954
        //   933: iload_3        
        //   934: aload_0        
        //   935: getfield        al.ag:I
        //   938: if_icmpge       954
        //   941: aload_0        
        //   942: iconst_1       
        //   943: putfield        al.aj:Z
        //   946: aload_0        
        //   947: iload_3        
        //   948: invokevirtual   ak.p:(I)V
        //   951: goto            969
        //   954: aload_0        
        //   955: aload_0        
        //   956: getfield        al.D:I
        //   959: aload_0        
        //   960: getfield        al.ag:I
        //   963: invokestatic    java/lang/Math.max:(II)I
        //   966: invokevirtual   ak.p:(I)V
        //   969: aload_0        
        //   970: getfield        al.ae:I
        //   973: iconst_2       
        //   974: if_icmpne       1025
        //   977: aload_0        
        //   978: iconst_1       
        //   979: putfield        al.ae:I
        //   982: iload           4
        //   984: ifle            1010
        //   987: iload           4
        //   989: aload_0        
        //   990: getfield        al.ah:I
        //   993: if_icmpge       1010
        //   996: aload_0        
        //   997: iconst_1       
        //   998: putfield        al.ak:Z
        //  1001: aload_0        
        //  1002: iload           4
        //  1004: invokevirtual   ak.j:(I)V
        //  1007: goto            1025
        //  1010: aload_0        
        //  1011: aload_0        
        //  1012: getfield        al.E:I
        //  1015: aload_0        
        //  1016: getfield        al.ah:I
        //  1019: invokestatic    java/lang/Math.max:(II)I
        //  1022: invokevirtual   ak.j:(I)V
        //  1025: goto            1035
        //  1028: iload           6
        //  1030: istore          7
        //  1032: iconst_0       
        //  1033: istore          11
        //  1035: iload_2        
        //  1036: istore          13
        //  1038: iload           7
        //  1040: istore          12
        //  1042: aload_0        
        //  1043: iconst_0       
        //  1044: putfield        al.am:I
        //  1047: aload_0        
        //  1048: iconst_0       
        //  1049: putfield        al.an:I
        //  1052: aload_0        
        //  1053: getfield        al.al:Ljava/util/ArrayList;
        //  1056: invokevirtual   java/util/ArrayList.size:()I
        //  1059: istore          21
        //  1061: iconst_0       
        //  1062: istore          7
        //  1064: iload           7
        //  1066: iload           21
        //  1068: if_icmpge       1107
        //  1071: aload_0        
        //  1072: getfield        al.al:Ljava/util/ArrayList;
        //  1075: iload           7
        //  1077: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1080: checkcast       Lak;
        //  1083: astore          5
        //  1085: aload           5
        //  1087: instanceof      Lan;
        //  1090: ifeq            1101
        //  1093: aload           5
        //  1095: checkcast       Lan;
        //  1098: invokevirtual   an.D:()V
        //  1101: iinc            7, 1
        //  1104: goto            1064
        //  1107: iconst_0       
        //  1108: istore          20
        //  1110: iconst_1       
        //  1111: istore          26
        //  1113: iload           10
        //  1115: istore          6
        //  1117: iload           11
        //  1119: istore          25
        //  1121: iload           4
        //  1123: istore          7
        //  1125: iload_3        
        //  1126: istore_2       
        //  1127: iload_1        
        //  1128: istore          24
        //  1130: iload           26
        //  1132: ifeq            3410
        //  1135: iload           20
        //  1137: iconst_1       
        //  1138: iadd           
        //  1139: istore          22
        //  1141: aload_0        
        //  1142: getfield        al.af:Lah;
        //  1145: invokevirtual   ah.l:()V
        //  1148: aload_0        
        //  1149: aload_0        
        //  1150: getfield        al.af:Lah;
        //  1153: invokevirtual   al.E:(Lah;)Z
        //  1156: istore          11
        //  1158: iload           11
        //  1160: ifeq            2711
        //  1163: iload           24
        //  1165: istore          15
        //  1167: iload_2        
        //  1168: istore          19
        //  1170: iload           7
        //  1172: istore          18
        //  1174: iload           25
        //  1176: istore          27
        //  1178: iload           11
        //  1180: istore          26
        //  1182: iload           6
        //  1184: istore          17
        //  1186: aload_0        
        //  1187: getfield        al.af:Lah;
        //  1190: astore          28
        //  1192: iload           24
        //  1194: istore          15
        //  1196: iload_2        
        //  1197: istore          19
        //  1199: iload           7
        //  1201: istore          18
        //  1203: iload           25
        //  1205: istore          27
        //  1207: iload           11
        //  1209: istore          26
        //  1211: iload           6
        //  1213: istore          17
        //  1215: aload           28
        //  1217: getfield        ah.b:Lag;
        //  1220: astore          29
        //  1222: iload           24
        //  1224: istore          15
        //  1226: iload_2        
        //  1227: istore          19
        //  1229: iload           7
        //  1231: istore          18
        //  1233: iload           25
        //  1235: istore          27
        //  1237: iload           11
        //  1239: istore          26
        //  1241: iload           6
        //  1243: istore          17
        //  1245: aload           29
        //  1247: aload           28
        //  1249: invokevirtual   ag.a:(Lah;)V
        //  1252: iload           24
        //  1254: istore          15
        //  1256: iload_2        
        //  1257: istore          19
        //  1259: iload           7
        //  1261: istore          18
        //  1263: iload           25
        //  1265: istore          27
        //  1267: iload           11
        //  1269: istore          26
        //  1271: iload           6
        //  1273: istore          17
        //  1275: aload           28
        //  1277: aload           29
        //  1279: invokevirtual   ah.o:(Lag;)V
        //  1282: iconst_0       
        //  1283: istore          20
        //  1285: iload           24
        //  1287: istore          15
        //  1289: iload_2        
        //  1290: istore          19
        //  1292: iload           7
        //  1294: istore          18
        //  1296: iload           25
        //  1298: istore          27
        //  1300: iload           11
        //  1302: istore          26
        //  1304: iload           6
        //  1306: istore          17
        //  1308: iload           20
        //  1310: aload           28
        //  1312: getfield        ah.e:I
        //  1315: if_icmpge       1356
        //  1318: iload           24
        //  1320: istore          15
        //  1322: iload_2        
        //  1323: istore          19
        //  1325: iload           7
        //  1327: istore          18
        //  1329: iload           25
        //  1331: istore          27
        //  1333: iload           11
        //  1335: istore          26
        //  1337: iload           6
        //  1339: istore          17
        //  1341: aload           28
        //  1343: getfield        ah.d:[Z
        //  1346: iload           20
        //  1348: iconst_0       
        //  1349: bastore        
        //  1350: iinc            20, 1
        //  1353: goto            1285
        //  1356: iconst_0       
        //  1357: istore          17
        //  1359: iconst_0       
        //  1360: istore          20
        //  1362: iload           17
        //  1364: ifne            2515
        //  1367: iload           24
        //  1369: istore          15
        //  1371: iload_2        
        //  1372: istore          19
        //  1374: iload           7
        //  1376: istore          18
        //  1378: iload           25
        //  1380: istore          27
        //  1382: iload           11
        //  1384: istore          26
        //  1386: iload           6
        //  1388: istore          17
        //  1390: aload           29
        //  1392: getfield        ag.a:Ljava/util/ArrayList;
        //  1395: invokevirtual   java/util/ArrayList.size:()I
        //  1398: istore_3       
        //  1399: iload           11
        //  1401: istore          30
        //  1403: aconst_null    
        //  1404: astore          5
        //  1406: iconst_0       
        //  1407: istore          16
        //  1409: iconst_0       
        //  1410: istore          19
        //  1412: iload           25
        //  1414: istore          26
        //  1416: iload           24
        //  1418: istore          17
        //  1420: iload           16
        //  1422: iload_3        
        //  1423: if_icmpge       1602
        //  1426: aload           29
        //  1428: getfield        ag.a:Ljava/util/ArrayList;
        //  1431: iload           16
        //  1433: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1436: checkcast       Lai;
        //  1439: astore          9
        //  1441: iconst_5       
        //  1442: istore          24
        //  1444: aload           5
        //  1446: astore          8
        //  1448: iload           24
        //  1450: iflt            1579
        //  1453: iload           17
        //  1455: istore          15
        //  1457: iload_2        
        //  1458: istore_1       
        //  1459: iload           7
        //  1461: istore          14
        //  1463: iload           6
        //  1465: istore          18
        //  1467: iload           15
        //  1469: istore          17
        //  1471: aload           9
        //  1473: getfield        ai.e:[F
        //  1476: iload           24
        //  1478: faload         
        //  1479: fstore          31
        //  1481: aload           8
        //  1483: astore          5
        //  1485: iload           19
        //  1487: istore          17
        //  1489: aload           8
        //  1491: ifnonnull       1532
        //  1494: aload           8
        //  1496: astore          5
        //  1498: iload           19
        //  1500: istore          17
        //  1502: fload           31
        //  1504: fconst_0       
        //  1505: fcmpg          
        //  1506: ifge            1532
        //  1509: aload           8
        //  1511: astore          5
        //  1513: iload           19
        //  1515: istore          17
        //  1517: iload           24
        //  1519: iload           19
        //  1521: if_icmplt       1532
        //  1524: aload           9
        //  1526: astore          5
        //  1528: iload           24
        //  1530: istore          17
        //  1532: aload           5
        //  1534: astore          8
        //  1536: iload           17
        //  1538: istore          19
        //  1540: fload           31
        //  1542: fconst_0       
        //  1543: fcmpl          
        //  1544: ifle            1569
        //  1547: aload           5
        //  1549: astore          8
        //  1551: iload           17
        //  1553: istore          19
        //  1555: iload           24
        //  1557: iload           17
        //  1559: if_icmple       1569
        //  1562: iload           24
        //  1564: istore          19
        //  1566: aconst_null    
        //  1567: astore          8
        //  1569: iinc            24, -1
        //  1572: iload           15
        //  1574: istore          17
        //  1576: goto            1448
        //  1579: iinc            16, 1
        //  1582: aload           8
        //  1584: astore          5
        //  1586: goto            1420
        //  1589: astore          5
        //  1591: iload           17
        //  1593: istore          24
        //  1595: iload           26
        //  1597: istore          25
        //  1599: goto            2700
        //  1602: iload           17
        //  1604: istore          24
        //  1606: iload           26
        //  1608: istore          25
        //  1610: iload           20
        //  1612: istore          19
        //  1614: aload           5
        //  1616: ifnull          1740
        //  1619: iload_2        
        //  1620: istore_1       
        //  1621: iload           7
        //  1623: istore          14
        //  1625: iload           6
        //  1627: istore          18
        //  1629: iload           24
        //  1631: istore          17
        //  1633: aload           28
        //  1635: getfield        ah.d:[Z
        //  1638: astore          8
        //  1640: iload_2        
        //  1641: istore_1       
        //  1642: iload           7
        //  1644: istore          14
        //  1646: iload           6
        //  1648: istore          18
        //  1650: iload           24
        //  1652: istore          17
        //  1654: aload           5
        //  1656: getfield        ai.a:I
        //  1659: istore          19
        //  1661: aload           8
        //  1663: iload           19
        //  1665: baload         
        //  1666: ifeq            1678
        //  1669: iconst_0       
        //  1670: istore          17
        //  1672: aconst_null    
        //  1673: astore          5
        //  1675: goto            1747
        //  1678: aload           8
        //  1680: iload           19
        //  1682: iconst_1       
        //  1683: bastore        
        //  1684: iinc            20, 1
        //  1687: iload_2        
        //  1688: istore_1       
        //  1689: iload           7
        //  1691: istore          14
        //  1693: iload           6
        //  1695: istore          18
        //  1697: iload           24
        //  1699: istore          17
        //  1701: iload           20
        //  1703: istore          19
        //  1705: iload           20
        //  1707: aload           28
        //  1709: getfield        ah.e:I
        //  1712: if_icmplt       1740
        //  1715: iconst_1       
        //  1716: istore          17
        //  1718: goto            1747
        //  1721: astore          5
        //  1723: iload_1        
        //  1724: istore_2       
        //  1725: iload           14
        //  1727: istore          7
        //  1729: iload           18
        //  1731: istore          6
        //  1733: iload           17
        //  1735: istore          24
        //  1737: goto            1595
        //  1740: iconst_0       
        //  1741: istore          17
        //  1743: iload           19
        //  1745: istore          20
        //  1747: aload           5
        //  1749: ifnull          2447
        //  1752: iconst_0       
        //  1753: istore          16
        //  1755: ldc_w           3.4028235E38
        //  1758: fstore          31
        //  1760: iconst_m1      
        //  1761: istore          4
        //  1763: iload           20
        //  1765: istore          15
        //  1767: iload           17
        //  1769: istore          19
        //  1771: iload_2        
        //  1772: istore_1       
        //  1773: iload           7
        //  1775: istore          14
        //  1777: iload           6
        //  1779: istore          18
        //  1781: iload           24
        //  1783: istore          17
        //  1785: iload           16
        //  1787: aload           28
        //  1789: getfield        ah.f:I
        //  1792: if_icmpge       2168
        //  1795: iload_2        
        //  1796: istore_1       
        //  1797: iload           7
        //  1799: istore          14
        //  1801: iload           6
        //  1803: istore          18
        //  1805: iload           24
        //  1807: istore          17
        //  1809: aload           28
        //  1811: getfield        ah.c:[Laf;
        //  1814: iload           16
        //  1816: aaload         
        //  1817: astore          8
        //  1819: iload_2        
        //  1820: istore_1       
        //  1821: iload           7
        //  1823: istore          14
        //  1825: iload           6
        //  1827: istore          18
        //  1829: iload           24
        //  1831: istore          17
        //  1833: aload           8
        //  1835: getfield        af.a:Lai;
        //  1838: getfield        ai.h:I
        //  1841: iconst_1       
        //  1842: if_icmpne       1864
        //  1845: iload           6
        //  1847: istore          20
        //  1849: iload           20
        //  1851: istore          6
        //  1853: fload           31
        //  1855: fstore          32
        //  1857: iload           4
        //  1859: istore          20
        //  1861: goto            2154
        //  1864: iload_2        
        //  1865: istore_1       
        //  1866: iload           7
        //  1868: istore          14
        //  1870: iload           6
        //  1872: istore          18
        //  1874: iload           24
        //  1876: istore          17
        //  1878: aload           8
        //  1880: getfield        af.d:Lae;
        //  1883: astore          9
        //  1885: iload_2        
        //  1886: istore_1       
        //  1887: iload           7
        //  1889: istore          14
        //  1891: iload           6
        //  1893: istore          18
        //  1895: iload           24
        //  1897: istore          17
        //  1899: aload           9
        //  1901: getfield        ae.e:I
        //  1904: istore          23
        //  1906: iload           7
        //  1908: istore_3       
        //  1909: iload_2        
        //  1910: istore_1       
        //  1911: iload           23
        //  1913: iconst_m1      
        //  1914: if_icmpne       1924
        //  1917: iload           6
        //  1919: istore          20
        //  1921: goto            1849
        //  1924: iconst_0       
        //  1925: istore          10
        //  1927: iload           6
        //  1929: istore          20
        //  1931: iload           23
        //  1933: iconst_m1      
        //  1934: if_icmpeq       1849
        //  1937: iload           6
        //  1939: istore          20
        //  1941: iload           10
        //  1943: aload           9
        //  1945: getfield        ae.a:I
        //  1948: if_icmpge       1849
        //  1951: aload           9
        //  1953: getfield        ae.b:[I
        //  1956: iload           23
        //  1958: iaload         
        //  1959: istore          33
        //  1961: iload           6
        //  1963: istore          18
        //  1965: iload           25
        //  1967: istore          27
        //  1969: iload           24
        //  1971: istore          14
        //  1973: iload_3        
        //  1974: istore          17
        //  1976: iload_1        
        //  1977: istore          20
        //  1979: iload           18
        //  1981: istore          6
        //  1983: iload           33
        //  1985: aload           5
        //  1987: getfield        ai.a:I
        //  1990: if_icmpne       2106
        //  1993: iload           25
        //  1995: istore          27
        //  1997: iload           24
        //  1999: istore          14
        //  2001: iload_3        
        //  2002: istore          17
        //  2004: iload_1        
        //  2005: istore          20
        //  2007: iload           18
        //  2009: istore          6
        //  2011: aload           8
        //  2013: getfield        af.d:Lae;
        //  2016: aload           5
        //  2018: invokevirtual   ae.a:(Lai;)F
        //  2021: fstore          34
        //  2023: fload           31
        //  2025: fstore          32
        //  2027: iload           4
        //  2029: istore          20
        //  2031: iload           18
        //  2033: istore          6
        //  2035: fload           34
        //  2037: fconst_0       
        //  2038: fcmpg          
        //  2039: ifge            2154
        //  2042: iload           25
        //  2044: istore          27
        //  2046: iload           24
        //  2048: istore          14
        //  2050: iload_3        
        //  2051: istore          17
        //  2053: iload_1        
        //  2054: istore          20
        //  2056: iload           18
        //  2058: istore          6
        //  2060: aload           8
        //  2062: getfield        af.b:F
        //  2065: fneg           
        //  2066: fload           34
        //  2068: fdiv           
        //  2069: fstore          34
        //  2071: fload           31
        //  2073: fstore          32
        //  2075: iload           4
        //  2077: istore          20
        //  2079: iload           18
        //  2081: istore          6
        //  2083: fload           34
        //  2085: fload           31
        //  2087: fcmpg          
        //  2088: ifge            2154
        //  2091: fload           34
        //  2093: fstore          32
        //  2095: iload           16
        //  2097: istore          20
        //  2099: iload           18
        //  2101: istore          6
        //  2103: goto            2154
        //  2106: iload           25
        //  2108: istore          27
        //  2110: iload           24
        //  2112: istore          14
        //  2114: iload_3        
        //  2115: istore          17
        //  2117: iload_1        
        //  2118: istore          20
        //  2120: iload           18
        //  2122: istore          6
        //  2124: aload           9
        //  2126: getfield        ae.c:[I
        //  2129: iload           23
        //  2131: iaload         
        //  2132: istore          23
        //  2134: iinc            10, 1
        //  2137: iload           18
        //  2139: istore          6
        //  2141: goto            1927
        //  2144: astore          5
        //  2146: iload_3        
        //  2147: istore          7
        //  2149: iload_1        
        //  2150: istore_2       
        //  2151: goto            2700
        //  2154: iinc            16, 1
        //  2157: fload           32
        //  2159: fstore          31
        //  2161: iload           20
        //  2163: istore          4
        //  2165: goto            1771
        //  2168: iload           7
        //  2170: istore          18
        //  2172: iload           6
        //  2174: istore          7
        //  2176: iload           15
        //  2178: istore          6
        //  2180: iload           18
        //  2182: istore          16
        //  2184: iload_2        
        //  2185: istore          17
        //  2187: iload           7
        //  2189: istore          20
        //  2191: iload           4
        //  2193: iflt            2466
        //  2196: iload           25
        //  2198: istore          27
        //  2200: iload           24
        //  2202: istore          14
        //  2204: iload           18
        //  2206: istore          17
        //  2208: iload_2        
        //  2209: istore          20
        //  2211: iload           7
        //  2213: istore          6
        //  2215: aload           28
        //  2217: getfield        ah.c:[Laf;
        //  2220: iload           4
        //  2222: aaload         
        //  2223: astore          8
        //  2225: iload           25
        //  2227: istore          27
        //  2229: iload           24
        //  2231: istore          14
        //  2233: iload           18
        //  2235: istore          17
        //  2237: iload_2        
        //  2238: istore          20
        //  2240: iload           7
        //  2242: istore          6
        //  2244: aload           8
        //  2246: getfield        af.a:Lai;
        //  2249: iconst_m1      
        //  2250: putfield        ai.b:I
        //  2253: iload           25
        //  2255: istore          27
        //  2257: iload           24
        //  2259: istore          14
        //  2261: iload           18
        //  2263: istore          17
        //  2265: iload_2        
        //  2266: istore          20
        //  2268: iload           7
        //  2270: istore          6
        //  2272: aload           8
        //  2274: aload           5
        //  2276: invokevirtual   af.a:(Lai;)V
        //  2279: iload           25
        //  2281: istore          27
        //  2283: iload           24
        //  2285: istore          14
        //  2287: iload           18
        //  2289: istore          17
        //  2291: iload_2        
        //  2292: istore          20
        //  2294: iload           7
        //  2296: istore          6
        //  2298: aload           8
        //  2300: getfield        af.a:Lai;
        //  2303: iload           4
        //  2305: putfield        ai.b:I
        //  2308: iconst_0       
        //  2309: istore          16
        //  2311: iload           25
        //  2313: istore          27
        //  2315: iload           24
        //  2317: istore          14
        //  2319: iload           18
        //  2321: istore          17
        //  2323: iload_2        
        //  2324: istore          20
        //  2326: iload           7
        //  2328: istore          6
        //  2330: iload           16
        //  2332: aload           28
        //  2334: getfield        ah.f:I
        //  2337: if_icmpge       2378
        //  2340: iload           25
        //  2342: istore          27
        //  2344: iload           24
        //  2346: istore          14
        //  2348: iload           18
        //  2350: istore          17
        //  2352: iload_2        
        //  2353: istore          20
        //  2355: iload           7
        //  2357: istore          6
        //  2359: aload           28
        //  2361: getfield        ah.c:[Laf;
        //  2364: iload           16
        //  2366: aaload         
        //  2367: aload           8
        //  2369: invokevirtual   af.k:(Laf;)V
        //  2372: iinc            16, 1
        //  2375: goto            2311
        //  2378: iload           25
        //  2380: istore          27
        //  2382: iload           24
        //  2384: istore          14
        //  2386: iload           18
        //  2388: istore          17
        //  2390: iload_2        
        //  2391: istore          20
        //  2393: iload           7
        //  2395: istore          6
        //  2397: aload           29
        //  2399: aload           28
        //  2401: invokevirtual   ag.a:(Lah;)V
        //  2404: aload           28
        //  2406: aload           29
        //  2408: invokevirtual   ah.o:(Lag;)V
        //  2411: goto            2440
        //  2414: astore          5
        //  2416: iload           25
        //  2418: istore          27
        //  2420: iload           24
        //  2422: istore          14
        //  2424: iload           18
        //  2426: istore          17
        //  2428: iload_2        
        //  2429: istore          20
        //  2431: iload           7
        //  2433: istore          6
        //  2435: aload           5
        //  2437: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  2440: iload           19
        //  2442: istore          6
        //  2444: goto            2488
        //  2447: iload           6
        //  2449: istore          17
        //  2451: iload           20
        //  2453: istore          6
        //  2455: iload           17
        //  2457: istore          20
        //  2459: iload_2        
        //  2460: istore          17
        //  2462: iload           7
        //  2464: istore          16
        //  2466: iconst_1       
        //  2467: istore          19
        //  2469: iload           20
        //  2471: istore          7
        //  2473: iload           17
        //  2475: istore_2       
        //  2476: iload           16
        //  2478: istore          18
        //  2480: iload           6
        //  2482: istore          15
        //  2484: iload           19
        //  2486: istore          6
        //  2488: iload           30
        //  2490: istore          11
        //  2492: iload           15
        //  2494: istore          20
        //  2496: iload           7
        //  2498: istore          19
        //  2500: iload           6
        //  2502: istore          17
        //  2504: iload           18
        //  2506: istore          7
        //  2508: iload           19
        //  2510: istore          6
        //  2512: goto            1362
        //  2515: iload_2        
        //  2516: istore          19
        //  2518: iload           25
        //  2520: istore          26
        //  2522: iload           11
        //  2524: istore          35
        //  2526: iload           6
        //  2528: istore          16
        //  2530: iconst_0       
        //  2531: istore_3       
        //  2532: iload           26
        //  2534: istore          27
        //  2536: iload           24
        //  2538: istore          14
        //  2540: iload           7
        //  2542: istore          17
        //  2544: iload           19
        //  2546: istore          20
        //  2548: iload           16
        //  2550: istore          6
        //  2552: iload           35
        //  2554: istore          30
        //  2556: iload           26
        //  2558: istore          25
        //  2560: iload           24
        //  2562: istore_1       
        //  2563: iload           7
        //  2565: istore          15
        //  2567: iload           19
        //  2569: istore_2       
        //  2570: iload           16
        //  2572: istore          18
        //  2574: iload_3        
        //  2575: aload           28
        //  2577: getfield        ah.f:I
        //  2580: if_icmpge       2726
        //  2583: iload           26
        //  2585: istore          27
        //  2587: iload           24
        //  2589: istore          14
        //  2591: iload           7
        //  2593: istore          17
        //  2595: iload           19
        //  2597: istore          20
        //  2599: iload           16
        //  2601: istore          6
        //  2603: aload           28
        //  2605: getfield        ah.c:[Laf;
        //  2608: iload_3        
        //  2609: aaload         
        //  2610: astore          5
        //  2612: iload           26
        //  2614: istore          27
        //  2616: iload           24
        //  2618: istore          14
        //  2620: iload           7
        //  2622: istore          17
        //  2624: iload           19
        //  2626: istore          20
        //  2628: iload           16
        //  2630: istore          6
        //  2632: aload           5
        //  2634: getfield        af.a:Lai;
        //  2637: aload           5
        //  2639: getfield        af.b:F
        //  2642: putfield        ai.d:F
        //  2645: iinc            3, 1
        //  2648: goto            2532
        //  2651: astore          5
        //  2653: iload           11
        //  2655: istore          30
        //  2657: iload           27
        //  2659: istore          25
        //  2661: iload           14
        //  2663: istore          24
        //  2665: iload           17
        //  2667: istore          7
        //  2669: iload           20
        //  2671: istore_2       
        //  2672: goto            2700
        //  2675: astore          5
        //  2677: iload           15
        //  2679: istore          24
        //  2681: iload           19
        //  2683: istore_2       
        //  2684: iload           18
        //  2686: istore          7
        //  2688: iload           27
        //  2690: istore          25
        //  2692: iload           26
        //  2694: istore          30
        //  2696: iload           17
        //  2698: istore          6
        //  2700: iload           30
        //  2702: istore          26
        //  2704: iload           25
        //  2706: istore          11
        //  2708: goto            2754
        //  2711: iload           6
        //  2713: istore          18
        //  2715: iload           7
        //  2717: istore          15
        //  2719: iload           24
        //  2721: istore_1       
        //  2722: iload           11
        //  2724: istore          30
        //  2726: iload           30
        //  2728: istore          26
        //  2730: iload           25
        //  2732: istore          11
        //  2734: iload_1        
        //  2735: istore          24
        //  2737: iload           15
        //  2739: istore          7
        //  2741: iload           18
        //  2743: istore          6
        //  2745: goto            2759
        //  2748: astore          5
        //  2750: iload           25
        //  2752: istore          11
        //  2754: aload           5
        //  2756: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  2759: iload           26
        //  2761: ifeq            2883
        //  2764: aload_0        
        //  2765: getfield        al.ar:[Z
        //  2768: astore          8
        //  2770: aload           8
        //  2772: iconst_2       
        //  2773: iconst_0       
        //  2774: bastore        
        //  2775: aload_0        
        //  2776: invokevirtual   ak.y:()V
        //  2779: aload_0        
        //  2780: getfield        al.al:Ljava/util/ArrayList;
        //  2783: invokevirtual   java/util/ArrayList.size:()I
        //  2786: istore          17
        //  2788: iconst_0       
        //  2789: istore          20
        //  2791: iload           20
        //  2793: iload           17
        //  2795: if_icmpge       2880
        //  2798: aload_0        
        //  2799: getfield        al.al:Ljava/util/ArrayList;
        //  2802: iload           20
        //  2804: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2807: checkcast       Lak;
        //  2810: astore          5
        //  2812: aload           5
        //  2814: invokevirtual   ak.y:()V
        //  2817: aload           5
        //  2819: getfield        ak.ad:I
        //  2822: iconst_3       
        //  2823: if_icmpne       2847
        //  2826: aload           5
        //  2828: invokevirtual   ak.h:()I
        //  2831: aload           5
        //  2833: getfield        ak.F:I
        //  2836: if_icmpge       2847
        //  2839: aload           8
        //  2841: iconst_2       
        //  2842: iconst_1       
        //  2843: bastore        
        //  2844: goto            2847
        //  2847: aload           5
        //  2849: getfield        ak.ae:I
        //  2852: iconst_3       
        //  2853: if_icmpne       2874
        //  2856: aload           5
        //  2858: invokevirtual   ak.d:()I
        //  2861: aload           5
        //  2863: getfield        ak.G:I
        //  2866: if_icmpge       2874
        //  2869: aload           8
        //  2871: iconst_2       
        //  2872: iconst_1       
        //  2873: bastore        
        //  2874: iinc            20, 1
        //  2877: goto            2791
        //  2880: goto            2981
        //  2883: aload_0        
        //  2884: invokevirtual   ak.y:()V
        //  2887: iconst_0       
        //  2888: istore          20
        //  2890: iload           20
        //  2892: iload           21
        //  2894: if_icmpge       2981
        //  2897: aload_0        
        //  2898: getfield        al.al:Ljava/util/ArrayList;
        //  2901: iload           20
        //  2903: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2906: checkcast       Lak;
        //  2909: astore          5
        //  2911: aload           5
        //  2913: getfield        ak.ad:I
        //  2916: iconst_3       
        //  2917: if_icmpne       2943
        //  2920: aload           5
        //  2922: invokevirtual   ak.h:()I
        //  2925: aload           5
        //  2927: getfield        ak.F:I
        //  2930: if_icmpge       2943
        //  2933: aload_0        
        //  2934: getfield        al.ar:[Z
        //  2937: iconst_2       
        //  2938: iconst_1       
        //  2939: bastore        
        //  2940: goto            2981
        //  2943: aload           5
        //  2945: getfield        ak.ae:I
        //  2948: iconst_3       
        //  2949: if_icmpne       2975
        //  2952: aload           5
        //  2954: invokevirtual   ak.d:()I
        //  2957: aload           5
        //  2959: getfield        ak.G:I
        //  2962: if_icmpge       2975
        //  2965: aload_0        
        //  2966: getfield        al.ar:[Z
        //  2969: iconst_2       
        //  2970: iconst_1       
        //  2971: bastore        
        //  2972: goto            2981
        //  2975: iinc            20, 1
        //  2978: goto            2890
        //  2981: iload           22
        //  2983: bipush          8
        //  2985: if_icmpge       3184
        //  2988: aload_0        
        //  2989: getfield        al.ar:[Z
        //  2992: iconst_2       
        //  2993: baload         
        //  2994: ifeq            3184
        //  2997: iconst_0       
        //  2998: istore          17
        //  3000: iconst_0       
        //  3001: istore          18
        //  3003: iconst_0       
        //  3004: istore          20
        //  3006: iload           17
        //  3008: iload           21
        //  3010: if_icmpge       3069
        //  3013: aload_0        
        //  3014: getfield        al.al:Ljava/util/ArrayList;
        //  3017: iload           17
        //  3019: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3022: checkcast       Lak;
        //  3025: astore          5
        //  3027: iload           18
        //  3029: aload           5
        //  3031: getfield        ak.w:I
        //  3034: aload           5
        //  3036: invokevirtual   ak.h:()I
        //  3039: iadd           
        //  3040: invokestatic    java/lang/Math.max:(II)I
        //  3043: istore          18
        //  3045: iload           20
        //  3047: aload           5
        //  3049: getfield        ak.x:I
        //  3052: aload           5
        //  3054: invokevirtual   ak.d:()I
        //  3057: iadd           
        //  3058: invokestatic    java/lang/Math.max:(II)I
        //  3061: istore          20
        //  3063: iinc            17, 1
        //  3066: goto            3006
        //  3069: aload_0        
        //  3070: getfield        al.D:I
        //  3073: iload           18
        //  3075: invokestatic    java/lang/Math.max:(II)I
        //  3078: istore          17
        //  3080: aload_0        
        //  3081: getfield        al.E:I
        //  3084: iload           20
        //  3086: invokestatic    java/lang/Math.max:(II)I
        //  3089: istore          20
        //  3091: iload           12
        //  3093: iconst_2       
        //  3094: if_icmpne       3126
        //  3097: aload_0        
        //  3098: invokevirtual   ak.h:()I
        //  3101: iload           17
        //  3103: if_icmpge       3126
        //  3106: aload_0        
        //  3107: iload           17
        //  3109: invokevirtual   ak.p:(I)V
        //  3112: aload_0        
        //  3113: iconst_2       
        //  3114: putfield        al.ad:I
        //  3117: iconst_1       
        //  3118: istore          27
        //  3120: iconst_1       
        //  3121: istore          26
        //  3123: goto            3133
        //  3126: iconst_0       
        //  3127: istore          27
        //  3129: iload           11
        //  3131: istore          26
        //  3133: iload           27
        //  3135: istore          25
        //  3137: iload           26
        //  3139: istore          11
        //  3141: iload           6
        //  3143: iconst_2       
        //  3144: if_icmpne       3187
        //  3147: iload           27
        //  3149: istore          25
        //  3151: iload           26
        //  3153: istore          11
        //  3155: aload_0        
        //  3156: invokevirtual   ak.d:()I
        //  3159: iload           20
        //  3161: if_icmpge       3187
        //  3164: aload_0        
        //  3165: iload           20
        //  3167: invokevirtual   ak.j:(I)V
        //  3170: aload_0        
        //  3171: iconst_2       
        //  3172: putfield        al.ae:I
        //  3175: iconst_1       
        //  3176: istore          25
        //  3178: iconst_1       
        //  3179: istore          11
        //  3181: goto            3187
        //  3184: iconst_0       
        //  3185: istore          25
        //  3187: aload_0        
        //  3188: getfield        al.D:I
        //  3191: aload_0        
        //  3192: invokevirtual   ak.h:()I
        //  3195: invokestatic    java/lang/Math.max:(II)I
        //  3198: istore          20
        //  3200: iload           20
        //  3202: aload_0        
        //  3203: invokevirtual   ak.h:()I
        //  3206: if_icmple       3229
        //  3209: aload_0        
        //  3210: iload           20
        //  3212: invokevirtual   ak.p:(I)V
        //  3215: aload_0        
        //  3216: iconst_1       
        //  3217: putfield        al.ad:I
        //  3220: iconst_1       
        //  3221: istore          25
        //  3223: iconst_1       
        //  3224: istore          11
        //  3226: goto            3229
        //  3229: aload_0        
        //  3230: getfield        al.E:I
        //  3233: aload_0        
        //  3234: invokevirtual   ak.d:()I
        //  3237: invokestatic    java/lang/Math.max:(II)I
        //  3240: istore          20
        //  3242: iload           20
        //  3244: aload_0        
        //  3245: invokevirtual   ak.d:()I
        //  3248: if_icmple       3271
        //  3251: aload_0        
        //  3252: iload           20
        //  3254: invokevirtual   ak.j:(I)V
        //  3257: aload_0        
        //  3258: iconst_1       
        //  3259: putfield        al.ae:I
        //  3262: iconst_1       
        //  3263: istore          11
        //  3265: iconst_1       
        //  3266: istore          25
        //  3268: goto            3283
        //  3271: iload           25
        //  3273: istore          26
        //  3275: iload           11
        //  3277: istore          25
        //  3279: iload           26
        //  3281: istore          11
        //  3283: iload           25
        //  3285: ifne            3399
        //  3288: aload_0        
        //  3289: getfield        al.ad:I
        //  3292: iconst_2       
        //  3293: if_icmpne       3341
        //  3296: iload_2        
        //  3297: ifle            3341
        //  3300: aload_0        
        //  3301: invokevirtual   ak.h:()I
        //  3304: istore          17
        //  3306: iload_2        
        //  3307: istore          20
        //  3309: iload           17
        //  3311: iload           20
        //  3313: if_icmple       3341
        //  3316: aload_0        
        //  3317: iconst_1       
        //  3318: putfield        al.aj:Z
        //  3321: aload_0        
        //  3322: iconst_1       
        //  3323: putfield        al.ad:I
        //  3326: aload_0        
        //  3327: iload           20
        //  3329: invokevirtual   ak.p:(I)V
        //  3332: iconst_1       
        //  3333: istore          11
        //  3335: iconst_1       
        //  3336: istore          25
        //  3338: goto            3341
        //  3341: aload_0        
        //  3342: getfield        al.ae:I
        //  3345: iconst_2       
        //  3346: if_icmpne       3396
        //  3349: iload           7
        //  3351: ifle            3396
        //  3354: aload_0        
        //  3355: invokevirtual   ak.d:()I
        //  3358: istore          17
        //  3360: iload           7
        //  3362: istore          20
        //  3364: iload           17
        //  3366: iload           20
        //  3368: if_icmple       3396
        //  3371: aload_0        
        //  3372: iconst_1       
        //  3373: putfield        al.ak:Z
        //  3376: aload_0        
        //  3377: iconst_1       
        //  3378: putfield        al.ae:I
        //  3381: aload_0        
        //  3382: iload           20
        //  3384: invokevirtual   ak.j:(I)V
        //  3387: iconst_1       
        //  3388: istore          11
        //  3390: iconst_1       
        //  3391: istore          25
        //  3393: goto            3399
        //  3396: goto            3399
        //  3399: iload           22
        //  3401: istore          20
        //  3403: iload           11
        //  3405: istore          26
        //  3407: goto            1130
        //  3410: iconst_0       
        //  3411: istore          7
        //  3413: aload_0        
        //  3414: getfield        al.r:Lak;
        //  3417: ifnull          3608
        //  3420: aload_0        
        //  3421: getfield        al.D:I
        //  3424: aload_0        
        //  3425: invokevirtual   ak.h:()I
        //  3428: invokestatic    java/lang/Math.max:(II)I
        //  3431: istore          24
        //  3433: aload_0        
        //  3434: getfield        al.E:I
        //  3437: aload_0        
        //  3438: invokevirtual   ak.d:()I
        //  3441: invokestatic    java/lang/Math.max:(II)I
        //  3444: istore          20
        //  3446: aload_0        
        //  3447: getfield        al.at:Lixx;
        //  3450: astore          9
        //  3452: aload_0        
        //  3453: aload           9
        //  3455: getfield        ixx.c:I
        //  3458: putfield        ak.w:I
        //  3461: aload_0        
        //  3462: aload           9
        //  3464: getfield        ixx.d:I
        //  3467: putfield        ak.x:I
        //  3470: aload_0        
        //  3471: aload           9
        //  3473: getfield        ixx.a:I
        //  3476: invokevirtual   ak.p:(I)V
        //  3479: aload_0        
        //  3480: aload           9
        //  3482: getfield        ixx.b:I
        //  3485: invokevirtual   ak.j:(I)V
        //  3488: aload           9
        //  3490: getfield        ixx.e:Ljava/lang/Object;
        //  3493: checkcast       Ljava/util/ArrayList;
        //  3496: invokevirtual   java/util/ArrayList.size:()I
        //  3499: istore_2       
        //  3500: iload           7
        //  3502: iload_2        
        //  3503: if_icmpge       3593
        //  3506: aload           9
        //  3508: getfield        ixx.e:Ljava/lang/Object;
        //  3511: checkcast       Ljava/util/ArrayList;
        //  3514: iload           7
        //  3516: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3519: checkcast       Laeud;
        //  3522: astore          8
        //  3524: aload_0        
        //  3525: aload           8
        //  3527: getfield        aeud.e:Ljava/lang/Object;
        //  3530: checkcast       Laj;
        //  3533: getfield        aj.g:I
        //  3536: invokevirtual   ak.t:(I)Laj;
        //  3539: astore          28
        //  3541: aload           8
        //  3543: getfield        aeud.d:Ljava/lang/Object;
        //  3546: astore          5
        //  3548: aload           8
        //  3550: getfield        aeud.b:I
        //  3553: istore          17
        //  3555: aload           8
        //  3557: getfield        aeud.a:I
        //  3560: istore          18
        //  3562: aload           8
        //  3564: getfield        aeud.c:I
        //  3567: istore          19
        //  3569: aload           28
        //  3571: aload           5
        //  3573: checkcast       Laj;
        //  3576: iload           17
        //  3578: iconst_m1      
        //  3579: iload           18
        //  3581: iload           19
        //  3583: iconst_0       
        //  3584: invokevirtual   aj.d:(Laj;IIIIZ)V
        //  3587: iinc            7, 1
        //  3590: goto            3500
        //  3593: aload_0        
        //  3594: iload           24
        //  3596: invokevirtual   ak.p:(I)V
        //  3599: aload_0        
        //  3600: iload           20
        //  3602: invokevirtual   ak.j:(I)V
        //  3605: goto            3620
        //  3608: aload_0        
        //  3609: iload           24
        //  3611: putfield        al.w:I
        //  3614: aload_0        
        //  3615: iload           13
        //  3617: putfield        al.x:I
        //  3620: iload           25
        //  3622: ifeq            3637
        //  3625: aload_0        
        //  3626: iload           12
        //  3628: putfield        al.ad:I
        //  3631: aload_0        
        //  3632: iload           6
        //  3634: putfield        al.ae:I
        //  3637: aload_0        
        //  3638: aload_0        
        //  3639: getfield        al.af:Lah;
        //  3642: getfield        ah.g:Lcdn;
        //  3645: invokevirtual   ak.z:(Lcdn;)V
        //  3648: aload_0        
        //  3649: getfield        ak.r:Lak;
        //  3652: astore          5
        //  3654: aload_0        
        //  3655: astore          8
        //  3657: aload           5
        //  3659: ifnull          3680
        //  3662: aload           5
        //  3664: getfield        ak.r:Lak;
        //  3667: astore          9
        //  3669: aload           5
        //  3671: astore          8
        //  3673: aload           9
        //  3675: astore          5
        //  3677: goto            3657
        //  3680: aload_0        
        //  3681: aload           8
        //  3683: if_acmpne       3690
        //  3686: aload_0        
        //  3687: invokevirtual   ak.q:()V
        //  3690: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  1141   1158   2748   2754   Ljava/lang/Exception;
        //  1186   1192   2675   2700   Ljava/lang/Exception;
        //  1215   1222   2675   2700   Ljava/lang/Exception;
        //  1245   1252   2675   2700   Ljava/lang/Exception;
        //  1275   1282   2675   2700   Ljava/lang/Exception;
        //  1308   1318   2675   2700   Ljava/lang/Exception;
        //  1341   1350   2675   2700   Ljava/lang/Exception;
        //  1390   1399   2675   2700   Ljava/lang/Exception;
        //  1426   1441   1589   1595   Ljava/lang/Exception;
        //  1471   1481   1721   1740   Ljava/lang/Exception;
        //  1633   1640   1721   1740   Ljava/lang/Exception;
        //  1654   1661   1721   1740   Ljava/lang/Exception;
        //  1705   1715   1721   1740   Ljava/lang/Exception;
        //  1785   1795   1721   1740   Ljava/lang/Exception;
        //  1809   1819   1721   1740   Ljava/lang/Exception;
        //  1833   1845   1721   1740   Ljava/lang/Exception;
        //  1878   1885   1721   1740   Ljava/lang/Exception;
        //  1899   1906   1721   1740   Ljava/lang/Exception;
        //  1941   1961   2144   2154   Ljava/lang/Exception;
        //  1983   1993   2651   2675   Ljava/lang/Exception;
        //  2011   2023   2651   2675   Ljava/lang/Exception;
        //  2060   2071   2651   2675   Ljava/lang/Exception;
        //  2124   2134   2651   2675   Ljava/lang/Exception;
        //  2215   2225   2651   2675   Ljava/lang/Exception;
        //  2244   2253   2651   2675   Ljava/lang/Exception;
        //  2272   2279   2651   2675   Ljava/lang/Exception;
        //  2298   2308   2651   2675   Ljava/lang/Exception;
        //  2330   2340   2651   2675   Ljava/lang/Exception;
        //  2359   2372   2651   2675   Ljava/lang/Exception;
        //  2397   2404   2651   2675   Ljava/lang/Exception;
        //  2404   2411   2414   2440   Ljava/lang/Exception;
        //  2435   2440   2651   2675   Ljava/lang/Exception;
        //  2574   2583   2651   2675   Ljava/lang/Exception;
        //  2603   2612   2651   2675   Ljava/lang/Exception;
        //  2632   2645   2651   2675   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1532:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean E(final ah ah) {
        this.x(ah);
        final int size = this.al.size();
        final int ai = this.ai;
        int i;
        boolean b;
        if (ai != 2 && ai != 4) {
            i = 0;
            b = true;
        }
        else {
            final int size2 = this.al.size();
            for (int j = 0; j < size2; ++j) {
                final ak ak = this.al.get(j);
                ak.a = -1;
                ak.b = -1;
                if (ak.ad == 3 || ak.ae == 3) {
                    ak.a = 1;
                    ak.b = 1;
                }
            }
            int k = 0;
            int n = 0;
            int n2 = 0;
            while (k == 0) {
                int l = 0;
                int n3 = 0;
                int n4 = 0;
                while (l < size2) {
                    final ak ak2 = this.al.get(l);
                    Label_1328: {
                        if (ak2.a == -1) {
                            final int ad = this.ad;
                            if (ad == 2) {
                                ak2.a = 1;
                            }
                            else {
                                final int ad2 = ak2.ad;
                                if (ad2 == 3) {
                                    ak2.a = 1;
                                }
                                else if (ad != 2 && ad2 == 4) {
                                    final aj m = ak2.i;
                                    m.f = ah.e(m);
                                    final aj k2 = ak2.k;
                                    k2.f = ah.e(k2);
                                    final aj i2 = ak2.i;
                                    final int c = i2.c;
                                    final int n5 = this.h() - ak2.k.c;
                                    ah.h(i2.f, c);
                                    ah.h(ak2.k.f, n5);
                                    ak2.k(c, n5);
                                    ak2.a = 2;
                                }
                                else {
                                    final aj i3 = ak2.i;
                                    final aj b2 = i3.b;
                                    if (b2 != null) {
                                        final aj b3 = ak2.k.b;
                                        if (b3 != null) {
                                            if (b2.a == this && b3.a == this) {
                                                int a = i3.a();
                                                final int a2 = ak2.k.a();
                                                int n6;
                                                if (this.ad == 3) {
                                                    n6 = this.h() - a2;
                                                }
                                                else {
                                                    a += (int)((this.h() - a - a2 - ak2.h()) * ak2.H + 0.5f);
                                                    n6 = a + ak2.h();
                                                }
                                                final aj i4 = ak2.i;
                                                i4.f = ah.e(i4);
                                                final aj k3 = ak2.k;
                                                k3.f = ah.e(k3);
                                                ah.h(ak2.i.f, a);
                                                ah.h(ak2.k.f, n6);
                                                ak2.a = 2;
                                                ak2.k(a, n6);
                                                break Label_1328;
                                            }
                                            ak2.a = 1;
                                            break Label_1328;
                                        }
                                    }
                                    if (b2 != null && b2.a == this) {
                                        final int a3 = i3.a();
                                        final int n7 = ak2.h() + a3;
                                        final aj i5 = ak2.i;
                                        i5.f = ah.e(i5);
                                        final aj k4 = ak2.k;
                                        k4.f = ah.e(k4);
                                        ah.h(ak2.i.f, a3);
                                        ah.h(ak2.k.f, n7);
                                        ak2.a = 2;
                                        ak2.k(a3, n7);
                                    }
                                    else {
                                        final aj b4 = ak2.k.b;
                                        if (b4 != null && b4.a == this) {
                                            i3.f = ah.e(i3);
                                            final aj k5 = ak2.k;
                                            k5.f = ah.e(k5);
                                            final int n8 = this.h() - ak2.k.a();
                                            final int n9 = n8 - ak2.h();
                                            ah.h(ak2.i.f, n9);
                                            ah.h(ak2.k.f, n8);
                                            ak2.a = 2;
                                            ak2.k(n9, n8);
                                        }
                                        else if (b2 != null && b2.a.a == 2) {
                                            final ai f = b2.f;
                                            i3.f = ah.e(i3);
                                            final aj k6 = ak2.k;
                                            k6.f = ah.e(k6);
                                            final int n10 = (int)(f.d + ak2.i.a() + 0.5f);
                                            final int n11 = ak2.h() + n10;
                                            ah.h(ak2.i.f, n10);
                                            ah.h(ak2.k.f, n11);
                                            ak2.a = 2;
                                            ak2.k(n10, n11);
                                        }
                                        else if (b4 != null && b4.a.a == 2) {
                                            final ai f2 = b4.f;
                                            i3.f = ah.e(i3);
                                            final aj k7 = ak2.k;
                                            k7.f = ah.e(k7);
                                            final int n12 = (int)(f2.d - ak2.k.a() + 0.5f);
                                            final int n13 = n12 - ak2.h();
                                            ah.h(ak2.i.f, n13);
                                            ah.h(ak2.k.f, n12);
                                            ak2.a = 2;
                                            ak2.k(n13, n12);
                                        }
                                        else if (b2 == null && b4 == null) {
                                            if (ak2 instanceof am) {
                                                final am am = (am)ak2;
                                                if (am.ai == 1) {
                                                    i3.f = ah.e(i3);
                                                    final aj k8 = ak2.k;
                                                    k8.f = ah.e(k8);
                                                    final int ag = am.ag;
                                                    float n14;
                                                    if (ag != -1) {
                                                        n14 = (float)ag;
                                                    }
                                                    else {
                                                        final int ah2 = am.ah;
                                                        if (ah2 != -1) {
                                                            n14 = (float)(this.h() - ah2);
                                                        }
                                                        else {
                                                            n14 = this.h() * am.af;
                                                        }
                                                    }
                                                    final int n15 = (int)(n14 + 0.5f);
                                                    ah.h(ak2.i.f, n15);
                                                    ah.h(ak2.k.f, n15);
                                                    ak2.a = 2;
                                                    ak2.b = 2;
                                                    ak2.k(n15, n15);
                                                    ak2.o(0, this.d());
                                                }
                                            }
                                            else {
                                                i3.f = ah.e(i3);
                                                final aj k9 = ak2.k;
                                                k9.f = ah.e(k9);
                                                final int w = ak2.w;
                                                final int h = ak2.h();
                                                ah.h(ak2.i.f, w);
                                                ah.h(ak2.k.f, w + h);
                                                ak2.a = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Label_3070: {
                        if (ak2.b == -1) {
                            final int ae = this.ae;
                            if (ae == 2) {
                                ak2.b = 1;
                            }
                            else {
                                final int ae2 = ak2.ae;
                                if (ae2 == 3) {
                                    ak2.b = 1;
                                }
                                else if (ae != 2 && ae2 == 4) {
                                    final aj j2 = ak2.j;
                                    j2.f = ah.e(j2);
                                    final aj l2 = ak2.l;
                                    l2.f = ah.e(l2);
                                    final aj j3 = ak2.j;
                                    final int c2 = j3.c;
                                    final int n16 = this.d() - ak2.l.c;
                                    ah.h(j3.f, c2);
                                    ah.h(ak2.l.f, n16);
                                    if (ak2.C > 0 || ak2.K == 8) {
                                        final aj m2 = ak2.m;
                                        m2.f = ah.e(m2);
                                        ah.h(ak2.m.f, ak2.C + c2);
                                    }
                                    ak2.o(c2, n16);
                                    ak2.b = 2;
                                }
                                else {
                                    final aj j4 = ak2.j;
                                    final aj b5 = j4.b;
                                    if (b5 != null) {
                                        final aj b6 = ak2.l.b;
                                        if (b6 != null) {
                                            if (b5.a == this && b6.a == this) {
                                                int a4 = j4.a();
                                                final int a5 = ak2.l.a();
                                                int n17;
                                                if (this.ae == 3) {
                                                    n17 = ak2.d();
                                                }
                                                else {
                                                    a4 = (int)(a4 + (this.d() - a4 - a5 - ak2.d()) * ak2.I + 0.5f);
                                                    n17 = ak2.d();
                                                }
                                                final int n18 = n17 + a4;
                                                final aj j5 = ak2.j;
                                                j5.f = ah.e(j5);
                                                final aj l3 = ak2.l;
                                                l3.f = ah.e(l3);
                                                ah.h(ak2.j.f, a4);
                                                ah.h(ak2.l.f, n18);
                                                if (ak2.C > 0 || ak2.K == 8) {
                                                    final aj m3 = ak2.m;
                                                    m3.f = ah.e(m3);
                                                    ah.h(ak2.m.f, ak2.C + a4);
                                                }
                                                ak2.b = 2;
                                                ak2.o(a4, n18);
                                                break Label_3070;
                                            }
                                            ak2.b = 1;
                                            break Label_3070;
                                        }
                                    }
                                    if (b5 != null && b5.a == this) {
                                        final int a6 = j4.a();
                                        final int n19 = ak2.d() + a6;
                                        final aj j6 = ak2.j;
                                        j6.f = ah.e(j6);
                                        final aj l4 = ak2.l;
                                        l4.f = ah.e(l4);
                                        ah.h(ak2.j.f, a6);
                                        ah.h(ak2.l.f, n19);
                                        if (ak2.C > 0 || ak2.K == 8) {
                                            final aj m4 = ak2.m;
                                            m4.f = ah.e(m4);
                                            ah.h(ak2.m.f, ak2.C + a6);
                                        }
                                        ak2.b = 2;
                                        ak2.o(a6, n19);
                                    }
                                    else {
                                        final aj b7 = ak2.l.b;
                                        if (b7 != null && b7.a == this) {
                                            j4.f = ah.e(j4);
                                            final aj l5 = ak2.l;
                                            l5.f = ah.e(l5);
                                            final int n20 = this.d() - ak2.l.a();
                                            final int n21 = n20 - ak2.d();
                                            ah.h(ak2.j.f, n21);
                                            ah.h(ak2.l.f, n20);
                                            if (ak2.C > 0 || ak2.K == 8) {
                                                final aj m5 = ak2.m;
                                                m5.f = ah.e(m5);
                                                ah.h(ak2.m.f, ak2.C + n21);
                                            }
                                            ak2.b = 2;
                                            ak2.o(n21, n20);
                                        }
                                        else if (b5 != null && b5.a.b == 2) {
                                            final ai f3 = b5.f;
                                            j4.f = ah.e(j4);
                                            final aj l6 = ak2.l;
                                            l6.f = ah.e(l6);
                                            final int n22 = (int)(f3.d + ak2.j.a() + 0.5f);
                                            final int n23 = ak2.d() + n22;
                                            ah.h(ak2.j.f, n22);
                                            ah.h(ak2.l.f, n23);
                                            if (ak2.C > 0 || ak2.K == 8) {
                                                final aj m6 = ak2.m;
                                                m6.f = ah.e(m6);
                                                ah.h(ak2.m.f, ak2.C + n22);
                                            }
                                            ak2.b = 2;
                                            ak2.o(n22, n23);
                                        }
                                        else if (b7 != null && b7.a.b == 2) {
                                            final ai f4 = b7.f;
                                            j4.f = ah.e(j4);
                                            final aj l7 = ak2.l;
                                            l7.f = ah.e(l7);
                                            final int n24 = (int)(f4.d - ak2.l.a() + 0.5f);
                                            final int n25 = n24 - ak2.d();
                                            ah.h(ak2.j.f, n25);
                                            ah.h(ak2.l.f, n24);
                                            if (ak2.C > 0 || ak2.K == 8) {
                                                final aj m7 = ak2.m;
                                                m7.f = ah.e(m7);
                                                ah.h(ak2.m.f, ak2.C + n25);
                                            }
                                            ak2.b = 2;
                                            ak2.o(n25, n24);
                                        }
                                        else {
                                            final aj b8 = ak2.m.b;
                                            if (b8 != null && b8.a.b == 2) {
                                                final ai f5 = b8.f;
                                                j4.f = ah.e(j4);
                                                final aj l8 = ak2.l;
                                                l8.f = ah.e(l8);
                                                final int n26 = (int)(f5.d - ak2.C + 0.5f);
                                                final int n27 = ak2.d() + n26;
                                                ah.h(ak2.j.f, n26);
                                                ah.h(ak2.l.f, n27);
                                                final aj m8 = ak2.m;
                                                m8.f = ah.e(m8);
                                                ah.h(ak2.m.f, ak2.C + n26);
                                                ak2.b = 2;
                                                ak2.o(n26, n27);
                                            }
                                            else if (b8 == null && b5 == null && b7 == null) {
                                                if (ak2 instanceof am) {
                                                    final am am2 = (am)ak2;
                                                    if (am2.ai == 0) {
                                                        j4.f = ah.e(j4);
                                                        final aj l9 = ak2.l;
                                                        l9.f = ah.e(l9);
                                                        final int ag2 = am2.ag;
                                                        float n28;
                                                        if (ag2 != -1) {
                                                            n28 = (float)ag2;
                                                        }
                                                        else {
                                                            final int ah3 = am2.ah;
                                                            if (ah3 != -1) {
                                                                n28 = (float)(this.d() - ah3);
                                                            }
                                                            else {
                                                                n28 = this.d() * am2.af;
                                                            }
                                                        }
                                                        final int n29 = (int)(n28 + 0.5f);
                                                        ah.h(ak2.j.f, n29);
                                                        ah.h(ak2.l.f, n29);
                                                        ak2.b = 2;
                                                        ak2.a = 2;
                                                        ak2.o(n29, n29);
                                                        ak2.k(0, this.h());
                                                    }
                                                }
                                                else {
                                                    j4.f = ah.e(j4);
                                                    final aj l10 = ak2.l;
                                                    l10.f = ah.e(l10);
                                                    final int x = ak2.x;
                                                    final int d = ak2.d();
                                                    ah.h(ak2.j.f, x);
                                                    ah.h(ak2.l.f, d + x);
                                                    if (ak2.C > 0 || ak2.K == 8) {
                                                        final aj m9 = ak2.m;
                                                        m9.f = ah.e(m9);
                                                        ah.h(ak2.m.f, x + ak2.C);
                                                    }
                                                    ak2.b = 2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int n30 = n3;
                    if (ak2.b == -1) {
                        n30 = n3 + 1;
                    }
                    int n31 = n4;
                    if (ak2.a == -1) {
                        n31 = n4 + 1;
                    }
                    ++l;
                    n3 = n30;
                    n4 = n31;
                }
                int n33 = 0;
                Label_3163: {
                    while (true) {
                        int n32 = 0;
                        Label_3143: {
                            if (n3 != 0) {
                                n32 = n3;
                                break Label_3143;
                            }
                            if (n4 != 0) {
                                n32 = 0;
                                break Label_3143;
                            }
                            n33 = 1;
                            break Label_3163;
                        }
                        if (n == n32 && n2 == n4) {
                            continue;
                        }
                        break;
                    }
                    n33 = 0;
                }
                k = n33;
                n = n3;
                n2 = n4;
            }
            int n34 = 0;
            int n35 = 0;
            int n37 = 0;
            int n38;
            for (int n36 = 0; n36 < size2; ++n36, n34 = n37, n35 = n38) {
                final ak ak3 = this.al.get(n36);
                final int a7 = ak3.a;
                Label_3233: {
                    if (a7 != 1) {
                        n37 = n34;
                        if (a7 != -1) {
                            break Label_3233;
                        }
                    }
                    n37 = n34 + 1;
                }
                final int b9 = ak3.b;
                if (b9 != 1) {
                    n38 = n35;
                    if (b9 != -1) {
                        continue;
                    }
                }
                n38 = n35 + 1;
            }
            if (n34 == 0 && n35 == 0) {
                return false;
            }
            i = 0;
            b = false;
        }
        while (i < size) {
            final ak ak4 = this.al.get(i);
            if (ak4 instanceof al) {
                final int ad3 = ak4.ad;
                final int ae3 = ak4.ae;
                int n39;
                if ((n39 = ad3) == 2) {
                    ak4.v(1);
                    n39 = 2;
                }
                int n40;
                if ((n40 = ae3) == 2) {
                    ak4.w(1);
                    n40 = 2;
                }
                ak4.x(ah);
                if (n39 == 2) {
                    ak4.v(2);
                }
                if (n40 == 2) {
                    ak4.w(2);
                }
            }
            else {
                if (b) {
                    if (this.ad != 2 && ak4.ad == 4) {
                        final aj i6 = ak4.i;
                        i6.f = ah.e(i6);
                        final aj k10 = ak4.k;
                        k10.f = ah.e(k10);
                        final aj i7 = ak4.i;
                        final int c3 = i7.c;
                        final int n41 = this.h() - ak4.k.c;
                        ah.h(i7.f, c3);
                        ah.h(ak4.k.f, n41);
                        ak4.k(c3, n41);
                        ak4.a = 2;
                    }
                    if (this.ae != 2 && ak4.ae == 4) {
                        final aj j7 = ak4.j;
                        j7.f = ah.e(j7);
                        final aj l11 = ak4.l;
                        l11.f = ah.e(l11);
                        final aj j8 = ak4.j;
                        final int c4 = j8.c;
                        final int n42 = this.d() - ak4.l.c;
                        ah.h(j8.f, c4);
                        ah.h(ak4.l.f, n42);
                        if (ak4.C > 0 || ak4.K == 8) {
                            final aj m10 = ak4.m;
                            m10.f = ah.e(m10);
                            ah.h(ak4.m.f, ak4.C + c4);
                        }
                        ak4.o(c4, n42);
                        ak4.b = 2;
                    }
                }
                ak4.x(ah);
            }
            ++i;
        }
        if (this.am > 0) {
            this.H(ah);
        }
        if (this.an > 0) {
            this.I(ah);
        }
        return true;
    }
    
    @Override
    public final void i() {
        this.af.l();
        super.i();
    }
}
