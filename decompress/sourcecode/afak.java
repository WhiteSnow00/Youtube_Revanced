import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public class afak extends AbstractCollection
{
    public final Collection a;
    public final aext b;
    
    public afak(final Collection a, final aext b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean add(final Object o) {
        agot.u(this.b.a(o));
        return this.a.add(o);
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            agot.u(this.b.a(iterator.next()));
        }
        return this.a.addAll(collection);
    }
    
    @Override
    public final void clear() {
        adwd.aT(this.a, this.b);
    }
    
    @Override
    public final boolean contains(final Object o) {
        return ahbz.av(this.a, o) && this.b.a(o);
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        return ahbz.au(this, collection);
    }
    
    @Override
    public final boolean isEmpty() {
        return !adwd.aO(this.a, this.b);
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)adwd.au(this.a.iterator(), this.b);
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.contains(o) && this.a.remove(o);
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        final Iterator iterator = this.a.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (this.b.a(next) && collection.contains(next)) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        final Iterator iterator = this.a.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (this.b.a(next) && !collection.contains(next)) {
                iterator.remove();
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final int size() {
        final Iterator iterator = this.a.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (this.b.a(iterator.next())) {
                ++n;
            }
        }
        return n;
    }
    
    @Override
    public final Object[] toArray() {
        return adwd.am(this.iterator()).toArray();
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        return adwd.am(this.iterator()).toArray(array);
    }
}
