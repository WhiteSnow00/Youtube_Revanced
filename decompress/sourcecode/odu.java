import com.google.common.util.concurrent.ListenableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class odu implements Runnable
{
    public final Runnable a;
    public final /* synthetic */ odv b;
    
    public odu(final odv b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final Thread currentThread = Thread.currentThread();
        final odv b = this.b;
        final afts e = b.e;
        final nlt nlt = new nlt(this, currentThread, 17);
        b.c.f();
        final aftq e2 = e.e((Runnable)nlt, 1L, this.b.c.g());
        try {
            this.a.run();
        }
        finally {
            ((ListenableFuture)e2).cancel(false);
        }
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
