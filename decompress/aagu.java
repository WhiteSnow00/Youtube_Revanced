import java.util.concurrent.Executor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aagu
{
    public final ScheduledExecutorService a;
    public final vey b;
    public final atnb c;
    public final atnb d;
    public final atnb e;
    public aafu f;
    public ListenableFuture g;
    public ListenableFuture h;
    private ListenableFuture i;
    
    public aagu(final ScheduledExecutorService a, final vey b, final atnb c, final atnb d, final atnb e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static void b(final Throwable t) {
        tut.d("[Offline] Error clean up offline playback position data", t);
    }
    
    public static void c(final Throwable t) {
        tut.d("[Offline] Error remove single offline playback position data", t);
    }
    
    public static final void d(final Throwable t) {
        dbm dbm;
        if (t instanceof dbm) {
            dbm = (dbm)t;
        }
        else {
            dbm = new dbm(t);
        }
        tut.b("[Offline] OfflineVideoPlaybackPositionSyncService request failed: ".concat(String.valueOf(dbm.getMessage())));
    }
    
    public final void a() {
        final ListenableFuture i = this.i;
        if (i != null && !i.isCancelled() && !this.i.isDone()) {
            return;
        }
        tfx.k(this.i = afvh.f((ListenableFuture)afxb.m(afxr.l(((aadl)this.e.a()).a())), (afvq)aagt.a, (Executor)this.a), (Executor)afwd.a, (tfv)zvv.f, (tfw)new zvx(this, 2));
    }
}
