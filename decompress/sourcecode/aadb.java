import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aadb
{
    public final ScheduledExecutorService a;
    public final vbq b;
    public final atjj c;
    public final atjj d;
    public final atjj e;
    public aacb f;
    public ListenableFuture g;
    public ListenableFuture h;
    private ListenableFuture i;
    
    public aadb(final ScheduledExecutorService a, final vbq b, final atjj c, final atjj d, final atjj e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static final void d(final Throwable t) {
        dbi dbi;
        if (t instanceof dbi) {
            dbi = (dbi)t;
        }
        else {
            dbi = new dbi(t);
        }
        trn.b("[Offline] OfflineVideoPlaybackPositionSyncService request failed: ".concat(String.valueOf(dbi.getMessage())));
    }
    
    public final void a() {
        final ListenableFuture i = this.i;
        if (i != null && !i.isCancelled() && !this.i.isDone()) {
            return;
        }
        tcp.k(this.i = afrp.f((ListenableFuture)aftj.m(afva.m(((zzu)this.e.a()).a())), (afry)aada.a, (Executor)this.a), (Executor)afsl.a, (tcn)zqg.h, (tco)new zmd(this, 4));
    }
}
