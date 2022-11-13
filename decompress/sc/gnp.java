import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnp implements vcv, fcd
{
    public static final int e = 0;
    public final gnc a;
    public final Executor b;
    public final heo c;
    public final e d;
    private final Executor f;
    private final fln g;
    
    public gnp(final gnc a, final Executor b, final Executor f, final fln g, final e d, final heo c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.d = d;
        this.g = g;
        this.c = c;
    }
    
    static void b(final Throwable t) {
        ttr.d("Could not determine if OfflineWatchEndpoint should be resolved for watch", t);
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (((ahbc)aiqj).ry((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
            final amwo amwo = (amwo)((ahbc)aiqj).rx((ahaq)OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
            ListenableFuture listenableFuture;
            if (amwo.c.isEmpty()) {
                listenableFuture = afwm.m((Object)gno.a(Optional.empty(), true));
            }
            else {
                listenableFuture = aftq.f(aftq.e((ListenableFuture)afvk.m(vdh.aY(this.g.b(amwo.c).C((asjr)gkr.j).aa((Object)Optional.empty()))), (aezf)new glc(4), this.b), (aftz)new fdy(this, 10), this.b);
            }
            teu.k(listenableFuture, this.f, (tes)gnn.a, (tet)new fdh(this, aiqj, map, amwo, 3));
            return;
        }
        throw new vdj("Command is not an OfflineWatchEndpoint.");
    }
}
