import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewq extends ewo
{
    final AtomicBoolean b;
    private final atke c;
    private final Executor d;
    private final Runnable e;
    
    public ewq(final vaf vaf, final atke c, final Executor d, final Runnable e) {
        super(vaf);
        this.b = new AtomicBoolean(false);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        if (((vai)this.c.a()).aJ() >= 3L) {
            this.d.execute(this.e);
            return;
        }
        this.e.run();
    }
    
    public final boolean b() {
        return this.b.compareAndSet(false, true);
    }
}
