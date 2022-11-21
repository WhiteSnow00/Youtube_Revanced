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

public final class aefj extends aedp
{
    private static aefj b;
    private final aefa c;
    private final Set d;
    
    public aefj(final Context context, final aefa c) {
        new aefs("SplitInstallListenerRegistry", null);
        super(new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        new Handler(Looper.getMainLooper());
        this.d = new LinkedHashSet();
        this.c = c;
    }
    
    public static aefj e(final Context context) {
        synchronized (aefj.class) {
            if (aefj.b == null) {
                aefj.b = new aefj(context, aefd.a);
            }
            return aefj.b;
        }
    }
    
    @Override
    protected final void a(final Context context, final Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        final aefr b = aefr.b(bundleExtra);
        final aefb a = this.c.a();
        if (b.b == 3 && a != null) {
            a.a();
            return;
        }
        this.f(b);
    }
    
    public final void f(final aefr aefr) {
        monitorenter(this);
        try {
            final Iterator iterator = new LinkedHashSet(this.d).iterator();
            while (iterator.hasNext()) {
                ((aeft)iterator.next()).i((Object)aefr);
            }
            super.d(aefr);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
