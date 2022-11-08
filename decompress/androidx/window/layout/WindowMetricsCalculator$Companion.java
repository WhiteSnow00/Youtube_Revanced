// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

public final class WindowMetricsCalculator$Companion
{
    private static atml decorator;
    
    static {
        $$INSTANCE = new WindowMetricsCalculator$Companion();
        WindowMetricsCalculator$Companion.decorator = WindowMetricsCalculator$Companion$decorator$1.INSTANCE;
    }
    
    private WindowMetricsCalculator$Companion() {
    }
    
    public final WindowMetricsCalculator getOrCreate() {
        return (WindowMetricsCalculator)WindowMetricsCalculator$Companion.decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
    }
    
    public final void overrideDecorator(final WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        windowMetricsCalculatorDecorator.getClass();
        WindowMetricsCalculator$Companion.decorator = new WindowMetricsCalculator$Companion$overrideDecorator$1(windowMetricsCalculatorDecorator);
    }
    
    public final void reset() {
        WindowMetricsCalculator$Companion.decorator = WindowMetricsCalculator$Companion$reset$1.INSTANCE;
    }
}
