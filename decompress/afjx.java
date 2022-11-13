import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afjx implements Iterator
{
    final Iterator b;
    
    public afjx(final Iterator b) {
        b.getClass();
        this.b = b;
    }
    
    public abstract Object a(final Object p0);
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        return this.a(this.b.next());
    }
    
    @Override
    public final void remove() {
        this.b.remove();
    }
}
