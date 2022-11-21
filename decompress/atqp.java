import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atqp implements Iterator, atri
{
    private final Object[] a;
    private int b;
    
    public atqp(final Object[] a) {
        this.a = a;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b < this.a.length;
    }
    
    @Override
    public final Object next() {
        try {
            return this.a[this.b++];
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            --this.b;
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
