import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class dx extends Handler
{
    final dz a;
    
    public dx(final dz a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 1) {
            synchronized (this.a.a) {
                final ea ea = (ea)this.a.c.get();
                final dx d = this.a.d;
                monitorexit(this.a.a);
                if (ea != null && this.a == ea.a()) {
                    if (d != null) {
                        ea.i((axe)message.obj);
                        this.a.a(ea, d);
                        ea.i(null);
                    }
                }
            }
        }
    }
}
