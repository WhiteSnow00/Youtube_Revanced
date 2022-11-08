import org.chromium.net.UrlRequest;
import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

// 
// Decompiled by Procyon v0.6.0
// 

final class audh implements audl
{
    final /* synthetic */ UrlResponseInfo a;
    final /* synthetic */ audi b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;
    
    public audh(final audi b, final UrlResponseInfo a, final String c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public audh(final audi b, final UrlResponseInfo a, final ByteBuffer c, final int d) {
        this.d = d;
        this.b = b;
        this.a = a;
        this.c = c;
    }
    
    public final void a() {
        if (this.d != 0) {
            final audi b = this.b;
            b.a.onRedirectReceived((UrlRequest)b.d, this.a, (String)this.c);
            return;
        }
        if (this.b.d.g.compareAndSet(5, 4)) {
            final audi b2 = this.b;
            b2.a.onReadCompleted((UrlRequest)b2.d, this.a, (ByteBuffer)this.c);
        }
    }
}
