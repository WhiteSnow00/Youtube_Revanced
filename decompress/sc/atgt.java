import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atgt extends asid
{
    public static final asid b;
    static final asic c;
    static final asir d;
    
    static {
        b = new atgt();
        c = (asic)new atgs();
        (d = asfn.c()).dispose();
    }
    
    private atgt() {
    }
    
    @Override
    public final asic a() {
        return atgt.c;
    }
    
    @Override
    public final asir c(final Runnable runnable, final long n, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }
    
    @Override
    public final asir d(final Runnable runnable, final long n, final long n2, final TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
    
    @Override
    public final asir f(final Runnable runnable) {
        runnable.run();
        return atgt.d;
    }
}
