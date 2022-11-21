// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

import java.util.EnumSet;

public abstract class PerformanceMonitorAdapter
{
    public abstract boolean flushPerformanceSpan(final PerformanceSpan p0);
    
    public abstract long getCurrentThread();
    
    public abstract EnumSet getPerformanceSpanBlocklist();
    
    public abstract boolean isMainThread();
    
    public abstract boolean shouldRecordLogs();
}
