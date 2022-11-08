import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aufz implements Comparable, Serializable, aufq
{
    private static final long serialVersionUID = 9386874258972L;
    public volatile int g;
    
    protected aufz(final int g) {
        this.g = g;
    }
    
    public final int a(final aufg aufg) {
        throw null;
    }
    
    public final int b(final int n) {
        if (n == 0) {
            return this.g;
        }
        throw new IndexOutOfBoundsException(String.valueOf(n));
    }
    
    public final int c() {
        return 1;
    }
    
    public final aufg d(final int n) {
        if (n == 0) {
            return this.f();
        }
        throw new IndexOutOfBoundsException(String.valueOf(n));
    }
    
    public abstract aufn e();
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof aufq)) {
            return false;
        }
        final aufq aufq = (aufq)o;
        return aufq.e() == this.e() && aufq.b(0) == this.g;
    }
    
    public abstract aufg f();
    
    @Override
    public final int hashCode() {
        return (this.g + 459) * 27 + this.f().hashCode();
    }
}
