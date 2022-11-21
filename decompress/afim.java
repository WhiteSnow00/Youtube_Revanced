import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afim extends AbstractList implements RandomAccess, Serializable
{
    private static final long serialVersionUID = 0L;
    final List a;
    final afax b;
    
    public afim(final List a, final afax b) {
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Object get(final int n) {
        return this.b.apply(this.a.get(n));
    }
    
    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return this.listIterator();
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new afil(this, (ListIterator)this.a.listIterator(n));
    }
    
    @Override
    public final Object remove(final int n) {
        return this.b.apply(this.a.remove(n));
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
}
