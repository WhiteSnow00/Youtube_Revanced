import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahce extends AbstractList implements RandomAccess, ahaj
{
    public final ahaj a;
    
    public ahce(final ahaj a) {
        this.a = a;
    }
    
    public final ahaj d() {
        return (ahaj)this;
    }
    
    public final Object f(final int n) {
        return this.a.f(n);
    }
    
    public final List h() {
        return this.a.h();
    }
    
    public final void i(final agyc agyc) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new xhn(this, 3);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new ahcd(this, n);
    }
    
    public final int size() {
        return this.a.size();
    }
}
