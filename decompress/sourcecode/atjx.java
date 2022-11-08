import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atjx implements Collection, atnq
{
    protected atjx() {
    }
    
    public abstract int a();
    
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
    public boolean contains(final Object o) {
        final boolean empty = this.isEmpty();
        final boolean b = false;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator<Object> iterator = this.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (!atnh.c(iterator.next(), o));
            b2 = true;
        }
        return b2;
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
        return this.a() == 0;
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
        return this.a();
    }
    
    @Override
    public final Object[] toArray() {
        return atnc.a(this);
    }
    
    @Override
    public final Object[] toArray(Object[] b) {
        b.getClass();
        b = atnc.b(this, b);
        b.getClass();
        return b;
    }
    
    @Override
    public final String toString() {
        return aqzg.N((Iterable)this, (CharSequence)", ", (CharSequence)"[", (CharSequence)"]", (atml)new atjw(this, 0), 24);
    }
}
