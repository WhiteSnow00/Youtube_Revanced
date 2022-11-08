import android.os.Bundle;
import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbt extends Handler
{
    final /* synthetic */ cbu a;
    
    public cbt(final cbu a) {
        this.a = a;
        super(Looper.getMainLooper());
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        final int arg1 = message.arg1;
        final int arg2 = message.arg2;
        final Object obj = message.obj;
        final Bundle peekData = message.peekData();
        final bkt bkt = (bkt)this.a.e.get(arg1);
        if (bkt == null) {
            Log.w("MR2Provider", "Pending callback not found for control request.");
            return;
        }
        this.a.e.remove(arg1);
        if (what == 3) {
            bkt.e((Bundle)obj);
            return;
        }
        if (what != 4) {
            return;
        }
        String string;
        if (peekData == null) {
            string = null;
        }
        else {
            string = peekData.getString("error");
        }
        bkt.d(string, (Bundle)obj);
    }
}
