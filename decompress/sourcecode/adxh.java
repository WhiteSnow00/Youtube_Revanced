import android.os.Message;
import android.os.Handler$Callback;

// 
// Decompiled by Procyon v0.6.0
// 

final class adxh implements Handler$Callback
{
    final /* synthetic */ adxj a;
    
    public adxh(final adxj a) {
        this.a = a;
    }
    
    public final boolean handleMessage(final Message message) {
        if (message.what != 0) {
            return false;
        }
        final adxj a = this.a;
        final adxi adxi = (adxi)message.obj;
        synchronized (a.a) {
            if (a.c == adxi || a.d == adxi) {
                a.d(adxi, 2);
            }
            return true;
        }
    }
}
