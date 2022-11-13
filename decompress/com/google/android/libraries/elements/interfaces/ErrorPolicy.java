// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public enum ErrorPolicy
{
    private static final ErrorPolicy[] $VALUES;
    
    CONTINUE_ON_ERROR("CONTINUE_ON_ERROR", 0), 
    FAIL_ON_ERROR("FAIL_ON_ERROR", 1);
    
    private static ErrorPolicy[] $values() {
        return new ErrorPolicy[] { ErrorPolicy.CONTINUE_ON_ERROR, ErrorPolicy.FAIL_ON_ERROR };
    }
    
    static {
        $VALUES = $values();
    }
    
    private ErrorPolicy(final String s, final int n) {
    }
}
