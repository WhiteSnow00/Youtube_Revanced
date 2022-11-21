import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adc extends ado
{
    ArrayList a;
    private int b;
    
    public adc(act act, int i) {
        super(act);
        this.a = new ArrayList();
        this.g = i;
        act d = this.d;
        act n;
        for (act = d.n(i); act != null; act = n) {
            n = act.n(this.g);
            d = act;
        }
        this.d = d;
        this.a.add(d.o(this.g));
        for (act = d.m(this.g); act != null; act = act.m(this.g)) {
            this.a.add(act.o(this.g));
        }
        final ArrayList a = this.a;
        int size;
        ado ado;
        int g;
        for (size = a.size(), i = 0; i < size; ++i) {
            ado = (ado)a.get(i);
            g = this.g;
            if (g == 0) {
                ado.d.f = this;
            }
            else if (g == 1) {
                ado.d.g = this;
            }
        }
        if (this.g == 0 && ((acu)this.d.U).c && this.a.size() > 1) {
            final ArrayList a2 = this.a;
            this.d = ((ado)a2.get(a2.size() - 1)).d;
        }
        if (this.g == 0) {
            i = this.d.aj;
        }
        else {
            i = this.d.ak;
        }
        this.b = i;
    }
    
    private final act g() {
        for (int i = 0; i < this.a.size(); ++i) {
            final act d = this.a.get(i).d;
            if (d.ah != 8) {
                return d;
            }
        }
        return null;
    }
    
    private final act n() {
        int size = this.a.size();
        while (--size >= 0) {
            final act d = this.a.get(size).d;
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
            final ado ado = this.a.get(i);
            n = n + ado.i.e + ado.a() + ado.j.e;
            ++i;
        }
        return n;
    }
    
    public final void b() {
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((ado)a.get(i)).b();
        }
        final int size2 = this.a.size();
        if (size2 <= 0) {
            return;
        }
        final act d = this.a.get(0).d;
        final act d2 = this.a.get(size2 - 1).d;
        if (this.g == 0) {
            final acs j = d.J;
            final acs l = d2.L;
            final adf k = l(j, 0);
            int n = j.b();
            final act g = this.g();
            if (g != null) {
                n = g.J.b();
            }
            if (k != null) {
                j(this.i, k, n);
            }
            final adf m = l(l, 0);
            int n2 = l.b();
            final act n3 = this.n();
            if (n3 != null) {
                n2 = n3.L.b();
            }
            if (m != null) {
                j(this.j, m, -n2);
            }
        }
        else {
            final acs k2 = d.K;
            final acs m2 = d2.M;
            final adf l2 = l(k2, 1);
            int n4 = k2.b();
            final act g2 = this.g();
            if (g2 != null) {
                n4 = g2.K.b();
            }
            if (l2 != null) {
                j(this.i, l2, n4);
            }
            final adf l3 = l(m2, 1);
            int n5 = m2.b();
            final act n6 = this.n();
            if (n6 != null) {
                n5 = n6.M.b();
            }
            if (l3 != null) {
                j(this.j, l3, -n5);
            }
        }
        this.i.a = (add)this;
        this.j.a = (add)this;
    }
    
    public final void c() {
        for (int i = 0; i < this.a.size(); ++i) {
            ((ado)this.a.get(i)).c();
        }
    }
    
    public final void d() {
        this.e = null;
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((ado)a.get(i)).d();
        }
    }
    
    public final boolean e() {
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            if (!((ado)this.a.get(i)).e()) {
                return false;
            }
        }
        return true;
    }
    
    public final void f() {
        final adf i = this.i;
        if (i.i) {
            final adf j = this.j;
            if (j.i) {
                final act u = this.d.U;
                final boolean b = u instanceof acu && ((acu)u).c;
                final int n = j.f - i.f;
                while (true) {
                    for (int size = this.a.size(), k = 0; k < size; ++k) {
                        final int n2 = k;
                        if (((ado)this.a.get(k)).d.ah != 8) {
                            while (true) {
                                int l;
                                for (int n3 = l = size - 1; l >= 0; --l) {
                                    final int n4 = l;
                                    if (((ado)this.a.get(l)).d.ah != 8) {
                                        int n5 = 0;
                                        while (true) {
                                            while (n5 < 2) {
                                                int n6 = 0;
                                                int n7 = 0;
                                                int n8 = 0;
                                                int n9 = 0;
                                                float n10 = 0.0f;
                                                while (n7 < size) {
                                                    final ado ado = this.a.get(n7);
                                                    final act d = ado.d;
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
                                                                n16 = n6 + ado.i.e;
                                                            }
                                                        }
                                                        final adg f = ado.f;
                                                        final int f2 = f.f;
                                                        final boolean b2 = ado.k != 3;
                                                        int m = 0;
                                                        boolean b3 = false;
                                                        Label_0447: {
                                                            Label_0435: {
                                                                if (!b2) {
                                                                    if (ado.c == 1 && n5 == 0) {
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
                                                                    break Label_0447;
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
                                                            final int n17 = f2;
                                                            b3 = b2;
                                                            m = n17;
                                                        }
                                                        int n20;
                                                        float n21;
                                                        if (!b3) {
                                                            final int n18 = n8 + 1;
                                                            final float n19 = d.al[this.g];
                                                            n20 = n16;
                                                            n8 = n18;
                                                            n21 = n10;
                                                            if (n19 >= 0.0f) {
                                                                n21 = n10 + n19;
                                                                n20 = n16;
                                                                n8 = n18;
                                                            }
                                                        }
                                                        else {
                                                            n20 = n16 + m;
                                                            n21 = n10;
                                                        }
                                                        n11 = n20;
                                                        n12 = n8;
                                                        n13 = n15;
                                                        n14 = n21;
                                                        if (n7 < n3) {
                                                            n11 = n20;
                                                            n12 = n8;
                                                            n13 = n15;
                                                            n14 = n21;
                                                            if (n7 < n4) {
                                                                n11 = n20 + -ado.j.e;
                                                                n14 = n21;
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
                                                    final int n22 = n9;
                                                    int n23 = n8;
                                                    int n24 = this.i.f;
                                                    if (b) {
                                                        n24 = this.j.f;
                                                    }
                                                    int n25 = n24;
                                                    if (n6 > n) {
                                                        if (b) {
                                                            n25 = n24 + (int)((n6 - n) / 2.0f + 0.5f);
                                                        }
                                                        else {
                                                            n25 = n24 - (int)((n6 - n) / 2.0f + 0.5f);
                                                        }
                                                    }
                                                    int n43;
                                                    if (n23 > 0) {
                                                        final float n26 = (float)(n - n6);
                                                        final float n27 = n26 / n23 + 0.5f;
                                                        int n28 = 0;
                                                        int n29 = 0;
                                                        final int n30 = n25;
                                                        while (n28 < size) {
                                                            final ado ado2 = this.a.get(n28);
                                                            final act d2 = ado2.d;
                                                            if (d2.ah != 8 && ado2.k == 3) {
                                                                final adg f3 = ado2.f;
                                                                if (!f3.i) {
                                                                    int n31 = (int)n27;
                                                                    if (n10 > 0.0f) {
                                                                        n31 = (int)(d2.al[this.g] * n26 / n10 + 0.5f);
                                                                    }
                                                                    int n32;
                                                                    int n33;
                                                                    if (this.g == 0) {
                                                                        n32 = d2.w;
                                                                        n33 = d2.v;
                                                                    }
                                                                    else {
                                                                        n32 = d2.z;
                                                                        n33 = d2.y;
                                                                    }
                                                                    int min;
                                                                    if (ado2.c == 1) {
                                                                        min = Math.min(n31, f3.m);
                                                                    }
                                                                    else {
                                                                        min = n31;
                                                                    }
                                                                    int n35;
                                                                    final int n34 = n35 = Math.max(n33, min);
                                                                    if (n32 > 0) {
                                                                        n35 = Math.min(n32, n34);
                                                                    }
                                                                    int n36 = n31;
                                                                    int n37 = n29;
                                                                    if (n35 != n31) {
                                                                        n37 = n29 + 1;
                                                                        n36 = n35;
                                                                    }
                                                                    ado2.f.c(n36);
                                                                    n29 = n37;
                                                                }
                                                            }
                                                            ++n28;
                                                        }
                                                        if (n29 > 0) {
                                                            final int n38 = n23 - n29;
                                                            int n39 = 0;
                                                            int n40 = 0;
                                                            while (true) {
                                                                n23 = n38;
                                                                n6 = n40;
                                                                if (n39 >= size) {
                                                                    break;
                                                                }
                                                                final ado ado3 = this.a.get(n39);
                                                                if (ado3.d.ah != 8) {
                                                                    int n41 = n40;
                                                                    if (n39 > 0) {
                                                                        n41 = n40;
                                                                        if (n39 >= n2) {
                                                                            n41 = n40 + ado3.i.e;
                                                                        }
                                                                    }
                                                                    final int n42 = n40 = n41 + ado3.f.f;
                                                                    if (n39 < n3) {
                                                                        n40 = n42;
                                                                        if (n39 < n4) {
                                                                            n40 = n42 + -ado3.j.e;
                                                                        }
                                                                    }
                                                                }
                                                                ++n39;
                                                            }
                                                        }
                                                        if (this.b == 2 && n29 == 0) {
                                                            this.b = 0;
                                                            n43 = n6;
                                                            n25 = n30;
                                                        }
                                                        else {
                                                            n43 = n6;
                                                            n25 = n30;
                                                        }
                                                    }
                                                    else {
                                                        n43 = n6;
                                                    }
                                                    if (n43 > n) {
                                                        this.b = 2;
                                                    }
                                                    int n44 = n23;
                                                    if (n22 > 0 && (n44 = n23) == 0) {
                                                        if (n2 == n4) {
                                                            this.b = 2;
                                                        }
                                                        n44 = 0;
                                                    }
                                                    final int b4 = this.b;
                                                    if (b4 == 1) {
                                                        int n45;
                                                        if (n22 > 1) {
                                                            n45 = (n - n43) / (n22 - 1);
                                                        }
                                                        else if (n22 == 1) {
                                                            n45 = (n - n43) / 2;
                                                        }
                                                        else {
                                                            n45 = 0;
                                                        }
                                                        int n46 = n45;
                                                        if (n44 > 0) {
                                                            n46 = 0;
                                                        }
                                                        int n47 = 0;
                                                        int n48 = n25;
                                                        while (n47 < size) {
                                                            int n49;
                                                            if (b) {
                                                                n49 = size - (n47 + 1);
                                                            }
                                                            else {
                                                                n49 = n47;
                                                            }
                                                            final ado ado4 = this.a.get(n49);
                                                            int n50;
                                                            if (ado4.d.ah == 8) {
                                                                ado4.i.c(n48);
                                                                ado4.j.c(n48);
                                                                n50 = n48;
                                                            }
                                                            else {
                                                                int n51 = n48;
                                                                if (n47 > 0) {
                                                                    if (b) {
                                                                        n51 = n48 - n46;
                                                                    }
                                                                    else {
                                                                        n51 = n48 + n46;
                                                                    }
                                                                }
                                                                int n52 = n51;
                                                                if (n47 > 0) {
                                                                    n52 = n51;
                                                                    if (n47 >= n2) {
                                                                        if (b) {
                                                                            n52 = n51 - ado4.i.e;
                                                                        }
                                                                        else {
                                                                            n52 = n51 + ado4.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    ado4.j.c(n52);
                                                                }
                                                                else {
                                                                    ado4.i.c(n52);
                                                                }
                                                                final adg f4 = ado4.f;
                                                                int n54;
                                                                final int n53 = n54 = f4.f;
                                                                if (ado4.k == 3) {
                                                                    n54 = n53;
                                                                    if (ado4.c == 1) {
                                                                        n54 = f4.m;
                                                                    }
                                                                }
                                                                int n55;
                                                                if (b) {
                                                                    n55 = n52 - n54;
                                                                }
                                                                else {
                                                                    n55 = n52 + n54;
                                                                }
                                                                if (b) {
                                                                    ado4.i.c(n55);
                                                                }
                                                                else {
                                                                    ado4.j.c(n55);
                                                                }
                                                                ado4.h = true;
                                                                n50 = n55;
                                                                if (n47 < n3) {
                                                                    n50 = n55;
                                                                    if (n47 < n4) {
                                                                        if (b) {
                                                                            n50 = n55 - -ado4.j.e;
                                                                        }
                                                                        else {
                                                                            n50 = n55 + -ado4.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            ++n47;
                                                            n48 = n50;
                                                        }
                                                        return;
                                                    }
                                                    if (b4 == 0) {
                                                        int n56 = (n - n43) / (n22 + 1);
                                                        if (n44 > 0) {
                                                            n56 = 0;
                                                        }
                                                        for (int n57 = 0; n57 < size; ++n57) {
                                                            int n58;
                                                            if (b) {
                                                                n58 = size - (n57 + 1);
                                                            }
                                                            else {
                                                                n58 = n57;
                                                            }
                                                            final ado ado5 = this.a.get(n58);
                                                            if (ado5.d.ah == 8) {
                                                                ado5.i.c(n25);
                                                                ado5.j.c(n25);
                                                            }
                                                            else {
                                                                int n59;
                                                                if (b) {
                                                                    n59 = n25 - n56;
                                                                }
                                                                else {
                                                                    n59 = n25 + n56;
                                                                }
                                                                int n60 = n59;
                                                                if (n57 > 0) {
                                                                    n60 = n59;
                                                                    if (n57 >= n2) {
                                                                        if (b) {
                                                                            n60 = n59 - ado5.i.e;
                                                                        }
                                                                        else {
                                                                            n60 = n59 + ado5.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    ado5.j.c(n60);
                                                                }
                                                                else {
                                                                    ado5.i.c(n60);
                                                                }
                                                                final adg f5 = ado5.f;
                                                                int n62;
                                                                final int n61 = n62 = f5.f;
                                                                if (ado5.k == 3) {
                                                                    n62 = n61;
                                                                    if (ado5.c == 1) {
                                                                        n62 = Math.min(n61, f5.m);
                                                                    }
                                                                }
                                                                int n63;
                                                                if (b) {
                                                                    n63 = n60 - n62;
                                                                }
                                                                else {
                                                                    n63 = n60 + n62;
                                                                }
                                                                if (b) {
                                                                    ado5.i.c(n63);
                                                                }
                                                                else {
                                                                    ado5.j.c(n63);
                                                                }
                                                                n25 = n63;
                                                                if (n57 < n3) {
                                                                    n25 = n63;
                                                                    if (n57 < n4) {
                                                                        if (b) {
                                                                            n25 = n63 - -ado5.j.e;
                                                                        }
                                                                        else {
                                                                            n25 = n63 + -ado5.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    if (b4 == 2) {
                                                        float n64;
                                                        if (this.g == 0) {
                                                            n64 = this.d.ae;
                                                        }
                                                        else {
                                                            n64 = this.d.af;
                                                        }
                                                        float n65 = n64;
                                                        if (b) {
                                                            n65 = 1.0f - n64;
                                                        }
                                                        int n66 = (int)((n - n43) * n65 + 0.5f);
                                                        if (n66 < 0 || n44 > 0) {
                                                            n66 = 0;
                                                        }
                                                        int n67;
                                                        if (b) {
                                                            n67 = n25 - n66;
                                                        }
                                                        else {
                                                            n67 = n25 + n66;
                                                        }
                                                        for (int n68 = 0; n68 < size; ++n68) {
                                                            int n69;
                                                            if (b) {
                                                                n69 = size - (n68 + 1);
                                                            }
                                                            else {
                                                                n69 = n68;
                                                            }
                                                            final ado ado6 = this.a.get(n69);
                                                            if (ado6.d.ah == 8) {
                                                                ado6.i.c(n67);
                                                                ado6.j.c(n67);
                                                            }
                                                            else {
                                                                int n70 = n67;
                                                                if (n68 > 0) {
                                                                    n70 = n67;
                                                                    if (n68 >= n2) {
                                                                        if (b) {
                                                                            n70 = n67 - ado6.i.e;
                                                                        }
                                                                        else {
                                                                            n70 = n67 + ado6.i.e;
                                                                        }
                                                                    }
                                                                }
                                                                if (b) {
                                                                    ado6.j.c(n70);
                                                                }
                                                                else {
                                                                    ado6.i.c(n70);
                                                                }
                                                                final adg f6 = ado6.f;
                                                                int n71 = f6.f;
                                                                if (ado6.k == 3 && ado6.c == 1) {
                                                                    n71 = f6.m;
                                                                }
                                                                int n72;
                                                                if (b) {
                                                                    n72 = n70 - n71;
                                                                }
                                                                else {
                                                                    n72 = n70 + n71;
                                                                }
                                                                if (b) {
                                                                    ado6.i.c(n72);
                                                                }
                                                                else {
                                                                    ado6.j.c(n72);
                                                                }
                                                                n67 = n72;
                                                                if (n68 < n3) {
                                                                    n67 = n72;
                                                                    if (n68 < n4) {
                                                                        if (b) {
                                                                            n67 = n72 - -ado6.j.e;
                                                                        }
                                                                        else {
                                                                            n67 = n72 + -ado6.j.e;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return;
                                                }
                                            }
                                            int n23 = 0;
                                            int n6 = 0;
                                            final int n22 = 0;
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
            final ado ado = (ado)a.get(i);
            sb.append("<");
            sb.append(ado);
            sb.append("> ");
        }
        return sb.toString();
    }
}
