import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadPoolExecutor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvh extends ThreadPoolExecutor
{
    public dvh(final int n, final int n2, final int n3) {
        super(n, n2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new dvg(n3));
    }
}
