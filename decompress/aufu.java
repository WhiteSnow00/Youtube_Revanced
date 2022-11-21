import org.chromium.net.UrlRequest$Builder;
import org.chromium.net.ExperimentalUrlRequest$Builder;
import org.chromium.net.RequestFinishedInfo$Listener;
import org.chromium.net.UrlRequest$Callback;
import org.chromium.net.ExperimentalBidirectionalStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream$Callback;
import org.chromium.net.ExperimentalCronetEngine;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aufu extends ExperimentalCronetEngine
{
    protected abstract ExperimentalBidirectionalStream a(final String p0, final BidirectionalStream$Callback p1, final Executor p2, final String p3, final List p4, final int p5, final boolean p6, final Collection p7, final boolean p8, final int p9, final boolean p10, final int p11, final long p12);
    
    protected abstract auhg b(final String p0, final UrlRequest$Callback p1, final Executor p2, final int p3, final Collection p4, final boolean p5, final boolean p6, final boolean p7, final boolean p8, final int p9, final boolean p10, final int p11, final RequestFinishedInfo$Listener p12, final int p13, final long p14);
    
    public final ExperimentalUrlRequest$Builder newUrlRequestBuilder(final String s, final UrlRequest$Callback urlRequest$Callback, final Executor executor) {
        return new auhh(s, urlRequest$Callback, executor, this);
    }
    
    public /* bridge */ UrlRequest$Builder newUrlRequestBuilder(final String s, final UrlRequest$Callback urlRequest$Callback, final Executor executor) {
        return (UrlRequest$Builder)this.newUrlRequestBuilder(s, urlRequest$Callback, executor);
    }
}
