import org.chromium.net.BidirectionalStream;
import org.chromium.net.impl.CronetBidirectionalStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auce implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ CronetBidirectionalStream b;
    
    public auce(final CronetBidirectionalStream b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final Object c = this.b.c;
        synchronized (c) {
            final CronetBidirectionalStream b = this.b;
            if (!b.e()) {
                b.d = this.a;
                b.e = 2;
                Label_0075: {
                    if (!CronetBidirectionalStream.d(b.b)) {
                        final CronetBidirectionalStream b2 = this.b;
                        if (b2.d) {
                            b2.f = 10;
                            break Label_0075;
                        }
                    }
                    this.b.f = 8;
                }
                monitorexit(c);
                try {
                    final CronetBidirectionalStream b3 = this.b;
                    b3.a.onStreamReady((BidirectionalStream)b3);
                }
                catch (final Exception c) {
                    this.b.c((Exception)c);
                }
            }
        }
    }
}
