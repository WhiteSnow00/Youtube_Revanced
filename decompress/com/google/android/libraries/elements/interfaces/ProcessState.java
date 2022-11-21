// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ProcessState
{
    private static final ProcessState[] $VALUES;
    
    FULLY_PROCESSED("FULLY_PROCESSED", 1), 
    PARTIALLY_PROCESSED("PARTIALLY_PROCESSED", 0);
    
    private static ProcessState[] $values() {
        return new ProcessState[] { ProcessState.PARTIALLY_PROCESSED, ProcessState.FULLY_PROCESSED };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ProcessState(final String s, final int n) {
    }
}
