import java.util.NoSuchElementException;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

class atjy implements Iterator, atnq
{
    public int a;
    final /* synthetic */ atkb b;
    
    public atjy(final atkb b) {
        this.b = b;
    }
    
    @Override
    public final boolean hasNext() {
        return this.a < ((atjx)this.b).a();
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            return this.b.get(this.a++);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
