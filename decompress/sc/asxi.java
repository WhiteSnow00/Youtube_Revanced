import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxi extends AtomicReference implements asif
{
    private static final long serialVersionUID = -3051469169682093892L;
    final asxj a;
    
    public asxi(final asxj a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asxj a = this.a;
        if (atih.e((AtomicReference)a.c, t)) {
            final int k = a.k;
            a.f.dispose();
            a.j = 0;
            a.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.h((AtomicReference)this, asir);
    }
    
    @Override
    public final void ts(final Object i) {
        final asxj a = this.a;
        a.i = i;
        a.j = 2;
        a.f();
    }
}
