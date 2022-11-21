import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.ExecutorService;
import java.lang.ref.ReferenceQueue;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aeuo
{
    public static final ConcurrentHashMap a;
    public final ReferenceQueue b;
    public final ExecutorService c;
    public final AtomicBoolean d;
    
    static {
        a = new ConcurrentHashMap();
    }
    
    public aeuo(final ExecutorService c) {
        this.b = new ReferenceQueue();
        this.d = new AtomicBoolean(false);
        this.c = c;
    }
}
