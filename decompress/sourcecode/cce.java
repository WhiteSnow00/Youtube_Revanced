import android.os.Message;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class cce extends Handler
{
    final /* synthetic */ cch a;
    
    public cce(final cch a) {
        this.a = a;
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 1) {
            if (what == 2) {
                final cch a = this.a;
                a.i = false;
                a.d(a.h);
            }
        }
        else {
            final cch a2 = this.a;
            a2.k = false;
            final qpt l = a2.l;
            if (l != null) {
                final cci j = a2.j;
                final cco cco = (cco)l.a;
                final ccr b = cco.b(a2);
                if (b != null) {
                    cco.o(b, j);
                }
            }
        }
    }
}
