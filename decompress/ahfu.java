import java.util.ListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfu extends AbstractList implements RandomAccess, ahea
{
    public final ahea a;
    
    public ahfu(final ahea a) {
        this.a = a;
    }
    
    public final ahea d() {
        return (ahea)this;
    }
    
    public final Object f(final int n) {
        return this.a.f(n);
    }
    
    @Override
    public final /* bridge */ Object get(final int n) {
        return ((ahdz)this.a).g(n);
    }
    
    public final List h() {
        return this.a.h();
    }
    
    public final void i(final ahbt ahbt) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new xkx(this, 3);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new ahft(this, n);
    }
    
    public final int size() {
        return this.a.size();
    }
}
