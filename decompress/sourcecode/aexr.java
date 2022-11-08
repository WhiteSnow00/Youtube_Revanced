import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexr implements Serializable
{
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;
    
    protected aexr(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public static aexr a(final Object o, final Object o2) {
        return new aexr(o, o2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof aexr) {
            final aexr aexr = (aexr)o;
            if (aeda.v(this.a, aexr.a) && aeda.v(this.b, aexr.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
