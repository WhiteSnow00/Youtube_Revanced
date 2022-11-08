// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.util;

import android.view.WindowInsets;
import android.app.Activity;

public final class ActivityCompatHelperApi30
{
    public static final ActivityCompatHelperApi30 INSTANCE;
    
    static {
        INSTANCE = new ActivityCompatHelperApi30();
    }
    
    private ActivityCompatHelperApi30() {
    }
    
    public final aoa currentWindowInsets(final Activity activity) {
        activity.getClass();
        final WindowInsets windowInsets = activity.getWindowManager().getCurrentWindowMetrics().getWindowInsets();
        windowInsets.getClass();
        return aoa.o(windowInsets);
    }
}
