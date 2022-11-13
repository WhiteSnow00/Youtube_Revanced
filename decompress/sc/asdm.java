import java.util.Arrays;
import java.util.Set;
import java.util.Collections;
import java.util.EnumSet;
import io.grpc.Status$Code;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asdm
{
    static final artw a;
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final asff f;
    final asbz g;
    
    static {
        a = artw.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    }
    
    public asdm(Map h, final boolean b, int n, final int n2) {
        this.b = ascm.c(h, "timeout");
        this.c = ascm.j(h);
        final Integer b2 = ascm.b(h, "maxResponseMessageBytes");
        this.d = b2;
        if (b2 != null) {
            adkp.M(b2 >= 0, "maxInboundMessageSize %s exceeds bounds", (Object)b2);
        }
        final Integer b3 = ascm.b(h, "maxRequestMessageBytes");
        if ((this.e = b3) != null) {
            adkp.M(b3 >= 0, "maxOutboundMessageSize %s exceeds bounds", (Object)b3);
        }
        Map h2;
        if (b) {
            h2 = ascm.h(h, "retryPolicy");
        }
        else {
            h2 = null;
        }
        asff f;
        if (h2 == null) {
            f = null;
        }
        else {
            final Integer b4 = ascm.b(h2, "maxAttempts");
            b4.getClass();
            final int intValue = b4;
            adkp.K(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            n = Math.min(intValue, n);
            final Long c = ascm.c(h2, "initialBackoff");
            c.getClass();
            final long longValue = c;
            adkp.L(longValue > 0L, "initialBackoffNanos must be greater than 0: %s", longValue);
            final Long c2 = ascm.c(h2, "maxBackoff");
            c2.getClass();
            final long longValue2 = c2;
            adkp.L(longValue2 > 0L, "maxBackoff must be greater than 0: %s", longValue2);
            final Double a = ascm.a(h2, "backoffMultiplier");
            a.getClass();
            final double doubleValue = a;
            adkp.M(doubleValue > 0.0, "backoffMultiplier must be greater than 0: %s", (Object)doubleValue);
            final Long c3 = ascm.c(h2, "perAttemptRecvTimeout");
            adkp.M(c3 == null || c3 >= 0L, "perAttemptRecvTimeout cannot be negative: %s", (Object)c3);
            final Set a2 = asfn.a(h2, "retryableStatusCodes");
            aefb.M(a2 != null, "%s is required in retry policy", (Object)"retryableStatusCodes");
            aefb.M(a2.contains(Status$Code.a) ^ true, "%s must not contain OK", (Object)"retryableStatusCodes");
            adkp.I(c3 != null || !a2.isEmpty(), (Object)"retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            f = new asff(n, longValue, longValue2, doubleValue, c3, a2);
        }
        this.f = f;
        if (b) {
            h = ascm.h(h, "hedgingPolicy");
        }
        else {
            h = null;
        }
        asbz g;
        if (h == null) {
            g = null;
        }
        else {
            final Integer b5 = ascm.b(h, "maxAttempts");
            b5.getClass();
            n = b5;
            adkp.K(n >= 2, "maxAttempts must be greater than 1: %s", n);
            n = Math.min(n, n2);
            final Long c4 = ascm.c(h, "hedgingDelay");
            c4.getClass();
            final long longValue3 = c4;
            adkp.L(longValue3 >= 0L, "hedgingDelay must not be negative: %s", longValue3);
            Set<Object> set = asfn.a(h, "nonFatalStatusCodes");
            if (set == null) {
                set = Collections.unmodifiableSet((Set<?>)EnumSet.noneOf(Status$Code.class));
            }
            else {
                aefb.M(true ^ set.contains(Status$Code.a), "%s must not contain OK", (Object)"nonFatalStatusCodes");
            }
            g = new asbz(n, longValue3, (Set)set);
        }
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof asdm)) {
            return false;
        }
        final asdm asdm = (asdm)o;
        return adkp.ae((Object)this.b, (Object)asdm.b) && adkp.ae((Object)this.c, (Object)asdm.c) && adkp.ae((Object)this.d, (Object)asdm.d) && adkp.ae((Object)this.e, (Object)asdm.e) && adkp.ae((Object)this.f, (Object)asdm.f) && adkp.ae((Object)this.g, (Object)asdm.g);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.d, this.e, this.f, this.g });
    }
    
    @Override
    public final String toString() {
        final aezo ab = adkp.ab((Object)this);
        ab.b("timeoutNanos", (Object)this.b);
        ab.b("waitForReady", (Object)this.c);
        ab.b("maxInboundMessageSize", (Object)this.d);
        ab.b("maxOutboundMessageSize", (Object)this.e);
        ab.b("retryPolicy", (Object)this.f);
        ab.b("hedgingPolicy", (Object)this.g);
        return ab.toString();
    }
}
