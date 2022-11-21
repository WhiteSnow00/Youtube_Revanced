import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class aspt extends AtomicReference implements Runnable, asln
{
    private static final long serialVersionUID = 3167244060586201109L;
    final asjz a;
    
    public aspt(final asjz a) {
        this.a = a;
    }
    
    @Override
    public final void dispose() {
        asmr.b(this);
    }
    
    @Override
    public final void run() {
        this.a.tw();
    }
    
    @Override
    public final boolean tz() {
        return asmr.c(this.get());
    }
}
