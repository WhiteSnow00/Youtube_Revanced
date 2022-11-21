import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auhr extends UrlRequest$Callback
{
    private final UrlRequest$Callback a;
    
    public auhr(final UrlRequest$Callback a) {
        this.a = a;
    }
    
    public final void onCanceled(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        this.a.onCanceled(urlRequest, urlResponseInfo);
    }
    
    public final void onFailed(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final CronetException ex) {
        this.a.onFailed(urlRequest, urlResponseInfo, ex);
    }
    
    public final void onReadCompleted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) {
        this.a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
    }
    
    public final void onRedirectReceived(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String s) {
        this.a.onRedirectReceived(urlRequest, urlResponseInfo, s);
    }
    
    public final void onResponseStarted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        this.a.onResponseStarted(urlRequest, urlResponseInfo);
    }
    
    public final void onSucceeded(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        this.a.onSucceeded(urlRequest, urlResponseInfo);
    }
}
