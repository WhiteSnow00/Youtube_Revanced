import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atvs extends atqs implements Executor
{
    public static final atvs c;
    private static final atpu d;
    
    static {
        c = new atvs();
        final atvz c2 = atvz.c;
        final int d2 = atvl.d("kotlinx.coroutines.io.parallelism", atnp.d(64, atvk.a), 0, 0, 12);
        if (d2 > 0) {
            d = new atuu(c2, d2);
            return;
        }
        final StringBuilder sb = new StringBuilder("Expected positive parallelism level, but got ");
        sb.append(d2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private atvs() {
    }
    
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }
    
    public final void d(final atli atli, final Runnable runnable) {
        atli.getClass();
        atvs.d.d(atli, runnable);
    }
    
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        this.d(atlj.a, runnable);
    }
    
    public final String toString() {
        return "Dispatchers.IO";
    }
}
