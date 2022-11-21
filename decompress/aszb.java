import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszb extends AtomicReference implements askk, asln
{
    private static final long serialVersionUID = 4603919676453758899L;
    final aslb a;
    final asld b;
    
    public aszb(final aslb a, final asld b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asln asln) {
        if (asmr.f(this, asln)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void tr(final Object o) {
        this.a.tr(o);
    }
    
    @Override
    public final void tw() {
        final asln asln = this.get();
        if (asln != asmr.a && this.compareAndSet((asmr)asln, null)) {
            this.b.ae(new asza(this.a, this, 0));
        }
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
