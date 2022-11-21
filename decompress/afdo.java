import java.util.Iterator;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class afdo extends AbstractCollection
{
    final afdp a;
    
    public afdo(final afdp a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.m();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.x(o);
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.i();
    }
    
    @Override
    public final int size() {
        return this.a.g();
    }
}
