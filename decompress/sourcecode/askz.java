import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class askz extends AtomicReference implements asgo
{
    private static final long serialVersionUID = -5454794857847146511L;
    final asla a;
    
    public askz(final asla a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        this.a.g(t);
    }
    
    public final void d(final asic asic) {
        asjg.h(this, asic);
    }
    
    public final void tu() {
        final asla a = this.a;
        a.k = false;
        a.d();
    }
}
