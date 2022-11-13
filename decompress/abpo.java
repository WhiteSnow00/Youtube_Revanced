import android.content.Intent;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abpo extends BroadcastReceiver
{
    public boolean a;
    public final abpq b;
    private Handler c;
    
    public abpo(final abpq b) {
        this.b = b;
    }
    
    public final void a() {
        if (abrj.ag((arwh)this.b.s.a).I) {
            return;
        }
        if (this.c == null) {
            this.c = new Handler();
        }
        if (!this.a) {
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            this.b.a.registerReceiver((BroadcastReceiver)this, intentFilter);
            this.a = true;
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (!this.b.p.k() && this.b.c.m().b > 0L) {
                this.c.postDelayed((Runnable)new abei(this, 15), 180000L);
            }
            return;
        }
        this.c.removeCallbacksAndMessages((Object)null);
    }
}
