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

public abstract class aedp
{
    protected final Set a;
    private final IntentFilter b;
    private final Context c;
    private aedo d;
    private volatile boolean e;
    
    protected aedp(final IntentFilter b, final Context context) {
        this.a = new HashSet();
        this.d = null;
        this.e = false;
        this.b = b;
        this.c = aegu.q(context);
    }
    
    private final void e() {
        if (!this.a.isEmpty() && this.d == null) {
            this.d = new aedo(this);
            if (Build$VERSION.SDK_INT >= 33) {
                this.c.registerReceiver((BroadcastReceiver)this.d, this.b, 2);
            }
            this.c.registerReceiver((BroadcastReceiver)this.d, this.b);
        }
        if (this.a.isEmpty()) {
            final aedo d = this.d;
            if (d != null) {
                this.c.unregisterReceiver((BroadcastReceiver)d);
                this.d = null;
            }
        }
    }
    
    protected abstract void a(final Context p0, final Intent p1);
    
    public final void b(final aedq aedq) {
        synchronized (this) {
            this.a.add(aedq);
            this.e();
        }
    }
    
    public final void c(final aedq aedq) {
        synchronized (this) {
            this.a.remove(aedq);
            this.e();
        }
    }
    
    public final void d(final Object o) {
        monitorenter(this);
        try {
            final Iterator iterator = new HashSet(this.a).iterator();
            while (iterator.hasNext()) {
                ((aedq)iterator.next()).i(o);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
