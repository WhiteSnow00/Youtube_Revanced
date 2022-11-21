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

public final class arab extends UrlRequest$Callback
{
    public final afxh a;
    public aqzv b;
    public aqvr c;
    private final ExecutorService d;
    private final araa e;
    private final slt f;
    
    public arab(final ExecutorService d) {
        final slt f = new slt((int[])null);
        this.d = d;
        final araa e = new araa();
        this.e = e;
        this.a = afxh.a(e);
        this.f = f;
    }
    
    public final void onCanceled(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        final aqzx aqzx = new aqzx(aqzw.b, "");
        final aqvr c = this.c;
        if (c != null) {
            c.b(this.b);
        }
        this.e.a = new asck(aqzx);
        this.d.execute(this.a);
    }
    
    public final void onFailed(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final CronetException ex) {
        aqzw aqzw = aqzw.f;
        if (ex instanceof NetworkException) {
            switch (((NetworkException)ex).getErrorCode()) {
                default: {
                    aqzw = aqzw;
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
                    aqzw = aqzw.d;
                    break;
                }
                case 1: {
                    aqzw = aqzw.a;
                    break;
                }
            }
        }
        final aqzx aqzx = new aqzx(aqzw, (Throwable)ex);
        final aqvr c = this.c;
        if (c != null) {
            c.b(this.b);
        }
        this.e.a = new asck(aqzx);
        this.d.execute(this.a);
    }
    
    public final void onReadCompleted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) {
        final slt f = this.f;
        adme.T(f.a ^ true);
        if (byteBuffer != ((ArrayDeque)f.b).peekLast()) {
            ((ArrayDeque)f.b).addLast(byteBuffer);
        }
        ByteBuffer allocateDirect = byteBuffer;
        if (!byteBuffer.hasRemaining()) {
            allocateDirect = ByteBuffer.allocateDirect(8192);
        }
        urlRequest.read(allocateDirect);
    }
    
    public final void onRedirectReceived(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String s) {
        urlRequest.cancel();
    }
    
    public final void onResponseStarted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        adme.T(this.f.a ^ true);
        final Map allHeaders = urlResponseInfo.getAllHeaders();
        long n = 0L;
        Label_0144: {
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
                        break Label_0144;
                    }
                    n = long1 + 1L;
                    break Label_0144;
                }
            }
            n = 524288L;
        }
        urlRequest.read(ByteBuffer.allocateDirect((int)Math.min(n, 524288L)));
        final aqvr c = this.c;
        if (c != null) {
            c.d();
        }
    }
    
    public final void onSucceeded(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        final aqzj aqzj = new aqzj();
        for (final Map.Entry<String, V> entry : urlResponseInfo.getAllHeadersAsList()) {
            aqzj.d((String)entry.getKey(), (String)entry.getValue());
        }
        final int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        final slt f = this.f;
        adme.T(f.a ^ true);
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
        final aevn aevn = new aevn(httpStatusCode, aqzj, (InputStream)new qoj(byteBuffer));
        final aqvr c = this.c;
        if (c != null) {
            c.c(this.b);
        }
        this.e.a = new asck(aevn, (byte[])null);
        this.d.execute(this.a);
    }
}
