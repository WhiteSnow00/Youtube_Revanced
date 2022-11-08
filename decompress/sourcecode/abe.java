import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

final class abe implements Collection
{
    final /* synthetic */ abg a;
    
    public abe(final abg a) {
        this.a = a;
    }
    
    @Override
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void clear() {
        ((abn)this.a).clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return ((abn)this.a).a(o) >= 0;
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean isEmpty() {
        return ((abn)this.a).isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new abf(this.a);
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int a = ((abn)this.a).a(o);
        if (a >= 0) {
            ((abn)this.a).d(a);
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean removeAll(final Collection collection) {
        int d = ((abn)this.a).d;
        int i = 0;
        boolean b = false;
        while (i < d) {
            int n = d;
            int n2 = i;
            if (collection.contains(((abn)this.a).f(i))) {
                ((abn)this.a).d(i);
                n2 = i - 1;
                n = d - 1;
                b = true;
            }
            i = n2 + 1;
            d = n;
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection collection) {
        int d = ((abn)this.a).d;
        int i = 0;
        boolean b = false;
        while (i < d) {
            int n = d;
            int n2 = i;
            if (!collection.contains(((abn)this.a).f(i))) {
                ((abn)this.a).d(i);
                n2 = i - 1;
                n = d - 1;
                b = true;
            }
            i = n2 + 1;
            d = n;
        }
        return b;
    }
    
    @Override
    public final int size() {
        return ((abn)this.a).d;
    }
    
    @Override
    public final Object[] toArray() {
        final int d = ((abn)this.a).d;
        final Object[] array = new Object[d];
        for (int i = 0; i < d; ++i) {
            array[i] = ((abn)this.a).f(i);
        }
        return array;
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        final int size = this.size();
        Object[] array2 = array;
        if (array.length < size) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; ++i) {
            array2[i] = ((abn)this.a).f(i);
        }
        if (array2.length > size) {
            array2[size] = null;
        }
        return array2;
    }
}
