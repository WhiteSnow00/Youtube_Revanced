import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class asdy
{
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;
    
    public asdy(final int a, final long b, final long c, final double d, final Long e, final Set set) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (Set)afdu.p((Collection)set);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof asdy)) {
            return false;
        }
        final asdy asdy = (asdy)o;
        return this.a == asdy.a && this.b == asdy.b && this.c == asdy.c && Double.compare(this.d, asdy.d) == 0 && aeda.v(this.e, asdy.e) && aeda.v(this.f, asdy.f);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f });
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.f("maxAttempts", this.a);
        o.g("initialBackoffNanos", this.b);
        o.g("maxBackoffNanos", this.c);
        o.c("backoffMultiplier", (Object)String.valueOf(this.d));
        o.b("perAttemptRecvTimeoutNanos", (Object)this.e);
        o.b("retryableStatusCodes", (Object)this.f);
        return o.toString();
    }
}
