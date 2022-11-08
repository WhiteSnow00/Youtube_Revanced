import java.util.Arrays;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arum
{
    public final Status a;
    public final Object b;
    
    private arum(final Status a) {
        this.b = null;
        this.a = a;
        agot.z(a.f() ^ true, "cannot use OK status: %s", (Object)a);
    }
    
    private arum(final Object b) {
        this.b = b;
        this.a = null;
    }
    
    public static arum a(final Object o) {
        return new arum(o);
    }
    
    public static arum b(final Status status) {
        return new arum(status);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final arum arum = (arum)o;
                if (aeda.v(this.a, arum.a) && aeda.v(this.b, arum.b)) {
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
        if (this.b != null) {
            final aexp o = agot.O((Object)this);
            o.b("config", this.b);
            return o.toString();
        }
        final aexp o2 = agot.O((Object)this);
        o2.b("error", (Object)this.a);
        return o2.toString();
    }
}
