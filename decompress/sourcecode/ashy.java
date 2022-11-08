import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class ashy implements Runnable, asic
{
    private final Handler a;
    private final Runnable b;
    private volatile boolean c;
    
    public ashy(final Handler a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
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
            aulo.r(t);
        }
    }
    
    public final boolean tx() {
        return this.c;
    }
}
