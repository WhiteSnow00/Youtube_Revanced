import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

final class afiz extends AbstractCollection
{
    final Map a;
    
    public afiz(final Map a) {
        this.a = a;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.containsValue(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return agpx.H(this.a.entrySet().iterator());
    }
    
    @Override
    public final boolean remove(final Object o) {
        try {
            return super.remove(o);
        }
        catch (final UnsupportedOperationException ex) {
            for (final Map.Entry<K, Object> entry : this.a.entrySet()) {
                if (aexq.c(o, entry.getValue())) {
                    this.a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        }
        catch (final UnsupportedOperationException ex) {
            final HashSet i = agra.I();
            for (final Map.Entry<K, Object> entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    i.add(entry.getKey());
                }
            }
            return this.a.keySet().removeAll(i);
        }
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        }
        catch (final UnsupportedOperationException ex) {
            final HashSet i = agra.I();
            for (final Map.Entry<K, Object> entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    i.add(entry.getKey());
                }
            }
            return this.a.keySet().retainAll(i);
        }
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
