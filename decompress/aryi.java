import java.util.Arrays;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aryi
{
    public static final aryi a;
    public final aryl b;
    public final Status c;
    public final boolean d;
    private final arxu e;
    
    static {
        a = new aryi(null, Status.OK, false);
    }
    
    private aryi(final aryl b, final Status c, final boolean d) {
        this.b = b;
        this.e = null;
        c.getClass();
        this.c = c;
        this.d = d;
    }
    
    public static aryi a(final Status status) {
        adme.L(status.f() ^ true, "drop status shouldn't be OK");
        return new aryi(null, status, true);
    }
    
    public static aryi b(final Status status) {
        adme.L(status.f() ^ true, "error status shouldn't be OK");
        return new aryi(null, status, false);
    }
    
    public static aryi c(final aryl aryl) {
        aryl.getClass();
        return new aryi(aryl, Status.OK, false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aryi)) {
            return false;
        }
        final aryi aryi = (aryi)o;
        if (aexq.c(this.b, aryi.b) && aexq.c(this.c, aryi.c)) {
            final arxu e = aryi.e;
            if (aexq.c(null, null) && this.d == aryi.d) {
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
        final afbg ae = adme.ae(this);
        ae.b("subchannel", this.b);
        ae.b("streamTracerFactory", null);
        ae.b("status", this.c);
        ae.g("drop", this.d);
        return ae.toString();
    }
}
