// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.util;

import android.app.Activity;

public final class ContextCompatHelperApi24
{
    public static final ContextCompatHelperApi24 INSTANCE;
    
    static {
        INSTANCE = new ContextCompatHelperApi24();
    }
    
    private ContextCompatHelperApi24() {
    }
    
    public final boolean isInMultiWindowMode(final Activity activity) {
        activity.getClass();
        return activity.isInMultiWindowMode();
    }
}
