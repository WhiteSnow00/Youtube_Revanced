import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgh implements asks
{
    static final int a;
    public static final Object b;
    final AtomicLong c;
    final int d;
    long e;
    public final int f;
    public AtomicReferenceArray g;
    final int h;
    AtomicReferenceArray i;
    final AtomicLong j;
    
    static {
        a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
        b = new Object();
    }
    
    public atgh(int q) {
        this.c = new AtomicLong();
        this.j = new AtomicLong();
        q = aumt.q(Math.max(8, q));
        final int n = q - 1;
        final AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(q + 1);
        this.g = atomicReferenceArray;
        this.f = n;
        this.d = Math.min(q / 4, atgh.a);
        this.i = atomicReferenceArray;
        this.h = n;
        this.e = n - 1;
        this.e(0L);
    }
    
    private final void f(final long n) {
        this.j.lazySet(n);
    }
    
    private final void g(final AtomicReferenceArray atomicReferenceArray, final Object o, final long n, final int n2) {
        atomicReferenceArray.lazySet(n2, o);
        this.e(n + 1L);
    }
    
    public final long a() {
        return this.c.get();
    }
    
    public final void c() {
        while (this.tw() != null || !this.i()) {}
    }
    
    public final void d(final AtomicReferenceArray atomicReferenceArray, final AtomicReferenceArray atomicReferenceArray2) {
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
    }
    
    public final void e(final long n) {
        this.c.lazySet(n);
    }
    
    public final boolean i() {
        return this.a() == this.j.get();
    }
    
    public final boolean j(final Object o) {
        if (o == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        final AtomicReferenceArray g = this.g;
        final long value = this.c.get();
        final int f = this.f;
        final int n = (int)value & f;
        if (value < this.e) {
            this.g(g, o, value, n);
            return true;
        }
        final long n2 = this.d + value;
        if (g.get((int)n2 & f) == null) {
            this.e = n2 - 1L;
            this.g(g, o, value, n);
            return true;
        }
        final long n3 = 1L + value;
        if (g.get((int)n3 & f) == null) {
            this.g(g, o, value, n);
            return true;
        }
        final long n4 = f;
        final AtomicReferenceArray g2 = new AtomicReferenceArray(g.length());
        this.g = g2;
        this.e = value + n4 - 1L;
        g2.lazySet(n, o);
        this.d(g, g2);
        g.lazySet(n, atgh.b);
        this.e(n3);
        return true;
    }
    
    @Override
    public final Object tw() {
        final AtomicReferenceArray i = this.i;
        final long value = this.j.get();
        final int n = (int)value;
        int h = this.h;
        final int n2 = n & h;
        final Object value2 = i.get(n2);
        final Object b = atgh.b;
        if (value2 != null) {
            if (value2 != b) {
                i.lazySet(n2, null);
                this.f(value + 1L);
                return value2;
            }
        }
        else if (b != null) {
            return null;
        }
        ++h;
        final AtomicReferenceArray j = i.get(h);
        i.lazySet(h, null);
        this.i = j;
        final Object value3 = j.get(n2);
        if (value3 != null) {
            j.lazySet(n2, null);
            this.f(value + 1L);
        }
        return value3;
    }
}
