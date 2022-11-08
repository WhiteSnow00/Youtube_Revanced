import java.util.Iterator;
import java.util.Comparator;
import java.util.TreeSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abub implements Iterable
{
    public final TreeSet a;
    public final TreeSet b;
    
    public abub() {
        final abua abua = new abua();
        this.b = new TreeSet(abua.a);
        this.a = new TreeSet(abua);
    }
    
    public final Iterator a(final long n) {
        return this.b.tailSet(abty.r(n)).iterator();
    }
    
    public final Iterator b(final long n, final long n2) {
        if (n2 == Long.MAX_VALUE) {
            return this.a(n);
        }
        return this.b.subSet(abty.r(n), abty.r(n2 + 1L)).iterator();
    }
    
    public final void c(final abty... array) {
        for (int i = 0; i <= 0; ++i) {
            final abty abty = array[i];
            this.a.add(abty);
            this.b.add(abty.u);
            this.b.add(abty.v);
        }
    }
    
    public final boolean d(final abty abty) {
        return this.a.contains(abty);
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
