import android.os.Message;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dnz implements Handler$Callback
{
    private final /* synthetic */ int a;
    
    public dnz(final int a) {
        this.a = a;
    }
    
    public final boolean handleMessage(final Message message) {
        if (this.a != 0) {
            if (message.what == 1) {
                ((dfx)message.obj).e();
                return true;
            }
            return false;
        }
        else {
            if (message.what == 1) {
                final doa doa = (doa)message.obj;
                doa.a.j((doc)doa);
                return true;
            }
            return false;
        }
    }
}
