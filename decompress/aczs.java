import java.util.concurrent.ExecutionException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aczs implements adaj
{
    public final aczn a;
    public final aczt b;
    public final aczq c;
    public final ScheduledExecutorService d;
    private final boolean e;
    
    public aczs(final aczn a, final aczt b, final aczq c, final ScheduledExecutorService d, final ScheduledExecutorService d2, final tov tov) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = ((tov.e(tov.am) & 0x20L) != 0x0L);
        if ((tov.e(tov.am) & 0x20000000L) != 0x0L) {
            this.d = d2;
            return;
        }
        this.d = d;
    }
    
    @Override
    public final aczu a(final adaf adaf) {
        adaf.w = this.e;
        final ListenableFuture q = afxr.q((afvp)new qfx(this, adaf, 18), this.d);
        ListenableFuture listenableFuture;
        if ((!this.a.k() && !this.a.l()) || adaf.d.isEmpty()) {
            listenableFuture = afxr.l(aczu.a);
        }
        else {
            listenableFuture = afxr.q((afvp)new qfx(this, adaf, 19), this.d);
        }
        final ListenableFuture s = afxr.s(afxr.m(q), this.a.c(), TimeUnit.MILLISECONDS, this.d);
        final ListenableFuture k = afxr.M(s, listenableFuture).k((afvp)new pim(this, s, listenableFuture, q, 6), (Executor)this.d);
        try {
            return (aczu)k.get();
        }
        catch (final ExecutionException | InterruptedException ex) {
            return aczu.a;
        }
    }
}
