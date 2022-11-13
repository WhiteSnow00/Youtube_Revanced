import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswa extends AtomicReference implements asho, asir
{
    private static final long serialVersionUID = 8571289934935992137L;
    final asjz a;
    final asho b;
    
    public aswa(final asho b) {
        this.b = b;
        this.a = new asjz();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.b.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
        asjv.b((AtomicReference)this.a);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        this.b.ts(o);
    }
    
    @Override
    public final void tx() {
        this.b.tx();
    }
}
