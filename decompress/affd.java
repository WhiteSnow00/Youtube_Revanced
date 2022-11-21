import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class affd extends affg implements Collection
{
    protected affd() {
    }
    
    @Override
    protected /* bridge */ Object a() {
        throw null;
    }
    
    @Override
    public boolean add(final Object o) {
        return this.c().add(o);
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        return this.c().addAll(collection);
    }
    
    protected abstract Collection c();
    
    @Override
    public final void clear() {
        this.c().clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.c().contains(o);
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        return this.c().containsAll(collection);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.c().isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return this.c().iterator();
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.c().remove(o);
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        return this.c().removeAll(collection);
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        return this.c().retainAll(collection);
    }
    
    @Override
    public final int size() {
        return this.c().size();
    }
    
    @Override
    public final Object[] toArray() {
        return this.c().toArray();
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return this.c().toArray(array);
    }
}
