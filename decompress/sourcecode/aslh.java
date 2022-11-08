import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslh extends AtomicInteger implements asgo, asic
{
    private static final long serialVersionUID = 4109457741734051389L;
    final asgo a;
    final asir b;
    asic c;
    
    public aslh(final asgo a, final asir b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
        this.c();
    }
    
    final void c() {
        if (this.compareAndSet(0, 1)) {
            try {
                this.b.a();
            }
            finally {
                final Throwable t;
                asey.d(t);
                aulo.r(t);
            }
        }
    }
    
    public final void d(final asic c) {
        if (asjg.g(this.c, c)) {
            this.c = c;
            this.a.d((asic)this);
        }
    }
    
    public final void dispose() {
        this.c.dispose();
        this.c();
    }
    
    public final void tu() {
        this.a.tu();
        this.c();
    }
    
    public final boolean tx() {
        return this.c.tx();
    }
}
