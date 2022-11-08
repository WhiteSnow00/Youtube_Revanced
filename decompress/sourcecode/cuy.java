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

public final class cuy implements cuw, cvl, cvc
{
    private final Path a;
    private final Paint b;
    private final cxo c;
    private final String d;
    private final boolean e;
    private final List f;
    private final cvq g;
    private final cvq h;
    private cvq i;
    private final cuh j;
    
    public cuy(final cuh j, final cxo c, final cxi cxi) {
        final Path a = new Path();
        this.a = a;
        this.b = (Paint)new cus(1);
        this.f = new ArrayList();
        this.c = c;
        this.d = cxi.b;
        this.e = cxi.e;
        this.j = j;
        if (cxi.c != null) {
            a.setFillType(cxi.a);
            final cvq a2 = cxi.c.a();
            (this.g = a2).g((cvl)this);
            c.h(a2);
            final cvq a3 = cxi.d.a();
            (this.h = a3).g((cvl)this);
            c.h(a3);
            return;
        }
        this.g = null;
        this.h = null;
    }
    
    public final void a(final Object o, final czs czs) {
        if (o == cum.a) {
            this.g.d = czs;
            return;
        }
        if (o == cum.d) {
            this.h.d = czs;
            return;
        }
        if (o == cum.E) {
            final cvq i = this.i;
            if (i != null) {
                this.c.j(i);
            }
            (this.i = (cvq)new cwe(czs)).g((cvl)this);
            this.c.h(this.i);
        }
    }
    
    public final void b(final Canvas canvas, final Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((cvr)this.g).k());
        this.b.setAlpha(czl.k((int)(i / 255.0f * (int)this.h.e() / 100.0f * 255.0f)));
        final cvq j = this.i;
        if (j != null) {
            this.b.setColorFilter((ColorFilter)j.e());
        }
        this.a.reset();
        for (i = 0; i < this.f.size(); ++i) {
            this.a.addPath(this.f.get(i).i(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        ctp.a();
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); ++i) {
            this.a.addPath(((cve)this.f.get(i)).i(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
    
    public final void d() {
        this.j.invalidateSelf();
    }
    
    public final void e(final cwi cwi, final int n, final List list, final cwi cwi2) {
        czl.h(cwi, n, list, cwi2, (cvc)this);
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < list2.size(); ++i) {
            final cuu cuu = list2.get(i);
            if (cuu instanceof cve) {
                this.f.add(cuu);
            }
        }
    }
    
    public final String g() {
        return this.d;
    }
}
