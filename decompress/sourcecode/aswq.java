import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aswq extends AtomicReference implements asgz
{
    private static final long serialVersionUID = -3051469169682093892L;
    final aswr a;
    
    public aswq(final aswr a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        final aswr a = this.a;
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
        final aswr a = this.a;
        a.i = i;
        a.j = 2;
        a.f();
    }
    
    public final void tu() {
        final aswr a = this.a;
        a.j = 0;
        a.f();
    }
}
