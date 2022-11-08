import java.util.Iterator;
import java.util.Collection;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.os.Build$VERSION;
import java.util.HashSet;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adzv
{
    protected final Set a;
    private final IntentFilter b;
    private final Context c;
    private adzu d;
    private volatile boolean e;
    
    protected adzv(final IntentFilter b, final Context context) {
        this.a = new HashSet();
        this.d = null;
        this.e = false;
        this.b = b;
        this.c = adwd.N(context);
    }
    
    private final void e() {
        if (!this.a.isEmpty() && this.d == null) {
            this.d = new adzu(this);
            if (Build$VERSION.SDK_INT >= 33) {
                this.c.registerReceiver((BroadcastReceiver)this.d, this.b, 2);
            }
            this.c.registerReceiver((BroadcastReceiver)this.d, this.b);
        }
        if (this.a.isEmpty()) {
            final adzu d = this.d;
            if (d != null) {
                this.c.unregisterReceiver((BroadcastReceiver)d);
                this.d = null;
            }
        }
    }
    
    protected abstract void a(final Context p0, final Intent p1);
    
    public final void b(final adzw adzw) {
        synchronized (this) {
            this.a.add(adzw);
            this.e();
        }
    }
    
    public final void c(final adzw adzw) {
        synchronized (this) {
            this.a.remove(adzw);
            this.e();
        }
    }
    
    public final void d(final Object o) {
        monitorenter(this);
        try {
            final Iterator iterator = new HashSet(this.a).iterator();
            while (iterator.hasNext()) {
                ((adzw)iterator.next()).i(o);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
