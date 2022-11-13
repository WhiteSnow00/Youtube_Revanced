import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asys extends AtomicReference implements Runnable, asir
{
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final asyt c;
    final AtomicBoolean d;
    
    public asys(final Object a, final long b, final asyt c) {
        this.d = new AtomicBoolean();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void dispose() {
        asjv.b((AtomicReference)this);
    }
    
    @Override
    public final void run() {
        if (this.d.compareAndSet(false, true)) {
            final asyt c = this.c;
            final long b = this.b;
            final Object a = this.a;
            if (b == c.g) {
                c.a.tu(a);
                asjv.b((AtomicReference)this);
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() == asjv.a;
    }
}
