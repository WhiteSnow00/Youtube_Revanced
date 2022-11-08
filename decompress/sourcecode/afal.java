import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afal extends AbstractCollection
{
    final Collection a;
    final aexg b;
    
    public afal(final Collection a, final aexg b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return adwd.az(this.a.iterator(), this.b);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
