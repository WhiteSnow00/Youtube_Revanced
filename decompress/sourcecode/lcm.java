import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcm implements achk
{
    public final Set a;
    public final Set b;
    public lcq c;
    
    public lcm() {
        this.a = new HashSet();
        this.b = new HashSet();
    }
    
    public final int a() {
        if (this.c != null) {
            return 1;
        }
        return 0;
    }
    
    public final long b(final int n) {
        return 0L;
    }
    
    public final Object c(final int n) {
        final lcq c = this.c;
        int n2;
        if (c != null) {
            n2 = 0;
        }
        else {
            n2 = -1;
        }
        if (n == n2) {
            return c;
        }
        return null;
    }
    
    public final boolean contains(final Object o) {
        throw null;
    }
    
    public final void g(final achj achj) {
        this.a.remove(achj);
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final void ni(final acik acik) {
    }
    
    public final void oo(final acij acij, final int n) {
    }
    
    public final void qK(final achj achj) {
        this.a.add(achj);
    }
}
