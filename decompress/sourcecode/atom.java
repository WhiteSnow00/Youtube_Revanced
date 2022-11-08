import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atom implements Iterator, atnq
{
    final /* synthetic */ atop a;
    private final Iterator b;
    
    public atom(final atop a, final byte[] array) {
        this.a = a;
        this.b = ((atoi)a.b).a();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        return ((atml)this.a.a).invoke(this.b.next());
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
