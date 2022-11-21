import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class atds extends AtomicReference implements Runnable, asln
{
    private static final long serialVersionUID = 346773832286157679L;
    final asku a;
    long b;
    
    public atds(final asku a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void run() {
        if (this.get() != asmr.a) {
            final asku a = this.a;
            final long b = this.b;
            this.b = 1L + b;
            a.tt(b);
        }
    }
    
    @Override
    public final boolean tz() {
        return this.get() == asmr.a;
    }
}
