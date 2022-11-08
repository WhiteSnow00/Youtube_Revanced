import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdt extends BroadcastReceiver
{
    final /* synthetic */ hdu a;
    
    public hdt(final hdu a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        if (action != null && action.equals("INTENT_CANCEL_TRANSCODE")) {
            final gxf a = this.a.a;
            final rhz e = a.e;
            if (e != null) {
                ((qxx)e.a).a();
                return;
            }
            a.d.a();
        }
    }
}
