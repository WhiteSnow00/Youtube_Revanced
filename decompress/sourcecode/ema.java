import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class ema implements emc
{
    final /* synthetic */ Activity a;
    private final /* synthetic */ int b;
    
    public ema(final Activity a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Application$ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks) {
        final int b = this.b;
        if (b == 0) {
            application$ActivityLifecycleCallbacks.onActivityResumed(this.a);
            return;
        }
        if (b == 1) {
            application$ActivityLifecycleCallbacks.onActivityStarted(this.a);
            return;
        }
        if (b == 2) {
            application$ActivityLifecycleCallbacks.onActivityPaused(this.a);
            return;
        }
        if (b != 3) {
            application$ActivityLifecycleCallbacks.onActivityDestroyed(this.a);
            return;
        }
        application$ActivityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
