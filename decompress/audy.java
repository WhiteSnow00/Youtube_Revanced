import org.chromium.net.UrlRequest;
import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class audy implements auec
{
    final UrlResponseInfo a;
    final audz b;
    final Object c;
    private final int d;
    
    public audy(final audz b, final UrlResponseInfo a, final String c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public audy(final audz b, final UrlResponseInfo a, final ByteBuffer c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public final void a() {
        if (this.d != 0) {
            final audz b = this.b;
            b.a.onRedirectReceived((UrlRequest)b.d, this.a, (String)this.c);
            return;
        }
        if (this.b.d.g.compareAndSet(5, 4)) {
            final audz b2 = this.b;
            b2.a.onReadCompleted((UrlRequest)b2.d, this.a, (ByteBuffer)this.c);
        }
    }
}
