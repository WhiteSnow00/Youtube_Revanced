import java.util.Map;
import java.util.Iterator;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class afeh extends AbstractSet
{
    final afek a;
    
    public afeh(final afek a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.containsKey(o);
    }
    
    @Override
    public final Iterator iterator() {
        final afek a = this.a;
        final Map l = a.l();
        Iterator iterator;
        if (l != null) {
            iterator = l.keySet().iterator();
        }
        else {
            iterator = new afec(a);
        }
        return iterator;
    }
    
    @Override
    public final boolean remove(final Object o) {
        final Map l = this.a.l();
        boolean remove;
        if (l != null) {
            remove = l.keySet().remove(o);
        }
        else {
            if (this.a.h(o) != afek.a) {
                return true;
            }
            remove = false;
        }
        return remove;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
