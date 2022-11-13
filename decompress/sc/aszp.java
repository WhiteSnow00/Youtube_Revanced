import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszp extends AtomicReference implements ashy
{
    private static final long serialVersionUID = -4606175640614850599L;
    final long a;
    final aszq b;
    volatile boolean c;
    volatile askt d;
    int e;
    
    public aszp(final aszq b, final long a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (atih.e((AtomicReference)this.b.j, t)) {
            final aszq b = this.b;
            if (!b.e) {
                b.k();
            }
            this.c = true;
            this.b.f();
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir asir) {
        if (asjv.f(this, asir) && asir instanceof asko) {
            final asko asko = (asko)asir;
            final int tv = asko.tv(7);
            if (tv == 1) {
                this.e = 1;
                this.d = (askt)asko;
                this.c = true;
                this.b.f();
                return;
            }
            if (tv == 2) {
                this.e = 2;
                this.d = (askt)asko;
            }
        }
    }
    
    @Override
    public final void tu(final Object o) {
        if (this.e == 0) {
            final aszq b = this.b;
            Label_0099: {
                if (b.get() == 0 && b.compareAndSet(0, 1)) {
                    b.c.tu(o);
                    if (b.decrementAndGet() != 0) {
                        break Label_0099;
                    }
                }
                else {
                    Object d;
                    if ((d = this.d) == null) {
                        d = new atgh(b.g);
                        this.d = (askt)d;
                    }
                    ((askt)d).j(o);
                    if (b.getAndIncrement() == 0) {
                        break Label_0099;
                    }
                }
                return;
            }
            b.g();
            return;
        }
        this.b.f();
    }
    
    @Override
    public final void tx() {
        this.c = true;
        this.b.f();
    }
}
