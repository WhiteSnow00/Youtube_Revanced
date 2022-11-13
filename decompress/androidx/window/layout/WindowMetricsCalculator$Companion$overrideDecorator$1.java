// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.layout;

final class WindowMetricsCalculator$Companion$overrideDecorator$1 extends atob implements atng
{
    public WindowMetricsCalculator$Companion$overrideDecorator$1(final Object o) {
        super(1, o, (Class)WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }
    
    public final WindowMetricsCalculator invoke(final WindowMetricsCalculator windowMetricsCalculator) {
        windowMetricsCalculator.getClass();
        return ((WindowMetricsCalculatorDecorator)this.receiver).decorate(windowMetricsCalculator);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((WindowMetricsCalculator)o);
    }
}
