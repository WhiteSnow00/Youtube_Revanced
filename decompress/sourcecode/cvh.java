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

public final class cvh implements cuw, cve, cvb, cvl, cvc
{
    private final Matrix a;
    private final Path b;
    private final cuh c;
    private final cxo d;
    private final String e;
    private final boolean f;
    private final cvq g;
    private final cvq h;
    private final cwd i;
    private cuv j;
    
    public cvh(final cuh c, final cxo d, final cxg cxg) {
        this.a = new Matrix();
        this.b = new Path();
        this.c = c;
        this.d = d;
        this.e = cxg.a;
        this.f = cxg.e;
        final cvq a = cxg.b.a();
        d.h(this.g = a);
        a.g((cvl)this);
        final cvq a2 = cxg.c.a();
        d.h(this.h = a2);
        a2.g((cvl)this);
        final cwd b = cxg.d.b();
        (this.i = b).c(d);
        b.d((cvl)this);
    }
    
    public final void a(final Object o, final czs d) {
        if (this.i.e(o, d)) {
            return;
        }
        cvq cvq;
        if (o == cum.s) {
            cvq = this.g;
        }
        else {
            if (o != cum.t) {
                return;
            }
            cvq = this.h;
        }
        cvq.d = d;
    }
    
    public final void b(final Canvas canvas, final Matrix matrix, final int n) {
        final float floatValue = (float)this.g.e();
        final float floatValue2 = (float)this.h.e();
        final float n2 = (float)this.i.h.e() / 100.0f;
        final float n3 = (float)this.i.i.e() / 100.0f;
        int n4 = (int)floatValue;
        while (--n4 >= 0) {
            this.a.set(matrix);
            final float n5 = (float)n4;
            this.a.preConcat(this.i.b(n5 + floatValue2));
            this.j.b(canvas, this.a, (int)(n * czl.c(n2, n3, n5 / floatValue)));
        }
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.j.c(rectF, matrix, b);
    }
    
    public final void d() {
        this.c.invalidateSelf();
    }
    
    public final void e(final cwi cwi, final int n, final List list, final cwi cwi2) {
        czl.h(cwi, n, list, cwi2, (cvc)this);
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
            this.j = new cuv(this.c, this.d, "Repeater", this.f, list, null);
        }
    }
    
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
