import android.graphics.PointF;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cuy implements cvf, cvm, cvd
{
    private final Path a;
    private final String b;
    private final cui c;
    private final cvr d;
    private final cvr e;
    private final cxa f;
    private boolean g;
    private final cya h;
    
    public cuy(final cui c, final cxp cxp, final cxa f) {
        this.a = new Path();
        this.h = new cya();
        this.b = f.a;
        this.c = c;
        final cvr a = f.c.a();
        this.d = a;
        final cvr a2 = f.b.a();
        this.e = a2;
        this.f = f;
        cxp.h(a);
        cxp.h(a2);
        a.g((cvm)this);
        a2.g((cvm)this);
    }
    
    public final void a(final Object o, final czt d) {
        cvr cvr;
        if (o == cun.i) {
            cvr = this.d;
        }
        else {
            if (o != cun.l) {
                return;
            }
            cvr = this.e;
        }
        cvr.d = d;
    }
    
    public final void d() {
        this.g = false;
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
                    this.h.d(cvl);
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
        if (this.g) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.g = true;
            return this.a;
        }
        final PointF pointF = (PointF)this.d.e();
        final float n = pointF.x / 2.0f;
        final float n2 = pointF.y / 2.0f;
        this.a.reset();
        final boolean d = this.f.d;
        final float n3 = n2 * 0.55228f;
        final float n4 = n * 0.55228f;
        if (d) {
            final Path a = this.a;
            final float n5 = -n2;
            a.moveTo(0.0f, n5);
            final Path a2 = this.a;
            final float n6 = -n4;
            final float n7 = -n;
            final float n8 = -n3;
            a2.cubicTo(n6, n5, n7, n8, n7, 0.0f);
            final Path a3 = this.a;
            final float n9 = n3 + 0.0f;
            a3.cubicTo(n7, n9, n6, n2, 0.0f, n2);
            final Path a4 = this.a;
            final float n10 = n4 + 0.0f;
            a4.cubicTo(n10, n2, n, n9, n, 0.0f);
            this.a.cubicTo(n, n8, n10, n5, 0.0f, n5);
        }
        else {
            final Path a5 = this.a;
            final float n11 = -n2;
            a5.moveTo(0.0f, n11);
            final Path a6 = this.a;
            final float n12 = n4 + 0.0f;
            final float n13 = -n3;
            a6.cubicTo(n12, n11, n, n13, n, 0.0f);
            final Path a7 = this.a;
            final float n14 = n3 + 0.0f;
            a7.cubicTo(n, n14, n12, n2, 0.0f, n2);
            final Path a8 = this.a;
            final float n15 = -n4;
            final float n16 = -n;
            a8.cubicTo(n15, n2, n16, n14, n16, 0.0f);
            this.a.cubicTo(n16, n13, n15, n11, 0.0f, n11);
        }
        final PointF pointF2 = (PointF)this.e.e();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.h.e(this.a);
        this.g = true;
        return this.a;
    }
}
