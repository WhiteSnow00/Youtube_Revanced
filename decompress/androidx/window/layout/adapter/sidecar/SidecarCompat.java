// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.util.ArrayList;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface$SidecarCallback;
import android.view.View$OnAttachStateChangeListener;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.List;
import androidx.window.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import androidx.window.core.VerificationMode;
import android.content.Context;
import android.content.res.Configuration;
import android.app.Activity;
import androidx.window.sidecar.SidecarInterface;
import java.util.Map;

public final class SidecarCompat implements ExtensionInterfaceCompat
{
    public static final SidecarCompat$Companion Companion;
    private static final String TAG = "SidecarCompat";
    private final Map componentCallbackMap;
    private SidecarCompat$DistinctElementCallback extensionCallback;
    private final SidecarInterface sidecar;
    private final SidecarAdapter sidecarAdapter;
    private final Map windowListenerRegisteredContexts;
    
    static {
        Companion = new SidecarCompat$Companion((atnd)null);
    }
    
    public SidecarCompat(final Context context) {
        context.getClass();
        this(SidecarCompat.Companion.getSidecarCompat$window_release(context), new SidecarAdapter((VerificationMode)null, 1, (atnd)null));
    }
    
    public SidecarCompat(final SidecarInterface sidecar, final SidecarAdapter sidecarAdapter) {
        sidecarAdapter.getClass();
        this.sidecar = sidecar;
        this.sidecarAdapter = sidecarAdapter;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }
    
    private final void registerConfigurationChangeListener(final Activity activity) {
        if (this.componentCallbackMap.get(activity) == null && activity instanceof ahd) {
            final SidecarCompat$$ExternalSyntheticLambda0 sidecarCompat$$ExternalSyntheticLambda0 = new SidecarCompat$$ExternalSyntheticLambda0(this, activity);
            this.componentCallbackMap.put(activity, sidecarCompat$$ExternalSyntheticLambda0);
            ((ahd)activity).addOnConfigurationChangedListener((akn)sidecarCompat$$ExternalSyntheticLambda0);
        }
    }
    
    private static final void registerConfigurationChangeListener$lambda$0(final SidecarCompat sidecarCompat, final Activity activity, final Configuration configuration) {
        sidecarCompat.getClass();
        activity.getClass();
        final SidecarCompat$DistinctElementCallback extensionCallback = sidecarCompat.extensionCallback;
        if (extensionCallback != null) {
            extensionCallback.onWindowLayoutChanged(activity, sidecarCompat.getWindowLayoutInfo(activity));
        }
    }
    
