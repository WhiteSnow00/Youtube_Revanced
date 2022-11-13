import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import org.apache.http.protocol.HttpRequestHandlerResolver;
import org.apache.http.HttpResponseFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.ResponseContent;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.params.BasicHttpParams;
import java.util.Map;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import java.util.concurrent.ExecutorService;
import java.net.ServerSocket;
import org.apache.http.protocol.HttpService;
import org.apache.http.params.HttpParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abny
{
    public final HttpParams a;
    public final HttpService b;
    public final abod c;
    public ServerSocket d;
    public ExecutorService e;
    private final HttpRequestHandlerRegistry f;
    
    public abny(final Map map) {
        this.a = new BasicHttpParams().setBooleanParameter("http.connection.stalecheck", false).setBooleanParameter("http.tcp.nodelay", true).setIntParameter("http.socket.buffer-size", 8192);
        final abod b = b();
        this.c = b;
        final BasicHttpProcessor basicHttpProcessor = new BasicHttpProcessor();
        basicHttpProcessor.addInterceptor((HttpRequestInterceptor)b);
        basicHttpProcessor.addInterceptor((HttpResponseInterceptor)new ResponseContent());
        basicHttpProcessor.addInterceptor((HttpResponseInterceptor)new abnt());
        this.f = new HttpRequestHandlerRegistry();
        for (final Map.Entry entry : ((afev)map).r()) {
            this.f.register((String)entry.getKey(), (HttpRequestHandler)entry.getValue());
        }
        final HttpService b2 = new HttpService((HttpProcessor)basicHttpProcessor, (ConnectionReuseStrategy)new NoConnectionReuseStrategy(), (HttpResponseFactory)new DefaultHttpResponseFactory());
        (this.b = b2).setHandlerResolver((HttpRequestHandlerResolver)this.f);
        b2.setParams(this.a);
    }
    
    private static abod b() {
        try {
            return new abod();
        }
        catch (final NoSuchAlgorithmException ex) {
            ttr.n("NoSuchAlgorithmException starting MediaServer", (Throwable)ex);
            return new abod();
        }
    }
    
    public final ateg a(final String s, final String s2, final int n, final String s3, final long n2, final long n3) {
        final ateg ateg = new ateg(this, s);
        ateg.h("v", s2);
        ateg.h("i", Integer.toString(n));
        ateg.h("x", s3);
        ateg.i("l", n2);
        ateg.i("m", n3);
        return ateg;
    }
}
