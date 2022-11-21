import org.chromium.net.UrlRequest$Builder;
import java.util.Map;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.net.UnknownHostException;
import org.chromium.net.NetworkException;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class bcw extends UrlRequest$Callback
{
    final bcx a;
    
    public bcw(final bcx a) {
        this.a = a;
    }
    
    public final void onFailed(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final CronetException h) {
        synchronized (this) {
            if (urlRequest != this.a.e) {
                return;
            }
            if (h instanceof NetworkException && ((NetworkException)h).getErrorCode() == 1) {
                this.a.h = new UnknownHostException();
            }
            else {
                this.a.h = (IOException)h;
            }
            this.a.j.e();
        }
    }
    
    public final void onReadCompleted(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final ByteBuffer byteBuffer) {
        synchronized (this) {
            final bcx a = this.a;
            if (urlRequest != a.e) {
                return;
            }
            a.j.e();
        }
    }
    
    public final void onRedirectReceived(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo, final String s) {
        synchronized (this) {
            final UrlRequest e = this.a.e;
            if (urlRequest != e) {
                return;
            }
            bad.b(e);
            final bbr f = this.a.f;
            bad.b(f);
            final int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            final int c = f.c;
            final String s2 = null;
            Label_0141: {
                if (c == 2) {
                    int n;
                    if ((n = httpStatusCode) != 307) {
                        if (httpStatusCode != 308) {
                            break Label_0141;
                        }
                        n = 308;
                    }
                    final bcx a = this.a;
                    urlResponseInfo.getHttpStatusText();
                    final Map allHeaders = urlResponseInfo.getAllHeaders();
                    final int a2 = baz.a;
                    a.h = (IOException)new bcg(n, (IOException)null, allHeaders, f);
                    this.a.j.e();
                    return;
                }
            }
            final bcx a3 = this.a;
            if (a3.c) {
                a3.p();
            }
            if (this.a.d && f.c == 2 && httpStatusCode == 302) {
                final List list = urlResponseInfo.getAllHeaders().get("Set-Cookie");
                String join = s2;
                if (list != null) {
                    if (list.isEmpty()) {
                        join = s2;
                    }
                    else {
                        join = TextUtils.join((CharSequence)";", (Iterable)list);
                    }
                }
                e.cancel();
                final bbr d = f.d(Uri.parse(s));
                try {
                    final UrlRequest$Builder o = this.a.o(d);
                    if (!TextUtils.isEmpty((CharSequence)join)) {
                        o.addHeader("Cookie", join);
                    }
                    (this.a.e = o.build()).start();
                    return;
                }
                catch (final IOException h) {
                    this.a.h = h;
                    return;
                }
            }
            urlRequest.followRedirect();
        }
    }
    
    public final void onResponseStarted(final UrlRequest urlRequest, final UrlResponseInfo g) {
        synchronized (this) {
            final bcx a = this.a;
            if (urlRequest != a.e) {
                return;
            }
            a.g = g;
            a.j.e();
        }
    }
    
    public final void onSucceeded(final UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        synchronized (this) {
            final bcx a = this.a;
            if (urlRequest != a.e) {
                return;
            }
            a.i = true;
            a.j.e();
        }
    }
}
