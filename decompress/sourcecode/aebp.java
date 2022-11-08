import java.util.Iterator;
import java.util.Collection;
import android.os.Bundle;
import android.content.Intent;
import java.util.LinkedHashSet;
import android.os.Looper;
import android.os.Handler;
import android.content.IntentFilter;
import android.content.Context;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aebp extends adzv
{
    private static aebp b;
    private final aebg c;
    private final Set d;
    
    public aebp(final Context context, final aebg c) {
        new aeby("SplitInstallListenerRegistry", (byte[])null);
        super(new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        new Handler(Looper.getMainLooper());
        this.d = new LinkedHashSet();
        this.c = c;
    }
    
    public static aebp e(final Context context) {
        synchronized (aebp.class) {
            if (aebp.b == null) {
                aebp.b = new aebp(context, (aebg)aebj.a);
            }
            return aebp.b;
        }
    }
    
    protected final void a(final Context context, final Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        final aebx b = aebx.b(bundleExtra);
        final aebh a = this.c.a();
        if (b.b == 3 && a != null) {
            a.a();
            return;
        }
        this.f(b);
    }
    
    public final void f(final aebx aebx) {
        monitorenter(this);
        try {
            final Iterator iterator = new LinkedHashSet(this.d).iterator();
            while (iterator.hasNext()) {
                ((aebz)iterator.next()).i((Object)aebx);
            }
            super.d((Object)aebx);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
