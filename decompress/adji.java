import java.util.Map;
import java.util.Iterator;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class adji extends BroadcastReceiver
{
    final adjj a;
    
    public adji(final adjj a) {
        this.a = a;
    }
    
    public final void onReceive(Context a, final Intent intent) {
        a = (Context)this.a;
        monitorenter(a);
        try {
            if (this.a.a && intent != null) {
                final String action = intent.getAction();
                if (action != null) {
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        ((adiu)this.a.d.a()).a = true;
                    }
                    else if (action.equals("android.intent.action.SCREEN_OFF")) {
                        ((adiu)this.a.d.a()).a = false;
                    }
                    else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                        ((adiu)this.a.d.a()).a(intent);
                        final adjk adjk = (adjk)this.a.e.a();
                        synchronized (adjk.a) {
                            for (final adim adim : ((Map<K, adim>)adjk.g).values()) {
                                if (adim.g()) {
                                    adim.a();
                                }
                            }
                        }
                    }
                    monitorexit(a);
                    return;
                }
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
