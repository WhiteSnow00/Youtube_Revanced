import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atjp implements Serializable
{
    public final Object a;
    public final Object b;
    
    public atjp(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof atjp)) {
            return false;
        }
        final atjp atjp = (atjp)o;
        return atnh.c(this.a, atjp.a) && atnh.c(this.b, atjp.b);
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
        sb.append(')');
        return sb.toString();
    }
}
