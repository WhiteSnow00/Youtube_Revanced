// 
// Decompiled by Procyon v0.6.0
// 

final class askv implements Runnable, asln
{
    final Runnable a;
    final asky b;
    Thread c;
    
    public askv(final Runnable a, final asky b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void dispose() {
        if (this.c == Thread.currentThread()) {
            final asky b = this.b;
            if (b instanceof atjx) {
                final atjx atjx = (atjx)b;
                if (!atjx.c) {
                    atjx.c = true;
                    atjx.b.shutdown();
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
    public final boolean tz() {
        return this.b.tz();
    }
}
