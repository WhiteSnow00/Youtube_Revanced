import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbt implements tan
{
    private final tmd b;
    private final AtomicBoolean c;
    
    public fbt(final tmd b) {
        this.c = new AtomicBoolean(false);
        this.b = b;
    }
    
    public final void a(final String s) {
        if (!"delayed_event_dispatch_default_tier_one_off_task".equals(s)) {
            return;
        }
        if (this.c.compareAndSet(false, true)) {
            this.b.s(38);
        }
    }
}
