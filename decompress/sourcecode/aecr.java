import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aecr
{
    public static final aecr a;
    public final Executor b;
    
    static {
        a = new aecr(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(50), (ThreadFactory)new lwi(4, (byte[])null)));
    }
    
    private aecr(final Executor b) {
        this.b = b;
    }
}
