import java.util.ListIterator;
import android.graphics.Path$Op;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cve implements cvf, cvc
{
    private final Path a;
    private final Path b;
    private final Path c;
    private final List d;
    private final cxe e;
    
    public cve(final cxe e) {
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
            final cvf cvf = this.d.get(n);
            if (cvf instanceof cuw) {
                final cuw cuw = (cuw)cvf;
                final List j = cuw.j();
                int size2 = j.size();
                while (true) {
                    final int n2 = size2 - 1;
                    size = n;
                    if (n2 < 0) {
                        break;
                    }
                    final Path i = j.get(n2).i();
                    i.transform(cuw.h());
                    this.b.addPath(i);
                    size2 = n2;
                }
            }
            else {
                this.b.addPath(cvf.i());
                size = n;
            }
        }
        final List d = this.d;
        int k = 0;
        final cvf cvf2 = d.get(0);
        if (cvf2 instanceof cuw) {
            final cuw cuw2 = (cuw)cvf2;
            for (List l = cuw2.j(); k < l.size(); ++k) {
                final Path m = l.get(k).i();
                m.transform(cuw2.h());
                this.a.addPath(m);
            }
        }
        else {
            this.a.set(cvf2.i());
        }
        this.c.op(this.a, this.b, path$Op);
    }
    
    public final void f(final List list, final List list2) {
        for (int i = 0; i < this.d.size(); ++i) {
            ((cvf)this.d.get(i)).f(list, list2);
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
                    final cuv cuv = listIterator.previous();
                    if (cuv instanceof cvf) {
                        this.d.add(cuv);
                        listIterator.remove();
                    }
                }
                return;
            }
            continue;
        }
    }
    
    @Override
    public final Path i() {
        this.c.reset();
        final cxe e = this.e;
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
                    this.c.addPath(((cvf)this.d.get(i)).i());
                }
            }
            return this.c;
        }
        throw null;
    }
}
