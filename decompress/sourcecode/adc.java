import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adc
{
    public final acs a;
    public boolean b;
    public boolean c;
    public final acs d;
    public final ArrayList e;
    final ArrayList f;
    public adr g;
    private final acz h;
    
    public adc(final acs acs) {
        this.b = true;
        this.c = true;
        this.e = new ArrayList();
        new ArrayList();
        this.g = null;
        this.h = new acz();
        this.f = new ArrayList();
        this.a = acs;
        this.d = acs;
    }
    
    private final void e(final adm adm, final int n, final ArrayList list) {
        for (final adb adb : adm.i.j) {
            if (adb instanceof add) {
                this.g((add)adb, n, adm.j, list, null);
            }
            else {
                if (!(adb instanceof adm)) {
                    continue;
                }
                this.g(((adm)adb).i, n, adm.j, list, null);
            }
        }
        for (final adb adb2 : adm.j.j) {
            if (adb2 instanceof add) {
                this.g((add)adb2, n, adm.i, list, null);
            }
            else {
                if (!(adb2 instanceof adm)) {
                    continue;
                }
                this.g(((adm)adb2).j, n, adm.i, list, null);
            }
        }
        if (n == 1) {
            for (final adb adb3 : ((adk)adm).a.j) {
                if (adb3 instanceof add) {
                    this.g((add)adb3, 1, null, list, null);
                }
            }
        }
    }
    
    private final void f(final acr acr, final int i, final int a, final int j, final int b) {
        final acz h = this.h;
        h.i = i;
        h.j = j;
        h.a = a;
        h.b = b;
        this.g.a(acr, h);
        acr.C(this.h.c);
        acr.x(this.h.d);
        final acz h2 = this.h;
        acr.F = h2.f;
        acr.u(h2.e);
    }
    
    private final void g(final add add, final int n, final add add2, final ArrayList list, adj adj) {
        final adm d = add.d;
        if (d.e != null) {
            return;
        }
        final acs a = this.a;
        if (d == a.h) {
            return;
        }
        if (d == a.i) {
            return;
        }
        adj e;
        if ((e = adj) == null) {
            e = new adj(d);
            list.add(e);
        }
        d.e = e;
        e.c.add(d);
        for (final adb adb : d.i.j) {
            if (adb instanceof add) {
                this.g((add)adb, n, add2, list, e);
            }
        }
        for (final adb adb2 : d.j.j) {
            if (adb2 instanceof add) {
                this.g((add)adb2, n, add2, list, e);
            }
        }
        if (n == 1 && d instanceof adk) {
            for (final adb adb3 : ((adk)d).a.j) {
                if (adb3 instanceof add) {
                    this.g((add)adb3, 1, add2, list, e);
                }
            }
        }
        final Iterator iterator4 = d.i.k.iterator();
        while (iterator4.hasNext()) {
            this.g((add)iterator4.next(), n, add2, list, e);
        }
        adj = (adj)d.j.k.iterator();
        while (((Iterator)adj).hasNext()) {
            this.g(((Iterator<add>)adj).next(), n, add2, list, e);
        }
        if (n != 1 || !(d instanceof adk)) {
            return;
        }
        adj = (adj)((adk)d).a.k.iterator();
        while (true) {
            if (!((Iterator)adj).hasNext()) {
                return;
            }
            final add add3 = ((Iterator<add>)adj).next();
            try {
                this.g(add3, 1, add2, list, e);
                continue;
            }
            finally {
                while (true) {}
            }
            break;
        }
    }
    
    public final int a(final acs acs, final int n) {
        final int size = this.f.size();
        int i = 0;
        long max = 0L;
        while (i < size) {
            final adj adj = this.f.get(i);
            final adm b = adj.b;
            long n2 = 0L;
            Label_0567: {
                Label_0096: {
                    if (b instanceof ada) {
                        if (((ada)b).g == n) {
                            break Label_0096;
                        }
                    }
                    else if (n == 0) {
                        if (b instanceof adi) {
                            break Label_0096;
                        }
                    }
                    else if (b instanceof adk) {
                        break Label_0096;
                    }
                    n2 = 0L;
                    break Label_0567;
                }
                add add;
                if (n == 0) {
                    add = acs.h.i;
                }
                else {
                    add = acs.i.i;
                }
                add add2;
                if (n == 0) {
                    add2 = acs.h.j;
                }
                else {
                    add2 = acs.i.j;
                }
                final boolean contains = b.i.k.contains(add);
                final boolean contains2 = adj.b.j.k.contains(add2);
                final long a = adj.b.a();
                if (contains && contains2) {
                    final long b2 = adj.b(adj.b.i, 0L);
                    final long a2 = adj.a(adj.b.j, 0L);
                    final long n3 = b2 - a;
                    final adm b3 = adj.b;
                    final int e = b3.j.e;
                    long n4 = n3;
                    if (n3 >= -e) {
                        n4 = n3 + e;
                    }
                    final long n5 = b3.i.e;
                    long n7;
                    final long n6 = n7 = -a2 - a - n5;
                    if (n6 >= n5) {
                        n7 = n6 - n5;
                    }
                    final acr d = b3.d;
                    float n8;
                    if (n == 0) {
                        n8 = d.ae;
                    }
                    else {
                        n8 = d.af;
                    }
                    long n9;
                    if (n8 > 0.0f) {
                        n9 = (long)(n7 / n8 + n4 / (1.0f - n8));
                    }
                    else {
                        n9 = 0L;
                    }
                    final float n10 = (float)n9;
                    n2 = n5 + ((long)(n10 * n8 + 0.5f) + a + (long)(n10 * (1.0f - n8) + 0.5f)) - e;
                }
                else if (contains) {
                    final add j = adj.b.i;
                    n2 = Math.max(adj.b(j, (long)j.e), adj.b.i.e + a);
                }
                else if (contains2) {
                    final add k = adj.b.j;
                    n2 = Math.max(-adj.a(k, (long)k.e), -adj.b.j.e + a);
                }
                else {
                    final adm b4 = adj.b;
                    n2 = b4.i.e + b4.a() - adj.b.j.e;
                }
            }
            max = Math.max(max, n2);
            ++i;
        }
        return (int)max;
    }
    
    public final void b() {
        final ArrayList e = this.e;
        e.clear();
        this.d.h.d();
        this.d.i.d();
        e.add(this.d.h);
        e.add(this.d.i);
        final ArrayList ai = this.d.aI;
        final int size = ai.size();
        HashSet<ada> set = null;
        HashSet<ada> set2;
        for (int i = 0; i < size; ++i, set = set2) {
            final acr acr = (acr)ai.get(i);
            if (acr instanceof acu) {
                e.add(new adg(acr));
                set2 = set;
            }
            else {
                if (acr.H()) {
                    if (acr.f == null) {
                        acr.f = new ada(acr, 0);
                    }
                    HashSet<ada> set3;
                    if ((set3 = set) == null) {
                        set3 = new HashSet<ada>();
                    }
                    set3.add(acr.f);
                    set = set3;
                }
                else {
                    e.add(acr.h);
                }
                if (acr.I()) {
                    if (acr.g == null) {
                        acr.g = new ada(acr, 1);
                    }
                    HashSet<ada> set4;
                    if ((set4 = set) == null) {
                        set4 = new HashSet<ada>();
                    }
                    set4.add(acr.g);
                    set = set4;
                }
                else {
                    e.add(acr.i);
                }
                set2 = set;
                if (acr instanceof acv) {
                    e.add(new adh(acr));
                    set2 = set;
                }
            }
        }
        if (set != null) {
            e.addAll(set);
        }
        for (int size2 = e.size(), j = 0; j < size2; ++j) {
            ((adm)e.get(j)).d();
        }
        for (int size3 = e.size(), k = 0; k < size3; ++k) {
            final adm adm = (adm)e.get(k);
            if (adm.d != this.d) {
                adm.b();
            }
        }
        this.f.clear();
        adj.a = 0;
        this.e(this.a.h, 0, this.f);
        this.e(this.a.i, 1, this.f);
        this.b = false;
    }
    
    public final void c() {
        final ArrayList ai = this.a.aI;
        for (int size = ai.size(), i = 0; i < size; ++i) {
            final acr acr = (acr)ai.get(i);
            if (!acr.e) {
                final int[] aq = acr.aq;
                int n = aq[0];
                final int n2 = aq[1];
                final int s = acr.s;
                final int t = acr.t;
                boolean b;
                if (n != 2) {
                    if (n == 3) {
                        b = (s == 1);
                        n = 3;
                    }
                    else {
                        b = false;
                    }
                }
                else {
                    b = true;
                }
                int n3;
                int n4;
                if (n2 != 2) {
                    if (n2 == 3) {
                        if (t == 1) {
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        n4 = 3;
                    }
                    else {
                        n4 = n2;
                        n3 = 0;
                    }
                }
                else {
                    final int n5 = 1;
                    n4 = n2;
                    n3 = n5;
                }
                final ade f = acr.h.f;
                final boolean j = f.i;
                final ade f2 = acr.i.f;
                final boolean k = f2.i;
                if (j && k) {
                    this.f(acr, 1, f.f, 1, f2.f);
                    acr.e = true;
                }
                else if (j && n3 != 0) {
                    this.f(acr, 1, f.f, 2, f2.f);
                    if (n4 == 3) {
                        acr.i.f.m = acr.h();
                    }
                    else {
                        acr.i.f.c(acr.h());
                        acr.e = true;
                    }
                }
                else if (k && b) {
                    this.f(acr, 2, f.f, 1, f2.f);
                    if (n == 3) {
                        acr.h.f.m = acr.j();
                    }
                    else {
                        acr.h.f.c(acr.j());
                        acr.e = true;
                    }
                }
                if (acr.e) {
                    final ade b2 = acr.i.b;
                    if (b2 != null) {
                        b2.c(acr.ab);
                    }
                }
            }
        }
    }
    
    public final void d(final acs acs) {
        final ArrayList ai = acs.aI;
        for (int size = ai.size(), i = 0; i < size; ++i) {
            final acr acr = (acr)ai.get(i);
            final int[] aq = acr.aq;
            final int n = aq[0];
            final int n2 = aq[1];
            if (acr.ah == 8) {
                acr.e = true;
            }
            else {
                final float x = acr.x;
                final int n3 = 2;
                int n4 = n;
                if (x < 1.0f && (n4 = n) == 3) {
                    acr.s = 2;
                    n4 = 3;
                }
                final float a = acr.A;
                int k = n2;
                if (a < 1.0f && (k = n2) == 3) {
                    acr.t = 2;
                    k = 3;
                }
                if (acr.X > 0.0f) {
                    if (n4 == 3 && (k == 2 || k == 1)) {
                        acr.s = 3;
                    }
                    else if (k == 3 && (n4 == 2 || n4 == 1)) {
                        acr.t = 3;
                    }
                    else if (n4 == 3 && k == 3) {
                        if (acr.s == 0) {
                            acr.s = 3;
                        }
                        if (acr.t == 0) {
                            acr.t = 3;
                        }
                    }
                }
                int j = 0;
                Label_0305: {
                    if ((j = n4) == 3) {
                        j = n4;
                        if (acr.s == 1) {
                            if (acr.J.e != null) {
                                j = n4;
                                if (acr.L.e != null) {
                                    break Label_0305;
                                }
                            }
                            j = 2;
                        }
                    }
                }
                if (k == 3 && acr.t == 1 && (acr.K.e == null || acr.M.e == null)) {
                    k = 2;
                }
                final adi h = acr.h;
                h.k = j;
                final int s = acr.s;
                h.c = s;
                final adk l = acr.i;
                l.k = k;
                final int t = acr.t;
                l.c = t;
                int n6 = 0;
                Label_0466: {
                    int n5;
                    if ((n5 = j) != 4 && (n5 = j) != 1) {
                        if ((n6 = j) != 2) {
                            break Label_0466;
                        }
                        n5 = 2;
                    }
                    int n7;
                    if (k != 4 && k != 1) {
                        n6 = n5;
                        if (k != 2) {
                            break Label_0466;
                        }
                        n7 = n3;
                    }
                    else {
                        n7 = k;
                    }
                    final int m = acr.j();
                    int n8;
                    int n9;
                    if (n5 == 4) {
                        n8 = acs.j() - acr.J.f - acr.L.f;
                        n9 = 1;
                    }
                    else {
                        n9 = n5;
                        n8 = m;
                    }
                    final int h2 = acr.h();
                    int n10;
                    int n11;
                    if (n7 == 4) {
                        n10 = acs.h() - acr.K.f - acr.M.f;
                        n11 = 1;
                    }
                    else {
                        n11 = n7;
                        n10 = h2;
                    }
                    this.f(acr, n9, n8, n11, n10);
                    acr.h.f.c(acr.j());
                    acr.i.f.c(acr.h());
                    acr.e = true;
                    continue;
                }
                if (n6 == 3 && (k == 2 || k == 1)) {
                    if (s == 3) {
                        if (k == 2) {
                            this.f(acr, 2, 0, 2, 0);
                        }
                        final int h3 = acr.h();
                        this.f(acr, 1, (int)(h3 * acr.X + 0.5f), 1, h3);
                        acr.h.f.c(acr.j());
                        acr.i.f.c(acr.h());
                        acr.e = true;
                        continue;
                    }
                    if (s == 1) {
                        this.f(acr, 2, 0, k, 0);
                        acr.h.f.m = acr.j();
                        continue;
                    }
                    if (s == 2) {
                        final int n12 = acs.aq[0];
                        if (n12 == 1 || n12 == 4) {
                            this.f(acr, 1, (int)(x * acs.j() + 0.5f), k, acr.h());
                            acr.h.f.c(acr.j());
                            acr.i.f.c(acr.h());
                            acr.e = true;
                            continue;
                        }
                    }
                    else {
                        final acq[] r = acr.R;
                        if (r[0].e == null || r[1].e == null) {
                            this.f(acr, 2, 0, k, 0);
                            acr.h.f.c(acr.j());
                            acr.i.f.c(acr.h());
                            acr.e = true;
                            continue;
                        }
                    }
                }
                if (k == 3 && (n6 == 2 || n6 == 1)) {
                    if (t == 3) {
                        if (n6 == 2) {
                            this.f(acr, 2, 0, 2, 0);
                        }
                        final int j2 = acr.j();
                        float x2 = acr.X;
                        if (acr.Y == -1) {
                            x2 = 1.0f / x2;
                        }
                        this.f(acr, 1, j2, 1, (int)(j2 * x2 + 0.5f));
                        acr.h.f.c(acr.j());
                        acr.i.f.c(acr.h());
                        acr.e = true;
                        continue;
                    }
                    if (t == 1) {
                        this.f(acr, n6, 0, 2, 0);
                        acr.i.f.m = acr.h();
                        continue;
                    }
                    if (t == 2) {
                        final int n13 = acs.aq[1];
                        if (n13 == 1 || n13 == 4) {
                            this.f(acr, n6, acr.j(), 1, (int)(a * acs.h() + 0.5f));
                            acr.h.f.c(acr.j());
                            acr.i.f.c(acr.h());
                            acr.e = true;
                            continue;
                        }
                    }
                    else {
                        final acq[] r2 = acr.R;
                        if (r2[2].e == null || r2[3].e == null) {
                            this.f(acr, 2, 0, 3, 0);
                            acr.h.f.c(acr.j());
                            acr.i.f.c(acr.h());
                            acr.e = true;
                            continue;
                        }
                    }
                }
                if (n6 == 3 && k == 3) {
                    if (s != 1 && t != 1) {
                        if (t == 2 && s == 2) {
                            final int[] aq2 = acs.aq;
                            if (aq2[0] == 1 && aq2[1] == 1) {
                                this.f(acr, 1, (int)(x * acs.j() + 0.5f), 1, (int)(a * acs.h() + 0.5f));
                                acr.h.f.c(acr.j());
                                acr.i.f.c(acr.h());
                                acr.e = true;
                            }
                        }
                    }
                    else {
                        this.f(acr, 2, 0, 2, 0);
                        acr.h.f.m = acr.j();
                        acr.i.f.m = acr.h();
                    }
                }
            }
        }
    }
}
