import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atff extends AtomicReference implements asif, asir
{
    private static final long serialVersionUID = -5843758257109742742L;
    final asho a;
    final asjr b;
    
    public atff(final asho a, final asjr b) {
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
            final ashq ashq = (ashq)this.b.a(o);
            askk.b((Object)ashq, "The mapper returned a null MaybeSource");
            if (!this.tA()) {
                ashq.ag((asho)new asvu((AtomicReference)this, this.a, 3));
            }
        }
        finally {
            final Throwable t;
            asgz.c(t);
            this.b(t);
        }
    }
}
