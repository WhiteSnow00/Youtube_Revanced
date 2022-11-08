// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.util;

import android.view.WindowInsets;
import android.app.Activity;
import android.view.WindowManager;
import android.graphics.Rect;
import android.content.Context;

public final class ContextCompatHelperApi30
{
    public static final ContextCompatHelperApi30 INSTANCE;
    
    static {
        INSTANCE = new ContextCompatHelperApi30();
    }
    
    private ContextCompatHelperApi30() {
    }
    
    public final Rect currentWindowBounds(final Context context) {
        context.getClass();
        final Rect bounds = ((WindowManager)context.getSystemService((Class)WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
    
    public final aoa currentWindowInsets(final Activity activity) {
        activity.getClass();
        final WindowInsets windowInsets = activity.getWindowManager().getCurrentWindowMetrics().getWindowInsets();
        windowInsets.getClass();
        return aoa.o(windowInsets);
    }
    
    public final Rect maximumWindowBounds(final Context context) {
        context.getClass();
        final Rect bounds = ((WindowManager)context.getSystemService((Class)WindowManager.class)).getMaximumWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
