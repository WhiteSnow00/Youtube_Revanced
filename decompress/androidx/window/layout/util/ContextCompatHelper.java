// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout.util;

import android.view.WindowManager;
import android.graphics.Rect;
import android.content.Context;

public final class ContextCompatHelper
{
    public static final ContextCompatHelper INSTANCE;
    
    static {
        INSTANCE = new ContextCompatHelper();
    }
    
    private ContextCompatHelper() {
    }
    
    public final Rect currentWindowBounds(final Context context) {
        context.getClass();
        final Rect bounds = ((WindowManager)context.getSystemService((Class)WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
    
    public final Rect maximumWindowBounds(final Context context) {
        context.getClass();
        final Rect bounds = ((WindowManager)context.getSystemService((Class)WindowManager.class)).getMaximumWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
