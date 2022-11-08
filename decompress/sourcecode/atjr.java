import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atjr implements Serializable
{
    public final Object a = a;
    
    public static final Throwable a(final Object o) {
        if (o instanceof atjq) {
            return ((atjq)o).a;
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final Object a = this.a;
        if (o instanceof atjr) {
            if (atnh.c(a, ((atjr)o).a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final Object a = this.a;
        String s;
        if (a instanceof atjq) {
            s = ((atjq)a).toString();
        }
        else {
            final StringBuilder sb = new StringBuilder("Success(");
            sb.append(a);
            sb.append(')');
            s = sb.toString();
        }
        return s;
    }
}
