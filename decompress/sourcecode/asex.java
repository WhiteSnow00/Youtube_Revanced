import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asex
{
    final artr a;
    final Object b;
    
    public asex(final artr a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final asex asex = (asex)o;
                if (aeda.v(this.a, asex.a) && aeda.v(this.b, asex.b)) {
                    return true;
                }
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
        final aexp o = agot.O((Object)this);
        o.b("provider", (Object)this.a);
        o.b("config", this.b);
        return o.toString();
    }
}
