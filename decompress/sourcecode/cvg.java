import android.graphics.PointF;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvg implements cvl, cvc, cve
{
    private final Path a;
    private final RectF b;
    private final String c;
    private final boolean d;
    private final cuh e;
    private final cvq f;
    private final cvq g;
    private final cvq h;
    private boolean i;
    private final cxz j;
    
    public cvg(final cuh e, final cxo cxo, final cxf cxf) {
        this.a = new Path();
        this.b = new RectF();
        this.j = new cxz();
        this.c = cxf.a;
        this.d = cxf.e;
        this.e = e;
        final cvq a = cxf.b.a();
        this.f = a;
        final cvq a2 = cxf.c.a();
        this.g = a2;
        final cvq a3 = cxf.d.a();
        this.h = a3;
        cxo.h(a);
        cxo.h(a2);
        cxo.h(a3);
        a.g((cvl)this);
        a2.g((cvl)this);
        a3.g((cvl)this);
    }
    
    public final void a(final Object o, final czs d) {
        cvq cvq;
        if (o == cum.j) {
            cvq = this.g;
        }
        else if (o == cum.l) {
            cvq = this.f;
        }
        else {
            if (o != cum.k) {
                return;
            }
            cvq = this.h;
        }
        cvq.d = d;
    }
    
    public final void d() {
        this.i = false;
        this.e.invalidateSelf();
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
                    this.j.d(cvk);
                    cvk.a((cvl)this);
                }
            }
        }
    }
    
    public final String g() {
        return this.c;
    }
    
    public final Path i() {
        if (this.i) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.i = true;
            return this.a;
        }
        final PointF pointF = (PointF)this.g.e();
        final float n = pointF.x / 2.0f;
        final float n2 = pointF.y / 2.0f;
        final float k = ((cvs)this.h).k();
        final float min = Math.min(n, n2);
        float n3 = k;
        if (k > min) {
            n3 = min;
        }
        final PointF pointF2 = (PointF)this.f.e();
        this.a.moveTo(pointF2.x + n, pointF2.y - n2 + n3);
        this.a.lineTo(pointF2.x + n, pointF2.y + n2 - n3);
        if (n3 > 0.0f) {
            final float n4 = n3 + n3;
            this.b.set(pointF2.x + n - n4, pointF2.y + n2 - n4, pointF2.x + n, pointF2.y + n2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - n + n3, pointF2.y + n2);
        if (n3 > 0.0f) {
            final float n5 = n3 + n3;
            this.b.set(pointF2.x - n, pointF2.y + n2 - n5, pointF2.x - n + n5, pointF2.y + n2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - n, pointF2.y - n2 + n3);
        if (n3 > 0.0f) {
            final float n6 = n3 + n3;
            this.b.set(pointF2.x - n, pointF2.y - n2, pointF2.x - n + n6, pointF2.y - n2 + n6);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x + n - n3, pointF2.y - n2);
        if (n3 > 0.0f) {
            final float n7 = n3 + n3;
            this.b.set(pointF2.x + n - n7, pointF2.y - n2, pointF2.x + n, pointF2.y - n2 + n7);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.j.e(this.a);
        this.i = true;
        return this.a;
    }
}
