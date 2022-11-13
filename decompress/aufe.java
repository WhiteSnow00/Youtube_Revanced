import java.net.Proxy;
import java.net.URLConnection;
import java.net.URL;
import org.chromium.net.ExperimentalCronetEngine;
import java.net.URLStreamHandler;

// 
// Decompiled by Procyon v0.6.0
// 

final class aufe extends URLStreamHandler
{
    private final ExperimentalCronetEngine a;
    
    public aufe(final ExperimentalCronetEngine a) {
        this.a = a;
    }
    
    public final URLConnection openConnection(final URL url) {
        return this.a.openConnection(url);
    }
    
    public final URLConnection openConnection(final URL url, final Proxy proxy) {
        return this.a.openConnection(url, proxy);
    }
}
