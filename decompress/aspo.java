import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspo extends AtomicReference implements ashd, asir
{
    private static final long serialVersionUID = 8606673141535671828L;
    final aspp a;
    
    public aspo(final aspp a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final aspp a = this.a;
        a.d.d((asir)this);
        a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
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
    public final void tx() {
        final aspp a = this.a;
        a.d.d((asir)this);
        a.tx();
    }
}
