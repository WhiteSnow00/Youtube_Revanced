import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class acgh extends Handler
{
    final ajlp a;
    final ots b;
    final acgi c;
    
    public acgh(final acgi c, final Looper looper, final ajlp a, final ots b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 1) {
            acgi.d(this.a, this.b, this.c.a).U();
        }
    }
}
