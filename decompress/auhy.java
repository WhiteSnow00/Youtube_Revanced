import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;
import java.io.IOException;
import org.chromium.net.UrlRequest$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class auhy extends UrlRequest$Callback
{
    final auhz a;
    
    public auhy(final auhz a) {
        this.a = a;
    }
    
    private final void a(final IOException d) {
        final auhz a = this.a;
        a.f = d;
        final auib c = a.c;
        if (c != null) {
            c.c = d;
            c.a = true;
            c.b = null;
        }
        final auic d2 = a.d;
        if (d2 != null) {
            d2.d = d;
            d2.e = true;
        }
        auhz.e(a);
        this.a.a.c();
    }
    
    public final void onCanceled(final UrlRequest urlRequest, final UrlResponseInfo e) {
        this.a.e = e;
        this.a(new IOException("disconnect() called"));
    }
    
    public final void onFailed(final UrlRequest urlRequest, final UrlResponseInfo e, final CronetException ex) {
        if (ex != null) {
            this.a.e = e;
            this.a((IOException)ex);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }
    
    public final void onReadCompleted(final UrlRequest urlRequest, final UrlResponseInfo e, final ByteBuffer byteBuffer) {
        final auhz a = this.a;
        a.e = e;
        a.a.c();
    }
    
    public final void onRedirectReceived(final UrlRequest urlRequest, final UrlResponseInfo e, final String s) {
        this.a.g = true;
        while (true) {
            try {
                final URL url = new URL(s);
                final boolean equals = url.getProtocol().equals(auhz.a(this.a).getProtocol());
                if (auhz.c(this.a)) {
                    auhz.f(this.a, url);
                }
                if (auhz.d(this.a) && equals) {
                    this.a.b.followRedirect();
                    return;
                }
                final auhz a = this.a;
                a.e = e;
                a.b.cancel();
                this.a(null);
            }
            catch (final MalformedURLException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void onResponseStarted(final UrlRequest urlRequest, final UrlResponseInfo e) {
        final auhz a = this.a;
        a.e = e;
        auhz.e(a);
        this.a.a.c();
    }
    
    public final void onSucceeded(final UrlRequest urlRequest, final UrlResponseInfo e) {
        this.a.e = e;
        this.a(null);
    }
}
