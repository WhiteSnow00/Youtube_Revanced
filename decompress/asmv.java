import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class asmv implements ashd
{
    private final asiq a;
    private final AtomicBoolean b;
    private final ashd c;
    
    public asmv(final asiq a, final AtomicBoolean b, final ashd c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        this.a.c(asir);
    }
    
    @Override
    public final void tx() {
        if (this.b.compareAndSet(false, true)) {
            this.a.dispose();
            this.c.tx();
        }
    }
}
