import org.chromium.net.UrlResponseInfo$HeaderBlock;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.BidirectionalStream$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class audy extends BidirectionalStream$Callback
{
    private final BidirectionalStream$Callback a;
    
    public audy(final BidirectionalStream$Callback a) {
        this.a = a;
    }
    
    public final void onCanceled(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo) {
        this.a.onCanceled(bidirectionalStream, urlResponseInfo);
    }
    
    public final void onFailed(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo, final CronetException ex) {
        this.a.onFailed(bidirectionalStream, urlResponseInfo, ex);
    }
    
    public final void onReadCompleted(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer, final boolean b) {
        this.a.onReadCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, b);
    }
    
    public final void onResponseHeadersReceived(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo) {
        this.a.onResponseHeadersReceived(bidirectionalStream, urlResponseInfo);
    }
    
    public final void onResponseTrailersReceived(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo, final UrlResponseInfo$HeaderBlock urlResponseInfo$HeaderBlock) {
        this.a.onResponseTrailersReceived(bidirectionalStream, urlResponseInfo, urlResponseInfo$HeaderBlock);
    }
    
    public final void onStreamReady(final BidirectionalStream bidirectionalStream) {
        this.a.onStreamReady(bidirectionalStream);
    }
    
    public final void onSucceeded(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo) {
        this.a.onSucceeded(bidirectionalStream, urlResponseInfo);
    }
    
    public final void onWriteCompleted(final BidirectionalStream bidirectionalStream, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer, final boolean b) {
        this.a.onWriteCompleted(bidirectionalStream, urlResponseInfo, byteBuffer, b);
    }
}
