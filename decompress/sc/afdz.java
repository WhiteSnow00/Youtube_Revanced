import java.util.Iterator;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class afdz extends AbstractSet
{
    final afea b;
    
    public afdz(final afea b) {
        this.b = b;
    }
    
    public abstract Object a(final int p0);
    
    @Override
    public final void clear() {
        this.b.clear();
    }
    
    @Override
    public final Iterator iterator() {
        return new afdy(this);
    }
    
    @Override
    public final int size() {
        return this.b.c;
    }
}
