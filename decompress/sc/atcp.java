import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcp extends AtomicReference implements ashy, asir
{
    private static final long serialVersionUID = 8094547886072529208L;
    final ashy a;
    final AtomicReference b;
    
    public atcp(final ashy a) {
        this.a = a;
        this.b = new AtomicReference();
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this.b, asir);
    }
    
    @Override
    public final void dispose() {
        asjv.b(this.b);
        asjv.b(this);
    }
    
    @Override
    public final boolean tA() {
        return asjv.c(this.get());
    }
    
    @Override
    public final void tu(final Object o) {
        this.a.tu(o);
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
