import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asuk extends AtomicReference implements asgz, asgo, asic
{
    private static final long serialVersionUID = -2177128922851101253L;
    final asgo a;
    final asjc b;
    
    public asuk(final asgo a, final asjc b) {
        this.a = a;
        this.b = b;
    }
    
    public final void b(final Throwable t) {
        this.a.b(t);
    }
    
    public final void d(final asic asic) {
        asjg.h(this, asic);
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    public final void tp(final Object o) {
        try {
            final asgq asgq = (asgq)this.b.a(o);
            asjv.b((Object)asgq, "The mapper returned a null CompletableSource");
            if (!this.tx()) {
                asgq.Y((asgo)this);
            }
        }
        finally {
            final Throwable t;
            asey.d(t);
            this.b(t);
        }
    }
    
    public final void tu() {
        this.a.tu();
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
