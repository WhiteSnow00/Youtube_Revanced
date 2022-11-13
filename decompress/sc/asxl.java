import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asxl extends AtomicReference implements ashd
{
    private static final long serialVersionUID = -8003404460084760287L;
    final asxm a;
    
    public asxl(final asxm a) {
        this.a = a;
    }
    
    @Override
    public final void b(Throwable d) {
        final asxm a = this.a;
        if (arbu.G(a.e, (Object)this, (Object)null) && atih.e((AtomicReference)a.d, d)) {
            a.dispose();
            d = atih.d((AtomicReference)a.d);
            if (d != atih.a) {
                a.b.b(d);
            }
            return;
        }
        atqx.j(d);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f((AtomicReference)this, asir);
    }
    
    @Override
    public final void tx() {
        final asxm a = this.a;
        if (arbu.G(a.e, (Object)this, (Object)null) && a.f) {
            final Throwable d = atih.d((AtomicReference)a.d);
            if (d == null) {
                a.b.tx();
                return;
            }
            a.b.b(d);
        }
    }
}
