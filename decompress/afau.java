import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afau implements Iterator
{
    final afpq a;
    private final Iterator b;
    
    public afau(final afpq a, final byte[] array) {
        this.a = a;
        this.b = (Iterator)((afgh)a.b).D();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        return ((afaw)this.a.a).d(this.b.next());
    }
    
    @Override
    public final void remove() {
        this.b.remove();
    }
}
