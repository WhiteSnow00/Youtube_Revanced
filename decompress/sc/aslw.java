import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class aslw extends AtomicInteger implements ashd, asir
{
    private static final long serialVersionUID = 4109457741734051389L;
    final ashd a;
    final asjg b;
    asir c;
    
    public aslw(final ashd a, final asjg b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
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
                asgz.c(t);
                atqx.j(t);
            }
        }
    }
    
    @Override
    public final void d(final asir c) {
        if (asjv.g(this.c, c)) {
            this.c = c;
            this.a.d(this);
        }
    }
    
    @Override
    public final void dispose() {
        this.c.dispose();
        this.c();
    }
    
    @Override
    public final boolean tA() {
        return this.c.tA();
    }
    
    @Override
    public final void tx() {
        this.a.tx();
        this.c();
    }
}
