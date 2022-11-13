import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class add
{
    public final act a;
    public boolean b;
    public boolean c;
    public final act d;
    public final ArrayList e;
    final ArrayList f;
    public ads g;
    private final ada h;
    
    public add(final act act) {
        this.b = true;
        this.c = true;
        this.e = new ArrayList();
        new ArrayList();
        this.g = null;
        this.h = new ada();
        this.f = new ArrayList();
        this.a = act;
        this.d = act;
    }
    
    private final void e(final adn adn, final int n, final ArrayList list) {
        for (final adc adc : adn.i.j) {
            if (adc instanceof ade) {
                this.g((ade)adc, n, adn.j, list, null);
            }
            else {
                if (!(adc instanceof adn)) {
                    continue;
                }
                this.g(((adn)adc).i, n, adn.j, list, null);
            }
        }
        for (final adc adc2 : adn.j.j) {
            if (adc2 instanceof ade) {
                this.g((ade)adc2, n, adn.i, list, null);
            }
            else {
                if (!(adc2 instanceof adn)) {
                    continue;
                }
                this.g(((adn)adc2).j, n, adn.i, list, null);
            }
        }
        if (n == 1) {
            for (final adc adc3 : ((adl)adn).a.j) {
                if (adc3 instanceof ade) {
                    this.g((ade)adc3, 1, null, list, null);
                }
            }
        }
    }
    
    private final void f(final acs acs, final int i, final int a, final int j, final int b) {
        final ada h = this.h;
        h.i = i;
        h.j = j;
        h.a = a;
        h.b = b;
        this.g.a(acs, h);
        acs.C(this.h.c);
        acs.x(this.h.d);
        final ada h2 = this.h;
        acs.F = h2.f;
        acs.u(h2.e);
    }
    
    private final void g(final ade ade, final int n, final ade ade2, final ArrayList list, adk adk) {
        final adn d = ade.d;
        if (d.e != null) {
            return;
        }
        final act a = this.a;
        if (d == a.h) {
            return;
        }
        if (d == a.i) {
            return;
        }
        adk e;
        if ((e = adk) == null) {
            e = new adk(d);
            list.add(e);
        }
        d.e = e;
        e.c.add(d);
        for (final adc adc : d.i.j) {
            if (adc instanceof ade) {
                this.g((ade)adc, n, ade2, list, e);
            }
        }
        for (final adc adc2 : d.j.j) {
            if (adc2 instanceof ade) {
                this.g((ade)adc2, n, ade2, list, e);
            }
        }
        if (n == 1 && d instanceof adl) {
            for (final adc adc3 : ((adl)d).a.j) {
                if (adc3 instanceof ade) {
                    this.g((ade)adc3, 1, ade2, list, e);
                }
            }
        }
        final Iterator iterator4 = d.i.k.iterator();
        while (iterator4.hasNext()) {
            this.g((ade)iterator4.next(), n, ade2, list, e);
        }
        adk = (adk)d.j.k.iterator();
        while (((Iterator)adk).hasNext()) {
            this.g(((Iterator<ade>)adk).next(), n, ade2, list, e);
        }
        if (n != 1 || !(d instanceof adl)) {
            return;
        }
        adk = (adk)((adl)d).a.k.iterator();
        while (true) {
            if (!((Iterator)adk).hasNext()) {
                return;
            }
            final ade ade3 = ((Iterator<ade>)adk).next();
            try {
                this.g(ade3, 1, ade2, list, e);
                continue;
            }
            finally {
                while (true) {}
            }
            break;
        }
    }
    
    public final int a(final act act, final int n) {
        final int size = this.f.size();
        int i = 0;
        long max = 0L;
        while (i < size) {
            final adk adk = this.f.get(i);
            final adn b = adk.b;
            long n2 = 0L;
            Label_0575: {
                Label_0095: {
                    if (b instanceof adb) {
                        if (((adb)b).g == n) {
                            break Label_0095;
                        }
                    }
                    else if (n == 0) {
                        if (b instanceof adj) {
                            break Label_0095;
                        }
                    }
                    else if (b instanceof adl) {
                        break Label_0095;
                    }
                    n2 = 0L;
                    break Label_0575;
                }
                ade ade;
                if (n == 0) {
                    ade = act.h.i;
                }
                else {
                    ade = act.i.i;
                }
                ade ade2;
                if (n == 0) {
                    ade2 = act.h.j;
                }
                else {
                    ade2 = act.i.j;
                }
                final boolean contains = b.i.k.contains(ade);
                final boolean contains2 = adk.b.j.k.contains(ade2);
                final long a = adk.b.a();
                if (contains && contains2) {
                    final long b2 = adk.b(adk.b.i, 0L);
                    final long a2 = adk.a(adk.b.j, 0L);
                    final long n3 = b2 - a;
                    final adn b3 = adk.b;
                    final int e = b3.j.e;
                    long n4 = n3;
                    if (n3 >= -e) {
                        n4 = n3 + e;
                    }
                    final long n5 = -a2;
                    final long n6 = b3.i.e;
                    long n8;
                    final long n7 = n8 = n5 - a - n6;
                    if (n7 >= n6) {
                        n8 = n7 - n6;
                    }
                    final acs d = b3.d;
                    float n9;
                    if (n == 0) {
                        n9 = d.ae;
                    }
                    else {
                        n9 = d.af;
                    }
                    long n10;
                    if (n9 > 0.0f) {
                        n10 = (long)(n8 / n9 + n4 / (1.0f - n9));
                    }
                    else {
                        n10 = 0L;
                    }
                    final float n11 = (float)n10;
                    n2 = n6 + ((long)(n11 * n9 + 0.5f) + a + (long)(n11 * (1.0f - n9) + 0.5f)) - e;
                }
                else if (contains) {
                    final ade j = adk.b.i;
                    n2 = Math.max(adk.b(j, (long)j.e), adk.b.i.e + a);
                }
                else if (contains2) {
                    final ade k = adk.b.j;
                    n2 = Math.max(-adk.a(k, (long)k.e), -adk.b.j.e + a);
                }
                else {
                    final adn b4 = adk.b;
                    n2 = b4.i.e + b4.a() - adk.b.j.e;
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
        HashSet<adb> set = null;
        HashSet<adb> set2;
        for (int i = 0; i < size; ++i, set = set2) {
            final acs acs = (acs)ai.get(i);
            if (acs instanceof acv) {
                e.add(new adh(acs));
                set2 = set;
            }
            else {
                if (acs.H()) {
                    if (acs.f == null) {
                        acs.f = new adb(acs, 0);
                    }
                    HashSet<adb> set3;
                    if ((set3 = set) == null) {
                        set3 = new HashSet<adb>();
                    }
                    set3.add(acs.f);
                    set = set3;
                }
                else {
                    e.add(acs.h);
                }
                if (acs.I()) {
                    if (acs.g == null) {
                        acs.g = new adb(acs, 1);
                    }
                    HashSet<adb> set4;
                    if ((set4 = set) == null) {
                        set4 = new HashSet<adb>();
                    }
                    set4.add(acs.g);
                    set = set4;
                }
                else {
                    e.add(acs.i);
                }
                set2 = set;
                if (acs instanceof acw) {
                    e.add(new adi(acs));
                    set2 = set;
                }
            }
        }
        if (set != null) {
            e.addAll(set);
        }
        for (int size2 = e.size(), j = 0; j < size2; ++j) {
            ((adn)e.get(j)).d();
        }
        for (int size3 = e.size(), k = 0; k < size3; ++k) {
            final adn adn = (adn)e.get(k);
            if (adn.d != this.d) {
                adn.b();
            }
        }
        this.f.clear();
        adk.a = 0;
        this.e((adn)this.a.h, 0, this.f);
        this.e((adn)this.a.i, 1, this.f);
        this.b = false;
    }
    
    public final void c() {
        final ArrayList ai = this.a.aI;
        for (int size = ai.size(), i = 0; i < size; ++i) {
            final acs acs = (acs)ai.get(i);
            if (!acs.e) {
                final int[] aq = acs.aq;
                int n = aq[0];
                final int n2 = aq[1];
                final int s = acs.s;
                final int t = acs.t;
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
                final adf f = acs.h.f;
                final boolean j = f.i;
                final adf f2 = acs.i.f;
                final boolean k = f2.i;
                if (j && k) {
                    this.f(acs, 1, f.f, 1, f2.f);
                    acs.e = true;
                }
                else if (j && n3 != 0) {
                    this.f(acs, 1, f.f, 2, f2.f);
                    if (n4 == 3) {
                        acs.i.f.m = acs.h();
                    }
                    else {
                        acs.i.f.c(acs.h());
                        acs.e = true;
                    }
                }
                else if (k && b) {
                    this.f(acs, 2, f.f, 1, f2.f);
                    if (n == 3) {
                        acs.h.f.m = acs.j();
                    }
                    else {
                        acs.h.f.c(acs.j());
                        acs.e = true;
                    }
                }
                if (acs.e) {
                    final adf b2 = acs.i.b;
                    if (b2 != null) {
                        b2.c(acs.ab);
                    }
                }
            }
        }
    }
    
    public final void d(final act act) {
        final ArrayList ai = act.aI;
        for (int size = ai.size(), i = 0; i < size; ++i) {
            final acs acs = (acs)ai.get(i);
            final int[] aq = acs.aq;
            final int n = aq[0];
            final int n2 = aq[1];
            if (acs.ah == 8) {
                acs.e = true;
            }
            else {
                final float x = acs.x;
                final int n3 = 2;
                int n4 = n;
                if (x < 1.0f && (n4 = n) == 3) {
                    acs.s = 2;
                    n4 = 3;
                }
                final float a = acs.A;
                int k = n2;
                if (a < 1.0f && (k = n2) == 3) {
                    acs.t = 2;
                    k = 3;
                }
                if (acs.X > 0.0f) {
                    if (n4 == 3 && (k == 2 || k == 1)) {
                        acs.s = 3;
                    }
                    else if (k == 3 && (n4 == 2 || n4 == 1)) {
                        acs.t = 3;
                    }
                    else if (n4 == 3 && k == 3) {
                        if (acs.s == 0) {
                            acs.s = 3;
                        }
                        if (acs.t == 0) {
                            acs.t = 3;
                        }
                    }
                }
                int j = 0;
                Label_0306: {
                    if ((j = n4) == 3) {
                        j = n4;
                        if (acs.s == 1) {
                            if (acs.J.e != null) {
                                j = n4;
                                if (acs.L.e != null) {
                                    break Label_0306;
                                }
                            }
                            j = 2;
                        }
                    }
                }
                if (k == 3 && acs.t == 1 && (acs.K.e == null || acs.M.e == null)) {
                    k = 2;
                }
                final adj h = acs.h;
                h.k = j;
                final int s = acs.s;
                h.c = s;
                final adl l = acs.i;
                l.k = k;
                final int t = acs.t;
                l.c = t;
                int n6 = 0;
                Label_0467: {
                    int n5;
                    if ((n5 = j) != 4 && (n5 = j) != 1) {
                        if ((n6 = j) != 2) {
                            break Label_0467;
                        }
                        n5 = 2;
                    }
                    int n7;
                    if (k != 4 && k != 1) {
                        n6 = n5;
                        if (k != 2) {
                            break Label_0467;
                        }
                        n7 = n3;
                    }
                    else {
                        n7 = k;
                    }
                    final int m = acs.j();
                    int n8;
                    int n9;
                    if (n5 == 4) {
                        n8 = ((acs)act).j() - acs.J.f - acs.L.f;
                        n9 = 1;
                    }
                    else {
                        n9 = n5;
                        n8 = m;
                    }
                    final int h2 = acs.h();
                    int n10;
                    int n11;
                    if (n7 == 4) {
                        n10 = ((acs)act).h() - acs.K.f - acs.M.f;
                        n11 = 1;
                    }
                    else {
                        n11 = n7;
                        n10 = h2;
                    }
                    this.f(acs, n9, n8, n11, n10);
                    acs.h.f.c(acs.j());
                    acs.i.f.c(acs.h());
                    acs.e = true;
                    continue;
                }
                if (n6 == 3 && (k == 2 || k == 1)) {
                    if (s == 3) {
                        if (k == 2) {
                            this.f(acs, 2, 0, 2, 0);
                        }
                        final int h3 = acs.h();
                        this.f(acs, 1, (int)(h3 * acs.X + 0.5f), 1, h3);
                        acs.h.f.c(acs.j());
                        acs.i.f.c(acs.h());
                        acs.e = true;
                        continue;
                    }
                    if (s == 1) {
                        this.f(acs, 2, 0, k, 0);
                        acs.h.f.m = acs.j();
                        continue;
                    }
                    if (s == 2) {
                        final int n12 = act.aq[0];
                        if (n12 == 1 || n12 == 4) {
                            this.f(acs, 1, (int)(x * ((acs)act).j() + 0.5f), k, acs.h());
                            acs.h.f.c(acs.j());
                            acs.i.f.c(acs.h());
                            acs.e = true;
                            continue;
                        }
                    }
                    else {
                        final acr[] r = acs.R;
                        if (r[0].e == null || r[1].e == null) {
                            this.f(acs, 2, 0, k, 0);
                            acs.h.f.c(acs.j());
                            acs.i.f.c(acs.h());
                            acs.e = true;
                            continue;
                        }
                    }
                }
                if (k == 3 && (n6 == 2 || n6 == 1)) {
                    if (t == 3) {
                        if (n6 == 2) {
                            this.f(acs, 2, 0, 2, 0);
                        }
                        final int j2 = acs.j();
                        float x2 = acs.X;
                        if (acs.Y == -1) {
                            x2 = 1.0f / x2;
                        }
                        this.f(acs, 1, j2, 1, (int)(j2 * x2 + 0.5f));
                        acs.h.f.c(acs.j());
                        acs.i.f.c(acs.h());
                        acs.e = true;
                        continue;
                    }
                    if (t == 1) {
                        this.f(acs, n6, 0, 2, 0);
                        acs.i.f.m = acs.h();
                        continue;
                    }
                    if (t == 2) {
                        final int n13 = act.aq[1];
                        if (n13 == 1 || n13 == 4) {
                            this.f(acs, n6, acs.j(), 1, (int)(a * ((acs)act).h() + 0.5f));
                            acs.h.f.c(acs.j());
                            acs.i.f.c(acs.h());
                            acs.e = true;
                            continue;
                        }
                    }
                    else {
                        final acr[] r2 = acs.R;
                        if (r2[2].e == null || r2[3].e == null) {
                            this.f(acs, 2, 0, 3, 0);
                            acs.h.f.c(acs.j());
                            acs.i.f.c(acs.h());
                            acs.e = true;
                            continue;
                        }
                    }
                }
                if (n6 == 3 && k == 3) {
                    if (s != 1 && t != 1) {
                        if (t == 2 && s == 2) {
                            final int[] aq2 = act.aq;
                            if (aq2[0] == 1 && aq2[1] == 1) {
                                this.f(acs, 1, (int)(x * ((acs)act).j() + 0.5f), 1, (int)(a * ((acs)act).h() + 0.5f));
                                acs.h.f.c(acs.j());
                                acs.i.f.c(acs.h());
                                acs.e = true;
                            }
                        }
                    }
                    else {
                        this.f(acs, 2, 0, 2, 0);
                        acs.h.f.m = acs.j();
                        acs.i.f.m = acs.h();
                    }
                }
            }
        }
    }
}
