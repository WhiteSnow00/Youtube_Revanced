// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import android.view.View;
import android.app.Activity;
import java.lang.ref.WeakReference;
import android.view.View$OnAttachStateChangeListener;

final class SidecarCompat$FirstAttachAdapter implements View$OnAttachStateChangeListener
{
    private final WeakReference activityWeakReference;
    private final SidecarCompat sidecarCompat;
    
    public SidecarCompat$FirstAttachAdapter(final SidecarCompat sidecarCompat, final Activity activity) {
        sidecarCompat.getClass();
        activity.getClass();
        this.sidecarCompat = sidecarCompat;
        this.activityWeakReference = new WeakReference((T)activity);
    }
    
    public void onViewAttachedToWindow(final View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        final Activity activity = (Activity)this.activityWeakReference.get();
        final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
        if (activity == null) {
            return;
        }
        if (activityWindowToken$window_release == null) {
            return;
        }
        this.sidecarCompat.register(activityWindowToken$window_release, activity);
    }
    
    public void onViewDetachedFromWindow(final View view) {
        view.getClass();
    }
}
