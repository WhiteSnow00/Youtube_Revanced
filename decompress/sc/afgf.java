import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgf implements Iterator
{
    boolean a;
    final Iterator b;
    
    public afgf(final Iterator b) {
        this.b = b;
        this.a = true;
    }
    
    @Override
    public final boolean hasNext() {
        return this.b.hasNext();
    }
    
    @Override
    public final Object next() {
        final Object next = this.b.next();
        this.a = false;
        return next;
    }
    
    @Override
    public final void remove() {
        aefb.I(this.a ^ true);
        this.b.remove();
    }
}
