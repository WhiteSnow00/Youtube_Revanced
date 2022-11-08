import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class asvz extends AtomicReference implements Runnable, asic
{
    private static final long serialVersionUID = 2875964065294031672L;
    final asgz a;
    
    public asvz(final asgz a) {
        this.a = a;
    }
    
    public final void dispose() {
        asjg.b(this);
    }
    
    @Override
    public final void run() {
        this.a.tp((Object)0L);
    }
    
    public final boolean tx() {
        return asjg.c(this.get());
    }
}
