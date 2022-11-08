import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswl extends AtomicReference implements ashq
{
    private static final long serialVersionUID = 8042919737683345351L;
    final aswm a;
    volatile Object b;
    
    public aswl(final aswm a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        final aswm a = this.a;
        if (atqc.g(a.f, (Object)this, (Object)null) && athp.e(a.d, t)) {
            a.g.tq();
            a.d();
            a.g();
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic asic) {
        asjg.f(this, asic);
    }
    
    public final void tp(final Object b) {
        this.b = b;
        this.a.g();
    }
}
