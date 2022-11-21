import com.google.firebase.messaging.FirebaseMessaging;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class agom extends BroadcastReceiver
{
    public agon a;
    
    public agom(final agon a) {
        this.a = a;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final agon a = this.a;
        if (a == null) {
            return;
        }
        if (!a.b()) {
            return;
        }
        final agon a2 = this.a;
        final Object b = a2.b;
        FirebaseMessaging.k((Runnable)a2, 0L);
        this.a.a().unregisterReceiver((BroadcastReceiver)this);
        this.a = null;
    }
}
