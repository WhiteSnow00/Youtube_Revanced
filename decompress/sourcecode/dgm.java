import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgm implements dgd
{
    private final dgi a;
    private final dgl b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;
    
    public dgm() {
        this.a = new dgi();
        this.b = new dgl();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }
    
    public dgm(final int e) {
        this.a = new dgi();
        this.b = new dgl();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = e;
    }
    
    private final dgc f(final Class clazz) {
        Object o;
        if ((o = this.d.get(clazz)) == null) {
            if (clazz.equals(int[].class)) {
                o = new dgj(0);
            }
            else {
                if (!clazz.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(clazz.getSimpleName())));
                }
                o = new dgj(1);
            }
            this.d.put(clazz, o);
        }
        return (dgc)o;
    }
    
    private final Object g(final dgk dgk, final Class clazz) {
        final dgc f = this.f(clazz);
        final Object a = this.a.a((dgp)dgk);
        if (a != null) {
            this.f -= f.a(a) * f.b();
            this.i(f.a(a), clazz);
        }
        if (a == null) {
            return f.c(dgk.a);
        }
        return a;
    }
    
    private final NavigableMap h(final Class clazz) {
        NavigableMap navigableMap;
        if ((navigableMap = this.c.get(clazz)) == null) {
            navigableMap = new TreeMap();
            this.c.put(clazz, navigableMap);
        }
        return navigableMap;
    }
    
    private final void i(final int n, final Class clazz) {
        final NavigableMap h = this.h(clazz);
        final Integer value = n;
        final Integer n2 = (Integer)h.get(value);
        if (n2 == null) {
            final String string = this.toString();
            final StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
            sb.append(n);
            sb.append(", this: ");
            sb.append(string);
            throw new NullPointerException(sb.toString());
        }
        if (n2 == 1) {
            h.remove(value);
            return;
        }
        h.put(value, n2 - 1);
    }
    
    private final void j(final int n) {
        while (this.f > n) {
            final Object b = this.a.b();
            cll.h(b);
            final dgc f = this.f(b.getClass());
            this.f -= f.a(b) * f.b();
            this.i(f.a(b), b.getClass());
        }
    }
    
    public final Object a(final int n, final Class clazz) {
        synchronized (this) {
            final Integer n2 = this.h(clazz).ceilingKey(n);
            Label_0079: {
                if (n2 != null) {
                    final int f = this.f;
                    if (f != 0) {
                        if (this.e / f < 2) {
                            if (n2 > n * 8) {
                                break Label_0079;
                            }
                        }
                    }
                    final dgk dgk = this.b.d(n2, clazz);
                    return this.g(dgk, clazz);
                }
            }
            final dgk dgk = this.b.d(n, clazz);
            return this.g(dgk, clazz);
        }
    }
    
    public final void b() {
        synchronized (this) {
            this.j(0);
        }
    }
    
    public final void c(final Object o) {
        synchronized (this) {
            final Class<?> class1 = o.getClass();
            final dgc f = this.f(class1);
            final int a = f.a(o);
            final int n = f.b() * a;
            final int e = this.e;
            int n2 = 1;
            if (n <= e >> 1) {
                final dgk d = this.b.d(a, class1);
                this.a.c((dgp)d, o);
                final NavigableMap h = this.h(class1);
                final Integer n3 = (Integer)h.get(d.a);
                final int a2 = d.a;
                if (n3 != null) {
                    n2 = 1 + n3;
                }
                h.put(a2, n2);
                this.f += n;
                this.j(this.e);
            }
        }
    }
    
    public final void d(final int n) {
        monitorenter(this);
        Label_0019: {
            if (n >= 40) {
                Label_0050: {
                    try {
                        this.b();
                        monitorexit(this);
                        return;
                    }
                    finally {
                        break Label_0050;
                    }
                    break Label_0019;
                }
                monitorexit(this);
            }
        }
        if (n < 20 && n != 15) {
            monitorexit(this);
            return;
        }
        this.j(this.e >> 1);
        monitorexit(this);
    }
    
    public final Object e(final Class clazz) {
        synchronized (this) {
            return this.g(this.b.d(8, clazz), clazz);
        }
    }
}
