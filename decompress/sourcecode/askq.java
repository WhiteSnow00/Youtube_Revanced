import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class askq extends AtomicReference implements ashj, asic
{
    private static final long serialVersionUID = -5417183359794346637L;
    final askr a;
    final int b;
    public aske c;
    public volatile boolean d;
    int e;
    
    public askq(final askr a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        final asxv asxv = (asxv)this.a;
        if (athp.e(asxv.e, t)) {
            if (asxv.n == 1) {
                asxv.h.dispose();
            }
            this.f();
            asxv.f();
            return;
        }
        aulo.r(t);
    }
    
    public final void d(final asic asic) {
        if (asjg.f(this, asic)) {
            if (asic instanceof asjz) {
                final asjz asjz = (asjz)asic;
                final int ts = asjz.ts(3);
                if (ts == 1) {
                    this.e = 1;
                    this.c = (aske)asjz;
                    this.d = true;
                    this.a.g(this);
                    return;
                }
                if (ts == 2) {
                    this.e = 2;
                    this.c = (aske)asjz;
                    return;
                }
            }
            final int n = -this.b;
            Object c;
            if (n < 0) {
                c = new atfp(-n);
            }
            else {
                c = new atfo(n);
            }
            this.c = (aske)c;
        }
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void f() {
        this.d = true;
    }
    
    public final void tr(final Object o) {
        if (this.e == 0) {
            final askr a = this.a;
            this.c.j(o);
            ((asxv)a).f();
            return;
        }
        this.a.f();
    }
    
    public final void tu() {
        this.a.g(this);
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
