// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public abstract class ExecutorRegistry
{
    public static ExecutorRegistry create(final Executor executor, final Executor executor2) {
        return ExecutorRegistry$CppProxy.create(executor, executor2);
    }
    
    public abstract Executor executorForExecutorThread(final ExecutorThread p0);
    
    public abstract void schedule(final ExecutorThread p0, final Closure p1);
}
