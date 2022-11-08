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

public abstract class afci extends AbstractCollection implements Serializable
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
        final afie k = this.k();
        while (((Iterator)k).hasNext()) {
            array[n] = ((Iterator<Object>)k).next();
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
    
    public afcr g() {
        afcr afcr;
        if (this.isEmpty()) {
            afcr = afcr.q();
        }
        else {
            afcr = afcr.i(this.toArray());
        }
        return afcr;
    }
    
    public abstract afie k();
    
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
        return this.toArray(afci.Zx);
    }
    
    @Override
    public final Object[] toArray(final Object[] array) {
        array.getClass();
        final int size = this.size();
        final int length = array.length;
        Object[] g;
        if (length < size) {
            final Object[] m = this.m();
            if (m != null) {
                return Arrays.copyOfRange(m, this.f(), this.e(), array.getClass());
            }
            g = ajox.G(array, size);
        }
        else {
            g = array;
            if (length > size) {
                array[size] = null;
                g = array;
            }
        }
        this.c(g, 0);
        return g;
    }
    
    Object writeReplace() {
        return new afcp(this.toArray());
    }
}
