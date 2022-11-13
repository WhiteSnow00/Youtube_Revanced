import org.apache.http.ProtocolException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.HttpRequest;
import android.util.Base64;
import android.text.TextUtils;
import android.net.Uri;
import java.security.Key;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import org.apache.http.HttpRequestInterceptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abod implements HttpRequestInterceptor
{
    private final Mac a;
    
    public abod() {
        (this.a = Mac.getInstance("HmacSHA1")).init(KeyGenerator.getInstance("HmacSHA1").generateKey());
    }
    
    public final String a(final Uri uri) {
        monitorenter(this);
        try {
            final String queryParameter = uri.getQueryParameter("sparams");
            if (TextUtils.isEmpty((CharSequence)queryParameter)) {
                monitorexit(this);
                return null;
            }
            final String encodedPath = uri.getEncodedPath();
            if (!TextUtils.isEmpty((CharSequence)encodedPath)) {
                this.a.update(encodedPath.getBytes());
            }
            this.a.update("sparams".getBytes());
            this.a.update(queryParameter.getBytes());
            for (String s : queryParameter.split(",")) {
                if (TextUtils.isEmpty((CharSequence)s)) {
                    monitorexit(this);
                    return null;
                }
                final String queryParameter2 = uri.getQueryParameter(s);
                if (queryParameter2 == null) {
                    monitorexit(this);
                    return null;
                }
                this.a.update(s.getBytes());
                this.a.update(queryParameter2.getBytes());
            }
            final String encodeToString = Base64.encodeToString(this.a.doFinal(), 10);
            monitorexit(this);
            return encodeToString;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void process(final HttpRequest httpRequest, final HttpContext httpContext) {
        final Uri parse = Uri.parse(httpRequest.getRequestLine().getUri());
        final String a = this.a(parse);
        if (a != null && a.equals(parse.getQueryParameter("sig"))) {
            return;
        }
        final ProtocolException ex = new ProtocolException("URL not signed correctly");
        ttr.d("URL not signed correctly", (Throwable)ex);
        throw ex;
    }
}
