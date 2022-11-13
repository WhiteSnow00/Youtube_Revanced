import android.graphics.PointF;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvg implements cvf, cvm, cvd
{
    private final Path a;
    private final String b;
    private final cui c;
    private final boolean d;
    private final cvr e;
    private final cvr f;
    private final cvr g;
    private final cvr h;
    private final cvr i;
    private final cvr j;
    private final cvr k;
    private boolean l;
    private final int m;
    private final cya n;
    
    public cvg(final cui c, final cxp cxp, final cxf cxf) {
        this.a = new Path();
        this.n = new cya();
        this.c = c;
        this.b = cxf.a;
        final int j = cxf.j;
        this.m = j;
        this.d = cxf.i;
        final cvr a = cxf.b.a();
        this.e = a;
        final cvr a2 = cxf.c.a();
        this.f = a2;
        final cvr a3 = cxf.d.a();
        this.g = a3;
        final cvr a4 = cxf.f.a();
        this.i = a4;
        final cvr a5 = cxf.h.a();
        this.k = a5;
        if (j == 1) {
            this.h = cxf.e.a();
            this.j = cxf.g.a();
        }
        else {
            this.h = null;
            this.j = null;
        }
        cxp.h(a);
        cxp.h(a2);
        cxp.h(a3);
        cxp.h(a4);
        cxp.h(a5);
        if (j == 1) {
            cxp.h(this.h);
            cxp.h(this.j);
        }
        a.g((cvm)this);
        a2.g((cvm)this);
        a3.g((cvm)this);
        a4.g((cvm)this);
        a5.g((cvm)this);
        if (j == 1) {
            this.h.g((cvm)this);
            this.j.g((cvm)this);
        }
    }
    
    public final void a(final Object o, final czt d) {
        cvr cvr;
        if (o == cun.u) {
            cvr = this.e;
        }
        else if (o == cun.v) {
            cvr = this.g;
        }
        else if (o == cun.l) {
            cvr = this.f;
        }
        else {
            if (o == cun.w) {
                final cvr h = this.h;
                if (h != null) {
                    h.d = d;
                    return;
                }
            }
            if (o == cun.x) {
                cvr = this.i;
            }
            else {
                if (o == cun.y) {
                    final cvr j = this.j;
                    if (j != null) {
                        j.d = d;
                        return;
                    }
                }
                if (o != cun.z) {
                    return;
                }
                cvr = this.k;
            }
        }
        cvr.d = d;
    }
    
    public final void d() {
        this.l = false;
        this.c.invalidateSelf();
    }
    
    public final void e(final cwj cwj, final int n, final List list, final cwj cwj2) {
        czm.h(cwj, n, list, cwj2, (cvd)this);
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < list.size(); ++i) {
            final cuv cuv = list.get(i);
            if (cuv instanceof cvl) {
                final cvl cvl = (cvl)cuv;
                if (cvl.e == 1) {
                    this.n.d(cvl);
                    cvl.a((cvm)this);
                }
            }
        }
    }
    
    public final String g() {
        return this.b;
    }
    
    @Override
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
                final int n = (int)Math.floor((float)this.e.e());
                final double n2 = (float)this.g.e();
                Double.isNaN(n2);
                final double radians = Math.toRadians(n2 - 90.0);
                final float n3 = (float)this.k.e() / 100.0f;
                final float floatValue = (float)this.i.e();
                final double n4 = floatValue;
                final double cos = Math.cos(radians);
                Double.isNaN(n4);
                final double sin = Math.sin(radians);
                Double.isNaN(n4);
                final Path a = this.a;
                float n5 = (float)(n4 * cos);
                float n6 = (float)(n4 * sin);
                a.moveTo(n5, n6);
                final double n7 = n;
                Double.isNaN(n7);
                final double n8 = (float)(6.283185307179586 / n7);
                Double.isNaN(n8);
                double n9 = radians + n8;
                final double ceil = Math.ceil(n7);
                float n11;
                float n12;
                for (int n10 = 0; n10 < ceil; ++n10, n5 = n11, n9 += n8, n6 = n12) {
                    final double cos2 = Math.cos(n9);
                    Double.isNaN(n4);
                    final double sin2 = Math.sin(n9);
                    Double.isNaN(n4);
                    n11 = (float)(cos2 * n4);
                    n12 = (float)(n4 * sin2);
                    if (n3 != 0.0f) {
                        final double n13 = (float)(Math.atan2(n6, n5) - 1.5707963267948966);
                        final float n14 = (float)Math.cos(n13);
                        final float n15 = (float)Math.sin(n13);
                        final double n16 = (float)(Math.atan2(n12, n11) - 1.5707963267948966);
                        final float n17 = (float)Math.cos(n16);
                        final float n18 = (float)Math.sin(n16);
                        final Path a2 = this.a;
                        final float n19 = floatValue * n3 * 0.25f;
                        a2.cubicTo(n5 - n14 * n19, n6 - n15 * n19, n11 + n17 * n19, n12 + n19 * n18, n11, n12);
                    }
                    else {
                        this.a.lineTo(n11, n12);
                    }
                    Double.isNaN(n8);
                }
                final PointF pointF = (PointF)this.f.e();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
            }
            else {
                final float floatValue2 = (float)this.e.e();
                final double n20 = (float)this.g.e();
                final double n21 = floatValue2;
                final float n22 = floatValue2 - (int)floatValue2;
                Double.isNaN(n21);
                final float n23 = (float)(6.283185307179586 / n21);
                final float n24 = n23 / 2.0f;
                Double.isNaN(n20);
                double radians2;
                final double n25 = radians2 = Math.toRadians(n20 - 90.0);
                if (n22 != 0.0f) {
                    final double n26 = (1.0f - n22) * n24;
                    Double.isNaN(n26);
                    radians2 = n25 + n26;
                }
                final float floatValue3 = (float)this.i.e();
                final float floatValue4 = (float)this.h.e();
                final cvr j = this.j;
                float n27;
                if (j != null) {
                    n27 = (float)j.e() / 100.0f;
                }
                else {
                    n27 = 0.0f;
                }
                final float n28 = (float)this.k.e() / 100.0f;
                float n29;
                float n31;
                float n32;
                double n34;
                if (n22 != 0.0f) {
                    n29 = (floatValue3 - floatValue4) * n22 + floatValue4;
                    final double cos3 = Math.cos(radians2);
                    final double n30 = n29;
                    Double.isNaN(n30);
                    final double sin3 = Math.sin(radians2);
                    Double.isNaN(n30);
                    final Path a3 = this.a;
                    n31 = (float)(n30 * cos3);
                    n32 = (float)(n30 * sin3);
                    a3.moveTo(n31, n32);
                    final double n33 = n23 * n22 / 2.0f;
                    Double.isNaN(n33);
                    n34 = radians2 + n33;
                }
                else {
                    final double n35 = floatValue3;
                    final double cos4 = Math.cos(radians2);
                    Double.isNaN(n35);
                    final double sin4 = Math.sin(radians2);
                    Double.isNaN(n35);
                    final Path a4 = this.a;
                    n31 = (float)(cos4 * n35);
                    n32 = (float)(n35 * sin4);
                    a4.moveTo(n31, n32);
                    final double n36 = n24;
                    Double.isNaN(n36);
                    n34 = radians2 + n36;
                    n29 = 0.0f;
                }
                final double ceil2 = Math.ceil(n21);
                final double n37 = ceil2 + ceil2;
                int n38 = 0;
                boolean b = false;
                float n39 = n31;
                final float n40 = floatValue4;
                float n41 = n32;
                while (true) {
                    final double n42 = n38;
                    if (n42 >= n37) {
                        break;
                    }
                    float n43;
                    if (!b) {
                        n43 = n40;
                    }
                    else {
                        n43 = floatValue3;
                    }
                    float n44;
                    if (n29 != 0.0f && n42 == n37 - 2.0) {
                        n44 = n23 * n22 / 2.0f;
                    }
                    else {
                        n44 = n24;
                    }
                    float n45;
                    if (n29 != 0.0f && n42 == n37 - 1.0) {
                        n45 = n29;
                    }
                    else {
                        n45 = n43;
                    }
                    final double cos5 = Math.cos(n34);
                    final double n46 = n45;
                    Double.isNaN(n46);
                    final double sin5 = Math.sin(n34);
                    Double.isNaN(n46);
                    final float n47 = (float)(n46 * cos5);
                    final float n48 = (float)(n46 * sin5);
                    if (n27 == 0.0f && n28 == 0.0f) {
                        this.a.lineTo(n47, n48);
                    }
                    else {
                        final double n49 = (float)(Math.atan2(n41, n39) - 1.5707963267948966);
                        final float n50 = (float)Math.cos(n49);
                        final float n51 = (float)Math.sin(n49);
                        final double n52 = (float)(Math.atan2(n48, n47) - 1.5707963267948966);
                        final float n53 = (float)Math.cos(n52);
                        final float n54 = (float)Math.sin(n52);
                        float n55;
                        if (!b) {
                            n55 = n28;
                        }
                        else {
                            n55 = n27;
                        }
                        float n56;
                        if (!b) {
                            n56 = n27;
                        }
                        else {
                            n56 = n28;
                        }
                        float n57;
                        if (!b) {
                            n57 = floatValue3;
                        }
                        else {
                            n57 = n40;
                        }
                        final float n58 = n57 * n55 * 0.47829f;
                        final float n59 = n50 * n58;
                        final float n60 = n58 * n51;
                        final float n61 = n43 * n56 * 0.47829f;
                        final float n62 = n53 * n61;
                        final float n63 = n61 * n54;
                        float n64 = n59;
                        float n65 = n63;
                        float n66 = n60;
                        float n67 = n62;
                        if (n22 != 0.0f) {
                            if (n38 == 0) {
                                n64 = n59 * n22;
                                n66 = n60 * n22;
                                n65 = n63;
                                n67 = n62;
                            }
                            else {
                                n64 = n59;
                                n65 = n63;
                                n66 = n60;
                                n67 = n62;
                                if (n42 == n37 - 1.0) {
                                    n67 = n62 * n22;
                                    n65 = n63 * n22;
                                    n66 = n60;
                                    n64 = n59;
                                }
                            }
                        }
                        this.a.cubicTo(n39 - n64, n41 - n66, n47 + n67, n48 + n65, n47, n48);
                    }
                    final double n68 = n44;
                    Double.isNaN(n68);
                    b ^= true;
                    ++n38;
                    n39 = n47;
                    n41 = n48;
                    n34 += n68;
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
