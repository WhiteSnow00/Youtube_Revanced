import java.util.Iterator;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import android.content.BroadcastReceiver;

// 
// Decompiled by Procyon v0.6.0
// 

final class agfy extends BroadcastReceiver
{
    public static final AtomicReference a;
    private final Context b;
    
    static {
        a = new AtomicReference();
    }
    
    public agfy(final Context b) {
        this.b = b;
    }
    
    public final void onReceive(Context a, final Intent intent) {
        a = (Context)agfz.a;
        monitorenter(a);
        try {
            final Iterator iterator = agfz.b.values().iterator();
            while (iterator.hasNext()) {
                ((agfz)iterator.next()).i();
            }
            monitorexit(a);
            this.b.unregisterReceiver((BroadcastReceiver)this);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
