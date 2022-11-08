// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.util;

import android.view.DisplayCutout;

public final class DisplayCompatHelperApi28
{
    public static final DisplayCompatHelperApi28 INSTANCE;
    
    static {
        INSTANCE = new DisplayCompatHelperApi28();
    }
    
    private DisplayCompatHelperApi28() {
    }
    
    public final int safeInsetBottom(final DisplayCutout displayCutout) {
        displayCutout.getClass();
        return displayCutout.getSafeInsetBottom();
    }
    
    public final int safeInsetLeft(final DisplayCutout displayCutout) {
        displayCutout.getClass();
        return displayCutout.getSafeInsetLeft();
    }
    
    public final int safeInsetRight(final DisplayCutout displayCutout) {
        displayCutout.getClass();
        return displayCutout.getSafeInsetRight();
    }
    
    public final int safeInsetTop(final DisplayCutout displayCutout) {
        displayCutout.getClass();
        return displayCutout.getSafeInsetTop();
    }
}
