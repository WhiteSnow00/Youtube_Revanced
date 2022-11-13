// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

public final class WindowMetricsCalculator$Companion
{
    static final WindowMetricsCalculator$Companion $$INSTANCE;
    private static atng decorator;
    
    static {
        $$INSTANCE = new WindowMetricsCalculator$Companion();
        WindowMetricsCalculator$Companion.decorator = (atng)WindowMetricsCalculator$Companion$decorator$1.INSTANCE;
    }
    
    private WindowMetricsCalculator$Companion() {
    }
    
    public final WindowMetricsCalculator getOrCreate() {
        return (WindowMetricsCalculator)WindowMetricsCalculator$Companion.decorator.invoke((Object)WindowMetricsCalculatorCompat.INSTANCE);
    }
    
    public final void overrideDecorator(final WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        windowMetricsCalculatorDecorator.getClass();
        WindowMetricsCalculator$Companion.decorator = (atng)new WindowMetricsCalculator$Companion$overrideDecorator$1(windowMetricsCalculatorDecorator);
    }
    
    public final void reset() {
        WindowMetricsCalculator$Companion.decorator = (atng)WindowMetricsCalculator$Companion$reset$1.INSTANCE;
    }
}
