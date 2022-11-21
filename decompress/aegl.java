import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aegl
{
    public static final aegl a;
    public final Executor b;
    
    static {
        a = new aegl(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(50), (ThreadFactory)new lyb(4, (byte[])null)));
    }
    
    private aegl(final Executor b) {
        this.b = b;
    }
}
