import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewm extends ewk
{
    final AtomicBoolean b;
    private final atjj c;
    private final Executor d;
    private final Runnable e;
    
    public ewm(final uyf uyf, final atjj c, final Executor d, final Runnable e) {
        super(uyf);
        this.b = new AtomicBoolean(false);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void a() {
        if (((uyi)this.c.a()).aI() >= 3L) {
            this.d.execute(this.e);
            return;
        }
        this.e.run();
    }
    
    @Override
    public final boolean b() {
        return this.b.compareAndSet(false, true);
    }
}
