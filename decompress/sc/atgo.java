import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class atgo extends AtomicBoolean implements Runnable, asir
{
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable a;
    
    public atgo(final Runnable a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        this.lazySet(true);
    }
    
    @Override
    public final void run() {
        if (this.get()) {
            return;
        }
        try {
            this.a.run();
        }
        finally {
            this.lazySet(true);
        }
    }
    
    @Override
    public final boolean tA() {
        return this.get();
    }
}
