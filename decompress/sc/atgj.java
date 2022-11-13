import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class atgj extends asic
{
    volatile boolean a;
    private final asjx b;
    private final asiq c;
    private final asjx d;
    private final atha e;
    
    public atgj(final atha e) {
        this.e = e;
        final asjx b = new asjx();
        this.b = b;
        final asiq c = new asiq();
        this.c = c;
        final asjx d = new asjx();
        (this.d = d).c((asir)b);
        d.c((asir)c);
    }
    
    public final asir a(final Runnable runnable) {
        if (this.a) {
            return (asir)asjw.a;
        }
        return (asir)this.e.h(runnable, 0L, TimeUnit.MILLISECONDS, (asju)this.b);
    }
    
    public final asir b(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        if (this.a) {
            return (asir)asjw.a;
        }
        return (asir)this.e.h(runnable, n, timeUnit, (asju)this.c);
    }
    
    public final void dispose() {
        if (!this.a) {
            this.a = true;
            this.d.dispose();
        }
    }
    
    public final boolean tA() {
        return this.a;
    }
}
