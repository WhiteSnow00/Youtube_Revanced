import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afbf implements Comparable, Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparable b;
    
    public afbf(final Comparable b) {
        this.b = b;
    }
    
    static afbf f(final Comparable comparable) {
        return (afbf)new afbe(comparable);
    }
    
    public int a(final afbf afbf) {
        if (afbf == afbd.a) {
            return 1;
        }
        if (afbf == afbb.a) {
            return -1;
        }
        final int b = afgd.b(this.b, afbf.b);
        if (b != 0) {
            return b;
        }
        return aesy.G(this instanceof afbc, afbf instanceof afbc);
    }
    
    public Comparable b() {
        return this.b;
    }
    
    public abstract void c(final StringBuilder p0);
    
    public abstract void d(final StringBuilder p0);
    
    public abstract boolean e(final Comparable p0);
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof afbf)) {
            return false;
        }
        final afbf afbf = (afbf)o;
        try {
            if (this.a(afbf) == 0) {
                return true;
            }
            return false;
        }
        catch (final ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public abstract int hashCode();
}
