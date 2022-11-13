import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ack
{
    public static boolean a = false;
    public static long b = 0L;
    private static int k = 1000;
    public boolean c;
    int d;
    acj[] e;
    public boolean f;
    public boolean g;
    int h;
    int i;
    public final cdo j;
    private int l;
    private int m;
    private boolean[] n;
    private int o;
    private acn[] p;
    private int q;
    private final acj r;
    private acj s;
    
    public ack() {
        this.c = false;
        this.d = 0;
        this.l = 32;
        this.m = 32;
        this.e = null;
        this.f = false;
        this.g = false;
        this.n = new boolean[32];
        this.h = 1;
        this.i = 0;
        this.o = 32;
        this.p = new acn[ack.k];
        this.q = 0;
        this.e = new acj[32];
        this.t();
        final cdo j = new cdo();
        this.j = j;
        this.r = (acj)new acm(j, (byte[])null, (byte[])null);
        this.s = new acj(j, null, null);
    }
    
    public static final int o(final Object o) {
        final acn h = ((acr)o).h;
        if (h != null) {
            return (int)(h.f + 0.5f);
        }
        return 0;
    }
    
    private final void q(acj acj) {
        if (acj.d) {
            acj.a.d(this, acj.b);
        }
        else {
            final acj[] e = this.e;
            final int i = this.i;
            e[i] = acj;
            final acn a = acj.a;
            a.d = i;
            this.i = i + 1;
            a.e(this, acj);
        }
        if (this.c) {
            int n;
            for (int j = 0; j < this.i; j = n + 1) {
                if (this.e[j] == null) {
                    System.out.println("WTF");
                }
                acj = this.e[j];
                n = j;
                if (acj != null) {
                    n = j;
                    if (acj.d) {
                        acj.a.d(this, acj.b);
                        ((aara)this.j.b).h(acj);
                        this.e[j] = null;
                        int n3;
                        int n2 = n3 = j + 1;
                        int k;
                        while (true) {
                            k = this.i;
                            if (n2 >= k) {
                                break;
                            }
                            final acj[] e2 = this.e;
                            final int d = n2 - 1;
                            final acj acj2 = e2[n2];
                            e2[d] = acj2;
                            final acn a2 = acj2.a;
                            if (a2.d == n2) {
                                a2.d = d;
                            }
                            n3 = n2;
                            ++n2;
                        }
                        if (n3 < k) {
                            this.e[n3] = null;
                        }
                        this.i = k - 1;
                        n = j - 1;
                    }
                }
            }
            this.c = false;
        }
    }
    
    private final void r() {
        for (int i = 0; i < this.i; ++i) {
            final acj acj = this.e[i];
            acj.a.f = acj.b;
        }
    }
    
    private final void s() {
        final int l = this.l;
        final int i = l + l;
        this.l = i;
        this.e = Arrays.copyOf(this.e, i);
        final cdo j = this.j;
        j.c = Arrays.copyOf((acn[])j.c, this.l);
        final int k = this.l;
        this.n = new boolean[k];
        this.m = k;
        this.o = k;
    }
    
    private final void t() {
        for (int i = 0; i < this.i; ++i) {
            final acj acj = this.e[i];
            if (acj != null) {
                ((aara)this.j.b).h(acj);
            }
            this.e[i] = null;
        }
    }
    
    private final void u(final acj acj) {
        for (int i = 0; i < this.h; ++i) {
            this.n[i] = false;
        }
        int j = 0;
        int n = 0;
        while (j == 0) {
            final int n2 = n + 1;
            final int h = this.h;
            if (n2 >= h + h) {
                break;
            }
            final acn a = acj.a;
            if (a != null) {
                this.n[a.c] = true;
            }
            final acn k = acj.k(this.n);
            if (k != null) {
                final boolean[] n3 = this.n;
                final int c = k.c;
                if (n3[c]) {
                    return;
                }
                n3[c] = true;
            }
            int n9;
            if (k != null) {
                float n4 = Float.MAX_VALUE;
                int l = 0;
                int d = -1;
                while (l < this.i) {
                    final acj acj2 = this.e[l];
                    float n5;
                    int n6;
                    if (acj2.a.n == 1) {
                        n5 = n4;
                        n6 = d;
                    }
                    else {
                        n5 = n4;
                        n6 = d;
                        if (!acj2.d) {
                            final aci e = acj2.e;
                            int e2 = e.e;
                            n5 = n4;
                            n6 = d;
                            if (e2 != -1) {
                                int n7 = 0;
                                while (true) {
                                    n5 = n4;
                                    n6 = d;
                                    if (e2 == -1) {
                                        break;
                                    }
                                    n5 = n4;
                                    n6 = d;
                                    if (n7 >= e.a) {
                                        break;
                                    }
                                    if (e.b[e2] == k.c) {
                                        final float a2 = acj2.e.a(k);
                                        n5 = n4;
                                        n6 = d;
                                        if (a2 >= 0.0f) {
                                            break;
                                        }
                                        final float n8 = -acj2.b / a2;
                                        n5 = n4;
                                        n6 = d;
                                        if (n8 < n4) {
                                            n6 = l;
                                            n5 = n8;
                                            break;
                                        }
                                        break;
                                    }
                                    else {
                                        e2 = e.c[e2];
                                        ++n7;
                                    }
                                }
                            }
                        }
                    }
                    ++l;
                    n4 = n5;
                    d = n6;
                }
                n9 = j;
                if (d >= 0) {
                    final acj acj3 = this.e[d];
                    acj3.a.d = -1;
                    acj3.b(k);
                    final acn a3 = acj3.a;
                    a3.d = d;
                    a3.e(this, acj3);
                    n9 = j;
                }
            }
            else {
                n9 = 1;
            }
            j = n9;
            n = n2;
        }
    }
    
    private final acn v(int k) {
        acn acn = (acn)((aara)this.j.a).g();
        if (acn == null) {
            acn = new acn(k);
            acn.n = k;
        }
        else {
            acn.c();
            acn.n = k;
        }
        final int q = this.q;
        k = ack.k;
        if (q >= k) {
            k = (ack.k = k + k);
            this.p = Arrays.copyOf(this.p, k);
        }
        final acn[] p = this.p;
        k = this.q++;
        return p[k] = acn;
    }
    
    public final acj a() {
        acj acj = (acj)((aara)this.j.b).g();
        if (acj == null) {
            acj = new acj(this.j, null, null);
            ++ack.b;
        }
        else {
            acj.a = null;
            acj.e.f();
            acj.b = 0.0f;
            acj.d = false;
        }
        ++acn.a;
        return acj;
    }
    
    public final acn b(final Object o) {
        if (o == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final acr acr = (acr)o;
        acn acn;
        if ((acn = acr.h) == null) {
            acr.i();
            acn = acr.h;
        }
        final int c = acn.c;
        if (c != -1) {
            if (c <= this.d && ((acn[])this.j.c)[c] != null) {
                return acn;
            }
            if (c != -1) {
                acn.c();
            }
        }
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        acn.c = n;
        acn.n = 1;
        ((acn[])this.j.c)[n] = acn;
        return acn;
    }
    
    public final acn c() {
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final acn v = this.v(3);
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        v.c = n;
        return ((acn[])this.j.c)[n] = v;
    }
    
    public final void d(final acn acn, final acn acn2, int n, final float n2, final acn acn3, final acn acn4, final int n3, final int n4) {
        final acj a = this.a();
        if (acn2 == acn3) {
            a.e.g(acn, 1.0f);
            a.e.g(acn4, 1.0f);
            a.e.g(acn2, -2.0f);
        }
        else if (n2 == 0.5f) {
            a.e.g(acn, 1.0f);
            a.e.g(acn2, -1.0f);
            a.e.g(acn3, -1.0f);
            a.e.g(acn4, 1.0f);
            if (n > 0 || n3 > 0) {
                a.b = (float)(-n + n3);
            }
        }
        else if (n2 <= 0.0f) {
            a.e.g(acn, -1.0f);
            a.e.g(acn2, 1.0f);
            a.b = (float)n;
        }
        else if (n2 >= 1.0f) {
            a.e.g(acn4, -1.0f);
            a.e.g(acn3, 1.0f);
            a.b = (float)(-n3);
        }
        else {
            final aci e = a.e;
            final float n5 = 1.0f - n2;
            e.g(acn, n5);
            a.e.g(acn2, -n5);
            a.e.g(acn3, -n2);
            a.e.g(acn4, n2);
            if (n > 0 || n3 > 0) {
                n = -n;
                a.b = n * n5 + n3 * n2;
            }
        }
        if (n4 != 8) {
            a.f(this, n4);
        }
        this.e(a);
    }
    
    public final void e(final acj acj) {
        if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
            this.s();
        }
        Label_1124: {
            if (!acj.d) {
                if (this.e.length != 0) {
                    int i = 0;
                    while (i == 0) {
                        for (int a = acj.e.a, j = 0; j < a; ++j) {
                            final acn d = acj.e.d(j);
                            if (d.d == -1 && !d.g) {
                                final boolean m = d.m;
                            }
                            else {
                                acj.c.add(d);
                            }
                        }
                        final int size = acj.c.size();
                        if (size > 0) {
                            for (int k = 0; k < size; ++k) {
                                final acn acn = acj.c.get(k);
                                if (acn.g) {
                                    acj.c(this, acn, true);
                                }
                                else {
                                    final boolean l = acn.m;
                                    acj.d(this, this.e[acn.d], true);
                                }
                            }
                            acj.c.clear();
                        }
                        else {
                            i = 1;
                        }
                    }
                    if (acj.a != null && acj.e.a == 0) {
                        acj.d = true;
                        this.c = true;
                    }
                }
                if (!acj.e()) {
                    final float b = acj.b;
                    if (b < 0.0f) {
                        acj.b = -b;
                        final aci e = acj.e;
                        for (int e2 = e.e, n = 0; e2 != -1 && n < e.a; e2 = e.c[e2], ++n) {
                            final float[] d2 = e.d;
                            d2[e2] = -d2[e2];
                        }
                    }
                    final int a2 = acj.e.a;
                    acn acn2 = null;
                    acn acn3 = null;
                    int n2 = 0;
                    float n3 = 0.0f;
                    int n4 = 0;
                    float n5 = 0.0f;
                    int n6 = 0;
                    while (n2 < a2) {
                        final float b2 = acj.e.b(n2);
                        final acn d3 = acj.e.d(n2);
                        int n7 = 0;
                        acn acn4 = null;
                        acn acn5 = null;
                        float n8 = 0.0f;
                        float n9 = 0.0f;
                        int n10 = 0;
                        Label_0735: {
                            if (d3.n == 1) {
                                if (acn2 == null) {
                                    n7 = (acj.l(d3) ? 1 : 0);
                                }
                                else if (n3 > b2) {
                                    n7 = (acj.l(d3) ? 1 : 0);
                                }
                                else {
                                    acn4 = acn2;
                                    acn5 = acn3;
                                    n8 = n3;
                                    n7 = n4;
                                    n9 = n5;
                                    n10 = n6;
                                    if (n4 != 0) {
                                        break Label_0735;
                                    }
                                    acn4 = acn2;
                                    acn5 = acn3;
                                    n8 = n3;
                                    n7 = n4;
                                    n9 = n5;
                                    n10 = n6;
                                    if (acj.l(d3)) {
                                        n7 = 1;
                                        acn4 = d3;
                                        acn5 = acn3;
                                        n8 = b2;
                                        n9 = n5;
                                        n10 = n6;
                                    }
                                    break Label_0735;
                                }
                                acn4 = d3;
                                acn5 = acn3;
                                n8 = b2;
                                n9 = n5;
                                n10 = n6;
                            }
                            else {
                                acn4 = acn2;
                                acn5 = acn3;
                                n8 = n3;
                                n7 = n4;
                                n9 = n5;
                                n10 = n6;
                                if (acn2 == null) {
                                    acn4 = acn2;
                                    acn5 = acn3;
                                    n8 = n3;
                                    n7 = n4;
                                    n9 = n5;
                                    n10 = n6;
                                    if (b2 < 0.0f) {
                                        if (acn3 == null) {
                                            n10 = (acj.l(d3) ? 1 : 0);
                                        }
                                        else if (n5 > b2) {
                                            n10 = (acj.l(d3) ? 1 : 0);
                                        }
                                        else {
                                            acn4 = acn2;
                                            acn5 = acn3;
                                            n8 = n3;
                                            n7 = n4;
                                            n9 = n5;
                                            if ((n10 = n6) != 0) {
                                                break Label_0735;
                                            }
                                            acn4 = acn2;
                                            acn5 = acn3;
                                            n8 = n3;
                                            n7 = n4;
                                            n9 = n5;
                                            n10 = n6;
                                            if (acj.l(d3)) {
                                                n10 = 1;
                                                n9 = b2;
                                                n7 = n4;
                                                n8 = n3;
                                                acn5 = d3;
                                                acn4 = acn2;
                                            }
                                            break Label_0735;
                                        }
                                        acn4 = acn2;
                                        acn5 = d3;
                                        n8 = n3;
                                        n7 = n4;
                                        n9 = b2;
                                    }
                                }
                            }
                        }
                        ++n2;
                        acn2 = acn4;
                        acn3 = acn5;
                        n3 = n8;
                        n4 = n7;
                        n5 = n9;
                        n6 = n10;
                    }
                    acn acn6;
                    if ((acn6 = acn2) == null) {
                        acn6 = acn3;
                    }
                    boolean b3;
                    if (acn6 == null) {
                        b3 = true;
                    }
                    else {
                        acj.b(acn6);
                        b3 = false;
                    }
                    if (acj.e.a == 0) {
                        acj.d = true;
                    }
                    boolean b4 = false;
                    Label_1086: {
                        if (b3) {
                            if (this.h + 1 >= this.m) {
                                this.s();
                            }
                            final acn v = this.v(3);
                            final int n11 = this.d + 1;
                            this.d = n11;
                            ++this.h;
                            v.c = n11;
                            ((acn[])this.j.c)[n11] = v;
                            acj.a = v;
                            final int i2 = this.i;
                            this.q(acj);
                            if (this.i == i2 + 1) {
                                final acj s = this.s;
                                s.a = null;
                                s.e.f();
                                int n12 = 0;
                                while (true) {
                                    final aci e3 = acj.e;
                                    if (n12 >= e3.a) {
                                        break;
                                    }
                                    s.e.e(e3.d(n12), acj.e.b(n12), true);
                                    ++n12;
                                }
                                this.u(this.s);
                                if (v.d == -1) {
                                    if (acj.a == v) {
                                        final acn a3 = acj.a(null, v);
                                        if (a3 != null) {
                                            acj.b(a3);
                                        }
                                    }
                                    if (!acj.d) {
                                        acj.a.e(this, acj);
                                    }
                                    ((aara)this.j.b).h(acj);
                                    --this.i;
                                }
                                b4 = true;
                                break Label_1086;
                            }
                        }
                        b4 = false;
                    }
                    final acn a4 = acj.a;
                    if (a4 != null && (a4.n == 1 || acj.b >= 0.0f) && !b4) {
                        break Label_1124;
                    }
                }
                return;
            }
        }
        this.q(acj);
    }
    
    public final void f(acn a, int i) {
        final int d = a.d;
        if (d == -1) {
            a.d(this, (float)i);
            for (i = 0; i < this.d + 1; ++i) {
                a = ((acn[])this.j.c)[i];
            }
            return;
        }
        if (d == -1) {
            final acj a2 = this.a();
            a2.a = a;
            final float n = (float)i;
            a.f = n;
            a2.b = n;
            a2.d = true;
            this.e(a2);
            return;
        }
        final acj acj = this.e[d];
        if (acj.d) {
            acj.b = (float)i;
            return;
        }
        if (acj.e.a == 0) {
            acj.d = true;
            acj.b = (float)i;
            return;
        }
        final acj a3 = this.a();
        if (i < 0) {
            a3.b = (float)(-i);
            a3.e.g(a, 1.0f);
        }
        else {
            a3.b = (float)i;
            a3.e.g(a, -1.0f);
        }
        this.e(a3);
    }
    
    public final void g(final acn acn, final acn acn2, final int n, final int n2) {
        final acj a = this.a();
        final acn c = this.c();
        c.e = 0;
        a.h(acn, acn2, c, n);
        if (n2 != 8) {
            this.i(a, (int)(-a.e.a(c)), n2);
        }
        this.e(a);
    }
    
    public final void h(final acn acn, final acn acn2, final int n, final int n2) {
        final acj a = this.a();
        final acn c = this.c();
        c.e = 0;
        a.i(acn, acn2, c, n);
        if (n2 != 8) {
            this.i(a, (int)(-a.e.a(c)), n2);
        }
        this.e(a);
    }
    
    final void i(final acj acj, final int n, final int n2) {
        acj.e.g(this.p(n2), (float)n);
    }
    
    public final void j() {
        final acj r = this.r;
        if (r.e()) {
            this.r();
            return;
        }
        if (this.g) {
            for (int i = 0; i < this.i; ++i) {
                if (!this.e[i].d) {
                    this.l(this.r);
                    return;
                }
            }
            this.r();
            return;
        }
        this.l(r);
    }
    
    public final void k() {
        int n = 0;
        cdo j;
        while (true) {
            j = this.j;
            final acn[] array = (acn[])j.c;
            if (n >= array.length) {
                break;
            }
            final acn acn = array[n];
            if (acn != null) {
                acn.c();
            }
            ++n;
        }
        final Object a = j.a;
        final acn[] p = this.p;
        final int q = this.q;
        final int length = p.length;
        int n2;
        if ((n2 = q) > length) {
            n2 = length;
        }
        for (final acn acn2 : p) {
            final aara aara = (aara)a;
            final int a2 = aara.a;
            if (a2 < 256) {
                ((Object[])aara.b)[a2] = acn2;
                aara.a = a2 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[])this.j.c, null);
        this.d = 0;
        final acm acm = (acm)this.r;
        acm.f = 0;
        acm.b = 0.0f;
        this.h = 1;
        for (int k = 0; k < this.i; ++k) {
            final acj acj = this.e[k];
        }
        this.t();
        this.i = 0;
        this.s = new acj(this.j, null, null);
    }
    
    final void l(final acj acj) {
        for (int i = 0; i < this.i; ++i) {
            final acj acj2 = this.e[i];
            if (acj2.a.n != 1) {
                if (acj2.b < 0.0f) {
                    int j = 0;
                    int n = 0;
                    while (j == 0) {
                        final int n2 = n + 1;
                        float n3 = Float.MAX_VALUE;
                        int k = 0;
                        int d = -1;
                        int c = -1;
                        int n4 = 0;
                        while (k < this.i) {
                            final acj acj3 = this.e[k];
                            float n5;
                            int n6;
                            int n7;
                            int n8;
                            if (acj3.a.n == 1) {
                                n5 = n3;
                                n6 = d;
                                n7 = c;
                                n8 = n4;
                            }
                            else {
                                n5 = n3;
                                n6 = d;
                                n7 = c;
                                n8 = n4;
                                if (!acj3.d) {
                                    n5 = n3;
                                    n6 = d;
                                    n7 = c;
                                    n8 = n4;
                                    if (acj3.b < 0.0f) {
                                        final int a = acj3.e.a;
                                        int n9 = 0;
                                        while (true) {
                                            n5 = n3;
                                            n6 = d;
                                            n7 = c;
                                            n8 = n4;
                                            if (n9 >= a) {
                                                break;
                                            }
                                            final acn d2 = acj3.e.d(n9);
                                            final float a2 = acj3.e.a(d2);
                                            float n10;
                                            int n11;
                                            int n12;
                                            int n13;
                                            if (a2 <= 0.0f) {
                                                n10 = n3;
                                                n11 = d;
                                                n12 = c;
                                                n13 = n4;
                                            }
                                            else {
                                                final int n14 = 0;
                                                int n15 = n4;
                                                int n16 = n14;
                                                while (true) {
                                                    n10 = n3;
                                                    n11 = d;
                                                    n12 = c;
                                                    n13 = n15;
                                                    if (n16 >= 9) {
                                                        break;
                                                    }
                                                    final float n17 = d2.h[n16] / a2;
                                                    int n18;
                                                    if ((n17 < n3 && n16 == n15) || n16 > (n18 = n15)) {
                                                        c = d2.c;
                                                        n18 = n16;
                                                        n3 = n17;
                                                        d = k;
                                                    }
                                                    ++n16;
                                                    n15 = n18;
                                                }
                                            }
                                            ++n9;
                                            n3 = n10;
                                            d = n11;
                                            c = n12;
                                            n4 = n13;
                                        }
                                    }
                                }
                            }
                            ++k;
                            n3 = n5;
                            d = n6;
                            c = n7;
                            n4 = n8;
                        }
                        boolean b;
                        if (d != -1) {
                            final acj acj4 = this.e[d];
                            acj4.a.d = -1;
                            acj4.b(((acn[])this.j.c)[c]);
                            final acn a3 = acj4.a;
                            a3.d = d;
                            a3.e(this, acj4);
                            b = false;
                        }
                        else {
                            b = true;
                        }
                        j = (((n2 <= this.h / 2 ^ true) | b) ? 1 : 0);
                        n = n2;
                    }
                    break;
                }
            }
        }
        this.u(acj);
        this.r();
    }
    
    public final void m(final acn acn, final acn acn2, int n, int n2) {
        int n3 = n2;
        if (n2 == 8) {
            if (acn2.g && acn.d == -1) {
                acn.d(this, acn2.f + n);
                return;
            }
            n3 = 8;
        }
        final acj a = this.a();
        Label_0138: {
            if (n != 0) {
                if (n < 0) {
                    n2 = -n;
                    n = 1;
                }
                else {
                    final int n4 = 0;
                    n2 = n;
                    n = n4;
                }
                a.b = (float)n2;
                if (n != 0) {
                    a.e.g(acn, 1.0f);
                    a.e.g(acn2, -1.0f);
                    break Label_0138;
                }
            }
            a.e.g(acn, -1.0f);
            a.e.g(acn2, 1.0f);
        }
        if (n3 != 8) {
            a.f(this, n3);
        }
        this.e(a);
    }
    
    public final void n(final acn acn, final acn acn2, final acn acn3, final acn acn4, final float n) {
        final acj a = this.a();
        a.g(acn, acn2, acn3, acn4, n);
        this.e(a);
    }
    
    public final acn p(final int e) {
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final acn v = this.v(4);
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        v.c = n;
        v.e = e;
        ((acn[])this.j.c)[n] = v;
        final acm acm = (acm)this.r;
        final acl g = acm.g;
        g.a = v;
        Arrays.fill(g.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        acm.m(v);
        return v;
    }
}
