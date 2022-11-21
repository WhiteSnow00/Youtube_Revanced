import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aszk extends AtomicReference implements Runnable, asln
{
    private static final long serialVersionUID = 2875964065294031672L;
    final askk a;
    
    public aszk(final askk a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void run() {
        this.a.tr(0L);
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
