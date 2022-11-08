import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arsv
{
    public final String a;
    public final arst b;
    public final long c;
    public final artf d;
    public final artf e;
    
    private arsv(final String a, final arst b, final long c, final artf artf, final artf e) {
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = c;
        this.d = null;
        this.e = e;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof arsv) {
            final arsv arsv = (arsv)o;
            if (aeda.v(this.a, arsv.a) && aeda.v(this.b, arsv.b) && this.c == arsv.c && aeda.v(this.d, arsv.d) && aeda.v(this.e, arsv.e)) {
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
        final aexp o = agot.O((Object)this);
        o.b("description", (Object)this.a);
        o.b("severity", (Object)this.b);
        o.g("timestampNanos", this.c);
        o.b("channelRef", (Object)this.d);
        o.b("subchannelRef", (Object)this.e);
        return o.toString();
    }
}
