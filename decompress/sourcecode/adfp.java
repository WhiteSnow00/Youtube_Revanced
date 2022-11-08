import java.util.Map;
import java.util.Iterator;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class adfp extends BroadcastReceiver
{
    final /* synthetic */ adfq a;
    
    public adfp(final adfq a) {
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
                        ((adfc)this.a.c.a()).a = true;
                    }
                    else if (action.equals("android.intent.action.SCREEN_OFF")) {
                        ((adfc)this.a.c.a()).a = false;
                    }
                    else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                        ((adfc)this.a.c.a()).a(intent);
                        final adfr adfr = (adfr)this.a.d.a();
                        synchronized (adfr.a) {
                            for (final adex adex : ((Map<K, adex>)adfr.f).values()) {
                                if (adex.e()) {
                                    adex.a();
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
