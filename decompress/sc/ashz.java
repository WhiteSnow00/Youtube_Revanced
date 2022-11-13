// 
// Decompiled by Procyon v0.6.0
// 

final class ashz implements Runnable, asir
{
    final Runnable a;
    final asic b;
    Thread c;
    
    public ashz(final Runnable a, final asic b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            final asic b = this.b;
            if (b instanceof atha) {
                final atha atha = (atha)b;
                if (!atha.c) {
                    atha.c = true;
                    atha.b.shutdown();
                }
                return;
            }
        }
        this.b.dispose();
    }
    
    @Override
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        }
        finally {
            this.dispose();
            this.c = null;
        }
    }
    
    @Override
    public final boolean tA() {
        return this.b.tA();
    }
}
