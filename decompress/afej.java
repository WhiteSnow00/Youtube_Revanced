import java.util.Map;
import java.util.Iterator;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class afej extends AbstractCollection
{
    final afek a;
    
    public afej(final afek a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Iterator iterator() {
        final afek a = this.a;
        final Map l = a.l();
        Iterator iterator;
        if (l != null) {
            iterator = l.values().iterator();
        }
        else {
            iterator = new afee(a);
        }
        return iterator;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
