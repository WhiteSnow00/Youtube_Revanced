import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avb extends aub
{
    final avd a;
    
    public avb(final avd a) {
        this.a = a;
    }
    
    @Override
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        if (Build$VERSION.SDK_INT < 29) {
            final int b = avf.b;
            ((avf)activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.a.h;
        }
    }
    
    @Override
    public final void onActivityPaused(final Activity activity) {
        final avd a = this.a;
        final int c = a.c - 1;
        a.c = c;
        if (c == 0) {
            a.e.postDelayed(a.g, 700L);
        }
    }
    
    public final void onActivityPreCreated(final Activity activity, final Bundle bundle) {
        avc.a(activity, (Application$ActivityLifecycleCallbacks)new ava(this));
    }
    
    @Override
    public final void onActivityStopped(final Activity activity) {
        final avd a = this.a;
        --a.b;
        a.c();
    }
}
