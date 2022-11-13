import org.apache.http.protocol.HttpContext;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

// 
// Decompiled by Procyon v0.6.0
// 

final class abnt implements HttpResponseInterceptor
{
    public abnt() {
    }
    
    public final void process(final HttpResponse httpResponse, final HttpContext httpContext) {
        httpResponse.setHeader("Connection", "Close");
    }
}
