import android.content.IntentFilter;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class fr
{
    private BroadcastReceiver a;
    final fw c;
    
    public fr(final fw c) {
        this.c = c;
    }
    
    public abstract IntentFilter a();
    
    public abstract void b();
    
    final void c() {
        final BroadcastReceiver a = this.a;
        if (a == null) {
            return;
        }
        while (true) {
            try {
                this.c.j.unregisterReceiver(a);
                this.a = null;
            }
            catch (final IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    final void d() {
        this.c();
        final IntentFilter a = this.a();
        if (a.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = (BroadcastReceiver)new fq(this);
        }
        this.c.j.registerReceiver(this.a, a);
    }
}
