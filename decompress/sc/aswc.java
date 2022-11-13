import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswc extends AtomicReference implements asho, asir
{
    private static final long serialVersionUID = -2223459372976438024L;
    final asho a;
    final ashq b;
    
    public aswc(final asho a, final ashq b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f((AtomicReference)this, asir)) {
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        this.a.ts(o);
    }
    
    @Override
    public final void tx() {
        final asir asir = this.get();
        if (asir != asjv.a && this.compareAndSet((asjv)asir, null)) {
            this.b.ag(new asvu(this.a, this, 2));
        }
    }
}
