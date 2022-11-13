import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public class afgt extends AbstractList
{
    public final List a;
    
    public afgt(final List a) {
        a.getClass();
        this.a = a;
    }
    
    private final int b(final int n) {
        final int size = this.size();
        adkp.Y(n, size);
        return size - 1 - n;
    }
    
    public final int a(final int n) {
        final int size = this.size();
        adkp.Z(n, size);
        return size - n;
    }
    
    @Override
    public final void add(final int n, final Object o) {
        this.a.add(this.a(n), o);
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Object get(final int n) {
        return this.a.get(this.b(n));
    }
    
    @Override
    public final Iterator iterator() {
        return this.listIterator();
    }
    
    @Override
    public final ListIterator listIterator(int a) {
        a = this.a(a);
        return new afgs(this, this.a.listIterator(a));
    }
    
    @Override
    public final Object remove(final int n) {
        return this.a.remove(this.b(n));
    }
    
    @Override
    protected final void removeRange(final int n, final int n2) {
        this.subList(n, n2).clear();
    }
    
    @Override
    public final Object set(final int n, final Object o) {
        return this.a.set(this.b(n), o);
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    public final List subList(final int n, final int n2) {
        adkp.P(n, n2, this.size());
        return agpi.T(this.a.subList(this.a(n2), this.a(n)));
    }
}
