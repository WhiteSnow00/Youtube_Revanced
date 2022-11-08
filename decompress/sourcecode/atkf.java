import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atkf implements Collection, atnq
{
    private final Object[] a;
    private final boolean b;
    
    public atkf(final Object[] a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final boolean contains(final Object o) {
        return aqqn.A(this.a, o);
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        collection.getClass();
        final boolean empty = collection.isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = collection.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.length == 0;
    }
    
    @Override
    public final Iterator iterator() {
        return new atmx(this.a);
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
        return this.a.length;
    }
    
    @Override
    public final Object[] toArray() {
        final Object[] a = this.a;
        if (this.b && atnh.c(a.getClass(), Object[].class)) {
            return a;
        }
        final Object[] copy = Arrays.copyOf(a, a.length, (Class<? extends Object[]>)Object[].class);
        copy.getClass();
        return copy;
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        array.getClass();
        return atnc.b(this, array);
    }
}
