import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class atek implements asif
{
    final asiq a;
    final asif b;
    final AtomicBoolean c;
    asir d;
    
    public atek(final asif b, final asiq a, final AtomicBoolean c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void b(final Throwable t) {
        if (this.c.compareAndSet(false, true)) {
            this.a.d(this.d);
            this.a.dispose();
            this.b.b(t);
            return;
        }
        atqx.j(t);
    }
    
    @Override
    public final void d(final asir d) {
        this.d = d;
        this.a.c(d);
    }
    
    @Override
    public final void ts(final Object o) {
        if (this.c.compareAndSet(false, true)) {
            this.a.d(this.d);
            this.a.dispose();
            this.b.ts(o);
        }
    }
}
