import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.Set;
import android.content.Context;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agip implements agis, agit
{
    private static final ThreadFactory c;
    public final agjg a;
    public final agjg b;
    private final Context d;
    private final Set e;
    private final Executor f;
    
    static {
        c = och.d;
    }
    
    public agip(final Context d, final String s, final Set e, final agjg b) {
        final aghe a = new aghe(d, s, 2);
        final ThreadPoolExecutor f = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), agip.c);
        this.a = (agjg)a;
        this.e = e;
        this.f = f;
        this.b = b;
        this.d = d;
    }
    
    public final nly a() {
        if (!ajr.a(this.d)) {
            return nmr.c((Object)"");
        }
        return nmr.a(this.f, (Callable)new adbx(this, 15));
    }
    
    public final int b() {
        synchronized (this) {
            final long currentTimeMillis = System.currentTimeMillis();
            final Object a = this.a.a();
            if (((agli)a).z(currentTimeMillis)) {
                ((agli)a).v();
                return 3;
            }
            return 1;
        }
    }
    
    public final void c() {
        if (this.e.size() <= 0) {
            nmr.c((Object)null);
            return;
        }
        if (!ajr.a(this.d)) {
            nmr.c((Object)null);
            return;
        }
        nmr.a(this.f, (Callable)new adbx(this, 16));
    }
}
