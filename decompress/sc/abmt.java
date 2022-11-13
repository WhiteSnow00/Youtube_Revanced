import java.util.Iterator;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class abmt extends BroadcastReceiver
{
    final abuj a;
    final abnc b;
    final abmw c;
    
    public abmt(final abmw c, final abuj a, final abnc b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        if (action != null) {
            if (!"noop".equals(action)) {
                if ("com.google.android.libraries.youtube.player.action.controller_notification_delete".equals(action)) {
                    this.a.b();
                }
                else if ("android.intent.action.MAIN".equals(action)) {
                    this.b.d();
                }
                for (final abmq abmq : this.c.b) {
                    if (abmq.i(action)) {
                        this.b.b(abmq);
                    }
                }
            }
        }
    }
}
