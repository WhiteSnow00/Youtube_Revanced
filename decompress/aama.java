import android.content.Intent;
import android.util.Log;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aama extends BroadcastReceiver
{
    boolean a;
    private final Context b;
    private abkq c;
    
    public aama(final Context b) {
        b.getClass();
        this.b = b;
    }
    
    public final void a(final abkq c) {
        synchronized (this) {
            c.getClass();
            this.c = c;
            if (!this.a) {
                this.b.registerReceiver((BroadcastReceiver)this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
                this.a = true;
            }
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.a) {
                try {
                    this.b.unregisterReceiver((BroadcastReceiver)this);
                }
                catch (final IllegalArgumentException ex) {
                    Log.w("HeadsetPlugReceiver", "Receiver already unregistered");
                }
                this.a = false;
            }
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (this.c == null) {
            return;
        }
        if (intent.hasExtra("state")) {
            boolean n = true;
            if (intent.getIntExtra("state", 1) != 1) {
                n = false;
            }
            final abkq c = this.c;
            if (n != c.n) {
                c.n = n;
                ablb ablb;
                if (n) {
                    ablb = new ablb(new int[] { 3, 5 });
                }
                else {
                    ablb = new ablb();
                }
                c.p(ablb);
            }
        }
    }
}
