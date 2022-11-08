import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvn extends AtomicReference implements asgz, asic
{
    private static final long serialVersionUID = -2223459372976438024L;
    final asgz a;
    final ashb b;
    
    public asvn(final asgz a, final ashb b) {
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
            this.b.ag((asgz)new asvf(this.a, this, 2));
        }
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
