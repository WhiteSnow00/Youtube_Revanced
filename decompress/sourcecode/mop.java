import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class mop extends aeke
{
    final /* synthetic */ moq a;
    private final Context b;
    
    public mop(final moq a, final Context context) {
        this.a = a;
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        }
        else {
            looper = Looper.myLooper();
        }
        super(looper, (byte[])null);
        this.b = context.getApplicationContext();
    }
    
    public final void handleMessage(final Message message) {
        if (message.what != 1) {
            final int what = message.what;
            final StringBuilder sb = new StringBuilder("Don't know how to handle this message: ");
            sb.append(what);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        final int g = ((mor)this.a).g(this.b);
        if (mpd.g(g)) {
            this.a.d(this.b, g);
        }
    }
}
