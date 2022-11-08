import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afcm extends afcg
{
    public afcm() {
        super(4);
    }
    
    public afcm(final int n) {
        super(n);
    }
    
    public final afcr g() {
        this.c = true;
        return afcr.j(this.a, this.b);
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
