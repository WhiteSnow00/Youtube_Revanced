// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import java.util.concurrent.locks.Lock;
import java.util.ArrayList;
import java.util.List;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.Iterator;
import java.util.Collection;
import android.app.Activity;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import androidx.window.layout.adapter.WindowBackend;

public final class SidecarWindowBackend implements WindowBackend
{
    public static final SidecarWindowBackend$Companion Companion;
    public static final boolean DEBUG = false;
    private static final String TAG = "WindowServer";
    private static volatile SidecarWindowBackend globalInstance;
    private static final ReentrantLock globalLock;
    private ExtensionInterfaceCompat windowExtension;
    private final CopyOnWriteArrayList windowLayoutChangeCallbacks;
    
    static {
        Companion = new SidecarWindowBackend$Companion((atnd)null);
        globalLock = new ReentrantLock();
    }
    
    public SidecarWindowBackend(ExtensionInterfaceCompat windowExtension) {
        this.windowExtension = windowExtension;
        this.windowLayoutChangeCallbacks = new CopyOnWriteArrayList();
        windowExtension = this.windowExtension;
        if (windowExtension != null) {
            windowExtension.setExtensionCallback((ExtensionInterfaceCompat$ExtensionCallbackInterface)new SidecarWindowBackend$ExtensionListenerImpl(this));
        }
    }
    
    private final void callbackRemovedForActivity(final Activity activity) {
        final CopyOnWriteArrayList windowLayoutChangeCallbacks = this.windowLayoutChangeCallbacks;
        if (!(windowLayoutChangeCallbacks instanceof Collection) || !windowLayoutChangeCallbacks.isEmpty()) {
            final Iterator iterator = windowLayoutChangeCallbacks.iterator();
            while (iterator.hasNext()) {
                if (atnh.c(((SidecarWindowBackend$WindowLayoutChangeCallbackWrapper)iterator.next()).getActivity(), activity)) {
                    return;
                }
            }
        }
        final ExtensionInterfaceCompat windowExtension = this.windowExtension;
        if (windowExtension != null) {
            windowExtension.onWindowLayoutChangeListenerRemoved(activity);
        }
    }
    
    private final boolean isActivityRegistered(final Activity activity) {
        final CopyOnWriteArrayList windowLayoutChangeCallbacks = this.windowLayoutChangeCallbacks;
        final boolean b = windowLayoutChangeCallbacks instanceof Collection;
        final boolean b2 = false;
        boolean b3;
        if (b && windowLayoutChangeCallbacks.isEmpty()) {
            b3 = b2;
        }
        else {
            final Iterator iterator = windowLayoutChangeCallbacks.iterator();
            do {
                b3 = b2;
                if (iterator.hasNext()) {
                    continue;
                }
                return b3;
            } while (!atnh.c(((SidecarWindowBackend$WindowLayoutChangeCallbackWrapper)iterator.next()).getActivity(), activity));
            b3 = true;
        }
        return b3;
    }
    
    public final ExtensionInterfaceCompat getWindowExtension() {
        return this.windowExtension;
    }
    
    public final CopyOnWriteArrayList getWindowLayoutChangeCallbacks() {
        return this.windowLayoutChangeCallbacks;
    }
    
    public void registerLayoutChangeCallback(final Context context, final Executor executor, final akn akn) {
        context.getClass();
        executor.getClass();
        akn.getClass();
        final boolean b = context instanceof Activity;
        Object o = null;
        final WindowLayoutInfo windowLayoutInfo = null;
        Activity activity;
        if (b) {
            activity = (Activity)context;
        }
        else {
            activity = null;
        }
        if (activity != null) {
            o = SidecarWindowBackend.globalLock;
            ((Lock)o).lock();
            try {
                final ExtensionInterfaceCompat windowExtension = this.windowExtension;
                if (windowExtension == null) {
                    akn.accept((Object)new WindowLayoutInfo(atkh.a));
                    return;
                }
                final boolean activityRegistered = this.isActivityRegistered(activity);
                final SidecarWindowBackend$WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper = new SidecarWindowBackend$WindowLayoutChangeCallbackWrapper(activity, executor, akn);
                this.windowLayoutChangeCallbacks.add(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper);
                Label_0218: {
                    if (activityRegistered) {
                        while (true) {
                            for (final Object next : this.windowLayoutChangeCallbacks) {
                                if (atnh.c(activity, ((SidecarWindowBackend$WindowLayoutChangeCallbackWrapper)next).getActivity())) {
                                    final SidecarWindowBackend$WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper2 = (SidecarWindowBackend$WindowLayoutChangeCallbackWrapper)next;
                                    final SidecarWindowBackend$WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper3 = sidecarWindowBackend$WindowLayoutChangeCallbackWrapper2;
                                    WindowLayoutInfo lastInfo = windowLayoutInfo;
                                    if (sidecarWindowBackend$WindowLayoutChangeCallbackWrapper3 != null) {
                                        lastInfo = sidecarWindowBackend$WindowLayoutChangeCallbackWrapper3.getLastInfo();
                                    }
                                    if (lastInfo != null) {
                                        sidecarWindowBackend$WindowLayoutChangeCallbackWrapper.accept(lastInfo);
                                    }
                                    break Label_0218;
                                }
                            }
                            final SidecarWindowBackend$WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper2 = null;
                            continue;
                        }
                    }
                    windowExtension.onWindowLayoutChangeListenerAdded(activity);
                }
                ((Lock)o).unlock();
                o = atjv.a;
            }
            finally {
                ((Lock)o).unlock();
            }
        }
        if (o == null) {
            akn.accept((Object)new WindowLayoutInfo(atkh.a));
        }
    }
    
    public final void setWindowExtension(final ExtensionInterfaceCompat windowExtension) {
        this.windowExtension = windowExtension;
    }
    
    public void unregisterLayoutChangeCallback(final akn akn) {
        akn.getClass();
        final ReentrantLock globalLock = SidecarWindowBackend.globalLock;
        monitorenter(globalLock);
        try {
            if (this.windowExtension == null) {
                monitorexit(globalLock);
                return;
            }
            final ArrayList list = new ArrayList();
            for (final SidecarWindowBackend$WindowLayoutChangeCallbackWrapper sidecarWindowBackend$WindowLayoutChangeCallbackWrapper : this.windowLayoutChangeCallbacks) {
                if (sidecarWindowBackend$WindowLayoutChangeCallbackWrapper.getCallback() == akn) {
                    sidecarWindowBackend$WindowLayoutChangeCallbackWrapper.getClass();
                    list.add(sidecarWindowBackend$WindowLayoutChangeCallbackWrapper);
                }
            }
            this.windowLayoutChangeCallbacks.removeAll(list);
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                this.callbackRemovedForActivity(((SidecarWindowBackend$WindowLayoutChangeCallbackWrapper)iterator2.next()).getActivity());
            }
            monitorexit(globalLock);
        }
        finally {
            monitorexit(globalLock);
            while (true) {}
        }
    }
}
