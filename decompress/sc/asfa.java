import org.chromium.net.BidirectionalStream$Callback;
import org.chromium.net.UrlRequest$Callback;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
import org.chromium.net.BidirectionalStream;
import android.os.Process;
import org.chromium.net.ThreadStatsUid;
import android.net.TrafficStats;
import java.net.URI;
import android.util.Log;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.UrlResponseInfo$HeaderBlock;
import org.chromium.net.CronetException;
import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.RequestFinishedInfo;
import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;
import android.net.Network;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asfa implements Runnable
{
    public final Object a;
    public final Object b;
    private final int c;
    
    public asfa(final asfb b, final asfc a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public asfa(final asfb b, final asft a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public asfa(final auck a, final Network b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final audp a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final audw a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final audz a, final UrlResponseInfo b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final aueb b, final auec a, final int c) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public asfa(final aueb a, final String b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final aueb a, final ByteBuffer b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final auet a, final RequestFinishedInfo b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final aukx a, final Runnable b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final CronetBidirectionalStream a, final CronetException b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final CronetBidirectionalStream a, final UrlResponseInfo$HeaderBlock b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public asfa(final CronetUrlRequest a, final RequestFinishedInfo b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                final Object a = this.a;
                final Object b = this.b;
                final aukx aukx = (aukx)a;
                final auks g = aukx.g;
                if (g != null) {
                    g.e();
                    aukx.g.h();
                }
                ((Runnable)b).run();
                return;
            }
            case 15: {
                try {
                    final Object a2 = this.a;
                    ((audz)a2).a.onSucceeded((UrlRequest)((audz)a2).d, (UrlResponseInfo)this.b);
                    ((audz)this.a).b();
                }
                catch (final Exception ex) {
                    Log.e(aueb.a, "Exception in onSucceeded method", (Throwable)ex);
                }
            }
            case 14: {
                try {
                    final Object a3 = this.a;
                    ((UrlRequest$Callback)((audz)a3).a).onCanceled((UrlRequest)((audz)a3).d, (UrlResponseInfo)this.b);
                    ((audz)this.a).b();
                }
                catch (final Exception ex2) {
                    Log.e(aueb.a, "Exception in onCanceled method", (Throwable)ex2);
                }
            }
            case 13: {
                try {
                    ((auec)this.a).a();
                }
                finally {
                    final Throwable t;
                    ((aueb)this.b).i((CronetException)new aucv("Exception received from UrlRequest.Callback", t));
                }
            }
            case 12: {
                try {
                    ((auec)this.a).a();
                }
                finally {
                    final Throwable t2;
                    ((aueb)this.b).i((CronetException)new audd("System error", t2));
                }
            }
            case 11: {
                final aueb aueb = (aueb)this.a;
                aueb.p = URI.create(aueb.m).resolve((String)this.b).toString();
                final aueb aueb2 = (aueb)this.a;
                aueb2.f.add(aueb2.p);
                ((aueb)this.a).o(2, 3, (Runnable)new audk(this, 10, (byte[])null));
                return;
            }
            case 10: {
                final aueb aueb3 = (aueb)this.a;
                aueb3.c.execute(aueb3.d((auec)new audt(this, 3, (byte[])null)));
                return;
            }
            case 9: {
                try {
                    ((auec)this.a).a();
                }
                finally {
                    final Throwable t3;
                    ((aueb)this.b).j(t3);
                }
            }
            case 8: {
                final int threadStatsTag = TrafficStats.getThreadStatsTag();
                TrafficStats.setThreadStatsTag(((audw)this.a).b);
                final audw audw = (audw)this.a;
                if (audw.c) {
                    ThreadStatsUid.set(audw.d);
                }
                try {
                    ((Runnable)this.b).run();
                }
                finally {
                    if (((audw)this.a).c) {
                        ThreadStatsUid.clear();
                    }
                    TrafficStats.setThreadStatsTag(threadStatsTag);
                }
            }
            case 7: {
                Thread.currentThread().setName("JavaCronetEngine");
                Process.setThreadPriority(((audp)this.a).a);
                ((Runnable)this.b).run();
                return;
            }
            case 6: {
                ((auet)this.a).onRequestFinished((RequestFinishedInfo)this.b);
                return;
            }
            case 5: {
                ((CronetUrlRequest)this.a).e.onRequestFinished((RequestFinishedInfo)this.b);
                return;
            }
            case 4: {
                ((CronetBidirectionalStream)this.a).a((CronetException)this.b);
                return;
            }
            case 3: {
                Object o = ((CronetBidirectionalStream)this.a).c;
                synchronized (o) {
                    if (((CronetBidirectionalStream)this.a).e()) {
                        return;
                    }
                    monitorexit(o);
                    try {
                        o = this.a;
                        ((BidirectionalStream$Callback)((CronetBidirectionalStream)o).a).onResponseTrailersReceived((BidirectionalStream)o, (UrlResponseInfo)((CronetBidirectionalStream)o).g, (UrlResponseInfo$HeaderBlock)this.b);
                    }
                    catch (final Exception ex3) {
                        ((CronetBidirectionalStream)this.a).c(ex3);
                    }
                }
            }
            case 2: {
                NetworkChangeNotifierAutoDetect.-$$Nest$fgetmObserver(((auck)this.a).b).onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId((Network)this.b));
                return;
            }
            case 1: {
                ((asfb)this.b).b.t((asfc)this.a);
                return;
            }
            case 0: {
                ((asfb)this.b).b.u.d((asft)this.a);
            }
        }
    }
}
