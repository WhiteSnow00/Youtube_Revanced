import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.CountDownLatch;
import java.io.Closeable;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afvv extends IdentityHashMap implements Closeable
{
    public final adgg a;
    private volatile boolean b;
    private volatile CountDownLatch c;
    
    public afvv() {
        this.a = new adgg(this);
    }
    
    public final void a(final Closeable closeable, final Executor executor) {
        executor.getClass();
        if (closeable == null) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                this.put(closeable, executor);
                return;
            }
            monitorexit(this);
            afvx.f(closeable, executor);
        }
    }
    
    @Override
    public final void close() {
        if (this.b) {
            return;
        }
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return;
            }
            this.b = true;
            monitorexit(this);
            for (final Map.Entry entry : this.entrySet()) {
                afvx.f((Closeable)entry.getKey(), (Executor)entry.getValue());
            }
            this.clear();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
