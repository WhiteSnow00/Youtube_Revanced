import org.chromium.net.UrlResponseInfo;
import org.chromium.net.BidirectionalStream;
import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aucx implements Runnable
{
    final CronetBidirectionalStream a;
    private ByteBuffer b;
    private final boolean c;
    
    public aucx(final CronetBidirectionalStream a, final ByteBuffer b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        try {
            final ByteBuffer b = this.b;
            this.b = null;
            Object o = this.a.c;
            synchronized (o) {
                final CronetBidirectionalStream a = this.a;
                if (a.e()) {
                    return;
                }
                final boolean c = this.c;
                int n = 0;
                if (c) {
                    a.f = 10;
                    n = n;
                    if (a.e == 4) {
                        n = 1;
                    }
                }
                monitorexit(o);
                o = this.a;
                ((CronetBidirectionalStream)o).a.onWriteCompleted((BidirectionalStream)o, ((CronetBidirectionalStream)o).g, b, this.c);
                if (n != 0) {
                    this.a.b();
                }
            }
        }
        catch (final Exception ex) {
            this.a.c(ex);
        }
    }
}
