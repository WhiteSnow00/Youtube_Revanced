import java.util.Iterator;
import java.io.InputStream;
import java.util.Map;
import java.util.List;
import java.util.ArrayDeque;
import java.nio.ByteBuffer;
import org.chromium.net.NetworkException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqus extends UrlRequest$Callback
{
    public final aftp a;
    public aqum b;
    public aqqm c;
    private final ExecutorService d;
    private final aqur e;
    private final sin f;
    
    public aqus(final ExecutorService d) {
        final sin f = new sin((int[])null);
        this.d = d;
        final aqur e = new aqur();
        this.e = e;
        this.a = aftp.a((Callable)e);
        this.f = f;
    }
    
    public final void onCanceled(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        final aquo aquo = new aquo(aqun.b, "");
        final aqqm c = this.c;
        if (c != null) {
            c.b(this.b);
        }
        this.e.a = new ahbd(aquo);
        this.d.execute((Runnable)this.a);
    }
    
    public final void onFailed(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final CronetException ex) {
        aqun aqun = aqun.f;
        if (ex instanceof NetworkException) {
            switch (((NetworkException)ex).getErrorCode()) {
                default: {
                    aqun = aqun;
                    break;
                }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: {
                    aqun = aqun.d;
                    break;
                }
                case 1: {
                    aqun = aqun.a;
                    break;
                }
            }
        }
        final aquo aquo = new aquo(aqun, (Throwable)ex);
        final aqqm c = this.c;
        if (c != null) {
            c.b(this.b);
        }
        this.e.a = new ahbd(aquo);
        this.d.execute((Runnable)this.a);
    }
    
    public final void onReadCompleted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, ByteBuffer allocateDirect) {
        final sin f = this.f;
        agot.D(f.a ^ true);
        if (allocateDirect != ((ArrayDeque)f.b).peekLast()) {
            ((ArrayDeque)f.b).addLast(allocateDirect);
        }
        if (!allocateDirect.hasRemaining()) {
            allocateDirect = ByteBuffer.allocateDirect(8192);
        }
        urlRequest.read(allocateDirect);
    }
    
    public final void onRedirectReceived(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String s) {
        urlRequest.cancel();
    }
    
    public final void onResponseStarted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        agot.D(this.f.a ^ true);
        final Map allHeaders = urlResponseInfo.getAllHeaders();
        long n = 0L;
        Label_0147: {
            if (allHeaders.containsKey("content-length")) {
                long long1;
                try {
                    long1 = Long.parseLong(allHeaders.get("content-length").get(0));
                }
                catch (final NumberFormatException ex) {
                    long1 = 0L;
                }
                if (long1 > 0L) {
                    if (allHeaders.containsKey("content-encoding") && (((List)allHeaders.get("content-encoding")).size() != 1 || !"identity".equals(((List<Object>)allHeaders.get("content-encoding")).get(0)))) {
                        n = long1 + long1;
                        break Label_0147;
                    }
                    n = long1 + 1L;
                    break Label_0147;
                }
            }
            n = 524288L;
        }
        urlRequest.read(ByteBuffer.allocateDirect((int)Math.min(n, 524288L)));
        final aqqm c = this.c;
        if (c != null) {
            c.d();
        }
    }
    
    public final void onSucceeded(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        final aqub aqub = new aqub();
        for (final Map.Entry<String, V> entry : urlResponseInfo.getAllHeadersAsList()) {
            aqub.d(entry.getKey(), (String)entry.getValue());
        }
        final int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        final sin f = this.f;
        agot.D(f.a ^ true);
        f.a = true;
        final Iterator iterator2 = ((ArrayDeque)f.b).iterator();
        while (iterator2.hasNext()) {
            ((ByteBuffer)iterator2.next()).flip();
        }
        ByteBuffer byteBuffer;
        if (((ArrayDeque)f.b).isEmpty()) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        }
        else if (((ArrayDeque)f.b).size() == 1) {
            byteBuffer = ((ArrayDeque)f.b).remove();
        }
        else {
            final Iterator iterator3 = ((ArrayDeque)f.b).iterator();
            int n = 0;
            while (iterator3.hasNext()) {
                n += ((ByteBuffer)iterator3.next()).remaining();
            }
            byteBuffer = ByteBuffer.allocateDirect(n);
            while (!((ArrayDeque)f.b).isEmpty()) {
                byteBuffer.put(((ArrayDeque)f.b).remove());
            }
            byteBuffer.flip();
        }
        byteBuffer.position(0);
        final aeru aeru = new aeru(httpStatusCode, aqub, (InputStream)new qmg(byteBuffer));
        final aqqm c = this.c;
        if (c != null) {
            c.c(this.b);
        }
        this.e.a = new ahbd(aeru, (byte[])null);
        this.d.execute((Runnable)this.a);
    }
}
