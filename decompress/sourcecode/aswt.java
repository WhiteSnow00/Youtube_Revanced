import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswt extends AtomicReference implements ashq
{
    private static final long serialVersionUID = -3051469169682093892L;
    final aswu a;
    
    public aswt(final aswu a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        final aswu a = this.a;
        if (athp.e(a.c, t)) {
            final int k = a.k;
            a.f.dispose();
            a.j = 0;
            a.f();
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic asic) {
        asjg.h(this, asic);
    }
    
    public final void tp(final Object i) {
        final aswu a = this.a;
        a.i = i;
        a.j = 2;
        a.f();
    }
}
