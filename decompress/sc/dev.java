import java.util.concurrent.ExecutorService;
import java.util.HashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.ref.ReferenceQueue;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dev
{
    final Map a;
    public final ReferenceQueue b;
    public volatile boolean c;
    public volatile det d;
    public qcy e;
    private final boolean f;
    
    public dev(final boolean f) {
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(new dhi(1));
        this.a = new HashMap();
        this.b = new ReferenceQueue();
        this.f = f;
        singleThreadExecutor.execute((Runnable)new dmc(this, 1));
    }
    
    public final dfs a(final ddk ddk) {
        synchronized (this) {
            final deu deu = this.a.get(ddk);
            if (deu == null) {
                return null;
            }
            final dfs dfs = deu.get();
            if (dfs == null) {
                this.c(deu);
            }
            return dfs;
        }
    }
    
    public final void b(final ddk ddk, final dfs dfs) {
        synchronized (this) {
            final deu deu = this.a.put(ddk, new deu(ddk, dfs, this.b, this.f));
            if (deu != null) {
                deu.a();
            }
        }
    }
    
    public final void c(final deu deu) {
        synchronized (this) {
            this.a.remove(deu.a);
            if (deu.b && deu.c != null) {
                monitorexit(this);
                this.e.ab(deu.a, new dfs(deu.c, true, false, deu.a, this.e, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null));
            }
        }
    }
    
    public final void d(final ddk ddk) {
        synchronized (this) {
            final deu deu = this.a.remove(ddk);
            if (deu != null) {
                deu.a();
            }
        }
    }
}
