import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class affx
{
    static int f(int highestOneBit, int n) {
        if ((highestOneBit = highestOneBit + (highestOneBit >> 1) + 1) < n) {
            highestOneBit = Integer.highestOneBit(n - 1);
            highestOneBit += highestOneBit;
        }
        if ((n = highestOneBit) < 0) {
            n = Integer.MAX_VALUE;
        }
        return n;
    }
    
    public abstract void c(final Object p0);
    
    public void e(final Iterable iterable) {
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.c(iterator.next());
        }
    }
}
