import java.util.Map;
import java.util.Iterator;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class adhs extends BroadcastReceiver
{
    final adht a;
    
    public adhs(final adht a) {
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
                        ((adhf)this.a.c.a()).a = true;
                    }
                    else if (action.equals("android.intent.action.SCREEN_OFF")) {
                        ((adhf)this.a.c.a()).a = false;
                    }
                    else if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                        ((adhf)this.a.c.a()).a(intent);
                        final adhu adhu = (adhu)this.a.d.a();
                        synchronized (adhu.a) {
                            for (final adha adha : ((Map<K, adha>)adhu.f).values()) {
                                if (adha.e()) {
                                    adha.a();
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
