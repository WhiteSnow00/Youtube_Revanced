import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afde implements Comparable, Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparable b;
    
    public afde(final Comparable b) {
        this.b = b;
    }
    
    static afde f(final Comparable comparable) {
        return (afde)new afdd(comparable);
    }
    
    public int a(final afde afde) {
        if (afde == afdc.a) {
            return 1;
        }
        if (afde == afda.a) {
            return -1;
        }
        final int b = afid.b(this.b, afde.b);
        if (b != 0) {
            return b;
        }
        return aeuz.l(this instanceof afdb, afde instanceof afdb);
    }
    
    public Comparable b() {
        return this.b;
    }
    
    public abstract void c(final StringBuilder p0);
    
    @Override
    public /* bridge */ int compareTo(final Object o) {
        return this.a((afde)o);
    }
    
    public abstract void d(final StringBuilder p0);
    
    public abstract boolean e(final Comparable p0);
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof afde)) {
            return false;
        }
        final afde afde = (afde)o;
        try {
            if (this.a(afde) == 0) {
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
