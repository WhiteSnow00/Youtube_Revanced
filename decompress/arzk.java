import java.util.Arrays;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzk
{
    public final Status a;
    public final Object b;
    
    private arzk(final Status a) {
        this.b = null;
        this.a = a;
        adme.P(a.f() ^ true, "cannot use OK status: %s", a);
    }
    
    private arzk(final Object b) {
        this.b = b;
        this.a = null;
    }
    
    public static arzk a(final Object o) {
        return new arzk(o);
    }
    
    public static arzk b(final Status status) {
        return new arzk(status);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final arzk arzk = (arzk)o;
                if (aexq.c(this.a, arzk.a) && aexq.c(this.b, arzk.b)) {
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
            final afbg ae = adme.ae(this);
            ae.b("config", this.b);
            return ae.toString();
        }
        final afbg ae2 = adme.ae(this);
        ae2.b("error", this.a);
        return ae2.toString();
    }
}
