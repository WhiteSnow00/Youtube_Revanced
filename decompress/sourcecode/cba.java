import java.util.List;
import android.os.Message;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class cba extends Handler
{
    final /* synthetic */ cbd a;
    
    public cba(final cbd a) {
        this.a = a;
    }
    
    public final void handleMessage(final Message message) {
        if (message.what != 1) {
            return;
        }
        this.a.i((List)message.obj);
    }
}
