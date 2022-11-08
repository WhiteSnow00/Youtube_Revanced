import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auee extends UrlRequest$Callback
{
    private final UrlRequest$Callback a;
    
    public auee(final UrlRequest$Callback a) {
        this.a = a;
    }
    
    @Override
    public final void onCanceled(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        this.a.onCanceled(urlRequest, urlResponseInfo);
    }
    
    @Override
    public final void onFailed(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final CronetException ex) {
        this.a.onFailed(urlRequest, urlResponseInfo, ex);
    }
    
    @Override
    public final void onReadCompleted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) {
        this.a.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
    }
    
    @Override
    public final void onRedirectReceived(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String s) {
        this.a.onRedirectReceived(urlRequest, urlResponseInfo, s);
    }
    
    @Override
    public final void onResponseStarted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        this.a.onResponseStarted(urlRequest, urlResponseInfo);
    }
    
    @Override
    public final void onSucceeded(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        this.a.onSucceeded(urlRequest, urlResponseInfo);
    }
}
