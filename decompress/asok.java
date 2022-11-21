import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asok extends AtomicReference implements asjz
{
    private static final long serialVersionUID = -5454794857847146511L;
    final asol a;
    
    public asok(final asol a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        this.a.g(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.h(this, asln);
    }
    
    @Override
    public final void tw() {
        final asol a = this.a;
        a.k = false;
        a.d();
    }
}
