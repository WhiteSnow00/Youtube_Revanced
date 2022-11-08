import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvq extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = 4603919676453758899L;
    final ashq a;
    final ashs b;
    
    public asvq(final ashq a, final ashs b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic asic) {
        if (asjg.f(this, asic)) {
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tp(final Object o) {
        this.a.tp(o);
    }
    
    public final void tu() {
        final asic asic = this.get();
        if (asic != asjg.a && this.compareAndSet((asjg)asic, null)) {
            this.b.ad((ashq)new asvp(this.a, this, 0));
        }
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
