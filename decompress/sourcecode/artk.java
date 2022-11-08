import java.util.Arrays;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class artk
{
    public static final artk a;
    public final artn b;
    public final Status c;
    public final boolean d;
    private final aqzg e;
    
    static {
        a = new artk(null, Status.OK, false);
    }
    
    private artk(final artn b, final Status c, final boolean d) {
        this.b = b;
        this.e = null;
        c.getClass();
        this.c = c;
        this.d = d;
    }
    
    public static artk a(final Status status) {
        agot.v(status.f() ^ true, (Object)"drop status shouldn't be OK");
        return new artk(null, status, true);
    }
    
    public static artk b(final Status status) {
        agot.v(status.f() ^ true, (Object)"error status shouldn't be OK");
        return new artk(null, status, false);
    }
    
    public static artk c(final artn artn) {
        artn.getClass();
        return new artk(artn, Status.OK, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof artk)) {
            return false;
        }
        final artk artk = (artk)o;
        if (aeda.v(this.b, artk.b) && aeda.v(this.c, artk.c)) {
            final aqzg e = artk.e;
            if (aeda.v(null, null) && this.d == artk.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, null, this.d });
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("subchannel", (Object)this.b);
        o.b("streamTracerFactory", (Object)null);
        o.b("status", (Object)this.c);
        o.h("drop", this.d);
        return o.toString();
    }
}
