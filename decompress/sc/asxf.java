import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxf extends AtomicReference implements asho
{
    private static final long serialVersionUID = -3051469169682093892L;
    final asxg a;
    
    public asxf(final asxg a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asxg a = this.a;
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
        final asxg a = this.a;
        a.i = i;
        a.j = 2;
        a.f();
    }
    
    @Override
    public final void tx() {
        final asxg a = this.a;
        a.j = 0;
        a.f();
    }
}
