import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class kac extends Handler
{
    final /* synthetic */ kad a;
    
    public kac(final kad a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 23998) {
            this.a.k();
        }
    }
}
