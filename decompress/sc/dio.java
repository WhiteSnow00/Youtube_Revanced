import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dio
{
    private static final dij a;
    private final List b;
    private final Set c;
    private final akr d;
    
    static {
        a = new din(0);
    }
    
    public dio(final akr d) {
        this.b = new ArrayList();
        this.c = new HashSet();
        this.d = d;
    }
    
    private final void h(final Class clazz, final Class clazz2, final dik dik, final boolean b) {
        final aln aln = new aln(clazz, clazz2, dik);
        final List b2 = this.b;
        int size;
        if (b) {
            size = b2.size();
        }
        else {
            size = 0;
        }
        b2.add(size, aln);
    }
    
    private final dij i(final aln aln) {
        final dij b = ((dik)aln.a).b(this);
        clm.h((Object)b);
        return b;
    }
    
    public final dij a(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = this.b.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final aln aln = (aln)iterator.next();
                if (this.c.contains(aln)) {
                    b = true;
                }
                else {
                    if (!aln.k(clazz, clazz2)) {
                        continue;
                    }
                    this.c.add(aln);
                    list.add(this.i(aln));
                    this.c.remove(aln);
                }
            }
            if (list.size() > 1) {
                final dim dim = new dim(list, this.d);
                monitorexit(this);
                return dim;
            }
            if (list.size() == 1) {
                final dij dij = (dij)list.get(0);
                monitorexit(this);
                return dij;
            }
            if (b) {
                final dij a = dio.a;
                monitorexit(this);
                return a;
            }
            throw new dcd(clazz, clazz2);
        }
        finally {
            try {
                this.c.clear();
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    public final List b(final Class clazz) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            for (final aln aln : this.b) {
                if (!this.c.contains(aln) && aln.j(clazz)) {
                    this.c.add(aln);
                    list.add(this.i(aln));
                    this.c.remove(aln);
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            try {
                this.c.clear();
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    public final List c(final Class clazz) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            for (final aln aln : this.b) {
                if (!list.contains(aln.b) && aln.j(clazz)) {
                    list.add(aln.b);
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final List d(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                final aln aln = (aln)iterator.next();
                if (aln.k(clazz, clazz2)) {
                    iterator.remove();
                    list.add(aln.a);
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final List e(final Class clazz, final Class clazz2, final dik dik) {
        synchronized (this) {
            final List d = this.d(clazz, clazz2);
            this.f(clazz, clazz2, dik);
            return d;
        }
    }
    
    public final void f(final Class clazz, final Class clazz2, final dik dik) {
        synchronized (this) {
            this.h(clazz, clazz2, dik, true);
        }
    }
    
    public final void g(final Class clazz, final Class clazz2, final dik dik) {
        synchronized (this) {
            this.h(clazz, clazz2, dik, false);
        }
    }
}
