import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswi extends AtomicReference implements asho, asir
{
    private static final long serialVersionUID = -2187421758664251153L;
    final asho a;
    final aswh b;
    
    public aswi(final asho a) {
        this.a = a;
        this.b = new aswh(this);
    }
    
    @Override
    public final void b(final Throwable t) {
        asjv.b((AtomicReference)this.b);
        if (this.getAndSet(asjv.a) != asjv.a) {
            this.a.b(t);
            return;
        }
        atqx.j(t);
    }
    
    final void c() {
        if (asjv.b((AtomicReference)this)) {
            this.a.tx();
        }
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
        asjv.b((AtomicReference)this.b);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void ts(final Object o) {
        asjv.b((AtomicReference)this.b);
        if (this.getAndSet(asjv.a) != asjv.a) {
            this.a.ts(o);
        }
    }
    
    @Override
    public final void tx() {
        asjv.b((AtomicReference)this.b);
        if (this.getAndSet(asjv.a) != asjv.a) {
            this.a.tx();
        }
    }
}
