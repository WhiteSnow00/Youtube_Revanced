// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

public final class WindowMetricsCalculator$Companion
{
    static final WindowMetricsCalculator$Companion $$INSTANCE;
    private static atqd decorator;
    
    static {
        $$INSTANCE = new WindowMetricsCalculator$Companion();
        WindowMetricsCalculator$Companion.decorator = (atqd)WindowMetricsCalculator$Companion$decorator$1.INSTANCE;
    }
    
    private WindowMetricsCalculator$Companion() {
    }
    
    public final WindowMetricsCalculator getOrCreate() {
        return (WindowMetricsCalculator)WindowMetricsCalculator$Companion.decorator.invoke(WindowMetricsCalculatorCompat.INSTANCE);
    }
    
    public final void overrideDecorator(final WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        windowMetricsCalculatorDecorator.getClass();
        WindowMetricsCalculator$Companion.decorator = (atqd)new WindowMetricsCalculator$Companion$overrideDecorator$1((Object)windowMetricsCalculatorDecorator);
    }
    
    public final void reset() {
        WindowMetricsCalculator$Companion.decorator = (atqd)WindowMetricsCalculator$Companion$reset$1.INSTANCE;
    }
}
