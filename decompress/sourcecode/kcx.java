import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

final class kcx
{
    final /* synthetic */ kde a;
    private final oas b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;
    
    public kcx(final kde a, final oas b, final ScheduledExecutorService c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        synchronized (this) {
            final ScheduledFuture d = this.d;
            if (d != null) {
                d.cancel(true);
            }
            final kde a = this.a;
            final aidh n = a.n;
            if (n == null) {
                return;
            }
            final agzc agzc = (agzc)((agzi)n).toBuilder();
            agzc.e((agyr)aidf.c, (Object)true);
            a.p((aidh)((agza)agzc).build());
        }
    }
    
    public final void b(final long n) {
        synchronized (this) {
            final ScheduledFuture d = this.d;
            if (d != null) {
                d.cancel(true);
            }
            if (n <= 0L) {
                return;
            }
            this.b.d();
            final ScheduledExecutorService c = this.c;
            final kde a = this.a;
            if (a.q == null) {
                a.q = new jnu(a, 11);
            }
            this.d = c.schedule(a.q, n, TimeUnit.MILLISECONDS);
        }
    }
}
