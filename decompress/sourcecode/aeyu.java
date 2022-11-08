import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeyu implements Serializable, aeyr
{
    private static final long serialVersionUID = 0L;
    public final Object a;
    
    public aeyu(final Object a) {
        this.a = a;
    }
    
    public final Object a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof aeyu && aeda.v(this.a, ((aeyu)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Suppliers.ofInstance(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
