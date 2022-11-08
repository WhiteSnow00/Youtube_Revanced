import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class dcn implements ThreadFactory
{
    public dcn() {
    }
    
    @Override
    public final Thread newThread(final Runnable runnable) {
        synchronized (this) {
            final Thread thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }
}
