import java.util.ListIterator;
import android.graphics.Path$Op;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvd implements cve, cvb
{
    private final Path a;
    private final Path b;
    private final Path c;
    private final List d;
    private final cxd e;
    
    public cvd(final cxd e) {
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
        this.d = new ArrayList();
        this.e = e;
    }
    
    private final void a(final Path$Op path$Op) {
        this.b.reset();
        this.a.reset();
        int size = this.d.size();
        while (true) {
            final int n = size - 1;
            if (n <= 0) {
                break;
            }
            final cve cve = this.d.get(n);
            if (cve instanceof cuv) {
                final cuv cuv = (cuv)cve;
                final List j = cuv.j();
                int size2 = j.size();
                while (true) {
                    final int n2 = size2 - 1;
                    size = n;
                    if (n2 < 0) {
                        break;
                    }
                    final Path i = j.get(n2).i();
                    i.transform(cuv.h());
                    this.b.addPath(i);
                    size2 = n2;
                }
            }
            else {
                this.b.addPath(cve.i());
                size = n;
            }
        }
        final List d = this.d;
        int k = 0;
        final cve cve2 = d.get(0);
        if (cve2 instanceof cuv) {
            final cuv cuv2 = (cuv)cve2;
            for (List l = cuv2.j(); k < l.size(); ++k) {
                final Path m = l.get(k).i();
                m.transform(cuv2.h());
                this.a.addPath(m);
            }
        }
        else {
            this.a.set(cve2.i());
        }
        this.c.op(this.a, this.b, path$Op);
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < this.d.size(); ++i) {
            ((cve)this.d.get(i)).f(list, list2);
        }
    }
    
    public final String g() {
        throw null;
    }
    
    public final void h(final ListIterator listIterator) {
        while (true) {
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() != this) {
                    continue;
                }
                while (listIterator.hasPrevious()) {
                    final cuu cuu = listIterator.previous();
                    if (cuu instanceof cve) {
                        this.d.add(cuu);
                        listIterator.remove();
                    }
                }
                return;
            }
            continue;
        }
    }
    
    public final Path i() {
        this.c.reset();
        final cxd e = this.e;
        if (e.a) {
            return this.c;
        }
        final int b = e.b;
        final int n = b - 1;
        if (b != 0) {
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n == 4) {
                                this.a(Path$Op.XOR);
                            }
                        }
                        else {
                            this.a(Path$Op.INTERSECT);
                        }
                    }
                    else {
                        this.a(Path$Op.REVERSE_DIFFERENCE);
                    }
                }
                else {
                    this.a(Path$Op.UNION);
                }
            }
            else {
                for (int i = 0; i < this.d.size(); ++i) {
                    this.c.addPath(((cve)this.d.get(i)).i());
                }
            }
            return this.c;
        }
        throw null;
    }
}
