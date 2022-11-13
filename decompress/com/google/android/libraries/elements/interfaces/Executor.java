// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class Executor
{
    public abstract boolean currentThreadIsMainThread();
    
    public abstract int numPendingClosures();
    
    public abstract void schedule(final Closure p0);
    
    public abstract void scheduleAfter(final long p0, final Closure p1);
    
    public abstract boolean trySchedule(final Closure p0);
}
