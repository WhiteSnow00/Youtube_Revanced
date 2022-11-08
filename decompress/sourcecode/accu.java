import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class accu extends Handler
{
    final /* synthetic */ ajhm a;
    final /* synthetic */ orr b;
    final /* synthetic */ accv c;
    
    public accu(final accv c, final Looper looper, final ajhm a, final orr b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 1) {
            accv.d(this.a, this.b, this.c.a).U();
        }
    }
}
