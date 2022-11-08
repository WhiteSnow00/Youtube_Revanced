import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class jzz extends Handler
{
    final /* synthetic */ kaa a;
    
    public jzz(final kaa a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        if (message.what == 0) {
            final kaa a = this.a;
            final ged e = a.e;
            if (!a.d) {
                if (kaa.a(e.b()) == null) {
                    kaa.c(e.a(), 0);
                }
            }
        }
    }
}
