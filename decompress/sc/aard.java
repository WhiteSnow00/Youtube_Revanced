import android.view.Surface;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class aard extends Handler
{
    private final WeakReference a;
    
    public aard(final aare aare) {
        this.a = new WeakReference((T)aare);
    }
    
    public final void handleMessage(final Message message) {
        final aare aare = (aare)this.a.get();
        if (aare == null) {
            return;
        }
        if (message.what == 0) {
            aare.f = null;
            aare.e = (Surface)message.obj;
            final zdr d = aare.d;
            if (d != null) {
                d.e();
            }
            return;
        }
        final int what = message.what;
        boolean b = true;
        final boolean b2 = true;
        if (what == 1) {
            aare.e = null;
            aare.f = (bse)message.obj;
            final zdr d2 = aare.d;
            if (d2 != null) {
                d2.c();
            }
            aare.G();
            return;
        }
        if (message.what == 2) {
            aare.h = (message.arg1 > 0 && b2);
            aare.H(aare.getLeft(), aare.getTop(), aare.getRight(), aare.getBottom());
            return;
        }
        if (message.what == 3) {
            if (aare.g) {
                aare.requestLayout();
            }
            return;
        }
        if (message.what == 4 && aare.d != null) {
            final Throwable t = (Throwable)message.obj;
            final zdr d3 = aare.d;
            if (message.arg1 <= 0) {
                b = false;
            }
            d3.b("gl", b, zay.b(t));
        }
        super.handleMessage(message);
    }
}
