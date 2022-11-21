import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atse implements Iterator, atri
{
    final atsh a;
    private final Iterator b;
    
    public atse(final atsh a, final byte[] array) {
        this.a = a;
        this.b = ((atsa)a.b).a();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        return ((atqd)this.a.a).invoke(this.b.next());
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
