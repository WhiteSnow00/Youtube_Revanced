// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import android.app.Activity;
import android.content.Context;

public final class WindowInfoTracker$_CC
{
    public static atxe $default$windowLayoutInfo(final WindowInfoTracker windowInfoTracker, final Context context) {
        context.getClass();
        final atxe windowLayoutInfo = windowInfoTracker.windowLayoutInfo((Activity)context);
        if (windowLayoutInfo != null) {
            return windowLayoutInfo;
        }
        throw new atng((byte[])null);
    }
    
    static {
        final WindowInfoTracker$Companion companion = WindowInfoTracker.Companion;
    }
    
    public static WindowInfoTracker getOrCreate(final Context context) {
        return WindowInfoTracker.Companion.getOrCreate(context);
    }
    
    public static void overrideDecorator(final WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator);
    }
    
    public static void reset() {
        WindowInfoTracker.Companion.reset();
    }
}