    private final void unregisterComponentCallback(final Activity activity) {
        final akn akn = this.componentCallbackMap.get(activity);
        if (akn == null) {
            return;
        }
        if (activity instanceof ahd) {
            ((ahd)activity).removeOnConfigurationChangedListener(akn);
        }
        this.componentCallbackMap.remove(activity);
    }
    
    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }
    
    public final WindowLayoutInfo getWindowLayoutInfo(final Activity activity) {
        activity.getClass();
        final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(atkh.a);
        }
        final SidecarInterface sidecar = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo;
        if (sidecar != null) {
            windowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
        }
        else {
            windowLayoutInfo = null;
        }
        final SidecarAdapter sidecarAdapter = this.sidecarAdapter;
        final SidecarInterface sidecar2 = this.sidecar;
        SidecarDeviceState deviceState;
        if (sidecar2 == null || (deviceState = sidecar2.getDeviceState()) == null) {
            deviceState = new SidecarDeviceState();
        }
        return sidecarAdapter.translate(windowLayoutInfo, deviceState);
    }
    
    public void onWindowLayoutChangeListenerAdded(final Activity activity) {
        activity.getClass();
        final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            this.register(activityWindowToken$window_release, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new SidecarCompat$FirstAttachAdapter(this, activity));
    }
    
    public void onWindowLayoutChangeListenerRemoved(final Activity activity) {
        activity.getClass();
        final IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return;
        }
        final SidecarInterface sidecar = this.sidecar;
        if (sidecar != null) {
            sidecar.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
        }
        this.unregisterComponentCallback(activity);
        final SidecarCompat$DistinctElementCallback extensionCallback = this.extensionCallback;
        if (extensionCallback != null) {
            extensionCallback.clearWindowLayoutInfo(activity);
        }
        final int size = this.windowListenerRegisteredContexts.size();
        this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
        if (size == 1) {
            final SidecarInterface sidecar2 = this.sidecar;
            if (sidecar2 != null) {
                sidecar2.onDeviceStateListenersChanged(true);
            }
        }
    }
    
    public final void register(final IBinder binder, final Activity activity) {
        binder.getClass();
        activity.getClass();
        this.windowListenerRegisteredContexts.put(binder, activity);
        final SidecarInterface sidecar = this.sidecar;
        if (sidecar != null) {
            sidecar.onWindowLayoutChangeListenerAdded(binder);
        }
        if (this.windowListenerRegisteredContexts.size() == 1) {
            final SidecarInterface sidecar2 = this.sidecar;
            if (sidecar2 != null) {
                sidecar2.onDeviceStateListenersChanged(false);
            }
        }
        final SidecarCompat$DistinctElementCallback extensionCallback = this.extensionCallback;
        if (extensionCallback != null) {
            extensionCallback.onWindowLayoutChanged(activity, this.getWindowLayoutInfo(activity));
        }
        this.registerConfigurationChangeListener(activity);
    }
    
    public void setExtensionCallback(final ExtensionInterfaceCompat$ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface) {
        extensionInterfaceCompat$ExtensionCallbackInterface.getClass();
        this.extensionCallback = new SidecarCompat$DistinctElementCallback(extensionInterfaceCompat$ExtensionCallbackInterface);
        final SidecarInterface sidecar = this.sidecar;
        if (sidecar != null) {
            sidecar.setSidecarCallback((SidecarInterface$SidecarCallback)new DistinctElementSidecarCallback(this.sidecarAdapter, (SidecarInterface$SidecarCallback)new SidecarCompat$TranslatingCallback(this)));
        }
    }
    
    public boolean validateExtensionInterface() {
        boolean b = false;
        try {
            final SidecarInterface sidecar = this.sidecar;
            final Object o = null;
            Method method = null;
            Label_0043: {
                if (sidecar != null) {
                    final Class<? extends SidecarInterface> class1 = sidecar.getClass();
                    if (class1 != null) {
                        method = class1.getMethod("setSidecarCallback", SidecarInterface$SidecarCallback.class);
                        break Label_0043;
                    }
                }
                method = null;
            }
            Class<?> returnType;
            if (method != null) {
                returnType = method.getReturnType();
            }
            else {
                returnType = null;
            }
            if (!atnh.c(returnType, Void.TYPE)) {
                final StringBuilder sb = new StringBuilder("Illegal return type for 'setSidecarCallback': ");
                sb.append(returnType);
                throw new NoSuchMethodException(sb.toString());
            }
            final SidecarInterface sidecar2 = this.sidecar;
            if (sidecar2 != null) {
                sidecar2.getDeviceState();
            }
            final SidecarInterface sidecar3 = this.sidecar;
            if (sidecar3 != null) {
                sidecar3.onDeviceStateListenersChanged(true);
            }
            final SidecarInterface sidecar4 = this.sidecar;
            Method method2 = null;
            Label_0138: {
                if (sidecar4 != null) {
                    final Class<? extends SidecarInterface> class2 = sidecar4.getClass();
                    if (class2 != null) {
                        method2 = class2.getMethod("getWindowLayoutInfo", IBinder.class);
                        break Label_0138;
                    }
                }
                method2 = null;
            }
            Class<?> returnType2;
            if (method2 != null) {
                returnType2 = method2.getReturnType();
            }
            else {
                returnType2 = null;
            }
            if (!atnh.c(returnType2, SidecarWindowLayoutInfo.class)) {
                final StringBuilder sb2 = new StringBuilder("Illegal return type for 'getWindowLayoutInfo': ");
                sb2.append(returnType2);
                throw new NoSuchMethodException(sb2.toString());
            }
            final SidecarInterface sidecar5 = this.sidecar;
            Method method3 = null;
            Label_0200: {
                if (sidecar5 != null) {
                    final Class<? extends SidecarInterface> class3 = sidecar5.getClass();
                    if (class3 != null) {
                        method3 = class3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                        break Label_0200;
                    }
                }
                method3 = null;
            }
            Class<?> returnType3;
            if (method3 != null) {
                returnType3 = method3.getReturnType();
            }
            else {
                returnType3 = null;
            }
            if (!atnh.c(returnType3, Void.TYPE)) {
                final StringBuilder sb3 = new StringBuilder("Illegal return type for 'onWindowLayoutChangeListenerAdded': ");
                sb3.append(returnType3);
                throw new NoSuchMethodException(sb3.toString());
            }
            final SidecarInterface sidecar6 = this.sidecar;
            Method method4 = null;
            Label_0265: {
                if (sidecar6 != null) {
                    final Class<? extends SidecarInterface> class4 = sidecar6.getClass();
                    if (class4 != null) {
                        method4 = class4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                        break Label_0265;
                    }
                }
                method4 = null;
            }
            Object returnType4 = o;
            if (method4 != null) {
                returnType4 = method4.getReturnType();
            }
            if (atnh.c(returnType4, Void.TYPE)) {
                final SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                try {
                    sidecarDeviceState.posture = 3;
                }
                catch (final NoSuchFieldError noSuchFieldError) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                    final Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class<?>[])new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    invoke.getClass();
                    if ((int)invoke != 3) {
                        throw new Exception("Invalid device posture getter/setter");
                    }
                }
                Object invoke2 = new SidecarDisplayFeature();
                final Rect rect = ((SidecarDisplayFeature)invoke2).getRect();
                rect.getClass();
                ((SidecarDisplayFeature)invoke2).setRect(rect);
                ((SidecarDisplayFeature)invoke2).getType();
                ((SidecarDisplayFeature)invoke2).setType(1);
                final SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                while (true) {
                    try {
                        final List displayFeatures = sidecarWindowLayoutInfo.displayFeatures;
                        b = true;
                    }
                    catch (final NoSuchFieldError noSuchFieldError2) {
                        final ArrayList list = new ArrayList();
                        list.add(invoke2);
                        SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, list);
                        invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class<?>[])new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                        invoke2.getClass();
                        if (atnh.c(list, invoke2)) {
                            continue;
                        }
                        throw new Exception("Invalid display feature getter/setter");
                    }
                    break;
                }
                throw new Exception("Invalid device posture getter/setter");
            }
            final StringBuilder sb4 = new StringBuilder("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ");
            sb4.append(returnType4);
            throw new NoSuchMethodException(sb4.toString());
        }
        finally {
            return b;
        }
    }
}
