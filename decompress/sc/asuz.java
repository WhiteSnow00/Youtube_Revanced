import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asuz extends AtomicReference implements asho, ashd, asir
{
    private static final long serialVersionUID = -2177128922851101253L;
    final ashd a;
    final asjr b;
    
    public asuz(final ashd a, final asjr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.h((AtomicReference)this, asir);
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
        try {
            final ashf ashf = (ashf)this.b.a(o);
            askk.b((Object)ashf, "The mapper returned a null CompletableSource");
            if (!this.tA()) {
                ashf.Y(this);
            }
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.b(t);
        }
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
