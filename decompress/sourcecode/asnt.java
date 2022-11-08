import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asnt extends AtomicReference implements Runnable, asic
{
    private static final long serialVersionUID = 6812032969491025141L;
    final Object a;
    final long b;
    final asnu c;
    final AtomicBoolean d;
    
    public asnt(final Object a, final long b, final asnu c) {
        this.d = new AtomicBoolean();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    final void a() {
        if (this.d.compareAndSet(false, true)) {
            final asnu c = this.c;
            final long b = this.b;
            final Object a = this.a;
            if (b == c.g) {
                if (c.get() != 0L) {
                    c.a.tr(a);
                    atnp.m((AtomicLong)c, 1L);
                    asjg.b(this);
                    return;
                }
                c.tq();
                c.a.b((Throwable)new asil("Could not deliver value due to lack of requests"));
            }
        }
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    @Override
    public final void run() {
        this.a();
    }
    
    public final boolean tx() {
        return this.get() == asjg.a;
    }
}
