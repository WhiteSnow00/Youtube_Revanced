// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.adapter.extensions;

import java.util.Iterator;
import java.util.List;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.ArrayList;
import android.app.Activity;
import androidx.window.layout.WindowMetricsCalculatorCompat;
import android.os.Build$VERSION;
import androidx.window.extensions.layout.WindowLayoutInfo;
import android.content.Context;
import androidx.window.layout.HardwareFoldingFeature;
import androidx.window.layout.FoldingFeature$State;
import androidx.window.layout.HardwareFoldingFeature$Type;
import androidx.window.extensions.layout.FoldingFeature;
import android.graphics.Rect;
import androidx.window.core.Bounds;
import androidx.window.layout.WindowMetrics;

public final class ExtensionsWindowLayoutInfoAdapter
{
    public static final ExtensionsWindowLayoutInfoAdapter INSTANCE;
    
    static {
        INSTANCE = new ExtensionsWindowLayoutInfoAdapter();
    }
    
    private ExtensionsWindowLayoutInfoAdapter() {
    }
    
    private final boolean validBounds(final WindowMetrics windowMetrics, final Bounds bounds) {
        final Rect bounds2 = windowMetrics.getBounds();
        return !bounds.isZero() && (bounds.getWidth() == bounds2.width() || bounds.getHeight() == bounds2.height()) && (bounds.getWidth() >= bounds2.width() || bounds.getHeight() >= bounds2.height()) && (bounds.getWidth() != bounds2.width() || bounds.getHeight() != bounds2.height());
    }
    
    public final androidx.window.layout.FoldingFeature translate$window_release(final WindowMetrics windowMetrics, final FoldingFeature foldingFeature) {
        windowMetrics.getClass();
        foldingFeature.getClass();
        final int type = foldingFeature.getType();
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
        final int state = foldingFeature.getState();
        FoldingFeature$State foldingFeature$State;
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            foldingFeature$State = FoldingFeature$State.HALF_OPENED;
        }
        else {
            foldingFeature$State = FoldingFeature$State.FLAT;
        }
        final Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        if (this.validBounds(windowMetrics, new Bounds(bounds))) {
            final Rect bounds2 = foldingFeature.getBounds();
            bounds2.getClass();
            return (androidx.window.layout.FoldingFeature)new HardwareFoldingFeature(new Bounds(bounds2), hardwareFoldingFeature$Type, foldingFeature$State);
        }
        return null;
    }
    
    public final androidx.window.layout.WindowLayoutInfo translate$window_release(final Context context, final WindowLayoutInfo windowLayoutInfo) {
        context.getClass();
        windowLayoutInfo.getClass();
        androidx.window.layout.WindowLayoutInfo windowLayoutInfo2;
        if (Build$VERSION.SDK_INT >= 30) {
            windowLayoutInfo2 = this.translate$window_release(WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics(context), windowLayoutInfo);
        }
        else {
            if (Build$VERSION.SDK_INT < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            windowLayoutInfo2 = this.translate$window_release(WindowMetricsCalculatorCompat.INSTANCE.computeCurrentWindowMetrics((Activity)context), windowLayoutInfo);
        }
        return windowLayoutInfo2;
    }
    
    public final androidx.window.layout.WindowLayoutInfo translate$window_release(final WindowMetrics windowMetrics, final WindowLayoutInfo windowLayoutInfo) {
        windowMetrics.getClass();
        windowLayoutInfo.getClass();
        final List displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        final ArrayList list = new ArrayList();
        for (final DisplayFeature displayFeature : displayFeatures) {
            androidx.window.layout.FoldingFeature translate$window_release;
            if (displayFeature instanceof FoldingFeature) {
                final ExtensionsWindowLayoutInfoAdapter instance = ExtensionsWindowLayoutInfoAdapter.INSTANCE;
                displayFeature.getClass();
                translate$window_release = instance.translate$window_release(windowMetrics, (FoldingFeature)displayFeature);
            }
            else {
                translate$window_release = null;
            }
            if (translate$window_release != null) {
                list.add(translate$window_release);
            }
        }
        return new androidx.window.layout.WindowLayoutInfo((List)list);
    }
}
