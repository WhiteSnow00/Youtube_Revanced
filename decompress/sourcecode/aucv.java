import org.chromium.net.UrlResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUrlRequest;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucv implements Runnable
{
    public ByteBuffer a;
    final /* synthetic */ CronetUrlRequest b;
    
    public aucv(final CronetUrlRequest b) {
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.b.b();
        final ByteBuffer a = this.a;
        this.a = null;
        try {
            Object o = this.b.c;
            synchronized (o) {
                final CronetUrlRequest b = this.b;
                if (!b.j()) {
                    CronetUrlRequest.k(b);
                    monitorexit(o);
                    o = this.b;
                    ((CronetUrlRequest)o).d.onReadCompleted((UrlRequest)o, ((CronetUrlRequest)o).g, a);
                }
            }
        }
        catch (final Exception ex) {
            this.b.e(ex);
        }
    }
}
