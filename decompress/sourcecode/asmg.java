import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmg implements asgo
{
    private final asib a;
    private final AtomicBoolean b;
    private final asgo c;
    
    public asmg(final asib a, final AtomicBoolean b, final asgo c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void b(final Throwable t) {
        if (this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.b(t);
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic asic) {
        this.a.c(asic);
    }
    
    public final void tu() {
        if (this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.tu();
        }
    }
}
