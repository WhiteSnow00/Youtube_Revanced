import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arxv
{
    public final String a;
    public final arxt b;
    public final long c;
    public final aryd d;
    public final aryd e;
    
    private arxv(final String a, final arxt b, final long c, final aryd aryd, final aryd e) {
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        this.d = null;
        this.e = e;
    }
    
    public arxv(final String s, final arxt arxt, final long n, final aryd aryd, final aryd aryd2, final arxu arxu) {
        this(s, arxt, n, null, aryd2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof arxv) {
            final arxv arxv = (arxv)o;
            if (aexq.c(this.a, arxv.a) && aexq.c(this.b, arxv.b) && this.c == arxv.c && aexq.c(this.d, arxv.d) && aexq.c(this.e, arxv.e)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e });
    }
    
    @Override
    public String toString() {
        final afbg ae = adme.ae(this);
        ae.b("description", this.a);
        ae.b("severity", this.b);
        ae.f("timestampNanos", this.c);
        ae.b("channelRef", this.d);
        ae.b("subchannelRef", this.e);
        return ae.toString();
    }
}
