// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import androidx.window.layout.adapter.sidecar.SidecarWindowBackend;
import android.content.Context;
import androidx.window.layout.adapter.WindowBackend;

public final class WindowInfoTracker$Companion
{
    static final WindowInfoTracker$Companion $$INSTANCE;
    private static final boolean DEBUG = false;
    private static final String TAG;
    public static final int a = 0;
    private static WindowInfoTrackerDecorator decorator;
    private static final atne extensionBackend$delegate;
    
    static {
        $$INSTANCE = new WindowInfoTracker$Companion();
        TAG = atrg.b(WindowInfoTracker.class).c();
        extensionBackend$delegate = aqvs.s((atps)WindowInfoTracker$Companion$extensionBackend$2.INSTANCE);
        WindowInfoTracker$Companion.decorator = (WindowInfoTrackerDecorator)EmptyDecorator.INSTANCE;
    }
    
    private WindowInfoTracker$Companion() {
    }
    
    public static final boolean access$getDEBUG$p() {
        return WindowInfoTracker$Companion.DEBUG;
    }
    
    public static final String access$getTAG$p() {
        return WindowInfoTracker$Companion.TAG;
    }
    
    public static void getExtensionBackend$window_release$annotations() {
    }
    
    public final WindowBackend getExtensionBackend$window_release() {
        return (WindowBackend)WindowInfoTracker$Companion.extensionBackend$delegate.a();
    }
    
    public final WindowInfoTracker getOrCreate(final Context context) {
        context.getClass();
        Object o;
        if ((o = this.getExtensionBackend$window_release()) == null) {
            o = SidecarWindowBackend.Companion.getInstance(context);
        }
        return WindowInfoTracker$Companion.decorator.decorate((WindowInfoTracker)new WindowInfoTrackerImpl((WindowMetricsCalculator)WindowMetricsCalculatorCompat.INSTANCE, (WindowBackend)o));
    }
    
    public final void overrideDecorator(final WindowInfoTrackerDecorator decorator) {
        decorator.getClass();
        WindowInfoTracker$Companion.decorator = decorator;
    }
    
    public final void reset() {
        WindowInfoTracker$Companion.decorator = (WindowInfoTrackerDecorator)EmptyDecorator.INSTANCE;
    }
}
