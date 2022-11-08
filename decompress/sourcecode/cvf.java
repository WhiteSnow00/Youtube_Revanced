import android.graphics.PointF;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvf implements cve, cvl, cvc
{
    private final Path a;
    private final String b;
    private final cuh c;
    private final boolean d;
    private final cvq e;
    private final cvq f;
    private final cvq g;
    private final cvq h;
    private final cvq i;
    private final cvq j;
    private final cvq k;
    private boolean l;
    private final int m;
    private final cxz n;
    
    public cvf(final cuh c, final cxo cxo, final cxe cxe) {
        this.a = new Path();
        this.n = new cxz();
        this.c = c;
        this.b = cxe.a;
        final int j = cxe.j;
        this.m = j;
        this.d = cxe.i;
        final cvq a = cxe.b.a();
        this.e = a;
        final cvq a2 = cxe.c.a();
        this.f = a2;
        final cvq a3 = cxe.d.a();
        this.g = a3;
        final cvq a4 = cxe.f.a();
        this.i = a4;
        final cvq a5 = cxe.h.a();
        this.k = a5;
        if (j == 1) {
            this.h = cxe.e.a();
            this.j = cxe.g.a();
        }
        else {
            this.h = null;
            this.j = null;
        }
        cxo.h(a);
        cxo.h(a2);
        cxo.h(a3);
        cxo.h(a4);
        cxo.h(a5);
        if (j == 1) {
            cxo.h(this.h);
            cxo.h(this.j);
        }
        a.g((cvl)this);
        a2.g((cvl)this);
        a3.g((cvl)this);
        a4.g((cvl)this);
        a5.g((cvl)this);
        if (j == 1) {
            this.h.g((cvl)this);
            this.j.g((cvl)this);
        }
    }
    
    public final void a(final Object o, final czs d) {
        cvq cvq;
        if (o == cum.u) {
            cvq = this.e;
        }
        else if (o == cum.v) {
            cvq = this.g;
        }
        else if (o == cum.l) {
            cvq = this.f;
        }
        else {
            if (o == cum.w) {
                final cvq h = this.h;
                if (h != null) {
                    h.d = d;
                    return;
                }
            }
            if (o == cum.x) {
                cvq = this.i;
            }
            else {
                if (o == cum.y) {
                    final cvq j = this.j;
                    if (j != null) {
                        j.d = d;
                        return;
                    }
                }
                if (o != cum.z) {
                    return;
                }
                cvq = this.k;
            }
        }
        cvq.d = d;
    }
    
    public final void d() {
        this.l = false;
        this.c.invalidateSelf();
    }
    
    public final void e(final cwi cwi, final int n, final List list, final cwi cwi2) {
        czl.h(cwi, n, list, cwi2, (cvc)this);
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < list.size(); ++i) {
            final cuu cuu = list.get(i);
            if (cuu instanceof cvk) {
                final cvk cvk = (cvk)cuu;
                if (cvk.e == 1) {
                    this.n.d(cvk);
                    cvk.a((cvl)this);
                }
            }
        }
    }
    
    public final String g() {
        return this.b;
    }
    
    public final Path i() {
        if (this.l) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.l = true;
            return this.a;
        }
        final int m = this.m;
        if (m != 0) {
            if (m != 1) {
                final double floor = Math.floor((float)this.e.e());
                final double n = (float)this.g.e();
                Double.isNaN(n);
                final double radians = Math.toRadians(n - 90.0);
                final double n2 = (int)floor;
                final float n3 = (float)this.k.e() / 100.0f;
                final float floatValue = (float)this.i.e();
                final double n4 = floatValue;
                final double cos = Math.cos(radians);
                Double.isNaN(n4);
                float n5 = (float)(n4 * cos);
                final double sin = Math.sin(radians);
                Double.isNaN(n4);
                float n6 = (float)(n4 * sin);
                this.a.moveTo(n5, n6);
                Double.isNaN(n2);
                final double n7 = (float)(6.283185307179586 / n2);
                Double.isNaN(n7);
                double n8 = radians + n7;
                final double ceil = Math.ceil(n2);
                float n10;
                float n11;
                for (int n9 = 0; n9 < ceil; ++n9, n5 = n10, n6 = n11) {
                    final double cos2 = Math.cos(n8);
                    Double.isNaN(n4);
                    n10 = (float)(cos2 * n4);
                    final double sin2 = Math.sin(n8);
                    Double.isNaN(n4);
                    n11 = (float)(sin2 * n4);
                    if (n3 != 0.0f) {
                        final double n12 = (float)(Math.atan2(n6, n5) - 1.5707963267948966);
                        final double cos3 = Math.cos(n12);
                        final double sin3 = Math.sin(n12);
                        final double n13 = (float)(Math.atan2(n11, n10) - 1.5707963267948966);
                        final double cos4 = Math.cos(n13);
                        final double sin4 = Math.sin(n13);
                        final float n14 = floatValue * n3 * 0.25f;
                        this.a.cubicTo(n5 - (float)cos3 * n14, n6 - (float)sin3 * n14, n10 + (float)cos4 * n14, n11 + n14 * (float)sin4, n10, n11);
                    }
                    else {
                        this.a.lineTo(n10, n11);
                    }
                    Double.isNaN(n7);
                    n8 += n7;
                }
                final PointF pointF = (PointF)this.f.e();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
            }
            else {
                final float floatValue2 = (float)this.e.e();
                final double n15 = (float)this.g.e();
                Double.isNaN(n15);
                final double radians2 = Math.toRadians(n15 - 90.0);
                final double n16 = floatValue2;
                Double.isNaN(n16);
                final float n17 = (float)(6.283185307179586 / n16);
                final float n18 = n17 / 2.0f;
                final float n19 = floatValue2 - (int)floatValue2;
                double n20 = radians2;
                if (n19 != 0.0f) {
                    final double n21 = (1.0f - n19) * n18;
                    Double.isNaN(n21);
                    n20 = radians2 + n21;
                }
                final float floatValue3 = (float)this.i.e();
                final float floatValue4 = (float)this.h.e();
                final cvq j = this.j;
                float n22;
                if (j != null) {
                    n22 = (float)j.e() / 100.0f;
                }
                else {
                    n22 = 0.0f;
                }
                final float n23 = (float)this.k.e() / 100.0f;
                float n24;
                float n26;
                float n27;
                double n29;
                if (n19 != 0.0f) {
                    n24 = (floatValue3 - floatValue4) * n19 + floatValue4;
                    final double n25 = n24;
                    final double cos5 = Math.cos(n20);
                    Double.isNaN(n25);
                    n26 = (float)(n25 * cos5);
                    final double sin5 = Math.sin(n20);
                    Double.isNaN(n25);
                    n27 = (float)(n25 * sin5);
                    this.a.moveTo(n26, n27);
                    final double n28 = n17 * n19 / 2.0f;
                    Double.isNaN(n28);
                    n29 = n20 + n28;
                }
                else {
                    final double n30 = floatValue3;
                    final double cos6 = Math.cos(n20);
                    Double.isNaN(n30);
                    n26 = (float)(cos6 * n30);
                    final double sin6 = Math.sin(n20);
                    Double.isNaN(n30);
                    n27 = (float)(n30 * sin6);
                    this.a.moveTo(n26, n27);
                    final double n31 = n18;
                    Double.isNaN(n31);
                    n29 = n20 + n31;
                    n24 = 0.0f;
                }
                final double ceil2 = Math.ceil(n16);
                final double n32 = ceil2 + ceil2;
                boolean b = false;
                int n33 = 0;
                float n34 = n26;
                float n35 = n27;
                final float n36 = floatValue4;
                final float n37 = n23;
                final float n38 = floatValue3;
                while (true) {
                    final double n39 = n33;
                    if (n39 >= n32) {
                        break;
                    }
                    float n40;
                    if (!b) {
                        n40 = n36;
                    }
                    else {
                        n40 = n38;
                    }
                    float n41;
                    if (n24 != 0.0f && n39 == n32 - 2.0) {
                        n41 = n17 * n19 / 2.0f;
                    }
                    else {
                        n41 = n18;
                    }
                    float n42;
                    if (n24 != 0.0f && n39 == n32 - 1.0) {
                        n42 = n24;
                    }
                    else {
                        n42 = n40;
                    }
                    final float n43 = n41;
                    final double n44 = n42;
                    final double cos7 = Math.cos(n29);
                    Double.isNaN(n44);
                    final float n45 = (float)(n44 * cos7);
                    final double sin7 = Math.sin(n29);
                    Double.isNaN(n44);
                    final float n46 = (float)(n44 * sin7);
                    if (n22 == 0.0f && n37 == 0.0f) {
                        this.a.lineTo(n45, n46);
                    }
                    else {
                        final double n47 = n35;
                        final float n48 = n37;
                        float n49 = n22;
                        final double n50 = (float)(Math.atan2(n47, n34) - 1.5707963267948966);
                        final float n51 = (float)Math.cos(n50);
                        final float n52 = (float)Math.sin(n50);
                        final double n53 = n46;
                        final float n54 = n46;
                        final double n55 = (float)(Math.atan2(n53, n45) - 1.5707963267948966);
                        final float n56 = (float)Math.cos(n55);
                        final float n57 = (float)Math.sin(n55);
                        float n58;
                        if (!b) {
                            n58 = n48;
                        }
                        else {
                            n58 = n49;
                        }
                        if (b) {
                            n49 = n48;
                        }
                        float n59;
                        if (!b) {
                            n59 = n38;
                        }
                        else {
                            n59 = n36;
                        }
                        final float n60 = n59 * n58 * 0.47829f;
                        final float n61 = n51 * n60;
                        final float n62 = n60 * n52;
                        final float n63 = n40 * n49 * 0.47829f;
                        final float n64 = n56 * n63;
                        final float n65 = n63 * n57;
                        float n66 = n64;
                        float n67 = n61;
                        float n68 = n65;
                        float n69 = n62;
                        if (n19 != 0.0f) {
                            if (n33 == 0) {
                                n67 = n61 * n19;
                                n69 = n62 * n19;
                                n66 = n64;
                                n68 = n65;
                            }
                            else {
                                n66 = n64;
                                n67 = n61;
                                n68 = n65;
                                n69 = n62;
                                if (n39 == n32 - 1.0) {
                                    n66 = n64 * n19;
                                    n68 = n65 * n19;
                                    n69 = n62;
                                    n67 = n61;
                                }
                            }
                        }
                        this.a.cubicTo(n34 - n67, n35 - n69, n45 + n66, n54 + n68, n45, n54);
                    }
                    final double n70 = n43;
                    Double.isNaN(n70);
                    n29 += n70;
                    b ^= true;
                    ++n33;
                    n34 = n45;
                    n35 = n46;
                }
                final PointF pointF2 = (PointF)this.f.e();
                this.a.offset(pointF2.x, pointF2.y);
                this.a.close();
            }
            this.a.close();
            this.n.e(this.a);
            this.l = true;
            return this.a;
        }
        throw null;
    }
}
