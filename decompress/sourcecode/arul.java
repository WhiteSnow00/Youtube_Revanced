import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arul
{
    public final int a;
    public final arvb b;
    public final arvo c;
    public final arup d;
    public final Executor e;
    private final ScheduledExecutorService f;
    private final arrm g;
    
    public arul(final Integer n, final arvb b, final arvo c, final arup d, final ScheduledExecutorService f, final arrm g, final Executor e) {
        this.a = n;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
        this.e = e;
    }
    
    @Override
    public final String toString() {
        final aexp o = agot.O((Object)this);
        o.f("defaultPort", this.a);
        o.b("proxyDetector", (Object)this.b);
        o.b("syncContext", (Object)this.c);
        o.b("serviceConfigParser", (Object)this.d);
        o.b("scheduledExecutorService", (Object)this.f);
        o.b("channelLogger", (Object)this.g);
        o.b("executor", (Object)this.e);
        o.b("overrideAuthority", (Object)null);
        return o.toString();
    }
}
