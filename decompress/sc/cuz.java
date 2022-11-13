import android.graphics.RectF;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Paint;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cuz implements cux, cvm, cvd
{
    private final Path a;
    private final Paint b;
    private final cxp c;
    private final String d;
    private final boolean e;
    private final List f;
    private final cvr g;
    private final cvr h;
    private cvr i;
    private final cui j;
    
    public cuz(final cui j, final cxp c, final cxj cxj) {
        final Path a = new Path();
        this.a = a;
        this.b = (Paint)new cut(1);
        this.f = new ArrayList();
        this.c = c;
        this.d = cxj.b;
        this.e = cxj.e;
        this.j = j;
        if (cxj.c != null) {
            a.setFillType(cxj.a);
            final cvr a2 = cxj.c.a();
            (this.g = a2).g((cvm)this);
            c.h(a2);
            final cvr a3 = cxj.d.a();
            (this.h = a3).g((cvm)this);
            c.h(a3);
            return;
        }
        this.g = null;
        this.h = null;
    }
    
    public final void a(final Object o, final czt czt) {
        if (o == cun.a) {
            this.g.d = czt;
            return;
        }
        if (o == cun.d) {
            this.h.d = czt;
            return;
        }
        if (o == cun.E) {
            final cvr i = this.i;
            if (i != null) {
                this.c.j(i);
            }
            (this.i = new cwf(czt)).g((cvm)this);
            this.c.h(this.i);
        }
    }
    
    @Override
    public final void b(final Canvas canvas, final Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((cvs)this.g).k());
        final float n = (float)i;
        i = (int)this.h.e();
        this.b.setAlpha(czm.k((int)(n / 255.0f * i / 100.0f * 255.0f)));
        final cvr j = this.i;
        if (j != null) {
            this.b.setColorFilter((ColorFilter)j.e());
        }
        this.a.reset();
        for (i = 0; i < this.f.size(); ++i) {
            this.a.addPath(this.f.get(i).i(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        ctq.a();
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); ++i) {
            this.a.addPath(((cvf)this.f.get(i)).i(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    public final void d() {
        this.j.invalidateSelf();
    }
    
    public final void e(final cwj cwj, final int n, final List list, final cwj cwj2) {
        czm.h(cwj, n, list, cwj2, (cvd)this);
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final cuv cuv = list2.get(i);
            if (cuv instanceof cvf) {
                this.f.add(cuv);
            }
        }
    }
    
    public final String g() {
        return this.d;
    }
}
