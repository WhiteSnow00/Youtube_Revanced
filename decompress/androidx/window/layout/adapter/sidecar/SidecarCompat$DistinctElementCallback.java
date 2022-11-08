// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import androidx.window.layout.WindowLayoutInfo;
import android.app.Activity;
import java.util.concurrent.locks.ReentrantLock;
import java.util.WeakHashMap;

final class SidecarCompat$DistinctElementCallback implements ExtensionInterfaceCompat$ExtensionCallbackInterface
{
    private final WeakHashMap activityWindowLayoutInfo;
    private final ExtensionInterfaceCompat$ExtensionCallbackInterface callbackInterface;
    private final ReentrantLock lock;
    
    public SidecarCompat$DistinctElementCallback(final ExtensionInterfaceCompat$ExtensionCallbackInterface callbackInterface) {
        callbackInterface.getClass();
        this.callbackInterface = callbackInterface;
        this.lock = new ReentrantLock();
        this.activityWindowLayoutInfo = new WeakHashMap();
    }
    
    public final void clearWindowLayoutInfo(final Activity activity) {
        activity.getClass();
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            this.activityWindowLayoutInfo.put(activity, null);
        }
        finally {
            lock.unlock();
        }
    }
    
    public void onWindowLayoutChanged(final Activity activity, final WindowLayoutInfo windowLayoutInfo) {
        activity.getClass();
        windowLayoutInfo.getClass();
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            if (atnh.c(windowLayoutInfo, this.activityWindowLayoutInfo.get(activity))) {
                return;
            }
            final WindowLayoutInfo windowLayoutInfo2 = this.activityWindowLayoutInfo.put(activity, windowLayoutInfo);
            lock.unlock();
            this.callbackInterface.onWindowLayoutChanged(activity, windowLayoutInfo);
        }
        finally {
            lock.unlock();
        }
    }
}
