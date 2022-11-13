import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class asin implements Runnable, asir
{
    private final Handler a;
    private final Runnable b;
    private volatile boolean c;
    
    public asin(final Handler a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void dispose() {
        this.a.removeCallbacks((Runnable)this);
        this.c = true;
    }
    
    @Override
    public final void run() {
        try {
            this.b.run();
        }
        finally {
            final Throwable t;
            atqx.j(t);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.c;
    }
}
