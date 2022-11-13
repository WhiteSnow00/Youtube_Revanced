import java.util.concurrent.ExecutionException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyf implements acyw
{
    public final acya a;
    public final acyg b;
    public final acyd c;
    public final ScheduledExecutorService d;
    private final boolean e;
    
    public acyf(final acya a, final acyg b, final acyd c, final ScheduledExecutorService d, final ScheduledExecutorService d2, final tnu tnu) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = ((tnu.e(tnu.am) & 0x20L) != 0x0L);
        if ((tnu.e(tnu.am) & 0x20000000L) != 0x0L) {
            this.d = d2;
            return;
        }
        this.d = d;
    }
    
    public final acyh a(final acys acys) {
        acys.w = this.e;
        final ListenableFuture r = afwm.r((afty)new qfe(this, acys, 18), (Executor)this.d);
        ListenableFuture listenableFuture;
        if ((!this.a.k() && !this.a.l()) || acys.d.isEmpty()) {
            listenableFuture = afwm.m((Object)acyh.a);
        }
        else {
            listenableFuture = afwm.r((afty)new qfe(this, acys, 19), (Executor)this.d);
        }
        final ListenableFuture t = afwm.t(afwm.n(r), (long)this.a.c(), TimeUnit.MILLISECONDS, this.d);
        final ListenableFuture k = afwm.L(new ListenableFuture[] { t, listenableFuture }).k((afty)new phu(this, t, listenableFuture, r, 6), this.d);
        try {
            return (acyh)k.get();
        }
        catch (final ExecutionException | InterruptedException ex) {
            return acyh.a;
        }
    }
}
