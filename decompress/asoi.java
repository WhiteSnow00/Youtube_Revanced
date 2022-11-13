import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asoi extends AtomicReference implements Runnable, asir
{
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final asoj c;
    final AtomicBoolean d;
    
    public asoi(final Object a, final long b, final asoj c) {
        this.d = new AtomicBoolean();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    final void a() {
        if (this.d.compareAndSet(false, true)) {
            final asoj c = this.c;
            final long b = this.b;
            final Object a = this.a;
            if (b == c.g) {
                if (c.get() != 0L) {
                    c.a.tu(a);
                    asfn.A((AtomicLong)c, 1L);
                    asjv.b((AtomicReference)this);
                    return;
                }
                c.tt();
                c.a.b((Throwable)new asja("Could not deliver value due to lack of requests"));
            }
        }
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final void run() {
        this.a();
    }
    
    @Override
    public final boolean tA() {
        return this.get() == asjv.a;
    }
}
