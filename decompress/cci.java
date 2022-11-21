import android.os.Message;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class cci extends Handler
{
    final ccl a;
    
    public cci(final ccl a) {
        this.a = a;
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 1) {
            if (what == 2) {
                final ccl a = this.a;
                a.i = false;
                a.d(a.h);
            }
        }
        else {
            final ccl a2 = this.a;
            a2.k = false;
            final oqz l = a2.l;
            if (l != null) {
                final ccm j = a2.j;
                final ccs ccs = (ccs)l.a;
                final ccv b = ccs.b(a2);
                if (b != null) {
                    ccs.o(b, j);
                }
            }
        }
    }
}
