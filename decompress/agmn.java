import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmn
{
    public static final Executor a;
    
    static {
        a = (Executor)rs.g;
    }
    
    public static ExecutorService a() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new emm("firebase-iid-executor", 2));
    }
}
