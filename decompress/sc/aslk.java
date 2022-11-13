import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslk extends AtomicReference implements ashd, asir
{
    private static final long serialVersionUID = -4101678820158072998L;
    final ashd a;
    final ashf b;
    
    public aslk(final ashd a, final ashf b) {
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
    public final void tx() {
        this.b.Y(new aslj(this, this.a));
    }
}
