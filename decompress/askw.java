// 
// Decompiled by Procyon v0.6.0
// 

final class askw implements Runnable, asln
{
    final Runnable a;
    final asky b;
    volatile boolean c;
    
    public askw(final Runnable a, final asky b) {
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
                asjv.a(t);
                this.b.dispose();
                throw atle.b(t);
            }
        }
    }
    
    @Override
    public final boolean tz() {
        return this.c;
    }
}
