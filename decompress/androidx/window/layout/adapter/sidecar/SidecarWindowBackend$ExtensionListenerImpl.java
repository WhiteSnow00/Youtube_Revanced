// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import java.util.Iterator;
import androidx.window.layout.WindowLayoutInfo;
import android.app.Activity;

public final class SidecarWindowBackend$ExtensionListenerImpl implements ExtensionInterfaceCompat$ExtensionCallbackInterface
{
    final /* synthetic */ SidecarWindowBackend this$0;
    
    public SidecarWindowBackend$ExtensionListenerImpl(final SidecarWindowBackend this$0) {
        this.this$0 = this$0;
    }
    
    public void onWindowLayoutChanged(final Activity activity, final WindowLayoutInfo windowLayoutInfo) {
        activity.getClass();
        windowLayoutInfo.getClass();
        for (final SidecarWindowBackend$WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper : this.this$0.getWindowLayoutChangeCallbacks()) {
            if (atnh.c(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper.getActivity(), activity)) {
                sidecarWindowBackend$WindowLayoutChangeCallbackWrapper.accept(windowLayoutInfo);
            }
        }
    }
}
