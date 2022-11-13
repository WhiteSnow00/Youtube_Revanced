import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdo extends atiq
{
    final atdp a;
    boolean b;
    
    public atdo(final atdp a) {
        this.a = a;
    }
    
    public final void b(final Throwable t) {
        if (this.b) {
            atqx.j(t);
            return;
        }
        this.b = true;
        final atdp a = this.a;
        asjv.b(a.e);
        if (atih.e((AtomicReference)a.h, t)) {
            a.j = true;
            a.f();
            return;
        }
        atqx.j(t);
    }
    
    public final void tu(final Object o) {
        if (this.b) {
            return;
        }
        this.a.g();
    }
    
    public final void tx() {
        if (this.b) {
            return;
        }
        this.b = true;
        final atdp a = this.a;
        asjv.b(a.e);
        a.j = true;
        a.f();
    }
}
