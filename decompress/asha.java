import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asha extends arym
{
    public final aryl a;
    final ashb b;
    private final AtomicBoolean c;
    
    public asha(final ashb b, final aryl a) {
        this.b = b;
        this.c = new AtomicBoolean(false);
        this.a = a;
    }
    
    @Override
    public final aryi a() {
        if (this.c.compareAndSet(false, true)) {
            ((asft)this.b.b).b.n.execute((Runnable)new asgz(this, 0));
        }
        return aryi.a;
    }
}
