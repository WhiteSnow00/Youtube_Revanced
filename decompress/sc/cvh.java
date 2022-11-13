import android.graphics.PointF;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvh implements cvm, cvd, cvf
{
    private final Path a;
    private final RectF b;
    private final String c;
    private final boolean d;
    private final cui e;
    private final cvr f;
    private final cvr g;
    private final cvr h;
    private boolean i;
    private final cya j;
    
    public cvh(final cui e, final cxp cxp, final cxg cxg) {
        this.a = new Path();
        this.b = new RectF();
        this.j = new cya();
        this.c = cxg.a;
        this.d = cxg.e;
        this.e = e;
        final cvr a = cxg.b.a();
        this.f = a;
        final cvr a2 = cxg.c.a();
        this.g = a2;
        final cvr a3 = cxg.d.a();
        this.h = a3;
        cxp.h(a);
        cxp.h(a2);
        cxp.h(a3);
        a.g((cvm)this);
        a2.g((cvm)this);
        a3.g((cvm)this);
    }
    
    public final void a(final Object o, final czt d) {
        cvr cvr;
        if (o == cun.j) {
            cvr = this.g;
        }
        else if (o == cun.l) {
            cvr = this.f;
        }
        else {
            if (o != cun.k) {
                return;
            }
            cvr = this.h;
        }
        cvr.d = d;
    }
    
    public final void d() {
        this.i = false;
        this.e.invalidateSelf();
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
                    this.j.d(cvl);
                    cvl.a((cvm)this);
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
        final float k = ((cvt)this.h).k();
        final float min = Math.min(n, n2);
        float n3 = k;
        if (k > min) {
            n3 = min;
        }
        final PointF pointF2 = (PointF)this.f.e();
        this.a.moveTo(pointF2.x + n, pointF2.y - n2 + n3);
        this.a.lineTo(pointF2.x + n, pointF2.y + n2 - n3);
        if (n3 > 0.0f) {
            final RectF b = this.b;
            final float x = pointF2.x;
            final float n4 = n3 + n3;
            b.set(x + n - n4, pointF2.y + n2 - n4, pointF2.x + n, pointF2.y + n2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - n + n3, pointF2.y + n2);
        if (n3 > 0.0f) {
            final RectF b2 = this.b;
            final float x2 = pointF2.x;
            final float y = pointF2.y;
            final float n5 = n3 + n3;
            b2.set(x2 - n, y + n2 - n5, pointF2.x - n + n5, pointF2.y + n2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - n, pointF2.y - n2 + n3);
        if (n3 > 0.0f) {
            final RectF b3 = this.b;
            final float x3 = pointF2.x;
            final float y2 = pointF2.y;
            final float x4 = pointF2.x;
            final float n6 = n3 + n3;
            b3.set(x3 - n, y2 - n2, x4 - n + n6, pointF2.y - n2 + n6);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x + n - n3, pointF2.y - n2);
        if (n3 > 0.0f) {
            final RectF b4 = this.b;
            final float x5 = pointF2.x;
            final float n7 = n3 + n3;
            b4.set(x5 + n - n7, pointF2.y - n2, pointF2.x + n, pointF2.y - n2 + n7);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.j.e(this.a);
        this.i = true;
        return this.a;
    }
}
