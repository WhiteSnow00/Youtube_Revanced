import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcw extends AtomicReference implements ashy
{
    private static final long serialVersionUID = -8693423678067375039L;
    final atcx a;
    
    public atcw(final atcx a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atcx a = this.a;
        asjv.b(a.b);
        aufk.i(a.a, t, (AtomicInteger)a, a.d);
    }
    
    @Override
    public final void d(final asir asir) {
        asjv.f(this, asir);
    }
    
    @Override
    public final void tu(final Object o) {
        asjv.b(this);
        this.a.f();
    }
    
    @Override
    public final void tx() {
        this.a.f();
    }
}
