import java.util.Collections;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvi implements cux, cvf, cvc, cvm, cvd
{
    private final Matrix a;
    private final Path b;
    private final cui c;
    private final cxp d;
    private final String e;
    private final boolean f;
    private final cvr g;
    private final cvr h;
    private final cwe i;
    private cuw j;
    
    public cvi(final cui c, final cxp d, final cxh cxh) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = c;
        this.d = d;
        this.e = cxh.a;
        this.f = cxh.e;
        final cvr a = cxh.b.a();
        d.h(this.g = a);
        a.g((cvm)this);
        final cvr a2 = cxh.c.a();
        d.h(this.h = a2);
        a2.g((cvm)this);
        final cwe b = cxh.d.b();
        (this.i = b).c(d);
        b.d((cvm)this);
    }
    
    public final void a(final Object o, final czt d) {
        if (this.i.e(o, d)) {
            return;
        }
        cvr cvr;
        if (o == cun.s) {
            cvr = this.g;
        }
        else {
            if (o != cun.t) {
                return;
            }
            cvr = this.h;
        }
        cvr.d = d;
    }
    
    @Override
    public final void b(final Canvas canvas, final Matrix matrix, final int n) {
        final float floatValue = (float)this.g.e();
        final float floatValue2 = (float)this.h.e();
        final float n2 = (float)this.i.h.e() / 100.0f;
        final float n3 = (float)this.i.i.e() / 100.0f;
        int n4 = (int)floatValue;
        while (--n4 >= 0) {
            this.a.set(matrix);
            final Matrix a = this.a;
            final cwe i = this.i;
            final float n5 = (float)n4;
            a.preConcat(i.b(n5 + floatValue2));
            this.j.b(canvas, this.a, (int)(n * czm.c(n2, n3, n5 / floatValue)));
        }
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.j.c(rectF, matrix, b);
    }
    
    public final void d() {
        this.c.invalidateSelf();
    }
    
    public final void e(final cwj cwj, final int n, final List list, final cwj cwj2) {
        czm.h(cwj, n, list, cwj2, (cvd)this);
    }
    
    public final void f(final List list, final List list2) {
        this.j.f(list, list2);
    }
    
    public final String g() {
        return this.e;
    }
    
    public final void h(final ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {}
            final ArrayList list = new ArrayList();
            while (listIterator.hasPrevious()) {
                list.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(list);
            this.j = new cuw(this.c, this.d, "Repeater", this.f, list, null);
        }
    }
    
    @Override
    public final Path i() {
        final Path i = this.j.i();
        this.b.reset();
        final float floatValue = (float)this.g.e();
        final float floatValue2 = (float)this.h.e();
        int n = (int)floatValue;
        while (--n >= 0) {
            this.a.set(this.i.b(n + floatValue2));
            this.b.addPath(i, this.a);
        }
        return this.b;
    }
}
