import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class agmz extends BroadcastReceiver
{
    final agna a;
    private agna b;
    
    public agmz(final agna a, final agna b) {
        this.a = a;
        this.b = b;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        synchronized (this) {
            final agna b = this.b;
            if (b == null) {
                return;
            }
            if (!b.a()) {
                return;
            }
            final agna b2 = this.b;
            b2.b.d(b2, 0L);
            context.unregisterReceiver((BroadcastReceiver)this);
            this.b = null;
        }
    }
}
