import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afhg extends afdu
{
    final transient Object a;
    
    public afhg(final Object a) {
        a.getClass();
        this.a = a;
    }
    
    public final int c(final Object[] array, final int n) {
        array[n] = this.a;
        return n + 1;
    }
    
    public final boolean contains(final Object o) {
        return this.a.equals(o);
    }
    
    public final afcr g() {
        return afcr.r(this.a);
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final afie k() {
        return (afie)new afem(this.a);
    }
    
    public final boolean l() {
        return false;
    }
    
    public final int size() {
        return 1;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[");
        sb.append(this.a.toString());
        sb.append(']');
        return sb.toString();
    }
}
