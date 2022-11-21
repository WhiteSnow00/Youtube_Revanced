import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asre extends AtomicReference implements Runnable, asln
{
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final asrf c;
    final AtomicBoolean d;
    
    public asre(final Object a, final long b, final asrf c) {
        this.d = new AtomicBoolean();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    final void a() {
        if (this.d.compareAndSet(false, true)) {
            final asrf c = this.c;
            final long b = this.b;
            final Object a = this.a;
            if (b == c.g) {
                if (c.get() != 0L) {
                    c.a.tt(a);
                    auop.E((AtomicLong)c, 1L);
                    asmr.b(this);
                    return;
                }
                c.ts();
                c.a.b(new aslw("Could not deliver value due to lack of requests"));
            }
        }
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void run() {
        this.a();
    }
    
    @Override
    public final boolean tz() {
        return this.get() == asmr.a;
    }
}
