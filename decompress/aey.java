import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aey implements Application$ActivityLifecycleCallbacks
{
    public Object a;
    private Activity b;
    private final int c;
    private boolean d;
    private boolean e;
    private boolean f;
    
    public aey(final Activity b) {
        this.d = false;
        this.e = false;
        this.f = false;
        this.b = b;
        this.c = b.hashCode();
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.e = true;
        }
    }
    
    public final void onActivityPaused(final Activity activity) {
        if (this.e && !this.f && !this.d && aez.a(this.a, this.c, activity)) {
            this.f = true;
            this.a = null;
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
        if (this.b == activity) {
            this.d = true;
        }
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
