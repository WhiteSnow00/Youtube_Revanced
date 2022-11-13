// 
// Decompiled by Procyon v0.6.0
// 

final class asia implements Runnable, asir
{
    final Runnable a;
    final asic b;
    volatile boolean c;
    
    public asia(final Runnable a, final asic b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void dispose() {
        this.c = true;
        this.b.dispose();
    }
    
    @Override
    public final void run() {
        if (!this.c) {
            try {
                this.a.run();
            }
            finally {
                final Throwable t;
                asgz.c(t);
                this.b.dispose();
                throw atih.b(t);
            }
        }
    }
    
    @Override
    public final boolean tA() {
        return this.c;
    }
}
