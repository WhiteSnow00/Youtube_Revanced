import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atnj implements Serializable
{
    public final Object a;
    
    public atnj(final Object a) {
        this.a = a;
    }
    
    public static final Throwable a(final Object o) {
        if (o instanceof atni) {
            return ((atni)o).a;
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final Object a = this.a;
        if (o instanceof atnj) {
            if (atqz.c(a, ((atnj)o).a)) {
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
        if (a instanceof atni) {
            s = ((atni)a).toString();
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
