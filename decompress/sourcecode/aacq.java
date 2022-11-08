import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aacq
{
    private final zyx a;
    private final HashSet b;
    private volatile zyy c;
    private volatile int d;
    private volatile int e;
    private volatile int f;
    private volatile int g;
    private volatile int h;
    private volatile int i;
    private volatile boolean j;
    private final aamd k;
    
    public aacq(final aamd k, final zyx a, final byte[] array, final byte[] array2) {
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
    
    public final zyy c() {
        if (this.c == null) {
            this.c = new zyy(this.a, this.a(), this.b(), this.i, this.e, this.f, this.j);
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
            tsx.n(s);
            this.b.add(s);
            this.k.s(s, this.a.a);
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
                this.k.u(s, this.a.a);
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
    
    public final boolean j(final zzo zzo) {
        synchronized (this) {
            final String u = aadj.u(zzo.f);
            final boolean contains = this.b.contains(u);
            final int n = 0;
            if (contains) {
                if (!zzo.c()) {
                    this.b.remove(u);
                    this.k.u(u, this.a.a);
                    if (zzo.b == aouv.f) {
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
                        if (zzo.c()) {
                            n2 += zzo.a() / this.a.e;
                        }
                        int n3;
                        if ((n3 = n2) == 0) {
                            if (zzo.d > 0L) {
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
                        int n7;
                        final int n6 = n7 = n5 * 100 / n4;
                        if (zzo.c()) {
                            n7 = n6 + zzo.a() / n4;
                        }
                        if (n7 == 0) {
                            n7 = n;
                            if (zzo.d > 0L) {
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
