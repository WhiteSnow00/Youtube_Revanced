// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

public abstract class PerformanceLogger
{
    public static PerformanceLogger create(final PerformanceMonitorAdapter performanceMonitorAdapter, final boolean b) {
        return PerformanceLogger$CppProxy.create(performanceMonitorAdapter, b);
    }
    
    public static String nameForPerformanceSpanType(final PerformanceSpanType performanceSpanType) {
        return PerformanceLogger$CppProxy.nameForPerformanceSpanType(performanceSpanType);
    }
    
    public abstract void beginPerformanceSpan(final PerformanceSpanType p0, final PerformanceEventInfo p1);
    
    public abstract void endPerformanceSpan(final PerformanceSpanType p0, final PerformanceEventInfo p1);
    
    public abstract ArrayList flushPerformanceSpans();
    
    public abstract long getCurrentThread();
    
    public abstract boolean isMainThread();
    
    public abstract void logPerformanceSpan(final PerformanceSpan p0);
}
