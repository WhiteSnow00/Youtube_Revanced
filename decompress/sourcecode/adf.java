import java.util.Iterator;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adf
{
    public static final acz a;
    public static int b;
    public static int c;
    
    static {
        a = new acz();
        adf.b = 0;
        adf.c = 0;
    }
    
    public static void a(final int n, final acr acr, final adr adr, final boolean b) {
        if (acr.n) {
            return;
        }
        ++adf.b;
        if (!(acr instanceof acs) && acr.J() && c(acr)) {
            acs.X(acr, adr, new acz());
        }
        final acq k = acr.K(2);
        final acq i = acr.K(4);
        final int a = k.a();
        final int a2 = i.a();
        final HashSet a3 = k.a;
        if (a3 != null && k.c) {
        Label_0211_Outer:
            for (final acq acq : a3) {
                final acr d = acq.d;
                final int n2 = n + 1;
                final boolean c = c(d);
                if (d.J() && c) {
                    acs.X(d, adr, new acz());
                }
                final acq j = d.J;
                boolean b2 = false;
                Label_0253: {
                    while (true) {
                        Label_0217: {
                            if (acq != j) {
                                break Label_0217;
                            }
                            final acq e = d.L.e;
                            if (e == null) {
                                break Label_0217;
                            }
                            if (!e.c) {
                                break Label_0217;
                            }
                            b2 = true;
                            break Label_0253;
                        }
                        if (acq == d.L) {
                            final acq e2 = j.e;
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
                    f(n2, acr, adr, d, b);
                }
                else {
                    if (d.J()) {
                        continue Label_0211_Outer;
                    }
                    final acq l = d.J;
                    if (acq == l && d.L.e == null) {
                        final int n3 = l.b() + a;
                        d.v(n3, d.j() + n3);
                        a(n2, d, adr, b);
                    }
                    else {
                        final acq m = d.L;
                        if (acq == m && l.e == null) {
                            final int n4 = a - m.b();
                            d.v(n4 - d.j(), n4);
                            a(n2, d, adr, b);
                        }
                        else {
                            if (!b2 || d.H()) {
                                continue Label_0211_Outer;
                            }
                            e(n2, adr, d, b);
                        }
                    }
                }
            }
        }
        if (!(acr instanceof acu)) {
            final HashSet a4 = i.a;
            if (a4 != null && i.c) {
            Label_0652_Outer:
                for (final acq acq2 : a4) {
                    final acr d2 = acq2.d;
                    final int n5 = n + 1;
                    final boolean c2 = c(d2);
                    if (d2.J() && c2) {
                        acs.X(d2, adr, new acz());
                    }
                    final acq j2 = d2.J;
                    boolean b3 = false;
                    Label_0694: {
                        while (true) {
                            Label_0658: {
                                if (acq2 != j2) {
                                    break Label_0658;
                                }
                                final acq e3 = d2.L.e;
                                if (e3 == null) {
                                    break Label_0658;
                                }
                                if (!e3.c) {
                                    break Label_0658;
                                }
                                b3 = true;
                                break Label_0694;
                            }
                            if (acq2 == d2.L) {
                                final acq e4 = j2.e;
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
                        f(n5, acr, adr, d2, b);
                    }
                    else {
                        if (d2.J()) {
                            continue Label_0652_Outer;
                        }
                        final acq j3 = d2.J;
                        if (acq2 == j3 && d2.L.e == null) {
                            final int n6 = j3.b() + a2;
                            d2.v(n6, d2.j() + n6);
                            a(n5, d2, adr, b);
                        }
                        else {
                            final acq l2 = d2.L;
                            if (acq2 == l2 && j3.e == null) {
                                final int n7 = a2 - l2.b();
                                d2.v(n7 - d2.j(), n7);
                                a(n5, d2, adr, b);
                            }
                            else {
                                if (!b3 || d2.H()) {
                                    continue Label_0652_Outer;
                                }
                                e(n5, adr, d2, b);
                            }
                        }
                    }
                }
            }
            acr.n = true;
        }
    }
    
    public static void b(final int n, final acr acr, final adr adr) {
        if (acr.o) {
            return;
        }
        ++adf.c;
        if (!(acr instanceof acs) && acr.J() && c(acr)) {
            acs.X(acr, adr, new acz());
        }
        final acq k = acr.K(3);
        final acq i = acr.K(5);
        final int a = k.a();
        final int a2 = i.a();
        Object o = k.a;
        if (o != null && k.c) {
        Label_0204_Outer:
            for (final acq acq : o) {
                o = acq.d;
                final int a3 = n + 1;
                final boolean c = c((acr)o);
                if (((acr)o).J() && c) {
                    acs.X((acr)o, adr, new acz());
                }
                final acq j = ((acr)o).K;
                boolean b = false;
                Label_0245: {
                    while (true) {
                        Label_0210: {
                            if (acq != j) {
                                break Label_0210;
                            }
                            final acq e = ((acr)o).M.e;
                            if (e == null) {
                                break Label_0210;
                            }
                            if (!e.c) {
                                break Label_0210;
                            }
                            b = true;
                            break Label_0245;
                        }
                        if (acq == ((acr)o).M) {
                            final acq e2 = j.e;
                            if (e2 != null && e2.c) {
                                continue;
                            }
                        }
                        break;
                    }
                    b = false;
                }
                if (((acr)o).N() == 3 && !c) {
                    if (((acr)o).N() != 3 || ((acr)o).z < 0 || ((acr)o).y < 0 || (((acr)o).ah != 8 && (((acr)o).t != 0 || ((acr)o).X != 0.0f)) || ((acr)o).I() || !b || ((acr)o).I()) {
                        continue Label_0204_Outer;
                    }
                    h(a3, acr, adr, (acr)o);
                }
                else {
                    if (((acr)o).J()) {
                        continue Label_0204_Outer;
                    }
                    final acq l = ((acr)o).K;
                    if (acq == l && ((acr)o).M.e == null) {
                        final int n2 = l.b() + a;
                        ((acr)o).w(n2, ((acr)o).h() + n2);
                        b(a3, (acr)o, adr);
                    }
                    else {
                        final acq m = ((acr)o).M;
                        if (acq == m && l.e == null) {
                            final int n3 = a - m.b();
                            ((acr)o).w(n3 - ((acr)o).h(), n3);
                            b(a3, (acr)o, adr);
                        }
                        else {
                            if (!b || ((acr)o).I()) {
                                continue Label_0204_Outer;
                            }
                            g(a3, adr, (acr)o);
                        }
                    }
                }
            }
        }
        if (acr instanceof acu) {
            return;
        }
        o = i.a;
        if (o != null && i.c) {
            o = ((HashSet<acq>)o).iterator();
        Label_0632_Outer:
            while (((Iterator)o).hasNext()) {
                final acq acq2 = ((Iterator<acq>)o).next();
                final acr d = acq2.d;
                final int a3 = n + 1;
                final boolean c2 = c(d);
                if (d.J() && c2) {
                    acs.X(d, adr, new acz());
                }
                final acq k2 = d.K;
                boolean b2 = false;
                Label_0673: {
                    while (true) {
                        Label_0638: {
                            if (acq2 != k2) {
                                break Label_0638;
                            }
                            final acq e3 = d.M.e;
                            if (e3 == null) {
                                break Label_0638;
                            }
                            if (!e3.c) {
                                break Label_0638;
                            }
                            b2 = true;
                            break Label_0673;
                        }
                        if (acq2 == d.M) {
                            final acq e4 = k2.e;
                            if (e4 != null && e4.c) {
                                continue;
                            }
                        }
                        break;
                    }
                    b2 = false;
                }
                if (d.N() == 3 && !c2) {
                    if (d.N() != 3 || d.z < 0 || d.y < 0 || (d.ah != 8 && (d.t != 0 || d.X != 0.0f)) || d.I() || !b2 || d.I()) {
                        continue Label_0632_Outer;
                    }
                    h(a3, acr, adr, d);
                }
                else {
                    if (d.J()) {
                        continue Label_0632_Outer;
                    }
                    final acq k3 = d.K;
                    if (acq2 == k3 && d.M.e == null) {
                        final int n4 = k3.b() + a2;
                        d.w(n4, d.h() + n4);
                        b(a3, d, adr);
                    }
                    else {
                        final acq m2 = d.M;
                        if (acq2 == m2 && k3.e == null) {
                            final int n5 = a2 - m2.b();
                            d.w(n5 - d.h(), n5);
                            b(a3, d, adr);
                        }
                        else {
                            if (!b2 || d.I()) {
                                continue Label_0632_Outer;
                            }
                            g(a3, adr, d);
                        }
                    }
                }
            }
        }
        final acq k4 = acr.K(6);
        Label_1129: {
            if (k4.a == null || !k4.c) {
                break Label_1129;
            }
            final int a3 = k4.a();
            while (true) {
                o = k4.a.iterator();
                Label_1117: {
                    while (((Iterator)o).hasNext()) {
                        final acq acq3 = ((Iterator<acq>)o).next();
                        final acr d2 = acq3.d;
                        final boolean c3 = c(d2);
                        if (d2.J() && c3) {
                            acs.X(d2, adr, new acz());
                        }
                        if ((d2.N() != 3 || c3) && !d2.J() && acq3 == d2.N) {
                            final int n6 = acq3.b() + a3;
                            if (d2.F) {
                                final int aa = n6 - d2.ab;
                                final int w = d2.W;
                                d2.aa = aa;
                                d2.K.e(aa);
                                d2.M.e(aa + w);
                                d2.N.e(n6);
                                d2.m = true;
                            }
                            break Label_1117;
                        }
                    }
                    break Label_1129;
                    try {
                        final acr d2;
                        b(n + 1, d2, adr);
                        continue;
                        acr.o = true;
                    }
                    finally {
                        while (true) {}
                    }
                }
                break;
            }
        }
    }
    
    public static boolean c(final acr acr) {
        final int m = acr.M();
        final int n = acr.N();
        acr u;
        if ((u = acr.U) == null) {
            u = null;
        }
        if (u != null) {
            u.M();
        }
        if (u != null) {
            u.N();
        }
        int n2 = 0;
        Label_0128: {
            Label_0126: {
                if (m != 1 && !acr.e() && m != 2) {
                    while (true) {
                        Label_0106: {
                            if (m == 3) {
                                if (acr.s != 0 || acr.X != 0.0f) {
                                    break Label_0106;
                                }
                                if (!acr.F(0)) {
                                    break Label_0106;
                                }
                                break Label_0126;
                            }
                            else if (m == 3) {
                                break Label_0106;
                            }
                            n2 = 0;
                            break Label_0128;
                        }
                        if (acr.s != 1 || !acr.G(0, acr.j())) {
                            continue;
                        }
                        break;
                    }
                }
            }
            n2 = 1;
        }
        int n3 = 0;
        Label_0209: {
            Label_0207: {
                if (n != 1 && !acr.f() && n != 2) {
                    while (true) {
                        Label_0187: {
                            if (n == 3) {
                                if (acr.t != 0 || acr.X != 0.0f) {
                                    break Label_0187;
                                }
                                if (!acr.F(1)) {
                                    break Label_0187;
                                }
                                break Label_0207;
                            }
                            else if (n == 3) {
                                break Label_0187;
                            }
                            n3 = 0;
                            break Label_0209;
                        }
                        if (acr.t != 1 || !acr.G(1, acr.h())) {
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
        if (acr.X > 0.0f) {
            if (n2 || n3) {
                return true;
            }
            n4 = 0;
            n5 = 0;
        }
        return n4 && n5;
    }
    
    public static void d(final aco aco, final adr adr, final int n, final boolean b) {
        if (aco.c()) {
            if (n == 0) {
                a(1, (acr)aco, adr, b);
                return;
            }
            b(1, (acr)aco, adr);
        }
    }
    
    private static void e(final int n, final adr adr, final acr acr, final boolean b) {
        float ae = acr.ae;
        final int a = acr.J.e.a();
        final int a2 = acr.L.e.a();
        int n2 = acr.J.b() + a;
        int n3 = a2 - acr.L.b();
        if (a == a2) {
            n3 = a2;
        }
        if (a == a2) {
            n2 = a;
        }
        if (a == a2) {
            ae = 0.5f;
        }
        final int j = acr.j();
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
        acr.v(n6, n7);
        a(n + 1, acr, adr, b);
    }
    
    private static void f(final int n, final acr acr, final adr adr, final acr acr2, final boolean b) {
        final float ae = acr2.ae;
        final int n2 = acr2.J.e.a() + acr2.J.b();
        final int n3 = acr2.L.e.a() - acr2.L.b();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = acr2.j();
            if (acr2.ah != 8) {
                final int s = acr2.s;
                int n7;
                if (s == 2) {
                    int n6;
                    if (acr instanceof acs) {
                        n6 = acr.j();
                    }
                    else {
                        n6 = acr.U.j();
                    }
                    n7 = (int)(acr2.ae * 0.5f * n6);
                }
                else {
                    n7 = n4;
                    if (s == 0) {
                        n7 = n3 - n2;
                    }
                }
                final int max = Math.max(acr2.v, n7);
                final int w = acr2.w;
                n5 = max;
                if (w > 0) {
                    n5 = Math.min(w, max);
                }
            }
            final int n8 = n2 + (int)(ae * (n3 - n2 - n5) + 0.5f);
            acr2.v(n8, n5 + n8);
            a(n + 1, acr2, adr, b);
        }
    }
    
    private static void g(final int n, final adr adr, final acr acr) {
        float af = acr.af;
        final int a = acr.K.e.a();
        final int a2 = acr.M.e.a();
        int n2 = acr.K.b() + a;
        int n3 = a2 - acr.M.b();
        if (a == a2) {
            n3 = a2;
        }
        if (a == a2) {
            n2 = a;
        }
        if (a == a2) {
            af = 0.5f;
        }
        final int h = acr.h();
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
        acr.w(n7, n8);
        b(n + 1, acr, adr);
    }
    
    private static void h(final int n, final acr acr, final adr adr, final acr acr2) {
        final float af = acr2.af;
        final int n2 = acr2.K.e.a() + acr2.K.b();
        final int n3 = acr2.M.e.a() - acr2.M.b();
        if (n3 >= n2) {
            int n5;
            final int n4 = n5 = acr2.h();
            if (acr2.ah != 8) {
                final int t = acr2.t;
                int n7;
                if (t == 2) {
                    int n6;
                    if (acr instanceof acs) {
                        n6 = acr.h();
                    }
                    else {
                        n6 = acr.U.h();
                    }
                    n7 = (int)(af * 0.5f * n6);
                }
                else {
                    n7 = n4;
                    if (t == 0) {
                        n7 = n3 - n2;
                    }
                }
                final int max = Math.max(acr2.y, n7);
                final int z = acr2.z;
                n5 = max;
                if (z > 0) {
                    n5 = Math.min(z, max);
                }
            }
            final int n8 = n2 + (int)(af * (n3 - n2 - n5) + 0.5f);
            acr2.w(n8, n5 + n8);
            b(n + 1, acr2, adr);
        }
    }
}
