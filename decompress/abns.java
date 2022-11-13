import org.apache.http.HttpException;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.Header;
import android.net.Uri;
import org.apache.http.protocol.HttpRequestHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class abns implements HttpRequestHandler
{
    protected abstract void a(final Uri p0, final Header p1, final HttpResponse p2);
    
    public final void handle(final HttpRequest httpRequest, final HttpResponse httpResponse, final HttpContext httpContext) {
        try {
            final String method = httpRequest.getRequestLine().getMethod();
            if (tbi.r(1).equalsIgnoreCase(method)) {
                this.a(Uri.parse(httpRequest.getRequestLine().getUri()), httpRequest.getLastHeader("Range"), httpResponse);
                return;
            }
            final StringBuilder sb = new StringBuilder("Method not supported: ");
            sb.append(method);
            throw new MethodNotSupportedException(sb.toString());
        }
        catch (final RuntimeException ex) {
            throw new HttpException("Internal error while handling request.", (Throwable)ex);
        }
    }
}
