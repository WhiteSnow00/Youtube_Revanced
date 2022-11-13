import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszv extends AtomicReference implements ashd, asir
{
    private static final long serialVersionUID = 8606673141535671828L;
    final aszw a;
    
    public aszv(final aszw a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final aszw a = this.a;
        a.d.d(this);
        a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this, asir);
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
        final aszw a = this.a;
        a.d.d(this);
        a.tx();
    }
}
