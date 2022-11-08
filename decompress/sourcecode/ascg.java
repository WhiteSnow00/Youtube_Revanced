import java.util.Arrays;
import java.util.Set;
import java.util.Collections;
import java.util.EnumSet;
import io.grpc.Status$Code;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ascg
{
    static final arrj a;
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final asdy f;
    final asaq g;
    
    static {
        a = arrj.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    }
    
    public ascg(Map h, final boolean b, int n, final int n2) {
        this.b = asbf.c(h, "timeout");
        this.c = asbf.j(h);
        final Integer b2 = asbf.b(h, "maxResponseMessageBytes");
        this.d = b2;
        if (b2 != null) {
            agot.z(b2 >= 0, "maxInboundMessageSize %s exceeds bounds", (Object)b2);
        }
        final Integer b3 = asbf.b(h, "maxRequestMessageBytes");
        if ((this.e = b3) != null) {
            agot.z(b3 >= 0, "maxOutboundMessageSize %s exceeds bounds", (Object)b3);
        }
        Map h2;
        if (b) {
            h2 = asbf.h(h, "retryPolicy");
        }
        else {
            h2 = null;
        }
        asdy f;
        if (h2 == null) {
            f = null;
        }
        else {
            final Integer b4 = asbf.b(h2, "maxAttempts");
            b4.getClass();
            final int intValue = b4;
            agot.x(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            n = Math.min(intValue, n);
            final Long c = asbf.c(h2, "initialBackoff");
            c.getClass();
            final long longValue = c;
            agot.y(longValue > 0L, "initialBackoffNanos must be greater than 0: %s", longValue);
            final Long c2 = asbf.c(h2, "maxBackoff");
            c2.getClass();
            final long longValue2 = c2;
            agot.y(longValue2 > 0L, "maxBackoff must be greater than 0: %s", longValue2);
            final Double a = asbf.a(h2, "backoffMultiplier");
            a.getClass();
            final double doubleValue = a;
            agot.z(doubleValue > 0.0, "backoffMultiplier must be greater than 0: %s", (Object)doubleValue);
            final Long c3 = asbf.c(h2, "perAttemptRecvTimeout");
            agot.z(c3 == null || c3 >= 0L, "perAttemptRecvTimeout cannot be negative: %s", (Object)c3);
            final Set a2 = asey.a(h2, "retryableStatusCodes");
            agnj.C(a2 != null, "%s is required in retry policy", (Object)"retryableStatusCodes");
            agnj.C(a2.contains(Status$Code.a) ^ true, "%s must not contain OK", (Object)"retryableStatusCodes");
            agot.v(c3 != null || !a2.isEmpty(), (Object)"retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            f = new asdy(n, longValue, longValue2, doubleValue, c3, a2);
        }
        this.f = f;
        if (b) {
            h = asbf.h(h, "hedgingPolicy");
        }
        else {
            h = null;
        }
        asaq g;
        if (h == null) {
            g = null;
        }
        else {
            final Integer b5 = asbf.b(h, "maxAttempts");
            b5.getClass();
            n = b5;
            agot.x(n >= 2, "maxAttempts must be greater than 1: %s", n);
            n = Math.min(n, n2);
            final Long c4 = asbf.c(h, "hedgingDelay");
            c4.getClass();
            final long longValue3 = c4;
            agot.y(longValue3 >= 0L, "hedgingDelay must not be negative: %s", longValue3);
            Set<Object> set = asey.a(h, "nonFatalStatusCodes");
            if (set == null) {
                set = Collections.unmodifiableSet((Set<?>)EnumSet.noneOf(Status$Code.class));
            }
            else {
                agnj.C(true ^ set.contains(Status$Code.a), "%s must not contain OK", (Object)"nonFatalStatusCodes");
            }
            g = new asaq(n, longValue3, set);
        }
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof ascg)) {
            return false;
        }
        final ascg ascg = (ascg)o;
        return aeda.v((Object)this.b, (Object)ascg.b) && aeda.v((Object)this.c, (Object)ascg.c) && aeda.v((Object)this.d, (Object)ascg.d) && aeda.v((Object)this.e, (Object)ascg.e) && aeda.v((Object)this.f, (Object)ascg.f) && aeda.v((Object)this.g, (Object)ascg.g);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.d, this.e, this.f, this.g });
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.b("timeoutNanos", this.b);
        o.b("waitForReady", this.c);
        o.b("maxInboundMessageSize", this.d);
        o.b("maxOutboundMessageSize", this.e);
        o.b("retryPolicy", this.f);
        o.b("hedgingPolicy", this.g);
        return o.toString();
    }
}
