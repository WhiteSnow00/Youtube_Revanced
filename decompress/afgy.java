import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgy extends affy
{
    private static final long serialVersionUID = 0L;
    private final transient afgz a;
    
    public afgy(final afgz a) {
        this.a = a;
    }
    
    @Override
    public final int c(final Object[] array, int c) {
        final aflu k = this.a.map.e().k();
        while (((Iterator)k).hasNext()) {
            c = ((affy)((Iterator)k).next()).c(array, c);
        }
        return c;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return ((afdp)this.a).x(o);
    }
    
    @Override
    public final /* bridge */ Iterator iterator() {
        return (Iterator)this.k();
    }
    
    @Override
    public final aflu k() {
        return new afgv(this.a);
    }
    
    @Override
    public final boolean l() {
        throw null;
    }
    
    @Override
    public final int size() {
        return this.a.size;
    }
}
