import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class afgj
{
    Object[] a;
    int b;
    aapu c;
    
    public afgj() {
        this(4);
    }
    
    public afgj(final int n) {
        this.a = new Object[n + n];
        this.b = 0;
    }
    
    private final afgm a(final boolean b) {
        if (b) {
            final aapu c = this.c;
            if (c != null) {
                throw c.bx();
            }
        }
        final afkc t = afkc.t(this.b, this.a, this);
        if (b) {
            final aapu c2 = this.c;
            if (c2 != null) {
                throw c2.bx();
            }
        }
        return (afgm)t;
    }
    
    private final void d(int n) {
        final Object[] a = this.a;
        final int length = a.length;
        n += n;
        if (n > length) {
            this.a = Arrays.copyOf(a, affx.f(length, n));
        }
    }
    
    @Deprecated
    public afgm b() {
        return this.c();
    }
    
    public afgm c() {
        return this.a(true);
    }
    
    public final afgm f() {
        return this.a(false);
    }
    
    public final void g(final Object o, final Object o2) {
        this.d(this.b + 1);
        adzw.F(o, o2);
        final Object[] a = this.a;
        final int b = this.b;
        final int n = b + b;
        a[n] = o;
        a[n + 1] = o2;
        this.b = b + 1;
    }
    
    public final void h(final afgj afgj) {
        afgj.getClass();
        this.d(this.b + afgj.b);
        final Object[] a = afgj.a;
        final Object[] a2 = this.a;
        final int b = this.b;
        final int b2 = afgj.b;
        System.arraycopy(a, 0, a2, b + b, b2 + b2);
        this.b += afgj.b;
    }
    
    public final void i(final Map.Entry entry) {
        this.g(entry.getKey(), entry.getValue());
    }
    
    public final void j(final Iterable iterable) {
        if (iterable instanceof Collection) {
            this.d(this.b + ((Collection)iterable).size());
        }
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.i((Map.Entry)iterator.next());
        }
    }
    
    public final void k(final Map map) {
        this.j(map.entrySet());
    }
}
