import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgn extends AtomicReference implements Runnable, asir
{
    private static final long serialVersionUID = -4101336210206799084L;
    final asjz a;
    public final asjz b;
    
    public atgn(final Runnable runnable) {
        super(runnable);
        this.a = new asjz();
        this.b = new asjz();
    }
    
    @Override
    public final void dispose() {
        if (this.getAndSet(null) != null) {
            asjv.b(this.a);
            asjv.b(this.b);
        }
    }
    
    @Override
    public final void run() {
        final Runnable runnable = this.get();
        if (runnable != null) {
            try {
                runnable.run();
            }
            finally {
                this.lazySet(null);
                this.a.lazySet(asjv.a);
                this.b.lazySet(asjv.a);
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() == null;
    }
}
