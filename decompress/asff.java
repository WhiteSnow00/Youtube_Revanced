import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class asff
{
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;
    
    public asff(final int a, final long b, final long c, final double d, final Long e, final Set set) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (Set)afft.p((Collection)set);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof asff)) {
            return false;
        }
        final asff asff = (asff)o;
        return this.a == asff.a && this.b == asff.b && this.c == asff.c && Double.compare(this.d, asff.d) == 0 && adkp.ae(this.e, asff.e) && adkp.ae(this.f, asff.f);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f });
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab(this);
        ab.e("maxAttempts", this.a);
        ab.f("initialBackoffNanos", this.b);
        ab.f("maxBackoffNanos", this.c);
        ab.c("backoffMultiplier", (Object)String.valueOf(this.d));
        ab.b("perAttemptRecvTimeoutNanos", (Object)this.e);
        ab.b("retryableStatusCodes", (Object)this.f);
        return ab.toString();
    }
}
