import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslr extends AtomicReference implements asgo, asic
{
    private static final long serialVersionUID = 251330541679988317L;
    final /* synthetic */ asls a;
    
    public aslr(final asls a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        final asls a = this.a;
        a.e.d((asic)this);
        if (!a.c) {
            a.f.tq();
            a.e.dispose();
            if (!athp.e(a.d, t)) {
                aulo.r(t);
                return;
            }
            if (a.getAndSet(0) > 0) {
                a.a.b(athp.d(a.d));
            }
        }
        else {
            if (!athp.e(a.d, t)) {
                aulo.r(t);
                return;
            }
            if (a.decrementAndGet() == 0) {
                a.a.b(athp.d(a.d));
                return;
            }
            if (a.b != Integer.MAX_VALUE) {
                a.f.e(1L);
            }
        }
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tu() {
        final asls a = this.a;
        a.e.d((asic)this);
        if (a.decrementAndGet() != 0) {
            if (a.b != Integer.MAX_VALUE) {
                a.f.e(1L);
            }
            return;
        }
        final Throwable t = a.d.get();
        if (t != null) {
            a.a.b(t);
            return;
        }
        a.a.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
