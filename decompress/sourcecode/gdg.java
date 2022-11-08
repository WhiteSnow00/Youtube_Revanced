import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateLifecycleController;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class gdg extends Handler
{
    final /* synthetic */ gdh a;
    
    public gdg(final gdh a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 153535) {
            final gdh a = this.a;
            final gdi c = a.c;
            if (c != null) {
                final ActiveStateLifecycleController a2 = c.a;
                final gdh c2 = c.c;
                final gdk b = c.b;
                if (a2.b.contains(c2)) {
                    a2.j(c2);
                    String.valueOf(c2);
                    String.valueOf(b);
                    if (!a2.i()) {
                        tcp.n((aum)a2.d, afva.r((afrx)new fdq(a2, b, 5), a2.a), (trb)etd.j, (trb)tcp.b);
                    }
                }
                a.c = null;
            }
        }
    }
}
