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

final class auel extends UrlRequest$Callback
{
    final /* synthetic */ auem a;
    
    public auel(final auem a) {
        this.a = a;
    }
    
    private final void a(final IOException d) {
        final auem a = this.a;
        a.f = d;
        final aueo c = a.c;
        if (c != null) {
            c.c = d;
            c.a = true;
            c.b = null;
        }
        final auep d2 = a.d;
        if (d2 != null) {
            d2.d = d;
            d2.e = true;
        }
        auem.e(a);
        this.a.a.c();
    }
    
    @Override
    public final void onCanceled(final UrlRequest urlRequest, final UrlResponseInfo e) {
        this.a.e = e;
        this.a(new IOException("disconnect() called"));
    }
    
    @Override
    public final void onFailed(final UrlRequest urlRequest, final UrlResponseInfo e, final CronetException ex) {
        if (ex != null) {
            this.a.e = e;
            this.a((IOException)ex);
            return;
        }
        throw new IllegalStateException("Exception cannot be null in onFailed.");
    }
    
    @Override
    public final void onReadCompleted(final UrlRequest urlRequest, final UrlResponseInfo e, final ByteBuffer byteBuffer) {
        final auem a = this.a;
        a.e = e;
        a.a.c();
    }
    
    @Override
    public final void onRedirectReceived(final UrlRequest urlRequest, final UrlResponseInfo e, final String s) {
        this.a.g = true;
        while (true) {
            try {
                final URL url = new URL(s);
                final boolean equals = url.getProtocol().equals(this.a.url.getProtocol());
                if (this.a.instanceFollowRedirects) {
                    auem.f(this.a, url);
                }
                if (this.a.instanceFollowRedirects && equals) {
                    this.a.b.followRedirect();
                    return;
                }
                final auem a = this.a;
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
    
    @Override
    public final void onResponseStarted(final UrlRequest urlRequest, final UrlResponseInfo e) {
        final auem a = this.a;
        a.e = e;
        auem.e(a);
        this.a.a.c();
    }
    
    @Override
    public final void onSucceeded(final UrlRequest urlRequest, final UrlResponseInfo e) {
        this.a.e = e;
        this.a(null);
    }
}
