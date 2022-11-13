import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aslf extends AtomicReference implements ashy, asir
{
    private static final long serialVersionUID = -5417183359794346637L;
    final aslg a;
    final int b;
    public askt c;
    public volatile boolean d;
    int e;
    
    public aslf(final aslg a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        final asyn asyn = (asyn)this.a;
        if (atih.e((AtomicReference)asyn.e, t)) {
            if (asyn.n == 1) {
                asyn.h.dispose();
            }
            this.f();
            asyn.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f((AtomicReference)this, asir)) {
            if (asir instanceof asko) {
                final asko asko = (asko)asir;
                final int tv = asko.tv(3);
                if (tv == 1) {
                    this.e = 1;
                    this.c = (askt)asko;
                    this.d = true;
                    this.a.g(this);
                    return;
                }
                if (tv == 2) {
                    this.e = 2;
                    this.c = (askt)asko;
                    return;
                }
            }
            final int n = -this.b;
            asks c;
            if (n < 0) {
                c = new atgh(-n);
            }
            else {
                c = new atgg(n);
            }
            this.c = (askt)c;
        }
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    public final void f() {
        this.d = true;
    }
    
    @Override
    public final boolean tA() {
        return asjv.c((asir)this.get());
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.e == 0) {
            final aslg a = this.a;
            this.c.j(o);
            ((asyn)a).f();
            return;
        }
        this.a.f();
    }
    
    @Override
    public final void tx() {
        this.a.g(this);
    }
}
