import java.util.Collection;
import android.graphics.Canvas;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cuw implements cux, cvf, cvm, cwk
{
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final boolean e;
    private final List f;
    private final cui g;
    private List h;
    private cwe i;
    
    public cuw(final cui cui, final cxp cxp, final cxk cxk) {
        final String a = cxk.a;
        final boolean c = cxk.c;
        final List b = cxk.b;
        final ArrayList list = new ArrayList(b.size());
        final int n = 0;
        for (int i = 0; i < b.size(); ++i) {
            final cuv a2 = b.get(i).a(cui, cxp);
            if (a2 != null) {
                list.add((Object)a2);
            }
        }
        final List b2 = cxk.b;
        while (true) {
            for (int j = n; j < b2.size(); ++j) {
                final cxb cxb = b2.get(j);
                if (cxb instanceof cwx) {
                    final cwx cwx = (cwx)cxb;
                    this(cui, cxp, a, c, list, cwx);
                    return;
                }
            }
            final cwx cwx = null;
            continue;
        }
    }
    
    public cuw(final cui g, final cxp cxp, final String d, final boolean e, final List f, final cwx cwx) {
        new cut();
        new RectF();
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = f;
        if (cwx != null) {
            (this.i = cwx.b()).c(cxp);
            this.i.d((cvm)this);
        }
        final ArrayList list = new ArrayList();
        int size = f.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final cuv cuv = f.get(n);
            size = n;
            if (!(cuv instanceof cvc)) {
                continue;
            }
            list.add(cuv);
            size = n;
        }
        int size2 = list.size();
        while (--size2 >= 0) {
            ((cvc)list.get(size2)).h((ListIterator)f.listIterator(f.size()));
        }
    }
    
    public final void a(final Object o, final czt czt) {
        final cwe i = this.i;
        if (i != null) {
            i.e(o, czt);
        }
    }
    
    @Override
    public final void b(final Canvas canvas, final Matrix matrix, int size) {
        if (this.e) {
            return;
        }
        this.a.set(matrix);
        final cwe i = this.i;
        int n = size;
        if (i != null) {
            this.a.preConcat(i.a());
            final cvr e = this.i.e;
            int intValue;
            if (e == null) {
                intValue = 100;
            }
            else {
                intValue = (int)e.e();
            }
            n = (int)(intValue / 100.0f * size / 255.0f * 255.0f);
        }
        size = this.f.size();
        while (true) {
            final int n2 = size - 1;
            if (n2 < 0) {
                break;
            }
            final Object value = this.f.get(n2);
            size = n2;
            if (!(value instanceof cux)) {
                continue;
            }
            ((cux)value).b(canvas, this.a, n);
            size = n2;
        }
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.a.set(matrix);
        final cwe i = this.i;
        if (i != null) {
            this.a.preConcat(i.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.f.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final cuv cuv = this.f.get(n);
            size = n;
            if (!(cuv instanceof cux)) {
                continue;
            }
            ((cux)cuv).c(this.c, this.a, b);
            rectF.union(this.c);
            size = n;
        }
    }
    
    public final void d() {
        this.g.invalidateSelf();
    }
    
    public final void e(final cwj cwj, final int n, final List list, cwj cwj2) {
        if (!cwj.e(this.d, n) && !"__container".equals(this.d)) {
            return;
        }
        cwj b = cwj2;
        if (!"__container".equals(this.d)) {
            cwj2 = (b = cwj2.b(this.d));
            if (cwj.d(this.d, n)) {
                list.add(cwj2.c((cwk)this));
                b = cwj2;
            }
        }
        if (cwj.f(this.d, n)) {
            final int a = cwj.a(this.d, n);
            for (int i = 0; i < this.f.size(); ++i) {
                final cuv cuv = this.f.get(i);
                if (cuv instanceof cwk) {
                    ((cwk)cuv).e(cwj, n + a, list, b);
                }
            }
        }
    }
    
    public final void f(final List list, final List list2) {
        final ArrayList list3 = new ArrayList(list.size() + this.f.size());
        list3.addAll(list);
        int size = this.f.size();
        while (--size >= 0) {
            final cuv cuv = this.f.get(size);
            cuv.f((List)list3, (List)this.f.subList(0, size));
            list3.add(cuv);
        }
    }
    
    public final String g() {
        throw null;
    }
    
    final Matrix h() {
        final cwe i = this.i;
        if (i != null) {
            return i.a();
        }
        this.a.reset();
        return this.a;
    }
    
    @Override
    public final Path i() {
        this.a.reset();
        final cwe i = this.i;
        if (i != null) {
            this.a.set(i.a());
        }
        this.b.reset();
        if (this.e) {
            return this.b;
        }
        int size = this.f.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final cuv cuv = this.f.get(n);
            size = n;
            if (!(cuv instanceof cvf)) {
                continue;
            }
            this.b.addPath(((cvf)cuv).i(), this.a);
            size = n;
        }
        return this.b;
    }
    
    final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.f.size(); ++i) {
                final cuv cuv = this.f.get(i);
                if (cuv instanceof cvf) {
                    this.h.add(cuv);
                }
            }
        }
        return this.h;
    }
}
