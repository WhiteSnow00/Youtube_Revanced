import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwu implements dvj
{
    public static dwu a;
    public static final aerl c;
    public final ThreadPoolExecutor b;
    
    static {
        final boolean a = dyo.a;
        c = new aerl(2, 2, 5);
    }
    
    public dwu(final aerl aerl, final byte[] array) {
        this.b = (ThreadPoolExecutor)new dvg(aerl.a, aerl.b, aerl.c);
    }
    
    public static dwu d(final aerl aerl) {
        return new dwu(aerl, null);
    }
    
    public final void a(final Runnable runnable) {
        this.b.remove(runnable);
    }
    
    public final void b() {
    }
    
    public final void c(final Runnable runnable) {
        try {
            this.b.execute(runnable);
        }
        catch (final RejectedExecutionException ex) {
            throw new RuntimeException("Cannot execute layout calculation task; ".concat(ex.toString()));
        }
    }
}
