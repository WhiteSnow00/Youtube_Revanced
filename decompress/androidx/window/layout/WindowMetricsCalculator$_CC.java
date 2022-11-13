// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

public final class WindowMetricsCalculator$_CC
{
    public static WindowMetricsCalculator getOrCreate() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }
    
    public static void overrideDecorator(final WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }
    
    public static void reset() {
        WindowMetricsCalculator.Companion.reset();
    }
}
