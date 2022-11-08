// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.util;

import android.app.Activity;

public final class ActivityCompatHelperApi24
{
    public static final ActivityCompatHelperApi24 INSTANCE;
    
    static {
        INSTANCE = new ActivityCompatHelperApi24();
    }
    
    private ActivityCompatHelperApi24() {
    }
    
    public final boolean isInMultiWindowMode(final Activity activity) {
        activity.getClass();
        return activity.isInMultiWindowMode();
    }
}
