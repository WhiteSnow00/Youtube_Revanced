import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvv extends AtomicReference implements asho, asir
{
    private static final long serialVersionUID = 2026620218879969836L;
    final asho a;
    final asjr b;
    final boolean c;
    
    public asvv(final asho a, final asjr b) {
        this.a = a;
        this.b = b;
        this.c = true;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (!this.c) {
            if (!(t instanceof Exception)) {
                this.a.b(t);
                return;
            }
        }
        try {
            final ashq ashq = (ashq)((askh)this.b).a;
            askk.b((Object)ashq, "The resumeFunction returned a null MaybeSource");
            asjv.h((AtomicReference)this, (asir)null);
            ashq.ag(new asvu(this.a, this, 0));
        }
        finally {
            final Throwable t2;
            asgz.c(t2);
            this.a.b(new asiz(new Throwable[] { t, t2 }));
        }
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
    public final void ts(final Object o) {
        this.a.ts(o);
    }
    
    @Override
    public final void tx() {
        this.a.tx();
    }
}
