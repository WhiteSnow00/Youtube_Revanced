import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

enum afif implements Iterator
{
    a;
    
    private static final afif[] b;
    
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
        adzw.G(false);
    }
}
