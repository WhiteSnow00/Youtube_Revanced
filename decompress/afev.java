import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class afev implements Comparable, Serializable
{
    private static final long serialVersionUID = 0L;
    final Comparable b;
    
    public afev(final Comparable b) {
        this.b = b;
    }
    
    static afev f(final Comparable comparable) {
        return new afeu(comparable);
    }
    
    public int a(final afev afev) {
        if (afev == afet.a) {
            return 1;
        }
        if (afev == afer.a) {
            return -1;
        }
        final int b = afjt.b(this.b, afev.b);
        if (b != 0) {
            return b;
        }
        return aftz.a(this instanceof afes, afev instanceof afes);
    }
    
    public Comparable b() {
        return this.b;
    }
    
    public abstract void c(final StringBuilder p0);
    
    @Override
    public /* bridge */ int compareTo(final Object o) {
        return this.a((afev)o);
    }
    
    public abstract void d(final StringBuilder p0);
    
    public abstract boolean e(final Comparable p0);
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof afev)) {
            return false;
        }
        final afev afev = (afev)o;
        try {
            if (this.a(afev) == 0) {
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
