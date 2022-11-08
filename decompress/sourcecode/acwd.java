import java.util.concurrent.ExecutionException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acwd implements acwu
{
    public final acvy a;
    public final acwe b;
    public final acwb c;
    public final ScheduledExecutorService d;
    private final boolean e;
    
    public acwd(final acvy a, final acwe b, final acwb c, final ScheduledExecutorService d, final ScheduledExecutorService d2, final tlq tlq) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = ((tlq.e(tlq.am) & 0x20L) != 0x0L);
        if ((tlq.e(tlq.am) & 0x20000000L) != 0x0L) {
            this.d = d2;
            return;
        }
        this.d = d;
    }
    
    @Override
    public final acwf a(final acwq acwq) {
        acwq.w = this.e;
        final ListenableFuture r = afva.r((afrx)new qdu(this, acwq, 19), this.d);
        ListenableFuture listenableFuture;
        if ((!this.a.k() && !this.a.l()) || acwq.d.isEmpty()) {
            listenableFuture = afva.m(acwf.a);
        }
        else {
            listenableFuture = afva.r((afrx)new qdu(this, acwq, 20), this.d);
        }
        final ListenableFuture t = afva.t(afva.n(r), this.a.c(), TimeUnit.MILLISECONDS, this.d);
        final ListenableFuture k = afva.E(t, listenableFuture).k((afrx)new pgk(this, t, listenableFuture, r, 6), (Executor)this.d);
        try {
            return (acwf)k.get();
        }
        catch (final ExecutionException | InterruptedException ex) {
            return acwf.a;
        }
    }
}
