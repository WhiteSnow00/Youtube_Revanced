import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afeh extends AbstractCollection implements Serializable
{
    private static final Object[] Zx;
    
    static {
        Zx = new Object[0];
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @Deprecated
    @Override
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    public int c(final Object[] array, int n) {
        final afke k = this.k();
        while (k.hasNext()) {
            array[n] = k.next();
            ++n;
        }
        return n;
    }
    
    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public abstract boolean contains(final Object p0);
    
    public int e() {
        throw new UnsupportedOperationException();
    }
    
    public int f() {
        throw new UnsupportedOperationException();
    }
    
    public afeq g() {
        afeq afeq;
        if (this.isEmpty()) {
            afeq = afeq.q();
        }
        else {
            afeq = afeq.i(this.toArray());
        }
        return afeq;
    }
    
    @Override
    public /* bridge */ Iterator iterator() {
        return this.k();
    }
    
    public abstract afke k();
    
    public abstract boolean l();
    
    public Object[] m() {
        return null;
    }
    
    @Deprecated
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    @Override
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Object[] toArray() {
        return this.toArray(afeh.Zx);
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        array.getClass();
        final int size = this.size();
        final int length = array.length;
        Object[] ao;
        if (length < size) {
            final Object[] m = this.m();
            if (m != null) {
                return Arrays.copyOfRange(m, this.f(), this.e(), array.getClass());
            }
            ao = agqs.ao(array, size);
        }
        else {
            ao = array;
            if (length > size) {
                array[size] = null;
                ao = array;
            }
        }
        this.c(ao, 0);
        return ao;
    }
    
    Object writeReplace() {
        return new afeo(this.toArray());
    }
}
