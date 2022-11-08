import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class abeu extends Handler
{
    final /* synthetic */ abey a;
    
    public abeu(final abey a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    final void a(final int n, final int n2) {
        this.removeMessages(n);
        this.sendEmptyMessageDelayed(n, (long)n2);
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 1 && what != 2) {
            return;
        }
        this.a.d();
    }
}
