// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ExecutorThread
{
    private static final ExecutorThread[] $VALUES;
    
    BACKGROUND("BACKGROUND", 1), 
    MAIN("MAIN", 0);
    
    private static ExecutorThread[] $values() {
        return new ExecutorThread[] { ExecutorThread.MAIN, ExecutorThread.BACKGROUND };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ExecutorThread(final String s, final int n) {
    }
}
