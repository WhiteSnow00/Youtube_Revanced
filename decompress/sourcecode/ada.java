import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ada extends adm
{
    ArrayList a;
    private int b;
    
    public ada(acr acr, int i) {
        super(acr);
        this.a = new ArrayList();
        this.g = i;
        acr d = this.d;
        acr n;
        for (acr = d.n(i); acr != null; acr = n) {
            n = acr.n(this.g);
            d = acr;
        }
        this.d = d;
        this.a.add(d.o(this.g));
        for (acr = d.m(this.g); acr != null; acr = acr.m(this.g)) {
            this.a.add(acr.o(this.g));
        }
        final ArrayList a = this.a;
        int size;
        adm adm;
        int g;
        for (size = a.size(), i = 0; i < size; ++i) {
            adm = (adm)a.get(i);
            g = this.g;
            if (g == 0) {
                adm.d.f = this;
            }
            else if (g == 1) {
                adm.d.g = this;
            }
        }
        if (this.g == 0 && ((acs)this.d.U).c && this.a.size() > 1) {
            final ArrayList a2 = this.a;
            this.d = ((adm)a2.get(a2.size() - 1)).d;
        }
        if (this.g == 0) {
            i = this.d.aj;
        }
        else {
            i = this.d.ak;
        }
        this.b = i;
    }
    
    private final acr g() {
        for (int i = 0; i < this.a.size(); ++i) {
            final acr d = this.a.get(i).d;
            if (d.ah != 8) {
                return d;
            }
        }
        return null;
    }
    
    private final acr n() {
        int size = this.a.size();
        while (--size >= 0) {
            final acr d = this.a.get(size).d;
            if (d.ah != 8) {
                return d;
            }
        }
        return null;
    }
    
    public final long a() {
        final int size = this.a.size();
        long n = 0L;
        for (int i = 0; i < size; ++i) {
            final adm adm = this.a.get(i);
            n = n + adm.i.e + adm.a() + adm.j.e;
        }
        return n;
    }
    
    public final void b() {
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((adm)a.get(i)).b();
        }
        final int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        final acr d = this.a.get(0).d;
        final acr d2 = this.a.get(size2 - 1).d;
        if (this.g == 0) {
            final acq j = d.J;
            final acq l = d2.L;
            final add k = l(j, 0);
            int n = j.b();
            final acr g = this.g();
            if (g != null) {
                n = g.J.b();
            }
            if (k != null) {
                j(this.i, k, n);
            }
            final add m = l(l, 0);
            int n2 = l.b();
            final acr n3 = this.n();
            if (n3 != null) {
                n2 = n3.L.b();
            }
            if (m != null) {
                j(this.j, m, -n2);
            }
        }
        else {
            final acq k2 = d.K;
            final acq m2 = d2.M;
            final add l2 = l(k2, 1);
            int n4 = k2.b();
            final acr g2 = this.g();
            if (g2 != null) {
                n4 = g2.K.b();
            }
            if (l2 != null) {
                j(this.i, l2, n4);
            }
            final add l3 = l(m2, 1);
            int n5 = m2.b();
            final acr n6 = this.n();
            if (n6 != null) {
                n5 = n6.M.b();
            }
            if (l3 != null) {
                j(this.j, l3, -n5);
            }
        }
        this.i.a = (adb)this;
        this.j.a = (adb)this;
    }
    
    public final void c() {
        for (int i = 0; i < this.a.size(); ++i) {
            ((adm)this.a.get(i)).c();
        }
    }
    
    public final void d() {
        this.e = null;
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((adm)a.get(i)).d();
        }
    }
    
    public final boolean e() {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            if (!((adm)this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }
    
    public final void f() {
        final add i = this.i;
        if (i.i) {
            final add j = this.j;
            if (j.i) {
                final acr u = this.d.U;
                final boolean b = u instanceof acs && ((acs)u).c;
                final int n = j.f - i.f;
                while (true) {
                    for (int size = this.a.size(), k = 0; k < size; ++k) {
                        final int n2 = k;
                        if (((adm)this.a.get(k)).d.ah != 8) {
                            while (true) {
                                int l;
                                for (int n3 = l = size - 1; l >= 0; --l) {
                                    final int n4 = l;
                                    if (((adm)this.a.get(l)).d.ah != 8) {
                                        int n5 = 0;
                                        while (true) {
                                            while (n5 < 2) {
                                                int n6 = 0;
                                                int n7 = 0;
                                                int n8 = 0;
                                                float n9 = 0.0f;
                                                int n10 = 0;
                                                while (n7 < size) {
                                                    final adm adm = this.a.get(n7);
                                                    final acr d = adm.d;
                                                    int n11;
                                                    if (d.ah == 8) {
                                                        n11 = n8;
                                                    }
                                                    else {
                                                        final int n12 = n10 + 1;
                                                        int n13 = n6;
                                                        if (n7 > 0) {
                                                            n13 = n6;
                                                            if (n7 >= n2) {
                                                                n13 = n6 + adm.i.e;
                                                            }
                                                        }
                                                        final ade f = adm.f;
                                                        int f2 = f.f;
                                                        int n14;
                                                        if (adm.k != 3) {
                                                            n14 = 1;
                                                        }
                                                        else {
                                                            n14 = 0;
                                                        }
                                                        Label_0414: {
                                                            if (n14 != 0) {
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
                                                            else {
                                                                int m;
                                                                if (adm.c == 1 && n5 == 0) {
                                                                    m = f.m;
                                                                    ++n8;
                                                                }
                                                                else {
                                                                    if (!f.i) {
                                                                        break Label_0414;
                                                                    }
                                                                    m = f2;
                                                                }
                                                                final int n15 = 1;
                                                                f2 = m;
                                                                n14 = n15;
                                                            }
                                                        }
                                                        int n18;
                                                        float n19;
                                                        if (n14 == 0) {
                                                            final int n16 = n8 + 1;
                                                            final float n17 = d.al[this.g];
                                                            n18 = n13;
                                                            n8 = n16;
                                                            n19 = n9;
                                                            if (n17 >= 0.0f) {
                                                                n19 = n9 + n17;
                                                                n18 = n13;
                                                                n8 = n16;
                                                            }
                                                        }
                                                        else {
                                                            n18 = n13 + f2;
                                                            n19 = n9;
                                                        }
                                                        n6 = n18;
                                                        n11 = n8;
                                                        n9 = n19;
                                                        n10 = n12;
                                                        if (n7 < n3) {
                                                            n6 = n18;
                                                            n11 = n8;
                                                            n9 = n19;
                                                            n10 = n12;
                                                            if (n7 < n4) {
                                                                n6 = n18 + -adm.j.e;
                                                                n10 = n12;
                                                                n9 = n19;
                                                                n11 = n8;
                                                            }
                                                        }
                                                    }
                                                    ++n7;
                                                    n8 = n11;
                                                }
                                                if (n6 >= n && n8 != 0) {
                                                    ++n5;
                                                }
                                                else {
                                                    final int n20 = n10;
                                                    int n21 = n8;
                                                    int n22 = this.i.f;
                                                    if (b) {
                                                        n22 = this.j.f;
                                                    }
                                                    int n23 = n22;
                                                    if (n6 > n) {
                                                        if (b) {
                                                            n23 = n22 + (int)((n6 - n) / 2.0f + 0.5f);
                                                        }
                                                        else {
                                                            n23 = n22 - (int)((n6 - n) / 2.0f + 0.5f);
                                                        }
                                                    }
                                                    int n41;
                                                    if (n21 > 0) {
                                                        final float n24 = (float)(n - n6);
                                                        final int n25 = (int)(n24 / n21 + 0.5f);
                                                        int n26 = 0;
                                                        int n27 = 0;
                                                        final int n28 = n23;
                                                        while (n26 < size) {
                                                            final adm adm2 = this.a.get(n26);
                                                            final acr d2 = adm2.d;
                                                            if (d2.ah != 8 && adm2.k == 3) {
                                                                final ade f3 = adm2.f;
                                                                if (!f3.i) {
                                                                    int n29;
                                                                    if (n9 > 0.0f) {
                                                                        n29 = (int)(d2.al[this.g] * n24 / n9 + 0.5f);
                                                                    }
                                                                    else {
                                                                        n29 = n25;
                                                                    }
                                                                    int n30;
                                                                    int n31;
                                                                    if (this.g == 0) {
                                                                        n30 = d2.w;
                                                                        n31 = d2.v;
                                                                    }
                                                                    else {
                                                                        n30 = d2.z;
                                                                        n31 = d2.y;
                                                                    }
                                                                    int min;
                                                                    if (adm2.c == 1) {
                                                                        min = Math.min(n29, f3.m);
                                                                    }
                                                                    else {
                                                                        min = n29;
                                                                    }
                                                                    int n33;
                                                                    final int n32 = n33 = Math.max(n31, min);
                                                                    if (n30 > 0) {
                                                                        n33 = Math.min(n30, n32);
                                                                    }
                                                                    int n34 = n29;
                                                                    int n35 = n27;
                                                                    if (n33 != n29) {
                                                                        n35 = n27 + 1;
                                                                        n34 = n33;
                                                                    }
                                                                    adm2.f.c(n34);
                                                                    n27 = n35;
                                                                }
                                                            }
                                                            ++n26;
                                                        }
                                                        if (n27 > 0) {
                                                            final int n36 = n21 - n27;
                                                            int n37 = 0;
                                                            int n38 = 0;
                                                            while (true) {
                                                                n21 = n36;
                                                                n6 = n38;
                                                                if (n37 >= size) {
                                                                    break;
                                                                }
                                                                final adm adm3 = this.a.get(n37);
                                                                if (adm3.d.ah != 8) {
                                                                    int n39 = n38;
                                                                    if (n37 > 0) {
                                                                        n39 = n38;
                                                                        if (n37 >= n2) {
                                                                            n39 = n38 + adm3.i.e;
                                                                        }
                                                                    }
                                                                    final int n40 = n38 = n39 + adm3.f.f;
                                                                    if (n37 < n3) {
                                                                        n38 = n40;
                                                                        if (n37 < n4) {
                                                                            n38 = n40 + -adm3.j.e;
                                                                        }
                                                                    }
                                                                }
                                                                ++n37;
                                                            }
                                                        }
                                                        if (this.b == 2 && n27 == 0) {
                                                            this.b = 0;
                                                            n41 = n6;
                                                            n23 = n28;
                                                        }
                                                        else {
                                                            n41 = n6;
                                                            n23 = n28;
                                                        }
                                                    }
                                                    else {
                                                        n41 = n6;
                                                    }
                                                    if (n41 > n) {
                                                        this.b = 2;
                                                    }
                                                    int n42 = n21;
                                                    if (n20 > 0 && (n42 = n21) == 0) {
                                                        if (n2 == n4) {
                                                            this.b = 2;
                                                        }
                                                        n42 = 0;
                                                    }
                                                    final int b2 = this.b;
                                                    if (b2 == 1) {
                                                        int n43;
                                                        if (n20 > 1) {
                                                            n43 = (n - n41) / (n20 - 1);
                                                        }
                                                        else if (n20 == 1) {
                                                            n43 = (n - n41) / 2;
                                                        }
                                                        else {
                                                            n43 = 0;
                                                        }
                                                        int n44 = n43;
                                                        if (n42 > 0) {
                                                            n44 = 0;
                                                        }
                                                        int n45 = 0;
                                                        int n46 = n23;
                                                        while (n45 < size) {
                                                            int n47;
                                                            if (b) {
                                                                n47 = size - (n45 + 1);
                                                            }
                                                            else {
                                                                n47 = n45;
                                                            }
                                                            final adm adm4 = this.a.get(n47);
                                                            int n48;
                                                            if (adm4.d.ah == 8) {
                                                                adm4.i.c(n46);
                                                                adm4.j.c(n46);
                                                                n48 = n46;
                                                            }
                                                            else {
                                                                int n49 = n46;
                                                                if (n45 > 0) {
                                                                    if (b) {
                                                                        n49 = n46 - n44;
                                                                    }
                                                                    else {
                                                                        n49 = n46 + n44;
                                                                    }
                                                                }
                                                                int n50 = n49;
                                                                if (n45 > 0) {
                                                                    n50 = n49;
                                                                    if (n45 >= n2) {
                                                                        if (b) {
                                                                            n50 = n49 - adm4.i.e;
                                                                        }
                                                                        else {
                                                                            n50 = n49 + adm4.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    adm4.j.c(n50);
                                                                }
                                                                else {
                                                                    adm4.i.c(n50);
                                                                }
                                                                final ade f4 = adm4.f;
                                                                int n52;
                                                                final int n51 = n52 = f4.f;
                                                                if (adm4.k == 3) {
                                                                    n52 = n51;
                                                                    if (adm4.c == 1) {
                                                                        n52 = f4.m;
                                                                    }
                                                                }
                                                                int n53;
                                                                if (b) {
                                                                    n53 = n50 - n52;
                                                                }
                                                                else {
                                                                    n53 = n50 + n52;
                                                                }
                                                                if (b) {
                                                                    adm4.i.c(n53);
                                                                }
                                                                else {
                                                                    adm4.j.c(n53);
                                                                }
                                                                adm4.h = true;
                                                                n48 = n53;
                                                                if (n45 < n3) {
                                                                    n48 = n53;
                                                                    if (n45 < n4) {
                                                                        if (b) {
                                                                            n48 = n53 - -adm4.j.e;
                                                                        }
                                                                        else {
                                                                            n48 = n53 + -adm4.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            ++n45;
                                                            n46 = n48;
                                                        }
                                                        return;
                                                    }
                                                    if (b2 == 0) {
                                                        int n54 = (n - n41) / (n20 + 1);
                                                        if (n42 > 0) {
                                                            n54 = 0;
                                                        }
                                                        for (int n55 = 0; n55 < size; ++n55) {
                                                            int n56;
                                                            if (b) {
                                                                n56 = size - (n55 + 1);
                                                            }
                                                            else {
                                                                n56 = n55;
                                                            }
                                                            final adm adm5 = this.a.get(n56);
                                                            if (adm5.d.ah == 8) {
                                                                adm5.i.c(n23);
                                                                adm5.j.c(n23);
                                                            }
                                                            else {
                                                                int n57;
                                                                if (b) {
                                                                    n57 = n23 - n54;
                                                                }
                                                                else {
                                                                    n57 = n23 + n54;
                                                                }
                                                                int n58 = n57;
                                                                if (n55 > 0) {
                                                                    n58 = n57;
                                                                    if (n55 >= n2) {
                                                                        if (b) {
                                                                            n58 = n57 - adm5.i.e;
                                                                        }
                                                                        else {
                                                                            n58 = n57 + adm5.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    adm5.j.c(n58);
                                                                }
                                                                else {
                                                                    adm5.i.c(n58);
                                                                }
                                                                final ade f5 = adm5.f;
                                                                int n60;
                                                                final int n59 = n60 = f5.f;
                                                                if (adm5.k == 3) {
                                                                    n60 = n59;
                                                                    if (adm5.c == 1) {
                                                                        n60 = Math.min(n59, f5.m);
                                                                    }
                                                                }
                                                                int n61;
                                                                if (b) {
                                                                    n61 = n58 - n60;
                                                                }
                                                                else {
                                                                    n61 = n58 + n60;
                                                                }
                                                                if (b) {
                                                                    adm5.i.c(n61);
                                                                }
                                                                else {
                                                                    adm5.j.c(n61);
                                                                }
                                                                n23 = n61;
                                                                if (n55 < n3) {
                                                                    n23 = n61;
                                                                    if (n55 < n4) {
                                                                        if (b) {
                                                                            n23 = n61 - -adm5.j.e;
                                                                        }
                                                                        else {
                                                                            n23 = n61 + -adm5.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    if (b2 == 2) {
                                                        float n62;
                                                        if (this.g == 0) {
                                                            n62 = this.d.ae;
                                                        }
                                                        else {
                                                            n62 = this.d.af;
                                                        }
                                                        float n63 = n62;
                                                        if (b) {
                                                            n63 = 1.0f - n62;
                                                        }
                                                        int n64 = (int)((n - n41) * n63 + 0.5f);
                                                        if (n64 < 0 || n42 > 0) {
                                                            n64 = 0;
                                                        }
                                                        int n65;
                                                        if (b) {
                                                            n65 = n23 - n64;
                                                        }
                                                        else {
                                                            n65 = n23 + n64;
                                                        }
                                                        for (int n66 = 0; n66 < size; ++n66) {
                                                            int n67;
                                                            if (b) {
                                                                n67 = size - (n66 + 1);
                                                            }
                                                            else {
                                                                n67 = n66;
                                                            }
                                                            final adm adm6 = this.a.get(n67);
                                                            if (adm6.d.ah == 8) {
                                                                adm6.i.c(n65);
                                                                adm6.j.c(n65);
                                                            }
                                                            else {
                                                                int n68 = n65;
                                                                if (n66 > 0) {
                                                                    n68 = n65;
                                                                    if (n66 >= n2) {
                                                                        if (b) {
                                                                            n68 = n65 - adm6.i.e;
                                                                        }
                                                                        else {
                                                                            n68 = n65 + adm6.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    adm6.j.c(n68);
                                                                }
                                                                else {
                                                                    adm6.i.c(n68);
                                                                }
                                                                final ade f6 = adm6.f;
                                                                int n69 = f6.f;
                                                                if (adm6.k == 3 && adm6.c == 1) {
                                                                    n69 = f6.m;
                                                                }
                                                                int n70;
                                                                if (b) {
                                                                    n70 = n68 - n69;
                                                                }
                                                                else {
                                                                    n70 = n68 + n69;
                                                                }
                                                                if (b) {
                                                                    adm6.i.c(n70);
                                                                }
                                                                else {
                                                                    adm6.j.c(n70);
                                                                }
                                                                n65 = n70;
                                                                if (n66 < n3) {
                                                                    n65 = n70;
                                                                    if (n66 < n4) {
                                                                        if (b) {
                                                                            n65 = n70 - -adm6.j.e;
                                                                        }
                                                                        else {
                                                                            n65 = n70 + -adm6.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                }
                                            }
                                            int n21 = 0;
                                            int n6 = 0;
                                            final int n20 = 0;
                                            float n9 = 0.0f;
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
            final adm adm = (adm)a.get(i);
            sb.append("<");
            sb.append(adm);
            sb.append("> ");
        }
        return sb.toString();
    }
}
