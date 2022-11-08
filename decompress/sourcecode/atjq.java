import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atjq implements Serializable
{
    public final Throwable a;
    
    public atjq(final Throwable a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof atjq && atnh.c(this.a, ((atjq)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Failure(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
