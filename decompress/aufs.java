import org.chromium.net.UrlResponseInfo;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.impl.CronetBidirectionalStream;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aufs implements Runnable
{
    public ByteBuffer a;
    public boolean b;
    final CronetBidirectionalStream c;
    
    public aufs(final CronetBidirectionalStream c) {
        this.c = c;
    }
    
    @Override
    public final void run() {
        try {
            final ByteBuffer a = this.a;
            this.a = null;
            Object o = this.c.c;
            synchronized (o) {
                final CronetBidirectionalStream c = this.c;
                if (c.e()) {
                    return;
                }
                final boolean b = this.b;
                boolean b2 = false;
                if (b) {
                    c.e = 4;
                    if (c.f == 10) {
                        b2 = true;
                    }
                }
                else {
                    c.e = 2;
                }
                monitorexit(o);
                o = this.c;
                ((CronetBidirectionalStream)o).a.onReadCompleted((BidirectionalStream)o, ((CronetBidirectionalStream)o).g, a, this.b);
                if (b2) {
                    this.c.b();
                }
            }
        }
        catch (final Exception ex) {
            this.c.c(ex);
        }
    }
}
