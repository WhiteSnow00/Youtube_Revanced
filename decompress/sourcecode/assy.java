import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class assy extends AtomicReference implements asgw
{
    private static final long serialVersionUID = -3592821756711087922L;
    final /* synthetic */ assz a;
    
    public assy(final assz a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        athh.f(this.a.c);
        final assz a = this.a;
        aubt.x(a.a, t, a, a.d);
    }
    
    public final void f(final aujq aujq) {
        athh.k(this, aujq, Long.MAX_VALUE);
    }
    
    public final void tr(final Object o) {
        athh.f(this);
        this.tu();
    }
    
    public final void tu() {
        athh.f(this.a.c);
        final assz a = this.a;
        aubt.v(a.a, a, a.d);
    }
}
