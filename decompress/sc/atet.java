import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atet extends AtomicReference implements ashd, asir
{
    private static final long serialVersionUID = -8565274649390031272L;
    final asif a;
    final asih b;
    
    public atet(final asif a, final asih b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f(this, asir)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
    
    @Override
    public final void tx() {
        this.b.ae((asif)new aswe((AtomicReference)this, this.a, 1));
    }
}
