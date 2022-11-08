import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexd implements Iterator
{
    final /* synthetic */ afma a;
    private final Iterator b;
    
    public aexd(final afma a, final byte[] array) {
        this.a = a;
        this.b = (Iterator)((afcr)a.b).D();
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        return ((aexf)this.a.a).d(this.b.next());
    }
    
    @Override
    public final void remove() {
        this.b.remove();
    }
}
