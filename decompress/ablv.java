import java.util.concurrent.Executor;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
import android.util.LruCache;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ablv
{
    public static final long a;
    public final LruCache b;
    public final oco c;
    public final thg d;
    
    static {
        a = TimeUnit.SECONDS.toMillis(10L);
    }
    
    public ablv(final oco c, final thg d) {
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        this.b = new LruCache(5);
    }
    
    public final Object a(final String s, final afci afci, final afbh afbh) {
        synchronized (this.b) {
            final Pair pair = (Pair)this.b.remove((Object)s);
            if (pair != null && this.c(pair)) {
                this.d.d((Object)new aaog());
                if (afbh.h()) {
                    ((xbt)afbh.c()).c("pl_efh");
                }
                return pair.first;
            }
            monitorexit(this.b);
            return afci.a();
        }
    }
    
    public final void b(final String s, final afci afci, final afbh afbh, final Executor executor) {
        executor.execute(aewf.h((Runnable)new aayk(this, s, afbh, afci, 2)));
    }
    
    public final boolean c(final Pair pair) {
        return pair != null && pair.first != null && this.c.d() < (long)pair.second;
    }
}
