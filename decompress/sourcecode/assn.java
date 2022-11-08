import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class assn extends AtomicReference implements asgw
{
    private static final long serialVersionUID = -5592042965931999169L;
    final /* synthetic */ asso a;
    
    public assn(final asso a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        athh.f(this.a.b);
        final asso a = this.a;
        aubt.x(a.a, t, (AtomicInteger)a, a.e);
    }
    
    public final void f(final aujq aujq) {
        athh.k(this, aujq, Long.MAX_VALUE);
    }
    
    public final void tr(final Object o) {
        this.a.f = true;
        this.get().tq();
    }
    
    public final void tu() {
        this.a.f = true;
    }
}
