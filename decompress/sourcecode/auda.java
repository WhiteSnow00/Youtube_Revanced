import java.net.Proxy;
import java.net.URLConnection;
import java.net.URL;
import org.chromium.net.UrlRequest$Builder;
import org.chromium.net.ExperimentalBidirectionalStream$Builder;
import java.net.URLStreamHandlerFactory;
import org.chromium.net.UrlRequest$Callback;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.RequestFinishedInfo$Listener;
import org.chromium.net.ExperimentalBidirectionalStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream$Callback;
import android.util.Log;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auda extends auch
{
    private static final String d = "auda";
    public final int b;
    public final aucq c;
    private final String e;
    private final ExecutorService f;
    
    public auda(final aucl aucl) {
        final int hashCode = this.hashCode();
        this.b = hashCode;
        final int b = aucl.b(9);
        this.e = aucl.e;
        this.f = new ThreadPoolExecutor(10, 20, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new aucy(b));
        final aucq a = aucr.a(aucl.a);
        this.c = a;
        try {
            a.b(hashCode, new aucn(aucl), new aucp(this.getVersionString().split("/")[1].split("@")[0]), 4);
        }
        catch (final RuntimeException ex) {
            Log.e(auda.d, "Error while trying to log JavaCronetEngine creation: ", (Throwable)ex);
        }
    }
    
    protected final ExperimentalBidirectionalStream a(final String s, final BidirectionalStream$Callback bidirectionalStream$Callback, final Executor executor, final String s2, final List list, final int n, final boolean b, final Collection collection, final boolean b2, final int n2, final boolean b3, final int n3, final long n4) {
        throw null;
    }
    
    public final void addRequestFinishedListener(final RequestFinishedInfo$Listener requestFinishedInfo$Listener) {
    }
    
    public final void addRttListener(final NetworkQualityRttListener networkQualityRttListener) {
    }
    
    public final void addThroughputListener(final NetworkQualityThroughputListener networkQualityThroughputListener) {
    }
    
    public final audt b(final String s, final UrlRequest$Callback urlRequest$Callback, final Executor executor, final int n, final Collection collection, final boolean b, final boolean b2, final boolean b3, final boolean b4, final int n2, final boolean b5, final int n3, final RequestFinishedInfo$Listener requestFinishedInfo$Listener, final int n4, final long n5) {
        if (n5 == -1L) {
            return new audk(this, urlRequest$Callback, this.f, executor, s, this.e, b3, b4, n2, b5, n3);
        }
        throw new UnsupportedOperationException("The multi-network API is not supported by the Java implementation of Cronet Engine");
    }
    
    public final void bindToNetwork(final long n) {
        throw new UnsupportedOperationException("The multi-network API is not supported by the Java implementation of Cronet Engine");
    }
    
    public final void configureNetworkQualityEstimatorForTesting(final boolean b, final boolean b2, final boolean b3) {
    }
    
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return (URLStreamHandlerFactory)new aucz();
    }
    
    public final int getDownstreamThroughputKbps() {
        return -1;
    }
    
    public final int getEffectiveConnectionType() {
        return 0;
    }
    
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }
    
    public final int getHttpRttMs() {
        return -1;
    }
    
    public final int getTransportRttMs() {
        return -1;
    }
    
    public final String getVersionString() {
        return "CronetHttpURLConnection/".concat(aubt.a());
    }
    
    public final ExperimentalBidirectionalStream$Builder newBidirectionalStreamBuilder(final String s, final BidirectionalStream$Callback bidirectionalStream$Callback, final Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }
    
    public final URLConnection openConnection(final URL url) {
        return url.openConnection();
    }
    
    public final URLConnection openConnection(final URL url, final Proxy proxy) {
        return url.openConnection(proxy);
    }
    
    public final void removeRequestFinishedListener(final RequestFinishedInfo$Listener requestFinishedInfo$Listener) {
    }
    
    public final void removeRttListener(final NetworkQualityRttListener networkQualityRttListener) {
    }
    
    public final void removeThroughputListener(final NetworkQualityThroughputListener networkQualityThroughputListener) {
    }
    
    public final void shutdown() {
        this.f.shutdown();
    }
    
    public final void startNetLogToDisk(final String s, final boolean b, final int n) {
    }
    
    public final void startNetLogToFile(final String s, final boolean b) {
    }
    
    public final void stopNetLog() {
    }
}
