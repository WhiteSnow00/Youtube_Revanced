import java.util.NoSuchElementException;
import java.util.ListIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atkg implements ListIterator, atnq
{
    public static final atkg a;
    
    static {
        a = new atkg();
    }
    
    private atkg() {
    }
    
    @Override
    public final boolean hasNext() {
        return false;
    }
    
    @Override
    public final boolean hasPrevious() {
        return false;
    }
    
    @Override
    public final int nextIndex() {
        return 0;
    }
    
    @Override
    public final int previousIndex() {
        return -1;
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
