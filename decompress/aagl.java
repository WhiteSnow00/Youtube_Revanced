import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagl
{
    private final HashSet a;
    private volatile aadd b;
    private volatile int c;
    private final atky d;
    
    public aagl(final atky d, final HashSet set, final byte[] array, final byte[] array2) {
        this.d = d;
        this.a = new HashSet(set);
    }
    
    final int a() {
        synchronized (this) {
            return this.a.size();
        }
    }
    
    public final aadd b() {
        if (this.b == null) {
            this.b = new aadd(this.d.s(), this.a(), this.c);
        }
        return this.b;
    }
    
    public final void c(final String s) {
        synchronized (this) {
            twd.n(s);
            this.a.add(s);
            this.d.v(s);
        }
    }
    
    public final void d(final Collection collection) {
        monitorenter(this);
        try {
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                this.c((String)iterator.next());
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e() {
        synchronized (this) {
            this.b = null;
        }
    }
    
    public final boolean f(final aadf aadf) {
        synchronized (this) {
            final String u = aahc.u(aadf.f);
            final boolean contains = this.a.contains(u);
            final int n = 0;
            if (contains) {
                if (!aadf.c()) {
                    this.a.remove(u);
                    if (this.a.isEmpty()) {
                        this.d.u().clear();
                    }
                }
                final int s = this.d.s();
                if (s > 0) {
                    final int n2 = s - this.a.size();
                    if (n2 == s) {
                        this.c = 100;
                    }
                    else {
                        final boolean c = aadf.c();
                        int n4;
                        final int n3 = n4 = n2 * 100 / s;
                        if (c) {
                            n4 = n3 + aadf.a() / s;
                        }
                        if (n4 == 0) {
                            n4 = n;
                            if (aadf.d > 0L) {
                                n4 = 1;
                            }
                        }
                        this.c = Math.min(99, n4);
                    }
                }
                this.b = null;
                return true;
            }
            return false;
        }
    }
    
    public final void g(final aadf aadf) {
        synchronized (this) {
            final String u = aahc.u(aadf.f);
            if (this.a.remove(u)) {
                this.d.w(u);
                this.b = null;
            }
        }
    }
}
