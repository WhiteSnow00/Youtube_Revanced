import java.util.Iterator;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adg
{
    public static final ada a;
    public static int b;
    public static int c;
    
    static {
        a = new ada();
        adg.b = 0;
        adg.c = 0;
    }
    
    public static void a(final int n, final acs acs, final ads ads, final boolean b) {
        if (acs.n) {
            return;
        }
        ++adg.b;
        if (!(acs instanceof act) && acs.J() && c(acs)) {
            act.X(acs, ads, new ada());
        }
        final acr k = acs.K(2);
        final acr i = acs.K(4);
        final int a = k.a();
        final int a2 = i.a();
        final HashSet a3 = k.a;
        if (a3 != null && k.c) {
        Label_0211_Outer:
            for (final acr acr : a3) {
                final acs d = acr.d;
                final int n2 = n + 1;
                final boolean c = c(d);
                if (d.J() && c) {
                    act.X(d, ads, new ada());
                }
                final acr j = d.J;
                boolean b2 = false;
                Label_0253: {
                    while (true) {
                        Label_0217: {
                            if (acr != j) {
                                break Label_0217;
                            }
                            final acr e = d.L.e;
                            if (e == null) {
                                break Label_0217;
                            }
                            if (!e.c) {
                                break Label_0217;
                            }
                            b2 = true;
                            break Label_0253;
                        }
                        if (acr == d.L) {
                            final acr e2 = j.e;
                            if (e2 != null && e2.c) {
                                continue;
                            }
                        }
                        break;
                    }
                    b2 = false;
                }
                if (d.M() == 3 && !c) {
                    if (d.M() != 3 || d.w < 0 || d.v < 0 || (d.ah != 8 && (d.s != 0 || d.X != 0.0f)) || d.H() || !b2 || d.H()) {
                        continue Label_0211_Outer;
                    }
                    f(n2, acs, ads, d, b);
                }
                else {
                    if (d.J()) {
                        continue Label_0211_Outer;
                    }
                    final acr l = d.J;
                    if (acr == l && d.L.e == null) {
                        final int n3 = l.b() + a;
                        d.v(n3, d.j() + n3);
                        a(n2, d, ads, b);
                    }
                    else {
                        final acr m = d.L;
                        if (acr == m && l.e == null) {
                            final int n4 = a - m.b();
                            d.v(n4 - d.j(), n4);
                            a(n2, d, ads, b);
                        }
                        else {
                            if (!b2 || d.H()) {
                                continue Label_0211_Outer;
                            }
                            e(n2, ads, d, b);
                        }
                    }
                }
            }
        }
        if (!(acs instanceof acv)) {
            final HashSet a4 = i.a;
            if (a4 != null && i.c) {
            Label_0652_Outer:
                for (final acr acr2 : a4) {
                    final acs d2 = acr2.d;
                    final int n5 = n + 1;
                    final boolean c2 = c(d2);
                    if (d2.J() && c2) {
                        act.X(d2, ads, new ada());
                    }
                    final acr j2 = d2.J;
                    boolean b3 = false;
                    Label_0694: {
                        while (true) {
                            Label_0658: {
                                if (acr2 != j2) {
                                    break Label_0658;
                                }
                                final acr e3 = d2.L.e;
                                if (e3 == null) {
                                    break Label_0658;
                                }
                                if (!e3.c) {
                                    break Label_0658;
                                }
                                b3 = true;
                                break Label_0694;
                            }
                            if (acr2 == d2.L) {
                                final acr e4 = j2.e;
                                if (e4 != null && e4.c) {
                                    continue;
                                }
                            }
                            break;
                        }
                        b3 = false;
                    }
                    if (d2.M() == 3 && !c2) {
                        if (d2.M() != 3 || d2.w < 0 || d2.v < 0 || (d2.ah != 8 && (d2.s != 0 || d2.X != 0.0f)) || d2.H() || !b3 || d2.H()) {
                            continue Label_0652_Outer;
                        }
                        f(n5, acs, ads, d2, b);
                    }
                    else {
                        if (d2.J()) {
                            continue Label_0652_Outer;
                        }
                        final acr j3 = d2.J;
                        if (acr2 == j3 && d2.L.e == null) {
                            final int n6 = j3.b() + a2;
                            d2.v(n6, d2.j() + n6);
                            a(n5, d2, ads, b);
                        }
                        else {
                            final acr l2 = d2.L;
                            if (acr2 == l2 && j3.e == null) {
                                final int n7 = a2 - l2.b();
                                d2.v(n7 - d2.j(), n7);
                                a(n5, d2, ads, b);
                            }
                            else {
                                if (!b3 || d2.H()) {
                                    continue Label_0652_Outer;
                                }
                                e(n5, ads, d2, b);
                            }
                        }
                    }
                }
            }
            acs.n = true;
        }
    }
    
    public static void b(final int n, final acs acs, final ads ads) {
        if (acs.o) {
            return;
        }
        ++adg.c;
        if (!(acs instanceof act) && acs.J() && c(acs)) {
            act.X(acs, ads, new ada());
        }
        final acr k = acs.K(3);
        Object o = acs.K(5);
        final int a = k.a();
        int n2 = ((acr)o).a();
        final HashSet a2 = k.a;
        if (a2 != null && k.c) {
        Label_0211_Outer:
            for (final acr acr : a2) {
                final acs d = acr.d;
                final int n3 = n + 1;
                final boolean c = c(d);
                if (d.J() && c) {
                    act.X(d, ads, new ada());
                }
                final acr i = d.K;
                boolean b = false;
                Label_0251: {
                    while (true) {
                        Label_0216: {
                            if (acr != i) {
                                break Label_0216;
                            }
                            final acr e = d.M.e;
                            if (e == null) {
                                break Label_0216;
                            }
                            if (!e.c) {
                                break Label_0216;
                            }
                            b = true;
                            break Label_0251;
                        }
                        if (acr == d.M) {
                            final acr e2 = i.e;
                            if (e2 != null && e2.c) {
                                continue;
                            }
                        }
                        break;
                    }
                    b = false;
                }
                if (d.N() == 3 && !c) {
                    if (d.N() != 3 || d.z < 0 || d.y < 0 || (d.ah != 8 && (d.t != 0 || d.X != 0.0f)) || d.I() || !b || d.I()) {
                        continue Label_0211_Outer;
                    }
                    h(n3, acs, ads, d);
                }
                else {
                    if (d.J()) {
                        continue Label_0211_Outer;
                    }
                    final acr j = d.K;
                    if (acr == j && d.M.e == null) {
                        final int n4 = j.b() + a;
                        d.w(n4, d.h() + n4);
                        b(n3, d, ads);
                    }
                    else {
                        final acr m = d.M;
                        if (acr == m && j.e == null) {
                            final int n5 = a - m.b();
                            d.w(n5 - d.h(), n5);
                            b(n3, d, ads);
                        }
                        else {
                            if (!b || d.I()) {
                                continue Label_0211_Outer;
                            }
                            g(n3, ads, d);
                        }
                    }
                }
            }
        }
        if (acs instanceof acv) {
            return;
        }
        final HashSet a3 = ((acr)o).a;
        if (a3 != null && ((acr)o).c) {
        Label_0638_Outer:
            for (final acr acr2 : a3) {
                final acs d2 = acr2.d;
                final int n6 = n + 1;
                final boolean c2 = c(d2);
                if (d2.J() && c2) {
                    act.X(d2, ads, new ada());
                }
                final acr l = d2.K;
                boolean b2 = false;
                Label_0678: {
                    while (true) {
                        Label_0643: {
                            if (acr2 != l) {
                                break Label_0643;
                            }
                            final acr e3 = d2.M.e;
                            if (e3 == null) {
                                break Label_0643;
                            }
                            if (!e3.c) {
                                break Label_0643;
                            }
                            b2 = true;
                            break Label_0678;
                        }
                        if (acr2 == d2.M) {
                            final acr e4 = l.e;
                            if (e4 != null && e4.c) {
                                continue;
                            }
                        }
                        break;
                    }
                    b2 = false;
                }
                if (d2.N() == 3 && !c2) {
                    if (d2.N() != 3 || d2.z < 0 || d2.y < 0 || (d2.ah != 8 && (d2.t != 0 || d2.X != 0.0f)) || d2.I() || !b2 || d2.I()) {
                        continue Label_0638_Outer;
                    }
                    h(n6, acs, ads, d2);
                }
                else {
                    if (d2.J()) {
                        continue Label_0638_Outer;
                    }
                    final acr k2 = d2.K;
                    if (acr2 == k2 && d2.M.e == null) {
                        final int n7 = k2.b() + n2;
                        d2.w(n7, d2.h() + n7);
                        b(n6, d2, ads);
                    }
                    else {
                        final acr m2 = d2.M;
                        if (acr2 == m2 && k2.e == null) {
                            final int n8 = n2 - m2.b();
                            d2.w(n8 - d2.h(), n8);
                            b(n6, d2, ads);
                        }
                        else {
                            if (!b2 || d2.I()) {
                                continue Label_0638_Outer;
                            }
                            g(n6, ads, d2);
                        }
                    }
                }
            }
        }
        o = acs.K(6);
        Label_1150: {
            if (((acr)o).a == null || !((acr)o).c) {
                break Label_1150;
            }
            n2 = ((acr)o).a();
            while (true) {
                o = ((acr)o).a.iterator();
                Label_1138: {
                    while (((Iterator)o).hasNext()) {
                        final acr acr3 = (acr)((Iterator)o).next();
                        final acs d3 = acr3.d;
                        final boolean c3 = c(d3);
                        if (d3.J() && c3) {
                            act.X(d3, ads, new ada());
                        }
                        if ((d3.N() != 3 || c3) && !d3.J() && acr3 == d3.N) {
                            final int n9 = acr3.b() + n2;
                            if (d3.F) {
                                final int aa = n9 - d3.ab;
                                final int w = d3.W;
                                d3.aa = aa;
                                d3.K.e(aa);
                                d3.M.e(w + aa);
                                d3.N.e(n9);
                                d3.m = true;
                            }
                            break Label_1138;
                        }
                    }
                    break Label_1150;
                    try {
                        final acs d3;
                        b(n + 1, d3, ads);
                        continue;
                        acs.o = true;
                    }
                    finally {
                        while (true) {}
                    }
                }
                break;
            }
        }
    }
    
    public static boolean c(final acs acs) {
        final int m = acs.M();
        final int n = acs.N();
        acs u;
        if ((u = acs.U) == null) {
            u = null;
        }
        if (u != null) {
            u.M();
        }
        if (u != null) {
            u.N();
        }
        int n2 = 0;
        Label_0131: {
            Label_0129: {
                if (m != 1 && !acs.e() && m != 2) {
                    while (true) {
                        Label_0109: {
                            if (m == 3) {
                                if (acs.s != 0 || acs.X != 0.0f) {
                                    break Label_0109;
                                }
                                if (!acs.F(0)) {
                                    break Label_0109;
                                }
                                break Label_0129;
                            }
                            else if (m == 3) {
                                break Label_0109;
                            }
                            n2 = 0;
                            break Label_0131;
                        }
                        if (acs.s != 1 || !acs.G(0, acs.j())) {
                            continue;
                        }
                        break;
                    }
                }
            }
            n2 = 1;
        }
        int n3 = 0;
        Label_0212: {
            Label_0210: {
                if (n != 1 && !acs.f() && n != 2) {
                    while (true) {
                        Label_0190: {
                            if (n == 3) {
                                if (acs.t != 0 || acs.X != 0.0f) {
                                    break Label_0190;
                                }
                                if (!acs.F(1)) {
                                    break Label_0190;
                                }
                                break Label_0210;
                            }
                            else if (n == 3) {
                                break Label_0190;
                            }
                            n3 = 0;
                            break Label_0212;
                        }
                        if (acs.t != 1 || !acs.G(1, acs.h())) {
                            continue;
                        }
                        break;
                    }
                }
            }
            n3 = 1;
        }
        int n4 = n2;
        int n5 = n3;
        if (acs.X > 0.0f) {
            if (n2 || n3) {
                return true;
            }
            n4 = 0;
            n5 = 0;
        }
        return n4 && n5;
    }
    
    public static void d(final acp acp, final ads ads, final int n, final boolean b) {
        if (acp.c()) {
            if (n == 0) {
                a(1, (acs)acp, ads, b);
                return;
            }
            b(1, (acs)acp, ads);
        }
    }
    
    private static void e(final int n, final ads ads, final acs acs, final boolean b) {
        float ae = acs.ae;
        final int a = acs.J.e.a();
        final int a2 = acs.L.e.a();
        int n2 = acs.J.b() + a;
        int n3 = a2 - acs.L.b();
        if (a == a2) {
            n3 = a2;
        }
        if (a == a2) {
            n2 = a;
        }
        if (a == a2) {
            ae = 0.5f;
        }
        final int j = acs.j();
        int n4 = n3 - n2 - j;
        if (n2 > n3) {
            n4 = n2 - n3 - j;
        }
        float n5;
        if (n4 > 0) {
            n5 = ae * n4 + 0.5f;
        }
        else {
            n5 = ae * n4;
        }
        final int n6 = (int)n5 + n2;
        int n7 = n6 + j;
        if (n2 > n3) {
            n7 = n6 - j;
        }
        acs.v(n6, n7);
        a(n + 1, acs, ads, b);
    }
    
    private static void f(final int n, final acs acs, final ads ads, final acs acs2, final boolean b) {
        final float ae = acs2.ae;
        final int n2 = acs2.J.e.a() + acs2.J.b();
        final int n3 = acs2.L.e.a() - acs2.L.b();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = acs2.j();
            if (acs2.ah != 8) {
                final int s = acs2.s;
                int n7;
                if (s == 2) {
                    int n6;
                    if (acs instanceof act) {
                        n6 = acs.j();
                    }
                    else {
                        n6 = acs.U.j();
                    }
                    n7 = (int)(acs2.ae * 0.5f * n6);
                }
                else {
                    n7 = n4;
                    if (s == 0) {
                        n7 = n3 - n2;
                    }
                }
                final int max = Math.max(acs2.v, n7);
                final int w = acs2.w;
                n5 = max;
                if (w > 0) {
                    n5 = Math.min(w, max);
                }
            }
            final int n8 = n2 + (int)(ae * (n3 - n2 - n5) + 0.5f);
            acs2.v(n8, n5 + n8);
            a(n + 1, acs2, ads, b);
        }
    }
    
    private static void g(final int n, final ads ads, final acs acs) {
        float af = acs.af;
        final int a = acs.K.e.a();
        final int a2 = acs.M.e.a();
        int n2 = acs.K.b() + a;
        int n3 = a2 - acs.M.b();
        if (a == a2) {
            n3 = a2;
        }
        if (a == a2) {
            n2 = a;
        }
        if (a == a2) {
            af = 0.5f;
        }
        final int h = acs.h();
        int n4 = n3 - n2 - h;
        if (n2 > n3) {
            n4 = n2 - n3 - h;
        }
        float n5;
        if (n4 > 0) {
            n5 = af * n4 + 0.5f;
        }
        else {
            n5 = af * n4;
        }
        final int n6 = (int)n5;
        int n7 = n2 + n6;
        int n8 = n7 + h;
        if (n2 > n3) {
            n7 = n2 - n6;
            n8 = n7 - h;
        }
        acs.w(n7, n8);
        b(n + 1, acs, ads);
    }
    
    private static void h(final int n, final acs acs, final ads ads, final acs acs2) {
        final float af = acs2.af;
        final int n2 = acs2.K.e.a() + acs2.K.b();
        final int n3 = acs2.M.e.a() - acs2.M.b();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = acs2.h();
            if (acs2.ah != 8) {
                final int t = acs2.t;
                int n7;
                if (t == 2) {
                    int n6;
                    if (acs instanceof act) {
                        n6 = acs.h();
                    }
                    else {
                        n6 = acs.U.h();
                    }
                    n7 = (int)(af * 0.5f * n6);
                }
                else {
                    n7 = n4;
                    if (t == 0) {
                        n7 = n3 - n2;
                    }
                }
                final int max = Math.max(acs2.y, n7);
                final int z = acs2.z;
                n5 = max;
                if (z > 0) {
                    n5 = Math.min(z, max);
                }
            }
            final int n8 = n2 + (int)(af * (n3 - n2 - n5) + 0.5f);
            acs2.w(n8, n5 + n8);
            b(n + 1, acs2, ads);
        }
    }
}
