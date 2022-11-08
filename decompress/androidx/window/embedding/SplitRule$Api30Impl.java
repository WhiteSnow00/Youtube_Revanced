// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.embedding;

import android.graphics.Rect;
import android.view.WindowMetrics;

public final class SplitRule$Api30Impl
{
    public static final SplitRule$Api30Impl INSTANCE;
    
    static {
        INSTANCE = new SplitRule$Api30Impl();
    }
    
    private SplitRule$Api30Impl() {
    }
    
    public final Rect getBounds(final WindowMetrics windowMetrics) {
        windowMetrics.getClass();
        final Rect bounds = windowMetrics.getBounds();
        bounds.getClass();
        return bounds;
    }
}
