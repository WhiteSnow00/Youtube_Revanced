import java.util.Iterator;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class afbw extends AbstractCollection
{
    final afbx a;
    
    public afbw(final afbx a) {
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
