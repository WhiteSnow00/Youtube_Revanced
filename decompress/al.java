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
    private ize at;
    
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
        int n2;
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
                int n3 = n;
                if (ab.K != 8) {
                    n3 = n;
                    if (ab.ad == 3) {
                        if (ab.ae == 3) {
                            array2[0] = false;
                        }
                        n3 = n;
                        if (ab.u <= 0.0f) {
                            array2[0] = false;
                            n3 = n + 1;
                            final ak[] ao = this.ao;
                            final int length = ao.length;
                            if (n3 >= length) {
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
                    n2 = n3;
                    break;
                }
                ak5 = ak2;
                ak6 = ak4;
                n2 = n3;
                if (b3.a != ab) {
                    break;
                }
                ak5 = ak2;
                ak6 = ak4;
                n2 = n3;
                if (a == ab) {
                    break;
                }
                ab = (ak3 = a);
                n = n3;
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
            ak ak11;
            ak ak12;
            while (true) {
                ak11 = ak8;
                ak12 = ak10;
                n2 = n;
                if (ac.l.b == null) {
                    break;
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
                int n4;
                if (ac.K != 8 && ac.ae == 3) {
                    if (ac.ad == 3) {
                        array2[0] = false;
                    }
                    n4 = n;
                    if (ac.u <= 0.0f) {
                        array2[0] = false;
                        n4 = n + 1;
                        final ak[] ao2 = this.ao;
                        final int length2 = ao2.length;
                        if (n4 >= length2) {
                            this.ao = Arrays.copyOf(ao2, length2 + length2);
                        }
                        this.ao[n] = ac;
                    }
                }
                else {
                    n4 = n;
                }
                final ak a2 = ac.l.b.a;
                final aj b7 = a2.j.b;
                if (b7 == null) {
                    ak11 = ak8;
                    ak12 = ak10;
                    n2 = n4;
                    break;
                }
                ak11 = ak8;
                ak12 = ak10;
                n2 = n4;
                if (b7.a != ac) {
                    break;
                }
                ak11 = ak8;
                ak12 = ak10;
                n2 = n4;
                if (a2 == ac) {
                    break;
                }
                ac = (ak9 = a2);
                n = n4;
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
            int n30 = 0;
            Label_3056: {
                Label_0055: {
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
                                            g2 = ((ak)this).g();
                                        }
                                    }
                                }
                                else {
                                    g2 = 0;
                                }
                                final float n6 = g2 - (float)n5;
                                float n8;
                                float n7;
                                ak ak6;
                                if (g == 0) {
                                    n7 = (n8 = n6 / (n3 + 1));
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
                                        Label_0732: {
                                            float n12;
                                            if (ak6.ad == 3) {
                                                if (n4 != 0.0f) {
                                                    n11 = n10 + (ak6.Z * n6 / n4 - n9 - a5);
                                                    break Label_0732;
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
                                        final float n14 = n8 / 2.0f;
                                        final ai f = ak6.i.f;
                                        final int n15 = (int)(n7 - n14 + 0.5f);
                                        ah.h(f, n15);
                                        ah.h(ak6.k.f, n15);
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
                                ak ak7;
                                ak ak8;
                                ak ak9;
                                if (g != 0) {
                                    if (b4) {
                                        a7 = ak2;
                                        ak7 = null;
                                        ak8 = null;
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
                                                int n16;
                                                if (b10.a.ad == 3) {
                                                    n16 = 2;
                                                }
                                                else {
                                                    n16 = 3;
                                                }
                                                ah.i(m.f, b10.f, a8, n16);
                                                final int a9 = ak2.k.a();
                                                final aj i2 = ak2.k.b.a.i;
                                                final aj b11 = i2.b;
                                                int n17 = a9;
                                                if (b11 != null) {
                                                    n17 = a9;
                                                    if (b11.a == ak2) {
                                                        n17 = a9 + i2.a();
                                                    }
                                                }
                                                final aj k2 = ak2.k;
                                                final aj b12 = k2.b;
                                                int n18;
                                                if (b12.a.ad == 3) {
                                                    n18 = 2;
                                                }
                                                else {
                                                    n18 = 3;
                                                }
                                                ah.j(k2.f, b12.f, -n17, n18);
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
                                            int n19 = a11;
                                            if (b13 != null) {
                                                n19 = a11 + b13.a();
                                            }
                                            final int a12 = ak11.k.a();
                                            final aj b14 = ak11.k.b;
                                            int n20 = a12;
                                            if (b14 != null) {
                                                n20 = a12 + b14.a();
                                            }
                                            ai ai2 = ak.k.b.f;
                                            final ak[] as = this.as;
                                            if (ak11 == as[3]) {
                                                ai2 = as[1].k.b.f;
                                            }
                                            if (ak11.c == 1) {
                                                final aj i3 = ak.i;
                                                ah.i(i3.f, i3.b.f, n19, 1);
                                                ah.j(ak.k.f, ai2, -n20, 1);
                                                ah.n(ak.k.f, ak.i.f, ak.h(), 2);
                                                break Label_0055;
                                            }
                                            final aj i4 = ak11.i;
                                            ah.n(i4.f, i4.b.f, n19, 1);
                                            ah.n(ak11.k.f, ai2, -n20, 1);
                                            break Label_0055;
                                        }
                                        else {
                                            int n21 = 0;
                                            final int n22 = g;
                                            while (true) {
                                                final int n23 = n22 - 1;
                                                if (n21 >= n23) {
                                                    break Label_0055;
                                                }
                                                final ak[] ao = this.ao;
                                                final ak ak12 = ao[n21];
                                                final int n24 = n21 + 1;
                                                final ak ak13 = ao[n24];
                                                final aj i5 = ak12.i;
                                                final ai f2 = i5.f;
                                                final ai f3 = ak12.k.f;
                                                final ai f4 = ak13.i.f;
                                                ai ai3 = ak13.k.f;
                                                final ak[] as2 = this.as;
                                                if (ak13 == as2[3]) {
                                                    ai3 = as2[1].k.f;
                                                }
                                                final int a13 = i5.a();
                                                final aj b15 = ak12.i.b;
                                                int n25 = a13;
                                                if (b15 != null) {
                                                    final aj k5 = b15.a.k;
                                                    final aj b16 = k5.b;
                                                    n25 = a13;
                                                    if (b16 != null) {
                                                        n25 = a13;
                                                        if (b16.a == ak12) {
                                                            n25 = a13 + k5.a();
                                                        }
                                                    }
                                                }
                                                ah.i(f2, ak12.i.b.f, n25, 2);
                                                int a14;
                                                final int n26 = a14 = ak12.k.a();
                                                if (ak12.k.b != null) {
                                                    final ak ab3 = ak12.ab;
                                                    a14 = n26;
                                                    if (ab3 != null) {
                                                        final aj i6 = ab3.i;
                                                        int a15;
                                                        if (i6.b != null) {
                                                            a15 = i6.a();
                                                        }
                                                        else {
                                                            a15 = 0;
                                                        }
                                                        a14 = n26 + a15;
                                                    }
                                                }
                                                ah.j(f3, ak12.k.b.f, -a14, 2);
                                                if (n24 == n23) {
                                                    final int a16 = ak13.i.a();
                                                    final aj b17 = ak13.i.b;
                                                    int n27 = a16;
                                                    if (b17 != null) {
                                                        final aj k6 = b17.a.k;
                                                        final aj b18 = k6.b;
                                                        n27 = a16;
                                                        if (b18 != null) {
                                                            n27 = a16;
                                                            if (b18.a == ak13) {
                                                                n27 = a16 + k6.a();
                                                            }
                                                        }
                                                    }
                                                    ah.i(f4, ak13.i.b.f, n27, 2);
                                                    aj aj = ak13.k;
                                                    final ak[] as3 = this.as;
                                                    if (ak13 == as3[3]) {
                                                        aj = as3[1].k;
                                                    }
                                                    final int a17 = aj.a();
                                                    final aj b19 = aj.b;
                                                    int n28 = a17;
                                                    if (b19 != null) {
                                                        final aj i7 = b19.a.i;
                                                        final aj b20 = i7.b;
                                                        n28 = a17;
                                                        if (b20 != null) {
                                                            n28 = a17;
                                                            if (b20.a == ak13) {
                                                                n28 = a17 + i7.a();
                                                            }
                                                        }
                                                    }
                                                    ah.j(ai3, aj.b.f, -n28, 2);
                                                }
                                                final int f5 = ak.f;
                                                if (f5 > 0) {
                                                    ah.j(f3, f2, f5, 2);
                                                }
                                                final af a18 = ah.a();
                                                a18.f(ak12.Z, n2, ak13.Z, f2, ak12.i.a(), f3, ak12.k.a(), f4, ak13.i.a(), ai3, ak13.k.a());
                                                ah.g(a18);
                                                n21 = n24;
                                            }
                                        }
                                    }
                                }
                                else {
                                    a7 = ak2;
                                    ak7 = null;
                                    ak8 = null;
                                    b = false;
                                    ak9 = ak;
                                }
                                while (true) {
                                    final ak ak14 = a7;
                                    if (ak14 == null) {
                                        break;
                                    }
                                    ak ab4 = ak14.ab;
                                    if (ab4 == null) {
                                        ak7 = this.as[1];
                                        b = true;
                                    }
                                    Label_2612: {
                                        if (b4) {
                                            final aj i8 = ak14.i;
                                            int a19 = i8.a();
                                            if (ak8 != null) {
                                                a19 += ak8.k.a();
                                            }
                                            int n29;
                                            if (ak2 != ak14) {
                                                n29 = 3;
                                            }
                                            else {
                                                n29 = 1;
                                            }
                                            ah.i(i8.f, i8.b.f, a19, n29);
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
                                            Label_2749: {
                                                if (ak8 == null) {
                                                    final aj b22 = ak9.i.b;
                                                    if (b22 == null) {
                                                        ai5 = null;
                                                        break Label_2749;
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
                                            if ((ab4 = a7) != null) {
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
                                                ab4 = a7;
                                                if (ai5 != null) {
                                                    ab4 = a7;
                                                    if (ai6 != null) {
                                                        ah.m(i10.f, ai5, a20, 0.5f, ai6, k9.f, a21);
                                                        break Label_2612;
                                                    }
                                                }
                                            }
                                        }
                                        a7 = ab4;
                                    }
                                    if (b) {
                                        a7 = null;
                                    }
                                    ak8 = ak14;
                                }
                                n30 = n;
                                if (!b4) {
                                    break Label_3056;
                                }
                                final aj i11 = ak2.i;
                                final aj k10 = ak7.k;
                                final int a22 = i11.a();
                                final int a23 = k10.a();
                                final aj b25 = ak9.i.b;
                                ai f6;
                                if (b25 != null) {
                                    f6 = b25.f;
                                }
                                else {
                                    f6 = null;
                                }
                                final aj b26 = ak7.k.b;
                                ai f7;
                                if (b26 != null) {
                                    f7 = b26.f;
                                }
                                else {
                                    f7 = null;
                                }
                                n30 = n;
                                if (f6 == null) {
                                    break Label_3056;
                                }
                                n30 = n;
                                if (f7 != null) {
                                    ah.j(k10.f, f7, -a23, 1);
                                    ah.m(i11.f, f6, a22, ak9.H, f7, k10.f, a23);
                                    n30 = n;
                                }
                                break Label_3056;
                            }
                        }
                    }
                }
                n30 = n;
            }
            n = n30 + 1;
        }
    }
    
    private final void I(final ah ah) {
        int n = 0;
        while (true) {
            boolean b = false;
            if (n >= this.an) {
                break;
            }
            ak ak = this.ap[n];
            final int g = this.G(ah, this.as, ak, 1, this.ar);
            ak ak2 = this.as[2];
            int n31 = 0;
            Label_3142: {
                Label_0055: {
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
                                    Label_0438: {
                                        if (a3 != null) {
                                            final aj b5 = a3.j.b;
                                            if (b5 != null) {
                                                ak5 = a3;
                                                if (b5.a == ak3) {
                                                    break Label_0438;
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
                                            a4 = ((ak)this).a();
                                        }
                                    }
                                }
                                else {
                                    a4 = 0;
                                }
                                final float n6 = a4 - (float)n5;
                                float n8;
                                float n7;
                                if (g == 0) {
                                    n7 = (n8 = n6 / (n3 + 1));
                                }
                                else {
                                    n8 = n6 / g;
                                    n7 = 0.0f;
                                }
                                while (ak != null) {
                                    final aj i = ak.j;
                                    int a5;
                                    if (i.b != null) {
                                        a5 = i.a();
                                    }
                                    else {
                                        a5 = 0;
                                    }
                                    final aj k = ak.l;
                                    int a6;
                                    if (k.b != null) {
                                        a6 = k.a();
                                    }
                                    else {
                                        a6 = 0;
                                    }
                                    if (ak.K != 8) {
                                        final float n9 = (float)a5;
                                        final float n10 = n7 + n9;
                                        ah.h(ak.j.f, (int)(n10 + 0.5f));
                                        float n11 = 0.0f;
                                        Label_0724: {
                                            float n12;
                                            if (ak.ae == 3) {
                                                if (n4 != 0.0f) {
                                                    n11 = n10 + (ak.aa * n6 / n4 - n9 - a6);
                                                    break Label_0724;
                                                }
                                                n12 = n8 - n9 - a6;
                                            }
                                            else {
                                                n12 = (float)ak.d();
                                            }
                                            n11 = n10 + n12;
                                        }
                                        ah.h(ak.l.f, (int)(n11 + 0.5f));
                                        float n13 = n11;
                                        if (g == 0) {
                                            n13 = n11 + n8;
                                        }
                                        n7 = n13 + a6;
                                    }
                                    else {
                                        final float n14 = n8 / 2.0f;
                                        final ai f = ak.j.f;
                                        final int n15 = (int)(n7 - n14 + 0.5f);
                                        ah.h(f, n15);
                                        ah.h(ak.l.f, n15);
                                    }
                                    final aj b7 = ak.l.b;
                                    ak a7;
                                    if (b7 != null) {
                                        a7 = b7.a;
                                    }
                                    else {
                                        a7 = null;
                                    }
                                    Object o = null;
                                    Label_0881: {
                                        if (a7 != null) {
                                            final aj b8 = a7.j.b;
                                            if (b8 != null && b8.a != ak) {
                                                o = null;
                                                break Label_0881;
                                            }
                                        }
                                        o = a7;
                                    }
                                    Object o2 = o;
                                    if (o == this) {
                                        o2 = null;
                                    }
                                    ak = (ak)o2;
                                }
                            }
                            else {
                                ak a8;
                                ak ak6;
                                ak ak7;
                                ak ak8;
                                if (g != 0) {
                                    if (b3) {
                                        a8 = ak2;
                                        ak6 = null;
                                        ak7 = null;
                                        ak8 = ak;
                                    }
                                    else {
                                        ak ak9 = null;
                                        while (ak2 != null) {
                                            if (ak2.ae != 3) {
                                                int a9 = ak2.j.a();
                                                if (ak9 != null) {
                                                    a9 += ak9.l.a();
                                                }
                                                final aj m = ak2.j;
                                                final aj b9 = m.b;
                                                int n16;
                                                if (b9.a.ae == 3) {
                                                    n16 = 2;
                                                }
                                                else {
                                                    n16 = 3;
                                                }
                                                ah.i(m.f, b9.f, a9, n16);
                                                final int a10 = ak2.l.a();
                                                final aj j2 = ak2.l.b.a.j;
                                                final aj b10 = j2.b;
                                                int n17 = a10;
                                                if (b10 != null) {
                                                    n17 = a10;
                                                    if (b10.a == ak2) {
                                                        n17 = a10 + j2.a();
                                                    }
                                                }
                                                final aj l2 = ak2.l;
                                                final aj b11 = l2.b;
                                                int n18;
                                                if (b11.a.ae == 3) {
                                                    n18 = 2;
                                                }
                                                else {
                                                    n18 = 3;
                                                }
                                                ah.j(l2.f, b11.f, -n17, n18);
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
                                            ak9 = ak2;
                                            ak2 = ac2;
                                        }
                                        if (g == 1) {
                                            final ak ak10 = this.ao[0];
                                            final int a12 = ak10.j.a();
                                            final aj b12 = ak10.j.b;
                                            int n19 = a12;
                                            if (b12 != null) {
                                                n19 = a12 + b12.a();
                                            }
                                            final int a13 = ak10.l.a();
                                            final aj b13 = ak10.l.b;
                                            int n20 = a13;
                                            if (b13 != null) {
                                                n20 = a13 + b13.a();
                                            }
                                            ai ai2 = ak.l.b.f;
                                            final ak[] as = this.as;
                                            if (ak10 == as[3]) {
                                                ai2 = as[1].l.b.f;
                                            }
                                            if (ak10.d == 1) {
                                                final aj j3 = ak.j;
                                                ah.i(j3.f, j3.b.f, n19, 1);
                                                ah.j(ak.l.f, ai2, -n20, 1);
                                                ah.n(ak.l.f, ak.j.f, ak.d(), 2);
                                                break Label_0055;
                                            }
                                            final aj j4 = ak10.j;
                                            ah.n(j4.f, j4.b.f, n19, 1);
                                            ah.n(ak10.l.f, ai2, -n20, 1);
                                            break Label_0055;
                                        }
                                        else {
                                            int n21 = 0;
                                            final int n22 = g;
                                            while (true) {
                                                final int n23 = n22 - 1;
                                                if (n21 >= n23) {
                                                    break Label_0055;
                                                }
                                                final ak[] ao = this.ao;
                                                final ak ak11 = ao[n21];
                                                final int n24 = n21 + 1;
                                                final ak ak12 = ao[n24];
                                                final aj j5 = ak11.j;
                                                final ai f2 = j5.f;
                                                final ai f3 = ak11.l.f;
                                                final ai f4 = ak12.j.f;
                                                ai ai3 = ak12.l.f;
                                                final ak[] as2 = this.as;
                                                if (ak12 == as2[3]) {
                                                    ai3 = as2[1].l.f;
                                                }
                                                final int a14 = j5.a();
                                                final aj b14 = ak11.j.b;
                                                int n25 = a14;
                                                if (b14 != null) {
                                                    final aj l5 = b14.a.l;
                                                    final aj b15 = l5.b;
                                                    n25 = a14;
                                                    if (b15 != null) {
                                                        n25 = a14;
                                                        if (b15.a == ak11) {
                                                            n25 = a14 + l5.a();
                                                        }
                                                    }
                                                }
                                                ah.i(f2, ak11.j.b.f, n25, 2);
                                                int a15;
                                                final int n26 = a15 = ak11.l.a();
                                                if (ak11.l.b != null) {
                                                    final ak ac3 = ak11.ac;
                                                    a15 = n26;
                                                    if (ac3 != null) {
                                                        final aj j6 = ac3.j;
                                                        int a16;
                                                        if (j6.b != null) {
                                                            a16 = j6.a();
                                                        }
                                                        else {
                                                            a16 = 0;
                                                        }
                                                        a15 = n26 + a16;
                                                    }
                                                }
                                                ah.j(f3, ak11.l.b.f, -a15, 2);
                                                if (n24 == n23) {
                                                    final int a17 = ak12.j.a();
                                                    final aj b16 = ak12.j.b;
                                                    int n27 = a17;
                                                    if (b16 != null) {
                                                        final aj l6 = b16.a.l;
                                                        final aj b17 = l6.b;
                                                        n27 = a17;
                                                        if (b17 != null) {
                                                            n27 = a17;
                                                            if (b17.a == ak12) {
                                                                n27 = a17 + l6.a();
                                                            }
                                                        }
                                                    }
                                                    ah.i(f4, ak12.j.b.f, n27, 2);
                                                    aj aj = ak12.l;
                                                    final ak[] as3 = this.as;
                                                    if (ak12 == as3[3]) {
                                                        aj = as3[1].l;
                                                    }
                                                    final int a18 = aj.a();
                                                    final aj b18 = aj.b;
                                                    int n28 = a18;
                                                    if (b18 != null) {
                                                        final aj j7 = b18.a.j;
                                                        final aj b19 = j7.b;
                                                        n28 = a18;
                                                        if (b19 != null) {
                                                            n28 = a18;
                                                            if (b19.a == ak12) {
                                                                n28 = a18 + j7.a();
                                                            }
                                                        }
                                                    }
                                                    ah.j(ai3, aj.b.f, -n28, 2);
                                                }
                                                final int h = ak.h;
                                                if (h > 0) {
                                                    ah.j(f3, f2, h, 2);
                                                }
                                                final af a19 = ah.a();
                                                a19.f(ak11.aa, n2, ak12.aa, f2, ak11.j.a(), f3, ak11.l.a(), f4, ak12.j.a(), ai3, ak12.l.a());
                                                ah.g(a19);
                                                n21 = n24;
                                            }
                                        }
                                    }
                                }
                                else {
                                    a8 = ak2;
                                    ak6 = null;
                                    ak7 = null;
                                    b = false;
                                    ak8 = ak;
                                }
                                while (true) {
                                    final ak ak13 = a8;
                                    if (ak13 == null) {
                                        break;
                                    }
                                    final ak ac4 = ak13.ac;
                                    if (ac4 == null) {
                                        ak6 = this.as[1];
                                        b = true;
                                    }
                                    Label_2698: {
                                        ak ak14 = null;
                                        Label_2694: {
                                            if (b3) {
                                                final aj j8 = ak13.j;
                                                int a20;
                                                final int n29 = a20 = j8.a();
                                                if (ak7 != null) {
                                                    a20 = n29 + ak7.l.a();
                                                }
                                                int n30;
                                                if (ak2 != ak13) {
                                                    n30 = 3;
                                                }
                                                else {
                                                    n30 = 1;
                                                }
                                                final aj b20 = j8.b;
                                                ai ai4;
                                                ai ai5;
                                                if (b20 != null) {
                                                    ai4 = j8.f;
                                                    ai5 = b20.f;
                                                }
                                                else {
                                                    final aj m2 = ak13.m;
                                                    final aj b21 = m2.b;
                                                    if (b21 != null) {
                                                        ai4 = m2.f;
                                                        ai5 = b21.f;
                                                        a20 -= j8.a();
                                                    }
                                                    else {
                                                        ai5 = null;
                                                        ai4 = null;
                                                    }
                                                }
                                                if (ai4 != null && ai5 != null) {
                                                    ah.i(ai4, ai5, a20, n30);
                                                }
                                                if (ak13.ae == 3) {
                                                    final aj l7 = ak13.l;
                                                    if (ak13.d == 1) {
                                                        ah.n(l7.f, j8.f, Math.max(ak13.g, ak13.d()), 3);
                                                    }
                                                    else {
                                                        ah.i(j8.f, j8.b.f, j8.c, 3);
                                                        ah.j(l7.f, j8.f, ak13.g, 3);
                                                    }
                                                }
                                            }
                                            else if (!b2 && b && ak7 != null) {
                                                final aj l8 = ak13.l;
                                                if (l8.b == null) {
                                                    ah.h(l8.f, ak13.c() + ak13.z);
                                                }
                                                else {
                                                    ah.n(ak13.l.f, ak6.l.b.f, -l8.a(), 5);
                                                }
                                            }
                                            else if (!b2 && !b && ak7 == null) {
                                                final aj j9 = ak13.j;
                                                if (j9.b == null) {
                                                    ah.h(j9.f, ak13.c());
                                                }
                                                else {
                                                    ah.n(ak13.j.f, ak8.j.b.f, j9.a(), 5);
                                                }
                                            }
                                            else {
                                                final aj j10 = ak13.j;
                                                final aj l9 = ak13.l;
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
                                                Label_2835: {
                                                    if (ak7 == null) {
                                                        final aj b23 = ak8.j.b;
                                                        if (b23 == null) {
                                                            ai7 = null;
                                                            break Label_2835;
                                                        }
                                                        ai6 = b23.f;
                                                    }
                                                    ai7 = ai6;
                                                }
                                                a8 = ac4;
                                                if (ac4 == null) {
                                                    final aj b24 = ak6.l.b;
                                                    if (b24 != null) {
                                                        a8 = b24.a;
                                                    }
                                                    else {
                                                        a8 = null;
                                                    }
                                                }
                                                if ((ak14 = a8) == null) {
                                                    break Label_2694;
                                                }
                                                ai ai8 = a8.j.f;
                                                if (b) {
                                                    final aj b25 = ak6.l.b;
                                                    if (b25 != null) {
                                                        ai8 = b25.f;
                                                    }
                                                    else {
                                                        ai8 = null;
                                                    }
                                                }
                                                ak14 = a8;
                                                if (ai7 == null) {
                                                    break Label_2694;
                                                }
                                                ak14 = a8;
                                                if (ai8 != null) {
                                                    ah.m(j10.f, ai7, a21, 0.5f, ai8, l9.f, a22);
                                                    break Label_2698;
                                                }
                                                break Label_2694;
                                            }
                                            ak14 = ac4;
                                        }
                                        a8 = ak14;
                                    }
                                    if (b) {
                                        a8 = null;
                                    }
                                    ak7 = ak13;
                                }
                                n31 = n;
                                if (!b3) {
                                    break Label_3142;
                                }
                                final aj j11 = ak2.j;
                                final aj l10 = ak6.l;
                                final int a23 = j11.a();
                                final int a24 = l10.a();
                                final aj b26 = ak8.j.b;
                                ai f5;
                                if (b26 != null) {
                                    f5 = b26.f;
                                }
                                else {
                                    f5 = null;
                                }
                                final aj b27 = ak6.l.b;
                                ai f6;
                                if (b27 != null) {
                                    f6 = b27.f;
                                }
                                else {
                                    f6 = null;
                                }
                                n31 = n;
                                if (f5 == null) {
                                    break Label_3142;
                                }
                                n31 = n;
                                if (f6 != null) {
                                    ah.j(l10.f, f6, -a24, 1);
                                    ah.m(j11.f, f5, a23, ak8.I, f6, l10.f, a24);
                                    n31 = n;
                                }
                                break Label_3142;
                            }
                        }
                    }
                }
                n31 = n;
            }
            n = n31 + 1;
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
        final boolean b = false;
        final int n = 0;
        int n2 = 0;
        if (ad == 3 && ak.ae == 3 && ak.u > 0.0f) {
            array[0] = false;
            return;
        }
        int n3 = ak.f();
        if (ak.ad == 3 && ak.ae != 3 && ak.u > 0.0f) {
            array[0] = false;
            return;
        }
        ak.T = true;
        Label_0816: {
            if (ak instanceof am) {
                final am am = (am)ak;
                if (am.ai == 1) {
                    final int ag = am.ag;
                    if (ag != -1) {
                        n2 = ag;
                    }
                    else {
                        n3 = am.ah;
                        if (n3 != -1) {
                            n2 = n;
                            break Label_0816;
                        }
                    }
                    n3 = 0;
                }
                else {
                    n2 = (n3 = n3);
                }
            }
            else if (!ak.k.c() && !ak.i.c()) {
                n2 = n3 + ak.w;
            }
            else {
                final aj k = ak.k;
                final aj b2 = k.b;
                Label_0261: {
                    if (b2 != null) {
                        final aj b3 = ak.i.b;
                        if (b3 != null) {
                            if (b2 != b3) {
                                final ak a = b2.a;
                                if (a != b3.a) {
                                    break Label_0261;
                                }
                                if (a == ak.r) {
                                    break Label_0261;
                                }
                            }
                            array[0] = false;
                            return;
                        }
                    }
                }
                ak ak2 = null;
                int n5;
                ak ak3;
                if (b2 != null) {
                    final ak a2 = b2.a;
                    final int n4 = n5 = k.a() + n3;
                    ak3 = a2;
                    if (!a2.s()) {
                        n5 = n4;
                        ak3 = a2;
                        if (!a2.T) {
                            this.B(a2, array);
                            n5 = n4;
                            ak3 = a2;
                        }
                    }
                }
                else {
                    n5 = n3;
                    ak3 = null;
                }
                final aj i = ak.i;
                final aj b4 = i.b;
                int n6 = n3;
                if (b4 != null) {
                    final ak a3 = b4.a;
                    final int n7 = n6 = n3 + i.a();
                    ak2 = a3;
                    if (!a3.s()) {
                        n6 = n7;
                        ak2 = a3;
                        if (!a3.T) {
                            this.B(a3, array);
                            ak2 = a3;
                            n6 = n7;
                        }
                    }
                }
                n3 = n5;
                Label_0615: {
                    if (ak.k.b != null) {
                        n3 = n5;
                        if (!ak3.s()) {
                            final int g = ak.k.b.g;
                            int n9 = 0;
                            Label_0508: {
                                int n8;
                                if (g == 4) {
                                    n8 = ak3.N - ak3.f();
                                }
                                else {
                                    n9 = n5;
                                    if (g != 2) {
                                        break Label_0508;
                                    }
                                    n8 = ak3.N;
                                }
                                n9 = n5 + n8;
                            }
                            final boolean q = ak3.Q || (ak3.i.b != null && ak3.k.b != null && ak3.ad != 3);
                            ak.Q = q;
                            n3 = n9;
                            if (q) {
                                final aj b5 = ak3.i.b;
                                if (b5 != null) {
                                    n3 = n9;
                                    if (b5.a == ak) {
                                        break Label_0615;
                                    }
                                }
                                n3 = n9 + (n9 - ak3.N);
                            }
                        }
                    }
                }
                int n10 = n6;
                Label_0813: {
                    if (ak.i.b != null) {
                        n10 = n6;
                        if (!ak2.s()) {
                            final int g2 = ak.i.b.g;
                            int n11 = 0;
                            Label_0698: {
                                int m;
                                if (g2 == 2) {
                                    m = ak2.M - ak2.f();
                                }
                                else {
                                    n11 = n6;
                                    if (g2 != 4) {
                                        break Label_0698;
                                    }
                                    m = ak2.M;
                                }
                                n11 = n6 + m;
                            }
                            boolean p2 = false;
                            Label_0752: {
                                if (!ak2.P) {
                                    p2 = b;
                                    if (ak2.i.b == null) {
                                        break Label_0752;
                                    }
                                    p2 = b;
                                    if (ak2.k.b == null) {
                                        break Label_0752;
                                    }
                                    p2 = b;
                                    if (ak2.ad == 3) {
                                        break Label_0752;
                                    }
                                }
                                p2 = true;
                            }
                            ak.P = p2;
                            n10 = n11;
                            if (p2) {
                                final aj b6 = ak2.k.b;
                                if (b6 != null) {
                                    if (b6.a == ak) {
                                        n10 = n11;
                                        break Label_0813;
                                    }
                                }
                                n2 = n11 + (n11 - ak2.M);
                                break Label_0816;
                            }
                        }
                    }
                }
                n2 = n10;
            }
        }
        int j = n2;
        int n12 = n3;
        if (ak.K == 8) {
            final int s = ak.s;
            j = n2 - s;
            n12 = n3 - s;
        }
        ak.M = j;
        ak.N = n12;
    }
    
    public final void C(final ak ak, final boolean[] array) {
        final int ae = ak.ae;
        final boolean b = false;
        final int n = 0;
        int n2 = 0;
        if (ae == 3 && ak.ad != 3 && ak.u > 0.0f) {
            array[0] = false;
            return;
        }
        final int e = ak.e();
        ak.U = true;
        int ag = 0;
        Label_0983: {
            if (ak instanceof am) {
                final am am = (am)ak;
                if (am.ai == 0) {
                    ag = am.ag;
                    if (ag != -1) {
                        n2 = n;
                    }
                    else {
                        final int ah = am.ah;
                        if (ah != -1) {
                            n2 = ah;
                        }
                        ag = 0;
                    }
                }
                else {
                    n2 = (ag = e);
                }
            }
            else {
                final aj m = ak.m;
                int n3 = 0;
                int n4 = 0;
                Label_0170: {
                    if (m.b == null && ak.j.b == null && ak.l.b == null) {
                        n3 = e + ak.x;
                        n4 = e;
                    }
                    else {
                        final aj b2 = ak.l.b;
                        Label_0249: {
                            if (b2 != null) {
                                final aj b3 = ak.j.b;
                                if (b3 != null) {
                                    if (b2 != b3) {
                                        final ak a = b2.a;
                                        if (a != b3.a) {
                                            break Label_0249;
                                        }
                                        if (a == ak.r) {
                                            break Label_0249;
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
                            final int max = Math.max(a2.L - a2.t + e, e);
                            int max2 = Math.max(a2.O - a2.t + e, e);
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
                            final int n5 = n6 = j.a() + e;
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
                            n6 = e;
                            ak2 = null;
                        }
                        int n7 = e;
                        if (ak.l.c()) {
                            final aj i = ak.l;
                            a3 = i.b.a;
                            n7 = e + i.a();
                            if (!a3.s() && !a3.U) {
                                this.C(a3, array);
                            }
                        }
                        ag = n6;
                        Label_0744: {
                            if (ak.j.b != null) {
                                ag = n6;
                                if (!ak2.s()) {
                                    final int g = ak.j.b.g;
                                    int n8 = 0;
                                    Label_0617: {
                                        int k;
                                        if (g == 3) {
                                            k = ak2.L - ak2.e();
                                        }
                                        else {
                                            n8 = n6;
                                            if (g != 5) {
                                                break Label_0617;
                                            }
                                            k = ak2.L;
                                        }
                                        n8 = n6 + k;
                                    }
                                    boolean r = false;
                                    Label_0688: {
                                        Label_0685: {
                                            if (!ak2.R) {
                                                final aj b4 = ak2.j.b;
                                                if (b4 != null && b4.a != ak) {
                                                    final aj b5 = ak2.l.b;
                                                    if (b5 != null && b5.a != ak && ak2.ae != 3) {
                                                        break Label_0685;
                                                    }
                                                }
                                                r = false;
                                                break Label_0688;
                                            }
                                        }
                                        r = true;
                                    }
                                    ak.R = r;
                                    ag = n8;
                                    if (r) {
                                        final aj b6 = ak2.l.b;
                                        if (b6 != null) {
                                            ag = n8;
                                            if (b6.a == ak) {
                                                break Label_0744;
                                            }
                                        }
                                        ag = n8 + (n8 - ak2.L);
                                    }
                                }
                            }
                        }
                        n4 = n7;
                        n3 = ag;
                        if (ak.l.b != null) {
                            n4 = n7;
                            n3 = ag;
                            if (!a3.s()) {
                                final int g2 = ak.l.b.g;
                                int n9 = 0;
                                Label_0835: {
                                    int o;
                                    if (g2 == 5) {
                                        o = a3.O - a3.e();
                                    }
                                    else {
                                        n9 = n7;
                                        if (g2 != 3) {
                                            break Label_0835;
                                        }
                                        o = a3.O;
                                    }
                                    n9 = n7 + o;
                                }
                                boolean s = false;
                                Label_0917: {
                                    if (!a3.S) {
                                        final aj b7 = a3.j.b;
                                        s = b;
                                        if (b7 == null) {
                                            break Label_0917;
                                        }
                                        s = b;
                                        if (b7.a == ak) {
                                            break Label_0917;
                                        }
                                        final aj b8 = a3.l.b;
                                        s = b;
                                        if (b8 == null) {
                                            break Label_0917;
                                        }
                                        s = b;
                                        if (b8.a == ak) {
                                            break Label_0917;
                                        }
                                        s = b;
                                        if (a3.ae == 3) {
                                            break Label_0917;
                                        }
                                    }
                                    s = true;
                                }
                                ak.S = s;
                                n4 = n9;
                                n3 = ag;
                                if (s) {
                                    final aj b9 = a3.j.b;
                                    if (b9 != null) {
                                        if (b9.a == ak) {
                                            n4 = n9;
                                            n3 = ag;
                                            break Label_0170;
                                        }
                                    }
                                    n2 = n9 + (n9 - a3.O);
                                    break Label_0983;
                                }
                            }
                        }
                    }
                }
                n2 = n4;
                ag = n3;
            }
        }
        int o2 = n2;
        int l2 = ag;
        if (ak.K == 8) {
            final int t2 = ak.t;
            l2 = ag - t2;
            o2 = n2 - t2;
        }
        ak.L = l2;
        ak.O = o2;
    }
    
    public final void D() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        al.w:I
        //     4: istore          15
        //     6: aload_0        
        //     7: getfield        al.x:I
        //    10: istore          5
        //    12: iconst_0       
        //    13: aload_0        
        //    14: invokevirtual   ak.h:()I
        //    17: invokestatic    java/lang/Math.max:(II)I
        //    20: istore          16
        //    22: iconst_0       
        //    23: aload_0        
        //    24: invokevirtual   ak.d:()I
        //    27: invokestatic    java/lang/Math.max:(II)I
        //    30: istore          17
        //    32: aload_0        
        //    33: iconst_0       
        //    34: putfield        al.aj:Z
        //    37: aload_0        
        //    38: iconst_0       
        //    39: putfield        al.ak:Z
        //    42: aload_0        
        //    43: getfield        al.r:Lak;
        //    46: ifnull          327
        //    49: aload_0        
        //    50: getfield        al.at:Lize;
        //    53: ifnonnull       68
        //    56: aload_0        
        //    57: new             Lize;
        //    60: dup            
        //    61: aload_0        
        //    62: invokespecial   ize.<init>:(Lak;)V
        //    65: putfield        al.at:Lize;
        //    68: aload_0        
        //    69: getfield        al.at:Lize;
        //    72: astore          33
        //    74: aload           33
        //    76: aload_0        
        //    77: getfield        ak.w:I
        //    80: putfield        ize.c:I
        //    83: aload           33
        //    85: aload_0        
        //    86: getfield        ak.x:I
        //    89: putfield        ize.d:I
        //    92: aload           33
        //    94: aload_0        
        //    95: invokevirtual   ak.h:()I
        //    98: putfield        ize.a:I
        //   101: aload           33
        //   103: aload_0        
        //   104: invokevirtual   ak.d:()I
        //   107: putfield        ize.b:I
        //   110: aload           33
        //   112: getfield        ize.e:Ljava/lang/Object;
        //   115: checkcast       Ljava/util/ArrayList;
        //   118: invokevirtual   java/util/ArrayList.size:()I
        //   121: istore          6
        //   123: iconst_0       
        //   124: istore          4
        //   126: iload           4
        //   128: iload           6
        //   130: if_icmpge       263
        //   133: aload           33
        //   135: getfield        ize.e:Ljava/lang/Object;
        //   138: checkcast       Ljava/util/ArrayList;
        //   141: iload           4
        //   143: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   146: checkcast       Laexv;
        //   149: astore          32
        //   151: aload           32
        //   153: aload_0        
        //   154: aload           32
        //   156: getfield        aexv.e:Ljava/lang/Object;
        //   159: checkcast       Laj;
        //   162: getfield        aj.g:I
        //   165: invokevirtual   ak.t:(I)Laj;
        //   168: putfield        aexv.e:Ljava/lang/Object;
        //   171: aload           32
        //   173: getfield        aexv.e:Ljava/lang/Object;
        //   176: astore          34
        //   178: aload           34
        //   180: ifnull          233
        //   183: aload           34
        //   185: checkcast       Laj;
        //   188: astore          34
        //   190: aload           32
        //   192: aload           34
        //   194: getfield        aj.b:Laj;
        //   197: putfield        aexv.d:Ljava/lang/Object;
        //   200: aload           32
        //   202: aload           34
        //   204: invokevirtual   aj.a:()I
        //   207: putfield        aexv.b:I
        //   210: aload           32
        //   212: aload           34
        //   214: getfield        aj.h:I
        //   217: putfield        aexv.a:I
        //   220: aload           32
        //   222: aload           34
        //   224: getfield        aj.e:I
        //   227: putfield        aexv.c:I
        //   230: goto            257
        //   233: aload           32
        //   235: aconst_null    
        //   236: putfield        aexv.d:Ljava/lang/Object;
        //   239: aload           32
        //   241: iconst_0       
        //   242: putfield        aexv.b:I
        //   245: aload           32
        //   247: iconst_2       
        //   248: putfield        aexv.a:I
        //   251: aload           32
        //   253: iconst_0       
        //   254: putfield        aexv.c:I
        //   257: iinc            4, 1
        //   260: goto            126
        //   263: aload_0        
        //   264: iconst_0       
        //   265: putfield        ak.w:I
        //   268: aload_0        
        //   269: iconst_0       
        //   270: putfield        ak.x:I
        //   273: aload_0        
        //   274: getfield        ak.q:Ljava/util/ArrayList;
        //   277: invokevirtual   java/util/ArrayList.size:()I
        //   280: istore          6
        //   282: iconst_0       
        //   283: istore          4
        //   285: iload           4
        //   287: iload           6
        //   289: if_icmpge       313
        //   292: aload_0        
        //   293: getfield        ak.q:Ljava/util/ArrayList;
        //   296: iload           4
        //   298: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   301: checkcast       Laj;
        //   304: invokevirtual   aj.b:()V
        //   307: iinc            4, 1
        //   310: goto            285
        //   313: aload_0        
        //   314: aload_0        
        //   315: getfield        al.af:Lah;
        //   318: getfield        ah.g:Lcdr;
        //   321: invokevirtual   ak.z:(Lcdr;)V
        //   324: goto            337
        //   327: aload_0        
        //   328: iconst_0       
        //   329: putfield        al.w:I
        //   332: aload_0        
        //   333: iconst_0       
        //   334: putfield        al.x:I
        //   337: aload_0        
        //   338: getfield        al.ae:I
        //   341: istore          20
        //   343: aload_0        
        //   344: getfield        al.ad:I
        //   347: istore          6
        //   349: aload_0        
        //   350: getfield        al.ai:I
        //   353: iconst_2       
        //   354: if_icmpne       1037
        //   357: iload           6
        //   359: istore          4
        //   361: iload           20
        //   363: iconst_2       
        //   364: if_icmpeq       393
        //   367: iload           6
        //   369: iconst_2       
        //   370: if_icmpne       379
        //   373: iconst_2       
        //   374: istore          4
        //   376: goto            393
        //   379: iconst_0       
        //   380: istore          26
        //   382: iload           6
        //   384: istore          18
        //   386: iload           5
        //   388: istore          19
        //   390: goto            1052
        //   393: aload_0        
        //   394: getfield        al.al:Ljava/util/ArrayList;
        //   397: astore          33
        //   399: aload_0        
        //   400: getfield        al.ar:[Z
        //   403: astore          32
        //   405: aload           33
        //   407: invokevirtual   java/util/ArrayList.size:()I
        //   410: istore          18
        //   412: aload           32
        //   414: iconst_0       
        //   415: iconst_1       
        //   416: bastore        
        //   417: iconst_0       
        //   418: istore          14
        //   420: iconst_0       
        //   421: istore          12
        //   423: iconst_0       
        //   424: istore          13
        //   426: iconst_0       
        //   427: istore          9
        //   429: iconst_0       
        //   430: istore          10
        //   432: iconst_0       
        //   433: istore          11
        //   435: iconst_0       
        //   436: istore          8
        //   438: iload           9
        //   440: iload           18
        //   442: if_icmpge       748
        //   445: aload           33
        //   447: iload           9
        //   449: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   452: checkcast       Lak;
        //   455: astore          34
        //   457: aload           34
        //   459: invokevirtual   ak.s:()Z
        //   462: ifeq            468
        //   465: goto            742
        //   468: aload           34
        //   470: getfield        ak.T:Z
        //   473: ifne            484
        //   476: aload_0        
        //   477: aload           34
        //   479: aload           32
        //   481: invokevirtual   al.B:(Lak;[Z)V
        //   484: aload           34
        //   486: getfield        ak.U:Z
        //   489: ifne            500
        //   492: aload_0        
        //   493: aload           34
        //   495: aload           32
        //   497: invokevirtual   al.C:(Lak;[Z)V
        //   500: aload           32
        //   502: iconst_0       
        //   503: baload         
        //   504: ifne            510
        //   507: goto            866
        //   510: aload           34
        //   512: getfield        ak.M:I
        //   515: istore          6
        //   517: aload           34
        //   519: getfield        ak.N:I
        //   522: istore          23
        //   524: aload           34
        //   526: invokevirtual   ak.h:()I
        //   529: istore          22
        //   531: aload           34
        //   533: getfield        ak.L:I
        //   536: istore          19
        //   538: aload           34
        //   540: getfield        ak.O:I
        //   543: istore          7
        //   545: aload           34
        //   547: invokevirtual   ak.d:()I
        //   550: istore          21
        //   552: aload           34
        //   554: getfield        ak.ad:I
        //   557: iconst_4       
        //   558: if_icmpne       589
        //   561: aload           34
        //   563: invokevirtual   ak.h:()I
        //   566: aload           34
        //   568: getfield        ak.i:Laj;
        //   571: getfield        aj.c:I
        //   574: iadd           
        //   575: aload           34
        //   577: getfield        ak.k:Laj;
        //   580: getfield        aj.c:I
        //   583: iadd           
        //   584: istore          6
        //   586: goto            599
        //   589: iload           6
        //   591: iload           23
        //   593: iadd           
        //   594: iload           22
        //   596: isub           
        //   597: istore          6
        //   599: aload           34
        //   601: getfield        ak.ae:I
        //   604: iconst_4       
        //   605: if_icmpne       636
        //   608: aload           34
        //   610: invokevirtual   ak.d:()I
        //   613: aload           34
        //   615: getfield        ak.j:Laj;
        //   618: getfield        aj.c:I
        //   621: iadd           
        //   622: aload           34
        //   624: getfield        ak.l:Laj;
        //   627: getfield        aj.c:I
        //   630: iadd           
        //   631: istore          7
        //   633: goto            646
        //   636: iload           19
        //   638: iload           7
        //   640: iadd           
        //   641: iload           21
        //   643: isub           
        //   644: istore          7
        //   646: aload           34
        //   648: getfield        ak.K:I
        //   651: istore          19
        //   653: iload           19
        //   655: bipush          8
        //   657: if_icmpne       663
        //   660: iconst_0       
        //   661: istore          7
        //   663: iload           19
        //   665: bipush          8
        //   667: if_icmpne       676
        //   670: iconst_0       
        //   671: istore          6
        //   673: goto            676
        //   676: iload           14
        //   678: aload           34
        //   680: getfield        ak.M:I
        //   683: invokestatic    java/lang/Math.max:(II)I
        //   686: istore          14
        //   688: iload           13
        //   690: aload           34
        //   692: getfield        ak.N:I
        //   695: invokestatic    java/lang/Math.max:(II)I
        //   698: istore          13
        //   700: iload           11
        //   702: aload           34
        //   704: getfield        ak.O:I
        //   707: invokestatic    java/lang/Math.max:(II)I
        //   710: istore          11
        //   712: iload           10
        //   714: aload           34
        //   716: getfield        ak.L:I
        //   719: invokestatic    java/lang/Math.max:(II)I
        //   722: istore          10
        //   724: iload           12
        //   726: iload           6
        //   728: invokestatic    java/lang/Math.max:(II)I
        //   731: istore          12
        //   733: iload           8
        //   735: iload           7
        //   737: invokestatic    java/lang/Math.max:(II)I
        //   740: istore          8
        //   742: iinc            9, 1
        //   745: goto            438
        //   748: iload           14
        //   750: iload           13
        //   752: invokestatic    java/lang/Math.max:(II)I
        //   755: istore          6
        //   757: aload_0        
        //   758: aload_0        
        //   759: getfield        al.D:I
        //   762: iload           6
        //   764: iload           12
        //   766: invokestatic    java/lang/Math.max:(II)I
        //   769: invokestatic    java/lang/Math.max:(II)I
        //   772: putfield        al.ag:I
        //   775: iload           10
        //   777: iload           11
        //   779: invokestatic    java/lang/Math.max:(II)I
        //   782: istore          6
        //   784: aload_0        
        //   785: aload_0        
        //   786: getfield        al.E:I
        //   789: iload           6
        //   791: iload           8
        //   793: invokestatic    java/lang/Math.max:(II)I
        //   796: invokestatic    java/lang/Math.max:(II)I
        //   799: putfield        al.ah:I
        //   802: iconst_0       
        //   803: istore          6
        //   805: iload           6
        //   807: iload           18
        //   809: if_icmpge       866
        //   812: aload           33
        //   814: iload           6
        //   816: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   819: checkcast       Lak;
        //   822: astore          32
        //   824: aload           32
        //   826: iconst_0       
        //   827: putfield        ak.T:Z
        //   830: aload           32
        //   832: iconst_0       
        //   833: putfield        ak.U:Z
        //   836: aload           32
        //   838: iconst_0       
        //   839: putfield        ak.P:Z
        //   842: aload           32
        //   844: iconst_0       
        //   845: putfield        ak.Q:Z
        //   848: aload           32
        //   850: iconst_0       
        //   851: putfield        ak.R:Z
        //   854: aload           32
        //   856: iconst_0       
        //   857: putfield        ak.S:Z
        //   860: iinc            6, 1
        //   863: goto            805
        //   866: aload_0        
        //   867: getfield        al.ar:[Z
        //   870: iconst_0       
        //   871: baload         
        //   872: istore          27
        //   874: iload           27
        //   876: istore          26
        //   878: iload           16
        //   880: ifle            917
        //   883: iload           27
        //   885: istore          26
        //   887: iload           17
        //   889: ifle            917
        //   892: aload_0        
        //   893: getfield        al.ag:I
        //   896: iload           16
        //   898: if_icmpgt       914
        //   901: iload           27
        //   903: istore          26
        //   905: aload_0        
        //   906: getfield        al.ah:I
        //   909: iload           17
        //   911: if_icmple       917
        //   914: iconst_0       
        //   915: istore          26
        //   917: iload           26
        //   919: ifeq            1034
        //   922: aload_0        
        //   923: getfield        al.ad:I
        //   926: iconst_2       
        //   927: if_icmpne       978
        //   930: aload_0        
        //   931: iconst_1       
        //   932: putfield        al.ad:I
        //   935: iload           16
        //   937: ifle            963
        //   940: iload           16
        //   942: aload_0        
        //   943: getfield        al.ag:I
        //   946: if_icmpge       963
        //   949: aload_0        
        //   950: iconst_1       
        //   951: putfield        al.aj:Z
        //   954: aload_0        
        //   955: iload           16
        //   957: invokevirtual   ak.p:(I)V
        //   960: goto            978
        //   963: aload_0        
        //   964: aload_0        
        //   965: getfield        al.D:I
        //   968: aload_0        
        //   969: getfield        al.ag:I
        //   972: invokestatic    java/lang/Math.max:(II)I
        //   975: invokevirtual   ak.p:(I)V
        //   978: aload_0        
        //   979: getfield        al.ae:I
        //   982: iconst_2       
        //   983: if_icmpne       1034
        //   986: aload_0        
        //   987: iconst_1       
        //   988: putfield        al.ae:I
        //   991: iload           17
        //   993: ifle            1019
        //   996: iload           17
        //   998: aload_0        
        //   999: getfield        al.ah:I
        //  1002: if_icmpge       1019
        //  1005: aload_0        
        //  1006: iconst_1       
        //  1007: putfield        al.ak:Z
        //  1010: aload_0        
        //  1011: iload           17
        //  1013: invokevirtual   ak.j:(I)V
        //  1016: goto            1034
        //  1019: aload_0        
        //  1020: aload_0        
        //  1021: getfield        al.E:I
        //  1024: aload_0        
        //  1025: getfield        al.ah:I
        //  1028: invokestatic    java/lang/Math.max:(II)I
        //  1031: invokevirtual   ak.j:(I)V
        //  1034: goto            1044
        //  1037: iload           6
        //  1039: istore          4
        //  1041: iconst_0       
        //  1042: istore          26
        //  1044: iload           5
        //  1046: istore          19
        //  1048: iload           4
        //  1050: istore          18
        //  1052: aload_0        
        //  1053: iconst_0       
        //  1054: putfield        al.am:I
        //  1057: aload_0        
        //  1058: iconst_0       
        //  1059: putfield        al.an:I
        //  1062: aload_0        
        //  1063: getfield        al.al:Ljava/util/ArrayList;
        //  1066: invokevirtual   java/util/ArrayList.size:()I
        //  1069: istore          24
        //  1071: iconst_0       
        //  1072: istore          4
        //  1074: iload           4
        //  1076: iload           24
        //  1078: if_icmpge       1117
        //  1081: aload_0        
        //  1082: getfield        al.al:Ljava/util/ArrayList;
        //  1085: iload           4
        //  1087: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1090: checkcast       Lak;
        //  1093: astore          32
        //  1095: aload           32
        //  1097: instanceof      Lan;
        //  1100: ifeq            1111
        //  1103: aload           32
        //  1105: checkcast       Lan;
        //  1108: invokevirtual   an.D:()V
        //  1111: iinc            4, 1
        //  1114: goto            1074
        //  1117: iload           26
        //  1119: istore          27
        //  1121: iconst_0       
        //  1122: istore          9
        //  1124: iconst_1       
        //  1125: istore          26
        //  1127: iload           20
        //  1129: istore          6
        //  1131: iload           17
        //  1133: istore          5
        //  1135: iload           16
        //  1137: istore          4
        //  1139: iload           15
        //  1141: istore          7
        //  1143: iload           26
        //  1145: ifeq            3462
        //  1148: iload           9
        //  1150: iconst_1       
        //  1151: iadd           
        //  1152: istore          23
        //  1154: aload_0        
        //  1155: getfield        al.af:Lah;
        //  1158: invokevirtual   ah.l:()V
        //  1161: aload_0        
        //  1162: aload_0        
        //  1163: getfield        al.af:Lah;
        //  1166: invokevirtual   al.E:(Lah;)Z
        //  1169: istore          30
        //  1171: iload           30
        //  1173: ifeq            2707
        //  1176: iload           7
        //  1178: istore          12
        //  1180: iload           4
        //  1182: istore          11
        //  1184: iload           5
        //  1186: istore          8
        //  1188: iload           27
        //  1190: istore          29
        //  1192: iload           30
        //  1194: istore          28
        //  1196: iload           6
        //  1198: istore          10
        //  1200: aload_0        
        //  1201: getfield        al.af:Lah;
        //  1204: astore          35
        //  1206: iload           7
        //  1208: istore          12
        //  1210: iload           4
        //  1212: istore          11
        //  1214: iload           5
        //  1216: istore          8
        //  1218: iload           27
        //  1220: istore          29
        //  1222: iload           30
        //  1224: istore          28
        //  1226: iload           6
        //  1228: istore          10
        //  1230: aload           35
        //  1232: getfield        ah.b:Lag;
        //  1235: astore          36
        //  1237: iload           7
        //  1239: istore          12
        //  1241: iload           4
        //  1243: istore          11
        //  1245: iload           5
        //  1247: istore          8
        //  1249: iload           27
        //  1251: istore          29
        //  1253: iload           30
        //  1255: istore          28
        //  1257: iload           6
        //  1259: istore          10
        //  1261: aload           36
        //  1263: aload           35
        //  1265: invokevirtual   ag.a:(Lah;)V
        //  1268: iload           7
        //  1270: istore          12
        //  1272: iload           4
        //  1274: istore          11
        //  1276: iload           5
        //  1278: istore          8
        //  1280: iload           27
        //  1282: istore          29
        //  1284: iload           30
        //  1286: istore          28
        //  1288: iload           6
        //  1290: istore          10
        //  1292: aload           35
        //  1294: aload           36
        //  1296: invokevirtual   ah.o:(Lag;)V
        //  1299: iconst_0       
        //  1300: istore          9
        //  1302: iload           7
        //  1304: istore          12
        //  1306: iload           4
        //  1308: istore          11
        //  1310: iload           5
        //  1312: istore          8
        //  1314: iload           27
        //  1316: istore          29
        //  1318: iload           30
        //  1320: istore          28
        //  1322: iload           6
        //  1324: istore          10
        //  1326: iload           9
        //  1328: aload           35
        //  1330: getfield        ah.e:I
        //  1333: if_icmpge       1375
        //  1336: iload           7
        //  1338: istore          12
        //  1340: iload           4
        //  1342: istore          11
        //  1344: iload           5
        //  1346: istore          8
        //  1348: iload           27
        //  1350: istore          29
        //  1352: iload           30
        //  1354: istore          28
        //  1356: iload           6
        //  1358: istore          10
        //  1360: aload           35
        //  1362: getfield        ah.d:[Z
        //  1365: iload           9
        //  1367: iconst_0       
        //  1368: bastore        
        //  1369: iinc            9, 1
        //  1372: goto            1302
        //  1375: iconst_0       
        //  1376: istore          9
        //  1378: iconst_0       
        //  1379: istore          8
        //  1381: iload           30
        //  1383: istore          26
        //  1385: iload           8
        //  1387: ifne            2499
        //  1390: iload           7
        //  1392: istore          12
        //  1394: iload           4
        //  1396: istore          11
        //  1398: iload           5
        //  1400: istore          8
        //  1402: iload           27
        //  1404: istore          29
        //  1406: iload           26
        //  1408: istore          28
        //  1410: iload           6
        //  1412: istore          10
        //  1414: aload           36
        //  1416: getfield        ag.a:Ljava/util/ArrayList;
        //  1419: invokevirtual   java/util/ArrayList.size:()I
        //  1422: istore          14
        //  1424: iload           26
        //  1426: istore          30
        //  1428: aconst_null    
        //  1429: astore          32
        //  1431: iconst_0       
        //  1432: istore          16
        //  1434: iconst_0       
        //  1435: istore          13
        //  1437: iload           16
        //  1439: iload           14
        //  1441: if_icmpge       1623
        //  1444: aload           36
        //  1446: getfield        ag.a:Ljava/util/ArrayList;
        //  1449: iload           16
        //  1451: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1454: checkcast       Lai;
        //  1457: astore          34
        //  1459: iconst_5       
        //  1460: istore          8
        //  1462: aload           32
        //  1464: astore          33
        //  1466: iload           8
        //  1468: iflt            1588
        //  1471: iload           4
        //  1473: istore          15
        //  1475: iload           5
        //  1477: istore          12
        //  1479: iload           6
        //  1481: istore          11
        //  1483: iload           7
        //  1485: istore          10
        //  1487: aload           34
        //  1489: getfield        ai.e:[F
        //  1492: iload           8
        //  1494: faload         
        //  1495: fstore_1       
        //  1496: aload           33
        //  1498: astore          32
        //  1500: iload           13
        //  1502: istore          10
        //  1504: aload           33
        //  1506: ifnonnull       1546
        //  1509: aload           33
        //  1511: astore          32
        //  1513: iload           13
        //  1515: istore          10
        //  1517: fload_1        
        //  1518: fconst_0       
        //  1519: fcmpg          
        //  1520: ifge            1546
        //  1523: aload           33
        //  1525: astore          32
        //  1527: iload           13
        //  1529: istore          10
        //  1531: iload           8
        //  1533: iload           13
        //  1535: if_icmplt       1546
        //  1538: iload           8
        //  1540: istore          10
        //  1542: aload           34
        //  1544: astore          32
        //  1546: aload           32
        //  1548: astore          33
        //  1550: iload           10
        //  1552: istore          13
        //  1554: fload_1        
        //  1555: fconst_0       
        //  1556: fcmpl          
        //  1557: ifle            1582
        //  1560: aload           32
        //  1562: astore          33
        //  1564: iload           10
        //  1566: istore          13
        //  1568: iload           8
        //  1570: iload           10
        //  1572: if_icmple       1582
        //  1575: iload           8
        //  1577: istore          13
        //  1579: aconst_null    
        //  1580: astore          33
        //  1582: iinc            8, -1
        //  1585: goto            1466
        //  1588: iinc            16, 1
        //  1591: aload           33
        //  1593: astore          32
        //  1595: goto            1437
        //  1598: astore          32
        //  1600: iload           7
        //  1602: istore          8
        //  1604: iload           4
        //  1606: istore          7
        //  1608: iload           5
        //  1610: istore          4
        //  1612: iload           27
        //  1614: istore          28
        //  1616: iload           7
        //  1618: istore          5
        //  1620: goto            2688
        //  1623: iload           7
        //  1625: istore          8
        //  1627: iload           27
        //  1629: istore          28
        //  1631: iload           9
        //  1633: istore          13
        //  1635: aload           32
        //  1637: ifnull          1766
        //  1640: iload           4
        //  1642: istore          15
        //  1644: iload           5
        //  1646: istore          12
        //  1648: iload           6
        //  1650: istore          11
        //  1652: iload           8
        //  1654: istore          10
        //  1656: aload           35
        //  1658: getfield        ah.d:[Z
        //  1661: astore          33
        //  1663: iload           4
        //  1665: istore          15
        //  1667: iload           5
        //  1669: istore          12
        //  1671: iload           6
        //  1673: istore          11
        //  1675: iload           8
        //  1677: istore          10
        //  1679: aload           32
        //  1681: getfield        ai.a:I
        //  1684: istore          13
        //  1686: aload           33
        //  1688: iload           13
        //  1690: baload         
        //  1691: ifeq            1700
        //  1694: aconst_null    
        //  1695: astore          32
        //  1697: goto            1770
        //  1700: aload           33
        //  1702: iload           13
        //  1704: iconst_1       
        //  1705: bastore        
        //  1706: iinc            9, 1
        //  1709: iload           4
        //  1711: istore          15
        //  1713: iload           5
        //  1715: istore          12
        //  1717: iload           6
        //  1719: istore          11
        //  1721: iload           8
        //  1723: istore          10
        //  1725: iload           9
        //  1727: istore          13
        //  1729: iload           9
        //  1731: aload           35
        //  1733: getfield        ah.e:I
        //  1736: if_icmplt       1766
        //  1739: iconst_1       
        //  1740: istore          13
        //  1742: goto            1773
        //  1745: astore          32
        //  1747: iload           15
        //  1749: istore          4
        //  1751: iload           12
        //  1753: istore          5
        //  1755: iload           11
        //  1757: istore          6
        //  1759: iload           10
        //  1761: istore          8
        //  1763: goto            1604
        //  1766: iload           13
        //  1768: istore          9
        //  1770: iconst_0       
        //  1771: istore          13
        //  1773: aload           32
        //  1775: ifnull          2493
        //  1778: iconst_0       
        //  1779: istore          14
        //  1781: ldc_w           3.4028235E38
        //  1784: fstore_1       
        //  1785: iconst_m1      
        //  1786: istore          20
        //  1788: iload           4
        //  1790: istore          15
        //  1792: iload           5
        //  1794: istore          12
        //  1796: iload           6
        //  1798: istore          11
        //  1800: iload           8
        //  1802: istore          10
        //  1804: iload           14
        //  1806: aload           35
        //  1808: getfield        ah.f:I
        //  1811: if_icmpge       2190
        //  1814: iload           4
        //  1816: istore          15
        //  1818: iload           5
        //  1820: istore          12
        //  1822: iload           6
        //  1824: istore          11
        //  1826: iload           8
        //  1828: istore          10
        //  1830: aload           35
        //  1832: getfield        ah.c:[Laf;
        //  1835: iload           14
        //  1837: aaload         
        //  1838: astore          34
        //  1840: iload           4
        //  1842: istore          15
        //  1844: iload           5
        //  1846: istore          12
        //  1848: iload           6
        //  1850: istore          11
        //  1852: iload           8
        //  1854: istore          10
        //  1856: aload           34
        //  1858: getfield        af.a:Lai;
        //  1861: getfield        ai.h:I
        //  1864: iconst_1       
        //  1865: if_icmpeq       2164
        //  1868: iload           4
        //  1870: istore          15
        //  1872: iload           5
        //  1874: istore          12
        //  1876: iload           6
        //  1878: istore          11
        //  1880: iload           8
        //  1882: istore          10
        //  1884: aload           34
        //  1886: getfield        af.d:Lae;
        //  1889: astore          33
        //  1891: iload           4
        //  1893: istore          15
        //  1895: iload           5
        //  1897: istore          12
        //  1899: iload           6
        //  1901: istore          11
        //  1903: iload           8
        //  1905: istore          10
        //  1907: aload           33
        //  1909: getfield        ae.e:I
        //  1912: istore          22
        //  1914: iload           5
        //  1916: istore          17
        //  1918: iload           4
        //  1920: istore          16
        //  1922: iload           22
        //  1924: iconst_m1      
        //  1925: if_icmpne       1935
        //  1928: iload           6
        //  1930: istore          10
        //  1932: goto            2168
        //  1935: iconst_0       
        //  1936: istore          21
        //  1938: iload           6
        //  1940: istore          10
        //  1942: iload           22
        //  1944: iconst_m1      
        //  1945: if_icmpeq       2168
        //  1948: iload           6
        //  1950: istore          10
        //  1952: iload           21
        //  1954: aload           33
        //  1956: getfield        ae.a:I
        //  1959: if_icmpge       2168
        //  1962: aload           33
        //  1964: getfield        ae.b:[I
        //  1967: iload           22
        //  1969: iaload         
        //  1970: istore          25
        //  1972: iload           6
        //  1974: istore          12
        //  1976: iload           28
        //  1978: istore          29
        //  1980: iload           8
        //  1982: istore          15
        //  1984: iload           17
        //  1986: istore          11
        //  1988: iload           16
        //  1990: istore          10
        //  1992: iload           12
        //  1994: istore          6
        //  1996: iload           25
        //  1998: aload           32
        //  2000: getfield        ai.a:I
        //  2003: if_icmpne       2111
        //  2006: iload           28
        //  2008: istore          29
        //  2010: iload           8
        //  2012: istore          15
        //  2014: iload           17
        //  2016: istore          11
        //  2018: iload           16
        //  2020: istore          10
        //  2022: iload           12
        //  2024: istore          6
        //  2026: aload           34
        //  2028: getfield        af.d:Lae;
        //  2031: aload           32
        //  2033: invokevirtual   ae.a:(Lai;)F
        //  2036: fstore_3       
        //  2037: fload_1        
        //  2038: fstore_2       
        //  2039: iload           20
        //  2041: istore          10
        //  2043: iload           12
        //  2045: istore          6
        //  2047: fload_3        
        //  2048: fconst_0       
        //  2049: fcmpg          
        //  2050: ifge            2178
        //  2053: iload           28
        //  2055: istore          29
        //  2057: iload           8
        //  2059: istore          15
        //  2061: iload           17
        //  2063: istore          11
        //  2065: iload           16
        //  2067: istore          10
        //  2069: iload           12
        //  2071: istore          6
        //  2073: aload           34
        //  2075: getfield        af.b:F
        //  2078: fneg           
        //  2079: fload_3        
        //  2080: fdiv           
        //  2081: fstore_3       
        //  2082: fload_1        
        //  2083: fstore_2       
        //  2084: iload           20
        //  2086: istore          10
        //  2088: iload           12
        //  2090: istore          6
        //  2092: fload_3        
        //  2093: fload_1        
        //  2094: fcmpg          
        //  2095: ifge            2178
        //  2098: fload_3        
        //  2099: fstore_2       
        //  2100: iload           14
        //  2102: istore          10
        //  2104: iload           12
        //  2106: istore          6
        //  2108: goto            2178
        //  2111: iload           28
        //  2113: istore          29
        //  2115: iload           8
        //  2117: istore          15
        //  2119: iload           17
        //  2121: istore          11
        //  2123: iload           16
        //  2125: istore          10
        //  2127: iload           12
        //  2129: istore          6
        //  2131: aload           33
        //  2133: getfield        ae.c:[I
        //  2136: iload           22
        //  2138: iaload         
        //  2139: istore          22
        //  2141: iinc            21, 1
        //  2144: iload           12
        //  2146: istore          6
        //  2148: goto            1938
        //  2151: astore          32
        //  2153: iload           17
        //  2155: istore          4
        //  2157: iload           16
        //  2159: istore          5
        //  2161: goto            2688
        //  2164: iload           6
        //  2166: istore          10
        //  2168: iload           10
        //  2170: istore          6
        //  2172: iload           20
        //  2174: istore          10
        //  2176: fload_1        
        //  2177: fstore_2       
        //  2178: iinc            14, 1
        //  2181: fload_2        
        //  2182: fstore_1       
        //  2183: iload           10
        //  2185: istore          20
        //  2187: goto            1788
        //  2190: iload           5
        //  2192: istore          12
        //  2194: iload           6
        //  2196: istore          5
        //  2198: iload           20
        //  2200: iflt            2482
        //  2203: iload           28
        //  2205: istore          29
        //  2207: iload           8
        //  2209: istore          15
        //  2211: iload           12
        //  2213: istore          11
        //  2215: iload           4
        //  2217: istore          10
        //  2219: iload           5
        //  2221: istore          6
        //  2223: aload           35
        //  2225: getfield        ah.c:[Laf;
        //  2228: iload           20
        //  2230: aaload         
        //  2231: astore          33
        //  2233: iload           28
        //  2235: istore          29
        //  2237: iload           8
        //  2239: istore          15
        //  2241: iload           12
        //  2243: istore          11
        //  2245: iload           4
        //  2247: istore          10
        //  2249: iload           5
        //  2251: istore          6
        //  2253: aload           33
        //  2255: getfield        af.a:Lai;
        //  2258: iconst_m1      
        //  2259: putfield        ai.b:I
        //  2262: iload           28
        //  2264: istore          29
        //  2266: iload           8
        //  2268: istore          15
        //  2270: iload           12
        //  2272: istore          11
        //  2274: iload           4
        //  2276: istore          10
        //  2278: iload           5
        //  2280: istore          6
        //  2282: aload           33
        //  2284: aload           32
        //  2286: invokevirtual   af.a:(Lai;)V
        //  2289: iload           28
        //  2291: istore          29
        //  2293: iload           8
        //  2295: istore          15
        //  2297: iload           12
        //  2299: istore          11
        //  2301: iload           4
        //  2303: istore          10
        //  2305: iload           5
        //  2307: istore          6
        //  2309: aload           33
        //  2311: getfield        af.a:Lai;
        //  2314: iload           20
        //  2316: putfield        ai.b:I
        //  2319: iconst_0       
        //  2320: istore          7
        //  2322: iload           28
        //  2324: istore          29
        //  2326: iload           8
        //  2328: istore          15
        //  2330: iload           12
        //  2332: istore          11
        //  2334: iload           4
        //  2336: istore          10
        //  2338: iload           5
        //  2340: istore          6
        //  2342: iload           7
        //  2344: aload           35
        //  2346: getfield        ah.f:I
        //  2349: if_icmpge       2391
        //  2352: iload           28
        //  2354: istore          29
        //  2356: iload           8
        //  2358: istore          15
        //  2360: iload           12
        //  2362: istore          11
        //  2364: iload           4
        //  2366: istore          10
        //  2368: iload           5
        //  2370: istore          6
        //  2372: aload           35
        //  2374: getfield        ah.c:[Laf;
        //  2377: iload           7
        //  2379: aaload         
        //  2380: aload           33
        //  2382: invokevirtual   af.k:(Laf;)V
        //  2385: iinc            7, 1
        //  2388: goto            2322
        //  2391: iload           28
        //  2393: istore          29
        //  2395: iload           8
        //  2397: istore          15
        //  2399: iload           12
        //  2401: istore          11
        //  2403: iload           4
        //  2405: istore          10
        //  2407: iload           5
        //  2409: istore          6
        //  2411: aload           36
        //  2413: aload           35
        //  2415: invokevirtual   ag.a:(Lah;)V
        //  2418: aload           35
        //  2420: aload           36
        //  2422: invokevirtual   ah.o:(Lag;)V
        //  2425: goto            2455
        //  2428: astore          32
        //  2430: iload           28
        //  2432: istore          29
        //  2434: iload           8
        //  2436: istore          15
        //  2438: iload           12
        //  2440: istore          11
        //  2442: iload           4
        //  2444: istore          10
        //  2446: iload           5
        //  2448: istore          6
        //  2450: aload           32
        //  2452: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  2455: iload           30
        //  2457: istore          26
        //  2459: iload           28
        //  2461: istore          27
        //  2463: iload           8
        //  2465: istore          7
        //  2467: iload           13
        //  2469: istore          8
        //  2471: iload           5
        //  2473: istore          6
        //  2475: iload           12
        //  2477: istore          5
        //  2479: goto            1385
        //  2482: iload           5
        //  2484: istore          6
        //  2486: iload           12
        //  2488: istore          5
        //  2490: goto            2493
        //  2493: iconst_1       
        //  2494: istore          8
        //  2496: goto            1385
        //  2499: iload           7
        //  2501: istore          8
        //  2503: iload           27
        //  2505: istore          30
        //  2507: iload           26
        //  2509: istore          31
        //  2511: iload           6
        //  2513: istore          12
        //  2515: iconst_0       
        //  2516: istore          16
        //  2518: iload           30
        //  2520: istore          29
        //  2522: iload           8
        //  2524: istore          15
        //  2526: iload           5
        //  2528: istore          11
        //  2530: iload           4
        //  2532: istore          10
        //  2534: iload           12
        //  2536: istore          6
        //  2538: iload           31
        //  2540: istore          28
        //  2542: iload           30
        //  2544: istore          27
        //  2546: iload           8
        //  2548: istore          14
        //  2550: iload           5
        //  2552: istore          13
        //  2554: iload           4
        //  2556: istore          9
        //  2558: iload           12
        //  2560: istore          7
        //  2562: iload           16
        //  2564: aload           35
        //  2566: getfield        ah.f:I
        //  2569: if_icmpge       2727
        //  2572: iload           30
        //  2574: istore          29
        //  2576: iload           8
        //  2578: istore          15
        //  2580: iload           5
        //  2582: istore          11
        //  2584: iload           4
        //  2586: istore          10
        //  2588: iload           12
        //  2590: istore          6
        //  2592: aload           35
        //  2594: getfield        ah.c:[Laf;
        //  2597: iload           16
        //  2599: aaload         
        //  2600: astore          32
        //  2602: iload           30
        //  2604: istore          29
        //  2606: iload           8
        //  2608: istore          15
        //  2610: iload           5
        //  2612: istore          11
        //  2614: iload           4
        //  2616: istore          10
        //  2618: iload           12
        //  2620: istore          6
        //  2622: aload           32
        //  2624: getfield        af.a:Lai;
        //  2627: aload           32
        //  2629: getfield        af.b:F
        //  2632: putfield        ai.d:F
        //  2635: iinc            16, 1
        //  2638: goto            2518
        //  2641: astore          32
        //  2643: iload           26
        //  2645: istore          30
        //  2647: iload           29
        //  2649: istore          28
        //  2651: iload           15
        //  2653: istore          4
        //  2655: iload           11
        //  2657: istore          5
        //  2659: goto            2700
        //  2662: astore          32
        //  2664: iload           11
        //  2666: istore          5
        //  2668: iload           8
        //  2670: istore          4
        //  2672: iload           28
        //  2674: istore          30
        //  2676: iload           12
        //  2678: istore          8
        //  2680: iload           29
        //  2682: istore          28
        //  2684: iload           10
        //  2686: istore          6
        //  2688: iload           5
        //  2690: istore          10
        //  2692: iload           4
        //  2694: istore          5
        //  2696: iload           8
        //  2698: istore          4
        //  2700: iload           30
        //  2702: istore          27
        //  2704: goto            2764
        //  2707: iload           7
        //  2709: istore          14
        //  2711: iload           30
        //  2713: istore          28
        //  2715: iload           6
        //  2717: istore          7
        //  2719: iload           4
        //  2721: istore          9
        //  2723: iload           5
        //  2725: istore          13
        //  2727: iload           27
        //  2729: istore          26
        //  2731: iload           14
        //  2733: istore          4
        //  2735: iload           13
        //  2737: istore          5
        //  2739: iload           9
        //  2741: istore          6
        //  2743: goto            2785
        //  2746: astore          32
        //  2748: iload           4
        //  2750: istore          10
        //  2752: iload           7
        //  2754: istore          4
        //  2756: iload           27
        //  2758: istore          28
        //  2760: iload           26
        //  2762: istore          27
        //  2764: aload           32
        //  2766: invokevirtual   java/lang/Exception.printStackTrace:()V
        //  2769: iload           6
        //  2771: istore          7
        //  2773: iload           10
        //  2775: istore          6
        //  2777: iload           28
        //  2779: istore          26
        //  2781: iload           27
        //  2783: istore          28
        //  2785: iload           28
        //  2787: ifeq            2909
        //  2790: aload_0        
        //  2791: getfield        al.ar:[Z
        //  2794: astore          32
        //  2796: aload           32
        //  2798: iconst_2       
        //  2799: iconst_0       
        //  2800: bastore        
        //  2801: aload_0        
        //  2802: invokevirtual   ak.y:()V
        //  2805: aload_0        
        //  2806: getfield        al.al:Ljava/util/ArrayList;
        //  2809: invokevirtual   java/util/ArrayList.size:()I
        //  2812: istore          9
        //  2814: iconst_0       
        //  2815: istore          8
        //  2817: iload           8
        //  2819: iload           9
        //  2821: if_icmpge       2906
        //  2824: aload_0        
        //  2825: getfield        al.al:Ljava/util/ArrayList;
        //  2828: iload           8
        //  2830: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2833: checkcast       Lak;
        //  2836: astore          33
        //  2838: aload           33
        //  2840: invokevirtual   ak.y:()V
        //  2843: aload           33
        //  2845: getfield        ak.ad:I
        //  2848: iconst_3       
        //  2849: if_icmpne       2873
        //  2852: aload           33
        //  2854: invokevirtual   ak.h:()I
        //  2857: aload           33
        //  2859: getfield        ak.F:I
        //  2862: if_icmpge       2873
        //  2865: aload           32
        //  2867: iconst_2       
        //  2868: iconst_1       
        //  2869: bastore        
        //  2870: goto            2873
        //  2873: aload           33
        //  2875: getfield        ak.ae:I
        //  2878: iconst_3       
        //  2879: if_icmpne       2900
        //  2882: aload           33
        //  2884: invokevirtual   ak.d:()I
        //  2887: aload           33
        //  2889: getfield        ak.G:I
        //  2892: if_icmpge       2900
        //  2895: aload           32
        //  2897: iconst_2       
        //  2898: iconst_1       
        //  2899: bastore        
        //  2900: iinc            8, 1
        //  2903: goto            2817
        //  2906: goto            3007
        //  2909: aload_0        
        //  2910: invokevirtual   ak.y:()V
        //  2913: iconst_0       
        //  2914: istore          8
        //  2916: iload           8
        //  2918: iload           24
        //  2920: if_icmpge       3007
        //  2923: aload_0        
        //  2924: getfield        al.al:Ljava/util/ArrayList;
        //  2927: iload           8
        //  2929: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2932: checkcast       Lak;
        //  2935: astore          32
        //  2937: aload           32
        //  2939: getfield        ak.ad:I
        //  2942: iconst_3       
        //  2943: if_icmpne       2969
        //  2946: aload           32
        //  2948: invokevirtual   ak.h:()I
        //  2951: aload           32
        //  2953: getfield        ak.F:I
        //  2956: if_icmpge       2969
        //  2959: aload_0        
        //  2960: getfield        al.ar:[Z
        //  2963: iconst_2       
        //  2964: iconst_1       
        //  2965: bastore        
        //  2966: goto            3007
        //  2969: aload           32
        //  2971: getfield        ak.ae:I
        //  2974: iconst_3       
        //  2975: if_icmpne       3001
        //  2978: aload           32
        //  2980: invokevirtual   ak.d:()I
        //  2983: aload           32
        //  2985: getfield        ak.G:I
        //  2988: if_icmpge       3001
        //  2991: aload_0        
        //  2992: getfield        al.ar:[Z
        //  2995: iconst_2       
        //  2996: iconst_1       
        //  2997: bastore        
        //  2998: goto            3007
        //  3001: iinc            8, 1
        //  3004: goto            2916
        //  3007: iload           23
        //  3009: bipush          8
        //  3011: if_icmpge       3210
        //  3014: aload_0        
        //  3015: getfield        al.ar:[Z
        //  3018: iconst_2       
        //  3019: baload         
        //  3020: ifeq            3210
        //  3023: iconst_0       
        //  3024: istore          9
        //  3026: iconst_0       
        //  3027: istore          10
        //  3029: iconst_0       
        //  3030: istore          8
        //  3032: iload           9
        //  3034: iload           24
        //  3036: if_icmpge       3095
        //  3039: aload_0        
        //  3040: getfield        al.al:Ljava/util/ArrayList;
        //  3043: iload           9
        //  3045: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3048: checkcast       Lak;
        //  3051: astore          32
        //  3053: iload           10
        //  3055: aload           32
        //  3057: getfield        ak.w:I
        //  3060: aload           32
        //  3062: invokevirtual   ak.h:()I
        //  3065: iadd           
        //  3066: invokestatic    java/lang/Math.max:(II)I
        //  3069: istore          10
        //  3071: iload           8
        //  3073: aload           32
        //  3075: getfield        ak.x:I
        //  3078: aload           32
        //  3080: invokevirtual   ak.d:()I
        //  3083: iadd           
        //  3084: invokestatic    java/lang/Math.max:(II)I
        //  3087: istore          8
        //  3089: iinc            9, 1
        //  3092: goto            3032
        //  3095: aload_0        
        //  3096: getfield        al.D:I
        //  3099: iload           10
        //  3101: invokestatic    java/lang/Math.max:(II)I
        //  3104: istore          9
        //  3106: aload_0        
        //  3107: getfield        al.E:I
        //  3110: iload           8
        //  3112: invokestatic    java/lang/Math.max:(II)I
        //  3115: istore          8
        //  3117: iload           18
        //  3119: iconst_2       
        //  3120: if_icmpne       3152
        //  3123: aload_0        
        //  3124: invokevirtual   ak.h:()I
        //  3127: iload           9
        //  3129: if_icmpge       3152
        //  3132: aload_0        
        //  3133: iload           9
        //  3135: invokevirtual   ak.p:(I)V
        //  3138: aload_0        
        //  3139: iconst_2       
        //  3140: putfield        al.ad:I
        //  3143: iconst_1       
        //  3144: istore          29
        //  3146: iconst_1       
        //  3147: istore          28
        //  3149: goto            3159
        //  3152: iconst_0       
        //  3153: istore          29
        //  3155: iload           26
        //  3157: istore          28
        //  3159: iload           29
        //  3161: istore          26
        //  3163: iload           28
        //  3165: istore          27
        //  3167: iload           7
        //  3169: iconst_2       
        //  3170: if_icmpne       3221
        //  3173: iload           29
        //  3175: istore          26
        //  3177: iload           28
        //  3179: istore          27
        //  3181: aload_0        
        //  3182: invokevirtual   ak.d:()I
        //  3185: iload           8
        //  3187: if_icmpge       3221
        //  3190: aload_0        
        //  3191: iload           8
        //  3193: invokevirtual   ak.j:(I)V
        //  3196: aload_0        
        //  3197: iconst_2       
        //  3198: putfield        al.ae:I
        //  3201: iconst_1       
        //  3202: istore          26
        //  3204: iconst_1       
        //  3205: istore          27
        //  3207: goto            3221
        //  3210: iconst_0       
        //  3211: istore          28
        //  3213: iload           26
        //  3215: istore          27
        //  3217: iload           28
        //  3219: istore          26
        //  3221: aload_0        
        //  3222: getfield        al.D:I
        //  3225: aload_0        
        //  3226: invokevirtual   ak.h:()I
        //  3229: invokestatic    java/lang/Math.max:(II)I
        //  3232: istore          8
        //  3234: iload           8
        //  3236: aload_0        
        //  3237: invokevirtual   ak.h:()I
        //  3240: if_icmple       3263
        //  3243: aload_0        
        //  3244: iload           8
        //  3246: invokevirtual   ak.p:(I)V
        //  3249: aload_0        
        //  3250: iconst_1       
        //  3251: putfield        al.ad:I
        //  3254: iconst_1       
        //  3255: istore          26
        //  3257: iconst_1       
        //  3258: istore          27
        //  3260: goto            3263
        //  3263: aload_0        
        //  3264: getfield        al.E:I
        //  3267: aload_0        
        //  3268: invokevirtual   ak.d:()I
        //  3271: invokestatic    java/lang/Math.max:(II)I
        //  3274: istore          8
        //  3276: iload           8
        //  3278: aload_0        
        //  3279: invokevirtual   ak.d:()I
        //  3282: if_icmple       3305
        //  3285: aload_0        
        //  3286: iload           8
        //  3288: invokevirtual   ak.j:(I)V
        //  3291: aload_0        
        //  3292: iconst_1       
        //  3293: putfield        al.ae:I
        //  3296: iconst_1       
        //  3297: istore          26
        //  3299: iconst_1       
        //  3300: istore          27
        //  3302: goto            3317
        //  3305: iload           26
        //  3307: istore          28
        //  3309: iload           27
        //  3311: istore          26
        //  3313: iload           28
        //  3315: istore          27
        //  3317: iload           26
        //  3319: ifne            3427
        //  3322: aload_0        
        //  3323: getfield        al.ad:I
        //  3326: iconst_2       
        //  3327: if_icmpne       3373
        //  3330: iload           6
        //  3332: ifle            3373
        //  3335: aload_0        
        //  3336: invokevirtual   ak.h:()I
        //  3339: istore          8
        //  3341: iload           8
        //  3343: iload           6
        //  3345: if_icmple       3373
        //  3348: aload_0        
        //  3349: iconst_1       
        //  3350: putfield        al.aj:Z
        //  3353: aload_0        
        //  3354: iconst_1       
        //  3355: putfield        al.ad:I
        //  3358: aload_0        
        //  3359: iload           6
        //  3361: invokevirtual   ak.p:(I)V
        //  3364: iconst_1       
        //  3365: istore          26
        //  3367: iconst_1       
        //  3368: istore          27
        //  3370: goto            3373
        //  3373: aload_0        
        //  3374: getfield        al.ae:I
        //  3377: iconst_2       
        //  3378: if_icmpne       3424
        //  3381: iload           5
        //  3383: ifle            3424
        //  3386: aload_0        
        //  3387: invokevirtual   ak.d:()I
        //  3390: istore          8
        //  3392: iload           8
        //  3394: iload           5
        //  3396: if_icmple       3424
        //  3399: aload_0        
        //  3400: iconst_1       
        //  3401: putfield        al.ak:Z
        //  3404: aload_0        
        //  3405: iconst_1       
        //  3406: putfield        al.ae:I
        //  3409: aload_0        
        //  3410: iload           5
        //  3412: invokevirtual   ak.j:(I)V
        //  3415: iconst_1       
        //  3416: istore          26
        //  3418: iconst_1       
        //  3419: istore          27
        //  3421: goto            3439
        //  3424: goto            3427
        //  3427: iload           26
        //  3429: istore          28
        //  3431: iload           27
        //  3433: istore          26
        //  3435: iload           28
        //  3437: istore          27
        //  3439: iload           7
        //  3441: istore          8
        //  3443: iload           23
        //  3445: istore          9
        //  3447: iload           4
        //  3449: istore          7
        //  3451: iload           6
        //  3453: istore          4
        //  3455: iload           8
        //  3457: istore          6
        //  3459: goto            1143
        //  3462: iconst_0       
        //  3463: istore          4
        //  3465: aload_0        
        //  3466: getfield        al.r:Lak;
        //  3469: ifnull          3662
        //  3472: aload_0        
        //  3473: getfield        al.D:I
        //  3476: aload_0        
        //  3477: invokevirtual   ak.h:()I
        //  3480: invokestatic    java/lang/Math.max:(II)I
        //  3483: istore          7
        //  3485: aload_0        
        //  3486: getfield        al.E:I
        //  3489: aload_0        
        //  3490: invokevirtual   ak.d:()I
        //  3493: invokestatic    java/lang/Math.max:(II)I
        //  3496: istore          8
        //  3498: aload_0        
        //  3499: getfield        al.at:Lize;
        //  3502: astore          33
        //  3504: aload_0        
        //  3505: aload           33
        //  3507: getfield        ize.c:I
        //  3510: putfield        ak.w:I
        //  3513: aload_0        
        //  3514: aload           33
        //  3516: getfield        ize.d:I
        //  3519: putfield        ak.x:I
        //  3522: aload_0        
        //  3523: aload           33
        //  3525: getfield        ize.a:I
        //  3528: invokevirtual   ak.p:(I)V
        //  3531: aload_0        
        //  3532: aload           33
        //  3534: getfield        ize.b:I
        //  3537: invokevirtual   ak.j:(I)V
        //  3540: aload           33
        //  3542: getfield        ize.e:Ljava/lang/Object;
        //  3545: checkcast       Ljava/util/ArrayList;
        //  3548: invokevirtual   java/util/ArrayList.size:()I
        //  3551: istore          5
        //  3553: iload           4
        //  3555: iload           5
        //  3557: if_icmpge       3647
        //  3560: aload           33
        //  3562: getfield        ize.e:Ljava/lang/Object;
        //  3565: checkcast       Ljava/util/ArrayList;
        //  3568: iload           4
        //  3570: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  3573: checkcast       Laexv;
        //  3576: astore          35
        //  3578: aload_0        
        //  3579: aload           35
        //  3581: getfield        aexv.e:Ljava/lang/Object;
        //  3584: checkcast       Laj;
        //  3587: getfield        aj.g:I
        //  3590: invokevirtual   ak.t:(I)Laj;
        //  3593: astore          32
        //  3595: aload           35
        //  3597: getfield        aexv.d:Ljava/lang/Object;
        //  3600: astore          34
        //  3602: aload           35
        //  3604: getfield        aexv.b:I
        //  3607: istore          11
        //  3609: aload           35
        //  3611: getfield        aexv.a:I
        //  3614: istore          9
        //  3616: aload           35
        //  3618: getfield        aexv.c:I
        //  3621: istore          10
        //  3623: aload           32
        //  3625: aload           34
        //  3627: checkcast       Laj;
        //  3630: iload           11
        //  3632: iconst_m1      
        //  3633: iload           9
        //  3635: iload           10
        //  3637: iconst_0       
        //  3638: invokevirtual   aj.d:(Laj;IIIIZ)V
        //  3641: iinc            4, 1
        //  3644: goto            3553
        //  3647: aload_0        
        //  3648: iload           7
        //  3650: invokevirtual   ak.p:(I)V
        //  3653: aload_0        
        //  3654: iload           8
        //  3656: invokevirtual   ak.j:(I)V
        //  3659: goto            3674
        //  3662: aload_0        
        //  3663: iload           7
        //  3665: putfield        al.w:I
        //  3668: aload_0        
        //  3669: iload           19
        //  3671: putfield        al.x:I
        //  3674: iload           27
        //  3676: ifeq            3691
        //  3679: aload_0        
        //  3680: iload           18
        //  3682: putfield        al.ad:I
        //  3685: aload_0        
        //  3686: iload           6
        //  3688: putfield        al.ae:I
        //  3691: aload_0        
        //  3692: aload_0        
        //  3693: getfield        al.af:Lah;
        //  3696: getfield        ah.g:Lcdr;
        //  3699: invokevirtual   ak.z:(Lcdr;)V
        //  3702: aload_0        
        //  3703: getfield        ak.r:Lak;
        //  3706: astore          32
        //  3708: aload_0        
        //  3709: astore          33
        //  3711: aload           32
        //  3713: ifnull          3734
        //  3716: aload           32
        //  3718: getfield        ak.r:Lak;
        //  3721: astore          34
        //  3723: aload           32
        //  3725: astore          33
        //  3727: aload           34
        //  3729: astore          32
        //  3731: goto            3711
        //  3734: aload_0        
        //  3735: aload           33
        //  3737: if_acmpne       3744
        //  3740: aload_0        
        //  3741: invokevirtual   ak.q:()V
        //  3744: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  1154   1171   2746   2764   Ljava/lang/Exception;
        //  1200   1206   2662   2688   Ljava/lang/Exception;
        //  1230   1237   2662   2688   Ljava/lang/Exception;
        //  1261   1268   2662   2688   Ljava/lang/Exception;
        //  1292   1299   2662   2688   Ljava/lang/Exception;
        //  1326   1336   2662   2688   Ljava/lang/Exception;
        //  1360   1369   2662   2688   Ljava/lang/Exception;
        //  1414   1424   2662   2688   Ljava/lang/Exception;
        //  1444   1459   1598   1604   Ljava/lang/Exception;
        //  1487   1496   1745   1766   Ljava/lang/Exception;
        //  1656   1663   1745   1766   Ljava/lang/Exception;
        //  1679   1686   1745   1766   Ljava/lang/Exception;
        //  1729   1739   1745   1766   Ljava/lang/Exception;
        //  1804   1814   1745   1766   Ljava/lang/Exception;
        //  1830   1840   1745   1766   Ljava/lang/Exception;
        //  1856   1868   1745   1766   Ljava/lang/Exception;
        //  1884   1891   1745   1766   Ljava/lang/Exception;
        //  1907   1914   1745   1766   Ljava/lang/Exception;
        //  1952   1972   2151   2164   Ljava/lang/Exception;
        //  1996   2006   2641   2662   Ljava/lang/Exception;
        //  2026   2037   2641   2662   Ljava/lang/Exception;
        //  2073   2082   2641   2662   Ljava/lang/Exception;
        //  2131   2141   2641   2662   Ljava/lang/Exception;
        //  2223   2233   2641   2662   Ljava/lang/Exception;
        //  2253   2262   2641   2662   Ljava/lang/Exception;
        //  2282   2289   2641   2662   Ljava/lang/Exception;
        //  2309   2319   2641   2662   Ljava/lang/Exception;
        //  2342   2352   2641   2662   Ljava/lang/Exception;
        //  2372   2385   2641   2662   Ljava/lang/Exception;
        //  2411   2418   2641   2662   Ljava/lang/Exception;
        //  2418   2425   2428   2455   Ljava/lang/Exception;
        //  2450   2455   2641   2662   Ljava/lang/Exception;
        //  2562   2572   2641   2662   Ljava/lang/Exception;
        //  2592   2602   2641   2662   Ljava/lang/Exception;
        //  2622   2635   2641   2662   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1546:
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
        ((ak)this).x(ah);
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
                    Label_1359: {
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
                                    m.f = ah.e((Object)m);
                                    final aj k2 = ak2.k;
                                    k2.f = ah.e((Object)k2);
                                    final aj i2 = ak2.i;
                                    final int c = i2.c;
                                    final int n5 = ((ak)this).h() - ak2.k.c;
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
                                                    n6 = ((ak)this).h() - a2;
                                                }
                                                else {
                                                    a += (int)((((ak)this).h() - a - a2 - ak2.h()) * ak2.H + 0.5f);
                                                    n6 = a + ak2.h();
                                                }
                                                final aj i4 = ak2.i;
                                                i4.f = ah.e((Object)i4);
                                                final aj k3 = ak2.k;
                                                k3.f = ah.e((Object)k3);
                                                ah.h(ak2.i.f, a);
                                                ah.h(ak2.k.f, n6);
                                                ak2.a = 2;
                                                ak2.k(a, n6);
                                                break Label_1359;
                                            }
                                            ak2.a = 1;
                                            break Label_1359;
                                        }
                                    }
                                    if (b2 != null && b2.a == this) {
                                        final int a3 = i3.a();
                                        final int n7 = ak2.h() + a3;
                                        final aj i5 = ak2.i;
                                        i5.f = ah.e((Object)i5);
                                        final aj k4 = ak2.k;
                                        k4.f = ah.e((Object)k4);
                                        ah.h(ak2.i.f, a3);
                                        ah.h(ak2.k.f, n7);
                                        ak2.a = 2;
                                        ak2.k(a3, n7);
                                    }
                                    else {
                                        final aj b4 = ak2.k.b;
                                        if (b4 != null && b4.a == this) {
                                            i3.f = ah.e((Object)i3);
                                            final aj k5 = ak2.k;
                                            k5.f = ah.e((Object)k5);
                                            final int n8 = ((ak)this).h() - ak2.k.a();
                                            final int n9 = n8 - ak2.h();
                                            ah.h(ak2.i.f, n9);
                                            ah.h(ak2.k.f, n8);
                                            ak2.a = 2;
                                            ak2.k(n9, n8);
                                        }
                                        else if (b2 != null && b2.a.a == 2) {
                                            final ai f = b2.f;
                                            i3.f = ah.e((Object)i3);
                                            final aj k6 = ak2.k;
                                            k6.f = ah.e((Object)k6);
                                            final float d = f.d;
                                            final float n10 = (float)ak2.i.a();
                                            final int h = ak2.h();
                                            final int n11 = (int)(d + n10 + 0.5f);
                                            final int n12 = h + n11;
                                            ah.h(ak2.i.f, n11);
                                            ah.h(ak2.k.f, n12);
                                            ak2.a = 2;
                                            ak2.k(n11, n12);
                                        }
                                        else if (b4 != null && b4.a.a == 2) {
                                            final ai f2 = b4.f;
                                            i3.f = ah.e((Object)i3);
                                            final aj k7 = ak2.k;
                                            k7.f = ah.e((Object)k7);
                                            final float d2 = f2.d;
                                            final float n13 = (float)ak2.k.a();
                                            final int h2 = ak2.h();
                                            final int n14 = (int)(d2 - n13 + 0.5f);
                                            final int n15 = n14 - h2;
                                            ah.h(ak2.i.f, n15);
                                            ah.h(ak2.k.f, n14);
                                            ak2.a = 2;
                                            ak2.k(n15, n14);
                                        }
                                        else if (b2 == null && b4 == null) {
                                            if (ak2 instanceof am) {
                                                final am am = (am)ak2;
                                                if (am.ai == 1) {
                                                    i3.f = ah.e((Object)i3);
                                                    final aj k8 = ak2.k;
                                                    k8.f = ah.e((Object)k8);
                                                    final int ag = am.ag;
                                                    float n16;
                                                    if (ag != -1) {
                                                        n16 = (float)ag;
                                                    }
                                                    else {
                                                        final int ah2 = am.ah;
                                                        if (ah2 != -1) {
                                                            n16 = (float)(((ak)this).h() - ah2);
                                                        }
                                                        else {
                                                            n16 = ((ak)this).h() * am.af;
                                                        }
                                                    }
                                                    final ai f3 = ak2.i.f;
                                                    final int n17 = (int)(n16 + 0.5f);
                                                    ah.h(f3, n17);
                                                    ah.h(ak2.k.f, n17);
                                                    ak2.a = 2;
                                                    ak2.b = 2;
                                                    ak2.k(n17, n17);
                                                    ak2.o(0, ((ak)this).d());
                                                }
                                            }
                                            else {
                                                i3.f = ah.e((Object)i3);
                                                final aj k9 = ak2.k;
                                                k9.f = ah.e((Object)k9);
                                                final int w = ak2.w;
                                                final int h3 = ak2.h();
                                                ah.h(ak2.i.f, w);
                                                ah.h(ak2.k.f, h3 + w);
                                                ak2.a = 2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Label_3137: {
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
                                    j2.f = ah.e((Object)j2);
                                    final aj l2 = ak2.l;
                                    l2.f = ah.e((Object)l2);
                                    final aj j3 = ak2.j;
                                    final int c2 = j3.c;
                                    final int n18 = ((ak)this).d() - ak2.l.c;
                                    ah.h(j3.f, c2);
                                    ah.h(ak2.l.f, n18);
                                    if (ak2.C > 0 || ak2.K == 8) {
                                        final aj m2 = ak2.m;
                                        m2.f = ah.e((Object)m2);
                                        ah.h(ak2.m.f, ak2.C + c2);
                                    }
                                    ak2.o(c2, n18);
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
                                                int n19;
                                                if (this.ae == 3) {
                                                    n19 = ak2.d();
                                                }
                                                else {
                                                    final int d3 = ak2.d();
                                                    final int d4 = ((ak)this).d();
                                                    final float n20 = (float)a4;
                                                    final float i6 = ak2.I;
                                                    final float n21 = (float)(d4 - a4 - a5 - d3);
                                                    n19 = ak2.d();
                                                    a4 = (int)(n20 + n21 * i6 + 0.5f);
                                                }
                                                final int n22 = n19 + a4;
                                                final aj j5 = ak2.j;
                                                j5.f = ah.e((Object)j5);
                                                final aj l3 = ak2.l;
                                                l3.f = ah.e((Object)l3);
                                                ah.h(ak2.j.f, a4);
                                                ah.h(ak2.l.f, n22);
                                                if (ak2.C > 0 || ak2.K == 8) {
                                                    final aj m3 = ak2.m;
                                                    m3.f = ah.e((Object)m3);
                                                    ah.h(ak2.m.f, ak2.C + a4);
                                                }
                                                ak2.b = 2;
                                                ak2.o(a4, n22);
                                                break Label_3137;
                                            }
                                            ak2.b = 1;
                                            break Label_3137;
                                        }
                                    }
                                    if (b5 != null && b5.a == this) {
                                        final int a6 = j4.a();
                                        final int n23 = ak2.d() + a6;
                                        final aj j6 = ak2.j;
                                        j6.f = ah.e((Object)j6);
                                        final aj l4 = ak2.l;
                                        l4.f = ah.e((Object)l4);
                                        ah.h(ak2.j.f, a6);
                                        ah.h(ak2.l.f, n23);
                                        if (ak2.C > 0 || ak2.K == 8) {
                                            final aj m4 = ak2.m;
                                            m4.f = ah.e((Object)m4);
                                            ah.h(ak2.m.f, ak2.C + a6);
                                        }
                                        ak2.b = 2;
                                        ak2.o(a6, n23);
                                    }
                                    else {
                                        final aj b7 = ak2.l.b;
                                        if (b7 != null && b7.a == this) {
                                            j4.f = ah.e((Object)j4);
                                            final aj l5 = ak2.l;
                                            l5.f = ah.e((Object)l5);
                                            final int n24 = ((ak)this).d() - ak2.l.a();
                                            final int n25 = n24 - ak2.d();
                                            ah.h(ak2.j.f, n25);
                                            ah.h(ak2.l.f, n24);
                                            if (ak2.C > 0 || ak2.K == 8) {
                                                final aj m5 = ak2.m;
                                                m5.f = ah.e((Object)m5);
                                                ah.h(ak2.m.f, ak2.C + n25);
                                            }
                                            ak2.b = 2;
                                            ak2.o(n25, n24);
                                        }
                                        else if (b5 != null && b5.a.b == 2) {
                                            final ai f4 = b5.f;
                                            j4.f = ah.e((Object)j4);
                                            final aj l6 = ak2.l;
                                            l6.f = ah.e((Object)l6);
                                            final float d5 = f4.d;
                                            final float n26 = (float)ak2.j.a();
                                            final int d6 = ak2.d();
                                            final int n27 = (int)(d5 + n26 + 0.5f);
                                            final int n28 = d6 + n27;
                                            ah.h(ak2.j.f, n27);
                                            ah.h(ak2.l.f, n28);
                                            if (ak2.C > 0 || ak2.K == 8) {
                                                final aj m6 = ak2.m;
                                                m6.f = ah.e((Object)m6);
                                                ah.h(ak2.m.f, ak2.C + n27);
                                            }
                                            ak2.b = 2;
                                            ak2.o(n27, n28);
                                        }
                                        else if (b7 != null && b7.a.b == 2) {
                                            final ai f5 = b7.f;
                                            j4.f = ah.e((Object)j4);
                                            final aj l7 = ak2.l;
                                            l7.f = ah.e((Object)l7);
                                            final float d7 = f5.d;
                                            final float n29 = (float)ak2.l.a();
                                            final int d8 = ak2.d();
                                            final int n30 = (int)(d7 - n29 + 0.5f);
                                            final int n31 = n30 - d8;
                                            ah.h(ak2.j.f, n31);
                                            ah.h(ak2.l.f, n30);
                                            if (ak2.C > 0 || ak2.K == 8) {
                                                final aj m7 = ak2.m;
                                                m7.f = ah.e((Object)m7);
                                                ah.h(ak2.m.f, ak2.C + n31);
                                            }
                                            ak2.b = 2;
                                            ak2.o(n31, n30);
                                        }
                                        else {
                                            final aj b8 = ak2.m.b;
                                            if (b8 != null && b8.a.b == 2) {
                                                final ai f6 = b8.f;
                                                j4.f = ah.e((Object)j4);
                                                final aj l8 = ak2.l;
                                                l8.f = ah.e((Object)l8);
                                                final float d9 = f6.d;
                                                final float n32 = (float)ak2.C;
                                                final int d10 = ak2.d();
                                                final int n33 = (int)(d9 - n32 + 0.5f);
                                                final int n34 = d10 + n33;
                                                ah.h(ak2.j.f, n33);
                                                ah.h(ak2.l.f, n34);
                                                final aj m8 = ak2.m;
                                                m8.f = ah.e((Object)m8);
                                                ah.h(ak2.m.f, ak2.C + n33);
                                                ak2.b = 2;
                                                ak2.o(n33, n34);
                                            }
                                            else if (b8 == null && b5 == null && b7 == null) {
                                                if (ak2 instanceof am) {
                                                    final am am2 = (am)ak2;
                                                    if (am2.ai == 0) {
                                                        j4.f = ah.e((Object)j4);
                                                        final aj l9 = ak2.l;
                                                        l9.f = ah.e((Object)l9);
                                                        final int ag2 = am2.ag;
                                                        float n35;
                                                        if (ag2 != -1) {
                                                            n35 = (float)ag2;
                                                        }
                                                        else {
                                                            final int ah3 = am2.ah;
                                                            if (ah3 != -1) {
                                                                n35 = (float)(((ak)this).d() - ah3);
                                                            }
                                                            else {
                                                                n35 = ((ak)this).d() * am2.af;
                                                            }
                                                        }
                                                        final ai f7 = ak2.j.f;
                                                        final int n36 = (int)(n35 + 0.5f);
                                                        ah.h(f7, n36);
                                                        ah.h(ak2.l.f, n36);
                                                        ak2.b = 2;
                                                        ak2.a = 2;
                                                        ak2.o(n36, n36);
                                                        ak2.k(0, ((ak)this).h());
                                                    }
                                                }
                                                else {
                                                    j4.f = ah.e((Object)j4);
                                                    final aj l10 = ak2.l;
                                                    l10.f = ah.e((Object)l10);
                                                    final int x = ak2.x;
                                                    final int d11 = ak2.d();
                                                    ah.h(ak2.j.f, x);
                                                    ah.h(ak2.l.f, d11 + x);
                                                    if (ak2.C > 0 || ak2.K == 8) {
                                                        final aj m9 = ak2.m;
                                                        m9.f = ah.e((Object)m9);
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
                    int n37 = n3;
                    if (ak2.b == -1) {
                        n37 = n3 + 1;
                    }
                    int n38 = n4;
                    if (ak2.a == -1) {
                        n38 = n4 + 1;
                    }
                    ++l;
                    n3 = n37;
                    n4 = n38;
                }
                int n40 = 0;
                Label_3235: {
                    while (true) {
                        int n39 = 0;
                        Label_3215: {
                            if (n3 != 0) {
                                n39 = n3;
                                break Label_3215;
                            }
                            if (n4 != 0) {
                                n39 = 0;
                                break Label_3215;
                            }
                            n40 = 1;
                            break Label_3235;
                        }
                        if (n == n39 && n2 == n4) {
                            continue;
                        }
                        break;
                    }
                    n40 = 0;
                }
                n = n3;
                k = n40;
                n2 = n4;
            }
            int n41 = 0;
            int n42 = 0;
            int n44 = 0;
            int n45;
            for (int n43 = 0; n43 < size2; ++n43, n41 = n44, n42 = n45) {
                final ak ak3 = this.al.get(n43);
                final int a7 = ak3.a;
                Label_3309: {
                    if (a7 != 1) {
                        n44 = n41;
                        if (a7 != -1) {
                            break Label_3309;
                        }
                    }
                    n44 = n41 + 1;
                }
                final int b9 = ak3.b;
                if (b9 != 1) {
                    n45 = n42;
                    if (b9 != -1) {
                        continue;
                    }
                }
                n45 = n42 + 1;
            }
            if (n41 == 0 && n42 == 0) {
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
                int n46;
                if ((n46 = ad3) == 2) {
                    ak4.v(1);
                    n46 = 2;
                }
                int n47;
                if ((n47 = ae3) == 2) {
                    ak4.w(1);
                    n47 = 2;
                }
                ak4.x(ah);
                if (n46 == 2) {
                    ak4.v(2);
                }
                if (n47 == 2) {
                    ak4.w(2);
                }
            }
            else {
                if (b) {
                    if (this.ad != 2 && ak4.ad == 4) {
                        final aj i7 = ak4.i;
                        i7.f = ah.e((Object)i7);
                        final aj k10 = ak4.k;
                        k10.f = ah.e((Object)k10);
                        final aj i8 = ak4.i;
                        final int c3 = i8.c;
                        final int n48 = ((ak)this).h() - ak4.k.c;
                        ah.h(i8.f, c3);
                        ah.h(ak4.k.f, n48);
                        ak4.k(c3, n48);
                        ak4.a = 2;
                    }
                    if (this.ae != 2 && ak4.ae == 4) {
                        final aj j7 = ak4.j;
                        j7.f = ah.e((Object)j7);
                        final aj l11 = ak4.l;
                        l11.f = ah.e((Object)l11);
                        final aj j8 = ak4.j;
                        final int c4 = j8.c;
                        final int n49 = ((ak)this).d() - ak4.l.c;
                        ah.h(j8.f, c4);
                        ah.h(ak4.l.f, n49);
                        if (ak4.C > 0 || ak4.K == 8) {
                            final aj m10 = ak4.m;
                            m10.f = ah.e((Object)m10);
                            ah.h(ak4.m.f, ak4.C + c4);
                        }
                        ak4.o(c4, n49);
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
    
    public final void i() {
        this.af.l();
        super.i();
    }
}
