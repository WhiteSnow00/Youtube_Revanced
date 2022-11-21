import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagk
{
    private final aaco a;
    private final HashSet b;
    private volatile aacp c;
    private volatile int d;
    private volatile int e;
    private volatile int f;
    private volatile int g;
    private volatile int h;
    private volatile int i;
    private volatile boolean j;
    private final abwe k;
    
    public aagk(final abwe k, final aaco a, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.k = k;
        this.a = a;
        this.b = new HashSet(a.e);
    }
    
    public final int a() {
        synchronized (this) {
            return this.b.size();
        }
    }
    
    public final int b() {
        synchronized (this) {
            return this.g;
        }
    }
    
    public final aacp c() {
        if (this.c == null) {
            this.c = new aacp(this.a, this.a(), this.b(), this.i, this.e, this.f, this.j);
        }
        return this.c;
    }
    
    public final HashSet d() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public final void e(final String s) {
        synchronized (this) {
            twd.n(s);
            this.b.add(s);
            this.k.x(s, this.a.a);
        }
    }
    
    public final void f() {
        synchronized (this) {
            this.d = 0;
            this.e = 0;
            this.f = 0;
        }
    }
    
    public final void g() {
        synchronized (this) {
            this.j = false;
            this.i = 0;
        }
    }
    
    public final void h(final int g) {
        synchronized (this) {
            this.g = g;
        }
    }
    
    public final boolean i(final String s) {
        synchronized (this) {
            if (this.b.remove(s)) {
                this.k.z(s, this.a.a);
                final int e = this.a.e;
                if (e > 0) {
                    this.h = e - this.b.size();
                    this.d = this.e;
                    this.e = this.h * 100 / this.a.e;
                }
                this.c = null;
                return true;
            }
            return false;
        }
    }
    
    public final boolean j(final aadf aadf) {
        synchronized (this) {
            final String u = aahc.u(aadf.f);
            final boolean contains = this.b.contains(u);
            final int n = 0;
            if (contains) {
                if (!aadf.c()) {
                    this.b.remove(u);
                    this.k.z(u, this.a.a);
                    if (aadf.b == aozk.f) {
                        this.j = true;
                        ++this.i;
                    }
                }
                final int e = this.a.e;
                if (e > 0) {
                    final int h = e - this.b.size();
                    final int e2 = this.a.e;
                    if (h == e2) {
                        this.d = this.e;
                        this.e = 100;
                    }
                    else {
                        int n2 = h * 100 / e2;
                        if (aadf.c()) {
                            n2 += aadf.a() / this.a.e;
                        }
                        int n3;
                        if ((n3 = n2) == 0) {
                            if (aadf.d > 0L) {
                                n3 = 1;
                            }
                            else {
                                n3 = 0;
                            }
                        }
                        final int min = Math.min(99, n3);
                        if (min > this.e) {
                            this.d = this.e;
                            this.e = min;
                        }
                    }
                    this.h = h;
                }
                final int n4 = this.a.e - this.g;
                if (n4 > 0) {
                    final int n5 = n4 - this.b.size();
                    if (n5 == n4) {
                        this.f = 100;
                    }
                    else {
                        final boolean c = aadf.c();
                        int n7;
                        final int n6 = n7 = n5 * 100 / n4;
                        if (c) {
                            n7 = n6 + aadf.a() / n4;
                        }
                        if (n7 == 0) {
                            n7 = n;
                            if (aadf.d > 0L) {
                                n7 = 1;
                            }
                        }
                        final int min2 = Math.min(99, n7);
                        if (min2 > this.f) {
                            this.f = min2;
                        }
                    }
                    this.h = n5 + this.g;
                }
                this.c = null;
                return true;
            }
            return false;
        }
    }
}
