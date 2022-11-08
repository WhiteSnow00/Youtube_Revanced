import java.util.Map;
import java.util.List;
import com.google.protos.youtube.api.innertube.ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmz extends gop
{
    private final vax g;
    
    public gmz(final Context context, final tdz tdz, final abjm abjm, final tny tny, final vax g, final Executor executor, final aeby aeby, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        abjm.getClass();
        super(context, tdz, tny, (atjj)new esb(abjm, 9, null, null), (goo)new gnz(abjm, 1, null, null), executor, aeby, (byte[])null, (byte[])null, (byte[])null);
        this.g = g;
    }
    
    protected final int b() {
        return 2132020193;
    }
    
    protected final int c() {
        return 2132020194;
    }
    
    public final int d() {
        return 2132020195;
    }
    
    public final vko e(final aioe aioe, final Object o) {
        return (vko)new fck(aioe, o);
    }
    
    public final void f(final aioe aioe) {
        this.g.d((List)((ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint)((agzd)aioe).rr((agyr)ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.clearWatchHistoryEndpoint)).b, (Map)null);
    }
}
