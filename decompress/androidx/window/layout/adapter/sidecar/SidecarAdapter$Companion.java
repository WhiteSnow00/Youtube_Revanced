// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import java.util.List;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import androidx.window.sidecar.SidecarDeviceState;

public final class SidecarAdapter$Companion
{
    private SidecarAdapter$Companion() {
    }
    
    public final int getRawSidecarDevicePosture(final SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        try {
            return sidecarDeviceState.posture;
        }
        catch (final NoSuchFieldError noSuchFieldError) {
            try {
                final Object invoke = SidecarDeviceState.class.getMethod("getPosture", (Class<?>[])new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                invoke.getClass();
                return (int)invoke;
            }
            catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                return 0;
            }
        }
    }
    
    public final int getSidecarDevicePosture$window_release(final SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        final int rawSidecarDevicePosture = this.getRawSidecarDevicePosture(sidecarDeviceState);
        if (rawSidecarDevicePosture >= 0 && rawSidecarDevicePosture <= 4) {
            return rawSidecarDevicePosture;
        }
        return 0;
    }
    
    public final List getSidecarDisplayFeatures(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        sidecarWindowLayoutInfo.getClass();
        try {
            Object o;
            if ((o = sidecarWindowLayoutInfo.displayFeatures) == null) {
                o = atkh.a;
            }
            return (List)o;
        }
        catch (final NoSuchFieldError noSuchFieldError) {
            try {
                final Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", (Class<?>[])new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                invoke.getClass();
                return (List)invoke;
            }
            catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                return (List)atkh.a;
            }
        }
    }
    
    public final void setSidecarDevicePosture(final SidecarDeviceState sidecarDeviceState, final int posture) {
        sidecarDeviceState.getClass();
        try {
            sidecarDeviceState.posture = posture;
        }
        catch (final NoSuchFieldError noSuchFieldError) {
            try {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, posture);
            }
            catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {}
        }
    }
    
    public final void setSidecarDisplayFeatures(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final List displayFeatures) {
        sidecarWindowLayoutInfo.getClass();
        displayFeatures.getClass();
        try {
            sidecarWindowLayoutInfo.displayFeatures = displayFeatures;
        }
        catch (final NoSuchFieldError noSuchFieldError) {
            try {
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, displayFeatures);
            }
            catch (final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {}
        }
    }
}
