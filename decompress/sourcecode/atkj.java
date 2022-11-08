import java.util.Iterator;
import java.util.Collection;
import java.io.Serializable;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atkj implements Set, Serializable, atnq
{
    public static final atkj a;
    private static final long serialVersionUID = 3406603774387020532L;
    
    static {
        a = new atkj();
    }
    
    private atkj() {
    }
    
    private final Object readResolve() {
        return atkj.a;
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        if (!(o instanceof Void)) {
            return false;
        }
        o.getClass();
        return false;
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        collection.getClass();
        return collection.isEmpty();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof Set && ((Set)o).isEmpty();
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final boolean isEmpty() {
        return true;
    }
    
    @Override
    public final Iterator iterator() {
        return atkg.a;
    }
    
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return 0;
    }
    
    @Override
    public final Object[] toArray() {
        return atnc.a(this);
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        array.getClass();
        return atnc.b(this, array);
    }
    
    @Override
    public final String toString() {
        return "[]";
    }
}
