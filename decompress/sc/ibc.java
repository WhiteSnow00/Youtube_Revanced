import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import j$.time.Instant;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibc implements ibe
{
    final aiqj a;
    final Instant b;
    public final ibf c;
    
    public ibc(final ibf c, final aiqj a, final Instant b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        if (this.c.e.c() - this.b.toEpochMilli() >= TimeUnit.SECONDS.toMillis(3L)) {
            ttr.m(ibf.a, "Timed out searching for devices.");
            this.c.c(this.a.c, false, Optional.empty());
            return;
        }
        this.c.g.schedule(new hvt(this, 9), 300L, TimeUnit.MILLISECONDS);
    }
    
    public final void b(final Optional optional) {
        this.c.c(this.a.c, true, optional);
    }
}
