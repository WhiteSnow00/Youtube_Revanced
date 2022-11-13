import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atfq extends AtomicReference implements asif, asir
{
    private static final long serialVersionUID = -5314538511045349925L;
    final asif a;
    final asjr b;
    
    public atfq(final asif a, final asjr b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        try {
            final asih asih = (asih)this.b.a((Object)t);
            askk.b((Object)asih, "The nextFunction returned a null SingleSource.");
            asih.ae((asif)new aswe((AtomicReference)this, this.a, 1));
        }
        finally {
            final Throwable t2;
            asgz.c(t2);
            this.a.b(new asiz(new Throwable[] { t, t2 }));
        }
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
        this.a.ts(o);
    }
}
