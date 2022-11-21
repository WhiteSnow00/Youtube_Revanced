import android.os.Bundle;
import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class cbx extends Handler
{
    final cby a;
    
    public cbx(final cby a) {
        this.a = a;
        super(Looper.getMainLooper());
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        final int arg1 = message.arg1;
        final int arg2 = message.arg2;
        final Object obj = message.obj;
        final Bundle peekData = message.peekData();
        final bky bky = (bky)this.a.e.get(arg1);
        if (bky == null) {
            Log.w("MR2Provider", "Pending callback not found for control request.");
            return;
        }
        this.a.e.remove(arg1);
        if (what == 3) {
            bky.e((Bundle)obj);
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
        bky.d(string, (Bundle)obj);
    }
}
