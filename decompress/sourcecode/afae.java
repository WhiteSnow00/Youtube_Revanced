import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afae extends afgb implements Serializable
{
    private static final long serialVersionUID = 0L;
    final aexg a;
    final afgb b;
    
    public afae(final aexg a, final afgb b) {
        this.a = a;
        this.b = b;
    }
    
    public final int compare(final Object o, final Object o2) {
        return this.b.compare(this.a.apply(o), this.a.apply(o2));
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof afae) {
            final afae afae = (afae)o;
            if (this.a.equals(afae.a) && this.b.equals(afae.b)) {
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(".onResultOf(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
