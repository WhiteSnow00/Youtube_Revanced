import java.util.Iterator;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afca extends AbstractSet
{
    final afcb b;
    
    public afca(final afcb b) {
        this.b = b;
    }
    
    public abstract Object a(final int p0);
    
    @Override
    public final void clear() {
        this.b.clear();
    }
    
    @Override
    public final Iterator iterator() {
        return new afbz(this);
    }
    
    @Override
    public final int size() {
        return this.b.c;
    }
}
