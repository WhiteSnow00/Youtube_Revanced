import java.util.List;
import android.os.Message;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbe extends Handler
{
    final cbh a;
    
    public cbe(final cbh a) {
        this.a = a;
    }
    
    public final void handleMessage(final Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.i((List)message.obj);
    }
}
