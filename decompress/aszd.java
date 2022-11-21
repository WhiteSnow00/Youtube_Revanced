import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszd extends AtomicReference implements askk
{
    private static final long serialVersionUID = -1266041316834525931L;
    final asze a;
    
    public aszd(final asze a) {
        this.a = a;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asze a = this.a;
        if (asmr.b(a)) {
            a.a.b(t);
            return;
        }
        aqvq.w(t);
    }
    
    @Override
    public final void d(final asln asln) {
        asmr.f(this, asln);
    }
    
    @Override
    public final void tr(final Object o) {
        this.a.c();
    }
    
    @Override
    public final void tw() {
        this.a.c();
    }
}
