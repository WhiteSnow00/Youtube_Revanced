import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atcr extends AtomicReference implements ashy
{
    private static final long serialVersionUID = 3837284832786408377L;
    final atcs a;
    final long b;
    final int c;
    volatile askt d;
    volatile boolean e;
    
    public atcr(final atcs a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        final atcs a = this.a;
        if (this.b == a.j && atih.e((AtomicReference)a.e, t)) {
            a.h.dispose();
            a.f = true;
            this.e = true;
            a.g();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f(this, asir)) {
            if (asir instanceof asko) {
                final asko asko = (asko)asir;
                final int tv = asko.tv(7);
                if (tv == 1) {
                    this.d = (askt)asko;
                    this.e = true;
                    this.a.g();
                    return;
                }
                if (tv == 2) {
                    this.d = (askt)asko;
                    return;
                }
            }
            this.d = (askt)new atgh(this.c);
        }
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.b == this.a.j) {
            if (o != null) {
                this.d.j(o);
            }
            this.a.g();
        }
    }
    
    @Override
    public final void tx() {
        if (this.b == this.a.j) {
            this.e = true;
            this.a.g();
        }
    }
}
