// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import androidx.window.layout.WindowLayoutInfo;
import android.util.Log;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Collection;
import android.app.Activity;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface$SidecarCallback;

public final class SidecarCompat$TranslatingCallback implements SidecarInterface$SidecarCallback
{
    final SidecarCompat this$0;
    
    public SidecarCompat$TranslatingCallback(final SidecarCompat this$0) {
        this.this$0 = this$0;
    }
    
    public void onDeviceStateChanged(final SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        final Collection values = SidecarCompat.access$getWindowListenerRegisteredContexts$p(this.this$0).values();
        final SidecarCompat this$0 = this.this$0;
        for (final Activity activity : values) {
            final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            SidecarWindowLayoutInfo windowLayoutInfo = null;
            if (activityWindowToken$window_release != null) {
                final SidecarInterface sidecar = this$0.getSidecar();
                windowLayoutInfo = windowLayoutInfo;
                if (sidecar != null) {
                    windowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
            }
            final SidecarCompat$DistinctElementCallback access$getExtensionCallback$p = SidecarCompat.access$getExtensionCallback$p(this$0);
            if (access$getExtensionCallback$p != null) {
                access$getExtensionCallback$p.onWindowLayoutChanged(activity, SidecarCompat.access$getSidecarAdapter$p(this$0).translate(windowLayoutInfo, sidecarDeviceState));
            }
        }
    }
    
    public void onWindowLayoutChanged(final IBinder binder, final SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        binder.getClass();
        sidecarWindowLayoutInfo.getClass();
        final Activity activity = SidecarCompat.access$getWindowListenerRegisteredContexts$p(this.this$0).get(binder);
        if (activity == null) {
            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
            return;
        }
        final SidecarAdapter access$getSidecarAdapter$p = SidecarCompat.access$getSidecarAdapter$p(this.this$0);
        final SidecarInterface sidecar = this.this$0.getSidecar();
        SidecarDeviceState deviceState;
        if (sidecar == null || (deviceState = sidecar.getDeviceState()) == null) {
            deviceState = new SidecarDeviceState();
        }
        final WindowLayoutInfo translate = access$getSidecarAdapter$p.translate(sidecarWindowLayoutInfo, deviceState);
        final SidecarCompat$DistinctElementCallback access$getExtensionCallback$p = SidecarCompat.access$getExtensionCallback$p(this.this$0);
        if (access$getExtensionCallback$p != null) {
            access$getExtensionCallback$p.onWindowLayoutChanged(activity, translate);
        }
    }
}
