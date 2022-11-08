import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import java.util.Map;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.e;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnj implements vau, fbz
{
    public final gmv a;
    public final Executor b;
    public final eg c;
    public final e d;
    private final Executor f;
    private final flg g;
    
    public gnj(final gmv a, final Executor b, final Executor f, final flg g, final e d, final eg c, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this.a = a;
        this.b = b;
        this.f = f;
        this.d = d;
        this.g = g;
        this.c = c;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        if (((agzd)aioe).rs((agyr)OfflineWatchEndpointOuterClass.offlineWatchEndpoint)) {
            final amuk amuk = (amuk)((agzd)aioe).rr((agyr)OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
            ListenableFuture listenableFuture;
            if (amuk.c.isEmpty()) {
                listenableFuture = afva.m((Object)gni.a(Optional.empty(), true));
            }
            else {
                listenableFuture = afrp.f(afrp.e((ListenableFuture)aftj.m(uji.P(this.g.b(amuk.c).C((asjc)gkj.j).aa((Object)Optional.empty()))), (aexg)new gku(4), this.b), (afry)new fdr(this, 10), this.b);
            }
            tcp.k(listenableFuture, this.f, (tcn)gnh.a, (tco)new fdd(this, aioe, map, amuk, 3));
            return;
        }
        throw new vbh("Command is not an OfflineWatchEndpoint.");
    }
}
