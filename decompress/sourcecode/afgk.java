import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afgk extends afdu
{
    private final transient afcw a;
    private final transient afcr b;
    
    public afgk(final afcw a, final afcr b) {
        this.a = a;
        this.b = b;
    }
    
    public final int c(final Object[] array, final int n) {
        return ((afci)this.b).c(array, n);
    }
    
    public final boolean contains(final Object o) {
        return this.a.get(o) != null;
    }
    
    public final afcr g() {
        return this.b;
    }
    
    public final afie k() {
        return (afie)this.b.D();
    }
    
    public final boolean l() {
        return true;
    }
    
    public final int size() {
        return this.a.size();
    }
}
