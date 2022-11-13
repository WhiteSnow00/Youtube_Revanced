import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atfb extends AtomicReference implements asif, asir
{
    private static final long serialVersionUID = 3258103020495908596L;
    final asif a;
    final asjr b;
    
    public atfb(final asif a, final asjr b) {
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
    public final void ts(final Object o) {
        try {
            final asih asih = (asih)this.b.a(o);
            askk.b((Object)asih, "The single returned by the mapper is null");
            if (!this.tA()) {
                asih.ae((asif)new aswe((AtomicReference)this, this.a, 2));
            }
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.a.b(t);
        }
    }
}
