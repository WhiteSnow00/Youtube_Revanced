import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acl
{
    public static boolean a = false;
    public static long b = 0L;
    private static int k = 1000;
    public boolean c;
    int d;
    ack[] e;
    public boolean f;
    public boolean g;
    int h;
    int i;
    public final cdr j;
    private int l;
    private int m;
    private boolean[] n;
    private int o;
    private aco[] p;
    private int q;
    private final ack r;
    private ack s;
    
    public acl() {
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
        this.p = new aco[acl.k];
        this.q = 0;
        this.e = new ack[32];
        this.t();
        final cdr j = new cdr();
        this.j = j;
        this.r = new acn(j, null, null);
        this.s = new ack(j, null, null);
    }
    
    public static final int o(final Object o) {
        final aco h = ((acs)o).h;
        if (h != null) {
            return (int)(h.f + 0.5f);
        }
        return 0;
    }
    
    private final void q(ack ack) {
        if (ack.d) {
            ack.a.d(this, ack.b);
        }
        else {
            final ack[] e = this.e;
            final int i = this.i;
            e[i] = ack;
            final aco a = ack.a;
            a.d = i;
            this.i = i + 1;
            a.e(this, ack);
        }
        if (this.c) {
            int n;
            for (int j = 0; j < this.i; j = n + 1) {
                if (this.e[j] == null) {
                    System.out.println("WTF");
                }
                ack = this.e[j];
                n = j;
                if (ack != null) {
                    n = j;
                    if (ack.d) {
                        ack.a.d(this, ack.b);
                        ((aasq)this.j.b).h(ack);
                        this.e[j] = null;
                        int n3;
                        int n2 = n3 = j + 1;
                        int k;
                        while (true) {
                            k = this.i;
                            if (n2 >= k) {
                                break;
                            }
                            final ack[] e2 = this.e;
                            final int d = n2 - 1;
                            ack = e2[n2];
                            e2[d] = ack;
                            final aco a2 = ack.a;
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
            final ack ack = this.e[i];
            ack.a.f = ack.b;
        }
    }
    
    private final void s() {
        final int l = this.l;
        final int i = l + l;
        this.l = i;
        this.e = Arrays.copyOf(this.e, i);
        final cdr j = this.j;
        j.c = Arrays.copyOf((aco[])j.c, this.l);
        final int k = this.l;
        this.n = new boolean[k];
        this.m = k;
        this.o = k;
    }
    
    private final void t() {
        for (int i = 0; i < this.i; ++i) {
            final ack ack = this.e[i];
            if (ack != null) {
                ((aasq)this.j.b).h(ack);
            }
            this.e[i] = null;
        }
    }
    
    private final void u(final ack ack) {
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
            final aco a = ack.a;
            if (a != null) {
                this.n[a.c] = true;
            }
            final aco k = ack.k(this.n);
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
                    final ack ack2 = this.e[l];
                    float n5;
                    int n6;
                    if (ack2.a.n == 1) {
                        n5 = n4;
                        n6 = d;
                    }
                    else {
                        n5 = n4;
                        n6 = d;
                        if (!ack2.d) {
                            final acj e = ack2.e;
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
                                        final float a2 = ack2.e.a(k);
                                        n5 = n4;
                                        n6 = d;
                                        if (a2 >= 0.0f) {
                                            break;
                                        }
                                        final float n8 = -ack2.b / a2;
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
                    final ack ack3 = this.e[d];
                    ack3.a.d = -1;
                    ack3.b(k);
                    final aco a3 = ack3.a;
                    a3.d = d;
                    a3.e(this, ack3);
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
    
    private final aco v(int q) {
        aco aco = (aco)((aasq)this.j.a).g();
        if (aco == null) {
            aco = new aco(q);
            aco.n = q;
        }
        else {
            aco.c();
            aco.n = q;
        }
        q = this.q;
        final int k = acl.k;
        if (q >= k) {
            q = (acl.k = k + k);
            this.p = Arrays.copyOf(this.p, q);
        }
        final aco[] p = this.p;
        q = this.q++;
        return p[q] = aco;
    }
    
    public final ack a() {
        ack ack = (ack)((aasq)this.j.b).g();
        if (ack == null) {
            ack = new ack(this.j, null, null);
            ++acl.b;
        }
        else {
            ack.a = null;
            ack.e.f();
            ack.b = 0.0f;
            ack.d = false;
        }
        ++aco.a;
        return ack;
    }
    
    public final aco b(final Object o) {
        if (o == null) {
            return null;
        }
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final acs acs = (acs)o;
        aco aco;
        if ((aco = acs.h) == null) {
            acs.i();
            aco = acs.h;
        }
        final int c = aco.c;
        if (c != -1) {
            if (c <= this.d && ((aco[])this.j.c)[c] != null) {
                return aco;
            }
            if (c != -1) {
                aco.c();
            }
        }
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        aco.c = n;
        aco.n = 1;
        ((aco[])this.j.c)[n] = aco;
        return aco;
    }
    
    public final aco c() {
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final aco v = this.v(3);
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        v.c = n;
        return ((aco[])this.j.c)[n] = v;
    }
    
    public final void d(final aco aco, final aco aco2, int n, final float n2, final aco aco3, final aco aco4, final int n3, final int n4) {
        final ack a = this.a();
        if (aco2 == aco3) {
            a.e.g(aco, 1.0f);
            a.e.g(aco4, 1.0f);
            a.e.g(aco2, -2.0f);
        }
        else if (n2 == 0.5f) {
            a.e.g(aco, 1.0f);
            a.e.g(aco2, -1.0f);
            a.e.g(aco3, -1.0f);
            a.e.g(aco4, 1.0f);
            if (n > 0 || n3 > 0) {
                a.b = (float)(-n + n3);
            }
        }
        else if (n2 <= 0.0f) {
            a.e.g(aco, -1.0f);
            a.e.g(aco2, 1.0f);
            a.b = (float)n;
        }
        else if (n2 >= 1.0f) {
            a.e.g(aco4, -1.0f);
            a.e.g(aco3, 1.0f);
            a.b = (float)(-n3);
        }
        else {
            final acj e = a.e;
            final float n5 = 1.0f - n2;
            e.g(aco, n5);
            a.e.g(aco2, -n5);
            a.e.g(aco3, -n2);
            a.e.g(aco4, n2);
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
    
    public final void e(final ack ack) {
        if (this.i + 1 >= this.o || this.h + 1 >= this.m) {
            this.s();
        }
        Label_1124: {
            if (!ack.d) {
                if (this.e.length != 0) {
                    int i = 0;
                    while (i == 0) {
                        for (int a = ack.e.a, j = 0; j < a; ++j) {
                            final aco d = ack.e.d(j);
                            if (d.d == -1 && !d.g) {
                                final boolean m = d.m;
                            }
                            else {
                                ack.c.add(d);
                            }
                        }
                        final int size = ack.c.size();
                        if (size > 0) {
                            for (int k = 0; k < size; ++k) {
                                final aco aco = ack.c.get(k);
                                if (aco.g) {
                                    ack.c(this, aco, true);
                                }
                                else {
                                    final boolean l = aco.m;
                                    ack.d(this, this.e[aco.d], true);
                                }
                            }
                            ack.c.clear();
                        }
                        else {
                            i = 1;
                        }
                    }
                    if (ack.a != null && ack.e.a == 0) {
                        ack.d = true;
                        this.c = true;
                    }
                }
                if (!ack.e()) {
                    final float b = ack.b;
                    if (b < 0.0f) {
                        ack.b = -b;
                        final acj e = ack.e;
                        for (int e2 = e.e, n = 0; e2 != -1 && n < e.a; e2 = e.c[e2], ++n) {
                            final float[] d2 = e.d;
                            d2[e2] = -d2[e2];
                        }
                    }
                    final int a2 = ack.e.a;
                    aco aco2 = null;
                    aco aco3 = null;
                    int n2 = 0;
                    float n3 = 0.0f;
                    int n4 = 0;
                    float n5 = 0.0f;
                    int n6 = 0;
                    while (n2 < a2) {
                        final float b2 = ack.e.b(n2);
                        final aco d3 = ack.e.d(n2);
                        int n7 = 0;
                        aco aco4 = null;
                        aco aco5 = null;
                        float n8 = 0.0f;
                        float n9 = 0.0f;
                        int n10 = 0;
                        Label_0735: {
                            if (d3.n == 1) {
                                if (aco2 == null) {
                                    n7 = (ack.l(d3) ? 1 : 0);
                                }
                                else if (n3 > b2) {
                                    n7 = (ack.l(d3) ? 1 : 0);
                                }
                                else {
                                    aco4 = aco2;
                                    aco5 = aco3;
                                    n8 = n3;
                                    n7 = n4;
                                    n9 = n5;
                                    n10 = n6;
                                    if (n4 != 0) {
                                        break Label_0735;
                                    }
                                    aco4 = aco2;
                                    aco5 = aco3;
                                    n8 = n3;
                                    n7 = n4;
                                    n9 = n5;
                                    n10 = n6;
                                    if (ack.l(d3)) {
                                        n7 = 1;
                                        aco4 = d3;
                                        aco5 = aco3;
                                        n8 = b2;
                                        n9 = n5;
                                        n10 = n6;
                                    }
                                    break Label_0735;
                                }
                                aco4 = d3;
                                aco5 = aco3;
                                n8 = b2;
                                n9 = n5;
                                n10 = n6;
                            }
                            else {
                                aco4 = aco2;
                                aco5 = aco3;
                                n8 = n3;
                                n7 = n4;
                                n9 = n5;
                                n10 = n6;
                                if (aco2 == null) {
                                    aco4 = aco2;
                                    aco5 = aco3;
                                    n8 = n3;
                                    n7 = n4;
                                    n9 = n5;
                                    n10 = n6;
                                    if (b2 < 0.0f) {
                                        if (aco3 == null) {
                                            n10 = (ack.l(d3) ? 1 : 0);
                                        }
                                        else if (n5 > b2) {
                                            n10 = (ack.l(d3) ? 1 : 0);
                                        }
                                        else {
                                            aco4 = aco2;
                                            aco5 = aco3;
                                            n8 = n3;
                                            n7 = n4;
                                            n9 = n5;
                                            if ((n10 = n6) != 0) {
                                                break Label_0735;
                                            }
                                            aco4 = aco2;
                                            aco5 = aco3;
                                            n8 = n3;
                                            n7 = n4;
                                            n9 = n5;
                                            n10 = n6;
                                            if (ack.l(d3)) {
                                                n10 = 1;
                                                n9 = b2;
                                                n7 = n4;
                                                n8 = n3;
                                                aco5 = d3;
                                                aco4 = aco2;
                                            }
                                            break Label_0735;
                                        }
                                        aco4 = aco2;
                                        aco5 = d3;
                                        n8 = n3;
                                        n7 = n4;
                                        n9 = b2;
                                    }
                                }
                            }
                        }
                        ++n2;
                        aco2 = aco4;
                        aco3 = aco5;
                        n3 = n8;
                        n4 = n7;
                        n5 = n9;
                        n6 = n10;
                    }
                    aco aco6;
                    if ((aco6 = aco2) == null) {
                        aco6 = aco3;
                    }
                    boolean b3;
                    if (aco6 == null) {
                        b3 = true;
                    }
                    else {
                        ack.b(aco6);
                        b3 = false;
                    }
                    if (ack.e.a == 0) {
                        ack.d = true;
                    }
                    boolean b4 = false;
                    Label_1086: {
                        if (b3) {
                            if (this.h + 1 >= this.m) {
                                this.s();
                            }
                            final aco v = this.v(3);
                            final int n11 = this.d + 1;
                            this.d = n11;
                            ++this.h;
                            v.c = n11;
                            ((aco[])this.j.c)[n11] = v;
                            ack.a = v;
                            final int i2 = this.i;
                            this.q(ack);
                            if (this.i == i2 + 1) {
                                final ack s = this.s;
                                s.a = null;
                                s.e.f();
                                int n12 = 0;
                                while (true) {
                                    final acj e3 = ack.e;
                                    if (n12 >= e3.a) {
                                        break;
                                    }
                                    s.e.e(e3.d(n12), ack.e.b(n12), true);
                                    ++n12;
                                }
                                this.u(this.s);
                                if (v.d == -1) {
                                    if (ack.a == v) {
                                        final aco a3 = ack.a(null, v);
                                        if (a3 != null) {
                                            ack.b(a3);
                                        }
                                    }
                                    if (!ack.d) {
                                        ack.a.e(this, ack);
                                    }
                                    ((aasq)this.j.b).h(ack);
                                    --this.i;
                                }
                                b4 = true;
                                break Label_1086;
                            }
                        }
                        b4 = false;
                    }
                    final aco a4 = ack.a;
                    if (a4 != null && (a4.n == 1 || ack.b >= 0.0f) && !b4) {
                        break Label_1124;
                    }
                }
                return;
            }
        }
        this.q(ack);
    }
    
    public final void f(aco a, int i) {
        final int d = a.d;
        if (d == -1) {
            a.d(this, (float)i);
            for (i = 0; i < this.d + 1; ++i) {
                a = ((aco[])this.j.c)[i];
            }
            return;
        }
        if (d == -1) {
            final ack a2 = this.a();
            a2.a = a;
            final float n = (float)i;
            a.f = n;
            a2.b = n;
            a2.d = true;
            this.e(a2);
            return;
        }
        final ack ack = this.e[d];
        if (ack.d) {
            ack.b = (float)i;
            return;
        }
        if (ack.e.a == 0) {
            ack.d = true;
            ack.b = (float)i;
            return;
        }
        final ack a3 = this.a();
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
    
    public final void g(final aco aco, final aco aco2, final int n, final int n2) {
        final ack a = this.a();
        final aco c = this.c();
        c.e = 0;
        a.h(aco, aco2, c, n);
        if (n2 != 8) {
            this.i(a, (int)(-a.e.a(c)), n2);
        }
        this.e(a);
    }
    
    public final void h(final aco aco, final aco aco2, final int n, final int n2) {
        final ack a = this.a();
        final aco c = this.c();
        c.e = 0;
        a.i(aco, aco2, c, n);
        if (n2 != 8) {
            this.i(a, (int)(-a.e.a(c)), n2);
        }
        this.e(a);
    }
    
    final void i(final ack ack, final int n, final int n2) {
        ack.e.g(this.p(n2), (float)n);
    }
    
    public final void j() {
        final ack r = this.r;
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
        cdr j;
        while (true) {
            j = this.j;
            final aco[] array = (aco[])j.c;
            if (n >= array.length) {
                break;
            }
            final aco aco = array[n];
            if (aco != null) {
                aco.c();
            }
            ++n;
        }
        final Object a = j.a;
        final aco[] p = this.p;
        final int q = this.q;
        final int length = p.length;
        int n2;
        if ((n2 = q) > length) {
            n2 = length;
        }
        for (final aco aco2 : p) {
            final aasq aasq = (aasq)a;
            final int a2 = aasq.a;
            if (a2 < 256) {
                ((Object[])aasq.b)[a2] = aco2;
                aasq.a = a2 + 1;
            }
        }
        this.q = 0;
        Arrays.fill((Object[])this.j.c, null);
        this.d = 0;
        final acn acn = (acn)this.r;
        acn.f = 0;
        acn.b = 0.0f;
        this.h = 1;
        for (int k = 0; k < this.i; ++k) {
            final ack ack = this.e[k];
        }
        this.t();
        this.i = 0;
        this.s = new ack(this.j, null, null);
    }
    
    final void l(final ack ack) {
        for (int i = 0; i < this.i; ++i) {
            final ack ack2 = this.e[i];
            if (ack2.a.n != 1) {
                if (ack2.b < 0.0f) {
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
                            final ack ack3 = this.e[k];
                            float n6;
                            int n7;
                            int n8;
                            int n9;
                            if (ack3.a.n == 1) {
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
                                if (!ack3.d) {
                                    n6 = n3;
                                    n7 = d;
                                    n8 = n4;
                                    n9 = n5;
                                    if (ack3.b < 0.0f) {
                                        final int a = ack3.e.a;
                                        int n10 = 0;
                                        while (true) {
                                            n6 = n3;
                                            n7 = d;
                                            n8 = n4;
                                            n9 = n5;
                                            if (n10 >= a) {
                                                break;
                                            }
                                            final aco d2 = ack3.e.d(n10);
                                            final float a2 = ack3.e.a(d2);
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
                            }
                            ++k;
                            n3 = n6;
                            d = n7;
                            n4 = n8;
                            n5 = n9;
                        }
                        boolean b;
                        if (d != -1) {
                            final ack ack4 = this.e[d];
                            ack4.a.d = -1;
                            ack4.b(((aco[])this.j.c)[n4]);
                            final aco a3 = ack4.a;
                            a3.d = d;
                            a3.e(this, ack4);
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
        this.u(ack);
        this.r();
    }
    
    public final void m(final aco aco, final aco aco2, int n, int n2) {
        int n3 = n2;
        if (n2 == 8) {
            if (aco2.g && aco.d == -1) {
                aco.d(this, aco2.f + n);
                return;
            }
            n3 = 8;
        }
        final ack a = this.a();
        Label_0132: {
            if (n != 0) {
                if (n < 0) {
                    n = -n;
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                a.b = (float)n;
                if (n2 != 0) {
                    a.e.g(aco, 1.0f);
                    a.e.g(aco2, -1.0f);
                    break Label_0132;
                }
            }
            a.e.g(aco, -1.0f);
            a.e.g(aco2, 1.0f);
        }
        if (n3 != 8) {
            a.f(this, n3);
        }
        this.e(a);
    }
    
    public final void n(final aco aco, final aco aco2, final aco aco3, final aco aco4, final float n) {
        final ack a = this.a();
        a.g(aco, aco2, aco3, aco4, n);
        this.e(a);
    }
    
    public final aco p(final int e) {
        if (this.h + 1 >= this.m) {
            this.s();
        }
        final aco v = this.v(4);
        final int n = this.d + 1;
        this.d = n;
        ++this.h;
        v.c = n;
        v.e = e;
        ((aco[])this.j.c)[n] = v;
        final acn acn = (acn)this.r;
        final acm g = acn.g;
        g.a = v;
        Arrays.fill(g.a.i, 0.0f);
        v.i[v.e] = 1.0f;
        acn.m(v);
        return v;
    }
}
