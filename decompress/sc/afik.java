import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class afik extends afft
{
    private final transient afev a;
    private final transient afeq b;
    
    public afik(final afev a, final afeq b) {
        this.a = a;
        this.b = b;
    }
    
    public final int c(final Object[] array, final int n) {
        return ((afeh)this.b).c(array, n);
    }
    
    public final boolean contains(final Object o) {
        return this.a.get(o) != null;
    }
    
    public final afeq g() {
        return this.b;
    }
    
    public final /* bridge */ Iterator iterator() {
        return this.k();
    }
    
    public final afke k() {
        return (afke)this.b.D();
    }
    
    public final boolean l() {
        return true;
    }
    
    public final int size() {
        return this.a.size();
    }
}
