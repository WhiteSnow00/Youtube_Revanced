import java.util.Set;
import android.content.Intent;
import android.util.Log;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agmi implements Application$ActivityLifecycleCallbacks
{
    private final int a;
    private final Object b;
    
    public agmi(final int a) {
        this.a = a;
        this.b = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public agmi(final por b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void onActivityCreated(final Activity activity, Bundle bundle) {
        if (this.a != 0) {
            nnv.Y((Context)activity);
            final Intent intent = activity.getIntent();
            if (intent != null) {
                if (pot.b(intent)) {
                    if (intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) == 1) {
                        ((por)this.b).a((Context)activity, intent);
                    }
                }
            }
            return;
        }
        final Intent intent2 = activity.getIntent();
        if (intent2 != null) {
            if (((Set<Intent>)this.b).add(intent2)) {
                bundle = null;
                Bundle bundle2;
                try {
                    final Bundle extras = intent2.getExtras();
                    bundle2 = bundle;
                    if (extras != null) {
                        bundle2 = extras.getBundle("gcm.n.analytics_data");
                    }
                }
                catch (final RuntimeException ex) {
                    Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", (Throwable)ex);
                    bundle2 = bundle;
                }
                if (agpc.u(bundle2)) {
                    if (bundle2 != null) {
                        if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                            final agig agig = (agig)agia.b().f((Class)agig.class);
                            if (agig != null) {
                                final String string = bundle2.getString("google.c.a.c_id");
                                agig.b((Object)string);
                                final Bundle bundle3 = new Bundle();
                                bundle3.putString("source", "Firebase");
                                bundle3.putString("medium", "notification");
                                bundle3.putString("campaign", string);
                                agig.a("_cmp", bundle3);
                            }
                            else {
                                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                            }
                        }
                    }
                    agpc.r("_no", bundle2);
                }
            }
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
        if (this.a != 0) {
            return;
        }
        if (activity.isFinishing()) {
            ((Set)this.b).remove(activity.getIntent());
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
        if (this.a != 0) {
            final Intent intent = activity.getIntent();
            if (intent != null) {
                if (pot.b(intent)) {
                    if (intent.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 0) == 0) {
                        ((por)this.b).a((Context)activity, intent);
                    }
                }
            }
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
