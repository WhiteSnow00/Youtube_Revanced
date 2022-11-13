import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atwp extends atrn implements Executor
{
    public static final atwp c;
    private static final atqp d;
    
    static {
        c = new atwp();
        final atww c2 = atww.c;
        final int d2 = atwi.d("kotlinx.coroutines.io.parallelism", aryu.e(64, atwh.a), 0, 0, 12);
        if (d2 > 0) {
            d = (atqp)new atvr((atqp)c2, d2);
            return;
        }
        final StringBuilder sb = new StringBuilder("Expected positive parallelism level, but got ");
        sb.append(d2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private atwp() {
    }
    
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }
    
    public final void d(final atmd atmd, final Runnable runnable) {
        atmd.getClass();
        atwp.d.d(atmd, runnable);
    }
    
    public final void execute(final Runnable runnable) {
        runnable.getClass();
        this.d((atmd)atme.a, runnable);
    }
    
    public final String toString() {
        return "Dispatchers.IO";
    }
}
