import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adb extends adn
{
    ArrayList a;
    private int b;
    
    public adb(acs acs, int i) {
        super(acs);
        this.a = new ArrayList();
        this.g = i;
        acs d = this.d;
        acs n;
        for (acs = d.n(i); acs != null; acs = n) {
            n = acs.n(this.g);
            d = acs;
        }
        this.d = d;
        this.a.add(d.o(this.g));
        for (acs = d.m(this.g); acs != null; acs = acs.m(this.g)) {
            this.a.add(acs.o(this.g));
        }
        final ArrayList a = this.a;
        int size;
        adn adn;
        int g;
        for (size = a.size(), i = 0; i < size; ++i) {
            adn = (adn)a.get(i);
            g = this.g;
            if (g == 0) {
                adn.d.f = this;
            }
            else if (g == 1) {
                adn.d.g = this;
            }
        }
        if (this.g == 0 && ((act)this.d.U).c && this.a.size() > 1) {
            final ArrayList a2 = this.a;
            this.d = ((adn)a2.get(a2.size() - 1)).d;
        }
        if (this.g == 0) {
            i = this.d.aj;
        }
        else {
            i = this.d.ak;
        }
        this.b = i;
    }
    
    private final acs g() {
        for (int i = 0; i < this.a.size(); ++i) {
            final acs d = this.a.get(i).d;
            if (d.ah != 8) {
                return d;
            }
        }
        return null;
    }
    
    private final acs n() {
        int size = this.a.size();
        while (--size >= 0) {
            final acs d = this.a.get(size).d;
            if (d.ah != 8) {
                return d;
            }
        }
        return null;
    }
    
    public final long a() {
        final int size = this.a.size();
        int i = 0;
        long n = 0L;
        while (i < size) {
            final adn adn = this.a.get(i);
            n = n + adn.i.e + adn.a() + adn.j.e;
            ++i;
        }
        return n;
    }
    
    public final void b() {
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((adn)a.get(i)).b();
        }
        final int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        final acs d = this.a.get(0).d;
        final acs d2 = this.a.get(size2 - 1).d;
        if (this.g == 0) {
            final acr j = d.J;
            final acr l = d2.L;
            final ade k = l(j, 0);
            int n = j.b();
            final acs g = this.g();
            if (g != null) {
                n = g.J.b();
            }
            if (k != null) {
                j(this.i, k, n);
            }
            final ade m = l(l, 0);
            int n2 = l.b();
            final acs n3 = this.n();
            if (n3 != null) {
                n2 = n3.L.b();
            }
            if (m != null) {
                j(this.j, m, -n2);
            }
        }
        else {
            final acr k2 = d.K;
            final acr m2 = d2.M;
            final ade l2 = l(k2, 1);
            int n4 = k2.b();
            final acs g2 = this.g();
            if (g2 != null) {
                n4 = g2.K.b();
            }
            if (l2 != null) {
                j(this.i, l2, n4);
            }
            final ade l3 = l(m2, 1);
            int n5 = m2.b();
            final acs n6 = this.n();
            if (n6 != null) {
                n5 = n6.M.b();
            }
            if (l3 != null) {
                j(this.j, l3, -n5);
            }
        }
        this.i.a = (adc)this;
        this.j.a = (adc)this;
    }
    
    public final void c() {
        for (int i = 0; i < this.a.size(); ++i) {
            ((adn)this.a.get(i)).c();
        }
    }
    
    public final void d() {
        this.e = null;
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((adn)a.get(i)).d();
        }
    }
    
    public final boolean e() {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            if (!((adn)this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }
    
    public final void f() {
        final ade i = this.i;
        if (i.i) {
            final ade j = this.j;
            if (j.i) {
                final acs u = this.d.U;
                final boolean b = u instanceof act && ((act)u).c;
                final int n = j.f - i.f;
                while (true) {
                    for (int size = this.a.size(), k = 0; k < size; ++k) {
                        final int n2 = k;
                        if (((adn)this.a.get(k)).d.ah != 8) {
                            while (true) {
                                int l;
                                for (int n3 = l = size - 1; l >= 0; --l) {
                                    final int n4 = l;
                                    if (((adn)this.a.get(l)).d.ah != 8) {
                                        int n5 = 0;
                                        while (true) {
                                            while (n5 < 2) {
                                                int n6 = 0;
                                                int n7 = 0;
                                                int n8 = 0;
                                                int n9 = 0;
                                                float n10 = 0.0f;
                                                while (n7 < size) {
                                                    final adn adn = this.a.get(n7);
                                                    final acs d = adn.d;
                                                    int n11 = n6;
                                                    int n12 = n8;
                                                    int n13 = n9;
                                                    float n14 = n10;
                                                    if (d.ah != 8) {
                                                        final int n15 = n9 + 1;
                                                        int n16 = n6;
                                                        if (n7 > 0) {
                                                            n16 = n6;
                                                            if (n7 >= n2) {
                                                                n16 = n6 + adn.i.e;
                                                            }
                                                        }
                                                        final adf f = adn.f;
                                                        final int f2 = f.f;
                                                        final boolean b2 = adn.k != 3;
                                                        int m = 0;
                                                        boolean b3 = false;
                                                        Label_0443: {
                                                            Label_0435: {
                                                                if (!b2) {
                                                                    if (adn.c == 1 && n5 == 0) {
                                                                        m = f.m;
                                                                        ++n8;
                                                                    }
                                                                    else {
                                                                        if (!f.i) {
                                                                            break Label_0435;
                                                                        }
                                                                        m = f2;
                                                                    }
                                                                    b3 = true;
                                                                    break Label_0443;
                                                                }
                                                                final int g = this.g;
                                                                if (g == 0) {
                                                                    if (!d.h.f.i) {
                                                                        return;
                                                                    }
                                                                }
                                                                else if (g == 1) {
                                                                    if (!d.i.f.i) {
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                            b3 = b2;
                                                            m = f2;
                                                        }
                                                        int n19;
                                                        float n20;
                                                        if (!b3) {
                                                            final int n17 = n8 + 1;
                                                            final float n18 = d.al[this.g];
                                                            n19 = n16;
                                                            n8 = n17;
                                                            n20 = n10;
                                                            if (n18 >= 0.0f) {
                                                                n20 = n10 + n18;
                                                                n19 = n16;
                                                                n8 = n17;
                                                            }
                                                        }
                                                        else {
                                                            n19 = n16 + m;
                                                            n20 = n10;
                                                        }
                                                        n11 = n19;
                                                        n12 = n8;
                                                        n13 = n15;
                                                        n14 = n20;
                                                        if (n7 < n3) {
                                                            n11 = n19;
                                                            n12 = n8;
                                                            n13 = n15;
                                                            n14 = n20;
                                                            if (n7 < n4) {
                                                                n11 = n19 + -adn.j.e;
                                                                n14 = n20;
                                                                n13 = n15;
                                                                n12 = n8;
                                                            }
                                                        }
                                                    }
                                                    ++n7;
                                                    n6 = n11;
                                                    n8 = n12;
                                                    n9 = n13;
                                                    n10 = n14;
                                                }
                                                if (n6 >= n && n8 != 0) {
                                                    ++n5;
                                                }
                                                else {
                                                    final int n21 = n9;
                                                    int n22 = n8;
                                                    int n23 = this.i.f;
                                                    if (b) {
                                                        n23 = this.j.f;
                                                    }
                                                    int n24 = n23;
                                                    if (n6 > n) {
                                                        if (b) {
                                                            n24 = n23 + (int)((n6 - n) / 2.0f + 0.5f);
                                                        }
                                                        else {
                                                            n24 = n23 - (int)((n6 - n) / 2.0f + 0.5f);
                                                        }
                                                    }
                                                    int n42;
                                                    if (n22 > 0) {
                                                        final float n25 = (float)(n - n6);
                                                        final float n26 = n25 / n22 + 0.5f;
                                                        int n27 = 0;
                                                        int n28 = 0;
                                                        final int n29 = n24;
                                                        while (n27 < size) {
                                                            final adn adn2 = this.a.get(n27);
                                                            final acs d2 = adn2.d;
                                                            if (d2.ah != 8 && adn2.k == 3) {
                                                                final adf f3 = adn2.f;
                                                                if (!f3.i) {
                                                                    int n30 = (int)n26;
                                                                    if (n10 > 0.0f) {
                                                                        n30 = (int)(d2.al[this.g] * n25 / n10 + 0.5f);
                                                                    }
                                                                    int n31;
                                                                    int n32;
                                                                    if (this.g == 0) {
                                                                        n31 = d2.w;
                                                                        n32 = d2.v;
                                                                    }
                                                                    else {
                                                                        n31 = d2.z;
                                                                        n32 = d2.y;
                                                                    }
                                                                    int min;
                                                                    if (adn2.c == 1) {
                                                                        min = Math.min(n30, f3.m);
                                                                    }
                                                                    else {
                                                                        min = n30;
                                                                    }
                                                                    int n34;
                                                                    final int n33 = n34 = Math.max(n32, min);
                                                                    if (n31 > 0) {
                                                                        n34 = Math.min(n31, n33);
                                                                    }
                                                                    int n35 = n30;
                                                                    int n36 = n28;
                                                                    if (n34 != n30) {
                                                                        n36 = n28 + 1;
                                                                        n35 = n34;
                                                                    }
                                                                    adn2.f.c(n35);
                                                                    n28 = n36;
                                                                }
                                                            }
                                                            ++n27;
                                                        }
                                                        if (n28 > 0) {
                                                            final int n37 = n22 - n28;
                                                            int n38 = 0;
                                                            int n39 = 0;
                                                            while (true) {
                                                                n22 = n37;
                                                                n6 = n39;
                                                                if (n38 >= size) {
                                                                    break;
                                                                }
                                                                final adn adn3 = this.a.get(n38);
                                                                if (adn3.d.ah != 8) {
                                                                    int n40 = n39;
                                                                    if (n38 > 0) {
                                                                        n40 = n39;
                                                                        if (n38 >= n2) {
                                                                            n40 = n39 + adn3.i.e;
                                                                        }
                                                                    }
                                                                    final int n41 = n39 = n40 + adn3.f.f;
                                                                    if (n38 < n3) {
                                                                        n39 = n41;
                                                                        if (n38 < n4) {
                                                                            n39 = n41 + -adn3.j.e;
                                                                        }
                                                                    }
                                                                }
                                                                ++n38;
                                                            }
                                                        }
                                                        if (this.b == 2 && n28 == 0) {
                                                            this.b = 0;
                                                            n42 = n6;
                                                            n24 = n29;
                                                        }
                                                        else {
                                                            n42 = n6;
                                                            n24 = n29;
                                                        }
                                                    }
                                                    else {
                                                        n42 = n6;
                                                    }
                                                    if (n42 > n) {
                                                        this.b = 2;
                                                    }
                                                    int n43 = n22;
                                                    if (n21 > 0 && (n43 = n22) == 0) {
                                                        if (n2 == n4) {
                                                            this.b = 2;
                                                        }
                                                        n43 = 0;
                                                    }
                                                    final int b4 = this.b;
                                                    if (b4 == 1) {
                                                        int n44;
                                                        if (n21 > 1) {
                                                            n44 = (n - n42) / (n21 - 1);
                                                        }
                                                        else if (n21 == 1) {
                                                            n44 = (n - n42) / 2;
                                                        }
                                                        else {
                                                            n44 = 0;
                                                        }
                                                        int n45 = n44;
                                                        if (n43 > 0) {
                                                            n45 = 0;
                                                        }
                                                        int n46 = 0;
                                                        int n47 = n24;
                                                        while (n46 < size) {
                                                            int n48;
                                                            if (b) {
                                                                n48 = size - (n46 + 1);
                                                            }
                                                            else {
                                                                n48 = n46;
                                                            }
                                                            final adn adn4 = this.a.get(n48);
                                                            int n49;
                                                            if (adn4.d.ah == 8) {
                                                                adn4.i.c(n47);
                                                                adn4.j.c(n47);
                                                                n49 = n47;
                                                            }
                                                            else {
                                                                int n50 = n47;
                                                                if (n46 > 0) {
                                                                    if (b) {
                                                                        n50 = n47 - n45;
                                                                    }
                                                                    else {
                                                                        n50 = n47 + n45;
                                                                    }
                                                                }
                                                                int n51 = n50;
                                                                if (n46 > 0) {
                                                                    n51 = n50;
                                                                    if (n46 >= n2) {
                                                                        if (b) {
                                                                            n51 = n50 - adn4.i.e;
                                                                        }
                                                                        else {
                                                                            n51 = n50 + adn4.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    adn4.j.c(n51);
                                                                }
                                                                else {
                                                                    adn4.i.c(n51);
                                                                }
                                                                final adf f4 = adn4.f;
                                                                int n53;
                                                                final int n52 = n53 = f4.f;
                                                                if (adn4.k == 3) {
                                                                    n53 = n52;
                                                                    if (adn4.c == 1) {
                                                                        n53 = f4.m;
                                                                    }
                                                                }
                                                                int n54;
                                                                if (b) {
                                                                    n54 = n51 - n53;
                                                                }
                                                                else {
                                                                    n54 = n51 + n53;
                                                                }
                                                                if (b) {
                                                                    adn4.i.c(n54);
                                                                }
                                                                else {
                                                                    adn4.j.c(n54);
                                                                }
                                                                adn4.h = true;
                                                                n49 = n54;
                                                                if (n46 < n3) {
                                                                    n49 = n54;
                                                                    if (n46 < n4) {
                                                                        if (b) {
                                                                            n49 = n54 - -adn4.j.e;
                                                                        }
                                                                        else {
                                                                            n49 = n54 + -adn4.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            ++n46;
                                                            n47 = n49;
                                                        }
                                                        return;
                                                    }
                                                    if (b4 == 0) {
                                                        int n55 = (n - n42) / (n21 + 1);
                                                        if (n43 > 0) {
                                                            n55 = 0;
                                                        }
                                                        for (int n56 = 0; n56 < size; ++n56) {
                                                            int n57;
                                                            if (b) {
                                                                n57 = size - (n56 + 1);
                                                            }
                                                            else {
                                                                n57 = n56;
                                                            }
                                                            final adn adn5 = this.a.get(n57);
                                                            if (adn5.d.ah == 8) {
                                                                adn5.i.c(n24);
                                                                adn5.j.c(n24);
                                                            }
                                                            else {
                                                                int n58;
                                                                if (b) {
                                                                    n58 = n24 - n55;
                                                                }
                                                                else {
                                                                    n58 = n24 + n55;
                                                                }
                                                                int n59 = n58;
                                                                if (n56 > 0) {
                                                                    n59 = n58;
                                                                    if (n56 >= n2) {
                                                                        if (b) {
                                                                            n59 = n58 - adn5.i.e;
                                                                        }
                                                                        else {
                                                                            n59 = n58 + adn5.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    adn5.j.c(n59);
                                                                }
                                                                else {
                                                                    adn5.i.c(n59);
                                                                }
                                                                final adf f5 = adn5.f;
                                                                int n61;
                                                                final int n60 = n61 = f5.f;
                                                                if (adn5.k == 3) {
                                                                    n61 = n60;
                                                                    if (adn5.c == 1) {
                                                                        n61 = Math.min(n60, f5.m);
                                                                    }
                                                                }
                                                                int n62;
                                                                if (b) {
                                                                    n62 = n59 - n61;
                                                                }
                                                                else {
                                                                    n62 = n59 + n61;
                                                                }
                                                                if (b) {
                                                                    adn5.i.c(n62);
                                                                }
                                                                else {
                                                                    adn5.j.c(n62);
                                                                }
                                                                n24 = n62;
                                                                if (n56 < n3) {
                                                                    n24 = n62;
                                                                    if (n56 < n4) {
                                                                        if (b) {
                                                                            n24 = n62 - -adn5.j.e;
                                                                        }
                                                                        else {
                                                                            n24 = n62 + -adn5.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    if (b4 == 2) {
                                                        float n63;
                                                        if (this.g == 0) {
                                                            n63 = this.d.ae;
                                                        }
                                                        else {
                                                            n63 = this.d.af;
                                                        }
                                                        float n64 = n63;
                                                        if (b) {
                                                            n64 = 1.0f - n63;
                                                        }
                                                        int n65 = (int)((n - n42) * n64 + 0.5f);
                                                        if (n65 < 0 || n43 > 0) {
                                                            n65 = 0;
                                                        }
                                                        int n66;
                                                        if (b) {
                                                            n66 = n24 - n65;
                                                        }
                                                        else {
                                                            n66 = n24 + n65;
                                                        }
                                                        for (int n67 = 0; n67 < size; ++n67) {
                                                            int n68;
                                                            if (b) {
                                                                n68 = size - (n67 + 1);
                                                            }
                                                            else {
                                                                n68 = n67;
                                                            }
                                                            final adn adn6 = this.a.get(n68);
                                                            if (adn6.d.ah == 8) {
                                                                adn6.i.c(n66);
                                                                adn6.j.c(n66);
                                                            }
                                                            else {
                                                                int n69 = n66;
                                                                if (n67 > 0) {
                                                                    n69 = n66;
                                                                    if (n67 >= n2) {
                                                                        if (b) {
                                                                            n69 = n66 - adn6.i.e;
                                                                        }
                                                                        else {
                                                                            n69 = n66 + adn6.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    adn6.j.c(n69);
                                                                }
                                                                else {
                                                                    adn6.i.c(n69);
                                                                }
                                                                final adf f6 = adn6.f;
                                                                int n70 = f6.f;
                                                                if (adn6.k == 3 && adn6.c == 1) {
                                                                    n70 = f6.m;
                                                                }
                                                                int n71;
                                                                if (b) {
                                                                    n71 = n69 - n70;
                                                                }
                                                                else {
                                                                    n71 = n69 + n70;
                                                                }
                                                                if (b) {
                                                                    adn6.i.c(n71);
                                                                }
                                                                else {
                                                                    adn6.j.c(n71);
                                                                }
                                                                n66 = n71;
                                                                if (n67 < n3) {
                                                                    n66 = n71;
                                                                    if (n67 < n4) {
                                                                        if (b) {
                                                                            n66 = n71 - -adn6.j.e;
                                                                        }
                                                                        else {
                                                                            n66 = n71 + -adn6.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                }
                                            }
                                            int n22 = 0;
                                            int n6 = 0;
                                            final int n21 = 0;
                                            float n10 = 0.0f;
                                            continue;
                                        }
                                    }
                                }
                                final int n4 = -1;
                                continue;
                            }
                        }
                    }
                    final int n2 = -1;
                    continue;
                }
            }
        }
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ChainRun ");
        String s;
        if (this.g == 0) {
            s = "horizontal : ";
        }
        else {
            s = "vertical : ";
        }
        sb.append(s);
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final adn adn = (adn)a.get(i);
            sb.append("<");
            sb.append(adn);
            sb.append("> ");
        }
        return sb.toString();
    }
}
