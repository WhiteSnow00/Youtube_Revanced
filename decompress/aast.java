import android.view.Surface;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class aast extends Handler
{
    private final WeakReference a;
    
    public aast(final aasu aasu) {
        this.a = new WeakReference((T)aasu);
    }
    
    public final void handleMessage(final Message message) {
        final aasu aasu = (aasu)this.a.get();
        if (aasu == null) {
            return;
        }
        if (message.what == 0) {
            aasu.f = null;
            aasu.e = (Surface)message.obj;
            final zfm d = aasu.d;
            if (d != null) {
                d.e();
            }
            return;
        }
        final int what = message.what;
        boolean b = true;
        final boolean b2 = true;
        if (what == 1) {
            aasu.e = null;
            aasu.f = (bsh)message.obj;
            final zfm d2 = aasu.d;
            if (d2 != null) {
                d2.c();
            }
            aasu.G();
            return;
        }
        if (message.what == 2) {
            aasu.h = (message.arg1 > 0 && b2);
            aasu.H(aasu.getLeft(), aasu.getTop(), aasu.getRight(), aasu.getBottom());
            return;
        }
        if (message.what == 3) {
            if (aasu.g) {
                aasu.requestLayout();
            }
            return;
        }
        if (message.what == 4 && aasu.d != null) {
            final Throwable t = (Throwable)message.obj;
            final zfm d3 = aasu.d;
            if (message.arg1 <= 0) {
                b = false;
            }
            d3.b("gl", b, zcs.b(t));
        }
        super.handleMessage(message);
    }
}
