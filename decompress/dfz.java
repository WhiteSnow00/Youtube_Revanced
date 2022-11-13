import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.io.File;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dfz implements dfa, ddx
{
    private final dez a;
    private final dfb b;
    private int c;
    private int d;
    private ddk e;
    private List f;
    private int g;
    private File h;
    private dga i;
    private volatile aln j;
    
    public dfz(final dfb b, final dez a) {
        this.d = -1;
        this.b = b;
        this.a = a;
    }
    
    private final boolean d() {
        return this.g < this.f.size();
    }
    
    public final void a() {
        final aln j = this.j;
        if (j != null) {
            ((ddy)j.b).lq();
        }
    }
    
    public final void b(final Object o) {
        this.a.d(this.e, o, (ddy)this.j.b, 4, (ddk)this.i);
    }
    
    public final boolean c() {
        try {
            final List e = this.b.e();
            final boolean empty = e.isEmpty();
            boolean b = false;
            if (empty) {
                return false;
            }
            final dfb b2 = this.b;
            final dcg a = b2.c.a();
            final Class<?> class1 = b2.d.getClass();
            final Class g = b2.g;
            final Class j = b2.j;
            final eab f = a.f;
            dpf dpf = ((AtomicReference)f.b).getAndSet(null);
            if (dpf == null) {
                dpf = new dpf((Class)class1, g, j);
            }
            else {
                dpf.a((Class)class1, g, j);
            }
            Object o = f.a;
            synchronized (o) {
                final List list = (List)((abo)f.a).get(dpf);
                monitorexit(o);
                ((AtomicReference)f.b).set(dpf);
                final List list2 = list;
                if (list == null) {
                    final ArrayList list3 = new ArrayList();
                    final Iterator iterator = a.c.f((Class)class1).iterator();
                    while (iterator.hasNext()) {
                        o = a.e.e((Class)iterator.next(), g).iterator();
                        while (((Iterator)o).hasNext()) {
                            final Class clazz = (Class)((Iterator)o).next();
                            if (!a.d.b(clazz, j).isEmpty() && !list3.contains(clazz)) {
                                list3.add(clazz);
                            }
                        }
                    }
                    final eab f2 = a.f;
                    final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list3);
                    synchronized (f2.a) {
                        final Object a2 = f2.a;
                        o = new dpf((Class)class1, g, j);
                        ((abo)a2).put(o, unmodifiableList);
                    }
                }
                if (!list2.isEmpty()) {
                    while (this.f == null || !this.d()) {
                        if (++this.d >= list2.size()) {
                            if (++this.c >= e.size()) {
                                return false;
                            }
                            this.d = 0;
                        }
                        final ddk e2 = e.get(this.c);
                        final Class clazz2 = list2.get(this.d);
                        final ddt a3 = this.b.a((Class)clazz2);
                        final dge c = this.b.c();
                        final dfb b3 = this.b;
                        this.i = new dga(c, e2, b3.m, b3.e, b3.f, a3, clazz2, b3.h);
                        final File a4 = b3.d().a((ddk)this.i);
                        if ((this.h = a4) != null) {
                            this.e = e2;
                            this.f = this.b.g(a4);
                            this.g = 0;
                        }
                    }
                    this.j = null;
                    while (!b && this.d()) {
                        final dij dij = this.f.get(this.g++);
                        final File h = this.h;
                        final dfb b4 = this.b;
                        this.j = dij.b((Object)h, b4.e, b4.f, b4.h);
                        if (this.j != null && this.b.h(((ddy)this.j.b).a())) {
                            ((ddy)this.j.b).f(this.b.n, (ddx)this);
                            b = true;
                        }
                    }
                    return b;
                }
                if (File.class.equals(this.b.j)) {
                    return false;
                }
                final String value = String.valueOf(this.b.d.getClass());
                final String value2 = String.valueOf(this.b.j);
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to find any load path from ");
                sb.append(value);
                sb.append(" to ");
                sb.append(value2);
                throw new IllegalStateException(sb.toString());
            }
        }
        finally {
            while (true) {}
        }
    }
    
    public final void e(final Exception ex) {
        this.a.b((ddk)this.i, ex, (ddy)this.j.b, 4);
    }
}
