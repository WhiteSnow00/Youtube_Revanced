import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acj
{
    public static boolean a = false;
    public static long b = 0L;
    private static int k = 1000;
    public boolean c;
    int d;
    aci[] e;
    public boolean f;
    public boolean g;
    int h;
    int i;
    public final cdn j;
    private int l;
    private int m;
    private boolean[] n;
    private int o;
    private acm[] p;
    private int q;
    private final aci r;
    private aci s;
    
    public acj() {
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
        this.p = new acm[acj.k];
        this.q = 0;
        this.e = new aci[32];
        this.t();
        final cdn j = new cdn();
        this.j = j;
        this.r = (aci)new acl(j, (byte[])null, (byte[])null);
        this.s = new aci(j, null, null);
    }
    
    public static final int o(final Object o) {
        final acm h = ((acq)o).h;
        if (h != null) {
            return (int)(h.f + 0.5f);
        }
        return 0;
    }
    
    private final void q(aci aci) {
        if (aci.d) {
            aci.a.d(this, aci.b);
        }
        else {
            final aci[] e = this.e;
            final int i = this.i;
            e[i] = aci;
            final acm a = aci.a;
            a.d = i;
            this.i = i + 1;
            a.e(this, aci);
        }
        if (this.c) {
            int n;
            for (int j = 0; j < this.i; j = n + 1) {
                if (this.e[j] == null) {
                    System.out.println("WTF");
                }
                aci = this.e[j];
                n = j;
                if (aci != null) {
                    n = j;
                    if (aci.d) {
                        aci.a.d(this, aci.b);
                        ((aapg)this.j.b).h((Object)aci);
                        this.e[j] = null;
                        int n3;
                        int n2 = n3 = j + 1;
                        int k;
                        while (true) {
                            k = this.i;
                            if (n2 >= k) {
                                break;
                            }
                            final aci[] e2 = this.e;
                            final int d = n2 - 1;
                            final aci aci2 = e2[n2];
                            e2[d] = aci2;
                            final acm a2 = aci2.a;
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
            final aci aci = this.e[i];
            aci.a.f = aci.b;
        }
    }
    
    private final void s() {
        final int l = this.l;
        final int i = l + l;
        this.l = i;
        this.e = Arrays.copyOf(this.e, i);
        final cdn j = this.j;
        j.c = Arrays.copyOf((acm[])j.c, this.l);
        final int k = this.l;
        this.n = new boolean[k];
        this.m = k;
        this.o = k;
    }
    
    private final void t() {
        for (int i = 0; i < this.i; ++i) {
            final aci aci = this.e[i];
            if (aci != null) {
                ((aapg)this.j.b).h((Object)aci);
            }
            this.e[i] = null;
        }
    }
    
    private final void u(final aci aci) {
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
            final acm a = aci.a;
            if (a != null) {
                this.n[a.c] = true;
            }
            final acm k = aci.k(this.n);
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
                    final aci aci2 = this.e[l];
                    float n5;
                    int n6;
                    if (aci2.a.n == 1) {
                        n5 = n4;
                        n6 = d;
                    }
                    else if (aci2.d) {
                        n5 = n4;
                        n6 = d;
                    }
                    else {
                        final ach e = aci2.e;
                        int e2 = e.e;
                        if (e2 == -1) {
                            n5 = n4;
                            n6 = d;
                        }
                        else {
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
                                    final float a2 = aci2.e.a(k);
                                    n5 = n4;
                                    n6 = d;
                                    if (a2 >= 0.0f) {
                                        break;
                                    }
                                    final float n8 = -aci2.b / a2;
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
                    ++l;
                    n4 = n5;
                    d = n6;
                }
                n9 = j;
                if (d >= 0) {
                    final aci aci3 = this.e[d];
                    aci3.a.d = -1;
                    aci3.b(k);
                    final acm a3 = aci3.a;
                    a3.d = d;
                    a3.e(this, aci3);
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
    
    private final acm v(int q) {
        acm acm = (acm)((aapg)this.j.a).g();
        if (acm == null) {
            acm = new acm(q);
            acm.n = q;
        }
        else {
            acm.c();
            acm.n = q;
        }
        q = this.q;
        final int k = acj.k;
        if (q >= k) {
            q = (acj.k = k + k);
            this.p = Arrays.copyOf(this.p, q);
        }
        final acm[] p = this.p;
        q = this.q++;
        return p[q] = acm;
    }
    
    public final aci a() {
        aci aci = (aci)((aapg)this.j.b).g();
        if (aci == null) {
            aci = new aci(this.j, null, null);
            ++acj.b;
        }
        else {
            aci.a = null;
            aci.e.f();
            aci.b = 0.0f;
            aci.d = false;
        }
        ++acm.a;
        return aci;
    }
    
    public final acm b(final Object o) {
        if (o == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final acq acq = (acq)o;
        acm acm;
        if ((acm = acq.h) == null) {
            acq.i();
            acm = acq.h;
        }
        final int c = acm.c;
        if (c != -1) {
            if (c <= this.d && ((acm[])this.j.c)[c] != null) {
                return acm;
            }
            if (c != -1) {
                acm.c();
            }
        }
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        acm.c = n;
        acm.n = 1;
        ((acm[])this.j.c)[n] = acm;
        return acm;
    }
    
    public final acm c() {
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final acm v = this.v(3);
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        v.c = n;
        return ((acm[])this.j.c)[n] = v;
    }
    
    public final void d(final acm acm, final acm acm2, final int n, final float n2, final acm acm3, final acm acm4, final int n3, final int n4) {
        final aci a = this.a();
        if (acm2 == acm3) {
            a.e.g(acm, 1.0f);
            a.e.g(acm4, 1.0f);
            a.e.g(acm2, -2.0f);
        }
        else if (n2 == 0.5f) {
            a.e.g(acm, 1.0f);
            a.e.g(acm2, -1.0f);
            a.e.g(acm3, -1.0f);
            a.e.g(acm4, 1.0f);
            if (n > 0 || n3 > 0) {
                a.b = (float)(-n + n3);
            }
        }
        else if (n2 <= 0.0f) {
            a.e.g(acm, -1.0f);
            a.e.g(acm2, 1.0f);
            a.b = (float)n;
        }
        else if (n2 >= 1.0f) {
            a.e.g(acm4, -1.0f);
            a.e.g(acm3, 1.0f);
            a.b = (float)(-n3);
        }
        else {
            final float n5 = 1.0f - n2;
            a.e.g(acm, n5);
            a.e.g(acm2, -n5);
            a.e.g(acm3, -n2);
            a.e.g(acm4, n2);
            if (n > 0 || n3 > 0) {
                a.b = -n * n5 + n3 * n2;
            }
        }
        if (n4 != 8) {
            a.f(this, n4);
        }
        this.e(a);
    }
    
    public final void e(final aci aci) {
        if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
            this.s();
        }
        Label_1118: {
            if (!aci.d) {
                if (this.e.length != 0) {
                    int i = 0;
                    while (i == 0) {
                        for (int a = aci.e.a, j = 0; j < a; ++j) {
                            final acm d = aci.e.d(j);
                            if (d.d == -1 && !d.g) {
                                final boolean m = d.m;
                            }
                            else {
                                aci.c.add(d);
                            }
                        }
                        final int size = aci.c.size();
                        if (size > 0) {
                            for (int k = 0; k < size; ++k) {
                                final acm acm = aci.c.get(k);
                                if (acm.g) {
                                    aci.c(this, acm, true);
                                }
                                else {
                                    final boolean l = acm.m;
                                    aci.d(this, this.e[acm.d], true);
                                }
                            }
                            aci.c.clear();
                        }
                        else {
                            i = 1;
                        }
                    }
                    if (aci.a != null && aci.e.a == 0) {
                        aci.d = true;
                        this.c = true;
                    }
                }
                if (!aci.e()) {
                    final float b = aci.b;
                    if (b < 0.0f) {
                        aci.b = -b;
                        final ach e = aci.e;
                        for (int e2 = e.e, n = 0; e2 != -1 && n < e.a; e2 = e.c[e2], ++n) {
                            final float[] d2 = e.d;
                            d2[e2] = -d2[e2];
                        }
                    }
                    final int a2 = aci.e.a;
                    acm acm3;
                    acm acm2 = acm3 = null;
                    int n2 = 0;
                    float n3 = 0.0f;
                    float n4 = 0.0f;
                    int n5 = 0;
                    int n6 = 0;
                    while (n2 < a2) {
                        final float b2 = aci.e.b(n2);
                        final acm d3 = aci.e.d(n2);
                        int n7 = 0;
                        acm acm4 = null;
                        acm acm5 = null;
                        float n8 = 0.0f;
                        float n9 = 0.0f;
                        int n10 = 0;
                        Label_0743: {
                            if (d3.n == 1) {
                                if (acm2 == null) {
                                    n7 = (aci.l(d3) ? 1 : 0);
                                }
                                else if (n3 > b2) {
                                    n7 = (aci.l(d3) ? 1 : 0);
                                }
                                else {
                                    acm4 = acm2;
                                    acm5 = acm3;
                                    n8 = n3;
                                    n9 = n4;
                                    n10 = n5;
                                    if ((n7 = n6) != 0) {
                                        break Label_0743;
                                    }
                                    acm4 = acm2;
                                    acm5 = acm3;
                                    n8 = n3;
                                    n9 = n4;
                                    n10 = n5;
                                    n7 = n6;
                                    if (aci.l(d3)) {
                                        n7 = 1;
                                        acm4 = d3;
                                        acm5 = acm3;
                                        n8 = b2;
                                        n9 = n4;
                                        n10 = n5;
                                    }
                                    break Label_0743;
                                }
                                acm4 = d3;
                                acm5 = acm3;
                                n8 = b2;
                                n9 = n4;
                                n10 = n5;
                            }
                            else {
                                acm4 = acm2;
                                acm5 = acm3;
                                n8 = n3;
                                n9 = n4;
                                n10 = n5;
                                n7 = n6;
                                if (acm2 == null) {
                                    acm4 = acm2;
                                    acm5 = acm3;
                                    n8 = n3;
                                    n9 = n4;
                                    n10 = n5;
                                    n7 = n6;
                                    if (b2 < 0.0f) {
                                        if (acm3 == null) {
                                            n10 = (aci.l(d3) ? 1 : 0);
                                        }
                                        else if (n4 > b2) {
                                            n10 = (aci.l(d3) ? 1 : 0);
                                        }
                                        else {
                                            acm4 = acm2;
                                            acm5 = acm3;
                                            n8 = n3;
                                            n9 = n4;
                                            n10 = n5;
                                            n7 = n6;
                                            if (n5 != 0) {
                                                break Label_0743;
                                            }
                                            acm4 = acm2;
                                            acm5 = acm3;
                                            n8 = n3;
                                            n9 = n4;
                                            n10 = n5;
                                            n7 = n6;
                                            if (aci.l(d3)) {
                                                n10 = 1;
                                                n7 = n6;
                                                n9 = b2;
                                                n8 = n3;
                                                acm5 = d3;
                                                acm4 = acm2;
                                            }
                                            break Label_0743;
                                        }
                                        acm4 = acm2;
                                        acm5 = d3;
                                        n8 = n3;
                                        n9 = b2;
                                        n7 = n6;
                                    }
                                }
                            }
                        }
                        ++n2;
                        acm2 = acm4;
                        acm3 = acm5;
                        n3 = n8;
                        n4 = n9;
                        n5 = n10;
                        n6 = n7;
                    }
                    if (acm2 == null) {
                        acm2 = acm3;
                    }
                    boolean b3;
                    if (acm2 == null) {
                        b3 = true;
                    }
                    else {
                        aci.b(acm2);
                        b3 = false;
                    }
                    if (aci.e.a == 0) {
                        aci.d = true;
                    }
                    boolean b4 = false;
                    Label_1081: {
                        if (b3) {
                            if (this.h + 1 >= this.m) {
                                this.s();
                            }
                            final acm v = this.v(3);
                            final int n11 = this.d + 1;
                            this.d = n11;
                            ++this.h;
                            v.c = n11;
                            ((acm[])this.j.c)[n11] = v;
                            aci.a = v;
                            final int i2 = this.i;
                            this.q(aci);
                            if (this.i == i2 + 1) {
                                final aci s = this.s;
                                s.a = null;
                                s.e.f();
                                int n12 = 0;
                                while (true) {
                                    final ach e3 = aci.e;
                                    if (n12 >= e3.a) {
                                        break;
                                    }
                                    s.e.e(e3.d(n12), aci.e.b(n12), true);
                                    ++n12;
                                }
                                this.u(this.s);
                                if (v.d == -1) {
                                    if (aci.a == v) {
                                        final acm a3 = aci.a(null, v);
                                        if (a3 != null) {
                                            aci.b(a3);
                                        }
                                    }
                                    if (!aci.d) {
                                        aci.a.e(this, aci);
                                    }
                                    ((aapg)this.j.b).h((Object)aci);
                                    --this.i;
                                }
                                b4 = true;
                                break Label_1081;
                            }
                        }
                        b4 = false;
                    }
                    final acm a4 = aci.a;
                    if (a4 != null && (a4.n == 1 || aci.b >= 0.0f) && !b4) {
                        break Label_1118;
                    }
                }
                return;
            }
        }
        this.q(aci);
    }
    
    public final void f(acm a, int i) {
        final int d = a.d;
        if (d == -1) {
            a.d(this, (float)i);
            for (i = 0; i < this.d + 1; ++i) {
                a = ((acm[])this.j.c)[i];
            }
            return;
        }
        if (d == -1) {
            final aci a2 = this.a();
            a2.a = a;
            final float n = (float)i;
            a.f = n;
            a2.b = n;
            a2.d = true;
            this.e(a2);
            return;
        }
        final aci aci = this.e[d];
        if (aci.d) {
            aci.b = (float)i;
            return;
        }
        if (aci.e.a == 0) {
            aci.d = true;
            aci.b = (float)i;
            return;
        }
        final aci a3 = this.a();
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
    
    public final void g(final acm acm, final acm acm2, final int n, final int n2) {
        final aci a = this.a();
        final acm c = this.c();
        c.e = 0;
        a.h(acm, acm2, c, n);
        if (n2 != 8) {
            this.i(a, (int)(-a.e.a(c)), n2);
        }
        this.e(a);
    }
    
    public final void h(final acm acm, final acm acm2, final int n, final int n2) {
        final aci a = this.a();
        final acm c = this.c();
        c.e = 0;
        a.i(acm, acm2, c, n);
        if (n2 != 8) {
            this.i(a, (int)(-a.e.a(c)), n2);
        }
        this.e(a);
    }
    
    final void i(final aci aci, final int n, final int n2) {
        aci.e.g(this.p(n2), (float)n);
    }
    
    public final void j() {
        final aci r = this.r;
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
        cdn j;
        while (true) {
            j = this.j;
            final acm[] array = (acm[])j.c;
            if (n >= array.length) {
                break;
            }
            final acm acm = array[n];
            if (acm != null) {
                acm.c();
            }
            ++n;
        }
        final Object a = j.a;
        final acm[] p = this.p;
        final int q = this.q;
        final int length = p.length;
        int n2;
        if ((n2 = q) > length) {
            n2 = length;
        }
        for (final acm acm2 : p) {
            final aapg aapg = (aapg)a;
            final int a2 = aapg.a;
            if (a2 < 256) {
                ((Object[])aapg.b)[a2] = acm2;
                aapg.a = a2 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[])this.j.c, null);
        this.d = 0;
        final acl acl = (acl)this.r;
        acl.f = 0;
        acl.b = 0.0f;
        this.h = 1;
        for (int k = 0; k < this.i; ++k) {
            final aci aci = this.e[k];
        }
        this.t();
        this.i = 0;
        this.s = new aci(this.j, null, null);
    }
    
    final void l(final aci aci) {
        for (int i = 0; i < this.i; ++i) {
            final aci aci2 = this.e[i];
            if (aci2.a.n != 1) {
                if (aci2.b < 0.0f) {
                    int j = 0;
                    int n = 0;
                    while (j == 0) {
                        final int n2 = n + 1;
                        float n3 = Float.MAX_VALUE;
                        int k = 0;
                        int d = -1;
                        int n4 = -1;
                        int n5 = 0;
                        while (k < this.i) {
                            final aci aci3 = this.e[k];
                            float n6;
                            int n7;
                            int n8;
                            int n9;
                            if (aci3.a.n == 1) {
                                n6 = n3;
                                n7 = d;
                                n8 = n4;
                                n9 = n5;
                            }
                            else if (aci3.d) {
                                n6 = n3;
                                n7 = d;
                                n8 = n4;
                                n9 = n5;
                            }
                            else {
                                n6 = n3;
                                n7 = d;
                                n8 = n4;
                                n9 = n5;
                                if (aci3.b < 0.0f) {
                                    final int a = aci3.e.a;
                                    int n10 = 0;
                                    while (true) {
                                        n6 = n3;
                                        n7 = d;
                                        n8 = n4;
                                        n9 = n5;
                                        if (n10 >= a) {
                                            break;
                                        }
                                        final acm d2 = aci3.e.d(n10);
                                        final float a2 = aci3.e.a(d2);
                                        float n11;
                                        int n12;
                                        int n13;
                                        int n14;
                                        if (a2 <= 0.0f) {
                                            n11 = n3;
                                            n12 = d;
                                            n13 = n4;
                                            n14 = n5;
                                        }
                                        else {
                                            final int n15 = 0;
                                            int c = n4;
                                            int n16 = n15;
                                            while (true) {
                                                n11 = n3;
                                                n12 = d;
                                                n13 = c;
                                                n14 = n5;
                                                if (n16 >= 9) {
                                                    break;
                                                }
                                                final float n17 = d2.h[n16] / a2;
                                                int n18;
                                                if ((n17 < n3 && n16 == n5) || n16 > (n18 = n5)) {
                                                    c = d2.c;
                                                    n18 = n16;
                                                    n3 = n17;
                                                    d = k;
                                                }
                                                ++n16;
                                                n5 = n18;
                                            }
                                        }
                                        ++n10;
                                        n3 = n11;
                                        d = n12;
                                        n4 = n13;
                                        n5 = n14;
                                    }
                                }
                            }
                            ++k;
                            n3 = n6;
                            d = n7;
                            n4 = n8;
                            n5 = n9;
                        }
                        boolean b;
                        if (d != -1) {
                            final aci aci4 = this.e[d];
                            aci4.a.d = -1;
                            aci4.b(((acm[])this.j.c)[n4]);
                            final acm a3 = aci4.a;
                            a3.d = d;
                            a3.e(this, aci4);
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
        this.u(aci);
        this.r();
    }
    
    public final void m(final acm acm, final acm acm2, int n, int n2) {
        int n3 = n2;
        if (n2 == 8) {
            if (acm2.g && acm.d == -1) {
                acm.d(this, acm2.f + n);
                return;
            }
            n3 = 8;
        }
        final aci a = this.a();
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
                    a.e.g(acm, 1.0f);
                    a.e.g(acm2, -1.0f);
                    break Label_0138;
                }
            }
            a.e.g(acm, -1.0f);
            a.e.g(acm2, 1.0f);
        }
        if (n3 != 8) {
            a.f(this, n3);
        }
        this.e(a);
    }
    
    public final void n(final acm acm, final acm acm2, final acm acm3, final acm acm4, final float n) {
        final aci a = this.a();
        a.g(acm, acm2, acm3, acm4, n);
        this.e(a);
    }
    
    public final acm p(final int e) {
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final acm v = this.v(4);
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        v.c = n;
        v.e = e;
        ((acm[])this.j.c)[n] = v;
        final acl acl = (acl)this.r;
        final ack g = acl.g;
        g.a = v;
        Arrays.fill(g.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        acl.m(v);
        return v;
    }
}
