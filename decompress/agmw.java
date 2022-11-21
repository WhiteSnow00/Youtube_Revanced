import com.google.firebase.iid.FirebaseInstanceId;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmw extends BroadcastReceiver
{
    public agon a;
    
    public agmw(final agon a, final byte[] array) {
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
        final aapu i = FirebaseInstanceId.i;
        final agon a2 = this.a;
        final Object b = a2.b;
        FirebaseInstanceId.m((Runnable)a2, 0L);
        this.a.a().unregisterReceiver((BroadcastReceiver)this);
        this.a = null;
    }
}
