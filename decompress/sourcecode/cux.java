import android.graphics.PointF;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cux implements cve, cvl, cvc
{
    private final Path a;
    private final String b;
    private final cuh c;
    private final cvq d;
    private final cvq e;
    private final cwz f;
    private boolean g;
    private final cxz h;
    
    public cux(final cuh c, final cxo cxo, final cwz f) {
        this.a = new Path();
        this.h = new cxz();
        this.b = f.a;
        this.c = c;
        final cvq a = f.c.a();
        this.d = a;
        final cvq a2 = f.b.a();
        this.e = a2;
        this.f = f;
        cxo.h(a);
        cxo.h(a2);
        a.g((cvl)this);
        a2.g((cvl)this);
    }
    
    public final void a(final Object o, final czs d) {
        cvq cvq;
        if (o == cum.i) {
            cvq = this.d;
        }
        else {
            if (o != cum.l) {
                return;
            }
            cvq = this.e;
        }
        cvq.d = d;
    }
    
    public final void d() {
        this.g = false;
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
                    this.h.d(cvk);
                    cvk.a((cvl)this);
                }
            }
        }
    }
    
    public final String g() {
        return this.b;
    }
    
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
        final float n3 = n * 0.55228f;
        final float n4 = 0.55228f * n2;
        this.a.reset();
        if (this.f.d) {
            final float n5 = -n2;
            this.a.moveTo(0.0f, n5);
            final float n6 = -n3;
            final float n7 = -n;
            final float n8 = -n4;
            this.a.cubicTo(n6, n5, n7, n8, n7, 0.0f);
            final float n9 = n4 + 0.0f;
            this.a.cubicTo(n7, n9, n6, n2, 0.0f, n2);
            final float n10 = n3 + 0.0f;
            this.a.cubicTo(n10, n2, n, n9, n, 0.0f);
            this.a.cubicTo(n, n8, n10, n5, 0.0f, n5);
        }
        else {
            final float n11 = -n2;
            this.a.moveTo(0.0f, n11);
            final float n12 = n3 + 0.0f;
            final float n13 = -n4;
            this.a.cubicTo(n12, n11, n, n13, n, 0.0f);
            final float n14 = n4 + 0.0f;
            this.a.cubicTo(n, n14, n12, n2, 0.0f, n2);
            final float n15 = -n3;
            final float n16 = -n;
            this.a.cubicTo(n15, n2, n16, n14, n16, 0.0f);
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
