import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class asos extends AtomicInteger implements asjz, asln
{
    private static final long serialVersionUID = 4109457741734051389L;
    final asjz a;
    final asmc b;
    asln c;
    
    public asos(final asjz a, final asmc b) {
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
                asjv.a(t);
                aqvq.w(t);
            }
        }
    }
    
    @Override
    public final void d(final asln c) {
        if (asmr.g(this.c, c)) {
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
    public final void tw() {
        this.a.tw();
        this.c();
    }
    
    @Override
    public final boolean tz() {
        return this.c.tz();
    }
}
