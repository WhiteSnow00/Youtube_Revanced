import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahbr implements Iterator
{
    public ahbr() {
    }
    
    @Override
    public final boolean hasNext() {
        return false;
    }
    
    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
