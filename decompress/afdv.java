import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afdv extends afjr implements Serializable
{
    private static final long serialVersionUID = 0L;
    final afax a;
    final afjr b;
    
    public afdv(final afax a, final afjr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        return this.b.compare(this.a.apply(o), this.a.apply(o2));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof afdv) {
            final afdv afdv = (afdv)o;
            if (this.a.equals(afdv.a) && this.b.equals(afdv.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(".onResultOf(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
