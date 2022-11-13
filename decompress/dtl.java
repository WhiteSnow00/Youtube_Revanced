import java.util.Iterator;
import android.content.ContextWrapper;
import java.util.Map;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

final class dtl implements Application$ActivityLifecycleCallbacks
{
    public dtl() {
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        synchronized (dtm.a) {
            if (!dtm.b.containsKey(activity)) {
                return;
            }
            throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        final Object a = dtm.a;
        monitorenter(a);
        try {
            dtm.b.remove(activity);
            final Iterator iterator = dtm.b.entrySet().iterator();
            while (iterator.hasNext()) {
                Context baseContext = ((Map.Entry<Context, V>)iterator.next()).getKey();
                while (baseContext instanceof ContextWrapper) {
                    if ((baseContext = ((ContextWrapper)baseContext).getBaseContext()) == activity) {
                        iterator.remove();
                        break;
                    }
                }
            }
            dtm.c.put(coz.b((Context)activity), true);
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
