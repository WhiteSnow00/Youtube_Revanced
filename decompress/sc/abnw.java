import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.Header;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abnw extends abns
{
    public static final int a = 0;
    private final zap b;
    
    public abnw(final zap b) {
        this.b = b;
    }
    
    protected final void a(final Uri uri, final Header header, final HttpResponse httpResponse) {
        final abnq a = abnq.a(uri);
        if (a == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        final String queryParameter = uri.getQueryParameter("s");
        if (queryParameter == null) {
            httpResponse.setStatusCode(404);
            return;
        }
        final Uri parse = Uri.parse(queryParameter);
        final abnr a2 = abnr.a(header, a.d);
        String c;
        if (a2.c != -1L) {
            c = yag.C(a.a, a.b, a.c, a.e);
        }
        else {
            c = null;
        }
        bbp bbp;
        if (a2.c == -1L) {
            bbp = new bbp(parse, a2.a, -1L, c, (byte[])null);
        }
        else {
            final long a3 = a2.a;
            bbp = new bbp(parse, a3, 1L + (a2.b - a3), c, (byte[])null);
        }
        final bbl a4 = this.b.a();
        if (a2.b(httpResponse)) {
            httpResponse.setEntity((HttpEntity)new abnu(a4, bbp));
        }
    }
}
