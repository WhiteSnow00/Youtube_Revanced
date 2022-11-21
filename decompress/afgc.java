import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afgc extends affw
{
    public afgc() {
        super(4);
    }
    
    public afgc(final int n) {
        super(n);
    }
    
    @Override
    public final void c(final Object o) {
        super.b(o);
    }
    
    public final afgh g() {
        this.c = true;
        return afgh.j(this.a, this.b);
    }
    
    public final void h(final Object o) {
        super.b(o);
    }
    
    public final void i(final Object... array) {
        super.d(array);
    }
    
    public final void j(final Iterable iterable) {
        super.e(iterable);
    }
    
    public final void k(final Iterator iterator) {
        while (iterator.hasNext()) {
            super.b(iterator.next());
        }
    }
}
