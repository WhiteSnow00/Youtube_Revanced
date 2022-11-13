import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class ataw extends AtomicReference implements Runnable, asir
{
    private static final long serialVersionUID = 346773832286157679L;
    final ashy a;
    long b;
    
    public ataw(final ashy a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
    }
    
    @Override
    public final void run() {
        if (this.get() != asjv.a) {
            final ashy a = this.a;
            final long b = this.b;
            this.b = 1L + b;
            a.tu(b);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() == asjv.a;
    }
}
