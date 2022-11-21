import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arzj
{
    public final int a;
    public final arzw b;
    public final asae c;
    public final arzn d;
    public final Executor e;
    private final ScheduledExecutorService f;
    private final arwt g;
    
    public arzj(final Integer n, final arzw b, final asae c, final arzn d, final ScheduledExecutorService f, final arwt g, final Executor e) {
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
        final afbg ae = adme.ae(this);
        ae.e("defaultPort", this.a);
        ae.b("proxyDetector", this.b);
        ae.b("syncContext", this.c);
        ae.b("serviceConfigParser", this.d);
        ae.b("scheduledExecutorService", this.f);
        ae.b("channelLogger", this.g);
        ae.b("executor", this.e);
        ae.b("overrideAuthority", null);
        return ae.toString();
    }
}
