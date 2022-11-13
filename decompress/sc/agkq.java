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

public final class agkq implements agkt, agku
{
    private static final ThreadFactory c;
    public final aglh a;
    public final aglh b;
    private final Context d;
    private final Set e;
    private final Executor f;
    
    static {
        c = (ThreadFactory)odn.d;
    }
    
    public agkq(final Context d, final String s, final Set e, final aglh b) {
        final agjg a = new agjg(d, s, 2);
        final ThreadPoolExecutor f = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), agkq.c);
        this.a = (aglh)a;
        this.e = e;
        this.f = f;
        this.b = b;
        this.d = d;
    }
    
    public final nnc a() {
        if (!ajs.a(this.d)) {
            return nnv.c((Object)"");
        }
        return nnv.a(this.f, (Callable)new aerg(this, 2));
    }
    
    public final int b() {
        synchronized (this) {
            final long currentTimeMillis = System.currentTimeMillis();
            final Object a = this.a.a();
            if (((agnj)a).T(currentTimeMillis)) {
                ((agnj)a).P();
                return 3;
            }
            return 1;
        }
    }
    
    public final void c() {
        if (this.e.size() <= 0) {
            nnv.c((Object)null);
            return;
        }
        if (!ajs.a(this.d)) {
            nnv.c((Object)null);
            return;
        }
        nnv.a(this.f, (Callable)new aerg(this, 3));
    }
}
