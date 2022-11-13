import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfb
{
    public final List a;
    public final List b;
    public dby c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public ddp h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public ddk m;
    public dca n;
    public dfi o;
    public boolean p;
    public boolean q;
    public dfl r;
    
    public dfb() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
    
    final ddt a(final Class clazz) {
        ddt ddt2;
        final ddt ddt = ddt2 = this.i.get(clazz);
        Label_0085: {
            if (ddt == null) {
                final Iterator iterator = this.i.entrySet().iterator();
                Map.Entry<Class, V> entry;
                do {
                    ddt2 = ddt;
                    if (!iterator.hasNext()) {
                        break Label_0085;
                    }
                    entry = (Map.Entry<Class, V>)iterator.next();
                } while (!entry.getKey().isAssignableFrom(clazz));
                ddt2 = (ddt)entry.getValue();
            }
        }
        if (ddt2 != null) {
            return ddt2;
        }
        if (this.i.isEmpty() && this.p) {
            final String value = String.valueOf(clazz);
            final StringBuilder sb = new StringBuilder("Missing transformation for ");
            sb.append(value);
            sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
            throw new IllegalArgumentException(sb.toString());
        }
        return djf.b;
    }
    
    final dfw b(final Class clazz) {
        final dcg a = this.c.a();
        final Class g = this.g;
        final Class j = this.j;
        final dng a2 = a.a;
        final AtomicReference c = a2.c;
        final dfw dfw = null;
        dpf dpf;
        if ((dpf = c.getAndSet(null)) == null) {
            dpf = new dpf();
        }
        dpf.a(clazz, g, j);
        Object b = a2.b;
        monitorenter(b);
        try {
            final dfw dfw2 = (dfw)a2.b.get((Object)dpf);
            monitorexit(b);
            a2.c.set(dpf);
            final dng a3 = a.a;
            dfw dfw3;
            if (dng.a.equals(dfw2)) {
                dfw3 = dfw;
            }
            else {
                if (dfw2 == null) {
                    b = new ArrayList();
                    for (final Class clazz2 : a.e.e(clazz, g)) {
                        for (final Class clazz3 : a.d.b((Class)clazz2, j)) {
                            ((List)b).add(new dfe(clazz, clazz2, clazz3, a.e.d(clazz, clazz2), a.d.a((Class)clazz2, (Class)clazz3), a.b));
                        }
                    }
                    if (((List)b).isEmpty()) {
                        dfw3 = null;
                    }
                    else {
                        dfw3 = new dfw(clazz, g, j, (List)b, a.b);
                    }
                    final dng a4 = a.a;
                    synchronized (a4.b) {
                        final abh b2 = a4.b;
                        final dpf dpf2 = new dpf(clazz, g, j);
                        dfw a5;
                        if (dfw3 != null) {
                            a5 = dfw3;
                        }
                        else {
                            a5 = dng.a;
                        }
                        b2.put((Object)dpf2, (Object)a5);
                        return dfw3;
                    }
                }
                dfw3 = dfw2;
            }
            return dfw3;
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    final dge c() {
        return this.c.b;
    }
    
    final dgw d() {
        return this.r.a();
    }
    
    final List e() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            final List f = this.f();
            for (int size = f.size(), i = 0; i < size; ++i) {
                final aln aln = f.get(i);
                if (!this.b.contains(aln.a)) {
                    this.b.add(aln.a);
                }
                for (int j = 0; j < ((List)aln.c).size(); ++j) {
                    if (!this.b.contains(((List<Object>)aln.c).get(j))) {
                        this.b.add(((List<Object>)aln.c).get(j));
                    }
                }
            }
        }
        return this.b;
    }
    
    final List f() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            final List c = this.c.a().c(this.d);
            for (int size = c.size(), i = 0; i < size; ++i) {
                final aln b = c.get(i).b(this.d, this.e, this.f, this.h);
                if (b != null) {
                    this.a.add(b);
                }
            }
        }
        return this.a;
    }
    
    final List g(final File file) {
        return this.c.a().c(file);
    }
    
    final boolean h(final Class clazz) {
        return this.b(clazz) != null;
    }
}
