import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class cet extends Handler
{
    final cey a;
    
    public cet(final cey a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.q();
    }
}
