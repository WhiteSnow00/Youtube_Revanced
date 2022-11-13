import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atdj extends AtomicReference implements Runnable, asir
{
    private static final long serialVersionUID = -2809475196591179431L;
    final ashy a;
    
    public atdj(final ashy a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        asjv.b(this);
    }
    
    @Override
    public final void run() {
        if (!this.tA()) {
            this.a.tu(0L);
            this.lazySet(asjw.a);
            this.a.tx();
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get() == asjv.a;
    }
}
