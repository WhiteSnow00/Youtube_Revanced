// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.util;

import android.graphics.Point;
import android.view.Display;

public final class DisplayCompatHelperApi17
{
    public static final DisplayCompatHelperApi17 INSTANCE;
    
    static {
        INSTANCE = new DisplayCompatHelperApi17();
    }
    
    private DisplayCompatHelperApi17() {
    }
    
    public final void getRealSize(final Display display, final Point point) {
        display.getClass();
        point.getClass();
        display.getRealSize(point);
    }
}
