// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

import android.app.Activity;

public interface WindowMetricsCalculator
{
    public static final WindowMetricsCalculator$Companion Companion = WindowMetricsCalculator$Companion.$$INSTANCE;
    
    WindowMetrics computeCurrentWindowMetrics(final Activity p0);
    
    WindowMetrics computeMaximumWindowMetrics(final Activity p0);
}
