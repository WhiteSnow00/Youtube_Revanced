// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.sidecar;

import android.graphics.Rect;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.core.Bounds;
import androidx.window.layout.FoldingFeature$State;
import androidx.window.layout.HardwareFoldingFeature$Type;
import androidx.window.core.Logger;
import androidx.window.core.SpecificationComputer$Companion;
import androidx.window.core.SpecificationComputer;
import androidx.window.layout.DisplayFeature;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import androidx.window.sidecar.SidecarDeviceState;
import java.util.List;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.core.VerificationMode;

public final class SidecarAdapter
{
    public static final SidecarAdapter$Companion Companion;
    private static final String TAG;
    private final VerificationMode verificationMode;
    
    static {
        Companion = new SidecarAdapter$Companion(null);
        TAG = "SidecarAdapter";
    }
    
    public SidecarAdapter() {
        this(null, 1, null);
    }
    
    public SidecarAdapter(final VerificationMode verificationMode) {
        verificationMode.getClass();
        this.verificationMode = verificationMode;
    }
    
    public SidecarAdapter(VerificationMode quiet, final int n, final atny atny) {
        if ((n & 0x1) != 0x0) {
            quiet = VerificationMode.QUIET;
        }
        this(quiet);
    }
    
    private final boolean isEqualSidecarDisplayFeature(final SidecarDisplayFeature sidecarDisplayFeature, final SidecarDisplayFeature sidecarDisplayFeature2) {
        return atoc.c((Object)sidecarDisplayFeature, (Object)sidecarDisplayFeature2) || (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && atoc.c((Object)sidecarDisplayFeature.getRect(), (Object)sidecarDisplayFeature2.getRect()));
    }
    
    private final boolean isEqualSidecarDisplayFeatures(final List list, final List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null) {
            return false;
        }
        if (list2 == null) {
            return false;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (!this.isEqualSidecarDisplayFeature((SidecarDisplayFeature)list.get(i), (SidecarDisplayFeature)list2.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean isEqualSidecarDeviceState(final SidecarDeviceState sidecarDeviceState, final SidecarDeviceState sidecarDeviceState2) {
        if (atoc.c((Object)sidecarDeviceState, (Object)sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        if (sidecarDeviceState2 == null) {
            return false;
        }
        final SidecarAdapter$Companion companion = SidecarAdapter.Companion;
        return companion.getSidecarDevicePosture$window_release(sidecarDeviceState) == companion.getSidecarDevicePosture$window_release(sidecarDeviceState2);
    }
    
    public final boolean isEqualSidecarWindowLayoutInfo(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (atoc.c((Object)sidecarWindowLayoutInfo, (Object)sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        if (sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        final SidecarAdapter$Companion companion = SidecarAdapter.Companion;
        return this.isEqualSidecarDisplayFeatures(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo2));
    }
    
    public final WindowLayoutInfo translate(final SidecarWindowLayoutInfo sidecarWindowLayoutInfo, final SidecarDeviceState sidecarDeviceState) {
        sidecarDeviceState.getClass();
        if (sidecarWindowLayoutInfo == null) {
            return new WindowLayoutInfo((List)atlc.a);
        }
        final SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        final SidecarAdapter$Companion companion = SidecarAdapter.Companion;
        companion.setSidecarDevicePosture(sidecarDeviceState2, companion.getSidecarDevicePosture$window_release(sidecarDeviceState));
        return new WindowLayoutInfo(this.translate(companion.getSidecarDisplayFeatures(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }
    
    public final List translate(final List list, final SidecarDeviceState sidecarDeviceState) {
        list.getClass();
        sidecarDeviceState.getClass();
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final DisplayFeature translate$window_release = this.translate$window_release((SidecarDisplayFeature)iterator.next(), sidecarDeviceState);
            if (translate$window_release != null) {
                list2.add(translate$window_release);
            }
        }
        return list2;
    }
    
    public final DisplayFeature translate$window_release(final SidecarDisplayFeature sidecarDisplayFeature, final SidecarDeviceState sidecarDeviceState) {
        sidecarDisplayFeature.getClass();
        sidecarDeviceState.getClass();
        final SpecificationComputer$Companion companion = SpecificationComputer.Companion;
        final String tag = SidecarAdapter.TAG;
        tag.getClass();
        final SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature)SpecificationComputer$Companion.startSpecification$default(companion, (Object)sidecarDisplayFeature, tag, this.verificationMode, (Logger)null, 4, (Object)null).require("Type must be either TYPE_FOLD or TYPE_HINGE", (atng)SidecarAdapter$translate$checkedFeature$1.INSTANCE).require("Feature bounds must not be 0", (atng)SidecarAdapter$translate$checkedFeature$2.INSTANCE).require("TYPE_FOLD must have 0 area", (atng)SidecarAdapter$translate$checkedFeature$3.INSTANCE).require("Feature be pinned to either left or top", (atng)SidecarAdapter$translate$checkedFeature$4.INSTANCE).compute();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        final int type = sidecarDisplayFeature2.getType();
        HardwareFoldingFeature$Type hardwareFoldingFeature$Type;
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            hardwareFoldingFeature$Type = HardwareFoldingFeature$Type.Companion.getHINGE();
        }
        else {
            hardwareFoldingFeature$Type = HardwareFoldingFeature$Type.Companion.getFOLD();
        }
        final int sidecarDevicePosture$window_release = SidecarAdapter.Companion.getSidecarDevicePosture$window_release(sidecarDeviceState);
        FoldingFeature$State foldingFeature$State;
        if (sidecarDevicePosture$window_release != 2) {
            if (sidecarDevicePosture$window_release != 3) {
                return null;
            }
            foldingFeature$State = FoldingFeature$State.FLAT;
        }
        else {
            foldingFeature$State = FoldingFeature$State.HALF_OPENED;
        }
        final Rect rect = sidecarDisplayFeature.getRect();
        rect.getClass();
        return (DisplayFeature)new HardwareFoldingFeature(new Bounds(rect), hardwareFoldingFeature$Type, foldingFeature$State);
    }
}
