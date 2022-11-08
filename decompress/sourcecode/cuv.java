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

public final class cuv implements cuw, cve, cvl, cwj
{
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final boolean e;
    private final List f;
    private final cuh g;
    private List h;
    private cwd i;
    
    public cuv(final cuh cuh, final cxo cxo, final cxj cxj) {
        final String a = cxj.a;
        final boolean c = cxj.c;
        final List b = cxj.b;
        final ArrayList list = new ArrayList(b.size());
        final int n = 0;
        for (int i = 0; i < b.size(); ++i) {
            final cuu a2 = b.get(i).a(cuh, cxo);
            if (a2 != null) {
                list.add((Object)a2);
            }
        }
        final List b2 = cxj.b;
        while (true) {
            for (int j = n; j < b2.size(); ++j) {
                final cxa cxa = b2.get(j);
                if (cxa instanceof cww) {
                    final cww cww = (cww)cxa;
                    this(cuh, cxo, a, c, list, cww);
                    return;
                }
            }
            final cww cww = null;
            continue;
        }
    }
    
    public cuv(final cuh g, final cxo cxo, final String d, final boolean e, final List f, final cww cww) {
        new cus();
        new RectF();
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = d;
        this.g = g;
        this.e = e;
        this.f = f;
        if (cww != null) {
            (this.i = cww.b()).c(cxo);
            this.i.d((cvl)this);
        }
        final ArrayList list = new ArrayList();
        int size = f.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final cuu cuu = f.get(n);
            size = n;
            if (!(cuu instanceof cvb)) {
                continue;
            }
            list.add(cuu);
            size = n;
        }
        int size2 = list.size();
        while (--size2 >= 0) {
            ((cvb)list.get(size2)).h((ListIterator)f.listIterator(f.size()));
        }
    }
    
    public final void a(final Object o, final czs czs) {
        final cwd i = this.i;
        if (i != null) {
            i.e(o, czs);
        }
    }
    
    public final void b(final Canvas canvas, final Matrix matrix, int size) {
        if (this.e) {
            return;
        }
        this.a.set(matrix);
        final cwd i = this.i;
        int n = size;
        if (i != null) {
            this.a.preConcat(i.a());
            final cvq e = this.i.e;
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
            if (!(value instanceof cuw)) {
                continue;
            }
            ((cuw)value).b(canvas, this.a, n);
            size = n2;
        }
    }
    
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        this.a.set(matrix);
        final cwd i = this.i;
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
            final cuu cuu = this.f.get(n);
            size = n;
            if (!(cuu instanceof cuw)) {
                continue;
            }
            ((cuw)cuu).c(this.c, this.a, b);
            rectF.union(this.c);
            size = n;
        }
    }
    
    public final void d() {
        this.g.invalidateSelf();
    }
    
    public final void e(final cwi cwi, final int n, final List list, cwi cwi2) {
        if (!cwi.e(this.d, n) && !"__container".equals(this.d)) {
            return;
        }
        cwi b = cwi2;
        if (!"__container".equals(this.d)) {
            cwi2 = (b = cwi2.b(this.d));
            if (cwi.d(this.d, n)) {
                list.add(cwi2.c((cwj)this));
                b = cwi2;
            }
        }
        if (cwi.f(this.d, n)) {
            final int a = cwi.a(this.d, n);
            for (int i = 0; i < this.f.size(); ++i) {
                final cuu cuu = this.f.get(i);
                if (cuu instanceof cwj) {
                    ((cwj)cuu).e(cwi, n + a, list, b);
                }
            }
        }
    }
    
    public final void f(final List list, final List list2) {
        final ArrayList list3 = new ArrayList(list.size() + this.f.size());
        list3.addAll(list);
        int size = this.f.size();
        while (--size >= 0) {
            final cuu cuu = this.f.get(size);
            cuu.f((List)list3, (List)this.f.subList(0, size));
            list3.add(cuu);
        }
    }
    
    public final String g() {
        throw null;
    }
    
    final Matrix h() {
        final cwd i = this.i;
        if (i != null) {
            return i.a();
        }
        this.a.reset();
        return this.a;
    }
    
    public final Path i() {
        this.a.reset();
        final cwd i = this.i;
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
            final cuu cuu = this.f.get(n);
            size = n;
            if (!(cuu instanceof cve)) {
                continue;
            }
            this.b.addPath(((cve)cuu).i(), this.a);
            size = n;
        }
        return this.b;
    }
    
    final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.f.size(); ++i) {
                final cuu cuu = this.f.get(i);
                if (cuu instanceof cve) {
                    this.h.add(cuu);
                }
            }
        }
        return this.h;
    }
}
