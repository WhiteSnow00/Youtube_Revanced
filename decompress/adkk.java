import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adkk implements Application$ActivityLifecycleCallbacks, ComponentCallbacks2
{
    public boolean a;
    private volatile Activity b;
    
    private adkk() {
        this.a = true;
    }
    
    private final void a(final Activity activity) {
        this.b(qct.c(activity.getApplicationContext()));
    }
    
    private final void b(final boolean a) {
        if (a == this.a) {
            final int a2 = adjt.a;
            return;
        }
        this.a = a;
        final int a3 = adjt.a;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.b = null;
        this.a(activity);
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        this.b = null;
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        this.b = null;
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
        this.b = null;
        this.a(activity);
    }
    
    public final void onActivityStopped(final Activity b) {
        this.a(this.b = b);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
    }
    
    public final void onLowMemory() {
    }
    
    public final void onTrimMemory(final int n) {
        if (n >= 20 && this.b != null) {
            this.b(false);
        }
        this.b = null;
    }
}
