import java.util.Map;
import java.util.List;
import com.google.protos.youtube.api.innertube.ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnf extends gow
{
    private final vcy g;
    
    public gnf(final Context context, final tgd tgd, final abll abll, final tqd tqd, final vcy g, final Executor executor, final aeea aeea, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        abll.getClass();
        super(context, tgd, tqd, (atke)new esd(abll, 9, null, null), new gog(abll, 1, null, null), executor, aeea, null, null, null);
        this.g = g;
    }
    
    @Override
    protected final int b() {
        return 2132020194;
    }
    
    @Override
    protected final int c() {
        return 2132020195;
    }
    
    @Override
    public final int d() {
        return 2132020196;
    }
    
    @Override
    public final vms e(final aiqj aiqj, final Object o) {
        return (vms)new fco(aiqj, o);
    }
    
    @Override
    public final void f(final aiqj aiqj) {
        this.g.d((List)((ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint)((ahbc)aiqj).rx((ahaq)ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.clearWatchHistoryEndpoint)).b, (Map)null);
    }
}
