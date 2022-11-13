import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atev extends AtomicReference implements ashy, asir
{
    private static final long serialVersionUID = -8565274649390031272L;
    final asif a;
    final asih b;
    boolean c;
    
    public atev(final asif a, final asih b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.c) {
            atqx.j(t);
            return;
        }
        this.c = true;
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.d(this, asir)) {
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
    public final void tu(final Object o) {
        this.get().dispose();
        this.tx();
    }
    
    @Override
    public final void tx() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.ae((asif)new aswe((AtomicReference)this, this.a, 1));
    }
}
